package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.measurement.internal.n */
final class C2389n {

    /* renamed from: a */
    final String f6691a;

    /* renamed from: b */
    final String f6692b;

    /* renamed from: c */
    final long f6693c;

    /* renamed from: d */
    final long f6694d;

    /* renamed from: e */
    final long f6695e;

    /* renamed from: f */
    final long f6696f;

    /* renamed from: g */
    final long f6697g;

    /* renamed from: h */
    final Long f6698h;

    /* renamed from: i */
    final Long f6699i;

    /* renamed from: j */
    final Long f6700j;

    /* renamed from: k */
    final Boolean f6701k;

    C2389n(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C2148s.m8844b(str);
        C2148s.m8844b(str2);
        boolean z = true;
        C2148s.m8841a(j6 >= 0);
        C2148s.m8841a(j7 >= 0);
        C2148s.m8841a(j8 >= 0);
        if (j9 < 0) {
            z = false;
        }
        C2148s.m8841a(z);
        this.f6691a = str;
        this.f6692b = str2;
        this.f6693c = j6;
        this.f6694d = j7;
        this.f6695e = j8;
        this.f6696f = j4;
        this.f6697g = j9;
        this.f6698h = l;
        this.f6699i = l2;
        this.f6700j = l3;
        this.f6701k = bool;
    }

    C2389n(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, 0, 0, 0, j3, 0, null, null, null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C2389n mo7513a(long j) {
        C2389n nVar = new C2389n(this.f6691a, this.f6692b, this.f6693c, this.f6694d, this.f6695e, j, this.f6697g, this.f6698h, this.f6699i, this.f6700j, this.f6701k);
        return nVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C2389n mo7514a(long j, long j2) {
        C2389n nVar = new C2389n(this.f6691a, this.f6692b, this.f6693c, this.f6694d, this.f6695e, this.f6696f, j, Long.valueOf(j2), this.f6699i, this.f6700j, this.f6701k);
        return nVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C2389n mo7515a(Long l, Long l2, Boolean bool) {
        C2389n nVar = new C2389n(this.f6691a, this.f6692b, this.f6693c, this.f6694d, this.f6695e, this.f6696f, this.f6697g, this.f6698h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
        return nVar;
    }
}
