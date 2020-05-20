package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.m */
public final class C2377m extends C2158a implements Iterable<String> {
    public static final Creator<C2377m> CREATOR = new C2402o();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Bundle f6653f;

    C2377m(Bundle bundle) {
        this.f6653f = bundle;
    }

    /* renamed from: a */
    public final int mo7497a() {
        return this.f6653f.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo7498a(String str) {
        return this.f6653f.get(str);
    }

    /* renamed from: b */
    public final Bundle mo7499b() {
        return new Bundle(this.f6653f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Long mo7500b(String str) {
        return Long.valueOf(this.f6653f.getLong(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Double mo7501c(String str) {
        return Double.valueOf(this.f6653f.getDouble(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo7502d(String str) {
        return this.f6653f.getString(str);
    }

    public final Iterator<String> iterator() {
        return new C2413p(this);
    }

    public final String toString() {
        return this.f6653f.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8895a(parcel, 2, mo7499b(), false);
        C2161c.m8891a(parcel, a);
    }
}
