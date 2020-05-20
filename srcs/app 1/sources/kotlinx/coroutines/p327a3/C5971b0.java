package kotlinx.coroutines.p327a3;

import kotlinx.coroutines.C6148j;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a3.b0 */
public final class C5971b0 extends C6006z {

    /* renamed from: i */
    private final Object f14976i;

    /* renamed from: j */
    public final C6148j<C5812t> f14977j;

    public C5971b0(Object obj, C6148j<? super C5812t> jVar) {
        C5942k.m22327b(jVar, "cont");
        this.f14976i = obj;
        this.f14977j = jVar;
    }

    /* renamed from: a */
    public void mo15673a(C5989m<?> mVar) {
        C5942k.m22327b(mVar, "closed");
        C6148j<C5812t> jVar = this.f14977j;
        Throwable v = mVar.mo15704v();
        C5804a aVar = C5803m.f14866f;
        Object a = C5806n.m22053a(v);
        C5803m.m22049a(a);
        jVar.mo15391b(a);
    }

    /* renamed from: f */
    public void mo15674f(Object obj) {
        C5942k.m22327b(obj, "token");
        this.f14977j.mo15936e(obj);
    }

    /* renamed from: g */
    public Object mo15675g(Object obj) {
        return this.f14977j.mo15933a(C5812t.f14872a, obj);
    }

    /* renamed from: t */
    public Object mo15676t() {
        return this.f14976i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SendElement(");
        sb.append(mo15676t());
        sb.append(')');
        return sb.toString();
    }
}
