package p242i.p243a.p244a.p245a.p246n.p248b;

import android.content.Context;
import android.text.TextUtils;
import p242i.p243a.p244a.p245a.C4781c;

/* renamed from: i.a.a.a.n.b.r */
public class C4829r {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo13884a(Context context) {
        int a = C4813i.m19349a(context, "google_app_id", "string");
        if (a == 0) {
            return null;
        }
        C4781c.m19229f().mo13796e("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings");
        return mo13885a(context.getResources().getString(a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo13885a(String str) {
        return C4813i.m19382d(str).substring(0, 40);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo13886b(Context context) {
        if (!TextUtils.isEmpty(new C4811g().mo13868b(context))) {
            return true;
        }
        return !TextUtils.isEmpty(new C4811g().mo13869c(context));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo13887c(Context context) {
        int a = C4813i.m19349a(context, "google_app_id", "string");
        if (a == 0) {
            return false;
        }
        return !TextUtils.isEmpty(context.getResources().getString(a));
    }

    /* renamed from: d */
    public boolean mo13888d(Context context) {
        int a = C4813i.m19349a(context, "io.fabric.auto_initialize", "bool");
        if (a == 0) {
            return false;
        }
        boolean z = context.getResources().getBoolean(a);
        if (z) {
            C4781c.m19229f().mo13796e("Fabric", "Found Fabric auto-initialization flag for joint Firebase/Fabric customers");
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo13889e(Context context) {
        boolean z = false;
        if (C4813i.m19370a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        if (mo13887c(context) && !mo13886b(context)) {
            z = true;
        }
        return z;
    }
}
