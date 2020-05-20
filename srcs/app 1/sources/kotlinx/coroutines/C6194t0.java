package kotlinx.coroutines;

import kotlinx.coroutines.internal.C6143z;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p316w.p318j.p319a.C5890e;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.t0 */
public final class C6194t0<T> extends C6208w0<T> implements C5890e, C5866d<T> {

    /* renamed from: i */
    public Object f15301i = C6204v0.f15315a;

    /* renamed from: j */
    private final C5890e f15302j;

    /* renamed from: k */
    public final Object f15303k;

    /* renamed from: l */
    public final C6012b0 f15304l;

    /* renamed from: m */
    public final C5866d<T> f15305m;

    public C6194t0(C6012b0 b0Var, C5866d<? super T> dVar) {
        C5942k.m22327b(b0Var, "dispatcher");
        C5942k.m22327b(dVar, "continuation");
        super(0);
        this.f15304l = b0Var;
        this.f15305m = dVar;
        C5866d<T> dVar2 = this.f15305m;
        if (!(dVar2 instanceof C5890e)) {
            dVar2 = null;
        }
        this.f15302j = (C5890e) dVar2;
        this.f15303k = C6143z.m23095a(mo15390b());
    }

    /* renamed from: b */
    public C5871g mo15390b() {
        return this.f15305m.mo15390b();
    }

    /* renamed from: b */
    public void mo15391b(Object obj) {
        C5871g b;
        Object b2;
        C5871g b3 = this.f15305m.mo15390b();
        Object a = C6197u.m23230a(obj);
        if (this.f15304l.mo15712b(b3)) {
            this.f15301i = a;
            this.f15319h = 0;
            this.f15304l.mo15711a(b3, this);
            return;
        }
        C6046d1 b4 = C6202u2.f15311b.mo15969b();
        if (b4.mo15767p()) {
            this.f15301i = a;
            this.f15319h = 0;
            b4.mo15763a((C6208w0<?>) this);
            return;
        }
        b4.mo15765b(true);
        try {
            b = mo15390b();
            b2 = C6143z.m23097b(b, this.f15303k);
            this.f15305m.mo15391b(obj);
            C5812t tVar = C5812t.f14872a;
            C6143z.m23096a(b, b2);
            do {
            } while (b4.mo15771t());
        } catch (Throwable th) {
            try {
                mo15987a(th, (Throwable) null);
            } catch (Throwable th2) {
                b4.mo15764a(true);
                throw th2;
            }
        }
        b4.mo15764a(true);
    }

    /* renamed from: c */
    public C5866d<T> mo15942c() {
        return this;
    }

    /* renamed from: d */
    public Object mo15943d() {
        Object obj = this.f15301i;
        if (C6157l0.m23149a()) {
            if (!(obj != C6204v0.f15315a)) {
                throw new AssertionError();
            }
        }
        this.f15301i = C6204v0.f15315a;
        return obj;
    }

    /* renamed from: e */
    public C5890e mo15588e() {
        return this.f15302j;
    }

    /* renamed from: j */
    public StackTraceElement mo15589j() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispatchedContinuation[");
        sb.append(this.f15304l);
        sb.append(", ");
        sb.append(C6161m0.m23158a(this.f15305m));
        sb.append(']');
        return sb.toString();
    }
}
