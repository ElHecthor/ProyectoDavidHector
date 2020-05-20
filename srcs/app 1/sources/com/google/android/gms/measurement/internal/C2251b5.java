package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2148s;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
final class C2251b5 implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f6279a;

    /* renamed from: b */
    private final /* synthetic */ C2528z4 f6280b;

    public C2251b5(C2528z4 z4Var, String str) {
        this.f6280b = z4Var;
        C2148s.m8834a(str);
        this.f6279a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f6280b.mo7098j().mo7815t().mo7089a(this.f6279a, th);
    }
}
