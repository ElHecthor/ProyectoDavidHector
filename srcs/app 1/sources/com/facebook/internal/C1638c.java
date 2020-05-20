package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.c */
public class C1638c {

    /* renamed from: a */
    private static final Map<Class<?>, C1646h> f5038a;

    /* renamed from: com.facebook.internal.c$a */
    static class C1639a implements C1646h {
        C1639a() {
        }

        /* renamed from: a */
        public void mo5888a(Bundle bundle, String str, Object obj) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.facebook.internal.c$b */
    static class C1640b implements C1646h {
        C1640b() {
        }

        /* renamed from: a */
        public void mo5888a(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: com.facebook.internal.c$c */
    static class C1641c implements C1646h {
        C1641c() {
        }

        /* renamed from: a */
        public void mo5888a(Bundle bundle, String str, Object obj) {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: com.facebook.internal.c$d */
    static class C1642d implements C1646h {
        C1642d() {
        }

        /* renamed from: a */
        public void mo5888a(Bundle bundle, String str, Object obj) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* renamed from: com.facebook.internal.c$e */
    static class C1643e implements C1646h {
        C1643e() {
        }

        /* renamed from: a */
        public void mo5888a(Bundle bundle, String str, Object obj) {
            bundle.putString(str, (String) obj);
        }
    }

    /* renamed from: com.facebook.internal.c$f */
    static class C1644f implements C1646h {
        C1644f() {
        }

        /* renamed from: a */
        public void mo5888a(Bundle bundle, String str, Object obj) {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: com.facebook.internal.c$g */
    static class C1645g implements C1646h {
        C1645g() {
        }

        /* renamed from: a */
        public void mo5888a(Bundle bundle, String str, Object obj) {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int i = 0;
            while (i < jSONArray.length()) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    arrayList.add((String) obj2);
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected type in an array: ");
                    sb.append(obj2.getClass());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* renamed from: com.facebook.internal.c$h */
    public interface C1646h {
        /* renamed from: a */
        void mo5888a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        f5038a = hashMap;
        hashMap.put(Boolean.class, new C1639a());
        f5038a.put(Integer.class, new C1640b());
        f5038a.put(Long.class, new C1641c());
        f5038a.put(Double.class, new C1642d());
        f5038a.put(String.class, new C1643e());
        f5038a.put(String[].class, new C1644f());
        f5038a.put(JSONArray.class, new C1645g());
    }

    /* renamed from: a */
    public static Bundle m7184a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(str, m7184a((JSONObject) obj));
                } else {
                    C1646h hVar = (C1646h) f5038a.get(obj.getClass());
                    if (hVar != null) {
                        hVar.mo5888a(bundle, str, obj);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported type: ");
                        sb.append(obj.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return bundle;
    }
}
