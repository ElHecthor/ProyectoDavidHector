package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.d */
final /* synthetic */ class C1947d implements Comparator {

    /* renamed from: f */
    static final Comparator f5759f = new C1947d();

    private C1947d() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).mo6577e().compareTo(((Scope) obj2).mo6577e());
    }
}
