package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.C1946c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C2001f;
import com.google.android.gms.common.api.C2004g;
import com.google.android.gms.common.api.C2006h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2025f;
import com.google.android.gms.common.p049n.C2169a;
import java.util.Iterator;

/* renamed from: com.google.android.gms.auth.api.signin.internal.i */
public final class C1962i {

    /* renamed from: a */
    private static C2169a f5784a = new C2169a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m8274a(Context context, GoogleSignInOptions googleSignInOptions) {
        f5784a.mo6952a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        String str = "config";
        bundle.putParcelable(str, signInConfiguration);
        intent.putExtra(str, bundle);
        return intent;
    }

    /* renamed from: a */
    public static C1946c m8275a(Intent intent) {
        if (intent == null) {
            return new C1946c(null, Status.f5798l);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new C1946c(googleSignInAccount, Status.f5796j);
        }
        if (status == null) {
            status = Status.f5798l;
        }
        return new C1946c(null, status);
    }

    /* renamed from: a */
    public static C2004g<Status> m8276a(C2001f fVar, Context context, boolean z) {
        f5784a.mo6952a("Signing out", new Object[0]);
        m8277a(context);
        return z ? C2006h.m8366a(Status.f5796j, fVar) : fVar.mo6627a(new C1965l(fVar));
    }

    /* renamed from: a */
    private static void m8277a(Context context) {
        C1968o.m8292a(context).mo6560a();
        Iterator it = C2001f.m8358c().iterator();
        if (!it.hasNext()) {
            C2025f.m8435c();
        } else {
            ((C2001f) it.next()).mo6629b();
            throw null;
        }
    }

    /* renamed from: b */
    public static Intent m8278b(Context context, GoogleSignInOptions googleSignInOptions) {
        f5784a.mo6952a("getFallbackSignInIntent()", new Object[0]);
        Intent a = m8274a(context, googleSignInOptions);
        a.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return a;
    }

    /* renamed from: b */
    public static C2004g<Status> m8279b(C2001f fVar, Context context, boolean z) {
        f5784a.mo6952a("Revoking access", new Object[0]);
        String d = C1956c.m8257a(context).mo6544d();
        m8277a(context);
        return z ? C1958e.m8267a(d) : fVar.mo6627a(new C1967n(fVar));
    }

    /* renamed from: c */
    public static Intent m8280c(Context context, GoogleSignInOptions googleSignInOptions) {
        f5784a.mo6952a("getNoImplementationSignInIntent()", new Object[0]);
        Intent a = m8274a(context, googleSignInOptions);
        a.setAction("com.google.android.gms.auth.NO_IMPL");
        return a;
    }
}
