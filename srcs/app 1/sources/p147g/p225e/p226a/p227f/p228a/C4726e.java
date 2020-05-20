package p147g.p225e.p226a.p227f.p228a;

import p071f.p144y.p145a.C3659b;
import p071f.p144y.p145a.C3659b.C3669j;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5923q;
import p308k.p323z.p325d.C5942k;

/* renamed from: g.e.a.f.a.e */
public final class C4726e {

    /* renamed from: g.e.a.f.a.e$a */
    public static final class C4727a implements C3669j {

        /* renamed from: a */
        final /* synthetic */ C5923q f12370a;

        /* renamed from: b */
        final /* synthetic */ C5918l f12371b;

        /* renamed from: c */
        final /* synthetic */ C5918l f12372c;

        C4727a(C5923q qVar, C5918l lVar, C5918l lVar2) {
            this.f12370a = qVar;
            this.f12371b = lVar;
            this.f12372c = lVar2;
        }

        /* renamed from: a */
        public void mo9144a(int i) {
            C5918l lVar = this.f12372c;
            if (lVar != null) {
                C5812t tVar = (C5812t) lVar.mo4090d(Integer.valueOf(i));
            }
        }

        /* renamed from: a */
        public void mo9145a(int i, float f, int i2) {
            C5923q qVar = this.f12370a;
            if (qVar != null) {
                C5812t tVar = (C5812t) qVar.mo15602a(Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2));
            }
        }

        /* renamed from: b */
        public void mo9146b(int i) {
            C5918l lVar = this.f12371b;
            if (lVar != null) {
                C5812t tVar = (C5812t) lVar.mo4090d(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: a */
    public static final C3669j m19052a(C3659b bVar, C5923q<? super Integer, ? super Float, ? super Integer, C5812t> qVar, C5918l<? super Integer, C5812t> lVar, C5918l<? super Integer, C5812t> lVar2) {
        C5942k.m22327b(bVar, "$receiver");
        C4727a aVar = new C4727a(qVar, lVar, lVar2);
        bVar.mo11590a((C3669j) aVar);
        return aVar;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C3669j m19053a(C3659b bVar, C5923q qVar, C5918l lVar, C5918l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            qVar = null;
        }
        if ((i & 2) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            lVar2 = null;
        }
        return m19052a(bVar, qVar, lVar, lVar2);
    }
}
