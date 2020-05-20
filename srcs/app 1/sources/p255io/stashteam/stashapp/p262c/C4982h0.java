package p255io.stashteam.stashapp.p262c;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.h0 */
public final class C4982h0 implements C3657a {

    /* renamed from: a */
    private final AppBarLayout f13063a;

    /* renamed from: b */
    public final Toolbar f13064b;

    private C4982h0(AppBarLayout appBarLayout, Toolbar toolbar) {
        this.f13063a = appBarLayout;
        this.f13064b = toolbar;
    }

    /* renamed from: a */
    public static C4982h0 m19952a(View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        if (toolbar != null) {
            return new C4982h0((AppBarLayout) view, toolbar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat("toolbar"));
    }

    /* renamed from: b */
    public AppBarLayout m19954b() {
        return this.f13063a;
    }
}
