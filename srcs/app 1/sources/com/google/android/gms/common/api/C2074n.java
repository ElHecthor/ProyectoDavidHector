package com.google.android.gms.common.api;

import com.google.android.gms.common.C2082d;

/* renamed from: com.google.android.gms.common.api.n */
public final class C2074n extends UnsupportedOperationException {

    /* renamed from: f */
    private final C2082d f5961f;

    public C2074n(C2082d dVar) {
        this.f5961f = dVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f5961f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
