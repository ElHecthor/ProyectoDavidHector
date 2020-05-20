package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.common.api.p */
public final class C2076p implements Creator<Scope> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 1) {
                i = C2159b.m8885k(parcel, a);
            } else if (a2 != 2) {
                C2159b.m8889o(parcel, a);
            } else {
                str = C2159b.m8874b(parcel, a);
            }
        }
        C2159b.m8878d(parcel, b);
        return new Scope(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
