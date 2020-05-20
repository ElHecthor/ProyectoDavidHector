package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.e0 */
public final class C4976e0 implements C3657a {

    /* renamed from: a */
    private final ConstraintLayout f13036a;

    /* renamed from: b */
    public final AppCompatImageView f13037b;

    /* renamed from: c */
    public final AppCompatImageView f13038c;

    /* renamed from: d */
    public final AppCompatRatingBar f13039d;

    /* renamed from: e */
    public final AppCompatTextView f13040e;

    /* renamed from: f */
    public final AppCompatTextView f13041f;

    /* renamed from: g */
    public final AppCompatTextView f13042g;

    /* renamed from: h */
    public final AppCompatTextView f13043h;

    /* renamed from: i */
    public final AppCompatTextView f13044i;

    /* renamed from: j */
    public final AppCompatTextView f13045j;

    private C4976e0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatRatingBar appCompatRatingBar, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6) {
        this.f13036a = constraintLayout;
        this.f13037b = appCompatImageView;
        this.f13038c = appCompatImageView2;
        this.f13039d = appCompatRatingBar;
        this.f13040e = appCompatTextView;
        this.f13041f = appCompatTextView2;
        this.f13042g = appCompatTextView3;
        this.f13043h = appCompatTextView4;
        this.f13044i = appCompatTextView5;
        this.f13045j = appCompatTextView6;
    }

    /* renamed from: a */
    public static C4976e0 m19925a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_review, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19926a(inflate);
    }

    /* renamed from: a */
    public static C4976e0 m19926a(View view) {
        String str;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_avatar);
        if (appCompatImageView != null) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.image_complete);
            if (appCompatImageView2 != null) {
                AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) view.findViewById(R.id.rating_bar);
                if (appCompatRatingBar != null) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_date);
                    if (appCompatTextView != null) {
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.text_emoji);
                        if (appCompatTextView2 != null) {
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) view.findViewById(R.id.text_nickname);
                            if (appCompatTextView3 != null) {
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) view.findViewById(R.id.text_review);
                                if (appCompatTextView4 != null) {
                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) view.findViewById(R.id.text_score);
                                    if (appCompatTextView5 != null) {
                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) view.findViewById(R.id.text_user_name);
                                        if (appCompatTextView6 != null) {
                                            C4976e0 e0Var = new C4976e0((ConstraintLayout) view, appCompatImageView, appCompatImageView2, appCompatRatingBar, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6);
                                            return e0Var;
                                        }
                                        str = "textUserName";
                                    } else {
                                        str = "textScore";
                                    }
                                } else {
                                    str = "textReview";
                                }
                            } else {
                                str = "textNickname";
                            }
                        } else {
                            str = "textEmoji";
                        }
                    } else {
                        str = "textDate";
                    }
                } else {
                    str = "ratingBar";
                }
            } else {
                str = "imageComplete";
            }
        } else {
            str = "imageAvatar";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public ConstraintLayout m19928b() {
        return this.f13036a;
    }
}
