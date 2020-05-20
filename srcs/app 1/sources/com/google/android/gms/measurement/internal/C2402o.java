package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.measurement.internal.o */
public final class C2402o implements Creator<C2377m> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            if (C2159b.m8867a(a) != 2) {
                C2159b.m8889o(parcel, a);
            } else {
                bundle = C2159b.m8869a(parcel, a);
            }
        }
        C2159b.m8878d(parcel, b);
        return new C2377m(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2377m[i];
    }
}
