package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.C1981a.C1983b;
import com.google.android.gms.common.api.C1981a.C1985d;
import com.google.android.gms.common.api.C1998e;
import com.google.android.gms.common.api.C2071k;

/* renamed from: com.google.android.gms.common.api.internal.a0 */
public final class C2012a0<O extends C1985d> extends C2056t {

    /* renamed from: b */
    private final C1998e<O> f5839b;

    public C2012a0(C1998e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f5839b = eVar;
    }

    /* renamed from: a */
    public final Looper mo6626a() {
        return this.f5839b.mo6622g();
    }

    /* renamed from: a */
    public final <A extends C1983b, T extends C2021d<? extends C2071k, A>> T mo6627a(T t) {
        this.f5839b.mo6615a(t);
        return t;
    }
}
