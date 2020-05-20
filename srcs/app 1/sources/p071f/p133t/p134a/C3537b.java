package p071f.p133t.p134a;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: f.t.a.b */
public interface C3537b extends Closeable {
    /* renamed from: a */
    Cursor mo11221a(C3544e eVar);

    /* renamed from: a */
    Cursor mo11222a(C3544e eVar, CancellationSignal cancellationSignal);

    /* renamed from: b */
    Cursor mo11223b(String str);

    void beginTransaction();

    C3545f compileStatement(String str);

    void endTransaction();

    void execSQL(String str);

    List<Pair<String, String>> getAttachedDbs();

    String getPath();

    boolean inTransaction();

    boolean isOpen();

    void setTransactionSuccessful();
}
