package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.o0 */
public final class C4996o0 implements C3657a {

    /* renamed from: a */
    private final View f13134a;

    /* renamed from: b */
    public final View f13135b;

    /* renamed from: c */
    public final View f13136c;

    /* renamed from: d */
    public final AppCompatImageView f13137d;

    /* renamed from: e */
    public final AppCompatTextView f13138e;

    /* renamed from: f */
    public final AppCompatTextView f13139f;

    private C4996o0(View view, View view2, View view3, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f13134a = view;
        this.f13135b = view2;
        this.f13136c = view3;
        this.f13137d = appCompatImageView;
        this.f13138e = appCompatTextView;
        this.f13139f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C4996o0 m20005a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.view_setting_item, viewGroup);
            return m20006a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C4996o0 m20006a(View view) {
        String str;
        View findViewById = view.findViewById(R.id.divider_bottom);
        if (findViewById != null) {
            View findViewById2 = view.findViewById(R.id.divider_top);
            if (findViewById2 != null) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_left_icon);
                if (appCompatImageView != null) {
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.img_arrow);
                    if (appCompatImageView2 != null) {
                        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_title);
                        if (appCompatTextView != null) {
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.text_value);
                            if (appCompatTextView2 != null) {
                                C4996o0 o0Var = new C4996o0(view, findViewById, findViewById2, appCompatImageView, appCompatImageView2, appCompatTextView, appCompatTextView2);
                                return o0Var;
                            }
                            str = "textValue";
                        } else {
                            str = "textTitle";
                        }
                    } else {
                        str = "imgArrow";
                    }
                } else {
                    str = "imageLeftIcon";
                }
            } else {
                str = "dividerTop";
            }
        } else {
            str = "dividerBottom";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public View mo11568b() {
        return this.f13134a;
    }
}
