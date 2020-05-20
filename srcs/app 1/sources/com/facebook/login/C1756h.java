package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.C1683q;
import com.facebook.login.C1759j.C1763d;

/* renamed from: com.facebook.login.h */
class C1756h extends C1780p {
    public static final Creator<C1756h> CREATOR = new C1757a();

    /* renamed from: com.facebook.login.h$a */
    static class C1757a implements Creator<C1756h> {
        C1757a() {
        }

        public C1756h createFromParcel(Parcel parcel) {
            return new C1756h(parcel);
        }

        public C1756h[] newArray(int i) {
            return new C1756h[i];
        }
    }

    C1756h(Parcel parcel) {
        super(parcel);
    }

    C1756h(C1759j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6019a(C1763d dVar) {
        String n = C1759j.m7597n();
        Intent b = C1683q.m7307b(this.f5350g.mo6087c(), dVar.mo6105a(), dVar.mo6115h(), n, dVar.mo6117j(), dVar.mo6116i(), dVar.mo6110d(), mo6145a(dVar.mo6108b()), dVar.mo6109c());
        mo6147a("e2e", n);
        return mo6152a(b, C1759j.m7599s());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo6020b() {
        return "katana_proxy_auth";
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
