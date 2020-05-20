package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.f0 */
public final class C4978f0 implements C3657a {

    /* renamed from: a */
    private final AppCompatImageView f13050a;

    /* renamed from: b */
    public final AppCompatImageView f13051b;

    private C4978f0(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f13050a = appCompatImageView;
        this.f13051b = appCompatImageView2;
    }

    /* renamed from: a */
    public static C4978f0 m19934a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_screenshot, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19935a(inflate);
    }

    /* renamed from: a */
    public static C4978f0 m19935a(View view) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_screenshot);
        if (appCompatImageView != null) {
            return new C4978f0((AppCompatImageView) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat("imageScreenshot"));
    }

    /* renamed from: b */
    public AppCompatImageView m19937b() {
        return this.f13050a;
    }
}
