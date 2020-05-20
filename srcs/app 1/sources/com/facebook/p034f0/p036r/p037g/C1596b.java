package com.facebook.p034f0.p036r.p037g;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.f0.r.g.b */
public final class C1596b {

    /* renamed from: a */
    public final String f4941a;

    /* renamed from: b */
    public final String f4942b;

    /* renamed from: c */
    public final List<C1597c> f4943c;

    /* renamed from: d */
    public final String f4944d;

    public C1596b(JSONObject jSONObject) {
        this.f4941a = jSONObject.getString("name");
        this.f4942b = jSONObject.optString("value");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new C1597c(optJSONArray.getJSONObject(i)));
            }
        }
        this.f4943c = arrayList;
        this.f4944d = jSONObject.optString("path_type", "absolute");
    }
}
