package p147g.p156d.p157a.p167b.p173d.p180g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: g.d.a.b.d.g.e */
public final class C3977e implements Creator<C3923b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2159b.m8873b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            switch (C2159b.m8867a(a)) {
                case 1:
                    j = C2159b.m8886l(parcel2, a);
                    break;
                case 2:
                    j2 = C2159b.m8886l(parcel2, a);
                    break;
                case 3:
                    z = C2159b.m8879e(parcel2, a);
                    break;
                case 4:
                    str = C2159b.m8874b(parcel2, a);
                    break;
                case 5:
                    str2 = C2159b.m8874b(parcel2, a);
                    break;
                case 6:
                    str3 = C2159b.m8874b(parcel2, a);
                    break;
                case 7:
                    bundle = C2159b.m8869a(parcel2, a);
                    break;
                default:
                    C2159b.m8889o(parcel2, a);
                    break;
            }
        }
        C2159b.m8878d(parcel2, b);
        C3923b bVar = new C3923b(j, j2, z, str, str2, str3, bundle);
        return bVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3923b[i];
    }
}
