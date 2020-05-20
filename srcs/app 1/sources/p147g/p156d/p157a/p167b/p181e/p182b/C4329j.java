package p147g.p156d.p157a.p167b.p181e.p182b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2150t;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: g.d.a.b.e.b.j */
public final class C4329j extends C2158a {
    public static final Creator<C4329j> CREATOR = new C4328i();

    /* renamed from: f */
    private final int f11490f;

    /* renamed from: g */
    private final C2150t f11491g;

    C4329j(int i, C2150t tVar) {
        this.f11490f = i;
        this.f11491g = tVar;
    }

    public C4329j(C2150t tVar) {
        this(1, tVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, this.f11490f);
        C2161c.m8897a(parcel, 2, (Parcelable) this.f11491g, i, false);
        C2161c.m8891a(parcel, a);
    }
}
