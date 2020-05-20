package com.crashlytics.android.p031c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import java.io.File;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4816j.C4817a;
import p242i.p243a.p244a.p245a.p246n.p248b.C4816j.C4818b;
import p242i.p243a.p244a.p245a.p246n.p248b.C4820l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4829r;
import p242i.p243a.p244a.p245a.p246n.p254g.C4921q;
import p242i.p243a.p244a.p245a.p246n.p254g.C4926t;

/* renamed from: com.crashlytics.android.c.b */
public class C1332b extends C4792i<Boolean> {

    /* renamed from: l */
    C1367y f4346l;

    /* renamed from: a */
    public void mo5407a(C4817a aVar) {
        C1367y yVar = this.f4346l;
        if (yVar != null) {
            yVar.mo5477a(aVar.mo13876b(), aVar.mo13875a());
        }
    }

    /* renamed from: a */
    public void mo5408a(C4818b bVar) {
        C1367y yVar = this.f4346l;
        if (yVar != null) {
            yVar.mo5476a(bVar.mo13876b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Boolean m6223h() {
        String str = "Answers";
        boolean a = C4820l.m19399a(mo13833i()).mo13878a();
        Boolean valueOf = Boolean.valueOf(false);
        if (!a) {
            C4781c.m19229f().mo13796e("Fabric", "Analytics collection disabled, because data collection is disabled by Firebase.");
            this.f4346l.mo5478b();
            return valueOf;
        }
        try {
            C4926t a2 = C4921q.m19715d().mo14071a();
            if (a2 == null) {
                C4781c.m19229f().mo13792c(str, "Failed to retrieve settings");
                return valueOf;
            } else if (a2.f12818d.f12791c) {
                C4781c.m19229f().mo13796e(str, "Analytics collection enabled");
                this.f4346l.mo5475a(a2.f12819e, mo5410t());
                return Boolean.valueOf(true);
            } else {
                C4781c.m19229f().mo13796e(str, "Analytics collection disabled");
                this.f4346l.mo5478b();
                return valueOf;
            }
        } catch (Exception e) {
            C4781c.m19229f().mo13793c(str, "Error dealing with settings", e);
            return valueOf;
        }
    }

    /* renamed from: n */
    public String mo5401n() {
        return "com.crashlytics.sdk.android:answers";
    }

    /* renamed from: p */
    public String mo5402p() {
        return "1.4.7.32";
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: s */
    public boolean mo5409s() {
        try {
            Context i = mo13833i();
            PackageManager packageManager = i.getPackageManager();
            String packageName = i.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            C1367y a = C1367y.m6321a(this, i, mo13836m(), Integer.toString(packageInfo.versionCode), packageInfo.versionName == null ? "0.0" : packageInfo.versionName, VERSION.SDK_INT >= 9 ? packageInfo.firstInstallTime : new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified());
            this.f4346l = a;
            a.mo5479c();
            new C4829r().mo13889e(i);
            return true;
        } catch (Exception e) {
            C4781c.m19229f().mo13793c("Answers", "Error retrieving app properties", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public String mo5410t() {
        return C4813i.m19373b(mo13833i(), "com.crashlytics.ApiEndpoint");
    }
}
