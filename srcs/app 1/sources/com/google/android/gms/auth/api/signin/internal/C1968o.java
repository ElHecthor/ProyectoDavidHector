package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: com.google.android.gms.auth.api.signin.internal.o */
public final class C1968o {

    /* renamed from: b */
    private static C1968o f5788b;

    /* renamed from: a */
    private C1956c f5789a;

    private C1968o(Context context) {
        C1956c a = C1956c.m8257a(context);
        this.f5789a = a;
        a.mo6542b();
        this.f5789a.mo6543c();
    }

    /* renamed from: a */
    public static synchronized C1968o m8292a(Context context) {
        C1968o b;
        synchronized (C1968o.class) {
            b = m8293b(context.getApplicationContext());
        }
        return b;
    }

    /* renamed from: b */
    private static synchronized C1968o m8293b(Context context) {
        synchronized (C1968o.class) {
            if (f5788b != null) {
                C1968o oVar = f5788b;
                return oVar;
            }
            C1968o oVar2 = new C1968o(context);
            f5788b = oVar2;
            return oVar2;
        }
    }

    /* renamed from: a */
    public final synchronized void mo6560a() {
        this.f5789a.mo6540a();
    }

    /* renamed from: a */
    public final synchronized void mo6561a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f5789a.mo6541a(googleSignInAccount, googleSignInOptions);
    }
}
