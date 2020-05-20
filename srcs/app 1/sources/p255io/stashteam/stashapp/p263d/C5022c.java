package p255io.stashteam.stashapp.p263d;

import android.content.SharedPreferences;
import java.util.Locale;
import java.util.TimeZone;
import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.C4492g;
import p255io.stashteam.stashapp.data.local.p264db.InMemoryDatabase;
import p255io.stashteam.stashapp.data.local.p264db.PersistenceDatabase;
import p255io.stashteam.stashapp.data.local.p264db.p267c.C5166a;
import p255io.stashteam.stashapp.data.local.p264db.p267c.C5169d;
import p255io.stashteam.stashapp.p256b.p258b.p259a.C4940a;
import p255io.stashteam.stashapp.p256b.p260c.C4942a;
import p255io.stashteam.stashapp.p256b.p261d.C4944a;
import p255io.stashteam.stashapp.p256b.p261d.C4957b;
import p255io.stashteam.stashapp.p256b.p261d.C4964c;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p308k.p323z.p325d.C5950s;
import p337m.C6232b0;
import p337m.C6452u;
import p337m.C6452u.C6453a;
import p337m.C6452u.C6454b;
import p337m.C6462x;
import p337m.C6462x.C6463a;
import p337m.C6467z.C6468a;
import p337m.p349g0.C6412a;
import p337m.p349g0.C6412a.C6413a;
import p352o.p353a.p354a.p356b.p358b.C6515b;
import p352o.p353a.p364c.p366e.C6532b;
import p352o.p353a.p364c.p366e.C6534c;
import p352o.p353a.p364c.p366e.C6535d;
import p352o.p353a.p364c.p366e.C6536e;
import p352o.p353a.p364c.p370i.C6556a;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p372k.C6560a;
import p352o.p353a.p364c.p374m.C6565a;
import p352o.p353a.p376d.C6570a;
import p378p.C6614h.C6615a;
import p378p.C6664u.C6666b;
import p378p.p380z.p381a.C6674a;

/* renamed from: io.stashteam.stashapp.d.c */
public final class C5022c {

    /* renamed from: a */
    private static final C6556a f13237a = C6570a.m24848a(false, false, C5024b.f13239g, 3, null);

    /* renamed from: io.stashteam.stashapp.d.c$a */
    public static final class C5023a implements C6452u {

        /* renamed from: b */
        final /* synthetic */ C4940a f13238b;

        public C5023a(C4940a aVar) {
            this.f13238b = aVar;
        }

        /* renamed from: a */
        public C6232b0 mo14196a(C6453a aVar) {
            C5942k.m22327b(aVar, "chain");
            C6468a g = aVar.mo16259g().mo16755g();
            String c = this.f13238b.mo14089c();
            if (c == null) {
                c = this.f13238b.mo14092f();
            }
            if (c != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bearer ");
                sb.append(c);
                g.mo16760a("Authorization", sb.toString());
            }
            String locale = Locale.getDefault().toString();
            C5942k.m22324a((Object) locale, "Locale.getDefault().toString()");
            g.mo16760a("Accept-Locale", locale);
            Locale locale2 = Locale.getDefault();
            C5942k.m22324a((Object) locale2, "Locale.getDefault()");
            String language = locale2.getLanguage();
            C5942k.m22324a((Object) language, "Locale.getDefault().language");
            g.mo16760a("Accept-Language", language);
            TimeZone timeZone = TimeZone.getDefault();
            C5942k.m22324a((Object) timeZone, "TimeZone.getDefault()");
            String id = timeZone.getID();
            C5942k.m22324a((Object) id, "TimeZone.getDefault().id");
            g.mo16760a("Time-Zone", id);
            g.mo16760a("Content-Type", "application/json");
            return aVar.mo16251a(g.mo16765a());
        }
    }

    /* renamed from: io.stashteam.stashapp.d.c$b */
    static final class C5024b extends C5943l implements C5918l<C6556a, C5812t> {

        /* renamed from: g */
        public static final C5024b f13239g = new C5024b();

        /* renamed from: io.stashteam.stashapp.d.c$b$a */
        static final class C5025a extends C5943l implements C5922p<C6565a, C6557a, C6462x> {

            /* renamed from: g */
            public static final C5025a f13240g = new C5025a();

            C5025a() {
                super(2);
            }

            /* renamed from: a */
            public final C6462x mo4018c(C6565a aVar, C6557a aVar2) {
                C5942k.m22327b(aVar, "$receiver");
                C5942k.m22327b(aVar2, "it");
                return C5022c.m20082b((C4940a) aVar.mo17011a(C5950s.m22341a(C4940a.class), (C6560a) null, null));
            }
        }

        /* renamed from: io.stashteam.stashapp.d.c$b$b */
        static final class C5026b extends C5943l implements C5922p<C6565a, C6557a, C4942a> {

            /* renamed from: g */
            public static final C5026b f13241g = new C5026b();

            C5026b() {
                super(2);
            }

            /* renamed from: a */
            public final C4942a mo4018c(C6565a aVar, C6557a aVar2) {
                C5942k.m22327b(aVar, "$receiver");
                C5942k.m22327b(aVar2, "it");
                C6462x xVar = (C6462x) aVar.mo17011a(C5950s.m22341a(C6462x.class), (C6560a) null, null);
                C4485f a = new C4492g().mo13356a();
                C6666b bVar = new C6666b();
                bVar.mo17141a("https://api.stash.games/api/v1/");
                bVar.mo17145a((C6615a) C6674a.m25075a(a));
                bVar.mo17144a(xVar);
                return (C4942a) bVar.mo17146a().mo17131a(C4942a.class);
            }
        }

        /* renamed from: io.stashteam.stashapp.d.c$b$c */
        static final class C5027c extends C5943l implements C5922p<C6565a, C6557a, PersistenceDatabase> {

            /* renamed from: g */
            public static final C5027c f13242g = new C5027c();

            C5027c() {
                super(2);
            }

            /* renamed from: a */
            public final PersistenceDatabase mo4018c(C6565a aVar, C6557a aVar2) {
                C5942k.m22327b(aVar, "$receiver");
                C5942k.m22327b(aVar2, "it");
                return PersistenceDatabase.f13334l.mo14284a(C6515b.m24710a(aVar));
            }
        }

        /* renamed from: io.stashteam.stashapp.d.c$b$d */
        static final class C5028d extends C5943l implements C5922p<C6565a, C6557a, InMemoryDatabase> {

            /* renamed from: g */
            public static final C5028d f13243g = new C5028d();

            C5028d() {
                super(2);
            }

            /* renamed from: a */
            public final InMemoryDatabase mo4018c(C6565a aVar, C6557a aVar2) {
                C5942k.m22327b(aVar, "$receiver");
                C5942k.m22327b(aVar2, "it");
                return InMemoryDatabase.f13330l.mo14283a(C6515b.m24710a(aVar));
            }
        }

        /* renamed from: io.stashteam.stashapp.d.c$b$e */
        static final class C5029e extends C5943l implements C5922p<C6565a, C6557a, C4964c> {

            /* renamed from: g */
            public static final C5029e f13244g = new C5029e();

            C5029e() {
                super(2);
            }

            /* renamed from: a */
            public final C4964c mo4018c(C6565a aVar, C6557a aVar2) {
                C5942k.m22327b(aVar, "$receiver");
                C5942k.m22327b(aVar2, "it");
                return new C4964c((C4942a) aVar.mo17011a(C5950s.m22341a(C4942a.class), (C6560a) null, null), (InMemoryDatabase) aVar.mo17011a(C5950s.m22341a(InMemoryDatabase.class), (C6560a) null, null), (C5169d) aVar.mo17011a(C5950s.m22341a(C5169d.class), (C6560a) null, null));
            }
        }

        /* renamed from: io.stashteam.stashapp.d.c$b$f */
        static final class C5030f extends C5943l implements C5922p<C6565a, C6557a, C4944a> {

            /* renamed from: g */
            public static final C5030f f13245g = new C5030f();

            C5030f() {
                super(2);
            }

            /* renamed from: a */
            public final C4944a mo4018c(C6565a aVar, C6557a aVar2) {
                C5942k.m22327b(aVar, "$receiver");
                C5942k.m22327b(aVar2, "it");
                return new C4944a((C4942a) aVar.mo17011a(C5950s.m22341a(C4942a.class), (C6560a) null, null), (PersistenceDatabase) aVar.mo17011a(C5950s.m22341a(PersistenceDatabase.class), (C6560a) null, null), (InMemoryDatabase) aVar.mo17011a(C5950s.m22341a(InMemoryDatabase.class), (C6560a) null, null), (C4940a) aVar.mo17011a(C5950s.m22341a(C4940a.class), (C6560a) null, null));
            }
        }

        /* renamed from: io.stashteam.stashapp.d.c$b$g */
        static final class C5031g extends C5943l implements C5922p<C6565a, C6557a, C4957b> {

            /* renamed from: g */
            public static final C5031g f13246g = new C5031g();

            C5031g() {
                super(2);
            }

            /* renamed from: a */
            public final C4957b mo4018c(C6565a aVar, C6557a aVar2) {
                C5942k.m22327b(aVar, "$receiver");
                C5942k.m22327b(aVar2, "it");
                return new C4957b((C4942a) aVar.mo17011a(C5950s.m22341a(C4942a.class), (C6560a) null, null), (InMemoryDatabase) aVar.mo17011a(C5950s.m22341a(InMemoryDatabase.class), (C6560a) null, null), (C5166a) aVar.mo17011a(C5950s.m22341a(C5166a.class), (C6560a) null, null));
            }
        }

        /* renamed from: io.stashteam.stashapp.d.c$b$h */
        static final class C5032h extends C5943l implements C5922p<C6565a, C6557a, C4940a> {

            /* renamed from: g */
            public static final C5032h f13247g = new C5032h();

            C5032h() {
                super(2);
            }

            /* renamed from: a */
            public final C4940a mo4018c(C6565a aVar, C6557a aVar2) {
                C5942k.m22327b(aVar, "$receiver");
                C5942k.m22327b(aVar2, "it");
                SharedPreferences sharedPreferences = C6515b.m24710a(aVar).getSharedPreferences("io.stashteam.games.tracker.stashapp.shared_pref", 0);
                C5942k.m22324a((Object) sharedPreferences, "androidApplication().get…f\", Context.MODE_PRIVATE)");
                return new C4940a(sharedPreferences);
            }
        }

        C5024b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo14197a(C6556a aVar) {
            C5942k.m22327b(aVar, "$receiver");
            C5025a aVar2 = C5025a.f13240g;
            C6534c cVar = C6534c.f16180a;
            C6535d dVar = C6535d.Single;
            C6532b bVar = new C6532b(null, null, C5950s.m22341a(C6462x.class));
            bVar.mo16947a((C5922p<? super C6565a, ? super C6557a, ? extends T>) aVar2);
            bVar.mo16948a(dVar);
            aVar.mo16989a(bVar, new C6536e(false, false));
            C5026b bVar2 = C5026b.f13241g;
            C6534c cVar2 = C6534c.f16180a;
            C6535d dVar2 = C6535d.Single;
            C6532b bVar3 = new C6532b(null, null, C5950s.m22341a(C4942a.class));
            bVar3.mo16947a((C5922p<? super C6565a, ? super C6557a, ? extends T>) bVar2);
            bVar3.mo16948a(dVar2);
            aVar.mo16989a(bVar3, new C6536e(false, false));
            C5027c cVar3 = C5027c.f13242g;
            C6534c cVar4 = C6534c.f16180a;
            C6535d dVar3 = C6535d.Single;
            C6532b bVar4 = new C6532b(null, null, C5950s.m22341a(PersistenceDatabase.class));
            bVar4.mo16947a((C5922p<? super C6565a, ? super C6557a, ? extends T>) cVar3);
            bVar4.mo16948a(dVar3);
            aVar.mo16989a(bVar4, new C6536e(false, false));
            C5028d dVar4 = C5028d.f13243g;
            C6534c cVar5 = C6534c.f16180a;
            C6535d dVar5 = C6535d.Single;
            C6532b bVar5 = new C6532b(null, null, C5950s.m22341a(InMemoryDatabase.class));
            bVar5.mo16947a((C5922p<? super C6565a, ? super C6557a, ? extends T>) dVar4);
            bVar5.mo16948a(dVar5);
            aVar.mo16989a(bVar5, new C6536e(false, false));
            C5029e eVar = C5029e.f13244g;
            C6534c cVar6 = C6534c.f16180a;
            C6535d dVar6 = C6535d.Single;
            C6532b bVar6 = new C6532b(null, null, C5950s.m22341a(C4964c.class));
            bVar6.mo16947a((C5922p<? super C6565a, ? super C6557a, ? extends T>) eVar);
            bVar6.mo16948a(dVar6);
            aVar.mo16989a(bVar6, new C6536e(false, false));
            C5030f fVar = C5030f.f13245g;
            C6534c cVar7 = C6534c.f16180a;
            C6535d dVar7 = C6535d.Single;
            C6532b bVar7 = new C6532b(null, null, C5950s.m22341a(C4944a.class));
            bVar7.mo16947a((C5922p<? super C6565a, ? super C6557a, ? extends T>) fVar);
            bVar7.mo16948a(dVar7);
            aVar.mo16989a(bVar7, new C6536e(false, false));
            C5031g gVar = C5031g.f13246g;
            C6534c cVar8 = C6534c.f16180a;
            C6535d dVar8 = C6535d.Single;
            C6532b bVar8 = new C6532b(null, null, C5950s.m22341a(C4957b.class));
            bVar8.mo16947a((C5922p<? super C6565a, ? super C6557a, ? extends T>) gVar);
            bVar8.mo16948a(dVar8);
            aVar.mo16989a(bVar8, new C6536e(false, false));
            C5032h hVar = C5032h.f13247g;
            C6534c cVar9 = C6534c.f16180a;
            C6535d dVar9 = C6535d.Single;
            C6532b bVar9 = new C6532b(null, null, C5950s.m22341a(C4940a.class));
            bVar9.mo16947a((C5922p<? super C6565a, ? super C6557a, ? extends T>) hVar);
            bVar9.mo16948a(dVar9);
            aVar.mo16989a(bVar9, new C6536e(false, false));
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo14197a((C6556a) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: a */
    public static final C6556a m20081a() {
        return f13237a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C6462x m20082b(C4940a aVar) {
        C6463a aVar2 = new C6463a();
        C6412a aVar3 = new C6412a(null, 1, null);
        aVar3.mo16524a(C6413a.NONE);
        aVar2.mo16714a(aVar3);
        C6454b bVar = C6452u.f15974a;
        aVar2.mo16714a(new C5023a(aVar));
        return aVar2.mo16715a();
    }
}
