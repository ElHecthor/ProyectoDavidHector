package com.facebook.login;

/* renamed from: com.facebook.login.i */
public enum C1758i {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    NATIVE_ONLY(true, true, false, false, false, true),
    KATANA_ONLY(false, true, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true),
    DEVICE_AUTH(false, false, false, true, false, false);
    

    /* renamed from: f */
    private final boolean f5293f;

    /* renamed from: g */
    private final boolean f5294g;

    /* renamed from: h */
    private final boolean f5295h;

    /* renamed from: i */
    private final boolean f5296i;

    /* renamed from: j */
    private final boolean f5297j;

    /* renamed from: k */
    private final boolean f5298k;

    private C1758i(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f5293f = z;
        this.f5294g = z2;
        this.f5295h = z3;
        this.f5296i = z4;
        this.f5297j = z5;
        this.f5298k = z6;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo6070f() {
        return this.f5297j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo6071g() {
        return this.f5296i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo6072h() {
        return this.f5298k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo6073i() {
        return this.f5293f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo6074j() {
        return this.f5294g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo6075l() {
        return this.f5295h;
    }
}
