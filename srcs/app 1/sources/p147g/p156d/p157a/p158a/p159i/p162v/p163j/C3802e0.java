package p147g.p156d.p157a.p158a.p159i.p162v.p163j;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.List;

/* renamed from: g.d.a.a.i.v.j.e0 */
final class C3802e0 extends SQLiteOpenHelper {

    /* renamed from: h */
    static int f10716h = 3;

    /* renamed from: i */
    private static final C3803a f10717i = C3795b0.m15450a();

    /* renamed from: j */
    private static final C3803a f10718j = C3797c0.m15461a();

    /* renamed from: k */
    private static final C3803a f10719k;

    /* renamed from: l */
    private static final List<C3803a> f10720l;

    /* renamed from: f */
    private final int f10721f;

    /* renamed from: g */
    private boolean f10722g = false;

    /* renamed from: g.d.a.a.i.v.j.e0$a */
    public interface C3803a {
        /* renamed from: a */
        void mo11982a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C3803a a = C3800d0.m15473a();
        f10719k = a;
        f10720l = Arrays.asList(new C3803a[]{f10717i, f10718j, a});
    }

    C3802e0(Context context, int i) {
        super(context, "com.google.android.datatransport.events", null, i);
        this.f10721f = i;
    }

    /* renamed from: a */
    private void m15477a(SQLiteDatabase sQLiteDatabase) {
        if (!this.f10722g) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    private void m15478a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 <= f10720l.size()) {
            while (i < i2) {
                ((C3803a) f10720l.get(i)).mo11982a(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Migration from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(f10720l.size());
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    static /* synthetic */ void m15479b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: c */
    static /* synthetic */ void m15480c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f10722g = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m15477a(sQLiteDatabase);
        m15478a(sQLiteDatabase, 0, this.f10721f);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m15477a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m15477a(sQLiteDatabase);
        m15478a(sQLiteDatabase, i, i2);
    }
}
