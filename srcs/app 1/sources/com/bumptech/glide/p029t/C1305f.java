package com.bumptech.glide.p029t;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

/* renamed from: com.bumptech.glide.t.f */
public final class C1305f {

    /* renamed from: a */
    private static final double f4302a;

    static {
        double d = 1.0d;
        if (VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f4302a = d;
    }

    /* renamed from: a */
    public static double m6135a(long j) {
        return ((double) (m6136a() - j)) * f4302a;
    }

    @TargetApi(17)
    /* renamed from: a */
    public static long m6136a() {
        return VERSION.SDK_INT >= 17 ? SystemClock.elapsedRealtimeNanos() : SystemClock.uptimeMillis();
    }
}
