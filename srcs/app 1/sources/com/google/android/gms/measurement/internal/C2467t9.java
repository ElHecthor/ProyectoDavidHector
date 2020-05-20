package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.measurement.internal.t9 */
public final class C2467t9 implements Creator<C2478u9> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2159b.m8873b(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            switch (C2159b.m8867a(a)) {
                case 1:
                    i = C2159b.m8885k(parcel2, a);
                    break;
                case 2:
                    str = C2159b.m8874b(parcel2, a);
                    break;
                case 3:
                    j = C2159b.m8886l(parcel2, a);
                    break;
                case 4:
                    l = C2159b.m8887m(parcel2, a);
                    break;
                case 5:
                    f = C2159b.m8883i(parcel2, a);
                    break;
                case 6:
                    str2 = C2159b.m8874b(parcel2, a);
                    break;
                case 7:
                    str3 = C2159b.m8874b(parcel2, a);
                    break;
                case 8:
                    d = C2159b.m8881g(parcel2, a);
                    break;
                default:
                    C2159b.m8889o(parcel2, a);
                    break;
            }
        }
        C2159b.m8878d(parcel2, b);
        C2478u9 u9Var = new C2478u9(i, str, j, l, f, str2, str3, d);
        return u9Var;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2478u9[i];
    }
}
