package p352o.p353a.p364c.p368g;

import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p352o.p353a.p364c.p366e.C6532b;

/* renamed from: o.a.c.g.e */
public final class C6552e<T> extends C6547a<T> {

    /* renamed from: b */
    private T f16194b;

    public C6552e(C6532b<T> bVar) {
        C5942k.m22327b(bVar, "beanDefinition");
        super(bVar);
    }

    /* renamed from: a */
    public void mo16976a() {
        C5918l e = mo16978b().mo16952e();
        if (e != null) {
            C5812t tVar = (C5812t) e.mo4090d(this.f16194b);
        }
        this.f16194b = null;
    }

    /* renamed from: b */
    public <T> T mo16977b(C6550c cVar) {
        C5942k.m22327b(cVar, "context");
        if (this.f16194b == null) {
            this.f16194b = mo16975a(cVar);
        }
        T t = this.f16194b;
        if (!(t instanceof Object)) {
            t = null;
        }
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    /* renamed from: c */
    public void mo16979c(C6550c cVar) {
        C5942k.m22327b(cVar, "context");
    }
}
