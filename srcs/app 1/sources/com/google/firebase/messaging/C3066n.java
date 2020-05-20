package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.n */
final /* synthetic */ class C3066n implements Executor {

    /* renamed from: f */
    static final Executor f8724f = new C3066n();

    private C3066n() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
