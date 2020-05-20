package com.facebook.p034f0.p039t;

import android.util.Log;
import com.facebook.internal.C1698v;
import com.facebook.p034f0.C1533c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.f0.t.a */
public final class C1625a {

    /* renamed from: a */
    private static boolean f5012a = false;

    /* renamed from: b */
    private static final String f5013b = "com.facebook.f0.t.a";

    /* renamed from: c */
    private static List<C1626a> f5014c = new ArrayList();

    /* renamed from: d */
    private static Set<String> f5015d = new HashSet();

    /* renamed from: com.facebook.f0.t.a$a */
    static class C1626a {

        /* renamed from: a */
        String f5016a;

        /* renamed from: b */
        Map<String, String> f5017b;

        C1626a(String str, Map<String, String> map) {
            this.f5016a = str;
            this.f5017b = map;
        }
    }

    /* renamed from: a */
    private static String m7147a(String str, String str2) {
        try {
            Iterator it = new ArrayList(f5014c).iterator();
            while (it.hasNext()) {
                C1626a aVar = (C1626a) it.next();
                if (aVar != null) {
                    if (str.equals(aVar.f5016a)) {
                        for (String str3 : aVar.f5017b.keySet()) {
                            if (str2.equals(str3)) {
                                return (String) aVar.f5017b.get(str3);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            Log.w(f5013b, "getMatchedRuleType failed", e);
        }
        return null;
    }

    /* renamed from: a */
    public static void m7148a() {
        f5012a = true;
    }

    /* renamed from: a */
    public static void m7149a(List<C1533c> list) {
        if (f5012a) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (m7151a(((C1533c) it.next()).mo5742c())) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m7150a(Map<String, String> map, String str) {
        if (f5012a) {
            HashMap hashMap = new HashMap();
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String a = m7147a(str, str2);
                if (a != null) {
                    hashMap.put(str2, a);
                    map.remove(str2);
                }
            }
            if (hashMap.size() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Entry entry : hashMap.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    map.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException e) {
                    Log.w(f5013b, "processParameters failed", e);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m7151a(String str) {
        return f5015d.contains(str);
    }

    /* renamed from: b */
    public static synchronized void m7152b(String str) {
        String str2;
        String str3;
        synchronized (C1625a.class) {
            if (f5012a) {
                try {
                    if (!str.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(str);
                        f5014c.clear();
                        f5015d.clear();
                        Iterator keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String str4 = (String) keys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(str4);
                            if (jSONObject2 != null) {
                                if (jSONObject2.optBoolean("is_deprecated_event")) {
                                    f5015d.add(str4);
                                } else {
                                    JSONObject optJSONObject = jSONObject.getJSONObject(str4).optJSONObject("restrictive_param");
                                    if (optJSONObject != null) {
                                        f5014c.add(new C1626a(str4, C1698v.m7371a(optJSONObject)));
                                    }
                                }
                            }
                        }
                    }
                } catch (JSONException e) {
                    e = e;
                    str2 = f5013b;
                    str3 = "updateRulesFromSetting failed";
                    Log.w(str2, str3, e);
                } catch (Exception e2) {
                    e = e2;
                    str2 = f5013b;
                    str3 = "updateFromSetting failed";
                    Log.w(str2, str3, e);
                }
            }
        }
    }
}
