package com.crashlytics.android.p033e;

import java.io.File;
import java.util.Map.Entry;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4801a;
import p242i.p243a.p244a.p245a.p246n.p248b.C4839v;
import p242i.p243a.p244a.p245a.p246n.p252e.C4887c;
import p242i.p243a.p244a.p245a.p246n.p252e.C4888d;
import p242i.p243a.p244a.p245a.p246n.p252e.C4896e;

/* renamed from: com.crashlytics.android.e.v */
class C1484v extends C4801a implements C1479t {
    public C1484v(C4792i iVar, String str, String str2, C4896e eVar) {
        super(iVar, str, str2, eVar, C4887c.POST);
    }

    /* renamed from: a */
    private C4888d m6717a(C4888d dVar, C1462o0 o0Var) {
        File[] b;
        dVar.mo14025e("report[identifier]", o0Var.mo5544d());
        String str = "application/octet-stream";
        String str2 = " to report ";
        String str3 = "CrashlyticsCore";
        if (o0Var.mo5542b().length == 1) {
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Adding single file ");
            sb.append(o0Var.mo5543c());
            sb.append(str2);
            sb.append(o0Var.mo5544d());
            f.mo13796e(str3, sb.toString());
            dVar.mo14007a("report[file]", o0Var.mo5543c(), str, o0Var.mo5546f());
            return dVar;
        }
        int i = 0;
        for (File file : o0Var.mo5542b()) {
            C4795l f2 = C4781c.m19229f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Adding file ");
            sb2.append(file.getName());
            sb2.append(str2);
            sb2.append(o0Var.mo5544d());
            f2.mo13796e(str3, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("report[file");
            sb3.append(i);
            sb3.append("]");
            dVar.mo14007a(sb3.toString(), file.getName(), str, file);
            i++;
        }
        return dVar;
    }

    /* renamed from: a */
    private C4888d m6718a(C4888d dVar, C1477s sVar) {
        dVar.mo14018c("X-CRASHLYTICS-API-KEY", sVar.f4642a);
        dVar.mo14018c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        dVar.mo14018c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f12549e.mo5402p());
        for (Entry a : sVar.f4643b.mo5541a().entrySet()) {
            dVar.mo14010a(a);
        }
        return dVar;
    }

    /* renamed from: a */
    public boolean mo5514a(C1477s sVar) {
        C4888d a = mo13849a();
        m6718a(a, sVar);
        m6717a(a, sVar.f4643b);
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("Sending report to: ");
        sb.append(mo13851b());
        String str = "CrashlyticsCore";
        f.mo13796e(str, sb.toString());
        int g = a.mo14028g();
        C4795l f2 = C4781c.m19229f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Create report request ID: ");
        sb2.append(a.mo14020c("X-REQUEST-ID"));
        f2.mo13796e(str, sb2.toString());
        C4795l f3 = C4781c.m19229f();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Result was: ");
        sb3.append(g);
        f3.mo13796e(str, sb3.toString());
        return C4839v.m19472a(g) == 0;
    }
}
