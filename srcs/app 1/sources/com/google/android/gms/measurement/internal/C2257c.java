package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2148s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p071f.p088e.C3162a;
import p147g.p156d.p157a.p167b.p173d.p180g.C3909a1;
import p147g.p156d.p157a.p167b.p173d.p180g.C3909a1.C3910a;
import p147g.p156d.p157a.p167b.p173d.p180g.C3941c1;
import p147g.p156d.p157a.p167b.p173d.p180g.C4027h0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4027h0.C4028a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4042i0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4042i0.C4043a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4057j0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4057j0.C4058a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4088l0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4088l0.C4089a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4157pa;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4216b;
import p147g.p156d.p157a.p167b.p173d.p180g.C4289y0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4289y0.C4290a;

/* renamed from: com.google.android.gms.measurement.internal.c */
final class C2257c extends C2363k9 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f6291f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f6292g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String[] f6293h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f6294i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String[] f6295j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String[] f6296k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String[] f6297l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String[] f6298m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C2317h f6299d = new C2317h(this, mo7096h(), "google_app_measurement.db");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2303f9 f6300e = new C2303f9(mo7095g());

    static {
        String str = "session_scoped";
        f6296k = new String[]{str, "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
        f6297l = new String[]{str, "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    }

    C2257c(C2399n9 n9Var) {
        super(n9Var);
    }

    /* renamed from: O */
    private final boolean m9168O() {
        return mo7096h().getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: a */
    private final long m9169a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo7183v().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j;
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private final Object m9171a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            mo7098j().mo7815t().mo7088a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                mo7098j().mo7815t().mo7089a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            mo7098j().mo7815t().mo7088a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* renamed from: a */
    private static void m9172a(ContentValues contentValues, String str, Object obj) {
        C2148s.m8844b(str);
        C2148s.m8834a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: a */
    private final boolean m9173a(String str, int i, C4042i0 i0Var) {
        mo7459r();
        mo7274c();
        C2148s.m8844b(str);
        C2148s.m8834a(i0Var);
        Integer num = null;
        if (TextUtils.isEmpty(i0Var.mo12523r())) {
            C2238a4 w = mo7098j().mo7818w();
            Object a = C2516y3.m10125a(str);
            Integer valueOf = Integer.valueOf(i);
            if (i0Var.mo12520a()) {
                num = Integer.valueOf(i0Var.mo12522q());
            }
            w.mo7091a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", a, valueOf, String.valueOf(num));
            return false;
        }
        byte[] g = i0Var.mo12245g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", i0Var.mo12520a() ? Integer.valueOf(i0Var.mo12522q()) : null);
        contentValues.put("event_name", i0Var.mo12523r());
        contentValues.put("session_scoped", i0Var.mo12530y() ? Boolean.valueOf(i0Var.mo12531z()) : null);
        contentValues.put("data", g);
        try {
            if (mo7183v().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                mo7098j().mo7815t().mo7089a("Failed to insert event filter (got -1). appId", C2516y3.m10125a(str));
            }
            return true;
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Error storing event filter. appId", C2516y3.m10125a(str), e);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m9174a(String str, int i, C4088l0 l0Var) {
        mo7459r();
        mo7274c();
        C2148s.m8844b(str);
        C2148s.m8834a(l0Var);
        Integer num = null;
        if (TextUtils.isEmpty(l0Var.mo12599r())) {
            C2238a4 w = mo7098j().mo7818w();
            Object a = C2516y3.m10125a(str);
            Integer valueOf = Integer.valueOf(i);
            if (l0Var.mo12597a()) {
                num = Integer.valueOf(l0Var.mo12598q());
            }
            w.mo7091a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", a, valueOf, String.valueOf(num));
            return false;
        }
        byte[] g = l0Var.mo12245g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", l0Var.mo12597a() ? Integer.valueOf(l0Var.mo12598q()) : null);
        contentValues.put("property_name", l0Var.mo12599r());
        contentValues.put("session_scoped", l0Var.mo12603v() ? Boolean.valueOf(l0Var.mo12604w()) : null);
        contentValues.put("data", g);
        try {
            if (mo7183v().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            mo7098j().mo7815t().mo7089a("Failed to insert property filter (got -1). appId", C2516y3.m10125a(str));
            return false;
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Error storing property filter. appId", C2516y3.m10125a(str), e);
            return false;
        }
    }

    /* renamed from: b */
    private final long m9175b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo7183v().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    private final boolean m9176b(String str, List<Integer> list) {
        C2148s.m8844b(str);
        mo7459r();
        mo7274c();
        SQLiteDatabase v = mo7183v();
        try {
            long b = m9175b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, mo7827m().mo7110b(str, C2457t.f6872F)));
            if (b <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = (Integer) list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return v.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Database error querying filters. appId", C2516y3.m10125a(str), e);
            return false;
        }
    }

    /* renamed from: A */
    public final boolean mo7141A() {
        return m9175b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final void mo7142B() {
        mo7274c();
        mo7459r();
        if (m9168O()) {
            long a = mo7826l().f6625h.mo7570a();
            long c = mo7095g().mo6989c();
            if (Math.abs(c - a) > ((Long) C2457t.f6954y.mo7587a(null)).longValue()) {
                mo7826l().f6625h.mo7571a(c);
                mo7274c();
                mo7459r();
                if (m9168O()) {
                    int delete = mo7183v().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo7095g().mo6988b()), String.valueOf(C2245b.m9110w())});
                    if (delete > 0) {
                        mo7098j().mo7810B().mo7089a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* renamed from: C */
    public final long mo7143C() {
        return m9169a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* renamed from: D */
    public final long mo7144D() {
        return m9169a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: E */
    public final boolean mo7145E() {
        return m9175b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: F */
    public final boolean mo7146F() {
        return m9175b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: a */
    public final long mo7147a(C3941c1 c1Var) {
        mo7274c();
        mo7459r();
        C2148s.m8834a(c1Var);
        C2148s.m8844b(c1Var.mo12168p0());
        byte[] g = c1Var.mo12245g();
        long a = mo7492n().mo7603a(g);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c1Var.mo12168p0());
        contentValues.put("metadata_fingerprint", Long.valueOf(a));
        contentValues.put("metadata", g);
        try {
            mo7183v().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return a;
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Error storing raw event metadata. appId", C2516y3.m10125a(c1Var.mo12168p0()), e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<p147g.p156d.p157a.p167b.p173d.p180g.C4289y0, java.lang.Long> mo7148a(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.mo7274c()
            r7.mo7459r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo7183v()     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0076 }
            if (r2 != 0) goto L_0x0037
            com.google.android.gms.measurement.internal.y3 r8 = r7.mo7098j()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo7810B()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r9 = "Main event not found"
            r8.mo7088a(r9)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0076 }
            long r3 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0076 }
            g.d.a.b.d.g.y0$a r4 = p147g.p156d.p157a.p167b.p173d.p180g.C4289y0.m17570y()     // Catch:{ IOException -> 0x005e }
            com.google.android.gms.measurement.internal.C2445r9.m9770a(r4, r2)     // Catch:{ IOException -> 0x005e }
            g.d.a.b.d.g.y0$a r4 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0.C4290a) r4     // Catch:{ IOException -> 0x005e }
            g.d.a.b.d.g.e6 r2 = r4.mo12346f()     // Catch:{ IOException -> 0x005e }
            g.d.a.b.d.g.t4 r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r2     // Catch:{ IOException -> 0x005e }
            g.d.a.b.d.g.y0 r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r2     // Catch:{ IOException -> 0x005e }
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x005d
            r1.close()
        L_0x005d:
            return r8
        L_0x005e:
            r2 = move-exception
            com.google.android.gms.measurement.internal.y3 r3 = r7.mo7098j()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7815t()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r8)     // Catch:{ SQLiteException -> 0x0076 }
            r3.mo7091a(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x0075
            r1.close()
        L_0x0075:
            return r0
        L_0x0076:
            r8 = move-exception
            goto L_0x007c
        L_0x0078:
            r8 = move-exception
            goto L_0x0091
        L_0x007a:
            r8 = move-exception
            r1 = r0
        L_0x007c:
            com.google.android.gms.measurement.internal.y3 r9 = r7.mo7098j()     // Catch:{ all -> 0x008f }
            com.google.android.gms.measurement.internal.a4 r9 = r9.mo7815t()     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "Error selecting main event"
            r9.mo7089a(r2, r8)     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x008e
            r1.close()
        L_0x008e:
            return r0
        L_0x008f:
            r8 = move-exception
            r0 = r1
        L_0x0091:
            if (r0 == 0) goto L_0x0096
            r0.close()
        L_0x0096:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7148a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* renamed from: a */
    public final C2293f mo7149a(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C2148s.m8844b(str);
        mo7274c();
        mo7459r();
        String[] strArr = {str};
        C2293f fVar = new C2293f();
        Cursor cursor = null;
        try {
            SQLiteDatabase v = mo7183v();
            SQLiteDatabase sQLiteDatabase = v;
            cursor = sQLiteDatabase.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            if (!cursor.moveToFirst()) {
                mo7098j().mo7818w().mo7089a("Not updating daily counts, app is not known. appId", C2516y3.m10125a(str));
                if (cursor != null) {
                    cursor.close();
                }
                return fVar;
            }
            if (cursor.getLong(0) == j) {
                fVar.f6395b = cursor.getLong(1);
                fVar.f6394a = cursor.getLong(2);
                fVar.f6396c = cursor.getLong(3);
                fVar.f6397d = cursor.getLong(4);
                fVar.f6398e = cursor.getLong(5);
            }
            if (z) {
                fVar.f6395b += j2;
            }
            if (z2) {
                fVar.f6394a += j2;
            }
            if (z3) {
                fVar.f6396c += j2;
            }
            if (z4) {
                fVar.f6397d += j2;
            }
            if (z5) {
                fVar.f6398e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(fVar.f6394a));
            contentValues.put("daily_events_count", Long.valueOf(fVar.f6395b));
            contentValues.put("daily_conversions_count", Long.valueOf(fVar.f6396c));
            contentValues.put("daily_error_events_count", Long.valueOf(fVar.f6397d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(fVar.f6398e));
            v.update("apps", contentValues, "app_id=?", strArr);
            if (cursor != null) {
                cursor.close();
            }
            return fVar;
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Error updating daily counts. appId", C2516y3.m10125a(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return fVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final C2293f mo7150a(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return mo7149a(j, str, 1, false, false, z3, false, z5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0150  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C2389n mo7151a(java.lang.String r26, java.lang.String r27) {
        /*
            r25 = this;
            r15 = r27
            com.google.android.gms.common.internal.C2148s.m8844b(r26)
            com.google.android.gms.common.internal.C2148s.m8844b(r27)
            r25.mo7274c()
            r25.mo7459r()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "lifetime_count"
            java.lang.String r2 = "current_bundle_count"
            java.lang.String r3 = "last_fire_timestamp"
            java.lang.String r4 = "last_bundled_timestamp"
            java.lang.String r5 = "last_bundled_day"
            java.lang.String r6 = "last_sampled_complex_event_id"
            java.lang.String r7 = "last_sampling_rate"
            java.lang.String r8 = "last_exempt_from_sampling"
            java.lang.String r9 = "current_session_count"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            r18 = 0
            android.database.sqlite.SQLiteDatabase r1 = r25.mo7183v()     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r2 = "events"
            r9 = 0
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r3 = r0
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r4 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r5[r9] = r26     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r10 = 1
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r1 != 0) goto L_0x005c
            if (r14 == 0) goto L_0x005b
            r14.close()
        L_0x005b:
            return r18
        L_0x005c:
            long r4 = r14.getLong(r9)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            long r6 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            long r11 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r0 = 3
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r2 = 0
            if (r1 == 0) goto L_0x0074
            r16 = r2
            goto L_0x007a
        L_0x0074:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r16 = r0
        L_0x007a:
            r0 = 4
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r1 == 0) goto L_0x0084
            r0 = r18
            goto L_0x008c
        L_0x0084:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
        L_0x008c:
            r1 = 5
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x0096
            r19 = r18
            goto L_0x00a0
        L_0x0096:
            long r19 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r1 = java.lang.Long.valueOf(r19)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r19 = r1
        L_0x00a0:
            r1 = 6
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x00aa
            r20 = r18
            goto L_0x00b4
        L_0x00aa:
            long r20 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r1 = java.lang.Long.valueOf(r20)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r20 = r1
        L_0x00b4:
            r1 = 7
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 != 0) goto L_0x00d0
            long r21 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x00cd }
            r23 = 1
            int r1 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r1 != 0) goto L_0x00c6
            r9 = 1
        L_0x00c6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x00cd }
            r21 = r1
            goto L_0x00d2
        L_0x00cd:
            r0 = move-exception
            goto L_0x012a
        L_0x00d0:
            r21 = r18
        L_0x00d2:
            r1 = 8
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x00dc
            r8 = r2
            goto L_0x00e1
        L_0x00dc:
            long r1 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r8 = r1
        L_0x00e1:
            com.google.android.gms.measurement.internal.n r22 = new com.google.android.gms.measurement.internal.n     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r1 = r22
            r2 = r26
            r3 = r27
            r10 = r11
            r12 = r16
            r23 = r14
            r14 = r0
            r15 = r19
            r16 = r20
            r17 = r21
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            boolean r0 = r23.moveToNext()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            if (r0 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.y3 r0 = r25.mo7098j()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7815t()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r26)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            r0.mo7089a(r1, r2)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
        L_0x010f:
            if (r23 == 0) goto L_0x0114
            r23.close()
        L_0x0114:
            return r22
        L_0x0115:
            r0 = move-exception
            goto L_0x011e
        L_0x0117:
            r0 = move-exception
            r14 = r23
            goto L_0x012a
        L_0x011b:
            r0 = move-exception
            r23 = r14
        L_0x011e:
            r18 = r23
            goto L_0x014e
        L_0x0121:
            r0 = move-exception
            r23 = r14
            goto L_0x012a
        L_0x0125:
            r0 = move-exception
            goto L_0x014e
        L_0x0127:
            r0 = move-exception
            r14 = r18
        L_0x012a:
            com.google.android.gms.measurement.internal.y3 r1 = r25.mo7098j()     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7815t()     // Catch:{ all -> 0x014b }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r26)     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.w3 r4 = r25.mo7824e()     // Catch:{ all -> 0x014b }
            r5 = r27
            java.lang.String r4 = r4.mo7718a(r5)     // Catch:{ all -> 0x014b }
            r1.mo7091a(r2, r3, r4, r0)     // Catch:{ all -> 0x014b }
            if (r14 == 0) goto L_0x014a
            r14.close()
        L_0x014a:
            return r18
        L_0x014b:
            r0 = move-exception
            r18 = r14
        L_0x014e:
            if (r18 == 0) goto L_0x0153
            r18.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7151a(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.n");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo7152a(long r5) {
        /*
            r4 = this;
            r4.mo7274c()
            r4.mo7459r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.mo7183v()     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003e }
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.y3 r6 = r4.mo7098j()     // Catch:{ SQLiteException -> 0x003e }
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7810B()     // Catch:{ SQLiteException -> 0x003e }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.mo7088a(r1)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r6
        L_0x003e:
            r6 = move-exception
            goto L_0x0044
        L_0x0040:
            r6 = move-exception
            goto L_0x0059
        L_0x0042:
            r6 = move-exception
            r5 = r0
        L_0x0044:
            com.google.android.gms.measurement.internal.y3 r1 = r4.mo7098j()     // Catch:{ all -> 0x0057 }
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7815t()     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.mo7089a(r2, r6)     // Catch:{ all -> 0x0057 }
            if (r5 == 0) goto L_0x0056
            r5.close()
        L_0x0056:
            return r0
        L_0x0057:
            r6 = move-exception
            r0 = r5
        L_0x0059:
            if (r0 == 0) goto L_0x005e
            r0.close()
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7152a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C2500w9> mo7153a(java.lang.String r14) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.C2148s.m8844b(r14)
            r13.mo7274c()
            r13.mo7459r()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.mo7183v()     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            r12 = 0
            r6[r12] = r14     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x003e
            r2.close()
        L_0x003e:
            return r0
        L_0x003f:
            java.lang.String r7 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x004b
            java.lang.String r3 = ""
        L_0x004b:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x0080 }
            r3 = 3
            java.lang.Object r10 = r13.m9171a(r2, r3)     // Catch:{ SQLiteException -> 0x0080 }
            if (r10 != 0) goto L_0x006a
            com.google.android.gms.measurement.internal.y3 r3 = r13.mo7098j()     // Catch:{ SQLiteException -> 0x0080 }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7815t()     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r14)     // Catch:{ SQLiteException -> 0x0080 }
            r3.mo7089a(r4, r5)     // Catch:{ SQLiteException -> 0x0080 }
            goto L_0x0074
        L_0x006a:
            com.google.android.gms.measurement.internal.w9 r3 = new com.google.android.gms.measurement.internal.w9     // Catch:{ SQLiteException -> 0x0080 }
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0080 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x0080 }
        L_0x0074:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x007f
            r2.close()
        L_0x007f:
            return r0
        L_0x0080:
            r0 = move-exception
            goto L_0x0086
        L_0x0082:
            r14 = move-exception
            goto L_0x009f
        L_0x0084:
            r0 = move-exception
            r2 = r1
        L_0x0086:
            com.google.android.gms.measurement.internal.y3 r3 = r13.mo7098j()     // Catch:{ all -> 0x009d }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7815t()     // Catch:{ all -> 0x009d }
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r14)     // Catch:{ all -> 0x009d }
            r3.mo7090a(r4, r14, r0)     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x009c
            r2.close()
        L_0x009c:
            return r1
        L_0x009d:
            r14 = move-exception
            r1 = r2
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()
        L_0x00a4:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7153a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4 A[LOOP:0: B:18:0x0054->B:42:0x00c4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c6 A[EDGE_INSN: B:56:0x00c6->B:43:0x00c6 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<p147g.p156d.p157a.p167b.p173d.p180g.C3941c1, java.lang.Long>> mo7154a(java.lang.String r13, int r14, int r15) {
        /*
            r12 = this;
            r12.mo7274c()
            r12.mo7459r()
            r0 = 1
            r1 = 0
            if (r14 <= 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            com.google.android.gms.common.internal.C2148s.m8841a(r2)
            if (r15 <= 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            com.google.android.gms.common.internal.C2148s.m8841a(r2)
            com.google.android.gms.common.internal.C2148s.m8844b(r13)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.mo7183v()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r4 = "queue"
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "data"
            java.lang.String r7 = "retry_count"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00ce }
            r7[r1] = r13     // Catch:{ SQLiteException -> 0x00ce }
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rowid"
            java.lang.String r11 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x00ce }
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00ce }
            boolean r14 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00ce }
            if (r14 != 0) goto L_0x004e
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x00ce }
            if (r2 == 0) goto L_0x004d
            r2.close()
        L_0x004d:
            return r13
        L_0x004e:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ce }
            r14.<init>()     // Catch:{ SQLiteException -> 0x00ce }
            r3 = 0
        L_0x0054:
            long r4 = r2.getLong(r1)     // Catch:{ SQLiteException -> 0x00ce }
            byte[] r6 = r2.getBlob(r0)     // Catch:{ IOException -> 0x00ae }
            com.google.android.gms.measurement.internal.r9 r7 = r12.mo7492n()     // Catch:{ IOException -> 0x00ae }
            byte[] r6 = r7.mo7614b(r6)     // Catch:{ IOException -> 0x00ae }
            boolean r7 = r14.isEmpty()     // Catch:{ SQLiteException -> 0x00ce }
            if (r7 != 0) goto L_0x006e
            int r7 = r6.length     // Catch:{ SQLiteException -> 0x00ce }
            int r7 = r7 + r3
            if (r7 > r15) goto L_0x00c6
        L_0x006e:
            g.d.a.b.d.g.c1$a r7 = p147g.p156d.p157a.p167b.p173d.p180g.C3941c1.m15877s0()     // Catch:{ IOException -> 0x009b }
            com.google.android.gms.measurement.internal.C2445r9.m9770a(r7, r6)     // Catch:{ IOException -> 0x009b }
            g.d.a.b.d.g.c1$a r7 = (p147g.p156d.p157a.p167b.p173d.p180g.C3941c1.C3942a) r7     // Catch:{ IOException -> 0x009b }
            r8 = 2
            boolean r9 = r2.isNull(r8)     // Catch:{ SQLiteException -> 0x00ce }
            if (r9 != 0) goto L_0x0085
            int r8 = r2.getInt(r8)     // Catch:{ SQLiteException -> 0x00ce }
            r7.mo12219i(r8)     // Catch:{ SQLiteException -> 0x00ce }
        L_0x0085:
            int r6 = r6.length     // Catch:{ SQLiteException -> 0x00ce }
            int r3 = r3 + r6
            g.d.a.b.d.g.e6 r6 = r7.mo12346f()     // Catch:{ SQLiteException -> 0x00ce }
            g.d.a.b.d.g.t4 r6 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r6     // Catch:{ SQLiteException -> 0x00ce }
            g.d.a.b.d.g.c1 r6 = (p147g.p156d.p157a.p167b.p173d.p180g.C3941c1) r6     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x00ce }
            android.util.Pair r4 = android.util.Pair.create(r6, r4)     // Catch:{ SQLiteException -> 0x00ce }
            r14.add(r4)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00be
        L_0x009b:
            r4 = move-exception
            com.google.android.gms.measurement.internal.y3 r5 = r12.mo7098j()     // Catch:{ SQLiteException -> 0x00ce }
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7815t()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "Failed to merge queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r13)     // Catch:{ SQLiteException -> 0x00ce }
        L_0x00aa:
            r5.mo7090a(r6, r7, r4)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00be
        L_0x00ae:
            r4 = move-exception
            com.google.android.gms.measurement.internal.y3 r5 = r12.mo7098j()     // Catch:{ SQLiteException -> 0x00ce }
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7815t()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "Failed to unzip queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r13)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00aa
        L_0x00be:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00ce }
            if (r4 == 0) goto L_0x00c6
            if (r3 <= r15) goto L_0x0054
        L_0x00c6:
            if (r2 == 0) goto L_0x00cb
            r2.close()
        L_0x00cb:
            return r14
        L_0x00cc:
            r13 = move-exception
            goto L_0x00ea
        L_0x00ce:
            r14 = move-exception
            com.google.android.gms.measurement.internal.y3 r15 = r12.mo7098j()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.a4 r15 = r15.mo7815t()     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "Error querying bundles. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r13)     // Catch:{ all -> 0x00cc }
            r15.mo7090a(r0, r13, r14)     // Catch:{ all -> 0x00cc }
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00e9
            r2.close()
        L_0x00e9:
            return r13
        L_0x00ea:
            if (r2 == 0) goto L_0x00ef
            r2.close()
        L_0x00ef:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7154a(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f9, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0100, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0104, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0105, code lost:
        r12 = r21;
        r11 = r22;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0100 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C2500w9> mo7155a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            com.google.android.gms.common.internal.C2148s.m8844b(r22)
            r21.mo7274c()
            r21.mo7459r()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r3 = 3
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r11 = r22
            r2.add(r11)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            boolean r5 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            if (r5 != 0) goto L_0x0032
            r5 = r23
            r2.add(r5)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r6 = " and origin=?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            goto L_0x0034
        L_0x0032:
            r5 = r23
        L_0x0034:
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            if (r6 != 0) goto L_0x004c
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r7 = "*"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r2.add(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r6 = " and name glob ?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
        L_0x004c:
            int r6 = r2.size()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.Object[] r2 = r2.toArray(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r16 = r2
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            android.database.sqlite.SQLiteDatabase r12 = r21.mo7183v()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r13 = "user_attributes"
            java.lang.String r2 = "name"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String r8 = "origin"
            java.lang.String[] r14 = new java.lang.String[]{r2, r6, r7, r8}     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "1001"
            android.database.Cursor r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            if (r4 != 0) goto L_0x0088
            if (r2 == 0) goto L_0x0087
            r2.close()
        L_0x0087:
            return r0
        L_0x0088:
            int r4 = r0.size()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r6) goto L_0x00a4
            com.google.android.gms.measurement.internal.y3 r3 = r21.mo7098j()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7815t()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r3.mo7089a(r4, r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r12 = r21
            goto L_0x00e3
        L_0x00a4:
            r4 = 0
            java.lang.String r7 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r4 = 1
            long r8 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r4 = 2
            r12 = r21
            java.lang.Object r10 = r12.m9171a(r2, r4)     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r13 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x00ee }
            if (r10 != 0) goto L_0x00cf
            com.google.android.gms.measurement.internal.y3 r4 = r21.mo7098j()     // Catch:{ SQLiteException -> 0x00eb }
            com.google.android.gms.measurement.internal.a4 r4 = r4.mo7815t()     // Catch:{ SQLiteException -> 0x00eb }
            java.lang.String r5 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r22)     // Catch:{ SQLiteException -> 0x00eb }
            r14 = r24
            r4.mo7091a(r5, r6, r13, r14)     // Catch:{ SQLiteException -> 0x00eb }
            goto L_0x00dd
        L_0x00cf:
            r14 = r24
            com.google.android.gms.measurement.internal.w9 r15 = new com.google.android.gms.measurement.internal.w9     // Catch:{ SQLiteException -> 0x00eb }
            r4 = r15
            r5 = r22
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x00eb }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x00eb }
        L_0x00dd:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00eb }
            if (r4 != 0) goto L_0x00e9
        L_0x00e3:
            if (r2 == 0) goto L_0x00e8
            r2.close()
        L_0x00e8:
            return r0
        L_0x00e9:
            r5 = r13
            goto L_0x0088
        L_0x00eb:
            r0 = move-exception
            r5 = r13
            goto L_0x010c
        L_0x00ee:
            r0 = move-exception
            goto L_0x010c
        L_0x00f0:
            r0 = move-exception
            r12 = r21
            goto L_0x0124
        L_0x00f4:
            r0 = move-exception
            r12 = r21
            goto L_0x010c
        L_0x00f8:
            r0 = move-exception
            r12 = r21
            goto L_0x010b
        L_0x00fc:
            r0 = move-exception
            r12 = r21
            goto L_0x0109
        L_0x0100:
            r0 = move-exception
            r12 = r21
            goto L_0x0125
        L_0x0104:
            r0 = move-exception
            r12 = r21
            r11 = r22
        L_0x0109:
            r5 = r23
        L_0x010b:
            r2 = r1
        L_0x010c:
            com.google.android.gms.measurement.internal.y3 r3 = r21.mo7098j()     // Catch:{ all -> 0x0123 }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7815t()     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "(2)Error querying user properties"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r22)     // Catch:{ all -> 0x0123 }
            r3.mo7091a(r4, r6, r5, r0)     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x0122
            r2.close()
        L_0x0122:
            return r1
        L_0x0123:
            r0 = move-exception
        L_0x0124:
            r1 = r2
        L_0x0125:
            if (r1 == 0) goto L_0x012a
            r1.close()
        L_0x012a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7155a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final List<C2388ma> mo7156a(String str, String[] strArr) {
        mo7274c();
        mo7459r();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = mo7183v().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object a = m9171a(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j = cursor.getLong(6);
                    C2435r rVar = (C2435r) mo7492n().mo7604a(cursor.getBlob(7), C2435r.CREATOR);
                    long j2 = cursor.getLong(8);
                    C2435r rVar2 = (C2435r) mo7492n().mo7604a(cursor.getBlob(9), C2435r.CREATOR);
                    long j3 = cursor.getLong(10);
                    long j4 = cursor.getLong(11);
                    C2435r rVar3 = (C2435r) mo7492n().mo7604a(cursor.getBlob(12), C2435r.CREATOR);
                    C2478u9 u9Var = new C2478u9(string3, j3, a, string2);
                    boolean z2 = z;
                    C2388ma maVar = r3;
                    C2388ma maVar2 = new C2388ma(string, string2, u9Var, j2, z2, string4, rVar, j, rVar2, j4, rVar3);
                    arrayList.add(maVar);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    mo7098j().mo7815t().mo7089a("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(1000));
                    break;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7089a("Error querying conditional user property value", e);
            List<C2388ma> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo7157a(C2299f5 f5Var) {
        String str = "apps";
        C2148s.m8834a(f5Var);
        mo7274c();
        mo7459r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f5Var.mo7328l());
        contentValues.put("app_instance_id", f5Var.mo7330m());
        contentValues.put("gmp_app_id", f5Var.mo7332n());
        contentValues.put("resettable_device_id_hash", f5Var.mo7338q());
        contentValues.put("last_bundle_index", Long.valueOf(f5Var.mo7284B()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(f5Var.mo7340s()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(f5Var.mo7341t()));
        contentValues.put("app_version", f5Var.mo7342u());
        contentValues.put("app_store", f5Var.mo7344w());
        contentValues.put("gmp_version", Long.valueOf(f5Var.mo7345x()));
        contentValues.put("dev_cert_hash", Long.valueOf(f5Var.mo7346y()));
        contentValues.put("measurement_enabled", Boolean.valueOf(f5Var.mo7283A()));
        contentValues.put("day", Long.valueOf(f5Var.mo7288F()));
        contentValues.put("daily_public_events_count", Long.valueOf(f5Var.mo7289G()));
        contentValues.put("daily_events_count", Long.valueOf(f5Var.mo7290H()));
        contentValues.put("daily_conversions_count", Long.valueOf(f5Var.mo7291I()));
        contentValues.put("config_fetched_time", Long.valueOf(f5Var.mo7285C()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(f5Var.mo7286D()));
        contentValues.put("app_version_int", Long.valueOf(f5Var.mo7343v()));
        contentValues.put("firebase_instance_id", f5Var.mo7339r());
        contentValues.put("daily_error_events_count", Long.valueOf(f5Var.mo7302c()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(f5Var.mo7298b()));
        contentValues.put("health_monitor_sample", f5Var.mo7306d());
        contentValues.put("android_id", Long.valueOf(f5Var.mo7312f()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(f5Var.mo7317g()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(f5Var.mo7320h()));
        contentValues.put("admob_app_id", f5Var.mo7334o());
        contentValues.put("dynamite_version", Long.valueOf(f5Var.mo7347z()));
        if (f5Var.mo7324j() != null) {
            if (f5Var.mo7324j().size() == 0) {
                mo7098j().mo7818w().mo7089a("Safelisted events should not be an empty list. appId", f5Var.mo7328l());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", f5Var.mo7324j()));
            }
        }
        if (C4157pa.m16931b() && mo7827m().mo7116e(f5Var.mo7328l(), C2457t.f6937p0)) {
            contentValues.put("ga_app_id", f5Var.mo7336p());
        }
        try {
            SQLiteDatabase v = mo7183v();
            if (((long) v.update(str, contentValues, "app_id = ?", new String[]{f5Var.mo7328l()})) == 0 && v.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                mo7098j().mo7815t().mo7089a("Failed to insert/update app (got -1). appId", C2516y3.m10125a(f5Var.mo7328l()));
            }
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Error storing app. appId", C2516y3.m10125a(f5Var.mo7328l()), e);
        }
    }

    /* renamed from: a */
    public final void mo7158a(C2389n nVar) {
        C2148s.m8834a(nVar);
        mo7274c();
        mo7459r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", nVar.f6691a);
        contentValues.put("name", nVar.f6692b);
        contentValues.put("lifetime_count", Long.valueOf(nVar.f6693c));
        contentValues.put("current_bundle_count", Long.valueOf(nVar.f6694d));
        contentValues.put("last_fire_timestamp", Long.valueOf(nVar.f6696f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(nVar.f6697g));
        contentValues.put("last_bundled_day", nVar.f6698h);
        contentValues.put("last_sampled_complex_event_id", nVar.f6699i);
        contentValues.put("last_sampling_rate", nVar.f6700j);
        contentValues.put("current_session_count", Long.valueOf(nVar.f6695e));
        Boolean bool = nVar.f6701k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : Long.valueOf(1));
        try {
            if (mo7183v().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo7098j().mo7815t().mo7089a("Failed to insert/update event aggregates (got -1). appId", C2516y3.m10125a(nVar.f6691a));
            }
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Error storing event aggregates. appId", C2516y3.m10125a(nVar.f6691a), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7159a(String str, List<C4027h0> list) {
        boolean z;
        C2238a4 w;
        String str2;
        Object a;
        Integer valueOf;
        boolean z2;
        String str3 = str;
        List<C4027h0> list2 = list;
        String str4 = "app_id=? and audience_id=?";
        String str5 = "event_filters";
        String str6 = "app_id=?";
        String str7 = "property_filters";
        C2148s.m8834a(list);
        for (int i = 0; i < list.size(); i++) {
            C4028a aVar = (C4028a) ((C4027h0) list2.get(i)).mo12813l();
            if (aVar.mo12505p() != 0) {
                for (int i2 = 0; i2 < aVar.mo12505p(); i2++) {
                    C4043a aVar2 = (C4043a) aVar.mo12504b(i2).mo12813l();
                    C4043a aVar3 = (C4043a) ((C4216b) aVar2.clone());
                    String a2 = C2264c6.m9273a(aVar2.mo12535a());
                    if (a2 != null) {
                        aVar3.mo12533a(a2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < aVar2.mo12536p(); i3++) {
                        C4057j0 a3 = aVar2.mo12534a(i3);
                        String a4 = C2252b6.m9154a(a3.mo12559w());
                        if (a4 != null) {
                            C4058a aVar4 = (C4058a) a3.mo12813l();
                            aVar4.mo12560a(a4);
                            aVar3.mo12532a(i3, (C4057j0) ((C4214t4) aVar4.mo12346f()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        aVar.mo12501a(i2, aVar3);
                        list2.set(i, (C4027h0) ((C4214t4) aVar.mo12346f()));
                    }
                }
            }
            if (aVar.mo12500a() != 0) {
                for (int i4 = 0; i4 < aVar.mo12500a(); i4++) {
                    C4088l0 a5 = aVar.mo12503a(i4);
                    String a6 = C2288e6.m9298a(a5.mo12599r());
                    if (a6 != null) {
                        C4089a aVar5 = (C4089a) a5.mo12813l();
                        aVar5.mo12605a(a6);
                        aVar.mo12502a(i4, aVar5);
                        list2.set(i, (C4027h0) ((C4214t4) aVar.mo12346f()));
                    }
                }
            }
        }
        mo7459r();
        mo7274c();
        C2148s.m8844b(str);
        C2148s.m8834a(list);
        SQLiteDatabase v = mo7183v();
        v.beginTransaction();
        try {
            mo7459r();
            mo7274c();
            C2148s.m8844b(str);
            SQLiteDatabase v2 = mo7183v();
            v2.delete(str7, str6, new String[]{str3});
            v2.delete(str5, str6, new String[]{str3});
            for (C4027h0 h0Var : list) {
                mo7459r();
                mo7274c();
                C2148s.m8844b(str);
                C2148s.m8834a(h0Var);
                if (h0Var.mo12492a()) {
                    int q = h0Var.mo12495q();
                    Iterator it = h0Var.mo12498t().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((C4042i0) it.next()).mo12520a()) {
                                w = mo7098j().mo7818w();
                                str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                a = C2516y3.m10125a(str);
                                valueOf = Integer.valueOf(q);
                                break;
                            }
                        } else {
                            for (C4088l0 a7 : h0Var.mo12496r()) {
                                if (!a7.mo12597a()) {
                                    w = mo7098j().mo7818w();
                                    str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    a = C2516y3.m10125a(str);
                                    valueOf = Integer.valueOf(q);
                                }
                            }
                            Iterator it2 = h0Var.mo12498t().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!m9173a(str3, q, (C4042i0) it2.next())) {
                                        z = false;
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                Iterator it3 = h0Var.mo12496r().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (!m9174a(str3, q, (C4088l0) it3.next())) {
                                            z = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                mo7459r();
                                mo7274c();
                                C2148s.m8844b(str);
                                SQLiteDatabase v3 = mo7183v();
                                v3.delete(str7, str4, new String[]{str3, String.valueOf(q)});
                                v3.delete(str5, str4, new String[]{str3, String.valueOf(q)});
                            }
                        }
                    }
                    w.mo7090a(str2, a, valueOf);
                    break;
                }
                mo7098j().mo7818w().mo7089a("Audience with no ID. appId", C2516y3.m10125a(str));
            }
            ArrayList arrayList = new ArrayList();
            for (C4027h0 h0Var2 : list) {
                arrayList.add(h0Var2.mo12492a() ? Integer.valueOf(h0Var2.mo12495q()) : null);
            }
            m9176b(str3, (List<Integer>) arrayList);
            v.setTransactionSuccessful();
        } finally {
            v.endTransaction();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7160a(List<Long> list) {
        mo7274c();
        mo7459r();
        C2148s.m8834a(list);
        C2148s.m8833a(list.size());
        if (m9168O()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m9175b(sb3.toString(), (String[]) null) > 0) {
                mo7098j().mo7818w().mo7088a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase v = mo7183v();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                v.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                mo7098j().mo7815t().mo7089a("Error incrementing retry count. error", e);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo7161a(C2353k kVar, long j, boolean z) {
        mo7274c();
        mo7459r();
        C2148s.m8834a(kVar);
        C2148s.m8844b(kVar.f6572a);
        C4290a y = C4289y0.m17570y();
        y.mo12929b(kVar.f6576e);
        Iterator it = kVar.f6577f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C3910a z2 = C3909a1.m15685z();
            z2.mo12071a(str);
            mo7492n().mo7610a(z2, kVar.f6577f.mo7498a(str));
            y.mo12923a(z2);
        }
        byte[] g = ((C4289y0) ((C4214t4) y.mo12346f())).mo12245g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", kVar.f6572a);
        contentValues.put("name", kVar.f6573b);
        contentValues.put("timestamp", Long.valueOf(kVar.f6575d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", g);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (mo7183v().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            mo7098j().mo7815t().mo7089a("Failed to insert raw event (got -1). appId", C2516y3.m10125a(kVar.f6572a));
            return false;
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Error storing raw event. appId", C2516y3.m10125a(kVar.f6572a), e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo7162a(C2388ma maVar) {
        C2148s.m8834a(maVar);
        mo7274c();
        mo7459r();
        if (mo7170c(maVar.f6680f, maVar.f6682h.f6998g) == null) {
            if (m9175b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{maVar.f6680f}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", maVar.f6680f);
        contentValues.put("origin", maVar.f6681g);
        contentValues.put("name", maVar.f6682h.f6998g);
        m9172a(contentValues, "value", maVar.f6682h.mo7665a());
        contentValues.put("active", Boolean.valueOf(maVar.f6684j));
        contentValues.put("trigger_event_name", maVar.f6685k);
        contentValues.put("trigger_timeout", Long.valueOf(maVar.f6687m));
        mo7825k();
        contentValues.put("timed_out_event", C2489v9.m10019a((Parcelable) maVar.f6686l));
        contentValues.put("creation_timestamp", Long.valueOf(maVar.f6683i));
        mo7825k();
        contentValues.put("triggered_event", C2489v9.m10019a((Parcelable) maVar.f6688n));
        contentValues.put("triggered_timestamp", Long.valueOf(maVar.f6682h.f6999h));
        contentValues.put("time_to_live", Long.valueOf(maVar.f6689o));
        mo7825k();
        contentValues.put("expired_event", C2489v9.m10019a((Parcelable) maVar.f6690p));
        try {
            if (mo7183v().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo7098j().mo7815t().mo7089a("Failed to insert/update conditional user property (got -1)", C2516y3.m10125a(maVar.f6680f));
            }
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Error storing conditional user property", C2516y3.m10125a(maVar.f6680f), e);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo7163a(C2500w9 w9Var) {
        C2148s.m8834a(w9Var);
        mo7274c();
        mo7459r();
        if (mo7170c(w9Var.f7058a, w9Var.f7060c) == null) {
            if (C2489v9.m10028e(w9Var.f7060c)) {
                if (m9175b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{w9Var.f7058a}) >= ((long) mo7827m().mo7112c(w9Var.f7058a))) {
                    return false;
                }
            } else {
                if (!"_npa".equals(w9Var.f7060c)) {
                    if (m9175b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{w9Var.f7058a, w9Var.f7059b}) >= 25) {
                        return false;
                    }
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", w9Var.f7058a);
        contentValues.put("origin", w9Var.f7059b);
        contentValues.put("name", w9Var.f7060c);
        contentValues.put("set_timestamp", Long.valueOf(w9Var.f7061d));
        m9172a(contentValues, "value", w9Var.f7062e);
        try {
            if (mo7183v().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo7098j().mo7815t().mo7089a("Failed to insert/update user property (got -1). appId", C2516y3.m10125a(w9Var.f7058a));
            }
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Error storing user property. appId", C2516y3.m10125a(w9Var.f7058a), e);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo7164a(C3941c1 c1Var, boolean z) {
        C2238a4 t;
        Object a;
        String str;
        mo7274c();
        mo7459r();
        C2148s.m8834a(c1Var);
        C2148s.m8844b(c1Var.mo12168p0());
        C2148s.m8845b(c1Var.mo12155e0());
        mo7142B();
        long b = mo7095g().mo6988b();
        if (c1Var.mo12157f0() < b - C2245b.m9110w() || c1Var.mo12157f0() > C2245b.m9110w() + b) {
            mo7098j().mo7818w().mo7091a("Storing bundle outside of the max uploading time span. appId, now, timestamp", C2516y3.m10125a(c1Var.mo12168p0()), Long.valueOf(b), Long.valueOf(c1Var.mo12157f0()));
        }
        try {
            byte[] c = mo7492n().mo7615c(c1Var.mo12245g());
            mo7098j().mo7810B().mo7089a("Saving bundle, size", Integer.valueOf(c.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c1Var.mo12168p0());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c1Var.mo12157f0()));
            contentValues.put("data", c);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c1Var.mo12137P()) {
                contentValues.put("retry_count", Integer.valueOf(c1Var.mo12139R()));
            }
            try {
                if (mo7183v().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                mo7098j().mo7815t().mo7089a("Failed to insert bundle (got -1). appId", C2516y3.m10125a(c1Var.mo12168p0()));
                return false;
            } catch (SQLiteException e) {
                e = e;
                t = mo7098j().mo7815t();
                a = C2516y3.m10125a(c1Var.mo12168p0());
                str = "Error storing bundle. appId";
                t.mo7090a(str, a, e);
                return false;
            }
        } catch (IOException e2) {
            e = e2;
            t = mo7098j().mo7815t();
            a = C2516y3.m10125a(c1Var.mo12168p0());
            str = "Data loss. Failed to serialize bundle. appId";
            t.mo7090a(str, a, e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo7165a(String str, Long l, long j, C4289y0 y0Var) {
        mo7274c();
        mo7459r();
        C2148s.m8834a(y0Var);
        C2148s.m8844b(str);
        C2148s.m8834a(l);
        byte[] g = y0Var.mo12245g();
        mo7098j().mo7810B().mo7090a("Saving complex main event, appId, data size", mo7824e().mo7718a(str), Integer.valueOf(g.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", g);
        try {
            if (mo7183v().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            mo7098j().mo7815t().mo7089a("Failed to insert complex main event (got -1). appId", C2516y3.m10125a(str));
            return false;
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Error storing complex main event. appId", C2516y3.m10125a(str), e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x011b A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011f A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0159 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0172 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0187 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a3 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a4 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b3 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01e9 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C2299f5 mo7166b(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r35
            com.google.android.gms.common.internal.C2148s.m8844b(r35)
            r34.mo7274c()
            r34.mo7459r()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r34.mo7183v()     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            java.lang.String r4 = "apps"
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "ssaid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            java.lang.String r6 = "app_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            r11 = 0
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0206, all -> 0x0202 }
            if (r4 != 0) goto L_0x006b
            if (r3 == 0) goto L_0x006a
            r3.close()
        L_0x006a:
            return r2
        L_0x006b:
            com.google.android.gms.measurement.internal.f5 r4 = new com.google.android.gms.measurement.internal.f5     // Catch:{ SQLiteException -> 0x0206, all -> 0x0202 }
            r5 = r34
            com.google.android.gms.measurement.internal.n9 r6 = r5.f6652b     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.c5 r6 = r6.mo7561t()     // Catch:{ SQLiteException -> 0x0200 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7294a(r6)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7300b(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 2
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7311e(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 3
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7315g(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7292a(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 5
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7299b(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7316g(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7319h(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7307d(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7310e(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r7 != 0) goto L_0x00d9
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r6 = 0
            goto L_0x00da
        L_0x00d9:
            r6 = 1
        L_0x00da:
            r4.mo7296a(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7325j(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7327k(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7329l(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7331m(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7318h(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7322i(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r7 == 0) goto L_0x011f
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0124
        L_0x011f:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0200 }
        L_0x0124:
            r4.mo7303c(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7314f(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7335o(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7333n(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7323i(r6)     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.b r6 = r34.mo7827m()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C2457t.f6889N0     // Catch:{ SQLiteException -> 0x0200 }
            boolean r6 = r6.mo7108a(r7)     // Catch:{ SQLiteException -> 0x0200 }
            r7 = 0
            if (r6 != 0) goto L_0x016a
            r6 = 22
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 == 0) goto L_0x0163
            r9 = r7
            goto L_0x0167
        L_0x0163:
            long r9 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x0167:
            r4.mo7337p(r9)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x016a:
            r6 = 23
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 != 0) goto L_0x017b
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r6 = 0
            goto L_0x017c
        L_0x017b:
            r6 = 1
        L_0x017c:
            r4.mo7301b(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 24
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 != 0) goto L_0x018f
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x018e
            goto L_0x018f
        L_0x018e:
            r0 = 0
        L_0x018f:
            r4.mo7305c(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7304c(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 26
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x01a4
            goto L_0x01a8
        L_0x01a4:
            long r7 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01a8:
            r4.mo7313f(r7)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 27
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 != 0) goto L_0x01c5
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x0200 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7295a(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01c5:
            boolean r0 = p147g.p156d.p157a.p167b.p173d.p180g.C4157pa.m16931b()     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01e0
            com.google.android.gms.measurement.internal.b r0 = r34.mo7827m()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C2457t.f6937p0     // Catch:{ SQLiteException -> 0x0200 }
            boolean r0 = r0.mo7116e(r1, r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01e0
            r0 = 28
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo7308d(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01e0:
            r4.mo7326k()     // Catch:{ SQLiteException -> 0x0200 }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01fa
            com.google.android.gms.measurement.internal.y3 r0 = r34.mo7098j()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7815t()     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r35)     // Catch:{ SQLiteException -> 0x0200 }
            r0.mo7089a(r6, r7)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01fa:
            if (r3 == 0) goto L_0x01ff
            r3.close()
        L_0x01ff:
            return r4
        L_0x0200:
            r0 = move-exception
            goto L_0x0212
        L_0x0202:
            r0 = move-exception
            r5 = r34
            goto L_0x022a
        L_0x0206:
            r0 = move-exception
            r5 = r34
            goto L_0x0212
        L_0x020a:
            r0 = move-exception
            r5 = r34
            goto L_0x022b
        L_0x020e:
            r0 = move-exception
            r5 = r34
            r3 = r2
        L_0x0212:
            com.google.android.gms.measurement.internal.y3 r4 = r34.mo7098j()     // Catch:{ all -> 0x0229 }
            com.google.android.gms.measurement.internal.a4 r4 = r4.mo7815t()     // Catch:{ all -> 0x0229 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r35)     // Catch:{ all -> 0x0229 }
            r4.mo7090a(r6, r1, r0)     // Catch:{ all -> 0x0229 }
            if (r3 == 0) goto L_0x0228
            r3.close()
        L_0x0228:
            return r2
        L_0x0229:
            r0 = move-exception
        L_0x022a:
            r2 = r3
        L_0x022b:
            if (r2 == 0) goto L_0x0230
            r2.close()
        L_0x0230:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7166b(java.lang.String):com.google.android.gms.measurement.internal.f5");
    }

    /* renamed from: b */
    public final List<C2388ma> mo7167b(String str, String str2, String str3) {
        C2148s.m8844b(str);
        mo7274c();
        mo7459r();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo7156a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: b */
    public final void mo7168b(String str, String str2) {
        C2148s.m8844b(str);
        C2148s.m8844b(str2);
        mo7274c();
        mo7459r();
        try {
            mo7183v().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7091a("Error deleting user property. appId", C2516y3.m10125a(str), mo7824e().mo7720c(str2), e);
        }
    }

    /* renamed from: c */
    public final long mo7169c(String str) {
        C2148s.m8844b(str);
        mo7274c();
        mo7459r();
        try {
            return (long) mo7183v().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, mo7827m().mo7110b(str, C2457t.f6936p))))});
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7090a("Error deleting over the limit events. appId", C2516y3.m10125a(str), e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C2500w9 mo7170c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.C2148s.m8844b(r19)
            com.google.android.gms.common.internal.C2148s.m8844b(r20)
            r18.mo7274c()
            r18.mo7459r()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.mo7183v()     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            if (r3 != 0) goto L_0x003f
            if (r10 == 0) goto L_0x003e
            r10.close()
        L_0x003e:
            return r9
        L_0x003f:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            r11 = r18
            java.lang.Object r7 = r11.m9171a(r10, r2)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.w9 r0 = new com.google.android.gms.measurement.internal.w9     // Catch:{ SQLiteException -> 0x0074 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.measurement.internal.y3 r1 = r18.mo7098j()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7815t()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r19)     // Catch:{ SQLiteException -> 0x0074 }
            r1.mo7089a(r2, r3)     // Catch:{ SQLiteException -> 0x0074 }
        L_0x006e:
            if (r10 == 0) goto L_0x0073
            r10.close()
        L_0x0073:
            return r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0086
        L_0x0076:
            r0 = move-exception
            r11 = r18
            goto L_0x00a6
        L_0x007a:
            r0 = move-exception
            r11 = r18
            goto L_0x0086
        L_0x007e:
            r0 = move-exception
            r11 = r18
            goto L_0x00a7
        L_0x0082:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0086:
            com.google.android.gms.measurement.internal.y3 r1 = r18.mo7098j()     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7815t()     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r19)     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.measurement.internal.w3 r4 = r18.mo7824e()     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = r4.mo7720c(r8)     // Catch:{ all -> 0x00a5 }
            r1.mo7091a(r2, r3, r4, r0)     // Catch:{ all -> 0x00a5 }
            if (r10 == 0) goto L_0x00a4
            r10.close()
        L_0x00a4:
            return r9
        L_0x00a5:
            r0 = move-exception
        L_0x00a6:
            r9 = r10
        L_0x00a7:
            if (r9 == 0) goto L_0x00ac
            r9.close()
        L_0x00ac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7170c(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.w9");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0125  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C2388ma mo7171d(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            com.google.android.gms.common.internal.C2148s.m8844b(r30)
            com.google.android.gms.common.internal.C2148s.m8844b(r31)
            r29.mo7274c()
            r29.mo7459r()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.mo7183v()     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            if (r3 != 0) goto L_0x004e
            if (r9 == 0) goto L_0x004d
            r9.close()
        L_0x004d:
            return r8
        L_0x004e:
            java.lang.String r16 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            r10 = r29
            java.lang.Object r5 = r10.m9171a(r9, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            if (r0 == 0) goto L_0x0061
            r20 = 1
            goto L_0x0063
        L_0x0061:
            r20 = 0
        L_0x0063:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.r9 r0 = r29.mo7492n()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.r> r2 = com.google.android.gms.measurement.internal.C2435r.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo7604a(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r22 = r0
            com.google.android.gms.measurement.internal.r r22 = (com.google.android.gms.measurement.internal.C2435r) r22     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.r9 r0 = r29.mo7492n()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.r> r2 = com.google.android.gms.measurement.internal.C2435r.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo7604a(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r25 = r0
            com.google.android.gms.measurement.internal.r r25 = (com.google.android.gms.measurement.internal.C2435r) r25     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.r9 r0 = r29.mo7492n()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.r> r2 = com.google.android.gms.measurement.internal.C2435r.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo7604a(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r28 = r0
            com.google.android.gms.measurement.internal.r r28 = (com.google.android.gms.measurement.internal.C2435r) r28     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.u9 r17 = new com.google.android.gms.measurement.internal.u9     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.ma r0 = new com.google.android.gms.measurement.internal.ma     // Catch:{ SQLiteException -> 0x00f0 }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00f0 }
            if (r1 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.y3 r1 = r29.mo7098j()     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7815t()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r30)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.w3 r4 = r29.mo7824e()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r4 = r4.mo7720c(r7)     // Catch:{ SQLiteException -> 0x00f0 }
            r1.mo7090a(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00ea:
            if (r9 == 0) goto L_0x00ef
            r9.close()
        L_0x00ef:
            return r0
        L_0x00f0:
            r0 = move-exception
            goto L_0x0102
        L_0x00f2:
            r0 = move-exception
            r10 = r29
            goto L_0x0122
        L_0x00f6:
            r0 = move-exception
            r10 = r29
            goto L_0x0102
        L_0x00fa:
            r0 = move-exception
            r10 = r29
            goto L_0x0123
        L_0x00fe:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x0102:
            com.google.android.gms.measurement.internal.y3 r1 = r29.mo7098j()     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7815t()     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r30)     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.w3 r4 = r29.mo7824e()     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = r4.mo7720c(r7)     // Catch:{ all -> 0x0121 }
            r1.mo7091a(r2, r3, r4, r0)     // Catch:{ all -> 0x0121 }
            if (r9 == 0) goto L_0x0120
            r9.close()
        L_0x0120:
            return r8
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            r8 = r9
        L_0x0123:
            if (r8 == 0) goto L_0x0128
            r8.close()
        L_0x0128:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7171d(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ma");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo7172d(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.C2148s.m8844b(r11)
            r10.mo7274c()
            r10.mo7459r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.mo7183v()     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            r9 = 0
            r5[r9] = r11     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0052 }
            if (r2 != 0) goto L_0x0031
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            return r0
        L_0x0031:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0052 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0052 }
            if (r3 == 0) goto L_0x004c
            com.google.android.gms.measurement.internal.y3 r3 = r10.mo7098j()     // Catch:{ SQLiteException -> 0x0052 }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7815t()     // Catch:{ SQLiteException -> 0x0052 }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r11)     // Catch:{ SQLiteException -> 0x0052 }
            r3.mo7089a(r4, r5)     // Catch:{ SQLiteException -> 0x0052 }
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()
        L_0x0051:
            return r2
        L_0x0052:
            r2 = move-exception
            goto L_0x0058
        L_0x0054:
            r11 = move-exception
            goto L_0x0071
        L_0x0056:
            r2 = move-exception
            r1 = r0
        L_0x0058:
            com.google.android.gms.measurement.internal.y3 r3 = r10.mo7098j()     // Catch:{ all -> 0x006f }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7815t()     // Catch:{ all -> 0x006f }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r11)     // Catch:{ all -> 0x006f }
            r3.mo7090a(r4, r11, r2)     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x006e
            r1.close()
        L_0x006e:
            return r0
        L_0x006f:
            r11 = move-exception
            r0 = r1
        L_0x0071:
            if (r0 == 0) goto L_0x0076
            r0.close()
        L_0x0076:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7172d(java.lang.String):byte[]");
    }

    /* renamed from: e */
    public final int mo7173e(String str, String str2) {
        C2148s.m8844b(str);
        C2148s.m8844b(str2);
        mo7274c();
        mo7459r();
        try {
            return mo7183v().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7091a("Error deleting conditional property", C2516y3.m10125a(str), mo7824e().mo7720c(str2), e);
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Map<Integer, List<C4042i0>> mo7174e(String str) {
        C2148s.m8844b(str);
        C3162a aVar = new C3162a();
        Cursor cursor = null;
        try {
            cursor = mo7183v().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<C4042i0>> emptyMap = Collections.emptyMap();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyMap;
            }
            do {
                byte[] blob = cursor.getBlob(1);
                try {
                    C4043a A = C4042i0.m16505A();
                    C2445r9.m9770a(A, blob);
                    C4042i0 i0Var = (C4042i0) ((C4214t4) A.mo12346f());
                    if (i0Var.mo12526u()) {
                        int i = cursor.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i), list);
                        }
                        list.add(i0Var);
                    }
                } catch (IOException e) {
                    mo7098j().mo7815t().mo7090a("Failed to merge filter. appId", C2516y3.m10125a(str), e);
                }
            } while (cursor.moveToNext());
            if (cursor != null) {
                cursor.close();
            }
            return aVar;
        } catch (SQLiteException e2) {
            mo7098j().mo7815t().mo7090a("Database error querying filters. appId", C2516y3.m10125a(str), e2);
            Map<Integer, List<C4042i0>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> mo7175f(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo7459r()
            r7.mo7274c()
            com.google.android.gms.common.internal.C2148s.m8844b(r8)
            f.e.a r0 = new f.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.mo7183v()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            r5 = 0
            r4[r5] = r8     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            r6 = 1
            r4[r6] = r8     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0065 }
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            return r8
        L_0x0032:
            int r3 = r1.getInt(r5)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ SQLiteException -> 0x0065 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x0065 }
            if (r4 != 0) goto L_0x004e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0065 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r0.put(r3, r4)     // Catch:{ SQLiteException -> 0x0065 }
        L_0x004e:
            int r3 = r1.getInt(r6)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x0065 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            if (r1 == 0) goto L_0x0064
            r1.close()
        L_0x0064:
            return r0
        L_0x0065:
            r0 = move-exception
            goto L_0x006b
        L_0x0067:
            r8 = move-exception
            goto L_0x0084
        L_0x0069:
            r0 = move-exception
            r1 = r2
        L_0x006b:
            com.google.android.gms.measurement.internal.y3 r3 = r7.mo7098j()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7815t()     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r8)     // Catch:{ all -> 0x0082 }
            r3.mo7090a(r4, r8, r0)     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0081
            r1.close()
        L_0x0081:
            return r2
        L_0x0082:
            r8 = move-exception
            r2 = r1
        L_0x0084:
            if (r2 == 0) goto L_0x0089
            r2.close()
        L_0x0089:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7175f(java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<p147g.p156d.p157a.p167b.p173d.p180g.C4042i0>> mo7176f(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo7459r()
            r12.mo7274c()
            com.google.android.gms.common.internal.C2148s.m8844b(r13)
            com.google.android.gms.common.internal.C2148s.m8844b(r14)
            f.e.a r0 = new f.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo7183v()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            g.d.a.b.d.g.i0$a r2 = p147g.p156d.p157a.p167b.p173d.p180g.C4042i0.m16505A()     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.measurement.internal.C2445r9.m9770a(r2, r1)     // Catch:{ IOException -> 0x0077 }
            g.d.a.b.d.g.i0$a r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4042i0.C4043a) r2     // Catch:{ IOException -> 0x0077 }
            g.d.a.b.d.g.e6 r1 = r2.mo12346f()     // Catch:{ IOException -> 0x0077 }
            g.d.a.b.d.g.t4 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r1     // Catch:{ IOException -> 0x0077 }
            g.d.a.b.d.g.i0 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C4042i0) r1     // Catch:{ IOException -> 0x0077 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0073
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0073:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0077:
            r1 = move-exception
            com.google.android.gms.measurement.internal.y3 r2 = r12.mo7098j()     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7815t()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.mo7090a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009b
        L_0x0097:
            r13 = move-exception
            goto L_0x00b4
        L_0x0099:
            r0 = move-exception
            r14 = r9
        L_0x009b:
            com.google.android.gms.measurement.internal.y3 r1 = r12.mo7098j()     // Catch:{ all -> 0x00b2 }
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7815t()     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r13)     // Catch:{ all -> 0x00b2 }
            r1.mo7090a(r2, r13, r0)     // Catch:{ all -> 0x00b2 }
            if (r14 == 0) goto L_0x00b1
            r14.close()
        L_0x00b1:
            return r9
        L_0x00b2:
            r13 = move-exception
            r9 = r14
        L_0x00b4:
            if (r9 == 0) goto L_0x00b9
            r9.close()
        L_0x00b9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7176f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, p147g.p156d.p157a.p167b.p173d.p180g.C3979e1> mo7177g(java.lang.String r12) {
        /*
            r11 = this;
            r11.mo7459r()
            r11.mo7274c()
            com.google.android.gms.common.internal.C2148s.m8844b(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.mo7183v()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ SQLiteException -> 0x007f, all -> 0x007d }
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x007f, all -> 0x007d }
            r10 = 0
            r4[r10] = r12     // Catch:{ SQLiteException -> 0x007f, all -> 0x007d }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x007f, all -> 0x007d }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x007b }
            if (r1 != 0) goto L_0x0033
            if (r0 == 0) goto L_0x0032
            r0.close()
        L_0x0032:
            return r8
        L_0x0033:
            f.e.a r1 = new f.e.a     // Catch:{ SQLiteException -> 0x007b }
            r1.<init>()     // Catch:{ SQLiteException -> 0x007b }
        L_0x0038:
            int r2 = r0.getInt(r10)     // Catch:{ SQLiteException -> 0x007b }
            byte[] r3 = r0.getBlob(r9)     // Catch:{ SQLiteException -> 0x007b }
            g.d.a.b.d.g.e1$a r4 = p147g.p156d.p157a.p167b.p173d.p180g.C3979e1.m16251x()     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.measurement.internal.C2445r9.m9770a(r4, r3)     // Catch:{ IOException -> 0x0059 }
            g.d.a.b.d.g.e1$a r4 = (p147g.p156d.p157a.p167b.p173d.p180g.C3979e1.C3980a) r4     // Catch:{ IOException -> 0x0059 }
            g.d.a.b.d.g.e6 r3 = r4.mo12346f()     // Catch:{ IOException -> 0x0059 }
            g.d.a.b.d.g.t4 r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r3     // Catch:{ IOException -> 0x0059 }
            g.d.a.b.d.g.e1 r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C3979e1) r3     // Catch:{ IOException -> 0x0059 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x007b }
            r1.put(r2, r3)     // Catch:{ SQLiteException -> 0x007b }
            goto L_0x006f
        L_0x0059:
            r3 = move-exception
            com.google.android.gms.measurement.internal.y3 r4 = r11.mo7098j()     // Catch:{ SQLiteException -> 0x007b }
            com.google.android.gms.measurement.internal.a4 r4 = r4.mo7815t()     // Catch:{ SQLiteException -> 0x007b }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r12)     // Catch:{ SQLiteException -> 0x007b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x007b }
            r4.mo7091a(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x007b }
        L_0x006f:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x007b }
            if (r2 != 0) goto L_0x0038
            if (r0 == 0) goto L_0x007a
            r0.close()
        L_0x007a:
            return r1
        L_0x007b:
            r1 = move-exception
            goto L_0x0081
        L_0x007d:
            r12 = move-exception
            goto L_0x009a
        L_0x007f:
            r1 = move-exception
            r0 = r8
        L_0x0081:
            com.google.android.gms.measurement.internal.y3 r2 = r11.mo7098j()     // Catch:{ all -> 0x0098 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7815t()     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r12)     // Catch:{ all -> 0x0098 }
            r2.mo7090a(r3, r12, r1)     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0097
            r0.close()
        L_0x0097:
            return r8
        L_0x0098:
            r12 = move-exception
            r8 = r0
        L_0x009a:
            if (r8 == 0) goto L_0x009f
            r8.close()
        L_0x009f:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7177g(java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<p147g.p156d.p157a.p167b.p173d.p180g.C4088l0>> mo7178g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo7459r()
            r12.mo7274c()
            com.google.android.gms.common.internal.C2148s.m8844b(r13)
            com.google.android.gms.common.internal.C2148s.m8844b(r14)
            f.e.a r0 = new f.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo7183v()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            g.d.a.b.d.g.l0$a r2 = p147g.p156d.p157a.p167b.p173d.p180g.C4088l0.m16724x()     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.measurement.internal.C2445r9.m9770a(r2, r1)     // Catch:{ IOException -> 0x0077 }
            g.d.a.b.d.g.l0$a r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4088l0.C4089a) r2     // Catch:{ IOException -> 0x0077 }
            g.d.a.b.d.g.e6 r1 = r2.mo12346f()     // Catch:{ IOException -> 0x0077 }
            g.d.a.b.d.g.t4 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r1     // Catch:{ IOException -> 0x0077 }
            g.d.a.b.d.g.l0 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C4088l0) r1     // Catch:{ IOException -> 0x0077 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0073
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0073:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0077:
            r1 = move-exception
            com.google.android.gms.measurement.internal.y3 r2 = r12.mo7098j()     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7815t()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.mo7090a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009b
        L_0x0097:
            r13 = move-exception
            goto L_0x00b4
        L_0x0099:
            r0 = move-exception
            r14 = r9
        L_0x009b:
            com.google.android.gms.measurement.internal.y3 r1 = r12.mo7098j()     // Catch:{ all -> 0x00b2 }
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7815t()     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r13)     // Catch:{ all -> 0x00b2 }
            r1.mo7090a(r2, r13, r0)     // Catch:{ all -> 0x00b2 }
            if (r14 == 0) goto L_0x00b1
            r14.close()
        L_0x00b1:
            return r9
        L_0x00b2:
            r13 = move-exception
            r9 = r14
        L_0x00b4:
            if (r9 == 0) goto L_0x00b9
            r9.close()
        L_0x00b9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7178g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* renamed from: h */
    public final long mo7179h(String str) {
        C2148s.m8844b(str);
        return m9169a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final long mo7180h(String str, String str2) {
        long j;
        String str3;
        String str4;
        String str5 = str;
        String str6 = str2;
        C2148s.m8844b(str);
        C2148s.m8844b(str2);
        mo7274c();
        mo7459r();
        SQLiteDatabase v = mo7183v();
        v.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str6);
            sb.append(" from app2 where app_id=?");
            try {
                j = m9169a(sb.toString(), new String[]{str5}, -1);
                str3 = "app2";
                str4 = "app_id";
                if (j == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(str4, str5);
                    contentValues.put("first_open_count", Integer.valueOf(0));
                    contentValues.put("previous_install_count", Integer.valueOf(0));
                    if (v.insertWithOnConflict(str3, null, contentValues, 5) == -1) {
                        mo7098j().mo7815t().mo7090a("Failed to insert column (got -1). appId", C2516y3.m10125a(str), str6);
                        v.endTransaction();
                        return -1;
                    }
                    j = 0;
                }
            } catch (SQLiteException e) {
                e = e;
                try {
                    mo7098j().mo7815t().mo7091a("Error inserting column. appId", C2516y3.m10125a(str), str6, e);
                    v.endTransaction();
                    j = j2;
                    return j;
                } catch (Throwable th) {
                    th = th;
                    v.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(str4, str5);
                contentValues2.put(str6, Long.valueOf(1 + j));
                if (((long) v.update(str3, contentValues2, "app_id = ?", new String[]{str5})) == 0) {
                    mo7098j().mo7815t().mo7090a("Failed to update column (got 0). appId", C2516y3.m10125a(str), str6);
                    v.endTransaction();
                    return -1;
                }
                v.setTransactionSuccessful();
                v.endTransaction();
                return j;
            } catch (SQLiteException e2) {
                e = e2;
                j2 = j;
                mo7098j().mo7815t().mo7091a("Error inserting column. appId", C2516y3.m10125a(str), str6, e);
                v.endTransaction();
                j = j2;
                return j;
            }
        } catch (SQLiteException e3) {
            e = e3;
            mo7098j().mo7815t().mo7091a("Error inserting column. appId", C2516y3.m10125a(str), str6, e);
            v.endTransaction();
            j = j2;
            return j;
        } catch (Throwable th2) {
            th = th2;
            v.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo7181t() {
        return false;
    }

    /* renamed from: u */
    public final void mo7182u() {
        mo7459r();
        mo7183v().setTransactionSuccessful();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final SQLiteDatabase mo7183v() {
        mo7274c();
        try {
            return this.f6299d.getWritableDatabase();
        } catch (SQLiteException e) {
            mo7098j().mo7818w().mo7089a("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo7184w() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo7183v()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003f
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            com.google.android.gms.measurement.internal.y3 r3 = r6.mo7098j()     // Catch:{ all -> 0x003e }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7815t()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo7089a(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2257c.mo7184w():java.lang.String");
    }

    /* renamed from: x */
    public final long mo7185x() {
        Cursor cursor = null;
        try {
            cursor = mo7183v().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
            long j = cursor.getLong(0);
            if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (SQLiteException e) {
            mo7098j().mo7815t().mo7089a("Error querying raw events", e);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: y */
    public final void mo7186y() {
        mo7459r();
        mo7183v().beginTransaction();
    }

    /* renamed from: z */
    public final void mo7187z() {
        mo7459r();
        mo7183v().endTransaction();
    }
}
