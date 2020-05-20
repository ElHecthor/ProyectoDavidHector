package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.C1954a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p048x.C2159b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.g */
public final class C1950g implements Creator<GoogleSignInOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            switch (C2159b.m8867a(a)) {
                case 1:
                    i = C2159b.m8885k(parcel, a);
                    break;
                case 2:
                    arrayList = C2159b.m8877c(parcel, a, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C2159b.m8870a(parcel, a, Account.CREATOR);
                    break;
                case 4:
                    z = C2159b.m8879e(parcel, a);
                    break;
                case 5:
                    z2 = C2159b.m8879e(parcel, a);
                    break;
                case 6:
                    z3 = C2159b.m8879e(parcel, a);
                    break;
                case 7:
                    str = C2159b.m8874b(parcel, a);
                    break;
                case 8:
                    str2 = C2159b.m8874b(parcel, a);
                    break;
                case 9:
                    arrayList2 = C2159b.m8877c(parcel, a, C1954a.CREATOR);
                    break;
                case 10:
                    str3 = C2159b.m8874b(parcel, a);
                    break;
                default:
                    C2159b.m8889o(parcel, a);
                    break;
            }
        }
        C2159b.m8878d(parcel, b);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
        return googleSignInOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
