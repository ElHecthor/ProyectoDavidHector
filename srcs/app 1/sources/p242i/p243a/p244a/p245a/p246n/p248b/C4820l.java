package p242i.p243a.p244a.p245a.p246n.p248b;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: i.a.a.a.n.b.l */
public class C4820l {

    /* renamed from: f */
    private static C4820l f12579f;

    /* renamed from: g */
    private static Object f12580g = new Object();

    /* renamed from: a */
    private final SharedPreferences f12581a;

    /* renamed from: b */
    private volatile boolean f12582b;

    /* renamed from: c */
    private volatile boolean f12583c;

    /* renamed from: d */
    private final C4827p f12584d;

    /* renamed from: e */
    private boolean f12585e = false;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C4820l(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f12585e = r0
            if (r7 == 0) goto L_0x006a
            java.lang.String r1 = "com.google.firebase.crashlytics.prefs"
            android.content.SharedPreferences r1 = r7.getSharedPreferences(r1, r0)
            r6.f12581a = r1
            i.a.a.a.n.b.p r1 = p242i.p243a.p244a.p245a.p246n.p248b.C4828q.m19413a(r7)
            r6.f12584d = r1
            android.content.SharedPreferences r1 = r6.f12581a
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r1 = r1.contains(r2)
            r3 = 1
            if (r1 == 0) goto L_0x0029
            android.content.SharedPreferences r1 = r6.f12581a
            boolean r1 = r1.getBoolean(r2, r3)
        L_0x0027:
            r2 = 1
            goto L_0x005c
        L_0x0029:
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x004e }
            if (r1 == 0) goto L_0x005a
            java.lang.String r4 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x004e }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x004e }
            if (r1 == 0) goto L_0x005a
            android.os.Bundle r4 = r1.metaData     // Catch:{ NameNotFoundException -> 0x004e }
            if (r4 == 0) goto L_0x005a
            android.os.Bundle r4 = r1.metaData     // Catch:{ NameNotFoundException -> 0x004e }
            boolean r4 = r4.containsKey(r2)     // Catch:{ NameNotFoundException -> 0x004e }
            if (r4 == 0) goto L_0x005a
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x004e }
            boolean r1 = r1.getBoolean(r2)     // Catch:{ NameNotFoundException -> 0x004e }
            goto L_0x0027
        L_0x004e:
            r1 = move-exception
            i.a.a.a.l r2 = p242i.p243a.p244a.p245a.C4781c.m19229f()
            java.lang.String r4 = "Fabric"
            java.lang.String r5 = "Unable to get PackageManager. Falling through"
            r2.mo13788a(r4, r5, r1)
        L_0x005a:
            r1 = 1
            r2 = 0
        L_0x005c:
            r6.f12583c = r1
            r6.f12582b = r2
            java.lang.String r7 = p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19393o(r7)
            if (r7 == 0) goto L_0x0067
            r0 = 1
        L_0x0067:
            r6.f12585e = r0
            return
        L_0x006a:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "null context"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p242i.p243a.p244a.p245a.p246n.p248b.C4820l.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public static C4820l m19399a(Context context) {
        C4820l lVar;
        synchronized (f12580g) {
            if (f12579f == null) {
                f12579f = new C4820l(context);
            }
            lVar = f12579f;
        }
        return lVar;
    }

    /* renamed from: a */
    public boolean mo13878a() {
        if (this.f12585e && this.f12582b) {
            return this.f12583c;
        }
        C4827p pVar = this.f12584d;
        if (pVar != null) {
            return pVar.mo13883a();
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo13879b() {
        return this.f12583c;
    }
}
