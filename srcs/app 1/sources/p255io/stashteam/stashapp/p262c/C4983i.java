package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.i */
public final class C4983i implements C3657a {

    /* renamed from: a */
    private final CoordinatorLayout f13065a;

    /* renamed from: b */
    public final LinearLayout f13066b;

    /* renamed from: c */
    public final ProgressBar f13067c;

    /* renamed from: d */
    public final RecyclerView f13068d;

    /* renamed from: e */
    public final AppCompatTextView f13069e;

    /* renamed from: f */
    public final AppCompatTextView f13070f;

    private C4983i(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f13065a = coordinatorLayout;
        this.f13066b = linearLayout;
        this.f13067c = progressBar;
        this.f13068d = recyclerView;
        this.f13069e = appCompatTextView;
        this.f13070f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C4983i m19955a(LayoutInflater layoutInflater) {
        return m19956a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C4983i m19956a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_reviews, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19957a(inflate);
    }

    /* renamed from: a */
    public static C4983i m19957a(View view) {
        String str;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bottom_sheet);
        if (linearLayout != null) {
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
            if (progressBar != null) {
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
                if (recyclerView != null) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_subtitle);
                    if (appCompatTextView != null) {
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.text_title);
                        if (appCompatTextView2 != null) {
                            C4983i iVar = new C4983i((CoordinatorLayout) view, linearLayout, progressBar, recyclerView, appCompatTextView, appCompatTextView2);
                            return iVar;
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
            str = "bottomSheet";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public CoordinatorLayout m19959b() {
        return this.f13065a;
    }
}
