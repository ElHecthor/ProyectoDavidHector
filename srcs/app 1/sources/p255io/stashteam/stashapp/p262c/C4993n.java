package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.chip.ChipGroup;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.n */
public final class C4993n implements C3657a {

    /* renamed from: a */
    private final View f13125a;

    /* renamed from: b */
    public final ChipGroup f13126b;

    /* renamed from: c */
    public final LinearLayout f13127c;

    private C4993n(View view, ChipGroup chipGroup, LinearLayout linearLayout) {
        this.f13125a = view;
        this.f13126b = chipGroup;
        this.f13127c = linearLayout;
    }

    /* renamed from: a */
    public static C4993n m19996a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.block_custom_lists, viewGroup);
            return m19997a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C4993n m19997a(View view) {
        String str;
        ChipGroup chipGroup = (ChipGroup) view.findViewById(R.id.chip_group);
        if (chipGroup != null) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_add);
            if (linearLayout != null) {
                return new C4993n(view, chipGroup, linearLayout);
            }
            str = "layoutAdd";
        } else {
            str = "chipGroup";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public View mo11568b() {
        return this.f13125a;
    }
}
