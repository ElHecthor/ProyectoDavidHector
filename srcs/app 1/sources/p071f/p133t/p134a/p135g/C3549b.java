package p071f.p133t.p134a.p135g;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import p071f.p133t.p134a.C3537b;
import p071f.p133t.p134a.C3538c;
import p071f.p133t.p134a.C3538c.C3539a;

/* renamed from: f.t.a.g.b */
class C3549b implements C3538c {

    /* renamed from: a */
    private final C3550a f10021a;

    /* renamed from: f.t.a.g.b$a */
    static class C3550a extends SQLiteOpenHelper {

        /* renamed from: f */
        final C3546a[] f10022f;

        /* renamed from: g */
        final C3539a f10023g;

        /* renamed from: h */
        private boolean f10024h;

        /* renamed from: f.t.a.g.b$a$a */
        class C3551a implements DatabaseErrorHandler {

            /* renamed from: a */
            final /* synthetic */ C3539a f10025a;

            /* renamed from: b */
            final /* synthetic */ C3546a[] f10026b;

            C3551a(C3539a aVar, C3546a[] aVarArr) {
                this.f10025a = aVar;
                this.f10026b = aVarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f10025a.mo11233b(C3550a.m14509a(this.f10026b, sQLiteDatabase));
            }
        }

        C3550a(Context context, String str, C3546a[] aVarArr, C3539a aVar) {
            super(context, str, null, aVar.f10010a, new C3551a(aVar, aVarArr));
            this.f10023g = aVar;
            this.f10022f = aVarArr;
        }

        /* renamed from: a */
        static C3546a m14509a(C3546a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            C3546a aVar = aVarArr[0];
            if (aVar == null || !aVar.mo11239a(sQLiteDatabase)) {
                aVarArr[0] = new C3546a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized C3537b mo11243a() {
            this.f10024h = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f10024h) {
                close();
                return mo11243a();
            }
            return mo11244a(writableDatabase);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C3546a mo11244a(SQLiteDatabase sQLiteDatabase) {
            return m14509a(this.f10022f, sQLiteDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f10022f[0] = null;
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f10023g.mo4093a((C3537b) mo11244a(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f10023g.mo4096c(mo11244a(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f10024h = true;
            this.f10023g.mo4094a(mo11244a(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f10024h) {
                this.f10023g.mo4097d(mo11244a(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f10024h = true;
            this.f10023g.mo4095b(mo11244a(sQLiteDatabase), i, i2);
        }
    }

    C3549b(Context context, String str, C3539a aVar) {
        this.f10021a = m14505a(context, str, aVar);
    }

    /* renamed from: a */
    private C3550a m14505a(Context context, String str, C3539a aVar) {
        return new C3550a(context, str, new C3546a[1], aVar);
    }

    /* renamed from: a */
    public C3537b mo4121a() {
        return this.f10021a.mo11243a();
    }

    /* renamed from: a */
    public void mo4123a(boolean z) {
        this.f10021a.setWriteAheadLoggingEnabled(z);
    }

    /* renamed from: b */
    public String mo4124b() {
        return this.f10021a.getDatabaseName();
    }
}
