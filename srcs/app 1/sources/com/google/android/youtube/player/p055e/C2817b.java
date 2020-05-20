package com.google.android.youtube.player.p055e;

import android.text.TextUtils;

/* renamed from: com.google.android.youtube.player.e.b */
public final class C2817b {
    /* renamed from: a */
    public static <T> T m11730a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: a */
    public static <T> T m11731a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static String m11732a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static void m11733a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
