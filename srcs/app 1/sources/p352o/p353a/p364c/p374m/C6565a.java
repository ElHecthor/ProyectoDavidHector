package p352o.p353a.p364c.p374m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p308k.C5802l;
import p308k.C5812t;
import p308k.p311c0.C5739b;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.C6522a;
import p352o.p353a.p364c.C6523b;
import p352o.p353a.p364c.p366e.C6532b;
import p352o.p353a.p364c.p367f.C6542e;
import p352o.p353a.p364c.p368g.C6550c;
import p352o.p353a.p364c.p369h.C6554b;
import p352o.p353a.p364c.p369h.C6555c;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p372k.C6560a;
import p352o.p353a.p364c.p373l.C6562a;
import p352o.p353a.p364c.p375n.C6569a;
import p352o.p353a.p377e.C6572a;

/* renamed from: o.a.c.m.a */
public final class C6565a {

    /* renamed from: a */
    private final C6562a f16213a;

    /* renamed from: b */
    private C6568c f16214b;

    /* renamed from: c */
    private final ArrayList<C6567b> f16215c;

    /* renamed from: d */
    private final String f16216d;

    /* renamed from: e */
    private final boolean f16217e;

    /* renamed from: f */
    private final C6522a f16218f;

    /* renamed from: o.a.c.m.a$a */
    static final class C6566a extends C5943l implements C5907a<T> {

        /* renamed from: g */
        final /* synthetic */ C6565a f16219g;

        /* renamed from: h */
        final /* synthetic */ C5739b f16220h;

        /* renamed from: i */
        final /* synthetic */ C6560a f16221i;

        /* renamed from: j */
        final /* synthetic */ C5907a f16222j;

        C6566a(C6565a aVar, C5739b bVar, C6560a aVar2, C5907a aVar3) {
            this.f16219g = aVar;
            this.f16220h = bVar;
            this.f16221i = aVar2;
            this.f16222j = aVar3;
            super(0);
        }

        public final T invoke() {
            return this.f16219g.m24830a(this.f16221i, this.f16220h, this.f16222j);
        }
    }

    public C6565a(String str, boolean z, C6522a aVar) {
        C5942k.m22327b(str, "id");
        C5942k.m22327b(aVar, "_koin");
        this.f16216d = str;
        this.f16217e = z;
        this.f16218f = aVar;
        this.f16213a = new C6562a();
        this.f16215c = new ArrayList<>();
    }

    public /* synthetic */ C6565a(String str, boolean z, C6522a aVar, int i, C5938g gVar) {
        if ((i & 2) != 0) {
            z = false;
        }
        this(str, z, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final <T> T m24830a(C6560a aVar, C5739b<?> bVar, C5907a<C6557a> aVar2) {
        return m24832a(aVar, bVar).mo16945a(new C6550c(this.f16218f, this, aVar2));
    }

    /* renamed from: a */
    private final C6532b<?> m24832a(C6560a aVar, C5739b<?> bVar) {
        C6532b<?> a = this.f16213a.mo16999a(aVar, bVar);
        if (a != null) {
            return a;
        }
        if (!this.f16217e) {
            return this.f16218f.mo16935b().m24832a(aVar, bVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No definition found for '");
        sb.append(C6572a.m24854a(bVar));
        sb.append("' has been found. Check your module definitions.");
        throw new C6542e(sb.toString());
    }

    /* renamed from: a */
    public final <T> T mo17011a(C5739b<?> bVar, C6560a aVar, C5907a<C6557a> aVar2) {
        C5942k.m22327b(bVar, "clazz");
        synchronized (this) {
            if (C6523b.f16161c.mo16943b().mo16985a(C6554b.DEBUG)) {
                C6555c b = C6523b.f16161c.mo16943b();
                StringBuilder sb = new StringBuilder();
                sb.append("+- get '");
                sb.append(C6572a.m24854a(bVar));
                sb.append('\'');
                b.mo16984a(sb.toString());
                C5802l a = C6569a.m24845a(new C6566a(this, bVar, aVar, aVar2));
                T a2 = a.mo15418a();
                double doubleValue = ((Number) a.mo15419b()).doubleValue();
                C6555c b2 = C6523b.f16161c.mo16943b();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("+- got '");
                sb2.append(C6572a.m24854a(bVar));
                sb2.append("' in ");
                sb2.append(doubleValue);
                sb2.append(" ms");
                b2.mo16984a(sb2.toString());
                return a2;
            }
            T a3 = m24830a(aVar, bVar, aVar2);
            return a3;
        }
    }

    /* renamed from: a */
    public final void mo17012a() {
        synchronized (this) {
            if (C6523b.f16161c.mo16943b().mo16985a(C6554b.DEBUG)) {
                C6555c b = C6523b.f16161c.mo16943b();
                StringBuilder sb = new StringBuilder();
                sb.append("closing scope:'");
                sb.append(this.f16216d);
                sb.append('\'');
                b.mo16987c(sb.toString());
            }
            for (C6567b a : this.f16215c) {
                a.mo17022a(this);
            }
            this.f16215c.clear();
            C6568c cVar = this.f16214b;
            if (cVar != null) {
                cVar.mo17024a(this);
            }
            this.f16213a.mo17000a();
            this.f16218f.mo16934a(this.f16216d);
            C5812t tVar = C5812t.f14872a;
        }
    }

    /* renamed from: a */
    public final void mo17013a(C6568c cVar) {
        this.f16214b = cVar;
    }

    /* renamed from: b */
    public final void mo17014b() {
        if (this.f16217e) {
            Set<C6532b> b = this.f16213a.mo17003b();
            if (!b.isEmpty()) {
                for (C6532b bVar : b) {
                    C6550c cVar = new C6550c(this.f16218f, this, null, 4, null);
                    bVar.mo16945a(cVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo17015c() {
        C6568c cVar = this.f16214b;
        if (cVar != null) {
            HashSet<C6532b> a = cVar.mo17023a();
            if (a != null) {
                for (C6532b bVar : a) {
                    this.f16213a.mo17002a(bVar);
                    bVar.mo16949b();
                }
            }
        }
    }

    /* renamed from: d */
    public final C6562a mo17016d() {
        return this.f16213a;
    }

    /* renamed from: e */
    public final String mo17017e() {
        return this.f16216d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6565a) {
                C6565a aVar = (C6565a) obj;
                if (C5942k.m22326a((Object) this.f16216d, (Object) aVar.f16216d)) {
                    if (!(this.f16217e == aVar.f16217e) || !C5942k.m22326a((Object) this.f16218f, (Object) aVar.f16218f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C6568c mo17019f() {
        return this.f16214b;
    }

    public int hashCode() {
        String str = this.f16216d;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f16217e;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        C6522a aVar = this.f16218f;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        C6568c cVar = this.f16214b;
        StringBuilder sb = new StringBuilder();
        sb.append(",set:'");
        sb.append(cVar != null ? cVar.mo17025b() : null);
        sb.append('\'');
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Scope[id:'");
        sb3.append(this.f16216d);
        sb3.append('\'');
        sb3.append(sb2);
        sb3.append(']');
        return sb3.toString();
    }
}
