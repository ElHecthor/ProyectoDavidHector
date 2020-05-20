package com.facebook.internal.p042y;

import com.facebook.C1499a;
import com.facebook.C1787m;
import com.facebook.C1797q;
import com.facebook.C1797q.C1802e;
import com.facebook.internal.C1698v;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.y.b */
public final class C1717b {

    /* renamed from: com.facebook.internal.y.b$a */
    static class C1718a implements FilenameFilter {
        C1718a() {
        }

        public boolean accept(File file, String str) {
            return str.matches(String.format("^%s[0-9]+.json$", new Object[]{"crash_log_"}));
        }
    }

    /* renamed from: a */
    public static File m7473a() {
        File file = new File(C1787m.m7744e().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: a */
    public static String m7474a(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : th.getCause().toString();
    }

    /* renamed from: a */
    public static JSONObject m7475a(String str, boolean z) {
        File a = m7473a();
        if (!(a == null || str == null)) {
            try {
                return new JSONObject(C1698v.m7360a((InputStream) new FileInputStream(new File(a, str))));
            } catch (Exception unused) {
                if (z) {
                    m7478a(str);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m7476a(String str, String str2) {
        File a = m7473a();
        if (a != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(a, str));
                fileOutputStream.write(str2.getBytes());
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m7477a(String str, JSONArray jSONArray, C1802e eVar) {
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                C1797q.m7765a((C1499a) null, String.format("%s/instruments", new Object[]{C1787m.m7745f()}), jSONObject, eVar).mo6175b();
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m7478a(String str) {
        File a = m7473a();
        if (a == null || str == null) {
            return false;
        }
        return new File(a, str).delete();
    }

    /* renamed from: b */
    public static String m7479b(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    /* renamed from: b */
    public static File[] m7480b() {
        File a = m7473a();
        if (a == null) {
            return new File[0];
        }
        File[] listFiles = a.listFiles(new C1718a());
        if (listFiles == null) {
            listFiles = new File[0];
        }
        return listFiles;
    }

    /* renamed from: c */
    public static boolean m7481c(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            for (StackTraceElement className : th.getStackTrace()) {
                if (className.getClassName().startsWith("com.facebook")) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }
}
