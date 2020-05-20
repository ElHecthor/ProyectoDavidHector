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
import p255io.stashteam.stashapp.data.local.p264db.p266b.C5152f;
import p255io.stashteam.stashapp.data.local.p264db.p266b.C5154g;

/* renamed from: io.stashteam.stashapp.data.local.db.PersistenceDatabase_Impl */
public final class PersistenceDatabase_Impl extends PersistenceDatabase {

    /* renamed from: m */
    private volatile C5152f f13335m;

    /* renamed from: io.stashteam.stashapp.data.local.db.PersistenceDatabase_Impl$a */
    class C5115a extends C0726a {
        C5115a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo4098a(C3537b bVar) {
            bVar.execSQL("CREATE TABLE IF NOT EXISTS `users` (`id` INTEGER NOT NULL, `login` TEXT, `fullName` TEXT, `email` TEXT, `imageUrl` TEXT, `statistic` TEXT, `externalIdType` TEXT, `closed` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '075f3aafc3d230c0421ae1312f817159')");
        }

        /* renamed from: b */
        public void mo4099b(C3537b bVar) {
            bVar.execSQL("DROP TABLE IF EXISTS `users`");
            if (PersistenceDatabase_Impl.this.f2811h != null) {
                int size = PersistenceDatabase_Impl.this.f2811h.size();
                for (int i = 0; i < size; i++) {
                    ((C0713b) PersistenceDatabase_Impl.this.f2811h.get(i)).mo4085b(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo4100c(C3537b bVar) {
            if (PersistenceDatabase_Impl.this.f2811h != null) {
                int size = PersistenceDatabase_Impl.this.f2811h.size();
                for (int i = 0; i < size; i++) {
                    ((C0713b) PersistenceDatabase_Impl.this.f2811h.get(i)).mo4084a(bVar);
                }
            }
        }

        /* renamed from: d */
        public void mo4101d(C3537b bVar) {
            PersistenceDatabase_Impl.this.f2804a = bVar;
            PersistenceDatabase_Impl.this.mo4066a(bVar);
            if (PersistenceDatabase_Impl.this.f2811h != null) {
                int size = PersistenceDatabase_Impl.this.f2811h.size();
                for (int i = 0; i < size; i++) {
                    ((C0713b) PersistenceDatabase_Impl.this.f2811h.get(i)).mo4086c(bVar);
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
            HashMap hashMap = new HashMap(8);
            C0749a aVar = new C0749a("id", "INTEGER", true, 1, null, 1);
            hashMap.put("id", aVar);
            C0749a aVar2 = new C0749a("login", "TEXT", false, 0, null, 1);
            hashMap.put("login", aVar2);
            C0749a aVar3 = new C0749a("fullName", "TEXT", false, 0, null, 1);
            hashMap.put("fullName", aVar3);
            C0749a aVar4 = new C0749a("email", "TEXT", false, 0, null, 1);
            hashMap.put("email", aVar4);
            C0749a aVar5 = new C0749a("imageUrl", "TEXT", false, 0, null, 1);
            hashMap.put("imageUrl", aVar5);
            C0749a aVar6 = new C0749a("statistic", "TEXT", false, 0, null, 1);
            hashMap.put("statistic", aVar6);
            C0749a aVar7 = new C0749a("externalIdType", "TEXT", false, 0, null, 1);
            hashMap.put("externalIdType", aVar7);
            C0749a aVar8 = new C0749a("closed", "INTEGER", true, 0, null, 1);
            hashMap.put("closed", aVar8);
            String str = "users";
            C0748e eVar = new C0748e(str, hashMap, new HashSet(0), new HashSet(0));
            C0748e a = C0748e.m4067a(bVar, str);
            if (eVar.equals(a)) {
                return new C0727b(true, null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("users(io.stashteam.stashapp.data.local.db.model.UserEntity).\n Expected:\n");
            sb.append(eVar);
            sb.append("\n Found:\n");
            sb.append(a);
            return new C0727b(false, sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3538c mo4063a(C0686c cVar) {
        C0725o oVar = new C0725o(cVar, new C5115a(4), "075f3aafc3d230c0421ae1312f817159", "08d3d7f30c5bf061e4c083bfeb1a3797");
        C3541a a = C3540b.m14493a(cVar.f2743b);
        a.mo11235a(cVar.f2744c);
        a.mo11234a((C3539a) oVar);
        return cVar.f2742a.mo4125a(a.mo11236a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0696i mo4070d() {
        return new C0696i(this, new HashMap(0), new HashMap(0), "users");
    }

    /* renamed from: p */
    public C5152f mo14281p() {
        C5152f fVar;
        if (this.f13335m != null) {
            return this.f13335m;
        }
        synchronized (this) {
            if (this.f13335m == null) {
                this.f13335m = new C5154g(this);
            }
            fVar = this.f13335m;
        }
        return fVar;
    }
}
