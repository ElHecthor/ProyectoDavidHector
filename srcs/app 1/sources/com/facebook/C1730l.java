package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.C1654g;
import com.facebook.internal.C1670l;
import com.facebook.internal.C1672m;
import com.facebook.internal.C1698v;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.l */
public final class C1730l implements Parcelable {
    public static final Creator<C1730l> CREATOR = new C1731a();

    /* renamed from: p */
    static final C1733c f5220p = new C1733c(200, 299, null);

    /* renamed from: f */
    private final C1732b f5221f;

    /* renamed from: g */
    private final int f5222g;

    /* renamed from: h */
    private final int f5223h;

    /* renamed from: i */
    private final int f5224i;

    /* renamed from: j */
    private final String f5225j;

    /* renamed from: k */
    private final String f5226k;

    /* renamed from: l */
    private final String f5227l;

    /* renamed from: m */
    private final String f5228m;

    /* renamed from: n */
    private final Object f5229n;

    /* renamed from: o */
    private final C1631i f5230o;

    /* renamed from: com.facebook.l$a */
    static class C1731a implements Creator<C1730l> {
        C1731a() {
        }

        public C1730l createFromParcel(Parcel parcel) {
            return new C1730l(parcel, (C1731a) null);
        }

        public C1730l[] newArray(int i) {
            return new C1730l[i];
        }
    }

    /* renamed from: com.facebook.l$b */
    public enum C1732b {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.l$c */
    private static class C1733c {

        /* renamed from: a */
        private final int f5235a;

        /* renamed from: b */
        private final int f5236b;

        private C1733c(int i, int i2) {
            this.f5235a = i;
            this.f5236b = i2;
        }

        /* synthetic */ C1733c(int i, int i2, C1731a aVar) {
            this(i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo6016a(int i) {
            return this.f5235a <= i && i <= this.f5236b;
        }
    }

    private C1730l(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C1631i iVar) {
        boolean z2;
        this.f5222g = i;
        this.f5223h = i2;
        this.f5224i = i3;
        this.f5225j = str;
        this.f5226k = str2;
        this.f5229n = obj;
        this.f5227l = str3;
        this.f5228m = str4;
        if (iVar != null) {
            this.f5230o = iVar;
            z2 = true;
        } else {
            this.f5230o = new C1795o(this, str2);
            z2 = false;
        }
        C1654g g = m7504g();
        C1732b a = z2 ? C1732b.OTHER : g.mo5895a(i2, i3, z);
        this.f5221f = a;
        g.mo5896a(a);
    }

    public C1730l(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    private C1730l(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }

    /* synthetic */ C1730l(Parcel parcel, C1731a aVar) {
        this(parcel);
    }

    C1730l(HttpURLConnection httpURLConnection, Exception exc) {
        Exception exc2 = exc;
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection, exc2 instanceof C1631i ? (C1631i) exc2 : new C1631i((Throwable) exc2));
    }

    /* renamed from: a */
    static C1730l m7503a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        JSONObject jSONObject2 = jSONObject;
        String str5 = "error_code";
        String str6 = "error";
        String str7 = "FACEBOOK_NON_JSON_RESULT";
        String str8 = "body";
        String str9 = "code";
        try {
            if (jSONObject2.has(str9)) {
                int i3 = jSONObject2.getInt(str9);
                Object a = C1698v.m7358a(jSONObject2, str8, str7);
                if (a != null && (a instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) a;
                    String str10 = "error_subcode";
                    boolean z2 = false;
                    if (jSONObject3.has(str6)) {
                        JSONObject jSONObject4 = (JSONObject) C1698v.m7358a(jSONObject3, str6, (String) null);
                        String optString = jSONObject4.optString("type", null);
                        String optString2 = jSONObject4.optString("message", null);
                        i2 = jSONObject4.optInt(str9, -1);
                        int optInt = jSONObject4.optInt(str10, -1);
                        str2 = jSONObject4.optString("error_user_msg", null);
                        str = jSONObject4.optString("error_user_title", null);
                        z = jSONObject4.optBoolean("is_transient", false);
                        str4 = optString;
                        z2 = true;
                        int i4 = optInt;
                        str3 = optString2;
                        i = i4;
                    } else {
                        String str11 = "error_msg";
                        String str12 = "error_reason";
                        if (!jSONObject3.has(str5)) {
                            if (!jSONObject3.has(str11)) {
                                if (!jSONObject3.has(str12)) {
                                    str4 = null;
                                    str3 = null;
                                    str2 = null;
                                    str = null;
                                    i2 = -1;
                                    i = -1;
                                    z = false;
                                }
                            }
                        }
                        String optString3 = jSONObject3.optString(str12, null);
                        String optString4 = jSONObject3.optString(str11, null);
                        int optInt2 = jSONObject3.optInt(str5, -1);
                        i = jSONObject3.optInt(str10, -1);
                        str4 = optString3;
                        str3 = optString4;
                        str2 = null;
                        str = null;
                        z2 = true;
                        z = false;
                        i2 = optInt2;
                    }
                    if (z2) {
                        C1730l lVar = new C1730l(i3, i2, i, str4, str3, str, str2, z, jSONObject3, jSONObject, obj, httpURLConnection, null);
                        return lVar;
                    }
                }
                if (!f5220p.mo6016a(i3)) {
                    C1730l lVar2 = new C1730l(i3, -1, -1, null, null, null, null, false, jSONObject2.has(str8) ? (JSONObject) C1698v.m7358a(jSONObject2, str8, str7) : null, jSONObject, obj, httpURLConnection, null);
                    return lVar2;
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* renamed from: g */
    static synchronized C1654g m7504g() {
        synchronized (C1730l.class) {
            C1670l c = C1672m.m7268c(C1787m.m7745f());
            if (c == null) {
                C1654g a = C1654g.m7212a();
                return a;
            }
            C1654g c2 = c.mo5907c();
            return c2;
        }
    }

    /* renamed from: a */
    public int mo6005a() {
        return this.f5223h;
    }

    /* renamed from: b */
    public String mo6006b() {
        String str = this.f5226k;
        return str != null ? str : this.f5230o.getLocalizedMessage();
    }

    /* renamed from: c */
    public String mo6007c() {
        return this.f5225j;
    }

    /* renamed from: d */
    public C1631i mo6008d() {
        return this.f5230o;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo6010e() {
        return this.f5222g;
    }

    /* renamed from: f */
    public int mo6011f() {
        return this.f5224i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{HttpStatus: ");
        sb.append(this.f5222g);
        sb.append(", errorCode: ");
        sb.append(this.f5223h);
        sb.append(", subErrorCode: ");
        sb.append(this.f5224i);
        sb.append(", errorType: ");
        sb.append(this.f5225j);
        sb.append(", errorMessage: ");
        sb.append(mo6006b());
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5222g);
        parcel.writeInt(this.f5223h);
        parcel.writeInt(this.f5224i);
        parcel.writeString(this.f5225j);
        parcel.writeString(this.f5226k);
        parcel.writeString(this.f5227l);
        parcel.writeString(this.f5228m);
    }
}
