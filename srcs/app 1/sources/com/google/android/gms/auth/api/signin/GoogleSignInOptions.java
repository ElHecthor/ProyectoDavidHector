package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C1954a;
import com.google.android.gms.auth.api.signin.internal.C1955b;
import com.google.android.gms.common.api.C1981a.C1985d.C1990e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends C2158a implements C1990e, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new C1950g();

    /* renamed from: p */
    public static final Scope f5722p = new Scope("profile");

    /* renamed from: q */
    public static final Scope f5723q = new Scope("email");

    /* renamed from: r */
    public static final Scope f5724r = new Scope("openid");

    /* renamed from: s */
    public static final Scope f5725s = new Scope("https://www.googleapis.com/auth/games_lite");

    /* renamed from: t */
    public static final Scope f5726t = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: u */
    public static final GoogleSignInOptions f5727u;

    /* renamed from: v */
    private static Comparator<Scope> f5728v = new C1949f();

    /* renamed from: f */
    private final int f5729f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ArrayList<Scope> f5730g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Account f5731h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f5732i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final boolean f5733j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final boolean f5734k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f5735l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f5736m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ArrayList<C1954a> f5737n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f5738o;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C1941a {

        /* renamed from: a */
        private Set<Scope> f5739a = new HashSet();

        /* renamed from: b */
        private boolean f5740b;

        /* renamed from: c */
        private boolean f5741c;

        /* renamed from: d */
        private boolean f5742d;

        /* renamed from: e */
        private String f5743e;

        /* renamed from: f */
        private Account f5744f;

        /* renamed from: g */
        private String f5745g;

        /* renamed from: h */
        private Map<Integer, C1954a> f5746h = new HashMap();

        /* renamed from: i */
        private String f5747i;

        public C1941a() {
        }

        public C1941a(GoogleSignInOptions googleSignInOptions) {
            C2148s.m8834a(googleSignInOptions);
            this.f5739a = new HashSet(googleSignInOptions.f5730g);
            this.f5740b = googleSignInOptions.f5733j;
            this.f5741c = googleSignInOptions.f5734k;
            this.f5742d = googleSignInOptions.f5732i;
            this.f5743e = googleSignInOptions.f5735l;
            this.f5744f = googleSignInOptions.f5731h;
            this.f5745g = googleSignInOptions.f5736m;
            this.f5746h = GoogleSignInOptions.m8204a((List<C1954a>) googleSignInOptions.f5737n);
            this.f5747i = googleSignInOptions.f5738o;
        }

        /* renamed from: c */
        private final String m8224c(String str) {
            C2148s.m8844b(str);
            String str2 = this.f5743e;
            C2148s.m8842a(str2 == null || str2.equals(str), (Object) "two different server client ids provided");
            return str;
        }

        /* renamed from: a */
        public final C1941a mo6503a(Scope scope, Scope... scopeArr) {
            this.f5739a.add(scope);
            this.f5739a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: a */
        public final C1941a mo6504a(String str) {
            this.f5742d = true;
            m8224c(str);
            this.f5743e = str;
            return this;
        }

        /* renamed from: a */
        public final GoogleSignInOptions mo6505a() {
            if (this.f5739a.contains(GoogleSignInOptions.f5726t) && this.f5739a.contains(GoogleSignInOptions.f5725s)) {
                this.f5739a.remove(GoogleSignInOptions.f5725s);
            }
            if (this.f5742d && (this.f5744f == null || !this.f5739a.isEmpty())) {
                mo6508c();
            }
            GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList(this.f5739a), this.f5744f, this.f5742d, this.f5740b, this.f5741c, this.f5743e, this.f5745g, this.f5746h, this.f5747i, null);
            return googleSignInOptions;
        }

        /* renamed from: b */
        public final C1941a mo6506b() {
            this.f5739a.add(GoogleSignInOptions.f5723q);
            return this;
        }

        /* renamed from: b */
        public final C1941a mo6507b(String str) {
            this.f5747i = str;
            return this;
        }

        /* renamed from: c */
        public final C1941a mo6508c() {
            this.f5739a.add(GoogleSignInOptions.f5724r);
            return this;
        }

        /* renamed from: d */
        public final C1941a mo6509d() {
            this.f5739a.add(GoogleSignInOptions.f5722p);
            return this;
        }
    }

    static {
        C1941a aVar = new C1941a();
        aVar.mo6508c();
        aVar.mo6509d();
        f5727u = aVar.mo6505a();
        C1941a aVar2 = new C1941a();
        aVar2.mo6503a(f5725s, new Scope[0]);
        aVar2.mo6505a();
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<C1954a> arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m8204a((List<C1954a>) arrayList2), str3);
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, C1954a> map, String str3) {
        this.f5729f = i;
        this.f5730g = arrayList;
        this.f5731h = account;
        this.f5732i = z;
        this.f5733j = z2;
        this.f5734k = z3;
        this.f5735l = str;
        this.f5736m = str2;
        this.f5737n = new ArrayList<>(map.values());
        this.f5738o = str3;
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C1949f fVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }

    /* renamed from: a */
    public static GoogleSignInOptions m8202a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.optString("accountName", null);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList<>(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), (Map<Integer, C1954a>) new HashMap<Integer,C1954a>(), (String) null);
        return googleSignInOptions;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Map<Integer, C1954a> m8204a(List<C1954a> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (C1954a aVar : list) {
            hashMap.put(Integer.valueOf(aVar.mo6535e()), aVar);
        }
        return hashMap;
    }

    /* renamed from: t */
    private final JSONObject m8214t() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f5730g, f5728v);
            ArrayList<Scope> arrayList = this.f5730g;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((Scope) obj).mo6577e());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.f5731h != null) {
                jSONObject.put("accountName", this.f5731h.name);
            }
            jSONObject.put("idTokenRequested", this.f5732i);
            jSONObject.put("forceCodeForRefreshToken", this.f5734k);
            jSONObject.put("serverAuthRequested", this.f5733j);
            if (!TextUtils.isEmpty(this.f5735l)) {
                jSONObject.put("serverClientId", this.f5735l);
            }
            if (!TextUtils.isEmpty(this.f5736m)) {
                jSONObject.put("hostedDomain", this.f5736m);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    public ArrayList<C1954a> mo6491e() {
        return this.f5737n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3.f5731h.equals(r4.mo6497i()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r3.f5735l.equals(r4.mo6495h()) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0091 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.a> r1 = r3.f5737n     // Catch:{ ClassCastException -> 0x0091 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 > 0) goto L_0x0091
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.a> r1 = r4.f5737n     // Catch:{ ClassCastException -> 0x0091 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0091
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f5730g     // Catch:{ ClassCastException -> 0x0091 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0091 }
            java.util.ArrayList r2 = r4.mo6494g()     // Catch:{ ClassCastException -> 0x0091 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != r2) goto L_0x0091
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f5730g     // Catch:{ ClassCastException -> 0x0091 }
            java.util.ArrayList r2 = r4.mo6494g()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0091
        L_0x0035:
            android.accounts.Account r1 = r3.f5731h     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo6497i()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != 0) goto L_0x0091
            goto L_0x004c
        L_0x0040:
            android.accounts.Account r1 = r3.f5731h     // Catch:{ ClassCastException -> 0x0091 }
            android.accounts.Account r2 = r4.mo6497i()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 == 0) goto L_0x0091
        L_0x004c:
            java.lang.String r1 = r3.f5735l     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r4.mo6495h()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 == 0) goto L_0x0091
            goto L_0x006b
        L_0x005f:
            java.lang.String r1 = r3.f5735l     // Catch:{ ClassCastException -> 0x0091 }
            java.lang.String r2 = r4.mo6495h()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 == 0) goto L_0x0091
        L_0x006b:
            boolean r1 = r3.f5734k     // Catch:{ ClassCastException -> 0x0091 }
            boolean r2 = r4.mo6498k()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != r2) goto L_0x0091
            boolean r1 = r3.f5732i     // Catch:{ ClassCastException -> 0x0091 }
            boolean r2 = r4.mo6499m()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != r2) goto L_0x0091
            boolean r1 = r3.f5733j     // Catch:{ ClassCastException -> 0x0091 }
            boolean r2 = r4.mo6500r()     // Catch:{ ClassCastException -> 0x0091 }
            if (r1 != r2) goto L_0x0091
            java.lang.String r1 = r3.f5738o     // Catch:{ ClassCastException -> 0x0091 }
            java.lang.String r4 = r4.mo6493f()     // Catch:{ ClassCastException -> 0x0091 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0091 }
            if (r4 == 0) goto L_0x0091
            r4 = 1
            return r4
        L_0x0091:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public String mo6493f() {
        return this.f5738o;
    }

    /* renamed from: g */
    public ArrayList<Scope> mo6494g() {
        return new ArrayList<>(this.f5730g);
    }

    /* renamed from: h */
    public String mo6495h() {
        return this.f5735l;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f5730g;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).mo6577e());
        }
        Collections.sort(arrayList);
        C1955b bVar = new C1955b();
        bVar.mo6538a((Object) arrayList);
        bVar.mo6538a((Object) this.f5731h);
        bVar.mo6538a((Object) this.f5735l);
        bVar.mo6539a(this.f5734k);
        bVar.mo6539a(this.f5732i);
        bVar.mo6539a(this.f5733j);
        bVar.mo6538a((Object) this.f5738o);
        return bVar.mo6537a();
    }

    /* renamed from: i */
    public Account mo6497i() {
        return this.f5731h;
    }

    /* renamed from: k */
    public boolean mo6498k() {
        return this.f5734k;
    }

    /* renamed from: m */
    public boolean mo6499m() {
        return this.f5732i;
    }

    /* renamed from: r */
    public boolean mo6500r() {
        return this.f5733j;
    }

    /* renamed from: s */
    public final String mo6501s() {
        return m8214t().toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, this.f5729f);
        C2161c.m8909b(parcel, 2, mo6494g(), false);
        C2161c.m8897a(parcel, 3, (Parcelable) mo6497i(), i, false);
        C2161c.m8904a(parcel, 4, mo6499m());
        C2161c.m8904a(parcel, 5, mo6500r());
        C2161c.m8904a(parcel, 6, mo6498k());
        C2161c.m8902a(parcel, 7, mo6495h(), false);
        C2161c.m8902a(parcel, 8, this.f5736m, false);
        C2161c.m8909b(parcel, 9, mo6491e(), false);
        C2161c.m8902a(parcel, 10, mo6493f(), false);
        C2161c.m8891a(parcel, a);
    }
}
