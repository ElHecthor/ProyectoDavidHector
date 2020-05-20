package com.google.android.gms.common.util.p052q;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.q.b */
final class C2203b implements Runnable {

    /* renamed from: f */
    private final Runnable f6180f;

    /* renamed from: g */
    private final int f6181g;

    public C2203b(Runnable runnable, int i) {
        this.f6180f = runnable;
        this.f6181g = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f6181g);
        this.f6180f.run();
    }
}
