package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p298ui.widgets.empty_view.EmptyView;

/* renamed from: io.stashteam.stashapp.c.a */
public final class C4967a implements C3657a {

    /* renamed from: a */
    private final CoordinatorLayout f12961a;

    /* renamed from: b */
    public final LinearLayout f12962b;

    /* renamed from: c */
    public final AppCompatImageButton f12963c;

    /* renamed from: d */
    public final AppCompatImageButton f12964d;

    /* renamed from: e */
    public final EmptyView f12965e;

    /* renamed from: f */
    public final ProgressBar f12966f;

    /* renamed from: g */
    public final RecyclerView f12967g;

    /* renamed from: h */
    public final AppCompatTextView f12968h;

    /* renamed from: i */
    public final AppCompatTextView f12969i;

    /* renamed from: j */
    public final AppCompatTextView f12970j;

    private C4967a(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, AppCompatImageButton appCompatImageButton, AppCompatImageButton appCompatImageButton2, EmptyView emptyView, ProgressBar progressBar, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.f12961a = coordinatorLayout;
        this.f12962b = linearLayout;
        this.f12963c = appCompatImageButton;
        this.f12964d = appCompatImageButton2;
        this.f12965e = emptyView;
        this.f12966f = progressBar;
        this.f12967g = recyclerView;
        this.f12968h = appCompatTextView;
        this.f12969i = appCompatTextView2;
        this.f12970j = appCompatTextView3;
    }

    /* renamed from: a */
    public static C4967a m19884a(LayoutInflater layoutInflater) {
        return m19885a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C4967a m19885a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_custom_list_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19886a(inflate);
    }

    /* renamed from: a */
    public static C4967a m19886a(View view) {
        String str;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bottom_sheet);
        if (linearLayout != null) {
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) view.findViewById(R.id.btn_delete);
            if (appCompatImageButton != null) {
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) view.findViewById(R.id.btn_edit);
                if (appCompatImageButton2 != null) {
                    EmptyView emptyView = (EmptyView) view.findViewById(R.id.empty_view);
                    if (emptyView != null) {
                        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
                        if (progressBar != null) {
                            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
                            if (recyclerView != null) {
                                AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_count);
                                if (appCompatTextView != null) {
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.text_description);
                                    if (appCompatTextView2 != null) {
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) view.findViewById(R.id.text_title);
                                        if (appCompatTextView3 != null) {
                                            C4967a aVar = new C4967a((CoordinatorLayout) view, linearLayout, appCompatImageButton, appCompatImageButton2, emptyView, progressBar, recyclerView, appCompatTextView, appCompatTextView2, appCompatTextView3);
                                            return aVar;
                                        }
                                        str = "textTitle";
                                    } else {
                                        str = "textDescription";
                                    }
                                } else {
                                    str = "textCount";
                                }
                            } else {
                                str = "recyclerView";
                            }
                        } else {
                            str = "progressBar";
                        }
                    } else {
                        str = "emptyView";
                    }
                } else {
                    str = "btnEdit";
                }
            } else {
                str = "btnDelete";
            }
        } else {
            str = "bottomSheet";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public CoordinatorLayout m19888b() {
        return this.f12961a;
    }
}
