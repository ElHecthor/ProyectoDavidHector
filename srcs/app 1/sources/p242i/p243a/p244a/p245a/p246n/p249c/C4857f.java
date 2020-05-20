package p242i.p243a.p244a.p245a.p246n.p249c;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p242i.p243a.p244a.p245a.p246n.p249c.C4842a.C4851h;

/* renamed from: i.a.a.a.n.c.f */
public abstract class C4857f<Params, Progress, Result> extends C4842a<Params, Progress, Result> implements C4853b<C4866l>, C4862i, C4866l {

    /* renamed from: s */
    private final C4863j f12681s = new C4863j();

    /* renamed from: i.a.a.a.n.c.f$a */
    private static class C4858a<Result> implements Executor {

        /* renamed from: f */
        private final Executor f12682f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final C4857f f12683g;

        /* renamed from: i.a.a.a.n.c.f$a$a */
        class C4859a extends C4861h<Result> {
            C4859a(Runnable runnable, Object obj) {
                super(runnable, obj);
            }

            /* renamed from: i */
            public <T extends C4853b<C4866l> & C4862i & C4866l> T mo13961i() {
                return C4858a.this.f12683g;
            }
        }

        public C4858a(Executor executor, C4857f fVar) {
            this.f12682f = executor;
            this.f12683g = fVar;
        }

        public void execute(Runnable runnable) {
            this.f12682f.execute(new C4859a(runnable, null));
        }
    }

    /* renamed from: a */
    public void mo13930a(C4866l lVar) {
        if (mo13921i() == C4851h.PENDING) {
            ((C4853b) ((C4862i) mo13959m())).mo13930a(lVar);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    /* renamed from: a */
    public void mo13954a(Throwable th) {
        ((C4866l) ((C4862i) mo13959m())).mo13954a(th);
    }

    /* renamed from: a */
    public final void mo13955a(ExecutorService executorService, Params... paramsArr) {
        super.mo13918a((Executor) new C4858a(executorService, this), paramsArr);
    }

    /* renamed from: a */
    public void mo13956a(boolean z) {
        ((C4866l) ((C4862i) mo13959m())).mo13956a(z);
    }

    public int compareTo(Object obj) {
        return C4856e.m19503a(this, obj);
    }

    /* renamed from: f */
    public boolean mo13958f() {
        return ((C4866l) ((C4862i) mo13959m())).mo13958f();
    }

    /* renamed from: g */
    public boolean mo13931g() {
        return ((C4853b) ((C4862i) mo13959m())).mo13931g();
    }

    /* renamed from: h */
    public Collection<C4866l> mo13932h() {
        return ((C4853b) ((C4862i) mo13959m())).mo13932h();
    }

    /* renamed from: m */
    public <T extends C4853b<C4866l> & C4862i & C4866l> T mo13959m() {
        return this.f12681s;
    }
}
