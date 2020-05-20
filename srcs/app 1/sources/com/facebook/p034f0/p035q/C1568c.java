package com.facebook.p034f0.p035q;

import com.facebook.p034f0.C1563p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.f0.q.c */
final class C1568c {

    /* renamed from: d */
    private static List<C1568c> f4863d = new ArrayList();

    /* renamed from: a */
    private String f4864a;

    /* renamed from: b */
    private List<String> f4865b;

    /* renamed from: c */
    private String f4866c;

    private C1568c(String str, List<String> list, String str2) {
        this.f4864a = str;
        this.f4865b = list;
        this.f4866c = str2;
    }

    /* renamed from: a */
    static void m6959a(String str) {
        try {
            f4863d.clear();
            m6960a(new JSONObject(str));
            Map e = C1563p.m6946e();
            if (!e.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (C1568c b : f4863d) {
                    hashSet.add(b.mo5789b());
                }
                ArrayList arrayList = new ArrayList();
                for (String str2 : e.keySet()) {
                    if (!hashSet.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    C1563p.m6940a((List<String>) arrayList);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private static void m6960a(JSONObject jSONObject) {
        String str = "v";
        String str2 = "k";
        try {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                if (jSONObject.get(str3) instanceof JSONObject) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str3);
                    if (jSONObject2.has(str2) && jSONObject2.has(str) && !jSONObject2.getString(str2).isEmpty()) {
                        if (!jSONObject2.getString(str).isEmpty()) {
                            f4863d.add(new C1568c(str3, Arrays.asList(jSONObject2.getString(str2).split(",")), jSONObject2.getString(str)));
                        }
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: d */
    static List<C1568c> m6961d() {
        return new ArrayList(f4863d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<String> mo5788a() {
        return new ArrayList(this.f4865b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo5789b() {
        return this.f4864a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo5790c() {
        return this.f4866c;
    }
}
