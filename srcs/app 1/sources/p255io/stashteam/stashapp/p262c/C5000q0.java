package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.q0 */
public final class C5000q0 implements C3657a {

    /* renamed from: a */
    private final View f13156a;

    /* renamed from: b */
    public final AppCompatImageView f13157b;

    /* renamed from: c */
    public final AppCompatImageView f13158c;

    /* renamed from: d */
    public final MaterialTextView f13159d;

    /* renamed from: e */
    public final MaterialTextView f13160e;

    /* renamed from: f */
    public final AppCompatTextView f13161f;

    /* renamed from: g */
    public final MaterialTextView f13162g;

    private C5000q0(View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, AppCompatTextView appCompatTextView, MaterialTextView materialTextView3) {
        this.f13156a = view;
        this.f13157b = appCompatImageView;
        this.f13158c = appCompatImageView2;
        this.f13159d = materialTextView;
        this.f13160e = materialTextView2;
        this.f13161f = appCompatTextView;
        this.f13162g = materialTextView3;
    }

    /* renamed from: a */
    public static C5000q0 m20017a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.view_top_user, viewGroup);
            return m20018a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C5000q0 m20018a(View view) {
        String str;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_avatar);
        if (appCompatImageView != null) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.image_wreath);
            if (appCompatImageView2 != null) {
                MaterialTextView materialTextView = (MaterialTextView) view.findViewById(R.id.text_name);
                if (materialTextView != null) {
                    MaterialTextView materialTextView2 = (MaterialTextView) view.findViewById(R.id.text_nickname);
                    if (materialTextView2 != null) {
                        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_place);
                        if (appCompatTextView != null) {
                            MaterialTextView materialTextView3 = (MaterialTextView) view.findViewById(R.id.text_points);
                            if (materialTextView3 != null) {
                                C5000q0 q0Var = new C5000q0(view, appCompatImageView, appCompatImageView2, materialTextView, materialTextView2, appCompatTextView, materialTextView3);
                                return q0Var;
                            }
                            str = "textPoints";
                        } else {
                            str = "textPlace";
                        }
                    } else {
                        str = "textNickname";
                    }
                } else {
                    str = "textName";
                }
            } else {
                str = "imageWreath";
            }
        } else {
            str = "imageAvatar";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public View mo11568b() {
        return this.f13156a;
    }
}
