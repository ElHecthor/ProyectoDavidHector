package p071f.p131r;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: f.r.h */
public abstract class C3503h<T> extends AbstractList<T> {

    /* renamed from: f */
    final Executor f9925f;

    /* renamed from: g */
    final Executor f9926g;

    /* renamed from: h */
    final C3506c<T> f9927h;

    /* renamed from: i */
    final C3509f f9928i;

    /* renamed from: j */
    final C3513j<T> f9929j;

    /* renamed from: k */
    int f9930k = 0;

    /* renamed from: l */
    T f9931l = null;

    /* renamed from: m */
    final int f9932m;

    /* renamed from: n */
    boolean f9933n = false;

    /* renamed from: o */
    boolean f9934o = false;

    /* renamed from: p */
    private int f9935p = Integer.MAX_VALUE;

    /* renamed from: q */
    private int f9936q = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: r */
    private final AtomicBoolean f9937r = new AtomicBoolean(false);

    /* renamed from: s */
    private final ArrayList<WeakReference<C3508e>> f9938s = new ArrayList<>();

    /* renamed from: f.r.h$a */
    class C3504a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ boolean f9939f;

        /* renamed from: g */
        final /* synthetic */ boolean f9940g;

        /* renamed from: h */
        final /* synthetic */ boolean f9941h;

        C3504a(boolean z, boolean z2, boolean z3) {
            this.f9939f = z;
            this.f9940g = z2;
            this.f9941h = z3;
        }

        public void run() {
            if (this.f9939f) {
                C3503h.this.f9927h.mo11164a();
            }
            if (this.f9940g) {
                C3503h.this.f9933n = true;
            }
            if (this.f9941h) {
                C3503h.this.f9934o = true;
            }
            C3503h.this.mo11147a(false);
        }
    }

    /* renamed from: f.r.h$b */
    class C3505b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ boolean f9943f;

        /* renamed from: g */
        final /* synthetic */ boolean f9944g;

        C3505b(boolean z, boolean z2) {
            this.f9943f = z;
            this.f9944g = z2;
        }

        public void run() {
            C3503h.this.mo11148a(this.f9943f, this.f9944g);
        }
    }

    /* renamed from: f.r.h$c */
    public static abstract class C3506c<T> {
        /* renamed from: a */
        public void mo11164a() {
        }

        /* renamed from: a */
        public void mo11165a(T t) {
        }

        /* renamed from: b */
        public void mo11166b(T t) {
        }
    }

    /* renamed from: f.r.h$d */
    public static final class C3507d<Key, Value> {

        /* renamed from: a */
        private final C3490d<Key, Value> f9946a;

        /* renamed from: b */
        private final C3509f f9947b;

        /* renamed from: c */
        private Executor f9948c;

        /* renamed from: d */
        private Executor f9949d;

        /* renamed from: e */
        private C3506c f9950e;

        /* renamed from: f */
        private Key f9951f;

        public C3507d(C3490d<Key, Value> dVar, C3509f fVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            } else if (fVar != null) {
                this.f9946a = dVar;
                this.f9947b = fVar;
            } else {
                throw new IllegalArgumentException("Config may not be null");
            }
        }

        /* renamed from: a */
        public C3507d<Key, Value> mo11167a(C3506c cVar) {
            this.f9950e = cVar;
            return this;
        }

        /* renamed from: a */
        public C3507d<Key, Value> mo11168a(Key key) {
            this.f9951f = key;
            return this;
        }

        /* renamed from: a */
        public C3507d<Key, Value> mo11169a(Executor executor) {
            this.f9949d = executor;
            return this;
        }

        /* renamed from: a */
        public C3503h<Value> mo11170a() {
            Executor executor = this.f9948c;
            if (executor != null) {
                Executor executor2 = this.f9949d;
                if (executor2 != null) {
                    return C3503h.m14322a(this.f9946a, executor, executor2, this.f9950e, this.f9947b, this.f9951f);
                }
                throw new IllegalArgumentException("BackgroundThreadExecutor required");
            }
            throw new IllegalArgumentException("MainThreadExecutor required");
        }

        /* renamed from: b */
        public C3507d<Key, Value> mo11171b(Executor executor) {
            this.f9948c = executor;
            return this;
        }
    }

    /* renamed from: f.r.h$e */
    public static abstract class C3508e {
        /* renamed from: a */
        public abstract void mo11097a(int i, int i2);

        /* renamed from: b */
        public abstract void mo11098b(int i, int i2);

        /* renamed from: c */
        public abstract void mo11099c(int i, int i2);
    }

    /* renamed from: f.r.h$f */
    public static class C3509f {

        /* renamed from: a */
        public final int f9952a;

        /* renamed from: b */
        public final int f9953b;

        /* renamed from: c */
        public final boolean f9954c;

        /* renamed from: d */
        public final int f9955d;

        /* renamed from: e */
        public final int f9956e;

        /* renamed from: f.r.h$f$a */
        public static final class C3510a {

            /* renamed from: a */
            private int f9957a = -1;

            /* renamed from: b */
            private int f9958b = -1;

            /* renamed from: c */
            private int f9959c = -1;

            /* renamed from: d */
            private boolean f9960d = true;

            /* renamed from: e */
            private int f9961e = Integer.MAX_VALUE;

            /* renamed from: a */
            public C3510a mo11172a(int i) {
                this.f9959c = i;
                return this;
            }

            /* renamed from: a */
            public C3510a mo11173a(boolean z) {
                this.f9960d = z;
                return this;
            }

            /* renamed from: a */
            public C3509f mo11174a() {
                if (this.f9958b < 0) {
                    this.f9958b = this.f9957a;
                }
                if (this.f9959c < 0) {
                    this.f9959c = this.f9957a * 3;
                }
                if (this.f9960d || this.f9958b != 0) {
                    int i = this.f9961e;
                    if (i == Integer.MAX_VALUE || i >= this.f9957a + (this.f9958b * 2)) {
                        C3509f fVar = new C3509f(this.f9957a, this.f9958b, this.f9960d, this.f9959c, this.f9961e);
                        return fVar;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=");
                    sb.append(this.f9957a);
                    sb.append(", prefetchDist=");
                    sb.append(this.f9958b);
                    sb.append(", maxSize=");
                    sb.append(this.f9961e);
                    throw new IllegalArgumentException(sb.toString());
                }
                throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
            }

            /* renamed from: b */
            public C3510a mo11175b(int i) {
                if (i >= 1) {
                    this.f9957a = i;
                    return this;
                }
                throw new IllegalArgumentException("Page size must be a positive number");
            }

            /* renamed from: c */
            public C3510a mo11176c(int i) {
                this.f9958b = i;
                return this;
            }
        }

        C3509f(int i, int i2, boolean z, int i3, int i4) {
            this.f9952a = i;
            this.f9953b = i2;
            this.f9954c = z;
            this.f9956e = i3;
            this.f9955d = i4;
        }
    }

    C3503h(C3513j<T> jVar, Executor executor, Executor executor2, C3506c<T> cVar, C3509f fVar) {
        this.f9929j = jVar;
        this.f9925f = executor;
        this.f9926g = executor2;
        this.f9927h = cVar;
        this.f9928i = fVar;
        this.f9932m = (fVar.f9953b * 2) + fVar.f9952a;
    }

    /* renamed from: a */
    static <K, T> C3503h<T> m14322a(C3490d<K, T> dVar, Executor executor, Executor executor2, C3506c<T> cVar, C3509f fVar, K k) {
        int i;
        if (dVar.mo11107b() || !fVar.f9954c) {
            if (!dVar.mo11107b()) {
                dVar = ((C3518l) dVar).mo11215d();
                if (k != null) {
                    i = ((Integer) k).intValue();
                    C3486c cVar2 = new C3486c((C3485b) dVar, executor, executor2, cVar, fVar, k, i);
                    return cVar2;
                }
            }
            i = -1;
            C3486c cVar22 = new C3486c((C3485b) dVar, executor, executor2, cVar, fVar, k, i);
            return cVar22;
        }
        C3527n nVar = new C3527n((C3518l) dVar, executor, executor2, cVar, fVar, k != null ? ((Integer) k).intValue() : 0);
        return nVar;
    }

    /* renamed from: a */
    public void mo11145a(C3508e eVar) {
        for (int size = this.f9938s.size() - 1; size >= 0; size--) {
            C3508e eVar2 = (C3508e) ((WeakReference) this.f9938s.get(size)).get();
            if (eVar2 == null || eVar2 == eVar) {
                this.f9938s.remove(size);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo11111a(C3503h<T> hVar, C3508e eVar);

    /* renamed from: a */
    public void mo11146a(List<T> list, C3508e eVar) {
        if (!(list == null || list == this)) {
            if (!list.isEmpty()) {
                mo11111a((C3503h) list, eVar);
            } else if (!this.f9929j.isEmpty()) {
                eVar.mo11098b(0, this.f9929j.size());
            }
        }
        for (int size = this.f9938s.size() - 1; size >= 0; size--) {
            if (((C3508e) ((WeakReference) this.f9938s.get(size)).get()) == null) {
                this.f9938s.remove(size);
            }
        }
        this.f9938s.add(new WeakReference(eVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11147a(boolean z) {
        boolean z2 = true;
        boolean z3 = this.f9933n && this.f9935p <= this.f9928i.f9953b;
        if (!this.f9934o || this.f9936q < (size() - 1) - this.f9928i.f9953b) {
            z2 = false;
        }
        if (z3 || z2) {
            if (z3) {
                this.f9933n = false;
            }
            if (z2) {
                this.f9934o = false;
            }
            if (z) {
                this.f9925f.execute(new C3505b(z3, z2));
            } else {
                mo11148a(z3, z2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11148a(boolean z, boolean z2) {
        if (z) {
            this.f9927h.mo11166b(this.f9929j.mo11198e());
        }
        if (z2) {
            this.f9927h.mo11165a(this.f9929j.mo11199f());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11149a(boolean z, boolean z2, boolean z3) {
        if (this.f9927h != null) {
            if (this.f9935p == Integer.MAX_VALUE) {
                this.f9935p = this.f9929j.size();
            }
            if (this.f9936q == Integer.MIN_VALUE) {
                this.f9936q = 0;
            }
            if (z || z2 || z3) {
                this.f9925f.execute(new C3504a(z, z2, z3));
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo11150d(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f9938s.size() - 1; size >= 0; size--) {
                C3508e eVar = (C3508e) ((WeakReference) this.f9938s.get(size)).get();
                if (eVar != null) {
                    eVar.mo11097a(i, i2);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo11151e() {
        this.f9937r.set(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo11152e(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f9938s.size() - 1; size >= 0; size--) {
                C3508e eVar = (C3508e) ((WeakReference) this.f9938s.get(size)).get();
                if (eVar != null) {
                    eVar.mo11098b(i, i2);
                }
            }
        }
    }

    /* renamed from: f */
    public abstract C3490d<?, T> mo11119f();

    /* renamed from: f */
    public void mo11153f(int i) {
        if (i < 0 || i >= size()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(size());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        this.f9930k = mo11156h() + i;
        mo11121g(i);
        this.f9935p = Math.min(this.f9935p, i);
        this.f9936q = Math.max(this.f9936q, i);
        mo11147a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo11154f(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f9938s.size() - 1; size >= 0; size--) {
                C3508e eVar = (C3508e) ((WeakReference) this.f9938s.get(size)).get();
                if (eVar != null) {
                    eVar.mo11099c(i, i2);
                }
            }
        }
    }

    /* renamed from: g */
    public abstract Object mo11120g();

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public abstract void mo11121g(int i);

    public T get(int i) {
        T t = this.f9929j.get(i);
        if (t != null) {
            this.f9931l = t;
        }
        return t;
    }

    /* renamed from: h */
    public int mo11156h() {
        return this.f9929j.mo11206m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo11157h(int i) {
        this.f9930k += i;
        this.f9935p += i;
        this.f9936q += i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public abstract boolean mo11122i();

    /* renamed from: k */
    public boolean mo11158k() {
        return this.f9937r.get();
    }

    /* renamed from: l */
    public boolean mo11159l() {
        return mo11158k();
    }

    /* renamed from: m */
    public List<T> mo11160m() {
        return mo11159l() ? this : new C3526m(this);
    }

    public int size() {
        return this.f9929j.size();
    }
}
