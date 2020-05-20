package com.bumptech.glide.p025r;

import com.bumptech.glide.p025r.C1270d.C1271a;

/* renamed from: com.bumptech.glide.r.i */
public class C1277i implements C1270d, C1269c {

    /* renamed from: a */
    private final C1270d f4260a;

    /* renamed from: b */
    private final Object f4261b;

    /* renamed from: c */
    private volatile C1269c f4262c;

    /* renamed from: d */
    private volatile C1269c f4263d;

    /* renamed from: e */
    private C1271a f4264e;

    /* renamed from: f */
    private C1271a f4265f;

    /* renamed from: g */
    private boolean f4266g;

    public C1277i(Object obj, C1270d dVar) {
        C1271a aVar = C1271a.CLEARED;
        this.f4264e = aVar;
        this.f4265f = aVar;
        this.f4261b = obj;
        this.f4260a = dVar;
    }

    /* renamed from: g */
    private boolean m6034g() {
        C1270d dVar = this.f4260a;
        return dVar == null || dVar.mo5307f(this);
    }

    /* renamed from: h */
    private boolean m6035h() {
        C1270d dVar = this.f4260a;
        return dVar == null || dVar.mo5300c(this);
    }

    /* renamed from: i */
    private boolean m6036i() {
        C1270d dVar = this.f4260a;
        return dVar == null || dVar.mo5303d(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5294a(com.bumptech.glide.p025r.C1269c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4261b
            monitor-enter(r0)
            com.bumptech.glide.r.c r1 = r2.f4262c     // Catch:{ all -> 0x0020 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0020 }
            if (r3 != 0) goto L_0x0011
            com.bumptech.glide.r.d$a r3 = com.bumptech.glide.p025r.C1270d.C1271a.FAILED     // Catch:{ all -> 0x0020 }
            r2.f4265f = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0011:
            com.bumptech.glide.r.d$a r3 = com.bumptech.glide.p025r.C1270d.C1271a.FAILED     // Catch:{ all -> 0x0020 }
            r2.f4264e = r3     // Catch:{ all -> 0x0020 }
            com.bumptech.glide.r.d r3 = r2.f4260a     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x001e
            com.bumptech.glide.r.d r3 = r2.f4260a     // Catch:{ all -> 0x0020 }
            r3.mo5294a(r2)     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025r.C1277i.mo5294a(com.bumptech.glide.r.c):void");
    }

    /* renamed from: a */
    public void mo5316a(C1269c cVar, C1269c cVar2) {
        this.f4262c = cVar;
        this.f4263d = cVar2;
    }

    /* renamed from: a */
    public boolean mo5296a() {
        boolean z;
        synchronized (this.f4261b) {
            if (!this.f4263d.mo5296a()) {
                if (!this.f4262c.mo5296a()) {
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
        synchronized (this.f4261b) {
            b = this.f4260a != null ? this.f4260a.mo5297b() : this;
        }
        return b;
    }

    /* renamed from: b */
    public boolean mo5298b(C1269c cVar) {
        if (!(cVar instanceof C1277i)) {
            return false;
        }
        C1277i iVar = (C1277i) cVar;
        if (this.f4262c == null) {
            if (iVar.f4262c != null) {
                return false;
            }
        } else if (!this.f4262c.mo5298b(iVar.f4262c)) {
            return false;
        }
        if (this.f4263d == null) {
            if (iVar.f4263d != null) {
                return false;
            }
        } else if (!this.f4263d.mo5298b(iVar.f4263d)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo5299c() {
        boolean z;
        synchronized (this.f4261b) {
            z = this.f4264e == C1271a.CLEARED;
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo5300c(C1269c cVar) {
        boolean z;
        synchronized (this.f4261b) {
            z = m6035h() && cVar.equals(this.f4262c) && !mo5296a();
        }
        return z;
    }

    public void clear() {
        synchronized (this.f4261b) {
            this.f4266g = false;
            this.f4264e = C1271a.CLEARED;
            this.f4265f = C1271a.CLEARED;
            this.f4263d.clear();
            this.f4262c.clear();
        }
    }

    /* renamed from: d */
    public void mo5302d() {
        synchronized (this.f4261b) {
            if (!this.f4265f.mo5309f()) {
                this.f4265f = C1271a.PAUSED;
                this.f4263d.mo5302d();
            }
            if (!this.f4264e.mo5309f()) {
                this.f4264e = C1271a.PAUSED;
                this.f4262c.mo5302d();
            }
        }
    }

    /* renamed from: d */
    public boolean mo5303d(C1269c cVar) {
        boolean z;
        synchronized (this.f4261b) {
            z = m6036i() && (cVar.equals(this.f4262c) || this.f4264e != C1271a.SUCCESS);
        }
        return z;
    }

    /* renamed from: e */
    public void mo5304e() {
        synchronized (this.f4261b) {
            this.f4266g = true;
            try {
                if (!(this.f4264e == C1271a.SUCCESS || this.f4265f == C1271a.RUNNING)) {
                    this.f4265f = C1271a.RUNNING;
                    this.f4263d.mo5304e();
                }
                if (this.f4266g && this.f4264e != C1271a.RUNNING) {
                    this.f4264e = C1271a.RUNNING;
                    this.f4262c.mo5304e();
                }
            } finally {
                this.f4266g = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5305e(com.bumptech.glide.p025r.C1269c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4261b
            monitor-enter(r0)
            com.bumptech.glide.r.c r1 = r2.f4263d     // Catch:{ all -> 0x002d }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0011
            com.bumptech.glide.r.d$a r3 = com.bumptech.glide.p025r.C1270d.C1271a.SUCCESS     // Catch:{ all -> 0x002d }
            r2.f4265f = r3     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0011:
            com.bumptech.glide.r.d$a r3 = com.bumptech.glide.p025r.C1270d.C1271a.SUCCESS     // Catch:{ all -> 0x002d }
            r2.f4264e = r3     // Catch:{ all -> 0x002d }
            com.bumptech.glide.r.d r3 = r2.f4260a     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x001e
            com.bumptech.glide.r.d r3 = r2.f4260a     // Catch:{ all -> 0x002d }
            r3.mo5305e(r2)     // Catch:{ all -> 0x002d }
        L_0x001e:
            com.bumptech.glide.r.d$a r3 = r2.f4265f     // Catch:{ all -> 0x002d }
            boolean r3 = r3.mo5309f()     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x002b
            com.bumptech.glide.r.c r3 = r2.f4263d     // Catch:{ all -> 0x002d }
            r3.clear()     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p025r.C1277i.mo5305e(com.bumptech.glide.r.c):void");
    }

    /* renamed from: f */
    public boolean mo5306f() {
        boolean z;
        synchronized (this.f4261b) {
            z = this.f4264e == C1271a.SUCCESS;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo5307f(C1269c cVar) {
        boolean z;
        synchronized (this.f4261b) {
            z = m6034g() && cVar.equals(this.f4262c) && this.f4264e != C1271a.PAUSED;
        }
        return z;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f4261b) {
            z = this.f4264e == C1271a.RUNNING;
        }
        return z;
    }
}
