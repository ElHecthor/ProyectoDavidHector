package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.List;
import p147g.p156d.p157a.p167b.p173d.p180g.C3941c1.C3942a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.b1 */
public final class C3925b1 extends C4214t4<C3925b1, C3926a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C3925b1 zzd;
    private static volatile C4139o6<C3925b1> zze;
    private C3914a5<C3941c1> zzc = C4214t4.m17156p();

    /* renamed from: g.d.a.b.d.g.b1$a */
    public static final class C3926a extends C4216b<C3925b1, C3926a> implements C4018g6 {
        private C3926a() {
            super(C3925b1.zzd);
        }

        /* synthetic */ C3926a(C4029h1 h1Var) {
            this();
        }

        /* renamed from: a */
        public final C3926a mo12104a(C3942a aVar) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C3925b1) this.f11313g).m15742a((C3941c1) ((C4214t4) aVar.mo12346f()));
            return this;
        }

        /* renamed from: a */
        public final C3941c1 mo12105a(int i) {
            return ((C3925b1) this.f11313g).mo12103b(0);
        }
    }

    static {
        C3925b1 b1Var = new C3925b1();
        zzd = b1Var;
        C4214t4.m17152a(C3925b1.class, b1Var);
    }

    private C3925b1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15742a(C3941c1 c1Var) {
        c1Var.getClass();
        C3914a5<C3941c1> a5Var = this.zzc;
        if (!a5Var.mo12079a()) {
            this.zzc = C4214t4.m17147a(a5Var);
        }
        this.zzc.add(c1Var);
    }

    /* renamed from: q */
    public static C3926a m15743q() {
        return (C3926a) zzd.mo12812i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4029h1.f10991a[i - 1]) {
            case 1:
                return new C3925b1();
            case 2:
                return new C3926a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C3941c1.class});
            case 4:
                return zzd;
            case 5:
                C4139o6<C3925b1> o6Var = zze;
                if (o6Var == null) {
                    synchronized (C3925b1.class) {
                        o6Var = zze;
                        if (o6Var == null) {
                            o6Var = new C4215a<>(zzd);
                            zze = o6Var;
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
    public final List<C3941c1> mo12102a() {
        return this.zzc;
    }

    /* renamed from: b */
    public final C3941c1 mo12103b(int i) {
        return (C3941c1) this.zzc.get(0);
    }
}
