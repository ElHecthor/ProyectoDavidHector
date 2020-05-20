package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.o5 */
final class C2408o5 implements Callable<List<C2388ma>> {

    /* renamed from: f */
    private final /* synthetic */ String f6759f;

    /* renamed from: g */
    private final /* synthetic */ String f6760g;

    /* renamed from: h */
    private final /* synthetic */ String f6761h;

    /* renamed from: i */
    private final /* synthetic */ C2335i5 f6762i;

    C2408o5(C2335i5 i5Var, String str, String str2, String str3) {
        this.f6762i = i5Var;
        this.f6759f = str;
        this.f6760g = str2;
        this.f6761h = str3;
    }

    public final /* synthetic */ Object call() {
        this.f6762i.f6519a.mo7559r();
        return this.f6762i.f6519a.mo7551e().mo7167b(this.f6759f, this.f6760g, this.f6761h);
    }
}
