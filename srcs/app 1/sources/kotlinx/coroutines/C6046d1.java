package kotlinx.coroutines;

import kotlinx.coroutines.internal.C6100a;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.d1 */
public abstract class C6046d1 extends C6012b0 {

    /* renamed from: f */
    private long f15095f;

    /* renamed from: g */
    private boolean f15096g;

    /* renamed from: h */
    private C6100a<C6208w0<?>> f15097h;

    /* renamed from: a */
    public static /* synthetic */ void m22719a(C6046d1 d1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            d1Var.mo15764a(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    /* renamed from: b */
    public static /* synthetic */ void m22720b(C6046d1 d1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            d1Var.mo15765b(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: c */
    private final long m22721c(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: a */
    public final void mo15763a(C6208w0<?> w0Var) {
        C5942k.m22327b(w0Var, "task");
        C6100a<C6208w0<?>> aVar = this.f15097h;
        if (aVar == null) {
            aVar = new C6100a<>();
            this.f15097h = aVar;
        }
        aVar.mo15859a(w0Var);
    }

    /* renamed from: a */
    public final void mo15764a(boolean z) {
        long c = this.f15095f - m22721c(z);
        this.f15095f = c;
        if (c <= 0) {
            if (C6157l0.m23149a()) {
                if (!(this.f15095f == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f15096g) {
                shutdown();
            }
        }
    }

    /* renamed from: b */
    public final void mo15765b(boolean z) {
        this.f15095f += m22721c(z);
        if (!z) {
            this.f15096g = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public long mo15766o() {
        C6100a<C6208w0<?>> aVar = this.f15097h;
        return (aVar == null || aVar.mo15860a()) ? Long.MAX_VALUE : 0;
    }

    /* renamed from: p */
    public final boolean mo15767p() {
        return this.f15095f >= m22721c(true);
    }

    /* renamed from: q */
    public final boolean mo15768q() {
        C6100a<C6208w0<?>> aVar = this.f15097h;
        if (aVar != null) {
            return aVar.mo15860a();
        }
        return true;
    }

    /* renamed from: s */
    public long mo15769s() {
        if (!mo15771t()) {
            return Long.MAX_VALUE;
        }
        return mo15766o();
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
    }

    /* renamed from: t */
    public final boolean mo15771t() {
        C6100a<C6208w0<?>> aVar = this.f15097h;
        if (aVar != null) {
            C6208w0 w0Var = (C6208w0) aVar.mo15861b();
            if (w0Var != null) {
                w0Var.run();
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    public boolean mo15772u() {
        return false;
    }
}
