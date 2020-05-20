package com.facebook.internal.p042y.p044d;

import com.facebook.C1787m;
import com.facebook.C1797q.C1802e;
import com.facebook.C1842t;
import com.facebook.internal.p042y.C1717b;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.facebook.internal.y.d.b */
public final class C1724b {

    /* renamed from: com.facebook.internal.y.d.b$a */
    static class C1725a implements Comparator<C1723a> {
        C1725a() {
        }

        /* renamed from: a */
        public int compare(C1723a aVar, C1723a aVar2) {
            return aVar.mo5996a(aVar2);
        }
    }

    /* renamed from: com.facebook.internal.y.d.b$b */
    static class C1726b implements C1802e {

        /* renamed from: a */
        final /* synthetic */ ArrayList f5218a;

        C1726b(ArrayList arrayList) {
            this.f5218a = arrayList;
        }

        /* renamed from: a */
        public void mo5725a(C1842t tVar) {
            try {
                if (tVar.mo6290a() == null && tVar.mo6291b().getBoolean("success")) {
                    for (int i = 0; this.f5218a.size() > i; i++) {
                        ((C1723a) this.f5218a.get(i)).mo5997a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: com.facebook.internal.y.d.b$c */
    static class C1727c implements FilenameFilter {
        C1727c() {
        }

        public boolean accept(File file, String str) {
            return str.matches(String.format("^%s[0-9]+.json$", new Object[]{"error_log_"}));
        }
    }

    /* renamed from: a */
    public static void m7497a() {
        if (C1787m.m7747h()) {
            m7500c();
        }
    }

    /* renamed from: a */
    public static void m7498a(String str) {
        try {
            new C1723a(str).mo6000d();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static File[] m7499b() {
        File a = C1717b.m7473a();
        return a == null ? new File[0] : a.listFiles(new C1727c());
    }

    /* renamed from: c */
    public static void m7500c() {
        File[] b = m7499b();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (File aVar : b) {
            C1723a aVar2 = new C1723a(aVar);
            if (aVar2.mo5999c()) {
                arrayList.add(aVar2);
            }
        }
        Collections.sort(arrayList, new C1725a());
        JSONArray jSONArray = new JSONArray();
        while (i < arrayList.size() && i < 1000) {
            jSONArray.put(arrayList.get(i));
            i++;
        }
        C1717b.m7477a("error_reports", jSONArray, new C1726b(arrayList));
    }
}
