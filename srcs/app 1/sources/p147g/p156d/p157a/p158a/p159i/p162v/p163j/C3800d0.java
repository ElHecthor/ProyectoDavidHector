package p147g.p156d.p157a.p158a.p159i.p162v.p163j;

import android.database.sqlite.SQLiteDatabase;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3802e0.C3803a;

/* renamed from: g.d.a.a.i.v.j.d0 */
final /* synthetic */ class C3800d0 implements C3803a {

    /* renamed from: a */
    private static final C3800d0 f10715a = new C3800d0();

    private C3800d0() {
    }

    /* renamed from: a */
    public static C3803a m15473a() {
        return f10715a;
    }

    /* renamed from: a */
    public void mo11982a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
