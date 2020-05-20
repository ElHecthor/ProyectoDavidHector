package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.facebook.internal.C1698v;
import com.facebook.internal.C1698v.C1701c;
import com.facebook.internal.C1703w;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.x */
public final class C1846x implements Parcelable {
    public static final Creator<C1846x> CREATOR = new C1848b();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f5477l = C1846x.class.getSimpleName();

    /* renamed from: f */
    private final String f5478f;

    /* renamed from: g */
    private final String f5479g;

    /* renamed from: h */
    private final String f5480h;

    /* renamed from: i */
    private final String f5481i;

    /* renamed from: j */
    private final String f5482j;

    /* renamed from: k */
    private final Uri f5483k;

    /* renamed from: com.facebook.x$a */
    static class C1847a implements C1701c {
        C1847a() {
        }

        /* renamed from: a */
        public void mo5945a(C1631i iVar) {
            String b = C1846x.f5477l;
            StringBuilder sb = new StringBuilder();
            sb.append("Got unexpected exception: ");
            sb.append(iVar);
            Log.e(b, sb.toString());
        }

        /* renamed from: a */
        public void mo5946a(JSONObject jSONObject) {
            String optString = jSONObject.optString("id");
            if (optString != null) {
                String optString2 = jSONObject.optString("link");
                C1846x xVar = new C1846x(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null);
                C1846x.m7935a(xVar);
            }
        }
    }

    /* renamed from: com.facebook.x$b */
    static class C1848b implements Creator<C1846x> {
        C1848b() {
        }

        public C1846x createFromParcel(Parcel parcel) {
            return new C1846x(parcel, null);
        }

        public C1846x[] newArray(int i) {
            return new C1846x[i];
        }
    }

    private C1846x(Parcel parcel) {
        this.f5478f = parcel.readString();
        this.f5479g = parcel.readString();
        this.f5480h = parcel.readString();
        this.f5481i = parcel.readString();
        this.f5482j = parcel.readString();
        String readString = parcel.readString();
        this.f5483k = readString == null ? null : Uri.parse(readString);
    }

    /* synthetic */ C1846x(Parcel parcel, C1847a aVar) {
        this(parcel);
    }

    public C1846x(String str, String str2, String str3, String str4, String str5, Uri uri) {
        C1703w.m7424a(str, "id");
        this.f5478f = str;
        this.f5479g = str2;
        this.f5480h = str3;
        this.f5481i = str4;
        this.f5482j = str5;
        this.f5483k = uri;
    }

    C1846x(JSONObject jSONObject) {
        Uri uri = null;
        this.f5478f = jSONObject.optString("id", null);
        this.f5479g = jSONObject.optString("first_name", null);
        this.f5480h = jSONObject.optString("middle_name", null);
        this.f5481i = jSONObject.optString("last_name", null);
        this.f5482j = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        if (optString != null) {
            uri = Uri.parse(optString);
        }
        this.f5483k = uri;
    }

    /* renamed from: a */
    public static void m7935a(C1846x xVar) {
        C1850z.m7947c().mo6306a(xVar);
    }

    /* renamed from: c */
    public static void m7937c() {
        C1499a r = C1499a.m6759r();
        if (!C1499a.m6760s()) {
            m7935a(null);
        } else {
            C1698v.m7379a(r.mo5692i(), (C1701c) new C1847a());
        }
    }

    /* renamed from: d */
    public static C1846x m7938d() {
        return C1850z.m7947c().mo6305a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public JSONObject mo6295a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f5478f);
            jSONObject.put("first_name", this.f5479g);
            jSONObject.put("middle_name", this.f5480h);
            jSONObject.put("last_name", this.f5481i);
            jSONObject.put("name", this.f5482j);
            if (this.f5483k == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", this.f5483k.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r5.f5479g == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r5.f5480h == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r5.f5481i == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r5.f5482j == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        if (r5.f5483k == null) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.facebook.C1846x
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.facebook.x r5 = (com.facebook.C1846x) r5
            java.lang.String r1 = r4.f5478f
            java.lang.String r3 = r5.f5478f
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = r4.f5479g
            if (r1 != 0) goto L_0x0021
            java.lang.String r5 = r5.f5479g
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x001f:
            r0 = 0
            goto L_0x0075
        L_0x0021:
            java.lang.String r1 = r4.f5479g
            java.lang.String r3 = r5.f5479g
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = r4.f5480h
            if (r1 != 0) goto L_0x0034
            java.lang.String r5 = r5.f5480h
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x0034:
            java.lang.String r1 = r4.f5480h
            java.lang.String r3 = r5.f5480h
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = r4.f5481i
            if (r1 != 0) goto L_0x0047
            java.lang.String r5 = r5.f5481i
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x0047:
            java.lang.String r1 = r4.f5481i
            java.lang.String r3 = r5.f5481i
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = r4.f5482j
            if (r1 != 0) goto L_0x005a
            java.lang.String r5 = r5.f5482j
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x005a:
            java.lang.String r1 = r4.f5482j
            java.lang.String r3 = r5.f5482j
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
            android.net.Uri r1 = r4.f5483k
            if (r1 != 0) goto L_0x006d
            android.net.Uri r5 = r5.f5483k
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x006d:
            android.net.Uri r0 = r4.f5483k
            android.net.Uri r5 = r5.f5483k
            boolean r0 = r0.equals(r5)
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1846x.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = 527 + this.f5478f.hashCode();
        String str = this.f5479g;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.f5480h;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f5481i;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f5482j;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        Uri uri = this.f5483k;
        return uri != null ? (hashCode * 31) + uri.hashCode() : hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5478f);
        parcel.writeString(this.f5479g);
        parcel.writeString(this.f5480h);
        parcel.writeString(this.f5481i);
        parcel.writeString(this.f5482j);
        Uri uri = this.f5483k;
        parcel.writeString(uri == null ? null : uri.toString());
    }
}
