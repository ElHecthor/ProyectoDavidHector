package p255io.stashteam.stashapp.p269e.p270a.p274d;

import p071f.p080b.p081a.p084c.C3151a;
import p071f.p131r.C3490d.C3492b;
import p071f.p133t.p134a.C3536a;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5178d;
import p255io.stashteam.stashapp.p256b.p261d.C4964c;
import p255io.stashteam.stashapp.p269e.p275b.p278c.C5279d;
import p255io.stashteam.stashapp.p269e.p280c.C5288b0;
import p255io.stashteam.stashapp.p269e.p280c.C5299h;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.d.h */
public final class C5242h {

    /* renamed from: a */
    private final C4964c f13708a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5279d f13709b;

    /* renamed from: io.stashteam.stashapp.e.a.d.h$a */
    public static final class C5243a {

        /* renamed from: a */
        private final C5305k f13710a;

        /* renamed from: b */
        private final C5299h f13711b;

        public C5243a(C5305k kVar, C5299h hVar) {
            C5942k.m22327b(kVar, "listType");
            C5942k.m22327b(hVar, "filterData");
            this.f13710a = kVar;
            this.f13711b = hVar;
        }

        /* renamed from: a */
        public final C5299h mo14795a() {
            return this.f13711b;
        }

        /* renamed from: b */
        public final C5305k mo14796b() {
            return this.f13710a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f13711b, (java.lang.Object) r3.f13711b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5242h.C5243a
                if (r0 == 0) goto L_0x001d
                io.stashteam.stashapp.e.a.d.h$a r3 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5242h.C5243a) r3
                io.stashteam.stashapp.e.c.k r0 = r2.f13710a
                io.stashteam.stashapp.e.c.k r1 = r3.f13710a
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x001d
                io.stashteam.stashapp.e.c.h r0 = r2.f13711b
                io.stashteam.stashapp.e.c.h r3 = r3.f13711b
                boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5242h.C5243a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C5305k kVar = this.f13710a;
            int i = 0;
            int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
            C5299h hVar = this.f13711b;
            if (hVar != null) {
                i = hVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(listType=");
            sb.append(this.f13710a);
            sb.append(", filterData=");
            sb.append(this.f13711b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: io.stashteam.stashapp.e.a.d.h$b */
    static final class C5244b<I, O> implements C3151a<Value, ToValue> {

        /* renamed from: a */
        final /* synthetic */ C5242h f13712a;

        C5244b(C5242h hVar) {
            this.f13712a = hVar;
        }

        /* renamed from: a */
        public final C5323z mo10143a(C5178d dVar) {
            C5279d a = this.f13712a.f13709b;
            C5942k.m22324a((Object) dVar, "game");
            return a.mo14851a(dVar);
        }
    }

    public C5242h(C4964c cVar, C5279d dVar) {
        C5942k.m22327b(cVar, "gameRepository");
        C5942k.m22327b(dVar, "shortGameMapper");
        this.f13708a = cVar;
        this.f13709b = dVar;
    }

    /* renamed from: a */
    public C3492b<Integer, C5323z> mo14794a(C5243a aVar) {
        String str;
        C5942k.m22327b(aVar, "params");
        String i = aVar.mo14795a().mo14940i();
        C5288b0 h = aVar.mo14795a().mo14938h();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM short_games WHERE review_status = ?");
        if (i == null) {
            str = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AND ");
            sb2.append(i);
            str = sb2.toString();
        }
        sb.append(str);
        if (h != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" ORDER BY ");
            sb3.append(h.mo14862g());
            sb3.append(' ');
            sb3.append(h.mo14863h().mo14860f());
            sb.append(sb3.toString());
        }
        C3492b<Integer, C5323z> a = this.f13708a.mo14165a(new C3536a(sb.toString(), new String[]{aVar.mo14796b().mo14956g()})).mo11131a(new C5244b(this));
        C5942k.m22324a((Object) a, "gameRepository.getGamesB…ortGameMapper.map(game) }");
        return a;
    }
}
