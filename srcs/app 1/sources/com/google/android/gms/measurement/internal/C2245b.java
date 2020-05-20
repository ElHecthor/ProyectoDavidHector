package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.p051p.C2175c;
import com.google.android.gms.common.util.C2198m;
import java.lang.reflect.InvocationTargetException;
import p147g.p156d.p157a.p167b.p173d.p180g.C4023gb;
import p147g.p156d.p157a.p167b.p173d.p180g.C4298y8;

/* renamed from: com.google.android.gms.measurement.internal.b */
public final class C2245b extends C2518y5 {

    /* renamed from: b */
    private Boolean f6264b;

    /* renamed from: c */
    private C2269d f6265c = C2401na.f6754a;

    /* renamed from: d */
    private Boolean f6266d;

    C2245b(C2263c5 c5Var) {
        super(c5Var);
    }

    /* renamed from: a */
    private final String m9109a(String str, String str2) {
        String str3;
        C2238a4 a4Var;
        Class<String> cls = String.class;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke(null, new Object[]{str, str2});
        } catch (ClassNotFoundException e) {
            e = e;
            a4Var = mo7098j().mo7815t();
            str3 = "Could not find SystemProperties class";
            a4Var.mo7089a(str3, e);
            return str2;
        } catch (NoSuchMethodException e2) {
            e = e2;
            a4Var = mo7098j().mo7815t();
            str3 = "Could not find SystemProperties.get() method";
            a4Var.mo7089a(str3, e);
            return str2;
        } catch (IllegalAccessException e3) {
            e = e3;
            a4Var = mo7098j().mo7815t();
            str3 = "Could not access SystemProperties.get()";
            a4Var.mo7089a(str3, e);
            return str2;
        } catch (InvocationTargetException e4) {
            e = e4;
            a4Var = mo7098j().mo7815t();
            str3 = "SystemProperties.get() threw an exception";
            a4Var.mo7089a(str3, e);
            return str2;
        }
    }

    /* renamed from: w */
    public static long m9110w() {
        return ((Long) C2457t.f6868D.mo7587a(null)).longValue();
    }

    /* renamed from: x */
    public static long m9111x() {
        return ((Long) C2457t.f6912d.mo7587a(null)).longValue();
    }

    /* renamed from: y */
    private final Bundle m9112y() {
        try {
            if (mo7096h().getPackageManager() == null) {
                mo7098j().mo7815t().mo7088a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = C2175c.m8939a(mo7096h()).mo6959a(mo7096h().getPackageName(), 128);
            if (a != null) {
                return a.metaData;
            }
            mo7098j().mo7815t().mo7088a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (NameNotFoundException e) {
            mo7098j().mo7815t().mo7089a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo7103a(String str) {
        if (!C4298y8.m17628b() || !mo7114d(null, C2457t.f6885L0)) {
            return 500;
        }
        return mo7104a(str, C2457t.f6876H, 500, 2000);
    }

    /* renamed from: a */
    public final int mo7104a(String str, C2439r3<Integer> r3Var, int i, int i2) {
        return Math.max(Math.min(mo7110b(str, r3Var), i2), i);
    }

    /* renamed from: a */
    public final long mo7105a(String str, C2439r3<Long> r3Var) {
        if (str != null) {
            String a = this.f6265c.mo7234a(str, r3Var.mo7588a());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return ((Long) r3Var.mo7587a(Long.valueOf(Long.parseLong(a)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) r3Var.mo7587a(null)).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo7106a(com.google.android.gms.measurement.internal.C2299f5 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.mo7332n()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
            boolean r1 = p147g.p156d.p157a.p167b.p173d.p180g.C4157pa.m16931b()
            if (r1 == 0) goto L_0x002f
            com.google.android.gms.measurement.internal.b r1 = r5.mo7827m()
            java.lang.String r2 = r6.mo7328l()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C2457t.f6937p0
            boolean r1 = r1.mo7114d(r2, r3)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r6.mo7336p()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
        L_0x002f:
            java.lang.String r1 = r6.mo7334o()
        L_0x0033:
            com.google.android.gms.measurement.internal.r3<java.lang.String> r2 = com.google.android.gms.measurement.internal.C2457t.f6914e
            r3 = 0
            java.lang.Object r2 = r2.mo7587a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.r3<java.lang.String> r4 = com.google.android.gms.measurement.internal.C2457t.f6916f
            java.lang.Object r3 = r4.mo7587a(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x005d
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0062
        L_0x005d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0062:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.mo7330m()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            long r1 = r5.mo7122o()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "gmp_version"
            r6.appendQueryParameter(r2, r1)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2245b.mo7106a(com.google.android.gms.measurement.internal.f5):java.lang.String");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7107a(C2269d dVar) {
        this.f6265c = dVar;
    }

    /* renamed from: a */
    public final boolean mo7108a(C2439r3<Boolean> r3Var) {
        return mo7114d(null, r3Var);
    }

    /* renamed from: b */
    public final int mo7109b(String str) {
        return mo7110b(str, C2457t.f6934o);
    }

    /* renamed from: b */
    public final int mo7110b(String str, C2439r3<Integer> r3Var) {
        if (str != null) {
            String a = this.f6265c.mo7234a(str, r3Var.mo7588a());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return ((Integer) r3Var.mo7587a(Integer.valueOf(Integer.parseInt(a)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) r3Var.mo7587a(null)).intValue();
    }

    /* renamed from: c */
    public final double mo7111c(String str, C2439r3<Double> r3Var) {
        if (str != null) {
            String a = this.f6265c.mo7234a(str, r3Var.mo7588a());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return ((Double) r3Var.mo7587a(Double.valueOf(Double.parseDouble(a)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) r3Var.mo7587a(null)).doubleValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo7112c(String str) {
        if (!C4298y8.m17628b() || !mo7114d(null, C2457t.f6885L0)) {
            return 25;
        }
        return mo7104a(str, C2457t.f6874G, 25, 100);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Boolean mo7113d(String str) {
        C2148s.m8844b(str);
        Bundle y = m9112y();
        if (y == null) {
            mo7098j().mo7815t().mo7088a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!y.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(y.getBoolean(str));
        }
    }

    /* renamed from: d */
    public final boolean mo7114d(String str, C2439r3<Boolean> r3Var) {
        Object a;
        if (str != null) {
            String a2 = this.f6265c.mo7234a(str, r3Var.mo7588a());
            if (!TextUtils.isEmpty(a2)) {
                a = r3Var.mo7587a(Boolean.valueOf(Boolean.parseBoolean(a2)));
                return ((Boolean) a).booleanValue();
            }
        }
        a = r3Var.mo7587a(null);
        return ((Boolean) a).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo7115e(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C2148s.m8844b(r4)
            android.os.Bundle r0 = r3.m9112y()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.y3 r4 = r3.mo7098j()
            com.google.android.gms.measurement.internal.a4 r4 = r4.mo7815t()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo7088a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.mo7096h()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.y3 r0 = r3.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7815t()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo7089a(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2245b.mo7115e(java.lang.String):java.util.List");
    }

    /* renamed from: e */
    public final boolean mo7116e(String str, C2439r3<Boolean> r3Var) {
        return mo7114d(str, r3Var);
    }

    /* renamed from: f */
    public final boolean mo7117f(String str) {
        return "1".equals(this.f6265c.mo7234a(str, "gaia_collection_enabled"));
    }

    /* renamed from: g */
    public final boolean mo7118g(String str) {
        return "1".equals(this.f6265c.mo7234a(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo7119h(String str) {
        return mo7114d(str, C2457t.f6882K);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final String mo7120i(String str) {
        C2439r3<String> r3Var = C2457t.f6884L;
        return (String) r3Var.mo7587a(str == null ? null : this.f6265c.mo7234a(str, r3Var.mo7588a()));
    }

    /* renamed from: n */
    public final int mo7121n() {
        return (!C4298y8.m17628b() || !mo7827m().mo7114d(null, C2457t.f6887M0) || mo7825k().mo7713v() < 2147483) ? 25 : 100;
    }

    /* renamed from: o */
    public final long mo7122o() {
        mo7094f();
        return 27000;
    }

    /* renamed from: p */
    public final boolean mo7123p() {
        if (this.f6266d == null) {
            synchronized (this) {
                if (this.f6266d == null) {
                    ApplicationInfo applicationInfo = mo7096h().getApplicationInfo();
                    String a = C2198m.m9010a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f6266d = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f6266d == null) {
                        this.f6266d = Boolean.TRUE;
                        mo7098j().mo7815t().mo7088a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f6266d.booleanValue();
    }

    /* renamed from: q */
    public final boolean mo7124q() {
        mo7094f();
        Boolean d = mo7113d("firebase_analytics_collection_deactivated");
        return d != null && d.booleanValue();
    }

    /* renamed from: r */
    public final Boolean mo7125r() {
        mo7273a();
        Boolean d = mo7113d("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(d == null || d.booleanValue());
    }

    /* renamed from: s */
    public final Boolean mo7126s() {
        mo7273a();
        boolean z = true;
        if (!C4023gb.m16436b() || !mo7108a(C2457t.f6869D0)) {
            return Boolean.valueOf(true);
        }
        Boolean d = mo7113d("google_analytics_automatic_screen_reporting_enabled");
        if (d != null && !d.booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: t */
    public final String mo7127t() {
        return m9109a("debug.firebase.analytics.app", "");
    }

    /* renamed from: u */
    public final String mo7128u() {
        return m9109a("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final boolean mo7129v() {
        if (this.f6264b == null) {
            Boolean d = mo7113d("app_measurement_lite");
            this.f6264b = d;
            if (d == null) {
                this.f6264b = Boolean.valueOf(false);
            }
        }
        return this.f6264b.booleanValue() || !this.f7100a.mo7192C();
    }
}
