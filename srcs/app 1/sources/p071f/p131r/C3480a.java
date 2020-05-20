package p071f.p131r;

import androidx.recyclerview.widget.C0612b;
import androidx.recyclerview.widget.C0613c;
import androidx.recyclerview.widget.C0613c.C0614a;
import androidx.recyclerview.widget.C0636h.C0639c;
import androidx.recyclerview.widget.C0636h.C0640d;
import androidx.recyclerview.widget.C0659p;
import androidx.recyclerview.widget.RecyclerView.C0569g;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p071f.p080b.p081a.p082a.C3137a;
import p071f.p131r.C3503h.C3508e;

/* renamed from: f.r.a */
public class C3480a<T> {

    /* renamed from: a */
    final C0659p f9859a;

    /* renamed from: b */
    final C0613c<T> f9860b;

    /* renamed from: c */
    Executor f9861c = C3137a.m12724d();

    /* renamed from: d */
    private final List<C3484c<T>> f9862d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private boolean f9863e;

    /* renamed from: f */
    private C3503h<T> f9864f;

    /* renamed from: g */
    private C3503h<T> f9865g;

    /* renamed from: h */
    int f9866h;

    /* renamed from: i */
    private C3508e f9867i = new C3481a();

    /* renamed from: f.r.a$a */
    class C3481a extends C3508e {
        C3481a() {
        }

        /* renamed from: a */
        public void mo11097a(int i, int i2) {
            C3480a.this.f9859a.mo3811a(i, i2, null);
        }

        /* renamed from: b */
        public void mo11098b(int i, int i2) {
            C3480a.this.f9859a.mo3813c(i, i2);
        }

        /* renamed from: c */
        public void mo11099c(int i, int i2) {
            C3480a.this.f9859a.mo3810a(i, i2);
        }
    }

    /* renamed from: f.r.a$b */
    class C3482b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C3503h f9869f;

        /* renamed from: g */
        final /* synthetic */ C3503h f9870g;

        /* renamed from: h */
        final /* synthetic */ int f9871h;

        /* renamed from: i */
        final /* synthetic */ C3503h f9872i;

        /* renamed from: j */
        final /* synthetic */ Runnable f9873j;

        /* renamed from: f.r.a$b$a */
        class C3483a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C0639c f9875f;

            C3483a(C0639c cVar) {
                this.f9875f = cVar;
            }

            public void run() {
                C3482b bVar = C3482b.this;
                C3480a aVar = C3480a.this;
                if (aVar.f9866h == bVar.f9871h) {
                    aVar.mo11095a(bVar.f9872i, bVar.f9870g, this.f9875f, bVar.f9869f.f9930k, bVar.f9873j);
                }
            }
        }

        C3482b(C3503h hVar, C3503h hVar2, int i, C3503h hVar3, Runnable runnable) {
            this.f9869f = hVar;
            this.f9870g = hVar2;
            this.f9871h = i;
            this.f9872i = hVar3;
            this.f9873j = runnable;
        }

        public void run() {
            C3480a.this.f9861c.execute(new C3483a(C3515k.m14406a(this.f9869f.f9929j, this.f9870g.f9929j, C3480a.this.f9860b.mo3815b())));
        }
    }

    /* renamed from: f.r.a$c */
    public interface C3484c<T> {
        /* renamed from: a */
        void mo11102a(C3503h<T> hVar, C3503h<T> hVar2);
    }

    public C3480a(C0569g gVar, C0640d<T> dVar) {
        this.f9859a = new C0612b(gVar);
        this.f9860b = new C0614a(dVar).mo3817a();
    }

    /* renamed from: a */
    private void m14254a(C3503h<T> hVar, C3503h<T> hVar2, Runnable runnable) {
        for (C3484c a : this.f9862d) {
            a.mo11102a(hVar, hVar2);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public int mo11091a() {
        C3503h<T> hVar = this.f9864f;
        if (hVar != null) {
            return hVar.size();
        }
        C3503h<T> hVar2 = this.f9865g;
        return hVar2 == null ? 0 : hVar2.size();
    }

    /* renamed from: a */
    public T mo11092a(int i) {
        C3503h<T> hVar = this.f9864f;
        if (hVar == null) {
            C3503h<T> hVar2 = this.f9865g;
            if (hVar2 != null) {
                return hVar2.get(i);
            }
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        hVar.mo11153f(i);
        return this.f9864f.get(i);
    }

    /* renamed from: a */
    public void mo11093a(C3484c<T> cVar) {
        this.f9862d.add(cVar);
    }

    /* renamed from: a */
    public void mo11094a(C3503h<T> hVar) {
        mo11096a(hVar, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11095a(C3503h<T> hVar, C3503h<T> hVar2, C0639c cVar, int i, Runnable runnable) {
        C3503h<T> hVar3 = this.f9865g;
        if (hVar3 == null || this.f9864f != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.f9864f = hVar;
        this.f9865g = null;
        C3515k.m14407a(this.f9859a, hVar3.f9929j, hVar.f9929j, cVar);
        hVar.mo11146a((List<T>) hVar2, this.f9867i);
        if (!this.f9864f.isEmpty()) {
            int a = C3515k.m14405a(cVar, (C3513j) hVar3.f9929j, (C3513j) hVar2.f9929j, i);
            C3503h<T> hVar4 = this.f9864f;
            hVar4.mo11153f(Math.max(0, Math.min(hVar4.size() - 1, a)));
        }
        m14254a(hVar3, this.f9864f, runnable);
    }

    /* renamed from: a */
    public void mo11096a(C3503h<T> hVar, Runnable runnable) {
        if (hVar != null) {
            if (this.f9864f == null && this.f9865g == null) {
                this.f9863e = hVar.mo11122i();
            } else if (hVar.mo11122i() != this.f9863e) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        int i = this.f9866h + 1;
        this.f9866h = i;
        C3503h<T> hVar2 = this.f9864f;
        if (hVar == hVar2) {
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        C3503h<T> hVar3 = this.f9865g;
        if (hVar3 != null) {
            hVar2 = hVar3;
        }
        if (hVar == null) {
            int a = mo11091a();
            C3503h<T> hVar4 = this.f9864f;
            if (hVar4 != null) {
                hVar4.mo11145a(this.f9867i);
                this.f9864f = null;
            } else if (this.f9865g != null) {
                this.f9865g = null;
            }
            this.f9859a.mo3810a(0, a);
            m14254a(hVar2, null, runnable);
        } else if (this.f9864f == null && this.f9865g == null) {
            this.f9864f = hVar;
            hVar.mo11146a(null, this.f9867i);
            this.f9859a.mo3813c(0, hVar.size());
            m14254a(null, hVar, runnable);
        } else {
            C3503h<T> hVar5 = this.f9864f;
            if (hVar5 != null) {
                hVar5.mo11145a(this.f9867i);
                this.f9865g = (C3503h) this.f9864f.mo11160m();
                this.f9864f = null;
            }
            C3503h<T> hVar6 = this.f9865g;
            if (hVar6 == null || this.f9864f != null) {
                throw new IllegalStateException("must be in snapshot state to diff");
            }
            C3503h hVar7 = (C3503h) hVar.mo11160m();
            Executor a2 = this.f9860b.mo3814a();
            C3482b bVar = new C3482b(hVar6, hVar7, i, hVar, runnable);
            a2.execute(bVar);
        }
    }
}
