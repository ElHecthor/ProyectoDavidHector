package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.m0 */
public final class C4992m0 implements C3657a {

    /* renamed from: a */
    private final View f13120a;

    /* renamed from: b */
    public final AppCompatImageView f13121b;

    /* renamed from: c */
    public final AppCompatImageView f13122c;

    /* renamed from: d */
    public final AppCompatTextView f13123d;

    /* renamed from: e */
    public final MaterialTextView f13124e;

    private C4992m0(View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, MaterialTextView materialTextView) {
        this.f13120a = view;
        this.f13121b = appCompatImageView;
        this.f13122c = appCompatImageView2;
        this.f13123d = appCompatTextView;
        this.f13124e = materialTextView;
    }

    /* renamed from: a */
    public static C4992m0 m19993a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.view_info_item, viewGroup);
            return m19994a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C4992m0 m19994a(View view) {
        String str;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_arrow);
        if (appCompatImageView != null) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.image_left_icon);
            if (appCompatImageView2 != null) {
                AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_subtitle);
                if (appCompatTextView != null) {
                    MaterialTextView materialTextView = (MaterialTextView) view.findViewById(R.id.text_title);
                    if (materialTextView != null) {
                        C4992m0 m0Var = new C4992m0(view, appCompatImageView, appCompatImageView2, appCompatTextView, materialTextView);
                        return m0Var;
                    }
                    str = "textTitle";
                } else {
                    str = "textSubtitle";
                }
            } else {
                str = "imageLeftIcon";
            }
        } else {
            str = "imageArrow";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public View mo11568b() {
        return this.f13120a;
    }
}
