package p255io.stashteam.stashapp.p281f.p282a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p071f.p143x.C3657a;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.a.c */
public abstract class C5326c<VB extends C3657a> extends Fragment {

    /* renamed from: b0 */
    private VB f13994b0;

    /* renamed from: Y */
    public void mo2485Y() {
        super.mo2485Y();
        this.f13994b0 = null;
    }

    /* renamed from: a */
    public View mo2488a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5942k.m22327b(layoutInflater, "inflater");
        this.f13994b0 = mo15027a(viewGroup);
        return mo2653s0().mo11568b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract VB mo15027a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public final VB mo2653s0() {
        VB vb = this.f13994b0;
        if (vb != null) {
            return vb;
        }
        C5942k.m22323a();
        throw null;
    }
}
