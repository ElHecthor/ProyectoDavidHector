package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.C2090i;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.stats.C2179a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p147g.p156d.p157a.p167b.p173d.p180g.C4317zc;

/* renamed from: com.google.android.gms.measurement.internal.t7 */
public final class C2465t7 extends C2285e3 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2374l8 f6967c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2428q3 f6968d;

    /* renamed from: e */
    private volatile Boolean f6969e;

    /* renamed from: f */
    private final C2341j f6970f;

    /* renamed from: g */
    private final C2303f9 f6971g;

    /* renamed from: h */
    private final List<Runnable> f6972h = new ArrayList();

    /* renamed from: i */
    private final C2341j f6973i;

    protected C2465t7(C2263c5 c5Var) {
        super(c5Var);
        this.f6971g = new C2303f9(c5Var.mo7095g());
        this.f6967c = new C2374l8(this);
        this.f6970f = new C2498w7(this, c5Var);
        this.f6973i = new C2266c8(this, c5Var);
    }

    /* renamed from: J */
    private final boolean m9925J() {
        mo7094f();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final void m9926K() {
        mo7274c();
        this.f6971g.mo7350a();
        this.f6970f.mo7401a(((Long) C2457t.f6880J.mo7587a(null)).longValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f1  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m9927L() {
        /*
            r5 = this;
            r5.mo7274c()
            r5.mo7245x()
            java.lang.Boolean r0 = r5.f6969e
            if (r0 != 0) goto L_0x00fe
            r5.mo7274c()
            r5.mo7245x()
            com.google.android.gms.measurement.internal.l4 r0 = r5.mo7826l()
            java.lang.Boolean r0 = r0.mo7481w()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x0023
            goto L_0x00f8
        L_0x0023:
            r5.mo7094f()
            com.google.android.gms.measurement.internal.v3 r2 = r5.mo7278q()
            int r2 = r2.mo7672G()
            r3 = 0
            if (r2 != r1) goto L_0x0034
        L_0x0031:
            r0 = 1
            goto L_0x00d4
        L_0x0034:
            com.google.android.gms.measurement.internal.y3 r2 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7810B()
            java.lang.String r4 = "Checking service availability"
            r2.mo7088a(r4)
            com.google.android.gms.measurement.internal.v9 r2 = r5.mo7825k()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.mo7679a(r4)
            if (r2 == 0) goto L_0x00c5
            if (r2 == r1) goto L_0x00b5
            r4 = 2
            if (r2 == r4) goto L_0x0095
            r0 = 3
            if (r2 == r0) goto L_0x0086
            r0 = 9
            if (r2 == r0) goto L_0x007b
            r0 = 18
            if (r2 == r0) goto L_0x0070
            com.google.android.gms.measurement.internal.y3 r0 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7818w()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.mo7089a(r2, r1)
            goto L_0x0093
        L_0x0070:
            com.google.android.gms.measurement.internal.y3 r0 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7818w()
            java.lang.String r2 = "Service updating"
            goto L_0x00cf
        L_0x007b:
            com.google.android.gms.measurement.internal.y3 r0 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7818w()
            java.lang.String r1 = "Service invalid"
            goto L_0x0090
        L_0x0086:
            com.google.android.gms.measurement.internal.y3 r0 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7818w()
            java.lang.String r1 = "Service disabled"
        L_0x0090:
            r0.mo7088a(r1)
        L_0x0093:
            r0 = 0
            goto L_0x00c3
        L_0x0095:
            com.google.android.gms.measurement.internal.y3 r2 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7809A()
            java.lang.String r4 = "Service container out of date"
            r2.mo7088a(r4)
            com.google.android.gms.measurement.internal.v9 r2 = r5.mo7825k()
            int r2 = r2.mo7713v()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto L_0x00af
            goto L_0x00c2
        L_0x00af:
            if (r0 != 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r1 = 0
        L_0x00b3:
            r0 = 0
            goto L_0x00d4
        L_0x00b5:
            com.google.android.gms.measurement.internal.y3 r0 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7810B()
            java.lang.String r2 = "Service missing"
            r0.mo7088a(r2)
        L_0x00c2:
            r0 = 1
        L_0x00c3:
            r1 = 0
            goto L_0x00d4
        L_0x00c5:
            com.google.android.gms.measurement.internal.y3 r0 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7810B()
            java.lang.String r2 = "Service available"
        L_0x00cf:
            r0.mo7088a(r2)
            goto L_0x0031
        L_0x00d4:
            if (r1 != 0) goto L_0x00ee
            com.google.android.gms.measurement.internal.b r2 = r5.mo7827m()
            boolean r2 = r2.mo7129v()
            if (r2 == 0) goto L_0x00ee
            com.google.android.gms.measurement.internal.y3 r0 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7815t()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.mo7088a(r2)
            goto L_0x00ef
        L_0x00ee:
            r3 = r0
        L_0x00ef:
            if (r3 == 0) goto L_0x00f8
            com.google.android.gms.measurement.internal.l4 r0 = r5.mo7826l()
            r0.mo7470a(r1)
        L_0x00f8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.f6969e = r0
        L_0x00fe:
            java.lang.Boolean r0 = r5.f6969e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2465t7.m9927L():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public final void m9928M() {
        mo7274c();
        if (mo7628B()) {
            mo7098j().mo7810B().mo7088a("Inactivity, disconnecting from the service");
            mo7634H();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final void m9929N() {
        mo7274c();
        mo7098j().mo7810B().mo7089a("Processing queued up service tasks", Integer.valueOf(this.f6972h.size()));
        for (Runnable run : this.f6972h) {
            try {
                run.run();
            } catch (Exception e) {
                mo7098j().mo7815t().mo7089a("Task exception while flushing queue", e);
            }
        }
        this.f6972h.clear();
        this.f6973i.mo7403c();
    }

    /* renamed from: a */
    private final C2244aa m9930a(boolean z) {
        mo7094f();
        return mo7278q().mo7674a(z ? mo7098j().mo7811C() : null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9933a(ComponentName componentName) {
        mo7274c();
        if (this.f6968d != null) {
            this.f6968d = null;
            mo7098j().mo7810B().mo7089a("Disconnected from device MeasurementService", componentName);
            mo7274c();
            mo7632F();
        }
    }

    /* renamed from: a */
    private final void m9935a(Runnable runnable) {
        mo7274c();
        if (mo7628B()) {
            runnable.run();
        } else if (((long) this.f6972h.size()) >= 1000) {
            mo7098j().mo7815t().mo7088a("Discarding data. Max runnable queue size reached");
        } else {
            this.f6972h.add(runnable);
            this.f6973i.mo7401a(60000);
            mo7632F();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo7242A() {
        return false;
    }

    /* renamed from: B */
    public final boolean mo7628B() {
        mo7274c();
        mo7245x();
        return this.f6968d != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo7629C() {
        mo7274c();
        mo7245x();
        m9935a((Runnable) new C2314g8(this, m9930a(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo7630D() {
        mo7274c();
        mo7273a();
        mo7245x();
        C2244aa a = m9930a(false);
        if (m9925J()) {
            mo7281t().mo7652B();
        }
        m9935a((Runnable) new C2509x7(this, a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo7631E() {
        mo7274c();
        mo7245x();
        C2244aa a = m9930a(true);
        mo7281t().mo7653C();
        m9935a((Runnable) new C2254b8(this, a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final void mo7632F() {
        mo7274c();
        mo7245x();
        if (!mo7628B()) {
            if (m9927L()) {
                this.f6967c.mo7489b();
                return;
            }
            if (!mo7827m().mo7129v()) {
                mo7094f();
                String str = "com.google.android.gms.measurement.AppMeasurementService";
                List queryIntentServices = mo7096h().getPackageManager().queryIntentServices(new Intent().setClassName(mo7096h(), str), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context h = mo7096h();
                    mo7094f();
                    intent.setComponent(new ComponentName(h, str));
                    this.f6967c.mo7488a(intent);
                    return;
                }
                mo7098j().mo7815t().mo7088a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public final Boolean mo7633G() {
        return this.f6969e;
    }

    /* renamed from: H */
    public final void mo7634H() {
        mo7274c();
        mo7245x();
        this.f6967c.mo7487a();
        try {
            C2179a.m8953a().mo6976a(mo7096h(), this.f6967c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f6968d = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public final boolean mo7635I() {
        mo7274c();
        mo7245x();
        return !m9927L() || mo7825k().mo7713v() >= 200900;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7636a(C2388ma maVar) {
        C2148s.m8834a(maVar);
        mo7274c();
        mo7245x();
        mo7094f();
        C2338i8 i8Var = new C2338i8(this, true, mo7281t().mo7656a(maVar), new C2388ma(maVar), m9930a(true), maVar);
        m9935a((Runnable) i8Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7637a(C2410o7 o7Var) {
        mo7274c();
        mo7245x();
        m9935a((Runnable) new C2242a8(this, o7Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7638a(C2428q3 q3Var) {
        mo7274c();
        C2148s.m8834a(q3Var);
        this.f6968d = q3Var;
        m9926K();
        m9929N();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7639a(com.google.android.gms.measurement.internal.C2428q3 r12, com.google.android.gms.common.internal.p048x.C2158a r13, com.google.android.gms.measurement.internal.C2244aa r14) {
        /*
            r11 = this;
            r11.mo7274c()
            r11.mo7273a()
            r11.mo7245x()
            boolean r0 = r11.m9925J()
            r1 = 0
            r2 = 100
            r3 = 0
            r4 = 100
        L_0x0013:
            r5 = 1001(0x3e9, float:1.403E-42)
            if (r3 >= r5) goto L_0x00a1
            if (r4 != r2) goto L_0x00a1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.measurement.internal.u3 r5 = r11.mo7281t()
            java.util.List r5 = r5.mo7655a(r2)
            if (r5 == 0) goto L_0x0032
            r4.addAll(r5)
            int r5 = r5.size()
            goto L_0x0033
        L_0x0032:
            r5 = 0
        L_0x0033:
            if (r13 == 0) goto L_0x003a
            if (r5 >= r2) goto L_0x003a
            r4.add(r13)
        L_0x003a:
            int r6 = r4.size()
            r7 = 0
        L_0x003f:
            if (r7 >= r6) goto L_0x009c
            java.lang.Object r8 = r4.get(r7)
            int r7 = r7 + 1
            com.google.android.gms.common.internal.x.a r8 = (com.google.android.gms.common.internal.p048x.C2158a) r8
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.C2435r
            if (r9 == 0) goto L_0x0062
            com.google.android.gms.measurement.internal.r r8 = (com.google.android.gms.measurement.internal.C2435r) r8     // Catch:{ RemoteException -> 0x0053 }
            r12.mo7387a(r8, r14)     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x003f
        L_0x0053:
            r8 = move-exception
            com.google.android.gms.measurement.internal.y3 r9 = r11.mo7098j()
            com.google.android.gms.measurement.internal.a4 r9 = r9.mo7815t()
            java.lang.String r10 = "Failed to send event to the service"
        L_0x005e:
            r9.mo7089a(r10, r8)
            goto L_0x003f
        L_0x0062:
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.C2478u9
            if (r9 == 0) goto L_0x0078
            com.google.android.gms.measurement.internal.u9 r8 = (com.google.android.gms.measurement.internal.C2478u9) r8     // Catch:{ RemoteException -> 0x006c }
            r12.mo7389a(r8, r14)     // Catch:{ RemoteException -> 0x006c }
            goto L_0x003f
        L_0x006c:
            r8 = move-exception
            com.google.android.gms.measurement.internal.y3 r9 = r11.mo7098j()
            com.google.android.gms.measurement.internal.a4 r9 = r9.mo7815t()
            java.lang.String r10 = "Failed to send user property to the service"
            goto L_0x005e
        L_0x0078:
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.C2388ma
            if (r9 == 0) goto L_0x008e
            com.google.android.gms.measurement.internal.ma r8 = (com.google.android.gms.measurement.internal.C2388ma) r8     // Catch:{ RemoteException -> 0x0082 }
            r12.mo7386a(r8, r14)     // Catch:{ RemoteException -> 0x0082 }
            goto L_0x003f
        L_0x0082:
            r8 = move-exception
            com.google.android.gms.measurement.internal.y3 r9 = r11.mo7098j()
            com.google.android.gms.measurement.internal.a4 r9 = r9.mo7815t()
            java.lang.String r10 = "Failed to send conditional user property to the service"
            goto L_0x005e
        L_0x008e:
            com.google.android.gms.measurement.internal.y3 r8 = r11.mo7098j()
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo7815t()
            java.lang.String r9 = "Discarding data. Unrecognized parcel type."
            r8.mo7088a(r9)
            goto L_0x003f
        L_0x009c:
            int r3 = r3 + 1
            r4 = r5
            goto L_0x0013
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2465t7.mo7639a(com.google.android.gms.measurement.internal.q3, com.google.android.gms.common.internal.x.a, com.google.android.gms.measurement.internal.aa):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7640a(C2435r rVar, String str) {
        C2148s.m8834a(rVar);
        mo7274c();
        mo7245x();
        boolean J = m9925J();
        C2290e8 e8Var = new C2290e8(this, J, J && mo7281t().mo7657a(rVar), rVar, m9930a(true), str);
        m9935a((Runnable) e8Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7641a(C2478u9 u9Var) {
        mo7274c();
        mo7245x();
        m9935a((Runnable) new C2487v7(this, m9925J() && mo7281t().mo7658a(u9Var), u9Var, m9930a(true)));
    }

    /* renamed from: a */
    public final void mo7642a(C4317zc zcVar) {
        mo7274c();
        mo7245x();
        m9935a((Runnable) new C2520y7(this, m9930a(false), zcVar));
    }

    /* renamed from: a */
    public final void mo7643a(C4317zc zcVar, C2435r rVar, String str) {
        mo7274c();
        mo7245x();
        if (mo7825k().mo7679a((int) C2090i.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            mo7098j().mo7818w().mo7088a("Not bundling data. Service unavailable or out of date");
            mo7825k().mo7697a(zcVar, new byte[0]);
            return;
        }
        m9935a((Runnable) new C2278d8(this, rVar, str, zcVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7644a(C4317zc zcVar, String str, String str2) {
        mo7274c();
        mo7245x();
        C2362k8 k8Var = new C2362k8(this, str, str2, m9930a(false), zcVar);
        m9935a((Runnable) k8Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7645a(C4317zc zcVar, String str, String str2, boolean z) {
        mo7274c();
        mo7245x();
        C2386m8 m8Var = new C2386m8(this, str, str2, z, m9930a(false), zcVar);
        m9935a((Runnable) m8Var);
    }

    /* renamed from: a */
    public final void mo7646a(AtomicReference<String> atomicReference) {
        mo7274c();
        mo7245x();
        m9935a((Runnable) new C2531z7(this, atomicReference, m9930a(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7647a(AtomicReference<List<C2388ma>> atomicReference, String str, String str2, String str3) {
        mo7274c();
        mo7245x();
        C2326h8 h8Var = new C2326h8(this, atomicReference, str, str2, str3, m9930a(false));
        m9935a((Runnable) h8Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7648a(AtomicReference<List<C2478u9>> atomicReference, String str, String str2, String str3, boolean z) {
        mo7274c();
        mo7245x();
        C2350j8 j8Var = new C2350j8(this, atomicReference, str, str2, str3, z, m9930a(false));
        m9935a((Runnable) j8Var);
    }
}
