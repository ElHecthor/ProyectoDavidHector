package com.google.android.gms.auth.api.signin.internal;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public class C1955b {

    /* renamed from: b */
    private static int f5773b = 31;

    /* renamed from: a */
    private int f5774a = 1;

    /* renamed from: a */
    public int mo6537a() {
        return this.f5774a;
    }

    /* renamed from: a */
    public C1955b mo6538a(Object obj) {
        this.f5774a = (f5773b * this.f5774a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final C1955b mo6539a(boolean z) {
        this.f5774a = (f5773b * this.f5774a) + (z ? 1 : 0);
        return this;
    }
}
