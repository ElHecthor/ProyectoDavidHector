package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.a0 */
public final class C4968a0 implements C3657a {

    /* renamed from: a */
    private final MaterialCardView f12971a;

    /* renamed from: b */
    public final MaterialCardView f12972b;

    /* renamed from: c */
    public final AppCompatImageView f12973c;

    /* renamed from: d */
    public final ConstraintLayout f12974d;

    /* renamed from: e */
    public final AppCompatTextView f12975e;

    /* renamed from: f */
    public final AppCompatTextView f12976f;

    private C4968a0(MaterialCardView materialCardView, MaterialCardView materialCardView2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f12971a = materialCardView;
        this.f12972b = materialCardView2;
        this.f12973c = appCompatImageView;
        this.f12974d = constraintLayout;
        this.f12975e = appCompatTextView;
        this.f12976f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C4968a0 m19889a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_custom_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19890a(inflate);
    }

    /* renamed from: a */
    public static C4968a0 m19890a(View view) {
        String str;
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(R.id.card);
        if (materialCardView != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_lock);
            if (appCompatImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.layout_main);
                if (constraintLayout != null) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_count);
                    if (appCompatTextView != null) {
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.text_title);
                        if (appCompatTextView2 != null) {
                            C4968a0 a0Var = new C4968a0((MaterialCardView) view, materialCardView, appCompatImageView, constraintLayout, appCompatTextView, appCompatTextView2);
                            return a0Var;
                        }
                        str = "textTitle";
                    } else {
                        str = "textCount";
                    }
                } else {
                    str = "layoutMain";
                }
            } else {
                str = "imageLock";
            }
        } else {
            str = "card";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public MaterialCardView m19892b() {
        return this.f12971a;
    }
}
