package p147g.p156d.p157a.p158a.p159i.p162v.p163j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p147g.p156d.p157a.p158a.C3739b;
import p147g.p156d.p157a.p158a.p159i.C3760g;
import p147g.p156d.p157a.p158a.p159i.C3761h;
import p147g.p156d.p157a.p158a.p159i.C3761h.C3762a;
import p147g.p156d.p157a.p158a.p159i.C3767l;
import p147g.p156d.p157a.p158a.p159i.C3767l.C3768a;
import p147g.p156d.p157a.p158a.p159i.p160t.C3777a;
import p147g.p156d.p157a.p158a.p159i.p164w.C3830a;
import p147g.p156d.p157a.p158a.p159i.p164w.C3831b;
import p147g.p156d.p157a.p158a.p159i.p164w.C3831b.C3832a;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;
import p147g.p156d.p157a.p158a.p159i.p166y.C3839a;

/* renamed from: g.d.a.a.i.v.j.z */
public class C3825z implements C3796c, C3831b {

    /* renamed from: j */
    private static final C3739b f10750j = C3739b.m15293a("proto");

    /* renamed from: f */
    private final C3802e0 f10751f;

    /* renamed from: g */
    private final C3833a f10752g;

    /* renamed from: h */
    private final C3833a f10753h;

    /* renamed from: i */
    private final C3798d f10754i;

    /* renamed from: g.d.a.a.i.v.j.z$b */
    interface C3827b<T, U> {
        /* renamed from: a */
        U mo11997a(T t);
    }

    /* renamed from: g.d.a.a.i.v.j.z$c */
    private static class C3828c {

        /* renamed from: a */
        final String f10755a;

        /* renamed from: b */
        final String f10756b;

        private C3828c(String str, String str2) {
            this.f10755a = str;
            this.f10756b = str2;
        }
    }

    /* renamed from: g.d.a.a.i.v.j.z$d */
    interface C3829d<T> {
        /* renamed from: a */
        T mo11998a();
    }

    C3825z(C3833a aVar, C3833a aVar2, C3798d dVar, C3802e0 e0Var) {
        this.f10751f = e0Var;
        this.f10752g = aVar;
        this.f10753h = aVar2;
        this.f10754i = dVar;
    }

    /* renamed from: a */
    private long m15526a(SQLiteDatabase sQLiteDatabase, C3767l lVar) {
        Long b = m15545b(sQLiteDatabase, lVar);
        if (b != null) {
            return b.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", lVar.mo11928a());
        contentValues.put("priority", Integer.valueOf(C3839a.m15580a(lVar.mo11930c())));
        contentValues.put("next_request_ms", Integer.valueOf(0));
        if (lVar.mo11929b() != null) {
            contentValues.put("extras", Base64.encodeToString(lVar.mo11929b(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: a */
    private SQLiteDatabase m15527a() {
        C3802e0 e0Var = this.f10751f;
        e0Var.getClass();
        return (SQLiteDatabase) m15535a(C3817r.m15510a(e0Var), C3819t.m15514a());
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m15528a(C3825z zVar, C3767l lVar, SQLiteDatabase sQLiteDatabase) {
        Long b = zVar.m15545b(sQLiteDatabase, lVar);
        if (b == null) {
            return Boolean.valueOf(false);
        }
        return (Boolean) m15533a(zVar.m15527a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b.toString()}), C3818s.m15512a());
    }

    /* renamed from: a */
    static /* synthetic */ Long m15530a(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0);
    }

    /* renamed from: a */
    static /* synthetic */ Long m15531a(C3825z zVar, C3767l lVar, C3761h hVar, SQLiteDatabase sQLiteDatabase) {
        if (zVar.m15556g()) {
            return Long.valueOf(-1);
        }
        long a = zVar.m15526a(sQLiteDatabase, lVar);
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(a));
        contentValues.put("transport_name", hVar.mo11902f());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.mo11900d()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.mo11903g()));
        contentValues.put("payload_encoding", hVar.mo11899c().mo11942b().mo11892a());
        contentValues.put("payload", hVar.mo11899c().mo11941a());
        contentValues.put("code", hVar.mo11898b());
        contentValues.put("num_attempts", Integer.valueOf(0));
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        for (Entry entry : hVar.mo11949e().entrySet()) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("event_id", Long.valueOf(insert));
            contentValues2.put("name", (String) entry.getKey());
            contentValues2.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues2);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: a */
    static /* synthetic */ Object m15532a(long j, C3767l lVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        String str = "transport_contexts";
        if (sQLiteDatabase.update(str, contentValues, "backend_name = ? and priority = ?", new String[]{lVar.mo11928a(), String.valueOf(C3839a.m15580a(lVar.mo11930c()))}) < 1) {
            contentValues.put("backend_name", lVar.mo11928a());
            contentValues.put("priority", Integer.valueOf(C3839a.m15580a(lVar.mo11930c())));
            sQLiteDatabase.insert(str, null, contentValues);
        }
        return null;
    }

    /* renamed from: a */
    private static <T> T m15533a(Cursor cursor, C3827b<Cursor, T> bVar) {
        try {
            return bVar.mo11997a(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: a */
    private <T> T m15534a(C3827b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase a = m15527a();
        a.beginTransaction();
        try {
            T a2 = bVar.mo11997a(a);
            a.setTransactionSuccessful();
            return a2;
        } finally {
            a.endTransaction();
        }
    }

    /* renamed from: a */
    private <T> T m15535a(C3829d<T> dVar, C3827b<Throwable, T> bVar) {
        long a = this.f10753h.mo12001a();
        while (true) {
            try {
                return dVar.mo11998a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f10753h.mo12001a() >= ((long) this.f10754i.mo11964a()) + a) {
                    return bVar.mo11997a(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ Object m15536a(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ Object m15537a(Throwable th) {
        throw new C3830a("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: a */
    static /* synthetic */ Object m15538a(List list, C3767l lVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            C3762a i = C3761h.m15347i();
            i.mo11909a(cursor.getString(1));
            i.mo11906a(cursor.getLong(2));
            i.mo11912b(cursor.getLong(3));
            i.mo11907a(new C3760g(m15554d(cursor.getString(4)), cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                i.mo11908a(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(C3807h.m15488a(j, lVar, i.mo11911a()));
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ Object m15539a(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C3828c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* renamed from: a */
    private List<C3807h> m15540a(List<C3807h> list, Map<Long, Set<C3828c>> map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C3807h hVar = (C3807h) listIterator.next();
            if (map.containsKey(Long.valueOf(hVar.mo11977b()))) {
                C3762a h = hVar.mo11976a().mo11950h();
                for (C3828c cVar : (Set) map.get(Long.valueOf(hVar.mo11977b()))) {
                    h.mo11953a(cVar.f10755a, cVar.f10756b);
                }
                listIterator.set(C3807h.m15488a(hVar.mo11977b(), hVar.mo11978c(), h.mo11911a()));
            }
        }
        return list;
    }

    /* renamed from: a */
    private Map<Long, Set<C3828c>> m15541a(SQLiteDatabase sQLiteDatabase, List<C3807h> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(((C3807h) list.get(i)).mo11977b());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m15533a(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), C3813n.m15502a((Map) hashMap));
        return hashMap;
    }

    /* renamed from: a */
    private void m15542a(SQLiteDatabase sQLiteDatabase) {
        m15535a(C3814o.m15504a(sQLiteDatabase), C3815p.m15506a());
    }

    /* renamed from: b */
    static /* synthetic */ SQLiteDatabase m15543b(Throwable th) {
        throw new C3830a("Timed out while trying to open db.", th);
    }

    /* renamed from: b */
    static /* synthetic */ Long m15544b(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: b */
    private Long m15545b(SQLiteDatabase sQLiteDatabase, C3767l lVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{lVar.mo11928a(), String.valueOf(C3839a.m15580a(lVar.mo11930c()))}));
        if (lVar.mo11929b() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(lVar.mo11929b(), 0));
        }
        return (Long) m15533a(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), C3821v.m15518a());
    }

    /* renamed from: b */
    static /* synthetic */ List m15547b(C3825z zVar, C3767l lVar, SQLiteDatabase sQLiteDatabase) {
        List c = zVar.m15551c(sQLiteDatabase, lVar);
        zVar.m15540a(c, zVar.m15541a(sQLiteDatabase, c));
        return c;
    }

    /* renamed from: c */
    private static String m15548c(Iterable<C3807h> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C3807h) it.next()).mo11977b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: c */
    static /* synthetic */ List m15549c(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            C3768a d = C3767l.m15386d();
            d.mo11934a(cursor.getString(1));
            d.mo11933a(C3839a.m15581a(cursor.getInt(2)));
            d.mo11935a(m15552c(cursor.getString(3)));
            arrayList.add(d.mo11936a());
        }
        return arrayList;
    }

    /* renamed from: c */
    static /* synthetic */ List m15550c(SQLiteDatabase sQLiteDatabase) {
        return (List) m15533a(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C3816q.m15508a());
    }

    /* renamed from: c */
    private List<C3807h> m15551c(SQLiteDatabase sQLiteDatabase, C3767l lVar) {
        ArrayList arrayList = new ArrayList();
        Long b = m15545b(sQLiteDatabase, lVar);
        if (b == null) {
            return arrayList;
        }
        String str = "events";
        String str2 = "context_id = ?";
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m15533a(sQLiteDatabase2.query(str, new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code"}, str2, new String[]{b.toString()}, null, null, null, String.valueOf(this.f10754i.mo11966c())), C3812m.m15500a(arrayList, lVar));
        return arrayList;
    }

    /* renamed from: c */
    private static byte[] m15552c(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: d */
    private long m15553d() {
        return m15527a().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: d */
    private static C3739b m15554d(String str) {
        return str == null ? f10750j : C3739b.m15293a(str);
    }

    /* renamed from: f */
    private long m15555f() {
        return m15527a().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: g */
    private boolean m15556g() {
        return m15553d() * m15555f() >= this.f10754i.mo11967d();
    }

    /* renamed from: a */
    public C3807h mo11983a(C3767l lVar, C3761h hVar) {
        C3777a.m15418a("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", lVar.mo11930c(), hVar.mo11902f(), lVar.mo11928a());
        long longValue = ((Long) m15534a(C3820u.m15516a(this, lVar, hVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C3807h.m15488a(longValue, lVar, hVar);
    }

    /* renamed from: a */
    public Iterable<C3807h> mo11984a(C3767l lVar) {
        return (Iterable) m15534a(C3809j.m15494a(this, lVar));
    }

    /* renamed from: a */
    public <T> T mo11999a(C3832a<T> aVar) {
        SQLiteDatabase a = m15527a();
        m15542a(a);
        try {
            T h = aVar.mo6458h();
            a.setTransactionSuccessful();
            return h;
        } finally {
            a.endTransaction();
        }
    }

    /* renamed from: a */
    public void mo11985a(C3767l lVar, long j) {
        m15534a(C3808i.m15492a(j, lVar));
    }

    /* renamed from: a */
    public void mo11986a(Iterable<C3807h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM events WHERE _id in ");
            sb.append(m15548c(iterable));
            m15527a().compileStatement(sb.toString()).execute();
        }
    }

    /* renamed from: b */
    public long mo11987b(C3767l lVar) {
        return ((Long) m15533a(m15527a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{lVar.mo11928a(), String.valueOf(C3839a.m15580a(lVar.mo11930c()))}), C3823x.m15522a())).longValue();
    }

    /* renamed from: b */
    public void mo11988b(Iterable<C3807h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            sb.append(m15548c(iterable));
            m15534a(C3822w.m15520a(sb.toString()));
        }
    }

    /* renamed from: c */
    public int mo11989c() {
        return ((Integer) m15534a(C3811l.m15498a(this.f10752g.mo12001a() - this.f10754i.mo11965b()))).intValue();
    }

    /* renamed from: c */
    public boolean mo11990c(C3767l lVar) {
        return ((Boolean) m15534a(C3824y.m15524a(this, lVar))).booleanValue();
    }

    public void close() {
        this.f10751f.close();
    }

    /* renamed from: k */
    public Iterable<C3767l> mo11991k() {
        return (Iterable) m15534a(C3810k.m15496a());
    }
}
