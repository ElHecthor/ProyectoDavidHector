package p242i.p243a.p244a.p245a.p246n.p248b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p242i.p243a.p244a.p245a.C4781c;

/* renamed from: i.a.a.a.n.b.e */
class C4806e implements C4810f {

    /* renamed from: a */
    private final Context f12557a;

    /* renamed from: i.a.a.a.n.b.e$b */
    private static final class C4808b implements ServiceConnection {

        /* renamed from: a */
        private boolean f12558a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f12559b;

        private C4808b() {
            this.f12558a = false;
            this.f12559b = new LinkedBlockingQueue<>(1);
        }

        /* renamed from: a */
        public IBinder mo13860a() {
            if (this.f12558a) {
                C4781c.m19229f().mo13792c("Fabric", "getBinder already called");
            }
            this.f12558a = true;
            try {
                return (IBinder) this.f12559b.poll(200, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return null;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f12559b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f12559b.clear();
        }
    }

    /* renamed from: i.a.a.a.n.b.e$c */
    private static final class C4809c implements IInterface {

        /* renamed from: a */
        private final IBinder f12560a;

        public C4809c(IBinder iBinder) {
            this.f12560a = iBinder;
        }

        public IBinder asBinder() {
            return this.f12560a;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
            p242i.p243a.p244a.p245a.C4781c.m19229f().mo13796e("Fabric", "Could not get parcel from Google Play Service to capture AdvertisingId");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
            throw r2;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0024 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String mo13864d() {
            /*
                r5 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                java.lang.String r2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r2)     // Catch:{ Exception -> 0x0024 }
                android.os.IBinder r2 = r5.f12560a     // Catch:{ Exception -> 0x0024 }
                r3 = 1
                r4 = 0
                r2.transact(r3, r0, r1, r4)     // Catch:{ Exception -> 0x0024 }
                r1.readException()     // Catch:{ Exception -> 0x0024 }
                java.lang.String r2 = r1.readString()     // Catch:{ Exception -> 0x0024 }
                r1.recycle()
                r0.recycle()
                goto L_0x0036
            L_0x0022:
                r2 = move-exception
                goto L_0x0037
            L_0x0024:
                i.a.a.a.l r2 = p242i.p243a.p244a.p245a.C4781c.m19229f()     // Catch:{ all -> 0x0022 }
                java.lang.String r3 = "Fabric"
                java.lang.String r4 = "Could not get parcel from Google Play Service to capture AdvertisingId"
                r2.mo13796e(r3, r4)     // Catch:{ all -> 0x0022 }
                r1.recycle()
                r0.recycle()
                r2 = 0
            L_0x0036:
                return r2
            L_0x0037:
                r1.recycle()
                r0.recycle()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p242i.p243a.p244a.p245a.p246n.p248b.C4806e.C4809c.mo13864d():java.lang.String");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            p242i.p243a.p244a.p245a.C4781c.m19229f().mo13796e("Fabric", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* renamed from: t */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo13865t() {
            /*
                r6 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                r2 = 0
                java.lang.String r3 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r3)     // Catch:{ Exception -> 0x0025 }
                r3 = 1
                r0.writeInt(r3)     // Catch:{ Exception -> 0x0025 }
                android.os.IBinder r4 = r6.f12560a     // Catch:{ Exception -> 0x0025 }
                r5 = 2
                r4.transact(r5, r0, r1, r2)     // Catch:{ Exception -> 0x0025 }
                r1.readException()     // Catch:{ Exception -> 0x0025 }
                int r4 = r1.readInt()     // Catch:{ Exception -> 0x0025 }
                if (r4 == 0) goto L_0x0030
                r2 = 1
                goto L_0x0030
            L_0x0023:
                r2 = move-exception
                goto L_0x0037
            L_0x0025:
                i.a.a.a.l r3 = p242i.p243a.p244a.p245a.C4781c.m19229f()     // Catch:{ all -> 0x0023 }
                java.lang.String r4 = "Fabric"
                java.lang.String r5 = "Could not get parcel from Google Play Service to capture Advertising limitAdTracking"
                r3.mo13796e(r4, r5)     // Catch:{ all -> 0x0023 }
            L_0x0030:
                r1.recycle()
                r0.recycle()
                return r2
            L_0x0037:
                r1.recycle()
                r0.recycle()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p242i.p243a.p244a.p245a.p246n.p248b.C4806e.C4809c.mo13865t():boolean");
        }
    }

    public C4806e(Context context) {
        this.f12557a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C4802b mo13858a() {
        String str = "Could not bind to Google Play Service to capture AdvertisingId";
        String str2 = "Fabric";
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C4781c.m19229f().mo13796e(str2, "AdvertisingInfoServiceStrategy cannot be called on the main thread");
            return null;
        }
        try {
            this.f12557a.getPackageManager().getPackageInfo("com.android.vending", 0);
            C4808b bVar = new C4808b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (this.f12557a.bindService(intent, bVar, 1)) {
                    try {
                        C4809c cVar = new C4809c(bVar.mo13860a());
                        C4802b bVar2 = new C4802b(cVar.mo13864d(), cVar.mo13865t());
                        this.f12557a.unbindService(bVar);
                        return bVar2;
                    } catch (Exception e) {
                        C4781c.m19229f().mo13791b(str2, "Exception in binding to Google Play Service to capture AdvertisingId", e);
                        this.f12557a.unbindService(bVar);
                    }
                } else {
                    C4781c.m19229f().mo13796e(str2, str);
                    return null;
                }
            } catch (Throwable th) {
                C4781c.m19229f().mo13788a(str2, str, th);
            }
        } catch (NameNotFoundException unused) {
            C4781c.m19229f().mo13796e(str2, "Unable to find Google Play Services package name");
            return null;
        } catch (Exception e2) {
            C4781c.m19229f().mo13788a(str2, "Unable to determine if Google Play Services is available", (Throwable) e2);
            return null;
        }
    }
}
