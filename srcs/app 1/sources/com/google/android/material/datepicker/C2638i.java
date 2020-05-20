package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.C0425c;
import androidx.fragment.app.C0466s;
import androidx.fragment.app.Fragment;
import com.google.android.material.datepicker.C2614a.C2616b;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4409e;
import p147g.p156d.p157a.p185c.C4410f;
import p147g.p156d.p157a.p185c.C4412h;
import p147g.p156d.p157a.p185c.C4414j;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p196s.C4446a;
import p147g.p156d.p157a.p185c.p202y.C4458b;

/* renamed from: com.google.android.material.datepicker.i */
public final class C2638i<S> extends C0425c {

    /* renamed from: F0 */
    static final Object f7613F0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: G0 */
    static final Object f7614G0 = "CANCEL_BUTTON_TAG";

    /* renamed from: H0 */
    static final Object f7615H0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: A0 */
    private boolean f7616A0;

    /* renamed from: B0 */
    private TextView f7617B0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public CheckableImageButton f7618C0;

    /* renamed from: D0 */
    private C4382g f7619D0;
    /* access modifiers changed from: private */

    /* renamed from: E0 */
    public Button f7620E0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public final LinkedHashSet<C2643j<? super S>> f7621p0 = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public final LinkedHashSet<OnClickListener> f7622q0 = new LinkedHashSet<>();

    /* renamed from: r0 */
    private final LinkedHashSet<OnCancelListener> f7623r0 = new LinkedHashSet<>();

    /* renamed from: s0 */
    private final LinkedHashSet<OnDismissListener> f7624s0 = new LinkedHashSet<>();

    /* renamed from: t0 */
    private int f7625t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public C2620d<S> f7626u0;

    /* renamed from: v0 */
    private C2653p<S> f7627v0;

    /* renamed from: w0 */
    private C2614a f7628w0;

    /* renamed from: x0 */
    private C2625h<S> f7629x0;

    /* renamed from: y0 */
    private int f7630y0;

    /* renamed from: z0 */
    private CharSequence f7631z0;

    /* renamed from: com.google.android.material.datepicker.i$a */
    class C2639a implements OnClickListener {
        C2639a() {
        }

        public void onClick(View view) {
            Iterator it = C2638i.this.f7621p0.iterator();
            while (it.hasNext()) {
                ((C2643j) it.next()).mo8654a(C2638i.this.mo8649y0());
            }
            C2638i.this.mo2653s0();
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$b */
    class C2640b implements OnClickListener {
        C2640b() {
        }

        public void onClick(View view) {
            Iterator it = C2638i.this.f7622q0.iterator();
            while (it.hasNext()) {
                ((OnClickListener) it.next()).onClick(view);
            }
            C2638i.this.mo2653s0();
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$c */
    class C2641c implements C2652o<S> {
        C2641c() {
        }

        /* renamed from: a */
        public void mo8652a(S s) {
            Button button;
            boolean z;
            C2638i.this.m10883B0();
            if (C2638i.this.f7626u0.mo8623o()) {
                button = C2638i.this.f7620E0;
                z = true;
            } else {
                button = C2638i.this.f7620E0;
                z = false;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$d */
    class C2642d implements OnClickListener {
        C2642d() {
        }

        public void onClick(View view) {
            C2638i.this.f7618C0.toggle();
            C2638i iVar = C2638i.this;
            iVar.m10886a(iVar.f7618C0);
            C2638i.this.m10899z0();
        }
    }

    /* renamed from: A0 */
    public static long m10882A0() {
        return C2646l.m10917i().f7645l;
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m10883B0() {
        String x0 = mo8648x0();
        this.f7617B0.setContentDescription(String.format(mo2491a(C4414j.mtrl_picker_announce_current_selection), new Object[]{x0}));
        this.f7617B0.setText(x0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10886a(CheckableImageButton checkableImageButton) {
        this.f7618C0.setContentDescription(checkableImageButton.getContext().getString(this.f7618C0.isChecked() ? C4414j.mtrl_picker_toggle_to_calendar_input_mode : C4414j.mtrl_picker_toggle_to_text_input_mode));
    }

    /* renamed from: b */
    private static Drawable m10887b(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C3103a.m12557c(context, C4409e.ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C3103a.m12557c(context, C4409e.ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: c */
    private static int m10889c(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = (C2648m.f7646j * resources.getDimensionPixelSize(C4408d.mtrl_calendar_day_height)) + ((C2648m.f7646j - 1) * resources.getDimensionPixelOffset(C4408d.mtrl_calendar_month_vertical_padding));
        return resources.getDimensionPixelSize(C4408d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C4408d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C4408d.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(C4408d.mtrl_calendar_days_of_week_height) + dimensionPixelSize + resources.getDimensionPixelOffset(C4408d.mtrl_calendar_bottom_padding);
    }

    /* renamed from: d */
    private static int m10891d(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C4408d.mtrl_calendar_content_padding);
        int i = C2646l.m10917i().f7643j;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C4408d.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C4408d.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: e */
    private int m10893e(Context context) {
        int i = this.f7625t0;
        return i != 0 ? i : this.f7626u0.mo8620b(context);
    }

    /* renamed from: f */
    private void m10896f(Context context) {
        this.f7618C0.setTag(f7615H0);
        this.f7618C0.setImageDrawable(m10887b(context));
        C3379v.m13788a((View) this.f7618C0, (C3323a) null);
        m10886a(this.f7618C0);
        this.f7618C0.setOnClickListener(new C2642d());
    }

    /* renamed from: g */
    static boolean m10898g(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C4458b.m18169a(context, C4375b.materialCalendarStyle, C2625h.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m10899z0() {
        this.f7629x0 = C2625h.m10852a(this.f7626u0, m10893e(mo2576p0()), this.f7628w0);
        this.f7627v0 = this.f7618C0.isChecked() ? C2644k.m10910a(this.f7626u0, this.f7628w0) : this.f7629x0;
        m10883B0();
        C0466s b = mo2565m().mo2778b();
        b.mo2911a(C4410f.mtrl_calendar_frame, (Fragment) this.f7627v0);
        b.mo2635c();
        this.f7627v0.mo8686a(new C2641c());
    }

    /* renamed from: a */
    public final View mo2488a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f7616A0 ? C4412h.mtrl_picker_fullscreen : C4412h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f7616A0) {
            inflate.findViewById(C4410f.mtrl_calendar_frame).setLayoutParams(new LayoutParams(m10891d(context), -2));
        } else {
            View findViewById = inflate.findViewById(C4410f.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(C4410f.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LayoutParams(m10891d(context), -1));
            findViewById2.setMinimumHeight(m10889c(mo2576p0()));
        }
        TextView textView = (TextView) inflate.findViewById(C4410f.mtrl_picker_header_selection_text);
        this.f7617B0 = textView;
        C3379v.m13818g(textView, 1);
        this.f7618C0 = (CheckableImageButton) inflate.findViewById(C4410f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C4410f.mtrl_picker_title_text);
        CharSequence charSequence = this.f7631z0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f7630y0);
        }
        m10896f(context);
        this.f7620E0 = (Button) inflate.findViewById(C4410f.confirm_button);
        if (this.f7626u0.mo8623o()) {
            this.f7620E0.setEnabled(true);
        } else {
            this.f7620E0.setEnabled(false);
        }
        this.f7620E0.setTag(f7613F0);
        this.f7620E0.setOnClickListener(new C2639a());
        Button button = (Button) inflate.findViewById(C4410f.cancel_button);
        button.setTag(f7614G0);
        button.setOnClickListener(new C2640b());
        return inflate;
    }

    /* renamed from: c */
    public final void mo2524c(Bundle bundle) {
        super.mo2524c(bundle);
        if (bundle == null) {
            bundle = mo2562l();
        }
        this.f7625t0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f7626u0 = (C2620d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f7628w0 = (C2614a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f7630y0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f7631z0 = bundle.getCharSequence("TITLE_TEXT_KEY");
    }

    /* renamed from: c0 */
    public void mo2528c0() {
        super.mo2528c0();
        Window window = mo2657w0().getWindow();
        if (this.f7616A0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f7619D0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = mo2461A().getDimensionPixelOffset(C4408d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            InsetDrawable insetDrawable = new InsetDrawable(this.f7619D0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(insetDrawable);
            window.getDecorView().setOnTouchListener(new C4446a(mo2657w0(), rect));
        }
        m10899z0();
    }

    /* renamed from: d0 */
    public void mo2534d0() {
        this.f7627v0.mo2653s0();
        super.mo2534d0();
    }

    /* renamed from: e */
    public final void mo2536e(Bundle bundle) {
        super.mo2536e(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f7625t0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f7626u0);
        C2616b bVar = new C2616b(this.f7628w0);
        if (this.f7629x0.mo8639v0() != null) {
            bVar.mo8612a(this.f7629x0.mo8639v0().f7645l);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.mo8613a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f7630y0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f7631z0);
    }

    /* renamed from: n */
    public final Dialog mo376n(Bundle bundle) {
        Dialog dialog = new Dialog(mo2576p0(), m10893e(mo2576p0()));
        Context context = dialog.getContext();
        this.f7616A0 = m10898g(context);
        int a = C4458b.m18169a(context, C4375b.colorSurface, C2638i.class.getCanonicalName());
        C4382g gVar = new C4382g(context, null, C4375b.materialCalendarStyle, C4415k.Widget_MaterialComponents_MaterialCalendar);
        this.f7619D0 = gVar;
        gVar.mo13058a(context);
        this.f7619D0.mo13059a(ColorStateList.valueOf(a));
        this.f7619D0.mo13064b(C3379v.m13825l(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f7623r0.iterator();
        while (it.hasNext()) {
            ((OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f7624s0.iterator();
        while (it.hasNext()) {
            ((OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) mo2469I();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: x0 */
    public String mo8648x0() {
        return this.f7626u0.mo8619a(mo2568n());
    }

    /* renamed from: y0 */
    public final S mo8649y0() {
        return this.f7626u0.mo8625q();
    }
}
