package com.bumptech.glide.load.p011p;

import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p007o.C1013q;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.p029t.C1309j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p071f.p097h.p107l.C3318e;

/* renamed from: com.bumptech.glide.load.p.q */
class C1075q<Model, Data> implements C1069n<Model, Data> {

    /* renamed from: a */
    private final List<C1069n<Model, Data>> f3813a;

    /* renamed from: b */
    private final C3318e<List<Throwable>> f3814b;

    /* renamed from: com.bumptech.glide.load.p.q$a */
    static class C1076a<Data> implements C0881d<Data>, C0882a<Data> {

        /* renamed from: f */
        private final List<C0881d<Data>> f3815f;

        /* renamed from: g */
        private final C3318e<List<Throwable>> f3816g;

        /* renamed from: h */
        private int f3817h = 0;

        /* renamed from: i */
        private C0838g f3818i;

        /* renamed from: j */
        private C0882a<? super Data> f3819j;

        /* renamed from: k */
        private List<Throwable> f3820k;

        /* renamed from: l */
        private boolean f3821l;

        C1076a(List<C0881d<Data>> list, C3318e<List<Throwable>> eVar) {
            this.f3816g = eVar;
            C1309j.m6152a(list);
            this.f3815f = list;
        }

        /* renamed from: d */
        private void m5227d() {
            if (!this.f3821l) {
                if (this.f3817h < this.f3815f.size() - 1) {
                    this.f3817h++;
                    mo4564a(this.f3818i, this.f3819j);
                } else {
                    C1309j.m6149a(this.f3820k);
                    this.f3819j.mo4645a((Exception) new C1013q("Fetch failed", (List<Throwable>) new ArrayList<Throwable>(this.f3820k)));
                }
            }
        }

        /* renamed from: a */
        public Class<Data> mo4563a() {
            return ((C0881d) this.f3815f.get(0)).mo4563a();
        }

        /* renamed from: a */
        public void mo4564a(C0838g gVar, C0882a<? super Data> aVar) {
            this.f3818i = gVar;
            this.f3819j = aVar;
            this.f3820k = (List) this.f3816g.mo5387a();
            ((C0881d) this.f3815f.get(this.f3817h)).mo4564a(gVar, this);
            if (this.f3821l) {
                cancel();
            }
        }

        /* renamed from: a */
        public void mo4645a(Exception exc) {
            List<Throwable> list = this.f3820k;
            C1309j.m6149a(list);
            list.add(exc);
            m5227d();
        }

        /* renamed from: a */
        public void mo4646a(Data data) {
            if (data != null) {
                this.f3819j.mo4646a(data);
            } else {
                m5227d();
            }
        }

        /* renamed from: b */
        public void mo4567b() {
            List<Throwable> list = this.f3820k;
            if (list != null) {
                this.f3816g.mo5388a(list);
            }
            this.f3820k = null;
            for (C0881d b : this.f3815f) {
                b.mo4567b();
            }
        }

        /* renamed from: c */
        public C0856a mo4568c() {
            return ((C0881d) this.f3815f.get(0)).mo4568c();
        }

        public void cancel() {
            this.f3821l = true;
            for (C0881d cancel : this.f3815f) {
                cancel.cancel();
            }
        }
    }

    C1075q(List<C1069n<Model, Data>> list, C3318e<List<Throwable>> eVar) {
        this.f3813a = list;
        this.f3814b = eVar;
    }

    /* renamed from: a */
    public C1070a<Data> mo4571a(Model model, int i, int i2, C0873i iVar) {
        int size = this.f3813a.size();
        ArrayList arrayList = new ArrayList(size);
        C0869g gVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1069n nVar = (C1069n) this.f3813a.get(i3);
            if (nVar.mo4573a(model)) {
                C1070a a = nVar.mo4571a(model, i, i2, iVar);
                if (a != null) {
                    gVar = a.f3806a;
                    arrayList.add(a.f3808c);
                }
            }
        }
        if (arrayList.isEmpty() || gVar == null) {
            return null;
        }
        return new C1070a<>(gVar, new C1076a(arrayList, this.f3814b));
    }

    /* renamed from: a */
    public boolean mo4573a(Model model) {
        for (C1069n a : this.f3813a) {
            if (a.mo4573a(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(Arrays.toString(this.f3813a.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
