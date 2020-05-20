package p147g.p156d.p157a.p167b.p173d.p180g;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g.d.a.b.d.g.b2 */
public abstract class C3927b2<T> {

    /* renamed from: f */
    private static final Object f10826f = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: g */
    private static Context f10827g;

    /* renamed from: h */
    private static C4163q2<C4149p2<C4275x1>> f10828h;

    /* renamed from: i */
    private static final AtomicInteger f10829i = new AtomicInteger();

    /* renamed from: a */
    private final C4030h2 f10830a;

    /* renamed from: b */
    private final String f10831b;

    /* renamed from: c */
    private final T f10832c;

    /* renamed from: d */
    private volatile int f10833d;

    /* renamed from: e */
    private volatile T f10834e;

    private C3927b2(C4030h2 h2Var, String str, T t, boolean z) {
        this.f10833d = -1;
        if (h2Var.f10992a != null) {
            this.f10830a = h2Var;
            this.f10831b = str;
            this.f10832c = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* synthetic */ C3927b2(C4030h2 h2Var, String str, Object obj, boolean z, C3965d2 d2Var) {
        this(h2Var, str, obj, z);
    }

    /* renamed from: a */
    private final String m15754a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f10831b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f10831b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    public static void m15755a(Context context) {
        synchronized (f10826f) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f10827g != context) {
                C4120n1.m16841d();
                C4076k2.m16695a();
                C4260w1.m17438a();
                f10829i.incrementAndGet();
                f10827g = context;
                f10828h = C4212t2.m17143a(C3981e2.f10918f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C3927b2<Double> m15756b(C4030h2 h2Var, String str, double d, boolean z) {
        return new C3997f2(h2Var, str, Double.valueOf(d), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C3927b2<Long> m15757b(C4030h2 h2Var, String str, long j, boolean z) {
        return new C3965d2(h2Var, str, Long.valueOf(j), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C3927b2<String> m15758b(C4030h2 h2Var, String str, String str2, boolean z) {
        return new C4045i2(h2Var, str, str2, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C3927b2<Boolean> m15759b(C4030h2 h2Var, String str, boolean z, boolean z2) {
        return new C4014g2(h2Var, str, Boolean.valueOf(z), false);
    }

    /* renamed from: c */
    static void m15760c() {
        f10829i.incrementAndGet();
    }

    /* renamed from: d */
    static final /* synthetic */ C4149p2 m15761d() {
        new C3911a2();
        return C3911a2.m15708a(f10827g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo12106a(Object obj);

    /* renamed from: a */
    public final String mo12107a() {
        return m15754a(this.f10830a.f10994c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo12108b() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f10829i
            int r0 = r0.get()
            int r1 = r6.f10833d
            if (r1 >= r0) goto L_0x00f8
            monitor-enter(r6)
            int r1 = r6.f10833d     // Catch:{ all -> 0x00f5 }
            if (r1 >= r0) goto L_0x00f3
            android.content.Context r1 = f10827g     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x00eb
            android.content.Context r1 = f10827g     // Catch:{ all -> 0x00f5 }
            g.d.a.b.d.g.w1 r1 = p147g.p156d.p157a.p167b.p173d.p180g.C4260w1.m17437a(r1)     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r1 = r1.mo12592a(r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0031
            java.util.regex.Pattern r2 = p147g.p156d.p157a.p167b.p173d.p180g.C4106m1.f11104c     // Catch:{ all -> 0x00f5 }
            java.util.regex.Matcher r1 = r2.matcher(r1)     // Catch:{ all -> 0x00f5 }
            boolean r1 = r1.matches()     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            r2 = 0
            if (r1 != 0) goto L_0x006f
            g.d.a.b.d.g.h2 r1 = r6.f10830a     // Catch:{ all -> 0x00f5 }
            android.net.Uri r1 = r1.f10992a     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0058
            android.content.Context r1 = f10827g     // Catch:{ all -> 0x00f5 }
            g.d.a.b.d.g.h2 r3 = r6.f10830a     // Catch:{ all -> 0x00f5 }
            android.net.Uri r3 = r3.f10992a     // Catch:{ all -> 0x00f5 }
            boolean r1 = p147g.p156d.p157a.p167b.p173d.p180g.C4306z1.m17640a(r1, r3)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0056
            android.content.Context r1 = f10827g     // Catch:{ all -> 0x00f5 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x00f5 }
            g.d.a.b.d.g.h2 r3 = r6.f10830a     // Catch:{ all -> 0x00f5 }
            android.net.Uri r3 = r3.f10992a     // Catch:{ all -> 0x00f5 }
            g.d.a.b.d.g.n1 r1 = p147g.p156d.p157a.p167b.p173d.p180g.C4120n1.m16840a(r1, r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x005e
        L_0x0056:
            r1 = r2
            goto L_0x005e
        L_0x0058:
            android.content.Context r1 = f10827g     // Catch:{ all -> 0x00f5 }
            g.d.a.b.d.g.k2 r1 = p147g.p156d.p157a.p167b.p173d.p180g.C4076k2.m16694a(r1, r2)     // Catch:{ all -> 0x00f5 }
        L_0x005e:
            if (r1 == 0) goto L_0x0098
            java.lang.String r3 = r6.mo12107a()     // Catch:{ all -> 0x00f5 }
            java.lang.Object r1 = r1.mo12592a(r3)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0098
            java.lang.Object r1 = r6.mo12106a(r1)     // Catch:{ all -> 0x00f5 }
            goto L_0x0099
        L_0x006f:
            java.lang.String r1 = "PhenotypeFlag"
            r3 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r3)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = "PhenotypeFlag"
            java.lang.String r3 = "Bypass reading Phenotype values for flag: "
            java.lang.String r4 = r6.mo12107a()     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00f5 }
            int r5 = r4.length()     // Catch:{ all -> 0x00f5 }
            if (r5 == 0) goto L_0x008f
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x00f5 }
            goto L_0x0095
        L_0x008f:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00f5 }
            r4.<init>(r3)     // Catch:{ all -> 0x00f5 }
            r3 = r4
        L_0x0095:
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x00f5 }
        L_0x0098:
            r1 = r2
        L_0x0099:
            if (r1 == 0) goto L_0x009c
            goto L_0x00bb
        L_0x009c:
            android.content.Context r1 = f10827g     // Catch:{ all -> 0x00f5 }
            g.d.a.b.d.g.w1 r1 = p147g.p156d.p157a.p167b.p173d.p180g.C4260w1.m17437a(r1)     // Catch:{ all -> 0x00f5 }
            g.d.a.b.d.g.h2 r3 = r6.f10830a     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r3.f10993b     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r6.m15754a(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r1 = r1.mo12592a(r3)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x00b5
            java.lang.Object r1 = r6.mo12106a(r1)     // Catch:{ all -> 0x00f5 }
            goto L_0x00b6
        L_0x00b5:
            r1 = r2
        L_0x00b6:
            if (r1 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            T r1 = r6.f10832c     // Catch:{ all -> 0x00f5 }
        L_0x00bb:
            g.d.a.b.d.g.q2<g.d.a.b.d.g.p2<g.d.a.b.d.g.x1>> r3 = f10828h     // Catch:{ all -> 0x00f5 }
            java.lang.Object r3 = r3.mo12100a()     // Catch:{ all -> 0x00f5 }
            g.d.a.b.d.g.p2 r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C4149p2) r3     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.mo12670a()     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x00e6
            java.lang.Object r1 = r3.mo12671b()     // Catch:{ all -> 0x00f5 }
            g.d.a.b.d.g.x1 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C4275x1) r1     // Catch:{ all -> 0x00f5 }
            g.d.a.b.d.g.h2 r3 = r6.f10830a     // Catch:{ all -> 0x00f5 }
            android.net.Uri r3 = r3.f10992a     // Catch:{ all -> 0x00f5 }
            g.d.a.b.d.g.h2 r4 = r6.f10830a     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = r4.f10994c     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = r6.f10831b     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = r1.mo12906a(r3, r2, r4, r5)     // Catch:{ all -> 0x00f5 }
            if (r1 != 0) goto L_0x00e2
            T r1 = r6.f10832c     // Catch:{ all -> 0x00f5 }
            goto L_0x00e6
        L_0x00e2:
            java.lang.Object r1 = r6.mo12106a(r1)     // Catch:{ all -> 0x00f5 }
        L_0x00e6:
            r6.f10834e = r1     // Catch:{ all -> 0x00f5 }
            r6.f10833d = r0     // Catch:{ all -> 0x00f5 }
            goto L_0x00f3
        L_0x00eb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r6)     // Catch:{ all -> 0x00f5 }
            goto L_0x00f8
        L_0x00f5:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f5 }
            throw r0
        L_0x00f8:
            T r0 = r6.f10834e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p173d.p180g.C3927b2.mo12108b():java.lang.Object");
    }
}
