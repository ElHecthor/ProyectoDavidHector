package com.facebook.share.p045a;

import com.facebook.share.p046b.C1831f;
import com.facebook.share.p046b.C1836h;
import com.facebook.share.p046b.C1840j;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.share.a.b */
public final class C1818b {

    /* renamed from: com.facebook.share.a.b$a */
    public interface C1819a {
        /* renamed from: a */
        JSONObject mo6248a(C1840j jVar);
    }

    /* renamed from: a */
    public static Object m7880a(Object obj, C1819a aVar) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof C1840j) {
            if (aVar != null) {
                return aVar.mo6248a((C1840j) obj);
            }
            return null;
        } else if (obj instanceof C1836h) {
            return m7883a((C1836h) obj, aVar);
        } else {
            if (obj instanceof List) {
                return m7881a((List) obj, aVar);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid object found for JSON serialization: ");
            sb.append(obj.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r2v0, types: [java.util.List, java.util.List<java.lang.Object>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONArray m7881a(java.util.List<java.lang.Object> r2, com.facebook.share.p045a.C1818b.C1819a r3) {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0009:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = m7880a(r1, r3)
            r0.put(r1)
            goto L_0x0009
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.p045a.C1818b.m7881a(java.util.List, com.facebook.share.a.b$a):org.json.JSONArray");
    }

    /* renamed from: a */
    public static JSONObject m7882a(C1831f fVar, C1819a aVar) {
        JSONObject jSONObject = new JSONObject();
        for (String str : fVar.mo6281b()) {
            jSONObject.put(str, m7880a(fVar.mo6279a(str), aVar));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m7883a(C1836h hVar, C1819a aVar) {
        JSONObject jSONObject = new JSONObject();
        for (String str : hVar.mo6281b()) {
            jSONObject.put(str, m7880a(hVar.mo6279a(str), aVar));
        }
        return jSONObject;
    }
}
