package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.common.r */
public final class C2177r implements Creator<C2082d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 1) {
                str = C2159b.m8874b(parcel, a);
            } else if (a2 == 2) {
                i = C2159b.m8885k(parcel, a);
            } else if (a2 != 3) {
                C2159b.m8889o(parcel, a);
            } else {
                j = C2159b.m8886l(parcel, a);
            }
        }
        C2159b.m8878d(parcel, b);
        return new C2082d(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2082d[i];
    }
}
