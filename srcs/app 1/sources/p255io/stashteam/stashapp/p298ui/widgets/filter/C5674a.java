package p255io.stashteam.stashapp.p298ui.widgets.filter;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.C0445l;
import io.stashteam.games.tracker.stashapp.R;
import p255io.stashteam.stashapp.p262c.C5004u;
import p255io.stashteam.stashapp.p269e.p280c.C5299h;
import p255io.stashteam.stashapp.p281f.p282a.C5325b;
import p255io.stashteam.stashapp.p298ui.widgets.filter.FilterView.C5672a;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.widgets.filter.a */
public final class C5674a extends C5325b<C5004u> implements OnClickListener {

    /* renamed from: r0 */
    private C5918l<? super C5299h, C5812t> f14744r0;

    /* renamed from: s0 */
    private C5299h f14745s0;

    /* renamed from: t0 */
    private final C5672a f14746t0;

    public C5674a(C5672a aVar) {
        this.f14746t0 = aVar;
        C5299h hVar = new C5299h(null, null, null, null, null, 31, null);
        this.f14745s0 = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5004u m21641a(ViewGroup viewGroup) {
        C5004u a = C5004u.m20031a(mo2585u(), viewGroup, false);
        C5942k.m22324a((Object) a, "DialogFilterBinding.infl…flater, container, false)");
        return a;
    }

    /* renamed from: a */
    public void mo2506a(View view, Bundle bundle) {
        C5942k.m22327b(view, "view");
        super.mo2506a(view, bundle);
        view.setBackgroundResource(R.color.color_surface);
        C5672a aVar = this.f14746t0;
        if (aVar != null) {
            ((C5004u) mo15026x0()).f13179c.setUpFilter(aVar);
        }
        ((C5004u) mo15026x0()).f13178b.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo15303a(C0445l lVar, String str, C5299h hVar) {
        C5942k.m22327b(lVar, "manager");
        C5942k.m22327b(hVar, "filterData");
        super.mo2649a(lVar, str);
        this.f14745s0 = hVar;
    }

    /* renamed from: a */
    public final void mo15304a(C5918l<? super C5299h, C5812t> lVar) {
        C5942k.m22327b(lVar, "listener");
        this.f14744r0 = lVar;
    }

    /* renamed from: b0 */
    public void mo2522b0() {
        super.mo2522b0();
        ((C5004u) mo15026x0()).f13179c.mo15290a(this.f14745s0);
    }

    public void onClick(View view) {
        if (view != null && view.getId() == R.id.btn_apply) {
            C5299h selectedFilters = ((C5004u) mo15026x0()).f13179c.getSelectedFilters();
            C5918l<? super C5299h, C5812t> lVar = this.f14744r0;
            if (lVar != null) {
                C5812t tVar = (C5812t) lVar.mo4090d(selectedFilters);
            }
            mo2653s0();
        }
    }
}
