package p350n;

import p308k.C5812t;
import p308k.p323z.p325d.C5942k;

/* renamed from: n.u */
public final class C6502u {

    /* renamed from: a */
    private static C6500t f16135a;

    /* renamed from: b */
    private static long f16136b;

    /* renamed from: c */
    public static final C6502u f16137c = new C6502u();

    private C6502u() {
    }

    /* renamed from: a */
    public final C6500t mo16920a() {
        synchronized (this) {
            C6500t tVar = f16135a;
            if (tVar == null) {
                return new C6500t();
            }
            f16135a = tVar.f16133f;
            tVar.f16133f = null;
            f16136b -= (long) 8192;
            return tVar;
        }
    }

    /* renamed from: a */
    public final void mo16921a(C6500t tVar) {
        C5942k.m22327b(tVar, "segment");
        if (!(tVar.f16133f == null && tVar.f16134g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!tVar.f16131d) {
            synchronized (this) {
                long j = (long) 8192;
                if (f16136b + j <= 65536) {
                    f16136b += j;
                    tVar.f16133f = f16135a;
                    tVar.f16130c = 0;
                    tVar.f16129b = 0;
                    f16135a = tVar;
                    C5812t tVar2 = C5812t.f14872a;
                }
            }
        }
    }
}
