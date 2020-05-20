package p242i.p243a.p244a.p245a.p246n.p248b;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.p246n.p252e.C4887c;
import p242i.p243a.p244a.p245a.p246n.p252e.C4888d;
import p242i.p243a.p244a.p245a.p246n.p252e.C4896e;

/* renamed from: i.a.a.a.n.b.a */
public abstract class C4801a {

    /* renamed from: f */
    private static final Pattern f12544f = Pattern.compile("http(s?)://[^\\/]+", 2);

    /* renamed from: a */
    private final String f12545a;

    /* renamed from: b */
    private final C4896e f12546b;

    /* renamed from: c */
    private final C4887c f12547c;

    /* renamed from: d */
    private final String f12548d;

    /* renamed from: e */
    protected final C4792i f12549e;

    public C4801a(C4792i iVar, String str, String str2, C4896e eVar, C4887c cVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (eVar != null) {
            this.f12549e = iVar;
            this.f12548d = str;
            this.f12545a = m19316a(str2);
            this.f12546b = eVar;
            this.f12547c = cVar;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* renamed from: a */
    private String m19316a(String str) {
        return !C4813i.m19376b(this.f12548d) ? f12544f.matcher(str).replaceFirst(this.f12548d) : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4888d mo13849a() {
        return mo13850a(Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4888d mo13850a(Map<String, String> map) {
        C4888d a = this.f12546b.mo13997a(this.f12547c, mo13851b(), map);
        a.mo14011a(false);
        a.mo14000a(10000);
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Android SDK/");
        sb.append(this.f12549e.mo5402p());
        a.mo14018c("User-Agent", sb.toString());
        a.mo14018c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo13851b() {
        return this.f12545a;
    }
}
