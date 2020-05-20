package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.common.q */
public final class C2176q implements Creator<C2078b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 1) {
                i = C2159b.m8885k(parcel, a);
            } else if (a2 == 2) {
                i2 = C2159b.m8885k(parcel, a);
            } else if (a2 == 3) {
                pendingIntent = (PendingIntent) C2159b.m8870a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 4) {
                C2159b.m8889o(parcel, a);
            } else {
                str = C2159b.m8874b(parcel, a);
            }
        }
        C2159b.m8878d(parcel, b);
        return new C2078b(i, i2, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2078b[i];
    }
}
