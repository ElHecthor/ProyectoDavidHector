package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.p0 */
public final class C4998p0 implements C3657a {

    /* renamed from: a */
    private final View f13146a;

    /* renamed from: b */
    public final AppCompatImageView f13147b;

    /* renamed from: c */
    public final MaterialTextView f13148c;

    /* renamed from: d */
    public final MaterialTextView f13149d;

    private C4998p0(View view, Barrier barrier, AppCompatImageView appCompatImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f13146a = view;
        this.f13147b = appCompatImageView;
        this.f13148c = materialTextView;
        this.f13149d = materialTextView2;
    }

    /* renamed from: a */
    public static C4998p0 m20011a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.view_stats, viewGroup);
            return m20012a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C4998p0 m20012a(View view) {
        String str;
        Barrier barrier = (Barrier) view.findViewById(R.id.barrier);
        if (barrier != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_left_icon);
            if (appCompatImageView != null) {
                MaterialTextView materialTextView = (MaterialTextView) view.findViewById(R.id.text_title);
                if (materialTextView != null) {
                    MaterialTextView materialTextView2 = (MaterialTextView) view.findViewById(R.id.text_value);
                    if (materialTextView2 != null) {
                        C4998p0 p0Var = new C4998p0(view, barrier, appCompatImageView, materialTextView, materialTextView2);
                        return p0Var;
                    }
                    str = "textValue";
                } else {
                    str = "textTitle";
                }
            } else {
                str = "imageLeftIcon";
            }
        } else {
            str = "barrier";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public View mo11568b() {
        return this.f13146a;
    }
}
