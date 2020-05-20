package com.facebook.share.p045a;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.C1499a;
import com.facebook.C1631i;
import com.facebook.C1797q;
import com.facebook.C1797q.C1802e;
import com.facebook.C1797q.C1805h;
import com.facebook.C1843u;
import com.facebook.internal.C1698v;
import com.facebook.share.p045a.C1818b.C1819a;
import com.facebook.share.p046b.C1834g;
import com.facebook.share.p046b.C1840j;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.a.c */
public final class C1820c {

    /* renamed from: com.facebook.share.a.c$a */
    static class C1821a implements C1819a {
        C1821a() {
        }

        /* renamed from: a */
        public JSONObject mo6248a(C1840j jVar) {
            Uri a = jVar.mo6286a();
            if (C1698v.m7405d(a)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", a.toString());
                    return jSONObject;
                } catch (JSONException e) {
                    throw new C1631i("Unable to attach images", e);
                }
            } else {
                throw new C1631i("Only web images may be used in OG objects shared via the web dialog");
            }
        }
    }

    /* renamed from: a */
    public static Pair<String, String> m7885a(String str) {
        String str2;
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            int i = indexOf + 1;
            if (str.length() > i) {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
                return new Pair<>(str2, str);
            }
        }
        str2 = null;
        return new Pair<>(str2, str);
    }

    /* renamed from: a */
    public static C1797q m7886a(C1499a aVar, Uri uri, C1802e eVar) {
        if (C1698v.m7400c(uri)) {
            return m7887a(aVar, new File(uri.getPath()), eVar);
        }
        if (C1698v.m7396b(uri)) {
            C1805h hVar = new C1805h(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", hVar);
            C1499a aVar2 = aVar;
            C1797q qVar = new C1797q(aVar2, "me/staging_resources", bundle, C1843u.POST, eVar);
            return qVar;
        }
        throw new C1631i("The image Uri must be either a file:// or content:// Uri");
    }

    /* renamed from: a */
    public static C1797q m7887a(C1499a aVar, File file, C1802e eVar) {
        C1805h hVar = new C1805h(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", hVar);
        C1499a aVar2 = aVar;
        C1797q qVar = new C1797q(aVar2, "me/staging_resources", bundle, C1843u.POST, eVar);
        return qVar;
    }

    /* renamed from: a */
    public static JSONArray m7888a(JSONArray jSONArray, boolean z) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m7888a((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = m7890a((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONObject m7889a(C1834g gVar) {
        return C1818b.m7882a(gVar.mo6273c(), (C1819a) new C1821a());
    }

    /* renamed from: a */
    public static JSONObject m7890a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = m7890a((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = m7888a((JSONArray) obj, true);
                }
                Pair a = m7885a(string);
                String str = (String) a.first;
                String str2 = (String) a.second;
                if (!z) {
                    if (str != null && str.equals("fb")) {
                    }
                    jSONObject2.put(str2, obj);
                } else if (str == null || !str.equals("fbsdk")) {
                    if (str != null) {
                        if (!str.equals("og")) {
                            jSONObject3.put(str2, obj);
                        }
                    }
                    jSONObject2.put(str2, obj);
                }
                jSONObject2.put(string, obj);
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new C1631i("Failed to create json object from share content");
        }
    }
}
