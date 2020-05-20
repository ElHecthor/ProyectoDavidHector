package p255io.stashteam.stashapp.utils.p304f;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.C0644i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p097h.p098e.C3236a;
import p255io.stashteam.stashapp.p281f.p295f.p297b.C5448a;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.utils.f.o */
public final class C5713o {
    /* renamed from: a */
    public static final void m21811a(RecyclerView recyclerView, int i) {
        C5942k.m22327b(recyclerView, "$this$setDivider");
        C0644i iVar = new C0644i(recyclerView.getContext(), 1);
        Drawable c = C3236a.m13271c(recyclerView.getContext(), i);
        if (c != null) {
            iVar.mo3892a(c);
            recyclerView.addItemDecoration(iVar);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m21812a(RecyclerView recyclerView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        m21813b(recyclerView, i);
    }

    /* renamed from: b */
    public static final void m21813b(RecyclerView recyclerView, int i) {
        C5942k.m22327b(recyclerView, "$this$setUpGrid");
        int dimensionPixelOffset = recyclerView.getResources().getDimensionPixelOffset(R.dimen.space_small);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), i));
        recyclerView.addItemDecoration(new C5448a(i, dimensionPixelOffset));
        recyclerView.setItemAnimator(null);
    }
}
