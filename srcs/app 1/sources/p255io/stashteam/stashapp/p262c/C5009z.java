package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p298ui.widgets.empty_view.EmptyView;

/* renamed from: io.stashteam.stashapp.c.z */
public final class C5009z implements C3657a {

    /* renamed from: a */
    private final ConstraintLayout f13219a;

    /* renamed from: b */
    public final Chip f13220b;

    /* renamed from: c */
    public final EmptyView f13221c;

    /* renamed from: d */
    public final FloatingActionButton f13222d;

    /* renamed from: e */
    public final RecyclerView f13223e;

    /* renamed from: f */
    public final SwipeRefreshLayout f13224f;

    private C5009z(ConstraintLayout constraintLayout, Chip chip, EmptyView emptyView, FloatingActionButton floatingActionButton, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f13219a = constraintLayout;
        this.f13220b = chip;
        this.f13221c = emptyView;
        this.f13222d = floatingActionButton;
        this.f13223e = recyclerView;
        this.f13224f = swipeRefreshLayout;
    }

    /* renamed from: a */
    public static C5009z m20051a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_user_games, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20052a(inflate);
    }

    /* renamed from: a */
    public static C5009z m20052a(View view) {
        String str;
        Chip chip = (Chip) view.findViewById(R.id.chip_filter);
        if (chip != null) {
            EmptyView emptyView = (EmptyView) view.findViewById(R.id.empty_view);
            if (emptyView != null) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) view.findViewById(R.id.fab_filter);
                if (floatingActionButton != null) {
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
                    if (recyclerView != null) {
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh);
                        if (swipeRefreshLayout != null) {
                            C5009z zVar = new C5009z((ConstraintLayout) view, chip, emptyView, floatingActionButton, recyclerView, swipeRefreshLayout);
                            return zVar;
                        }
                        str = "swipeRefresh";
                    } else {
                        str = "recyclerView";
                    }
                } else {
                    str = "fabFilter";
                }
            } else {
                str = "emptyView";
            }
        } else {
            str = "chipFilter";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public ConstraintLayout m20054b() {
        return this.f13219a;
    }
}
