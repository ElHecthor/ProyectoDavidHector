package p147g.p156d.p157a.p167b.p184g;

import com.google.android.gms.common.internal.C2148s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: g.d.a.b.g.c0 */
final class C4344c0<TResult> extends C4350h<TResult> {

    /* renamed from: a */
    private final Object f11515a = new Object();

    /* renamed from: b */
    private final C4340a0<TResult> f11516b = new C4340a0<>();
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f11517c;

    /* renamed from: d */
    private volatile boolean f11518d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private TResult f11519e;
    @GuardedBy("mLock")

    /* renamed from: f */
    private Exception f11520f;

    C4344c0() {
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    private final void m17710g() {
        C2148s.m8846b(this.f11517c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: h */
    private final void m17711h() {
        C2148s.m8846b(!this.f11517c, "Task is already complete");
    }

    @GuardedBy("mLock")
    /* renamed from: i */
    private final void m17712i() {
        if (this.f11518d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: j */
    private final void m17713j() {
        synchronized (this.f11515a) {
            if (this.f11517c) {
                this.f11516b.mo13000a((C4350h<TResult>) this);
            }
        }
    }

    /* renamed from: a */
    public final C4350h<TResult> mo13004a(C4343c<TResult> cVar) {
        mo13007a(C4352j.f11524a, cVar);
        return this;
    }

    /* renamed from: a */
    public final <TContinuationResult> C4350h<TContinuationResult> mo13005a(Executor executor, C4339a<TResult, TContinuationResult> aVar) {
        C4344c0 c0Var = new C4344c0();
        this.f11516b.mo13001a((C4371z<TResult>) new C4357l<TResult>(executor, aVar, c0Var));
        m17713j();
        return c0Var;
    }

    /* renamed from: a */
    public final C4350h<TResult> mo13006a(Executor executor, C4341b bVar) {
        this.f11516b.mo13001a((C4371z<TResult>) new C4361p<TResult>(executor, bVar));
        m17713j();
        return this;
    }

    /* renamed from: a */
    public final C4350h<TResult> mo13007a(Executor executor, C4343c<TResult> cVar) {
        this.f11516b.mo13001a((C4371z<TResult>) new C4363r<TResult>(executor, cVar));
        m17713j();
        return this;
    }

    /* renamed from: a */
    public final C4350h<TResult> mo13008a(Executor executor, C4345d dVar) {
        this.f11516b.mo13001a((C4371z<TResult>) new C4365t<TResult>(executor, dVar));
        m17713j();
        return this;
    }

    /* renamed from: a */
    public final C4350h<TResult> mo13009a(Executor executor, C4347e<? super TResult> eVar) {
        this.f11516b.mo13001a((C4371z<TResult>) new C4367v<TResult>(executor, eVar));
        m17713j();
        return this;
    }

    /* renamed from: a */
    public final <TContinuationResult> C4350h<TContinuationResult> mo13010a(Executor executor, C4349g<TResult, TContinuationResult> gVar) {
        C4344c0 c0Var = new C4344c0();
        this.f11516b.mo13001a((C4371z<TResult>) new C4369x<TResult>(executor, gVar, c0Var));
        m17713j();
        return c0Var;
    }

    /* renamed from: a */
    public final Exception mo13011a() {
        Exception exc;
        synchronized (this.f11515a) {
            exc = this.f11520f;
        }
        return exc;
    }

    /* renamed from: a */
    public final <X extends Throwable> TResult mo13012a(Class<X> cls) {
        TResult tresult;
        synchronized (this.f11515a) {
            m17710g();
            m17712i();
            if (cls.isInstance(this.f11520f)) {
                throw ((Throwable) cls.cast(this.f11520f));
            } else if (this.f11520f == null) {
                tresult = this.f11519e;
            } else {
                throw new C4348f(this.f11520f);
            }
        }
        return tresult;
    }

    /* renamed from: a */
    public final void mo13013a(Exception exc) {
        C2148s.m8835a(exc, (Object) "Exception must not be null");
        synchronized (this.f11515a) {
            m17711h();
            this.f11517c = true;
            this.f11520f = exc;
        }
        this.f11516b.mo13000a((C4350h<TResult>) this);
    }

    /* renamed from: a */
    public final void mo13014a(TResult tresult) {
        synchronized (this.f11515a) {
            m17711h();
            this.f11517c = true;
            this.f11519e = tresult;
        }
        this.f11516b.mo13000a((C4350h<TResult>) this);
    }

    /* renamed from: b */
    public final <TContinuationResult> C4350h<TContinuationResult> mo13015b(Executor executor, C4339a<TResult, C4350h<TContinuationResult>> aVar) {
        C4344c0 c0Var = new C4344c0();
        this.f11516b.mo13001a((C4371z<TResult>) new C4359n<TResult>(executor, aVar, c0Var));
        m17713j();
        return c0Var;
    }

    /* renamed from: b */
    public final TResult mo13016b() {
        TResult tresult;
        synchronized (this.f11515a) {
            m17710g();
            m17712i();
            if (this.f11520f == null) {
                tresult = this.f11519e;
            } else {
                throw new C4348f(this.f11520f);
            }
        }
        return tresult;
    }

    /* renamed from: b */
    public final boolean mo13017b(Exception exc) {
        C2148s.m8835a(exc, (Object) "Exception must not be null");
        synchronized (this.f11515a) {
            if (this.f11517c) {
                return false;
            }
            this.f11517c = true;
            this.f11520f = exc;
            this.f11516b.mo13000a((C4350h<TResult>) this);
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo13018b(TResult tresult) {
        synchronized (this.f11515a) {
            if (this.f11517c) {
                return false;
            }
            this.f11517c = true;
            this.f11519e = tresult;
            this.f11516b.mo13000a((C4350h<TResult>) this);
            return true;
        }
    }

    /* renamed from: c */
    public final boolean mo13019c() {
        return this.f11518d;
    }

    /* renamed from: d */
    public final boolean mo13020d() {
        boolean z;
        synchronized (this.f11515a) {
            z = this.f11517c;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo13021e() {
        boolean z;
        synchronized (this.f11515a) {
            z = this.f11517c && !this.f11518d && this.f11520f == null;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo13022f() {
        synchronized (this.f11515a) {
            if (this.f11517c) {
                return false;
            }
            this.f11517c = true;
            this.f11518d = true;
            this.f11516b.mo13000a((C4350h<TResult>) this);
            return true;
        }
    }
}
