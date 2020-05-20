package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p298ui.widgets.rate.RateView;

/* renamed from: io.stashteam.stashapp.c.v */
public final class C5005v implements C3657a {

    /* renamed from: a */
    private final LinearLayout f13180a;

    /* renamed from: b */
    public final MaterialButton f13181b;

    /* renamed from: c */
    public final Chip f13182c;

    /* renamed from: d */
    public final ChipGroup f13183d;

    /* renamed from: e */
    public final Chip f13184e;

    /* renamed from: f */
    public final Chip f13185f;

    /* renamed from: g */
    public final TextInputEditText f13186g;

    /* renamed from: h */
    public final RateView f13187h;

    /* renamed from: i */
    public final AppCompatTextView f13188i;

    /* renamed from: j */
    public final AppCompatTextView f13189j;

    private C5005v(LinearLayout linearLayout, MaterialButton materialButton, Chip chip, ChipGroup chipGroup, Chip chip2, Chip chip3, TextInputEditText textInputEditText, RateView rateView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f13180a = linearLayout;
        this.f13181b = materialButton;
        this.f13182c = chip;
        this.f13183d = chipGroup;
        this.f13184e = chip2;
        this.f13185f = chip3;
        this.f13186g = textInputEditText;
        this.f13187h = rateView;
        this.f13188i = appCompatTextView;
        this.f13189j = appCompatTextView2;
    }

    /* renamed from: a */
    public static C5005v m20035a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_review_game, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20036a(inflate);
    }

    /* renamed from: a */
    public static C5005v m20036a(View view) {
        String str;
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.btn_save);
        if (materialButton != null) {
            Chip chip = (Chip) view.findViewById(R.id.chip_completed);
            if (chip != null) {
                ChipGroup chipGroup = (ChipGroup) view.findViewById(R.id.chip_group);
                if (chipGroup != null) {
                    Chip chip2 = (Chip) view.findViewById(R.id.chip_played);
                    if (chip2 != null) {
                        Chip chip3 = (Chip) view.findViewById(R.id.chip_playing);
                        if (chip3 != null) {
                            TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(R.id.input_review);
                            if (textInputEditText != null) {
                                RateView rateView = (RateView) view.findViewById(R.id.rate_view);
                                if (rateView != null) {
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_name);
                                    if (appCompatTextView != null) {
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.text_release_date);
                                        if (appCompatTextView2 != null) {
                                            C5005v vVar = new C5005v((LinearLayout) view, materialButton, chip, chipGroup, chip2, chip3, textInputEditText, rateView, appCompatTextView, appCompatTextView2);
                                            return vVar;
                                        }
                                        str = "textReleaseDate";
                                    } else {
                                        str = "textName";
                                    }
                                } else {
                                    str = "rateView";
                                }
                            } else {
                                str = "inputReview";
                            }
                        } else {
                            str = "chipPlaying";
                        }
                    } else {
                        str = "chipPlayed";
                    }
                } else {
                    str = "chipGroup";
                }
            } else {
                str = "chipCompleted";
            }
        } else {
            str = "btnSave";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public LinearLayout m20038b() {
        return this.f13180a;
    }
}
