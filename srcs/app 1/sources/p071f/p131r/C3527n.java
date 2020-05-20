package p071f.p131r;

import java.util.List;
import java.util.concurrent.Executor;
import p071f.p131r.C3503h.C3506c;
import p071f.p131r.C3503h.C3508e;
import p071f.p131r.C3503h.C3509f;

/* renamed from: f.r.n */
class C3527n<T> extends C3503h<T> implements C3514a {

    /* renamed from: t */
    final C3518l<T> f9997t;

    /* renamed from: u */
    C3502a<T> f9998u = new C3528a();

    /* renamed from: f.r.n$a */
    class C3528a extends C3502a<T> {
        C3528a() {
        }

        /* renamed from: a */
        public void mo11123a(int i, C3501g<T> gVar) {
            if (gVar.mo11143a()) {
                C3527n.this.mo11151e();
            } else if (!C3527n.this.mo11158k()) {
                if (i == 0 || i == 3) {
                    List<T> list = gVar.f9921a;
                    int l = C3527n.this.f9929j.mo11205l();
                    C3527n nVar = C3527n.this;
                    if (l == 0) {
                        nVar.f9929j.mo11183a(gVar.f9922b, list, gVar.f9923c, gVar.f9924d, nVar.f9928i.f9952a, nVar);
                    } else {
                        nVar.f9929j.mo11190b(gVar.f9924d, list, nVar.f9930k, nVar.f9928i.f9955d, nVar.f9932m, nVar);
                    }
                    C3527n nVar2 = C3527n.this;
                    if (nVar2.f9927h != null) {
                        boolean z = true;
                        boolean z2 = nVar2.f9929j.size() == 0;
                        boolean z3 = !z2 && gVar.f9922b == 0 && gVar.f9924d == 0;
                        int size = C3527n.this.size();
                        if (z2 || (!(i == 0 && gVar.f9923c == 0) && (i != 3 || gVar.f9924d + C3527n.this.f9928i.f9952a < size))) {
                            z = false;
                        }
                        C3527n.this.mo11149a(z2, z3, z);
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected resultType");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* renamed from: f.r.n$b */
    class C3529b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f10000f;

        C3529b(int i) {
            this.f10000f = i;
        }

        public void run() {
            if (!C3527n.this.mo11158k()) {
                C3527n nVar = C3527n.this;
                int i = nVar.f9928i.f9952a;
                if (nVar.f9997t.mo4146c()) {
                    C3527n.this.mo11151e();
                } else {
                    int i2 = this.f10000f * i;
                    int min = Math.min(i, C3527n.this.f9929j.size() - i2);
                    C3527n nVar2 = C3527n.this;
                    nVar2.f9997t.mo11213a(3, i2, min, nVar2.f9925f, nVar2.f9998u);
                }
            }
        }
    }

    C3527n(C3518l<T> lVar, Executor executor, Executor executor2, C3506c<T> cVar, C3509f fVar, int i) {
        super(new C3513j(), executor, executor2, cVar, fVar);
        this.f9997t = lVar;
        int i2 = this.f9928i.f9952a;
        this.f9930k = i;
        if (lVar.mo4146c()) {
            mo11151e();
            return;
        }
        int max = Math.max(this.f9928i.f9956e / i2, 2) * i2;
        this.f9997t.mo11214a(true, Math.max(0, ((i - (max / 2)) / i2) * i2), max, i2, this.f9925f, this.f9998u);
    }

    /* renamed from: a */
    public void mo11109a(int i, int i2) {
        mo11154f(i, i2);
    }

    /* renamed from: a */
    public void mo11110a(int i, int i2, int i3) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11111a(C3503h<T> hVar, C3508e eVar) {
        C3513j<T> jVar = hVar.f9929j;
        if (jVar.isEmpty() || this.f9929j.size() != jVar.size()) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        int i = this.f9928i.f9952a;
        int g = this.f9929j.mo11200g() / i;
        int l = this.f9929j.mo11205l();
        int i2 = 0;
        while (i2 < l) {
            int i3 = i2 + g;
            int i4 = 0;
            while (i4 < this.f9929j.mo11205l()) {
                int i5 = i3 + i4;
                if (!this.f9929j.mo11192b(i, i5) || jVar.mo11192b(i, i5)) {
                    break;
                }
                i4++;
            }
            if (i4 > 0) {
                eVar.mo11097a(i3 * i, i * i4);
                i2 += i4 - 1;
            }
            i2++;
        }
    }

    /* renamed from: b */
    public void mo11112b(int i, int i2) {
        mo11150d(i, i2);
    }

    /* renamed from: b */
    public void mo11113b(int i, int i2, int i3) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    /* renamed from: c */
    public void mo11114c() {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    /* renamed from: c */
    public void mo11115c(int i) {
        mo11152e(0, i);
    }

    /* renamed from: c */
    public void mo11116c(int i, int i2) {
        mo11150d(i, i2);
    }

    /* renamed from: d */
    public void mo11117d() {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    /* renamed from: d */
    public void mo11118d(int i) {
        this.f9926g.execute(new C3529b(i));
    }

    /* renamed from: f */
    public C3490d<?, T> mo11119f() {
        return this.f9997t;
    }

    /* renamed from: g */
    public Object mo11120g() {
        return Integer.valueOf(this.f9930k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo11121g(int i) {
        C3513j<T> jVar = this.f9929j;
        C3509f fVar = this.f9928i;
        jVar.mo11182a(i, fVar.f9953b, fVar.f9952a, (C3514a) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo11122i() {
        return false;
    }
}
