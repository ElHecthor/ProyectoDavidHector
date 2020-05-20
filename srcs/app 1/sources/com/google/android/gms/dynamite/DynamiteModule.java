package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.util.C2192g;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import p147g.p156d.p157a.p167b.p172c.C3851a;
import p147g.p156d.p157a.p167b.p172c.C3854b;

public final class DynamiteModule {
    @GuardedBy("DynamiteModule.class")

    /* renamed from: b */
    private static Boolean f6193b = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: c */
    private static C2227j f6194c = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: d */
    private static C2229l f6195d = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: e */
    private static String f6196e = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: f */
    private static int f6197f = -1;

    /* renamed from: g */
    private static final ThreadLocal<C2216c> f6198g = new ThreadLocal<>();

    /* renamed from: h */
    private static final C2215b f6199h = new C2218a();

    /* renamed from: i */
    public static final C2213b f6200i = new C2219b();

    /* renamed from: j */
    public static final C2213b f6201j = new C2221d();

    /* renamed from: k */
    public static final C2213b f6202k = new C2224g();

    /* renamed from: a */
    private final Context f6203a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C2212a extends Exception {
        private C2212a(String str) {
            super(str);
        }

        /* synthetic */ C2212a(String str, C2218a aVar) {
            this(str);
        }

        private C2212a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ C2212a(String str, Throwable th, C2218a aVar) {
            this(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface C2213b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public static class C2214a {

            /* renamed from: a */
            public int f6204a = 0;

            /* renamed from: b */
            public int f6205b = 0;

            /* renamed from: c */
            public int f6206c = 0;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public interface C2215b {
            /* renamed from: a */
            int mo6995a(Context context, String str);

            /* renamed from: a */
            int mo6996a(Context context, String str, boolean z);
        }

        /* renamed from: a */
        C2214a mo6994a(Context context, String str, C2215b bVar);
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    private static class C2216c {

        /* renamed from: a */
        public Cursor f6207a;

        private C2216c() {
        }

        /* synthetic */ C2216c(C2218a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    private static class C2217d implements C2215b {

        /* renamed from: a */
        private final int f6208a;

        public C2217d(int i, int i2) {
            this.f6208a = i;
        }

        /* renamed from: a */
        public final int mo6995a(Context context, String str) {
            return this.f6208a;
        }

        /* renamed from: a */
        public final int mo6996a(Context context, String str, boolean z) {
            return 0;
        }
    }

    static {
        new C2220c();
        new C2222e();
        new C2223f();
    }

    private DynamiteModule(Context context) {
        C2148s.m8834a(context);
        this.f6203a = context;
    }

    /* renamed from: a */
    public static int m9038a(Context context, String str) {
        String str2 = "DynamiteModule";
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e(str2, sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w(str2, sb3.toString());
            return 0;
        } catch (Exception e) {
            String str3 = "Failed to load module descriptor class: ";
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:44|45) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r2.set(null, java.lang.ClassLoader.getSystemClassLoader());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0097, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x008e */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d0 A[SYNTHETIC, Splitter:B:61:0x00d0] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f7 A[Catch:{ a -> 0x00d5, all -> 0x00ff }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0050=Splitter:B:23:0x0050, B:18:0x0035=Splitter:B:18:0x0035, B:39:0x008b=Splitter:B:39:0x008b} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m9039a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00ff }
            java.lang.Boolean r1 = f6193b     // Catch:{ all -> 0x00fc }
            if (r1 != 0) goto L_0x00c9
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x0099 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0099 }
            if (r4 != r2) goto L_0x0032
        L_0x002f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0099 }
            goto L_0x0096
        L_0x0032:
            m9044a(r4)     // Catch:{ a -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0099 }
            goto L_0x0096
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x0099 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0050
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0099 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0099 }
            goto L_0x002f
        L_0x0050:
            int r4 = m9048c(r8, r9, r10)     // Catch:{ a -> 0x008e }
            java.lang.String r5 = f6196e     // Catch:{ a -> 0x008e }
            if (r5 == 0) goto L_0x008b
            java.lang.String r5 = f6196e     // Catch:{ a -> 0x008e }
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x008e }
            if (r5 == 0) goto L_0x0061
            goto L_0x008b
        L_0x0061:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x008e }
            r6 = 29
            if (r5 < r6) goto L_0x0073
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x008e }
            java.lang.String r6 = f6196e     // Catch:{ a -> 0x008e }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x008e }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x008e }
            goto L_0x007e
        L_0x0073:
            com.google.android.gms.dynamite.h r5 = new com.google.android.gms.dynamite.h     // Catch:{ a -> 0x008e }
            java.lang.String r6 = f6196e     // Catch:{ a -> 0x008e }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x008e }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x008e }
        L_0x007e:
            m9044a(r5)     // Catch:{ a -> 0x008e }
            r2.set(r3, r5)     // Catch:{ a -> 0x008e }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x008e }
            f6193b = r5     // Catch:{ a -> 0x008e }
            monitor-exit(r1)     // Catch:{ all -> 0x0099 }
            monitor-exit(r0)     // Catch:{ all -> 0x00fc }
            return r4
        L_0x008b:
            monitor-exit(r1)     // Catch:{ all -> 0x0099 }
            monitor-exit(r0)     // Catch:{ all -> 0x00fc }
            return r4
        L_0x008e:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0099 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0099 }
            goto L_0x002f
        L_0x0096:
            monitor-exit(r1)     // Catch:{ all -> 0x0099 }
            r1 = r2
            goto L_0x00c7
        L_0x0099:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0099 }
            throw r2     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
        L_0x009c:
            r1 = move-exception
            goto L_0x00a1
        L_0x009e:
            r1 = move-exception
            goto L_0x00a1
        L_0x00a0:
            r1 = move-exception
        L_0x00a1:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00fc }
            int r3 = r3.length()     // Catch:{ all -> 0x00fc }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r4.<init>(r3)     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00fc }
            r4.append(r1)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00fc }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00fc }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00fc }
        L_0x00c7:
            f6193b = r1     // Catch:{ all -> 0x00fc }
        L_0x00c9:
            monitor-exit(r0)     // Catch:{ all -> 0x00fc }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00f7
            int r8 = m9048c(r8, r9, r10)     // Catch:{ a -> 0x00d5 }
            return r8
        L_0x00d5:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00ff }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00ff }
            int r1 = r9.length()     // Catch:{ all -> 0x00ff }
            if (r1 == 0) goto L_0x00ed
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x00ff }
            goto L_0x00f2
        L_0x00ed:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00ff }
            r9.<init>(r0)     // Catch:{ all -> 0x00ff }
        L_0x00f2:
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x00ff }
            r8 = 0
            return r8
        L_0x00f7:
            int r8 = m9046b(r8, r9, r10)     // Catch:{ all -> 0x00ff }
            return r8
        L_0x00fc:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fc }
            throw r9     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r9 = move-exception
            com.google.android.gms.common.util.C2192g.m8983a(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m9039a(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule m9040a(android.content.Context r10, com.google.android.gms.dynamite.DynamiteModule.C2213b r11, java.lang.String r12) {
        /*
            java.lang.String r0 = ":"
            java.lang.String r1 = "DynamiteModule"
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r2 = f6198g
            java.lang.Object r2 = r2.get()
            com.google.android.gms.dynamite.DynamiteModule$c r2 = (com.google.android.gms.dynamite.DynamiteModule.C2216c) r2
            com.google.android.gms.dynamite.DynamiteModule$c r3 = new com.google.android.gms.dynamite.DynamiteModule$c
            r4 = 0
            r3.<init>(r4)
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r5 = f6198g
            r5.set(r3)
            com.google.android.gms.dynamite.DynamiteModule$b$b r5 = f6199h     // Catch:{ all -> 0x011f }
            com.google.android.gms.dynamite.DynamiteModule$b$a r5 = r11.mo6994a(r10, r12, r5)     // Catch:{ all -> 0x011f }
            int r6 = r5.f6204a     // Catch:{ all -> 0x011f }
            int r7 = r5.f6205b     // Catch:{ all -> 0x011f }
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x011f }
            int r8 = r8.length()     // Catch:{ all -> 0x011f }
            int r8 = r8 + 68
            java.lang.String r9 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x011f }
            int r9 = r9.length()     // Catch:{ all -> 0x011f }
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r9.<init>(r8)     // Catch:{ all -> 0x011f }
            java.lang.String r8 = "Considering local module "
            r9.append(r8)     // Catch:{ all -> 0x011f }
            r9.append(r12)     // Catch:{ all -> 0x011f }
            r9.append(r0)     // Catch:{ all -> 0x011f }
            r9.append(r6)     // Catch:{ all -> 0x011f }
            java.lang.String r6 = " and remote module "
            r9.append(r6)     // Catch:{ all -> 0x011f }
            r9.append(r12)     // Catch:{ all -> 0x011f }
            r9.append(r0)     // Catch:{ all -> 0x011f }
            r9.append(r7)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x011f }
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x011f }
            int r0 = r5.f6206c     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00f5
            int r0 = r5.f6206c     // Catch:{ all -> 0x011f }
            r6 = -1
            if (r0 != r6) goto L_0x0069
            int r0 = r5.f6204a     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00f5
        L_0x0069:
            int r0 = r5.f6206c     // Catch:{ all -> 0x011f }
            r7 = 1
            if (r0 != r7) goto L_0x0072
            int r0 = r5.f6205b     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00f5
        L_0x0072:
            int r0 = r5.f6206c     // Catch:{ all -> 0x011f }
            if (r0 != r6) goto L_0x0087
            com.google.android.gms.dynamite.DynamiteModule r10 = m9049c(r10, r12)     // Catch:{ all -> 0x011f }
            android.database.Cursor r11 = r3.f6207a
            if (r11 == 0) goto L_0x0081
        L_0x007e:
            r11.close()
        L_0x0081:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r11 = f6198g
            r11.set(r2)
            return r10
        L_0x0087:
            int r0 = r5.f6206c     // Catch:{ all -> 0x011f }
            if (r0 != r7) goto L_0x00da
            int r0 = r5.f6205b     // Catch:{ a -> 0x0096 }
            com.google.android.gms.dynamite.DynamiteModule r10 = m9041a(r10, r12, r0)     // Catch:{ a -> 0x0096 }
            android.database.Cursor r11 = r3.f6207a
            if (r11 == 0) goto L_0x0081
            goto L_0x007e
        L_0x0096:
            r0 = move-exception
            java.lang.String r7 = "Failed to load remote module: "
            java.lang.String r8 = r0.getMessage()     // Catch:{ all -> 0x011f }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x011f }
            int r9 = r8.length()     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x00ac
            java.lang.String r7 = r7.concat(r8)     // Catch:{ all -> 0x011f }
            goto L_0x00b2
        L_0x00ac:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x011f }
            r8.<init>(r7)     // Catch:{ all -> 0x011f }
            r7 = r8
        L_0x00b2:
            android.util.Log.w(r1, r7)     // Catch:{ all -> 0x011f }
            int r1 = r5.f6204a     // Catch:{ all -> 0x011f }
            if (r1 == 0) goto L_0x00d2
            com.google.android.gms.dynamite.DynamiteModule$d r1 = new com.google.android.gms.dynamite.DynamiteModule$d     // Catch:{ all -> 0x011f }
            int r5 = r5.f6204a     // Catch:{ all -> 0x011f }
            r7 = 0
            r1.<init>(r5, r7)     // Catch:{ all -> 0x011f }
            com.google.android.gms.dynamite.DynamiteModule$b$a r11 = r11.mo6994a(r10, r12, r1)     // Catch:{ all -> 0x011f }
            int r11 = r11.f6206c     // Catch:{ all -> 0x011f }
            if (r11 != r6) goto L_0x00d2
            com.google.android.gms.dynamite.DynamiteModule r10 = m9049c(r10, r12)     // Catch:{ all -> 0x011f }
            android.database.Cursor r11 = r3.f6207a
            if (r11 == 0) goto L_0x0081
            goto L_0x007e
        L_0x00d2:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011f }
            java.lang.String r11 = "Remote load failed. No local fallback found."
            r10.<init>(r11, r0, r4)     // Catch:{ all -> 0x011f }
            throw r10     // Catch:{ all -> 0x011f }
        L_0x00da:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011f }
            int r11 = r5.f6206c     // Catch:{ all -> 0x011f }
            r12 = 47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r0.<init>(r12)     // Catch:{ all -> 0x011f }
            java.lang.String r12 = "VersionPolicy returned invalid code:"
            r0.append(r12)     // Catch:{ all -> 0x011f }
            r0.append(r11)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x011f }
            r10.<init>(r11, r4)     // Catch:{ all -> 0x011f }
            throw r10     // Catch:{ all -> 0x011f }
        L_0x00f5:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011f }
            int r11 = r5.f6204a     // Catch:{ all -> 0x011f }
            int r12 = r5.f6205b     // Catch:{ all -> 0x011f }
            r0 = 91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r1.<init>(r0)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = "No acceptable module found. Local version is "
            r1.append(r0)     // Catch:{ all -> 0x011f }
            r1.append(r11)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = " and remote version is "
            r1.append(r11)     // Catch:{ all -> 0x011f }
            r1.append(r12)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = "."
            r1.append(r11)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x011f }
            r10.<init>(r11, r4)     // Catch:{ all -> 0x011f }
            throw r10     // Catch:{ all -> 0x011f }
        L_0x011f:
            r10 = move-exception
            android.database.Cursor r11 = r3.f6207a
            if (r11 == 0) goto L_0x0127
            r11.close()
        L_0x0127:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r11 = f6198g
            r11.set(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m9040a(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* renamed from: a */
    private static DynamiteModule m9041a(Context context, String str, int i) {
        Boolean bool;
        C3851a aVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = f6193b;
            }
            if (bool == null) {
                throw new C2212a("Failed to determine which loading route to use.", (C2218a) null);
            } else if (bool.booleanValue()) {
                return m9047b(context, str, i);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i);
                Log.i("DynamiteModule", sb.toString());
                C2227j a = m9042a(context);
                if (a != null) {
                    if (a.mo7002r() >= 2) {
                        aVar = a.mo6999a(C3854b.m15592a(context), str, i);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        aVar = a.mo7001b(C3854b.m15592a(context), str, i);
                    }
                    if (C3854b.m15593a(aVar) != null) {
                        return new DynamiteModule((Context) C3854b.m15593a(aVar));
                    }
                    throw new C2212a("Failed to load remote module.", (C2218a) null);
                }
                throw new C2212a("Failed to create IDynamiteLoader.", (C2218a) null);
            }
        } catch (RemoteException e) {
            throw new C2212a("Failed to load remote module.", e, null);
        } catch (C2212a e2) {
            throw e2;
        } catch (Throwable th) {
            C2192g.m8983a(context, th);
            throw new C2212a("Failed to load remote module.", th, null);
        }
    }

    /* renamed from: a */
    private static C2227j m9042a(Context context) {
        C2227j jVar;
        synchronized (DynamiteModule.class) {
            if (f6194c != null) {
                C2227j jVar2 = f6194c;
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jVar = queryLocalInterface instanceof C2227j ? (C2227j) queryLocalInterface : new C2226i(iBinder);
                }
                if (jVar != null) {
                    f6194c = jVar;
                    return jVar;
                }
            } catch (Exception e) {
                String str = "DynamiteModule";
                String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Boolean m9043a() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f6197f >= 2);
        }
        return valueOf;
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: a */
    private static void m9044a(ClassLoader classLoader) {
        C2229l lVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                lVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                lVar = queryLocalInterface instanceof C2229l ? (C2229l) queryLocalInterface : new C2228k(iBinder);
            }
            f6195d = lVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C2212a("Failed to instantiate dynamite loader", e, null);
        }
    }

    /* renamed from: b */
    public static int m9045b(Context context, String str) {
        return m9039a(context, str, false);
    }

    /* renamed from: b */
    private static int m9046b(Context context, String str, boolean z) {
        String str2 = "DynamiteModule";
        C2227j a = m9042a(context);
        if (a == null) {
            return 0;
        }
        try {
            if (a.mo7002r() >= 2) {
                return a.mo6998a(C3854b.m15592a(context), str, z);
            }
            Log.w(str2, "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a.mo7000b(C3854b.m15592a(context), str, z);
        } catch (RemoteException e) {
            String str3 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return 0;
        }
    }

    /* renamed from: b */
    private static DynamiteModule m9047b(Context context, String str, int i) {
        C2229l lVar;
        C3851a aVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            lVar = f6195d;
        }
        if (lVar != null) {
            C2216c cVar = (C2216c) f6198g.get();
            if (cVar == null || cVar.f6207a == null) {
                throw new C2212a("No result cursor", (C2218a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.f6207a;
            C3854b.m15592a(null);
            if (m9043a().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                aVar = lVar.mo7004b(C3854b.m15592a(applicationContext), str, i, C3854b.m15592a(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                aVar = lVar.mo7003a(C3854b.m15592a(applicationContext), str, i, C3854b.m15592a(cursor));
            }
            Context context2 = (Context) C3854b.m15593a(aVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new C2212a("Failed to get module context", (C2218a) null);
        }
        throw new C2212a("DynamiteLoaderV2 was not cached.", (C2218a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m9048c(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r2 = r2.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.<init>(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 == 0) goto L_0x0083
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 <= 0) goto L_0x007c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0079 }
            f6196e = r1     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x0079 }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x0079 }
            f6197f = r1     // Catch:{ all -> 0x0079 }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = f6198g     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.C2216c) r10     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r10 == 0) goto L_0x007c
            android.database.Cursor r1 = r10.f6207a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r1 != 0) goto L_0x007c
            r10.f6207a = r8     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            goto L_0x007d
        L_0x0079:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x007c:
            r0 = r8
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r0.close()
        L_0x0082:
            return r9
        L_0x0083:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x0092:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ae
        L_0x0096:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x009f
        L_0x009b:
            r8 = move-exception
            goto L_0x00ae
        L_0x009d:
            r8 = move-exception
            r9 = r0
        L_0x009f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.C2212a     // Catch:{ all -> 0x00ac }
            if (r10 == 0) goto L_0x00a4
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00ac }
            throw r10     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r8 = move-exception
            r0 = r9
        L_0x00ae:
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m9048c(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: c */
    private static DynamiteModule m9049c(Context context, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Selected local version of ";
        Log.i("DynamiteModule", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: a */
    public final IBinder mo6993a(String str) {
        try {
            return (IBinder) this.f6203a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String str2 = "Failed to instantiate module class: ";
            String valueOf = String.valueOf(str);
            throw new C2212a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e, null);
        }
    }
}
