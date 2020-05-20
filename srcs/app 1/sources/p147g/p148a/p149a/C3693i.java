package p147g.p148a.p149a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: g.a.a.i */
class C3693i extends SQLiteOpenHelper {

    /* renamed from: i */
    private static final String f10456i = C3693i.class.getName();

    /* renamed from: j */
    static final Map<String, C3693i> f10457j = new HashMap();

    /* renamed from: k */
    private static final C3690f f10458k = C3690f.m15021a();

    /* renamed from: f */
    File f10459f;

    /* renamed from: g */
    private boolean f10460g = true;

    /* renamed from: h */
    private C3694j f10461h;

    protected C3693i(Context context, String str) {
        super(context, m15037g(str), null, 3);
        this.f10459f = context.getDatabasePath(m15037g(str));
        C3700n.m15139b(str);
    }

    /* renamed from: a */
    private synchronized long m15028a(String str, long j) {
        long j2;
        j2 = -1;
        SQLiteStatement sQLiteStatement = null;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT id FROM ");
            sb.append(str);
            sb.append(" LIMIT 1 OFFSET ");
            sb.append(j - 1);
            sQLiteStatement = readableDatabase.compileStatement(sb.toString());
            try {
                j2 = sQLiteStatement.simpleQueryForLong();
            } catch (SQLiteDoneException e) {
                f10458k.mo11712a(f10456i, (Throwable) e);
            }
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        } catch (SQLiteException e2) {
            f10458k.mo11711a(f10456i, String.format("getNthEventId from %s failed", new Object[]{str}), e2);
            m15038g();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        } catch (StackOverflowError e3) {
            try {
                f10458k.mo11711a(f10456i, String.format("getNthEventId from %s failed", new Object[]{str}), e3);
                m15038g();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                close();
                throw th;
            }
        }
        close();
        return j2;
    }

    @Deprecated
    /* renamed from: a */
    static C3693i m15029a(Context context) {
        return m15030a(context, (String) null);
    }

    /* renamed from: a */
    static synchronized C3693i m15030a(Context context, String str) {
        C3693i iVar;
        synchronized (C3693i.class) {
            String b = C3700n.m15139b(str);
            iVar = (C3693i) f10457j.get(b);
            if (iVar == null) {
                iVar = new C3693i(context.getApplicationContext(), b);
                f10457j.put(b, iVar);
            }
        }
        return iVar;
    }

    /* renamed from: a */
    private void m15031a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identifys");
        onCreate(sQLiteDatabase);
    }

    /* renamed from: a */
    private void m15032a(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (C3700n.m15138a(message) || !message.contains("Couldn't read") || !message.contains("CursorWindow")) {
            throw illegalStateException;
        }
        m15038g();
    }

    /* renamed from: a */
    private static void m15033a(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (C3700n.m15138a(message) || !message.startsWith("Cursor window allocation of")) {
            throw runtimeException;
        }
        throw new C3692h(message);
    }

    /* renamed from: b */
    private synchronized void m15034b(String str, long j) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("id = ");
            sb.append(j);
            writableDatabase.delete(str, sb.toString(), null);
        } catch (SQLiteException e) {
            f10458k.mo11711a(f10456i, String.format("removeEvent from %s failed", new Object[]{str}), e);
            m15038g();
        } catch (StackOverflowError e2) {
            try {
                f10458k.mo11711a(f10456i, String.format("removeEvent from %s failed", new Object[]{str}), e2);
                m15038g();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    /* renamed from: c */
    private synchronized void m15035c(String str, long j) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("id <= ");
            sb.append(j);
            writableDatabase.delete(str, sb.toString(), null);
        } catch (SQLiteException e) {
            f10458k.mo11711a(f10456i, String.format("removeEvents from %s failed", new Object[]{str}), e);
            m15038g();
        } catch (StackOverflowError e2) {
            try {
                f10458k.mo11711a(f10456i, String.format("removeEvents from %s failed", new Object[]{str}), e2);
                m15038g();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x0033=Splitter:B:12:0x0033, B:20:0x0064=Splitter:B:20:0x0064} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long m15036d(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = -1
            r2 = 0
            r3 = 1
            android.database.sqlite.SQLiteDatabase r4 = r7.getWritableDatabase()     // Catch:{ SQLiteException -> 0x004f, StackOverflowError -> 0x0039 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x004f, StackOverflowError -> 0x0039 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x004f, StackOverflowError -> 0x0039 }
            java.lang.String r6 = "event"
            r5.put(r6, r9)     // Catch:{ SQLiteException -> 0x004f, StackOverflowError -> 0x0039 }
            long r4 = r7.mo11717a(r4, r8, r5)     // Catch:{ SQLiteException -> 0x004f, StackOverflowError -> 0x0039 }
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x0033
            g.a.a.f r9 = f10458k     // Catch:{ SQLiteException -> 0x0030, StackOverflowError -> 0x002d }
            java.lang.String r0 = f10456i     // Catch:{ SQLiteException -> 0x0030, StackOverflowError -> 0x002d }
            java.lang.String r1 = "Insert into %s failed"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ SQLiteException -> 0x0030, StackOverflowError -> 0x002d }
            r6[r2] = r8     // Catch:{ SQLiteException -> 0x0030, StackOverflowError -> 0x002d }
            java.lang.String r1 = java.lang.String.format(r1, r6)     // Catch:{ SQLiteException -> 0x0030, StackOverflowError -> 0x002d }
            r9.mo11715d(r0, r1)     // Catch:{ SQLiteException -> 0x0030, StackOverflowError -> 0x002d }
            goto L_0x0033
        L_0x002d:
            r9 = move-exception
            r0 = r4
            goto L_0x003a
        L_0x0030:
            r9 = move-exception
            r0 = r4
            goto L_0x0050
        L_0x0033:
            r7.close()     // Catch:{ all -> 0x006e }
            goto L_0x0068
        L_0x0037:
            r8 = move-exception
            goto L_0x006a
        L_0x0039:
            r9 = move-exception
        L_0x003a:
            g.a.a.f r4 = f10458k     // Catch:{ all -> 0x0037 }
            java.lang.String r5 = f10456i     // Catch:{ all -> 0x0037 }
            java.lang.String r6 = "addEvent to %s failed"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0037 }
            r3[r2] = r8     // Catch:{ all -> 0x0037 }
            java.lang.String r8 = java.lang.String.format(r6, r3)     // Catch:{ all -> 0x0037 }
            r4.mo11711a(r5, r8, r9)     // Catch:{ all -> 0x0037 }
            r7.m15038g()     // Catch:{ all -> 0x0037 }
            goto L_0x0064
        L_0x004f:
            r9 = move-exception
        L_0x0050:
            g.a.a.f r4 = f10458k     // Catch:{ all -> 0x0037 }
            java.lang.String r5 = f10456i     // Catch:{ all -> 0x0037 }
            java.lang.String r6 = "addEvent to %s failed"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0037 }
            r3[r2] = r8     // Catch:{ all -> 0x0037 }
            java.lang.String r8 = java.lang.String.format(r6, r3)     // Catch:{ all -> 0x0037 }
            r4.mo11711a(r5, r8, r9)     // Catch:{ all -> 0x0037 }
            r7.m15038g()     // Catch:{ all -> 0x0037 }
        L_0x0064:
            r7.close()     // Catch:{ all -> 0x006e }
            r4 = r0
        L_0x0068:
            monitor-exit(r7)
            return r4
        L_0x006a:
            r7.close()     // Catch:{ all -> 0x006e }
            throw r8     // Catch:{ all -> 0x006e }
        L_0x006e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p148a.p149a.C3693i.m15036d(java.lang.String, java.lang.String):long");
    }

    /* renamed from: g */
    private static String m15037g(String str) {
        if (C3700n.m15138a(str) || str.equals("$default_instance")) {
            return "com.amplitude.api";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("com.amplitude.api_");
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c7, code lost:
        if (r1.isOpen() != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c9, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e5, code lost:
        if (r1.isOpen() != false) goto L_0x00c9;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15038g() {
        /*
            r8 = this;
            java.lang.String r0 = "databaseReset callback failed during delete"
            r1 = 0
            r2 = 0
            r3 = 1
            r8.close()     // Catch:{ SecurityException -> 0x005a }
            java.io.File r4 = r8.f10459f     // Catch:{ SecurityException -> 0x005a }
            r4.delete()     // Catch:{ SecurityException -> 0x005a }
            g.a.a.j r4 = r8.f10461h
            if (r4 == 0) goto L_0x00ab
            boolean r4 = r8.f10460g
            if (r4 == 0) goto L_0x00ab
            r8.f10460g = r2
            android.database.sqlite.SQLiteDatabase r1 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0031 }
            g.a.a.j r4 = r8.f10461h     // Catch:{ SQLiteException -> 0x0031 }
            r4.mo11709a(r1)     // Catch:{ SQLiteException -> 0x0031 }
            r8.f10460g = r3
            if (r1 == 0) goto L_0x00ab
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00ab
        L_0x002a:
            r8.close()
            goto L_0x00ab
        L_0x002f:
            r0 = move-exception
            goto L_0x004a
        L_0x0031:
            r4 = move-exception
            g.a.a.f r5 = f10458k     // Catch:{ all -> 0x002f }
            java.lang.String r6 = f10456i     // Catch:{ all -> 0x002f }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x002f }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x002f }
            r5.mo11711a(r6, r0, r4)     // Catch:{ all -> 0x002f }
            r8.f10460g = r3
            if (r1 == 0) goto L_0x00ab
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00ab
            goto L_0x002a
        L_0x004a:
            r8.f10460g = r3
            if (r1 == 0) goto L_0x0057
            boolean r1 = r1.isOpen()
            if (r1 == 0) goto L_0x0057
            r8.close()
        L_0x0057:
            throw r0
        L_0x0058:
            r4 = move-exception
            goto L_0x00ac
        L_0x005a:
            r4 = move-exception
            g.a.a.f r5 = f10458k     // Catch:{ all -> 0x0058 }
            java.lang.String r6 = f10456i     // Catch:{ all -> 0x0058 }
            java.lang.String r7 = "delete failed"
            r5.mo11711a(r6, r7, r4)     // Catch:{ all -> 0x0058 }
            g.a.a.j r4 = r8.f10461h
            if (r4 == 0) goto L_0x00ab
            boolean r4 = r8.f10460g
            if (r4 == 0) goto L_0x00ab
            r8.f10460g = r2
            android.database.sqlite.SQLiteDatabase r1 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0084 }
            g.a.a.j r4 = r8.f10461h     // Catch:{ SQLiteException -> 0x0084 }
            r4.mo11709a(r1)     // Catch:{ SQLiteException -> 0x0084 }
            r8.f10460g = r3
            if (r1 == 0) goto L_0x00ab
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00ab
            goto L_0x002a
        L_0x0082:
            r0 = move-exception
            goto L_0x009d
        L_0x0084:
            r4 = move-exception
            g.a.a.f r5 = f10458k     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = f10456i     // Catch:{ all -> 0x0082 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0082 }
            r5.mo11711a(r6, r0, r4)     // Catch:{ all -> 0x0082 }
            r8.f10460g = r3
            if (r1 == 0) goto L_0x00ab
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00ab
            goto L_0x002a
        L_0x009d:
            r8.f10460g = r3
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r1.isOpen()
            if (r1 == 0) goto L_0x00aa
            r8.close()
        L_0x00aa:
            throw r0
        L_0x00ab:
            return
        L_0x00ac:
            g.a.a.j r5 = r8.f10461h
            if (r5 == 0) goto L_0x00f6
            boolean r5 = r8.f10460g
            if (r5 == 0) goto L_0x00f6
            r8.f10460g = r2
            android.database.sqlite.SQLiteDatabase r1 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00cf }
            g.a.a.j r5 = r8.f10461h     // Catch:{ SQLiteException -> 0x00cf }
            r5.mo11709a(r1)     // Catch:{ SQLiteException -> 0x00cf }
            r8.f10460g = r3
            if (r1 == 0) goto L_0x00f6
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00f6
        L_0x00c9:
            r8.close()
            goto L_0x00f6
        L_0x00cd:
            r0 = move-exception
            goto L_0x00e8
        L_0x00cf:
            r5 = move-exception
            g.a.a.f r6 = f10458k     // Catch:{ all -> 0x00cd }
            java.lang.String r7 = f10456i     // Catch:{ all -> 0x00cd }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x00cd }
            r6.mo11711a(r7, r0, r5)     // Catch:{ all -> 0x00cd }
            r8.f10460g = r3
            if (r1 == 0) goto L_0x00f6
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00f6
            goto L_0x00c9
        L_0x00e8:
            r8.f10460g = r3
            if (r1 == 0) goto L_0x00f5
            boolean r1 = r1.isOpen()
            if (r1 == 0) goto L_0x00f5
            r8.close()
        L_0x00f5:
            throw r0
        L_0x00f6:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p148a.p149a.C3693i.m15038g():void");
    }

    /* renamed from: h */
    private synchronized long m15039h(String str) {
        long j;
        SQLiteStatement sQLiteStatement = null;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT COUNT(*) FROM ");
            sb.append(str);
            SQLiteStatement compileStatement = readableDatabase.compileStatement(sb.toString());
            j = compileStatement.simpleQueryForLong();
            if (compileStatement != null) {
                compileStatement.close();
            }
            close();
        } catch (SQLiteException e) {
            f10458k.mo11711a(f10456i, String.format("getNumberRows for %s failed", new Object[]{str}), e);
            m15038g();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            close();
            j = 0;
            return j;
        } catch (StackOverflowError e2) {
            try {
                f10458k.mo11711a(f10456i, String.format("getNumberRows for %s failed", new Object[]{str}), e2);
                m15038g();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                close();
                j = 0;
                return j;
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                close();
                throw th;
            }
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo11716a() {
        return m15039h("events");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo11717a(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        return sQLiteDatabase.insert(str, null, contentValues);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo11718a(SQLiteDatabase sQLiteDatabase, String str, String str2, Object obj) {
        long b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str2);
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            contentValues.put("value", (String) obj);
        }
        b = mo11726b(sQLiteDatabase, str, contentValues);
        if (b == -1) {
            f10458k.mo11715d(f10456i, "Insert failed");
        }
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo11719a(String str, Long l) {
        return l == null ? mo11720a("long_store", str) : mo11721a("long_store", str, (Object) l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo11720a(String str, String str2) {
        long j;
        try {
            j = (long) getWritableDatabase().delete(str, "key=?", new String[]{str2});
            close();
        } catch (SQLiteException e) {
            f10458k.mo11711a(f10456i, String.format("deleteKey from %s failed", new Object[]{str}), e);
            m15038g();
            close();
            j = -1;
            return j;
        } catch (StackOverflowError e2) {
            try {
                f10458k.mo11711a(f10456i, String.format("deleteKey from %s failed", new Object[]{str}), e2);
                m15038g();
                close();
                j = -1;
                return j;
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r2.isOpen() != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r2.isOpen() != false) goto L_0x0037;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long mo11721a(java.lang.String r6, java.lang.String r7, java.lang.Object r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r2 = r5.getWritableDatabase()     // Catch:{ SQLiteException -> 0x003b, StackOverflowError -> 0x001a }
            long r6 = r5.mo11718a(r2, r6, r7, r8)     // Catch:{ SQLiteException -> 0x003b, StackOverflowError -> 0x001a }
            if (r2 == 0) goto L_0x005b
            boolean r8 = r2.isOpen()     // Catch:{ all -> 0x0069 }
            if (r8 == 0) goto L_0x005b
            r5.close()     // Catch:{ all -> 0x0069 }
            goto L_0x005b
        L_0x0018:
            r6 = move-exception
            goto L_0x005d
        L_0x001a:
            r7 = move-exception
            g.a.a.f r8 = f10458k     // Catch:{ all -> 0x0018 }
            java.lang.String r3 = f10456i     // Catch:{ all -> 0x0018 }
            java.lang.String r4 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0018 }
            r1[r0] = r6     // Catch:{ all -> 0x0018 }
            java.lang.String r6 = java.lang.String.format(r4, r1)     // Catch:{ all -> 0x0018 }
            r8.mo11711a(r3, r6, r7)     // Catch:{ all -> 0x0018 }
            r5.m15038g()     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0059
            boolean r6 = r2.isOpen()     // Catch:{ all -> 0x0069 }
            if (r6 == 0) goto L_0x0059
        L_0x0037:
            r5.close()     // Catch:{ all -> 0x0069 }
            goto L_0x0059
        L_0x003b:
            r7 = move-exception
            g.a.a.f r8 = f10458k     // Catch:{ all -> 0x0018 }
            java.lang.String r3 = f10456i     // Catch:{ all -> 0x0018 }
            java.lang.String r4 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0018 }
            r1[r0] = r6     // Catch:{ all -> 0x0018 }
            java.lang.String r6 = java.lang.String.format(r4, r1)     // Catch:{ all -> 0x0018 }
            r8.mo11711a(r3, r6, r7)     // Catch:{ all -> 0x0018 }
            r5.m15038g()     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0059
            boolean r6 = r2.isOpen()     // Catch:{ all -> 0x0069 }
            if (r6 == 0) goto L_0x0059
            goto L_0x0037
        L_0x0059:
            r6 = -1
        L_0x005b:
            monitor-exit(r5)
            return r6
        L_0x005d:
            if (r2 == 0) goto L_0x0068
            boolean r7 = r2.isOpen()     // Catch:{ all -> 0x0069 }
            if (r7 == 0) goto L_0x0068
            r5.close()     // Catch:{ all -> 0x0069 }
        L_0x0068:
            throw r6     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p148a.p149a.C3693i.mo11721a(java.lang.String, java.lang.String, java.lang.Object):long");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Cursor mo11722a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized List<JSONObject> mo11723a(long j, long j2) {
        return mo11724a("events", j, j2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ad A[SYNTHETIC, Splitter:B:45:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c8 A[SYNTHETIC, Splitter:B:51:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e3 A[SYNTHETIC, Splitter:B:57:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00eb A[SYNTHETIC, Splitter:B:62:0x00eb] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:48:0x00b2=Splitter:B:48:0x00b2, B:42:0x00a8=Splitter:B:42:0x00a8, B:54:0x00cd=Splitter:B:54:0x00cd} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<org.json.JSONObject> mo11724a(java.lang.String r19, long r20, long r22) {
        /*
            r18 = this;
            r11 = r18
            r0 = r20
            r2 = r22
            monitor-enter(r18)
            java.util.LinkedList r12 = new java.util.LinkedList     // Catch:{ all -> 0x00f2 }
            r12.<init>()     // Catch:{ all -> 0x00f2 }
            r13 = 0
            r14 = 1
            r15 = 0
            android.database.sqlite.SQLiteDatabase r4 = r18.getReadableDatabase()     // Catch:{ SQLiteException -> 0x00cc, StackOverflowError -> 0x00b1, IllegalStateException -> 0x00a7, RuntimeException -> 0x009e }
            java.lang.String r5 = "id"
            java.lang.String r6 = "event"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch:{ SQLiteException -> 0x00cc, StackOverflowError -> 0x00b1, IllegalStateException -> 0x00a7, RuntimeException -> 0x009e }
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0033
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00cc, StackOverflowError -> 0x00b1, IllegalStateException -> 0x00a7, RuntimeException -> 0x009e }
            r8.<init>()     // Catch:{ SQLiteException -> 0x00cc, StackOverflowError -> 0x00b1, IllegalStateException -> 0x00a7, RuntimeException -> 0x009e }
            java.lang.String r9 = "id <= "
            r8.append(r9)     // Catch:{ SQLiteException -> 0x00cc, StackOverflowError -> 0x00b1, IllegalStateException -> 0x00a7, RuntimeException -> 0x009e }
            r8.append(r0)     // Catch:{ SQLiteException -> 0x00cc, StackOverflowError -> 0x00b1, IllegalStateException -> 0x00a7, RuntimeException -> 0x009e }
            java.lang.String r0 = r8.toString()     // Catch:{ SQLiteException -> 0x00cc, StackOverflowError -> 0x00b1, IllegalStateException -> 0x00a7, RuntimeException -> 0x009e }
            goto L_0x0034
        L_0x0033:
            r0 = r15
        L_0x0034:
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r16 = "id ASC"
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0051
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00cc, StackOverflowError -> 0x00b1, IllegalStateException -> 0x00a7, RuntimeException -> 0x009e }
            r1.<init>()     // Catch:{ SQLiteException -> 0x00cc, StackOverflowError -> 0x00b1, IllegalStateException -> 0x00a7, RuntimeException -> 0x009e }
            java.lang.String r6 = ""
            r1.append(r6)     // Catch:{ SQLiteException -> 0x00cc, StackOverflowError -> 0x00b1, IllegalStateException -> 0x00a7, RuntimeException -> 0x009e }
            r1.append(r2)     // Catch:{ SQLiteException -> 0x00cc, StackOverflowError -> 0x00b1, IllegalStateException -> 0x00a7, RuntimeException -> 0x009e }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteException -> 0x00cc, StackOverflowError -> 0x00b1, IllegalStateException -> 0x00a7, RuntimeException -> 0x009e }
            r17 = r1
            goto L_0x0053
        L_0x0051:
            r17 = r15
        L_0x0053:
            r1 = r18
            r2 = r4
            r3 = r19
            r4 = r5
            r5 = r0
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r16
            r10 = r17
            android.database.Cursor r1 = r1.mo11722a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00cc, StackOverflowError -> 0x00b1, IllegalStateException -> 0x00a7, RuntimeException -> 0x009e }
        L_0x0065:
            boolean r0 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0099, StackOverflowError -> 0x0096, IllegalStateException -> 0x0093, RuntimeException -> 0x0091 }
            if (r0 == 0) goto L_0x0088
            long r2 = r1.getLong(r13)     // Catch:{ SQLiteException -> 0x0099, StackOverflowError -> 0x0096, IllegalStateException -> 0x0093, RuntimeException -> 0x0091 }
            java.lang.String r0 = r1.getString(r14)     // Catch:{ SQLiteException -> 0x0099, StackOverflowError -> 0x0096, IllegalStateException -> 0x0093, RuntimeException -> 0x0091 }
            boolean r4 = p147g.p148a.p149a.C3700n.m15138a(r0)     // Catch:{ SQLiteException -> 0x0099, StackOverflowError -> 0x0096, IllegalStateException -> 0x0093, RuntimeException -> 0x0091 }
            if (r4 == 0) goto L_0x007a
            goto L_0x0065
        L_0x007a:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ SQLiteException -> 0x0099, StackOverflowError -> 0x0096, IllegalStateException -> 0x0093, RuntimeException -> 0x0091 }
            r4.<init>(r0)     // Catch:{ SQLiteException -> 0x0099, StackOverflowError -> 0x0096, IllegalStateException -> 0x0093, RuntimeException -> 0x0091 }
            java.lang.String r0 = "event_id"
            r4.put(r0, r2)     // Catch:{ SQLiteException -> 0x0099, StackOverflowError -> 0x0096, IllegalStateException -> 0x0093, RuntimeException -> 0x0091 }
            r12.add(r4)     // Catch:{ SQLiteException -> 0x0099, StackOverflowError -> 0x0096, IllegalStateException -> 0x0093, RuntimeException -> 0x0091 }
            goto L_0x0065
        L_0x0088:
            if (r1 == 0) goto L_0x008d
            r1.close()     // Catch:{ all -> 0x00f2 }
        L_0x008d:
            r18.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x00e7
        L_0x0091:
            r0 = move-exception
            goto L_0x00a0
        L_0x0093:
            r0 = move-exception
            r15 = r1
            goto L_0x00a8
        L_0x0096:
            r0 = move-exception
            r15 = r1
            goto L_0x00b2
        L_0x0099:
            r0 = move-exception
            r15 = r1
            goto L_0x00cd
        L_0x009c:
            r0 = move-exception
            goto L_0x00e9
        L_0x009e:
            r0 = move-exception
            r1 = r15
        L_0x00a0:
            m15033a(r0)     // Catch:{ all -> 0x00a4 }
            throw r15
        L_0x00a4:
            r0 = move-exception
            r15 = r1
            goto L_0x00e9
        L_0x00a7:
            r0 = move-exception
        L_0x00a8:
            r11.m15032a(r0)     // Catch:{ all -> 0x009c }
            if (r15 == 0) goto L_0x008d
            r15.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x008d
        L_0x00b1:
            r0 = move-exception
        L_0x00b2:
            g.a.a.f r1 = f10458k     // Catch:{ all -> 0x009c }
            java.lang.String r2 = f10456i     // Catch:{ all -> 0x009c }
            java.lang.String r3 = "getEvents from %s failed"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ all -> 0x009c }
            r4[r13] = r19     // Catch:{ all -> 0x009c }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x009c }
            r1.mo11711a(r2, r3, r0)     // Catch:{ all -> 0x009c }
            r18.m15038g()     // Catch:{ all -> 0x009c }
            if (r15 == 0) goto L_0x008d
            r15.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x008d
        L_0x00cc:
            r0 = move-exception
        L_0x00cd:
            g.a.a.f r1 = f10458k     // Catch:{ all -> 0x009c }
            java.lang.String r2 = f10456i     // Catch:{ all -> 0x009c }
            java.lang.String r3 = "getEvents from %s failed"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ all -> 0x009c }
            r4[r13] = r19     // Catch:{ all -> 0x009c }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x009c }
            r1.mo11711a(r2, r3, r0)     // Catch:{ all -> 0x009c }
            r18.m15038g()     // Catch:{ all -> 0x009c }
            if (r15 == 0) goto L_0x008d
            r15.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x008d
        L_0x00e7:
            monitor-exit(r18)
            return r12
        L_0x00e9:
            if (r15 == 0) goto L_0x00ee
            r15.close()     // Catch:{ all -> 0x00f2 }
        L_0x00ee:
            r18.close()     // Catch:{ all -> 0x00f2 }
            throw r0     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p148a.p149a.C3693i.mo11724a(java.lang.String, long, long):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11725a(C3694j jVar) {
        this.f10461h = jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized long mo11726b(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        return sQLiteDatabase.insertWithOnConflict(str, null, contentValues, 5);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r15v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r15v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r15v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r15v7 */
    /* JADX WARNING: type inference failed for: r15v8 */
    /* JADX WARNING: type inference failed for: r15v9 */
    /* JADX WARNING: type inference failed for: r15v10, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r14v13 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r14v14, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r14v15, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r15v11 */
    /* JADX WARNING: type inference failed for: r15v12 */
    /* JADX WARNING: type inference failed for: r15v13 */
    /* JADX WARNING: type inference failed for: r15v14 */
    /* JADX WARNING: type inference failed for: r15v15 */
    /* JADX WARNING: type inference failed for: r15v16 */
    /* JADX WARNING: type inference failed for: r15v17 */
    /* JADX WARNING: type inference failed for: r15v18 */
    /* JADX WARNING: type inference failed for: r15v19 */
    /* JADX WARNING: type inference failed for: r15v20 */
    /* JADX WARNING: type inference failed for: r15v21 */
    /* JADX WARNING: type inference failed for: r15v22 */
    /* JADX WARNING: type inference failed for: r14v16 */
    /* JADX WARNING: type inference failed for: r14v17 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r15v8
      assigns: []
      uses: []
      mth insns count: 89
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0059 A[SYNTHETIC, Splitter:B:30:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007a A[SYNTHETIC, Splitter:B:39:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096 A[SYNTHETIC, Splitter:B:46:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a0 A[SYNTHETIC, Splitter:B:53:0x00a0] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x0080=Splitter:B:43:0x0080, B:27:0x0054=Splitter:B:27:0x0054, B:36:0x0064=Splitter:B:36:0x0064, B:22:0x004e=Splitter:B:22:0x004e} */
    /* JADX WARNING: Unknown variable types count: 10 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object mo11727b(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            r0 = 0
            r1 = 0
            r2 = 1
            android.database.sqlite.SQLiteDatabase r4 = r13.getReadableDatabase()     // Catch:{ SQLiteException -> 0x007e, StackOverflowError -> 0x0062, IllegalStateException -> 0x0052, RuntimeException -> 0x004c, all -> 0x004a }
            java.lang.String r3 = "key"
            java.lang.String r5 = "value"
            java.lang.String[] r6 = new java.lang.String[]{r3, r5}     // Catch:{ SQLiteException -> 0x007e, StackOverflowError -> 0x0062, IllegalStateException -> 0x0052, RuntimeException -> 0x004c, all -> 0x004a }
            java.lang.String r7 = "key = ?"
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x007e, StackOverflowError -> 0x0062, IllegalStateException -> 0x0052, RuntimeException -> 0x004c, all -> 0x004a }
            r8[r0] = r15     // Catch:{ SQLiteException -> 0x007e, StackOverflowError -> 0x0062, IllegalStateException -> 0x0052, RuntimeException -> 0x004c, all -> 0x004a }
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = r13
            r5 = r14
            android.database.Cursor r15 = r3.mo11722a(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x007e, StackOverflowError -> 0x0062, IllegalStateException -> 0x0052, RuntimeException -> 0x004c, all -> 0x004a }
            boolean r3 = r15.moveToFirst()     // Catch:{ SQLiteException -> 0x0048, StackOverflowError -> 0x0046, IllegalStateException -> 0x0044, RuntimeException -> 0x0042 }
            if (r3 == 0) goto L_0x003c
            java.lang.String r3 = "store"
            boolean r3 = r14.equals(r3)     // Catch:{ SQLiteException -> 0x0048, StackOverflowError -> 0x0046, IllegalStateException -> 0x0044, RuntimeException -> 0x0042 }
            if (r3 == 0) goto L_0x0033
            java.lang.String r14 = r15.getString(r2)     // Catch:{ SQLiteException -> 0x0048, StackOverflowError -> 0x0046, IllegalStateException -> 0x0044, RuntimeException -> 0x0042 }
            goto L_0x003b
        L_0x0033:
            long r3 = r15.getLong(r2)     // Catch:{ SQLiteException -> 0x0048, StackOverflowError -> 0x0046, IllegalStateException -> 0x0044, RuntimeException -> 0x0042 }
            java.lang.Long r14 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0048, StackOverflowError -> 0x0046, IllegalStateException -> 0x0044, RuntimeException -> 0x0042 }
        L_0x003b:
            r1 = r14
        L_0x003c:
            if (r15 == 0) goto L_0x005c
            r15.close()     // Catch:{ all -> 0x0060 }
            goto L_0x005c
        L_0x0042:
            r14 = move-exception
            goto L_0x004e
        L_0x0044:
            r14 = move-exception
            goto L_0x0054
        L_0x0046:
            r3 = move-exception
            goto L_0x0064
        L_0x0048:
            r3 = move-exception
            goto L_0x0080
        L_0x004a:
            r14 = move-exception
            goto L_0x009e
        L_0x004c:
            r14 = move-exception
            r15 = r1
        L_0x004e:
            m15033a(r14)     // Catch:{ all -> 0x009c }
            throw r1
        L_0x0052:
            r14 = move-exception
            r15 = r1
        L_0x0054:
            r13.m15032a(r14)     // Catch:{ all -> 0x009c }
            if (r15 == 0) goto L_0x005c
            r15.close()     // Catch:{ all -> 0x0060 }
        L_0x005c:
            r13.close()     // Catch:{ all -> 0x0060 }
            goto L_0x009a
        L_0x0060:
            r14 = move-exception
            goto L_0x00a7
        L_0x0062:
            r3 = move-exception
            r15 = r1
        L_0x0064:
            g.a.a.f r4 = f10458k     // Catch:{ all -> 0x009c }
            java.lang.String r5 = f10456i     // Catch:{ all -> 0x009c }
            java.lang.String r6 = "getValue from %s failed"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x009c }
            r2[r0] = r14     // Catch:{ all -> 0x009c }
            java.lang.String r14 = java.lang.String.format(r6, r2)     // Catch:{ all -> 0x009c }
            r4.mo11711a(r5, r14, r3)     // Catch:{ all -> 0x009c }
            r13.m15038g()     // Catch:{ all -> 0x009c }
            if (r15 == 0) goto L_0x005c
            r15.close()     // Catch:{ all -> 0x0060 }
            goto L_0x005c
        L_0x007e:
            r3 = move-exception
            r15 = r1
        L_0x0080:
            g.a.a.f r4 = f10458k     // Catch:{ all -> 0x009c }
            java.lang.String r5 = f10456i     // Catch:{ all -> 0x009c }
            java.lang.String r6 = "getValue from %s failed"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x009c }
            r2[r0] = r14     // Catch:{ all -> 0x009c }
            java.lang.String r14 = java.lang.String.format(r6, r2)     // Catch:{ all -> 0x009c }
            r4.mo11711a(r5, r14, r3)     // Catch:{ all -> 0x009c }
            r13.m15038g()     // Catch:{ all -> 0x009c }
            if (r15 == 0) goto L_0x005c
            r15.close()     // Catch:{ all -> 0x0060 }
            goto L_0x005c
        L_0x009a:
            monitor-exit(r13)
            return r1
        L_0x009c:
            r14 = move-exception
            r1 = r15
        L_0x009e:
            if (r1 == 0) goto L_0x00a3
            r1.close()     // Catch:{ all -> 0x0060 }
        L_0x00a3:
            r13.close()     // Catch:{ all -> 0x0060 }
            throw r14     // Catch:{ all -> 0x0060 }
        L_0x00a7:
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p148a.p149a.C3693i.mo11727b(java.lang.String, java.lang.String):java.lang.Object");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized List<JSONObject> mo11728b(long j, long j2) {
        return mo11724a("identifys", j, j2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized long mo11729c(String str) {
        return m15036d("events", str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized long mo11730c(String str, String str2) {
        return str2 == null ? mo11720a("store", str) : mo11721a("store", str, (Object) str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized long mo11731d() {
        return m15039h("identifys");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized long mo11732d(long j) {
        return m15028a("events", j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized long mo11733d(String str) {
        return m15036d("identifys", str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public synchronized Long mo11734e(String str) {
        return (Long) mo11727b("long_store", str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public synchronized long mo11735f() {
        return mo11716a() + mo11731d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public synchronized String mo11736f(String str) {
        return (String) mo11727b("store", str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public synchronized long mo11737g(long j) {
        return m15028a("identifys", j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public synchronized void mo11738j(long j) {
        m15034b("events", j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public synchronized void mo11739k(long j) {
        m15035c("events", j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public synchronized void mo11740l(long j) {
        m15034b("identifys", j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public synchronized void mo11741m(long j) {
        m15035c("identifys", j);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        C3694j jVar = this.f10461h;
        if (jVar != null && this.f10460g) {
            try {
                this.f10460g = false;
                jVar.mo11709a(sQLiteDatabase);
            } catch (SQLiteException e) {
                f10458k.mo11711a(f10456i, String.format("databaseReset callback failed during onCreate", new Object[0]), e);
            } catch (Throwable th) {
                this.f10460g = true;
                throw th;
            }
            this.f10460g = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r6 <= 2) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
        /*
            r3 = this;
            if (r5 <= r6) goto L_0x000f
            g.a.a.f r5 = f10458k
            java.lang.String r6 = f10456i
            java.lang.String r0 = "onUpgrade() with invalid oldVersion and newVersion"
            r5.mo11713b(r6, r0)
            r3.m15031a(r4)
            return
        L_0x000f:
            r0 = 1
            if (r6 > r0) goto L_0x0013
            return
        L_0x0013:
            r1 = 3
            r2 = 2
            if (r5 == r0) goto L_0x0037
            if (r5 == r2) goto L_0x003f
            if (r5 == r1) goto L_0x0049
            g.a.a.f r6 = f10458k
            java.lang.String r0 = f10456i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onUpgrade() with unknown oldVersion "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r6.mo11713b(r0, r5)
            r3.m15031a(r4)
            goto L_0x0049
        L_0x0037:
            java.lang.String r5 = "CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);"
            r4.execSQL(r5)
            if (r6 > r2) goto L_0x003f
            goto L_0x0049
        L_0x003f:
            java.lang.String r5 = "CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);"
            r4.execSQL(r5)
            java.lang.String r5 = "CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);"
            r4.execSQL(r5)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p148a.p149a.C3693i.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
