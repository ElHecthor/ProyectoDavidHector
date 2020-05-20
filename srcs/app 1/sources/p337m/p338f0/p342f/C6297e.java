package p337m.p338f0.p342f;

import java.util.List;
import p308k.p323z.p325d.C5942k;
import p337m.C6232b0;
import p337m.C6425l;
import p337m.C6427m;
import p337m.C6445s;
import p337m.C6448t;
import p337m.p338f0.C6250b;
import p350n.C6485h;

/* renamed from: m.f0.f.e */
public final class C6297e {
    static {
        C6485h.f16098j.mo16875b("\"\\");
        C6485h.f16098j.mo16875b("\t ,=");
    }

    /* renamed from: a */
    public static final void m23676a(C6427m mVar, C6448t tVar, C6445s sVar) {
        C5942k.m22327b(mVar, "$this$receiveHeaders");
        C5942k.m22327b(tVar, "url");
        C5942k.m22327b(sVar, "headers");
        if (mVar != C6427m.f15926a) {
            List a = C6425l.f15916n.mo16554a(tVar, sVar);
            if (!a.isEmpty()) {
                mVar.mo16558a(tVar, a);
            }
        }
    }

    /* renamed from: a */
    public static final boolean m23677a(C6232b0 b0Var) {
        C5942k.m22327b(b0Var, "$this$promisesBody");
        if (C5942k.m22326a((Object) b0Var.mo16034v().mo16754f(), (Object) "HEAD")) {
            return false;
        }
        int g = b0Var.mo16022g();
        if (((g >= 100 && g < 200) || g == 204 || g == 304) && C6250b.m23444a(b0Var) == -1) {
            return C5787p.m21979b("chunked", C6232b0.m23339a(b0Var, "Transfer-Encoding", null, 2, null), true);
        }
    }
}
