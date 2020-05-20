package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.C2148s;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p147g.p156d.p157a.p167b.p173d.p180g.C4053ia;
import p147g.p156d.p157a.p167b.p173d.p180g.C4284x9;

/* renamed from: com.google.android.gms.measurement.internal.n7 */
public final class C2397n7 extends C2285e3 {

    /* renamed from: c */
    private volatile C2410o7 f6715c;

    /* renamed from: d */
    private C2410o7 f6716d;

    /* renamed from: e */
    protected C2410o7 f6717e;

    /* renamed from: f */
    private final Map<Activity, C2410o7> f6718f = new ConcurrentHashMap();

    /* renamed from: g */
    private Activity f6719g;

    /* renamed from: h */
    private volatile C2410o7 f6720h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2410o7 f6721i;

    /* renamed from: j */
    private final Object f6722j = new Object();

    /* renamed from: k */
    private String f6723k;

    public C2397n7(C2263c5 c5Var) {
        super(c5Var);
    }

    /* renamed from: a */
    private static String m9632a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* renamed from: a */
    private final void m9633a(Activity activity, C2410o7 o7Var, boolean z) {
        C2410o7 o7Var2;
        C2410o7 o7Var3 = this.f6715c == null ? this.f6716d : this.f6715c;
        if (o7Var.f6769b == null) {
            C2410o7 o7Var4 = new C2410o7(o7Var.f6768a, activity != null ? m9632a(activity.getClass().getCanonicalName()) : null, o7Var.f6770c, o7Var.f6772e);
            o7Var2 = o7Var4;
        } else {
            o7Var2 = o7Var;
        }
        this.f6716d = this.f6715c;
        this.f6715c = o7Var2;
        long c = mo7095g().mo6989c();
        C2528z4 i = mo7097i();
        C2432q7 q7Var = new C2432q7(this, o7Var2, o7Var3, c, z);
        i.mo7841a((Runnable) q7Var);
    }

    /* renamed from: a */
    public static void m9636a(C2410o7 o7Var, Bundle bundle, boolean z) {
        String str = "_si";
        String str2 = "_sn";
        String str3 = "_sc";
        if (bundle == null || o7Var == null || (bundle.containsKey(str3) && !z)) {
            if (bundle != null && o7Var == null && z) {
                bundle.remove(str2);
                bundle.remove(str3);
                bundle.remove(str);
            }
            return;
        }
        String str4 = o7Var.f6768a;
        if (str4 != null) {
            bundle.putString(str2, str4);
        } else {
            bundle.remove(str2);
        }
        String str5 = o7Var.f6769b;
        if (str5 != null) {
            bundle.putString(str3, str5);
        } else {
            bundle.remove(str3);
        }
        bundle.putLong(str, o7Var.f6770c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9637a(C2410o7 o7Var, C2410o7 o7Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        mo7274c();
        boolean z3 = false;
        if (mo7827m().mo7108a(C2457t.f6900U)) {
            z2 = z && this.f6717e != null;
            if (z2) {
                m9638a(this.f6717e, true, j);
            }
        } else {
            if (z) {
                C2410o7 o7Var3 = this.f6717e;
                if (o7Var3 != null) {
                    m9638a(o7Var3, true, j);
                }
            }
            z2 = false;
        }
        if (o7Var2 == null || o7Var2.f6770c != o7Var.f6770c || !C2489v9.m10027c(o7Var2.f6769b, o7Var.f6769b) || !C2489v9.m10027c(o7Var2.f6768a, o7Var.f6768a)) {
            z3 = true;
        }
        if (z3) {
            Bundle bundle2 = new Bundle();
            if (mo7827m().mo7108a(C2457t.f6871E0)) {
                bundle2 = new Bundle();
            }
            m9636a(o7Var, bundle2, true);
            if (o7Var2 != null) {
                String str = o7Var2.f6768a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = o7Var2.f6769b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", o7Var2.f6770c);
            }
            if (mo7827m().mo7108a(C2457t.f6900U) && z2) {
                long b = (!C4053ia.m16633b() || !mo7827m().mo7108a(C2457t.f6902W) || !C4284x9.m17546b() || !mo7827m().mo7108a(C2457t.f6865B0)) ? mo7282u().f7108e.mo7269b() : mo7282u().f7108e.mo7271c(j);
                if (b > 0) {
                    mo7825k().mo7689a(bundle2, b);
                }
            }
            String str3 = "auto";
            if (mo7827m().mo7108a(C2457t.f6871E0)) {
                if (!mo7827m().mo7126s().booleanValue()) {
                    bundle2.putLong("_mt", 1);
                }
                if (o7Var.f6772e) {
                    str3 = "app";
                }
            }
            mo7277p().mo7442b(str3, "_vs", bundle2);
        }
        this.f6717e = o7Var;
        if (mo7827m().mo7108a(C2457t.f6871E0) && o7Var.f6772e) {
            this.f6721i = o7Var;
        }
        mo7279r().mo7637a(o7Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9638a(C2410o7 o7Var, boolean z, long j) {
        mo7276o().mo7130a(mo7095g().mo6989c());
        if (mo7282u().mo7830a(o7Var != null && o7Var.f6771d, z, j) && o7Var != null) {
            o7Var.f6771d = false;
        }
    }

    /* renamed from: d */
    private final C2410o7 m9639d(Activity activity) {
        C2148s.m8834a(activity);
        C2410o7 o7Var = (C2410o7) this.f6718f.get(activity);
        if (o7Var == null) {
            C2410o7 o7Var2 = new C2410o7(null, m9632a(activity.getClass().getCanonicalName()), mo7825k().mo7711t());
            this.f6718f.put(activity, o7Var2);
            o7Var = o7Var2;
        }
        boolean a = mo7827m().mo7108a(C2457t.f6871E0);
        return o7Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo7242A() {
        return false;
    }

    /* renamed from: B */
    public final C2410o7 mo7520B() {
        mo7273a();
        return this.f6715c;
    }

    /* renamed from: a */
    public final C2410o7 mo7521a(boolean z) {
        mo7245x();
        mo7274c();
        if (!mo7827m().mo7108a(C2457t.f6871E0) || !z) {
            return this.f6717e;
        }
        C2410o7 o7Var = this.f6717e;
        return o7Var != null ? o7Var : this.f6721i;
    }

    /* renamed from: a */
    public final void mo7522a(Activity activity) {
        if (mo7827m().mo7108a(C2457t.f6871E0)) {
            synchronized (this.f6722j) {
                if (activity != this.f6719g) {
                    synchronized (this.f6722j) {
                        this.f6719g = activity;
                    }
                    if (mo7827m().mo7108a(C2457t.f6869D0) && mo7827m().mo7126s().booleanValue()) {
                        this.f6720h = null;
                        mo7097i().mo7841a((Runnable) new C2476u7(this));
                    }
                }
            }
        }
        if (!mo7827m().mo7108a(C2457t.f6869D0) || mo7827m().mo7126s().booleanValue()) {
            m9633a(activity, m9639d(activity), false);
            C2246b0 o = mo7276o();
            o.mo7097i().mo7841a((Runnable) new C2259c1(o, o.mo7095g().mo6989c()));
            return;
        }
        this.f6715c = this.f6720h;
        mo7097i().mo7841a((Runnable) new C2421p7(this));
    }

    /* renamed from: a */
    public final void mo7523a(Activity activity, Bundle bundle) {
        if (mo7827m().mo7126s().booleanValue() && bundle != null) {
            Bundle bundle2 = bundle.getBundle("com.google.app_measurement.screen_service");
            if (bundle2 != null) {
                this.f6718f.put(activity, new C2410o7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
            }
        }
    }

    /* renamed from: a */
    public final void mo7524a(Activity activity, String str, String str2) {
        if (!mo7827m().mo7126s().booleanValue()) {
            mo7098j().mo7820y().mo7088a("setCurrentScreen cannot be called while screen reporting is disabled.");
        } else if (this.f6715c == null) {
            mo7098j().mo7820y().mo7088a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f6718f.get(activity) == null) {
            mo7098j().mo7820y().mo7088a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m9632a(activity.getClass().getCanonicalName());
            }
            boolean c = C2489v9.m10027c(this.f6715c.f6769b, str2);
            boolean c2 = C2489v9.m10027c(this.f6715c.f6768a, str);
            if (c && c2) {
                mo7098j().mo7820y().mo7088a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                mo7098j().mo7820y().mo7089a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                mo7098j().mo7810B().mo7090a("Setting current screen to name, class", str == null ? "null" : str, str2);
                C2410o7 o7Var = new C2410o7(str, str2, mo7825k().mo7711t());
                this.f6718f.put(activity, o7Var);
                m9633a(activity, o7Var, true);
            } else {
                mo7098j().mo7820y().mo7089a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* renamed from: a */
    public final void mo7525a(String str, C2410o7 o7Var) {
        mo7274c();
        synchronized (this) {
            if (this.f6723k == null || this.f6723k.equals(str) || o7Var != null) {
                this.f6723k = str;
            }
        }
    }

    /* renamed from: b */
    public final void mo7526b(Activity activity) {
        if (mo7827m().mo7108a(C2457t.f6871E0)) {
            synchronized (this.f6722j) {
            }
        }
        if (!mo7827m().mo7108a(C2457t.f6869D0) || mo7827m().mo7126s().booleanValue()) {
            C2410o7 d = m9639d(activity);
            this.f6716d = this.f6715c;
            this.f6715c = null;
            mo7097i().mo7841a((Runnable) new C2443r7(this, d, mo7095g().mo6989c()));
            return;
        }
        this.f6715c = null;
        mo7097i().mo7841a((Runnable) new C2454s7(this));
    }

    /* renamed from: b */
    public final void mo7527b(Activity activity, Bundle bundle) {
        if (mo7827m().mo7126s().booleanValue() && bundle != null) {
            C2410o7 o7Var = (C2410o7) this.f6718f.get(activity);
            if (o7Var != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("id", o7Var.f6770c);
                bundle2.putString("name", o7Var.f6768a);
                bundle2.putString("referrer_name", o7Var.f6769b);
                bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
            }
        }
    }

    /* renamed from: c */
    public final void mo7528c(Activity activity) {
        synchronized (this.f6722j) {
            if (activity == this.f6719g) {
                this.f6719g = null;
            }
        }
        if (mo7827m().mo7126s().booleanValue()) {
            this.f6718f.remove(activity);
        }
    }
}
