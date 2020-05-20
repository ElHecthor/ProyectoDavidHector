package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2141q;
import com.google.android.gms.common.internal.C2141q.C2142a;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: com.google.android.gms.common.d */
public class C2082d extends C2158a {
    public static final Creator<C2082d> CREATOR = new C2177r();

    /* renamed from: f */
    private final String f5973f;
    @Deprecated

    /* renamed from: g */
    private final int f5974g;

    /* renamed from: h */
    private final long f5975h;

    public C2082d(String str, int i, long j) {
        this.f5973f = str;
        this.f5974g = i;
        this.f5975h = j;
    }

    /* renamed from: e */
    public String mo6791e() {
        return this.f5973f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2082d) {
            C2082d dVar = (C2082d) obj;
            if (((mo6791e() != null && mo6791e().equals(dVar.mo6791e())) || (mo6791e() == null && dVar.mo6791e() == null)) && mo6793f() == dVar.mo6793f()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public long mo6793f() {
        long j = this.f5975h;
        return j == -1 ? (long) this.f5974g : j;
    }

    public int hashCode() {
        return C2141q.m8821a(mo6791e(), Long.valueOf(mo6793f()));
    }

    public String toString() {
        C2142a a = C2141q.m8822a((Object) this);
        a.mo6935a("name", mo6791e());
        a.mo6935a("version", Long.valueOf(mo6793f()));
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8902a(parcel, 1, mo6791e(), false);
        C2161c.m8893a(parcel, 2, this.f5974g);
        C2161c.m8894a(parcel, 3, mo6793f());
        C2161c.m8891a(parcel, a);
    }
}
