package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: com.google.android.gms.measurement.internal.u9 */
public final class C2478u9 extends C2158a {
    public static final Creator<C2478u9> CREATOR = new C2467t9();

    /* renamed from: f */
    private final int f6997f;

    /* renamed from: g */
    public final String f6998g;

    /* renamed from: h */
    public final long f6999h;

    /* renamed from: i */
    public final Long f7000i;

    /* renamed from: j */
    public final String f7001j;

    /* renamed from: k */
    public final String f7002k;

    /* renamed from: l */
    public final Double f7003l;

    C2478u9(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f6997f = i;
        this.f6998g = str;
        this.f6999h = j;
        this.f7000i = l;
        if (i == 1) {
            this.f7003l = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f7003l = d;
        }
        this.f7001j = str2;
        this.f7002k = str3;
    }

    C2478u9(C2500w9 w9Var) {
        this(w9Var.f7060c, w9Var.f7061d, w9Var.f7062e, w9Var.f7059b);
    }

    C2478u9(String str, long j, Object obj, String str2) {
        C2148s.m8844b(str);
        this.f6997f = 2;
        this.f6998g = str;
        this.f6999h = j;
        this.f7002k = str2;
        if (obj == null) {
            this.f7000i = null;
            this.f7003l = null;
            this.f7001j = null;
        } else if (obj instanceof Long) {
            this.f7000i = (Long) obj;
            this.f7003l = null;
            this.f7001j = null;
        } else if (obj instanceof String) {
            this.f7000i = null;
            this.f7003l = null;
            this.f7001j = (String) obj;
        } else if (obj instanceof Double) {
            this.f7000i = null;
            this.f7003l = (Double) obj;
            this.f7001j = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* renamed from: a */
    public final Object mo7665a() {
        Long l = this.f7000i;
        if (l != null) {
            return l;
        }
        Double d = this.f7003l;
        if (d != null) {
            return d;
        }
        String str = this.f7001j;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, this.f6997f);
        C2161c.m8902a(parcel, 2, this.f6998g, false);
        C2161c.m8894a(parcel, 3, this.f6999h);
        C2161c.m8901a(parcel, 4, this.f7000i, false);
        C2161c.m8900a(parcel, 5, (Float) null, false);
        C2161c.m8902a(parcel, 6, this.f7001j, false);
        C2161c.m8902a(parcel, 7, this.f7002k, false);
        C2161c.m8899a(parcel, 8, this.f7003l, false);
        C2161c.m8891a(parcel, a);
    }
}
