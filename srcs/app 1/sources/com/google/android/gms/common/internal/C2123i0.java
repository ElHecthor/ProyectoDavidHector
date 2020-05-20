package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C2082d;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: com.google.android.gms.common.internal.i0 */
public final class C2123i0 extends C2158a {
    public static final Creator<C2123i0> CREATOR = new C2125j0();

    /* renamed from: f */
    Bundle f6072f;

    /* renamed from: g */
    C2082d[] f6073g;

    /* renamed from: h */
    private int f6074h;

    public C2123i0() {
    }

    C2123i0(Bundle bundle, C2082d[] dVarArr, int i) {
        this.f6072f = bundle;
        this.f6073g = dVarArr;
        this.f6074h = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8895a(parcel, 1, this.f6072f, false);
        C2161c.m8905a(parcel, 2, (T[]) this.f6073g, i, false);
        C2161c.m8893a(parcel, 3, this.f6074h);
        C2161c.m8891a(parcel, a);
    }
}
