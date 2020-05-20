package p147g.p156d.p157a.p167b.p173d.p180g;

import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.z0 */
public final class C4304z0 extends C4214t4<C4304z0, C4305a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C4304z0 zzf;
    private static volatile C4139o6<C4304z0> zzg;
    private int zzc;
    private String zzd = "";
    private long zze;

    /* renamed from: g.d.a.b.d.g.z0$a */
    public static final class C4305a extends C4216b<C4304z0, C4305a> implements C4018g6 {
        private C4305a() {
            super(C4304z0.zzf);
        }

        /* synthetic */ C4305a(C4029h1 h1Var) {
            this();
        }
    }

    static {
        C4304z0 z0Var = new C4304z0();
        zzf = z0Var;
        C4214t4.m17152a(C4304z0.class, z0Var);
    }

    private C4304z0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4029h1.f10991a[i - 1]) {
            case 1:
                return new C4304z0();
            case 2:
                return new C4305a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C4139o6<C4304z0> o6Var = zzg;
                if (o6Var == null) {
                    synchronized (C4304z0.class) {
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
