package com.bumptech.glide.p025r;

import com.bumptech.glide.p025r.C1270d.C1271a;

/* renamed from: com.bumptech.glide.r.b */
public final class C1268b implements C1270d, C1269c {

    /* renamed from: a */
    private final Object f4209a;

    /* renamed from: b */
    private final C1270d f4210b;

    /* renamed from: c */
    private volatile C1269c f4211c;

    /* renamed from: d */
    private volatile C1269c f4212d;

    /* renamed from: e */
    private C1271a f4213e;

    /* renamed from: f */
    private C1271a f4214f;

    public C1268b(Object obj, C1270d dVar) {
        C1271a aVar = C1271a.CLEARED;
        this.f4213e = aVar;
        this.f4214f = aVar;
        this.f4209a = obj;
        this.f4210b = dVar;
    }

    /* renamed from: g */
    private boolean m5965g() {
        C1270d dVar = this.f4210b;
        return dVar == null || dVar.mo5307f(this);
    }

    /* renamed from: g */
    private boolean m5966g(C1269c cVar) {
        return cVar.equals(this.f4211c) || (this.f4213e == C1271a.FAILED && cVar.equals(this.f4212d));
    }

    /* renamed from: h */
    private boolean m5967h() {
        C1270d dVar = this.f4210b;
        return dVar == null || dVar.mo5300c(this);
    }

    /* renamed from: i */
    private boolean m5968i() {
        C1270d dVar = this.f4210b;
        return dVar == null || dVar.mo5303d(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5294a(com.bumptech.glide.p025r.C1269c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4209a
            monitor-enter(r0)
            com.bumptech.glide.r.c r1 = r2.f4212d     // Catch:{ all -> 0x002f }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002f }
            if (r3 != 0) goto L_0x0020
            com.bumptech.glide.r.d$a r3 = com.bumptech.glide.p025r.C1270d.C1271a.FAILED     // Catch:{ all -> 0x002f }
            r2.f4213e = r3     // Catch:{ all -> 0x002f }
            com.bumptech.glide.r.d$a r3 = r2.f4214f     // Catch:{ all -> 0x002f }
            com.bumptech.glide.r.d$a r1 = com.bumptech.glide.p025r.C1270d.C1271a.RUNNING     // Catch:{ all -> 0x002f }
            if (r3 == r1) goto L_0x001e
            com.bumptech.glide.r.d$a r3 = com.bumptech.glide.p025r.C1270d.C1271a.RUNNING     // Catch:{ all -> 0x002f }
            r2.f4214f = r3     // Catch:{ all -> 0x002f }
            com.bumptech.glide.r.c r3 = r2.f4212d     // Catch:{ all -> 0x002f }
            r3.mo5304e()     // Catch:{ all -> 0x002f }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0020:
            com.bumptech.glide.r.d$a r3 = com.bumptech.glide.p025r.C1270d.C1271a.FAILED     // Catch:{ all -> 0x002f }
            r2.f4214f = r3     // Catch:{ all -> 0x002f }
            com.bumptech.glide.r.d r3 = r2.f4210b     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002d
            com.bumptech.glide.r.d r3 = r2.f4210b     // Catch:{ all -> 0x002f }
            r3.mo5294a(r2)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025r.C1268b.mo5294a(com.bumptech.glide.r.c):void");
    }

    /* renamed from: a */
    public void mo5295a(C1269c cVar, C1269c cVar2) {
        this.f4211c = cVar;
        this.f4212d = cVar2;
    }

    /* renamed from: a */
    public boolean mo5296a() {
        boolean z;
        synchronized (this.f4209a) {
            if (!this.f4211c.mo5296a()) {
                if (!this.f4212d.mo5296a()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public C1270d mo5297b() {
        C1270d b;
        synchronized (this.f4209a) {
            b = this.f4210b != null ? this.f4210b.mo5297b() : this;
        }
        return b;
    }

    /* renamed from: b */
    public boolean mo5298b(C1269c cVar) {
        if (!(cVar instanceof C1268b)) {
            return false;
        }
        C1268b bVar = (C1268b) cVar;
        return this.f4211c.mo5298b(bVar.f4211c) && this.f4212d.mo5298b(bVar.f4212d);
    }

    /* renamed from: c */
    public boolean mo5299c() {
        boolean z;
        synchronized (this.f4209a) {
            z = this.f4213e == C1271a.CLEARED && this.f4214f == C1271a.CLEARED;
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo5300c(C1269c cVar) {
        boolean z;
        synchronized (this.f4209a) {
            z = m5967h() && m5966g(cVar);
        }
        return z;
    }

    public void clear() {
        synchronized (this.f4209a) {
            this.f4213e = C1271a.CLEARED;
            this.f4211c.clear();
            if (this.f4214f != C1271a.CLEARED) {
                this.f4214f = C1271a.CLEARED;
                this.f4212d.clear();
            }
        }
    }

    /* renamed from: d */
    public void mo5302d() {
        synchronized (this.f4209a) {
            if (this.f4213e == C1271a.RUNNING) {
                this.f4213e = C1271a.PAUSED;
                this.f4211c.mo5302d();
            }
            if (this.f4214f == C1271a.RUNNING) {
                this.f4214f = C1271a.PAUSED;
                this.f4212d.mo5302d();
            }
        }
    }

    /* renamed from: d */
    public boolean mo5303d(C1269c cVar) {
        boolean z;
        synchronized (this.f4209a) {
            z = m5968i() && m5966g(cVar);
        }
        return z;
    }

    /* renamed from: e */
    public void mo5304e() {
        synchronized (this.f4209a) {
            if (this.f4213e != C1271a.RUNNING) {
                this.f4213e = C1271a.RUNNING;
                this.f4211c.mo5304e();
            }
        }
    }

    /* renamed from: e */
    public void mo5305e(C1269c cVar) {
        synchronized (this.f4209a) {
            if (cVar.equals(this.f4211c)) {
                this.f4213e = C1271a.SUCCESS;
            } else if (cVar.equals(this.f4212d)) {
                this.f4214f = C1271a.SUCCESS;
            }
            if (this.f4210b != null) {
                this.f4210b.mo5305e(this);
            }
        }
    }

    /* renamed from: f */
    public boolean mo5306f() {
        boolean z;
        synchronized (this.f4209a) {
            if (this.f4213e != C1271a.SUCCESS) {
                if (this.f4214f != C1271a.SUCCESS) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo5307f(C1269c cVar) {
        boolean z;
        synchronized (this.f4209a) {
            z = m5965g() && m5966g(cVar);
        }
        return z;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f4209a) {
            if (this.f4213e != C1271a.RUNNING) {
                if (this.f4214f != C1271a.RUNNING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }
}
