package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.y */
public final class C5008y implements C3657a {

    /* renamed from: a */
    private final FrameLayout f13211a;

    /* renamed from: b */
    public final TextInputLayout f13212b;

    /* renamed from: c */
    public final TextInputEditText f13213c;

    /* renamed from: d */
    public final LinearLayout f13214d;

    /* renamed from: e */
    public final ProgressBar f13215e;

    /* renamed from: f */
    public final RecyclerView f13216f;

    /* renamed from: g */
    public final MaterialTextView f13217g;

    /* renamed from: h */
    public final AppCompatTextView f13218h;

    private C5008y(FrameLayout frameLayout, TextInputLayout textInputLayout, TextInputEditText textInputEditText, LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView, MaterialTextView materialTextView, AppCompatTextView appCompatTextView) {
        this.f13211a = frameLayout;
        this.f13212b = textInputLayout;
        this.f13213c = textInputEditText;
        this.f13214d = linearLayout;
        this.f13215e = progressBar;
        this.f13216f = recyclerView;
        this.f13217g = materialTextView;
        this.f13218h = appCompatTextView;
    }

    /* renamed from: a */
    public static C5008y m20047a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20048a(inflate);
    }

    /* renamed from: a */
    public static C5008y m20048a(View view) {
        String str;
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.input_layout);
        if (textInputLayout != null) {
            TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(R.id.input_search);
            if (textInputEditText != null) {
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_content);
                if (linearLayout != null) {
                    ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
                    if (progressBar != null) {
                        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
                        if (recyclerView != null) {
                            MaterialTextView materialTextView = (MaterialTextView) view.findViewById(R.id.text_no_results);
                            if (materialTextView != null) {
                                AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_title);
                                if (appCompatTextView != null) {
                                    C5008y yVar = new C5008y((FrameLayout) view, textInputLayout, textInputEditText, linearLayout, progressBar, recyclerView, materialTextView, appCompatTextView);
                                    return yVar;
                                }
                                str = "textTitle";
                            } else {
                                str = "textNoResults";
                            }
                        } else {
                            str = "recyclerView";
                        }
                    } else {
                        str = "progressBar";
                    }
                } else {
                    str = "layoutContent";
                }
            } else {
                str = "inputSearch";
            }
        } else {
            str = "inputLayout";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public FrameLayout m20050b() {
        return this.f13211a;
    }
}
