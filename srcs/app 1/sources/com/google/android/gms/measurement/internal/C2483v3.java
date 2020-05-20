package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.util.List;
import p147g.p156d.p157a.p167b.p173d.p180g.C4101lc;
import p147g.p156d.p157a.p167b.p173d.p180g.C4157pa;

/* renamed from: com.google.android.gms.measurement.internal.v3 */
public final class C2483v3 extends C2285e3 {

    /* renamed from: c */
    private String f7008c;

    /* renamed from: d */
    private String f7009d;

    /* renamed from: e */
    private int f7010e;

    /* renamed from: f */
    private String f7011f;

    /* renamed from: g */
    private long f7012g;

    /* renamed from: h */
    private long f7013h;

    /* renamed from: i */
    private List<String> f7014i;

    /* renamed from: j */
    private int f7015j;

    /* renamed from: k */
    private String f7016k;

    /* renamed from: l */
    private String f7017l;

    /* renamed from: m */
    private String f7018m;

    C2483v3(C2263c5 c5Var, long j) {
        super(c5Var);
        this.f7013h = j;
    }

    /* renamed from: I */
    private final String m9986I() {
        C2238a4 x;
        String str;
        if (!C4101lc.m16780b() || !mo7827m().mo7108a(C2457t.f6943s0)) {
            try {
                Class loadClass = mo7096h().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{mo7096h()});
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        x = mo7098j().mo7820y();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    x = mo7098j().mo7819x();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } else {
            x = mo7098j().mo7810B();
            str = "Disabled IID for tests.";
            x.mo7088a(str);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo7242A() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final String mo7667B() {
        mo7245x();
        return this.f7008c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public final String mo7668C() {
        mo7245x();
        return this.f7016k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public final String mo7669D() {
        mo7245x();
        return this.f7017l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public final String mo7670E() {
        mo7245x();
        return this.f7018m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final int mo7671F() {
        mo7245x();
        return this.f7010e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public final int mo7672G() {
        mo7245x();
        return this.f7015j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public final List<String> mo7673H() {
        return this.f7014i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C2244aa mo7674a(String str) {
        long j;
        boolean z;
        mo7274c();
        mo7273a();
        String B = mo7667B();
        String C = mo7668C();
        mo7245x();
        String str2 = this.f7009d;
        long F = (long) mo7671F();
        mo7245x();
        String str3 = this.f7011f;
        long o = mo7827m().mo7122o();
        mo7245x();
        mo7274c();
        if (this.f7012g == 0) {
            this.f7012g = this.f7100a.mo7218v().mo7681a(mo7096h(), mo7096h().getPackageName());
        }
        long j2 = this.f7012g;
        boolean c = this.f7100a.mo7204c();
        boolean z2 = !mo7826l().f6640w;
        mo7274c();
        mo7273a();
        String I = !this.f7100a.mo7204c() ? null : m9986I();
        C2263c5 c5Var = this.f7100a;
        Long valueOf = Long.valueOf(c5Var.mo7212p().f6627j.mo7570a());
        int i = (valueOf.longValue() > 0 ? 1 : (valueOf.longValue() == 0 ? 0 : -1));
        long j3 = c5Var.f6316F;
        if (i == 0) {
            j = j3;
            z = c;
        } else {
            z = c;
            j = Math.min(j3, valueOf.longValue());
        }
        int G = mo7672G();
        boolean booleanValue = mo7827m().mo7125r().booleanValue();
        C2245b m = mo7827m();
        m.mo7273a();
        Boolean d = m.mo7113d("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(d == null || d.booleanValue()).booleanValue();
        C2370l4 l = mo7826l();
        l.mo7274c();
        boolean z3 = l.mo7478t().getBoolean("deferred_analytics_collection", false);
        String D = mo7669D();
        Boolean d2 = mo7827m().mo7113d("google_analytics_default_allow_ad_personalization_signals");
        C2244aa aaVar = new C2244aa(B, C, str2, F, str3, o, j2, str, z, z2, I, 0, j, G, booleanValue, booleanValue2, z3, D, d2 == null ? null : Boolean.valueOf(!d2.booleanValue()), this.f7013h, mo7827m().mo7108a(C2457t.f6913d0) ? this.f7014i : null, (!C4157pa.m16931b() || !mo7827m().mo7108a(C2457t.f6937p0)) ? null : mo7670E());
        return aaVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0173 A[Catch:{ IllegalStateException -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0199 A[Catch:{ IllegalStateException -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019b A[Catch:{ IllegalStateException -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a6 A[SYNTHETIC, Splitter:B:76:0x01a6] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e4 A[Catch:{ IllegalStateException -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f4 A[Catch:{ IllegalStateException -> 0x0211 }] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7243v() {
        /*
            r11 = this;
            android.content.Context r0 = r11.mo7096h()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r11.mo7096h()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.y3 r7 = r11.mo7098j()
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7815t()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo7089a(r9, r8)
            goto L_0x008c
        L_0x002d:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            com.google.android.gms.measurement.internal.y3 r7 = r11.mo7098j()
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7815t()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo7089a(r9, r8)
        L_0x0043:
            if (r5 != 0) goto L_0x0048
            java.lang.String r5 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0051
            r5 = r3
        L_0x0051:
            android.content.Context r7 = r11.mo7096h()     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r7 == 0) goto L_0x008c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0071
        L_0x0070:
            r8 = r2
        L_0x0071:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008c
        L_0x0076:
            r7 = r2
            r2 = r8
            goto L_0x007a
        L_0x0079:
            r7 = r2
        L_0x007a:
            com.google.android.gms.measurement.internal.y3 r8 = r11.mo7098j()
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo7815t()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo7090a(r10, r9, r2)
            r2 = r7
        L_0x008c:
            r11.f7008c = r0
            r11.f7011f = r5
            r11.f7009d = r2
            r11.f7010e = r6
            r5 = 0
            r11.f7012g = r5
            r11.mo7094f()
            android.content.Context r2 = r11.mo7096h()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.C2030g.m8501a(r2)
            r5 = 1
            if (r2 == 0) goto L_0x00ae
            boolean r6 = r2.mo6586h()
            if (r6 == 0) goto L_0x00ae
            r6 = 1
            goto L_0x00af
        L_0x00ae:
            r6 = 0
        L_0x00af:
            com.google.android.gms.measurement.internal.c5 r7 = r11.f7100a
            java.lang.String r7 = r7.mo7222z()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00cb
            com.google.android.gms.measurement.internal.c5 r7 = r11.f7100a
            java.lang.String r7 = r7.mo7190A()
            java.lang.String r8 = "am"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00cb
            r7 = 1
            goto L_0x00cc
        L_0x00cb:
            r7 = 0
        L_0x00cc:
            r6 = r6 | r7
            if (r6 != 0) goto L_0x00f8
            if (r2 != 0) goto L_0x00df
            com.google.android.gms.measurement.internal.y3 r2 = r11.mo7098j()
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7816u()
            java.lang.String r8 = "GoogleService failed to initialize (no status)"
            r2.mo7088a(r8)
            goto L_0x00f8
        L_0x00df:
            com.google.android.gms.measurement.internal.y3 r8 = r11.mo7098j()
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo7816u()
            int r9 = r2.mo6582e()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = r2.mo6584f()
            java.lang.String r10 = "GoogleService failed to initialize, status"
            r8.mo7090a(r10, r9, r2)
        L_0x00f8:
            if (r6 == 0) goto L_0x0159
            com.google.android.gms.measurement.internal.c5 r2 = r11.f7100a
            int r2 = r2.mo7205d()
            com.google.android.gms.measurement.internal.y3 r6 = r11.mo7098j()
            switch(r2) {
                case 0: goto L_0x014c;
                case 1: goto L_0x0145;
                case 2: goto L_0x013e;
                case 3: goto L_0x0137;
                case 4: goto L_0x0130;
                case 5: goto L_0x0129;
                case 6: goto L_0x0122;
                case 7: goto L_0x011b;
                default: goto L_0x0107;
            }
        L_0x0107:
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7821z()
            java.lang.String r8 = "App measurement disabled"
            r6.mo7088a(r8)
            com.google.android.gms.measurement.internal.y3 r6 = r11.mo7098j()
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7816u()
            java.lang.String r8 = "Invalid scion state in identity"
            goto L_0x0152
        L_0x011b:
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7821z()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            goto L_0x0152
        L_0x0122:
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7820y()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto L_0x0152
        L_0x0129:
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7810B()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            goto L_0x0152
        L_0x0130:
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7821z()
            java.lang.String r8 = "App measurement disabled via the manifest"
            goto L_0x0152
        L_0x0137:
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7821z()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto L_0x0152
        L_0x013e:
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7810B()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            goto L_0x0152
        L_0x0145:
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7821z()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            goto L_0x0152
        L_0x014c:
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7810B()
            java.lang.String r8 = "App measurement collection enabled"
        L_0x0152:
            r6.mo7088a(r8)
            if (r2 != 0) goto L_0x0159
            r2 = 1
            goto L_0x015a
        L_0x0159:
            r2 = 0
        L_0x015a:
            r11.f7016k = r3
            r11.f7017l = r3
            r11.f7018m = r3
            r11.mo7094f()
            if (r7 == 0) goto L_0x016d
            com.google.android.gms.measurement.internal.c5 r6 = r11.f7100a
            java.lang.String r6 = r6.mo7222z()
            r11.f7017l = r6
        L_0x016d:
            boolean r6 = p147g.p156d.p157a.p167b.p173d.p180g.C4008fc.m16381b()     // Catch:{ IllegalStateException -> 0x0211 }
            if (r6 == 0) goto L_0x018f
            com.google.android.gms.measurement.internal.b r6 = r11.mo7827m()     // Catch:{ IllegalStateException -> 0x0211 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C2457t.f6893P0     // Catch:{ IllegalStateException -> 0x0211 }
            boolean r6 = r6.mo7108a(r7)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r6 == 0) goto L_0x018f
            android.content.Context r6 = r11.mo7096h()     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r7 = "google_app_id"
            com.google.android.gms.common.internal.w r8 = new com.google.android.gms.common.internal.w     // Catch:{ IllegalStateException -> 0x0211 }
            r8.<init>(r6)     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r6 = r8.mo6948a(r7)     // Catch:{ IllegalStateException -> 0x0211 }
            goto L_0x0193
        L_0x018f:
            java.lang.String r6 = com.google.android.gms.common.api.internal.C2030g.m8503a()     // Catch:{ IllegalStateException -> 0x0211 }
        L_0x0193:
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r7 == 0) goto L_0x019b
            r7 = r3
            goto L_0x019c
        L_0x019b:
            r7 = r6
        L_0x019c:
            r11.f7016k = r7     // Catch:{ IllegalStateException -> 0x0211 }
            boolean r7 = p147g.p156d.p157a.p167b.p173d.p180g.C4157pa.m16931b()     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r8 = "admob_app_id"
            if (r7 == 0) goto L_0x01de
            com.google.android.gms.measurement.internal.b r7 = r11.mo7827m()     // Catch:{ IllegalStateException -> 0x0211 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C2457t.f6937p0     // Catch:{ IllegalStateException -> 0x0211 }
            boolean r7 = r7.mo7108a(r9)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r7 == 0) goto L_0x01de
            com.google.android.gms.common.internal.w r7 = new com.google.android.gms.common.internal.w     // Catch:{ IllegalStateException -> 0x0211 }
            android.content.Context r9 = r11.mo7096h()     // Catch:{ IllegalStateException -> 0x0211 }
            r7.<init>(r9)     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r9 = "ga_app_id"
            java.lang.String r9 = r7.mo6948a(r9)     // Catch:{ IllegalStateException -> 0x0211 }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r10 == 0) goto L_0x01c8
            goto L_0x01c9
        L_0x01c8:
            r3 = r9
        L_0x01c9:
            r11.f7018m = r3     // Catch:{ IllegalStateException -> 0x0211 }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r3 == 0) goto L_0x01d7
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r3 != 0) goto L_0x01f2
        L_0x01d7:
            java.lang.String r3 = r7.mo6948a(r8)     // Catch:{ IllegalStateException -> 0x0211 }
        L_0x01db:
            r11.f7017l = r3     // Catch:{ IllegalStateException -> 0x0211 }
            goto L_0x01f2
        L_0x01de:
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r3 != 0) goto L_0x01f2
            com.google.android.gms.common.internal.w r3 = new com.google.android.gms.common.internal.w     // Catch:{ IllegalStateException -> 0x0211 }
            android.content.Context r6 = r11.mo7096h()     // Catch:{ IllegalStateException -> 0x0211 }
            r3.<init>(r6)     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r3 = r3.mo6948a(r8)     // Catch:{ IllegalStateException -> 0x0211 }
            goto L_0x01db
        L_0x01f2:
            if (r2 == 0) goto L_0x0223
            com.google.android.gms.measurement.internal.y3 r2 = r11.mo7098j()     // Catch:{ IllegalStateException -> 0x0211 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7810B()     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r11.f7008c     // Catch:{ IllegalStateException -> 0x0211 }
            java.lang.String r7 = r11.f7016k     // Catch:{ IllegalStateException -> 0x0211 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0211 }
            if (r7 == 0) goto L_0x020b
            java.lang.String r7 = r11.f7017l     // Catch:{ IllegalStateException -> 0x0211 }
            goto L_0x020d
        L_0x020b:
            java.lang.String r7 = r11.f7016k     // Catch:{ IllegalStateException -> 0x0211 }
        L_0x020d:
            r2.mo7090a(r3, r6, r7)     // Catch:{ IllegalStateException -> 0x0211 }
            goto L_0x0223
        L_0x0211:
            r2 = move-exception
            com.google.android.gms.measurement.internal.y3 r3 = r11.mo7098j()
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7815t()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r3.mo7090a(r6, r0, r2)
        L_0x0223:
            r0 = 0
            r11.f7014i = r0
            com.google.android.gms.measurement.internal.b r0 = r11.mo7827m()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2457t.f6913d0
            boolean r0 = r0.mo7108a(r2)
            if (r0 == 0) goto L_0x0277
            r11.mo7094f()
            com.google.android.gms.measurement.internal.b r0 = r11.mo7827m()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo7115e(r2)
            if (r0 == 0) goto L_0x0273
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0256
            com.google.android.gms.measurement.internal.y3 r2 = r11.mo7098j()
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7820y()
            java.lang.String r3 = "Safelisted event list is empty. Ignoring"
            r2.mo7088a(r3)
        L_0x0254:
            r5 = 0
            goto L_0x0273
        L_0x0256:
            java.util.Iterator r2 = r0.iterator()
        L_0x025a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0273
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.v9 r6 = r11.mo7825k()
            java.lang.String r7 = "safelisted event"
            boolean r3 = r6.mo7707b(r7, r3)
            if (r3 != 0) goto L_0x025a
            goto L_0x0254
        L_0x0273:
            if (r5 == 0) goto L_0x0277
            r11.f7014i = r0
        L_0x0277:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 < r2) goto L_0x028d
            if (r1 == 0) goto L_0x028a
            android.content.Context r0 = r11.mo7096h()
            boolean r0 = com.google.android.gms.common.p051p.C2173a.m8929a(r0)
            r11.f7015j = r0
            return
        L_0x028a:
            r11.f7015j = r4
            return
        L_0x028d:
            r11.f7015j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2483v3.mo7243v():void");
    }
}
