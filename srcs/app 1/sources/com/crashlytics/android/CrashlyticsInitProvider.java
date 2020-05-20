package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.p246n.p248b.C4829r;

public class CrashlyticsInitProvider extends ContentProvider {

    /* renamed from: com.crashlytics.android.CrashlyticsInitProvider$a */
    interface C1324a {
        /* renamed from: a */
        boolean mo5398a(Context context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032 A[SYNTHETIC, Splitter:B:12:0x0032] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p242i.p243a.p244a.p245a.C4792i[] m6199a(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Fabric"
            r1 = 1
            r2 = 0
            android.content.pm.PackageManager r3 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0020 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0020 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r7 = r3.getApplicationInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0020 }
            android.os.Bundle r7 = r7.metaData     // Catch:{ NameNotFoundException -> 0x0020 }
            if (r7 == 0) goto L_0x002a
            java.lang.String r3 = "firebase_crashlytics_ndk_enabled"
            boolean r7 = r7.getBoolean(r3, r2)     // Catch:{ NameNotFoundException -> 0x0020 }
            if (r7 == 0) goto L_0x002a
            r7 = 1
            goto L_0x002b
        L_0x0020:
            r7 = move-exception
            i.a.a.a.l r3 = p242i.p243a.p244a.p245a.C4781c.m19229f()
            java.lang.String r4 = "Unable to get PackageManager while determining if Crashlytics NDK should be initialized"
            r3.mo13788a(r0, r4, r7)
        L_0x002a:
            r7 = 0
        L_0x002b:
            com.crashlytics.android.a r3 = new com.crashlytics.android.a
            r3.<init>()
            if (r7 == 0) goto L_0x0052
            i.a.a.a.l r7 = p242i.p243a.p244a.p245a.C4781c.m19229f()     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = "Crashlytics is initializing NDK crash reporter."
            r7.mo13790b(r0, r4)     // Catch:{ all -> 0x0048 }
            r7 = 2
            i.a.a.a.i[] r7 = new p242i.p243a.p244a.p245a.C4792i[r7]     // Catch:{ all -> 0x0048 }
            r7[r2] = r3     // Catch:{ all -> 0x0048 }
            com.crashlytics.android.ndk.CrashlyticsNdk r4 = new com.crashlytics.android.ndk.CrashlyticsNdk     // Catch:{ all -> 0x0048 }
            r4.<init>()     // Catch:{ all -> 0x0048 }
            r7[r1] = r4     // Catch:{ all -> 0x0048 }
            return r7
        L_0x0048:
            r7 = move-exception
            i.a.a.a.l r4 = p242i.p243a.p244a.p245a.C4781c.m19229f()
            java.lang.String r5 = "Crashlytics failed to initialize NDK crash reporting. Attempting to intialize SDK..."
            r4.mo13793c(r0, r5, r7)
        L_0x0052:
            i.a.a.a.i[] r7 = new p242i.p243a.p244a.p245a.C4792i[r1]
            r7[r2] = r3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.CrashlyticsInitProvider.m6199a(android.content.Context):i.a.a.a.i[]");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5391a(Context context, C4829r rVar, C1324a aVar) {
        return rVar.mo13889e(context) ? aVar.mo5398a(context) : rVar.mo13888d(context);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        boolean a = mo5391a(context, new C4829r(), new C1326b());
        String str = "CrashlyticsInitProvider";
        if (a) {
            try {
                C4781c.m19219a(context, m6199a(context.getApplicationContext()));
                C4781c.m19229f().mo13790b(str, "CrashlyticsInitProvider initialization successful");
            } catch (IllegalStateException unused) {
                C4781c.m19229f().mo13790b(str, "CrashlyticsInitProvider initialization unsuccessful");
                return false;
            }
        } else {
            C4781c.m19229f().mo13790b(str, "CrashlyticsInitProvider skipping initialization");
        }
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
