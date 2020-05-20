package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p298ui.widgets.select_group.SelectGroup;

/* renamed from: io.stashteam.stashapp.c.t */
public final class C5003t implements C3657a {

    /* renamed from: a */
    private final LinearLayout f13171a;

    /* renamed from: b */
    public final MaterialButton f13172b;

    /* renamed from: c */
    public final TextInputEditText f13173c;

    /* renamed from: d */
    public final TextInputEditText f13174d;

    /* renamed from: e */
    public final AppCompatImageButton f13175e;

    /* renamed from: f */
    public final SelectGroup f13176f;

    private C5003t(LinearLayout linearLayout, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, AppCompatImageButton appCompatImageButton, SelectGroup selectGroup) {
        this.f13171a = linearLayout;
        this.f13172b = materialButton;
        this.f13173c = textInputEditText;
        this.f13174d = textInputEditText2;
        this.f13175e = appCompatImageButton;
        this.f13176f = selectGroup;
    }

    /* renamed from: a */
    public static C5003t m20027a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_custom_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20028a(inflate);
    }

    /* renamed from: a */
    public static C5003t m20028a(View view) {
        String str;
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.btn_save);
        if (materialButton != null) {
            TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(R.id.field_description);
            if (textInputEditText != null) {
                TextInputEditText textInputEditText2 = (TextInputEditText) view.findViewById(R.id.field_title);
                if (textInputEditText2 != null) {
                    AppCompatImageButton appCompatImageButton = (AppCompatImageButton) view.findViewById(R.id.image_lock);
                    if (appCompatImageButton != null) {
                        SelectGroup selectGroup = (SelectGroup) view.findViewById(R.id.select_group);
                        if (selectGroup != null) {
                            C5003t tVar = new C5003t((LinearLayout) view, materialButton, textInputEditText, textInputEditText2, appCompatImageButton, selectGroup);
                            return tVar;
                        }
                        str = "selectGroup";
                    } else {
                        str = "imageLock";
                    }
                } else {
                    str = "fieldTitle";
                }
            } else {
                str = "fieldDescription";
            }
        } else {
            str = "btnSave";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public LinearLayout m20030b() {
        return this.f13171a;
    }
}
