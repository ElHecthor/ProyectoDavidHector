package com.bumptech.glide.load.p007o;

import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.p029t.C1309j;

/* renamed from: com.bumptech.glide.load.o.p */
class C1011p<Z> implements C1020v<Z> {

    /* renamed from: f */
    private final boolean f3708f;

    /* renamed from: g */
    private final boolean f3709g;

    /* renamed from: h */
    private final C1020v<Z> f3710h;

    /* renamed from: i */
    private final C1012a f3711i;

    /* renamed from: j */
    private final C0869g f3712j;

    /* renamed from: k */
    private int f3713k;

    /* renamed from: l */
    private boolean f3714l;

    /* renamed from: com.bumptech.glide.load.o.p$a */
    interface C1012a {
        /* renamed from: a */
        void mo4845a(C0869g gVar, C1011p<?> pVar);
    }

    C1011p(C1020v<Z> vVar, boolean z, boolean z2, C0869g gVar, C1012a aVar) {
        C1309j.m6149a(vVar);
        this.f3710h = vVar;
        this.f3708f = z;
        this.f3709g = z2;
        this.f3712j = gVar;
        C1309j.m6149a(aVar);
        this.f3711i = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo4879a() {
        if (!this.f3714l) {
            this.f3713k++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: b */
    public int mo4880b() {
        return this.f3710h.mo4880b();
    }

    /* renamed from: c */
    public Class<Z> mo4881c() {
        return this.f3710h.mo4881c();
    }

    /* renamed from: d */
    public synchronized void mo4882d() {
        if (this.f3713k > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f3714l) {
            this.f3714l = true;
            if (this.f3709g) {
                this.f3710h.mo4882d();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C1020v<Z> mo4883e() {
        return this.f3710h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo4884f() {
        return this.f3708f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4885g() {
        boolean z;
        synchronized (this) {
            if (this.f3713k > 0) {
                z = true;
                int i = this.f3713k - 1;
                this.f3713k = i;
                if (i != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f3711i.mo4845a(this.f3712j, this);
        }
    }

    public Z get() {
        return this.f3710h.get();
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("EngineResource{isMemoryCacheable=");
        sb.append(this.f3708f);
        sb.append(", listener=");
        sb.append(this.f3711i);
        sb.append(", key=");
        sb.append(this.f3712j);
        sb.append(", acquired=");
        sb.append(this.f3713k);
        sb.append(", isRecycled=");
        sb.append(this.f3714l);
        sb.append(", resource=");
        sb.append(this.f3710h);
        sb.append('}');
        return sb.toString();
    }
}
