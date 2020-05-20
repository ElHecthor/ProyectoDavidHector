package kotlinx.coroutines.p332e3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C5959a1;
import kotlinx.coroutines.C6045d0;
import kotlinx.coroutines.C6157l0;
import kotlinx.coroutines.C6189s0;
import kotlinx.coroutines.C6193t;
import kotlinx.coroutines.C6197u;
import kotlinx.coroutines.C6199u1;
import kotlinx.coroutines.C6199u1.C6200a;
import kotlinx.coroutines.C6204v0;
import kotlinx.coroutines.C6209w1;
import kotlinx.coroutines.internal.C6102b;
import kotlinx.coroutines.internal.C6106d;
import kotlinx.coroutines.internal.C6120i;
import kotlinx.coroutines.internal.C6122k;
import kotlinx.coroutines.internal.C6134q;
import kotlinx.coroutines.internal.C6138u;
import kotlinx.coroutines.p330c3.C6042a;
import kotlinx.coroutines.p330c3.C6043b;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p316w.p318j.p319a.C5890e;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.e3.b */
public final class C6075b<R> extends C6120i implements C6074a<R>, C6081d<R>, C5866d<R>, C5890e {

    /* renamed from: j */
    static final AtomicReferenceFieldUpdater f15171j;

    /* renamed from: k */
    static final AtomicReferenceFieldUpdater f15172k;
    volatile Object _result = C6082e.f15181b;
    volatile Object _state = this;

    /* renamed from: i */
    private final C5866d<R> f15173i;
    private volatile C5959a1 parentHandle;

    /* renamed from: kotlinx.coroutines.e3.b$a */
    private final class C6076a extends C6106d<Object> {

        /* renamed from: b */
        public final C6102b f15174b;

        /* renamed from: c */
        final /* synthetic */ C6075b f15175c;

        public C6076a(C6075b bVar, C6102b bVar2) {
            C5942k.m22327b(bVar2, "desc");
            this.f15175c = bVar;
            this.f15174b = bVar2;
        }

        /* renamed from: d */
        private final void m22877d(Object obj) {
            boolean z = obj == null;
            if (C6075b.f15171j.compareAndSet(this.f15175c, this, z ? null : this.f15175c) && z) {
                this.f15175c.m22860u();
            }
        }

        /* renamed from: a */
        public void mo15847a(Object obj, Object obj2) {
            m22877d(obj2);
            this.f15174b.mo15864a(this, obj2);
        }

        /* renamed from: b */
        public final Object mo15848b() {
            C6075b bVar = this.f15175c;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof C6134q) {
                    ((C6134q) obj).mo15876a(this.f15175c);
                } else {
                    C6075b bVar2 = this.f15175c;
                    if (obj != bVar2) {
                        return C6082e.m22892c();
                    }
                    if (C6075b.f15171j.compareAndSet(bVar2, bVar2, this)) {
                        return null;
                    }
                }
            }
        }

        /* renamed from: b */
        public Object mo15668b(Object obj) {
            if (obj == null) {
                Object b = mo15848b();
                if (b != null) {
                    return b;
                }
            }
            return this.f15174b.mo15863a(this);
        }
    }

    /* renamed from: kotlinx.coroutines.e3.b$b */
    private static final class C6077b extends C6122k {

        /* renamed from: i */
        public final C5959a1 f15176i;

        public C6077b(C5959a1 a1Var) {
            C5942k.m22327b(a1Var, "handle");
            this.f15176i = a1Var;
        }
    }

    /* renamed from: kotlinx.coroutines.e3.b$c */
    private final class C6078c extends C6209w1<C6199u1> {

        /* renamed from: j */
        final /* synthetic */ C6075b f15177j;

        public C6078c(C6075b bVar, C6199u1 u1Var) {
            C5942k.m22327b(u1Var, "job");
            this.f15177j = bVar;
            super(u1Var);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo15751d((Throwable) obj);
            return C5812t.f14872a;
        }

        /* renamed from: d */
        public void mo15751d(Throwable th) {
            if (this.f15177j.mo15843a((Object) null)) {
                this.f15177j.mo15841a((Throwable) this.f14955i.mo15742l());
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SelectOnCancelling[");
            sb.append(this.f15177j);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.e3.b$d */
    public static final class C6079d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C6075b f15178f;

        /* renamed from: g */
        final /* synthetic */ C5918l f15179g;

        public C6079d(C6075b bVar, C5918l lVar) {
            this.f15178f = bVar;
            this.f15179g = lVar;
        }

        public final void run() {
            if (this.f15178f.mo15843a((Object) null)) {
                C5918l lVar = this.f15179g;
                C6075b bVar = this.f15178f;
                bVar.mo15844c();
                C6042a.m22710a(lVar, bVar);
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C6075b> cls2 = C6075b.class;
        f15171j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        f15172k = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_result");
    }

    public C6075b(C5866d<? super R> dVar) {
        C5942k.m22327b(dVar, "uCont");
        this.f15173i = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m22860u() {
        C5959a1 a1Var = this.parentHandle;
        if (a1Var != null) {
            a1Var.mo15639f();
        }
        Object l = mo15897l();
        if (l != null) {
            for (C6122k kVar = (C6122k) l; !C5942k.m22326a((Object) kVar, (Object) this); kVar = kVar.mo15898m()) {
                if (kVar instanceof C6077b) {
                    ((C6077b) kVar).f15176i.mo15639f();
                }
            }
            return;
        }
        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: v */
    private final Object m22861v() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C6134q)) {
                return obj;
            }
            ((C6134q) obj).mo15876a(this);
        }
    }

    /* renamed from: w */
    private final void m22862w() {
        C6199u1 u1Var = (C6199u1) mo15390b().get(C6199u1.f15308d);
        if (u1Var != null) {
            C5959a1 a = C6200a.m23247a(u1Var, true, false, new C6078c(this, u1Var), 2, null);
            this.parentHandle = a;
            if (mo15846k()) {
                a.mo15639f();
            }
        }
    }

    /* renamed from: a */
    public Object mo15840a(C6102b bVar) {
        C5942k.m22327b(bVar, "desc");
        return new C6076a(this, bVar).mo15876a(null);
    }

    /* renamed from: a */
    public void mo15838a(long j, C5918l<? super C5866d<? super R>, ? extends Object> lVar) {
        C5942k.m22327b(lVar, "block");
        if (j <= 0) {
            if (mo15843a((Object) null)) {
                mo15844c();
                C6043b.m22713a(lVar, this);
            }
            return;
        }
        mo15842a(C6189s0.m23210a(mo15390b()).mo15710a(j, new C6079d(this, lVar)));
    }

    /* renamed from: a */
    public void mo15841a(Throwable th) {
        C5942k.m22327b(th, "exception");
        if (!C6157l0.m23149a() || mo15846k()) {
            while (true) {
                Object obj = this._result;
                if (obj == C6082e.f15181b) {
                    if (f15172k.compareAndSet(this, C6082e.f15181b, new C6193t(th, false, 2, null))) {
                        return;
                    }
                } else if (obj != C5885d.m22250a()) {
                    throw new IllegalStateException("Already resumed");
                } else if (f15172k.compareAndSet(this, C5885d.m22250a(), C6082e.f15182c)) {
                    C6204v0.m23256a(C5880c.m22243a(this.f15173i), th);
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void mo15842a(C5959a1 a1Var) {
        C5942k.m22327b(a1Var, "handle");
        C6077b bVar = new C6077b(a1Var);
        if (!mo15846k()) {
            mo15894a(bVar);
            if (!mo15846k()) {
                return;
            }
        }
        a1Var.mo15639f();
    }

    /* renamed from: a */
    public <Q> void mo15839a(C6080c<? extends Q> cVar, C5922p<? super Q, ? super C5866d<? super R>, ? extends Object> pVar) {
        C5942k.m22327b(cVar, "$this$invoke");
        C5942k.m22327b(pVar, "block");
        cVar.mo15669a(this, pVar);
    }

    /* renamed from: a */
    public boolean mo15843a(Object obj) {
        if (!C6157l0.m23149a() || (!(obj instanceof C6134q))) {
            do {
                Object v = m22861v();
                if (v != this) {
                    return obj != null && v == obj;
                }
            } while (!f15171j.compareAndSet(this, this, obj));
            m22860u();
            return true;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public C5871g mo15390b() {
        return this.f15173i.mo15390b();
    }

    /* renamed from: b */
    public void mo15391b(Object obj) {
        C5866d<R> dVar;
        if (!C6157l0.m23149a() || mo15846k()) {
            while (true) {
                Object obj2 = this._result;
                if (obj2 == C6082e.f15181b) {
                    if (f15172k.compareAndSet(this, C6082e.f15181b, C6197u.m23230a(obj))) {
                        return;
                    }
                } else if (obj2 != C5885d.m22250a()) {
                    throw new IllegalStateException("Already resumed");
                } else if (f15172k.compareAndSet(this, C5885d.m22250a(), C6082e.f15182c)) {
                    if (C5803m.m22051c(obj)) {
                        dVar = this.f15173i;
                        Throwable b = C5803m.m22050b(obj);
                        if (b != null) {
                            C5804a aVar = C5803m.f14866f;
                            obj = C5806n.m22053a(C6138u.m23070a(b, dVar));
                            C5803m.m22049a(obj);
                        } else {
                            C5942k.m22323a();
                            throw null;
                        }
                    } else {
                        dVar = this.f15173i;
                    }
                    dVar.mo15391b(obj);
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: c */
    public C5866d<R> mo15844c() {
        return this;
    }

    /* renamed from: d */
    public final void mo15845d(Throwable th) {
        C5942k.m22327b(th, "e");
        if (mo15843a((Object) null)) {
            C5804a aVar = C5803m.f14866f;
            Object a = C5806n.m22053a(th);
            C5803m.m22049a(a);
            mo15391b(a);
        } else if (!(th instanceof CancellationException)) {
            Object t = mo15676t();
            if (!(t instanceof C6193t) || C6138u.m23080d(((C6193t) t).f15300a) != C6138u.m23080d(th)) {
                C6045d0.m22718a(mo15390b(), th);
            }
        }
    }

    /* renamed from: e */
    public C5890e mo15588e() {
        C5866d<R> dVar = this.f15173i;
        if (!(dVar instanceof C5890e)) {
            dVar = null;
        }
        return (C5890e) dVar;
    }

    /* renamed from: j */
    public StackTraceElement mo15589j() {
        return null;
    }

    /* renamed from: k */
    public boolean mo15846k() {
        return m22861v() != this;
    }

    /* renamed from: t */
    public final Object mo15676t() {
        if (!mo15846k()) {
            m22862w();
        }
        Object obj = this._result;
        if (obj == C6082e.f15181b) {
            if (f15172k.compareAndSet(this, C6082e.f15181b, C5885d.m22250a())) {
                return C5885d.m22250a();
            }
            obj = this._result;
        }
        if (obj == C6082e.f15182c) {
            throw new IllegalStateException("Already resumed");
        } else if (!(obj instanceof C6193t)) {
            return obj;
        } else {
            throw ((C6193t) obj).f15300a;
        }
    }
}
