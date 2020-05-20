package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.measurement.internal.u3 */
public final class C2472u3 extends C2285e3 {

    /* renamed from: c */
    private final C2505x3 f6981c = new C2505x3(this, mo7096h(), "google_app_measurement_local.db");

    /* renamed from: d */
    private boolean f6982d;

    C2472u3(C2263c5 c5Var) {
        super(c5Var);
    }

    /* renamed from: E */
    private final SQLiteDatabase m9966E() {
        if (this.f6982d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f6981c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f6982d = true;
        return null;
    }

    /* renamed from: F */
    private final boolean m9967F() {
        return mo7096h().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static long m9968a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            Cursor query = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (query.moveToFirst()) {
                long j = query.getLong(0);
                if (query != null) {
                    query.close();
                }
                return j;
            }
            if (query != null) {
                query.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r9v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r12v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v6, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r9v10, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: type inference failed for: r9v21 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v1, types: [int, boolean]
      assigns: []
      uses: [?[int, short, byte, char], int, boolean]
      mth insns count: 158
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
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4 A[SYNTHETIC, Splitter:B:49:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 21 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m9969a(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.mo7273a()
            r16.mo7274c()
            boolean r0 = r1.f6982d
            r2 = 0
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0026:
            if (r5 >= r4) goto L_0x012a
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.m9966E()     // Catch:{ SQLiteFullException -> 0x00fe, SQLiteDatabaseLockedException -> 0x00ec, SQLiteException -> 0x00c0, all -> 0x00bd }
            if (r9 != 0) goto L_0x0038
            r1.f6982d = r8     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00b7 }
            if (r9 == 0) goto L_0x0037
            r9.close()
        L_0x0037:
            return r2
        L_0x0038:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00b7 }
            r10 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00b7 }
            if (r12 == 0) goto L_0x0059
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            if (r0 == 0) goto L_0x0059
            long r10 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            goto L_0x0059
        L_0x0050:
            r0 = move-exception
            goto L_0x00ea
        L_0x0053:
            r0 = move-exception
            goto L_0x00b9
        L_0x0055:
            r0 = move-exception
            r7 = r12
            goto L_0x0100
        L_0x0059:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x00a0
            com.google.android.gms.measurement.internal.y3 r15 = r16.mo7098j()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            com.google.android.gms.measurement.internal.a4 r15 = r15.mo7815t()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r4 = "Data loss, local db full"
            r15.mo7088a(r4)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            long r13 = r13 - r10
            r10 = 1
            long r13 = r13 + r10
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            r10[r2] = r11     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            int r4 = r9.delete(r0, r4, r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            long r10 = (long) r4     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            int r4 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x00a0
            com.google.android.gms.measurement.internal.y3 r4 = r16.mo7098j()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            com.google.android.gms.measurement.internal.a4 r4 = r4.mo7815t()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            long r13 = r13 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            r4.mo7091a(r15, r2, r8, r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
        L_0x00a0:
            r9.insertOrThrow(r0, r7, r3)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            if (r12 == 0) goto L_0x00ae
            r12.close()
        L_0x00ae:
            if (r9 == 0) goto L_0x00b3
            r9.close()
        L_0x00b3:
            r2 = 1
            return r2
        L_0x00b5:
            r7 = r12
            goto L_0x00ed
        L_0x00b7:
            r0 = move-exception
            r12 = r7
        L_0x00b9:
            r7 = r9
            goto L_0x00c2
        L_0x00bb:
            r0 = move-exception
            goto L_0x0100
        L_0x00bd:
            r0 = move-exception
            r9 = r7
            goto L_0x011f
        L_0x00c0:
            r0 = move-exception
            r12 = r7
        L_0x00c2:
            if (r7 == 0) goto L_0x00cd
            boolean r2 = r7.inTransaction()     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x00cd
            r7.endTransaction()     // Catch:{ all -> 0x00e8 }
        L_0x00cd:
            com.google.android.gms.measurement.internal.y3 r2 = r16.mo7098j()     // Catch:{ all -> 0x00e8 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7815t()     // Catch:{ all -> 0x00e8 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.mo7089a(r4, r0)     // Catch:{ all -> 0x00e8 }
            r2 = 1
            r1.f6982d = r2     // Catch:{ all -> 0x00e8 }
            if (r12 == 0) goto L_0x00e2
            r12.close()
        L_0x00e2:
            if (r7 == 0) goto L_0x0118
            r7.close()
            goto L_0x0118
        L_0x00e8:
            r0 = move-exception
            r9 = r7
        L_0x00ea:
            r7 = r12
            goto L_0x011f
        L_0x00ec:
            r9 = r7
        L_0x00ed:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x011e }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00f8
            r7.close()
        L_0x00f8:
            if (r9 == 0) goto L_0x0118
        L_0x00fa:
            r9.close()
            goto L_0x0118
        L_0x00fe:
            r0 = move-exception
            r9 = r7
        L_0x0100:
            com.google.android.gms.measurement.internal.y3 r2 = r16.mo7098j()     // Catch:{ all -> 0x011e }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7815t()     // Catch:{ all -> 0x011e }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.mo7089a(r4, r0)     // Catch:{ all -> 0x011e }
            r2 = 1
            r1.f6982d = r2     // Catch:{ all -> 0x011e }
            if (r7 == 0) goto L_0x0115
            r7.close()
        L_0x0115:
            if (r9 == 0) goto L_0x0118
            goto L_0x00fa
        L_0x0118:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0026
        L_0x011e:
            r0 = move-exception
        L_0x011f:
            if (r7 == 0) goto L_0x0124
            r7.close()
        L_0x0124:
            if (r9 == 0) goto L_0x0129
            r9.close()
        L_0x0129:
            throw r0
        L_0x012a:
            com.google.android.gms.measurement.internal.y3 r0 = r16.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7810B()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.mo7088a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2472u3.m9969a(int, byte[]):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo7242A() {
        return false;
    }

    /* renamed from: B */
    public final void mo7652B() {
        mo7273a();
        mo7274c();
        try {
            int delete = m9966E().delete("messages", null, null) + 0;
            if (delete > 0) {
                mo7098j().mo7810B().mo7089a("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7089a("Error resetting local analytics data. error", e);
        }
    }

    /* renamed from: C */
    public final boolean mo7653C() {
        return m9969a(3, new byte[0]);
    }

    /* renamed from: D */
    public final boolean mo7654D() {
        String str = "Error deleting app launch break from local database";
        mo7274c();
        mo7273a();
        if (this.f6982d || !m9967F()) {
            return false;
        }
        int i = 0;
        int i2 = 5;
        while (i < 5) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = m9966E();
                if (sQLiteDatabase == null) {
                    this.f6982d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return false;
                }
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return true;
            } catch (SQLiteFullException e) {
                mo7098j().mo7815t().mo7089a(str, e);
                this.f6982d = true;
                if (sQLiteDatabase == null) {
                    i++;
                }
                sQLiteDatabase.close();
                i++;
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep((long) i2);
                i2 += 20;
                if (sQLiteDatabase == null) {
                    i++;
                }
                sQLiteDatabase.close();
                i++;
            } catch (SQLiteException e2) {
                if (sQLiteDatabase != null) {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                }
                mo7098j().mo7815t().mo7089a(str, e2);
                this.f6982d = true;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    i++;
                } else {
                    i++;
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        mo7098j().mo7818w().mo7088a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:60|61|62|63) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:75|76|77|78) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:47|48|49|50|172) */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0183, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0186, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0187, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x018a, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x018e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x018f, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x019e, code lost:
        if (r15.inTransaction() != false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01a0, code lost:
        r15.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01b2, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01c2, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01e8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x01e9, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01ea, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x01ed, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x01f2, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        mo7098j().mo7815t().mo7088a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        mo7098j().mo7815t().mo7088a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        mo7098j().mo7815t().mo7088a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00d4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0107 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0183 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x019a A[SYNTHETIC, Splitter:B:126:0x019a] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01e3 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.p048x.C2158a> mo7655a(int r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "Error reading entries from local database"
            r21.mo7274c()
            r21.mo7273a()
            boolean r0 = r1.f6982d
            r3 = 0
            if (r0 == 0) goto L_0x0010
            return r3
        L_0x0010:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r0 = r21.m9967F()
            if (r0 != 0) goto L_0x001c
            return r4
        L_0x001c:
            r5 = 5
            r6 = 0
            r7 = 0
            r8 = 5
        L_0x0020:
            if (r7 >= r5) goto L_0x01f6
            r9 = 1
            android.database.sqlite.SQLiteDatabase r15 = r21.m9966E()     // Catch:{ SQLiteFullException -> 0x01cb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x0195, all -> 0x0192 }
            if (r15 != 0) goto L_0x0037
            r1.f6982d = r9     // Catch:{ SQLiteFullException -> 0x0034, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0031, all -> 0x0183 }
            if (r15 == 0) goto L_0x0030
            r15.close()
        L_0x0030:
            return r3
        L_0x0031:
            r0 = move-exception
            goto L_0x0188
        L_0x0034:
            r0 = move-exception
            goto L_0x0190
        L_0x0037:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x018e, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0186, all -> 0x0183 }
            long r10 = m9968a(r15)     // Catch:{ SQLiteFullException -> 0x018e, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0186, all -> 0x0183 }
            r19 = -1
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x0034, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0031, all -> 0x0183 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x0034, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0031, all -> 0x0183 }
            r12[r6] = r10     // Catch:{ SQLiteFullException -> 0x0034, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0031, all -> 0x0183 }
            r13 = r0
            r14 = r12
            goto L_0x0053
        L_0x0051:
            r13 = r3
            r14 = r13
        L_0x0053:
            java.lang.String r11 = "messages"
            java.lang.String r0 = "rowid"
            java.lang.String r10 = "type"
            java.lang.String r12 = "entry"
            java.lang.String[] r12 = new java.lang.String[]{r0, r10, r12}     // Catch:{ SQLiteFullException -> 0x018e, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0186, all -> 0x0183 }
            r0 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            r10 = 100
            java.lang.String r18 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x018e, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0186, all -> 0x0183 }
            r10 = r15
            r5 = r15
            r15 = r0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x017f, SQLiteDatabaseLockedException -> 0x018b, SQLiteException -> 0x017b, all -> 0x0178 }
        L_0x0071:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            if (r0 == 0) goto L_0x013c
            long r19 = r10.getLong(r6)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            int r0 = r10.getInt(r9)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            r11 = 2
            byte[] r12 = r10.getBlob(r11)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            if (r0 != 0) goto L_0x00b9
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            int r0 = r12.length     // Catch:{ a -> 0x00a4 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x00a4 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x00a4 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.r> r0 = com.google.android.gms.measurement.internal.C2435r.CREATOR     // Catch:{ a -> 0x00a4 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x00a4 }
            com.google.android.gms.measurement.internal.r r0 = (com.google.android.gms.measurement.internal.C2435r) r0     // Catch:{ a -> 0x00a4 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            if (r0 == 0) goto L_0x0071
        L_0x009e:
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            goto L_0x0071
        L_0x00a2:
            r0 = move-exception
            goto L_0x00b5
        L_0x00a4:
            com.google.android.gms.measurement.internal.y3 r0 = r21.mo7098j()     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7815t()     // Catch:{ all -> 0x00a2 }
            java.lang.String r12 = "Failed to load event from local database"
            r0.mo7088a(r12)     // Catch:{ all -> 0x00a2 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            goto L_0x0071
        L_0x00b5:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
        L_0x00b9:
            if (r0 != r9) goto L_0x00ec
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            int r0 = r12.length     // Catch:{ a -> 0x00d4 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x00d4 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x00d4 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.u9> r0 = com.google.android.gms.measurement.internal.C2478u9.CREATOR     // Catch:{ a -> 0x00d4 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x00d4 }
            com.google.android.gms.measurement.internal.u9 r0 = (com.google.android.gms.measurement.internal.C2478u9) r0     // Catch:{ a -> 0x00d4 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            goto L_0x00e5
        L_0x00d2:
            r0 = move-exception
            goto L_0x00e8
        L_0x00d4:
            com.google.android.gms.measurement.internal.y3 r0 = r21.mo7098j()     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7815t()     // Catch:{ all -> 0x00d2 }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.mo7088a(r12)     // Catch:{ all -> 0x00d2 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            r0 = r3
        L_0x00e5:
            if (r0 == 0) goto L_0x0071
            goto L_0x009e
        L_0x00e8:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
        L_0x00ec:
            if (r0 != r11) goto L_0x011f
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            int r0 = r12.length     // Catch:{ a -> 0x0107 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x0107 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x0107 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.ma> r0 = com.google.android.gms.measurement.internal.C2388ma.CREATOR     // Catch:{ a -> 0x0107 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x0107 }
            com.google.android.gms.measurement.internal.ma r0 = (com.google.android.gms.measurement.internal.C2388ma) r0     // Catch:{ a -> 0x0107 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            goto L_0x0118
        L_0x0105:
            r0 = move-exception
            goto L_0x011b
        L_0x0107:
            com.google.android.gms.measurement.internal.y3 r0 = r21.mo7098j()     // Catch:{ all -> 0x0105 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7815t()     // Catch:{ all -> 0x0105 }
            java.lang.String r12 = "Failed to load conditional user property from local database"
            r0.mo7088a(r12)     // Catch:{ all -> 0x0105 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            r0 = r3
        L_0x0118:
            if (r0 == 0) goto L_0x0071
            goto L_0x009e
        L_0x011b:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
        L_0x011f:
            r11 = 3
            if (r0 != r11) goto L_0x0131
            com.google.android.gms.measurement.internal.y3 r0 = r21.mo7098j()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7818w()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            java.lang.String r11 = "Skipping app launch break"
        L_0x012c:
            r0.mo7088a(r11)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            goto L_0x0071
        L_0x0131:
            com.google.android.gms.measurement.internal.y3 r0 = r21.mo7098j()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7815t()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            java.lang.String r11 = "Unknown record type in local database"
            goto L_0x012c
        L_0x013c:
            java.lang.String r0 = "messages"
            java.lang.String r11 = "rowid <= ?"
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            java.lang.String r13 = java.lang.Long.toString(r19)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            r12[r6] = r13     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            int r0 = r5.delete(r0, r11, r12)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            int r11 = r4.size()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            if (r0 >= r11) goto L_0x015f
            com.google.android.gms.measurement.internal.y3 r0 = r21.mo7098j()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7815t()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            java.lang.String r11 = "Fewer entries removed from local database than expected"
            r0.mo7088a(r11)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
        L_0x015f:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            if (r10 == 0) goto L_0x016a
            r10.close()
        L_0x016a:
            if (r5 == 0) goto L_0x016f
            r5.close()
        L_0x016f:
            return r4
        L_0x0170:
            r0 = move-exception
            r3 = r10
            goto L_0x01eb
        L_0x0174:
            r0 = move-exception
            goto L_0x017d
        L_0x0176:
            r0 = move-exception
            goto L_0x0181
        L_0x0178:
            r0 = move-exception
            goto L_0x01eb
        L_0x017b:
            r0 = move-exception
            r10 = r3
        L_0x017d:
            r15 = r5
            goto L_0x0198
        L_0x017f:
            r0 = move-exception
            r10 = r3
        L_0x0181:
            r15 = r5
            goto L_0x01ce
        L_0x0183:
            r0 = move-exception
            goto L_0x01ea
        L_0x0186:
            r0 = move-exception
            r5 = r15
        L_0x0188:
            r10 = r3
            goto L_0x0198
        L_0x018a:
            r5 = r15
        L_0x018b:
            r10 = r3
        L_0x018c:
            r15 = r5
            goto L_0x01ba
        L_0x018e:
            r0 = move-exception
            r5 = r15
        L_0x0190:
            r10 = r3
            goto L_0x01ce
        L_0x0192:
            r0 = move-exception
            r5 = r3
            goto L_0x01eb
        L_0x0195:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x0198:
            if (r15 == 0) goto L_0x01a3
            boolean r5 = r15.inTransaction()     // Catch:{ all -> 0x01e8 }
            if (r5 == 0) goto L_0x01a3
            r15.endTransaction()     // Catch:{ all -> 0x01e8 }
        L_0x01a3:
            com.google.android.gms.measurement.internal.y3 r5 = r21.mo7098j()     // Catch:{ all -> 0x01e8 }
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7815t()     // Catch:{ all -> 0x01e8 }
            r5.mo7089a(r2, r0)     // Catch:{ all -> 0x01e8 }
            r1.f6982d = r9     // Catch:{ all -> 0x01e8 }
            if (r10 == 0) goto L_0x01b5
            r10.close()
        L_0x01b5:
            if (r15 == 0) goto L_0x01e3
            goto L_0x01c7
        L_0x01b8:
            r10 = r3
            r15 = r10
        L_0x01ba:
            long r11 = (long) r8
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x01e8 }
            int r8 = r8 + 20
            if (r10 == 0) goto L_0x01c5
            r10.close()
        L_0x01c5:
            if (r15 == 0) goto L_0x01e3
        L_0x01c7:
            r15.close()
            goto L_0x01e3
        L_0x01cb:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x01ce:
            com.google.android.gms.measurement.internal.y3 r5 = r21.mo7098j()     // Catch:{ all -> 0x01e8 }
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7815t()     // Catch:{ all -> 0x01e8 }
            r5.mo7089a(r2, r0)     // Catch:{ all -> 0x01e8 }
            r1.f6982d = r9     // Catch:{ all -> 0x01e8 }
            if (r10 == 0) goto L_0x01e0
            r10.close()
        L_0x01e0:
            if (r15 == 0) goto L_0x01e3
            goto L_0x01c7
        L_0x01e3:
            int r7 = r7 + 1
            r5 = 5
            goto L_0x0020
        L_0x01e8:
            r0 = move-exception
            r3 = r10
        L_0x01ea:
            r5 = r15
        L_0x01eb:
            if (r3 == 0) goto L_0x01f0
            r3.close()
        L_0x01f0:
            if (r5 == 0) goto L_0x01f5
            r5.close()
        L_0x01f5:
            throw r0
        L_0x01f6:
            com.google.android.gms.measurement.internal.y3 r0 = r21.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7818w()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.mo7088a(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2472u3.mo7655a(int):java.util.List");
    }

    /* renamed from: a */
    public final boolean mo7656a(C2388ma maVar) {
        mo7825k();
        byte[] a = C2489v9.m10019a((Parcelable) maVar);
        if (a.length <= 131072) {
            return m9969a(2, a);
        }
        mo7098j().mo7816u().mo7088a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean mo7657a(C2435r rVar) {
        Parcel obtain = Parcel.obtain();
        rVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m9969a(0, marshall);
        }
        mo7098j().mo7816u().mo7088a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean mo7658a(C2478u9 u9Var) {
        Parcel obtain = Parcel.obtain();
        u9Var.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m9969a(1, marshall);
        }
        mo7098j().mo7816u().mo7088a("User property too long for local database. Sending directly to service");
        return false;
    }
}
