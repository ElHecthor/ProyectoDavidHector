package p255io.stashteam.stashapp.p281f.p295f.p297b;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0579n;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.f.b.b */
public final class C5449b extends C0579n {

    /* renamed from: a */
    private final int f14248a;

    public C5449b(int i) {
        this.f14248a = i;
    }

    /* renamed from: a */
    public void mo3528a(Rect rect, View view, RecyclerView recyclerView, C0560a0 a0Var) {
        C5942k.m22327b(rect, "outRect");
        C5942k.m22327b(view, "view");
        C5942k.m22327b(recyclerView, "parent");
        C5942k.m22327b(a0Var, "state");
        rect.right = recyclerView.getChildAdapterPosition(view) == a0Var.mo3384a() + -1 ? 0 : this.f14248a;
    }
}
