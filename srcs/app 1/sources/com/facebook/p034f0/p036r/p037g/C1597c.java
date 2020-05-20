package com.facebook.p034f0.p036r.p037g;

import org.json.JSONObject;

/* renamed from: com.facebook.f0.r.g.c */
public final class C1597c {

    /* renamed from: a */
    public final String f4945a;

    /* renamed from: b */
    public final int f4946b;

    /* renamed from: c */
    public final int f4947c;

    /* renamed from: d */
    public final String f4948d;

    /* renamed from: e */
    public final String f4949e;

    /* renamed from: f */
    public final String f4950f;

    /* renamed from: g */
    public final String f4951g;

    /* renamed from: h */
    public final int f4952h;

    /* renamed from: com.facebook.f0.r.g.c$a */
    public enum C1598a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        

        /* renamed from: f */
        private final int f4959f;

        private C1598a(int i) {
            this.f4959f = i;
        }

        /* renamed from: f */
        public int mo5826f() {
            return this.f4959f;
        }
    }

    C1597c(JSONObject jSONObject) {
        this.f4945a = jSONObject.getString("class_name");
        this.f4946b = jSONObject.optInt("index", -1);
        this.f4947c = jSONObject.optInt("id");
        this.f4948d = jSONObject.optString("text");
        this.f4949e = jSONObject.optString("tag");
        this.f4950f = jSONObject.optString("description");
        this.f4951g = jSONObject.optString("hint");
        this.f4952h = jSONObject.optInt("match_bitmask");
    }
}
