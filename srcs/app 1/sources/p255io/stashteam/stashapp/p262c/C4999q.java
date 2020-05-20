package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.q */
public final class C4999q implements C3657a {

    /* renamed from: a */
    private final View f13150a;

    /* renamed from: b */
    public final AppCompatImageView f13151b;

    /* renamed from: c */
    public final AppCompatImageView f13152c;

    /* renamed from: d */
    public final AppCompatRatingBar f13153d;

    /* renamed from: e */
    public final AppCompatTextView f13154e;

    /* renamed from: f */
    public final AppCompatTextView f13155f;

    private C4999q(View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatRatingBar appCompatRatingBar, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f13150a = view;
        this.f13151b = appCompatImageView;
        this.f13152c = appCompatImageView2;
        this.f13153d = appCompatRatingBar;
        this.f13154e = appCompatTextView;
        this.f13155f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C4999q m20014a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.block_own_review, viewGroup);
            return m20015a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C4999q m20015a(View view) {
        String str;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_avatar);
        if (appCompatImageView != null) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.image_complete);
            if (appCompatImageView2 != null) {
                AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) view.findViewById(R.id.rating_bar);
                if (appCompatRatingBar != null) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_review);
                    if (appCompatTextView != null) {
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.text_user_name);
                        if (appCompatTextView2 != null) {
                            C4999q qVar = new C4999q(view, appCompatImageView, appCompatImageView2, appCompatRatingBar, appCompatTextView, appCompatTextView2);
                            return qVar;
                        }
                        str = "textUserName";
                    } else {
                        str = "textReview";
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
    public View mo11568b() {
        return this.f13150a;
    }
}
