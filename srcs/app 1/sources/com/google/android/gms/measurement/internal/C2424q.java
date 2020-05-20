package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.measurement.internal.q */
public final class C2424q implements Creator<C2435r> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        String str = null;
        C2377m mVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 2) {
                str = C2159b.m8874b(parcel, a);
            } else if (a2 == 3) {
                mVar = (C2377m) C2159b.m8870a(parcel, a, C2377m.CREATOR);
            } else if (a2 == 4) {
                str2 = C2159b.m8874b(parcel, a);
            } else if (a2 != 5) {
                C2159b.m8889o(parcel, a);
            } else {
                j = C2159b.m8886l(parcel, a);
            }
        }
        C2159b.m8878d(parcel, b);
        C2435r rVar = new C2435r(str, mVar, str2, j);
        return rVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2435r[i];
    }
}
