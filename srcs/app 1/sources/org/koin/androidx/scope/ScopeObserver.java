package org.koin.androidx.scope;

import androidx.lifecycle.C0514h.C0515a;
import androidx.lifecycle.C0522m;
import androidx.lifecycle.C0534v;
import p308k.p323z.p325d.C5942k;
import p352o.p353a.p364c.C6522a;
import p352o.p353a.p364c.C6523b;
import p352o.p353a.p364c.C6527c;
import p352o.p353a.p364c.C6527c.C6528a;
import p352o.p353a.p364c.p369h.C6555c;
import p352o.p353a.p364c.p374m.C6565a;

public final class ScopeObserver implements C0522m, C6527c {

    /* renamed from: f */
    private final C0515a f16236f;

    /* renamed from: g */
    private final Object f16237g;

    /* renamed from: h */
    private final C6565a f16238h;

    public ScopeObserver(C0515a aVar, Object obj, C6565a aVar2) {
        C5942k.m22327b(aVar, "event");
        C5942k.m22327b(obj, "target");
        C5942k.m22327b(aVar2, "scope");
        this.f16236f = aVar;
        this.f16237g = obj;
        this.f16238h = aVar2;
    }

    /* renamed from: a */
    public C6522a mo16944a() {
        return C6528a.m24740a(this);
    }

    @C0534v(C0515a.ON_DESTROY)
    public final void onDestroy() {
        if (this.f16236f == C0515a.ON_DESTROY) {
            C6555c b = C6523b.f16161c.mo16943b();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16237g);
            sb.append(" received ON_DESTROY");
            b.mo16984a(sb.toString());
            this.f16238h.mo17012a();
        }
    }

    @C0534v(C0515a.ON_STOP)
    public final void onStop() {
        if (this.f16236f == C0515a.ON_STOP) {
            C6555c b = C6523b.f16161c.mo16943b();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16237g);
            sb.append(" received ON_STOP");
            b.mo16984a(sb.toString());
            this.f16238h.mo17012a();
        }
    }
}
