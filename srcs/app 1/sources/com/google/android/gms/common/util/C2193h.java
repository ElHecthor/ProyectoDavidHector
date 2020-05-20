package com.google.android.gms.common.util;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.h */
public class C2193h implements C2190e {

    /* renamed from: a */
    private static final C2193h f6166a = new C2193h();

    private C2193h() {
    }

    /* renamed from: d */
    public static C2190e m8985d() {
        return f6166a;
    }

    /* renamed from: a */
    public long mo6987a() {
        return System.nanoTime();
    }

    /* renamed from: b */
    public long mo6988b() {
        return System.currentTimeMillis();
    }

    /* renamed from: c */
    public long mo6989c() {
        return SystemClock.elapsedRealtime();
    }
}
