package p337m.p338f0.p340d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6250b;

/* renamed from: m.f0.d.c */
public final class C6261c {

    /* renamed from: a */
    private boolean f15447a;

    /* renamed from: b */
    private C6259a f15448b;

    /* renamed from: c */
    private final List<C6259a> f15449c = new ArrayList();

    /* renamed from: d */
    private boolean f15450d;

    /* renamed from: e */
    private final C6262d f15451e;

    /* renamed from: f */
    private final String f15452f;

    public C6261c(C6262d dVar, String str) {
        C5942k.m22327b(dVar, "taskRunner");
        C5942k.m22327b(str, "name");
        this.f15451e = dVar;
        this.f15452f = str;
    }

    /* renamed from: a */
    public static /* synthetic */ void m23503a(C6261c cVar, C6259a aVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        cVar.mo16116a(aVar, j);
    }

    /* renamed from: a */
    public final void mo16114a() {
        if (!C6250b.f15421g || !Thread.holdsLock(this)) {
            synchronized (this.f15451e) {
                if (mo16119b()) {
                    this.f15451e.mo16129a(this);
                }
                C5812t tVar = C5812t.f14872a;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public final void mo16115a(C6259a aVar) {
        this.f15448b = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16116a(p337m.p338f0.p340d.C6259a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            p308k.p323z.p325d.C5942k.m22327b(r3, r0)
            m.f0.d.d r0 = r2.f15451e
            monitor-enter(r0)
            boolean r1 = r2.f15447a     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0040
            boolean r4 = r3.mo16108a()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0027
            m.f0.d.d$b r4 = p337m.p338f0.p340d.C6262d.f15455j     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = r4.mo16136a()     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            p337m.p338f0.p340d.C6260b.m23502b(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x0025:
            monitor-exit(r0)
            return
        L_0x0027:
            m.f0.d.d$b r4 = p337m.p338f0.p340d.C6262d.f15455j     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = r4.mo16136a()     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            p337m.p338f0.p340d.C6260b.m23502b(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0050 }
            r3.<init>()     // Catch:{ all -> 0x0050 }
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0040:
            r1 = 0
            boolean r3 = r2.mo16118a(r3, r4, r1)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x004c
            m.f0.d.d r3 = r2.f15451e     // Catch:{ all -> 0x0050 }
            r3.mo16129a(r2)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            k.t r3 = p308k.C5812t.f14872a     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)
            return
        L_0x0050:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p340d.C6261c.mo16116a(m.f0.d.a, long):void");
    }

    /* renamed from: a */
    public final void mo16117a(boolean z) {
        this.f15450d = z;
    }

    /* renamed from: a */
    public final boolean mo16118a(C6259a aVar, long j, boolean z) {
        StringBuilder sb;
        String str;
        C5942k.m22327b(aVar, "task");
        aVar.mo16107a(this);
        long a = this.f15451e.mo16130b().mo16132a();
        long j2 = a + j;
        int indexOf = this.f15449c.indexOf(aVar);
        boolean z2 = false;
        if (indexOf != -1) {
            if (aVar.mo16110c() <= j2) {
                if (C6262d.f15455j.mo16136a().isLoggable(Level.FINE)) {
                    C6260b.m23502b(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f15449c.remove(indexOf);
        }
        aVar.mo16106a(j2);
        if (C6262d.f15455j.mo16136a().isLoggable(Level.FINE)) {
            if (z) {
                sb = new StringBuilder();
                str = "run again after ";
            } else {
                sb = new StringBuilder();
                str = "scheduled after ";
            }
            sb.append(str);
            sb.append(C6260b.m23500a(j2 - a));
            C6260b.m23502b(aVar, this, sb.toString());
        }
        Iterator it = this.f15449c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((C6259a) it.next()).mo16110c() - a > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.f15449c.size();
        }
        this.f15449c.add(i, aVar);
        if (i == 0) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: b */
    public final boolean mo16119b() {
        C6259a aVar = this.f15448b;
        if (aVar != null) {
            if (aVar == null) {
                C5942k.m22323a();
                throw null;
            } else if (aVar.mo16108a()) {
                this.f15450d = true;
            }
        }
        boolean z = false;
        for (int size = this.f15449c.size() - 1; size >= 0; size--) {
            if (((C6259a) this.f15449c.get(size)).mo16108a()) {
                C6259a aVar2 = (C6259a) this.f15449c.get(size);
                if (C6262d.f15455j.mo16136a().isLoggable(Level.FINE)) {
                    C6260b.m23502b(aVar2, this, "canceled");
                }
                this.f15449c.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final C6259a mo16120c() {
        return this.f15448b;
    }

    /* renamed from: d */
    public final boolean mo16121d() {
        return this.f15450d;
    }

    /* renamed from: e */
    public final List<C6259a> mo16122e() {
        return this.f15449c;
    }

    /* renamed from: f */
    public final String mo16123f() {
        return this.f15452f;
    }

    /* renamed from: g */
    public final boolean mo16124g() {
        return this.f15447a;
    }

    /* renamed from: h */
    public final C6262d mo16125h() {
        return this.f15451e;
    }

    /* renamed from: i */
    public final void mo16126i() {
        if (!C6250b.f15421g || !Thread.holdsLock(this)) {
            synchronized (this.f15451e) {
                this.f15447a = true;
                if (mo16119b()) {
                    this.f15451e.mo16129a(this);
                }
                C5812t tVar = C5812t.f14872a;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public String toString() {
        return this.f15452f;
    }
}
