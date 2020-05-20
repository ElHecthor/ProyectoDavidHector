package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.a */
public final class C2614a implements Parcelable {
    public static final Creator<C2614a> CREATOR = new C2615a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2646l f7548f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2646l f7549g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2646l f7550h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2617c f7551i;

    /* renamed from: j */
    private final int f7552j;

    /* renamed from: k */
    private final int f7553k;

    /* renamed from: com.google.android.material.datepicker.a$a */
    static class C2615a implements Creator<C2614a> {
        C2615a() {
        }

        public C2614a createFromParcel(Parcel parcel) {
            C2614a aVar = new C2614a((C2646l) parcel.readParcelable(C2646l.class.getClassLoader()), (C2646l) parcel.readParcelable(C2646l.class.getClassLoader()), (C2646l) parcel.readParcelable(C2646l.class.getClassLoader()), (C2617c) parcel.readParcelable(C2617c.class.getClassLoader()), null);
            return aVar;
        }

        public C2614a[] newArray(int i) {
            return new C2614a[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    public static final class C2616b {

        /* renamed from: e */
        static final long f7554e = C2656r.m10948a(C2646l.m10915a(1900, 0).f7645l);

        /* renamed from: f */
        static final long f7555f = C2656r.m10948a(C2646l.m10915a(2100, 11).f7645l);

        /* renamed from: a */
        private long f7556a = f7554e;

        /* renamed from: b */
        private long f7557b = f7555f;

        /* renamed from: c */
        private Long f7558c;

        /* renamed from: d */
        private C2617c f7559d = C2622f.m10848a(Long.MIN_VALUE);

        C2616b(C2614a aVar) {
            this.f7556a = aVar.f7548f.f7645l;
            this.f7557b = aVar.f7549g.f7645l;
            this.f7558c = Long.valueOf(aVar.f7550h.f7645l);
            this.f7559d = aVar.f7551i;
        }

        /* renamed from: a */
        public C2616b mo8612a(long j) {
            this.f7558c = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C2614a mo8613a() {
            if (this.f7558c == null) {
                long A0 = C2638i.m10882A0();
                if (this.f7556a > A0 || A0 > this.f7557b) {
                    A0 = this.f7556a;
                }
                this.f7558c = Long.valueOf(A0);
            }
            Bundle bundle = new Bundle();
            String str = "DEEP_COPY_VALIDATOR_KEY";
            bundle.putParcelable(str, this.f7559d);
            C2614a aVar = new C2614a(C2646l.m10916a(this.f7556a), C2646l.m10916a(this.f7557b), C2646l.m10916a(this.f7558c.longValue()), (C2617c) bundle.getParcelable(str), null);
            return aVar;
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    public interface C2617c extends Parcelable {
        /* renamed from: d */
        boolean mo8614d(long j);
    }

    private C2614a(C2646l lVar, C2646l lVar2, C2646l lVar3, C2617c cVar) {
        this.f7548f = lVar;
        this.f7549g = lVar2;
        this.f7550h = lVar3;
        this.f7551i = cVar;
        if (lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (lVar3.compareTo(lVar2) <= 0) {
            this.f7553k = lVar.mo8657b(lVar2) + 1;
            this.f7552j = (lVar2.f7642i - lVar.f7642i) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    /* synthetic */ C2614a(C2646l lVar, C2646l lVar2, C2646l lVar3, C2617c cVar, C2615a aVar) {
        this(lVar, lVar2, lVar3, cVar);
    }

    /* renamed from: a */
    public C2617c mo8600a() {
        return this.f7551i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C2646l mo8601b() {
        return this.f7549g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo8602c() {
        return this.f7553k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C2646l mo8603d() {
        return this.f7550h;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C2646l mo8605e() {
        return this.f7548f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2614a)) {
            return false;
        }
        C2614a aVar = (C2614a) obj;
        if (!this.f7548f.equals(aVar.f7548f) || !this.f7549g.equals(aVar.f7549g) || !this.f7550h.equals(aVar.f7550h) || !this.f7551i.equals(aVar.f7551i)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo8607f() {
        return this.f7552j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7548f, this.f7549g, this.f7550h, this.f7551i});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7548f, 0);
        parcel.writeParcelable(this.f7549g, 0);
        parcel.writeParcelable(this.f7550h, 0);
        parcel.writeParcelable(this.f7551i, 0);
    }
}
