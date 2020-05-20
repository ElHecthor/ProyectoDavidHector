package p242i.p243a.p244a.p245a.p246n.p254g;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.json.JSONObject;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p253f.C4902b;

/* renamed from: i.a.a.a.n.g.i */
class C4913i implements C4911g {

    /* renamed from: a */
    private final C4792i f12780a;

    public C4913i(C4792i iVar) {
        this.f12780a = iVar;
    }

    /* renamed from: a */
    public JSONObject mo14058a() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        String str = "Error while closing settings cache file.";
        String str2 = "Fabric";
        C4781c.m19229f().mo13796e(str2, "Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(new C4902b(this.f12780a).mo14050a(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(C4813i.m19374b((InputStream) fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        C4781c.m19229f().mo13793c(str2, "Failed to fetch cached settings", e);
                        C4813i.m19366a((Closeable) fileInputStream, str);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        C4813i.m19366a((Closeable) fileInputStream, str);
                        throw th;
                    }
                }
            } else {
                C4781c.m19229f().mo13796e(str2, "No cached settings found.");
                jSONObject = null;
            }
            C4813i.m19366a((Closeable) fileInputStream2, str);
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C4781c.m19229f().mo13793c(str2, "Failed to fetch cached settings", e);
            C4813i.m19366a((Closeable) fileInputStream, str);
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            C4813i.m19366a((Closeable) fileInputStream, str);
            throw th;
        }
    }

    /* renamed from: a */
    public void mo14059a(long j, JSONObject jSONObject) {
        String str = "Failed to close settings writer.";
        String str2 = "Fabric";
        C4781c.m19229f().mo13796e(str2, "Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(new File(new C4902b(this.f12780a).mo14050a(), "com.crashlytics.settings.json"));
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C4813i.m19366a((Closeable) fileWriter2, str);
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        C4781c.m19229f().mo13793c(str2, "Failed to cache settings", e);
                        C4813i.m19366a((Closeable) fileWriter, str);
                    } catch (Throwable th) {
                        th = th;
                        C4813i.m19366a((Closeable) fileWriter, str);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    C4813i.m19366a((Closeable) fileWriter, str);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C4781c.m19229f().mo13793c(str2, "Failed to cache settings", e);
                C4813i.m19366a((Closeable) fileWriter, str);
            }
        }
    }
}
