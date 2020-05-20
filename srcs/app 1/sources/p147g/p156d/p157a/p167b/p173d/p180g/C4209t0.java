package p147g.p156d.p157a.p167b.p173d.p180g;

import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.t0 */
public final class C4209t0 extends C4214t4<C4209t0, C4210a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C4209t0 zzf;
    private static volatile C4139o6<C4209t0> zzg;
    private int zzc;
    private String zzd;
    private String zze;

    /* renamed from: g.d.a.b.d.g.t0$a */
    public static final class C4210a extends C4216b<C4209t0, C4210a> implements C4018g6 {
        private C4210a() {
            super(C4209t0.zzf);
        }

        /* synthetic */ C4210a(C4244v0 v0Var) {
            this();
        }
    }

    static {
        C4209t0 t0Var = new C4209t0();
        zzf = t0Var;
        C4214t4.m17152a(C4209t0.class, t0Var);
    }

    private C4209t0() {
        String str = "";
        this.zzd = str;
        this.zze = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4244v0.f11351a[i - 1]) {
            case 1:
                return new C4209t0();
            case 2:
                return new C4210a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C4139o6<C4209t0> o6Var = zzg;
                if (o6Var == null) {
                    synchronized (C4209t0.class) {
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

    /* renamed from: a */
    public final String mo12806a() {
        return this.zzd;
    }

    /* renamed from: q */
    public final String mo12807q() {
        return this.zze;
    }
}
