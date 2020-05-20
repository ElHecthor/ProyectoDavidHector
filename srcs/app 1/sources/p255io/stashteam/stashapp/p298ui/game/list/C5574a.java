package p255io.stashteam.stashapp.p298ui.game.list;

import androidx.lifecycle.C0532t;
import androidx.lifecycle.LiveData;
import p071f.p131r.C3503h;
import p255io.stashteam.stashapp.p269e.p280c.C5299h;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p281f.p282a.p287i.C5345a;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.game.list.a */
public abstract class C5574a extends C5345a {

    /* renamed from: g */
    private final C0532t<C5299h> f14517g;

    /* renamed from: h */
    private final C5299h f14518h;

    public C5574a(C5299h hVar) {
        this.f14518h = hVar;
        C0532t<C5299h> tVar = new C0532t<>();
        this.f14517g = tVar;
        C5299h hVar2 = this.f14518h;
        if (hVar2 != null) {
            tVar.mo2981b(hVar2);
        }
    }

    /* renamed from: a */
    public void mo15080a(C5299h hVar) {
        C5942k.m22327b(hVar, "data");
        this.f14517g.mo2981b(hVar);
    }

    /* renamed from: f */
    public final LiveData<C5299h> mo15212f() {
        return this.f14517g;
    }

    /* renamed from: g */
    public abstract LiveData<C3503h<C5323z>> mo15081g();

    /* renamed from: h */
    public abstract LiveData<C5313r> mo15082h();

    /* renamed from: i */
    public void mo15083i() {
        this.f14517g.mo2981b(this.f14518h);
    }
}
