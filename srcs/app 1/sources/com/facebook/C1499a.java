package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.internal.C1698v;
import com.facebook.internal.C1703w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a */
public final class C1499a implements Parcelable {
    public static final Creator<C1499a> CREATOR = new C1500a();

    /* renamed from: p */
    private static final Date f4690p;

    /* renamed from: q */
    private static final Date f4691q;

    /* renamed from: r */
    private static final Date f4692r = new Date();

    /* renamed from: s */
    private static final C1519d f4693s = C1519d.FACEBOOK_APPLICATION_WEB;

    /* renamed from: f */
    private final Date f4694f;

    /* renamed from: g */
    private final Set<String> f4695g;

    /* renamed from: h */
    private final Set<String> f4696h;

    /* renamed from: i */
    private final Set<String> f4697i;

    /* renamed from: j */
    private final String f4698j;

    /* renamed from: k */
    private final C1519d f4699k;

    /* renamed from: l */
    private final Date f4700l;

    /* renamed from: m */
    private final String f4701m;

    /* renamed from: n */
    private final String f4702n;

    /* renamed from: o */
    private final Date f4703o;

    /* renamed from: com.facebook.a$a */
    static class C1500a implements Creator {
        C1500a() {
        }

        public C1499a createFromParcel(Parcel parcel) {
            return new C1499a(parcel);
        }

        public C1499a[] newArray(int i) {
            return new C1499a[i];
        }
    }

    /* renamed from: com.facebook.a$b */
    public interface C1501b {
        /* renamed from: a */
        void mo5700a(C1499a aVar);

        /* renamed from: a */
        void mo5701a(C1631i iVar);
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f4690p = date;
        f4691q = date;
    }

    C1499a(Parcel parcel) {
        this.f4694f = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f4695g = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f4696h = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f4697i = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f4698j = parcel.readString();
        this.f4699k = C1519d.valueOf(parcel.readString());
        this.f4700l = new Date(parcel.readLong());
        this.f4701m = parcel.readString();
        this.f4702n = parcel.readString();
        this.f4703o = new Date(parcel.readLong());
    }

    public C1499a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C1519d dVar, Date date, Date date2, Date date3) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        C1703w.m7424a(str, "accessToken");
        C1703w.m7424a(str2, "applicationId");
        C1703w.m7424a(str3, "userId");
        if (date == null) {
            date = f4691q;
        }
        this.f4694f = date;
        if (collection != null) {
            hashSet = new HashSet(collection);
        } else {
            hashSet = new HashSet();
        }
        this.f4695g = Collections.unmodifiableSet(hashSet);
        if (collection2 != null) {
            hashSet2 = new HashSet(collection2);
        } else {
            hashSet2 = new HashSet();
        }
        this.f4696h = Collections.unmodifiableSet(hashSet2);
        if (collection3 != null) {
            hashSet3 = new HashSet(collection3);
        } else {
            hashSet3 = new HashSet();
        }
        this.f4697i = Collections.unmodifiableSet(hashSet3);
        this.f4698j = str;
        if (dVar == null) {
            dVar = f4693s;
        }
        this.f4699k = dVar;
        if (date2 == null) {
            date2 = f4692r;
        }
        this.f4700l = date2;
        this.f4701m = str2;
        this.f4702n = str3;
        if (date3 == null || date3.getTime() == 0) {
            date3 = f4691q;
        }
        this.f4703o = date3;
    }

    /* renamed from: a */
    static C1499a m6752a(Bundle bundle) {
        List a = m6755a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List a2 = m6755a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List a3 = m6755a(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        String a4 = C1844v.m7927a(bundle);
        if (C1698v.m7401c(a4)) {
            a4 = C1787m.m7745f();
        }
        String str = a4;
        String c = C1844v.m7931c(bundle);
        try {
            C1499a aVar = new C1499a(c, str, C1698v.m7372a(c).getString("id"), a, a2, a3, C1844v.m7930b(bundle), C1844v.m7928a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), C1844v.m7928a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), null);
            return aVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static C1499a m6753a(C1499a aVar) {
        C1499a aVar2 = new C1499a(aVar.f4698j, aVar.f4701m, aVar.mo5693j(), aVar.mo5689g(), aVar.mo5683c(), aVar.mo5684d(), aVar.f4699k, new Date(), new Date(), aVar.f4703o);
        return aVar2;
    }

    /* renamed from: a */
    static C1499a m6754a(JSONObject jSONObject) {
        if (jSONObject.getInt("version") <= 1) {
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            C1519d valueOf = C1519d.valueOf(jSONObject.getString("source"));
            String string2 = jSONObject.getString("application_id");
            String string3 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
            C1499a aVar = new C1499a(string, string2, string3, C1698v.m7368a(jSONArray), C1698v.m7368a(jSONArray2), optJSONArray == null ? new ArrayList() : C1698v.m7368a(optJSONArray), valueOf, date, date2, date3);
            return aVar;
        }
        throw new C1631i("Unknown AccessToken serialization format.");
    }

    /* renamed from: a */
    static List<String> m6755a(Bundle bundle, String str) {
        ArrayList stringArrayList = bundle.getStringArrayList(str);
        return stringArrayList == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    /* renamed from: a */
    private void m6756a(StringBuilder sb) {
        String str;
        sb.append(" permissions:");
        if (this.f4695g == null) {
            str = "null";
        } else {
            sb.append("[");
            sb.append(TextUtils.join(", ", this.f4695g));
            str = "]";
        }
        sb.append(str);
    }

    /* renamed from: b */
    public static void m6757b(C1499a aVar) {
        C1507c.m6802e().mo5720a(aVar);
    }

    /* renamed from: n */
    static void m6758n() {
        C1499a c = C1507c.m6802e().mo5722c();
        if (c != null) {
            m6757b(m6753a(c));
        }
    }

    /* renamed from: r */
    public static C1499a m6759r() {
        return C1507c.m6802e().mo5722c();
    }

    /* renamed from: s */
    public static boolean m6760s() {
        C1499a c = C1507c.m6802e().mo5722c();
        return c != null && !c.mo5694k();
    }

    /* renamed from: t */
    private String m6761t() {
        return this.f4698j == null ? "null" : C1787m.m7737a(C1845w.f5469g) ? this.f4698j : "ACCESS_TOKEN_REMOVED";
    }

    /* renamed from: a */
    public String mo5681a() {
        return this.f4701m;
    }

    /* renamed from: b */
    public Date mo5682b() {
        return this.f4703o;
    }

    /* renamed from: c */
    public Set<String> mo5683c() {
        return this.f4696h;
    }

    /* renamed from: d */
    public Set<String> mo5684d() {
        return this.f4697i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Date mo5686e() {
        return this.f4694f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r4.f4703o.equals(r5.f4703o) != false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.facebook.C1499a
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.facebook.a r5 = (com.facebook.C1499a) r5
            java.util.Date r1 = r4.f4694f
            java.util.Date r3 = r5.f4694f
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            java.util.Set<java.lang.String> r1 = r4.f4695g
            java.util.Set<java.lang.String> r3 = r5.f4695g
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            java.util.Set<java.lang.String> r1 = r4.f4696h
            java.util.Set<java.lang.String> r3 = r5.f4696h
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            java.util.Set<java.lang.String> r1 = r4.f4697i
            java.util.Set<java.lang.String> r3 = r5.f4697i
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            java.lang.String r1 = r4.f4698j
            java.lang.String r3 = r5.f4698j
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            com.facebook.d r1 = r4.f4699k
            com.facebook.d r3 = r5.f4699k
            if (r1 != r3) goto L_0x0074
            java.util.Date r1 = r4.f4700l
            java.util.Date r3 = r5.f4700l
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            java.lang.String r1 = r4.f4701m
            if (r1 != 0) goto L_0x0057
            java.lang.String r1 = r5.f4701m
            if (r1 != 0) goto L_0x0074
            goto L_0x005f
        L_0x0057:
            java.lang.String r3 = r5.f4701m
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
        L_0x005f:
            java.lang.String r1 = r4.f4702n
            java.lang.String r3 = r5.f4702n
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            java.util.Date r1 = r4.f4703o
            java.util.Date r5 = r5.f4703o
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1499a.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public Date mo5688f() {
        return this.f4700l;
    }

    /* renamed from: g */
    public Set<String> mo5689g() {
        return this.f4695g;
    }

    /* renamed from: h */
    public C1519d mo5690h() {
        return this.f4699k;
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.f4694f.hashCode()) * 31) + this.f4695g.hashCode()) * 31) + this.f4696h.hashCode()) * 31) + this.f4697i.hashCode()) * 31) + this.f4698j.hashCode()) * 31) + this.f4699k.hashCode()) * 31) + this.f4700l.hashCode()) * 31;
        String str = this.f4701m;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f4702n.hashCode()) * 31) + this.f4703o.hashCode();
    }

    /* renamed from: i */
    public String mo5692i() {
        return this.f4698j;
    }

    /* renamed from: j */
    public String mo5693j() {
        return this.f4702n;
    }

    /* renamed from: k */
    public boolean mo5694k() {
        return new Date().after(this.f4694f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public JSONObject mo5695m() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f4698j);
        jSONObject.put("expires_at", this.f4694f.getTime());
        jSONObject.put("permissions", new JSONArray(this.f4695g));
        jSONObject.put("declined_permissions", new JSONArray(this.f4696h));
        jSONObject.put("expired_permissions", new JSONArray(this.f4697i));
        jSONObject.put("last_refresh", this.f4700l.getTime());
        jSONObject.put("source", this.f4699k.name());
        jSONObject.put("application_id", this.f4701m);
        jSONObject.put("user_id", this.f4702n);
        jSONObject.put("data_access_expiration_time", this.f4703o.getTime());
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(m6761t());
        m6756a(sb);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f4694f.getTime());
        parcel.writeStringList(new ArrayList(this.f4695g));
        parcel.writeStringList(new ArrayList(this.f4696h));
        parcel.writeStringList(new ArrayList(this.f4697i));
        parcel.writeString(this.f4698j);
        parcel.writeString(this.f4699k.name());
        parcel.writeLong(this.f4700l.getTime());
        parcel.writeString(this.f4701m);
        parcel.writeString(this.f4702n);
        parcel.writeLong(this.f4703o.getTime());
    }
}
