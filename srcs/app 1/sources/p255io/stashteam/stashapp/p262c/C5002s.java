package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.s */
public final class C5002s implements C3657a {

    /* renamed from: a */
    private final LinearLayout f13169a;

    /* renamed from: b */
    public final C4984i0 f13170b;

    private C5002s(LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatTextView appCompatTextView, C4984i0 i0Var) {
        this.f13169a = linearLayout;
        this.f13170b = i0Var;
    }

    /* renamed from: a */
    public static C5002s m20023a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_add_to_custom_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20024a(inflate);
    }

    /* renamed from: a */
    public static C5002s m20024a(View view) {
        String str;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_content);
        if (linearLayout != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_title);
            if (appCompatTextView != null) {
                View findViewById = view.findViewById(R.id.view_custom_list);
                if (findViewById != null) {
                    return new C5002s((LinearLayout) view, linearLayout, appCompatTextView, C4984i0.m19961a(findViewById));
                }
                str = "viewCustomList";
            } else {
                str = "textTitle";
            }
        } else {
            str = "layoutContent";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public LinearLayout m20026b() {
        return this.f13169a;
    }
}
