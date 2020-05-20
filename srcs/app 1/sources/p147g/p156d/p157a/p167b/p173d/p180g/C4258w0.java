package p147g.p156d.p157a.p167b.p173d.p180g;

import p147g.p156d.p157a.p167b.p173d.p180g.C3979e1.C3980a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.w0 */
public final class C4258w0 extends C4214t4<C4258w0, C4259a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C4258w0 zzh;
    private static volatile C4139o6<C4258w0> zzi;
    private int zzc;
    private int zzd;
    private C3979e1 zze;
    private C3979e1 zzf;
    private boolean zzg;

    /* renamed from: g.d.a.b.d.g.w0$a */
    public static final class C4259a extends C4216b<C4258w0, C4259a> implements C4018g6 {
        private C4259a() {
            super(C4258w0.zzh);
        }

        /* synthetic */ C4259a(C4029h1 h1Var) {
            this();
        }

        /* renamed from: a */
        public final C4259a mo12881a(int i) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4258w0) this.f11313g).m17420b(i);
            return this;
        }

        /* renamed from: a */
        public final C4259a mo12882a(C3980a aVar) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4258w0) this.f11313g).m17415a((C3979e1) ((C4214t4) aVar.mo12346f()));
            return this;
        }

        /* renamed from: a */
        public final C4259a mo12883a(C3979e1 e1Var) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4258w0) this.f11313g).m17421b(e1Var);
            return this;
        }

        /* renamed from: a */
        public final C4259a mo12884a(boolean z) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4258w0) this.f11313g).m17419a(z);
            return this;
        }
    }

    static {
        C4258w0 w0Var = new C4258w0();
        zzh = w0Var;
        C4214t4.m17152a(C4258w0.class, w0Var);
    }

    private C4258w0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17415a(C3979e1 e1Var) {
        e1Var.getClass();
        this.zze = e1Var;
        this.zzc |= 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17419a(boolean z) {
        this.zzc |= 8;
        this.zzg = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m17420b(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m17421b(C3979e1 e1Var) {
        e1Var.getClass();
        this.zzf = e1Var;
        this.zzc |= 4;
    }

    /* renamed from: w */
    public static C4259a m17423w() {
        return (C4259a) zzh.mo12812i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4029h1.f10991a[i - 1]) {
            case 1:
                return new C4258w0();
            case 2:
                return new C4259a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C4139o6<C4258w0> o6Var = zzi;
                if (o6Var == null) {
                    synchronized (C4258w0.class) {
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
    public final boolean mo12874a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: q */
    public final int mo12875q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final C3979e1 mo12876r() {
        C3979e1 e1Var = this.zze;
        return e1Var == null ? C3979e1.m16252y() : e1Var;
    }

    /* renamed from: s */
    public final boolean mo12877s() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: t */
    public final C3979e1 mo12878t() {
        C3979e1 e1Var = this.zzf;
        return e1Var == null ? C3979e1.m16252y() : e1Var;
    }

    /* renamed from: u */
    public final boolean mo12879u() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: v */
    public final boolean mo12880v() {
        return this.zzg;
    }
}
