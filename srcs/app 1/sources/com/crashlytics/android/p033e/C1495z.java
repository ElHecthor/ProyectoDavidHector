package com.crashlytics.android.p033e;

import com.crashlytics.android.p033e.C1462o0.C1463a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: com.crashlytics.android.e.z */
class C1495z implements C1462o0 {

    /* renamed from: a */
    private final File[] f4672a;

    /* renamed from: b */
    private final Map<String, String> f4673b = new HashMap(C1465p0.f4619g);

    /* renamed from: c */
    private final String f4674c;

    public C1495z(String str, File[] fileArr) {
        this.f4672a = fileArr;
        this.f4674c = str;
    }

    /* renamed from: a */
    public Map<String, String> mo5541a() {
        return Collections.unmodifiableMap(this.f4673b);
    }

    /* renamed from: b */
    public File[] mo5542b() {
        return this.f4672a;
    }

    /* renamed from: c */
    public String mo5543c() {
        return this.f4672a[0].getName();
    }

    /* renamed from: d */
    public String mo5544d() {
        return this.f4674c;
    }

    /* renamed from: e */
    public C1463a mo5545e() {
        return C1463a.JAVA;
    }

    /* renamed from: f */
    public File mo5546f() {
        return this.f4672a[0];
    }

    public void remove() {
        File[] fileArr;
        for (File file : this.f4672a) {
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Removing invalid report file at ");
            sb.append(file.getPath());
            f.mo13796e("CrashlyticsCore", sb.toString());
            file.delete();
        }
    }
}
