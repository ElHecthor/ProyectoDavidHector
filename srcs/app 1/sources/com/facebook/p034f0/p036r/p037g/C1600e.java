package com.facebook.p034f0.p036r.p037g;

import android.util.Log;

/* renamed from: com.facebook.f0.r.g.e */
public class C1600e {

    /* renamed from: a */
    private static final String f4960a = "com.facebook.f0.r.g.e";

    /* renamed from: b */
    private static Class<?> f4961b;

    /* renamed from: a */
    public static void m7046a() {
        m7048a("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    /* renamed from: a */
    public static void m7047a(String str) {
        m7048a("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    /* renamed from: a */
    public static void m7048a(String str, String str2, String str3) {
        Class<String> cls = String.class;
        try {
            if (f4961b == null) {
                f4961b = Class.forName("com.unity3d.player.UnityPlayer");
            }
            f4961b.getMethod("UnitySendMessage", new Class[]{cls, cls, cls}).invoke(f4961b, new Object[]{str, str2, str3});
        } catch (Exception e) {
            Log.e(f4960a, "Failed to send message to Unity", e);
        }
    }
}
