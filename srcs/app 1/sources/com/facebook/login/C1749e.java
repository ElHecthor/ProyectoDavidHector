package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.C1683q;
import com.facebook.login.C1759j.C1763d;
import java.util.Collection;

/* renamed from: com.facebook.login.e */
class C1749e extends C1780p {
    public static final Creator<C1749e> CREATOR = new C1750a();

    /* renamed from: com.facebook.login.e$a */
    static class C1750a implements Creator<C1749e> {
        C1750a() {
        }

        public C1749e createFromParcel(Parcel parcel) {
            return new C1749e(parcel);
        }

        public C1749e[] newArray(int i) {
            return new C1749e[i];
        }
    }

    C1749e(Parcel parcel) {
        super(parcel);
    }

    C1749e(C1759j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6019a(C1763d dVar) {
        String n = C1759j.m7597n();
        Intent a = C1683q.m7297a((Context) this.f5350g.mo6087c(), dVar.mo6105a(), (Collection<String>) dVar.mo6115h(), n, dVar.mo6117j(), dVar.mo6116i(), dVar.mo6110d(), mo6145a(dVar.mo6108b()), dVar.mo6109c());
        mo6147a("e2e", n);
        return mo6152a(a, C1759j.m7599s());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo6020b() {
        return "fb_lite_login";
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
