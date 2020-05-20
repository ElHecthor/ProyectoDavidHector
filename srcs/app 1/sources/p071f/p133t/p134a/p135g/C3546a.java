package p071f.p133t.p134a.p135g;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import p071f.p133t.p134a.C3536a;
import p071f.p133t.p134a.C3537b;
import p071f.p133t.p134a.C3544e;
import p071f.p133t.p134a.C3545f;

/* renamed from: f.t.a.g.a */
class C3546a implements C3537b {

    /* renamed from: g */
    private static final String[] f10017g = new String[0];

    /* renamed from: f */
    private final SQLiteDatabase f10018f;

    /* renamed from: f.t.a.g.a$a */
    class C3547a implements CursorFactory {

        /* renamed from: a */
        final /* synthetic */ C3544e f10019a;

        C3547a(C3546a aVar, C3544e eVar) {
            this.f10019a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f10019a.mo4107a(new C3553d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: f.t.a.g.a$b */
    class C3548b implements CursorFactory {

        /* renamed from: a */
        final /* synthetic */ C3544e f10020a;

        C3548b(C3546a aVar, C3544e eVar) {
            this.f10020a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f10020a.mo4107a(new C3553d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    C3546a(SQLiteDatabase sQLiteDatabase) {
        this.f10018f = sQLiteDatabase;
    }

    /* renamed from: a */
    public Cursor mo11221a(C3544e eVar) {
        return this.f10018f.rawQueryWithFactory(new C3547a(this, eVar), eVar.mo4105a(), f10017g, null);
    }

    /* renamed from: a */
    public Cursor mo11222a(C3544e eVar, CancellationSignal cancellationSignal) {
        return this.f10018f.rawQueryWithFactory(new C3548b(this, eVar), eVar.mo4105a(), f10017g, null, cancellationSignal);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo11239a(SQLiteDatabase sQLiteDatabase) {
        return this.f10018f == sQLiteDatabase;
    }

    /* renamed from: b */
    public Cursor mo11223b(String str) {
        return mo11221a((C3544e) new C3536a(str));
    }

    public void beginTransaction() {
        this.f10018f.beginTransaction();
    }

    public void close() {
        this.f10018f.close();
    }

    public C3545f compileStatement(String str) {
        return new C3554e(this.f10018f.compileStatement(str));
    }

    public void endTransaction() {
        this.f10018f.endTransaction();
    }

    public void execSQL(String str) {
        this.f10018f.execSQL(str);
    }

    public List<Pair<String, String>> getAttachedDbs() {
        return this.f10018f.getAttachedDbs();
    }

    public String getPath() {
        return this.f10018f.getPath();
    }

    public boolean inTransaction() {
        return this.f10018f.inTransaction();
    }

    public boolean isOpen() {
        return this.f10018f.isOpen();
    }

    public void setTransactionSuccessful() {
        this.f10018f.setTransactionSuccessful();
    }
}
