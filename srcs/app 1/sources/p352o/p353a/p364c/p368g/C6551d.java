package p352o.p353a.p364c.p368g;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p352o.p353a.p364c.C6523b;
import p352o.p353a.p364c.p366e.C6532b;
import p352o.p353a.p364c.p367f.C6538a;
import p352o.p353a.p364c.p367f.C6546i;
import p352o.p353a.p364c.p369h.C6554b;
import p352o.p353a.p364c.p369h.C6555c;
import p352o.p353a.p364c.p372k.C6560a;
import p352o.p353a.p364c.p374m.C6565a;
import p352o.p353a.p364c.p374m.C6568c;

/* renamed from: o.a.c.g.d */
public final class C6551d<T> extends C6547a<T> {

    /* renamed from: b */
    private final Map<String, T> f16193b = new ConcurrentHashMap();

    public C6551d(C6532b<T> bVar) {
        C5942k.m22327b(bVar, "beanDefinition");
        super(bVar);
    }

    /* renamed from: a */
    private final void m24777a(C6532b<?> bVar, C6565a aVar) {
        C6568c f = aVar.mo17019f();
        C6560a b = f != null ? f.mo17025b() : null;
        C6560a k = bVar.mo16960k();
        if (!C5942k.m22326a((Object) k, (Object) b)) {
            String str = ". Use a scope instance with scope '";
            String str2 = " defined for scope '";
            String str3 = "Can't use definition ";
            if (b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(bVar);
                sb.append(str2);
                sb.append(k);
                sb.append("', with an open scope instance ");
                sb.append(aVar);
                sb.append(str);
                sb.append(k);
                sb.append('\'');
                throw new C6538a(sb.toString());
            } else if (k != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(bVar);
                sb2.append(str2);
                sb2.append(k);
                sb2.append("' with scope instance ");
                sb2.append(aVar);
                sb2.append(str);
                sb2.append(k);
                sb2.append("'.");
                throw new C6538a(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo16976a() {
        C5918l e = mo16978b().mo16952e();
        if (e != null) {
            C5812t tVar = (C5812t) e.mo4090d(null);
        }
        this.f16193b.clear();
    }

    /* renamed from: b */
    public <T> T mo16977b(C6550c cVar) {
        C5942k.m22327b(cVar, "context");
        if (cVar.mo16980a() == null) {
            throw new IllegalStateException("ScopeDefinitionInstance has no registered Koin instance".toString());
        } else if (!C5942k.m22326a((Object) cVar.mo16982c(), (Object) cVar.mo16980a().mo16935b())) {
            C6565a c = cVar.mo16982c();
            if (c != null) {
                m24777a(mo16978b(), c);
                String e = c.mo17017e();
                T t = this.f16193b.get(e);
                if (t == null) {
                    t = mo16975a(cVar);
                    Map<String, T> map = this.f16193b;
                    if (t != null) {
                        map.put(e, t);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Instance creation from ");
                        sb.append(mo16978b());
                        sb.append(" should not be null");
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                return t;
            }
            throw new IllegalStateException("ScopeDefinitionInstance has no scope in context".toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No scope instance created to resolve ");
            sb2.append(mo16978b());
            throw new C6546i(sb2.toString());
        }
    }

    /* renamed from: c */
    public void mo16979c(C6550c cVar) {
        C5942k.m22327b(cVar, "context");
        C6565a c = cVar.mo16982c();
        if (c != null) {
            if (C6523b.f16161c.mo16943b().mo16985a(C6554b.DEBUG)) {
                C6555c b = C6523b.f16161c.mo16943b();
                StringBuilder sb = new StringBuilder();
                sb.append("releasing '");
                sb.append(c);
                sb.append("' ~ ");
                sb.append(mo16978b());
                sb.append(' ');
                b.mo16984a(sb.toString());
            }
            C5918l f = mo16978b().mo16954f();
            if (f != null) {
                C5812t tVar = (C5812t) f.mo4090d(this.f16193b.get(c.mo17017e()));
            }
            this.f16193b.remove(c.mo17017e());
            return;
        }
        throw new IllegalStateException("ScopeDefinitionInstance has no scope in context".toString());
    }
}
