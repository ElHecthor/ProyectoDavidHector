package p071f.p131r;

import java.util.List;
import p071f.p080b.p081a.p084c.C3151a;
import p071f.p131r.C3490d.C3494c;
import p071f.p131r.C3518l.C3520b;
import p071f.p131r.C3518l.C3522d;
import p071f.p131r.C3518l.C3523e;
import p071f.p131r.C3518l.C3525g;

/* renamed from: f.r.o */
class C3530o<A, B> extends C3518l<B> {

    /* renamed from: c */
    private final C3518l<A> f10002c;

    /* renamed from: d */
    final C3151a<List<A>, List<B>> f10003d;

    /* renamed from: f.r.o$a */
    class C3531a extends C3520b<A> {

        /* renamed from: a */
        final /* synthetic */ C3520b f10004a;

        C3531a(C3520b bVar) {
            this.f10004a = bVar;
        }

        /* renamed from: a */
        public void mo11217a(List<A> list, int i) {
            this.f10004a.mo11217a(C3490d.m14290a(C3530o.this.f10003d, list), i);
        }

        /* renamed from: a */
        public void mo11218a(List<A> list, int i, int i2) {
            this.f10004a.mo11218a(C3490d.m14290a(C3530o.this.f10003d, list), i, i2);
        }
    }

    /* renamed from: f.r.o$b */
    class C3532b extends C3523e<A> {

        /* renamed from: a */
        final /* synthetic */ C3523e f10006a;

        C3532b(C3523e eVar) {
            this.f10006a = eVar;
        }

        /* renamed from: a */
        public void mo11219a(List<A> list) {
            this.f10006a.mo11219a(C3490d.m14290a(C3530o.this.f10003d, list));
        }
    }

    C3530o(C3518l<A> lVar, C3151a<List<A>, List<B>> aVar) {
        this.f10002c = lVar;
        this.f10003d = aVar;
    }

    /* renamed from: a */
    public void mo11127a() {
        this.f10002c.mo11127a();
    }

    /* renamed from: a */
    public void mo11128a(C3494c cVar) {
        this.f10002c.mo11128a(cVar);
    }

    /* renamed from: a */
    public void mo4144a(C3522d dVar, C3520b<B> bVar) {
        this.f10002c.mo4144a(dVar, (C3520b<T>) new C3531a<T>(bVar));
    }

    /* renamed from: a */
    public void mo4145a(C3525g gVar, C3523e<B> eVar) {
        this.f10002c.mo4145a(gVar, (C3523e<T>) new C3532b<T>(eVar));
    }

    /* renamed from: b */
    public void mo11129b(C3494c cVar) {
        this.f10002c.mo11129b(cVar);
    }

    /* renamed from: c */
    public boolean mo4146c() {
        return this.f10002c.mo4146c();
    }
}
