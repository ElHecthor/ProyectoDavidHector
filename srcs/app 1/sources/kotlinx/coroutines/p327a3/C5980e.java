package kotlinx.coroutines.p327a3;

import java.util.concurrent.locks.ReentrantLock;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a3.e */
public class C5980e<E> extends C5961a<E> {

    /* renamed from: h */
    private final ReentrantLock f14991h;

    /* renamed from: i */
    private Object[] f14992i;

    /* renamed from: j */
    private int f14993j;

    /* renamed from: k */
    private final int f14994k;
    private volatile int size;

    public C5980e(int i) {
        this.f14994k = i;
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            this.f14991h = new ReentrantLock();
            this.f14992i = new Object[Math.min(this.f14994k, 8)];
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ArrayChannel capacity must be at least 1, but ");
        sb.append(this.f14994k);
        sb.append(" was specified");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    private final void m22486a(int i) {
        Object[] objArr = this.f14992i;
        if (i >= objArr.length) {
            Object[] objArr2 = new Object[Math.min(objArr.length * 2, this.f14994k)];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f14992i;
                objArr2[i2] = objArr3[(this.f14993j + i2) % objArr3.length];
            }
            this.f14992i = objArr2;
            this.f14993j = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo15677a(E e) {
        C6004x i;
        Object b;
        ReentrantLock reentrantLock = this.f14991h;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            C5989m c = mo15683c();
            if (c != null) {
                return c;
            }
            if (i2 < this.f14994k) {
                this.size = i2 + 1;
                if (i2 == 0) {
                    do {
                        i = mo15648i();
                        if (i != null) {
                            if (i instanceof C5989m) {
                                this.size = i2;
                                if (i != null) {
                                    reentrantLock.unlock();
                                    return i;
                                }
                                C5942k.m22323a();
                                throw null;
                            } else if (i != null) {
                                b = i.mo15658b(e, null);
                            } else {
                                C5942k.m22323a();
                                throw null;
                            }
                        }
                    } while (b == null);
                    this.size = i2;
                    C5812t tVar = C5812t.f14872a;
                    reentrantLock.unlock();
                    if (i != null) {
                        i.mo15659c(b);
                        if (i != null) {
                            return i.mo15702h();
                        }
                        C5942k.m22323a();
                        throw null;
                    }
                    C5942k.m22323a();
                    throw null;
                }
                m22486a(i2);
                this.f14992i[(this.f14993j + i2) % this.f14992i.length] = e;
                Object obj = C5970b.f14968a;
                reentrantLock.unlock();
                return obj;
            }
            Object obj2 = C5970b.f14969b;
            reentrantLock.unlock();
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c7 A[Catch:{ all -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo15643a(kotlinx.coroutines.p332e3.C6081d<?> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "select"
            p308k.p323z.p325d.C5942k.m22327b(r11, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r10.f14991h
            r0.lock()
            int r1 = r10.size     // Catch:{ all -> 0x00f2 }
            if (r1 != 0) goto L_0x001b
            kotlinx.coroutines.a3.m r11 = r10.mo15683c()     // Catch:{ all -> 0x00f2 }
            if (r11 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            java.lang.Object r11 = kotlinx.coroutines.p327a3.C5970b.f14970c     // Catch:{ all -> 0x00f2 }
        L_0x0017:
            r0.unlock()
            return r11
        L_0x001b:
            java.lang.Object[] r2 = r10.f14992i     // Catch:{ all -> 0x00f2 }
            int r3 = r10.f14993j     // Catch:{ all -> 0x00f2 }
            r2 = r2[r3]     // Catch:{ all -> 0x00f2 }
            java.lang.Object[] r3 = r10.f14992i     // Catch:{ all -> 0x00f2 }
            int r4 = r10.f14993j     // Catch:{ all -> 0x00f2 }
            r5 = 0
            r3[r4] = r5     // Catch:{ all -> 0x00f2 }
            int r3 = r1 + -1
            r10.size = r3     // Catch:{ all -> 0x00f2 }
            java.lang.Object r3 = kotlinx.coroutines.p327a3.C5970b.f14970c     // Catch:{ all -> 0x00f2 }
            int r4 = r10.f14994k     // Catch:{ all -> 0x00f2 }
            r6 = 1
            if (r1 != r4) goto L_0x00a9
            kotlinx.coroutines.a3.a$d r4 = r10.mo15650l()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r7 = r11.mo15840a(r4)     // Catch:{ all -> 0x00f2 }
            if (r7 != 0) goto L_0x0068
            java.lang.Object r3 = r4.mo15912c()     // Catch:{ all -> 0x00f2 }
            kotlinx.coroutines.a3.z r3 = (kotlinx.coroutines.p327a3.C6006z) r3     // Catch:{ all -> 0x00f2 }
            java.lang.Object r4 = r4.f14964d     // Catch:{ all -> 0x00f2 }
            boolean r7 = kotlinx.coroutines.C6157l0.m23149a()     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x0059
            if (r4 == 0) goto L_0x004f
            r7 = 1
            goto L_0x0050
        L_0x004f:
            r7 = 0
        L_0x0050:
            if (r7 == 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            java.lang.AssertionError r11 = new java.lang.AssertionError     // Catch:{ all -> 0x00f2 }
            r11.<init>()     // Catch:{ all -> 0x00f2 }
            throw r11     // Catch:{ all -> 0x00f2 }
        L_0x0059:
            if (r3 == 0) goto L_0x0064
            java.lang.Object r7 = r3.mo15676t()     // Catch:{ all -> 0x00f2 }
        L_0x005f:
            r9 = r4
            r4 = r3
            r3 = r7
            r7 = r9
            goto L_0x00ab
        L_0x0064:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x00f2 }
            throw r5
        L_0x0068:
            java.lang.Object r4 = kotlinx.coroutines.p327a3.C5970b.f14970c     // Catch:{ all -> 0x00f2 }
            if (r7 != r4) goto L_0x006d
            goto L_0x00a9
        L_0x006d:
            java.lang.Object r3 = kotlinx.coroutines.p332e3.C6082e.m22892c()     // Catch:{ all -> 0x00f2 }
            if (r7 != r3) goto L_0x007f
            r10.size = r1     // Catch:{ all -> 0x00f2 }
            java.lang.Object[] r11 = r10.f14992i     // Catch:{ all -> 0x00f2 }
            int r1 = r10.f14993j     // Catch:{ all -> 0x00f2 }
            r11[r1] = r2     // Catch:{ all -> 0x00f2 }
            r0.unlock()
            return r7
        L_0x007f:
            boolean r3 = r7 instanceof kotlinx.coroutines.p327a3.C5989m     // Catch:{ all -> 0x00f2 }
            if (r3 == 0) goto L_0x008e
            r3 = r7
            kotlinx.coroutines.a3.z r3 = (kotlinx.coroutines.p327a3.C6006z) r3     // Catch:{ all -> 0x00f2 }
            r4 = r7
            kotlinx.coroutines.a3.m r4 = (kotlinx.coroutines.p327a3.C5989m) r4     // Catch:{ all -> 0x00f2 }
            java.lang.Object r4 = r4.mo15675g(r5)     // Catch:{ all -> 0x00f2 }
            goto L_0x005f
        L_0x008e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r11.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            r11.append(r1)     // Catch:{ all -> 0x00f2 }
            r11.append(r7)     // Catch:{ all -> 0x00f2 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f2 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f2 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f2 }
            r1.<init>(r11)     // Catch:{ all -> 0x00f2 }
            throw r1     // Catch:{ all -> 0x00f2 }
        L_0x00a9:
            r4 = r5
            r7 = r4
        L_0x00ab:
            java.lang.Object r8 = kotlinx.coroutines.p327a3.C5970b.f14970c     // Catch:{ all -> 0x00f2 }
            if (r3 == r8) goto L_0x00c1
            boolean r8 = r3 instanceof kotlinx.coroutines.p327a3.C5989m     // Catch:{ all -> 0x00f2 }
            if (r8 != 0) goto L_0x00c1
            r10.size = r1     // Catch:{ all -> 0x00f2 }
            java.lang.Object[] r11 = r10.f14992i     // Catch:{ all -> 0x00f2 }
            int r8 = r10.f14993j     // Catch:{ all -> 0x00f2 }
            int r8 = r8 + r1
            java.lang.Object[] r1 = r10.f14992i     // Catch:{ all -> 0x00f2 }
            int r1 = r1.length     // Catch:{ all -> 0x00f2 }
            int r8 = r8 % r1
            r11[r8] = r3     // Catch:{ all -> 0x00f2 }
            goto L_0x00d7
        L_0x00c1:
            boolean r11 = r11.mo15843a(r5)     // Catch:{ all -> 0x00f2 }
            if (r11 != 0) goto L_0x00d7
            r10.size = r1     // Catch:{ all -> 0x00f2 }
            java.lang.Object[] r11 = r10.f14992i     // Catch:{ all -> 0x00f2 }
            int r1 = r10.f14993j     // Catch:{ all -> 0x00f2 }
            r11[r1] = r2     // Catch:{ all -> 0x00f2 }
            java.lang.Object r11 = kotlinx.coroutines.p332e3.C6082e.m22892c()     // Catch:{ all -> 0x00f2 }
            r0.unlock()
            return r11
        L_0x00d7:
            int r11 = r10.f14993j     // Catch:{ all -> 0x00f2 }
            int r11 = r11 + r6
            java.lang.Object[] r1 = r10.f14992i     // Catch:{ all -> 0x00f2 }
            int r1 = r1.length     // Catch:{ all -> 0x00f2 }
            int r11 = r11 % r1
            r10.f14993j = r11     // Catch:{ all -> 0x00f2 }
            k.t r11 = p308k.C5812t.f14872a     // Catch:{ all -> 0x00f2 }
            r0.unlock()
            if (r7 == 0) goto L_0x00f1
            if (r4 == 0) goto L_0x00ed
            r4.mo15674f(r7)
            goto L_0x00f1
        L_0x00ed:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r5
        L_0x00f1:
            return r2
        L_0x00f2:
            r11 = move-exception
            r0.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p327a3.C5980e.mo15643a(kotlinx.coroutines.e3.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo15678a() {
        StringBuilder sb = new StringBuilder();
        sb.append("(buffer:capacity=");
        sb.append(this.f14994k);
        sb.append(",size=");
        sb.append(this.size);
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo15685f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo15686h() {
        return this.size == this.f14994k;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo15649k() {
        ReentrantLock reentrantLock = this.f14991h;
        reentrantLock.lock();
        try {
            int i = this.size;
            for (int i2 = 0; i2 < i; i2++) {
                this.f14992i[this.f14993j] = Integer.valueOf(0);
                this.f14993j = (this.f14993j + 1) % this.f14992i.length;
            }
            this.size = 0;
            C5812t tVar = C5812t.f14872a;
            reentrantLock.unlock();
            super.mo15649k();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo15651m() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo15652n() {
        return this.size == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Object mo15656r() {
        Object obj;
        C6006z zVar;
        ReentrantLock reentrantLock = this.f14991h;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object c = mo15683c();
                if (c == null) {
                    c = C5970b.f14970c;
                }
                return c;
            }
            Object obj2 = this.f14992i[this.f14993j];
            this.f14992i[this.f14993j] = null;
            this.size = i - 1;
            Object obj3 = C5970b.f14970c;
            if (i == this.f14994k) {
                zVar = null;
                obj = null;
                while (true) {
                    C6006z j = mo15687j();
                    if (j != null) {
                        if (j != null) {
                            obj = j.mo15675g(null);
                            if (obj == null) {
                                zVar = j;
                            } else if (j != null) {
                                obj3 = j.mo15676t();
                                zVar = j;
                            } else {
                                C5942k.m22323a();
                                throw null;
                            }
                        } else {
                            C5942k.m22323a();
                            throw null;
                        }
                    }
                }
            } else {
                zVar = null;
                obj = null;
            }
            if (obj3 != C5970b.f14970c && !(obj3 instanceof C5989m)) {
                this.size = i;
                this.f14992i[(this.f14993j + i) % this.f14992i.length] = obj3;
            }
            this.f14993j = (this.f14993j + 1) % this.f14992i.length;
            C5812t tVar = C5812t.f14872a;
            reentrantLock.unlock();
            if (obj != null) {
                if (zVar != null) {
                    zVar.mo15674f(obj);
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            }
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }
}
