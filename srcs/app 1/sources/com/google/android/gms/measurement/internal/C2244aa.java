package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.aa */
public final class C2244aa extends C2158a {
    public static final Creator<C2244aa> CREATOR = new C2268ca();

    /* renamed from: A */
    public final String f6242A;

    /* renamed from: f */
    public final String f6243f;

    /* renamed from: g */
    public final String f6244g;

    /* renamed from: h */
    public final String f6245h;

    /* renamed from: i */
    public final String f6246i;

    /* renamed from: j */
    public final long f6247j;

    /* renamed from: k */
    public final long f6248k;

    /* renamed from: l */
    public final String f6249l;

    /* renamed from: m */
    public final boolean f6250m;

    /* renamed from: n */
    public final boolean f6251n;

    /* renamed from: o */
    public final long f6252o;

    /* renamed from: p */
    public final String f6253p;

    /* renamed from: q */
    public final long f6254q;

    /* renamed from: r */
    public final long f6255r;

    /* renamed from: s */
    public final int f6256s;

    /* renamed from: t */
    public final boolean f6257t;

    /* renamed from: u */
    public final boolean f6258u;

    /* renamed from: v */
    public final boolean f6259v;

    /* renamed from: w */
    public final String f6260w;

    /* renamed from: x */
    public final Boolean f6261x;

    /* renamed from: y */
    public final long f6262y;

    /* renamed from: z */
    public final List<String> f6263z;

    C2244aa(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        C2148s.m8844b(str);
        this.f6243f = str;
        this.f6244g = TextUtils.isEmpty(str2) ? null : str2;
        this.f6245h = str3;
        this.f6252o = j;
        this.f6246i = str4;
        this.f6247j = j2;
        this.f6248k = j3;
        this.f6249l = str5;
        this.f6250m = z;
        this.f6251n = z2;
        this.f6253p = str6;
        this.f6254q = j4;
        this.f6255r = j5;
        this.f6256s = i;
        this.f6257t = z3;
        this.f6258u = z4;
        this.f6259v = z5;
        this.f6260w = str7;
        this.f6261x = bool;
        this.f6262y = j6;
        this.f6263z = list;
        this.f6242A = str8;
    }

    C2244aa(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        this.f6243f = str;
        this.f6244g = str2;
        this.f6245h = str3;
        this.f6252o = j3;
        this.f6246i = str4;
        this.f6247j = j;
        this.f6248k = j2;
        this.f6249l = str5;
        this.f6250m = z;
        this.f6251n = z2;
        this.f6253p = str6;
        this.f6254q = j4;
        this.f6255r = j5;
        this.f6256s = i;
        this.f6257t = z3;
        this.f6258u = z4;
        this.f6259v = z5;
        this.f6260w = str7;
        this.f6261x = bool;
        this.f6262y = j6;
        this.f6263z = list;
        this.f6242A = str8;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8902a(parcel, 2, this.f6243f, false);
        C2161c.m8902a(parcel, 3, this.f6244g, false);
        C2161c.m8902a(parcel, 4, this.f6245h, false);
        C2161c.m8902a(parcel, 5, this.f6246i, false);
        C2161c.m8894a(parcel, 6, this.f6247j);
        C2161c.m8894a(parcel, 7, this.f6248k);
        C2161c.m8902a(parcel, 8, this.f6249l, false);
        C2161c.m8904a(parcel, 9, this.f6250m);
        C2161c.m8904a(parcel, 10, this.f6251n);
        C2161c.m8894a(parcel, 11, this.f6252o);
        C2161c.m8902a(parcel, 12, this.f6253p, false);
        C2161c.m8894a(parcel, 13, this.f6254q);
        C2161c.m8894a(parcel, 14, this.f6255r);
        C2161c.m8893a(parcel, 15, this.f6256s);
        C2161c.m8904a(parcel, 16, this.f6257t);
        C2161c.m8904a(parcel, 17, this.f6258u);
        C2161c.m8904a(parcel, 18, this.f6259v);
        C2161c.m8902a(parcel, 19, this.f6260w, false);
        C2161c.m8898a(parcel, 21, this.f6261x, false);
        C2161c.m8894a(parcel, 22, this.f6262y);
        C2161c.m8903a(parcel, 23, this.f6263z, false);
        C2161c.m8902a(parcel, 24, this.f6242A, false);
        C2161c.m8891a(parcel, a);
    }
}
