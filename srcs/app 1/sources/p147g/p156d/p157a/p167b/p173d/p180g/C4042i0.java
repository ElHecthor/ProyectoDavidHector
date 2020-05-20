package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.List;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.i0 */
public final class C4042i0 extends C4214t4<C4042i0, C4043a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C4042i0 zzl;
    private static volatile C4139o6<C4042i0> zzm;
    private int zzc;
    private int zzd;
    private String zze = "";
    private C3914a5<C4057j0> zzf = C4214t4.m17156p();
    private boolean zzg;
    private C4072k0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* renamed from: g.d.a.b.d.g.i0$a */
    public static final class C4043a extends C4216b<C4042i0, C4043a> implements C4018g6 {
        private C4043a() {
            super(C4042i0.zzl);
        }

        /* synthetic */ C4043a(C4119n0 n0Var) {
            this();
        }

        /* renamed from: a */
        public final C4043a mo12532a(int i, C4057j0 j0Var) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4042i0) this.f11313g).m16507a(i, j0Var);
            return this;
        }

        /* renamed from: a */
        public final C4043a mo12533a(String str) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4042i0) this.f11313g).m16510a(str);
            return this;
        }

        /* renamed from: a */
        public final C4057j0 mo12534a(int i) {
            return ((C4042i0) this.f11313g).mo12521b(i);
        }

        /* renamed from: a */
        public final String mo12535a() {
            return ((C4042i0) this.f11313g).mo12523r();
        }

        /* renamed from: p */
        public final int mo12536p() {
            return ((C4042i0) this.f11313g).mo12525t();
        }
    }

    static {
        C4042i0 i0Var = new C4042i0();
        zzl = i0Var;
        C4214t4.m17152a(C4042i0.class, i0Var);
    }

    private C4042i0() {
    }

    /* renamed from: A */
    public static C4043a m16505A() {
        return (C4043a) zzl.mo12812i();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16507a(int i, C4057j0 j0Var) {
        j0Var.getClass();
        C3914a5<C4057j0> a5Var = this.zzf;
        if (!a5Var.mo12079a()) {
            this.zzf = C4214t4.m17147a(a5Var);
        }
        this.zzf.set(i, j0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16510a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4119n0.f11128a[i - 1]) {
            case 1:
                return new C4042i0();
            case 2:
                return new C4043a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", C4057j0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                C4139o6<C4042i0> o6Var = zzm;
                if (o6Var == null) {
                    synchronized (C4042i0.class) {
                        o6Var = zzm;
                        if (o6Var == null) {
                            o6Var = new C4215a<>(zzl);
                            zzm = o6Var;
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
    public final boolean mo12520a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: b */
    public final C4057j0 mo12521b(int i) {
        return (C4057j0) this.zzf.get(i);
    }

    /* renamed from: q */
    public final int mo12522q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final String mo12523r() {
        return this.zze;
    }

    /* renamed from: s */
    public final List<C4057j0> mo12524s() {
        return this.zzf;
    }

    /* renamed from: t */
    public final int mo12525t() {
        return this.zzf.size();
    }

    /* renamed from: u */
    public final boolean mo12526u() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: v */
    public final C4072k0 mo12527v() {
        C4072k0 k0Var = this.zzh;
        return k0Var == null ? C4072k0.m16678z() : k0Var;
    }

    /* renamed from: w */
    public final boolean mo12528w() {
        return this.zzi;
    }

    /* renamed from: x */
    public final boolean mo12529x() {
        return this.zzj;
    }

    /* renamed from: y */
    public final boolean mo12530y() {
        return (this.zzc & 64) != 0;
    }

    /* renamed from: z */
    public final boolean mo12531z() {
        return this.zzk;
    }
}
