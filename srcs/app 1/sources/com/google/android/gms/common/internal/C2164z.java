package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.z */
final class C2164z extends C2115f {

    /* renamed from: f */
    private final /* synthetic */ Intent f6122f;

    /* renamed from: g */
    private final /* synthetic */ Activity f6123g;

    /* renamed from: h */
    private final /* synthetic */ int f6124h;

    C2164z(Intent intent, Activity activity, int i) {
        this.f6122f = intent;
        this.f6123g = activity;
        this.f6124h = i;
    }

    /* renamed from: a */
    public final void mo6815a() {
        Intent intent = this.f6122f;
        if (intent != null) {
            this.f6123g.startActivityForResult(intent, this.f6124h);
        }
    }
}
