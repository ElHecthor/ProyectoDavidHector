package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.C2156w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import p071f.p088e.C3162a;
import p147g.p156d.p157a.p167b.p173d.p180g.C3973da;
import p147g.p156d.p157a.p167b.p173d.p180g.C4268w9;

/* renamed from: com.google.android.gms.measurement.internal.j6 */
public final class C2348j6 extends C2285e3 {

    /* renamed from: c */
    protected C2265c7 f6550c;

    /* renamed from: d */
    private C2276d6 f6551d;

    /* renamed from: e */
    private final Set<C2324h6> f6552e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f6553f;

    /* renamed from: g */
    private final AtomicReference<String> f6554g = new AtomicReference<>();

    /* renamed from: h */
    final C2256ba f6555h;

    /* renamed from: i */
    protected boolean f6556i = true;

    protected C2348j6(C2263c5 c5Var) {
        super(c5Var);
        this.f6555h = new C2256ba(c5Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public final void m9494M() {
        mo7274c();
        String a = mo7826l().f6636s.mo7589a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo7434a("app", "_npa", (Object) null, mo7095g().mo6988b());
            } else {
                mo7434a("app", "_npa", (Object) Long.valueOf("true".equals(a) ? 1 : 0), mo7095g().mo6988b());
            }
        }
        if (!this.f7100a.mo7204c() || !this.f6556i) {
            mo7098j().mo7809A().mo7088a("Updating Scion state (FE)");
            mo7279r().mo7629C();
            return;
        }
        mo7098j().mo7809A().mo7088a("Recording app launch after enabling measurement for the first time (FE)");
        mo7415I();
        if (C3973da.m16224b() && mo7827m().mo7108a(C2457t.f6953x0)) {
            mo7282u().f7107d.mo7371a();
        }
        if (C4268w9.m17501b() && mo7827m().mo7108a(C2457t.f6867C0)) {
            if (!(this.f7100a.mo7215s().f6983a.mo7212p().f6628k.mo7570a() > 0)) {
                C2473u4 s = this.f7100a.mo7215s();
                s.f6983a.mo7206e();
                s.mo7660a(s.f6983a.mo7096h().getPackageName());
            }
        }
        if (mo7827m().mo7108a(C2457t.f6895Q0)) {
            mo7097i().mo7841a((Runnable) new C2241a7(this));
        }
    }

    /* renamed from: a */
    private final void m9498a(String str, String str2, long j, Object obj) {
        C2528z4 i = mo7097i();
        C2409o6 o6Var = new C2409o6(this, str, str2, obj, j);
        i.mo7841a((Runnable) o6Var);
    }

    /* renamed from: b */
    private final ArrayList<Bundle> m9499b(String str, String str2, String str3) {
        if (mo7097i().mo7844t()) {
            mo7098j().mo7815t().mo7088a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (C2352ja.m9553a()) {
            mo7098j().mo7815t().mo7088a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C2528z4 i = this.f7100a.mo7097i();
            C2486v6 v6Var = new C2486v6(this, atomicReference, str, str2, str3);
            i.mo7839a(atomicReference, 5000, "get conditional user properties", v6Var);
            List list = (List) atomicReference.get();
            if (list != null) {
                return C2489v9.m10021b(list);
            }
            mo7098j().mo7815t().mo7089a("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    /* renamed from: b */
    private final Map<String, Object> m9500b(String str, String str2, String str3, boolean z) {
        C2238a4 t;
        String str4;
        if (mo7097i().mo7844t()) {
            t = mo7098j().mo7815t();
            str4 = "Cannot get user properties from analytics worker thread";
        } else if (C2352ja.m9553a()) {
            t = mo7098j().mo7815t();
            str4 = "Cannot get user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C2528z4 i = this.f7100a.mo7097i();
            C2475u6 u6Var = new C2475u6(this, atomicReference, str, str2, str3, z);
            i.mo7839a(atomicReference, 5000, "get user properties", u6Var);
            List<C2478u9> list = (List) atomicReference.get();
            if (list == null) {
                mo7098j().mo7815t().mo7089a("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            C3162a aVar = new C3162a(list.size());
            for (C2478u9 u9Var : list) {
                aVar.put(u9Var.f6998g, u9Var.mo7665a());
            }
            return aVar;
        }
        t.mo7088a(str4);
        return Collections.emptyMap();
    }

    /* renamed from: b */
    private final void m9501b(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C2148s.m8834a(bundle);
        C2529z5.m10194a(bundle, "app_id", cls2, null);
        String str = "origin";
        C2529z5.m10194a(bundle, str, cls2, null);
        String str2 = "name";
        C2529z5.m10194a(bundle, str2, cls2, null);
        String str3 = "value";
        C2529z5.m10194a(bundle, str3, Object.class, null);
        String str4 = "trigger_event_name";
        C2529z5.m10194a(bundle, str4, cls2, null);
        Long valueOf = Long.valueOf(0);
        String str5 = "trigger_timeout";
        C2529z5.m10194a(bundle, str5, cls, valueOf);
        C2529z5.m10194a(bundle, "timed_out_event_name", cls2, null);
        C2529z5.m10194a(bundle, "timed_out_event_params", Bundle.class, null);
        C2529z5.m10194a(bundle, "triggered_event_name", cls2, null);
        C2529z5.m10194a(bundle, "triggered_event_params", Bundle.class, null);
        String str6 = "time_to_live";
        C2529z5.m10194a(bundle, str6, cls, valueOf);
        C2529z5.m10194a(bundle, "expired_event_name", cls2, null);
        C2529z5.m10194a(bundle, "expired_event_params", Bundle.class, null);
        C2148s.m8844b(bundle.getString(str2));
        C2148s.m8844b(bundle.getString(str));
        C2148s.m8834a(bundle.get(str3));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString(str2);
        Object obj = bundle.get(str3);
        if (mo7825k().mo7705b(string) != 0) {
            mo7098j().mo7815t().mo7089a("Invalid conditional user property name", mo7824e().mo7720c(string));
        } else if (mo7825k().mo7706b(string, obj) != 0) {
            mo7098j().mo7815t().mo7090a("Invalid conditional user property value", mo7824e().mo7720c(string), obj);
        } else {
            Object c = mo7825k().mo7708c(string, obj);
            if (c == null) {
                mo7098j().mo7815t().mo7090a("Unable to normalize conditional user property value", mo7824e().mo7720c(string), obj);
                return;
            }
            C2529z5.m10195a(bundle, c);
            long j2 = bundle.getLong(str5);
            if (TextUtils.isEmpty(bundle.getString(str4)) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = bundle.getLong(str6);
                if (j3 > 15552000000L || j3 < 1) {
                    mo7098j().mo7815t().mo7090a("Invalid conditional user property time to live", mo7824e().mo7720c(string), Long.valueOf(j3));
                    return;
                }
                mo7097i().mo7841a((Runnable) new C2431q6(this, bundle));
                return;
            }
            mo7098j().mo7815t().mo7090a("Invalid conditional user property timeout", mo7824e().mo7720c(string), Long.valueOf(j2));
        }
    }

    /* renamed from: b */
    private final void m9503b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle b = C2489v9.m10020b(bundle);
        C2528z4 i = mo7097i();
        C2384m6 m6Var = new C2384m6(this, str, str2, j, b, z, z2, z3, str3);
        i.mo7841a((Runnable) m6Var);
    }

    /* renamed from: b */
    private final void m9504b(String str, String str2, String str3, Bundle bundle) {
        long b = mo7095g().mo6988b();
        C2148s.m8844b(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", b);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        mo7097i().mo7841a((Runnable) new C2464t6(this, bundle2));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m9505c(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = "app_id";
        mo7274c();
        mo7245x();
        C2148s.m8834a(bundle);
        String str2 = "name";
        C2148s.m8844b(bundle2.getString(str2));
        String str3 = "origin";
        C2148s.m8844b(bundle2.getString(str3));
        String str4 = "value";
        C2148s.m8834a(bundle2.get(str4));
        if (!this.f7100a.mo7204c()) {
            mo7098j().mo7810B().mo7088a("Conditional property not set since app measurement is disabled");
            return;
        }
        C2478u9 u9Var = new C2478u9(bundle2.getString(str2), bundle2.getLong("triggered_timestamp"), bundle2.get(str4), bundle2.getString(str3));
        try {
            C2435r a = mo7825k().mo7685a(bundle2.getString(str), bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), bundle2.getString(str3), 0, true, false);
            C2388ma maVar = new C2388ma(bundle2.getString(str), bundle2.getString(str3), u9Var, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), mo7825k().mo7685a(bundle2.getString(str), bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), bundle2.getString(str3), 0, true, false), bundle2.getLong("trigger_timeout"), a, bundle2.getLong("time_to_live"), mo7825k().mo7685a(bundle2.getString(str), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString(str3), 0, true, false));
            mo7279r().mo7636a(maVar);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m9506c(boolean z) {
        mo7274c();
        mo7273a();
        mo7245x();
        mo7098j().mo7809A().mo7089a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        mo7826l().mo7473b(z);
        m9494M();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m9507d(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = "creation_timestamp";
        String str2 = "origin";
        String str3 = "app_id";
        mo7274c();
        mo7245x();
        C2148s.m8834a(bundle);
        String str4 = "name";
        C2148s.m8844b(bundle2.getString(str4));
        if (!this.f7100a.mo7204c()) {
            mo7098j().mo7810B().mo7088a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        C2478u9 u9Var = new C2478u9(bundle2.getString(str4), 0, null, null);
        try {
            C2435r a = mo7825k().mo7685a(bundle2.getString(str3), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString(str2), bundle2.getLong(str), true, false);
            C2478u9 u9Var2 = u9Var;
            C2388ma maVar = new C2388ma(bundle2.getString(str3), bundle2.getString(str2), u9Var2, bundle2.getLong(str), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), a);
            mo7279r().mo7636a(maVar);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo7242A() {
        return false;
    }

    /* renamed from: B */
    public final void mo7408B() {
        if (mo7096h().getApplicationContext() instanceof Application) {
            ((Application) mo7096h().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f6550c);
        }
    }

    /* renamed from: C */
    public final Boolean mo7409C() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) mo7097i().mo7839a(atomicReference, 15000, "boolean test flag value", new C2360k6(this, atomicReference));
    }

    /* renamed from: D */
    public final String mo7410D() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) mo7097i().mo7839a(atomicReference, 15000, "String test flag value", new C2453s6(this, atomicReference));
    }

    /* renamed from: E */
    public final Long mo7411E() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) mo7097i().mo7839a(atomicReference, 15000, "long test flag value", new C2508x6(this, atomicReference));
    }

    /* renamed from: F */
    public final Integer mo7412F() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) mo7097i().mo7839a(atomicReference, 15000, "int test flag value", new C2497w6(this, atomicReference));
    }

    /* renamed from: G */
    public final Double mo7413G() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) mo7097i().mo7839a(atomicReference, 15000, "double test flag value", new C2530z6(this, atomicReference));
    }

    /* renamed from: H */
    public final String mo7414H() {
        mo7273a();
        return (String) this.f6554g.get();
    }

    /* renamed from: I */
    public final void mo7415I() {
        mo7274c();
        mo7273a();
        mo7245x();
        if (this.f7100a.mo7209m()) {
            if (mo7827m().mo7108a(C2457t.f6923i0)) {
                C2245b m = mo7827m();
                m.mo7094f();
                Boolean d = m.mo7113d("google_analytics_deferred_deep_link_enabled");
                if (d != null && d.booleanValue()) {
                    mo7098j().mo7809A().mo7088a("Deferred Deep Link feature enabled.");
                    mo7097i().mo7841a((Runnable) new C2372l6(this));
                }
            }
            mo7279r().mo7631E();
            this.f6556i = false;
            String z = mo7826l().mo7484z();
            if (!TextUtils.isEmpty(z)) {
                mo7823d().mo7742o();
                if (!z.equals(VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", z);
                    mo7431a("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: J */
    public final String mo7416J() {
        C2410o7 B = this.f7100a.mo7193D().mo7520B();
        if (B != null) {
            return B.f6768a;
        }
        return null;
    }

    /* renamed from: K */
    public final String mo7417K() {
        C2410o7 B = this.f7100a.mo7193D().mo7520B();
        if (B != null) {
            return B.f6769b;
        }
        return null;
    }

    /* renamed from: L */
    public final String mo7418L() {
        if (this.f7100a.mo7222z() != null) {
            return this.f7100a.mo7222z();
        }
        try {
            return new C2156w(mo7096h()).mo6948a("google_app_id");
        } catch (IllegalStateException e) {
            this.f7100a.mo7098j().mo7815t().mo7089a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* renamed from: a */
    public final ArrayList<Bundle> mo7419a(String str, String str2) {
        mo7273a();
        return m9499b((String) null, str, str2);
    }

    /* renamed from: a */
    public final ArrayList<Bundle> mo7420a(String str, String str2, String str3) {
        C2148s.m8844b(str);
        mo7275n();
        throw null;
    }

    /* renamed from: a */
    public final Map<String, Object> mo7421a(String str, String str2, String str3, boolean z) {
        C2148s.m8844b(str);
        mo7275n();
        throw null;
    }

    /* renamed from: a */
    public final Map<String, Object> mo7422a(String str, String str2, boolean z) {
        mo7273a();
        return m9500b((String) null, str, str2, z);
    }

    /* renamed from: a */
    public final void mo7423a(long j) {
        mo7273a();
        mo7097i().mo7841a((Runnable) new C2277d7(this, j));
    }

    /* renamed from: a */
    public final void mo7424a(Bundle bundle) {
        mo7425a(bundle, mo7095g().mo6988b());
    }

    /* renamed from: a */
    public final void mo7425a(Bundle bundle, long j) {
        C2148s.m8834a(bundle);
        mo7273a();
        Bundle bundle2 = new Bundle(bundle);
        String str = "app_id";
        if (!TextUtils.isEmpty(bundle2.getString(str))) {
            mo7098j().mo7818w().mo7088a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(str);
        m9501b(bundle2, j);
    }

    /* renamed from: a */
    public final void mo7426a(C2276d6 d6Var) {
        mo7274c();
        mo7273a();
        mo7245x();
        if (d6Var != null) {
            C2276d6 d6Var2 = this.f6551d;
            if (d6Var != d6Var2) {
                C2148s.m8846b(d6Var2 == null, "EventInterceptor already set.");
            }
        }
        this.f6551d = d6Var;
    }

    /* renamed from: a */
    public final void mo7427a(C2324h6 h6Var) {
        mo7273a();
        mo7245x();
        C2148s.m8834a(h6Var);
        if (!this.f6552e.add(h6Var)) {
            mo7098j().mo7818w().mo7088a("OnEventListener already registered");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7428a(String str) {
        this.f6554g.set(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7429a(String str, String str2, long j, Bundle bundle) {
        mo7273a();
        mo7274c();
        mo7430a(str, str2, j, bundle, true, this.f6551d == null || C2489v9.m10029f(str2), false, null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0511 A[EDGE_INSN: B:214:0x0511->B:178:0x0511 ?: BREAK  
    EDGE_INSN: B:214:0x0511->B:178:0x0511 ?: BREAK  
    EDGE_INSN: B:214:0x0511->B:178:0x0511 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0511 A[EDGE_INSN: B:214:0x0511->B:178:0x0511 ?: BREAK  
    EDGE_INSN: B:214:0x0511->B:178:0x0511 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7430a(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            r15 = r29
            r13 = r30
            r12 = r32
            com.google.android.gms.common.internal.C2148s.m8844b(r28)
            com.google.android.gms.common.internal.C2148s.m8834a(r32)
            r27.mo7274c()
            r27.mo7245x()
            com.google.android.gms.measurement.internal.c5 r0 = r7.f7100a
            boolean r0 = r0.mo7204c()
            if (r0 != 0) goto L_0x002c
            com.google.android.gms.measurement.internal.y3 r0 = r27.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7809A()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo7088a(r1)
            return
        L_0x002c:
            com.google.android.gms.measurement.internal.b r0 = r27.mo7827m()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C2457t.f6913d0
            boolean r0 = r0.mo7108a(r1)
            if (r0 == 0) goto L_0x0056
            com.google.android.gms.measurement.internal.v3 r0 = r27.mo7278q()
            java.util.List r0 = r0.mo7673H()
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.contains(r15)
            if (r0 != 0) goto L_0x0056
            com.google.android.gms.measurement.internal.y3 r0 = r27.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7809A()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo7090a(r1, r15, r8)
            return
        L_0x0056:
            boolean r0 = r7.f6553f
            r11 = 0
            r10 = 0
            r9 = 1
            if (r0 != 0) goto L_0x00b0
            r7.f6553f = r9
            com.google.android.gms.measurement.internal.c5 r0 = r7.f7100a     // Catch:{ ClassNotFoundException -> 0x00a3 }
            boolean r0 = r0.mo7192C()     // Catch:{ ClassNotFoundException -> 0x00a3 }
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            android.content.Context r1 = r27.mo7096h()     // Catch:{ ClassNotFoundException -> 0x00a3 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a3 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r9, r1)     // Catch:{ ClassNotFoundException -> 0x00a3 }
            goto L_0x007c
        L_0x0076:
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00a3 }
        L_0x007c:
            java.lang.String r1 = "initialize"
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0094 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3     // Catch:{ Exception -> 0x0094 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x0094 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0094 }
            android.content.Context r2 = r27.mo7096h()     // Catch:{ Exception -> 0x0094 }
            r1[r10] = r2     // Catch:{ Exception -> 0x0094 }
            r0.invoke(r11, r1)     // Catch:{ Exception -> 0x0094 }
            goto L_0x00b0
        L_0x0094:
            r0 = move-exception
            com.google.android.gms.measurement.internal.y3 r1 = r27.mo7098j()     // Catch:{ ClassNotFoundException -> 0x00a3 }
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7818w()     // Catch:{ ClassNotFoundException -> 0x00a3 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo7089a(r2, r0)     // Catch:{ ClassNotFoundException -> 0x00a3 }
            goto L_0x00b0
        L_0x00a3:
            com.google.android.gms.measurement.internal.y3 r0 = r27.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7821z()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo7088a(r1)
        L_0x00b0:
            com.google.android.gms.measurement.internal.b r0 = r27.mo7827m()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C2457t.f6925j0
            boolean r0 = r0.mo7108a(r1)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00e1
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.common.util.e r0 = r27.mo7095g()
            long r5 = r0.mo6988b()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r27
            r1.mo7434a(r2, r3, r4, r5)
        L_0x00e1:
            boolean r0 = p147g.p156d.p157a.p167b.p173d.p180g.C4240ua.m17281b()
            if (r0 == 0) goto L_0x0134
            com.google.android.gms.measurement.internal.b r0 = r27.mo7827m()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C2457t.f6891O0
            boolean r0 = r0.mo7108a(r1)
            if (r0 == 0) goto L_0x0134
            r27.mo7094f()
            if (r33 == 0) goto L_0x0134
            boolean r0 = com.google.android.gms.measurement.internal.C2489v9.m10030g(r29)
            if (r0 == 0) goto L_0x0134
            com.google.android.gms.measurement.internal.v9 r0 = r27.mo7825k()
            com.google.android.gms.measurement.internal.l4 r1 = r27.mo7826l()
            com.google.android.gms.measurement.internal.q4 r1 = r1.f6619D
            android.os.Bundle r1 = r1.mo7578a()
            if (r1 == 0) goto L_0x0134
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0116:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0134
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r12.containsKey(r3)
            if (r4 != 0) goto L_0x0116
            com.google.android.gms.measurement.internal.v9 r4 = r0.mo7825k()
            java.lang.Object r5 = r1.get(r3)
            r4.mo7690a(r12, r3, r5)
            goto L_0x0116
        L_0x0134:
            r0 = 40
            if (r35 == 0) goto L_0x0198
            r27.mo7094f()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0198
            com.google.android.gms.measurement.internal.c5 r1 = r7.f7100a
            com.google.android.gms.measurement.internal.v9 r1 = r1.mo7218v()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo7701a(r2, r15)
            r4 = 2
            if (r3 != 0) goto L_0x0153
            goto L_0x0166
        L_0x0153:
            java.lang.String[] r3 = com.google.android.gms.measurement.internal.C2264c6.f6343a
            boolean r3 = r1.mo7704a(r2, r3, r15)
            if (r3 != 0) goto L_0x015e
            r4 = 13
            goto L_0x0166
        L_0x015e:
            boolean r1 = r1.mo7700a(r2, r0, r15)
            if (r1 != 0) goto L_0x0165
            goto L_0x0166
        L_0x0165:
            r4 = 0
        L_0x0166:
            if (r4 == 0) goto L_0x0198
            com.google.android.gms.measurement.internal.y3 r1 = r27.mo7098j()
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7817v()
            com.google.android.gms.measurement.internal.w3 r2 = r27.mo7824e()
            java.lang.String r2 = r2.mo7718a(r15)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo7089a(r3, r2)
            com.google.android.gms.measurement.internal.c5 r1 = r7.f7100a
            r1.mo7218v()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C2489v9.m10008a(r15, r0, r9)
            if (r15 == 0) goto L_0x018c
            int r10 = r29.length()
        L_0x018c:
            com.google.android.gms.measurement.internal.c5 r1 = r7.f7100a
            com.google.android.gms.measurement.internal.v9 r1 = r1.mo7218v()
            java.lang.String r2 = "_ev"
            r1.mo7688a(r4, r2, r0, r10)
            return
        L_0x0198:
            r27.mo7094f()
            com.google.android.gms.measurement.internal.n7 r1 = r27.mo7280s()
            com.google.android.gms.measurement.internal.o7 r1 = r1.mo7521a(r10)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x01af
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01af
            r1.f6771d = r9
        L_0x01af:
            if (r33 == 0) goto L_0x01b5
            if (r35 == 0) goto L_0x01b5
            r3 = 1
            goto L_0x01b6
        L_0x01b5:
            r3 = 0
        L_0x01b6:
            com.google.android.gms.measurement.internal.C2397n7.m9636a(r1, r12, r3)
            java.lang.String r3 = "am"
            boolean r16 = r3.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.C2489v9.m10029f(r29)
            if (r33 == 0) goto L_0x01f8
            com.google.android.gms.measurement.internal.d6 r4 = r7.f6551d
            if (r4 == 0) goto L_0x01f8
            if (r3 != 0) goto L_0x01f8
            if (r16 != 0) goto L_0x01f8
            com.google.android.gms.measurement.internal.y3 r0 = r27.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7809A()
            com.google.android.gms.measurement.internal.w3 r1 = r27.mo7824e()
            java.lang.String r1 = r1.mo7718a(r15)
            com.google.android.gms.measurement.internal.w3 r2 = r27.mo7824e()
            java.lang.String r2 = r2.mo7716a(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo7090a(r3, r1, r2)
            com.google.android.gms.measurement.internal.d6 r1 = r7.f6551d
            r2 = r28
            r3 = r29
            r4 = r32
            r5 = r30
            r1.mo7085a(r2, r3, r4, r5)
            return
        L_0x01f8:
            com.google.android.gms.measurement.internal.c5 r3 = r7.f7100a
            boolean r3 = r3.mo7209m()
            if (r3 != 0) goto L_0x0201
            return
        L_0x0201:
            com.google.android.gms.measurement.internal.v9 r3 = r27.mo7825k()
            int r3 = r3.mo7680a(r15)
            if (r3 == 0) goto L_0x0245
            com.google.android.gms.measurement.internal.y3 r1 = r27.mo7098j()
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7817v()
            com.google.android.gms.measurement.internal.w3 r2 = r27.mo7824e()
            java.lang.String r2 = r2.mo7718a(r15)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r1.mo7089a(r4, r2)
            r27.mo7825k()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C2489v9.m10008a(r15, r0, r9)
            if (r15 == 0) goto L_0x022d
            int r10 = r29.length()
        L_0x022d:
            com.google.android.gms.measurement.internal.c5 r1 = r7.f7100a
            com.google.android.gms.measurement.internal.v9 r1 = r1.mo7218v()
            java.lang.String r2 = "_ev"
            r28 = r1
            r29 = r36
            r30 = r3
            r31 = r2
            r32 = r0
            r33 = r10
            r28.mo7698a(r29, r30, r31, r32, r33)
            return
        L_0x0245:
            java.lang.String r0 = "_sn"
            java.lang.String r5 = "_o"
            java.lang.String r3 = "_si"
            java.lang.String[] r4 = new java.lang.String[]{r5, r0, r2, r3}
            java.util.List r17 = com.google.android.gms.common.util.C2191f.m8982a((T[]) r4)
            com.google.android.gms.measurement.internal.v9 r4 = r27.mo7825k()
            r6 = 1
            r9 = r4
            r4 = 0
            r10 = r36
            r19 = r11
            r11 = r29
            r12 = r32
            r13 = r17
            r14 = r35
            r15 = r6
            android.os.Bundle r15 = r9.mo7684a(r10, r11, r12, r13, r14, r15)
            if (r15 == 0) goto L_0x0294
            boolean r6 = r15.containsKey(r2)
            if (r6 == 0) goto L_0x0294
            boolean r6 = r15.containsKey(r3)
            if (r6 != 0) goto L_0x027a
            goto L_0x0294
        L_0x027a:
            java.lang.String r0 = r15.getString(r0)
            java.lang.String r2 = r15.getString(r2)
            long r9 = r15.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            com.google.android.gms.measurement.internal.o7 r11 = new com.google.android.gms.measurement.internal.o7
            long r9 = r3.longValue()
            r11.<init>(r0, r2, r9)
            goto L_0x0296
        L_0x0294:
            r11 = r19
        L_0x0296:
            if (r11 != 0) goto L_0x029a
            r0 = r1
            goto L_0x029b
        L_0x029a:
            r0 = r11
        L_0x029b:
            com.google.android.gms.measurement.internal.b r1 = r27.mo7827m()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2457t.f6900U
            boolean r1 = r1.mo7108a(r2)
            java.lang.String r14 = "_ae"
            r9 = 0
            if (r1 == 0) goto L_0x02d6
            r27.mo7094f()
            com.google.android.gms.measurement.internal.n7 r1 = r27.mo7280s()
            com.google.android.gms.measurement.internal.o7 r1 = r1.mo7521a(r4)
            if (r1 == 0) goto L_0x02d6
            r13 = r29
            boolean r1 = r14.equals(r13)
            if (r1 == 0) goto L_0x02d8
            com.google.android.gms.measurement.internal.y8 r1 = r27.mo7282u()
            com.google.android.gms.measurement.internal.e9 r1 = r1.f7108e
            long r1 = r1.mo7269b()
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d8
            com.google.android.gms.measurement.internal.v9 r3 = r27.mo7825k()
            r3.mo7689a(r15, r1)
            goto L_0x02d8
        L_0x02d6:
            r13 = r29
        L_0x02d8:
            boolean r1 = p147g.p156d.p157a.p167b.p173d.p180g.C4098l9.m16775b()
            if (r1 == 0) goto L_0x035a
            com.google.android.gms.measurement.internal.b r1 = r27.mo7827m()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2457t.f6951w0
            boolean r1 = r1.mo7108a(r2)
            if (r1 == 0) goto L_0x035a
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x033d
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x033d
            com.google.android.gms.measurement.internal.v9 r1 = r27.mo7825k()
            java.lang.String r2 = r15.getString(r2)
            boolean r3 = com.google.android.gms.common.util.C2199n.m9012a(r2)
            if (r3 == 0) goto L_0x030d
            r11 = r19
            goto L_0x0311
        L_0x030d:
            java.lang.String r11 = r2.trim()
        L_0x0311:
            com.google.android.gms.measurement.internal.l4 r2 = r1.mo7826l()
            com.google.android.gms.measurement.internal.r4 r2 = r2.f6616A
            java.lang.String r2 = r2.mo7589a()
            boolean r2 = com.google.android.gms.measurement.internal.C2489v9.m10027c(r11, r2)
            if (r2 == 0) goto L_0x0330
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo7098j()
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7809A()
            java.lang.String r2 = "Not logging duplicate session_start_with_rollout event"
            r1.mo7088a(r2)
            r1 = 0
            goto L_0x033a
        L_0x0330:
            com.google.android.gms.measurement.internal.l4 r1 = r1.mo7826l()
            com.google.android.gms.measurement.internal.r4 r1 = r1.f6616A
            r1.mo7590a(r11)
            r1 = 1
        L_0x033a:
            if (r1 != 0) goto L_0x035a
            return
        L_0x033d:
            boolean r1 = r14.equals(r13)
            if (r1 == 0) goto L_0x035a
            com.google.android.gms.measurement.internal.v9 r1 = r27.mo7825k()
            com.google.android.gms.measurement.internal.l4 r1 = r1.mo7826l()
            com.google.android.gms.measurement.internal.r4 r1 = r1.f6616A
            java.lang.String r1 = r1.mo7589a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x035a
            r15.putString(r2, r1)
        L_0x035a:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r12.add(r15)
            com.google.android.gms.measurement.internal.v9 r1 = r27.mo7825k()
            java.security.SecureRandom r1 = r1.mo7712u()
            long r2 = r1.nextLong()
            com.google.android.gms.measurement.internal.l4 r1 = r27.mo7826l()
            com.google.android.gms.measurement.internal.p4 r1 = r1.f6639v
            long r19 = r1.mo7570a()
            int r1 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x03e1
            com.google.android.gms.measurement.internal.l4 r1 = r27.mo7826l()
            r9 = r30
            boolean r1 = r1.mo7471a(r9)
            if (r1 == 0) goto L_0x03e3
            com.google.android.gms.measurement.internal.l4 r1 = r27.mo7826l()
            com.google.android.gms.measurement.internal.n4 r1 = r1.f6641x
            boolean r1 = r1.mo7517a()
            if (r1 == 0) goto L_0x03e3
            com.google.android.gms.measurement.internal.y3 r1 = r27.mo7098j()
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7810B()
            java.lang.String r6 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo7088a(r6)
            r6 = 0
            com.google.android.gms.common.util.e r1 = r27.mo7095g()
            long r19 = r1.mo6988b()
            java.lang.String r11 = "auto"
            java.lang.String r21 = "_sid"
            r1 = r27
            r22 = r2
            r2 = r11
            r3 = r21
            r11 = 0
            r4 = r6
            r8 = r5
            r5 = r19
            r1.mo7434a(r2, r3, r4, r5)
            r4 = 0
            com.google.android.gms.common.util.e r1 = r27.mo7095g()
            long r5 = r1.mo6988b()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r27
            r1.mo7434a(r2, r3, r4, r5)
            com.google.android.gms.common.util.e r1 = r27.mo7095g()
            long r5 = r1.mo6988b()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r27
            r1.mo7434a(r2, r3, r4, r5)
            goto L_0x03e7
        L_0x03e1:
            r9 = r30
        L_0x03e3:
            r22 = r2
            r8 = r5
            r11 = 0
        L_0x03e7:
            java.lang.String r1 = "extend_session"
            r2 = 0
            long r1 = r15.getLong(r1, r2)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x040f
            com.google.android.gms.measurement.internal.y3 r1 = r27.mo7098j()
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7810B()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo7088a(r2)
            com.google.android.gms.measurement.internal.c5 r1 = r7.f7100a
            com.google.android.gms.measurement.internal.y8 r1 = r1.mo7214r()
            com.google.android.gms.measurement.internal.h9 r1 = r1.f7107d
            r5 = 1
            r1.mo7372a(r9, r5)
            goto L_0x0410
        L_0x040f:
            r5 = 1
        L_0x0410:
            java.util.Set r1 = r15.keySet()
            int r2 = r15.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.Arrays.sort(r1)
            boolean r2 = p147g.p156d.p157a.p167b.p173d.p180g.C3988e9.m16328b()
            if (r2 == 0) goto L_0x0462
            com.google.android.gms.measurement.internal.b r2 = r27.mo7827m()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C2457t.f6879I0
            boolean r2 = r2.mo7108a(r3)
            if (r2 == 0) goto L_0x0462
            com.google.android.gms.measurement.internal.b r2 = r27.mo7827m()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C2457t.f6877H0
            boolean r2 = r2.mo7108a(r3)
            if (r2 == 0) goto L_0x0462
            int r0 = r1.length
            r2 = 0
        L_0x0443:
            if (r2 >= r0) goto L_0x045a
            r3 = r1[r2]
            r27.mo7825k()
            java.lang.Object r4 = r15.get(r3)
            android.os.Bundle[] r4 = com.google.android.gms.measurement.internal.C2489v9.m10025b(r4)
            if (r4 == 0) goto L_0x0457
            r15.putParcelableArray(r3, r4)
        L_0x0457:
            int r2 = r2 + 1
            goto L_0x0443
        L_0x045a:
            r33 = r8
            r2 = r13
            r0 = r14
            r20 = 1
            goto L_0x0524
        L_0x0462:
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0465:
            java.lang.String r6 = "_eid"
            if (r3 >= r2) goto L_0x0511
            r5 = r1[r3]
            java.lang.Object r19 = r15.get(r5)
            r27.mo7825k()
            r32 = r1
            android.os.Bundle[] r1 = com.google.android.gms.measurement.internal.C2489v9.m10025b(r19)
            if (r1 == 0) goto L_0x04ef
            int r11 = r1.length
            r15.putInt(r5, r11)
            r19 = r2
            r11 = 0
        L_0x0481:
            int r2 = r1.length
            if (r11 >= r2) goto L_0x04e1
            r2 = r1[r11]
            r20 = r15
            r15 = 1
            com.google.android.gms.measurement.internal.C2397n7.m9636a(r0, r2, r15)
            com.google.android.gms.measurement.internal.v9 r18 = r27.mo7825k()
            r21 = 0
            java.lang.String r24 = "_ep"
            r9 = r18
            r10 = r36
            r25 = r11
            r11 = r24
            r26 = r12
            r12 = r2
            r2 = r13
            r13 = r17
            r18 = r0
            r0 = r14
            r14 = r35
            r33 = r8
            r8 = r20
            r20 = 1
            r15 = r21
            android.os.Bundle r9 = r9.mo7684a(r10, r11, r12, r13, r14, r15)
            java.lang.String r10 = "_en"
            r9.putString(r10, r2)
            r10 = r22
            r9.putLong(r6, r10)
            java.lang.String r12 = "_gn"
            r9.putString(r12, r5)
            int r12 = r1.length
            java.lang.String r13 = "_ll"
            r9.putInt(r13, r12)
            java.lang.String r12 = "_i"
            r13 = r25
            r9.putInt(r12, r13)
            r12 = r26
            r12.add(r9)
            int r9 = r13 + 1
            r14 = r0
            r13 = r2
            r15 = r8
            r0 = r18
            r8 = r33
            r11 = r9
            r9 = r30
            goto L_0x0481
        L_0x04e1:
            r18 = r0
            r33 = r8
            r2 = r13
            r0 = r14
            r8 = r15
            r10 = r22
            r20 = 1
            int r1 = r1.length
            int r4 = r4 + r1
            goto L_0x04fc
        L_0x04ef:
            r18 = r0
            r19 = r2
            r33 = r8
            r2 = r13
            r0 = r14
            r8 = r15
            r10 = r22
            r20 = 1
        L_0x04fc:
            int r3 = r3 + 1
            r1 = r32
            r14 = r0
            r13 = r2
            r15 = r8
            r22 = r10
            r0 = r18
            r2 = r19
            r5 = 1
            r11 = 0
            r9 = r30
            r8 = r33
            goto L_0x0465
        L_0x0511:
            r33 = r8
            r2 = r13
            r0 = r14
            r8 = r15
            r10 = r22
            r20 = 1
            if (r4 == 0) goto L_0x0524
            r8.putLong(r6, r10)
            java.lang.String r1 = "_epc"
            r8.putInt(r1, r4)
        L_0x0524:
            r10 = 0
        L_0x0525:
            int r1 = r12.size()
            if (r10 >= r1) goto L_0x059b
            java.lang.Object r1 = r12.get(r10)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r10 == 0) goto L_0x0535
            r3 = 1
            goto L_0x0536
        L_0x0535:
            r3 = 0
        L_0x0536:
            if (r3 == 0) goto L_0x053f
            java.lang.String r3 = "_ep"
            r8 = r28
            r9 = r33
            goto L_0x0544
        L_0x053f:
            r8 = r28
            r9 = r33
            r3 = r2
        L_0x0544:
            r1.putString(r9, r8)
            if (r34 == 0) goto L_0x0551
            com.google.android.gms.measurement.internal.v9 r4 = r27.mo7825k()
            android.os.Bundle r1 = r4.mo7683a(r1)
        L_0x0551:
            r11 = r1
            com.google.android.gms.measurement.internal.r r13 = new com.google.android.gms.measurement.internal.r
            com.google.android.gms.measurement.internal.m r4 = new com.google.android.gms.measurement.internal.m
            r4.<init>(r11)
            r1 = r13
            r14 = r2
            r2 = r3
            r3 = r4
            r4 = r28
            r15 = 1
            r5 = r30
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.t7 r1 = r27.mo7279r()
            r5 = r36
            r1.mo7640a(r13, r5)
            if (r16 != 0) goto L_0x0593
            java.util.Set<com.google.android.gms.measurement.internal.h6> r1 = r7.f6552e
            java.util.Iterator r13 = r1.iterator()
        L_0x0576:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0593
            java.lang.Object r1 = r13.next()
            com.google.android.gms.measurement.internal.h6 r1 = (com.google.android.gms.measurement.internal.C2324h6) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r11)
            r2 = r28
            r3 = r29
            r5 = r30
            r1.onEvent(r2, r3, r4, r5)
            r5 = r36
            goto L_0x0576
        L_0x0593:
            int r10 = r10 + 1
            r33 = r9
            r2 = r14
            r20 = 1
            goto L_0x0525
        L_0x059b:
            r14 = r2
            r15 = 1
            r27.mo7094f()
            com.google.android.gms.measurement.internal.n7 r1 = r27.mo7280s()
            r2 = 0
            com.google.android.gms.measurement.internal.o7 r1 = r1.mo7521a(r2)
            if (r1 == 0) goto L_0x05c0
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x05c0
            com.google.android.gms.measurement.internal.y8 r0 = r27.mo7282u()
            com.google.android.gms.common.util.e r1 = r27.mo7095g()
            long r1 = r1.mo6989c()
            r0.mo7830a(r15, r15, r1)
        L_0x05c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2348j6.mo7430a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo7431a(String str, String str2, Bundle bundle) {
        mo7433a(str, str2, bundle, true, true, mo7095g().mo6988b());
    }

    /* renamed from: a */
    public final void mo7432a(String str, String str2, Bundle bundle, boolean z) {
        mo7433a(str, str2, bundle, false, true, mo7095g().mo6988b());
    }

    /* renamed from: a */
    public final void mo7433a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        mo7273a();
        m9503b(str == null ? "app" : str, str2, j, bundle == null ? new Bundle() : bundle, z2, !z2 || this.f6551d == null || C2489v9.m10029f(str2), !z, null);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r10v12, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=null, for r11v0, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2
      assigns: []
      uses: []
      mth insns count: 59
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7434a(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C2148s.m8844b(r9)
            com.google.android.gms.common.internal.C2148s.m8844b(r10)
            r8.mo7274c()
            r8.mo7273a()
            r8.mo7245x()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0063
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0053
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0053
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x0038
            r4 = r2
            goto L_0x003a
        L_0x0038:
            r4 = 0
        L_0x003a:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.l4 r0 = r8.mo7826l()
            com.google.android.gms.measurement.internal.r4 r0 = r0.f6636s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004e
            java.lang.String r11 = "true"
        L_0x004e:
            r0.mo7590a(r11)
            r6 = r10
            goto L_0x0061
        L_0x0053:
            if (r11 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.l4 r10 = r8.mo7826l()
            com.google.android.gms.measurement.internal.r4 r10 = r10.f6636s
            java.lang.String r0 = "unset"
            r10.mo7590a(r0)
            r6 = r11
        L_0x0061:
            r3 = r1
            goto L_0x0065
        L_0x0063:
            r3 = r10
            r6 = r11
        L_0x0065:
            com.google.android.gms.measurement.internal.c5 r10 = r8.f7100a
            boolean r10 = r10.mo7204c()
            if (r10 != 0) goto L_0x007b
            com.google.android.gms.measurement.internal.y3 r9 = r8.mo7098j()
            com.google.android.gms.measurement.internal.a4 r9 = r9.mo7810B()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo7088a(r10)
            return
        L_0x007b:
            com.google.android.gms.measurement.internal.c5 r10 = r8.f7100a
            boolean r10 = r10.mo7209m()
            if (r10 != 0) goto L_0x0084
            return
        L_0x0084:
            com.google.android.gms.measurement.internal.u9 r10 = new com.google.android.gms.measurement.internal.u9
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.t7 r9 = r8.mo7279r()
            r9.mo7641a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2348j6.mo7434a(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: a */
    public final void mo7435a(String str, String str2, Object obj, boolean z) {
        mo7436a(str, str2, obj, z, mo7095g().mo6988b());
    }

    /* renamed from: a */
    public final void mo7436a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = mo7825k().mo7705b(str2);
        } else {
            C2489v9 k = mo7825k();
            String str4 = "user property";
            if (k.mo7701a(str4, str2)) {
                if (!k.mo7704a(str4, C2288e6.f6377a, str2)) {
                    i = 15;
                } else if (k.mo7700a(str4, 24, str2)) {
                    i = 0;
                }
            }
        }
        String str5 = "_ev";
        if (i != 0) {
            mo7825k();
            String a = C2489v9.m10008a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f7100a.mo7218v().mo7688a(i, str5, a, i2);
        } else if (obj != null) {
            int b = mo7825k().mo7706b(str2, obj);
            if (b != 0) {
                mo7825k();
                String a2 = C2489v9.m10008a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f7100a.mo7218v().mo7688a(b, str5, a2, i2);
                return;
            }
            Object c = mo7825k().mo7708c(str2, obj);
            if (c != null) {
                m9498a(str3, str2, j, c);
            }
        } else {
            m9498a(str3, str2, j, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo7437a(String str, String str2, String str3, Bundle bundle) {
        C2148s.m8844b(str);
        mo7275n();
        throw null;
    }

    /* renamed from: a */
    public final void mo7438a(boolean z) {
        mo7245x();
        mo7273a();
        mo7097i().mo7841a((Runnable) new C2519y6(this, z));
    }

    /* renamed from: b */
    public final void mo7439b(long j) {
        mo7273a();
        mo7097i().mo7841a((Runnable) new C2396n6(this, j));
    }

    /* renamed from: b */
    public final void mo7440b(Bundle bundle) {
        C2148s.m8834a(bundle);
        C2148s.m8844b(bundle.getString("app_id"));
        mo7275n();
        throw null;
    }

    /* renamed from: b */
    public final void mo7441b(C2324h6 h6Var) {
        mo7273a();
        mo7245x();
        C2148s.m8834a(h6Var);
        if (!this.f6552e.remove(h6Var)) {
            mo7098j().mo7818w().mo7088a("OnEventListener had not been registered");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7442b(String str, String str2, Bundle bundle) {
        mo7273a();
        mo7274c();
        mo7429a(str, str2, mo7095g().mo6988b(), bundle);
    }

    /* renamed from: b */
    public final void mo7443b(boolean z) {
        mo7245x();
        mo7273a();
        mo7097i().mo7841a((Runnable) new C2253b7(this, z));
    }

    /* renamed from: c */
    public final void mo7444c(long j) {
        mo7428a((String) null);
        mo7097i().mo7841a((Runnable) new C2420p6(this, j));
    }

    /* renamed from: c */
    public final void mo7445c(String str, String str2, Bundle bundle) {
        mo7273a();
        m9504b((String) null, str, str2, bundle);
    }
}
