package com.facebook.p034f0;

import android.content.Context;
import android.os.Bundle;
import com.facebook.C1797q;
import com.facebook.internal.C1633a;
import com.facebook.internal.C1698v;
import com.facebook.p034f0.p038s.C1610c;
import com.facebook.p034f0.p038s.C1610c.C1612b;
import com.facebook.p034f0.p039t.C1625a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.f0.o */
class C1562o {

    /* renamed from: a */
    private List<C1533c> f4849a = new ArrayList();

    /* renamed from: b */
    private List<C1533c> f4850b = new ArrayList();

    /* renamed from: c */
    private int f4851c;

    /* renamed from: d */
    private C1633a f4852d;

    /* renamed from: e */
    private String f4853e;

    public C1562o(C1633a aVar, String str) {
        this.f4852d = aVar;
        this.f4853e = str;
    }

    /* renamed from: a */
    private void m6930a(C1797q qVar, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            jSONObject = C1610c.m7096a(C1612b.CUSTOM_APP_EVENTS, this.f4852d, this.f4853e, z, context);
            if (this.f4851c > 0) {
                jSONObject.put("num_skipped_events", i);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        qVar.mo6173a(jSONObject);
        Bundle h = qVar.mo6181h();
        if (h == null) {
            h = new Bundle();
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2 != null) {
            h.putString("custom_events", jSONArray2);
            qVar.mo6172a((Object) jSONArray2);
        }
        qVar.mo6169a(h);
    }

    /* renamed from: a */
    public synchronized int mo5781a() {
        return this.f4849a.size();
    }

    /* renamed from: a */
    public int mo5782a(C1797q qVar, Context context, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.f4851c;
            C1625a.m7149a(this.f4850b);
            this.f4850b.addAll(this.f4849a);
            this.f4849a.clear();
            JSONArray jSONArray = new JSONArray();
            for (C1533c cVar : this.f4850b) {
                if (!cVar.mo5743d()) {
                    C1698v.m7399c("Event with invalid checksum: %s", cVar.toString());
                } else if (z || !cVar.mo5740a()) {
                    jSONArray.put(cVar.mo5741b());
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
            m6930a(qVar, context, i, jSONArray, z2);
            return jSONArray.length();
        }
    }

    /* renamed from: a */
    public synchronized void mo5783a(C1533c cVar) {
        if (this.f4849a.size() + this.f4850b.size() >= 1000) {
            this.f4851c++;
        } else {
            this.f4849a.add(cVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo5784a(boolean z) {
        if (z) {
            this.f4849a.addAll(this.f4850b);
        }
        this.f4850b.clear();
        this.f4851c = 0;
    }

    /* renamed from: b */
    public synchronized List<C1533c> mo5785b() {
        List<C1533c> list;
        list = this.f4849a;
        this.f4849a = new ArrayList();
        return list;
    }
}
