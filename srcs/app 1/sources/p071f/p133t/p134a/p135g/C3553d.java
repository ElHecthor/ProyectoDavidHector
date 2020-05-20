package p071f.p133t.p134a.p135g;

import android.database.sqlite.SQLiteProgram;
import p071f.p133t.p134a.C3543d;

/* renamed from: f.t.a.g.d */
class C3553d implements C3543d {

    /* renamed from: f */
    private final SQLiteProgram f10027f;

    C3553d(SQLiteProgram sQLiteProgram) {
        this.f10027f = sQLiteProgram;
    }

    public void bindBlob(int i, byte[] bArr) {
        this.f10027f.bindBlob(i, bArr);
    }

    public void bindDouble(int i, double d) {
        this.f10027f.bindDouble(i, d);
    }

    public void bindLong(int i, long j) {
        this.f10027f.bindLong(i, j);
    }

    public void bindNull(int i) {
        this.f10027f.bindNull(i);
    }

    public void bindString(int i, String str) {
        this.f10027f.bindString(i, str);
    }

    public void close() {
        this.f10027f.close();
    }
}
