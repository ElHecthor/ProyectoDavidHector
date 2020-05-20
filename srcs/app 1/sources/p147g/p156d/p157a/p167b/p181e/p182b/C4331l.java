package p147g.p156d.p157a.p167b.p181e.p182b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.internal.C2152u;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: g.d.a.b.e.b.l */
public final class C4331l extends C2158a {
    public static final Creator<C4331l> CREATOR = new C4330k();

    /* renamed from: f */
    private final int f11492f;

    /* renamed from: g */
    private final C2078b f11493g;

    /* renamed from: h */
    private final C2152u f11494h;

    public C4331l(int i) {
        this(new C2078b(8, null), null);
    }

    C4331l(int i, C2078b bVar, C2152u uVar) {
        this.f11492f = i;
        this.f11493g = bVar;
        this.f11494h = uVar;
    }

    private C4331l(C2078b bVar, C2152u uVar) {
        this(1, bVar, null);
    }

    /* renamed from: e */
    public final C2078b mo12993e() {
        return this.f11493g;
    }

    /* renamed from: f */
    public final C2152u mo12994f() {
        return this.f11494h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, this.f11492f);
        C2161c.m8897a(parcel, 2, (Parcelable) this.f11493g, i, false);
        C2161c.m8897a(parcel, 3, (Parcelable) this.f11494h, i, false);
        C2161c.m8891a(parcel, a);
    }
}
