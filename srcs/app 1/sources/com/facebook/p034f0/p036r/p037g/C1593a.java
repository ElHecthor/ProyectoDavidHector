package com.facebook.p034f0.p036r.p037g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.f0.r.g.a */
public class C1593a {

    /* renamed from: a */
    private final String f4930a;

    /* renamed from: b */
    private final List<C1597c> f4931b;

    /* renamed from: c */
    private final List<C1596b> f4932c;

    /* renamed from: d */
    private final String f4933d;

    /* renamed from: com.facebook.f0.r.g.a$a */
    public enum C1594a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* renamed from: com.facebook.f0.r.g.a$b */
    public enum C1595b {
        MANUAL,
        INFERENCE
    }

    public C1593a(String str, C1595b bVar, C1594a aVar, String str2, List<C1597c> list, List<C1596b> list2, String str3, String str4, String str5) {
        this.f4930a = str;
        this.f4931b = list;
        this.f4932c = list2;
        this.f4933d = str5;
    }

    /* renamed from: a */
    public static C1593a m7032a(JSONObject jSONObject) {
        String string = jSONObject.getString("event_name");
        C1595b valueOf = C1595b.valueOf(jSONObject.getString("method").toUpperCase(Locale.ENGLISH));
        C1594a valueOf2 = C1594a.valueOf(jSONObject.getString("event_type").toUpperCase(Locale.ENGLISH));
        String string2 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C1597c(jSONArray.getJSONObject(i)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList2.add(new C1596b(optJSONArray.getJSONObject(i2)));
            }
        }
        C1593a aVar = new C1593a(string, valueOf, valueOf2, string2, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010 A[Catch:{ IllegalArgumentException | JSONException -> 0x001e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.facebook.p034f0.p036r.p037g.C1593a> m7033a(org.json.JSONArray r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r4 == 0) goto L_0x000d
            int r2 = r4.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            if (r1 >= r2) goto L_0x001e
            org.json.JSONObject r3 = r4.getJSONObject(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            com.facebook.f0.r.g.a r3 = m7032a(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            r0.add(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            int r1 = r1 + 1
            goto L_0x000e
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p034f0.p036r.p037g.C1593a.m7033a(org.json.JSONArray):java.util.List");
    }

    /* renamed from: a */
    public String mo5822a() {
        return this.f4933d;
    }

    /* renamed from: b */
    public String mo5823b() {
        return this.f4930a;
    }

    /* renamed from: c */
    public List<C1596b> mo5824c() {
        return Collections.unmodifiableList(this.f4932c);
    }

    /* renamed from: d */
    public List<C1597c> mo5825d() {
        return Collections.unmodifiableList(this.f4931b);
    }
}
