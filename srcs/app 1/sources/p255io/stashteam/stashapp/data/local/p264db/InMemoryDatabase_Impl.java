package p255io.stashteam.stashapp.data.local.p264db;

import androidx.room.C0686c;
import androidx.room.C0696i;
import androidx.room.C0711l.C0713b;
import androidx.room.C0725o;
import androidx.room.C0725o.C0726a;
import androidx.room.C0725o.C0727b;
import androidx.room.p004y.C0746c;
import androidx.room.p004y.C0748e;
import androidx.room.p004y.C0748e.C0749a;
import java.util.HashMap;
import java.util.HashSet;
import p071f.p133t.p134a.C3537b;
import p071f.p133t.p134a.C3538c;
import p071f.p133t.p134a.C3538c.C3539a;
import p071f.p133t.p134a.C3538c.C3540b;
import p071f.p133t.p134a.C3538c.C3540b.C3541a;
import p255io.stashteam.stashapp.data.local.p264db.p266b.C5121b;
import p255io.stashteam.stashapp.data.local.p264db.p266b.C5122c;
import p255io.stashteam.stashapp.data.local.p264db.p266b.C5135d;
import p255io.stashteam.stashapp.data.local.p264db.p266b.C5136e;

/* renamed from: io.stashteam.stashapp.data.local.db.InMemoryDatabase_Impl */
public final class InMemoryDatabase_Impl extends InMemoryDatabase {

    /* renamed from: m */
    private volatile C5135d f13331m;

    /* renamed from: n */
    private volatile C5121b f13332n;

    /* renamed from: io.stashteam.stashapp.data.local.db.InMemoryDatabase_Impl$a */
    class C5113a extends C0726a {
        C5113a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo4098a(C3537b bVar) {
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `short_games` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `firstReleaseDate` INTEGER NOT NULL, `category` INTEGER NOT NULL, `cover` TEXT, `review_comment` TEXT, `review_rating` INTEGER, `review_status` TEXT, `review_completed` INTEGER, `review_playing` INTEGER, `review_modify_date` INTEGER, PRIMARY KEY(`id`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `custom_lists` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT, `games_count` INTEGER NOT NULL, `closed` INTEGER NOT NULL, `creation_date` INTEGER NOT NULL, `color_hex` TEXT, PRIMARY KEY(`id`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6b0864cc364f47717d035fa2ec3e4883')");
        }

        /* renamed from: b */
        public void mo4099b(C3537b bVar) {
            bVar.execSQL("DROP TABLE IF EXISTS `short_games`");
            bVar.execSQL("DROP TABLE IF EXISTS `custom_lists`");
            if (InMemoryDatabase_Impl.this.f2811h != null) {
                int size = InMemoryDatabase_Impl.this.f2811h.size();
                for (int i = 0; i < size; i++) {
                    ((C0713b) InMemoryDatabase_Impl.this.f2811h.get(i)).mo4085b(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo4100c(C3537b bVar) {
            if (InMemoryDatabase_Impl.this.f2811h != null) {
                int size = InMemoryDatabase_Impl.this.f2811h.size();
                for (int i = 0; i < size; i++) {
                    ((C0713b) InMemoryDatabase_Impl.this.f2811h.get(i)).mo4084a(bVar);
                }
            }
        }

        /* renamed from: d */
        public void mo4101d(C3537b bVar) {
            InMemoryDatabase_Impl.this.f2804a = bVar;
            InMemoryDatabase_Impl.this.mo4066a(bVar);
            if (InMemoryDatabase_Impl.this.f2811h != null) {
                int size = InMemoryDatabase_Impl.this.f2811h.size();
                for (int i = 0; i < size; i++) {
                    ((C0713b) InMemoryDatabase_Impl.this.f2811h.get(i)).mo4086c(bVar);
                }
            }
        }

        /* renamed from: e */
        public void mo4102e(C3537b bVar) {
        }

        /* renamed from: f */
        public void mo4103f(C3537b bVar) {
            C0746c.m4064a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C0727b mo4104g(C3537b bVar) {
            C3537b bVar2 = bVar;
            HashMap hashMap = new HashMap(11);
            C0749a aVar = new C0749a("id", "INTEGER", true, 1, null, 1);
            String str = "id";
            hashMap.put(str, aVar);
            C0749a aVar2 = new C0749a("name", "TEXT", true, 0, null, 1);
            hashMap.put("name", aVar2);
            C0749a aVar3 = new C0749a("firstReleaseDate", "INTEGER", true, 0, null, 1);
            hashMap.put("firstReleaseDate", aVar3);
            C0749a aVar4 = new C0749a("category", "INTEGER", true, 0, null, 1);
            hashMap.put("category", aVar4);
            C0749a aVar5 = new C0749a("cover", "TEXT", false, 0, null, 1);
            hashMap.put("cover", aVar5);
            C0749a aVar6 = new C0749a("review_comment", "TEXT", false, 0, null, 1);
            hashMap.put("review_comment", aVar6);
            C0749a aVar7 = new C0749a("review_rating", "INTEGER", false, 0, null, 1);
            hashMap.put("review_rating", aVar7);
            C0749a aVar8 = new C0749a("review_status", "TEXT", false, 0, null, 1);
            hashMap.put("review_status", aVar8);
            C0749a aVar9 = new C0749a("review_completed", "INTEGER", false, 0, null, 1);
            hashMap.put("review_completed", aVar9);
            C0749a aVar10 = new C0749a("review_playing", "INTEGER", false, 0, null, 1);
            hashMap.put("review_playing", aVar10);
            C0749a aVar11 = new C0749a("review_modify_date", "INTEGER", false, 0, null, 1);
            hashMap.put("review_modify_date", aVar11);
            String str2 = "short_games";
            C0748e eVar = new C0748e(str2, hashMap, new HashSet(0), new HashSet(0));
            C0748e a = C0748e.m4067a(bVar2, str2);
            String str3 = "\n Found:\n";
            if (!eVar.equals(a)) {
                StringBuilder sb = new StringBuilder();
                sb.append("short_games(io.stashteam.stashapp.data.local.db.model.ShortGameEntity).\n Expected:\n");
                sb.append(eVar);
                sb.append(str3);
                sb.append(a);
                return new C0727b(false, sb.toString());
            }
            HashMap hashMap2 = new HashMap(7);
            C0749a aVar12 = new C0749a("id", "INTEGER", true, 1, null, 1);
            hashMap2.put(str, aVar12);
            C0749a aVar13 = new C0749a("title", "TEXT", true, 0, null, 1);
            hashMap2.put("title", aVar13);
            C0749a aVar14 = new C0749a("description", "TEXT", false, 0, null, 1);
            hashMap2.put("description", aVar14);
            C0749a aVar15 = new C0749a("games_count", "INTEGER", true, 0, null, 1);
            hashMap2.put("games_count", aVar15);
            C0749a aVar16 = new C0749a("closed", "INTEGER", true, 0, null, 1);
            hashMap2.put("closed", aVar16);
            C0749a aVar17 = new C0749a("creation_date", "INTEGER", true, 0, null, 1);
            hashMap2.put("creation_date", aVar17);
            C0749a aVar18 = new C0749a("color_hex", "TEXT", false, 0, null, 1);
            hashMap2.put("color_hex", aVar18);
            String str4 = "custom_lists";
            C0748e eVar2 = new C0748e(str4, hashMap2, new HashSet(0), new HashSet(0));
            C0748e a2 = C0748e.m4067a(bVar2, str4);
            if (eVar2.equals(a2)) {
                return new C0727b(true, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("custom_lists(io.stashteam.stashapp.data.local.db.model.CustomListEntity).\n Expected:\n");
            sb2.append(eVar2);
            sb2.append(str3);
            sb2.append(a2);
            return new C0727b(false, sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3538c mo4063a(C0686c cVar) {
        C0725o oVar = new C0725o(cVar, new C5113a(1), "6b0864cc364f47717d035fa2ec3e4883", "249537d8e12b6073728408c5c1ab28be");
        C3541a a = C3540b.m14493a(cVar.f2743b);
        a.mo11235a(cVar.f2744c);
        a.mo11234a((C3539a) oVar);
        return cVar.f2742a.mo4125a(a.mo11236a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0696i mo4070d() {
        return new C0696i(this, new HashMap(0), new HashMap(0), "short_games", "custom_lists");
    }

    /* renamed from: p */
    public C5121b mo14281p() {
        C5121b bVar;
        if (this.f13332n != null) {
            return this.f13332n;
        }
        synchronized (this) {
            if (this.f13332n == null) {
                this.f13332n = new C5122c(this);
            }
            bVar = this.f13332n;
        }
        return bVar;
    }

    /* renamed from: q */
    public C5135d mo14282q() {
        C5135d dVar;
        if (this.f13331m != null) {
            return this.f13331m;
        }
        synchronized (this) {
            if (this.f13331m == null) {
                this.f13331m = new C5136e(this);
            }
            dVar = this.f13331m;
        }
        return dVar;
    }
}
