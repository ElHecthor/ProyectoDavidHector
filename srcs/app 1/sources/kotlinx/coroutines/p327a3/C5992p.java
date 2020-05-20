package kotlinx.coroutines.p327a3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C6157l0;
import kotlinx.coroutines.internal.C6139v;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5953v;

/* renamed from: kotlinx.coroutines.a3.p */
public final class C5992p<E> implements C5981f<E> {

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f15000f;

    /* renamed from: g */
    private static final AtomicIntegerFieldUpdater f15001g;

    /* renamed from: h */
    private static final AtomicReferenceFieldUpdater f15002h;

    /* renamed from: i */
    private static final C5993a f15003i = new C5993a(null);

    /* renamed from: j */
    private static final C6139v f15004j;

    /* renamed from: k */
    private static final C5995c<Object> f15005k;
    private volatile Object _state = f15005k;
    private volatile int _updating = 0;
    private volatile Object onCloseHandler = null;

    /* renamed from: kotlinx.coroutines.a3.p$a */
    private static final class C5993a {

        /* renamed from: a */
        public final Throwable f15006a;

        public C5993a(Throwable th) {
            this.f15006a = th;
        }

        /* renamed from: a */
        public final Throwable mo15705a() {
            Throwable th = this.f15006a;
            return th != null ? th : new C5991o("Channel was closed");
        }
    }

    /* renamed from: kotlinx.coroutines.a3.p$b */
    private static final class C5994b {
        private C5994b() {
        }

        public /* synthetic */ C5994b(C5938g gVar) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.a3.p$c */
    private static final class C5995c<E> {

        /* renamed from: a */
        public final Object f15007a;

        /* renamed from: b */
        public final C5996d<E>[] f15008b;

        public C5995c(Object obj, C5996d<E>[] dVarArr) {
            this.f15007a = obj;
            this.f15008b = dVarArr;
        }
    }

    /* renamed from: kotlinx.coroutines.a3.p$d */
    private static final class C5996d<E> extends C5997q<E> implements C6003w<E> {

        /* renamed from: h */
        private final C5992p<E> f15009h;

        public C5996d(C5992p<E> pVar) {
            C5942k.m22327b(pVar, "broadcastChannel");
            this.f15009h = pVar;
        }

        /* renamed from: a */
        public Object mo15677a(E e) {
            return super.mo15677a(e);
        }

        /* renamed from: b */
        public boolean mo15645b(Throwable th) {
            boolean a = mo15671a(th);
            if (a) {
                this.f15009h.m22523a(this);
            }
            return a;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C5992p> cls2 = C5992p.class;
        new C5994b(null);
        C6139v vVar = new C6139v("UNDEFINED");
        f15004j = vVar;
        f15005k = new C5995c<>(vVar, null);
        f15000f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        f15001g = AtomicIntegerFieldUpdater.newUpdater(cls2, "_updating");
        f15002h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "onCloseHandler");
    }

    /* renamed from: a */
    private final C5993a m22522a(E e) {
        Object obj;
        if (!f15001g.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof C5993a) {
                    C5993a aVar = (C5993a) obj;
                    this._updating = 0;
                    return aVar;
                } else if (!(obj instanceof C5995c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid state ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString().toString());
                } else if (obj != null) {
                } else {
                    throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                }
            } finally {
                this._updating = 0;
            }
        } while (!f15000f.compareAndSet(this, obj, new C5995c(e, ((C5995c) obj).f15008b)));
        C5996d<E>[] dVarArr = ((C5995c) obj).f15008b;
        if (dVarArr != null) {
            for (C5996d<E> a : dVarArr) {
                a.mo15677a(e);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22523a(C5996d<E> dVar) {
        Object obj;
        Object obj2;
        C5996d<E>[] dVarArr;
        do {
            obj = this._state;
            if (!(obj instanceof C5993a)) {
                if (obj instanceof C5995c) {
                    C5995c cVar = (C5995c) obj;
                    obj2 = cVar.f15007a;
                    if (obj != null) {
                        dVarArr = cVar.f15008b;
                        if (dVarArr != null) {
                        } else {
                            C5942k.m22323a();
                            throw null;
                        }
                    } else {
                        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid state ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString().toString());
                }
            } else {
                return;
            }
        } while (!f15000f.compareAndSet(this, obj, new C5995c(obj2, m22527b(dVarArr, dVar))));
    }

    /* renamed from: a */
    private final C5996d<E>[] m22525a(C5996d<E>[] dVarArr, C5996d<E> dVar) {
        if (dVarArr != null) {
            return (C5996d[]) C5830g.m22109a((T[]) dVarArr, dVar);
        }
        C5996d<E>[] dVarArr2 = new C5996d[1];
        for (int i = 0; i < 1; i++) {
            dVarArr2[i] = dVar;
        }
        return dVarArr2;
    }

    /* renamed from: b */
    private final void m22526b(Throwable th) {
        Object obj = this.onCloseHandler;
        if (obj != null) {
            Object obj2 = C5970b.f14975h;
            if (obj != obj2 && f15002h.compareAndSet(this, obj, obj2)) {
                C5953v.m22350a(obj, 1);
                ((C5918l) obj).mo4090d(th);
            }
        }
    }

    /* renamed from: b */
    private final C5996d<E>[] m22527b(C5996d<E>[] dVarArr, C5996d<E> dVar) {
        int length = dVarArr.length;
        int c = C5832h.m22121c((T[]) dVarArr, dVar);
        if (C6157l0.m23149a()) {
            if (!(c >= 0)) {
                throw new AssertionError();
            }
        }
        if (length == 1) {
            return null;
        }
        C5996d<E>[] dVarArr2 = new C5996d[(length - 1)];
        C5996d<E>[] dVarArr3 = dVarArr;
        C5996d<E>[] dVarArr4 = dVarArr2;
        C5830g.m22111a((Object[]) dVarArr3, (Object[]) dVarArr4, 0, 0, c, 6, (Object) null);
        C5830g.m22111a((Object[]) dVarArr3, (Object[]) dVarArr4, c, c + 1, 0, 8, (Object) null);
        return dVarArr2;
    }

    /* renamed from: a */
    public Object mo15670a(E e, C5866d<? super C5812t> dVar) {
        C5993a a = m22522a(e);
        if (a == null) {
            return C5812t.f14872a;
        }
        throw a.mo15705a();
    }

    /* renamed from: a */
    public boolean mo15671a(Throwable th) {
        Object obj;
        int i;
        do {
            obj = this._state;
            if (obj instanceof C5993a) {
                return false;
            }
            if (!(obj instanceof C5995c)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid state ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!f15000f.compareAndSet(this, obj, th == null ? f15003i : new C5993a(th)));
        if (obj != null) {
            C5996d<E>[] dVarArr = ((C5995c) obj).f15008b;
            if (dVarArr != null) {
                for (C5996d<E> a : dVarArr) {
                    a.mo15671a(th);
                }
            }
            m22526b(th);
            return true;
        }
        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
    }

    /* renamed from: d */
    public C6003w<E> mo15697d() {
        Object obj;
        C5995c cVar;
        Object obj2;
        C5996d dVar = new C5996d(this);
        do {
            obj = this._state;
            if (obj instanceof C5993a) {
                dVar.mo15671a(((C5993a) obj).f15006a);
                return dVar;
            } else if (obj instanceof C5995c) {
                cVar = (C5995c) obj;
                Object obj3 = cVar.f15007a;
                if (obj3 != f15004j) {
                    dVar.mo15677a(obj3);
                }
                obj2 = cVar.f15007a;
                if (obj != null) {
                } else {
                    throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid state ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!f15000f.compareAndSet(this, obj, new C5995c(obj2, m22525a(cVar.f15008b, dVar))));
        return dVar;
    }

    public boolean offer(E e) {
        C5993a a = m22522a(e);
        if (a == null) {
            return true;
        }
        throw a.mo15705a();
    }
}
