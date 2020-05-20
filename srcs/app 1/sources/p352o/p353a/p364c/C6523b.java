package p352o.p353a.p364c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p369h.C6553a;
import p352o.p353a.p364c.p369h.C6554b;
import p352o.p353a.p364c.p369h.C6555c;
import p352o.p353a.p364c.p370i.C6556a;
import p352o.p353a.p364c.p374m.C6568c;
import p352o.p353a.p364c.p375n.C6569a;

/* renamed from: o.a.c.b */
public final class C6523b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C6555c f16160b = new C6553a();

    /* renamed from: c */
    public static final C6524a f16161c = new C6524a(null);

    /* renamed from: a */
    private final C6522a f16162a;

    /* renamed from: o.a.c.b$a */
    public static final class C6524a {
        private C6524a() {
        }

        public /* synthetic */ C6524a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6523b mo16942a() {
            C6523b bVar = new C6523b(null);
            bVar.mo16941c();
            return bVar;
        }

        /* renamed from: b */
        public final C6555c mo16943b() {
            return C6523b.f16160b;
        }
    }

    /* renamed from: o.a.c.b$b */
    static final class C6525b extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ C6523b f16163g;

        C6525b(C6523b bVar) {
            this.f16163g = bVar;
            super(0);
        }

        public final void invoke() {
            this.f16163g.mo16940b().mo16933a();
        }
    }

    /* renamed from: o.a.c.b$c */
    static final class C6526c extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ C6523b f16164g;

        /* renamed from: h */
        final /* synthetic */ List f16165h;

        C6526c(C6523b bVar, List list) {
            this.f16164g = bVar;
            this.f16165h = list;
            super(0);
        }

        public final void invoke() {
            this.f16164g.m24730a((Iterable<C6556a>) this.f16165h);
        }
    }

    private C6523b() {
        this.f16162a = new C6522a();
    }

    public /* synthetic */ C6523b(C5938g gVar) {
        this();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m24730a(Iterable<C6556a> iterable) {
        this.f16162a.mo16935b().mo17016d().mo17001a(iterable);
        this.f16162a.mo16937c().mo17007a(iterable);
    }

    /* renamed from: a */
    public final C6523b mo16938a() {
        if (f16160b.mo16985a(C6554b.DEBUG)) {
            double b = C6569a.m24846b(new C6525b(this));
            C6555c cVar = f16160b;
            StringBuilder sb = new StringBuilder();
            sb.append("instances started in ");
            sb.append(b);
            sb.append(" ms");
            cVar.mo16984a(sb.toString());
        } else {
            this.f16162a.mo16933a();
        }
        return this;
    }

    /* renamed from: a */
    public final C6523b mo16939a(List<C6556a> list) {
        C5942k.m22327b(list, "modules");
        if (f16160b.mo16985a(C6554b.INFO)) {
            double b = C6569a.m24846b(new C6526c(this, list));
            int size = this.f16162a.mo16935b().mo17016d().mo17004c().size();
            Collection<C6568c> a = this.f16162a.mo16937c().mo17005a();
            ArrayList arrayList = new ArrayList(C5838m.m22166a(a, 10));
            for (C6568c a2 : a) {
                arrayList.add(Integer.valueOf(a2.mo17023a().size()));
            }
            int c = size + C5845t.m22182c(arrayList);
            C6555c cVar = f16160b;
            StringBuilder sb = new StringBuilder();
            sb.append("total ");
            sb.append(c);
            sb.append(" registered definitions");
            cVar.mo16987c(sb.toString());
            C6555c cVar2 = f16160b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("load modules in ");
            sb2.append(b);
            sb2.append(" ms");
            cVar2.mo16987c(sb2.toString());
        } else {
            m24730a((Iterable<C6556a>) list);
        }
        return this;
    }

    /* renamed from: b */
    public final C6522a mo16940b() {
        return this.f16162a;
    }

    /* renamed from: c */
    public final void mo16941c() {
        this.f16162a.mo16937c().mo17009a(this.f16162a);
    }
}
