package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.f */
public final class C4977f implements C3657a {

    /* renamed from: a */
    private final ConstraintLayout f13046a;

    /* renamed from: b */
    public final MaterialButton f13047b;

    /* renamed from: c */
    public final MaterialButton f13048c;

    /* renamed from: d */
    public final ViewPager2 f13049d;

    private C4977f(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ViewPager2 viewPager2) {
        this.f13046a = constraintLayout;
        this.f13047b = materialButton;
        this.f13048c = materialButton2;
        this.f13049d = viewPager2;
    }

    /* renamed from: a */
    public static C4977f m19929a(LayoutInflater layoutInflater) {
        return m19930a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C4977f m19930a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_onboarding_v1, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19931a(inflate);
    }

    /* renamed from: a */
    public static C4977f m19931a(View view) {
        String str;
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.btn_next);
        if (materialButton != null) {
            MaterialButton materialButton2 = (MaterialButton) view.findViewById(R.id.btn_skip);
            if (materialButton2 != null) {
                ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.view_pager);
                if (viewPager2 != null) {
                    return new C4977f((ConstraintLayout) view, materialButton, materialButton2, viewPager2);
                }
                str = "viewPager";
            } else {
                str = "btnSkip";
            }
        } else {
            str = "btnNext";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public ConstraintLayout m19933b() {
        return this.f13046a;
    }
}
