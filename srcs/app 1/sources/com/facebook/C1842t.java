package com.facebook;

import android.util.Log;
import com.facebook.internal.C1682p;
import com.facebook.internal.C1698v;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.t */
public class C1842t {

    /* renamed from: d */
    private static final String f5457d = "t";

    /* renamed from: a */
    private final HttpURLConnection f5458a;

    /* renamed from: b */
    private final JSONObject f5459b;

    /* renamed from: c */
    private final C1730l f5460c;

    C1842t(C1797q qVar, HttpURLConnection httpURLConnection, C1730l lVar) {
        this(qVar, httpURLConnection, null, null, null, lVar);
    }

    C1842t(C1797q qVar, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(qVar, httpURLConnection, str, null, jSONArray, null);
    }

    C1842t(C1797q qVar, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(qVar, httpURLConnection, str, jSONObject, null, null);
    }

    C1842t(C1797q qVar, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, C1730l lVar) {
        this.f5458a = httpURLConnection;
        this.f5459b = jSONObject;
        this.f5460c = lVar;
    }

    /* renamed from: a */
    private static C1842t m7919a(C1797q qVar, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            C1730l a = C1730l.m7503a(jSONObject, obj2, httpURLConnection);
            if (a != null) {
                Log.e(f5457d, a.toString());
                if (a.mo6005a() == 190 && C1698v.m7387a(qVar.mo6176c())) {
                    if (a.mo6011f() != 493) {
                        C1499a.m6757b(null);
                    } else if (!C1499a.m6759r().mo5694k()) {
                        C1499a.m6758n();
                    }
                }
                return new C1842t(qVar, httpURLConnection, a);
            }
            Object a2 = C1698v.m7358a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (a2 instanceof JSONObject) {
                return new C1842t(qVar, httpURLConnection, a2.toString(), (JSONObject) a2);
            }
            if (a2 instanceof JSONArray) {
                return new C1842t(qVar, httpURLConnection, a2.toString(), (JSONArray) a2);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new C1842t(qVar, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Got unexpected object type in response, class: ");
        sb.append(obj.getClass().getSimpleName());
        throw new C1631i(sb.toString());
    }

    /* renamed from: a */
    static List<C1842t> m7920a(InputStream inputStream, HttpURLConnection httpURLConnection, C1809s sVar) {
        String a = C1698v.m7360a(inputStream);
        C1682p.m7283a(C1845w.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(a.length()), a);
        return m7921a(a, httpURLConnection, sVar);
    }

    /* renamed from: a */
    static List<C1842t> m7921a(String str, HttpURLConnection httpURLConnection, C1809s sVar) {
        List<C1842t> a = m7923a(httpURLConnection, (List<C1797q>) sVar, new JSONTokener(str).nextValue());
        C1682p.m7283a(C1845w.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", sVar.mo6230k(), Integer.valueOf(str.length()), a);
        return a;
    }

    /* renamed from: a */
    static List<C1842t> m7922a(HttpURLConnection httpURLConnection, C1809s sVar) {
        String str = "Response <Error>: %s";
        String str2 = "Response";
        InputStream inputStream = null;
        try {
            if (C1787m.m7757r()) {
                inputStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                return m7920a(inputStream, httpURLConnection, sVar);
            }
            String str3 = "GraphRequest can't be used when Facebook SDK isn't fully initialized";
            Log.e(f5457d, str3);
            throw new C1631i(str3);
        } catch (C1631i e) {
            C1682p.m7283a(C1845w.REQUESTS, str2, str, e);
            return m7924a((List<C1797q>) sVar, httpURLConnection, e);
        } catch (Exception e2) {
            C1682p.m7283a(C1845w.REQUESTS, str2, str, e2);
            return m7924a((List<C1797q>) sVar, httpURLConnection, new C1631i((Throwable) e2));
        } finally {
            C1698v.m7378a(inputStream);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.facebook.C1842t> m7923a(java.net.HttpURLConnection r7, java.util.List<com.facebook.C1797q> r8, java.lang.Object r9) {
        /*
            int r0 = r8.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x004e
            java.lang.Object r3 = r8.get(r2)
            com.facebook.q r3 = (com.facebook.C1797q) r3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            r4.<init>()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            java.lang.String r5 = "body"
            r4.put(r5, r9)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            if (r7 == 0) goto L_0x0024
            int r5 = r7.getResponseCode()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            goto L_0x0026
        L_0x0024:
            r5 = 200(0xc8, float:2.8E-43)
        L_0x0026:
            java.lang.String r6 = "code"
            r4.put(r6, r5)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            r5.<init>()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            r5.put(r4)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            goto L_0x004f
        L_0x0034:
            r4 = move-exception
            com.facebook.t r5 = new com.facebook.t
            com.facebook.l r6 = new com.facebook.l
            r6.<init>(r7, r4)
            r5.<init>(r3, r7, r6)
            goto L_0x004b
        L_0x0040:
            r4 = move-exception
            com.facebook.t r5 = new com.facebook.t
            com.facebook.l r6 = new com.facebook.l
            r6.<init>(r7, r4)
            r5.<init>(r3, r7, r6)
        L_0x004b:
            r1.add(r5)
        L_0x004e:
            r5 = r9
        L_0x004f:
            boolean r3 = r5 instanceof org.json.JSONArray
            if (r3 == 0) goto L_0x0091
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            int r3 = r5.length()
            if (r3 != r0) goto L_0x0091
        L_0x005b:
            int r0 = r5.length()
            if (r2 >= r0) goto L_0x0090
            java.lang.Object r0 = r8.get(r2)
            com.facebook.q r0 = (com.facebook.C1797q) r0
            java.lang.Object r3 = r5.get(r2)     // Catch:{ JSONException -> 0x007f, i -> 0x0073 }
            com.facebook.t r3 = m7919a(r0, r7, r3, r9)     // Catch:{ JSONException -> 0x007f, i -> 0x0073 }
            r1.add(r3)     // Catch:{ JSONException -> 0x007f, i -> 0x0073 }
            goto L_0x008d
        L_0x0073:
            r3 = move-exception
            com.facebook.t r4 = new com.facebook.t
            com.facebook.l r6 = new com.facebook.l
            r6.<init>(r7, r3)
            r4.<init>(r0, r7, r6)
            goto L_0x008a
        L_0x007f:
            r3 = move-exception
            com.facebook.t r4 = new com.facebook.t
            com.facebook.l r6 = new com.facebook.l
            r6.<init>(r7, r3)
            r4.<init>(r0, r7, r6)
        L_0x008a:
            r1.add(r4)
        L_0x008d:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x0090:
            return r1
        L_0x0091:
            com.facebook.i r7 = new com.facebook.i
            java.lang.String r8 = "Unexpected number of results"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1842t.m7923a(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    /* renamed from: a */
    static List<C1842t> m7924a(List<C1797q> list, HttpURLConnection httpURLConnection, C1631i iVar) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C1842t((C1797q) list.get(i), httpURLConnection, new C1730l(httpURLConnection, (Exception) iVar)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C1730l mo6290a() {
        return this.f5460c;
    }

    /* renamed from: b */
    public final JSONObject mo6291b() {
        return this.f5459b;
    }

    public String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            String str2 = "%d";
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(this.f5458a != null ? this.f5458a.getResponseCode() : 200);
            str = String.format(locale, str2, objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{Response: ");
        sb.append(" responseCode: ");
        sb.append(str);
        sb.append(", graphObject: ");
        sb.append(this.f5459b);
        sb.append(", error: ");
        sb.append(this.f5460c);
        sb.append("}");
        return sb.toString();
    }
}
