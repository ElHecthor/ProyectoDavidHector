package com.crashlytics.android.p033e;

import com.crashlytics.android.p033e.C1462o0.C1463a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: com.crashlytics.android.e.s0 */
class C1478s0 implements C1462o0 {

    /* renamed from: a */
    private final File f4644a;

    /* renamed from: b */
    private final File[] f4645b;

    /* renamed from: c */
    private final Map<String, String> f4646c;

    public C1478s0(File file) {
        this(file, Collections.emptyMap());
    }

    public C1478s0(File file, Map<String, String> map) {
        this.f4644a = file;
        this.f4645b = new File[]{file};
        this.f4646c = new HashMap(map);
        if (this.f4644a.length() == 0) {
            this.f4646c.putAll(C1465p0.f4619g);
        }
    }

    /* renamed from: a */
    public Map<String, String> mo5541a() {
        return Collections.unmodifiableMap(this.f4646c);
    }

    /* renamed from: b */
    public File[] mo5542b() {
        return this.f4645b;
    }

    /* renamed from: c */
    public String mo5543c() {
        return mo5546f().getName();
    }

    /* renamed from: d */
    public String mo5544d() {
        String c = mo5543c();
        return c.substring(0, c.lastIndexOf(46));
    }

    /* renamed from: e */
    public C1463a mo5545e() {
        return C1463a.JAVA;
    }

    /* renamed from: f */
    public File mo5546f() {
        return this.f4644a;
    }

    public void remove() {
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("Removing report at ");
        sb.append(this.f4644a.getPath());
        f.mo13796e("CrashlyticsCore", sb.toString());
        this.f4644a.delete();
    }
}
