package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.e */
public final class C4975e implements C3657a {

    /* renamed from: a */
    private final RelativeLayout f13034a;

    /* renamed from: b */
    public final BottomNavigationView f13035b;

    private C4975e(RelativeLayout relativeLayout, BottomNavigationView bottomNavigationView, FragmentContainerView fragmentContainerView) {
        this.f13034a = relativeLayout;
        this.f13035b = bottomNavigationView;
    }

    /* renamed from: a */
    public static C4975e m19920a(LayoutInflater layoutInflater) {
        return m19921a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C4975e m19921a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19922a(inflate);
    }

    /* renamed from: a */
    public static C4975e m19922a(View view) {
        String str;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) view.findViewById(R.id.bottom_navigation);
        if (bottomNavigationView != null) {
            FragmentContainerView fragmentContainerView = (FragmentContainerView) view.findViewById(R.id.container);
            if (fragmentContainerView != null) {
                return new C4975e((RelativeLayout) view, bottomNavigationView, fragmentContainerView);
            }
            str = "container";
        } else {
            str = "bottomNavigation";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public RelativeLayout m19924b() {
        return this.f13034a;
    }
}
