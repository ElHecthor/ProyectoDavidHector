package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: com.google.android.gms.measurement.internal.r */
public final class C2435r extends C2158a {
    public static final Creator<C2435r> CREATOR = new C2424q();

    /* renamed from: f */
    public final String f6817f;

    /* renamed from: g */
    public final C2377m f6818g;

    /* renamed from: h */
    public final String f6819h;

    /* renamed from: i */
    public final long f6820i;

    C2435r(C2435r rVar, long j) {
        C2148s.m8834a(rVar);
        this.f6817f = rVar.f6817f;
        this.f6818g = rVar.f6818g;
        this.f6819h = rVar.f6819h;
        this.f6820i = j;
    }

    public C2435r(String str, C2377m mVar, String str2, long j) {
        this.f6817f = str;
        this.f6818g = mVar;
        this.f6819h = str2;
        this.f6820i = j;
    }

    public final String toString() {
        String str = this.f6819h;
        String str2 = this.f6817f;
        String valueOf = String.valueOf(this.f6818g);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8902a(parcel, 2, this.f6817f, false);
        C2161c.m8897a(parcel, 3, (Parcelable) this.f6818g, i, false);
        C2161c.m8902a(parcel, 4, this.f6819h, false);
        C2161c.m8894a(parcel, 5, this.f6820i);
        C2161c.m8891a(parcel, a);
    }
}
