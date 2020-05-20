package com.bumptech.glide.p029t;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: com.bumptech.glide.t.j */
public final class C1309j {
    /* renamed from: a */
    public static <T> T m6149a(T t) {
        m6150a(t, "Argument must not be null");
        return t;
    }

    /* renamed from: a */
    public static <T> T m6150a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static String m6151a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: a */
    public static <T extends Collection<Y>, Y> T m6152a(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: a */
    public static void m6153a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
