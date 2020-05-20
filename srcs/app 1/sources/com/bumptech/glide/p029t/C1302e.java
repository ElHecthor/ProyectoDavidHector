package com.bumptech.glide.p029t;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.t.e */
public final class C1302e {

    /* renamed from: a */
    private static final Executor f4299a = new C1303a();

    /* renamed from: b */
    private static final Executor f4300b = new C1304b();

    /* renamed from: com.bumptech.glide.t.e$a */
    class C1303a implements Executor {

        /* renamed from: f */
        private final Handler f4301f = new Handler(Looper.getMainLooper());

        C1303a() {
        }

        public void execute(Runnable runnable) {
            this.f4301f.post(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.t.e$b */
    class C1304b implements Executor {
        C1304b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m6133a() {
        return f4300b;
    }

    /* renamed from: b */
    public static Executor m6134b() {
        return f4299a;
    }
}
