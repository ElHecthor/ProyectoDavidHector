package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.fragment.app.C0429d;
import androidx.fragment.app.Fragment;
import com.facebook.C1499a;
import com.facebook.C1631i;
import com.facebook.common.C1517d;
import com.facebook.internal.C1647d.C1649b;
import com.facebook.internal.C1698v;
import com.facebook.internal.C1703w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.j */
class C1759j implements Parcelable {
    public static final Creator<C1759j> CREATOR = new C1760a();

    /* renamed from: f */
    C1778n[] f5299f;

    /* renamed from: g */
    int f5300g = -1;

    /* renamed from: h */
    Fragment f5301h;

    /* renamed from: i */
    C1762c f5302i;

    /* renamed from: j */
    C1761b f5303j;

    /* renamed from: k */
    boolean f5304k;

    /* renamed from: l */
    C1763d f5305l;

    /* renamed from: m */
    Map<String, String> f5306m;

    /* renamed from: n */
    Map<String, String> f5307n;

    /* renamed from: o */
    private C1771l f5308o;

    /* renamed from: com.facebook.login.j$a */
    static class C1760a implements Creator<C1759j> {
        C1760a() {
        }

        public C1759j createFromParcel(Parcel parcel) {
            return new C1759j(parcel);
        }

        public C1759j[] newArray(int i) {
            return new C1759j[i];
        }
    }

    /* renamed from: com.facebook.login.j$b */
    interface C1761b {
        /* renamed from: a */
        void mo6102a();

        /* renamed from: b */
        void mo6103b();
    }

    /* renamed from: com.facebook.login.j$c */
    public interface C1762c {
        /* renamed from: a */
        void mo6104a(C1765e eVar);
    }

    /* renamed from: com.facebook.login.j$d */
    public static class C1763d implements Parcelable {
        public static final Creator<C1763d> CREATOR = new C1764a();

        /* renamed from: f */
        private final C1758i f5309f;

        /* renamed from: g */
        private Set<String> f5310g;

        /* renamed from: h */
        private final C1736b f5311h;

        /* renamed from: i */
        private final String f5312i;

        /* renamed from: j */
        private final String f5313j;

        /* renamed from: k */
        private boolean f5314k;

        /* renamed from: l */
        private String f5315l;

        /* renamed from: m */
        private String f5316m;

        /* renamed from: n */
        private String f5317n;

        /* renamed from: com.facebook.login.j$d$a */
        static class C1764a implements Creator<C1763d> {
            C1764a() {
            }

            public C1763d createFromParcel(Parcel parcel) {
                return new C1763d(parcel, null);
            }

            public C1763d[] newArray(int i) {
                return new C1763d[i];
            }
        }

        private C1763d(Parcel parcel) {
            boolean z = false;
            this.f5314k = false;
            String readString = parcel.readString();
            C1736b bVar = null;
            this.f5309f = readString != null ? C1758i.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f5310g = new HashSet(arrayList);
            String readString2 = parcel.readString();
            if (readString2 != null) {
                bVar = C1736b.valueOf(readString2);
            }
            this.f5311h = bVar;
            this.f5312i = parcel.readString();
            this.f5313j = parcel.readString();
            if (parcel.readByte() != 0) {
                z = true;
            }
            this.f5314k = z;
            this.f5315l = parcel.readString();
            this.f5316m = parcel.readString();
            this.f5317n = parcel.readString();
        }

        /* synthetic */ C1763d(Parcel parcel, C1760a aVar) {
            this(parcel);
        }

        C1763d(C1758i iVar, Set<String> set, C1736b bVar, String str, String str2, String str3) {
            this.f5314k = false;
            this.f5309f = iVar;
            if (set == null) {
                set = new HashSet<>();
            }
            this.f5310g = set;
            this.f5311h = bVar;
            this.f5316m = str;
            this.f5312i = str2;
            this.f5313j = str3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo6105a() {
            return this.f5312i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6106a(Set<String> set) {
            C1703w.m7423a((Object) set, "permissions");
            this.f5310g = set;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6107a(boolean z) {
            this.f5314k = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public String mo6108b() {
            return this.f5313j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public String mo6109c() {
            return this.f5316m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C1736b mo6110d() {
            return this.f5311h;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public String mo6112e() {
            return this.f5317n;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public String mo6113f() {
            return this.f5315l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public C1758i mo6114g() {
            return this.f5309f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public Set<String> mo6115h() {
            return this.f5310g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public boolean mo6116i() {
            for (String a : this.f5310g) {
                if (C1772m.m7674a(a)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public boolean mo6117j() {
            return this.f5314k;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1758i iVar = this.f5309f;
            String str = null;
            parcel.writeString(iVar != null ? iVar.name() : null);
            parcel.writeStringList(new ArrayList(this.f5310g));
            C1736b bVar = this.f5311h;
            if (bVar != null) {
                str = bVar.name();
            }
            parcel.writeString(str);
            parcel.writeString(this.f5312i);
            parcel.writeString(this.f5313j);
            parcel.writeByte(this.f5314k ? (byte) 1 : 0);
            parcel.writeString(this.f5315l);
            parcel.writeString(this.f5316m);
            parcel.writeString(this.f5317n);
        }
    }

    /* renamed from: com.facebook.login.j$e */
    public static class C1765e implements Parcelable {
        public static final Creator<C1765e> CREATOR = new C1766a();

        /* renamed from: f */
        final C1767b f5318f;

        /* renamed from: g */
        final C1499a f5319g;

        /* renamed from: h */
        final String f5320h;

        /* renamed from: i */
        final String f5321i;

        /* renamed from: j */
        final C1763d f5322j;

        /* renamed from: k */
        public Map<String, String> f5323k;

        /* renamed from: l */
        public Map<String, String> f5324l;

        /* renamed from: com.facebook.login.j$e$a */
        static class C1766a implements Creator<C1765e> {
            C1766a() {
            }

            public C1765e createFromParcel(Parcel parcel) {
                return new C1765e(parcel, null);
            }

            public C1765e[] newArray(int i) {
                return new C1765e[i];
            }
        }

        /* renamed from: com.facebook.login.j$e$b */
        enum C1767b {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: f */
            private final String f5329f;

            private C1767b(String str) {
                this.f5329f = str;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: f */
            public String mo6125f() {
                return this.f5329f;
            }
        }

        private C1765e(Parcel parcel) {
            this.f5318f = C1767b.valueOf(parcel.readString());
            this.f5319g = (C1499a) parcel.readParcelable(C1499a.class.getClassLoader());
            this.f5320h = parcel.readString();
            this.f5321i = parcel.readString();
            this.f5322j = (C1763d) parcel.readParcelable(C1763d.class.getClassLoader());
            this.f5323k = C1698v.m7370a(parcel);
            this.f5324l = C1698v.m7370a(parcel);
        }

        /* synthetic */ C1765e(Parcel parcel, C1760a aVar) {
            this(parcel);
        }

        C1765e(C1763d dVar, C1767b bVar, C1499a aVar, String str, String str2) {
            C1703w.m7423a((Object) bVar, "code");
            this.f5322j = dVar;
            this.f5319g = aVar;
            this.f5320h = str;
            this.f5318f = bVar;
            this.f5321i = str2;
        }

        /* renamed from: a */
        static C1765e m7637a(C1763d dVar, C1499a aVar) {
            C1765e eVar = new C1765e(dVar, C1767b.SUCCESS, aVar, null, null);
            return eVar;
        }

        /* renamed from: a */
        static C1765e m7638a(C1763d dVar, String str) {
            C1765e eVar = new C1765e(dVar, C1767b.CANCEL, null, str, null);
            return eVar;
        }

        /* renamed from: a */
        static C1765e m7639a(C1763d dVar, String str, String str2) {
            return m7640a(dVar, str, str2, null);
        }

        /* renamed from: a */
        static C1765e m7640a(C1763d dVar, String str, String str2, String str3) {
            String[] strArr = {str, str2};
            C1763d dVar2 = dVar;
            C1765e eVar = new C1765e(dVar2, C1767b.ERROR, null, TextUtils.join(": ", C1698v.m7369a((T[]) strArr)), str3);
            return eVar;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5318f.name());
            parcel.writeParcelable(this.f5319g, i);
            parcel.writeString(this.f5320h);
            parcel.writeString(this.f5321i);
            parcel.writeParcelable(this.f5322j, i);
            C1698v.m7377a(parcel, this.f5323k);
            C1698v.m7377a(parcel, this.f5324l);
        }
    }

    public C1759j(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(C1778n.class.getClassLoader());
        this.f5299f = new C1778n[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            C1778n[] nVarArr = this.f5299f;
            nVarArr[i] = (C1778n) readParcelableArray[i];
            nVarArr[i].mo6146a(this);
        }
        this.f5300g = parcel.readInt();
        this.f5305l = (C1763d) parcel.readParcelable(C1763d.class.getClassLoader());
        this.f5306m = C1698v.m7370a(parcel);
        this.f5307n = C1698v.m7370a(parcel);
    }

    public C1759j(Fragment fragment) {
        this.f5301h = fragment;
    }

    /* renamed from: a */
    private void m7592a(String str, C1765e eVar, Map<String, String> map) {
        m7593a(str, eVar.f5318f.mo6125f(), eVar.f5320h, eVar.f5321i, map);
    }

    /* renamed from: a */
    private void m7593a(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f5305l == null) {
            m7598r().mo6130a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m7598r().mo6131a(this.f5305l.mo6108b(), str, str2, str3, str4, map);
        }
    }

    /* renamed from: a */
    private void m7594a(String str, String str2, boolean z) {
        if (this.f5306m == null) {
            this.f5306m = new HashMap();
        }
        if (this.f5306m.containsKey(str) && z) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.f5306m.get(str));
            sb.append(",");
            sb.append(str2);
            str2 = sb.toString();
        }
        this.f5306m.put(str, str2);
    }

    /* renamed from: d */
    private void m7595d(C1765e eVar) {
        C1762c cVar = this.f5302i;
        if (cVar != null) {
            cVar.mo6104a(eVar);
        }
    }

    /* renamed from: m */
    private void m7596m() {
        mo6082a(C1765e.m7639a(this.f5305l, "Login attempt failed.", null));
    }

    /* renamed from: n */
    static String m7597n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: r */
    private C1771l m7598r() {
        C1771l lVar = this.f5308o;
        if (lVar == null || !lVar.mo6127a().equals(this.f5305l.mo6105a())) {
            this.f5308o = new C1771l(mo6087c(), this.f5305l.mo6105a());
        }
        return this.f5308o;
    }

    /* renamed from: s */
    public static int m7599s() {
        return C1649b.Login.mo5891f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo6076a(String str) {
        return mo6087c().checkCallingOrSelfPermission(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6077a() {
        if (this.f5300g >= 0) {
            mo6090d().mo6060a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6078a(Fragment fragment) {
        if (this.f5301h == null) {
            this.f5301h = fragment;
            return;
        }
        throw new C1631i("Can't set fragment once it is already set.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6079a(C1761b bVar) {
        this.f5303j = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6080a(C1762c cVar) {
        this.f5302i = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6081a(C1763d dVar) {
        if (dVar != null) {
            if (this.f5305l != null) {
                throw new C1631i("Attempted to authorize while a request is pending.");
            } else if (!C1499a.m6760s() || mo6085b()) {
                this.f5305l = dVar;
                this.f5299f = mo6086b(dVar);
                mo6098k();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6082a(C1765e eVar) {
        C1778n d = mo6090d();
        if (d != null) {
            m7592a(d.mo6020b(), eVar, d.f5349f);
        }
        Map<String, String> map = this.f5306m;
        if (map != null) {
            eVar.f5323k = map;
        }
        Map<String, String> map2 = this.f5307n;
        if (map2 != null) {
            eVar.f5324l = map2;
        }
        this.f5299f = null;
        this.f5300g = -1;
        this.f5305l = null;
        this.f5306m = null;
        m7595d(eVar);
    }

    /* renamed from: a */
    public boolean mo6083a(int i, int i2, Intent intent) {
        if (this.f5305l != null) {
            return mo6090d().mo6018a(i, i2, intent);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6084b(C1765e eVar) {
        if (eVar.f5319g == null || !C1499a.m6760s()) {
            mo6082a(eVar);
        } else {
            mo6089c(eVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo6085b() {
        if (this.f5304k) {
            return true;
        }
        if (mo6076a("android.permission.INTERNET") != 0) {
            C0429d c = mo6087c();
            mo6082a(C1765e.m7639a(this.f5305l, c.getString(C1517d.com_facebook_internet_permission_error_title), c.getString(C1517d.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.f5304k = true;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1778n[] mo6086b(C1763d dVar) {
        ArrayList arrayList = new ArrayList();
        C1758i g = dVar.mo6114g();
        if (g.mo6073i()) {
            arrayList.add(new C1752g(this));
        }
        if (g.mo6074j()) {
            arrayList.add(new C1756h(this));
        }
        if (g.mo6072h()) {
            arrayList.add(new C1749e(this));
        }
        if (g.mo6070f()) {
            arrayList.add(new C1734a(this));
        }
        if (g.mo6075l()) {
            arrayList.add(new C1783s(this));
        }
        if (g.mo6071g()) {
            arrayList.add(new C1747d(this));
        }
        C1778n[] nVarArr = new C1778n[arrayList.size()];
        arrayList.toArray(nVarArr);
        return nVarArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0429d mo6087c() {
        return this.f5301h.mo2540f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo6088c(C1763d dVar) {
        if (!mo6093f()) {
            mo6081a(dVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo6089c(C1765e eVar) {
        C1765e eVar2;
        if (eVar.f5319g != null) {
            C1499a r = C1499a.m6759r();
            C1499a aVar = eVar.f5319g;
            if (!(r == null || aVar == null)) {
                try {
                    if (r.mo5693j().equals(aVar.mo5693j())) {
                        eVar2 = C1765e.m7637a(this.f5305l, eVar.f5319g);
                        mo6082a(eVar2);
                        return;
                    }
                } catch (Exception e) {
                    mo6082a(C1765e.m7639a(this.f5305l, "Caught exception", e.getMessage()));
                    return;
                }
            }
            eVar2 = C1765e.m7639a(this.f5305l, "User logged in as different Facebook user.", null);
            mo6082a(eVar2);
            return;
        }
        throw new C1631i("Can't validate without a token");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C1778n mo6090d() {
        int i = this.f5300g;
        if (i >= 0) {
            return this.f5299f[i];
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Fragment mo6092e() {
        return this.f5301h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo6093f() {
        return this.f5305l != null && this.f5300g >= 0;
    }

    /* renamed from: g */
    public C1763d mo6094g() {
        return this.f5305l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo6095h() {
        C1761b bVar = this.f5303j;
        if (bVar != null) {
            bVar.mo6102a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo6096i() {
        C1761b bVar = this.f5303j;
        if (bVar != null) {
            bVar.mo6103b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo6097j() {
        C1778n d = mo6090d();
        if (!d.mo6149c() || mo6085b()) {
            boolean a = d.mo6019a(this.f5305l);
            C1771l r = m7598r();
            String b = this.f5305l.mo6108b();
            if (a) {
                r.mo6133b(b, d.mo6020b());
            } else {
                r.mo6129a(b, d.mo6020b());
                m7594a("not_tried", d.mo6020b(), true);
            }
            return a;
        }
        m7594a("no_internet_permission", "1", false);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo6098k() {
        if (this.f5300g >= 0) {
            m7593a(mo6090d().mo6020b(), "skipped", null, null, mo6090d().f5349f);
        }
        do {
            C1778n[] nVarArr = this.f5299f;
            if (nVarArr != null) {
                int i = this.f5300g;
                if (i < nVarArr.length - 1) {
                    this.f5300g = i + 1;
                }
            }
            if (this.f5305l != null) {
                m7596m();
            }
            return;
        } while (!mo6097j());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f5299f, i);
        parcel.writeInt(this.f5300g);
        parcel.writeParcelable(this.f5305l, i);
        C1698v.m7377a(parcel, this.f5306m);
        C1698v.m7377a(parcel, this.f5307n);
    }
}
