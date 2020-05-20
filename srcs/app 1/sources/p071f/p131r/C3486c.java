package p071f.p131r;

import java.util.List;
import java.util.concurrent.Executor;
import p071f.p131r.C3503h.C3506c;
import p071f.p131r.C3503h.C3508e;
import p071f.p131r.C3503h.C3509f;

/* renamed from: f.r.c */
class C3486c<K, V> extends C3503h<V> implements C3514a {

    /* renamed from: A */
    C3502a<V> f9877A = new C3487a();

    /* renamed from: t */
    final C3485b<K, V> f9878t;

    /* renamed from: u */
    int f9879u = 0;

    /* renamed from: v */
    int f9880v = 0;

    /* renamed from: w */
    int f9881w = 0;

    /* renamed from: x */
    int f9882x = 0;

    /* renamed from: y */
    boolean f9883y = false;

    /* renamed from: z */
    final boolean f9884z;

    /* renamed from: f.r.c$a */
    class C3487a extends C3502a<V> {
        C3487a() {
        }

        /* renamed from: a */
        public void mo11123a(int i, C3501g<V> gVar) {
            if (gVar.mo11143a()) {
                C3486c.this.mo11151e();
            } else if (!C3486c.this.mo11158k()) {
                List<T> list = gVar.f9921a;
                boolean z = true;
                if (i == 0) {
                    C3486c cVar = C3486c.this;
                    cVar.f9929j.mo11184a(gVar.f9922b, list, gVar.f9923c, gVar.f9924d, cVar);
                    C3486c cVar2 = C3486c.this;
                    if (cVar2.f9930k == -1) {
                        cVar2.f9930k = gVar.f9922b + gVar.f9924d + (list.size() / 2);
                    }
                } else {
                    C3486c cVar3 = C3486c.this;
                    boolean z2 = cVar3.f9930k > cVar3.f9929j.mo11202h();
                    C3486c cVar4 = C3486c.this;
                    boolean z3 = cVar4.f9884z && cVar4.f9929j.mo11187a(cVar4.f9928i.f9955d, cVar4.f9932m, list.size());
                    if (i == 1) {
                        if (!z3 || z2) {
                            C3486c cVar5 = C3486c.this;
                            cVar5.f9929j.mo11186a(list, (C3514a) cVar5);
                        } else {
                            C3486c cVar6 = C3486c.this;
                            cVar6.f9882x = 0;
                            cVar6.f9880v = 0;
                        }
                    } else if (i != 2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unexpected resultType ");
                        sb.append(i);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (!z3 || !z2) {
                        C3486c cVar7 = C3486c.this;
                        cVar7.f9929j.mo11191b(list, (C3514a) cVar7);
                    } else {
                        C3486c cVar8 = C3486c.this;
                        cVar8.f9881w = 0;
                        cVar8.f9879u = 0;
                    }
                    C3486c cVar9 = C3486c.this;
                    if (cVar9.f9884z) {
                        if (z2) {
                            if (cVar9.f9879u != 1 && cVar9.f9929j.mo11193b(cVar9.f9883y, cVar9.f9928i.f9955d, cVar9.f9932m, cVar9)) {
                                C3486c.this.f9879u = 0;
                            }
                        } else if (cVar9.f9880v != 1 && cVar9.f9929j.mo11189a(cVar9.f9883y, cVar9.f9928i.f9955d, cVar9.f9932m, (C3514a) cVar9)) {
                            C3486c.this.f9880v = 0;
                        }
                    }
                }
                C3486c cVar10 = C3486c.this;
                if (cVar10.f9927h != null) {
                    boolean z4 = cVar10.f9929j.size() == 0;
                    boolean z5 = !z4 && i == 2 && gVar.f9921a.size() == 0;
                    if (!(!z4 && i == 1 && gVar.f9921a.size() == 0)) {
                        z = false;
                    }
                    C3486c.this.mo11149a(z4, z5, z);
                }
            }
        }
    }

    /* renamed from: f.r.c$b */
    class C3488b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f9886f;

        /* renamed from: g */
        final /* synthetic */ Object f9887g;

        C3488b(int i, Object obj) {
            this.f9886f = i;
            this.f9887g = obj;
        }

        public void run() {
            if (!C3486c.this.mo11158k()) {
                if (C3486c.this.f9878t.mo4146c()) {
                    C3486c.this.mo11151e();
                } else {
                    C3486c cVar = C3486c.this;
                    cVar.f9878t.mo11106b(this.f9886f, this.f9887g, cVar.f9928i.f9952a, cVar.f9925f, cVar.f9877A);
                }
            }
        }
    }

    /* renamed from: f.r.c$c */
    class C3489c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f9889f;

        /* renamed from: g */
        final /* synthetic */ Object f9890g;

        C3489c(int i, Object obj) {
            this.f9889f = i;
            this.f9890g = obj;
        }

        public void run() {
            if (!C3486c.this.mo11158k()) {
                if (C3486c.this.f9878t.mo4146c()) {
                    C3486c.this.mo11151e();
                } else {
                    C3486c cVar = C3486c.this;
                    cVar.f9878t.mo11104a(this.f9889f, this.f9890g, cVar.f9928i.f9952a, cVar.f9925f, cVar.f9877A);
                }
            }
        }
    }

    C3486c(C3485b<K, V> bVar, Executor executor, Executor executor2, C3506c<V> cVar, C3509f fVar, K k, int i) {
        super(new C3513j(), executor, executor2, cVar, fVar);
        boolean z = false;
        this.f9878t = bVar;
        this.f9930k = i;
        if (bVar.mo4146c()) {
            mo11151e();
        } else {
            C3485b<K, V> bVar2 = this.f9878t;
            C3509f fVar2 = this.f9928i;
            bVar2.mo11105a(k, fVar2.f9956e, fVar2.f9952a, fVar2.f9954c, this.f9925f, this.f9877A);
        }
        if (this.f9878t.mo11108d() && this.f9928i.f9955d != Integer.MAX_VALUE) {
            z = true;
        }
        this.f9884z = z;
    }

    /* renamed from: c */
    static int m14271c(int i, int i2, int i3) {
        return ((i2 + i) + 1) - i3;
    }

    /* renamed from: d */
    static int m14272d(int i, int i2, int i3) {
        return i - (i2 - i3);
    }

    /* renamed from: o */
    private void m14273o() {
        if (this.f9880v == 0) {
            this.f9880v = 1;
            this.f9926g.execute(new C3489c(((this.f9929j.mo11200g() + this.f9929j.mo11207o()) - 1) + this.f9929j.mo11206m(), this.f9929j.mo11199f()));
        }
    }

    /* renamed from: p */
    private void m14274p() {
        if (this.f9879u == 0) {
            this.f9879u = 1;
            this.f9926g.execute(new C3488b(this.f9929j.mo11200g() + this.f9929j.mo11206m(), this.f9929j.mo11198e()));
        }
    }

    /* renamed from: a */
    public void mo11109a(int i, int i2) {
        mo11154f(i, i2);
    }

    /* renamed from: a */
    public void mo11110a(int i, int i2, int i3) {
        int i4 = (this.f9881w - i2) - i3;
        this.f9881w = i4;
        this.f9879u = 0;
        if (i4 > 0) {
            m14274p();
        }
        mo11150d(i, i2);
        mo11152e(0, i3);
        mo11157h(i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11111a(C3503h<V> hVar, C3508e eVar) {
        C3513j<T> jVar = hVar.f9929j;
        int i = this.f9929j.mo11203i() - jVar.mo11203i();
        int k = this.f9929j.mo11204k() - jVar.mo11204k();
        int p = jVar.mo11208p();
        int g = jVar.mo11200g();
        if (jVar.isEmpty() || i < 0 || k < 0 || this.f9929j.mo11208p() != Math.max(p - i, 0) || this.f9929j.mo11200g() != Math.max(g - k, 0) || this.f9929j.mo11207o() != jVar.mo11207o() + i + k) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (i != 0) {
            int min = Math.min(p, i);
            int i2 = i - min;
            int g2 = jVar.mo11200g() + jVar.mo11207o();
            if (min != 0) {
                eVar.mo11097a(g2, min);
            }
            if (i2 != 0) {
                eVar.mo11098b(g2 + min, i2);
            }
        }
        if (k != 0) {
            int min2 = Math.min(g, k);
            int i3 = k - min2;
            if (min2 != 0) {
                eVar.mo11097a(g, min2);
            }
            if (i3 != 0) {
                eVar.mo11098b(0, i3);
            }
        }
    }

    /* renamed from: b */
    public void mo11112b(int i, int i2) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    /* renamed from: b */
    public void mo11113b(int i, int i2, int i3) {
        int i4 = (this.f9882x - i2) - i3;
        this.f9882x = i4;
        this.f9880v = 0;
        if (i4 > 0) {
            m14273o();
        }
        mo11150d(i, i2);
        mo11152e(i + i2, i3);
    }

    /* renamed from: c */
    public void mo11114c() {
        this.f9880v = 2;
    }

    /* renamed from: c */
    public void mo11115c(int i) {
        boolean z = false;
        mo11152e(0, i);
        if (this.f9929j.mo11200g() > 0 || this.f9929j.mo11208p() > 0) {
            z = true;
        }
        this.f9883y = z;
    }

    /* renamed from: c */
    public void mo11116c(int i, int i2) {
        mo11150d(i, i2);
    }

    /* renamed from: d */
    public void mo11117d() {
        this.f9879u = 2;
    }

    /* renamed from: d */
    public void mo11118d(int i) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    /* renamed from: f */
    public C3490d<?, V> mo11119f() {
        return this.f9878t;
    }

    /* renamed from: g */
    public Object mo11120g() {
        return this.f9878t.mo11103a(this.f9930k, this.f9931l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo11121g(int i) {
        int d = m14272d(this.f9928i.f9953b, i, this.f9929j.mo11200g());
        int c = m14271c(this.f9928i.f9953b, i, this.f9929j.mo11200g() + this.f9929j.mo11207o());
        int max = Math.max(d, this.f9881w);
        this.f9881w = max;
        if (max > 0) {
            m14274p();
        }
        int max2 = Math.max(c, this.f9882x);
        this.f9882x = max2;
        if (max2 > 0) {
            m14273o();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo11122i() {
        return true;
    }
}
