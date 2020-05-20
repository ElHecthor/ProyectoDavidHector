package com.google.firebase.components;

/* renamed from: com.google.firebase.components.u */
public final class C2898u {
    /* renamed from: a */
    public static <T> T m11986a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    public static <T> T m11987a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static void m11988a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m11989b(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
