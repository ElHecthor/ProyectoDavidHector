package p147g.p156d.p157a.p167b.p173d.p180g;

import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.j0 */
public final class C4057j0 extends C4214t4<C4057j0, C4058a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C4057j0 zzh;
    private static volatile C4139o6<C4057j0> zzi;
    private int zzc;
    private C4103m0 zzd;
    private C4072k0 zze;
    private boolean zzf;
    private String zzg = "";

    /* renamed from: g.d.a.b.d.g.j0$a */
    public static final class C4058a extends C4216b<C4057j0, C4058a> implements C4018g6 {
        private C4058a() {
            super(C4057j0.zzh);
        }

        /* synthetic */ C4058a(C4119n0 n0Var) {
            this();
        }

        /* renamed from: a */
        public final C4058a mo12560a(String str) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4057j0) this.f11313g).m16642a(str);
            return this;
        }
    }

    static {
        C4057j0 j0Var = new C4057j0();
        zzh = j0Var;
        C4214t4.m17152a(C4057j0.class, j0Var);
    }

    private C4057j0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16642a(String str) {
        str.getClass();
        this.zzc |= 8;
        this.zzg = str;
    }

    /* renamed from: x */
    public static C4057j0 m16643x() {
        return zzh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4119n0.f11128a[i - 1]) {
            case 1:
                return new C4057j0();
            case 2:
                return new C4058a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C4139o6<C4057j0> o6Var = zzi;
                if (o6Var == null) {
                    synchronized (C4057j0.class) {
                        o6Var = zzi;
                        if (o6Var == null) {
                            o6Var = new C4215a<>(zzh);
                            zzi = o6Var;
                        }
                    }
                }
                return o6Var;
            case 6:
                return Byte.valueOf(1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final boolean mo12552a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: q */
    public final C4103m0 mo12553q() {
        C4103m0 m0Var = this.zzd;
        return m0Var == null ? C4103m0.m16785x() : m0Var;
    }

    /* renamed from: r */
    public final boolean mo12554r() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: s */
    public final C4072k0 mo12555s() {
        C4072k0 k0Var = this.zze;
        return k0Var == null ? C4072k0.m16678z() : k0Var;
    }

    /* renamed from: t */
    public final boolean mo12556t() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: u */
    public final boolean mo12557u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final boolean mo12558v() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: w */
    public final String mo12559w() {
        return this.zzg;
    }
}
