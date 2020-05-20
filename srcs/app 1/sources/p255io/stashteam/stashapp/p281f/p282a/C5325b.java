package p255io.stashteam.stashapp.p281f.p282a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.C2594b;
import p071f.p143x.C3657a;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.a.b */
public abstract class C5325b<VB extends C3657a> extends C2594b {

    /* renamed from: q0 */
    private VB f13993q0;

    /* renamed from: Y */
    public void mo2485Y() {
        super.mo2485Y();
        this.f13993q0 = null;
    }

    /* renamed from: a */
    public View mo2488a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5942k.m22327b(layoutInflater, "inflater");
        this.f13993q0 = mo15025a(viewGroup);
        return mo15026x0().mo11568b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract VB mo15025a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public final VB mo15026x0() {
        VB vb = this.f13993q0;
        if (vb != null) {
            return vb;
        }
        C5942k.m22323a();
        throw null;
    }
}
