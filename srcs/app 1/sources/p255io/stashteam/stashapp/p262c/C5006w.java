package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.emoji.widget.EmojiAppCompatTextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.card.MaterialCardView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p298ui.home.HorizontalListView;

/* renamed from: io.stashteam.stashapp.c.w */
public final class C5006w implements C3657a {

    /* renamed from: a */
    private final CoordinatorLayout f13190a;

    /* renamed from: b */
    public final MaterialCardView f13191b;

    /* renamed from: c */
    public final MaterialCardView f13192c;

    /* renamed from: d */
    public final NestedScrollView f13193d;

    /* renamed from: e */
    public final HorizontalListView f13194e;

    /* renamed from: f */
    public final HorizontalListView f13195f;

    /* renamed from: g */
    public final HorizontalListView f13196g;

    /* renamed from: h */
    public final SwipeRefreshLayout f13197h;

    /* renamed from: i */
    public final EmojiAppCompatTextView f13198i;

    private C5006w(CoordinatorLayout coordinatorLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, NestedScrollView nestedScrollView, HorizontalListView horizontalListView, HorizontalListView horizontalListView2, HorizontalListView horizontalListView3, SwipeRefreshLayout swipeRefreshLayout, EmojiAppCompatTextView emojiAppCompatTextView) {
        this.f13190a = coordinatorLayout;
        this.f13191b = materialCardView;
        this.f13192c = materialCardView2;
        this.f13193d = nestedScrollView;
        this.f13194e = horizontalListView;
        this.f13195f = horizontalListView2;
        this.f13196g = horizontalListView3;
        this.f13197h = swipeRefreshLayout;
        this.f13198i = emojiAppCompatTextView;
    }

    /* renamed from: a */
    public static C5006w m20039a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20040a(inflate);
    }

    /* renamed from: a */
    public static C5006w m20040a(View view) {
        String str;
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(R.id.card_feedback);
        if (materialCardView != null) {
            MaterialCardView materialCardView2 = (MaterialCardView) view.findViewById(R.id.card_top_rated);
            if (materialCardView2 != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.layout_home_content);
                if (nestedScrollView != null) {
                    HorizontalListView horizontalListView = (HorizontalListView) view.findViewById(R.id.list_view_anticipated);
                    if (horizontalListView != null) {
                        HorizontalListView horizontalListView2 = (HorizontalListView) view.findViewById(R.id.list_view_latest);
                        if (horizontalListView2 != null) {
                            HorizontalListView horizontalListView3 = (HorizontalListView) view.findViewById(R.id.list_view_upcoming);
                            if (horizontalListView3 != null) {
                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh);
                                if (swipeRefreshLayout != null) {
                                    EmojiAppCompatTextView emojiAppCompatTextView = (EmojiAppCompatTextView) view.findViewById(R.id.text_emoji);
                                    if (emojiAppCompatTextView != null) {
                                        C5006w wVar = new C5006w((CoordinatorLayout) view, materialCardView, materialCardView2, nestedScrollView, horizontalListView, horizontalListView2, horizontalListView3, swipeRefreshLayout, emojiAppCompatTextView);
                                        return wVar;
                                    }
                                    str = "textEmoji";
                                } else {
                                    str = "swipeRefresh";
                                }
                            } else {
                                str = "listViewUpcoming";
                            }
                        } else {
                            str = "listViewLatest";
                        }
                    } else {
                        str = "listViewAnticipated";
                    }
                } else {
                    str = "layoutHomeContent";
                }
            } else {
                str = "cardTopRated";
            }
        } else {
            str = "cardFeedback";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public CoordinatorLayout m20042b() {
        return this.f13190a;
    }
}
