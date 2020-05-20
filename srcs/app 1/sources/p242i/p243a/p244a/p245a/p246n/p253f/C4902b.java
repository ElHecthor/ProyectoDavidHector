package p242i.p243a.p244a.p245a.p246n.p253f;

import android.content.Context;
import java.io.File;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;

/* renamed from: i.a.a.a.n.f.b */
public class C4902b implements C4901a {

    /* renamed from: a */
    private final Context f12750a;

    public C4902b(C4792i iVar) {
        if (iVar.mo13833i() != null) {
            this.f12750a = iVar.mo13833i();
            iVar.mo13837o();
            StringBuilder sb = new StringBuilder();
            sb.append("Android/");
            sb.append(this.f12750a.getPackageName());
            sb.toString();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    /* renamed from: a */
    public File mo14050a() {
        return mo14051a(this.f12750a.getFilesDir());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo14051a(File file) {
        String str = "Fabric";
        if (file == null) {
            C4781c.m19229f().mo13796e(str, "Null File");
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            C4781c.m19229f().mo13787a(str, "Couldn't create file");
        }
        return null;
    }
}
