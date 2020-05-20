package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;
import com.google.android.gms.common.util.C2190e;
import com.google.android.gms.common.util.C2193h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends C2158a implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new C1948e();

    /* renamed from: s */
    private static C2190e f5708s = C2193h.m8985d();

    /* renamed from: f */
    private final int f5709f;

    /* renamed from: g */
    private String f5710g;

    /* renamed from: h */
    private String f5711h;

    /* renamed from: i */
    private String f5712i;

    /* renamed from: j */
    private String f5713j;

    /* renamed from: k */
    private Uri f5714k;

    /* renamed from: l */
    private String f5715l;

    /* renamed from: m */
    private long f5716m;

    /* renamed from: n */
    private String f5717n;

    /* renamed from: o */
    private List<Scope> f5718o;

    /* renamed from: p */
    private String f5719p;

    /* renamed from: q */
    private String f5720q;

    /* renamed from: r */
    private Set<Scope> f5721r = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f5709f = i;
        this.f5710g = str;
        this.f5711h = str2;
        this.f5712i = str3;
        this.f5713j = str4;
        this.f5714k = uri;
        this.f5715l = str5;
        this.f5716m = j;
        this.f5717n = str6;
        this.f5718o = list;
        this.f5719p = str7;
        this.f5720q = str8;
    }

    /* renamed from: a */
    public static GoogleSignInAccount m8187a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount a = m8188a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a.f5715l = jSONObject.optString("serverAuthCode", null);
        return a;
    }

    /* renamed from: a */
    private static GoogleSignInAccount m8188a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long longValue = (l == null ? Long.valueOf(f5708s.mo6988b() / 1000) : l).longValue();
        C2148s.m8844b(str7);
        C2148s.m8834a(set);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
        return googleSignInAccount;
    }

    /* renamed from: w */
    private final JSONObject m8189w() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo6483k() != null) {
                jSONObject.put("id", mo6483k());
            }
            if (mo6484m() != null) {
                jSONObject.put("tokenId", mo6484m());
            }
            if (mo6478f() != null) {
                jSONObject.put("email", mo6478f());
            }
            if (mo6476e() != null) {
                jSONObject.put("displayName", mo6476e());
            }
            if (mo6480h() != null) {
                jSONObject.put("givenName", mo6480h());
            }
            if (mo6479g() != null) {
                jSONObject.put("familyName", mo6479g());
            }
            if (mo6485r() != null) {
                jSONObject.put("photoUrl", mo6485r().toString());
            }
            if (mo6487t() != null) {
                jSONObject.put("serverAuthCode", mo6487t());
            }
            jSONObject.put("expirationTime", this.f5716m);
            jSONObject.put("obfuscatedIdentifier", this.f5717n);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.f5718o.toArray(new Scope[this.f5718o.size()]);
            Arrays.sort(scopeArr, C1947d.f5759f);
            for (Scope e : scopeArr) {
                jSONArray.put(e.mo6577e());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: e */
    public String mo6476e() {
        return this.f5713j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f5717n.equals(this.f5717n) && googleSignInAccount.mo6486s().equals(mo6486s());
    }

    /* renamed from: f */
    public String mo6478f() {
        return this.f5712i;
    }

    /* renamed from: g */
    public String mo6479g() {
        return this.f5720q;
    }

    /* renamed from: h */
    public String mo6480h() {
        return this.f5719p;
    }

    public int hashCode() {
        return ((this.f5717n.hashCode() + 527) * 31) + mo6486s().hashCode();
    }

    /* renamed from: i */
    public Account mo6482i() {
        if (this.f5712i == null) {
            return null;
        }
        return new Account(this.f5712i, "com.google");
    }

    /* renamed from: k */
    public String mo6483k() {
        return this.f5710g;
    }

    /* renamed from: m */
    public String mo6484m() {
        return this.f5711h;
    }

    /* renamed from: r */
    public Uri mo6485r() {
        return this.f5714k;
    }

    /* renamed from: s */
    public Set<Scope> mo6486s() {
        HashSet hashSet = new HashSet(this.f5718o);
        hashSet.addAll(this.f5721r);
        return hashSet;
    }

    /* renamed from: t */
    public String mo6487t() {
        return this.f5715l;
    }

    /* renamed from: u */
    public final String mo6488u() {
        return this.f5717n;
    }

    /* renamed from: v */
    public final String mo6489v() {
        JSONObject w = m8189w();
        w.remove("serverAuthCode");
        return w.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, this.f5709f);
        C2161c.m8902a(parcel, 2, mo6483k(), false);
        C2161c.m8902a(parcel, 3, mo6484m(), false);
        C2161c.m8902a(parcel, 4, mo6478f(), false);
        C2161c.m8902a(parcel, 5, mo6476e(), false);
        C2161c.m8897a(parcel, 6, (Parcelable) mo6485r(), i, false);
        C2161c.m8902a(parcel, 7, mo6487t(), false);
        C2161c.m8894a(parcel, 8, this.f5716m);
        C2161c.m8902a(parcel, 9, this.f5717n, false);
        C2161c.m8909b(parcel, 10, this.f5718o, false);
        C2161c.m8902a(parcel, 11, mo6480h(), false);
        C2161c.m8902a(parcel, 12, mo6479g(), false);
        C2161c.m8891a(parcel, a);
    }
}
