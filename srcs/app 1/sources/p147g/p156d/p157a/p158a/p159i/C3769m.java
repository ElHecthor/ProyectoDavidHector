package p147g.p156d.p157a.p158a.p159i;

import java.util.Set;
import p147g.p156d.p157a.p158a.C3739b;
import p147g.p156d.p157a.p158a.C3742e;
import p147g.p156d.p157a.p158a.C3743f;
import p147g.p156d.p157a.p158a.C3744g;

/* renamed from: g.d.a.a.i.m */
final class C3769m implements C3744g {

    /* renamed from: a */
    private final Set<C3739b> f10655a;

    /* renamed from: b */
    private final C3767l f10656b;

    /* renamed from: c */
    private final C3772p f10657c;

    C3769m(Set<C3739b> set, C3767l lVar, C3772p pVar) {
        this.f10655a = set;
        this.f10656b = lVar;
        this.f10657c = pVar;
    }

    /* renamed from: a */
    public <T> C3743f<T> mo9807a(String str, Class<T> cls, C3739b bVar, C3742e<T, byte[]> eVar) {
        if (this.f10655a.contains(bVar)) {
            C3771o oVar = new C3771o(this.f10656b, str, bVar, eVar, this.f10657c);
            return oVar;
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f10655a}));
    }
}
