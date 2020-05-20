package com.crashlytics.android.p031c;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p242i.p243a.p244a.p245a.C4781c;

/* renamed from: com.crashlytics.android.c.j */
class C1349j {

    /* renamed from: a */
    private final ScheduledExecutorService f4389a;

    /* renamed from: b */
    private final List<C1351b> f4390b = new ArrayList();

    /* renamed from: c */
    private volatile boolean f4391c = true;

    /* renamed from: d */
    final AtomicReference<ScheduledFuture<?>> f4392d = new AtomicReference<>();

    /* renamed from: e */
    boolean f4393e = true;

    /* renamed from: com.crashlytics.android.c.j$a */
    class C1350a implements Runnable {
        C1350a() {
        }

        public void run() {
            C1349j.this.f4392d.set(null);
            C1349j.this.m6269c();
        }
    }

    /* renamed from: com.crashlytics.android.c.j$b */
    public interface C1351b {
        /* renamed from: a */
        void mo5449a();
    }

    public C1349j(ScheduledExecutorService scheduledExecutorService) {
        this.f4389a = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m6269c() {
        for (C1351b a : this.f4390b) {
            a.mo5449a();
        }
    }

    /* renamed from: a */
    public void mo5444a() {
        if (this.f4391c && !this.f4393e) {
            this.f4393e = true;
            try {
                this.f4392d.compareAndSet(null, this.f4389a.schedule(new C1350a(), 5000, TimeUnit.MILLISECONDS));
            } catch (RejectedExecutionException e) {
                C4781c.m19229f().mo13788a("Answers", "Failed to schedule background detector", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo5445a(C1351b bVar) {
        this.f4390b.add(bVar);
    }

    /* renamed from: a */
    public void mo5446a(boolean z) {
        this.f4391c = z;
    }

    /* renamed from: b */
    public void mo5447b() {
        this.f4393e = false;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f4392d.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
