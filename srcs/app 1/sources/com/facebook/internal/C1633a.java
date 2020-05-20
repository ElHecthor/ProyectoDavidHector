package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.C1787m;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.a */
public class C1633a {

    /* renamed from: f */
    private static final String f5026f = "com.facebook.internal.a";

    /* renamed from: g */
    private static C1633a f5027g;

    /* renamed from: a */
    private String f5028a;

    /* renamed from: b */
    private String f5029b;

    /* renamed from: c */
    private String f5030c;

    /* renamed from: d */
    private boolean f5031d;

    /* renamed from: e */
    private long f5032e;

    /* renamed from: com.facebook.internal.a$b */
    private static final class C1635b implements IInterface {

        /* renamed from: a */
        private IBinder f5033a;

        C1635b(IBinder iBinder) {
            this.f5033a = iBinder;
        }

        public IBinder asBinder() {
            return this.f5033a;
        }

        /* renamed from: t */
        public String mo5881t() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f5033a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: u */
        public boolean mo5882u() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f5033a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: com.facebook.internal.a$c */
    private static final class C1636c implements ServiceConnection {

        /* renamed from: a */
        private AtomicBoolean f5034a;

        /* renamed from: b */
        private final BlockingQueue<IBinder> f5035b;

        private C1636c() {
            this.f5034a = new AtomicBoolean(false);
            this.f5035b = new LinkedBlockingDeque();
        }

        /* renamed from: a */
        public IBinder mo5883a() {
            if (!this.f5034a.compareAndSet(true, true)) {
                return (IBinder) this.f5035b.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f5035b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    private static C1633a m7166a(Context context) {
        C1633a b = m7168b(context);
        if (b != null) {
            return b;
        }
        C1633a c = m7169c(context);
        return c == null ? new C1633a() : c;
    }

    /* renamed from: a */
    private static C1633a m7167a(C1633a aVar) {
        aVar.f5032e = System.currentTimeMillis();
        f5027g = aVar;
        return aVar;
    }

    /* renamed from: b */
    private static C1633a m7168b(Context context) {
        try {
            if (!m7172f(context)) {
                return null;
            }
            Method a = C1698v.m7366a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
            if (a == null) {
                return null;
            }
            Object a2 = C1698v.m7357a((Object) null, a, context);
            if (a2 == null) {
                return null;
            }
            Method a3 = C1698v.m7365a(a2.getClass(), "getId", (Class<?>[]) new Class[0]);
            Method a4 = C1698v.m7365a(a2.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
            if (a3 != null) {
                if (a4 != null) {
                    C1633a aVar = new C1633a();
                    aVar.f5029b = (String) C1698v.m7357a(a2, a3, new Object[0]);
                    aVar.f5031d = ((Boolean) C1698v.m7357a(a2, a4, new Object[0])).booleanValue();
                    return aVar;
                }
            }
            return null;
        } catch (Exception e) {
            C1698v.m7380a("android_id", e);
            return null;
        }
    }

    /* renamed from: c */
    private static C1633a m7169c(Context context) {
        C1636c cVar = new C1636c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, cVar, 1)) {
            try {
                C1635b bVar = new C1635b(cVar.mo5883a());
                C1633a aVar = new C1633a();
                aVar.f5029b = bVar.mo5881t();
                aVar.f5031d = bVar.mo5882u();
                return aVar;
            } catch (Exception e) {
                C1698v.m7380a("android_id", e);
            } finally {
                context.unbindService(cVar);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[Catch:{ Exception -> 0x00d8, all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f A[Catch:{ Exception -> 0x00d8, all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073 A[Catch:{ Exception -> 0x00d8, all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fe  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.internal.C1633a m7170d(android.content.Context r12) {
        /*
            java.lang.String r0 = "limit_tracking"
            java.lang.String r1 = "androidid"
            java.lang.String r2 = "aid"
            com.facebook.internal.a r3 = m7166a(r12)
            r4 = 0
            android.os.Looper r5 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            if (r5 == r6) goto L_0x00ce
            com.facebook.internal.a r5 = f5027g     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            if (r5 == 0) goto L_0x002c
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            com.facebook.internal.a r7 = f5027g     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            long r7 = r7.f5032e     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            long r5 = r5 - r7
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x002c
            com.facebook.internal.a r12 = f5027g     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            return r12
        L_0x002c:
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            android.content.pm.PackageManager r5 = r12.getPackageManager()     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            java.lang.String r6 = "com.facebook.katana.provider.AttributionIdProvider"
            r8 = 0
            android.content.pm.ProviderInfo r5 = r5.resolveContentProvider(r6, r8)     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            android.content.pm.PackageManager r6 = r12.getPackageManager()     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            java.lang.String r9 = "com.facebook.wakizashi.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r6 = r6.resolveContentProvider(r9, r8)     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            if (r5 == 0) goto L_0x0057
            java.lang.String r5 = r5.packageName     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            boolean r5 = com.facebook.internal.C1658h.m7219a(r12, r5)     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            if (r5 == 0) goto L_0x0057
            java.lang.String r5 = "content://com.facebook.katana.provider.AttributionIdProvider"
        L_0x0051:
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            r6 = r5
            goto L_0x0065
        L_0x0057:
            if (r6 == 0) goto L_0x0064
            java.lang.String r5 = r6.packageName     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            boolean r5 = com.facebook.internal.C1658h.m7219a(r12, r5)     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            if (r5 == 0) goto L_0x0064
            java.lang.String r5 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
            goto L_0x0051
        L_0x0064:
            r6 = r4
        L_0x0065:
            java.lang.String r5 = m7171e(r12)     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            if (r5 == 0) goto L_0x006d
            r3.f5030c = r5     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
        L_0x006d:
            if (r6 != 0) goto L_0x0073
            m7167a(r3)     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            return r3
        L_0x0073:
            android.content.ContentResolver r5 = r12.getContentResolver()     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r12 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            if (r12 == 0) goto L_0x00bc
            boolean r5 = r12.moveToFirst()     // Catch:{ Exception -> 0x00c9, all -> 0x00c5 }
            if (r5 != 0) goto L_0x0087
            goto L_0x00bc
        L_0x0087:
            int r2 = r12.getColumnIndex(r2)     // Catch:{ Exception -> 0x00c9, all -> 0x00c5 }
            int r1 = r12.getColumnIndex(r1)     // Catch:{ Exception -> 0x00c9, all -> 0x00c5 }
            int r0 = r12.getColumnIndex(r0)     // Catch:{ Exception -> 0x00c9, all -> 0x00c5 }
            java.lang.String r2 = r12.getString(r2)     // Catch:{ Exception -> 0x00c9, all -> 0x00c5 }
            r3.f5028a = r2     // Catch:{ Exception -> 0x00c9, all -> 0x00c5 }
            if (r1 <= 0) goto L_0x00b3
            if (r0 <= 0) goto L_0x00b3
            java.lang.String r2 = r3.mo5876a()     // Catch:{ Exception -> 0x00c9, all -> 0x00c5 }
            if (r2 != 0) goto L_0x00b3
            java.lang.String r1 = r12.getString(r1)     // Catch:{ Exception -> 0x00c9, all -> 0x00c5 }
            r3.f5029b = r1     // Catch:{ Exception -> 0x00c9, all -> 0x00c5 }
            java.lang.String r0 = r12.getString(r0)     // Catch:{ Exception -> 0x00c9, all -> 0x00c5 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x00c9, all -> 0x00c5 }
            r3.f5031d = r0     // Catch:{ Exception -> 0x00c9, all -> 0x00c5 }
        L_0x00b3:
            if (r12 == 0) goto L_0x00b8
            r12.close()
        L_0x00b8:
            m7167a(r3)
            return r3
        L_0x00bc:
            m7167a(r3)     // Catch:{ Exception -> 0x00c9, all -> 0x00c5 }
            if (r12 == 0) goto L_0x00c4
            r12.close()
        L_0x00c4:
            return r3
        L_0x00c5:
            r0 = move-exception
            r4 = r12
            r12 = r0
            goto L_0x00fc
        L_0x00c9:
            r0 = move-exception
            r11 = r0
            r0 = r12
            r12 = r11
            goto L_0x00da
        L_0x00ce:
            com.facebook.i r12 = new com.facebook.i     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            java.lang.String r0 = "getAttributionIdentifiers cannot be called on the main thread."
            r12.<init>(r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            throw r12     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
        L_0x00d6:
            r12 = move-exception
            goto L_0x00fc
        L_0x00d8:
            r12 = move-exception
            r0 = r4
        L_0x00da:
            java.lang.String r1 = f5026f     // Catch:{ all -> 0x00fa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r2.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = "Caught unexpected exception in getAttributionId(): "
            r2.append(r3)     // Catch:{ all -> 0x00fa }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00fa }
            r2.append(r12)     // Catch:{ all -> 0x00fa }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x00fa }
            com.facebook.internal.C1698v.m7399c(r1, r12)     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x00f9
            r0.close()
        L_0x00f9:
            return r4
        L_0x00fa:
            r12 = move-exception
            r4 = r0
        L_0x00fc:
            if (r4 == 0) goto L_0x0101
            r4.close()
        L_0x0101:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1633a.m7170d(android.content.Context):com.facebook.internal.a");
    }

    /* renamed from: e */
    private static String m7171e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
        return null;
    }

    /* renamed from: f */
    private static boolean m7172f(Context context) {
        Method a = C1698v.m7366a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
        if (a == null) {
            return false;
        }
        Object a2 = C1698v.m7357a((Object) null, a, context);
        return (a2 instanceof Integer) && ((Integer) a2).intValue() == 0;
    }

    /* renamed from: g */
    public static boolean m7173g(Context context) {
        C1633a d = m7170d(context);
        return d != null && d.mo5879d();
    }

    /* renamed from: a */
    public String mo5876a() {
        if (!C1787m.m7758s() || !C1787m.m7743d()) {
            return null;
        }
        return this.f5029b;
    }

    /* renamed from: b */
    public String mo5877b() {
        return this.f5030c;
    }

    /* renamed from: c */
    public String mo5878c() {
        return this.f5028a;
    }

    /* renamed from: d */
    public boolean mo5879d() {
        return this.f5031d;
    }
}
