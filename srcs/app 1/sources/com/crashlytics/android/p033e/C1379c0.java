package com.crashlytics.android.p033e;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONObject;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;

/* renamed from: com.crashlytics.android.e.c0 */
class C1379c0 {

    /* renamed from: b */
    private static final Charset f4445b = Charset.forName("UTF-8");

    /* renamed from: a */
    private final File f4446a;

    public C1379c0(File file) {
        this.f4446a = file;
    }

    /* renamed from: a */
    private static String m6370a(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: a */
    private static String m6371a(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, null);
        }
        return null;
    }

    /* renamed from: d */
    private static C1491x0 m6372d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new C1491x0(m6371a(jSONObject, "userId"), m6371a(jSONObject, "userName"), m6371a(jSONObject, "userEmail"));
    }

    /* renamed from: a */
    public File mo5500a(String str) {
        File file = this.f4446a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("keys");
        sb.append(".meta");
        return new File(file, sb.toString());
    }

    /* renamed from: a */
    public void mo5501a(String str, Map<String, String> map) {
        String str2 = "Failed to close key/value metadata file.";
        File a = mo5500a(str);
        BufferedWriter bufferedWriter = null;
        try {
            String a2 = m6370a(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a), f4445b));
            try {
                bufferedWriter2.write(a2);
                bufferedWriter2.flush();
                C4813i.m19366a((Closeable) bufferedWriter2, str2);
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C4781c.m19229f().mo13793c("CrashlyticsCore", "Error serializing key/value metadata.", e);
                    C4813i.m19366a((Closeable) bufferedWriter, str2);
                } catch (Throwable th) {
                    th = th;
                    C4813i.m19366a((Closeable) bufferedWriter, str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C4813i.m19366a((Closeable) bufferedWriter, str2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C4781c.m19229f().mo13793c("CrashlyticsCore", "Error serializing key/value metadata.", e);
            C4813i.m19366a((Closeable) bufferedWriter, str2);
        }
    }

    /* renamed from: b */
    public File mo5502b(String str) {
        File file = this.f4446a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("user");
        sb.append(".meta");
        return new File(file, sb.toString());
    }

    /* renamed from: c */
    public C1491x0 mo5503c(String str) {
        String str2 = "Failed to close user metadata file.";
        File b = mo5502b(str);
        if (!b.exists()) {
            return C1491x0.f4667d;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(b);
            try {
                C1491x0 d = m6372d(C4813i.m19374b((InputStream) fileInputStream2));
                C4813i.m19366a((Closeable) fileInputStream2, str2);
                return d;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    C4781c.m19229f().mo13793c("CrashlyticsCore", "Error deserializing user metadata.", e);
                    C4813i.m19366a((Closeable) fileInputStream, str2);
                    return C1491x0.f4667d;
                } catch (Throwable th) {
                    th = th;
                    C4813i.m19366a((Closeable) fileInputStream, str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C4813i.m19366a((Closeable) fileInputStream, str2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C4781c.m19229f().mo13793c("CrashlyticsCore", "Error deserializing user metadata.", e);
            C4813i.m19366a((Closeable) fileInputStream, str2);
            return C1491x0.f4667d;
        }
    }
}
