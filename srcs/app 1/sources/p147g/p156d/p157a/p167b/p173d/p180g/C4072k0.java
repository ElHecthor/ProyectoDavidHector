package p147g.p156d.p157a.p167b.p173d.p180g;

import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.k0 */
public final class C4072k0 extends C4214t4<C4072k0, C4074b> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C4072k0 zzi;
    private static volatile C4139o6<C4072k0> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf;
    private String zzg;
    private String zzh;

    /* renamed from: g.d.a.b.d.g.k0$a */
    public enum C4073a implements C4279x4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        

        /* renamed from: f */
        private final int f11056f;

        static {
            new C4147p0();
        }

        private C4073a(int i) {
            this.f11056f = i;
        }

        /* renamed from: a */
        public static C4073a m16690a(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        /* renamed from: b */
        public static C4309z4 m16691b() {
            return C4133o0.f11200a;
        }

        /* renamed from: a */
        public final int mo12325a() {
            return this.f11056f;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(C4073a.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" number=");
            sb.append(this.f11056f);
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    /* renamed from: g.d.a.b.d.g.k0$b */
    public static final class C4074b extends C4216b<C4072k0, C4074b> implements C4018g6 {
        private C4074b() {
            super(C4072k0.zzi);
        }

        /* synthetic */ C4074b(C4119n0 n0Var) {
            this();
        }
    }

    static {
        C4072k0 k0Var = new C4072k0();
        zzi = k0Var;
        C4214t4.m17152a(C4072k0.class, k0Var);
    }

    private C4072k0() {
        String str = "";
        this.zzf = str;
        this.zzg = str;
        this.zzh = str;
    }

    /* renamed from: z */
    public static C4072k0 m16678z() {
        return zzi;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4119n0.f11128a[i - 1]) {
            case 1:
                return new C4072k0();
            case 2:
                return new C4074b(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", C4073a.m16691b(), "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                C4139o6<C4072k0> o6Var = zzj;
                if (o6Var == null) {
                    synchronized (C4072k0.class) {
                        o6Var = zzj;
                        if (o6Var == null) {
                            o6Var = new C4215a<>(zzi);
                            zzj = o6Var;
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
    public final boolean mo12579a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: q */
    public final C4073a mo12580q() {
        C4073a a = C4073a.m16690a(this.zzd);
        return a == null ? C4073a.UNKNOWN_COMPARISON_TYPE : a;
    }

    /* renamed from: r */
    public final boolean mo12581r() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: s */
    public final boolean mo12582s() {
        return this.zze;
    }

    /* renamed from: t */
    public final boolean mo12583t() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: u */
    public final String mo12584u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final boolean mo12585v() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: w */
    public final String mo12586w() {
        return this.zzg;
    }

    /* renamed from: x */
    public final boolean mo12587x() {
        return (this.zzc & 16) != 0;
    }

    /* renamed from: y */
    public final String mo12588y() {
        return this.zzh;
    }
}
