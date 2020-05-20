package com.facebook.p034f0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.C1787m;
import com.facebook.internal.C1698v;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.f0.p */
public class C1563p {

    /* renamed from: a */
    private static final String f4854a = "p";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static SharedPreferences f4855b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static AtomicBoolean f4856c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final ConcurrentHashMap<String, String> f4857d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static final ConcurrentHashMap<String, String> f4858e = new ConcurrentHashMap<>();

    /* renamed from: com.facebook.f0.p$a */
    static class C1564a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f4859f;

        /* renamed from: g */
        final /* synthetic */ String f4860g;

        C1564a(String str, String str2) {
            this.f4859f = str;
            this.f4860g = str2;
        }

        public void run() {
            if (!C1563p.f4856c.get()) {
                C1563p.m6947f();
            }
            C1563p.f4855b.edit().putString(this.f4859f, this.f4860g).apply();
        }
    }

    /* renamed from: a */
    private static String m6936a(String str, String str2) {
        String str3;
        String str4;
        String lowerCase = str2.trim().toLowerCase();
        String str5 = "";
        if ("em".equals(str)) {
            if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                return lowerCase;
            }
            str3 = f4854a;
            str4 = "Setting email failure: this is not a valid email address";
        } else if ("ph".equals(str)) {
            return lowerCase.replaceAll("[^0-9]", str5);
        } else {
            if (!"ge".equals(str)) {
                return lowerCase;
            }
            String substring = lowerCase.length() > 0 ? lowerCase.substring(0, 1) : str5;
            if ("f".equals(substring) || "m".equals(substring)) {
                return substring;
            }
            str3 = f4854a;
            str4 = "Setting gender failure: the supported value for gender is f or m";
        }
        Log.e(str3, str4);
        return str5;
    }

    /* renamed from: a */
    private static String m6937a(Map<String, String> map) {
        String str = "";
        if (map.isEmpty()) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : map.keySet()) {
                jSONObject.put(str2, map.get(str2));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    /* renamed from: a */
    private static Map<String, String> m6938a(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.getString(str2));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: a */
    public static void m6940a(List<String> list) {
        if (!f4856c.get()) {
            m6947f();
        }
        for (String str : list) {
            if (f4858e.containsKey(str)) {
                f4858e.remove(str);
            }
        }
        m6942b("com.facebook.appevents.UserDataStore.internalUserData", m6937a((Map<String, String>) f4858e));
    }

    /* renamed from: b */
    private static void m6942b(String str, String str2) {
        C1787m.m7751l().execute(new C1564a(str, str2));
    }

    /* renamed from: b */
    static void m6943b(Map<String, String> map) {
        if (!f4856c.get()) {
            m6947f();
        }
        for (Entry key : map.entrySet()) {
            String str = (String) key.getKey();
            String f = C1698v.m7409f(m6936a(str, ((String) map.get(str)).trim()));
            if (f4858e.containsKey(str)) {
                String str2 = (String) f4858e.get(str);
                String str3 = ",";
                String[] split = str2 != null ? str2.split(str3) : new String[0];
                HashSet hashSet = new HashSet(Arrays.asList(split));
                if (!hashSet.contains(f)) {
                    StringBuilder sb = new StringBuilder();
                    if (split.length != 0) {
                        if (split.length < 5) {
                            sb.append(str2);
                            sb.append(str3);
                        } else {
                            for (int i = 1; i < 5; i++) {
                                sb.append(split[i]);
                                sb.append(str3);
                            }
                            sb.append(f);
                            hashSet.remove(split[0]);
                            f4858e.put(str, sb.toString());
                        }
                    }
                    sb.append(f);
                    f4858e.put(str, sb.toString());
                } else {
                    return;
                }
            } else {
                f4858e.put(str, f);
            }
        }
        m6942b("com.facebook.appevents.UserDataStore.internalUserData", m6937a((Map<String, String>) f4858e));
    }

    /* renamed from: d */
    public static String m6945d() {
        if (!f4856c.get()) {
            m6947f();
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(f4857d);
        hashMap.putAll(f4858e);
        return m6937a((Map<String, String>) hashMap);
    }

    /* renamed from: e */
    public static Map<String, String> m6946e() {
        if (!f4856c.get()) {
            m6947f();
        }
        return new HashMap(f4858e);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static synchronized void m6947f() {
        synchronized (C1563p.class) {
            if (!f4856c.get()) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C1787m.m7744e());
                f4855b = defaultSharedPreferences;
                String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                String string2 = f4855b.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                f4857d.putAll(m6938a(string));
                f4858e.putAll(m6938a(string2));
                f4856c.set(true);
            }
        }
    }

    /* renamed from: g */
    static void m6948g() {
        if (!f4856c.get()) {
            m6947f();
        }
    }
}
