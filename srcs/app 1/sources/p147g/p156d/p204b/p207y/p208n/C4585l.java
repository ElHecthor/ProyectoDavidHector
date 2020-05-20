package p147g.p156d.p204b.p207y.p208n;

import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.C4495j;
import p147g.p156d.p204b.C4496k;
import p147g.p156d.p204b.C4497l;
import p147g.p156d.p204b.C4503r;
import p147g.p156d.p204b.C4504s;
import p147g.p156d.p204b.C4509v;
import p147g.p156d.p204b.C4511w;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p207y.C4553l;
import p147g.p156d.p204b.p211z.C4632a;

/* renamed from: g.d.b.y.n.l */
public final class C4585l<T> extends C4509v<T> {

    /* renamed from: a */
    private final C4504s<T> f12034a;

    /* renamed from: b */
    private final C4496k<T> f12035b;

    /* renamed from: c */
    final C4485f f12036c;

    /* renamed from: d */
    private final C4632a<T> f12037d;

    /* renamed from: e */
    private final C4511w f12038e;

    /* renamed from: f */
    private final C4587b f12039f = new C4587b<>();

    /* renamed from: g */
    private C4509v<T> f12040g;

    /* renamed from: g.d.b.y.n.l$b */
    private final class C4587b implements C4503r, C4495j {
        private C4587b(C4585l lVar) {
        }
    }

    public C4585l(C4504s<T> sVar, C4496k<T> kVar, C4485f fVar, C4632a<T> aVar, C4511w wVar) {
        this.f12034a = sVar;
        this.f12035b = kVar;
        this.f12036c = fVar;
        this.f12037d = aVar;
        this.f12038e = wVar;
    }

    /* renamed from: b */
    private C4509v<T> m18541b() {
        C4509v<T> vVar = this.f12040g;
        if (vVar != null) {
            return vVar;
        }
        C4509v<T> a = this.f12036c.mo13335a(this.f12038e, this.f12037d);
        this.f12040g = a;
        return a;
    }

    /* renamed from: a */
    public T mo13284a(C4470a aVar) {
        if (this.f12035b == null) {
            return m18541b().mo13284a(aVar);
        }
        C4497l a = C4553l.m18447a(aVar);
        if (a.mo13367g()) {
            return null;
        }
        return this.f12035b.mo13362a(a, this.f12037d.mo13530b(), this.f12039f);
    }

    /* renamed from: a */
    public void mo13285a(C4473c cVar, T t) {
        C4504s<T> sVar = this.f12034a;
        if (sVar == null) {
            m18541b().mo13285a(cVar, t);
        } else if (t == null) {
            cVar.mo13329m();
        } else {
            C4553l.m18449a(sVar.mo13390a(t, this.f12037d.mo13530b(), this.f12039f), cVar);
        }
    }
}
