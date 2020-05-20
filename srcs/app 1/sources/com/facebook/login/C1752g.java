package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.C1519d;
import com.facebook.C1631i;
import com.facebook.internal.C1692r.C1694b;
import com.facebook.internal.C1698v;
import com.facebook.internal.C1698v.C1701c;
import com.facebook.login.C1759j.C1763d;
import com.facebook.login.C1759j.C1765e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.g */
class C1752g extends C1778n {
    public static final Creator<C1752g> CREATOR = new C1755c();

    /* renamed from: h */
    private C1751f f5279h;

    /* renamed from: com.facebook.login.g$a */
    class C1753a implements C1694b {

        /* renamed from: a */
        final /* synthetic */ C1763d f5280a;

        C1753a(C1763d dVar) {
            this.f5280a = dVar;
        }

        /* renamed from: a */
        public void mo5942a(Bundle bundle) {
            C1752g.this.mo6062b(this.f5280a, bundle);
        }
    }

    /* renamed from: com.facebook.login.g$b */
    class C1754b implements C1701c {

        /* renamed from: a */
        final /* synthetic */ Bundle f5282a;

        /* renamed from: b */
        final /* synthetic */ C1763d f5283b;

        C1754b(Bundle bundle, C1763d dVar) {
            this.f5282a = bundle;
            this.f5283b = dVar;
        }

        /* renamed from: a */
        public void mo5945a(C1631i iVar) {
            C1759j jVar = C1752g.this.f5350g;
            jVar.mo6082a(C1765e.m7639a(jVar.mo6094g(), "Caught exception", iVar.getMessage()));
        }

        /* renamed from: a */
        public void mo5946a(JSONObject jSONObject) {
            try {
                this.f5282a.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                C1752g.this.mo6063c(this.f5283b, this.f5282a);
            } catch (JSONException e) {
                C1759j jVar = C1752g.this.f5350g;
                jVar.mo6082a(C1765e.m7639a(jVar.mo6094g(), "Caught exception", e.getMessage()));
            }
        }
    }

    /* renamed from: com.facebook.login.g$c */
    static class C1755c implements Creator {
        C1755c() {
        }

        public C1752g createFromParcel(Parcel parcel) {
            return new C1752g(parcel);
        }

        public C1752g[] newArray(int i) {
            return new C1752g[i];
        }
    }

    C1752g(Parcel parcel) {
        super(parcel);
    }

    C1752g(C1759j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6060a() {
        C1751f fVar = this.f5279h;
        if (fVar != null) {
            fVar.mo5934a();
            this.f5279h.mo5937a((C1694b) null);
            this.f5279h = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6061a(C1763d dVar, Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.isEmpty()) {
            this.f5350g.mo6095h();
            C1698v.m7379a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), (C1701c) new C1754b(bundle, dVar));
            return;
        }
        mo6063c(dVar, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6019a(C1763d dVar) {
        C1751f fVar = new C1751f(this.f5350g.mo6087c(), dVar.mo6105a());
        this.f5279h = fVar;
        if (!fVar.mo5938b()) {
            return false;
        }
        this.f5350g.mo6095h();
        this.f5279h.mo5937a((C1694b) new C1753a(dVar));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo6020b() {
        return "get_token";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6062b(C1763d dVar, Bundle bundle) {
        C1751f fVar = this.f5279h;
        if (fVar != null) {
            fVar.mo5937a((C1694b) null);
        }
        this.f5279h = null;
        this.f5350g.mo6096i();
        if (bundle != null) {
            ArrayList stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> h = dVar.mo6115h();
            if (stringArrayList == null || (h != null && !stringArrayList.containsAll(h))) {
                HashSet hashSet = new HashSet();
                for (String str : h) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    mo6147a("new_permissions", TextUtils.join(",", hashSet));
                }
                dVar.mo6106a((Set<String>) hashSet);
            } else {
                mo6061a(dVar, bundle);
                return;
            }
        }
        this.f5350g.mo6098k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo6063c(C1763d dVar, Bundle bundle) {
        this.f5350g.mo6084b(C1765e.m7637a(this.f5350g.mo6094g(), C1778n.m7692a(bundle, C1519d.FACEBOOK_APPLICATION_SERVICE, dVar.mo6105a())));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
