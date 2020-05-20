package p147g.p156d.p157a.p167b.p173d.p180g;

import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.d1 */
public final class C3962d1 extends C4214t4<C3962d1, C3964b> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C3962d1 zzf;
    private static volatile C4139o6<C3962d1> zzg;
    private int zzc;
    private int zzd = 1;
    private C3914a5<C4304z0> zze = C4214t4.m17156p();

    /* renamed from: g.d.a.b.d.g.d1$a */
    public enum C3963a implements C4279x4 {
        RADS(1),
        PROVISIONING(2);
        

        /* renamed from: f */
        private final int f10905f;

        static {
            new C4059j1();
        }

        private C3963a(int i) {
            this.f10905f = i;
        }

        /* renamed from: a */
        public static C3963a m16195a(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        /* renamed from: b */
        public static C4309z4 m16196b() {
            return C4044i1.f11006a;
        }

        /* renamed from: a */
        public final int mo12325a() {
            return this.f10905f;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(C3963a.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" number=");
            sb.append(this.f10905f);
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    /* renamed from: g.d.a.b.d.g.d1$b */
    public static final class C3964b extends C4216b<C3962d1, C3964b> implements C4018g6 {
        private C3964b() {
            super(C3962d1.zzf);
        }

        /* synthetic */ C3964b(C4029h1 h1Var) {
            this();
        }
    }

    static {
        C3962d1 d1Var = new C3962d1();
        zzf = d1Var;
        C4214t4.m17152a(C3962d1.class, d1Var);
    }

    private C3962d1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4029h1.f10991a[i - 1]) {
            case 1:
                return new C3962d1();
            case 2:
                return new C3964b(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", C3963a.m16196b(), "zze", C4304z0.class});
            case 4:
                return zzf;
            case 5:
                C4139o6<C3962d1> o6Var = zzg;
                if (o6Var == null) {
                    synchronized (C3962d1.class) {
                        o6Var = zzg;
                        if (o6Var == null) {
                            o6Var = new C4215a<>(zzf);
                            zzg = o6Var;
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
}
