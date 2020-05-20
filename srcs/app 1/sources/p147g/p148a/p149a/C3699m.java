package p147g.p148a.p149a;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g.a.a.m */
public class C3699m {

    /* renamed from: b */
    private static final String f10482b = "g.a.a.m";

    /* renamed from: c */
    private static String[] f10483c = {"city", "country", "dma", "ip_address", "lat_lng", "region"};

    /* renamed from: a */
    Set<String> f10484a = new HashSet();

    /* renamed from: a */
    static C3699m m15117a(C3699m mVar) {
        C3699m mVar2 = new C3699m();
        for (String a : mVar.f10484a) {
            mVar2.m15118a(a);
        }
        return mVar2;
    }

    /* renamed from: a */
    private void m15118a(String str) {
        this.f10484a.add(str);
    }

    /* renamed from: b */
    private boolean m15119b(String str) {
        return !this.f10484a.contains(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject mo11761a() {
        String[] strArr;
        JSONObject jSONObject = new JSONObject();
        if (this.f10484a.isEmpty()) {
            return jSONObject;
        }
        for (String str : f10483c) {
            if (this.f10484a.contains(str)) {
                try {
                    jSONObject.put(str, false);
                } catch (JSONException e) {
                    C3690f.m15021a().mo11713b(f10482b, e.toString());
                }
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo11762b() {
        return m15119b("adid");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo11763c() {
        return m15119b("api_level");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo11764d() {
        return m15119b("carrier");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo11765e() {
        return m15119b("country");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3699m.class == obj.getClass()) {
            return ((C3699m) obj).f10484a.equals(this.f10484a);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo11767f() {
        return m15119b("device_brand");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo11768g() {
        return m15119b("device_manufacturer");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo11769h() {
        return m15119b("device_model");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo11770i() {
        return m15119b("language");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo11771j() {
        return m15119b("lat_lng");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo11772k() {
        return m15119b("os_name");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo11773l() {
        return m15119b("os_version");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo11774m() {
        return m15119b("platform");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo11775n() {
        return m15119b("version_name");
    }
}
