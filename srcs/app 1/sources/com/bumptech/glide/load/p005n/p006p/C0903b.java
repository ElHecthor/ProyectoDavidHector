package com.bumptech.glide.load.p005n.p006p;

import android.net.Uri;

/* renamed from: com.bumptech.glide.load.n.p.b */
public final class C0903b {
    /* renamed from: a */
    public static boolean m4674a(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: a */
    public static boolean m4675a(Uri uri) {
        return m4676b(uri) && !m4678d(uri);
    }

    /* renamed from: b */
    public static boolean m4676b(Uri uri) {
        if (uri != null) {
            if ("content".equals(uri.getScheme())) {
                if ("media".equals(uri.getAuthority())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m4677c(Uri uri) {
        return m4676b(uri) && m4678d(uri);
    }

    /* renamed from: d */
    private static boolean m4678d(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
