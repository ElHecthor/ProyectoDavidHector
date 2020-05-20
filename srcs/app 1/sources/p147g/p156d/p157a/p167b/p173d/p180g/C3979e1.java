package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.List;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.e1 */
public final class C3979e1 extends C4214t4<C3979e1, C3980a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C3979e1 zzg;
    private static volatile C4139o6<C3979e1> zzh;
    private C3930b5 zzc = C4214t4.m17155o();
    private C3930b5 zzd = C4214t4.m17155o();
    private C3914a5<C4273x0> zze = C4214t4.m17156p();
    private C3914a5<C3995f1> zzf = C4214t4.m17156p();

    /* renamed from: g.d.a.b.d.g.e1$a */
    public static final class C3980a extends C4216b<C3979e1, C3980a> implements C4018g6 {
        private C3980a() {
            super(C3979e1.zzg);
        }

        /* synthetic */ C3980a(C4029h1 h1Var) {
            this();
        }

        /* renamed from: a */
        public final C3980a mo12377a() {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C3979e1) this.f11313g).m16233A();
            return this;
        }

        /* renamed from: a */
        public final C3980a mo12378a(int i) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C3979e1) this.f11313g).m16247d(i);
            return this;
        }

        /* renamed from: a */
        public final C3980a mo12379a(Iterable<? extends Long> iterable) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C3979e1) this.f11313g).m16240a(iterable);
            return this;
        }

        /* renamed from: b */
        public final C3980a mo12380b(int i) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C3979e1) this.f11313g).m16250e(i);
            return this;
        }

        /* renamed from: b */
        public final C3980a mo12381b(Iterable<? extends Long> iterable) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C3979e1) this.f11313g).m16244b(iterable);
            return this;
        }

        /* renamed from: c */
        public final C3980a mo12382c(Iterable<? extends C4273x0> iterable) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C3979e1) this.f11313g).m16246c(iterable);
            return this;
        }

        /* renamed from: d */
        public final C3980a mo12383d(Iterable<? extends C3995f1> iterable) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C3979e1) this.f11313g).m16249d(iterable);
            return this;
        }

        /* renamed from: p */
        public final C3980a mo12384p() {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C3979e1) this.f11313g).m16234B();
            return this;
        }
    }

    static {
        C3979e1 e1Var = new C3979e1();
        zzg = e1Var;
        C4214t4.m17152a(C3979e1.class, e1Var);
    }

    private C3979e1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m16233A() {
        this.zzc = C4214t4.m17155o();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m16234B() {
        this.zzd = C4214t4.m17155o();
    }

    /* renamed from: C */
    private final void m16235C() {
        C3914a5<C4273x0> a5Var = this.zze;
        if (!a5Var.mo12079a()) {
            this.zze = C4214t4.m17147a(a5Var);
        }
    }

    /* renamed from: D */
    private final void m16236D() {
        C3914a5<C3995f1> a5Var = this.zzf;
        if (!a5Var.mo12079a()) {
            this.zzf = C4214t4.m17147a(a5Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16240a(Iterable<? extends Long> iterable) {
        C3930b5 b5Var = this.zzc;
        if (!b5Var.mo12079a()) {
            this.zzc = C4214t4.m17148a(b5Var);
        }
        C3944c3.m16008a(iterable, this.zzc);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m16244b(Iterable<? extends Long> iterable) {
        C3930b5 b5Var = this.zzd;
        if (!b5Var.mo12079a()) {
            this.zzd = C4214t4.m17148a(b5Var);
        }
        C3944c3.m16008a(iterable, this.zzd);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m16246c(Iterable<? extends C4273x0> iterable) {
        m16235C();
        C3944c3.m16008a(iterable, this.zze);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m16247d(int i) {
        m16235C();
        this.zze.remove(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m16249d(Iterable<? extends C3995f1> iterable) {
        m16236D();
        C3944c3.m16008a(iterable, this.zzf);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m16250e(int i) {
        m16236D();
        this.zzf.remove(i);
    }

    /* renamed from: x */
    public static C3980a m16251x() {
        return (C3980a) zzg.mo12812i();
    }

    /* renamed from: y */
    public static C3979e1 m16252y() {
        return zzg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4029h1.f10991a[i - 1]) {
            case 1:
                return new C3979e1();
            case 2:
                return new C3980a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", C4273x0.class, "zzf", C3995f1.class});
            case 4:
                return zzg;
            case 5:
                C4139o6<C3979e1> o6Var = zzh;
                if (o6Var == null) {
                    synchronized (C3979e1.class) {
                        o6Var = zzh;
                        if (o6Var == null) {
                            o6Var = new C4215a<>(zzg);
                            zzh = o6Var;
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
    public final List<Long> mo12367a() {
        return this.zzc;
    }

    /* renamed from: b */
    public final C4273x0 mo12368b(int i) {
        return (C4273x0) this.zze.get(i);
    }

    /* renamed from: c */
    public final C3995f1 mo12369c(int i) {
        return (C3995f1) this.zzf.get(i);
    }

    /* renamed from: q */
    public final int mo12370q() {
        return this.zzc.size();
    }

    /* renamed from: r */
    public final List<Long> mo12371r() {
        return this.zzd;
    }

    /* renamed from: s */
    public final int mo12372s() {
        return this.zzd.size();
    }

    /* renamed from: t */
    public final List<C4273x0> mo12373t() {
        return this.zze;
    }

    /* renamed from: u */
    public final int mo12374u() {
        return this.zze.size();
    }

    /* renamed from: v */
    public final List<C3995f1> mo12375v() {
        return this.zzf;
    }

    /* renamed from: w */
    public final int mo12376w() {
        return this.zzf.size();
    }
}
