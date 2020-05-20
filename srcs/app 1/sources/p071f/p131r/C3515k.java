package p071f.p131r;

import androidx.recyclerview.widget.C0636h;
import androidx.recyclerview.widget.C0636h.C0638b;
import androidx.recyclerview.widget.C0636h.C0639c;
import androidx.recyclerview.widget.C0636h.C0640d;
import androidx.recyclerview.widget.C0659p;

/* renamed from: f.r.k */
class C3515k {

    /* renamed from: f.r.k$a */
    static class C3516a extends C0638b {

        /* renamed from: a */
        final /* synthetic */ C3513j f9975a;

        /* renamed from: b */
        final /* synthetic */ int f9976b;

        /* renamed from: c */
        final /* synthetic */ C3513j f9977c;

        /* renamed from: d */
        final /* synthetic */ C0640d f9978d;

        /* renamed from: e */
        final /* synthetic */ int f9979e;

        /* renamed from: f */
        final /* synthetic */ int f9980f;

        C3516a(C3513j jVar, int i, C3513j jVar2, C0640d dVar, int i2, int i3) {
            this.f9975a = jVar;
            this.f9976b = i;
            this.f9977c = jVar2;
            this.f9978d = dVar;
            this.f9979e = i2;
            this.f9980f = i3;
        }

        /* renamed from: a */
        public int mo3824a() {
            return this.f9980f;
        }

        /* renamed from: a */
        public boolean mo3825a(int i, int i2) {
            Object obj = this.f9975a.get(i + this.f9976b);
            C3513j jVar = this.f9977c;
            Object obj2 = jVar.get(i2 + jVar.mo11200g());
            if (obj == obj2) {
                return true;
            }
            if (obj == null || obj2 == null) {
                return false;
            }
            return this.f9978d.mo3888a(obj, obj2);
        }

        /* renamed from: b */
        public int mo3826b() {
            return this.f9979e;
        }

        /* renamed from: b */
        public boolean mo3827b(int i, int i2) {
            Object obj = this.f9975a.get(i + this.f9976b);
            C3513j jVar = this.f9977c;
            Object obj2 = jVar.get(i2 + jVar.mo11200g());
            if (obj == obj2) {
                return true;
            }
            if (obj == null || obj2 == null) {
                return false;
            }
            return this.f9978d.mo3889b(obj, obj2);
        }

        /* renamed from: c */
        public Object mo3828c(int i, int i2) {
            Object obj = this.f9975a.get(i + this.f9976b);
            C3513j jVar = this.f9977c;
            Object obj2 = jVar.get(i2 + jVar.mo11200g());
            if (obj == null || obj2 == null) {
                return null;
            }
            return this.f9978d.mo3890c(obj, obj2);
        }
    }

    /* renamed from: f.r.k$b */
    private static class C3517b implements C0659p {

        /* renamed from: a */
        private final int f9981a;

        /* renamed from: b */
        private final C0659p f9982b;

        C3517b(int i, C0659p pVar) {
            this.f9981a = i;
            this.f9982b = pVar;
        }

        /* renamed from: a */
        public void mo3810a(int i, int i2) {
            this.f9982b.mo3810a(i + this.f9981a, i2);
        }

        /* renamed from: a */
        public void mo3811a(int i, int i2, Object obj) {
            this.f9982b.mo3811a(i + this.f9981a, i2, obj);
        }

        /* renamed from: b */
        public void mo3812b(int i, int i2) {
            C0659p pVar = this.f9982b;
            int i3 = this.f9981a;
            pVar.mo3812b(i + i3, i2 + i3);
        }

        /* renamed from: c */
        public void mo3813c(int i, int i2) {
            this.f9982b.mo3813c(i + this.f9981a, i2);
        }
    }

    /* renamed from: a */
    static int m14405a(C0639c cVar, C3513j jVar, C3513j jVar2, int i) {
        int c = jVar.mo11194c();
        int i2 = i - c;
        int size = (jVar.size() - c) - jVar.mo11196d();
        if (i2 >= 0 && i2 < size) {
            for (int i3 = 0; i3 < 30; i3++) {
                int i4 = ((i3 / 2) * (i3 % 2 == 1 ? -1 : 1)) + i2;
                if (i4 >= 0 && i4 < jVar.mo11207o()) {
                    try {
                        int a = cVar.mo3886a(i4);
                        if (a != -1) {
                            return a + jVar2.mo11200g();
                        }
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
            }
        }
        return Math.max(0, Math.min(i, jVar2.size() - 1));
    }

    /* renamed from: a */
    static <T> C0639c m14406a(C3513j<T> jVar, C3513j<T> jVar2, C0640d<T> dVar) {
        int c = jVar.mo11194c();
        C3516a aVar = new C3516a(jVar, c, jVar2, dVar, (jVar.size() - c) - jVar.mo11196d(), (jVar2.size() - jVar2.mo11194c()) - jVar2.mo11196d());
        return C0636h.m3621a(aVar, true);
    }

    /* renamed from: a */
    static <T> void m14407a(C0659p pVar, C3513j<T> jVar, C3513j<T> jVar2, C0639c cVar) {
        int d = jVar.mo11196d();
        int d2 = jVar2.mo11196d();
        int c = jVar.mo11194c();
        int c2 = jVar2.mo11194c();
        if (d == 0 && d2 == 0 && c == 0 && c2 == 0) {
            cVar.mo3887a(pVar);
            return;
        }
        if (d > d2) {
            int i = d - d2;
            pVar.mo3810a(jVar.size() - i, i);
        } else if (d < d2) {
            pVar.mo3813c(jVar.size(), d2 - d);
        }
        if (c > c2) {
            pVar.mo3810a(0, c - c2);
        } else if (c < c2) {
            pVar.mo3813c(0, c2 - c);
        }
        if (c2 != 0) {
            cVar.mo3887a((C0659p) new C3517b(c2, pVar));
        } else {
            cVar.mo3887a(pVar);
        }
    }
}
