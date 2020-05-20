package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p298ui.widgets.empty_view.EmptyView;

/* renamed from: io.stashteam.stashapp.c.i0 */
public final class C4984i0 implements C3657a {

    /* renamed from: a */
    private final ConstraintLayout f13071a;

    /* renamed from: b */
    public final EmptyView f13072b;

    /* renamed from: c */
    public final ExtendedFloatingActionButton f13073c;

    /* renamed from: d */
    public final RecyclerView f13074d;

    /* renamed from: e */
    public final SwipeRefreshLayout f13075e;

    private C4984i0(ConstraintLayout constraintLayout, EmptyView emptyView, ExtendedFloatingActionButton extendedFloatingActionButton, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f13071a = constraintLayout;
        this.f13072b = emptyView;
        this.f13073c = extendedFloatingActionButton;
        this.f13074d = recyclerView;
        this.f13075e = swipeRefreshLayout;
    }

    /* renamed from: a */
    public static C4984i0 m19960a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_custom_lists, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19961a(inflate);
    }

    /* renamed from: a */
    public static C4984i0 m19961a(View view) {
        String str;
        EmptyView emptyView = (EmptyView) view.findViewById(R.id.empty_view);
        if (emptyView != null) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view.findViewById(R.id.fab_create);
            if (extendedFloatingActionButton != null) {
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
                if (recyclerView != null) {
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh);
                    if (swipeRefreshLayout != null) {
                        C4984i0 i0Var = new C4984i0((ConstraintLayout) view, emptyView, extendedFloatingActionButton, recyclerView, swipeRefreshLayout);
                        return i0Var;
                    }
                    str = "swipeRefresh";
                } else {
                    str = "recyclerView";
                }
            } else {
                str = "fabCreate";
            }
        } else {
            str = "emptyView";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public ConstraintLayout m19963b() {
        return this.f13071a;
    }
}
