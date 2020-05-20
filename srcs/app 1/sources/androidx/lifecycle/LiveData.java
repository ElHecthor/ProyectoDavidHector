package androidx.lifecycle;

import androidx.lifecycle.C0514h.C0515a;
import androidx.lifecycle.C0514h.C0516b;
import java.util.Map.Entry;
import p071f.p080b.p081a.p082a.C3137a;
import p071f.p080b.p081a.p083b.C3144b;

public abstract class LiveData<T> {

    /* renamed from: j */
    static final Object f2178j = new Object();

    /* renamed from: a */
    final Object f2179a = new Object();

    /* renamed from: b */
    private C3144b<C0533u<? super T>, C0492c> f2180b = new C3144b<>();

    /* renamed from: c */
    int f2181c = 0;

    /* renamed from: d */
    private volatile Object f2182d = f2178j;

    /* renamed from: e */
    volatile Object f2183e = f2178j;

    /* renamed from: f */
    private int f2184f = -1;

    /* renamed from: g */
    private boolean f2185g;

    /* renamed from: h */
    private boolean f2186h;

    /* renamed from: i */
    private final Runnable f2187i = new C0490a();

    class LifecycleBoundObserver extends C0492c implements C0521l {

        /* renamed from: j */
        final C0523n f2188j;

        LifecycleBoundObserver(C0523n nVar, C0533u<? super T> uVar) {
            super(uVar);
            this.f2188j = nVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2985a() {
            this.f2188j.mo115a().mo3038b(this);
        }

        /* renamed from: a */
        public void mo124a(C0523n nVar, C0515a aVar) {
            if (this.f2188j.mo115a().mo3036a() == C0516b.DESTROYED) {
                LiveData.this.mo2980b(this.f2191f);
            } else {
                mo2989a(mo2986b());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo2986b() {
            return this.f2188j.mo115a().mo3036a().mo3039a(C0516b.STARTED);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public boolean mo2987g(C0523n nVar) {
            return this.f2188j == nVar;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C0490a implements Runnable {
        C0490a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f2179a) {
                obj = LiveData.this.f2183e;
                LiveData.this.f2183e = LiveData.f2178j;
            }
            LiveData.this.mo2981b(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C0491b extends C0492c {
        C0491b(LiveData liveData, C0533u<? super T> uVar) {
            super(uVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo2986b() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class C0492c {

        /* renamed from: f */
        final C0533u<? super T> f2191f;

        /* renamed from: g */
        boolean f2192g;

        /* renamed from: h */
        int f2193h = -1;

        C0492c(C0533u<? super T> uVar) {
            this.f2191f = uVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2985a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2989a(boolean z) {
            if (z != this.f2192g) {
                this.f2192g = z;
                int i = 1;
                boolean z2 = LiveData.this.f2181c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f2181c;
                if (!this.f2192g) {
                    i = -1;
                }
                liveData.f2181c = i2 + i;
                if (z2 && this.f2192g) {
                    LiveData.this.mo2983d();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f2181c == 0 && !this.f2192g) {
                    liveData2.mo2984e();
                }
                if (this.f2192g) {
                    LiveData.this.mo2975a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract boolean mo2986b();

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public boolean mo2987g(C0523n nVar) {
            return false;
        }
    }

    /* renamed from: a */
    static void m2660a(String str) {
        if (!C3137a.m12723c().mo10109a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private void m2661b(C0492c cVar) {
        if (cVar.f2192g) {
            if (!cVar.mo2986b()) {
                cVar.mo2989a(false);
                return;
            }
            int i = cVar.f2193h;
            int i2 = this.f2184f;
            if (i < i2) {
                cVar.f2193h = i2;
                cVar.f2191f.mo3048a(this.f2182d);
            }
        }
    }

    /* renamed from: a */
    public T mo2974a() {
        T t = this.f2182d;
        if (t != f2178j) {
            return t;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2975a(C0492c cVar) {
        if (this.f2185g) {
            this.f2186h = true;
            return;
        }
        this.f2185g = true;
        do {
            this.f2186h = false;
            if (cVar == null) {
                C3148d e = this.f2180b.mo10123e();
                while (e.hasNext()) {
                    m2661b((C0492c) ((Entry) e.next()).getValue());
                    if (this.f2186h) {
                        break;
                    }
                }
            } else {
                m2661b(cVar);
                cVar = null;
            }
        } while (this.f2186h);
        this.f2185g = false;
    }

    /* renamed from: a */
    public void mo2976a(C0523n nVar, C0533u<? super T> uVar) {
        m2660a("observe");
        if (nVar.mo115a().mo3036a() != C0516b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(nVar, uVar);
            C0492c cVar = (C0492c) this.f2180b.mo10116b(uVar, lifecycleBoundObserver);
            if (cVar != null && !cVar.mo2987g(nVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (cVar == null) {
                nVar.mo115a().mo3037a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo2977a(C0533u<? super T> uVar) {
        m2660a("observeForever");
        C0491b bVar = new C0491b(this, uVar);
        C0492c cVar = (C0492c) this.f2180b.mo10116b(uVar, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (cVar == null) {
            bVar.mo2989a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2978a(T t) {
        boolean z;
        synchronized (this.f2179a) {
            z = this.f2183e == f2178j;
            this.f2183e = t;
        }
        if (z) {
            C3137a.m12723c().mo10110c(this.f2187i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo2979b() {
        return this.f2184f;
    }

    /* renamed from: b */
    public void mo2980b(C0533u<? super T> uVar) {
        m2660a("removeObserver");
        C0492c cVar = (C0492c) this.f2180b.remove(uVar);
        if (cVar != null) {
            cVar.mo2985a();
            cVar.mo2989a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2981b(T t) {
        m2660a("setValue");
        this.f2184f++;
        this.f2182d = t;
        mo2975a(null);
    }

    /* renamed from: c */
    public boolean mo2982c() {
        return this.f2181c > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2983d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo2984e() {
    }
}
