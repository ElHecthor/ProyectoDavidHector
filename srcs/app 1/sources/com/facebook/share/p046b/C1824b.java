package com.facebook.share.p046b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.share.b.b */
public class C1824b implements C1830e {
    public static final Creator<C1824b> CREATOR = new C1825a();

    /* renamed from: f */
    private final String f5442f;

    /* renamed from: com.facebook.share.b.b$a */
    static class C1825a implements Creator<C1824b> {
        C1825a() {
        }

        public C1824b createFromParcel(Parcel parcel) {
            return new C1824b(parcel);
        }

        public C1824b[] newArray(int i) {
            return new C1824b[i];
        }
    }

    /* renamed from: com.facebook.share.b.b$b */
    public static class C1826b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f5443a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1826b mo6258a(Parcel parcel) {
            mo6259a((C1824b) parcel.readParcelable(C1824b.class.getClassLoader()));
            return this;
        }

        /* renamed from: a */
        public C1826b mo6259a(C1824b bVar) {
            if (bVar == null) {
                return this;
            }
            mo6260a(bVar.mo6253a());
            return this;
        }

        /* renamed from: a */
        public C1826b mo6260a(String str) {
            this.f5443a = str;
            return this;
        }

        /* renamed from: a */
        public C1824b mo6261a() {
            return new C1824b(this, null);
        }
    }

    C1824b(Parcel parcel) {
        this.f5442f = parcel.readString();
    }

    private C1824b(C1826b bVar) {
        this.f5442f = bVar.f5443a;
    }

    /* synthetic */ C1824b(C1826b bVar, C1825a aVar) {
        this(bVar);
    }

    /* renamed from: a */
    public String mo6253a() {
        return this.f5442f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5442f);
    }
}
