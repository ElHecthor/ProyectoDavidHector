package p147g.p156d.p157a.p167b.p173d.p180g;

import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4215a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;

/* renamed from: g.d.a.b.d.g.r0 */
public final class C4175r0 extends C4214t4<C4175r0, C4176a> implements C4018g6 {
    /* access modifiers changed from: private */
    public static final C4175r0 zzh;
    private static volatile C4139o6<C4175r0> zzi;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    /* renamed from: g.d.a.b.d.g.r0$a */
    public static final class C4176a extends C4216b<C4175r0, C4176a> implements C4018g6 {
        private C4176a() {
            super(C4175r0.zzh);
        }

        /* synthetic */ C4176a(C4244v0 v0Var) {
            this();
        }

        /* renamed from: a */
        public final C4176a mo12734a(String str) {
            if (this.f11314h) {
                mo12817l();
                this.f11314h = false;
            }
            ((C4175r0) this.f11313g).m16965a(str);
            return this;
        }

        /* renamed from: a */
        public final String mo12735a() {
            return ((C4175r0) this.f11313g).mo12729a();
        }

        /* renamed from: p */
        public final boolean mo12736p() {
            return ((C4175r0) this.f11313g).mo12730q();
        }

        /* renamed from: q */
        public final boolean mo12737q() {
            return ((C4175r0) this.f11313g).mo12731r();
        }

        /* renamed from: r */
        public final boolean mo12738r() {
            return ((C4175r0) this.f11313g).mo12732s();
        }

        /* renamed from: s */
        public final int mo12739s() {
            return ((C4175r0) this.f11313g).mo12733t();
        }
    }

    static {
        C4175r0 r0Var = new C4175r0();
        zzh = r0Var;
        C4214t4.m17152a(C4175r0.class, r0Var);
    }

    private C4175r0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16965a(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12055a(int i, Object obj, Object obj2) {
        switch (C4244v0.f11351a[i - 1]) {
            case 1:
                return new C4175r0();
            case 2:
                return new C4176a(null);
            case 3:
                return C4214t4.m17150a((C3985e6) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C4139o6<C4175r0> o6Var = zzi;
                if (o6Var == null) {
                    synchronized (C4175r0.class) {
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
    public final String mo12729a() {
        return this.zzd;
    }

    /* renamed from: q */
    public final boolean mo12730q() {
        return this.zze;
    }

    /* renamed from: r */
    public final boolean mo12731r() {
        return this.zzf;
    }

    /* renamed from: s */
    public final boolean mo12732s() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: t */
    public final int mo12733t() {
        return this.zzg;
    }
}
