package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.C2071k;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.c */
public class C1946c implements C2071k {

    /* renamed from: f */
    private Status f5757f;

    /* renamed from: g */
    private GoogleSignInAccount f5758g;

    public C1946c(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f5758g = googleSignInAccount;
        this.f5757f = status;
    }

    /* renamed from: a */
    public GoogleSignInAccount mo6517a() {
        return this.f5758g;
    }

    /* renamed from: c */
    public Status mo6518c() {
        return this.f5757f;
    }
}
