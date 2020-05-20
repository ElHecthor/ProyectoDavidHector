package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.r */
public final class C5001r implements C3657a {

    /* renamed from: a */
    private final View f13163a;

    /* renamed from: b */
    public final MaterialButton f13164b;

    /* renamed from: c */
    public final MaterialButton f13165c;

    /* renamed from: d */
    public final AppCompatImageView f13166d;

    /* renamed from: e */
    public final ProgressBar f13167e;

    /* renamed from: f */
    public final View f13168f;

    private C5001r(View view, MaterialButton materialButton, MaterialButton materialButton2, AppCompatImageView appCompatImageView, ProgressBar progressBar, View view2) {
        this.f13163a = view;
        this.f13164b = materialButton;
        this.f13165c = materialButton2;
        this.f13166d = appCompatImageView;
        this.f13167e = progressBar;
        this.f13168f = view2;
    }

    /* renamed from: a */
    public static C5001r m20020a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.block_status_buttons, viewGroup);
            return m20021a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C5001r m20021a(View view) {
        String str;
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.btn_played);
        if (materialButton != null) {
            MaterialButton materialButton2 = (MaterialButton) view.findViewById(R.id.btn_want);
            if (materialButton2 != null) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_dots);
                if (appCompatImageView != null) {
                    ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
                    if (progressBar != null) {
                        View findViewById = view.findViewById(R.id.space_buttons);
                        if (findViewById != null) {
                            C5001r rVar = new C5001r(view, materialButton, materialButton2, appCompatImageView, progressBar, findViewById);
                            return rVar;
                        }
                        str = "spaceButtons";
                    } else {
                        str = "progressBar";
                    }
                } else {
                    str = "imageDots";
                }
            } else {
                str = "btnWant";
            }
        } else {
            str = "btnPlayed";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public View mo11568b() {
        return this.f13163a;
    }
}
