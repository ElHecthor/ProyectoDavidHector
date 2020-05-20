package com.crashlytics.android.p031c;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.crashlytics.android.c.a0 */
final class C1328a0 {

    /* renamed from: a */
    public final C1333b0 f4321a;

    /* renamed from: b */
    public final long f4322b;

    /* renamed from: c */
    public final C1331c f4323c;

    /* renamed from: d */
    public final Map<String, String> f4324d;

    /* renamed from: e */
    public final String f4325e;

    /* renamed from: f */
    public final Map<String, Object> f4326f;

    /* renamed from: g */
    public final String f4327g;

    /* renamed from: h */
    public final Map<String, Object> f4328h;

    /* renamed from: i */
    private String f4329i;

    /* renamed from: com.crashlytics.android.c.a0$b */
    static class C1330b {

        /* renamed from: a */
        final C1331c f4330a;

        /* renamed from: b */
        final long f4331b = System.currentTimeMillis();

        /* renamed from: c */
        Map<String, String> f4332c = null;

        /* renamed from: d */
        String f4333d = null;

        /* renamed from: e */
        Map<String, Object> f4334e = null;

        /* renamed from: f */
        String f4335f = null;

        /* renamed from: g */
        Map<String, Object> f4336g = null;

        public C1330b(C1331c cVar) {
            this.f4330a = cVar;
        }

        /* renamed from: a */
        public C1330b mo5404a(Map<String, Object> map) {
            this.f4334e = map;
            return this;
        }

        /* renamed from: a */
        public C1328a0 mo5405a(C1333b0 b0Var) {
            C1328a0 a0Var = new C1328a0(b0Var, this.f4331b, this.f4330a, this.f4332c, this.f4333d, this.f4334e, this.f4335f, this.f4336g);
            return a0Var;
        }

        /* renamed from: b */
        public C1330b mo5406b(Map<String, String> map) {
            this.f4332c = map;
            return this;
        }
    }

    /* renamed from: com.crashlytics.android.c.a0$c */
    enum C1331c {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    private C1328a0(C1333b0 b0Var, long j, C1331c cVar, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.f4321a = b0Var;
        this.f4322b = j;
        this.f4323c = cVar;
        this.f4324d = map;
        this.f4325e = str;
        this.f4326f = map2;
        this.f4327g = str2;
        this.f4328h = map3;
    }

    /* renamed from: a */
    public static C1330b m6213a(long j) {
        C1330b bVar = new C1330b(C1331c.INSTALL);
        bVar.mo5406b(Collections.singletonMap("installedAt", String.valueOf(j)));
        return bVar;
    }

    /* renamed from: a */
    public static C1330b m6214a(C1331c cVar, Activity activity) {
        Map singletonMap = Collections.singletonMap("activity", activity.getClass().getName());
        C1330b bVar = new C1330b(cVar);
        bVar.mo5406b(singletonMap);
        return bVar;
    }

    /* renamed from: a */
    public static C1330b m6215a(String str) {
        Map singletonMap = Collections.singletonMap("sessionId", str);
        C1330b bVar = new C1330b(C1331c.CRASH);
        bVar.mo5406b(singletonMap);
        return bVar;
    }

    /* renamed from: a */
    public static C1330b m6216a(String str, String str2) {
        C1330b a = m6215a(str);
        a.mo5404a(Collections.singletonMap("exceptionName", str2));
        return a;
    }

    public String toString() {
        if (this.f4329i == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(C1328a0.class.getSimpleName());
            sb.append(": ");
            sb.append("timestamp=");
            sb.append(this.f4322b);
            sb.append(", type=");
            sb.append(this.f4323c);
            sb.append(", details=");
            sb.append(this.f4324d);
            sb.append(", customType=");
            sb.append(this.f4325e);
            sb.append(", customAttributes=");
            sb.append(this.f4326f);
            sb.append(", predefinedType=");
            sb.append(this.f4327g);
            sb.append(", predefinedAttributes=");
            sb.append(this.f4328h);
            sb.append(", metadata=[");
            sb.append(this.f4321a);
            sb.append("]]");
            this.f4329i = sb.toString();
        }
        return this.f4329i;
    }
}
