package p147g.p156d.p157a.p167b.p173d.p180g;

import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.l0 */
public final class C4088l0 extends C4214t4<C4088l0, C4089a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C4088l0 zzj;
    private static volatile C4139o6<C4088l0> zzk;
    private int zzc;
    private int zzd;
    private String zze = "";
    private C4057j0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    /* renamed from: g.d.a.b.d.g.l0$a */
    public static final class C4089a extends C4216b<C4088l0, C4089a> implements C4018g6 {
        private C4089a() {
            super(C4088l0.zzj);
        }

        /* synthetic */ C4089a(C4119n0 n0Var) {
            this();
        }

        /* renamed from: a */
        public final C4089a mo12605a(String str) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4088l0) this.f11313g).m16723a(str);
            return this;
        }
    }

    static {
        C4088l0 l0Var = new C4088l0();
        zzj = l0Var;
        C4214t4.m17152a(C4088l0.class, l0Var);
    }

    private C4088l0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16723a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* renamed from: x */
    public static C4089a m16724x() {
        return (C4089a) zzj.mo12812i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4119n0.f11128a[i - 1]) {
            case 1:
                return new C4088l0();
            case 2:
                return new C4089a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                C4139o6<C4088l0> o6Var = zzk;
                if (o6Var == null) {
                    synchronized (C4088l0.class) {
                        o6Var = zzk;
                        if (o6Var == null) {
                            o6Var = new C4215a<>(zzj);
                            zzk = o6Var;
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
    public final boolean mo12597a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: q */
    public final int mo12598q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final String mo12599r() {
        return this.zze;
    }

    /* renamed from: s */
    public final C4057j0 mo12600s() {
        C4057j0 j0Var = this.zzf;
        return j0Var == null ? C4057j0.m16643x() : j0Var;
    }

    /* renamed from: t */
    public final boolean mo12601t() {
        return this.zzg;
    }

    /* renamed from: u */
    public final boolean mo12602u() {
        return this.zzh;
    }

    /* renamed from: v */
    public final boolean mo12603v() {
        return (this.zzc & 32) != 0;
    }

    /* renamed from: w */
    public final boolean mo12604w() {
        return this.zzi;
    }
}
