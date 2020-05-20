package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.firebase.messaging.z */
public final class C3078z implements Creator<C3051b> {
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
        return new C3051b(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3051b[i];
    }
}
