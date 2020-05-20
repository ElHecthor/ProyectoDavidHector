package p255io.stashteam.stashapp.data.local.p264db.p266b;

import android.database.Cursor;
import androidx.room.C0682a;
import androidx.room.C0687d;
import androidx.room.C0688e;
import androidx.room.C0711l;
import androidx.room.C0716m;
import androidx.room.C0728p;
import androidx.room.C0736t;
import androidx.room.p003x.C0742a;
import androidx.room.p004y.C0746c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p071f.p131r.C3490d.C3492b;
import p071f.p133t.p134a.C3544e;
import p071f.p133t.p134a.C3545f;
import p255io.stashteam.stashapp.data.local.p264db.p265a.C5116a;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5176b;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5177c;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5178d;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p323z.p324c.C5918l;

/* renamed from: io.stashteam.stashapp.data.local.db.b.e */
public final class C5136e extends C5135d {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0711l f13373b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0688e<C5178d> f13374c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5116a f13375d = new C5116a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C0687d<C5178d> f13376e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C0736t f13377f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C0736t f13378g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C0736t f13379h;

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$a */
    class C5137a implements Callable<C5812t> {

        /* renamed from: f */
        final /* synthetic */ C5178d f13380f;

        C5137a(C5178d dVar) {
            this.f13380f = dVar;
        }

        public C5812t call() {
            C5136e.this.f13373b.mo4069c();
            try {
                C5136e.this.f13376e.mo4020a(this.f13380f);
                C5136e.this.f13373b.mo4081o();
                return C5812t.f14872a;
            } finally {
                C5136e.this.f13373b.mo4071e();
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$b */
    class C5138b implements C5918l<C5866d<? super C5812t>, Object> {

        /* renamed from: f */
        final /* synthetic */ List f13382f;

        C5138b(List list) {
            this.f13382f = list;
        }

        /* renamed from: a */
        public Object mo4090d(C5866d<? super C5812t> dVar) {
            return C5136e.super.mo14290a(this.f13382f, dVar);
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$c */
    class C5139c implements Callable<C5812t> {

        /* renamed from: f */
        final /* synthetic */ long f13384f;

        C5139c(long j) {
            this.f13384f = j;
        }

        public C5812t call() {
            C3545f a = C5136e.this.f13377f.mo4126a();
            a.bindLong(1, this.f13384f);
            C5136e.this.f13373b.mo4069c();
            try {
                a.executeUpdateDelete();
                C5136e.this.f13373b.mo4081o();
                return C5812t.f14872a;
            } finally {
                C5136e.this.f13373b.mo4071e();
                C5136e.this.f13377f.mo4127a(a);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$d */
    class C5140d implements Callable<C5812t> {

        /* renamed from: f */
        final /* synthetic */ String f13386f;

        C5140d(String str) {
            this.f13386f = str;
        }

        public C5812t call() {
            C3545f a = C5136e.this.f13378g.mo4126a();
            String str = this.f13386f;
            if (str == null) {
                a.bindNull(1);
            } else {
                a.bindString(1, str);
            }
            C5136e.this.f13373b.mo4069c();
            try {
                a.executeUpdateDelete();
                C5136e.this.f13373b.mo4081o();
                return C5812t.f14872a;
            } finally {
                C5136e.this.f13373b.mo4071e();
                C5136e.this.f13378g.mo4127a(a);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$e */
    class C5141e implements Callable<C5812t> {
        C5141e() {
        }

        public C5812t call() {
            C3545f a = C5136e.this.f13379h.mo4126a();
            C5136e.this.f13373b.mo4069c();
            try {
                a.executeUpdateDelete();
                C5136e.this.f13373b.mo4081o();
                return C5812t.f14872a;
            } finally {
                C5136e.this.f13373b.mo4071e();
                C5136e.this.f13379h.mo4127a(a);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$f */
    class C5142f implements Callable<Integer> {

        /* renamed from: f */
        final /* synthetic */ C0728p f13389f;

        C5142f(C0728p pVar) {
            this.f13389f = pVar;
        }

        public Integer call() {
            Integer num = null;
            Cursor a = C0746c.m4063a(C5136e.this.f13373b, this.f13389f, false, null);
            try {
                if (a.moveToFirst()) {
                    if (!a.isNull(0)) {
                        num = Integer.valueOf(a.getInt(0));
                    }
                }
                return num;
            } finally {
                a.close();
                this.f13389f.mo4116f();
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$g */
    class C5143g extends C3492b<Integer, C5178d> {

        /* renamed from: a */
        final /* synthetic */ C3544e f13391a;

        /* renamed from: io.stashteam.stashapp.data.local.db.b.e$g$a */
        class C5144a extends C0742a<C5178d> {
            C5144a(C0711l lVar, C3544e eVar, boolean z, String... strArr) {
                super(lVar, eVar, z, strArr);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public List<C5178d> mo4143a(Cursor cursor) {
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    arrayList.add(C5136e.this.m20356a(cursor));
                }
                return arrayList;
            }
        }

        C5143g(C3544e eVar) {
            this.f13391a = eVar;
        }

        /* renamed from: a */
        public C0742a<C5178d> m20378a() {
            C5144a aVar = new C5144a(C5136e.this.f13373b, this.f13391a, false, "short_games");
            return aVar;
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$h */
    class C5145h extends C0688e<C5178d> {
        C5145h(C0711l lVar) {
            super(lVar);
        }

        /* renamed from: a */
        public void mo4023a(C3545f fVar, C5178d dVar) {
            fVar.bindLong(1, dVar.mo14382e());
            if (dVar.mo14384f() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, dVar.mo14384f());
            }
            fVar.bindLong(3, dVar.mo14380c());
            fVar.bindLong(4, (long) dVar.mo14378a());
            String a = C5136e.this.f13375d.mo14286a(dVar.mo14379b());
            if (a == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindString(5, a);
            }
            C5176b d = dVar.mo14381d();
            if (d != null) {
                if (d.mo14363a() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, d.mo14363a());
                }
                fVar.bindLong(7, (long) d.mo14367e());
                if (d.mo14369f() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, d.mo14369f());
                }
                fVar.bindLong(9, d.mo14364b() ? 1 : 0);
                fVar.bindLong(10, d.mo14366d() ? 1 : 0);
                fVar.bindLong(11, d.mo14365c());
                return;
            }
            fVar.bindNull(6);
            fVar.bindNull(7);
            fVar.bindNull(8);
            fVar.bindNull(9);
            fVar.bindNull(10);
            fVar.bindNull(11);
        }

        /* renamed from: c */
        public String mo4129c() {
            return "INSERT OR IGNORE INTO `short_games` (`id`,`name`,`firstReleaseDate`,`category`,`cover`,`review_comment`,`review_rating`,`review_status`,`review_completed`,`review_playing`,`review_modify_date`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$i */
    class C5146i extends C0687d<C5178d> {
        C5146i(C5136e eVar, C0711l lVar) {
            super(lVar);
        }

        /* renamed from: a */
        public void mo4021a(C3545f fVar, C5178d dVar) {
            fVar.bindLong(1, dVar.mo14382e());
        }

        /* renamed from: c */
        public String mo4129c() {
            return "DELETE FROM `short_games` WHERE `id` = ?";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$j */
    class C5147j extends C0687d<C5178d> {
        C5147j(C0711l lVar) {
            super(lVar);
        }

        /* renamed from: a */
        public void mo4021a(C3545f fVar, C5178d dVar) {
            fVar.bindLong(1, dVar.mo14382e());
            if (dVar.mo14384f() == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, dVar.mo14384f());
            }
            fVar.bindLong(3, dVar.mo14380c());
            fVar.bindLong(4, (long) dVar.mo14378a());
            String a = C5136e.this.f13375d.mo14286a(dVar.mo14379b());
            if (a == null) {
                fVar.bindNull(5);
            } else {
                fVar.bindString(5, a);
            }
            C5176b d = dVar.mo14381d();
            if (d != null) {
                if (d.mo14363a() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, d.mo14363a());
                }
                fVar.bindLong(7, (long) d.mo14367e());
                if (d.mo14369f() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, d.mo14369f());
                }
                fVar.bindLong(9, d.mo14364b() ? 1 : 0);
                fVar.bindLong(10, d.mo14366d() ? 1 : 0);
                fVar.bindLong(11, d.mo14365c());
            } else {
                fVar.bindNull(6);
                fVar.bindNull(7);
                fVar.bindNull(8);
                fVar.bindNull(9);
                fVar.bindNull(10);
                fVar.bindNull(11);
            }
            fVar.bindLong(12, dVar.mo14382e());
        }

        /* renamed from: c */
        public String mo4129c() {
            return "UPDATE OR ABORT `short_games` SET `id` = ?,`name` = ?,`firstReleaseDate` = ?,`category` = ?,`cover` = ?,`review_comment` = ?,`review_rating` = ?,`review_status` = ?,`review_completed` = ?,`review_playing` = ?,`review_modify_date` = ? WHERE `id` = ?";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$k */
    class C5148k extends C0736t {
        C5148k(C5136e eVar, C0711l lVar) {
            super(lVar);
        }

        /* renamed from: c */
        public String mo4129c() {
            return "DELETE FROM short_games WHERE id = ?";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$l */
    class C5149l extends C0736t {
        C5149l(C5136e eVar, C0711l lVar) {
            super(lVar);
        }

        /* renamed from: c */
        public String mo4129c() {
            return "DELETE FROM short_games WHERE review_status = ?";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$m */
    class C5150m extends C0736t {
        C5150m(C5136e eVar, C0711l lVar) {
            super(lVar);
        }

        /* renamed from: c */
        public String mo4129c() {
            return "DELETE FROM short_games";
        }
    }

    /* renamed from: io.stashteam.stashapp.data.local.db.b.e$n */
    class C5151n implements Callable<Long> {

        /* renamed from: f */
        final /* synthetic */ C5178d f13396f;

        C5151n(C5178d dVar) {
            this.f13396f = dVar;
        }

        public Long call() {
            C5136e.this.f13373b.mo4069c();
            try {
                long a = C5136e.this.f13374c.mo4022a(this.f13396f);
                C5136e.this.f13373b.mo4081o();
                return Long.valueOf(a);
            } finally {
                C5136e.this.f13373b.mo4071e();
            }
        }
    }

    public C5136e(C0711l lVar) {
        this.f13373b = lVar;
        this.f13374c = new C5145h(lVar);
        new C5146i(this, lVar);
        this.f13376e = new C5147j(lVar);
        this.f13377f = new C5148k(this, lVar);
        this.f13378g = new C5149l(this, lVar);
        this.f13379h = new C5150m(this, lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C5178d m20356a(Cursor cursor) {
        C5177c cVar;
        C5176b bVar;
        boolean z;
        boolean z2;
        Cursor cursor2 = cursor;
        int columnIndex = cursor2.getColumnIndex("id");
        int columnIndex2 = cursor2.getColumnIndex("name");
        int columnIndex3 = cursor2.getColumnIndex("firstReleaseDate");
        int columnIndex4 = cursor2.getColumnIndex("category");
        int columnIndex5 = cursor2.getColumnIndex("cover");
        int columnIndex6 = cursor2.getColumnIndex("review_comment");
        int columnIndex7 = cursor2.getColumnIndex("review_rating");
        int columnIndex8 = cursor2.getColumnIndex("review_status");
        int columnIndex9 = cursor2.getColumnIndex("review_completed");
        int columnIndex10 = cursor2.getColumnIndex("review_playing");
        int columnIndex11 = cursor2.getColumnIndex("review_modify_date");
        long j = 0;
        long j2 = columnIndex == -1 ? 0 : cursor2.getLong(columnIndex);
        String str = null;
        String string = columnIndex2 == -1 ? null : cursor2.getString(columnIndex2);
        long j3 = columnIndex3 == -1 ? 0 : cursor2.getLong(columnIndex3);
        boolean z3 = false;
        int i = columnIndex4 == -1 ? 0 : cursor2.getInt(columnIndex4);
        if (columnIndex5 == -1) {
            cVar = null;
        } else {
            cVar = this.f13375d.mo14285a(cursor2.getString(columnIndex5));
        }
        if ((columnIndex6 == -1 || cursor2.isNull(columnIndex6)) && ((columnIndex7 == -1 || cursor2.isNull(columnIndex7)) && ((columnIndex8 == -1 || cursor2.isNull(columnIndex8)) && ((columnIndex9 == -1 || cursor2.isNull(columnIndex9)) && ((columnIndex10 == -1 || cursor2.isNull(columnIndex10)) && (columnIndex11 == -1 || cursor2.isNull(columnIndex11))))))) {
            bVar = null;
        } else {
            String string2 = columnIndex6 == -1 ? null : cursor2.getString(columnIndex6);
            int i2 = columnIndex7 == -1 ? 0 : cursor2.getInt(columnIndex7);
            if (columnIndex8 != -1) {
                str = cursor2.getString(columnIndex8);
            }
            String str2 = str;
            if (columnIndex9 == -1) {
                z = false;
            } else {
                z = cursor2.getInt(columnIndex9) != 0;
            }
            if (columnIndex10 == -1) {
                z2 = false;
            } else {
                if (cursor2.getInt(columnIndex10) != 0) {
                    z3 = true;
                }
                z2 = z3;
            }
            if (columnIndex11 != -1) {
                j = cursor2.getLong(columnIndex11);
            }
            bVar = new C5176b(string2, i2, str2, z, z2, j);
        }
        C5178d dVar = new C5178d(j2, string, j3, i, cVar, bVar);
        return dVar;
    }

    /* renamed from: a */
    public C3492b<Integer, C5178d> mo14309a(C3544e eVar) {
        return new C5143g(eVar);
    }

    /* renamed from: a */
    public Object mo14310a(long j, C5866d<? super C5812t> dVar) {
        return C0682a.m3895a(this.f13373b, true, new C5139c(j), dVar);
    }

    /* renamed from: a */
    public Object mo14289a(C5178d dVar, C5866d<? super Long> dVar2) {
        return C0682a.m3895a(this.f13373b, true, new C5151n(dVar), dVar2);
    }

    /* renamed from: a */
    public Object mo14311a(String str, C5866d<? super C5812t> dVar) {
        return C0682a.m3895a(this.f13373b, true, new C5140d(str), dVar);
    }

    /* renamed from: a */
    public Object mo14290a(List<? extends C5178d> list, C5866d<? super C5812t> dVar) {
        return C0716m.m3985a(this.f13373b, (C5918l<? super C5866d<? super R>, ? extends Object>) new C5138b<Object,Object>(list), dVar);
    }

    /* renamed from: a */
    public Object mo14312a(C5866d<? super C5812t> dVar) {
        return C0682a.m3895a(this.f13373b, true, new C5141e(), dVar);
    }

    /* renamed from: b */
    public Object mo14292c(C5178d dVar, C5866d<? super C5812t> dVar2) {
        return C0682a.m3895a(this.f13373b, true, new C5137a(dVar), dVar2);
    }

    /* renamed from: b */
    public Object mo14313b(String str, C5866d<? super Integer> dVar) {
        C0728p b = C0728p.m4018b("SELECT COUNT(id) FROM short_games WHERE review_status = ?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        return C0682a.m3895a(this.f13373b, false, new C5142f(b), dVar);
    }
}
