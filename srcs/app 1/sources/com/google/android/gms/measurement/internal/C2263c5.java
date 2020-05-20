package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.internal.C2030g;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.p051p.C2175c;
import com.google.android.gms.common.util.C2190e;
import com.google.android.gms.common.util.C2193h;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p147g.p156d.p157a.p167b.p173d.p180g.C3923b;
import p147g.p156d.p157a.p167b.p173d.p180g.C3927b2;
import p147g.p156d.p157a.p167b.p173d.p180g.C4098l9;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
public class C2263c5 implements C2240a6 {

    /* renamed from: G */
    private static volatile C2263c5 f6310G;

    /* renamed from: A */
    private volatile Boolean f6311A;

    /* renamed from: B */
    private Boolean f6312B;

    /* renamed from: C */
    private Boolean f6313C;

    /* renamed from: D */
    private int f6314D;

    /* renamed from: E */
    private AtomicInteger f6315E = new AtomicInteger(0);

    /* renamed from: F */
    final long f6316F;

    /* renamed from: a */
    private final Context f6317a;

    /* renamed from: b */
    private final String f6318b;

    /* renamed from: c */
    private final String f6319c;

    /* renamed from: d */
    private final String f6320d;

    /* renamed from: e */
    private final boolean f6321e;

    /* renamed from: f */
    private final C2352ja f6322f;

    /* renamed from: g */
    private final C2245b f6323g;

    /* renamed from: h */
    private final C2370l4 f6324h;

    /* renamed from: i */
    private final C2516y3 f6325i;

    /* renamed from: j */
    private final C2528z4 f6326j;

    /* renamed from: k */
    private final C2521y8 f6327k;

    /* renamed from: l */
    private final C2489v9 f6328l;

    /* renamed from: m */
    private final C2494w3 f6329m;

    /* renamed from: n */
    private final C2190e f6330n;

    /* renamed from: o */
    private final C2397n7 f6331o;

    /* renamed from: p */
    private final C2348j6 f6332p;

    /* renamed from: q */
    private final C2246b0 f6333q;

    /* renamed from: r */
    private final C2337i7 f6334r;

    /* renamed from: s */
    private C2472u3 f6335s;

    /* renamed from: t */
    private C2465t7 f6336t;

    /* renamed from: u */
    private C2365l f6337u;

    /* renamed from: v */
    private C2483v3 f6338v;

    /* renamed from: w */
    private C2473u4 f6339w;

    /* renamed from: x */
    private boolean f6340x = false;

    /* renamed from: y */
    private Boolean f6341y;

    /* renamed from: z */
    private long f6342z;

    private C2263c5(C2300f6 f6Var) {
        String str;
        C2238a4 a4Var;
        boolean z = false;
        C2148s.m8834a(f6Var);
        C2352ja jaVar = new C2352ja(f6Var.f6436a);
        this.f6322f = jaVar;
        C2406o3.f6758a = jaVar;
        this.f6317a = f6Var.f6436a;
        this.f6318b = f6Var.f6437b;
        this.f6319c = f6Var.f6438c;
        this.f6320d = f6Var.f6439d;
        this.f6321e = f6Var.f6443h;
        this.f6311A = f6Var.f6440e;
        C3923b bVar = f6Var.f6442g;
        if (bVar != null) {
            Bundle bundle = bVar.f10823l;
            if (bundle != null) {
                Object obj = bundle.get("measurementEnabled");
                if (obj instanceof Boolean) {
                    this.f6312B = (Boolean) obj;
                }
                Object obj2 = bVar.f10823l.get("measurementDeactivated");
                if (obj2 instanceof Boolean) {
                    this.f6313C = (Boolean) obj2;
                }
            }
        }
        C3927b2.m15755a(this.f6317a);
        C2190e d = C2193h.m8985d();
        this.f6330n = d;
        Long l = f6Var.f6444i;
        this.f6316F = l != null ? l.longValue() : d.mo6988b();
        this.f6323g = new C2245b(this);
        C2370l4 l4Var = new C2370l4(this);
        l4Var.mo7743p();
        this.f6324h = l4Var;
        C2516y3 y3Var = new C2516y3(this);
        y3Var.mo7743p();
        this.f6325i = y3Var;
        C2489v9 v9Var = new C2489v9(this);
        v9Var.mo7743p();
        this.f6328l = v9Var;
        C2494w3 w3Var = new C2494w3(this);
        w3Var.mo7743p();
        this.f6329m = w3Var;
        this.f6333q = new C2246b0(this);
        C2397n7 n7Var = new C2397n7(this);
        n7Var.mo7246y();
        this.f6331o = n7Var;
        C2348j6 j6Var = new C2348j6(this);
        j6Var.mo7246y();
        this.f6332p = j6Var;
        C2521y8 y8Var = new C2521y8(this);
        y8Var.mo7246y();
        this.f6327k = y8Var;
        C2337i7 i7Var = new C2337i7(this);
        i7Var.mo7743p();
        this.f6334r = i7Var;
        C2528z4 z4Var = new C2528z4(this);
        z4Var.mo7743p();
        this.f6326j = z4Var;
        C3923b bVar2 = f6Var.f6442g;
        if (!(bVar2 == null || bVar2.f10818g == 0)) {
            z = true;
        }
        boolean z2 = !z;
        if (this.f6317a.getApplicationContext() instanceof Application) {
            C2348j6 u = mo7217u();
            if (u.mo7096h().getApplicationContext() instanceof Application) {
                Application application = (Application) u.mo7096h().getApplicationContext();
                if (u.f6550c == null) {
                    u.f6550c = new C2265c7(u, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(u.f6550c);
                    application.registerActivityLifecycleCallbacks(u.f6550c);
                    a4Var = u.mo7098j().mo7810B();
                    str = "Registered activity lifecycle callback";
                }
            }
            this.f6326j.mo7841a((Runnable) new C2287e5(this, f6Var));
        }
        a4Var = mo7098j().mo7818w();
        str = "Application context is not an Application";
        a4Var.mo7088a(str);
        this.f6326j.mo7841a((Runnable) new C2287e5(this, f6Var));
    }

    /* renamed from: I */
    private final C2337i7 m9227I() {
        m9234b((C2507x5) this.f6334r);
        return this.f6334r;
    }

    /* renamed from: a */
    public static C2263c5 m9228a(Context context, C3923b bVar, Long l) {
        if (bVar != null && (bVar.f10821j == null || bVar.f10822k == null)) {
            C3923b bVar2 = new C3923b(bVar.f10817f, bVar.f10818g, bVar.f10819h, bVar.f10820i, null, null, bVar.f10823l);
            bVar = bVar2;
        }
        C2148s.m8834a(context);
        C2148s.m8834a(context.getApplicationContext());
        if (f6310G == null) {
            synchronized (C2263c5.class) {
                if (f6310G == null) {
                    f6310G = new C2263c5(new C2300f6(context, bVar, l));
                }
            }
        } else if (bVar != null) {
            Bundle bundle = bVar.f10823l;
            if (bundle != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
                f6310G.mo7202a(bVar.f10823l.getBoolean("dataCollectionDefaultEnabled"));
            }
        }
        return f6310G;
    }

    /* renamed from: a */
    public static C2263c5 m9229a(Context context, String str, String str2, Bundle bundle) {
        C3923b bVar = new C3923b(0, 0, true, null, null, null, bundle);
        return m9228a(context, bVar, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9231a(C2300f6 f6Var) {
        C2238a4 a4Var;
        String str;
        mo7097i().mo7274c();
        C2365l lVar = new C2365l(this);
        lVar.mo7743p();
        this.f6337u = lVar;
        C2483v3 v3Var = new C2483v3(this, f6Var.f6441f);
        v3Var.mo7246y();
        this.f6338v = v3Var;
        C2472u3 u3Var = new C2472u3(this);
        u3Var.mo7246y();
        this.f6335s = u3Var;
        C2465t7 t7Var = new C2465t7(this);
        t7Var.mo7246y();
        this.f6336t = t7Var;
        this.f6328l.mo7744q();
        this.f6324h.mo7744q();
        this.f6339w = new C2473u4(this);
        this.f6338v.mo7247z();
        mo7098j().mo7821z().mo7089a("App measurement initialized, version", Long.valueOf(this.f6323g.mo7122o()));
        mo7098j().mo7821z().mo7088a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String B = v3Var.mo7667B();
        if (TextUtils.isEmpty(this.f6318b)) {
            if (mo7218v().mo7710d(B)) {
                a4Var = mo7098j().mo7821z();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                C2238a4 z = mo7098j().mo7821z();
                String str2 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
                String valueOf = String.valueOf(B);
                C2238a4 a4Var2 = z;
                str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                a4Var = a4Var2;
            }
            a4Var.mo7088a(str);
        }
        mo7098j().mo7809A().mo7088a("Debug-level message logging enabled");
        if (this.f6314D != this.f6315E.get()) {
            mo7098j().mo7815t().mo7090a("Not all components initialized", Integer.valueOf(this.f6314D), Integer.valueOf(this.f6315E.get()));
        }
        this.f6340x = true;
    }

    /* renamed from: a */
    private static void m9232a(C2518y5 y5Var) {
        if (y5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: b */
    private static void m9233b(C2285e3 e3Var) {
        if (e3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!e3Var.mo7244w()) {
            String valueOf = String.valueOf(e3Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private static void m9234b(C2507x5 x5Var) {
        if (x5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!x5Var.mo7745s()) {
            String valueOf = String.valueOf(x5Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: A */
    public final String mo7190A() {
        return this.f6319c;
    }

    /* renamed from: B */
    public final String mo7191B() {
        return this.f6320d;
    }

    /* renamed from: C */
    public final boolean mo7192C() {
        return this.f6321e;
    }

    /* renamed from: D */
    public final C2397n7 mo7193D() {
        m9233b((C2285e3) this.f6331o);
        return this.f6331o;
    }

    /* renamed from: E */
    public final C2465t7 mo7194E() {
        m9233b((C2285e3) this.f6336t);
        return this.f6336t;
    }

    /* renamed from: F */
    public final C2365l mo7195F() {
        m9234b((C2507x5) this.f6337u);
        return this.f6337u;
    }

    /* renamed from: G */
    public final C2483v3 mo7196G() {
        m9233b((C2285e3) this.f6338v);
        return this.f6338v;
    }

    /* renamed from: H */
    public final C2246b0 mo7197H() {
        C2246b0 b0Var = this.f6333q;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("Component not created");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7198a() {
        mo7097i().mo7274c();
        if (mo7212p().f6622e.mo7570a() == 0) {
            mo7212p().f6622e.mo7571a(this.f6330n.mo6988b());
        }
        if (Long.valueOf(mo7212p().f6627j.mo7570a()).longValue() == 0) {
            mo7098j().mo7810B().mo7089a("Persisting first open", Long.valueOf(this.f6316F));
            mo7212p().f6627j.mo7571a(this.f6316F);
        }
        if (this.f6323g.mo7108a(C2457t.f6895Q0)) {
            mo7217u().f6555h.mo7140b();
        }
        if (mo7209m()) {
            if (!TextUtils.isEmpty(mo7196G().mo7668C()) || !TextUtils.isEmpty(mo7196G().mo7669D())) {
                mo7218v();
                if (C2489v9.m10016a(mo7196G().mo7668C(), mo7212p().mo7479u(), mo7196G().mo7669D(), mo7212p().mo7480v())) {
                    mo7098j().mo7821z().mo7088a("Rechecking which service to use due to a GMP App Id change");
                    mo7212p().mo7482x();
                    mo7220x().mo7652B();
                    this.f6336t.mo7634H();
                    this.f6336t.mo7632F();
                    mo7212p().f6627j.mo7571a(this.f6316F);
                    mo7212p().f6629l.mo7590a(null);
                }
                mo7212p().mo7474c(mo7196G().mo7668C());
                mo7212p().mo7476d(mo7196G().mo7669D());
            }
            mo7217u().mo7428a(mo7212p().f6629l.mo7589a());
            if (C4098l9.m16775b() && this.f6323g.mo7108a(C2457t.f6951w0) && !mo7218v().mo7715x() && !TextUtils.isEmpty(mo7212p().f6616A.mo7589a())) {
                mo7098j().mo7818w().mo7088a("Remote config removed with active feature rollouts");
                mo7212p().f6616A.mo7590a(null);
            }
            if (!TextUtils.isEmpty(mo7196G().mo7668C()) || !TextUtils.isEmpty(mo7196G().mo7669D())) {
                boolean c = mo7204c();
                if (!mo7212p().mo7468A() && !this.f6323g.mo7124q()) {
                    mo7212p().mo7475c(!c);
                }
                if (c) {
                    mo7217u().mo7415I();
                }
                mo7214r().f7107d.mo7371a();
                mo7194E().mo7646a(new AtomicReference<>());
            }
        } else if (mo7204c()) {
            if (!mo7218v().mo7709c("android.permission.INTERNET")) {
                mo7098j().mo7815t().mo7088a("App is missing INTERNET permission");
            }
            if (!mo7218v().mo7709c("android.permission.ACCESS_NETWORK_STATE")) {
                mo7098j().mo7815t().mo7088a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C2175c.m8939a(this.f6317a).mo6961a() && !this.f6323g.mo7129v()) {
                if (!C2484v4.m9997a(this.f6317a)) {
                    mo7098j().mo7815t().mo7088a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C2489v9.m10011a(this.f6317a, false)) {
                    mo7098j().mo7815t().mo7088a("AppMeasurementService not registered/enabled");
                }
            }
            mo7098j().mo7815t().mo7088a("Uploading is not possible. App measurement disabled");
        }
        mo7212p().f6637t.mo7516a(this.f6323g.mo7108a(C2457t.f6907a0));
        mo7212p().f6638u.mo7516a(this.f6323g.mo7108a(C2457t.f6909b0));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7199a(C2285e3 e3Var) {
        this.f6314D++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7200a(C2507x5 x5Var) {
        this.f6314D++;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5 A[Catch:{ JSONException -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3 A[Catch:{ JSONException -> 0x00ea }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo7201a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            r6 = this;
            java.lang.String r7 = "gclid"
            java.lang.String r11 = ""
            r0 = 1
            r1 = 0
            r2 = 200(0xc8, float:2.8E-43)
            if (r8 == r2) goto L_0x0012
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x0012
            r2 = 304(0x130, float:4.26E-43)
            if (r8 != r2) goto L_0x0016
        L_0x0012:
            if (r9 != 0) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            if (r2 != 0) goto L_0x002b
            com.google.android.gms.measurement.internal.y3 r7 = r6.mo7098j()
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7818w()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r10 = "Network Request for Deferred Deep Link failed. response, exception"
            r7.mo7090a(r10, r8, r9)
            return
        L_0x002b:
            com.google.android.gms.measurement.internal.l4 r8 = r6.mo7212p()
            com.google.android.gms.measurement.internal.n4 r8 = r8.f6642y
            r8.mo7516a(r0)
            int r8 = r10.length
            if (r8 != 0) goto L_0x0045
            com.google.android.gms.measurement.internal.y3 r7 = r6.mo7098j()
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7809A()
            java.lang.String r8 = "Deferred Deep Link response empty."
            r7.mo7088a(r8)
            return
        L_0x0045:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r10)
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ea }
            r9.<init>(r8)     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r8 = "deeplink"
            java.lang.String r8 = r9.optString(r8, r11)     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r10 = r9.optString(r7, r11)     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r11 = "timestamp"
            r2 = 0
            double r2 = r9.optDouble(r11, r2)     // Catch:{ JSONException -> 0x00ea }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x00ea }
            if (r9 == 0) goto L_0x0075
            com.google.android.gms.measurement.internal.y3 r7 = r6.mo7098j()     // Catch:{ JSONException -> 0x00ea }
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7809A()     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r8 = "Deferred Deep Link is empty."
            r7.mo7088a(r8)     // Catch:{ JSONException -> 0x00ea }
            return
        L_0x0075:
            com.google.android.gms.measurement.internal.v9 r9 = r6.mo7218v()     // Catch:{ JSONException -> 0x00ea }
            r9.mo7273a()     // Catch:{ JSONException -> 0x00ea }
            boolean r11 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x00ea }
            if (r11 != 0) goto L_0x00a2
            android.content.Context r9 = r9.mo7096h()     // Catch:{ JSONException -> 0x00ea }
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ JSONException -> 0x00ea }
            android.content.Intent r11 = new android.content.Intent     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r4 = "android.intent.action.VIEW"
            android.net.Uri r5 = android.net.Uri.parse(r8)     // Catch:{ JSONException -> 0x00ea }
            r11.<init>(r4, r5)     // Catch:{ JSONException -> 0x00ea }
            java.util.List r9 = r9.queryIntentActivities(r11, r1)     // Catch:{ JSONException -> 0x00ea }
            if (r9 == 0) goto L_0x00a2
            boolean r9 = r9.isEmpty()     // Catch:{ JSONException -> 0x00ea }
            if (r9 != 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            if (r0 != 0) goto L_0x00b3
            com.google.android.gms.measurement.internal.y3 r7 = r6.mo7098j()     // Catch:{ JSONException -> 0x00ea }
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7818w()     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r9 = "Deferred Deep Link validation failed. gclid, deep link"
            r7.mo7090a(r9, r10, r8)     // Catch:{ JSONException -> 0x00ea }
            return
        L_0x00b3:
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ JSONException -> 0x00ea }
            r9.<init>()     // Catch:{ JSONException -> 0x00ea }
            r9.putString(r7, r10)     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r7 = "_cis"
            java.lang.String r10 = "ddp"
            r9.putString(r7, r10)     // Catch:{ JSONException -> 0x00ea }
            com.google.android.gms.measurement.internal.j6 r7 = r6.f6332p     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r10 = "auto"
            java.lang.String r11 = "_cmp"
            r7.mo7431a(r10, r11, r9)     // Catch:{ JSONException -> 0x00ea }
            com.google.android.gms.measurement.internal.v9 r7 = r6.mo7218v()     // Catch:{ JSONException -> 0x00ea }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x00ea }
            if (r9 != 0) goto L_0x00e9
            boolean r8 = r7.mo7699a(r8, r2)     // Catch:{ JSONException -> 0x00ea }
            if (r8 == 0) goto L_0x00e9
            android.content.Intent r8 = new android.content.Intent     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r9 = "android.google.analytics.action.DEEPLINK_ACTION"
            r8.<init>(r9)     // Catch:{ JSONException -> 0x00ea }
            android.content.Context r7 = r7.mo7096h()     // Catch:{ JSONException -> 0x00ea }
            r7.sendBroadcast(r8)     // Catch:{ JSONException -> 0x00ea }
        L_0x00e9:
            return
        L_0x00ea:
            r7 = move-exception
            com.google.android.gms.measurement.internal.y3 r8 = r6.mo7098j()
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo7815t()
            java.lang.String r9 = "Failed to parse the Deferred Deep Link response. exception"
            r8.mo7089a(r9, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2263c5.mo7201a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7202a(boolean z) {
        this.f6311A = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public final boolean mo7203b() {
        return this.f6311A != null && this.f6311A.booleanValue();
    }

    /* renamed from: c */
    public final boolean mo7204c() {
        return mo7205d() == 0;
    }

    /* renamed from: d */
    public final int mo7205d() {
        mo7097i().mo7274c();
        if (this.f6323g.mo7124q()) {
            return 1;
        }
        Boolean bool = this.f6313C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean y = mo7212p().mo7483y();
        if (y != null) {
            return y.booleanValue() ? 0 : 3;
        }
        C2245b bVar = this.f6323g;
        bVar.mo7094f();
        Boolean d = bVar.mo7113d("firebase_analytics_collection_enabled");
        if (d != null) {
            return d.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f6312B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        if (C2030g.m8504b()) {
            return 6;
        }
        return (!this.f6323g.mo7108a(C2457t.f6899T) || this.f6311A == null || this.f6311A.booleanValue()) ? 0 : 7;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo7206e() {
    }

    /* renamed from: f */
    public final C2352ja mo7094f() {
        return this.f6322f;
    }

    /* renamed from: g */
    public final C2190e mo7095g() {
        return this.f6330n;
    }

    /* renamed from: h */
    public final Context mo7096h() {
        return this.f6317a;
    }

    /* renamed from: i */
    public final C2528z4 mo7097i() {
        m9234b((C2507x5) this.f6326j);
        return this.f6326j;
    }

    /* renamed from: j */
    public final C2516y3 mo7098j() {
        m9234b((C2507x5) this.f6325i);
        return this.f6325i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo7207k() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo7208l() {
        this.f6315E.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo7209m() {
        if (this.f6340x) {
            mo7097i().mo7274c();
            Boolean bool = this.f6341y;
            if (bool == null || this.f6342z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f6330n.mo6989c() - this.f6342z) > 1000)) {
                this.f6342z = this.f6330n.mo6989c();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(mo7218v().mo7709c("android.permission.INTERNET") && mo7218v().mo7709c("android.permission.ACCESS_NETWORK_STATE") && (C2175c.m8939a(this.f6317a).mo6961a() || this.f6323g.mo7129v() || (C2484v4.m9997a(this.f6317a) && C2489v9.m10011a(this.f6317a, false))));
                this.f6341y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo7218v().mo7703a(mo7196G().mo7668C(), mo7196G().mo7669D(), mo7196G().mo7670E()) && TextUtils.isEmpty(mo7196G().mo7669D())) {
                        z = false;
                    }
                    this.f6341y = Boolean.valueOf(z);
                }
            }
            return this.f6341y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    /* renamed from: n */
    public final void mo7210n() {
        mo7097i().mo7274c();
        m9234b((C2507x5) m9227I());
        String B = mo7196G().mo7667B();
        Pair a = mo7212p().mo7469a(B);
        if (!this.f6323g.mo7125r().booleanValue() || ((Boolean) a.second).booleanValue() || TextUtils.isEmpty((CharSequence) a.first)) {
            mo7098j().mo7809A().mo7088a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!m9227I().mo7398t()) {
            mo7098j().mo7818w().mo7088a("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            C2489v9 v = mo7218v();
            URL a2 = v.mo7687a(mo7196G().mo7827m().mo7122o(), B, (String) a.first, mo7212p().f6643z.mo7570a() - 1);
            C2337i7 I = m9227I();
            C2311g5 g5Var = new C2311g5(this);
            I.mo7274c();
            I.mo7742o();
            C2148s.m8834a(a2);
            C2148s.m8834a(g5Var);
            C2528z4 i = I.mo7097i();
            C2361k7 k7Var = new C2361k7(I, B, a2, null, null, g5Var);
            i.mo7843b((Runnable) k7Var);
        }
    }

    /* renamed from: o */
    public final C2245b mo7211o() {
        return this.f6323g;
    }

    /* renamed from: p */
    public final C2370l4 mo7212p() {
        m9232a((C2518y5) this.f6324h);
        return this.f6324h;
    }

    /* renamed from: q */
    public final C2516y3 mo7213q() {
        C2516y3 y3Var = this.f6325i;
        if (y3Var == null || !y3Var.mo7745s()) {
            return null;
        }
        return this.f6325i;
    }

    /* renamed from: r */
    public final C2521y8 mo7214r() {
        m9233b((C2285e3) this.f6327k);
        return this.f6327k;
    }

    /* renamed from: s */
    public final C2473u4 mo7215s() {
        return this.f6339w;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final C2528z4 mo7216t() {
        return this.f6326j;
    }

    /* renamed from: u */
    public final C2348j6 mo7217u() {
        m9233b((C2285e3) this.f6332p);
        return this.f6332p;
    }

    /* renamed from: v */
    public final C2489v9 mo7218v() {
        m9232a((C2518y5) this.f6328l);
        return this.f6328l;
    }

    /* renamed from: w */
    public final C2494w3 mo7219w() {
        m9232a((C2518y5) this.f6329m);
        return this.f6329m;
    }

    /* renamed from: x */
    public final C2472u3 mo7220x() {
        m9233b((C2285e3) this.f6335s);
        return this.f6335s;
    }

    /* renamed from: y */
    public final boolean mo7221y() {
        return TextUtils.isEmpty(this.f6318b);
    }

    /* renamed from: z */
    public final String mo7222z() {
        return this.f6318b;
    }
}
