package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: com.google.android.material.datepicker.l */
final class C2646l implements Comparable<C2646l>, Parcelable {
    public static final Creator<C2646l> CREATOR = new C2647a();

    /* renamed from: f */
    private final Calendar f7639f;

    /* renamed from: g */
    private final String f7640g = C2656r.m10962e().format(this.f7639f.getTime());

    /* renamed from: h */
    final int f7641h;

    /* renamed from: i */
    final int f7642i = this.f7639f.get(1);

    /* renamed from: j */
    final int f7643j = this.f7639f.getMaximum(7);

    /* renamed from: k */
    final int f7644k = this.f7639f.getActualMaximum(5);

    /* renamed from: l */
    final long f7645l = this.f7639f.getTimeInMillis();

    /* renamed from: com.google.android.material.datepicker.l$a */
    static class C2647a implements Creator<C2646l> {
        C2647a() {
        }

        public C2646l createFromParcel(Parcel parcel) {
            return C2646l.m10915a(parcel.readInt(), parcel.readInt());
        }

        public C2646l[] newArray(int i) {
            return new C2646l[i];
        }
    }

    private C2646l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = C2656r.m10952a(calendar);
        this.f7639f = a;
        this.f7641h = a.get(2);
    }

    /* renamed from: a */
    static C2646l m10915a(int i, int i2) {
        Calendar d = C2656r.m10961d();
        d.set(1, i);
        d.set(2, i2);
        return new C2646l(d);
    }

    /* renamed from: a */
    static C2646l m10916a(long j) {
        Calendar d = C2656r.m10961d();
        d.setTimeInMillis(j);
        return new C2646l(d);
    }

    /* renamed from: i */
    static C2646l m10917i() {
        return new C2646l(C2656r.m10956b());
    }

    /* renamed from: a */
    public int compareTo(C2646l lVar) {
        return this.f7639f.compareTo(lVar.f7639f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo8656a(int i) {
        Calendar a = C2656r.m10952a(this.f7639f);
        a.set(5, i);
        return a.getTimeInMillis();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo8657b(C2646l lVar) {
        if (this.f7639f instanceof GregorianCalendar) {
            return ((lVar.f7642i - this.f7642i) * 12) + (lVar.f7641h - this.f7641h);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C2646l mo8658b(int i) {
        Calendar a = C2656r.m10952a(this.f7639f);
        a.add(2, i);
        return new C2646l(a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2646l)) {
            return false;
        }
        C2646l lVar = (C2646l) obj;
        if (!(this.f7641h == lVar.f7641h && this.f7642i == lVar.f7642i)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo8662f() {
        int firstDayOfWeek = this.f7639f.get(7) - this.f7639f.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f7643j : firstDayOfWeek;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public String mo8663g() {
        return this.f7640g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public long mo8664h() {
        return this.f7639f.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7641h), Integer.valueOf(this.f7642i)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7642i);
        parcel.writeInt(this.f7641h);
    }
}
