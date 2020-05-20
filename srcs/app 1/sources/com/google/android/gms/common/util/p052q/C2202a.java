package com.google.android.gms.common.util.p052q;

import com.google.android.gms.common.internal.C2148s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.util.q.a */
public class C2202a implements ThreadFactory {

    /* renamed from: a */
    private final String f6178a;

    /* renamed from: b */
    private final ThreadFactory f6179b;

    public C2202a(String str) {
        this(str, 0);
    }

    private C2202a(String str, int i) {
        this.f6179b = Executors.defaultThreadFactory();
        C2148s.m8835a(str, (Object) "Name must not be null");
        this.f6178a = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f6179b.newThread(new C2203b(runnable, 0));
        newThread.setName(this.f6178a);
        return newThread;
    }
}
