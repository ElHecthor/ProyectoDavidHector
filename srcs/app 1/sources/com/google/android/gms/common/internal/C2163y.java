package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: com.google.android.gms.common.internal.y */
final class C2163y extends C2115f {

    /* renamed from: f */
    private final /* synthetic */ Intent f6119f;

    /* renamed from: g */
    private final /* synthetic */ Fragment f6120g;

    /* renamed from: h */
    private final /* synthetic */ int f6121h;

    C2163y(Intent intent, Fragment fragment, int i) {
        this.f6119f = intent;
        this.f6120g = fragment;
        this.f6121h = i;
    }

    /* renamed from: a */
    public final void mo6815a() {
        Intent intent = this.f6119f;
        if (intent != null) {
            this.f6120g.startActivityForResult(intent, this.f6121h);
        }
    }
}
