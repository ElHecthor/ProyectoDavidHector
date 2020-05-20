package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.o */
final /* synthetic */ class C1936o implements Runnable {

    /* renamed from: f */
    private final C1938q f5698f;

    private C1936o(C1938q qVar) {
        this.f5698f = qVar;
    }

    /* renamed from: a */
    public static Runnable m8178a(C1938q qVar) {
        return new C1936o(qVar);
    }

    public void run() {
        this.f5698f.f5703d.mo11999a(C1937p.m8179a(this.f5698f));
    }
}
