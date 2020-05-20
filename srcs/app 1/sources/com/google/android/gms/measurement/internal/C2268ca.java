package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.ca */
public final class C2268ca implements Creator<C2244aa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2159b.m8873b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        List list = null;
        String str8 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
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
                    str3 = C2159b.m8874b(parcel2, a);
                    break;
                case 5:
                    str4 = C2159b.m8874b(parcel2, a);
                    break;
                case 6:
                    j = C2159b.m8886l(parcel2, a);
                    break;
                case 7:
                    j2 = C2159b.m8886l(parcel2, a);
                    break;
                case 8:
                    str5 = C2159b.m8874b(parcel2, a);
                    break;
                case 9:
                    z = C2159b.m8879e(parcel2, a);
                    break;
                case 10:
                    z2 = C2159b.m8879e(parcel2, a);
                    break;
                case 11:
                    j6 = C2159b.m8886l(parcel2, a);
                    break;
                case 12:
                    str6 = C2159b.m8874b(parcel2, a);
                    break;
                case 13:
                    j3 = C2159b.m8886l(parcel2, a);
                    break;
                case 14:
                    j4 = C2159b.m8886l(parcel2, a);
                    break;
                case 15:
                    i = C2159b.m8885k(parcel2, a);
                    break;
                case 16:
                    z3 = C2159b.m8879e(parcel2, a);
                    break;
                case 17:
                    z4 = C2159b.m8879e(parcel2, a);
                    break;
                case 18:
                    z5 = C2159b.m8879e(parcel2, a);
                    break;
                case 19:
                    str7 = C2159b.m8874b(parcel2, a);
                    break;
                case 21:
                    bool = C2159b.m8880f(parcel2, a);
                    break;
                case 22:
                    j5 = C2159b.m8886l(parcel2, a);
                    break;
                case 23:
                    list = C2159b.m8876c(parcel2, a);
                    break;
                case 24:
                    str8 = C2159b.m8874b(parcel2, a);
                    break;
                default:
                    C2159b.m8889o(parcel2, a);
                    break;
            }
        }
        C2159b.m8878d(parcel2, b);
        C2244aa aaVar = new C2244aa(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, list, str8);
        return aaVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2244aa[i];
    }
}
