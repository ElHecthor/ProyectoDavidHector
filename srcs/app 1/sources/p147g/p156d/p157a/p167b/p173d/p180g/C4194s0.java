package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Collections;
import java.util.List;
import p147g.p156d.p157a.p167b.p173d.p180g.C4175r0.C4176a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.s0 */
public final class C4194s0 extends C4214t4<C4194s0, C4195a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C4194s0 zzl;
    private static volatile C4139o6<C4194s0> zzm;
    private int zzc;
    private long zzd;
    private String zze;
    private int zzf;
    private C3914a5<C4209t0> zzg = C4214t4.m17156p();
    private C3914a5<C4175r0> zzh = C4214t4.m17156p();
    private C3914a5<C4027h0> zzi = C4214t4.m17156p();
    private String zzj;
    private boolean zzk;

    /* renamed from: g.d.a.b.d.g.s0$a */
    public static final class C4195a extends C4216b<C4194s0, C4195a> implements C4018g6 {
        private C4195a() {
            super(C4194s0.zzl);
        }

        /* synthetic */ C4195a(C4244v0 v0Var) {
            this();
        }

        /* renamed from: a */
        public final int mo12770a() {
            return ((C4194s0) this.f11313g).mo12767u();
        }

        /* renamed from: a */
        public final C4175r0 mo12771a(int i) {
            return ((C4194s0) this.f11313g).mo12762b(i);
        }

        /* renamed from: a */
        public final C4195a mo12772a(int i, C4176a aVar) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4194s0) this.f11313g).m17076a(i, (C4175r0) ((C4214t4) aVar.mo12346f()));
            return this;
        }

        /* renamed from: p */
        public final List<C4027h0> mo12773p() {
            return Collections.unmodifiableList(((C4194s0) this.f11313g).mo12768v());
        }

        /* renamed from: q */
        public final C4195a mo12774q() {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4194s0) this.f11313g).m17075A();
            return this;
        }
    }

    static {
        C4194s0 s0Var = new C4194s0();
        zzl = s0Var;
        C4214t4.m17152a(C4194s0.class, s0Var);
    }

    private C4194s0() {
        String str = "";
        this.zze = str;
        this.zzj = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m17075A() {
        this.zzi = C4214t4.m17156p();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17076a(int i, C4175r0 r0Var) {
        r0Var.getClass();
        C3914a5<C4175r0> a5Var = this.zzh;
        if (!a5Var.mo12079a()) {
            this.zzh = C4214t4.m17147a(a5Var);
        }
        this.zzh.set(i, r0Var);
    }

    /* renamed from: x */
    public static C4195a m17079x() {
        return (C4195a) zzl.mo12812i();
    }

    /* renamed from: y */
    public static C4194s0 m17080y() {
        return zzl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4244v0.f11351a[i - 1]) {
            case 1:
                return new C4194s0();
            case 2:
                return new C4195a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", C4209t0.class, "zzh", C4175r0.class, "zzi", C4027h0.class, "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                C4139o6<C4194s0> o6Var = zzm;
                if (o6Var == null) {
                    synchronized (C4194s0.class) {
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
    public final boolean mo12761a() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: b */
    public final C4175r0 mo12762b(int i) {
        return (C4175r0) this.zzh.get(i);
    }

    /* renamed from: q */
    public final long mo12763q() {
        return this.zzd;
    }

    /* renamed from: r */
    public final boolean mo12764r() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: s */
    public final String mo12765s() {
        return this.zze;
    }

    /* renamed from: t */
    public final List<C4209t0> mo12766t() {
        return this.zzg;
    }

    /* renamed from: u */
    public final int mo12767u() {
        return this.zzh.size();
    }

    /* renamed from: v */
    public final List<C4027h0> mo12768v() {
        return this.zzi;
    }

    /* renamed from: w */
    public final boolean mo12769w() {
        return this.zzk;
    }
}
