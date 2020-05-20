package p071f.p133t.p134a.p135g;

import android.database.sqlite.SQLiteStatement;
import p071f.p133t.p134a.C3545f;

/* renamed from: f.t.a.g.e */
class C3554e extends C3553d implements C3545f {

    /* renamed from: g */
    private final SQLiteStatement f10028g;

    C3554e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f10028g = sQLiteStatement;
    }

    public long executeInsert() {
        return this.f10028g.executeInsert();
    }

    public int executeUpdateDelete() {
        return this.f10028g.executeUpdateDelete();
    }
}
