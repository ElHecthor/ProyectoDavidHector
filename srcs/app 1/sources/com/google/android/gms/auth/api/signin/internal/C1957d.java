package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.d */
public final class C1957d implements Creator<C1954a> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 1) {
                i = C2159b.m8885k(parcel, a);
            } else if (a2 == 2) {
                i2 = C2159b.m8885k(parcel, a);
            } else if (a2 != 3) {
                C2159b.m8889o(parcel, a);
            } else {
                bundle = C2159b.m8869a(parcel, a);
            }
        }
        C2159b.m8878d(parcel, b);
        return new C1954a(i, i2, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1954a[i];
    }
}
