package p255io.stashteam.stashapp.p281f.p295f.p297b;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0579n;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.f.b.a */
public final class C5448a extends C0579n {

    /* renamed from: a */
    private final int f14246a;

    /* renamed from: b */
    private final int f14247b;

    public C5448a(int i, int i2) {
        this.f14246a = i;
        this.f14247b = i2;
    }

    /* renamed from: a */
    public void mo3528a(Rect rect, View view, RecyclerView recyclerView, C0560a0 a0Var) {
        C5942k.m22327b(rect, "outRect");
        C5942k.m22327b(view, "view");
        C5942k.m22327b(recyclerView, "parent");
        C5942k.m22327b(a0Var, "state");
        if (recyclerView.getChildAdapterPosition(view) % this.f14246a == 1) {
            rect.left = this.f14247b / 2;
        } else {
            rect.right = this.f14247b / 2;
        }
        rect.bottom = this.f14247b;
    }
}
