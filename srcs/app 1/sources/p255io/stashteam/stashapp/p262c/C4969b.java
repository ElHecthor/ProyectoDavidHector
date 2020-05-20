package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p298ui.game.detail.blocks.custom_lists.CustomListsBlock;
import p255io.stashteam.stashapp.p298ui.game.detail.blocks.genres.GenresBlock;
import p255io.stashteam.stashapp.p298ui.game.detail.blocks.info_items.InfoItemsBlock;
import p255io.stashteam.stashapp.p298ui.game.detail.blocks.own_review.OwnReviewBlock;
import p255io.stashteam.stashapp.p298ui.game.detail.blocks.status_buttons.StatusButtonsBlock;
import p255io.stashteam.stashapp.p298ui.widgets.stats.StatsView;

/* renamed from: io.stashteam.stashapp.c.b */
public final class C4969b implements C3657a {

    /* renamed from: a */
    private final CoordinatorLayout f12977a;

    /* renamed from: b */
    public final CustomListsBlock f12978b;

    /* renamed from: c */
    public final GenresBlock f12979c;

    /* renamed from: d */
    public final InfoItemsBlock f12980d;

    /* renamed from: e */
    public final OwnReviewBlock f12981e;

    /* renamed from: f */
    public final StatusButtonsBlock f12982f;

    /* renamed from: g */
    public final NestedScrollView f12983g;

    /* renamed from: h */
    public final AppCompatImageButton f12984h;

    /* renamed from: i */
    public final AppCompatImageButton f12985i;

    /* renamed from: j */
    public final AppCompatImageView f12986j;

    /* renamed from: k */
    public final ConstraintLayout f12987k;

    /* renamed from: l */
    public final Flow f12988l;

    /* renamed from: m */
    public final LinearLayout f12989m;

    /* renamed from: n */
    public final LinearLayout f12990n;

    /* renamed from: o */
    public final ProgressBar f12991o;

    /* renamed from: p */
    public final RecyclerView f12992p;

    /* renamed from: q */
    public final AppCompatTextView f12993q;

    /* renamed from: r */
    public final AppCompatTextView f12994r;

    /* renamed from: s */
    public final MaterialTextView f12995s;

    /* renamed from: t */
    public final StatsView f12996t;

    /* renamed from: u */
    public final StatsView f12997u;

    /* renamed from: v */
    public final StatsView f12998v;

    /* renamed from: w */
    public final StatsView f12999w;

    private C4969b(CoordinatorLayout coordinatorLayout, CustomListsBlock customListsBlock, GenresBlock genresBlock, InfoItemsBlock infoItemsBlock, OwnReviewBlock ownReviewBlock, StatusButtonsBlock statusButtonsBlock, NestedScrollView nestedScrollView, AppCompatImageButton appCompatImageButton, AppCompatImageButton appCompatImageButton2, MaterialCardView materialCardView, CoordinatorLayout coordinatorLayout2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, Flow flow, LinearLayout linearLayout, LinearLayout linearLayout2, ProgressBar progressBar, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MaterialTextView materialTextView, StatsView statsView, StatsView statsView2, StatsView statsView3, StatsView statsView4) {
        this.f12977a = coordinatorLayout;
        this.f12978b = customListsBlock;
        this.f12979c = genresBlock;
        this.f12980d = infoItemsBlock;
        this.f12981e = ownReviewBlock;
        this.f12982f = statusButtonsBlock;
        this.f12983g = nestedScrollView;
        this.f12984h = appCompatImageButton;
        this.f12985i = appCompatImageButton2;
        this.f12986j = appCompatImageView;
        this.f12987k = constraintLayout;
        this.f12988l = flow;
        this.f12989m = linearLayout;
        this.f12990n = linearLayout2;
        this.f12991o = progressBar;
        this.f12992p = recyclerView;
        this.f12993q = appCompatTextView;
        this.f12994r = appCompatTextView2;
        this.f12995s = materialTextView;
        this.f12996t = statsView;
        this.f12997u = statsView2;
        this.f12998v = statsView3;
        this.f12999w = statsView4;
    }

    /* renamed from: a */
    public static C4969b m19893a(LayoutInflater layoutInflater) {
        return m19894a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C4969b m19894a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_game_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19895a(inflate);
    }

    /* renamed from: a */
    public static C4969b m19895a(View view) {
        String str;
        View view2 = view;
        CustomListsBlock customListsBlock = (CustomListsBlock) view2.findViewById(R.id.block_custom_lists);
        if (customListsBlock != null) {
            GenresBlock genresBlock = (GenresBlock) view2.findViewById(R.id.block_genres);
            if (genresBlock != null) {
                InfoItemsBlock infoItemsBlock = (InfoItemsBlock) view2.findViewById(R.id.block_info_items);
                if (infoItemsBlock != null) {
                    OwnReviewBlock ownReviewBlock = (OwnReviewBlock) view2.findViewById(R.id.block_own_review);
                    if (ownReviewBlock != null) {
                        StatusButtonsBlock statusButtonsBlock = (StatusButtonsBlock) view2.findViewById(R.id.block_status_buttons);
                        if (statusButtonsBlock != null) {
                            NestedScrollView nestedScrollView = (NestedScrollView) view2.findViewById(R.id.bottom_sheet);
                            if (nestedScrollView != null) {
                                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) view2.findViewById(R.id.btn_back);
                                if (appCompatImageButton != null) {
                                    AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) view2.findViewById(R.id.btn_video);
                                    if (appCompatImageButton2 != null) {
                                        MaterialCardView materialCardView = (MaterialCardView) view2.findViewById(R.id.card_cover);
                                        if (materialCardView != null) {
                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view2.findViewById(R.id.coordinator_layout);
                                            if (coordinatorLayout != null) {
                                                AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(R.id.image_cover);
                                                if (appCompatImageView != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.layout_platforms);
                                                    if (constraintLayout != null) {
                                                        Flow flow = (Flow) view2.findViewById(R.id.layout_platforms_flow);
                                                        if (flow != null) {
                                                            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.layout_screenshots);
                                                            if (linearLayout != null) {
                                                                LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.layout_summary);
                                                                if (linearLayout2 != null) {
                                                                    ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.progress_bar);
                                                                    if (progressBar != null) {
                                                                        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.rv_screenshots);
                                                                        if (recyclerView != null) {
                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) view2.findViewById(R.id.text_name);
                                                                            if (appCompatTextView != null) {
                                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) view2.findViewById(R.id.text_release_date);
                                                                                if (appCompatTextView2 != null) {
                                                                                    MaterialTextView materialTextView = (MaterialTextView) view2.findViewById(R.id.text_summary);
                                                                                    if (materialTextView != null) {
                                                                                        StatsView statsView = (StatsView) view2.findViewById(R.id.view_stats_played);
                                                                                        if (statsView != null) {
                                                                                            StatsView statsView2 = (StatsView) view2.findViewById(R.id.view_stats_rating);
                                                                                            if (statsView2 != null) {
                                                                                                StatsView statsView3 = (StatsView) view2.findViewById(R.id.view_stats_reviews);
                                                                                                if (statsView3 != null) {
                                                                                                    StatsView statsView4 = (StatsView) view2.findViewById(R.id.view_stats_want);
                                                                                                    if (statsView4 != null) {
                                                                                                        C4969b bVar = new C4969b((CoordinatorLayout) view2, customListsBlock, genresBlock, infoItemsBlock, ownReviewBlock, statusButtonsBlock, nestedScrollView, appCompatImageButton, appCompatImageButton2, materialCardView, coordinatorLayout, appCompatImageView, constraintLayout, flow, linearLayout, linearLayout2, progressBar, recyclerView, appCompatTextView, appCompatTextView2, materialTextView, statsView, statsView2, statsView3, statsView4);
                                                                                                        return bVar;
                                                                                                    }
                                                                                                    str = "viewStatsWant";
                                                                                                } else {
                                                                                                    str = "viewStatsReviews";
                                                                                                }
                                                                                            } else {
                                                                                                str = "viewStatsRating";
                                                                                            }
                                                                                        } else {
                                                                                            str = "viewStatsPlayed";
                                                                                        }
                                                                                    } else {
                                                                                        str = "textSummary";
                                                                                    }
                                                                                } else {
                                                                                    str = "textReleaseDate";
                                                                                }
                                                                            } else {
                                                                                str = "textName";
                                                                            }
                                                                        } else {
                                                                            str = "rvScreenshots";
                                                                        }
                                                                    } else {
                                                                        str = "progressBar";
                                                                    }
                                                                } else {
                                                                    str = "layoutSummary";
                                                                }
                                                            } else {
                                                                str = "layoutScreenshots";
                                                            }
                                                        } else {
                                                            str = "layoutPlatformsFlow";
                                                        }
                                                    } else {
                                                        str = "layoutPlatforms";
                                                    }
                                                } else {
                                                    str = "imageCover";
                                                }
                                            } else {
                                                str = "coordinatorLayout";
                                            }
                                        } else {
                                            str = "cardCover";
                                        }
                                    } else {
                                        str = "btnVideo";
                                    }
                                } else {
                                    str = "btnBack";
                                }
                            } else {
                                str = "bottomSheet";
                            }
                        } else {
                            str = "blockStatusButtons";
                        }
                    } else {
                        str = "blockOwnReview";
                    }
                } else {
                    str = "blockInfoItems";
                }
            } else {
                str = "blockGenres";
            }
        } else {
            str = "blockCustomLists";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public CoordinatorLayout m19897b() {
        return this.f12977a;
    }
}
