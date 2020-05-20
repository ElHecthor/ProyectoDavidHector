package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.C0429d;
import com.facebook.C1519d;
import com.facebook.C1631i;
import com.facebook.internal.C1651f;
import com.facebook.internal.C1698v;
import com.facebook.internal.C1704x;
import com.facebook.internal.C1704x.C1709e;
import com.facebook.internal.C1704x.C1711g;
import com.facebook.login.C1759j.C1763d;

/* renamed from: com.facebook.login.s */
class C1783s extends C1782r {
    public static final Creator<C1783s> CREATOR = new C1785b();

    /* renamed from: i */
    private C1704x f5354i;

    /* renamed from: j */
    private String f5355j;

    /* renamed from: com.facebook.login.s$a */
    class C1784a implements C1711g {

        /* renamed from: a */
        final /* synthetic */ C1763d f5356a;

        C1784a(C1763d dVar) {
            this.f5356a = dVar;
        }

        /* renamed from: a */
        public void mo5894a(Bundle bundle, C1631i iVar) {
            C1783s.this.mo6156b(this.f5356a, bundle, iVar);
        }
    }

    /* renamed from: com.facebook.login.s$b */
    static class C1785b implements Creator<C1783s> {
        C1785b() {
        }

        public C1783s createFromParcel(Parcel parcel) {
            return new C1783s(parcel);
        }

        public C1783s[] newArray(int i) {
            return new C1783s[i];
        }
    }

    /* renamed from: com.facebook.login.s$c */
    static class C1786c extends C1709e {

        /* renamed from: h */
        private String f5358h;

        /* renamed from: i */
        private String f5359i;

        /* renamed from: j */
        private String f5360j = "fbconnect://success";

        public C1786c(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        /* renamed from: a */
        public C1704x mo5971a() {
            Bundle e = mo5975e();
            e.putString("redirect_uri", this.f5360j);
            e.putString("client_id", mo5972b());
            e.putString("e2e", this.f5358h);
            e.putString("response_type", "token,signed_request");
            e.putString("return_scopes", "true");
            e.putString("auth_type", this.f5359i);
            return C1704x.m7433a(mo5973c(), "oauth", e, mo5976f(), mo5974d());
        }

        /* renamed from: a */
        public C1786c mo6160a(String str) {
            this.f5359i = str;
            return this;
        }

        /* renamed from: a */
        public C1786c mo6161a(boolean z) {
            this.f5360j = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        /* renamed from: b */
        public C1786c mo6162b(String str) {
            this.f5358h = str;
            return this;
        }
    }

    C1783s(Parcel parcel) {
        super(parcel);
        this.f5355j = parcel.readString();
    }

    C1783s(C1759j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6060a() {
        C1704x xVar = this.f5354i;
        if (xVar != null) {
            xVar.cancel();
            this.f5354i = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6019a(C1763d dVar) {
        Bundle b = mo6155b(dVar);
        C1784a aVar = new C1784a(dVar);
        String n = C1759j.m7597n();
        this.f5355j = n;
        mo6147a("e2e", n);
        C0429d c = this.f5350g.mo6087c();
        boolean e = C1698v.m7408e((Context) c);
        C1786c cVar = new C1786c(c, dVar.mo6105a(), b);
        cVar.mo6162b(this.f5355j);
        cVar.mo6161a(e);
        cVar.mo6160a(dVar.mo6109c());
        cVar.mo5970a(aVar);
        this.f5354i = cVar.mo5971a();
        C1651f fVar = new C1651f();
        fVar.mo2553i(true);
        fVar.mo5893a(this.f5354i);
        fVar.mo2649a(c.mo2666l(), "FacebookDialogFragment");
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo6020b() {
        return "web_view";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6156b(C1763d dVar, Bundle bundle, C1631i iVar) {
        super.mo6154a(dVar, bundle, iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo6149c() {
        return true;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C1519d mo6023e() {
        return C1519d.WEB_VIEW;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f5355j);
    }
}
