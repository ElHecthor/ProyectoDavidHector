package com.facebook.share.p046b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.p046b.C1838i.C1839a;

/* renamed from: com.facebook.share.b.f */
public final class C1831f extends C1838i<C1831f, C1833b> {
    public static final Creator<C1831f> CREATOR = new C1832a();

    /* renamed from: com.facebook.share.b.f$a */
    static class C1832a implements Creator<C1831f> {
        C1832a() {
        }

        public C1831f createFromParcel(Parcel parcel) {
            return new C1831f(parcel);
        }

        public C1831f[] newArray(int i) {
            return new C1831f[i];
        }
    }

    /* renamed from: com.facebook.share.b.f$b */
    public static final class C1833b extends C1839a<C1831f, C1833b> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1833b mo6269a(Parcel parcel) {
            return mo6270a((C1831f) parcel.readParcelable(C1831f.class.getClassLoader()));
        }

        /* renamed from: a */
        public C1833b mo6270a(C1831f fVar) {
            if (fVar == null) {
                return this;
            }
            super.mo6284a(fVar);
            C1833b bVar = this;
            bVar.mo6271a(fVar.mo6266c());
            return bVar;
        }

        /* renamed from: a */
        public C1833b mo6271a(String str) {
            mo6285a("og:type", str);
            return this;
        }

        /* renamed from: a */
        public C1831f mo6272a() {
            return new C1831f(this, null);
        }
    }

    C1831f(Parcel parcel) {
        super(parcel);
    }

    private C1831f(C1833b bVar) {
        super((C1839a<P, E>) bVar);
    }

    /* synthetic */ C1831f(C1833b bVar, C1832a aVar) {
        this(bVar);
    }

    /* renamed from: c */
    public String mo6266c() {
        return mo6280b("og:type");
    }
}
