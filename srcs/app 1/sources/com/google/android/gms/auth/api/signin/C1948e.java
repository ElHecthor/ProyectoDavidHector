package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p048x.C2159b;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.signin.e */
public final class C1948e implements Creator<GoogleSignInAccount> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2159b.m8873b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = C2159b.m8874b(parcel2, a);
                    break;
                case 4:
                    str3 = C2159b.m8874b(parcel2, a);
                    break;
                case 5:
                    str4 = C2159b.m8874b(parcel2, a);
                    break;
                case 6:
                    uri = (Uri) C2159b.m8870a(parcel2, a, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C2159b.m8874b(parcel2, a);
                    break;
                case 8:
                    j = C2159b.m8886l(parcel2, a);
                    break;
                case 9:
                    str6 = C2159b.m8874b(parcel2, a);
                    break;
                case 10:
                    list = C2159b.m8877c(parcel2, a, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C2159b.m8874b(parcel2, a);
                    break;
                case 12:
                    str8 = C2159b.m8874b(parcel2, a);
                    break;
                default:
                    C2159b.m8889o(parcel2, a);
                    break;
            }
        }
        C2159b.m8878d(parcel2, b);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
        return googleSignInAccount;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
