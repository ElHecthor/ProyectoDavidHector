package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map.Entry;
import p071f.p080b.p081a.p083b.C3144b;

/* renamed from: androidx.lifecycle.r */
public class C0529r<T> extends C0532t<T> {

    /* renamed from: k */
    private C3144b<LiveData<?>, C0530a<?>> f2244k = new C3144b<>();

    /* renamed from: androidx.lifecycle.r$a */
    private static class C0530a<V> implements C0533u<V> {

        /* renamed from: a */
        final LiveData<V> f2245a;

        /* renamed from: b */
        final C0533u<? super V> f2246b;

        /* renamed from: c */
        int f2247c = -1;

        C0530a(LiveData<V> liveData, C0533u<? super V> uVar) {
            this.f2245a = liveData;
            this.f2246b = uVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3047a() {
            this.f2245a.mo2977a((C0533u<? super T>) this);
        }

        /* renamed from: a */
        public void mo3048a(V v) {
            if (this.f2247c != this.f2245a.mo2979b()) {
                this.f2247c = this.f2245a.mo2979b();
                this.f2246b.mo3048a(v);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3049b() {
            this.f2245a.mo2980b((C0533u<? super T>) this);
        }
    }

    /* renamed from: a */
    public <S> void mo3045a(LiveData<S> liveData) {
        C0530a aVar = (C0530a) this.f2244k.remove(liveData);
        if (aVar != null) {
            aVar.mo3049b();
        }
    }

    /* renamed from: a */
    public <S> void mo3046a(LiveData<S> liveData, C0533u<? super S> uVar) {
        C0530a aVar = new C0530a(liveData, uVar);
        C0530a aVar2 = (C0530a) this.f2244k.mo10116b(liveData, aVar);
        if (aVar2 == null || aVar2.f2246b == uVar) {
            if (aVar2 == null && mo2982c()) {
                aVar.mo3047a();
            }
            return;
        }
        throw new IllegalArgumentException("This source was already added with the different observer");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2983d() {
        Iterator it = this.f2244k.iterator();
        while (it.hasNext()) {
            ((C0530a) ((Entry) it.next()).getValue()).mo3047a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo2984e() {
        Iterator it = this.f2244k.iterator();
        while (it.hasNext()) {
            ((C0530a) ((Entry) it.next()).getValue()).mo3049b();
        }
    }
}
