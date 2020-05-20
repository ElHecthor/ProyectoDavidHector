package p308k.p312d0;

import java.util.Iterator;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.d0.m */
public final class C5763m<T, R> implements C5751d<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5751d<T> f14830a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5918l<T, R> f14831b;

    /* renamed from: k.d0.m$a */
    public static final class C5764a implements Iterator<R>, C5954a {

        /* renamed from: f */
        private final Iterator<T> f14832f;

        /* renamed from: g */
        final /* synthetic */ C5763m f14833g;

        C5764a(C5763m mVar) {
            this.f14833g = mVar;
            this.f14832f = mVar.f14830a.iterator();
        }

        public boolean hasNext() {
            return this.f14832f.hasNext();
        }

        public R next() {
            return this.f14833g.f14831b.mo4090d(this.f14832f.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5763m(C5751d<? extends T> dVar, C5918l<? super T, ? extends R> lVar) {
        C5942k.m22327b(dVar, "sequence");
        C5942k.m22327b(lVar, "transformer");
        this.f14830a = dVar;
        this.f14831b = lVar;
    }

    public Iterator<R> iterator() {
        return new C5764a(this);
    }
}
