package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.l */
public final class C4989l implements C3657a {

    /* renamed from: a */
    private final ConstraintLayout f13113a;

    private C4989l(ConstraintLayout constraintLayout) {
        this.f13113a = constraintLayout;
    }

    /* renamed from: a */
    public static C4989l m19980a(LayoutInflater layoutInflater) {
        return m19981a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C4989l m19981a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_splash, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19982a(inflate);
    }

    /* renamed from: a */
    public static C4989l m19982a(View view) {
        if (view != null) {
            return new C4989l((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: b */
    public ConstraintLayout m19984b() {
        return this.f13113a;
    }
}
