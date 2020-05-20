package com.crashlytics.android.p033e;

import java.io.File;
import java.io.IOException;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p253f.C4901a;

/* renamed from: com.crashlytics.android.e.m */
class C1455m {

    /* renamed from: a */
    private final String f4605a;

    /* renamed from: b */
    private final C4901a f4606b;

    public C1455m(String str, C4901a aVar) {
        this.f4605a = str;
        this.f4606b = aVar;
    }

    /* renamed from: d */
    private File m6620d() {
        return new File(this.f4606b.mo14050a(), this.f4605a);
    }

    /* renamed from: a */
    public boolean mo5641a() {
        try {
            return m6620d().createNewFile();
        } catch (IOException e) {
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating marker: ");
            sb.append(this.f4605a);
            f.mo13793c("CrashlyticsCore", sb.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo5642b() {
        return m6620d().exists();
    }

    /* renamed from: c */
    public boolean mo5643c() {
        return m6620d().delete();
    }
}
