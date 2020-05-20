package p147g.p156d.p157a.p167b.p181e.p182b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C2071k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: g.d.a.b.e.b.c */
public final class C4322c extends C2158a implements C2071k {
    public static final Creator<C4322c> CREATOR = new C4321b();

    /* renamed from: f */
    private final int f11487f;

    /* renamed from: g */
    private int f11488g;

    /* renamed from: h */
    private Intent f11489h;

    public C4322c() {
        this(0, null);
    }

    C4322c(int i, int i2, Intent intent) {
        this.f11487f = i;
        this.f11488g = i2;
        this.f11489h = intent;
    }

    private C4322c(int i, Intent intent) {
        this(2, 0, null);
    }

    /* renamed from: c */
    public final Status mo6518c() {
        return this.f11488g == 0 ? Status.f5796j : Status.f5800n;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, this.f11487f);
        C2161c.m8893a(parcel, 2, this.f11488g);
        C2161c.m8897a(parcel, 3, (Parcelable) this.f11489h, i, false);
        C2161c.m8891a(parcel, a);
    }
}
