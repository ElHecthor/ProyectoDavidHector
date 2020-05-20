package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C6157l0;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.k */
public class C6122k {

    /* renamed from: f */
    static final AtomicReferenceFieldUpdater f15218f;

    /* renamed from: g */
    static final AtomicReferenceFieldUpdater f15219g;

    /* renamed from: h */
    private static final AtomicReferenceFieldUpdater f15220h;
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.k$a */
    public static abstract class C6123a extends C6102b {

        /* renamed from: kotlinx.coroutines.internal.k$a$a */
        private static final class C6124a extends C6134q {

            /* renamed from: a */
            public final C6122k f15221a;

            /* renamed from: b */
            public final C6106d<C6122k> f15222b;

            /* renamed from: c */
            public final C6123a f15223c;

            public C6124a(C6122k kVar, C6106d<? super C6122k> dVar, C6123a aVar) {
                C5942k.m22327b(kVar, "next");
                C5942k.m22327b(dVar, "op");
                C5942k.m22327b(aVar, "desc");
                this.f15221a = kVar;
                this.f15222b = dVar;
                this.f15223c = aVar;
            }

            /* renamed from: a */
            public Object mo15876a(Object obj) {
                if (obj != null) {
                    C6122k kVar = (C6122k) obj;
                    Object b = this.f15223c.mo15908b(kVar, this.f15221a);
                    if (b != null) {
                        if (b == C6121j.f15217c) {
                            if (C6122k.f15218f.compareAndSet(kVar, this, this.f15221a.mo15704v())) {
                                kVar.mo15901p();
                            }
                        } else {
                            this.f15222b.mo15878c(b);
                            C6122k.f15218f.compareAndSet(kVar, this, this.f15221a);
                        }
                        return b;
                    }
                    C6122k.f15218f.compareAndSet(kVar, this, this.f15222b.mo15877a() ? this.f15221a : this.f15222b);
                    return null;
                }
                throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }

        /* renamed from: a */
        public final Object mo15863a(C6106d<?> dVar) {
            C5942k.m22327b(dVar, "op");
            while (true) {
                C6122k a = mo15905a((C6134q) dVar);
                Object obj = a._next;
                if (obj == dVar || dVar.mo15877a()) {
                    return null;
                }
                if (obj instanceof C6134q) {
                    ((C6134q) obj).mo15876a(a);
                } else {
                    Object a2 = mo15664a(a);
                    if (a2 != null) {
                        return a2;
                    }
                    if (mo15907a(a, obj)) {
                        continue;
                    } else if (obj != null) {
                        C6124a aVar = new C6124a((C6122k) obj, dVar, this);
                        if (C6122k.f15218f.compareAndSet(a, obj, aVar)) {
                            Object a3 = aVar.mo15876a(a);
                            if (a3 != C6121j.f15217c) {
                                return a3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract Object mo15664a(C6122k kVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract C6122k mo15904a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract C6122k mo15905a(C6134q qVar);

        /* renamed from: a */
        public final void mo15864a(C6106d<?> dVar, Object obj) {
            C5942k.m22327b(dVar, "op");
            boolean z = obj == null;
            C6122k a = mo15904a();
            if (a != null) {
                C6122k b = mo15909b();
                if (b != 0) {
                    if (C6122k.f15218f.compareAndSet(a, dVar, z ? mo15910c(a, b) : b) && z) {
                        mo15906a(a, b);
                    }
                } else if (C6157l0.m23149a() && !(!z)) {
                    throw new AssertionError();
                }
            } else if (C6157l0.m23149a() && !(!z)) {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo15906a(C6122k kVar, C6122k kVar2);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo15907a(C6122k kVar, Object obj);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract Object mo15908b(C6122k kVar, C6122k kVar2);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract C6122k mo15909b();

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract Object mo15910c(C6122k kVar, C6122k kVar2);
    }

    /* renamed from: kotlinx.coroutines.internal.k$b */
    public static abstract class C6125b extends C6106d<C6122k> {

        /* renamed from: b */
        public C6122k f15224b;

        /* renamed from: c */
        public final C6122k f15225c;

        public C6125b(C6122k kVar) {
            C5942k.m22327b(kVar, "newNode");
            this.f15225c = kVar;
        }

        /* renamed from: a */
        public void mo15847a(C6122k kVar, Object obj) {
            C5942k.m22327b(kVar, "affected");
            boolean z = obj == null;
            C6122k kVar2 = z ? this.f15225c : this.f15224b;
            if (kVar2 != null && C6122k.f15218f.compareAndSet(kVar, this, kVar2) && z) {
                C6122k kVar3 = this.f15225c;
                C6122k kVar4 = this.f15224b;
                if (kVar4 != null) {
                    kVar3.m22991d(kVar4);
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.k$c */
    public static class C6126c<T> extends C6123a {

        /* renamed from: b */
        private static final AtomicReferenceFieldUpdater f15226b;

        /* renamed from: c */
        private static final AtomicReferenceFieldUpdater f15227c;
        private volatile Object _affectedNode = null;
        private volatile Object _originalNext = null;

        /* renamed from: a */
        public final C6122k f15228a;

        static {
            Class<Object> cls = Object.class;
            Class<C6126c> cls2 = C6126c.class;
            f15226b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_affectedNode");
            f15227c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_originalNext");
        }

        public C6126c(C6122k kVar) {
            C5942k.m22327b(kVar, "queue");
            this.f15228a = kVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo15664a(C6122k kVar) {
            C5942k.m22327b(kVar, "affected");
            if (kVar == this.f15228a) {
                return C6121j.m22986c();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C6122k mo15904a() {
            return (C6122k) this._affectedNode;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C6122k mo15905a(C6134q qVar) {
            C5942k.m22327b(qVar, "op");
            Object l = this.f15228a.mo15897l();
            if (l != null) {
                return (C6122k) l;
            }
            throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo15906a(C6122k kVar, C6122k kVar2) {
            C5942k.m22327b(kVar, "affected");
            C5942k.m22327b(kVar2, "next");
            kVar.m22992e(kVar2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo15665a(T t) {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo15907a(C6122k kVar, Object obj) {
            C5942k.m22327b(kVar, "affected");
            C5942k.m22327b(obj, "next");
            if (!(obj instanceof C6135r)) {
                return false;
            }
            kVar.mo15901p();
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo15908b(C6122k kVar, C6122k kVar2) {
            C5942k.m22327b(kVar, "affected");
            C5942k.m22327b(kVar2, "next");
            if (C6157l0.m23149a() && !(!(kVar instanceof C6120i))) {
                throw new AssertionError();
            } else if (!mo15665a((T) kVar)) {
                return C6121j.f15217c;
            } else {
                f15226b.compareAndSet(this, null, kVar);
                f15227c.compareAndSet(this, null, kVar2);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final C6122k mo15909b() {
            return (C6122k) this._originalNext;
        }

        /* renamed from: c */
        public final T mo15912c() {
            T a = mo15904a();
            if (a != null) {
                return a;
            }
            C5942k.m22323a();
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final Object mo15910c(C6122k kVar, C6122k kVar2) {
            C5942k.m22327b(kVar, "affected");
            C5942k.m22327b(kVar2, "next");
            return kVar2.mo15704v();
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C6122k> cls2 = C6122k.class;
        f15218f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f15219g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f15220h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* renamed from: a */
    private final C6122k m22987a(C6122k kVar, C6134q qVar) {
        Object obj;
        while (true) {
            C6122k kVar2 = null;
            while (true) {
                obj = kVar._next;
                if (obj == qVar) {
                    return kVar;
                }
                if (obj instanceof C6134q) {
                    ((C6134q) obj).mo15876a(kVar);
                } else if (!(obj instanceof C6135r)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof C6135r) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj != null) {
                            kVar2 = kVar;
                            kVar = (C6122k) obj;
                        } else {
                            throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } else if (obj2 == kVar) {
                        return null;
                    } else {
                        if (f15219g.compareAndSet(this, obj2, kVar) && !(kVar._prev instanceof C6135r)) {
                            return null;
                        }
                    }
                } else if (kVar2 != null) {
                    break;
                } else {
                    kVar = C6121j.m22984a(kVar._prev);
                }
            }
            kVar.mo15703u();
            f15218f.compareAndSet(kVar2, kVar, ((C6135r) obj).f15243a);
            kVar = kVar2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m22991d(C6122k kVar) {
        Object obj;
        do {
            obj = kVar._prev;
            if ((obj instanceof C6135r) || mo15897l() != kVar) {
                return;
            }
        } while (!f15219g.compareAndSet(kVar, obj, this));
        if (!(mo15897l() instanceof C6135r)) {
            return;
        }
        if (obj != null) {
            kVar.m22987a((C6122k) obj, (C6134q) null);
            return;
        }
        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m22992e(C6122k kVar) {
        mo15901p();
        kVar.m22987a(C6121j.m22984a(this._prev), (C6134q) null);
    }

    /* renamed from: t */
    private final C6122k mo15676t() {
        C6122k kVar = this;
        while (!(kVar instanceof C6120i)) {
            kVar = kVar.mo15898m();
            if (C6157l0.m23149a()) {
                if (!(kVar != this)) {
                    throw new AssertionError();
                }
            }
        }
        return kVar;
    }

    /* renamed from: u */
    private final C6122k mo15703u() {
        Object obj;
        C6122k kVar;
        do {
            obj = this._prev;
            if (obj instanceof C6135r) {
                return ((C6135r) obj).f15243a;
            }
            if (obj == this) {
                kVar = mo15676t();
            } else if (obj != null) {
                kVar = (C6122k) obj;
            } else {
                throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f15219g.compareAndSet(this, obj, kVar.mo15704v()));
        return (C6122k) obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final C6135r mo15704v() {
        C6135r rVar = (C6135r) this._removedRef;
        if (rVar != null) {
            return rVar;
        }
        C6135r rVar2 = new C6135r(this);
        f15220h.lazySet(this, rVar2);
        return rVar2;
    }

    /* renamed from: a */
    public final int mo15893a(C6122k kVar, C6122k kVar2, C6125b bVar) {
        C5942k.m22327b(kVar, "node");
        C5942k.m22327b(kVar2, "next");
        C5942k.m22327b(bVar, "condAdd");
        f15219g.lazySet(kVar, this);
        f15218f.lazySet(kVar, kVar2);
        bVar.f15224b = kVar2;
        if (!f15218f.compareAndSet(this, kVar2, bVar)) {
            return 0;
        }
        return bVar.mo15876a(this) == null ? 1 : 2;
    }

    /* renamed from: a */
    public final void mo15894a(C6122k kVar) {
        Object n;
        C5942k.m22327b(kVar, "node");
        do {
            n = mo15899n();
            if (n == null) {
                throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!((C6122k) n).mo15895a(kVar, this));
    }

    /* renamed from: a */
    public final boolean mo15895a(C6122k kVar, C6122k kVar2) {
        C5942k.m22327b(kVar, "node");
        C5942k.m22327b(kVar2, "next");
        f15219g.lazySet(kVar, this);
        f15218f.lazySet(kVar, kVar2);
        if (!f15218f.compareAndSet(this, kVar2, kVar)) {
            return false;
        }
        kVar.m22991d(kVar2);
        return true;
    }

    /* renamed from: b */
    public final boolean mo15896b(C6122k kVar) {
        C5942k.m22327b(kVar, "node");
        f15219g.lazySet(kVar, this);
        f15218f.lazySet(kVar, this);
        while (mo15897l() == this) {
            if (f15218f.compareAndSet(this, this, kVar)) {
                kVar.m22991d(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final Object mo15897l() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C6134q)) {
                return obj;
            }
            ((C6134q) obj).mo15876a(this);
        }
    }

    /* renamed from: m */
    public final C6122k mo15898m() {
        return C6121j.m22984a(mo15897l());
    }

    /* renamed from: n */
    public final Object mo15899n() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof C6135r) {
                return obj;
            }
            if (obj != null) {
                C6122k kVar = (C6122k) obj;
                if (kVar.mo15897l() == this) {
                    return obj;
                }
                m22987a(kVar, (C6134q) null);
            } else {
                throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    /* renamed from: o */
    public final C6122k mo15900o() {
        return C6121j.m22984a(mo15899n());
    }

    /* renamed from: p */
    public final void mo15901p() {
        Object l;
        C6122k u = mo15703u();
        Object obj = this._next;
        if (obj != null) {
            C6122k kVar = ((C6135r) obj).f15243a;
            while (true) {
                C6122k kVar2 = null;
                while (true) {
                    Object l2 = kVar.mo15897l();
                    if (l2 instanceof C6135r) {
                        kVar.mo15703u();
                        kVar = ((C6135r) l2).f15243a;
                    } else {
                        l = u.mo15897l();
                        if (l instanceof C6135r) {
                            if (kVar2 != null) {
                                break;
                            }
                            u = C6121j.m22984a(u._prev);
                        } else if (l != this) {
                            if (l != null) {
                                C6122k kVar3 = (C6122k) l;
                                if (kVar3 != kVar) {
                                    C6122k kVar4 = kVar3;
                                    kVar2 = u;
                                    u = kVar4;
                                } else {
                                    return;
                                }
                            } else {
                                throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                            }
                        } else if (f15218f.compareAndSet(u, this, kVar)) {
                            return;
                        }
                    }
                }
                u.mo15703u();
                f15218f.compareAndSet(kVar2, u, ((C6135r) l).f15243a);
                u = kVar2;
            }
        } else {
            throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
        }
    }

    /* renamed from: q */
    public final void mo15902q() {
        Object l = mo15897l();
        if (!(l instanceof C6135r)) {
            l = null;
        }
        C6135r rVar = (C6135r) l;
        if (rVar != null) {
            m22992e(rVar.f15243a);
            return;
        }
        throw new IllegalStateException("Must be invoked on a removed node".toString());
    }

    /* renamed from: r */
    public final boolean mo15903r() {
        return mo15897l() instanceof C6135r;
    }

    /* renamed from: s */
    public boolean mo15892s() {
        Object l;
        C6122k kVar;
        do {
            l = mo15897l();
            if ((l instanceof C6135r) || l == this) {
                return false;
            }
            if (l != null) {
                kVar = (C6122k) l;
            } else {
                throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f15218f.compareAndSet(this, l, kVar.mo15704v()));
        m22992e(kVar);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}
