package p352o.p353a.p354a.p356b.p358b;

import android.app.Application;
import android.content.Context;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p308k.p323z.p325d.C5950s;
import p352o.p353a.p364c.C6523b;
import p352o.p353a.p364c.p366e.C6532b;
import p352o.p353a.p364c.p366e.C6534c;
import p352o.p353a.p364c.p366e.C6535d;
import p352o.p353a.p364c.p369h.C6554b;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p373l.C6562a;
import p352o.p353a.p364c.p374m.C6565a;

/* renamed from: o.a.a.b.b.a */
public final class C6512a {

    /* renamed from: o.a.a.b.b.a$a */
    static final class C6513a extends C5943l implements C5922p<C6565a, C6557a, Context> {

        /* renamed from: g */
        final /* synthetic */ Context f16146g;

        C6513a(Context context) {
            this.f16146g = context;
            super(2);
        }

        /* renamed from: a */
        public final Context mo4018c(C6565a aVar, C6557a aVar2) {
            C5942k.m22327b(aVar, "$receiver");
            C5942k.m22327b(aVar2, "it");
            return this.f16146g;
        }
    }

    /* renamed from: o.a.a.b.b.a$b */
    static final class C6514b extends C5943l implements C5922p<C6565a, C6557a, Application> {

        /* renamed from: g */
        final /* synthetic */ Context f16147g;

        C6514b(Context context) {
            this.f16147g = context;
            super(2);
        }

        /* renamed from: a */
        public final Application mo4018c(C6565a aVar, C6557a aVar2) {
            C5942k.m22327b(aVar, "$receiver");
            C5942k.m22327b(aVar2, "it");
            return (Application) this.f16147g;
        }
    }

    /* renamed from: a */
    public static final C6523b m24705a(C6523b bVar, Context context) {
        C5942k.m22327b(bVar, "$this$androidContext");
        C5942k.m22327b(context, "androidContext");
        if (C6523b.f16161c.mo16943b().mo16985a(C6554b.INFO)) {
            C6523b.f16161c.mo16943b().mo16987c("[init] declare Android Context");
        }
        C6562a d = bVar.mo16940b().mo16935b().mo17016d();
        C6534c cVar = C6534c.f16180a;
        C6513a aVar = new C6513a(context);
        C6535d dVar = C6535d.Single;
        C6532b bVar2 = new C6532b(null, null, C5950s.m22341a(Context.class));
        bVar2.mo16947a((C5922p<? super C6565a, ? super C6557a, ? extends T>) aVar);
        bVar2.mo16948a(dVar);
        d.mo17002a(bVar2);
        if (context instanceof Application) {
            C6562a d2 = bVar.mo16940b().mo16935b().mo17016d();
            C6534c cVar2 = C6534c.f16180a;
            C6514b bVar3 = new C6514b(context);
            C6535d dVar2 = C6535d.Single;
            C6532b bVar4 = new C6532b(null, null, C5950s.m22341a(Application.class));
            bVar4.mo16947a((C5922p<? super C6565a, ? super C6557a, ? extends T>) bVar3);
            bVar4.mo16948a(dVar2);
            d2.mo17002a(bVar4);
        }
        return bVar;
    }
}
