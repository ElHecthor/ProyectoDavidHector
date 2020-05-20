package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p298ui.widgets.empty_view.EmptyView;

/* renamed from: io.stashteam.stashapp.c.c */
public final class C4971c implements C3657a {

    /* renamed from: a */
    private final CoordinatorLayout f13009a;

    /* renamed from: b */
    public final LinearLayout f13010b;

    /* renamed from: c */
    public final Chip f13011c;

    /* renamed from: d */
    public final EmptyView f13012d;

    /* renamed from: e */
    public final FloatingActionButton f13013e;

    /* renamed from: f */
    public final ProgressBar f13014f;

    /* renamed from: g */
    public final RecyclerView f13015g;

    /* renamed from: h */
    public final AppCompatTextView f13016h;

    /* renamed from: i */
    public final AppCompatTextView f13017i;

    private C4971c(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, Chip chip, EmptyView emptyView, FloatingActionButton floatingActionButton, ProgressBar progressBar, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f13009a = coordinatorLayout;
        this.f13010b = linearLayout;
        this.f13011c = chip;
        this.f13012d = emptyView;
        this.f13013e = floatingActionButton;
        this.f13014f = progressBar;
        this.f13015g = recyclerView;
        this.f13016h = appCompatTextView;
        this.f13017i = appCompatTextView2;
    }

    /* renamed from: a */
    public static C4971c m19902a(LayoutInflater layoutInflater) {
        return m19903a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C4971c m19903a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_game_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19904a(inflate);
    }

    /* renamed from: a */
    public static C4971c m19904a(View view) {
        String str;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bottom_sheet);
        if (linearLayout != null) {
            Chip chip = (Chip) view.findViewById(R.id.chip_filter);
            if (chip != null) {
                EmptyView emptyView = (EmptyView) view.findViewById(R.id.empty_view);
                if (emptyView != null) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view.findViewById(R.id.fab_filter);
                    if (floatingActionButton != null) {
                        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
                        if (progressBar != null) {
                            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
                            if (recyclerView != null) {
                                AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_subtitle);
                                if (appCompatTextView != null) {
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.text_title);
                                    if (appCompatTextView2 != null) {
                                        C4971c cVar = new C4971c((CoordinatorLayout) view, linearLayout, chip, emptyView, floatingActionButton, progressBar, recyclerView, appCompatTextView, appCompatTextView2);
                                        return cVar;
                                    }
                                    str = "textTitle";
                                } else {
                                    str = "textSubtitle";
                                }
                            } else {
                                str = "recyclerView";
                            }
                        } else {
                            str = "progressBar";
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
        } else {
            str = "bottomSheet";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public CoordinatorLayout m19906b() {
        return this.f13009a;
    }
}
