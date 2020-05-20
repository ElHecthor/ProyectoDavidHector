package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.List;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.f1 */
public final class C3995f1 extends C4214t4<C3995f1, C3996a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C3995f1 zzf;
    private static volatile C4139o6<C3995f1> zzg;
    private int zzc;
    private int zzd;
    private C3930b5 zze = C4214t4.m17155o();

    /* renamed from: g.d.a.b.d.g.f1$a */
    public static final class C3996a extends C4216b<C3995f1, C3996a> implements C4018g6 {
        private C3996a() {
            super(C3995f1.zzf);
        }

        /* synthetic */ C3996a(C4029h1 h1Var) {
            this();
        }

        /* renamed from: a */
        public final C3996a mo12444a(int i) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C3995f1) this.f11313g).m16350c(i);
            return this;
        }

        /* renamed from: a */
        public final C3996a mo12445a(Iterable<? extends Long> iterable) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C3995f1) this.f11313g).m16349a(iterable);
            return this;
        }
    }

    static {
        C3995f1 f1Var = new C3995f1();
        zzf = f1Var;
        C4214t4.m17152a(C3995f1.class, f1Var);
    }

    private C3995f1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16349a(Iterable<? extends Long> iterable) {
        C3930b5 b5Var = this.zze;
        if (!b5Var.mo12079a()) {
            this.zze = C4214t4.m17148a(b5Var);
        }
        C3944c3.m16008a(iterable, this.zze);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m16350c(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* renamed from: t */
    public static C3996a m16351t() {
        return (C3996a) zzf.mo12812i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4029h1.f10991a[i - 1]) {
            case 1:
                return new C3995f1();
            case 2:
                return new C3996a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C4139o6<C3995f1> o6Var = zzg;
                if (o6Var == null) {
                    synchronized (C3995f1.class) {
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
    public final boolean mo12439a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: b */
    public final long mo12440b(int i) {
        return this.zze.mo12109b(i);
    }

    /* renamed from: q */
    public final int mo12441q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final List<Long> mo12442r() {
        return this.zze;
    }

    /* renamed from: s */
    public final int mo12443s() {
        return this.zze.size();
    }
}
