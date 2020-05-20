package com.crashlytics.android.p033e;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: com.crashlytics.android.e.c */
class C1377c {

    /* renamed from: a */
    private final Context f4443a;

    /* renamed from: b */
    private final C1378a f4444b;

    /* renamed from: com.crashlytics.android.e.c$a */
    interface C1378a {
        /* renamed from: a */
        String mo5499a(File file);
    }

    C1377c(Context context, C1378a aVar) {
        this.f4443a = context;
        this.f4444b = aVar;
    }

    /* renamed from: a */
    private File m6358a(File file) {
        if (VERSION.SDK_INT < 9) {
            return file;
        }
        if (file.getAbsolutePath().startsWith("/data")) {
            try {
                file = new File(this.f4443a.getPackageManager().getApplicationInfo(this.f4443a.getPackageName(), 0).nativeLibraryDir, file.getName());
            } catch (NameNotFoundException e) {
                C4781c.m19229f().mo13793c("CrashlyticsCore", "Error getting ApplicationInfo", e);
            }
        }
        return file;
    }

    /* renamed from: a */
    private static JSONObject m6359a(String str, C1447k0 k0Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", k0Var.f4581a);
        jSONObject.put("size", k0Var.f4582b);
        jSONObject.put("name", k0Var.f4584d);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    /* renamed from: a */
    private static boolean m6360a(C1447k0 k0Var) {
        return (k0Var.f4583c.indexOf(120) == -1 || k0Var.f4584d.indexOf(47) == -1) ? false : true;
    }

    /* renamed from: a */
    private static byte[] m6361a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes();
        } catch (JSONException e) {
            C4781c.m19229f().mo13791b("CrashlyticsCore", "Binary images string is null", e);
            return new byte[0];
        }
    }

    /* renamed from: b */
    private File m6362b(String str) {
        File file = new File(str);
        return !file.exists() ? m6358a(file) : file;
    }

    /* renamed from: b */
    private static String m6363b(JSONArray jSONArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            sb.append(jSONArray.getString(i));
        }
        return sb.toString();
    }

    /* renamed from: b */
    private JSONArray m6364b(BufferedReader bufferedReader) {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject c = m6365c(readLine);
            if (c != null) {
                jSONArray.put(c);
            }
        }
    }

    /* renamed from: c */
    private JSONObject m6365c(String str) {
        String str2 = "CrashlyticsCore";
        C1447k0 a = C1454l0.m6619a(str);
        if (a != null && m6360a(a)) {
            try {
                try {
                    return m6359a(this.f4444b.mo5499a(m6362b(a.f4584d)), a);
                } catch (JSONException e) {
                    C4781c.m19229f().mo13788a(str2, "Could not create a binary image json string", (Throwable) e);
                    return null;
                }
            } catch (IOException e2) {
                C4795l f = C4781c.m19229f();
                StringBuilder sb = new StringBuilder();
                sb.append("Could not generate ID for file ");
                sb.append(a.f4584d);
                f.mo13788a(str2, sb.toString(), (Throwable) e2);
            }
        }
        return null;
    }

    /* renamed from: d */
    private JSONArray m6366d(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            String[] split = m6363b(new JSONObject(str).getJSONArray("maps")).split("\\|");
            for (String c : split) {
                JSONObject c2 = m6365c(c);
                if (c2 != null) {
                    jSONArray.put(c2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            C4781c.m19229f().mo13791b("CrashlyticsCore", "Unable to parse proc maps string", e);
            return jSONArray;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte[] mo5497a(BufferedReader bufferedReader) {
        return m6361a(m6364b(bufferedReader));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte[] mo5498a(String str) {
        return m6361a(m6366d(str));
    }
}
