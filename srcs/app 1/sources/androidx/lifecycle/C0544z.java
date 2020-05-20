package androidx.lifecycle;

import p071f.p080b.p081a.p084c.C3151a;

/* renamed from: androidx.lifecycle.z */
public class C0544z {

    /* renamed from: androidx.lifecycle.z$a */
    static class C0545a implements C0533u<X> {

        /* renamed from: a */
        final /* synthetic */ C0529r f2260a;

        /* renamed from: b */
        final /* synthetic */ C3151a f2261b;

        C0545a(C0529r rVar, C3151a aVar) {
            this.f2260a = rVar;
            this.f2261b = aVar;
        }

        /* renamed from: a */
        public void mo3048a(X x) {
            this.f2260a.mo2981b(this.f2261b.mo10143a(x));
        }
    }

    /* renamed from: androidx.lifecycle.z$b */
    static class C0546b implements C0533u<X> {

        /* renamed from: a */
        LiveData<Y> f2262a;

        /* renamed from: b */
        final /* synthetic */ C3151a f2263b;

        /* renamed from: c */
        final /* synthetic */ C0529r f2264c;

        /* renamed from: androidx.lifecycle.z$b$a */
        class C0547a implements C0533u<Y> {
            C0547a() {
            }

            /* renamed from: a */
            public void mo3048a(Y y) {
                C0546b.this.f2264c.mo2981b(y);
            }
        }

        C0546b(C3151a aVar, C0529r rVar) {
            this.f2263b = aVar;
            this.f2264c = rVar;
        }

        /* renamed from: a */
        public void mo3048a(X x) {
            LiveData<Y> liveData = (LiveData) this.f2263b.mo10143a(x);
            LiveData<Y> liveData2 = this.f2262a;
            if (liveData2 != liveData) {
                if (liveData2 != null) {
                    this.f2264c.mo3045a(liveData2);
                }
                this.f2262a = liveData;
                if (liveData != null) {
                    this.f2264c.mo3046a(liveData, new C0547a());
                }
            }
        }
    }

    /* renamed from: a */
    public static <X, Y> LiveData<Y> m2797a(LiveData<X> liveData, C3151a<X, Y> aVar) {
        C0529r rVar = new C0529r();
        rVar.mo3046a(liveData, new C0545a(rVar, aVar));
        return rVar;
    }

    /* renamed from: b */
    public static <X, Y> LiveData<Y> m2798b(LiveData<X> liveData, C3151a<X, LiveData<Y>> aVar) {
        C0529r rVar = new C0529r();
        rVar.mo3046a(liveData, new C0546b(aVar, rVar));
        return rVar;
    }
}
