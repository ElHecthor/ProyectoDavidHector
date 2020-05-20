package com.facebook.share.p045a;

import android.os.Bundle;
import com.facebook.C1631i;
import com.facebook.internal.C1698v;
import com.facebook.share.p046b.C1823a;
import com.facebook.share.p046b.C1824b;
import com.facebook.share.p046b.C1827c;
import com.facebook.share.p046b.C1834g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.a.d */
public class C1822d {
    /* renamed from: a */
    public static Bundle m7892a(C1823a aVar) {
        Bundle bundle = new Bundle();
        C1824b b = aVar.mo6250b();
        if (b != null) {
            C1698v.m7376a(bundle, "hashtag", b.mo6253a());
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m7893a(C1827c cVar) {
        Bundle a = m7892a((C1823a) cVar);
        C1698v.m7375a(a, "href", cVar.mo6249a());
        C1698v.m7376a(a, "quote", cVar.mo6262c());
        return a;
    }

    /* renamed from: a */
    public static Bundle m7894a(C1834g gVar) {
        Bundle a = m7892a((C1823a) gVar);
        C1698v.m7376a(a, "action_type", gVar.mo6273c().mo6266c());
        try {
            JSONObject a2 = C1820c.m7890a(C1820c.m7889a(gVar), false);
            if (a2 != null) {
                C1698v.m7376a(a, "action_properties", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            throw new C1631i("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }
}
