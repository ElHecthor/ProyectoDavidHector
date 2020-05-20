package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C6157l0;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.m */
public final class C6128m<E> {

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f15230e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f15231f;

    /* renamed from: g */
    public static final C6139v f15232g = new C6139v("REMOVE_FROZEN");

    /* renamed from: h */
    public static final C6129a f15233h = new C6129a(null);
    private volatile Object _next = null;
    public volatile /* synthetic */ long _state$internal = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f15234a;

    /* renamed from: b */
    public /* synthetic */ AtomicReferenceArray f15235b = new AtomicReferenceArray(this.f15236c);

    /* renamed from: c */
    private final int f15236c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final boolean f15237d;

    /* renamed from: kotlinx.coroutines.internal.m$a */
    public static final class C6129a {
        private C6129a() {
        }

        public /* synthetic */ C6129a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final int mo15923a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: a */
        public final long mo15924a(long j, int i) {
            return mo15925a(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: a */
        public final long mo15925a(long j, long j2) {
            return j & (~j2);
        }

        /* renamed from: b */
        public final long mo15926b(long j, int i) {
            return mo15925a(j, 1152921503533105152L) | (((long) i) << 30);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.m$b */
    public static final class C6130b {

        /* renamed from: a */
        public final int f15238a;

        public C6130b(int i) {
            this.f15238a = i;
        }
    }

    static {
        Class<C6128m> cls = C6128m.class;
        f15230e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f15231f = AtomicLongFieldUpdater.newUpdater(cls, "_state$internal");
    }

    public C6128m(int i, boolean z) {
        this.f15236c = i;
        this.f15237d = z;
        boolean z2 = true;
        this.f15234a = i - 1;
        String str = "Check failed.";
        if (this.f15234a <= 1073741823) {
            if ((this.f15236c & this.f15234a) != 0) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException(str.toString());
            }
            return;
        }
        throw new IllegalStateException(str.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C6128m<E> m23036a(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state$internal;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (C6157l0.m23149a()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return mo15921d();
            }
        } while (!f15231f.compareAndSet(this, j, f15233h.mo15924a(j, i2)));
        this.f15235b.set(this.f15234a & i3, null);
        return null;
    }

    /* renamed from: a */
    private final C6128m<E> m23037a(int i, E e) {
        Object obj = this.f15235b.get(this.f15234a & i);
        if (!(obj instanceof C6130b) || ((C6130b) obj).f15238a != i) {
            return null;
        }
        this.f15235b.set(i & this.f15234a, e);
        return this;
    }

    /* renamed from: a */
    private final C6128m<E> m23038a(long j) {
        C6128m<E> mVar = new C6128m<>(this.f15236c * 2, this.f15237d);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f15234a;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f15235b.get(i3 & i);
                if (obj == null) {
                    obj = new C6130b(i);
                }
                mVar.f15235b.set(mVar.f15234a & i, obj);
                i++;
            } else {
                mVar._state$internal = f15233h.mo15925a(j, 1152921504606846976L);
                return mVar;
            }
        }
    }

    /* renamed from: b */
    private final C6128m<E> m23040b(long j) {
        while (true) {
            C6128m<E> mVar = (C6128m) this._next;
            if (mVar != null) {
                return mVar;
            }
            f15230e.compareAndSet(this, null, m23038a(j));
        }
    }

    /* renamed from: f */
    private final long m23042f() {
        long j;
        long j2;
        do {
            j = this._state$internal;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f15231f.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: a */
    public final int mo15917a(E e) {
        C5942k.m22327b(e, "element");
        while (true) {
            long j = this._state$internal;
            if ((3458764513820540928L & j) != 0) {
                return f15233h.mo15923a(j);
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f15234a;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.f15237d || this.f15235b.get(i2 & i3) == null) {
                int i4 = (i2 + 1) & 1073741823;
                if (f15231f.compareAndSet(this, j, f15233h.mo15926b(j, i4))) {
                    this.f15235b.set(i2 & i3, e);
                    C6128m mVar = this;
                    while ((mVar._state$internal & 1152921504606846976L) != 0) {
                        mVar = mVar.mo15921d().m23037a(i2, e);
                        if (mVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.f15236c;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    /* renamed from: a */
    public final boolean mo15918a() {
        long j;
        do {
            j = this._state$internal;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f15231f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: b */
    public final int mo15919b() {
        long j = this._state$internal;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: c */
    public final boolean mo15920c() {
        long j = this._state$internal;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: d */
    public final C6128m<E> mo15921d() {
        return m23040b(m23042f());
    }

    /* renamed from: e */
    public final Object mo15922e() {
        Object obj;
        while (true) {
            long j = this._state$internal;
            if ((1152921504606846976L & j) == 0) {
                int i = (int) ((1073741823 & j) >> 0);
                if ((this.f15234a & ((int) ((1152921503533105152L & j) >> 30))) != (this.f15234a & i)) {
                    obj = this.f15235b.get(this.f15234a & i);
                    if (obj != null) {
                        if (!(obj instanceof C6130b)) {
                            int i2 = (i + 1) & 1073741823;
                            if (!f15231f.compareAndSet(this, j, f15233h.mo15924a(j, i2))) {
                                if (this.f15237d) {
                                    C6128m mVar = this;
                                    do {
                                        mVar = mVar.m23036a(i, i2);
                                    } while (mVar != null);
                                    break;
                                }
                            } else {
                                this.f15235b.set(this.f15234a & i, null);
                                break;
                            }
                        } else {
                            return null;
                        }
                    } else if (this.f15237d) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return f15232g;
            }
        }
        return obj;
    }
}
