package com.facebook.p034f0;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C1499a;
import com.facebook.C1730l;
import com.facebook.C1787m;
import com.facebook.C1797q;
import com.facebook.C1797q.C1802e;
import com.facebook.C1842t;
import com.facebook.C1845w;
import com.facebook.internal.C1670l;
import com.facebook.internal.C1672m;
import com.facebook.internal.C1682p;
import com.facebook.p034f0.C1547g.C1548a;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p071f.p129q.p130a.C3476a;

/* renamed from: com.facebook.f0.e */
class C1538e {

    /* renamed from: a */
    private static final String f4802a = "com.facebook.f0.e";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile C1537d f4803b = new C1537d();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ScheduledExecutorService f4804c = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static ScheduledFuture f4805d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Runnable f4806e = new C1539a();

    /* renamed from: com.facebook.f0.e$a */
    static class C1539a implements Runnable {
        C1539a() {
        }

        public void run() {
            C1538e.f4805d = null;
            if (C1547g.m6884b() != C1548a.EXPLICIT_ONLY) {
                C1538e.m6870b(C1555j.TIMER);
            }
        }
    }

    /* renamed from: com.facebook.f0.e$b */
    static class C1540b implements Runnable {
        C1540b() {
        }

        public void run() {
            C1545f.m6878a(C1538e.f4803b);
            C1538e.f4803b = new C1537d();
        }
    }

    /* renamed from: com.facebook.f0.e$c */
    static class C1541c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1555j f4807f;

        C1541c(C1555j jVar) {
            this.f4807f = jVar;
        }

        public void run() {
            C1538e.m6870b(this.f4807f);
        }
    }

    /* renamed from: com.facebook.f0.e$d */
    static class C1542d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1528a f4808f;

        /* renamed from: g */
        final /* synthetic */ C1533c f4809g;

        C1542d(C1528a aVar, C1533c cVar) {
            this.f4808f = aVar;
            this.f4809g = cVar;
        }

        public void run() {
            C1538e.f4803b.mo5747a(this.f4808f, this.f4809g);
            if (C1547g.m6884b() != C1548a.EXPLICIT_ONLY && C1538e.f4803b.mo5745a() > 100) {
                C1538e.m6870b(C1555j.EVENT_THRESHOLD);
            } else if (C1538e.f4805d == null) {
                C1538e.f4805d = C1538e.f4804c.schedule(C1538e.f4806e, 15, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: com.facebook.f0.e$e */
    static class C1543e implements C1802e {

        /* renamed from: a */
        final /* synthetic */ C1528a f4810a;

        /* renamed from: b */
        final /* synthetic */ C1797q f4811b;

        /* renamed from: c */
        final /* synthetic */ C1562o f4812c;

        /* renamed from: d */
        final /* synthetic */ C1557l f4813d;

        C1543e(C1528a aVar, C1797q qVar, C1562o oVar, C1557l lVar) {
            this.f4810a = aVar;
            this.f4811b = qVar;
            this.f4812c = oVar;
            this.f4813d = lVar;
        }

        /* renamed from: a */
        public void mo5725a(C1842t tVar) {
            C1538e.m6869b(this.f4810a, this.f4811b, tVar, this.f4812c, this.f4813d);
        }
    }

    /* renamed from: com.facebook.f0.e$f */
    static class C1544f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1528a f4814f;

        /* renamed from: g */
        final /* synthetic */ C1562o f4815g;

        C1544f(C1528a aVar, C1562o oVar) {
            this.f4814f = aVar;
            this.f4815g = oVar;
        }

        public void run() {
            C1545f.m6877a(this.f4814f, this.f4815g);
        }
    }

    /* renamed from: a */
    private static C1557l m6861a(C1555j jVar, C1537d dVar) {
        C1557l lVar = new C1557l();
        boolean a = C1787m.m7736a(C1787m.m7744e());
        ArrayList<C1797q> arrayList = new ArrayList<>();
        for (C1528a aVar : dVar.mo5749b()) {
            C1797q a2 = m6862a(aVar, dVar.mo5746a(aVar), a, lVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        C1682p.m7283a(C1845w.APP_EVENTS, f4802a, "Flushing %d events due to %s.", Integer.valueOf(lVar.f4844a), jVar.toString());
        for (C1797q a3 : arrayList) {
            a3.mo6168a();
        }
        return lVar;
    }

    /* renamed from: a */
    private static C1797q m6862a(C1528a aVar, C1562o oVar, boolean z, C1557l lVar) {
        String b = aVar.mo5736b();
        boolean z2 = false;
        C1670l a = C1672m.m7260a(b, false);
        C1797q a2 = C1797q.m7765a((C1499a) null, String.format("%s/activities", new Object[]{b}), (JSONObject) null, (C1802e) null);
        Bundle h = a2.mo6181h();
        if (h == null) {
            h = new Bundle();
        }
        h.putString("access_token", aVar.mo5735a());
        String d = C1558m.m6917d();
        if (d != null) {
            h.putString("device_token", d);
        }
        String e = C1549h.m6899e();
        if (e != null) {
            h.putString("install_referrer", e);
        }
        a2.mo6169a(h);
        if (a != null) {
            z2 = a.mo5914j();
        }
        int a3 = oVar.mo5782a(a2, C1787m.m7744e(), z2, z);
        if (a3 == 0) {
            return null;
        }
        lVar.f4844a += a3;
        a2.mo6170a((C1802e) new C1543e(aVar, a2, oVar, lVar));
        return a2;
    }

    /* renamed from: a */
    public static void m6865a(C1528a aVar, C1533c cVar) {
        f4804c.execute(new C1542d(aVar, cVar));
    }

    /* renamed from: a */
    public static void m6867a(C1555j jVar) {
        f4804c.execute(new C1541c(jVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m6869b(C1528a aVar, C1797q qVar, C1842t tVar, C1562o oVar, C1557l lVar) {
        String str;
        String str2;
        C1730l a = tVar.mo6290a();
        C1556k kVar = C1556k.SUCCESS;
        boolean z = true;
        if (a == null) {
            str = "Success";
        } else if (a.mo6005a() == -1) {
            kVar = C1556k.NO_CONNECTIVITY;
            str = "Failed: No Connectivity";
        } else {
            str = String.format("Failed:\n  Response: %s\n  Error %s", new Object[]{tVar.toString(), a.toString()});
            kVar = C1556k.SERVER_ERROR;
        }
        if (C1787m.m7737a(C1845w.APP_EVENTS)) {
            try {
                str2 = new JSONArray((String) qVar.mo6183j()).toString(2);
            } catch (JSONException unused) {
                str2 = "<Can't encode events for debug logging>";
            }
            C1682p.m7283a(C1845w.APP_EVENTS, f4802a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", qVar.mo6178e().toString(), str, str2);
        }
        if (a == null) {
            z = false;
        }
        oVar.mo5784a(z);
        if (kVar == C1556k.NO_CONNECTIVITY) {
            C1787m.m7751l().execute(new C1544f(aVar, oVar));
        }
        if (kVar != C1556k.SUCCESS && lVar.f4845b != C1556k.NO_CONNECTIVITY) {
            lVar.f4845b = kVar;
        }
    }

    /* renamed from: b */
    static void m6870b(C1555j jVar) {
        f4803b.mo5748a(C1545f.m6876a());
        try {
            C1557l a = m6861a(jVar, f4803b);
            if (a != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", a.f4844a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", a.f4845b);
                C3476a.m14249a(C1787m.m7744e()).mo11088a(intent);
            }
        } catch (Exception e) {
            Log.w(f4802a, "Caught unexpected exception while flushing app events: ", e);
        }
    }

    /* renamed from: e */
    public static Set<C1528a> m6873e() {
        return f4803b.mo5749b();
    }

    /* renamed from: f */
    public static void m6874f() {
        f4804c.execute(new C1540b());
    }
}
