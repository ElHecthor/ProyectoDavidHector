package p255io.stashteam.stashapp.p281f.p282a.p284f;

import androidx.lifecycle.C0532t;
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlinx.coroutines.C6089g0;
import p071f.p131r.C3490d;
import p071f.p131r.C3490d.C3492b;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.utils.p305g.C5715a;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.a.f.b */
public final class C5336b<T, I extends C5201a<? super P, ? extends List<? extends T>>, P extends C5715a<? extends P>> extends C3492b<Integer, T> {

    /* renamed from: a */
    private final C0532t<C5333a<T, I, P>> f14024a = new C0532t<>();

    /* renamed from: b */
    private final C6089g0 f14025b;

    /* renamed from: c */
    private final I f14026c;

    /* renamed from: d */
    private P f14027d;

    public C5336b(C6089g0 g0Var, I i, P p) {
        C5942k.m22327b(g0Var, "scope");
        C5942k.m22327b(i, "interactor");
        C5942k.m22327b(p, "requestParams");
        this.f14025b = g0Var;
        this.f14026c = i;
        this.f14027d = p;
    }

    /* renamed from: a */
    public C3490d<Integer, T> mo11132a() {
        C5333a aVar = new C5333a(this.f14025b, this.f14026c, this.f14027d);
        this.f14024a.mo2978a(aVar);
        return aVar;
    }

    /* renamed from: a */
    public final void mo15035a(P p) {
        C5942k.m22327b(p, "params");
        this.f14027d = p;
    }

    /* renamed from: b */
    public final LiveData<C5333a<T, I, P>> mo15036b() {
        return this.f14024a;
    }
}
