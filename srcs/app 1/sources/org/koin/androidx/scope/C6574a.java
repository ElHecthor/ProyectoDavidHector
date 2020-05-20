package org.koin.androidx.scope;

import android.content.ComponentCallbacks;
import androidx.lifecycle.C0514h.C0515a;
import androidx.lifecycle.C0523n;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5950s;
import p352o.p353a.p354a.p356b.p357a.C6511a;
import p352o.p353a.p364c.C6522a;
import p352o.p353a.p364c.p372k.C6560a;
import p352o.p353a.p364c.p372k.C6561b;
import p352o.p353a.p364c.p374m.C6565a;
import p352o.p353a.p377e.C6572a;

/* renamed from: org.koin.androidx.scope.a */
public final class C6574a {
    /* renamed from: a */
    public static final C6565a m24865a(C0523n nVar) {
        C5942k.m22327b(nVar, "$this$currentScope");
        return m24870c(nVar);
    }

    /* renamed from: a */
    private static final C6565a m24866a(C0523n nVar, String str, C6560a aVar) {
        C6565a a = m24869b(nVar).mo16932a(str, aVar);
        m24868a(nVar, a, null, 2, null);
        return a;
    }

    /* renamed from: a */
    public static final void m24867a(C0523n nVar, C6565a aVar, C0515a aVar2) {
        C5942k.m22327b(nVar, "$this$bindScope");
        C5942k.m22327b(aVar, "scope");
        C5942k.m22327b(aVar2, "event");
        nVar.mo115a().mo3037a(new ScopeObserver(aVar2, nVar, aVar));
    }

    /* renamed from: a */
    public static /* synthetic */ void m24868a(C0523n nVar, C6565a aVar, C0515a aVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar2 = C0515a.ON_DESTROY;
        }
        m24867a(nVar, aVar, aVar2);
    }

    /* renamed from: b */
    private static final C6522a m24869b(C0523n nVar) {
        if (nVar != null) {
            return C6511a.m24704a((ComponentCallbacks) nVar);
        }
        throw new C5809q("null cannot be cast to non-null type android.content.ComponentCallbacks");
    }

    /* renamed from: c */
    private static final C6565a m24870c(C0523n nVar) {
        String d = m24871d(nVar);
        C6565a b = m24869b(nVar).mo16936b(d);
        return b != null ? b : m24866a(nVar, d, (C6560a) m24872e(nVar));
    }

    /* renamed from: d */
    private static final String m24871d(C0523n nVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(C6572a.m24854a(C5950s.m22341a(nVar.getClass())));
        sb.append("@");
        sb.append(System.identityHashCode(nVar));
        return sb.toString();
    }

    /* renamed from: e */
    private static final C6561b m24872e(C0523n nVar) {
        return new C6561b(C5950s.m22341a(nVar.getClass()));
    }
}
