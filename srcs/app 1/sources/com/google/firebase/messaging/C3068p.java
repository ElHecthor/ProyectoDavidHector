package com.google.firebase.messaging;

import com.google.android.gms.common.util.p052q.C2202a;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.p */
final class C3068p {
    /* renamed from: a */
    static Executor m12465a() {
        return m12466a("Firebase-Messaging-Rpc-Task");
    }

    /* renamed from: a */
    private static Executor m12466a(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2202a(str));
        return threadPoolExecutor;
    }

    /* renamed from: b */
    static Executor m12467b() {
        return m12466a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
