package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p298ui.widgets.filter.FilterView;

/* renamed from: io.stashteam.stashapp.c.u */
public final class C5004u implements C3657a {

    /* renamed from: a */
    private final LinearLayout f13177a;

    /* renamed from: b */
    public final MaterialButton f13178b;

    /* renamed from: c */
    public final FilterView f13179c;

    private C5004u(LinearLayout linearLayout, MaterialButton materialButton, FilterView filterView) {
        this.f13177a = linearLayout;
        this.f13178b = materialButton;
        this.f13179c = filterView;
    }

    /* renamed from: a */
    public static C5004u m20031a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20032a(inflate);
    }

    /* renamed from: a */
    public static C5004u m20032a(View view) {
        String str;
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.btn_apply);
        if (materialButton != null) {
            FilterView filterView = (FilterView) view.findViewById(R.id.filter_view);
            if (filterView != null) {
                return new C5004u((LinearLayout) view, materialButton, filterView);
            }
            str = "filterView";
        } else {
            str = "btnApply";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public LinearLayout m20034b() {
        return this.f13177a;
    }
}
