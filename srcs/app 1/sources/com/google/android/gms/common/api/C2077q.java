package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.common.api.q */
public final class C2077q implements Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 1) {
                i2 = C2159b.m8885k(parcel, a);
            } else if (a2 == 2) {
                str = C2159b.m8874b(parcel, a);
            } else if (a2 == 3) {
                pendingIntent = (PendingIntent) C2159b.m8870a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 1000) {
                C2159b.m8889o(parcel, a);
            } else {
                i = C2159b.m8885k(parcel, a);
            }
        }
        C2159b.m8878d(parcel, b);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
