package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.common.internal.h0 */
public final class C2120h0 implements Creator<C2152u> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        IBinder iBinder = null;
        C2078b bVar = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 1) {
                i = C2159b.m8885k(parcel, a);
            } else if (a2 == 2) {
                iBinder = C2159b.m8884j(parcel, a);
            } else if (a2 == 3) {
                bVar = (C2078b) C2159b.m8870a(parcel, a, C2078b.CREATOR);
            } else if (a2 == 4) {
                z = C2159b.m8879e(parcel, a);
            } else if (a2 != 5) {
                C2159b.m8889o(parcel, a);
            } else {
                z2 = C2159b.m8879e(parcel, a);
            }
        }
        C2159b.m8878d(parcel, b);
        C2152u uVar = new C2152u(i, iBinder, bVar, z, z2);
        return uVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2152u[i];
    }
}
