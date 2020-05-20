package p242i.p243a.p244a.p245a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import p242i.p243a.p244a.p245a.p246n.p248b.C4811g;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4820l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4821m;
import p242i.p243a.p244a.p245a.p246n.p252e.C4885b;
import p242i.p243a.p244a.p245a.p246n.p252e.C4896e;
import p242i.p243a.p244a.p245a.p246n.p254g.C4908d;
import p242i.p243a.p244a.p245a.p246n.p254g.C4909e;
import p242i.p243a.p244a.p245a.p246n.p254g.C4912h;
import p242i.p243a.p244a.p245a.p246n.p254g.C4918n;
import p242i.p243a.p244a.p245a.p246n.p254g.C4921q;
import p242i.p243a.p244a.p245a.p246n.p254g.C4926t;
import p242i.p243a.p244a.p245a.p246n.p254g.C4931y;

/* renamed from: i.a.a.a.m */
class C4796m extends C4792i<Boolean> {

    /* renamed from: l */
    private final C4896e f12531l = new C4885b();

    /* renamed from: m */
    private PackageManager f12532m;

    /* renamed from: n */
    private String f12533n;

    /* renamed from: o */
    private PackageInfo f12534o;

    /* renamed from: p */
    private String f12535p;

    /* renamed from: q */
    private String f12536q;

    /* renamed from: r */
    private String f12537r;

    /* renamed from: s */
    private String f12538s;

    /* renamed from: t */
    private String f12539t;

    /* renamed from: u */
    private final Future<Map<String, C4794k>> f12540u;

    /* renamed from: v */
    private final Collection<C4792i> f12541v;

    public C4796m(Future<Map<String, C4794k>> future, Collection<C4792i> collection) {
        this.f12540u = future;
        this.f12541v = collection;
    }

    /* renamed from: a */
    private C4908d m19295a(C4918n nVar, Collection<C4794k> collection) {
        Context i = mo13833i();
        C4908d dVar = new C4908d(new C4811g().mo13870d(i), mo13836m().mo13892c(), this.f12536q, this.f12535p, C4813i.m19362a(C4813i.m19392n(i)), this.f12538s, C4821m.m19402a(this.f12537r).mo13880f(), this.f12539t, "0", nVar, collection);
        return dVar;
    }

    /* renamed from: a */
    private boolean m19296a(C4909e eVar, C4918n nVar, Collection<C4794k> collection) {
        return new C4931y(this, mo13844t(), eVar.f12776b, this.f12531l).mo14056a(m19295a(nVar, collection));
    }

    /* renamed from: a */
    private boolean m19297a(String str, C4909e eVar, Collection<C4794k> collection) {
        String str2 = "Fabric";
        if (!"new".equals(eVar.f12775a)) {
            if (!"configured".equals(eVar.f12775a)) {
                if (eVar.f12779e) {
                    C4781c.m19229f().mo13796e(str2, "Server says an update is required - forcing a full App update.");
                    m19299c(str, eVar, collection);
                }
                return true;
            }
        } else if (!m19298b(str, eVar, collection)) {
            C4781c.m19229f().mo13793c(str2, "Failed to create app with Crashlytics service.", null);
            return false;
        }
        return C4921q.m19715d().mo14073c();
    }

    /* renamed from: b */
    private boolean m19298b(String str, C4909e eVar, Collection<C4794k> collection) {
        return new C4912h(this, mo13844t(), eVar.f12776b, this.f12531l).mo14056a(m19295a(C4918n.m19713a(mo13833i(), str), collection));
    }

    /* renamed from: c */
    private boolean m19299c(String str, C4909e eVar, Collection<C4794k> collection) {
        return m19296a(eVar, C4918n.m19713a(mo13833i(), str), collection);
    }

    /* renamed from: u */
    private C4926t m19300u() {
        try {
            C4921q d = C4921q.m19715d();
            d.mo14070a(this, this.f12526j, this.f12531l, this.f12535p, this.f12536q, mo13844t(), C4820l.m19399a(mo13833i()));
            d.mo14072b();
            return C4921q.m19715d().mo14071a();
        } catch (Exception e) {
            C4781c.m19229f().mo13793c("Fabric", "Error dealing with settings", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<String, C4794k> mo13843a(Map<String, C4794k> map, Collection<C4792i> collection) {
        for (C4792i iVar : collection) {
            if (!map.containsKey(iVar.mo5401n())) {
                map.put(iVar.mo5401n(), new C4794k(iVar.mo5401n(), iVar.mo5402p(), "binary"));
            }
        }
        return map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Boolean m19303h() {
        boolean z;
        String c = C4813i.m19377c(mo13833i());
        C4926t u = m19300u();
        if (u != null) {
            try {
                Map hashMap = this.f12540u != null ? (Map) this.f12540u.get() : new HashMap();
                mo13843a(hashMap, this.f12541v);
                z = m19297a(c, u.f12815a, hashMap.values());
            } catch (Exception e) {
                C4781c.m19229f().mo13793c("Fabric", "Error performing auto configuration.", e);
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    /* renamed from: n */
    public String mo5401n() {
        return "io.fabric.sdk.android:fabric";
    }

    /* renamed from: p */
    public String mo5402p() {
        return "1.4.8.32";
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo5409s() {
        try {
            this.f12537r = mo13836m().mo13895f();
            this.f12532m = mo13833i().getPackageManager();
            String packageName = mo13833i().getPackageName();
            this.f12533n = packageName;
            PackageInfo packageInfo = this.f12532m.getPackageInfo(packageName, 0);
            this.f12534o = packageInfo;
            this.f12535p = Integer.toString(packageInfo.versionCode);
            this.f12536q = this.f12534o.versionName == null ? "0.0" : this.f12534o.versionName;
            this.f12538s = this.f12532m.getApplicationLabel(mo13833i().getApplicationInfo()).toString();
            this.f12539t = Integer.toString(mo13833i().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (NameNotFoundException e) {
            C4781c.m19229f().mo13793c("Fabric", "Failed init", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public String mo13844t() {
        return C4813i.m19373b(mo13833i(), "com.crashlytics.ApiEndpoint");
    }
}
