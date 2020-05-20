package p308k.p316w.p318j.p319a;

import java.io.Serializable;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.w.j.a.a */
public abstract class C5886a implements C5866d<Object>, C5890e, Serializable {

    /* renamed from: f */
    private final C5866d<Object> f14914f;

    public C5886a(C5866d<Object> dVar) {
        this.f14914f = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo4016a(Object obj);

    /* renamed from: a */
    public final C5866d<Object> mo15585a() {
        return this.f14914f;
    }

    /* renamed from: a */
    public C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
        C5942k.m22327b(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* renamed from: a */
    public C5866d<C5812t> mo15586a(C5866d<?> dVar) {
        C5942k.m22327b(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    /* renamed from: b */
    public final void mo15391b(Object obj) {
        C5886a aVar = this;
        while (true) {
            C5893h.m22279b(aVar);
            C5866d<Object> dVar = aVar.f14914f;
            if (dVar != null) {
                try {
                    obj = aVar.mo4016a(obj);
                    if (obj != C5885d.m22250a()) {
                        C5804a aVar2 = C5803m.f14866f;
                        C5803m.m22049a(obj);
                        aVar.mo15587c();
                        if (dVar instanceof C5886a) {
                            aVar = (C5886a) dVar;
                        } else {
                            dVar.mo15391b(obj);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    C5804a aVar3 = C5803m.f14866f;
                    obj = C5806n.m22053a(th);
                    C5803m.m22049a(obj);
                }
            } else {
                C5942k.m22323a();
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15587c() {
    }

    /* renamed from: e */
    public C5890e mo15588e() {
        C5866d<Object> dVar = this.f14914f;
        if (!(dVar instanceof C5890e)) {
            dVar = null;
        }
        return (C5890e) dVar;
    }

    /* renamed from: j */
    public StackTraceElement mo15589j() {
        return C5892g.m22277c(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object j = mo15589j();
        if (j == null) {
            j = getClass().getName();
        }
        sb.append(j);
        return sb.toString();
    }
}
