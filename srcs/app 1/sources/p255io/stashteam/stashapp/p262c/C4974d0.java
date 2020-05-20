package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.d0 */
public final class C4974d0 implements C3657a {

    /* renamed from: a */
    private final AppCompatTextView f13032a;

    /* renamed from: b */
    public final AppCompatTextView f13033b;

    private C4974d0(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f13032a = appCompatTextView;
        this.f13033b = appCompatTextView2;
    }

    /* renamed from: a */
    public static C4974d0 m19916a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_rating_circle, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19917a(inflate);
    }

    /* renamed from: a */
    public static C4974d0 m19917a(View view) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_value);
        if (appCompatTextView != null) {
            return new C4974d0((AppCompatTextView) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat("textValue"));
    }

    /* renamed from: b */
    public AppCompatTextView m19919b() {
        return this.f13032a;
    }
}
