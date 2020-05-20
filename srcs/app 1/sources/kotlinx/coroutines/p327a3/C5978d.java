package kotlinx.coroutines.p327a3;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.C6108e;
import kotlinx.coroutines.p332e3.C6081d;
import kotlinx.coroutines.p332e3.C6082e;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a3.d */
public final class C5978d<E> extends C5972c<E> implements C5981f<E> {

    /* renamed from: h */
    private final ReentrantLock f14985h;
    private volatile long head;

    /* renamed from: i */
    private final Object[] f14986i;

    /* renamed from: j */
    private final List<C5979a<E>> f14987j;

    /* renamed from: k */
    private final int f14988k;
    private volatile int size;
    /* access modifiers changed from: private */
    public volatile long tail;

    /* renamed from: kotlinx.coroutines.a3.d$a */
    private static final class C5979a<E> extends C5961a<E> implements C6003w<E> {

        /* renamed from: h */
        private final ReentrantLock f14989h = new ReentrantLock();

        /* renamed from: i */
        private final C5978d<E> f14990i;
        public volatile long subHead;

        public C5979a(C5978d<E> dVar) {
            C5942k.m22327b(dVar, "broadcastChannel");
            this.f14990i = dVar;
        }

        /* renamed from: t */
        private final void m22475t() {
            ReentrantLock reentrantLock = this.f14989h;
            reentrantLock.lock();
            try {
                this.subHead = this.f14990i.tail;
                C5812t tVar = C5812t.f14872a;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: u */
        private final boolean m22476u() {
            if (mo15681b() != null) {
                return false;
            }
            return !mo15652n() || this.f14990i.mo15681b() != null;
        }

        /* renamed from: v */
        private final Object m22477v() {
            long j = this.subHead;
            Object b = this.f14990i.mo15681b();
            if (j >= this.f14990i.tail) {
                if (b == null) {
                    b = mo15681b();
                }
                if (b == null) {
                    b = C5970b.f14970c;
                }
                return b;
            }
            Object a = this.f14990i.m22463a(j);
            C5989m b2 = mo15681b();
            return b2 != null ? b2 : a;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo15643a(C6081d<?> dVar) {
            C5942k.m22327b(dVar, "select");
            ReentrantLock reentrantLock = this.f14989h;
            reentrantLock.lock();
            try {
                Object v = m22477v();
                boolean z = true;
                boolean z2 = false;
                if (!(v instanceof C5989m)) {
                    if (v != C5970b.f14970c) {
                        if (!dVar.mo15843a((Object) null)) {
                            v = C6082e.m22892c();
                        } else {
                            this.subHead++;
                            z2 = true;
                        }
                    }
                }
                reentrantLock.unlock();
                C5989m mVar = (C5989m) (!(v instanceof C5989m) ? null : v);
                if (mVar != null) {
                    mo15671a(mVar.f14999i);
                }
                if (!mo15698s()) {
                    z = z2;
                }
                if (z) {
                    C5978d.m22466a(this.f14990i, null, null, 3, null);
                }
                return v;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* renamed from: b */
        public boolean mo15645b(Throwable th) {
            boolean a = mo15671a(th);
            if (a) {
                C5978d.m22466a(this.f14990i, null, this, 1, null);
            }
            m22475t();
            return a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public boolean mo15685f() {
            throw new IllegalStateException("Should not be used".toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public boolean mo15686h() {
            throw new IllegalStateException("Should not be used".toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public boolean mo15651m() {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public boolean mo15652n() {
            return this.subHead >= this.f14990i.tail;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x003b  */
        /* renamed from: r */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo15656r() {
            /*
                r8 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r8.f14989h
                r0.lock()
                java.lang.Object r1 = r8.m22477v()     // Catch:{ all -> 0x0042 }
                boolean r2 = r1 instanceof kotlinx.coroutines.p327a3.C5989m     // Catch:{ all -> 0x0042 }
                r3 = 1
                if (r2 == 0) goto L_0x000f
                goto L_0x0013
            L_0x000f:
                java.lang.Object r2 = kotlinx.coroutines.p327a3.C5970b.f14970c     // Catch:{ all -> 0x0042 }
                if (r1 != r2) goto L_0x0015
            L_0x0013:
                r2 = 0
                goto L_0x001d
            L_0x0015:
                long r4 = r8.subHead     // Catch:{ all -> 0x0042 }
                r6 = 1
                long r4 = r4 + r6
                r8.subHead = r4     // Catch:{ all -> 0x0042 }
                r2 = 1
            L_0x001d:
                r0.unlock()
                boolean r0 = r1 instanceof kotlinx.coroutines.p327a3.C5989m
                r4 = 0
                if (r0 != 0) goto L_0x0027
                r0 = r4
                goto L_0x0028
            L_0x0027:
                r0 = r1
            L_0x0028:
                kotlinx.coroutines.a3.m r0 = (kotlinx.coroutines.p327a3.C5989m) r0
                if (r0 == 0) goto L_0x0031
                java.lang.Throwable r0 = r0.f14999i
                r8.mo15671a(r0)
            L_0x0031:
                boolean r0 = r8.mo15698s()
                if (r0 == 0) goto L_0x0038
                goto L_0x0039
            L_0x0038:
                r3 = r2
            L_0x0039:
                if (r3 == 0) goto L_0x0041
                kotlinx.coroutines.a3.d<E> r0 = r8.f14990i
                r2 = 3
                kotlinx.coroutines.p327a3.C5978d.m22466a(r0, r4, r4, r2, r4)
            L_0x0041:
                return r1
            L_0x0042:
                r1 = move-exception
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p327a3.C5978d.C5979a.mo15656r():java.lang.Object");
        }

        /* renamed from: s */
        public final boolean mo15698s() {
            C5989m mVar;
            boolean z = false;
            while (true) {
                mVar = null;
                if (!m22476u() || !this.f14989h.tryLock()) {
                    break;
                }
                try {
                    Object v = m22477v();
                    if (v != C5970b.f14970c) {
                        if (v instanceof C5989m) {
                            mVar = (C5989m) v;
                            break;
                        }
                        C6004x i = mo15648i();
                        if (i == null) {
                            break;
                        } else if (i instanceof C5989m) {
                            break;
                        } else {
                            Object b = i.mo15658b(v, null);
                            if (b != null) {
                                this.subHead++;
                                z = true;
                                this.f14989h.unlock();
                                if (i != null) {
                                    i.mo15659c(b);
                                } else {
                                    C5942k.m22323a();
                                    throw null;
                                }
                            }
                        }
                    }
                } finally {
                    this.f14989h.unlock();
                }
            }
            this.f14989h.unlock();
            if (mVar != null) {
                mo15671a(mVar.f14999i);
            }
            return z;
        }
    }

    public C5978d(int i) {
        this.f14988k = i;
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            this.f14985h = new ReentrantLock();
            this.f14986i = new Object[this.f14988k];
            this.f14987j = C6108e.m22952a();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ArrayBroadcastChannel capacity must be at least 1, but ");
        sb.append(this.f14988k);
        sb.append(" was specified");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final E m22463a(long j) {
        return this.f14986i[(int) (j % ((long) this.f14988k))];
    }

    /* renamed from: a */
    private final void m22465a(C5979a<E> aVar, C5979a<E> aVar2) {
        C6006z j;
        Object g;
        while (true) {
            ReentrantLock reentrantLock = this.f14985h;
            reentrantLock.lock();
            if (aVar != null) {
                try {
                    aVar.subHead = this.tail;
                    boolean isEmpty = this.f14987j.isEmpty();
                    this.f14987j.add(aVar);
                    if (!isEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (aVar2 != null) {
                this.f14987j.remove(aVar2);
                if (this.head != aVar2.subHead) {
                    reentrantLock.unlock();
                    return;
                }
            }
            long l = m22468l();
            long j2 = this.tail;
            long j3 = this.head;
            long b = C5736g.m21873b(l, j2);
            if (b <= j3) {
                reentrantLock.unlock();
                return;
            }
            int i = this.size;
            while (j3 < b) {
                this.f14986i[(int) (j3 % ((long) this.f14988k))] = null;
                boolean z = i >= this.f14988k;
                j3++;
                this.head = j3;
                i--;
                this.size = i;
                if (z) {
                    do {
                        j = mo15687j();
                        if (j == null) {
                            continue;
                        } else if (!(j instanceof C5989m)) {
                            if (j != null) {
                                g = j.mo15675g(null);
                            } else {
                                C5942k.m22323a();
                                throw null;
                            }
                        }
                    } while (g == null);
                    Object[] objArr = this.f14986i;
                    int i2 = (int) (j2 % ((long) this.f14988k));
                    if (j != null) {
                        objArr[i2] = j.mo15676t();
                        this.size = i + 1;
                        this.tail = j2 + 1;
                        C5812t tVar = C5812t.f14872a;
                        reentrantLock.unlock();
                        if (j != null) {
                            j.mo15674f(g);
                            m22467k();
                            aVar = null;
                            aVar2 = null;
                        } else {
                            C5942k.m22323a();
                            throw null;
                        }
                    } else {
                        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
                    }
                }
            }
            reentrantLock.unlock();
            return;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m22466a(C5978d dVar, C5979a aVar, C5979a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        dVar.m22465a(aVar, aVar2);
    }

    /* renamed from: k */
    private final void m22467k() {
        boolean z = false;
        boolean z2 = false;
        for (C5979a s : this.f14987j) {
            if (s.mo15698s()) {
                z = true;
            }
            z2 = true;
        }
        if (z || !z2) {
            m22466a(this, null, null, 3, null);
        }
    }

    /* renamed from: l */
    private final long m22468l() {
        long j = Long.MAX_VALUE;
        for (C5979a aVar : this.f14987j) {
            j = C5736g.m21873b(j, aVar.subHead);
        }
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo15677a(E e) {
        ReentrantLock reentrantLock = this.f14985h;
        reentrantLock.lock();
        try {
            C5989m c = mo15683c();
            if (c != null) {
                return c;
            }
            int i = this.size;
            if (i >= this.f14988k) {
                Object obj = C5970b.f14969b;
                reentrantLock.unlock();
                return obj;
            }
            long j = this.tail;
            this.f14986i[(int) (j % ((long) this.f14988k))] = e;
            this.size = i + 1;
            this.tail = j + 1;
            C5812t tVar = C5812t.f14872a;
            reentrantLock.unlock();
            m22467k();
            return C5970b.f14968a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo15678a() {
        StringBuilder sb = new StringBuilder();
        sb.append("(buffer:capacity=");
        sb.append(this.f14986i.length);
        sb.append(",size=");
        sb.append(this.size);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo15671a(Throwable th) {
        if (!super.mo15671a(th)) {
            return false;
        }
        m22467k();
        return true;
    }

    /* renamed from: d */
    public C6003w<E> mo15697d() {
        C5979a aVar = new C5979a(this);
        m22466a(this, aVar, null, 2, null);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo15685f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo15686h() {
        return this.size >= this.f14988k;
    }
}
