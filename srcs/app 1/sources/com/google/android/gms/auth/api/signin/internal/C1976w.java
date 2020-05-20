package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C1942a;
import com.google.android.gms.auth.api.signin.C1943b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.C2200o;

/* renamed from: com.google.android.gms.auth.api.signin.internal.w */
public final class C1976w extends C1970q {

    /* renamed from: a */
    private final Context f5790a;

    public C1976w(Context context) {
        this.f5790a = context;
    }

    /* renamed from: t */
    private final void m8307t() {
        if (!C2200o.m9013a(this.f5790a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    /* renamed from: g */
    public final void mo6563g() {
        m8307t();
        C1956c a = C1956c.m8257a(this.f5790a);
        GoogleSignInAccount b = a.mo6542b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f5727u;
        if (b != null) {
            googleSignInOptions = a.mo6543c();
        }
        C1943b a2 = C1942a.m8234a(this.f5790a, googleSignInOptions);
        if (b != null) {
            a2.mo6514i();
        } else {
            a2.mo6515j();
        }
    }

    /* renamed from: h */
    public final void mo6564h() {
        m8307t();
        C1968o.m8292a(this.f5790a).mo6560a();
    }
}
