package com.crashlytics.android.p033e;

import java.io.File;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4801a;
import p242i.p243a.p244a.p245a.p246n.p248b.C4839v;
import p242i.p243a.p244a.p245a.p246n.p252e.C4887c;
import p242i.p243a.p244a.p245a.p246n.p252e.C4888d;
import p242i.p243a.p244a.p245a.p246n.p252e.C4896e;

/* renamed from: com.crashlytics.android.e.f0 */
class C1386f0 extends C4801a implements C1479t {
    public C1386f0(C4792i iVar, String str, String str2, C4896e eVar) {
        super(iVar, str, str2, eVar, C4887c.POST);
    }

    /* renamed from: a */
    private C4888d m6390a(C4888d dVar, C1462o0 o0Var) {
        File[] b;
        String name;
        String str;
        dVar.mo14025e("report_id", o0Var.mo5544d());
        for (File file : o0Var.mo5542b()) {
            String str2 = "application/octet-stream";
            if (file.getName().equals("minidump")) {
                name = file.getName();
                str = "minidump_file";
            } else if (file.getName().equals("metadata")) {
                name = file.getName();
                str = "crash_meta_file";
            } else if (file.getName().equals("binaryImages")) {
                name = file.getName();
                str = "binary_images_file";
            } else if (file.getName().equals("session")) {
                name = file.getName();
                str = "session_meta_file";
            } else if (file.getName().equals("app")) {
                name = file.getName();
                str = "app_meta_file";
            } else if (file.getName().equals("device")) {
                name = file.getName();
                str = "device_meta_file";
            } else if (file.getName().equals("os")) {
                name = file.getName();
                str = "os_meta_file";
            } else if (file.getName().equals("user")) {
                name = file.getName();
                str = "user_meta_file";
            } else if (file.getName().equals("logs")) {
                name = file.getName();
                str = "logs_file";
            } else if (file.getName().equals("keys")) {
                name = file.getName();
                str = "keys_file";
            }
            dVar.mo14007a(str, name, str2, file);
        }
        return dVar;
    }

    /* renamed from: a */
    private C4888d m6391a(C4888d dVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Android SDK/");
        sb.append(this.f12549e.mo5402p());
        dVar.mo14018c("User-Agent", sb.toString());
        dVar.mo14018c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        dVar.mo14018c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f12549e.mo5402p());
        dVar.mo14018c("X-CRASHLYTICS-API-KEY", str);
        return dVar;
    }

    /* renamed from: a */
    public boolean mo5514a(C1477s sVar) {
        C4888d a = mo13849a();
        m6391a(a, sVar.f4642a);
        m6390a(a, sVar.f4643b);
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("Sending report to: ");
        sb.append(mo13851b());
        String str = "CrashlyticsCore";
        f.mo13796e(str, sb.toString());
        int g = a.mo14028g();
        C4795l f2 = C4781c.m19229f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Result was: ");
        sb2.append(g);
        f2.mo13796e(str, sb2.toString());
        return C4839v.m19472a(g) == 0;
    }
}
