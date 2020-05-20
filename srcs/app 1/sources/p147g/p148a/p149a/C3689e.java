package p147g.p148a.p149a;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: g.a.a.e */
class C3689e implements C3694j {

    /* renamed from: a */
    final /* synthetic */ C3679d f10451a;

    /* renamed from: b */
    final /* synthetic */ C3679d f10452b;

    C3689e(C3679d dVar, C3679d dVar2) {
        this.f10452b = dVar;
        this.f10451a = dVar2;
    }

    /* renamed from: a */
    public void mo11709a(SQLiteDatabase sQLiteDatabase) {
        String str = "store";
        this.f10452b.f10400c.mo11718a(sQLiteDatabase, str, "device_id", this.f10451a.f10404g);
        this.f10452b.f10400c.mo11718a(sQLiteDatabase, str, "user_id", this.f10451a.f10403f);
        String str2 = "long_store";
        this.f10452b.f10400c.mo11718a(sQLiteDatabase, str2, "opt_out", Long.valueOf(this.f10451a.f10408k ? 1 : 0));
        this.f10452b.f10400c.mo11718a(sQLiteDatabase, str2, "previous_session_id", Long.valueOf(this.f10451a.f10414q));
        this.f10452b.f10400c.mo11718a(sQLiteDatabase, str2, "last_event_time", Long.valueOf(this.f10451a.f10418u));
    }
}
