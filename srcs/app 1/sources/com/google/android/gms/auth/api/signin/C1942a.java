package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.internal.C1962i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2093b;
import com.google.android.gms.common.internal.C2148s;
import p147g.p156d.p157a.p167b.p184g.C4350h;
import p147g.p156d.p157a.p167b.p184g.C4354k;

/* renamed from: com.google.android.gms.auth.api.signin.a */
public final class C1942a {
    /* renamed from: a */
    public static C1943b m8233a(Activity activity, GoogleSignInOptions googleSignInOptions) {
        C2148s.m8834a(googleSignInOptions);
        return new C1943b(activity, googleSignInOptions);
    }

    /* renamed from: a */
    public static C1943b m8234a(Context context, GoogleSignInOptions googleSignInOptions) {
        C2148s.m8834a(googleSignInOptions);
        return new C1943b(context, googleSignInOptions);
    }

    /* renamed from: a */
    public static C4350h<GoogleSignInAccount> m8235a(Intent intent) {
        Status c;
        C1946c a = C1962i.m8275a(intent);
        if (a == null) {
            c = Status.f5798l;
        } else {
            GoogleSignInAccount a2 = a.mo6517a();
            if (a.mo6518c().mo6586h() && a2 != null) {
                return C4354k.m17756a(a2);
            }
            c = a.mo6518c();
        }
        return C4354k.m17755a((Exception) C2093b.m8643a(c));
    }
}
