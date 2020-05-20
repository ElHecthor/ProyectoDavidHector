package androidx.room;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.C6199u1;
import kotlinx.coroutines.C6199u1.C6200a;
import p308k.p316w.C5867e;
import p308k.p316w.C5871g;
import p308k.p316w.C5871g.C5874b;
import p308k.p316w.C5871g.C5874b.C5875a;
import p308k.p316w.C5871g.C5876c;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: androidx.room.u */
public final class C0737u implements C5874b {

    /* renamed from: i */
    public static final C0738a f2903i = new C0738a(null);

    /* renamed from: f */
    private final AtomicInteger f2904f = new AtomicInteger(0);

    /* renamed from: g */
    private final C6199u1 f2905g;

    /* renamed from: h */
    private final C5867e f2906h;

    /* renamed from: androidx.room.u$a */
    public static final class C0738a implements C5876c<C0737u> {
        private C0738a() {
        }

        public /* synthetic */ C0738a(C5938g gVar) {
            this();
        }
    }

    public C0737u(C6199u1 u1Var, C5867e eVar) {
        C5942k.m22327b(u1Var, "transactionThreadControlJob");
        C5942k.m22327b(eVar, "transactionDispatcher");
        this.f2905g = u1Var;
        this.f2906h = eVar;
    }

    /* renamed from: b */
    public final void mo4130b() {
        this.f2904f.incrementAndGet();
    }

    /* renamed from: c */
    public final C5867e mo4131c() {
        return this.f2906h;
    }

    /* renamed from: d */
    public final void mo4132d() {
        int decrementAndGet = this.f2904f.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        } else if (decrementAndGet == 0) {
            C6200a.m23248a(this.f2905g, null, 1, null);
        }
    }

    public <R> R fold(R r, C5922p<? super R, ? super C5874b, ? extends R> pVar) {
        C5942k.m22327b(pVar, "operation");
        return C5875a.m22235a(this, r, pVar);
    }

    public <E extends C5874b> E get(C5876c<E> cVar) {
        C5942k.m22327b(cVar, "key");
        return C5875a.m22236a((C5874b) this, cVar);
    }

    public C5876c<C0737u> getKey() {
        return f2903i;
    }

    public C5871g minusKey(C5876c<?> cVar) {
        C5942k.m22327b(cVar, "key");
        return C5875a.m22238b(this, cVar);
    }

    public C5871g plus(C5871g gVar) {
        C5942k.m22327b(gVar, "context");
        return C5875a.m22237a((C5874b) this, gVar);
    }
}
