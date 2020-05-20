package p242i.p243a.p244a.p245a.p246n.p254g;

import android.annotation.SuppressLint;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4819k;
import p242i.p243a.p244a.p245a.p246n.p248b.C4820l;
import p242i.p243a.p244a.p245a.p246n.p253f.C4903c;
import p242i.p243a.p244a.p245a.p246n.p253f.C4904d;

/* renamed from: i.a.a.a.n.g.j */
class C4914j implements C4925s {

    /* renamed from: a */
    private final C4929w f12781a;

    /* renamed from: b */
    private final C4928v f12782b;

    /* renamed from: c */
    private final C4819k f12783c;

    /* renamed from: d */
    private final C4911g f12784d;

    /* renamed from: e */
    private final C4930x f12785e;

    /* renamed from: f */
    private final C4792i f12786f;

    /* renamed from: g */
    private final C4903c f12787g;

    /* renamed from: h */
    private final C4820l f12788h;

    public C4914j(C4792i iVar, C4929w wVar, C4819k kVar, C4928v vVar, C4911g gVar, C4930x xVar, C4820l lVar) {
        this.f12786f = iVar;
        this.f12781a = wVar;
        this.f12783c = kVar;
        this.f12782b = vVar;
        this.f12784d = gVar;
        this.f12785e = xVar;
        this.f12788h = lVar;
        this.f12787g = new C4904d(iVar);
    }

    /* renamed from: a */
    private void m19689a(JSONObject jSONObject, String str) {
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(jSONObject.toString());
        f.mo13796e("Fabric", sb.toString());
    }

    /* renamed from: b */
    private C4926t m19690b(C4924r rVar) {
        C4795l f;
        String str;
        String str2 = "Fabric";
        C4926t tVar = null;
        try {
            if (C4924r.SKIP_CACHE_LOOKUP.equals(rVar)) {
                return null;
            }
            JSONObject a = this.f12784d.mo14058a();
            if (a != null) {
                C4926t a2 = this.f12782b.mo14066a(this.f12783c, a);
                if (a2 != null) {
                    m19689a(a, "Loaded cached settings: ");
                    long a3 = this.f12783c.mo13877a();
                    if (!C4924r.IGNORE_CACHE_EXPIRATION.equals(rVar)) {
                        if (a2.mo14074a(a3)) {
                            f = C4781c.m19229f();
                            str = "Cached settings have expired.";
                        }
                    }
                    try {
                        C4781c.m19229f().mo13796e(str2, "Returning cached settings.");
                        return a2;
                    } catch (Exception e) {
                        e = e;
                        tVar = a2;
                        C4781c.m19229f().mo13793c(str2, "Failed to get cached settings", e);
                        return tVar;
                    }
                } else {
                    C4781c.m19229f().mo13793c(str2, "Failed to transform cached settings data.", null);
                    return null;
                }
            } else {
                f = C4781c.m19229f();
                str = "No cached settings data found.";
            }
            f.mo13796e(str2, str);
            return null;
        } catch (Exception e2) {
            e = e2;
            C4781c.m19229f().mo13793c(str2, "Failed to get cached settings", e);
            return tVar;
        }
    }

    /* renamed from: a */
    public C4926t mo14060a() {
        return mo14061a(C4924r.USE_CACHE);
    }

    /* renamed from: a */
    public C4926t mo14061a(C4924r rVar) {
        String str = "Fabric";
        C4926t tVar = null;
        if (!this.f12788h.mo13878a()) {
            C4781c.m19229f().mo13796e(str, "Not fetching settings, because data collection is disabled by Firebase.");
            return null;
        }
        try {
            if (!C4781c.m19231h() && !mo14063b()) {
                tVar = m19690b(rVar);
            }
            if (tVar == null) {
                JSONObject a = this.f12785e.mo14068a(this.f12781a);
                if (a != null) {
                    tVar = this.f12782b.mo14066a(this.f12783c, a);
                    this.f12784d.mo14059a(tVar.f12820f, a);
                    m19689a(a, "Loaded settings: ");
                    mo14062a(mo14064c());
                }
            }
            if (tVar == null) {
                tVar = m19690b(C4924r.IGNORE_CACHE_EXPIRATION);
            }
        } catch (Exception e) {
            C4781c.m19229f().mo13793c(str, "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e);
        }
        return tVar;
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public boolean mo14062a(String str) {
        Editor a = this.f12787g.mo14052a();
        a.putString("existing_instance_identifier", str);
        return this.f12787g.mo14053a(a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo14063b() {
        return !mo14065d().equals(mo14064c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo14064c() {
        return C4813i.m19362a(C4813i.m19392n(this.f12786f.mo13833i()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo14065d() {
        return this.f12787g.get().getString("existing_instance_identifier", "");
    }
}
