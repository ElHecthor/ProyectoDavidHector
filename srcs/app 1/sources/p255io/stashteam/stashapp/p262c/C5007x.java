package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p298ui.widgets.empty_view.EmptyView;
import p255io.stashteam.stashapp.p298ui.widgets.stats.StatsView;

/* renamed from: io.stashteam.stashapp.c.x */
public final class C5007x implements C3657a {

    /* renamed from: a */
    private final CoordinatorLayout f13199a;

    /* renamed from: b */
    public final AppBarLayout f13200b;

    /* renamed from: c */
    public final AppCompatImageButton f13201c;

    /* renamed from: d */
    public final EmptyView f13202d;

    /* renamed from: e */
    public final AppCompatImageView f13203e;

    /* renamed from: f */
    public final TabLayout f13204f;

    /* renamed from: g */
    public final AppCompatTextView f13205g;

    /* renamed from: h */
    public final ViewPager2 f13206h;

    /* renamed from: i */
    public final StatsView f13207i;

    /* renamed from: j */
    public final StatsView f13208j;

    /* renamed from: k */
    public final StatsView f13209k;

    /* renamed from: l */
    public final StatsView f13210l;

    private C5007x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, AppCompatImageButton appCompatImageButton, EmptyView emptyView, AppCompatImageView appCompatImageView, TabLayout tabLayout, AppCompatTextView appCompatTextView, ViewPager2 viewPager2, StatsView statsView, StatsView statsView2, StatsView statsView3, StatsView statsView4) {
        this.f13199a = coordinatorLayout;
        this.f13200b = appBarLayout;
        this.f13201c = appCompatImageButton;
        this.f13202d = emptyView;
        this.f13203e = appCompatImageView;
        this.f13204f = tabLayout;
        this.f13205g = appCompatTextView;
        this.f13206h = viewPager2;
        this.f13207i = statsView;
        this.f13208j = statsView2;
        this.f13209k = statsView3;
        this.f13210l = statsView4;
    }

    /* renamed from: a */
    public static C5007x m20043a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_profile, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20044a(inflate);
    }

    /* renamed from: a */
    public static C5007x m20044a(View view) {
        String str;
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        if (appBarLayout != null) {
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) view.findViewById(R.id.btn_settings);
            if (appCompatImageButton != null) {
                EmptyView emptyView = (EmptyView) view.findViewById(R.id.empty_view);
                if (emptyView != null) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_avatar);
                    if (appCompatImageView != null) {
                        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
                        if (tabLayout != null) {
                            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_username);
                            if (appCompatTextView != null) {
                                ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.view_pager);
                                if (viewPager2 != null) {
                                    StatsView statsView = (StatsView) view.findViewById(R.id.view_stats_place);
                                    if (statsView != null) {
                                        StatsView statsView2 = (StatsView) view.findViewById(R.id.view_stats_played);
                                        if (statsView2 != null) {
                                            StatsView statsView3 = (StatsView) view.findViewById(R.id.view_stats_playing);
                                            if (statsView3 != null) {
                                                StatsView statsView4 = (StatsView) view.findViewById(R.id.view_stats_want);
                                                if (statsView4 != null) {
                                                    C5007x xVar = new C5007x((CoordinatorLayout) view, appBarLayout, appCompatImageButton, emptyView, appCompatImageView, tabLayout, appCompatTextView, viewPager2, statsView, statsView2, statsView3, statsView4);
                                                    return xVar;
                                                }
                                                str = "viewStatsWant";
                                            } else {
                                                str = "viewStatsPlaying";
                                            }
                                        } else {
                                            str = "viewStatsPlayed";
                                        }
                                    } else {
                                        str = "viewStatsPlace";
                                    }
                                } else {
                                    str = "viewPager";
                                }
                            } else {
                                str = "textUsername";
                            }
                        } else {
                            str = "tabLayout";
                        }
                    } else {
                        str = "imageAvatar";
                    }
                } else {
                    str = "emptyView";
                }
            } else {
                str = "btnSettings";
            }
        } else {
            str = "appBarLayout";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public CoordinatorLayout m20046b() {
        return this.f13199a;
    }
}
