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
import androidx.room.p003x.C0742a;
import androidx.room.p004y.C0745b;
import androidx.room.p004y.C0746c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p071f.p131r.C3490d.C3492b;
import p071f.p133t.p134a.C3545f;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5175a;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p323z.p324c.C5918l;

/* renamed from: io.stashteam.stashapp.data.local.db.b.c */
public final class C5122c extends C5121b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0711l f13355b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0688e<C5175a> f13356c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C0687d<C5175a> f13357d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C0736t f13358e;

    /* renamed from: io.stashteam.stashapp.data.local.db.b.c$a */
    class C5123a implements C5918l<C5866d<? super C5812t>, Object> {

        /* renamed from: f */
        final /* synthetic */ List f13359f;

        C5123a(List list) {
            this.f13359f = list;
        }

        /* renamed from: a */
        public Object mo4090d(C5866d<? super C5812t> dVar) {
            return C5122c.super.mo14290a(this.f13359f, dVar);
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.c$b */
    class C5124b implements Callable<C5812t> {

        /* renamed from: f */
        final /* synthetic */ long f13361f;

        C5124b(long j) {
            this.f13361f = j;
        }

        public C5812t call() {
            C3545f a = C5122c.this.f13358e.mo4126a();
            a.bindLong(1, this.f13361f);
            C5122c.this.f13355b.mo4069c();
            try {
                a.executeUpdateDelete();
                C5122c.this.f13355b.mo4081o();
                return C5812t.f14872a;
            } finally {
                C5122c.this.f13355b.mo4071e();
                C5122c.this.f13358e.mo4127a(a);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.c$c */
    class C5125c extends C3492b<Integer, C5175a> {

        /* renamed from: a */
        final /* synthetic */ C0728p f13363a;

        /* renamed from: io.stashteam.stashapp.data.local.db.b.c$c$a */
        class C5126a extends C0742a<C5175a> {
            C5126a(C5125c cVar, C0711l lVar, C0728p pVar, boolean z, String... strArr) {
                super(lVar, pVar, z, strArr);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public List<C5175a> mo4143a(Cursor cursor) {
                Cursor cursor2 = cursor;
                int a = C0745b.m4060a(cursor2, "id");
                int a2 = C0745b.m4060a(cursor2, "title");
                int a3 = C0745b.m4060a(cursor2, "description");
                int a4 = C0745b.m4060a(cursor2, "games_count");
                int a5 = C0745b.m4060a(cursor2, "closed");
                int a6 = C0745b.m4060a(cursor2, "creation_date");
                int a7 = C0745b.m4060a(cursor2, "color_hex");
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    C5175a aVar = new C5175a(cursor2.getLong(a), cursor2.getString(a2), cursor2.getString(a3), cursor2.getInt(a4), cursor2.getInt(a5) != 0, cursor2.getLong(a6), cursor2.getString(a7));
                    arrayList.add(aVar);
                }
                return arrayList;
            }
        }

        C5125c(C0728p pVar) {
            this.f13363a = pVar;
        }

        /* renamed from: a */
        public C0742a<C5175a> m20338a() {
            C5126a aVar = new C5126a(this, C5122c.this.f13355b, this.f13363a, false, "custom_lists");
            return aVar;
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.c$d */
    class C5127d implements Callable<Integer> {

        /* renamed from: f */
        final /* synthetic */ C0728p f13365f;

        C5127d(C0728p pVar) {
            this.f13365f = pVar;
        }

        public Integer call() {
            Integer num = null;
            Cursor a = C0746c.m4063a(C5122c.this.f13355b, this.f13365f, false, null);
            try {
                if (a.moveToFirst()) {
                    if (!a.isNull(0)) {
                        num = Integer.valueOf(a.getInt(0));
                    }
                }
                return num;
            } finally {
                a.close();
                this.f13365f.mo4116f();
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.c$e */
    class C5128e implements Callable<C5175a> {

        /* renamed from: f */
        final /* synthetic */ C0728p f13367f;

        C5128e(C0728p pVar) {
            this.f13367f = pVar;
        }

        public C5175a call() {
            C5175a aVar = null;
            Cursor a = C0746c.m4063a(C5122c.this.f13355b, this.f13367f, false, null);
            try {
                int a2 = C0745b.m4060a(a, "id");
                int a3 = C0745b.m4060a(a, "title");
                int a4 = C0745b.m4060a(a, "description");
                int a5 = C0745b.m4060a(a, "games_count");
                int a6 = C0745b.m4060a(a, "closed");
                int a7 = C0745b.m4060a(a, "creation_date");
                int a8 = C0745b.m4060a(a, "color_hex");
                if (a.moveToFirst()) {
                    aVar = new C5175a(a.getLong(a2), a.getString(a3), a.getString(a4), a.getInt(a5), a.getInt(a6) != 0, a.getLong(a7), a.getString(a8));
                }
                return aVar;
            } finally {
                a.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f13367f.mo4116f();
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.c$f */
    class C5129f extends C0688e<C5175a> {
        C5129f(C5122c cVar, C0711l lVar) {
            super(lVar);
        }

        /* renamed from: a */
        public void mo4023a(C3545f fVar, C5175a aVar) {
            fVar.bindLong(1, aVar.mo14357e());
            if (aVar.mo14359f() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, aVar.mo14359f());
            }
            if (aVar.mo14355c() == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, aVar.mo14355c());
            }
            fVar.bindLong(4, (long) aVar.mo14356d());
            fVar.bindLong(5, aVar.mo14360g() ? 1 : 0);
            fVar.bindLong(6, aVar.mo14354b());
            if (aVar.mo14353a() == null) {
                fVar.bindNull(7);
            } else {
                fVar.bindString(7, aVar.mo14353a());
            }
        }

        /* renamed from: c */
        public String mo4129c() {
            return "INSERT OR IGNORE INTO `custom_lists` (`id`,`title`,`description`,`games_count`,`closed`,`creation_date`,`color_hex`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.c$g */
    class C5130g extends C0687d<C5175a> {
        C5130g(C5122c cVar, C0711l lVar) {
            super(lVar);
        }

        /* renamed from: a */
        public void mo4021a(C3545f fVar, C5175a aVar) {
            fVar.bindLong(1, aVar.mo14357e());
        }

        /* renamed from: c */
        public String mo4129c() {
            return "DELETE FROM `custom_lists` WHERE `id` = ?";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.c$h */
    class C5131h extends C0687d<C5175a> {
        C5131h(C5122c cVar, C0711l lVar) {
            super(lVar);
        }

        /* renamed from: a */
        public void mo4021a(C3545f fVar, C5175a aVar) {
            fVar.bindLong(1, aVar.mo14357e());
            if (aVar.mo14359f() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, aVar.mo14359f());
            }
            if (aVar.mo14355c() == null) {
                fVar.bindNull(3);
            } else {
                fVar.bindString(3, aVar.mo14355c());
            }
            fVar.bindLong(4, (long) aVar.mo14356d());
            fVar.bindLong(5, aVar.mo14360g() ? 1 : 0);
            fVar.bindLong(6, aVar.mo14354b());
            if (aVar.mo14353a() == null) {
                fVar.bindNull(7);
            } else {
                fVar.bindString(7, aVar.mo14353a());
            }
            fVar.bindLong(8, aVar.mo14357e());
        }

        /* renamed from: c */
        public String mo4129c() {
            return "UPDATE OR ABORT `custom_lists` SET `id` = ?,`title` = ?,`description` = ?,`games_count` = ?,`closed` = ?,`creation_date` = ?,`color_hex` = ? WHERE `id` = ?";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.c$i */
    class C5132i extends C0736t {
        C5132i(C5122c cVar, C0711l lVar) {
            super(lVar);
        }

        /* renamed from: c */
        public String mo4129c() {
            return "DELETE FROM custom_lists WHERE id = ?";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.c$j */
    class C5133j implements Callable<Long> {

        /* renamed from: f */
        final /* synthetic */ C5175a f13369f;

        C5133j(C5175a aVar) {
            this.f13369f = aVar;
        }

        public Long call() {
            C5122c.this.f13355b.mo4069c();
            try {
                long a = C5122c.this.f13356c.mo4022a(this.f13369f);
                C5122c.this.f13355b.mo4081o();
                return Long.valueOf(a);
            } finally {
                C5122c.this.f13355b.mo4071e();
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.c$k */
    class C5134k implements Callable<C5812t> {

        /* renamed from: f */
        final /* synthetic */ C5175a f13371f;

        C5134k(C5175a aVar) {
            this.f13371f = aVar;
        }

        public C5812t call() {
            C5122c.this.f13355b.mo4069c();
            try {
                C5122c.this.f13357d.mo4020a(this.f13371f);
                C5122c.this.f13355b.mo4081o();
                return C5812t.f14872a;
            } finally {
                C5122c.this.f13355b.mo4071e();
            }
        }
    }

    public C5122c(C0711l lVar) {
        this.f13355b = lVar;
        this.f13356c = new C5129f(this, lVar);
        new C5130g(this, lVar);
        this.f13357d = new C5131h(this, lVar);
        this.f13358e = new C5132i(this, lVar);
    }

    /* renamed from: a */
    public LiveData<C5175a> mo14293a(long j) {
        C0728p b = C0728p.m4018b("SELECT * FROM custom_lists WHERE id = ? LIMIT 1", 1);
        b.bindLong(1, j);
        return this.f13355b.mo4074h().mo4034a(new String[]{"custom_lists"}, false, (Callable<T>) new C5128e<T>(b));
    }

    /* renamed from: a */
    public C3492b<Integer, C5175a> mo14294a() {
        return new C5125c(C0728p.m4018b("SELECT * FROM custom_lists ORDER BY creation_date DESC", 0));
    }

    /* renamed from: a */
    public Object mo14295a(long j, C5866d<? super C5812t> dVar) {
        return C0682a.m3895a(this.f13355b, true, new C5124b(j), dVar);
    }

    /* renamed from: a */
    public Object mo14289a(C5175a aVar, C5866d<? super Long> dVar) {
        return C0682a.m3895a(this.f13355b, true, new C5133j(aVar), dVar);
    }

    /* renamed from: a */
    public Object mo14290a(List<? extends C5175a> list, C5866d<? super C5812t> dVar) {
        return C0716m.m3985a(this.f13355b, (C5918l<? super C5866d<? super R>, ? extends Object>) new C5123a<Object,Object>(list), dVar);
    }

    /* renamed from: a */
    public Object mo14296a(C5866d<? super Integer> dVar) {
        return C0682a.m3895a(this.f13355b, false, new C5127d(C0728p.m4018b("SELECT COUNT(id) FROM custom_lists", 0)), dVar);
    }

    /* renamed from: b */
    public Object mo14292c(C5175a aVar, C5866d<? super C5812t> dVar) {
        return C0682a.m3895a(this.f13355b, true, new C5134k(aVar), dVar);
    }
}
