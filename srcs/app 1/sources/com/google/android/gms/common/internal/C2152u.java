package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.internal.C2128l.C2129a;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: com.google.android.gms.common.internal.u */
public class C2152u extends C2158a {
    public static final Creator<C2152u> CREATOR = new C2120h0();

    /* renamed from: f */
    private final int f6107f;

    /* renamed from: g */
    private IBinder f6108g;

    /* renamed from: h */
    private C2078b f6109h;

    /* renamed from: i */
    private boolean f6110i;

    /* renamed from: j */
    private boolean f6111j;

    C2152u(int i, IBinder iBinder, C2078b bVar, boolean z, boolean z2) {
        this.f6107f = i;
        this.f6108g = iBinder;
        this.f6109h = bVar;
        this.f6110i = z;
        this.f6111j = z2;
    }

    /* renamed from: e */
    public C2128l mo6942e() {
        return C2129a.m8785a(this.f6108g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2152u)) {
            return false;
        }
        C2152u uVar = (C2152u) obj;
        return this.f6109h.equals(uVar.f6109h) && mo6942e().equals(uVar.mo6942e());
    }

    /* renamed from: f */
    public C2078b mo6944f() {
        return this.f6109h;
    }

    /* renamed from: g */
    public boolean mo6945g() {
        return this.f6110i;
    }

    /* renamed from: h */
    public boolean mo6946h() {
        return this.f6111j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, this.f6107f);
        C2161c.m8896a(parcel, 2, this.f6108g, false);
        C2161c.m8897a(parcel, 3, (Parcelable) mo6944f(), i, false);
        C2161c.m8904a(parcel, 4, mo6945g());
        C2161c.m8904a(parcel, 5, mo6946h());
        C2161c.m8891a(parcel, a);
    }
}
