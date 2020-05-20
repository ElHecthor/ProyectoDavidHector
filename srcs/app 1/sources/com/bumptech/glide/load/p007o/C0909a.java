package com.bumptech.glide.load.p007o;

import android.os.Process;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.p029t.C1309j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.o.a */
final class C0909a {

    /* renamed from: a */
    private final boolean f3443a;

    /* renamed from: b */
    final Map<C0869g, C0914d> f3444b;

    /* renamed from: c */
    private final ReferenceQueue<C1011p<?>> f3445c;

    /* renamed from: d */
    private C1012a f3446d;

    /* renamed from: e */
    private volatile boolean f3447e;

    /* renamed from: f */
    private volatile C0913c f3448f;

    /* renamed from: com.bumptech.glide.load.o.a$a */
    class C0910a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.o.a$a$a */
        class C0911a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Runnable f3449f;

            C0911a(C0910a aVar, Runnable runnable) {
                this.f3449f = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f3449f.run();
            }
        }

        C0910a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C0911a(this, runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a$b */
    class C0912b implements Runnable {
        C0912b() {
        }

        public void run() {
            C0909a.this.mo4674a();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a$c */
    interface C0913c {
        /* renamed from: a */
        void mo4683a();
    }

    /* renamed from: com.bumptech.glide.load.o.a$d */
    static final class C0914d extends WeakReference<C1011p<?>> {

        /* renamed from: a */
        final C0869g f3451a;

        /* renamed from: b */
        final boolean f3452b;

        /* renamed from: c */
        C1020v<?> f3453c;

        C0914d(C0869g gVar, C1011p<?> pVar, ReferenceQueue<? super C1011p<?>> referenceQueue, boolean z) {
            C1020v<?> vVar;
            super(pVar, referenceQueue);
            C1309j.m6149a(gVar);
            this.f3451a = gVar;
            if (!pVar.mo4884f() || !z) {
                vVar = null;
            } else {
                C1020v<?> e = pVar.mo4883e();
                C1309j.m6149a(e);
                vVar = e;
            }
            this.f3453c = vVar;
            this.f3452b = pVar.mo4884f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4684a() {
            this.f3453c = null;
            clear();
        }
    }

    C0909a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C0910a()));
    }

    C0909a(boolean z, Executor executor) {
        this.f3444b = new HashMap();
        this.f3445c = new ReferenceQueue<>();
        this.f3443a = z;
        executor.execute(new C0912b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4674a() {
        while (!this.f3447e) {
            try {
                mo4677a((C0914d) this.f3445c.remove());
                C0913c cVar = this.f3448f;
                if (cVar != null) {
                    cVar.mo4683a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo4675a(C0869g gVar) {
        C0914d dVar = (C0914d) this.f3444b.remove(gVar);
        if (dVar != null) {
            dVar.mo4684a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo4676a(C0869g gVar, C1011p<?> pVar) {
        C0914d dVar = (C0914d) this.f3444b.put(gVar, new C0914d(gVar, pVar, this.f3445c, this.f3443a));
        if (dVar != null) {
            dVar.mo4684a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4677a(C0914d dVar) {
        synchronized (this) {
            this.f3444b.remove(dVar.f3451a);
            if (dVar.f3452b) {
                if (dVar.f3453c != null) {
                    C1011p pVar = new C1011p(dVar.f3453c, true, false, dVar.f3451a, this.f3446d);
                    this.f3446d.mo4845a(dVar.f3451a, pVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4678a(C1012a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f3446d = aVar;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.p007o.C1011p<?> mo4679b(com.bumptech.glide.load.C0869g r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.bumptech.glide.load.g, com.bumptech.glide.load.o.a$d> r0 = r1.f3444b     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.o.a$d r2 = (com.bumptech.glide.load.p007o.C0909a.C0914d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.o.p r0 = (com.bumptech.glide.load.p007o.C1011p) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo4677a(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p007o.C0909a.mo4679b(com.bumptech.glide.load.g):com.bumptech.glide.load.o.p");
    }
}
