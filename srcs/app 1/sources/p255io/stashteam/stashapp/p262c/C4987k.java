package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.k */
public final class C4987k implements C3657a {

    /* renamed from: a */
    private final ConstraintLayout f13095a;

    /* renamed from: b */
    public final MaterialButton f13096b;

    /* renamed from: c */
    public final MaterialButton f13097c;

    /* renamed from: d */
    public final MaterialButton f13098d;

    /* renamed from: e */
    public final ProgressBar f13099e;

    /* renamed from: f */
    public final AppCompatTextView f13100f;

    private C4987k(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, ProgressBar progressBar, AppCompatTextView appCompatTextView) {
        this.f13095a = constraintLayout;
        this.f13096b = materialButton;
        this.f13097c = materialButton2;
        this.f13098d = materialButton3;
        this.f13099e = progressBar;
        this.f13100f = appCompatTextView;
    }

    /* renamed from: a */
    public static C4987k m19972a(LayoutInflater layoutInflater) {
        return m19973a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C4987k m19973a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19974a(inflate);
    }

    /* renamed from: a */
    public static C4987k m19974a(View view) {
        String str;
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.btn_close);
        if (materialButton != null) {
            MaterialButton materialButton2 = (MaterialButton) view.findViewById(R.id.btn_facebook);
            if (materialButton2 != null) {
                MaterialButton materialButton3 = (MaterialButton) view.findViewById(R.id.btn_google);
                if (materialButton3 != null) {
                    ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
                    if (progressBar != null) {
                        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_agreement);
                        if (appCompatTextView != null) {
                            C4987k kVar = new C4987k((ConstraintLayout) view, materialButton, materialButton2, materialButton3, progressBar, appCompatTextView);
                            return kVar;
                        }
                        str = "textAgreement";
                    } else {
                        str = "progressBar";
                    }
                } else {
                    str = "btnGoogle";
                }
            } else {
                str = "btnFacebook";
            }
        } else {
            str = "btnClose";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public ConstraintLayout m19976b() {
        return this.f13095a;
    }
}
