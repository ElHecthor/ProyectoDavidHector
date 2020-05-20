package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public class C1954a extends C2158a {
    public static final Creator<C1954a> CREATOR = new C1957d();

    /* renamed from: f */
    private final int f5770f;

    /* renamed from: g */
    private int f5771g;

    /* renamed from: h */
    private Bundle f5772h;

    C1954a(int i, int i2, Bundle bundle) {
        this.f5770f = i;
        this.f5771g = i2;
        this.f5772h = bundle;
    }

    /* renamed from: e */
    public int mo6535e() {
        return this.f5771g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, this.f5770f);
        C2161c.m8893a(parcel, 2, mo6535e());
        C2161c.m8895a(parcel, 3, this.f5772h, false);
        C2161c.m8891a(parcel, a);
    }
}
