package com.crashlytics.android.p031c;

import java.io.File;
import java.util.List;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4801a;
import p242i.p243a.p244a.p245a.p246n.p248b.C4839v;
import p242i.p243a.p244a.p245a.p246n.p251d.C4880f;
import p242i.p243a.p244a.p245a.p246n.p252e.C4887c;
import p242i.p243a.p244a.p245a.p246n.p252e.C4888d;
import p242i.p243a.p244a.p245a.p246n.p252e.C4896e;

/* renamed from: com.crashlytics.android.c.x */
class C1366x extends C4801a implements C4880f {

    /* renamed from: g */
    private final String f4425g;

    public C1366x(C4792i iVar, String str, String str2, C4896e eVar, String str3) {
        super(iVar, str, str2, eVar, C4887c.POST);
        this.f4425g = str3;
    }

    /* renamed from: a */
    public boolean mo5441a(List<File> list) {
        C4888d a = mo13849a();
        a.mo14018c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a.mo14018c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f12549e.mo5402p());
        a.mo14018c("X-CRASHLYTICS-API-KEY", this.f4425g);
        int i = 0;
        for (File file : list) {
            StringBuilder sb = new StringBuilder();
            sb.append("session_analytics_file_");
            sb.append(i);
            a.mo14007a(sb.toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
            i++;
        }
        C4795l f = C4781c.m19229f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        sb2.append(list.size());
        sb2.append(" analytics files to ");
        sb2.append(mo13851b());
        String sb3 = sb2.toString();
        String str = "Answers";
        f.mo13796e(str, sb3);
        int g = a.mo14028g();
        C4795l f2 = C4781c.m19229f();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Response code for analytics file send is ");
        sb4.append(g);
        f2.mo13796e(str, sb4.toString());
        return C4839v.m19472a(g) == 0;
    }
}
