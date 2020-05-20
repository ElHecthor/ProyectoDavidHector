package p147g.p156d.p157a.p167b.p173d.p180g;

import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.x0 */
public final class C4273x0 extends C4214t4<C4273x0, C4274a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C4273x0 zzf;
    private static volatile C4139o6<C4273x0> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    /* renamed from: g.d.a.b.d.g.x0$a */
    public static final class C4274a extends C4216b<C4273x0, C4274a> implements C4018g6 {
        private C4274a() {
            super(C4273x0.zzf);
        }

        /* synthetic */ C4274a(C4029h1 h1Var) {
            this();
        }

        /* renamed from: a */
        public final C4274a mo12904a(int i) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4273x0) this.f11313g).m17516b(i);
            return this;
        }

        /* renamed from: a */
        public final C4274a mo12905a(long j) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4273x0) this.f11313g).m17513a(j);
            return this;
        }
    }

    static {
        C4273x0 x0Var = new C4273x0();
        zzf = x0Var;
        C4214t4.m17152a(C4273x0.class, x0Var);
    }

    private C4273x0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17513a(long j) {
        this.zzc |= 2;
        this.zze = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m17516b(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* renamed from: t */
    public static C4274a m17517t() {
        return (C4274a) zzf.mo12812i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4029h1.f10991a[i - 1]) {
            case 1:
                return new C4273x0();
            case 2:
                return new C4274a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C4139o6<C4273x0> o6Var = zzg;
                if (o6Var == null) {
                    synchronized (C4273x0.class) {
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
    public final boolean mo12900a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: q */
    public final int mo12901q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final boolean mo12902r() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: s */
    public final long mo12903s() {
        return this.zze;
    }
}
