package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.e */
public final class C2183e implements Creator<WakeLockEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2159b.m8873b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            switch (C2159b.m8867a(a)) {
                case 1:
                    i = C2159b.m8885k(parcel2, a);
                    break;
                case 2:
                    j = C2159b.m8886l(parcel2, a);
                    break;
                case 4:
                    str = C2159b.m8874b(parcel2, a);
                    break;
                case 5:
                    i3 = C2159b.m8885k(parcel2, a);
                    break;
                case 6:
                    list = C2159b.m8876c(parcel2, a);
                    break;
                case 8:
                    j2 = C2159b.m8886l(parcel2, a);
                    break;
                case 10:
                    str3 = C2159b.m8874b(parcel2, a);
                    break;
                case 11:
                    i2 = C2159b.m8885k(parcel2, a);
                    break;
                case 12:
                    str2 = C2159b.m8874b(parcel2, a);
                    break;
                case 13:
                    str4 = C2159b.m8874b(parcel2, a);
                    break;
                case 14:
                    i4 = C2159b.m8885k(parcel2, a);
                    break;
                case 15:
                    f = C2159b.m8882h(parcel2, a);
                    break;
                case 16:
                    j3 = C2159b.m8886l(parcel2, a);
                    break;
                case 17:
                    str5 = C2159b.m8874b(parcel2, a);
                    break;
                case 18:
                    z = C2159b.m8879e(parcel2, a);
                    break;
                default:
                    C2159b.m8889o(parcel2, a);
                    break;
            }
        }
        C2159b.m8878d(parcel2, b);
        WakeLockEvent wakeLockEvent = new WakeLockEvent(i, j, i2, str, i3, list, str2, j2, i4, str3, str4, f, j3, str5, z);
        return wakeLockEvent;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
