package p308k;

import java.io.Serializable;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.o */
final class C5807o<T> implements C5797g<T>, Serializable {

    /* renamed from: f */
    private C5907a<? extends T> f14868f;

    /* renamed from: g */
    private volatile Object f14869g;

    /* renamed from: h */
    private final Object f14870h;

    public C5807o(C5907a<? extends T> aVar, Object obj) {
        C5942k.m22327b(aVar, "initializer");
        this.f14868f = aVar;
        this.f14869g = C5810r.f14871a;
        if (obj == 0) {
            obj = this;
        }
        this.f14870h = obj;
    }

    public /* synthetic */ C5807o(C5907a aVar, Object obj, int i, C5938g gVar) {
        if ((i & 2) != 0) {
            obj = null;
        }
        this(aVar, obj);
    }

    private final Object writeReplace() {
        return new C5746d(getValue());
    }

    /* renamed from: a */
    public boolean mo15428a() {
        return this.f14869g != C5810r.f14871a;
    }

    public T getValue() {
        T t;
        T t2 = this.f14869g;
        if (t2 != C5810r.f14871a) {
            return t2;
        }
        synchronized (this.f14870h) {
            t = this.f14869g;
            if (t == C5810r.f14871a) {
                C5907a<? extends T> aVar = this.f14868f;
                if (aVar != null) {
                    t = aVar.invoke();
                    this.f14869g = t;
                    this.f14868f = null;
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            }
        }
        return t;
    }

    public String toString() {
        return mo15428a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
