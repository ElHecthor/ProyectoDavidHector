package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.g7 */
final class C2313g7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f6467f;

    /* renamed from: g */
    private final /* synthetic */ Uri f6468g;

    /* renamed from: h */
    private final /* synthetic */ String f6469h;

    /* renamed from: i */
    private final /* synthetic */ String f6470i;

    /* renamed from: j */
    private final /* synthetic */ C2265c7 f6471j;

    C2313g7(C2265c7 c7Var, boolean z, Uri uri, String str, String str2) {
        this.f6471j = c7Var;
        this.f6467f = z;
        this.f6468g = uri;
        this.f6469h = str;
        this.f6470i = str2;
    }

    public final void run() {
        this.f6471j.m9275a(this.f6467f, this.f6468g, this.f6469h, this.f6470i);
    }
}
