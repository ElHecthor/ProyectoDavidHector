package kotlinx.coroutines;

import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a */
public abstract class C5957a<T> extends C6014b2 implements C6199u1, C5866d<T>, C6089g0 {

    /* renamed from: g */
    private final C5871g f14952g;

    /* renamed from: h */
    protected final C5871g f14953h;

    public C5957a(C5871g gVar, boolean z) {
        C5942k.m22327b(gVar, "parentContext");
        super(z);
        this.f14953h = gVar;
        this.f14952g = gVar.plus(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15628a(Throwable th, boolean z) {
        C5942k.m22327b(th, "cause");
    }

    /* renamed from: a */
    public final <R> void mo15629a(C6149j0 j0Var, R r, C5922p<? super R, ? super C5866d<? super T>, ? extends Object> pVar) {
        C5942k.m22327b(j0Var, "start");
        C5942k.m22327b(pVar, "block");
        mo15637t();
        j0Var.mo15937a(pVar, r, this);
    }

    /* renamed from: a */
    public boolean mo15630a() {
        return super.mo15630a();
    }

    /* renamed from: b */
    public final C5871g mo15390b() {
        return this.f14952g;
    }

    /* renamed from: b */
    public final void mo15391b(Object obj) {
        mo15728b(C6197u.m23230a(obj), mo15636s());
    }

    /* renamed from: c */
    public C5871g mo2973c() {
        return this.f14952g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo15631c(Object obj) {
        if (obj instanceof C6193t) {
            C6193t tVar = (C6193t) obj;
            mo15628a(tVar.f15300a, tVar.mo15962a());
            return;
        }
        mo15632d(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo15632d(T t) {
    }

    /* renamed from: g */
    public final void mo15633g(Throwable th) {
        C5942k.m22327b(th, "exception");
        C6045d0.m22718a(this.f14952g, th);
    }

    /* renamed from: p */
    public String mo15634p() {
        String a = C5958a0.m22372a(this.f14952g);
        if (a == null) {
            return super.mo15634p();
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        sb.append(a);
        sb.append("\":");
        sb.append(super.mo15634p());
        return sb.toString();
    }

    /* renamed from: q */
    public final void mo15635q() {
        mo15638u();
    }

    /* renamed from: s */
    public int mo15636s() {
        return 0;
    }

    /* renamed from: t */
    public final void mo15637t() {
        mo15725a((C6199u1) this.f14953h.get(C6199u1.f15308d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo15638u() {
    }
}
