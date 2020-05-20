package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.c0 */
public final class C4972c0 implements C3657a {

    /* renamed from: a */
    private final ConstraintLayout f13018a;

    /* renamed from: b */
    public final AppCompatImageView f13019b;

    /* renamed from: c */
    public final MaterialTextView f13020c;

    /* renamed from: d */
    public final MaterialTextView f13021d;

    private C4972c0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f13018a = constraintLayout;
        this.f13019b = appCompatImageView;
        this.f13020c = materialTextView;
        this.f13021d = materialTextView2;
    }

    /* renamed from: a */
    public static C4972c0 m19907a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_onboarding_page, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19908a(inflate);
    }

    /* renamed from: a */
    public static C4972c0 m19908a(View view) {
        String str;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_main);
        if (appCompatImageView != null) {
            MaterialTextView materialTextView = (MaterialTextView) view.findViewById(R.id.text_desc);
            if (materialTextView != null) {
                MaterialTextView materialTextView2 = (MaterialTextView) view.findViewById(R.id.text_title);
                if (materialTextView2 != null) {
                    return new C4972c0((ConstraintLayout) view, appCompatImageView, materialTextView, materialTextView2);
                }
                str = "textTitle";
            } else {
                str = "textDesc";
            }
        } else {
            str = "imageMain";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public ConstraintLayout m19910b() {
        return this.f13018a;
    }
}
