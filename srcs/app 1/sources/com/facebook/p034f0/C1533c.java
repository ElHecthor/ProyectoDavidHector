package com.facebook.p034f0;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.facebook.C1631i;
import com.facebook.C1845w;
import com.facebook.internal.C1682p;
import com.facebook.internal.C1698v;
import com.facebook.p034f0.p038s.C1609b;
import com.facebook.p034f0.p039t.C1625a;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.f0.c */
public class C1533c implements Serializable {

    /* renamed from: k */
    private static final HashSet<String> f4788k = new HashSet<>();
    private static final long serialVersionUID = 1;

    /* renamed from: f */
    private final JSONObject f4789f;

    /* renamed from: g */
    private final boolean f4790g;

    /* renamed from: h */
    private final boolean f4791h;

    /* renamed from: i */
    private final String f4792i;

    /* renamed from: j */
    private final String f4793j;

    /* renamed from: com.facebook.f0.c$b */
    static class C1535b implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: f */
        private final String f4794f;

        /* renamed from: g */
        private final boolean f4795g;

        /* renamed from: h */
        private final boolean f4796h;

        private Object readResolve() {
            C1533c cVar = new C1533c(this.f4794f, this.f4795g, this.f4796h, null);
            return cVar;
        }
    }

    /* renamed from: com.facebook.f0.c$c */
    static class C1536c implements Serializable {
        private static final long serialVersionUID = 20160803001L;

        /* renamed from: f */
        private final String f4797f;

        /* renamed from: g */
        private final boolean f4798g;

        /* renamed from: h */
        private final boolean f4799h;

        /* renamed from: i */
        private final String f4800i;

        private C1536c(String str, boolean z, boolean z2, String str2) {
            this.f4797f = str;
            this.f4798g = z;
            this.f4799h = z2;
            this.f4800i = str2;
        }

        private Object readResolve() {
            C1533c cVar = new C1533c(this.f4797f, this.f4798g, this.f4799h, this.f4800i);
            return cVar;
        }
    }

    public C1533c(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) {
        this.f4790g = z;
        this.f4791h = z2;
        this.f4792i = str2;
        this.f4789f = m6847a(str, str2, d, bundle, uuid);
        this.f4793j = m6849e();
    }

    private C1533c(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f4789f = jSONObject;
        this.f4790g = z;
        this.f4792i = jSONObject.optString("_eventName");
        this.f4793j = str2;
        this.f4791h = z2;
    }

    /* renamed from: a */
    private static String m6845a(String str) {
        String str2 = "Failed to generate checksum: ";
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            return C1609b.m7091a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C1698v.m7380a(str2, (Exception) e);
            return "0";
        } catch (UnsupportedEncodingException e2) {
            C1698v.m7380a(str2, (Exception) e2);
            return "1";
        }
    }

    /* renamed from: a */
    private Map<String, String> m6846a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            m6848b(str);
            Object obj = bundle.get(str);
            if ((obj instanceof String) || (obj instanceof Number)) {
                hashMap.put(str, obj.toString());
            } else {
                throw new C1631i(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, str}));
            }
        }
        C1625a.m7150a((Map<String, String>) hashMap, this.f4792i);
        return hashMap;
    }

    /* renamed from: a */
    private JSONObject m6847a(String str, String str2, Double d, Bundle bundle, UUID uuid) {
        m6848b(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_eventName", str2);
        jSONObject.put("_eventName_md5", m6845a(str2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map a = m6846a(bundle);
            for (String str3 : a.keySet()) {
                jSONObject.put(str3, a.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        String str4 = "1";
        if (this.f4791h) {
            jSONObject.put("_inBackground", str4);
        }
        if (this.f4790g) {
            jSONObject.put("_implicitlyLogged", str4);
        } else {
            C1682p.m7283a(C1845w.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static void m6848b(String str) {
        boolean contains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new C1631i(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, Integer.valueOf(40)}));
        }
        synchronized (f4788k) {
            contains = f4788k.contains(str);
        }
        if (contains) {
            return;
        }
        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (f4788k) {
                f4788k.add(str);
            }
            return;
        }
        throw new C1631i(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
    }

    /* renamed from: e */
    private String m6849e() {
        String sb;
        if (VERSION.SDK_INT > 19) {
            sb = this.f4789f.toString();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator keys = this.f4789f.keys();
            while (keys.hasNext()) {
                arrayList.add(keys.next());
            }
            Collections.sort(arrayList);
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                sb2.append(str);
                sb2.append(" = ");
                sb2.append(this.f4789f.optString(str));
                sb2.append(10);
            }
            sb = sb2.toString();
        }
        return m6845a(sb);
    }

    private Object writeReplace() {
        C1536c cVar = new C1536c(this.f4789f.toString(), this.f4790g, this.f4791h, this.f4793j);
        return cVar;
    }

    /* renamed from: a */
    public boolean mo5740a() {
        return this.f4790g;
    }

    /* renamed from: b */
    public JSONObject mo5741b() {
        return this.f4789f;
    }

    /* renamed from: c */
    public String mo5742c() {
        return this.f4792i;
    }

    /* renamed from: d */
    public boolean mo5743d() {
        if (this.f4793j == null) {
            return true;
        }
        return m6849e().equals(this.f4793j);
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", new Object[]{this.f4789f.optString("_eventName"), Boolean.valueOf(this.f4790g), this.f4789f.toString()});
    }
}
