package com.crashlytics.android.p033e;

/* renamed from: com.crashlytics.android.e.v0 */
class C1485v0 {

    /* renamed from: a */
    public final String f4651a;

    /* renamed from: b */
    public final String f4652b;

    /* renamed from: c */
    public final StackTraceElement[] f4653c;

    /* renamed from: d */
    public final C1485v0 f4654d;

    public C1485v0(Throwable th, C1483u0 u0Var) {
        this.f4651a = th.getLocalizedMessage();
        this.f4652b = th.getClass().getName();
        this.f4653c = u0Var.mo5509a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f4654d = cause != null ? new C1485v0(cause, u0Var) : null;
    }
}
