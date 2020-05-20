package p255io.stashteam.stashapp.data.local.p264db.p266b;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.C0682a;
import androidx.room.C0687d;
import androidx.room.C0688e;
import androidx.room.C0711l;
import androidx.room.C0716m;
import androidx.room.C0728p;
import androidx.room.C0736t;
import androidx.room.p004y.C0745b;
import androidx.room.p004y.C0746c;
import java.util.List;
import java.util.concurrent.Callable;
import p071f.p133t.p134a.C3545f;
import p255io.stashteam.stashapp.data.local.p264db.p265a.C5117b;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p323z.p324c.C5918l;

/* renamed from: io.stashteam.stashapp.data.local.db.b.g */
public final class C5154g extends C5152f {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0711l f13403b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0688e<C5180f> f13404c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5117b f13405d = new C5117b();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C0687d<C5180f> f13406e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C0736t f13407f;

    /* renamed from: io.stashteam.stashapp.data.local.db.b.g$a */
    class C5155a implements C5918l<C5866d<? super C5812t>, Object> {

        /* renamed from: f */
        final /* synthetic */ List f13408f;

        C5155a(List list) {
            this.f13408f = list;
        }

        /* renamed from: a */
        public Object mo4090d(C5866d<? super C5812t> dVar) {
            return C5154g.super.mo14290a(this.f13408f, dVar);
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.g$b */
    class C5156b implements C5918l<C5866d<? super C5812t>, Object> {

        /* renamed from: f */
        final /* synthetic */ C5180f f13410f;

        C5156b(C5180f fVar) {
            this.f13410f = fVar;
        }

        /* renamed from: a */
        public Object mo4090d(C5866d<? super C5812t> dVar) {
            return C5154g.super.mo14327a(this.f13410f, dVar);
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.g$c */
    class C5157c implements Callable<C5812t> {
        C5157c() {
        }

        public C5812t call() {
            C3545f a = C5154g.this.f13407f.mo4126a();
            C5154g.this.f13403b.mo4069c();
            try {
                a.executeUpdateDelete();
                C5154g.this.f13403b.mo4081o();
                return C5812t.f14872a;
            } finally {
                C5154g.this.f13403b.mo4071e();
                C5154g.this.f13407f.mo4127a(a);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.g$d */
    class C5158d implements Callable<C5180f> {

        /* renamed from: f */
        final /* synthetic */ C0728p f13413f;

        C5158d(C0728p pVar) {
            this.f13413f = pVar;
        }

        public C5180f call() {
            C5180f fVar = null;
            Cursor a = C0746c.m4063a(C5154g.this.f13403b, this.f13413f, false, null);
            try {
                int a2 = C0745b.m4060a(a, "id");
                int a3 = C0745b.m4060a(a, "login");
                int a4 = C0745b.m4060a(a, "fullName");
                int a5 = C0745b.m4060a(a, "email");
                int a6 = C0745b.m4060a(a, "imageUrl");
                int a7 = C0745b.m4060a(a, "statistic");
                int a8 = C0745b.m4060a(a, "externalIdType");
                int a9 = C0745b.m4060a(a, "closed");
                if (a.moveToFirst()) {
                    fVar = new C5180f(a.getLong(a2), a.getString(a3), a.getString(a4), a.getString(a5), a.getString(a6), C5154g.this.f13405d.mo14287a(a.getString(a7)), a.getString(a8), a.getInt(a9) != 0);
                }
                return fVar;
            } finally {
                a.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f13413f.mo4116f();
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.g$e */
    class C5159e implements Callable<C5180f> {

        /* renamed from: f */
        final /* synthetic */ C0728p f13415f;

        C5159e(C0728p pVar) {
            this.f13415f = pVar;
        }

        public C5180f call() {
            C5180f fVar = null;
            Cursor a = C0746c.m4063a(C5154g.this.f13403b, this.f13415f, false, null);
            try {
                int a2 = C0745b.m4060a(a, "id");
                int a3 = C0745b.m4060a(a, "login");
                int a4 = C0745b.m4060a(a, "fullName");
                int a5 = C0745b.m4060a(a, "email");
                int a6 = C0745b.m4060a(a, "imageUrl");
                int a7 = C0745b.m4060a(a, "statistic");
                int a8 = C0745b.m4060a(a, "externalIdType");
                int a9 = C0745b.m4060a(a, "closed");
                if (a.moveToFirst()) {
                    fVar = new C5180f(a.getLong(a2), a.getString(a3), a.getString(a4), a.getString(a5), a.getString(a6), C5154g.this.f13405d.mo14287a(a.getString(a7)), a.getString(a8), a.getInt(a9) != 0);
                }
                return fVar;
            } finally {
                a.close();
                this.f13415f.mo4116f();
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.g$f */
    class C5160f extends C0688e<C5180f> {
        C5160f(C0711l lVar) {
            super(lVar);
        }

        /* renamed from: a */
        public void mo4023a(C3545f fVar, C5180f fVar2) {
            fVar.bindLong(1, fVar2.mo14399d());
            if (fVar2.mo14402f() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, fVar2.mo14402f());
            }
            if (fVar2.mo14398c() == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, fVar2.mo14398c());
            }
            if (fVar2.mo14395a() == null) {
                fVar.bindNull(4);
            } else {
                fVar.bindString(4, fVar2.mo14395a());
            }
            if (fVar2.mo14400e() == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindString(5, fVar2.mo14400e());
            }
            String a = C5154g.this.f13405d.mo14288a(fVar2.mo14403g());
            if (a == null) {
                fVar.bindNull(6);
            } else {
                fVar.bindString(6, a);
            }
            if (fVar2.mo14397b() == null) {
                fVar.bindNull(7);
            } else {
                fVar.bindString(7, fVar2.mo14397b());
            }
            fVar.bindLong(8, fVar2.mo14404h() ? 1 : 0);
        }

        /* renamed from: c */
        public String mo4129c() {
            return "INSERT OR IGNORE INTO `users` (`id`,`login`,`fullName`,`email`,`imageUrl`,`statistic`,`externalIdType`,`closed`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.g$g */
    class C5161g extends C0687d<C5180f> {
        C5161g(C5154g gVar, C0711l lVar) {
            super(lVar);
        }

        /* renamed from: a */
        public void mo4021a(C3545f fVar, C5180f fVar2) {
            fVar.bindLong(1, fVar2.mo14399d());
        }

        /* renamed from: c */
        public String mo4129c() {
            return "DELETE FROM `users` WHERE `id` = ?";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.g$h */
    class C5162h extends C0687d<C5180f> {
        C5162h(C0711l lVar) {
            super(lVar);
        }

        /* renamed from: a */
        public void mo4021a(C3545f fVar, C5180f fVar2) {
            fVar.bindLong(1, fVar2.mo14399d());
            if (fVar2.mo14402f() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, fVar2.mo14402f());
            }
            if (fVar2.mo14398c() == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, fVar2.mo14398c());
            }
            if (fVar2.mo14395a() == null) {
                fVar.bindNull(4);
            } else {
                fVar.bindString(4, fVar2.mo14395a());
            }
            if (fVar2.mo14400e() == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindString(5, fVar2.mo14400e());
            }
            String a = C5154g.this.f13405d.mo14288a(fVar2.mo14403g());
            if (a == null) {
                fVar.bindNull(6);
            } else {
                fVar.bindString(6, a);
            }
            if (fVar2.mo14397b() == null) {
                fVar.bindNull(7);
            } else {
                fVar.bindString(7, fVar2.mo14397b());
            }
            fVar.bindLong(8, fVar2.mo14404h() ? 1 : 0);
            fVar.bindLong(9, fVar2.mo14399d());
        }

        /* renamed from: c */
        public String mo4129c() {
            return "UPDATE OR ABORT `users` SET `id` = ?,`login` = ?,`fullName` = ?,`email` = ?,`imageUrl` = ?,`statistic` = ?,`externalIdType` = ?,`closed` = ? WHERE `id` = ?";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.g$i */
    class C5163i extends C0736t {
        C5163i(C5154g gVar, C0711l lVar) {
            super(lVar);
        }

        /* renamed from: c */
        public String mo4129c() {
            return "DELETE FROM users";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.g$j */
    class C5164j implements Callable<Long> {

        /* renamed from: f */
        final /* synthetic */ C5180f f13419f;

        C5164j(C5180f fVar) {
            this.f13419f = fVar;
        }

        public Long call() {
            C5154g.this.f13403b.mo4069c();
            try {
                long a = C5154g.this.f13404c.mo4022a(this.f13419f);
                C5154g.this.f13403b.mo4081o();
                return Long.valueOf(a);
            } finally {
                C5154g.this.f13403b.mo4071e();
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.g$k */
    class C5165k implements Callable<C5812t> {

        /* renamed from: f */
        final /* synthetic */ C5180f f13421f;

        C5165k(C5180f fVar) {
            this.f13421f = fVar;
        }

        public C5812t call() {
            C5154g.this.f13403b.mo4069c();
            try {
                C5154g.this.f13406e.mo4020a(this.f13421f);
                C5154g.this.f13403b.mo4081o();
                return C5812t.f14872a;
            } finally {
                C5154g.this.f13403b.mo4071e();
            }
        }
    }

    public C5154g(C0711l lVar) {
        this.f13403b = lVar;
        this.f13404c = new C5160f(lVar);
        new C5161g(this, lVar);
        this.f13406e = new C5162h(lVar);
        this.f13407f = new C5163i(this, lVar);
    }

    /* renamed from: a */
    public LiveData<C5180f> mo14326a() {
        return this.f13403b.mo4074h().mo4034a(new String[]{"users"}, false, (Callable<T>) new C5158d<T>(C0728p.m4018b("SELECT * FROM users LIMIT 1", 0)));
    }

    /* renamed from: a */
    public Object mo14327a(C5180f fVar, C5866d<? super C5812t> dVar) {
        return C0716m.m3985a(this.f13403b, (C5918l<? super C5866d<? super R>, ? extends Object>) new C5156b<Object,Object>(fVar), dVar);
    }

    /* renamed from: a */
    public Object mo14290a(List<? extends C5180f> list, C5866d<? super C5812t> dVar) {
        return C0716m.m3985a(this.f13403b, (C5918l<? super C5866d<? super R>, ? extends Object>) new C5155a<Object,Object>(list), dVar);
    }

    /* renamed from: a */
    public Object mo14328a(C5866d<? super C5812t> dVar) {
        return C0682a.m3895a(this.f13403b, true, new C5157c(), dVar);
    }

    /* renamed from: b */
    public Object mo14289a(C5180f fVar, C5866d<? super Long> dVar) {
        return C0682a.m3895a(this.f13403b, true, new C5164j(fVar), dVar);
    }

    /* renamed from: b */
    public Object mo14329b(C5866d<? super C5180f> dVar) {
        return C0682a.m3895a(this.f13403b, false, new C5159e(C0728p.m4018b("SELECT * FROM users LIMIT 1", 0)), dVar);
    }

    /* renamed from: c */
    public Object mo14292c(C5180f fVar, C5866d<? super C5812t> dVar) {
        return C0682a.m3895a(this.f13403b, true, new C5165k(fVar), dVar);
    }
}
