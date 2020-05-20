package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2141q;
import com.google.android.gms.common.internal.C2141q.C2142a;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.C2156w;
import com.google.android.gms.common.util.C2199n;

/* renamed from: com.google.firebase.d */
public final class C2901d {

    /* renamed from: a */
    private final String f8384a;

    /* renamed from: b */
    private final String f8385b;

    /* renamed from: c */
    private final String f8386c;

    /* renamed from: d */
    private final String f8387d;

    /* renamed from: e */
    private final String f8388e;

    /* renamed from: f */
    private final String f8389f;

    /* renamed from: g */
    private final String f8390g;

    private C2901d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2148s.m8846b(!C2199n.m9012a(str), "ApplicationId must be set.");
        this.f8385b = str;
        this.f8384a = str2;
        this.f8386c = str3;
        this.f8387d = str4;
        this.f8388e = str5;
        this.f8389f = str6;
        this.f8390g = str7;
    }

    /* renamed from: a */
    public static C2901d m11994a(Context context) {
        C2156w wVar = new C2156w(context);
        String a = wVar.mo6948a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        C2901d dVar = new C2901d(a, wVar.mo6948a("google_api_key"), wVar.mo6948a("firebase_database_url"), wVar.mo6948a("ga_trackingId"), wVar.mo6948a("gcm_defaultSenderId"), wVar.mo6948a("google_storage_bucket"), wVar.mo6948a("project_id"));
        return dVar;
    }

    /* renamed from: a */
    public String mo9577a() {
        return this.f8384a;
    }

    /* renamed from: b */
    public String mo9578b() {
        return this.f8385b;
    }

    /* renamed from: c */
    public String mo9579c() {
        return this.f8388e;
    }

    /* renamed from: d */
    public String mo9580d() {
        return this.f8390g;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C2901d)) {
            return false;
        }
        C2901d dVar = (C2901d) obj;
        if (C2141q.m8823a(this.f8385b, dVar.f8385b) && C2141q.m8823a(this.f8384a, dVar.f8384a) && C2141q.m8823a(this.f8386c, dVar.f8386c) && C2141q.m8823a(this.f8387d, dVar.f8387d) && C2141q.m8823a(this.f8388e, dVar.f8388e) && C2141q.m8823a(this.f8389f, dVar.f8389f) && C2141q.m8823a(this.f8390g, dVar.f8390g)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return C2141q.m8821a(this.f8385b, this.f8384a, this.f8386c, this.f8387d, this.f8388e, this.f8389f, this.f8390g);
    }

    public String toString() {
        C2142a a = C2141q.m8822a((Object) this);
        a.mo6935a("applicationId", this.f8385b);
        a.mo6935a("apiKey", this.f8384a);
        a.mo6935a("databaseUrl", this.f8386c);
        a.mo6935a("gcmSenderId", this.f8388e);
        a.mo6935a("storageBucket", this.f8389f);
        a.mo6935a("projectId", this.f8390g);
        return a.toString();
    }
}
