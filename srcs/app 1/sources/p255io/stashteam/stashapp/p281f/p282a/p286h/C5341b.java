package p255io.stashteam.stashapp.p281f.p282a.p286h;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0589t;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.a.h.b */
public abstract class C5341b extends C0589t {
    /* renamed from: a */
    public abstract void mo15041a();

    /* renamed from: a */
    public void mo3641a(RecyclerView recyclerView, int i, int i2) {
        C5942k.m22327b(recyclerView, "recyclerView");
        super.mo3641a(recyclerView, i, i2);
        if (i2 > 0) {
            mo15041a();
        } else if (i2 < 0) {
            mo15042b();
        }
    }

    /* renamed from: b */
    public abstract void mo15042b();
}
