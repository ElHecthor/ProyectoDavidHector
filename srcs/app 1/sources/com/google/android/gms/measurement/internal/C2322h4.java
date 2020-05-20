package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2148s;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.h4 */
final class C2322h4 implements Runnable {

    /* renamed from: f */
    private final C2334i4 f6492f;

    /* renamed from: g */
    private final int f6493g;

    /* renamed from: h */
    private final Throwable f6494h;

    /* renamed from: i */
    private final byte[] f6495i;

    /* renamed from: j */
    private final String f6496j;

    /* renamed from: k */
    private final Map<String, List<String>> f6497k;

    private C2322h4(String str, C2334i4 i4Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C2148s.m8834a(i4Var);
        this.f6492f = i4Var;
        this.f6493g = i;
        this.f6494h = th;
        this.f6495i = bArr;
        this.f6496j = str;
        this.f6497k = map;
    }

    public final void run() {
        this.f6492f.mo7377a(this.f6496j, this.f6493g, this.f6494h, this.f6495i, this.f6497k);
    }
}
