package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.m */
public final class C4991m implements C3657a {

    /* renamed from: a */
    private final CoordinatorLayout f13118a;

    /* renamed from: b */
    public final C4982h0 f13119b;

    private C4991m(CoordinatorLayout coordinatorLayout, C4982h0 h0Var, FragmentContainerView fragmentContainerView) {
        this.f13118a = coordinatorLayout;
        this.f13119b = h0Var;
    }

    /* renamed from: a */
    public static C4991m m19988a(LayoutInflater layoutInflater) {
        return m19989a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C4991m m19989a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_user_profile, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19990a(inflate);
    }

    /* renamed from: a */
    public static C4991m m19990a(View view) {
        String str;
        View findViewById = view.findViewById(R.id.appbar);
        if (findViewById != null) {
            C4982h0 a = C4982h0.m19952a(findViewById);
            FragmentContainerView fragmentContainerView = (FragmentContainerView) view.findViewById(R.id.container);
            if (fragmentContainerView != null) {
                return new C4991m((CoordinatorLayout) view, a, fragmentContainerView);
            }
            str = "container";
        } else {
            str = "appbar";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public CoordinatorLayout m19992b() {
        return this.f13118a;
    }
}
