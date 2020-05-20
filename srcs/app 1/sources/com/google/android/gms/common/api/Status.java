package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2141q;
import com.google.android.gms.common.internal.C2141q.C2142a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

public final class Status extends C2158a implements C2071k, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new C2077q();

    /* renamed from: j */
    public static final Status f5796j = new Status(0);

    /* renamed from: k */
    public static final Status f5797k = new Status(14);

    /* renamed from: l */
    public static final Status f5798l = new Status(8);

    /* renamed from: m */
    public static final Status f5799m = new Status(15);

    /* renamed from: n */
    public static final Status f5800n = new Status(16);

    /* renamed from: f */
    private final int f5801f;

    /* renamed from: g */
    private final int f5802g;

    /* renamed from: h */
    private final String f5803h;

    /* renamed from: i */
    private final PendingIntent f5804i;

    static {
        new Status(17);
        new Status(18);
    }

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f5801f = i;
        this.f5802g = i2;
        this.f5803h = str;
        this.f5804i = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* renamed from: c */
    public final Status mo6518c() {
        return this;
    }

    /* renamed from: e */
    public final int mo6582e() {
        return this.f5802g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5801f == status.f5801f && this.f5802g == status.f5802g && C2141q.m8823a(this.f5803h, status.f5803h) && C2141q.m8823a(this.f5804i, status.f5804i);
    }

    /* renamed from: f */
    public final String mo6584f() {
        return this.f5803h;
    }

    /* renamed from: g */
    public final boolean mo6585g() {
        return this.f5804i != null;
    }

    /* renamed from: h */
    public final boolean mo6586h() {
        return this.f5802g <= 0;
    }

    public final int hashCode() {
        return C2141q.m8821a(Integer.valueOf(this.f5801f), Integer.valueOf(this.f5802g), this.f5803h, this.f5804i);
    }

    /* renamed from: k */
    public final String mo6588k() {
        String str = this.f5803h;
        return str != null ? str : C1997d.m8343a(this.f5802g);
    }

    public final String toString() {
        C2142a a = C2141q.m8822a((Object) this);
        a.mo6935a("statusCode", mo6588k());
        a.mo6935a("resolution", this.f5804i);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, mo6582e());
        C2161c.m8902a(parcel, 2, mo6584f(), false);
        C2161c.m8897a(parcel, 3, (Parcelable) this.f5804i, i, false);
        C2161c.m8893a(parcel, 1000, this.f5801f);
        C2161c.m8891a(parcel, a);
    }
}
