package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o6 */
final class C2409o6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f6763f;

    /* renamed from: g */
    private final /* synthetic */ String f6764g;

    /* renamed from: h */
    private final /* synthetic */ Object f6765h;

    /* renamed from: i */
    private final /* synthetic */ long f6766i;

    /* renamed from: j */
    private final /* synthetic */ C2348j6 f6767j;

    C2409o6(C2348j6 j6Var, String str, String str2, Object obj, long j) {
        this.f6767j = j6Var;
        this.f6763f = str;
        this.f6764g = str2;
        this.f6765h = obj;
        this.f6766i = j;
    }

    public final void run() {
        this.f6767j.mo7434a(this.f6763f, this.f6764g, this.f6765h, this.f6766i);
    }
}
