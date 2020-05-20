package com.google.firebase.iid;

import com.google.android.gms.common.util.p052q.C2202a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.t0 */
final class C2979t0 {

    /* renamed from: a */
    private static final Executor f8540a = C2977s0.f8538f;

    /* renamed from: a */
    static Executor m12191a() {
        return f8540a;
    }

    /* renamed from: b */
    static ExecutorService m12192b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2202a("firebase-iid-executor"));
        return threadPoolExecutor;
    }
}
