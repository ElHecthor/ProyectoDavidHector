package p147g.p156d.p157a.p158a.p159i.p162v.p163j;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: g.d.a.a.i.v.j.l */
final /* synthetic */ class C3811l implements C3827b {

    /* renamed from: a */
    private final long f10732a;

    private C3811l(long j) {
        this.f10732a = j;
    }

    /* renamed from: a */
    public static C3827b m15498a(long j) {
        return new C3811l(j);
    }

    /* renamed from: a */
    public Object mo11997a(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f10732a)}));
    }
}
