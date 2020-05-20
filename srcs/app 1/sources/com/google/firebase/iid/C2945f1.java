package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.C2087f;
import com.google.android.gms.common.internal.C2139p;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.C3004h;
import com.google.firebase.installations.C3010m;
import com.google.firebase.p060g.C2921c;
import com.google.firebase.p060g.C2921c.C2922a;
import com.google.firebase.p066j.C3043h;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p147g.p156d.p157a.p167b.p184g.C4339a;
import p147g.p156d.p157a.p167b.p184g.C4350h;
import p147g.p156d.p157a.p167b.p184g.C4351i;
import p147g.p156d.p157a.p167b.p184g.C4354k;

/* renamed from: com.google.firebase.iid.f1 */
public final class C2945f1 {

    /* renamed from: a */
    private final FirebaseApp f8486a;

    /* renamed from: b */
    private final C2974r f8487b;

    /* renamed from: c */
    private final C2987x f8488c;

    /* renamed from: d */
    private final Executor f8489d;

    /* renamed from: e */
    private final C3043h f8490e;

    /* renamed from: f */
    private final C2921c f8491f;

    /* renamed from: g */
    private final C3004h f8492g;

    private C2945f1(FirebaseApp firebaseApp, C2974r rVar, Executor executor, C2987x xVar, C3043h hVar, C2921c cVar, C3004h hVar2) {
        this.f8486a = firebaseApp;
        this.f8487b = rVar;
        this.f8488c = xVar;
        this.f8489d = executor;
        this.f8490e = hVar;
        this.f8491f = cVar;
        this.f8492g = hVar2;
    }

    public C2945f1(FirebaseApp firebaseApp, C2974r rVar, Executor executor, C3043h hVar, C2921c cVar, C3004h hVar2) {
        this(firebaseApp, rVar, executor, new C2987x(firebaseApp.mo9508a(), rVar), hVar, cVar, hVar2);
    }

    /* renamed from: a */
    private static <T> C4350h<Void> m12142a(C4350h<T> hVar) {
        return hVar.mo13005a(C2979t0.m12191a(), C2951h1.f8498a);
    }

    /* renamed from: a */
    private final C4350h<Bundle> m12143a(String str, String str2, String str3, Bundle bundle) {
        C4351i iVar = new C4351i();
        Executor executor = this.f8489d;
        C2942e1 e1Var = new C2942e1(this, str, str2, str3, bundle, iVar);
        executor.execute(e1Var);
        return iVar.mo13025a();
    }

    /* renamed from: a */
    private final String m12144a() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.f8486a.mo9510b().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: b */
    private final Bundle m12145b(String str, String str2, String str3, Bundle bundle) {
        String str4 = "FirebaseInstanceId";
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f8486a.mo9511c().mo9578b());
        bundle.putString("gmsv", Integer.toString(this.f8487b.mo9693e()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.f8487b.mo9691c());
        bundle.putString("app_ver_name", this.f8487b.mo9692d());
        bundle.putString("firebase-app-name-hash", m12144a());
        try {
            String a = ((C3010m) C4354k.m17758a(this.f8492g.mo9727a(false))).mo9712a();
            if (!TextUtils.isEmpty(a)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a);
            } else {
                Log.w(str4, "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e(str4, "Failed to get FIS auth token", e);
        }
        String a2 = C2139p.m8817a().mo6932a("firebase-iid");
        if ("UNKNOWN".equals(a2)) {
            int i = C2087f.f5982a;
            StringBuilder sb = new StringBuilder(19);
            sb.append("unknown_");
            sb.append(i);
            a2 = sb.toString();
        }
        String str5 = "fiid-";
        String valueOf = String.valueOf(a2);
        bundle.putString("cliv", valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5));
        C2922a a3 = this.f8491f.mo9604a("fire-iid");
        if (a3 != C2922a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a3.mo9605f()));
            bundle.putString("Firebase-Client", this.f8490e.mo9803a());
        }
        return bundle;
    }

    /* renamed from: b */
    private final C4350h<String> m12146b(C4350h<Bundle> hVar) {
        return hVar.mo13005a(this.f8489d, (C4339a<TResult, TContinuationResult>) new C2948g1<TResult,TContinuationResult>(this));
    }

    /* renamed from: a */
    public final C4350h<String> mo9658a(String str, String str2, String str3) {
        return m12146b(m12143a(str, str2, str3, new Bundle()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9659a(String str, String str2, String str3, Bundle bundle, C4351i iVar) {
        try {
            m12145b(str, str2, str3, bundle);
            iVar.mo13027a(this.f8488c.mo9705a(bundle));
        } catch (IOException e) {
            iVar.mo13026a((Exception) e);
        }
    }

    /* renamed from: b */
    public final C4350h<Void> mo9660b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        String valueOf2 = String.valueOf(str3);
        return m12142a(m12146b(m12143a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }

    /* renamed from: c */
    public final C4350h<Void> mo9661c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        String str4 = "/topics/";
        bundle.putString("gcm.topic", valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return m12142a(m12146b(m12143a(str, str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), bundle)));
    }
}
