package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.List;
import p147g.p156d.p157a.p167b.p173d.p180g.C4042i0.C4043a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4088l0.C4089a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.h0 */
public final class C4027h0 extends C4214t4<C4027h0, C4028a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C4027h0 zzi;
    private static volatile C4139o6<C4027h0> zzj;
    private int zzc;
    private int zzd;
    private C3914a5<C4088l0> zze = C4214t4.m17156p();
    private C3914a5<C4042i0> zzf = C4214t4.m17156p();
    private boolean zzg;
    private boolean zzh;

    /* renamed from: g.d.a.b.d.g.h0$a */
    public static final class C4028a extends C4216b<C4027h0, C4028a> implements C4018g6 {
        private C4028a() {
            super(C4027h0.zzi);
        }

        /* synthetic */ C4028a(C4119n0 n0Var) {
            this();
        }

        /* renamed from: a */
        public final int mo12500a() {
            return ((C4027h0) this.f11313g).mo12497s();
        }

        /* renamed from: a */
        public final C4028a mo12501a(int i, C4043a aVar) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4027h0) this.f11313g).m16445a(i, (C4042i0) ((C4214t4) aVar.mo12346f()));
            return this;
        }

        /* renamed from: a */
        public final C4028a mo12502a(int i, C4089a aVar) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4027h0) this.f11313g).m16446a(i, (C4088l0) ((C4214t4) aVar.mo12346f()));
            return this;
        }

        /* renamed from: a */
        public final C4088l0 mo12503a(int i) {
            return ((C4027h0) this.f11313g).mo12493b(i);
        }

        /* renamed from: b */
        public final C4042i0 mo12504b(int i) {
            return ((C4027h0) this.f11313g).mo12494c(i);
        }

        /* renamed from: p */
        public final int mo12505p() {
            return ((C4027h0) this.f11313g).mo12499u();
        }
    }

    static {
        C4027h0 h0Var = new C4027h0();
        zzi = h0Var;
        C4214t4.m17152a(C4027h0.class, h0Var);
    }

    private C4027h0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16445a(int i, C4042i0 i0Var) {
        i0Var.getClass();
        C3914a5<C4042i0> a5Var = this.zzf;
        if (!a5Var.mo12079a()) {
            this.zzf = C4214t4.m17147a(a5Var);
        }
        this.zzf.set(i, i0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16446a(int i, C4088l0 l0Var) {
        l0Var.getClass();
        C3914a5<C4088l0> a5Var = this.zze;
        if (!a5Var.mo12079a()) {
            this.zze = C4214t4.m17147a(a5Var);
        }
        this.zze.set(i, l0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4119n0.f11128a[i - 1]) {
            case 1:
                return new C4027h0();
            case 2:
                return new C4028a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", C4088l0.class, "zzf", C4042i0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                C4139o6<C4027h0> o6Var = zzj;
                if (o6Var == null) {
                    synchronized (C4027h0.class) {
                        o6Var = zzj;
                        if (o6Var == null) {
                            o6Var = new C4215a<>(zzi);
                            zzj = o6Var;
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
    public final boolean mo12492a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: b */
    public final C4088l0 mo12493b(int i) {
        return (C4088l0) this.zze.get(i);
    }

    /* renamed from: c */
    public final C4042i0 mo12494c(int i) {
        return (C4042i0) this.zzf.get(i);
    }

    /* renamed from: q */
    public final int mo12495q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final List<C4088l0> mo12496r() {
        return this.zze;
    }

    /* renamed from: s */
    public final int mo12497s() {
        return this.zze.size();
    }

    /* renamed from: t */
    public final List<C4042i0> mo12498t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final int mo12499u() {
        return this.zzf.size();
    }
}
