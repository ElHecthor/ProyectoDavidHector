package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.s */
class C1695s {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, JSONObject> f5151a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static JSONObject m7345a(String str) {
        return (JSONObject) f5151a.get(str);
    }

    /* renamed from: a */
    public static void m7346a(String str, JSONObject jSONObject) {
        f5151a.put(str, jSONObject);
    }
}
