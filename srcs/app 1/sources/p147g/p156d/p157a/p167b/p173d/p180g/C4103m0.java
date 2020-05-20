package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.List;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.m0 */
public final class C4103m0 extends C4214t4<C4103m0, C4104a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C4103m0 zzh;
    private static volatile C4139o6<C4103m0> zzi;
    private int zzc;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private C3914a5<String> zzg = C4214t4.m17156p();

    /* renamed from: g.d.a.b.d.g.m0$a */
    public static final class C4104a extends C4216b<C4103m0, C4104a> implements C4018g6 {
        private C4104a() {
            super(C4103m0.zzh);
        }

        /* synthetic */ C4104a(C4119n0 n0Var) {
            this();
        }
    }

    /* renamed from: g.d.a.b.d.g.m0$b */
    public enum C4105b implements C4279x4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        

        /* renamed from: f */
        private final int f11101f;

        static {
            new C4161q0();
        }

        private C4105b(int i) {
            this.f11101f = i;
        }

        /* renamed from: a */
        public static C4105b m16796a(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static C4309z4 m16797b() {
            return C4230u0.f11338a;
        }

        /* renamed from: a */
        public final int mo12325a() {
            return this.f11101f;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(C4105b.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" number=");
            sb.append(this.f11101f);
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    static {
        C4103m0 m0Var = new C4103m0();
        zzh = m0Var;
        C4214t4.m17152a(C4103m0.class, m0Var);
    }

    private C4103m0() {
    }

    /* renamed from: x */
    public static C4103m0 m16785x() {
        return zzh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4119n0.f11128a[i - 1]) {
            case 1:
                return new C4103m0();
            case 2:
                return new C4104a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", C4105b.m16797b(), "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C4139o6<C4103m0> o6Var = zzi;
                if (o6Var == null) {
                    synchronized (C4103m0.class) {
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
    public final boolean mo12641a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: q */
    public final C4105b mo12642q() {
        C4105b a = C4105b.m16796a(this.zzd);
        return a == null ? C4105b.UNKNOWN_MATCH_TYPE : a;
    }

    /* renamed from: r */
    public final boolean mo12643r() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: s */
    public final String mo12644s() {
        return this.zze;
    }

    /* renamed from: t */
    public final boolean mo12645t() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: u */
    public final boolean mo12646u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final List<String> mo12647v() {
        return this.zzg;
    }

    /* renamed from: w */
    public final int mo12648w() {
        return this.zzg.size();
    }
}
