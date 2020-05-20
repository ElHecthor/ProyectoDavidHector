package com.facebook.p034f0.p038s;

import android.os.Bundle;
import com.facebook.C1845w;
import com.facebook.internal.C1682p;
import com.facebook.p034f0.C1547g.C1548a;
import com.facebook.p034f0.C1558m;
import java.util.Locale;

/* renamed from: com.facebook.f0.s.i */
class C1623i {

    /* renamed from: a */
    private static final String f5008a = "com.facebook.f0.s.i";

    /* renamed from: b */
    private static final long[] f5009b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* renamed from: a */
    private static int m7140a(long j) {
        int i = 0;
        while (true) {
            long[] jArr = f5009b;
            if (i >= jArr.length || jArr[i] >= j) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private static void m7141a() {
        C1682p.m7282a(C1845w.APP_EVENTS, f5008a, "Clock skew detected");
    }

    /* renamed from: a */
    public static void m7142a(String str, C1622h hVar, String str2) {
        Long valueOf = Long.valueOf(hVar.mo5849a() - hVar.mo5853d().longValue());
        long longValue = valueOf.longValue();
        Long valueOf2 = Long.valueOf(0);
        if (longValue < 0) {
            m7141a();
            valueOf = valueOf2;
        }
        Long valueOf3 = Long.valueOf(hVar.mo5854e());
        if (valueOf3.longValue() < 0) {
            m7141a();
        } else {
            valueOf2 = valueOf3;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", hVar.mo5851b());
        bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(m7140a(valueOf.longValue()))}));
        C1624j f = hVar.mo5855f();
        bundle.putString("fb_mobile_launch_source", f != null ? f.toString() : "Unclassified");
        bundle.putLong("_logTime", hVar.mo5853d().longValue() / 1000);
        new C1558m(str, str2, null).mo5771a("fb_mobile_deactivate_app", ((double) valueOf2.longValue()) / 1000.0d, bundle);
    }

    /* renamed from: a */
    public static void m7143a(String str, C1624j jVar, String str2) {
        String jVar2 = jVar != null ? jVar.toString() : "Unclassified";
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", jVar2);
        C1558m mVar = new C1558m(str, str2, null);
        mVar.mo5772a("fb_mobile_activate_app", bundle);
        if (C1558m.m6916c() != C1548a.EXPLICIT_ONLY) {
            mVar.mo5769a();
        }
    }
}
