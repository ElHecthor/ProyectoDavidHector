package com.crashlytics.android.p033e;

import com.crashlytics.android.p033e.C1462o0.C1463a;
import java.io.File;
import java.util.Map;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: com.crashlytics.android.e.h0 */
class C1392h0 implements C1462o0 {

    /* renamed from: a */
    private final File f4466a;

    public C1392h0(File file) {
        this.f4466a = file;
    }

    /* renamed from: a */
    public Map<String, String> mo5541a() {
        return null;
    }

    /* renamed from: b */
    public File[] mo5542b() {
        return this.f4466a.listFiles();
    }

    /* renamed from: c */
    public String mo5543c() {
        return null;
    }

    /* renamed from: d */
    public String mo5544d() {
        return this.f4466a.getName();
    }

    /* renamed from: e */
    public C1463a mo5545e() {
        return C1463a.NATIVE;
    }

    /* renamed from: f */
    public File mo5546f() {
        return null;
    }

    public void remove() {
        File[] b = mo5542b();
        int length = b.length;
        int i = 0;
        while (true) {
            String str = "CrashlyticsCore";
            if (i < length) {
                File file = b[i];
                C4795l f = C4781c.m19229f();
                StringBuilder sb = new StringBuilder();
                sb.append("Removing native report file at ");
                sb.append(file.getPath());
                f.mo13796e(str, sb.toString());
                file.delete();
                i++;
            } else {
                C4795l f2 = C4781c.m19229f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Removing native report directory at ");
                sb2.append(this.f4466a);
                f2.mo13796e(str, sb2.toString());
                this.f4466a.delete();
                return;
            }
        }
    }
}
