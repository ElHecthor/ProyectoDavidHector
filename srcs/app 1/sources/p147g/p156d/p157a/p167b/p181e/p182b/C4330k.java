package p147g.p156d.p157a.p167b.p181e.p182b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.internal.C2152u;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: g.d.a.b.e.b.k */
public final class C4330k implements Creator<C4331l> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        C2078b bVar = null;
        C2152u uVar = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 1) {
                i = C2159b.m8885k(parcel, a);
            } else if (a2 == 2) {
                bVar = (C2078b) C2159b.m8870a(parcel, a, C2078b.CREATOR);
            } else if (a2 != 3) {
                C2159b.m8889o(parcel, a);
            } else {
                uVar = (C2152u) C2159b.m8870a(parcel, a, C2152u.CREATOR);
            }
        }
        C2159b.m8878d(parcel, b);
        return new C4331l(i, bVar, uVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4331l[i];
    }
}
