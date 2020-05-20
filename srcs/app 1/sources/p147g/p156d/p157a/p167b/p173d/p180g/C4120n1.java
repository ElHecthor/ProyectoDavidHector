package p147g.p156d.p157a.p167b.p173d.p180g;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p071f.p088e.C3162a;

/* renamed from: g.d.a.b.d.g.n1 */
public final class C4120n1 implements C4177r1 {

    /* renamed from: g */
    private static final Map<Uri, C4120n1> f11129g = new C3162a();

    /* renamed from: h */
    private static final String[] f11130h = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f11131a;

    /* renamed from: b */
    private final Uri f11132b;

    /* renamed from: c */
    private final ContentObserver f11133c = new C4148p1(this, null);

    /* renamed from: d */
    private final Object f11134d = new Object();

    /* renamed from: e */
    private volatile Map<String, String> f11135e;

    /* renamed from: f */
    private final List<C4196s1> f11136f = new ArrayList();

    private C4120n1(ContentResolver contentResolver, Uri uri) {
        this.f11131a = contentResolver;
        this.f11132b = uri;
        contentResolver.registerContentObserver(uri, false, this.f11133c);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p147g.p156d.p157a.p167b.p173d.p180g.C4120n1 m16840a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<g.d.a.b.d.g.n1> r0 = p147g.p156d.p157a.p167b.p173d.p180g.C4120n1.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, g.d.a.b.d.g.n1> r1 = f11129g     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            g.d.a.b.d.g.n1 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C4120n1) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            g.d.a.b.d.g.n1 r2 = new g.d.a.b.d.g.n1     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, g.d.a.b.d.g.n1> r3 = f11129g     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p173d.p180g.C4120n1.m16840a(android.content.ContentResolver, android.net.Uri):g.d.a.b.d.g.n1");
    }

    /* renamed from: d */
    static synchronized void m16841d() {
        synchronized (C4120n1.class) {
            for (C4120n1 n1Var : f11129g.values()) {
                n1Var.f11131a.unregisterContentObserver(n1Var.f11133c);
            }
            f11129g.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private final Map<String, String> m16842e() {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) C4231u1.m17248a(new C4162q1(this));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12592a(String str) {
        return (String) mo12667a().get(str);
    }

    /* renamed from: a */
    public final Map<String, String> mo12667a() {
        Map<String, String> map = this.f11135e;
        if (map == null) {
            synchronized (this.f11134d) {
                map = this.f11135e;
                if (map == null) {
                    map = m16842e();
                    this.f11135e = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    /* renamed from: b */
    public final void mo12668b() {
        synchronized (this.f11134d) {
            this.f11135e = null;
            C3927b2.m15760c();
        }
        synchronized (this) {
            for (C4196s1 a : this.f11136f) {
                a.mo12775a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Map mo12669c() {
        Cursor query = this.f11131a.query(this.f11132b, f11130h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new C3162a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return aVar;
        } finally {
            query.close();
        }
    }
}
