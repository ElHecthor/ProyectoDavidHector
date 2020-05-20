package p242i.p243a.p244a.p245a.p246n.p254g;

import android.content.res.Resources.NotFoundException;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collection;
import java.util.Locale;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.C4794k;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4801a;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4839v;
import p242i.p243a.p244a.p245a.p246n.p252e.C4887c;
import p242i.p243a.p244a.p245a.p246n.p252e.C4888d;
import p242i.p243a.p244a.p245a.p246n.p252e.C4896e;

/* renamed from: i.a.a.a.n.g.a */
abstract class C4905a extends C4801a {
    public C4905a(C4792i iVar, String str, String str2, C4896e eVar, C4887c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    /* renamed from: a */
    private C4888d m19680a(C4888d dVar, C4908d dVar2) {
        dVar.mo14018c("X-CRASHLYTICS-API-KEY", dVar2.f12764a);
        dVar.mo14018c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        dVar.mo14018c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f12549e.mo5402p());
        return dVar;
    }

    /* renamed from: b */
    private C4888d m19681b(C4888d dVar, C4908d dVar2) {
        String str = "Failed to close app icon InputStream.";
        dVar.mo14025e("app[identifier]", dVar2.f12765b);
        dVar.mo14025e("app[name]", dVar2.f12769f);
        dVar.mo14025e("app[display_version]", dVar2.f12766c);
        dVar.mo14025e("app[build_version]", dVar2.f12767d);
        dVar.mo14003a("app[source]", (Number) Integer.valueOf(dVar2.f12770g));
        dVar.mo14025e("app[minimum_sdk_version]", dVar2.f12771h);
        dVar.mo14025e("app[built_sdk_version]", dVar2.f12772i);
        if (!C4813i.m19376b(dVar2.f12768e)) {
            dVar.mo14025e("app[instance_identifier]", dVar2.f12768e);
        }
        if (dVar2.f12773j != null) {
            InputStream inputStream = null;
            try {
                inputStream = this.f12549e.mo13833i().getResources().openRawResource(dVar2.f12773j.f12794b);
                dVar.mo14025e("app[icon][hash]", dVar2.f12773j.f12793a);
                dVar.mo14008a("app[icon][data]", "icon.png", "application/octet-stream", inputStream);
                dVar.mo14003a("app[icon][width]", (Number) Integer.valueOf(dVar2.f12773j.f12795c));
                dVar.mo14003a("app[icon][height]", (Number) Integer.valueOf(dVar2.f12773j.f12796d));
            } catch (NotFoundException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to find app icon with resource ID: ");
                sb.append(dVar2.f12773j.f12794b);
                C4781c.m19229f().mo13793c("Fabric", sb.toString(), e);
            } catch (Throwable th) {
                C4813i.m19366a((Closeable) inputStream, str);
                throw th;
            }
            C4813i.m19366a((Closeable) inputStream, str);
        }
        Collection<C4794k> collection = dVar2.f12774k;
        if (collection != null) {
            for (C4794k kVar : collection) {
                dVar.mo14025e(mo14057b(kVar), kVar.mo13842c());
                dVar.mo14025e(mo14055a(kVar), kVar.mo13840a());
            }
        }
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo14055a(C4794k kVar) {
        return String.format(Locale.US, "app[build][libraries][%s][type]", new Object[]{kVar.mo13841b()});
    }

    /* renamed from: a */
    public boolean mo14056a(C4908d dVar) {
        C4888d a = mo13849a();
        m19680a(a, dVar);
        m19681b(a, dVar);
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("Sending app info to ");
        sb.append(mo13851b());
        String str = "Fabric";
        f.mo13796e(str, sb.toString());
        if (dVar.f12773j != null) {
            C4795l f2 = C4781c.m19229f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("App icon hash is ");
            sb2.append(dVar.f12773j.f12793a);
            f2.mo13796e(str, sb2.toString());
            C4795l f3 = C4781c.m19229f();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("App icon size is ");
            sb3.append(dVar.f12773j.f12795c);
            sb3.append("x");
            sb3.append(dVar.f12773j.f12796d);
            f3.mo13796e(str, sb3.toString());
        }
        int g = a.mo14028g();
        String str2 = "POST".equals(a.mo14032k()) ? "Create" : "Update";
        C4795l f4 = C4781c.m19229f();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append(" app request ID: ");
        sb4.append(a.mo14020c("X-REQUEST-ID"));
        f4.mo13796e(str, sb4.toString());
        C4795l f5 = C4781c.m19229f();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Result was ");
        sb5.append(g);
        f5.mo13796e(str, sb5.toString());
        return C4839v.m19472a(g) == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo14057b(C4794k kVar) {
        return String.format(Locale.US, "app[build][libraries][%s][version]", new Object[]{kVar.mo13841b()});
    }
}
