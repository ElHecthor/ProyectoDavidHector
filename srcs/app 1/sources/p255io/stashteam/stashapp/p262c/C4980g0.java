package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.g0 */
public final class C4980g0 implements C3657a {

    /* renamed from: a */
    private final ConstraintLayout f13055a;

    /* renamed from: b */
    public final AppCompatImageView f13056b;

    /* renamed from: c */
    public final MaterialTextView f13057c;

    /* renamed from: d */
    public final MaterialTextView f13058d;

    /* renamed from: e */
    public final MaterialTextView f13059e;

    /* renamed from: f */
    public final MaterialTextView f13060f;

    private C4980g0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        this.f13055a = constraintLayout;
        this.f13056b = appCompatImageView;
        this.f13057c = materialTextView;
        this.f13058d = materialTextView2;
        this.f13059e = materialTextView3;
        this.f13060f = materialTextView4;
    }

    /* renamed from: a */
    public static C4980g0 m19943a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_user, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19944a(inflate);
    }

    /* renamed from: a */
    public static C4980g0 m19944a(View view) {
        String str;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_avatar);
        if (appCompatImageView != null) {
            MaterialTextView materialTextView = (MaterialTextView) view.findViewById(R.id.text_name);
            if (materialTextView != null) {
                MaterialTextView materialTextView2 = (MaterialTextView) view.findViewById(R.id.text_nickname);
                if (materialTextView2 != null) {
                    MaterialTextView materialTextView3 = (MaterialTextView) view.findViewById(R.id.text_place);
                    if (materialTextView3 != null) {
                        MaterialTextView materialTextView4 = (MaterialTextView) view.findViewById(R.id.text_points);
                        if (materialTextView4 != null) {
                            C4980g0 g0Var = new C4980g0((ConstraintLayout) view, appCompatImageView, materialTextView, materialTextView2, materialTextView3, materialTextView4);
                            return g0Var;
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
            str = "imageAvatar";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public ConstraintLayout m19946b() {
        return this.f13055a;
    }
}
