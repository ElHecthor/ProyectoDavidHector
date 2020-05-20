package com.google.firebase.installations;

/* renamed from: com.google.firebase.installations.f */
final /* synthetic */ class C3000f implements Runnable {

    /* renamed from: f */
    private final C3001g f8578f;

    /* renamed from: g */
    private final boolean f8579g;

    private C3000f(C3001g gVar, boolean z) {
        this.f8578f = gVar;
        this.f8579g = z;
    }

    /* renamed from: a */
    public static Runnable m12229a(C3001g gVar, boolean z) {
        return new C3000f(gVar, z);
    }

    public void run() {
        this.f8578f.m12236b(this.f8579g);
    }
}
