package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.c */
final class C6038c<T> extends C5957a<T> {

    /* renamed from: i */
    private final Thread f15087i;

    /* renamed from: j */
    private final C6046d1 f15088j;

    public C6038c(C5871g gVar, Thread thread, C6046d1 d1Var) {
        C5942k.m22327b(gVar, "parentContext");
        C5942k.m22327b(thread, "blockedThread");
        super(gVar, true);
        this.f15087i = thread;
        this.f15088j = d1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15722a(Object obj, int i) {
        if (!C5942k.m22326a((Object) Thread.currentThread(), (Object) this.f15087i)) {
            LockSupport.unpark(this.f15087i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo15745o() {
        return true;
    }

    /* renamed from: v */
    public final T mo15760v() {
        C6206v2 a = C6210w2.m23278a();
        if (a != null) {
            a.mo15981b();
        }
        try {
            C6046d1 d1Var = this.f15088j;
            T t = null;
            if (d1Var != null) {
                C6046d1.m22720b(d1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                C6046d1 d1Var2 = this.f15088j;
                long s = d1Var2 != null ? d1Var2.mo15769s() : Long.MAX_VALUE;
                if (mo15744n()) {
                    C6046d1 d1Var3 = this.f15088j;
                    if (d1Var3 != null) {
                        C6046d1.m22719a(d1Var3, false, 1, null);
                    }
                    C6206v2 a2 = C6210w2.m23278a();
                    if (a2 != null) {
                        a2.mo15983d();
                    }
                    T b = C6041c2.m22707b(mo15743m());
                    if (b instanceof C6193t) {
                        t = b;
                    }
                    C6193t tVar = (C6193t) t;
                    if (tVar == null) {
                        return b;
                    }
                    throw tVar.f15300a;
                }
                C6206v2 a3 = C6210w2.m23278a();
                if (a3 != null) {
                    a3.mo15979a(this, s);
                } else {
                    LockSupport.parkNanos(this, s);
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            mo15730c((Throwable) interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            C6206v2 a4 = C6210w2.m23278a();
            if (a4 != null) {
                a4.mo15983d();
            }
            throw th;
        }
    }
}
