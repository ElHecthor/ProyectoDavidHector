package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.iid.p0 */
final /* synthetic */ class C2971p0 implements Callable {

    /* renamed from: f */
    private final Context f8525f;

    /* renamed from: g */
    private final Intent f8526g;

    C2971p0(Context context, Intent intent) {
        this.f8525f = context;
        this.f8526g = intent;
    }

    public final Object call() {
        return Integer.valueOf(C2991z.m12211b().mo9707a(this.f8525f, this.f8526g));
    }
}
