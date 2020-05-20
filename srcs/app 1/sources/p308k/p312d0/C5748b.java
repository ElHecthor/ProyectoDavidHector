package p308k.p312d0;

import java.util.Iterator;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.d0.b */
public final class C5748b<T> implements C5751d<T>, C5750c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5751d<T> f14819a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f14820b;

    /* renamed from: k.d0.b$a */
    public static final class C5749a implements Iterator<T>, C5954a {

        /* renamed from: f */
        private final Iterator<T> f14821f;

        /* renamed from: g */
        private int f14822g;

        C5749a(C5748b bVar) {
            this.f14821f = bVar.f14819a.iterator();
            this.f14822g = bVar.f14820b;
        }

        /* renamed from: b */
        private final void m21881b() {
            while (this.f14822g > 0 && this.f14821f.hasNext()) {
                this.f14821f.next();
                this.f14822g--;
            }
        }

        public boolean hasNext() {
            m21881b();
            return this.f14821f.hasNext();
        }

        public T next() {
            m21881b();
            return this.f14821f.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5748b(C5751d<? extends T> dVar, int i) {
        C5942k.m22327b(dVar, "sequence");
        this.f14819a = dVar;
        this.f14820b = i;
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("count must be non-negative, but was ");
            sb.append(this.f14820b);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    /* renamed from: a */
    public C5751d<T> mo15384a(int i) {
        int i2 = this.f14820b + i;
        return i2 < 0 ? new C5748b(this, i) : new C5748b(this.f14819a, i2);
    }

    public Iterator<T> iterator() {
        return new C5749a(this);
    }
}
