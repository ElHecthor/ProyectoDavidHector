package p242i.p243a.p244a.p245a.p246n.p248b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: i.a.a.a.n.b.g */
public class C4811g {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo13866a() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo13867a(Context context) {
        return new C4829r().mo13884a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo13868b(Context context) {
        String str = "Fabric";
        String str2 = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("io.fabric.ApiKey");
            try {
                if ("@string/twitter_consumer_secret".equals(string)) {
                    C4781c.m19229f().mo13796e(str, "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                } else {
                    str2 = string;
                }
                if (str2 != null) {
                    return str2;
                }
                C4781c.m19229f().mo13796e(str, "Falling back to Crashlytics key lookup from Manifest");
                return bundle.getString("com.crashlytics.ApiKey");
            } catch (Exception e) {
                e = e;
                str2 = string;
                C4795l f = C4781c.m19229f();
                StringBuilder sb = new StringBuilder();
                sb.append("Caught non-fatal exception while retrieving apiKey: ");
                sb.append(e);
                f.mo13796e(str, sb.toString());
                return str2;
            }
        } catch (Exception e2) {
            e = e2;
            C4795l f2 = C4781c.m19229f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Caught non-fatal exception while retrieving apiKey: ");
            sb2.append(e);
            f2.mo13796e(str, sb2.toString());
            return str2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo13869c(Context context) {
        String str = "string";
        int a = C4813i.m19349a(context, "io.fabric.ApiKey", str);
        if (a == 0) {
            C4781c.m19229f().mo13796e("Fabric", "Falling back to Crashlytics key lookup from Strings");
            a = C4813i.m19349a(context, "com.crashlytics.ApiKey", str);
        }
        if (a != 0) {
            return context.getResources().getString(a);
        }
        return null;
    }

    /* renamed from: d */
    public String mo13870d(Context context) {
        String b = mo13868b(context);
        if (TextUtils.isEmpty(b)) {
            b = mo13869c(context);
        }
        if (TextUtils.isEmpty(b)) {
            b = mo13867a(context);
        }
        if (TextUtils.isEmpty(b)) {
            mo13871e(context);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo13871e(Context context) {
        if (C4781c.m19231h() || C4813i.m19388j(context)) {
            throw new IllegalArgumentException(mo13866a());
        }
        C4781c.m19229f().mo13792c("Fabric", mo13866a());
    }
}
