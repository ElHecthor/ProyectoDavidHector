package com.bumptech.glide.load.p007o;

import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.p007o.p010c0.C0963a;
import com.bumptech.glide.p025r.C1274g;
import com.bumptech.glide.p029t.C1302e;
import com.bumptech.glide.p029t.C1309j;
import com.bumptech.glide.p029t.p030l.C1312a.C1318f;
import com.bumptech.glide.p029t.p030l.C1321c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p071f.p097h.p107l.C3318e;

/* renamed from: com.bumptech.glide.load.o.l */
class C1002l<R> implements C0980b<R>, C1318f {

    /* renamed from: D */
    private static final C1005c f3667D = new C1005c();

    /* renamed from: A */
    C1011p<?> f3668A;

    /* renamed from: B */
    private C0978h<R> f3669B;

    /* renamed from: C */
    private volatile boolean f3670C;

    /* renamed from: f */
    final C1007e f3671f;

    /* renamed from: g */
    private final C1321c f3672g;

    /* renamed from: h */
    private final C1012a f3673h;

    /* renamed from: i */
    private final C3318e<C1002l<?>> f3674i;

    /* renamed from: j */
    private final C1005c f3675j;

    /* renamed from: k */
    private final C1008m f3676k;

    /* renamed from: l */
    private final C0963a f3677l;

    /* renamed from: m */
    private final C0963a f3678m;

    /* renamed from: n */
    private final C0963a f3679n;

    /* renamed from: o */
    private final C0963a f3680o;

    /* renamed from: p */
    private final AtomicInteger f3681p;

    /* renamed from: q */
    private C0869g f3682q;

    /* renamed from: r */
    private boolean f3683r;

    /* renamed from: s */
    private boolean f3684s;

    /* renamed from: t */
    private boolean f3685t;

    /* renamed from: u */
    private boolean f3686u;

    /* renamed from: v */
    private C1020v<?> f3687v;

    /* renamed from: w */
    C0856a f3688w;

    /* renamed from: x */
    private boolean f3689x;

    /* renamed from: y */
    C1013q f3690y;

    /* renamed from: z */
    private boolean f3691z;

    /* renamed from: com.bumptech.glide.load.o.l$a */
    private class C1003a implements Runnable {

        /* renamed from: f */
        private final C1274g f3692f;

        C1003a(C1274g gVar) {
            this.f3692f = gVar;
        }

        public void run() {
            synchronized (this.f3692f.mo5314b()) {
                synchronized (C1002l.this) {
                    if (C1002l.this.f3671f.mo4870a(this.f3692f)) {
                        C1002l.this.mo4855a(this.f3692f);
                    }
                    C1002l.this.mo4857b();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.l$b */
    private class C1004b implements Runnable {

        /* renamed from: f */
        private final C1274g f3694f;

        C1004b(C1274g gVar) {
            this.f3694f = gVar;
        }

        public void run() {
            synchronized (this.f3694f.mo5314b()) {
                synchronized (C1002l.this) {
                    if (C1002l.this.f3671f.mo4870a(this.f3694f)) {
                        C1002l.this.f3668A.mo4879a();
                        C1002l.this.mo4859b(this.f3694f);
                        C1002l.this.mo4861c(this.f3694f);
                    }
                    C1002l.this.mo4857b();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.l$c */
    static class C1005c {
        C1005c() {
        }

        /* renamed from: a */
        public <R> C1011p<R> mo4866a(C1020v<R> vVar, boolean z, C0869g gVar, C1012a aVar) {
            C1011p pVar = new C1011p(vVar, z, true, gVar, aVar);
            return pVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.l$d */
    static final class C1006d {

        /* renamed from: a */
        final C1274g f3696a;

        /* renamed from: b */
        final Executor f3697b;

        C1006d(C1274g gVar, Executor executor) {
            this.f3696a = gVar;
            this.f3697b = executor;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1006d)) {
                return false;
            }
            return this.f3696a.equals(((C1006d) obj).f3696a);
        }

        public int hashCode() {
            return this.f3696a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.l$e */
    static final class C1007e implements Iterable<C1006d> {

        /* renamed from: f */
        private final List<C1006d> f3698f;

        C1007e() {
            this(new ArrayList(2));
        }

        C1007e(List<C1006d> list) {
            this.f3698f = list;
        }

        /* renamed from: c */
        private static C1006d m5026c(C1274g gVar) {
            return new C1006d(gVar, C1302e.m6133a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4869a(C1274g gVar, Executor executor) {
            this.f3698f.add(new C1006d(gVar, executor));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4870a(C1274g gVar) {
            return this.f3698f.contains(m5026c(gVar));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4871b(C1274g gVar) {
            this.f3698f.remove(m5026c(gVar));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C1007e mo4872c() {
            return new C1007e(new ArrayList(this.f3698f));
        }

        /* access modifiers changed from: 0000 */
        public void clear() {
            this.f3698f.clear();
        }

        /* access modifiers changed from: 0000 */
        public boolean isEmpty() {
            return this.f3698f.isEmpty();
        }

        public Iterator<C1006d> iterator() {
            return this.f3698f.iterator();
        }

        /* access modifiers changed from: 0000 */
        public int size() {
            return this.f3698f.size();
        }
    }

    C1002l(C0963a aVar, C0963a aVar2, C0963a aVar3, C0963a aVar4, C1008m mVar, C1012a aVar5, C3318e<C1002l<?>> eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, eVar, f3667D);
    }

    C1002l(C0963a aVar, C0963a aVar2, C0963a aVar3, C0963a aVar4, C1008m mVar, C1012a aVar5, C3318e<C1002l<?>> eVar, C1005c cVar) {
        this.f3671f = new C1007e();
        this.f3672g = C1321c.m6194b();
        this.f3681p = new AtomicInteger();
        this.f3677l = aVar;
        this.f3678m = aVar2;
        this.f3679n = aVar3;
        this.f3680o = aVar4;
        this.f3676k = mVar;
        this.f3673h = aVar5;
        this.f3674i = eVar;
        this.f3675j = cVar;
    }

    /* renamed from: f */
    private C0963a m5006f() {
        return this.f3684s ? this.f3679n : this.f3685t ? this.f3680o : this.f3678m;
    }

    /* renamed from: h */
    private boolean m5007h() {
        return this.f3691z || this.f3689x || this.f3670C;
    }

    /* renamed from: i */
    private synchronized void m5008i() {
        if (this.f3682q != null) {
            this.f3671f.clear();
            this.f3682q = null;
            this.f3668A = null;
            this.f3687v = null;
            this.f3691z = false;
            this.f3670C = false;
            this.f3689x = false;
            this.f3669B.mo4820a(false);
            this.f3669B = null;
            this.f3690y = null;
            this.f3688w = null;
            this.f3674i.mo5388a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized C1002l<R> mo4852a(C0869g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f3682q = gVar;
        this.f3683r = z;
        this.f3684s = z2;
        this.f3685t = z3;
        this.f3686u = z4;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4853a() {
        if (!m5007h()) {
            this.f3670C = true;
            this.f3669B.mo4822h();
            this.f3676k.mo4846a(this, this.f3682q);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo4854a(int i) {
        C1309j.m6153a(m5007h(), "Not yet complete!");
        if (this.f3681p.getAndAdd(i) == 0 && this.f3668A != null) {
            this.f3668A.mo4879a();
        }
    }

    /* renamed from: a */
    public void mo4825a(C0978h<?> hVar) {
        m5006f().execute(hVar);
    }

    /* renamed from: a */
    public void mo4826a(C1013q qVar) {
        synchronized (this) {
            this.f3690y = qVar;
        }
        mo4860c();
    }

    /* renamed from: a */
    public void mo4827a(C1020v<R> vVar, C0856a aVar) {
        synchronized (this) {
            this.f3687v = vVar;
            this.f3688w = aVar;
        }
        mo4862d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4855a(C1274g gVar) {
        try {
            gVar.mo5312a(this.f3690y);
        } catch (Throwable th) {
            throw new C0939b(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo4856a(C1274g gVar, Executor executor) {
        Runnable aVar;
        this.f3672g.mo5389a();
        this.f3671f.mo4869a(gVar, executor);
        boolean z = true;
        if (this.f3689x) {
            mo4854a(1);
            aVar = new C1004b(gVar);
        } else if (this.f3691z) {
            mo4854a(1);
            aVar = new C1003a(gVar);
        } else {
            if (this.f3670C) {
                z = false;
            }
            C1309j.m6153a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4857b() {
        C1011p<?> pVar;
        synchronized (this) {
            this.f3672g.mo5389a();
            C1309j.m6153a(m5007h(), "Not yet complete!");
            int decrementAndGet = this.f3681p.decrementAndGet();
            C1309j.m6153a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                pVar = this.f3668A;
                m5008i();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.mo4885g();
        }
    }

    /* renamed from: b */
    public synchronized void mo4858b(C0978h<R> hVar) {
        this.f3669B = hVar;
        (hVar.mo4823i() ? this.f3677l : m5006f()).execute(hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4859b(C1274g gVar) {
        try {
            gVar.mo5313a(this.f3668A, this.f3688w);
        } catch (Throwable th) {
            throw new C0939b(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f3676k.mo4847a(r4, r1, null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = (com.bumptech.glide.load.p007o.C1002l.C1006d) r0.next();
        r1.f3697b.execute(new com.bumptech.glide.load.p007o.C1002l.C1003a(r4, r1.f3696a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo4857b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4860c() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.t.l.c r0 = r4.f3672g     // Catch:{ all -> 0x0066 }
            r0.mo5389a()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f3670C     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.m5008i()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.bumptech.glide.load.o.l$e r0 = r4.f3671f     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f3691z     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f3691z = r0     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.g r1 = r4.f3682q     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.o.l$e r2 = r4.f3671f     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.o.l$e r2 = r2.mo4872c()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo4854a(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.o.m r0 = r4.f3676k
            r3 = 0
            r0.mo4847a(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.o.l$d r1 = (com.bumptech.glide.load.p007o.C1002l.C1006d) r1
            java.util.concurrent.Executor r2 = r1.f3697b
            com.bumptech.glide.load.o.l$a r3 = new com.bumptech.glide.load.o.l$a
            com.bumptech.glide.r.g r1 = r1.f3696a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo4857b()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p007o.C1002l.mo4860c():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized void mo4861c(C1274g gVar) {
        boolean z;
        this.f3672g.mo5389a();
        this.f3671f.mo4871b(gVar);
        if (this.f3671f.isEmpty()) {
            mo4853a();
            if (!this.f3689x) {
                if (!this.f3691z) {
                    z = false;
                    if (z && this.f3681p.get() == 0) {
                        m5008i();
                    }
                }
            }
            z = true;
            m5008i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f3676k.mo4847a(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = (com.bumptech.glide.load.p007o.C1002l.C1006d) r0.next();
        r1.f3697b.execute(new com.bumptech.glide.load.p007o.C1002l.C1004b(r5, r1.f3696a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        mo4857b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4862d() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.bumptech.glide.t.l.c r0 = r5.f3672g     // Catch:{ all -> 0x007c }
            r0.mo5389a()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.f3670C     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            com.bumptech.glide.load.o.v<?> r0 = r5.f3687v     // Catch:{ all -> 0x007c }
            r0.mo4882d()     // Catch:{ all -> 0x007c }
            r5.m5008i()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            com.bumptech.glide.load.o.l$e r0 = r5.f3671f     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.f3689x     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            com.bumptech.glide.load.o.l$c r0 = r5.f3675j     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.v<?> r1 = r5.f3687v     // Catch:{ all -> 0x007c }
            boolean r2 = r5.f3683r     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.g r3 = r5.f3682q     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.p$a r4 = r5.f3673h     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.p r0 = r0.mo4866a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.f3668A = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.f3689x = r0     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.l$e r1 = r5.f3671f     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.l$e r1 = r1.mo4872c()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.mo4854a(r2)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.g r0 = r5.f3682q     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.p<?> r2 = r5.f3668A     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.o.m r3 = r5.f3676k
            r3.mo4847a(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.o.l$d r1 = (com.bumptech.glide.load.p007o.C1002l.C1006d) r1
            java.util.concurrent.Executor r2 = r1.f3697b
            com.bumptech.glide.load.o.l$b r3 = new com.bumptech.glide.load.o.l$b
            com.bumptech.glide.r.g r1 = r1.f3696a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.mo4857b()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p007o.C1002l.mo4862d():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo4863e() {
        return this.f3686u;
    }

    /* renamed from: g */
    public C1321c mo4765g() {
        return this.f3672g;
    }
}
