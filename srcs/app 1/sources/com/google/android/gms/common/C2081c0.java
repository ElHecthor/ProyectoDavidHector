package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.common.c0 */
public final class C2081c0 implements Creator<C2211z> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 1) {
                str = C2159b.m8874b(parcel, a);
            } else if (a2 == 2) {
                iBinder = C2159b.m8884j(parcel, a);
            } else if (a2 == 3) {
                z = C2159b.m8879e(parcel, a);
            } else if (a2 != 4) {
                C2159b.m8889o(parcel, a);
            } else {
                z2 = C2159b.m8879e(parcel, a);
            }
        }
        C2159b.m8878d(parcel, b);
        return new C2211z(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2211z[i];
    }
}
