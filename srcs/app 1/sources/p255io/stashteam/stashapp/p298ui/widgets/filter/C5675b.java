package p255io.stashteam.stashapp.p298ui.widgets.filter;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5341b;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.widgets.filter.b */
public abstract class C5675b extends C5341b {

    /* renamed from: a */
    private FloatingActionButton f14747a;

    public C5675b(FloatingActionButton floatingActionButton) {
        C5942k.m22327b(floatingActionButton, "fabFilter");
        this.f14747a = floatingActionButton;
    }

    /* renamed from: a */
    public void mo15041a() {
        if (this.f14747a.isShown()) {
            this.f14747a.mo8743b();
        }
    }

    /* renamed from: b */
    public void mo15042b() {
        if (!this.f14747a.isShown() && !mo15089c()) {
            this.f14747a.mo8751e();
        }
    }

    /* renamed from: c */
    public abstract boolean mo15089c();
}
