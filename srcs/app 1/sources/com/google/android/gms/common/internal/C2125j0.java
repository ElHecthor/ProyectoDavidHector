package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C2082d;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.common.internal.j0 */
public final class C2125j0 implements Creator<C2123i0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        Bundle bundle = null;
        C2082d[] dVarArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 1) {
                bundle = C2159b.m8869a(parcel, a);
            } else if (a2 == 2) {
                dVarArr = (C2082d[]) C2159b.m8875b(parcel, a, C2082d.CREATOR);
            } else if (a2 != 3) {
                C2159b.m8889o(parcel, a);
            } else {
                i = C2159b.m8885k(parcel, a);
            }
        }
        C2159b.m8878d(parcel, b);
        return new C2123i0(bundle, dVarArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2123i0[i];
    }
}
