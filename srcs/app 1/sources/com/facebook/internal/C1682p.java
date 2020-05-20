package com.facebook.internal;

import android.util.Log;
import com.facebook.C1787m;
import com.facebook.C1845w;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: com.facebook.internal.p */
public class C1682p {

    /* renamed from: e */
    private static final HashMap<String, String> f5129e = new HashMap<>();

    /* renamed from: a */
    private final C1845w f5130a;

    /* renamed from: b */
    private final String f5131b;

    /* renamed from: c */
    private StringBuilder f5132c;

    /* renamed from: d */
    private int f5133d = 3;

    public C1682p(C1845w wVar, String str) {
        C1703w.m7424a(str, "tag");
        this.f5130a = wVar;
        StringBuilder sb = new StringBuilder();
        sb.append("FacebookSDK.");
        sb.append(str);
        this.f5131b = sb.toString();
        this.f5132c = new StringBuilder();
    }

    /* renamed from: a */
    public static void m7280a(C1845w wVar, int i, String str, String str2) {
        if (C1787m.m7737a(wVar)) {
            String d = m7287d(str2);
            String str3 = "FacebookSDK.";
            if (!str.startsWith(str3)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                str = sb.toString();
            }
            Log.println(i, str, d);
            if (wVar == C1845w.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m7281a(C1845w wVar, int i, String str, String str2, Object... objArr) {
        if (C1787m.m7737a(wVar)) {
            m7280a(wVar, i, str, String.format(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m7282a(C1845w wVar, String str, String str2) {
        m7280a(wVar, 3, str, str2);
    }

    /* renamed from: a */
    public static void m7283a(C1845w wVar, String str, String str2, Object... objArr) {
        if (C1787m.m7737a(wVar)) {
            m7280a(wVar, 3, str, String.format(str2, objArr));
        }
    }

    /* renamed from: a */
    public static synchronized void m7284a(String str, String str2) {
        synchronized (C1682p.class) {
            f5129e.put(str, str2);
        }
    }

    /* renamed from: b */
    private boolean m7285b() {
        return C1787m.m7737a(this.f5130a);
    }

    /* renamed from: c */
    public static synchronized void m7286c(String str) {
        synchronized (C1682p.class) {
            if (!C1787m.m7737a(C1845w.INCLUDE_ACCESS_TOKENS)) {
                m7284a(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    /* renamed from: d */
    private static synchronized String m7287d(String str) {
        synchronized (C1682p.class) {
            for (Entry entry : f5129e.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    /* renamed from: a */
    public void mo5924a() {
        mo5928b(this.f5132c.toString());
        this.f5132c = new StringBuilder();
    }

    /* renamed from: a */
    public void mo5925a(String str) {
        if (m7285b()) {
            this.f5132c.append(str);
        }
    }

    /* renamed from: a */
    public void mo5926a(String str, Object obj) {
        mo5927a("  %s:\t%s\n", str, obj);
    }

    /* renamed from: a */
    public void mo5927a(String str, Object... objArr) {
        if (m7285b()) {
            this.f5132c.append(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo5928b(String str) {
        m7280a(this.f5130a, this.f5133d, this.f5131b, str);
    }
}
