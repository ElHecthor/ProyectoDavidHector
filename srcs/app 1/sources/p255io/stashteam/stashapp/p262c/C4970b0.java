package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.b0 */
public final class C4970b0 implements C3657a {

    /* renamed from: a */
    private final MaterialCardView f13000a;

    /* renamed from: b */
    public final MaterialCardView f13001b;

    /* renamed from: c */
    public final AppCompatImageView f13002c;

    /* renamed from: d */
    public final AppCompatImageView f13003d;

    /* renamed from: e */
    public final AppCompatImageView f13004e;

    /* renamed from: f */
    public final MaterialTextView f13005f;

    /* renamed from: g */
    public final AppCompatTextView f13006g;

    /* renamed from: h */
    public final MaterialTextView f13007h;

    /* renamed from: i */
    public final MaterialTextView f13008i;

    private C4970b0(MaterialCardView materialCardView, MaterialCardView materialCardView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, MaterialTextView materialTextView, AppCompatTextView appCompatTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f13000a = materialCardView;
        this.f13001b = materialCardView2;
        this.f13002c = appCompatImageView;
        this.f13003d = appCompatImageView2;
        this.f13004e = appCompatImageView3;
        this.f13005f = materialTextView;
        this.f13006g = appCompatTextView;
        this.f13007h = materialTextView2;
        this.f13008i = materialTextView3;
    }

    /* renamed from: a */
    public static C4970b0 m19898a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_game, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19899a(inflate);
    }

    /* renamed from: a */
    public static C4970b0 m19899a(View view) {
        String str;
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(R.id.card_view);
        if (materialCardView != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_complete);
            if (appCompatImageView != null) {
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.image_cover);
                if (appCompatImageView2 != null) {
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(R.id.image_playing);
                    if (appCompatImageView3 != null) {
                        MaterialTextView materialTextView = (MaterialTextView) view.findViewById(R.id.text_dlc);
                        if (materialTextView != null) {
                            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_name);
                            if (appCompatTextView != null) {
                                MaterialTextView materialTextView2 = (MaterialTextView) view.findViewById(R.id.text_score);
                                if (materialTextView2 != null) {
                                    MaterialTextView materialTextView3 = (MaterialTextView) view.findViewById(R.id.text_status);
                                    if (materialTextView3 != null) {
                                        C4970b0 b0Var = new C4970b0((MaterialCardView) view, materialCardView, appCompatImageView, appCompatImageView2, appCompatImageView3, materialTextView, appCompatTextView, materialTextView2, materialTextView3);
                                        return b0Var;
                                    }
                                    str = "textStatus";
                                } else {
                                    str = "textScore";
                                }
                            } else {
                                str = "textName";
                            }
                        } else {
                            str = "textDlc";
                        }
                    } else {
                        str = "imagePlaying";
                    }
                } else {
                    str = "imageCover";
                }
            } else {
                str = "imageComplete";
            }
        } else {
            str = "cardView";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public MaterialCardView m19901b() {
        return this.f13000a;
    }
}
