package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.C0429d;
import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.common.api.internal.h */
public class C2032h {

    /* renamed from: a */
    private final Object f5911a;

    public C2032h(Activity activity) {
        C2148s.m8835a(activity, (Object) "Activity must not be null");
        this.f5911a = activity;
    }

    /* renamed from: a */
    public Activity mo6718a() {
        return (Activity) this.f5911a;
    }

    /* renamed from: b */
    public C0429d mo6719b() {
        return (C0429d) this.f5911a;
    }

    /* renamed from: c */
    public boolean mo6720c() {
        return this.f5911a instanceof C0429d;
    }

    /* renamed from: d */
    public final boolean mo6721d() {
        return this.f5911a instanceof Activity;
    }
}
