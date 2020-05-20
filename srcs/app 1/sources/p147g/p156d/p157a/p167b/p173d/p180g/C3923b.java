package p147g.p156d.p157a.p167b.p173d.p180g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: g.d.a.b.d.g.b */
public final class C3923b extends C2158a {
    public static final Creator<C3923b> CREATOR = new C3977e();

    /* renamed from: f */
    public final long f10817f;

    /* renamed from: g */
    public final long f10818g;

    /* renamed from: h */
    public final boolean f10819h;

    /* renamed from: i */
    public final String f10820i;

    /* renamed from: j */
    public final String f10821j;

    /* renamed from: k */
    public final String f10822k;

    /* renamed from: l */
    public final Bundle f10823l;

    public C3923b(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f10817f = j;
        this.f10818g = j2;
        this.f10819h = z;
        this.f10820i = str;
        this.f10821j = str2;
        this.f10822k = str3;
        this.f10823l = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8894a(parcel, 1, this.f10817f);
        C2161c.m8894a(parcel, 2, this.f10818g);
        C2161c.m8904a(parcel, 3, this.f10819h);
        C2161c.m8902a(parcel, 4, this.f10820i, false);
        C2161c.m8902a(parcel, 5, this.f10821j, false);
        C2161c.m8902a(parcel, 6, this.f10822k, false);
        C2161c.m8895a(parcel, 7, this.f10823l, false);
        C2161c.m8891a(parcel, a);
    }
}
