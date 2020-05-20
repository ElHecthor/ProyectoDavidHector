package com.crashlytics.android.p033e;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.p246n.p254g.C4926t;

/* renamed from: com.crashlytics.android.e.r */
class C1473r implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final C1474a f4635a;

    /* renamed from: b */
    private final C1475b f4636b;

    /* renamed from: c */
    private final boolean f4637c;

    /* renamed from: d */
    private final UncaughtExceptionHandler f4638d;

    /* renamed from: e */
    private final AtomicBoolean f4639e = new AtomicBoolean(false);

    /* renamed from: com.crashlytics.android.e.r$a */
    interface C1474a {
        /* renamed from: a */
        void mo5616a(C1475b bVar, Thread thread, Throwable th, boolean z);
    }

    /* renamed from: com.crashlytics.android.e.r$b */
    interface C1475b {
        /* renamed from: a */
        C4926t mo5592a();
    }

    public C1473r(C1474a aVar, C1475b bVar, boolean z, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f4635a = aVar;
        this.f4636b = bVar;
        this.f4637c = z;
        this.f4638d = uncaughtExceptionHandler;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5654a() {
        return this.f4639e.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String str = "Crashlytics completed exception processing. Invoking default exception handler.";
        String str2 = "CrashlyticsCore";
        this.f4639e.set(true);
        try {
            this.f4635a.mo5616a(this.f4636b, thread, th, this.f4637c);
        } catch (Exception e) {
            C4781c.m19229f().mo13793c(str2, "An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            C4781c.m19229f().mo13796e(str2, str);
            this.f4638d.uncaughtException(thread, th);
            this.f4639e.set(false);
            throw th2;
        }
        C4781c.m19229f().mo13796e(str2, str);
        this.f4638d.uncaughtException(thread, th);
        this.f4639e.set(false);
    }
}
