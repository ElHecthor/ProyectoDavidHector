package p147g.p156d.p157a.p167b.p181e.p182b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: g.d.a.b.e.b.b */
public final class C4321b implements Creator<C4322c> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 1) {
                i = C2159b.m8885k(parcel, a);
            } else if (a2 == 2) {
                i2 = C2159b.m8885k(parcel, a);
            } else if (a2 != 3) {
                C2159b.m8889o(parcel, a);
            } else {
                intent = (Intent) C2159b.m8870a(parcel, a, Intent.CREATOR);
            }
        }
        C2159b.m8878d(parcel, b);
        return new C4322c(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4322c[i];
    }
}
