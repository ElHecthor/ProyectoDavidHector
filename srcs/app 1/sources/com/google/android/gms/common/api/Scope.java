package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

public final class Scope extends C2158a implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new C2076p();

    /* renamed from: f */
    private final int f5794f;

    /* renamed from: g */
    private final String f5795g;

    Scope(int i, String str) {
        C2148s.m8836a(str, (Object) "scopeUri must not be null or empty");
        this.f5794f = i;
        this.f5795g = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    /* renamed from: e */
    public final String mo6577e() {
        return this.f5795g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f5795g.equals(((Scope) obj).f5795g);
    }

    public final int hashCode() {
        return this.f5795g.hashCode();
    }

    public final String toString() {
        return this.f5795g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, this.f5794f);
        C2161c.m8902a(parcel, 2, mo6577e(), false);
        C2161c.m8891a(parcel, a);
    }
}
