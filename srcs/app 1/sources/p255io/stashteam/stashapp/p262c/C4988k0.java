package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appyvet.materialrangebar.RangeBar;
import com.google.android.material.chip.ChipGroup;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.k0 */
public final class C4988k0 implements C3657a {

    /* renamed from: a */
    private final View f13101a;

    /* renamed from: b */
    public final ChipGroup f13102b;

    /* renamed from: c */
    public final ChipGroup f13103c;

    /* renamed from: d */
    public final ChipGroup f13104d;

    /* renamed from: e */
    public final ChipGroup f13105e;

    /* renamed from: f */
    public final LinearLayout f13106f;

    /* renamed from: g */
    public final LinearLayout f13107g;

    /* renamed from: h */
    public final LinearLayout f13108h;

    /* renamed from: i */
    public final ConstraintLayout f13109i;

    /* renamed from: j */
    public final RangeBar f13110j;

    /* renamed from: k */
    public final AppCompatTextView f13111k;

    /* renamed from: l */
    public final AppCompatTextView f13112l;

    private C4988k0(View view, ChipGroup chipGroup, ChipGroup chipGroup2, ChipGroup chipGroup3, ChipGroup chipGroup4, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ConstraintLayout constraintLayout, RangeBar rangeBar, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f13101a = view;
        this.f13102b = chipGroup;
        this.f13103c = chipGroup2;
        this.f13104d = chipGroup3;
        this.f13105e = chipGroup4;
        this.f13106f = linearLayout;
        this.f13107g = linearLayout2;
        this.f13108h = linearLayout3;
        this.f13109i = constraintLayout;
        this.f13110j = rangeBar;
        this.f13111k = appCompatTextView;
        this.f13112l = appCompatTextView2;
    }

    /* renamed from: a */
    public static C4988k0 m19977a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.view_filter, viewGroup);
            return m19978a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C4988k0 m19978a(View view) {
        String str;
        ChipGroup chipGroup = (ChipGroup) view.findViewById(R.id.chip_group_general);
        if (chipGroup != null) {
            ChipGroup chipGroup2 = (ChipGroup) view.findViewById(R.id.chip_group_genres);
            if (chipGroup2 != null) {
                ChipGroup chipGroup3 = (ChipGroup) view.findViewById(R.id.chip_group_platforms);
                if (chipGroup3 != null) {
                    ChipGroup chipGroup4 = (ChipGroup) view.findViewById(R.id.chip_group_sort);
                    if (chipGroup4 != null) {
                        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_genres);
                        if (linearLayout != null) {
                            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.layout_platforms);
                            if (linearLayout2 != null) {
                                LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.layout_sorting);
                                if (linearLayout3 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.layout_years);
                                    if (constraintLayout != null) {
                                        RangeBar rangeBar = (RangeBar) view.findViewById(R.id.rangebar_years);
                                        if (rangeBar != null) {
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_year_end);
                                            if (appCompatTextView != null) {
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.text_year_start);
                                                if (appCompatTextView2 != null) {
                                                    C4988k0 k0Var = new C4988k0(view, chipGroup, chipGroup2, chipGroup3, chipGroup4, linearLayout, linearLayout2, linearLayout3, constraintLayout, rangeBar, appCompatTextView, appCompatTextView2);
                                                    return k0Var;
                                                }
                                                str = "textYearStart";
                                            } else {
                                                str = "textYearEnd";
                                            }
                                        } else {
                                            str = "rangebarYears";
                                        }
                                    } else {
                                        str = "layoutYears";
                                    }
                                } else {
                                    str = "layoutSorting";
                                }
                            } else {
                                str = "layoutPlatforms";
                            }
                        } else {
                            str = "layoutGenres";
                        }
                    } else {
                        str = "chipGroupSort";
                    }
                } else {
                    str = "chipGroupPlatforms";
                }
            } else {
                str = "chipGroupGenres";
            }
        } else {
            str = "chipGroupGeneral";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public View mo11568b() {
        return this.f13101a;
    }
}
