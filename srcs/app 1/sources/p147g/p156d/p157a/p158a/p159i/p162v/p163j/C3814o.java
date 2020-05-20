package p147g.p156d.p157a.p158a.p159i.p162v.p163j;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: g.d.a.a.i.v.j.o */
final /* synthetic */ class C3814o implements C3829d {

    /* renamed from: a */
    private final SQLiteDatabase f10736a;

    private C3814o(SQLiteDatabase sQLiteDatabase) {
        this.f10736a = sQLiteDatabase;
    }

    /* renamed from: a */
    public static C3829d m15504a(SQLiteDatabase sQLiteDatabase) {
        return new C3814o(sQLiteDatabase);
    }

    /* renamed from: a */
    public Object mo11998a() {
        return this.f10736a.beginTransaction();
    }
}
