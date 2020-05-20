package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.measurement.internal.la */
public final class C2376la implements Creator<C2388ma> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2159b.m8873b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        C2478u9 u9Var = null;
        String str3 = null;
        C2435r rVar = null;
        C2435r rVar2 = null;
        C2435r rVar3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            switch (C2159b.m8867a(a)) {
                case 2:
                    str = C2159b.m8874b(parcel2, a);
                    break;
                case 3:
                    str2 = C2159b.m8874b(parcel2, a);
                    break;
                case 4:
                    u9Var = (C2478u9) C2159b.m8870a(parcel2, a, C2478u9.CREATOR);
                    break;
                case 5:
                    j = C2159b.m8886l(parcel2, a);
                    break;
                case 6:
                    z = C2159b.m8879e(parcel2, a);
                    break;
                case 7:
                    str3 = C2159b.m8874b(parcel2, a);
                    break;
                case 8:
                    rVar = (C2435r) C2159b.m8870a(parcel2, a, C2435r.CREATOR);
                    break;
                case 9:
                    j2 = C2159b.m8886l(parcel2, a);
                    break;
                case 10:
                    rVar2 = (C2435r) C2159b.m8870a(parcel2, a, C2435r.CREATOR);
                    break;
                case 11:
                    j3 = C2159b.m8886l(parcel2, a);
                    break;
                case 12:
                    rVar3 = (C2435r) C2159b.m8870a(parcel2, a, C2435r.CREATOR);
                    break;
                default:
                    C2159b.m8889o(parcel2, a);
                    break;
            }
        }
        C2159b.m8878d(parcel2, b);
        C2388ma maVar = new C2388ma(str, str2, u9Var, j, z, str3, rVar, j2, rVar2, j3, rVar3);
        return maVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2388ma[i];
    }
}
