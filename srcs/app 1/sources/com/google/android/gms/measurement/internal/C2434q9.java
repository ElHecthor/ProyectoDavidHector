package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.q9 */
final class C2434q9 implements Callable<String> {

    /* renamed from: f */
    private final /* synthetic */ C2244aa f6815f;

    /* renamed from: g */
    private final /* synthetic */ C2399n9 f6816g;

    C2434q9(C2399n9 n9Var, C2244aa aaVar) {
        this.f6816g = n9Var;
        this.f6815f = aaVar;
    }

    public final /* synthetic */ Object call() {
        C2299f5 c = this.f6816g.mo7547c(this.f6815f);
        if (c != null) {
            return c.mo7330m();
        }
        this.f6816g.mo7098j().mo7818w().mo7088a("App info was null when attempting to get app instance id");
        return null;
    }
}
