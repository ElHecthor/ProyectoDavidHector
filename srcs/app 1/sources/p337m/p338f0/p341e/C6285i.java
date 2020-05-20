package p337m.p338f0.p341e;

import java.util.LinkedHashSet;
import java.util.Set;
import p308k.p323z.p325d.C5942k;
import p337m.C6243d0;

/* renamed from: m.f0.e.i */
public final class C6285i {

    /* renamed from: a */
    private final Set<C6243d0> f15548a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void mo16226a(C6243d0 d0Var) {
        C5942k.m22327b(d0Var, "route");
        this.f15548a.remove(d0Var);
    }

    /* renamed from: b */
    public final synchronized void mo16227b(C6243d0 d0Var) {
        C5942k.m22327b(d0Var, "failedRoute");
        this.f15548a.add(d0Var);
    }

    /* renamed from: c */
    public final synchronized boolean mo16228c(C6243d0 d0Var) {
        C5942k.m22327b(d0Var, "route");
        return this.f15548a.contains(d0Var);
    }
}
