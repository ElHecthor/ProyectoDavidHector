package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.C6138u;
import kotlinx.coroutines.internal.C6143z;
import kotlinx.coroutines.p331d3.C6059i;
import kotlinx.coroutines.p331d3.C6060j;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.w0 */
public abstract class C6208w0<T> extends C6059i {

    /* renamed from: h */
    public int f15319h;

    public C6208w0(int i) {
        this.f15319h = i;
    }

    /* renamed from: a */
    public final Throwable mo15986a(Object obj) {
        if (!(obj instanceof C6193t)) {
            obj = null;
        }
        C6193t tVar = (C6193t) obj;
        if (tVar != null) {
            return tVar.f15300a;
        }
        return null;
    }

    /* renamed from: a */
    public void mo15940a(Object obj, Throwable th) {
        C5942k.m22327b(th, "cause");
    }

    /* renamed from: a */
    public final void mo15987a(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C5727b.m21843a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fatal exception in coroutines machinery for ");
            sb.append(this);
            sb.append(". ");
            sb.append("Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
            String sb2 = sb.toString();
            if (th != null) {
                C6045d0.m22718a(mo15942c().mo15390b(), (Throwable) new C6153k0(sb2, th));
                return;
            }
            C5942k.m22323a();
            throw null;
        }
    }

    /* renamed from: c */
    public <T> T mo15941c(Object obj) {
        return obj;
    }

    /* renamed from: c */
    public abstract C5866d<T> mo15942c();

    /* renamed from: d */
    public abstract Object mo15943d();

    public final void run() {
        Object obj;
        C5871g b;
        Object b2;
        Object c;
        Object obj2;
        C6060j jVar = this.f15146g;
        try {
            C5866d c2 = mo15942c();
            if (c2 != null) {
                C6194t0 t0Var = (C6194t0) c2;
                C5866d<T> dVar = t0Var.f15305m;
                b = dVar.mo15390b();
                Object d = mo15943d();
                b2 = C6143z.m23097b(b, t0Var.f15303k);
                Throwable a = mo15986a(d);
                C6199u1 u1Var = C6163m2.m23163a(this.f15319h) ? (C6199u1) b.get(C6199u1.f15308d) : null;
                if (a == null && u1Var != null && !u1Var.mo15630a()) {
                    CancellationException l = u1Var.mo15742l();
                    mo15940a(d, (Throwable) l);
                    C5804a aVar = C5803m.f14866f;
                    c = C5806n.m22053a(C6138u.m23070a(l, dVar));
                    C5803m.m22049a(c);
                } else if (a != null) {
                    C5804a aVar2 = C5803m.f14866f;
                    c = C5806n.m22053a(C6138u.m23070a(a, dVar));
                    C5803m.m22049a(c);
                } else {
                    c = mo15941c(d);
                    C5804a aVar3 = C5803m.f14866f;
                    C5803m.m22049a(c);
                }
                dVar.mo15391b(c);
                C5812t tVar = C5812t.f14872a;
                C6143z.m23096a(b, b2);
                try {
                    C5804a aVar4 = C5803m.f14866f;
                    jVar.mo15803h();
                    obj2 = C5812t.f14872a;
                    C5803m.m22049a(obj2);
                } catch (Throwable th) {
                    C5804a aVar5 = C5803m.f14866f;
                    obj2 = C5806n.m22053a(th);
                    C5803m.m22049a(obj2);
                }
                mo15987a((Throwable) null, C5803m.m22050b(obj2));
                return;
            }
            throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th2) {
            try {
                C5804a aVar6 = C5803m.f14866f;
                jVar.mo15803h();
                obj = C5812t.f14872a;
                C5803m.m22049a(obj);
            } catch (Throwable th3) {
                C5804a aVar7 = C5803m.f14866f;
                obj = C5806n.m22053a(th3);
                C5803m.m22049a(obj);
            }
            mo15987a(th2, C5803m.m22050b(obj));
        }
    }
}
