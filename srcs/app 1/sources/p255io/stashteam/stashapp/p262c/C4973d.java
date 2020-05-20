package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p298ui.leaderboard.views.TopUserView;

/* renamed from: io.stashteam.stashapp.c.d */
public final class C4973d implements C3657a {

    /* renamed from: a */
    private final CoordinatorLayout f13022a;

    /* renamed from: b */
    public final LinearLayout f13023b;

    /* renamed from: c */
    public final AppCompatImageView f13024c;

    /* renamed from: d */
    public final ProgressBar f13025d;

    /* renamed from: e */
    public final RecyclerView f13026e;

    /* renamed from: f */
    public final MaterialTextView f13027f;

    /* renamed from: g */
    public final MaterialTextView f13028g;

    /* renamed from: h */
    public final TopUserView f13029h;

    /* renamed from: i */
    public final TopUserView f13030i;

    /* renamed from: j */
    public final TopUserView f13031j;

    private C4973d(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, MaterialCardView materialCardView, AppCompatImageView appCompatImageView, ProgressBar progressBar, ProgressBar progressBar2, RecyclerView recyclerView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, TopUserView topUserView, TopUserView topUserView2, TopUserView topUserView3) {
        this.f13022a = coordinatorLayout;
        this.f13023b = linearLayout;
        this.f13024c = appCompatImageView;
        this.f13025d = progressBar2;
        this.f13026e = recyclerView;
        this.f13027f = materialTextView3;
        this.f13028g = materialTextView4;
        this.f13029h = topUserView;
        this.f13030i = topUserView2;
        this.f13031j = topUserView3;
    }

    /* renamed from: a */
    public static C4973d m19911a(LayoutInflater layoutInflater) {
        return m19912a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C4973d m19912a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_leaderboard, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19913a(inflate);
    }

    /* renamed from: a */
    public static C4973d m19913a(View view) {
        String str;
        View view2 = view;
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.bottom_sheet);
        if (linearLayout != null) {
            MaterialCardView materialCardView = (MaterialCardView) view2.findViewById(R.id.card_your_score);
            if (materialCardView != null) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(R.id.image_avatar);
                if (appCompatImageView != null) {
                    ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.progress_bar);
                    if (progressBar != null) {
                        ProgressBar progressBar2 = (ProgressBar) view2.findViewById(R.id.progress_bar_top);
                        if (progressBar2 != null) {
                            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_view);
                            if (recyclerView != null) {
                                MaterialTextView materialTextView = (MaterialTextView) view2.findViewById(R.id.text_place_title);
                                if (materialTextView != null) {
                                    MaterialTextView materialTextView2 = (MaterialTextView) view2.findViewById(R.id.text_points_title);
                                    if (materialTextView2 != null) {
                                        MaterialTextView materialTextView3 = (MaterialTextView) view2.findViewById(R.id.text_your_place);
                                        if (materialTextView3 != null) {
                                            MaterialTextView materialTextView4 = (MaterialTextView) view2.findViewById(R.id.text_your_points);
                                            if (materialTextView4 != null) {
                                                TopUserView topUserView = (TopUserView) view2.findViewById(R.id.view_user_first);
                                                if (topUserView != null) {
                                                    TopUserView topUserView2 = (TopUserView) view2.findViewById(R.id.view_user_second);
                                                    if (topUserView2 != null) {
                                                        TopUserView topUserView3 = (TopUserView) view2.findViewById(R.id.view_user_third);
                                                        if (topUserView3 != null) {
                                                            C4973d dVar = new C4973d((CoordinatorLayout) view2, linearLayout, materialCardView, appCompatImageView, progressBar, progressBar2, recyclerView, materialTextView, materialTextView2, materialTextView3, materialTextView4, topUserView, topUserView2, topUserView3);
                                                            return dVar;
                                                        }
                                                        str = "viewUserThird";
                                                    } else {
                                                        str = "viewUserSecond";
                                                    }
                                                } else {
                                                    str = "viewUserFirst";
                                                }
                                            } else {
                                                str = "textYourPoints";
                                            }
                                        } else {
                                            str = "textYourPlace";
                                        }
                                    } else {
                                        str = "textPointsTitle";
                                    }
                                } else {
                                    str = "textPlaceTitle";
                                }
                            } else {
                                str = "recyclerView";
                            }
                        } else {
                            str = "progressBarTop";
                        }
                    } else {
                        str = "progressBar";
                    }
                } else {
                    str = "imageAvatar";
                }
            } else {
                str = "cardYourScore";
            }
        } else {
            str = "bottomSheet";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public CoordinatorLayout m19915b() {
        return this.f13022a;
    }
}
