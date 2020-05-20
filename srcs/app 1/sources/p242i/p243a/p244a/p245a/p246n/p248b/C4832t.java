package p242i.p243a.p244a.p245a.p246n.p248b;

import android.content.Context;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.p246n.p247a.C4798b;
import p242i.p243a.p244a.p245a.p246n.p247a.C4800d;

/* renamed from: i.a.a.a.n.b.t */
public class C4832t {

    /* renamed from: a */
    private final C4800d<String> f12624a = new C4833a(this);

    /* renamed from: b */
    private final C4798b<String> f12625b = new C4798b<>();

    /* renamed from: i.a.a.a.n.b.t$a */
    class C4833a implements C4800d<String> {
        C4833a(C4832t tVar) {
        }

        /* renamed from: a */
        public String m19442a(Context context) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    }

    /* renamed from: a */
    public String mo13902a(Context context) {
        String str = null;
        try {
            String str2 = (String) this.f12625b.mo13846a(context, this.f12624a);
            if (!"".equals(str2)) {
                str = str2;
            }
            return str;
        } catch (Exception e) {
            C4781c.m19229f().mo13793c("Fabric", "Failed to determine installer package name", e);
            return null;
        }
    }
}
