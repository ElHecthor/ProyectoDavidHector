package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C6199u1.C6200a;
import kotlinx.coroutines.internal.C6138u;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p316w.p318j.p319a.C5890e;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.k */
public class C6152k<T> extends C6208w0<T> implements C6148j<T>, C5890e {

    /* renamed from: k */
    private static final AtomicIntegerFieldUpdater f15263k = AtomicIntegerFieldUpdater.newUpdater(C6152k.class, "_decision");

    /* renamed from: l */
    private static final AtomicReferenceFieldUpdater f15264l = AtomicReferenceFieldUpdater.newUpdater(C6152k.class, Object.class, "_state");
    private volatile int _decision = 0;
    private volatile Object _state = C6011b.f15015f;

    /* renamed from: i */
    private final C5871g f15265i;

    /* renamed from: j */
    private final C5866d<T> f15266j;
    private volatile C5959a1 parentHandle;

    public C6152k(C5866d<? super T> dVar, int i) {
        C5942k.m22327b(dVar, "delegate");
        super(i);
        this.f15266j = dVar;
        this.f15265i = dVar.mo15390b();
    }

    /* renamed from: a */
    private final C6092h m23114a(C5918l<? super Throwable, C5812t> lVar) {
        return lVar instanceof C6092h ? (C6092h) lVar : new C6186r1(lVar);
    }

    /* renamed from: a */
    private final C6160m m23115a(Object obj, int i) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof C6099i2)) {
                if (obj2 instanceof C6160m) {
                    C6160m mVar = (C6160m) obj2;
                    if (mVar.mo15953c()) {
                        return mVar;
                    }
                }
                m23118d(obj);
                throw null;
            }
        } while (!f15264l.compareAndSet(this, obj2, obj));
        m23119k();
        m23116a(i);
        return null;
    }

    /* renamed from: a */
    private final void m23116a(int i) {
        if (!m23121m()) {
            C6204v0.m23258a((C6208w0<? super T>) this, i);
        }
    }

    /* renamed from: a */
    private final void m23117a(C5918l<? super Throwable, C5812t> lVar, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("It's prohibited to register multiple handlers, tried to register ");
        sb.append(lVar);
        sb.append(", already has ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: d */
    private final void m23118d(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Already resumed, but proposed with update ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: k */
    private final void m23119k() {
        C5959a1 a1Var = this.parentHandle;
        if (a1Var != null) {
            a1Var.mo15639f();
            this.parentHandle = C6095h2.f15187f;
        }
    }

    /* renamed from: l */
    private final void m23120l() {
        if (!mo15946h()) {
            C6199u1 u1Var = (C6199u1) this.f15266j.mo15390b().get(C6199u1.f15308d);
            if (u1Var != null) {
                u1Var.start();
                C5959a1 a = C6200a.m23247a(u1Var, true, false, new C6164n(u1Var, this), 2, null);
                this.parentHandle = a;
                if (mo15946h()) {
                    a.mo15639f();
                    this.parentHandle = C6095h2.f15187f;
                }
            }
        }
    }

    /* renamed from: m */
    private final boolean m23121m() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f15263k.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: n */
    private final boolean m23122n() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f15263k.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: a */
    public Object mo15933a(T t, Object obj) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof C6099i2)) {
                C6099i2 i2Var = null;
                if (obj2 instanceof C6203v) {
                    C6203v vVar = (C6203v) obj2;
                    if (vVar.f15312a == obj) {
                        if (C6157l0.m23149a()) {
                            if (!(vVar.f15313b == t)) {
                                throw new AssertionError();
                            }
                        }
                        i2Var = vVar.f15314c;
                    }
                }
                return i2Var;
            }
        } while (!f15264l.compareAndSet(this, obj2, obj == null ? t : new C6203v(obj, t, (C6099i2) obj2)));
        m23119k();
        return obj2;
    }

    /* renamed from: a */
    public Throwable mo15749a(C6199u1 u1Var) {
        C5942k.m22327b(u1Var, "parent");
        return u1Var.mo15742l();
    }

    /* renamed from: a */
    public final C6160m mo15939a(Throwable th, int i) {
        C5942k.m22327b(th, "exception");
        return m23115a((Object) new C6193t(th, false, 2, null), i);
    }

    /* renamed from: a */
    public void mo15940a(Object obj, Throwable th) {
        C5942k.m22327b(th, "cause");
        if (obj instanceof C6207w) {
            try {
                ((C6207w) obj).f15318b.mo4090d(th);
            } catch (Throwable th2) {
                C5871g b = mo15390b();
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in cancellation handler for ");
                sb.append(this);
                C6045d0.m22718a(b, (Throwable) new C6215y(sb.toString(), th2));
            }
        }
    }

    /* renamed from: b */
    public C5871g mo15390b() {
        return this.f15265i;
    }

    /* renamed from: b */
    public void mo15391b(Object obj) {
        m23115a(C6197u.m23230a(obj), this.f15319h);
    }

    /* renamed from: b */
    public void mo15934b(C5918l<? super Throwable, C5812t> lVar) {
        Object obj;
        C5942k.m22327b(lVar, "handler");
        Throwable th = null;
        Object obj2 = null;
        do {
            obj = this._state;
            if (obj instanceof C6011b) {
                if (obj2 == null) {
                    obj2 = m23114a(lVar);
                }
            } else if (obj instanceof C6092h) {
                m23117a(lVar, obj);
                throw null;
            } else if (!(obj instanceof C6160m)) {
                return;
            } else {
                if (((C6160m) obj).mo15963b()) {
                    try {
                        if (!(obj instanceof C6193t)) {
                            obj = null;
                        }
                        C6193t tVar = (C6193t) obj;
                        if (tVar != null) {
                            th = tVar.f15300a;
                        }
                        lVar.mo4090d(th);
                    } catch (Throwable th2) {
                        C5871g b = mo15390b();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in cancellation handler for ");
                        sb.append(this);
                        C6045d0.m22718a(b, (Throwable) new C6215y(sb.toString(), th2));
                    }
                    return;
                }
                m23117a(lVar, obj);
                throw null;
            }
        } while (!f15264l.compareAndSet(this, obj, obj2));
    }

    /* renamed from: b */
    public boolean mo15935b(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C6099i2)) {
                return false;
            }
            z = obj instanceof C6092h;
        } while (!f15264l.compareAndSet(this, obj, new C6160m(this, th, z)));
        if (z) {
            try {
                ((C6092h) obj).mo15662a(th);
            } catch (Throwable th2) {
                C5871g b = mo15390b();
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in cancellation handler for ");
                sb.append(this);
                C6045d0.m22718a(b, (Throwable) new C6215y(sb.toString(), th2));
            }
        }
        m23119k();
        m23116a(0);
        return true;
    }

    /* renamed from: c */
    public <T> T mo15941c(Object obj) {
        return obj instanceof C6203v ? ((C6203v) obj).f15313b : obj instanceof C6207w ? ((C6207w) obj).f15317a : obj;
    }

    /* renamed from: c */
    public final C5866d<T> mo15942c() {
        return this.f15266j;
    }

    /* renamed from: d */
    public Object mo15943d() {
        return mo15945g();
    }

    /* renamed from: e */
    public C5890e mo15588e() {
        C5866d<T> dVar = this.f15266j;
        if (!(dVar instanceof C5890e)) {
            dVar = null;
        }
        return (C5890e) dVar;
    }

    /* renamed from: e */
    public void mo15936e(Object obj) {
        C5942k.m22327b(obj, "token");
        m23116a(this.f15319h);
    }

    /* renamed from: f */
    public final Object mo15944f() {
        m23120l();
        if (m23122n()) {
            return C5885d.m22250a();
        }
        Object g = mo15945g();
        if (!(g instanceof C6193t)) {
            if (this.f15319h == 1) {
                C6199u1 u1Var = (C6199u1) mo15390b().get(C6199u1.f15308d);
                if (u1Var != null && !u1Var.mo15630a()) {
                    CancellationException l = u1Var.mo15742l();
                    mo15940a(g, (Throwable) l);
                    throw C6138u.m23070a(l, (C5866d<?>) this);
                }
            }
            return mo15941c(g);
        }
        throw C6138u.m23070a(((C6193t) g).f15300a, (C5866d<?>) this);
    }

    /* renamed from: g */
    public final Object mo15945g() {
        return this._state;
    }

    /* renamed from: h */
    public boolean mo15946h() {
        return !(mo15945g() instanceof C6099i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo15750i() {
        return "CancellableContinuation";
    }

    /* renamed from: j */
    public StackTraceElement mo15589j() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo15750i());
        sb.append('(');
        sb.append(C6161m0.m23158a(this.f15266j));
        sb.append("){");
        sb.append(mo15945g());
        sb.append("}@");
        sb.append(C6161m0.m23159b(this));
        return sb.toString();
    }
}
