package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0189a0;
import androidx.appcompat.widget.C0236j;
import androidx.appcompat.widget.C0275t0;
import androidx.core.graphics.drawable.C0371a;
import androidx.core.widget.C0391i;
import com.google.android.material.internal.C2699a;
import com.google.android.material.internal.C2701b;
import com.google.android.material.internal.C2714i;
import com.google.android.material.internal.C2715j;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.theme.p054a.C2794a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p098e.C3236a;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3364g;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p112j.p113a.C3400a;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4405c;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4410f;
import p147g.p156d.p157a.p185c.C4412h;
import p147g.p156d.p157a.p185c.C4414j;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p187b0.C4389k.C4391b;
import p147g.p156d.p157a.p185c.p189m.C4417a;
import p147g.p156d.p157a.p185c.p195r.C4445a;
import p147g.p156d.p157a.p185c.p202y.C4459c;

public class TextInputLayout extends LinearLayout {

    /* renamed from: M0 */
    private static final int f8036M0 = C4415k.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private final TextView f8037A;

    /* renamed from: A0 */
    private ColorStateList f8038A0;

    /* renamed from: B */
    private CharSequence f8039B;

    /* renamed from: B0 */
    private int f8040B0;

    /* renamed from: C */
    private final TextView f8041C;

    /* renamed from: C0 */
    private final int f8042C0;

    /* renamed from: D */
    private boolean f8043D;

    /* renamed from: D0 */
    private final int f8044D0;

    /* renamed from: E */
    private CharSequence f8045E;

    /* renamed from: E0 */
    private final int f8046E0;

    /* renamed from: F */
    private boolean f8047F;

    /* renamed from: F0 */
    private int f8048F0;

    /* renamed from: G */
    private C4382g f8049G;

    /* renamed from: G0 */
    private boolean f8050G0;

    /* renamed from: H */
    private C4382g f8051H;

    /* renamed from: H0 */
    final C2699a f8052H0;

    /* renamed from: I */
    private C4389k f8053I;

    /* renamed from: I0 */
    private boolean f8054I0;

    /* renamed from: J */
    private final int f8055J;

    /* renamed from: J0 */
    private ValueAnimator f8056J0;

    /* renamed from: K */
    private int f8057K;

    /* renamed from: K0 */
    private boolean f8058K0;

    /* renamed from: L */
    private final int f8059L;
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public boolean f8060L0;

    /* renamed from: M */
    private int f8061M;

    /* renamed from: N */
    private final int f8062N;

    /* renamed from: O */
    private final int f8063O;

    /* renamed from: P */
    private int f8064P;

    /* renamed from: Q */
    private int f8065Q;

    /* renamed from: R */
    private final Rect f8066R;

    /* renamed from: S */
    private final Rect f8067S;

    /* renamed from: T */
    private final RectF f8068T;

    /* renamed from: U */
    private Typeface f8069U;

    /* renamed from: V */
    private final CheckableImageButton f8070V;

    /* renamed from: W */
    private ColorStateList f8071W;

    /* renamed from: a0 */
    private boolean f8072a0;

    /* renamed from: b0 */
    private Mode f8073b0;

    /* renamed from: c0 */
    private boolean f8074c0;

    /* renamed from: d0 */
    private Drawable f8075d0;

    /* renamed from: e0 */
    private int f8076e0;

    /* renamed from: f */
    private final FrameLayout f8077f;

    /* renamed from: f0 */
    private OnLongClickListener f8078f0;

    /* renamed from: g */
    private final LinearLayout f8079g;

    /* renamed from: g0 */
    private final LinkedHashSet<C2757f> f8080g0;

    /* renamed from: h */
    private final LinearLayout f8081h;

    /* renamed from: h0 */
    private int f8082h0;

    /* renamed from: i */
    private final FrameLayout f8083i;

    /* renamed from: i0 */
    private final SparseArray<C2783e> f8084i0;

    /* renamed from: j */
    EditText f8085j;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public final CheckableImageButton f8086j0;

    /* renamed from: k */
    private CharSequence f8087k;

    /* renamed from: k0 */
    private final LinkedHashSet<C2758g> f8088k0;

    /* renamed from: l */
    private final C2784f f8089l;

    /* renamed from: l0 */
    private ColorStateList f8090l0;

    /* renamed from: m */
    boolean f8091m;

    /* renamed from: m0 */
    private boolean f8092m0;

    /* renamed from: n */
    private int f8093n;

    /* renamed from: n0 */
    private Mode f8094n0;

    /* renamed from: o */
    private boolean f8095o;

    /* renamed from: o0 */
    private boolean f8096o0;

    /* renamed from: p */
    private TextView f8097p;

    /* renamed from: p0 */
    private Drawable f8098p0;

    /* renamed from: q */
    private int f8099q;

    /* renamed from: q0 */
    private int f8100q0;

    /* renamed from: r */
    private int f8101r;

    /* renamed from: r0 */
    private Drawable f8102r0;

    /* renamed from: s */
    private CharSequence f8103s;

    /* renamed from: s0 */
    private OnLongClickListener f8104s0;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f8105t;

    /* renamed from: t0 */
    private final CheckableImageButton f8106t0;

    /* renamed from: u */
    private TextView f8107u;

    /* renamed from: u0 */
    private ColorStateList f8108u0;

    /* renamed from: v */
    private ColorStateList f8109v;

    /* renamed from: v0 */
    private ColorStateList f8110v0;

    /* renamed from: w */
    private int f8111w;

    /* renamed from: w0 */
    private ColorStateList f8112w0;

    /* renamed from: x */
    private ColorStateList f8113x;

    /* renamed from: x0 */
    private int f8114x0;

    /* renamed from: y */
    private ColorStateList f8115y;

    /* renamed from: y0 */
    private int f8116y0;

    /* renamed from: z */
    private CharSequence f8117z;

    /* renamed from: z0 */
    private int f8118z0;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C2752a implements TextWatcher {
        C2752a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo9172a(!textInputLayout.f8060L0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f8091m) {
                textInputLayout2.mo9168a(editable.length());
            }
            if (TextInputLayout.this.f8105t) {
                TextInputLayout.this.m11484c(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C2753b implements Runnable {
        C2753b() {
        }

        public void run() {
            TextInputLayout.this.f8086j0.performClick();
            TextInputLayout.this.f8086j0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class C2754c implements Runnable {
        C2754c() {
        }

        public void run() {
            TextInputLayout.this.f8085j.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    class C2755d implements AnimatorUpdateListener {
        C2755d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f8052H0.mo8950b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C2756e extends C3323a {

        /* renamed from: d */
        private final TextInputLayout f8123d;

        public C2756e(TextInputLayout textInputLayout) {
            this.f8123d = textInputLayout;
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            super.mo2349a(view, cVar);
            EditText editText = this.f8123d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f8123d.getHint();
            CharSequence helperText = this.f8123d.getHelperText();
            CharSequence error = this.f8123d.getError();
            int counterMaxLength = this.f8123d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f8123d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String str = "";
            String charSequence = z2 ? hint.toString() : str;
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence);
            String str2 = ", ";
            sb.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? str2 : str);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = str;
            }
            sb3.append(helperText);
            String sb4 = sb3.toString();
            if (z) {
                cVar.mo10775g((CharSequence) text);
            } else if (!TextUtils.isEmpty(sb4)) {
                cVar.mo10775g((CharSequence) sb4);
            }
            if (!TextUtils.isEmpty(sb4)) {
                if (VERSION.SDK_INT >= 26) {
                    cVar.mo10765d((CharSequence) sb4);
                } else {
                    if (z) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(text);
                        sb5.append(str2);
                        sb5.append(sb4);
                        sb4 = sb5.toString();
                    }
                    cVar.mo10775g((CharSequence) sb4);
                }
                cVar.mo10786l(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            cVar.mo10751b(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cVar.mo10761c(error);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C2757f {
        /* renamed from: a */
        void mo9312a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C2758g {
        /* renamed from: a */
        void mo9313a(TextInputLayout textInputLayout, int i);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    static class C2759h extends C3400a {
        public static final Creator<C2759h> CREATOR = new C2760a();

        /* renamed from: h */
        CharSequence f8124h;

        /* renamed from: i */
        boolean f8125i;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        static class C2760a implements ClassLoaderCreator<C2759h> {
            C2760a() {
            }

            public C2759h createFromParcel(Parcel parcel) {
                return new C2759h(parcel, null);
            }

            public C2759h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2759h(parcel, classLoader);
            }

            public C2759h[] newArray(int i) {
                return new C2759h[i];
            }
        }

        C2759h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8124h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f8125i = z;
        }

        C2759h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append(this.f8124h);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f8124h, parcel, i);
            parcel.writeInt(this.f8125i ? 1 : 0);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i;
        super(C2794a.m11644b(context, attributeSet2, i3, f8036M0), attributeSet2, i3);
        this.f8089l = new C2784f(this);
        this.f8066R = new Rect();
        this.f8067S = new Rect();
        this.f8068T = new RectF();
        this.f8080g0 = new LinkedHashSet<>();
        this.f8082h0 = 0;
        this.f8084i0 = new SparseArray<>();
        this.f8088k0 = new LinkedHashSet<>();
        this.f8052H0 = new C2699a(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f8077f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.f8077f);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f8079g = linearLayout;
        linearLayout.setOrientation(0);
        this.f8079g.setLayoutParams(new LayoutParams(-2, -1, 8388611));
        this.f8077f.addView(this.f8079g);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f8081h = linearLayout2;
        linearLayout2.setOrientation(0);
        this.f8081h.setLayoutParams(new LayoutParams(-2, -1, 8388613));
        this.f8077f.addView(this.f8081h);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f8083i = frameLayout2;
        frameLayout2.setLayoutParams(new LayoutParams(-2, -1));
        this.f8052H0.mo8953b(C4417a.f11712a);
        this.f8052H0.mo8941a(C4417a.f11712a);
        this.f8052H0.mo8951b(8388659);
        C0275t0 d = C2714i.m11284d(context2, attributeSet, C4416l.TextInputLayout, i, f8036M0, C4416l.TextInputLayout_counterTextAppearance, C4416l.TextInputLayout_counterOverflowTextAppearance, C4416l.TextInputLayout_errorTextAppearance, C4416l.TextInputLayout_helperTextTextAppearance, C4416l.TextInputLayout_hintTextAppearance);
        this.f8043D = d.mo1738a(C4416l.TextInputLayout_hintEnabled, true);
        setHint(d.mo1747e(C4416l.TextInputLayout_android_hint));
        this.f8054I0 = d.mo1738a(C4416l.TextInputLayout_hintAnimationEnabled, true);
        this.f8053I = C4389k.m17885a(context2, attributeSet2, i3, f8036M0).mo13120a();
        this.f8055J = context2.getResources().getDimensionPixelOffset(C4408d.mtrl_textinput_box_label_cutout_padding);
        this.f8059L = d.mo1740b(C4416l.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f8062N = d.mo1742c(C4416l.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(C4408d.mtrl_textinput_box_stroke_width_default));
        this.f8063O = d.mo1742c(C4416l.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(C4408d.mtrl_textinput_box_stroke_width_focused));
        this.f8061M = this.f8062N;
        float a = d.mo1733a(C4416l.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float a2 = d.mo1733a(C4416l.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float a3 = d.mo1733a(C4416l.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float a4 = d.mo1733a(C4416l.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        C4391b m = this.f8053I.mo13115m();
        if (a >= 0.0f) {
            m.mo13129d(a);
        }
        if (a2 >= 0.0f) {
            m.mo13133e(a2);
        }
        if (a3 >= 0.0f) {
            m.mo13125c(a3);
        }
        if (a4 >= 0.0f) {
            m.mo13121b(a4);
        }
        this.f8053I = m.mo13120a();
        ColorStateList a5 = C4459c.m18176a(context2, d, C4416l.TextInputLayout_boxBackgroundColor);
        if (a5 != null) {
            int defaultColor = a5.getDefaultColor();
            this.f8040B0 = defaultColor;
            this.f8065Q = defaultColor;
            if (a5.isStateful()) {
                this.f8042C0 = a5.getColorForState(new int[]{-16842910}, -1);
                this.f8044D0 = a5.getColorForState(new int[]{16842908, 16842910}, -1);
                i2 = a5.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f8044D0 = this.f8040B0;
                ColorStateList b = C3103a.m12556b(context2, C4405c.mtrl_filled_background_color);
                this.f8042C0 = b.getColorForState(new int[]{-16842910}, -1);
                i2 = b.getColorForState(new int[]{16843623}, -1);
            }
            this.f8046E0 = i2;
        } else {
            this.f8065Q = 0;
            this.f8040B0 = 0;
            this.f8042C0 = 0;
            this.f8044D0 = 0;
            this.f8046E0 = 0;
        }
        if (d.mo1751g(C4416l.TextInputLayout_android_textColorHint)) {
            ColorStateList a6 = d.mo1735a(C4416l.TextInputLayout_android_textColorHint);
            this.f8112w0 = a6;
            this.f8110v0 = a6;
        }
        ColorStateList a7 = C4459c.m18176a(context2, d, C4416l.TextInputLayout_boxStrokeColor);
        this.f8118z0 = d.mo1734a(C4416l.TextInputLayout_boxStrokeColor, 0);
        this.f8114x0 = C3236a.m13263a(context2, C4405c.mtrl_textinput_default_box_stroke_color);
        this.f8048F0 = C3236a.m13263a(context2, C4405c.mtrl_textinput_disabled_color);
        this.f8116y0 = C3236a.m13263a(context2, C4405c.mtrl_textinput_hovered_box_stroke_color);
        if (a7 != null) {
            setBoxStrokeColorStateList(a7);
        }
        if (d.mo1751g(C4416l.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(C4459c.m18176a(context2, d, C4416l.TextInputLayout_boxStrokeErrorColor));
        }
        if (d.mo1750g(C4416l.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(d.mo1750g(C4416l.TextInputLayout_hintTextAppearance, 0));
        }
        int g = d.mo1750g(C4416l.TextInputLayout_errorTextAppearance, 0);
        CharSequence e = d.mo1747e(C4416l.TextInputLayout_errorContentDescription);
        boolean a8 = d.mo1738a(C4416l.TextInputLayout_errorEnabled, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C4412h.design_text_input_end_icon, this.f8081h, false);
        this.f8106t0 = checkableImageButton;
        checkableImageButton.setVisibility(8);
        if (d.mo1751g(C4416l.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(d.mo1741b(C4416l.TextInputLayout_errorIconDrawable));
        }
        if (d.mo1751g(C4416l.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(C4459c.m18176a(context2, d, C4416l.TextInputLayout_errorIconTint));
        }
        if (d.mo1751g(C4416l.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(C2715j.m11287a(d.mo1744d(C4416l.TextInputLayout_errorIconTintMode, -1), (Mode) null));
        }
        this.f8106t0.setContentDescription(getResources().getText(C4414j.error_icon_content_description));
        C3379v.m13820h(this.f8106t0, 2);
        this.f8106t0.setClickable(false);
        this.f8106t0.setPressable(false);
        this.f8106t0.setFocusable(false);
        int g2 = d.mo1750g(C4416l.TextInputLayout_helperTextTextAppearance, 0);
        boolean a9 = d.mo1738a(C4416l.TextInputLayout_helperTextEnabled, false);
        CharSequence e2 = d.mo1747e(C4416l.TextInputLayout_helperText);
        int g3 = d.mo1750g(C4416l.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence e3 = d.mo1747e(C4416l.TextInputLayout_placeholderText);
        int g4 = d.mo1750g(C4416l.TextInputLayout_prefixTextAppearance, 0);
        CharSequence e4 = d.mo1747e(C4416l.TextInputLayout_prefixText);
        int g5 = d.mo1750g(C4416l.TextInputLayout_suffixTextAppearance, 0);
        CharSequence e5 = d.mo1747e(C4416l.TextInputLayout_suffixText);
        int i4 = g5;
        boolean a10 = d.mo1738a(C4416l.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(d.mo1744d(C4416l.TextInputLayout_counterMaxLength, -1));
        this.f8101r = d.mo1750g(C4416l.TextInputLayout_counterTextAppearance, 0);
        this.f8099q = d.mo1750g(C4416l.TextInputLayout_counterOverflowTextAppearance, 0);
        CharSequence charSequence = e5;
        int i5 = g4;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C4412h.design_text_input_start_icon, this.f8079g, false);
        this.f8070V = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (d.mo1751g(C4416l.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(d.mo1741b(C4416l.TextInputLayout_startIconDrawable));
            if (d.mo1751g(C4416l.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(d.mo1747e(C4416l.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(d.mo1738a(C4416l.TextInputLayout_startIconCheckable, true));
        }
        if (d.mo1751g(C4416l.TextInputLayout_startIconTint)) {
            setStartIconTintList(C4459c.m18176a(context2, d, C4416l.TextInputLayout_startIconTint));
        }
        if (d.mo1751g(C4416l.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(C2715j.m11287a(d.mo1744d(C4416l.TextInputLayout_startIconTintMode, -1), (Mode) null));
        }
        setBoxBackgroundMode(d.mo1744d(C4416l.TextInputLayout_boxBackgroundMode, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C4412h.design_text_input_end_icon, this.f8083i, false);
        this.f8086j0 = checkableImageButton3;
        this.f8083i.addView(checkableImageButton3);
        this.f8086j0.setVisibility(8);
        this.f8084i0.append(-1, new C2770b(this));
        this.f8084i0.append(0, new C2786g(this));
        this.f8084i0.append(1, new C2787h(this));
        this.f8084i0.append(2, new C2761a(this));
        this.f8084i0.append(3, new C2772d(this));
        if (d.mo1751g(C4416l.TextInputLayout_endIconMode)) {
            setEndIconMode(d.mo1744d(C4416l.TextInputLayout_endIconMode, 0));
            if (d.mo1751g(C4416l.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(d.mo1741b(C4416l.TextInputLayout_endIconDrawable));
            }
            if (d.mo1751g(C4416l.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(d.mo1747e(C4416l.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(d.mo1738a(C4416l.TextInputLayout_endIconCheckable, true));
        } else if (d.mo1751g(C4416l.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(d.mo1738a(C4416l.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(d.mo1741b(C4416l.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(d.mo1747e(C4416l.TextInputLayout_passwordToggleContentDescription));
            if (d.mo1751g(C4416l.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(C4459c.m18176a(context2, d, C4416l.TextInputLayout_passwordToggleTint));
            }
            if (d.mo1751g(C4416l.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(C2715j.m11287a(d.mo1744d(C4416l.TextInputLayout_passwordToggleTintMode, -1), (Mode) null));
            }
        }
        if (!d.mo1751g(C4416l.TextInputLayout_passwordToggleEnabled)) {
            if (d.mo1751g(C4416l.TextInputLayout_endIconTint)) {
                setEndIconTintList(C4459c.m18176a(context2, d, C4416l.TextInputLayout_endIconTint));
            }
            if (d.mo1751g(C4416l.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(C2715j.m11287a(d.mo1744d(C4416l.TextInputLayout_endIconTintMode, -1), (Mode) null));
            }
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.f8037A = appCompatTextView;
        appCompatTextView.setId(C4410f.textinput_prefix_text);
        this.f8037A.setLayoutParams(new LayoutParams(-2, -2));
        C3379v.m13818g(this.f8037A, 1);
        this.f8079g.addView(this.f8070V);
        this.f8079g.addView(this.f8037A);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        this.f8041C = appCompatTextView2;
        appCompatTextView2.setId(C4410f.textinput_suffix_text);
        this.f8041C.setLayoutParams(new LayoutParams(-2, -2, 80));
        C3379v.m13818g(this.f8041C, 1);
        this.f8081h.addView(this.f8041C);
        this.f8081h.addView(this.f8106t0);
        this.f8081h.addView(this.f8083i);
        setHelperTextEnabled(a9);
        setHelperText(e2);
        setHelperTextTextAppearance(g2);
        setErrorEnabled(a8);
        setErrorTextAppearance(g);
        setErrorContentDescription(e);
        setCounterTextAppearance(this.f8101r);
        setCounterOverflowTextAppearance(this.f8099q);
        setPlaceholderText(e3);
        setPlaceholderTextAppearance(g3);
        setPrefixText(e4);
        setPrefixTextAppearance(i5);
        setSuffixText(charSequence);
        setSuffixTextAppearance(i4);
        if (d.mo1751g(C4416l.TextInputLayout_errorTextColor)) {
            setErrorTextColor(d.mo1735a(C4416l.TextInputLayout_errorTextColor));
        }
        if (d.mo1751g(C4416l.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(d.mo1735a(C4416l.TextInputLayout_helperTextTextColor));
        }
        if (d.mo1751g(C4416l.TextInputLayout_hintTextColor)) {
            setHintTextColor(d.mo1735a(C4416l.TextInputLayout_hintTextColor));
        }
        if (d.mo1751g(C4416l.TextInputLayout_counterTextColor)) {
            setCounterTextColor(d.mo1735a(C4416l.TextInputLayout_counterTextColor));
        }
        if (d.mo1751g(C4416l.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(d.mo1735a(C4416l.TextInputLayout_counterOverflowTextColor));
        }
        if (d.mo1751g(C4416l.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(d.mo1735a(C4416l.TextInputLayout_placeholderTextColor));
        }
        if (d.mo1751g(C4416l.TextInputLayout_prefixTextColor)) {
            setPrefixTextColor(d.mo1735a(C4416l.TextInputLayout_prefixTextColor));
        }
        if (d.mo1751g(C4416l.TextInputLayout_suffixTextColor)) {
            setSuffixTextColor(d.mo1735a(C4416l.TextInputLayout_suffixTextColor));
        }
        setCounterEnabled(a10);
        setEnabled(d.mo1738a(C4416l.TextInputLayout_android_enabled, true));
        d.mo1737a();
        C3379v.m13820h(this, 2);
    }

    /* renamed from: A */
    private void m11443A() {
        TextView textView = this.f8107u;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: B */
    private void m11444B() {
        if (m11447E()) {
            C3379v.m13787a((View) this.f8085j, (Drawable) this.f8049G);
        }
    }

    /* renamed from: C */
    private boolean m11445C() {
        return (this.f8106t0.getVisibility() == 0 || ((m11501u() && mo9173a()) || this.f8039B != null)) && this.f8081h.getMeasuredWidth() > 0;
    }

    /* renamed from: D */
    private boolean m11446D() {
        return !(getStartIconDrawable() == null && this.f8117z == null) && this.f8079g.getMeasuredWidth() > 0;
    }

    /* renamed from: E */
    private boolean m11447E() {
        EditText editText = this.f8085j;
        return (editText == null || this.f8049G == null || editText.getBackground() != null || this.f8057K == 0) ? false : true;
    }

    /* renamed from: F */
    private void m11448F() {
        TextView textView = this.f8107u;
        if (textView != null && this.f8105t) {
            textView.setText(this.f8103s);
            this.f8107u.setVisibility(0);
            this.f8107u.bringToFront();
        }
    }

    /* renamed from: G */
    private void m11449G() {
        if (this.f8097p != null) {
            EditText editText = this.f8085j;
            mo9168a(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: H */
    private void m11450H() {
        TextView textView = this.f8097p;
        if (textView != null) {
            mo9169a(textView, this.f8095o ? this.f8099q : this.f8101r);
            if (!this.f8095o) {
                ColorStateList colorStateList = this.f8113x;
                if (colorStateList != null) {
                    this.f8097p.setTextColor(colorStateList);
                }
            }
            if (this.f8095o) {
                ColorStateList colorStateList2 = this.f8115y;
                if (colorStateList2 != null) {
                    this.f8097p.setTextColor(colorStateList2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m11451I() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f8085j
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.m11446D()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0049
            android.widget.LinearLayout r0 = r10.f8079g
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f8085j
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f8075d0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f8076e0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f8075d0 = r6
            r10.f8076e0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f8085j
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0391i.m2033a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f8075d0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f8085j
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0391i.m2030a(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f8075d0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f8085j
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0391i.m2033a(r0)
            android.widget.EditText r6 = r10.f8085j
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0391i.m2030a(r6, r2, r7, r8, r0)
            r10.f8075d0 = r2
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            boolean r6 = r10.m11445C()
            if (r6 == 0) goto L_0x00d5
            android.widget.TextView r2 = r10.f8041C
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f8085j
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = p071f.p097h.p108m.C3364g.m13720b(r6)
            int r2 = r2 + r6
        L_0x008c:
            android.widget.EditText r6 = r10.f8085j
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0391i.m2033a(r6)
            android.graphics.drawable.Drawable r7 = r10.f8098p0
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.f8100q0
            if (r8 == r2) goto L_0x00ad
            r10.f8100q0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f8085j
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r4 = r10.f8098p0
            r3 = r6[r3]
            androidx.core.widget.C0391i.m2030a(r0, r1, r2, r4, r3)
            goto L_0x00f6
        L_0x00ad:
            android.graphics.drawable.Drawable r7 = r10.f8098p0
            if (r7 != 0) goto L_0x00bd
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f8098p0 = r7
            r10.f8100q0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bd:
            r2 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f8098p0
            if (r2 == r7) goto L_0x00d3
            r0 = r6[r4]
            r10.f8102r0 = r0
            android.widget.EditText r0 = r10.f8085j
            r1 = r6[r1]
            r2 = r6[r5]
            r3 = r6[r3]
            androidx.core.widget.C0391i.m2030a(r0, r1, r2, r7, r3)
            goto L_0x00f6
        L_0x00d3:
            r5 = r0
            goto L_0x00f6
        L_0x00d5:
            android.graphics.drawable.Drawable r6 = r10.f8098p0
            if (r6 == 0) goto L_0x00f7
            android.widget.EditText r6 = r10.f8085j
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0391i.m2033a(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f8098p0
            if (r4 != r7) goto L_0x00f3
            android.widget.EditText r0 = r10.f8085j
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f8102r0
            r3 = r6[r3]
            androidx.core.widget.C0391i.m2030a(r0, r1, r4, r7, r3)
            goto L_0x00f4
        L_0x00f3:
            r5 = r0
        L_0x00f4:
            r10.f8098p0 = r2
        L_0x00f6:
            r0 = r5
        L_0x00f7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m11451I():boolean");
    }

    /* renamed from: J */
    private boolean m11452J() {
        if (this.f8085j == null) {
            return false;
        }
        int max = Math.max(this.f8081h.getMeasuredHeight(), this.f8079g.getMeasuredHeight());
        if (this.f8085j.getMeasuredHeight() >= max) {
            return false;
        }
        this.f8085j.setMinimumHeight(max);
        return true;
    }

    /* renamed from: K */
    private void m11453K() {
        if (this.f8057K != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8077f.getLayoutParams();
            int o = m11495o();
            if (o != layoutParams.topMargin) {
                layoutParams.topMargin = o;
                this.f8077f.requestLayout();
            }
        }
    }

    /* renamed from: L */
    private void m11454L() {
        if (this.f8107u != null) {
            EditText editText = this.f8085j;
            if (editText != null) {
                this.f8107u.setGravity((editText.getGravity() & -113) | 48);
                this.f8107u.setPadding(this.f8085j.getCompoundPaddingLeft(), this.f8085j.getCompoundPaddingTop(), this.f8085j.getCompoundPaddingRight(), this.f8085j.getCompoundPaddingBottom());
            }
        }
    }

    /* renamed from: M */
    private void m11455M() {
        EditText editText = this.f8085j;
        m11484c(editText == null ? 0 : editText.getText().length());
    }

    /* renamed from: N */
    private void m11456N() {
        if (this.f8085j != null) {
            this.f8037A.setPadding(mo9182e() ? 0 : this.f8085j.getPaddingLeft(), this.f8085j.getCompoundPaddingTop(), this.f8037A.getCompoundPaddingRight(), this.f8085j.getCompoundPaddingBottom());
        }
    }

    /* renamed from: O */
    private void m11457O() {
        this.f8037A.setVisibility((this.f8117z == null || mo9176c()) ? 8 : 0);
        m11451I();
    }

    /* renamed from: P */
    private void m11458P() {
        if (this.f8085j != null) {
            TextView textView = this.f8041C;
            textView.setPadding(textView.getPaddingLeft(), this.f8085j.getPaddingTop(), (mo9173a() || m11503w()) ? 0 : this.f8085j.getPaddingRight(), this.f8085j.getPaddingBottom());
        }
    }

    /* renamed from: Q */
    private void m11459Q() {
        int visibility = this.f8041C.getVisibility();
        int i = 0;
        boolean z = this.f8039B != null && !mo9176c();
        TextView textView = this.f8041C;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f8041C.getVisibility()) {
            getEndIconDelegate().mo9319a(z);
        }
        m11451I();
    }

    /* renamed from: a */
    private int m11460a(int i, boolean z) {
        int compoundPaddingLeft = i + this.f8085j.getCompoundPaddingLeft();
        return (this.f8117z == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f8037A.getMeasuredWidth()) + this.f8037A.getPaddingLeft();
    }

    /* renamed from: a */
    private int m11461a(Rect rect, float f) {
        return m11504x() ? (int) (((float) rect.centerY()) - (f / 2.0f)) : rect.top + this.f8085j.getCompoundPaddingTop();
    }

    /* renamed from: a */
    private int m11462a(Rect rect, Rect rect2, float f) {
        return this.f8057K == 1 ? (int) (((float) rect2.top) + f) : rect.bottom - this.f8085j.getCompoundPaddingBottom();
    }

    /* renamed from: a */
    private Rect m11463a(Rect rect) {
        int b;
        int i;
        int paddingRight;
        if (this.f8085j != null) {
            Rect rect2 = this.f8067S;
            boolean z = C3379v.m13829p(this) == 1;
            rect2.bottom = rect.bottom;
            int i2 = this.f8057K;
            if (i2 != 1) {
                if (i2 != 2) {
                    rect2.left = rect.left + this.f8085j.getCompoundPaddingLeft();
                    rect2.top = getPaddingTop();
                    i = rect.right;
                    paddingRight = this.f8085j.getCompoundPaddingRight();
                } else {
                    rect2.left = rect.left + this.f8085j.getPaddingLeft();
                    rect2.top = rect.top - m11495o();
                    i = rect.right;
                    paddingRight = this.f8085j.getPaddingRight();
                }
                b = i - paddingRight;
            } else {
                rect2.left = m11460a(rect.left, z);
                rect2.top = rect.top + this.f8059L;
                b = m11475b(rect.right, z);
            }
            rect2.right = b;
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private static void m11464a(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C4414j.character_counter_overflowed_content_description : C4414j.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: a */
    private void m11465a(Canvas canvas) {
        C4382g gVar = this.f8051H;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f8061M;
            this.f8051H.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m11466a(RectF rectF) {
        float f = rectF.left;
        int i = this.f8055J;
        rectF.left = f - ((float) i);
        rectF.top -= (float) i;
        rectF.right += (float) i;
        rectF.bottom += (float) i;
    }

    /* renamed from: a */
    private static void m11467a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m11467a((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: a */
    private void m11468a(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            Drawable mutate = C0371a.m1913i(drawable).mutate();
            C0371a.m1898a(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: a */
    private static void m11469a(CheckableImageButton checkableImageButton, OnClickListener onClickListener, OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m11470a(checkableImageButton, onLongClickListener);
    }

    /* renamed from: a */
    private static void m11470a(CheckableImageButton checkableImageButton, OnLongClickListener onLongClickListener) {
        boolean y = C3379v.m13838y(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (y || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(y);
        checkableImageButton.setPressable(y);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        C3379v.m13820h(checkableImageButton, i);
    }

    /* renamed from: a */
    private void m11471a(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C0371a.m1913i(drawable).mutate();
            if (z) {
                C0371a.m1898a(drawable, colorStateList);
            }
            if (z2) {
                C0371a.m1901a(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    private void m11473a(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C2699a aVar;
        boolean isEnabled = isEnabled();
        EditText editText = this.f8085j;
        boolean z3 = true;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f8085j;
        if (editText2 == null || !editText2.hasFocus()) {
            z3 = false;
        }
        boolean c = this.f8089l.mo9358c();
        ColorStateList colorStateList2 = this.f8110v0;
        if (colorStateList2 != null) {
            this.f8052H0.mo8942a(colorStateList2);
            this.f8052H0.mo8954b(this.f8110v0);
        }
        if (!isEnabled) {
            this.f8052H0.mo8942a(ColorStateList.valueOf(this.f8048F0));
            this.f8052H0.mo8954b(ColorStateList.valueOf(this.f8048F0));
        } else if (c) {
            this.f8052H0.mo8942a(this.f8089l.mo9362g());
        } else {
            if (this.f8095o) {
                TextView textView = this.f8097p;
                if (textView != null) {
                    aVar = this.f8052H0;
                    colorStateList = textView.getTextColors();
                    aVar.mo8942a(colorStateList);
                }
            }
            if (z3) {
                colorStateList = this.f8112w0;
                if (colorStateList != null) {
                    aVar = this.f8052H0;
                    aVar.mo8942a(colorStateList);
                }
            }
        }
        if (z4 || (isEnabled() && (z3 || c))) {
            if (z2 || this.f8050G0) {
                m11480b(z);
            }
        } else if (z2 || !this.f8050G0) {
            m11486c(z);
        }
    }

    /* renamed from: b */
    private int m11475b(int i, boolean z) {
        int compoundPaddingRight = i - this.f8085j.getCompoundPaddingRight();
        return (this.f8117z == null || !z) ? compoundPaddingRight : compoundPaddingRight + this.f8037A.getMeasuredWidth() + this.f8037A.getPaddingRight();
    }

    /* renamed from: b */
    private Rect m11476b(Rect rect) {
        if (this.f8085j != null) {
            Rect rect2 = this.f8067S;
            float e = this.f8052H0.mo8960e();
            rect2.left = rect.left + this.f8085j.getCompoundPaddingLeft();
            rect2.top = m11461a(rect, e);
            rect2.right = rect.right - this.f8085j.getCompoundPaddingRight();
            rect2.bottom = m11462a(rect, rect2, e);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    private void m11477b(int i) {
        Iterator it = this.f8088k0.iterator();
        while (it.hasNext()) {
            ((C2758g) it.next()).mo9313a(this, i);
        }
    }

    /* renamed from: b */
    private void m11478b(Canvas canvas) {
        if (this.f8043D) {
            this.f8052H0.mo8943a(canvas);
        }
    }

    /* renamed from: b */
    private static void m11479b(CheckableImageButton checkableImageButton, OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m11470a(checkableImageButton, onLongClickListener);
    }

    /* renamed from: b */
    private void m11480b(boolean z) {
        ValueAnimator valueAnimator = this.f8056J0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8056J0.cancel();
        }
        if (!z || !this.f8054I0) {
            this.f8052H0.mo8950b(1.0f);
        } else {
            mo9167a(1.0f);
        }
        this.f8050G0 = false;
        if (m11499s()) {
            m11506z();
        }
        m11448F();
        m11457O();
        m11459Q();
    }

    /* renamed from: b */
    private void m11481b(boolean z, boolean z2) {
        int defaultColor = this.f8038A0.getDefaultColor();
        int colorForState = this.f8038A0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f8038A0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f8064P = colorForState2;
        } else if (z2) {
            this.f8064P = colorForState;
        } else {
            this.f8064P = defaultColor;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11484c(int i) {
        if (i != 0 || this.f8050G0) {
            m11502v();
        } else {
            m11448F();
        }
    }

    /* renamed from: c */
    private void m11485c(Rect rect) {
        C4382g gVar = this.f8051H;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.f8063O, rect.right, i);
        }
    }

    /* renamed from: c */
    private void m11486c(boolean z) {
        ValueAnimator valueAnimator = this.f8056J0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8056J0.cancel();
        }
        if (!z || !this.f8054I0) {
            this.f8052H0.mo8950b(0.0f);
        } else {
            mo9167a(0.0f);
        }
        if (m11499s() && ((C2771c) this.f8049G).mo8577t()) {
            m11498r();
        }
        this.f8050G0 = true;
        m11502v();
        m11457O();
        m11459Q();
    }

    /* renamed from: d */
    private void m11487d(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m11491k();
            return;
        }
        Drawable mutate = C0371a.m1913i(getEndIconDrawable()).mutate();
        C0371a.m1906b(mutate, this.f8089l.mo9361f());
        this.f8086j0.setImageDrawable(mutate);
    }

    private C2783e getEndIconDelegate() {
        C2783e eVar = (C2783e) this.f8084i0.get(this.f8082h0);
        return eVar != null ? eVar : (C2783e) this.f8084i0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f8106t0.getVisibility() == 0) {
            return this.f8106t0;
        }
        if (!m11501u() || !mo9173a()) {
            return null;
        }
        return this.f8086j0;
    }

    /* renamed from: h */
    private void m11488h() {
        TextView textView = this.f8107u;
        if (textView != null) {
            this.f8077f.addView(textView);
            this.f8107u.setVisibility(0);
        }
    }

    /* renamed from: i */
    private void m11489i() {
        C4382g gVar = this.f8049G;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(this.f8053I);
            if (m11496p()) {
                this.f8049G.mo13054a((float) this.f8061M, this.f8064P);
            }
            int n = m11494n();
            this.f8065Q = n;
            this.f8049G.mo13059a(ColorStateList.valueOf(n));
            if (this.f8082h0 == 3) {
                this.f8085j.getBackground().invalidateSelf();
            }
            m11490j();
            invalidate();
        }
    }

    /* renamed from: j */
    private void m11490j() {
        if (this.f8051H != null) {
            if (m11497q()) {
                this.f8051H.mo13059a(ColorStateList.valueOf(this.f8064P));
            }
            invalidate();
        }
    }

    /* renamed from: k */
    private void m11491k() {
        m11471a(this.f8086j0, this.f8092m0, this.f8090l0, this.f8096o0, this.f8094n0);
    }

    /* renamed from: l */
    private void m11492l() {
        m11471a(this.f8070V, this.f8072a0, this.f8071W, this.f8074c0, this.f8073b0);
    }

    /* renamed from: m */
    private void m11493m() {
        int i = this.f8057K;
        if (i == 0) {
            this.f8049G = null;
        } else if (i == 1) {
            this.f8049G = new C4382g(this.f8053I);
            this.f8051H = new C4382g();
            return;
        } else if (i == 2) {
            this.f8049G = (!this.f8043D || (this.f8049G instanceof C2771c)) ? new C4382g(this.f8053I) : new C2771c(this.f8053I);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f8057K);
            sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f8051H = null;
    }

    /* renamed from: n */
    private int m11494n() {
        return this.f8057K == 1 ? C4445a.m18116a(C4445a.m18121a((View) this, C4375b.colorSurface, 0), this.f8065Q) : this.f8065Q;
    }

    /* renamed from: o */
    private int m11495o() {
        float c;
        if (!this.f8043D) {
            return 0;
        }
        int i = this.f8057K;
        if (i == 0 || i == 1) {
            c = this.f8052H0.mo8957c();
        } else if (i != 2) {
            return 0;
        } else {
            c = this.f8052H0.mo8957c() / 2.0f;
        }
        return (int) c;
    }

    /* renamed from: p */
    private boolean m11496p() {
        return this.f8057K == 2 && m11497q();
    }

    /* renamed from: q */
    private boolean m11497q() {
        return this.f8061M > -1 && this.f8064P != 0;
    }

    /* renamed from: r */
    private void m11498r() {
        if (m11499s()) {
            ((C2771c) this.f8049G).mo8579u();
        }
    }

    /* renamed from: s */
    private boolean m11499s() {
        return this.f8043D && !TextUtils.isEmpty(this.f8045E) && (this.f8049G instanceof C2771c);
    }

    private void setEditText(EditText editText) {
        if (this.f8085j == null) {
            if (this.f8082h0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f8085j = editText;
            m11505y();
            setTextInputAccessibilityDelegate(new C2756e(this));
            this.f8052H0.mo8956b(this.f8085j.getTypeface());
            this.f8052H0.mo8938a(this.f8085j.getTextSize());
            int gravity = this.f8085j.getGravity();
            this.f8052H0.mo8951b((gravity & -113) | 48);
            this.f8052H0.mo8958c(gravity);
            this.f8085j.addTextChangedListener(new C2752a());
            if (this.f8110v0 == null) {
                this.f8110v0 = this.f8085j.getHintTextColors();
            }
            if (this.f8043D) {
                if (TextUtils.isEmpty(this.f8045E)) {
                    CharSequence hint = this.f8085j.getHint();
                    this.f8087k = hint;
                    setHint(hint);
                    this.f8085j.setHint(null);
                }
                this.f8047F = true;
            }
            if (this.f8097p != null) {
                mo9168a(this.f8085j.getText().length());
            }
            mo9183f();
            this.f8089l.mo9343a();
            this.f8079g.bringToFront();
            this.f8081h.bringToFront();
            this.f8083i.bringToFront();
            this.f8106t0.bringToFront();
            m11500t();
            m11456N();
            m11458P();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m11473a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f8106t0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f8083i;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        m11458P();
        if (!m11501u()) {
            m11451I();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f8045E)) {
            this.f8045E = charSequence;
            this.f8052H0.mo8947a(charSequence);
            if (!this.f8050G0) {
                m11506z();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f8105t != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f8107u = appCompatTextView;
                appCompatTextView.setId(C4410f.textinput_placeholder);
                C3379v.m13818g(this.f8107u, 1);
                setPlaceholderTextAppearance(this.f8111w);
                setPlaceholderTextColor(this.f8109v);
                m11488h();
            } else {
                m11443A();
                this.f8107u = null;
            }
            this.f8105t = z;
        }
    }

    /* renamed from: t */
    private void m11500t() {
        Iterator it = this.f8080g0.iterator();
        while (it.hasNext()) {
            ((C2757f) it.next()).mo9312a(this);
        }
    }

    /* renamed from: u */
    private boolean m11501u() {
        return this.f8082h0 != 0;
    }

    /* renamed from: v */
    private void m11502v() {
        TextView textView = this.f8107u;
        if (textView != null && this.f8105t) {
            textView.setText(null);
            this.f8107u.setVisibility(4);
        }
    }

    /* renamed from: w */
    private boolean m11503w() {
        return this.f8106t0.getVisibility() == 0;
    }

    /* renamed from: x */
    private boolean m11504x() {
        return this.f8057K == 1 && (VERSION.SDK_INT < 16 || this.f8085j.getMinLines() <= 1);
    }

    /* renamed from: y */
    private void m11505y() {
        m11493m();
        m11444B();
        mo9184g();
        if (this.f8057K != 0) {
            m11453K();
        }
    }

    /* renamed from: z */
    private void m11506z() {
        if (m11499s()) {
            RectF rectF = this.f8068T;
            this.f8052H0.mo8945a(rectF, this.f8085j.getWidth(), this.f8085j.getGravity());
            m11466a(rectF);
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            ((C2771c) this.f8049G).mo9330a(rectF);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9167a(float f) {
        if (this.f8052H0.mo8961f() != f) {
            if (this.f8056J0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f8056J0 = valueAnimator;
                valueAnimator.setInterpolator(C4417a.f11713b);
                this.f8056J0.setDuration(167);
                this.f8056J0.addUpdateListener(new C2755d());
            }
            this.f8056J0.setFloatValues(new float[]{this.f8052H0.mo8961f(), f});
            this.f8056J0.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9168a(int i) {
        boolean z = this.f8095o;
        int i2 = this.f8093n;
        if (i2 == -1) {
            this.f8097p.setText(String.valueOf(i));
            this.f8097p.setContentDescription(null);
            this.f8095o = false;
        } else {
            this.f8095o = i > i2;
            m11464a(getContext(), this.f8097p, i, this.f8093n, this.f8095o);
            if (z != this.f8095o) {
                m11450H();
            }
            this.f8097p.setText(getContext().getString(C4414j.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f8093n)}));
        }
        if (this.f8085j != null && z != this.f8095o) {
            mo9172a(false);
            mo9184g();
            mo9183f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9169a(TextView textView, int i) {
        boolean z = true;
        try {
            C0391i.m2039d(textView, i);
            if (VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C0391i.m2039d(textView, C4415k.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C3236a.m13263a(getContext(), C4405c.design_error));
        }
    }

    /* renamed from: a */
    public void mo9170a(C2757f fVar) {
        this.f8080g0.add(fVar);
        if (this.f8085j != null) {
            fVar.mo9312a(this);
        }
    }

    /* renamed from: a */
    public void mo9171a(C2758g gVar) {
        this.f8088k0.add(gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9172a(boolean z) {
        m11473a(z, false);
    }

    /* renamed from: a */
    public boolean mo9173a() {
        return this.f8083i.getVisibility() == 0 && this.f8086j0.getVisibility() == 0;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            LayoutParams layoutParams2 = new LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f8077f.addView(view, layoutParams2);
            this.f8077f.setLayoutParams(layoutParams);
            m11453K();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public boolean mo9175b() {
        return this.f8089l.mo9368m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo9176c() {
        return this.f8050G0;
    }

    /* renamed from: d */
    public boolean mo9177d() {
        return this.f8047F;
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f8087k != null) {
            EditText editText = this.f8085j;
            if (editText != null) {
                boolean z = this.f8047F;
                this.f8047F = false;
                CharSequence hint = editText.getHint();
                this.f8085j.setHint(this.f8087k);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, i);
                    return;
                } finally {
                    this.f8085j.setHint(hint);
                    this.f8047F = z;
                }
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f8060L0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f8060L0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m11478b(canvas);
        m11465a(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f8058K0) {
            boolean z = true;
            this.f8058K0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C2699a aVar = this.f8052H0;
            boolean a = aVar != null ? aVar.mo8948a(drawableState) | false : false;
            if (this.f8085j != null) {
                if (!C3379v.m13768D(this) || !isEnabled()) {
                    z = false;
                }
                mo9172a(z);
            }
            mo9183f();
            mo9184g();
            if (a) {
                invalidate();
            }
            this.f8058K0 = false;
        }
    }

    /* renamed from: e */
    public boolean mo9182e() {
        return this.f8070V.getVisibility() == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo9183f() {
        int currentTextColor;
        EditText editText = this.f8085j;
        if (editText != null && this.f8057K == 0) {
            Drawable background = editText.getBackground();
            if (background != null) {
                if (C0189a0.m976a(background)) {
                    background = background.mutate();
                }
                if (this.f8089l.mo9358c()) {
                    currentTextColor = this.f8089l.mo9361f();
                } else {
                    if (this.f8095o) {
                        TextView textView = this.f8097p;
                        if (textView != null) {
                            currentTextColor = textView.getCurrentTextColor();
                        }
                    }
                    C0371a.m1905b(background);
                    this.f8085j.refreshDrawableState();
                }
                background.setColorFilter(C0236j.m1167a(currentTextColor, Mode.SRC_IN));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9184g() {
        /*
            r6 = this;
            g.d.a.c.b0.g r0 = r6.f8049G
            if (r0 == 0) goto L_0x00e7
            int r0 = r6.f8057K
            if (r0 != 0) goto L_0x000a
            goto L_0x00e7
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f8085j
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.f8085j
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.f8048F0
        L_0x003c:
            r6.f8064P = r4
            goto L_0x0075
        L_0x003f:
            com.google.android.material.textfield.f r4 = r6.f8089l
            boolean r4 = r4.mo9358c()
            if (r4 == 0) goto L_0x0056
            android.content.res.ColorStateList r4 = r6.f8038A0
            if (r4 == 0) goto L_0x004f
        L_0x004b:
            r6.m11481b(r0, r3)
            goto L_0x0075
        L_0x004f:
            com.google.android.material.textfield.f r4 = r6.f8089l
            int r4 = r4.mo9361f()
            goto L_0x003c
        L_0x0056:
            boolean r4 = r6.f8095o
            if (r4 == 0) goto L_0x0068
            android.widget.TextView r4 = r6.f8097p
            if (r4 == 0) goto L_0x0068
            android.content.res.ColorStateList r5 = r6.f8038A0
            if (r5 == 0) goto L_0x0063
            goto L_0x004b
        L_0x0063:
            int r4 = r4.getCurrentTextColor()
            goto L_0x003c
        L_0x0068:
            if (r0 == 0) goto L_0x006d
            int r4 = r6.f8118z0
            goto L_0x003c
        L_0x006d:
            if (r3 == 0) goto L_0x0072
            int r4 = r6.f8116y0
            goto L_0x003c
        L_0x0072:
            int r4 = r6.f8114x0
            goto L_0x003c
        L_0x0075:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x008c
            com.google.android.material.textfield.f r4 = r6.f8089l
            boolean r4 = r4.mo9367l()
            if (r4 == 0) goto L_0x008c
            com.google.android.material.textfield.f r4 = r6.f8089l
            boolean r4 = r4.mo9358c()
            if (r4 == 0) goto L_0x008c
            r1 = 1
        L_0x008c:
            r6.setErrorIconVisible(r1)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f8106t0
            android.content.res.ColorStateList r4 = r6.f8108u0
            r6.m11468a(r1, r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f8070V
            android.content.res.ColorStateList r4 = r6.f8071W
            r6.m11468a(r1, r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f8086j0
            android.content.res.ColorStateList r4 = r6.f8090l0
            r6.m11468a(r1, r4)
            com.google.android.material.textfield.e r1 = r6.getEndIconDelegate()
            boolean r1 = r1.mo9332b()
            if (r1 == 0) goto L_0x00b7
            com.google.android.material.textfield.f r1 = r6.f8089l
            boolean r1 = r1.mo9358c()
            r6.m11487d(r1)
        L_0x00b7:
            if (r0 == 0) goto L_0x00c2
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00c2
            int r1 = r6.f8063O
            goto L_0x00c4
        L_0x00c2:
            int r1 = r6.f8062N
        L_0x00c4:
            r6.f8061M = r1
            int r1 = r6.f8057K
            if (r1 != r2) goto L_0x00e4
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00d5
            int r0 = r6.f8042C0
        L_0x00d2:
            r6.f8065Q = r0
            goto L_0x00e4
        L_0x00d5:
            if (r3 == 0) goto L_0x00dc
            if (r0 != 0) goto L_0x00dc
            int r0 = r6.f8046E0
            goto L_0x00d2
        L_0x00dc:
            if (r0 == 0) goto L_0x00e1
            int r0 = r6.f8044D0
            goto L_0x00d2
        L_0x00e1:
            int r0 = r6.f8040B0
            goto L_0x00d2
        L_0x00e4:
            r6.m11489i()
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo9184g():void");
    }

    public int getBaseline() {
        EditText editText = this.f8085j;
        return editText != null ? editText.getBaseline() + getPaddingTop() + m11495o() : super.getBaseline();
    }

    /* access modifiers changed from: 0000 */
    public C4382g getBoxBackground() {
        int i = this.f8057K;
        if (i == 1 || i == 2) {
            return this.f8049G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f8065Q;
    }

    public int getBoxBackgroundMode() {
        return this.f8057K;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f8049G.mo13063b();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f8049G.mo13067c();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f8049G.mo13087o();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f8049G.mo13086n();
    }

    public int getBoxStrokeColor() {
        return this.f8118z0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f8038A0;
    }

    public int getCounterMaxLength() {
        return this.f8093n;
    }

    /* access modifiers changed from: 0000 */
    public CharSequence getCounterOverflowDescription() {
        if (this.f8091m && this.f8095o) {
            TextView textView = this.f8097p;
            if (textView != null) {
                return textView.getContentDescription();
            }
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f8113x;
    }

    public ColorStateList getCounterTextColor() {
        return this.f8113x;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f8110v0;
    }

    public EditText getEditText() {
        return this.f8085j;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f8086j0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f8086j0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f8082h0;
    }

    /* access modifiers changed from: 0000 */
    public CheckableImageButton getEndIconView() {
        return this.f8086j0;
    }

    public CharSequence getError() {
        if (this.f8089l.mo9367l()) {
            return this.f8089l.mo9360e();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f8089l.mo9359d();
    }

    public int getErrorCurrentTextColors() {
        return this.f8089l.mo9361f();
    }

    public Drawable getErrorIconDrawable() {
        return this.f8106t0.getDrawable();
    }

    /* access modifiers changed from: 0000 */
    public final int getErrorTextCurrentColor() {
        return this.f8089l.mo9361f();
    }

    public CharSequence getHelperText() {
        if (this.f8089l.mo9368m()) {
            return this.f8089l.mo9363h();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f8089l.mo9364i();
    }

    public CharSequence getHint() {
        if (this.f8043D) {
            return this.f8045E;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final float getHintCollapsedTextHeight() {
        return this.f8052H0.mo8957c();
    }

    /* access modifiers changed from: 0000 */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f8052H0.mo8959d();
    }

    public ColorStateList getHintTextColor() {
        return this.f8112w0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f8086j0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f8086j0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f8105t) {
            return this.f8103s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f8111w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f8109v;
    }

    public CharSequence getPrefixText() {
        return this.f8117z;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f8037A.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f8037A;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f8070V.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f8070V.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f8039B;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f8041C.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f8041C;
    }

    public Typeface getTypeface() {
        return this.f8069U;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f8085j;
        if (editText != null) {
            Rect rect = this.f8066R;
            C2701b.m11248a((ViewGroup) this, (View) editText, rect);
            m11485c(rect);
            if (this.f8043D) {
                int gravity = this.f8085j.getGravity() & -113;
                this.f8052H0.mo8951b(gravity | 48);
                this.f8052H0.mo8958c(gravity);
                this.f8052H0.mo8944a(m11463a(rect));
                this.f8052H0.mo8955b(m11476b(rect));
                this.f8052H0.mo8964i();
                if (m11499s() && !this.f8050G0) {
                    m11506z();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean J = m11452J();
        boolean I = m11451I();
        if (J || I) {
            this.f8085j.post(new C2754c());
        }
        m11454L();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2759h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2759h hVar = (C2759h) parcelable;
        super.onRestoreInstanceState(hVar.mo10880a());
        setError(hVar.f8124h);
        if (hVar.f8125i) {
            this.f8086j0.post(new C2753b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C2759h hVar = new C2759h(super.onSaveInstanceState());
        if (this.f8089l.mo9358c()) {
            hVar.f8124h = getError();
        }
        hVar.f8125i = m11501u() && this.f8086j0.isChecked();
        return hVar;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f8065Q != i) {
            this.f8065Q = i;
            this.f8040B0 = i;
            m11489i();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C3236a.m13263a(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f8057K) {
            this.f8057K = i;
            if (this.f8085j != null) {
                m11505y();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f8118z0 != i) {
            this.f8118z0 = i;
            mo9184g();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f8114x0 = colorStateList.getDefaultColor();
            this.f8048F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f8116y0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f8118z0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            mo9184g();
        }
        this.f8118z0 = defaultColor;
        mo9184g();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f8038A0 != colorStateList) {
            this.f8038A0 = colorStateList;
            mo9184g();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f8091m != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f8097p = appCompatTextView;
                appCompatTextView.setId(C4410f.textinput_counter);
                Typeface typeface = this.f8069U;
                if (typeface != null) {
                    this.f8097p.setTypeface(typeface);
                }
                this.f8097p.setMaxLines(1);
                this.f8089l.mo9346a(this.f8097p, 2);
                C3364g.m13721b((MarginLayoutParams) this.f8097p.getLayoutParams(), getResources().getDimensionPixelOffset(C4408d.mtrl_textinput_counter_margin_start));
                m11450H();
                m11449G();
            } else {
                this.f8089l.mo9353b(this.f8097p, 2);
                this.f8097p = null;
            }
            this.f8091m = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f8093n != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f8093n = i;
            if (this.f8091m) {
                m11449G();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f8099q != i) {
            this.f8099q = i;
            m11450H();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f8115y != colorStateList) {
            this.f8115y = colorStateList;
            m11450H();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f8101r != i) {
            this.f8101r = i;
            m11450H();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f8113x != colorStateList) {
            this.f8113x = colorStateList;
            m11450H();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f8110v0 = colorStateList;
        this.f8112w0 = colorStateList;
        if (this.f8085j != null) {
            mo9172a(false);
        }
    }

    public void setEnabled(boolean z) {
        m11467a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f8086j0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f8086j0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f8086j0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C3103a.m12557c(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f8086j0.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f8082h0;
        this.f8082h0 = i;
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo9331a(this.f8057K)) {
            getEndIconDelegate().mo9318a();
            m11491k();
            m11477b(i2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The current box background mode ");
        sb.append(this.f8057K);
        sb.append(" is not supported by the end icon mode ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public void setEndIconOnClickListener(OnClickListener onClickListener) {
        m11469a(this.f8086j0, onClickListener, this.f8104s0);
    }

    public void setEndIconOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f8104s0 = onLongClickListener;
        m11479b(this.f8086j0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f8090l0 != colorStateList) {
            this.f8090l0 = colorStateList;
            this.f8092m0 = true;
            m11491k();
        }
    }

    public void setEndIconTintMode(Mode mode) {
        if (this.f8094n0 != mode) {
            this.f8094n0 = mode;
            this.f8096o0 = true;
            m11491k();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo9173a() != z) {
            this.f8086j0.setVisibility(z ? 0 : 8);
            m11458P();
            m11451I();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f8089l.mo9367l()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f8089l.mo9354b(charSequence);
        } else {
            this.f8089l.mo9365j();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f8089l.mo9347a(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f8089l.mo9348a(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C3103a.m12557c(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f8106t0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f8089l.mo9367l());
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f8108u0 = colorStateList;
        Drawable drawable = this.f8106t0.getDrawable();
        if (drawable != null) {
            drawable = C0371a.m1913i(drawable).mutate();
            C0371a.m1898a(drawable, colorStateList);
        }
        if (this.f8106t0.getDrawable() != drawable) {
            this.f8106t0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(Mode mode) {
        Drawable drawable = this.f8106t0.getDrawable();
        if (drawable != null) {
            drawable = C0371a.m1913i(drawable).mutate();
            C0371a.m1901a(drawable, mode);
        }
        if (this.f8106t0.getDrawable() != drawable) {
            this.f8106t0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f8089l.mo9351b(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f8089l.mo9344a(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo9175b()) {
                setHelperTextEnabled(true);
            }
            this.f8089l.mo9357c(charSequence);
        } else if (mo9175b()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f8089l.mo9352b(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f8089l.mo9355b(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f8089l.mo9356c(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f8043D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f8054I0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f8043D) {
            this.f8043D = z;
            if (!z) {
                this.f8047F = false;
                if (!TextUtils.isEmpty(this.f8045E) && TextUtils.isEmpty(this.f8085j.getHint())) {
                    this.f8085j.setHint(this.f8045E);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f8085j.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f8045E)) {
                        setHint(hint);
                    }
                    this.f8085j.setHint(null);
                }
                this.f8047F = true;
            }
            if (this.f8085j != null) {
                m11453K();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f8052H0.mo8939a(i);
        this.f8112w0 = this.f8052H0.mo8949b();
        if (this.f8085j != null) {
            mo9172a(false);
            m11453K();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f8112w0 != colorStateList) {
            if (this.f8110v0 == null) {
                this.f8052H0.mo8942a(colorStateList);
            }
            this.f8112w0 = colorStateList;
            if (this.f8085j != null) {
                mo9172a(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f8086j0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C3103a.m12557c(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f8086j0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f8082h0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f8090l0 = colorStateList;
        this.f8092m0 = true;
        m11491k();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(Mode mode) {
        this.f8094n0 = mode;
        this.f8096o0 = true;
        m11491k();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.f8105t || !TextUtils.isEmpty(charSequence)) {
            if (!this.f8105t) {
                setPlaceholderTextEnabled(true);
            }
            this.f8103s = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        m11455M();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f8111w = i;
        TextView textView = this.f8107u;
        if (textView != null) {
            C0391i.m2039d(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f8109v != colorStateList) {
            this.f8109v = colorStateList;
            TextView textView = this.f8107u;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f8117z = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8037A.setText(charSequence);
        m11457O();
    }

    public void setPrefixTextAppearance(int i) {
        C0391i.m2039d(this.f8037A, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f8037A.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f8070V.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f8070V.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C3103a.m12557c(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f8070V.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m11492l();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(OnClickListener onClickListener) {
        m11469a(this.f8070V, onClickListener, this.f8078f0);
    }

    public void setStartIconOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f8078f0 = onLongClickListener;
        m11479b(this.f8070V, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f8071W != colorStateList) {
            this.f8071W = colorStateList;
            this.f8072a0 = true;
            m11492l();
        }
    }

    public void setStartIconTintMode(Mode mode) {
        if (this.f8073b0 != mode) {
            this.f8073b0 = mode;
            this.f8074c0 = true;
            m11492l();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (mo9182e() != z) {
            this.f8070V.setVisibility(z ? 0 : 8);
            m11456N();
            m11451I();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f8039B = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8041C.setText(charSequence);
        m11459Q();
    }

    public void setSuffixTextAppearance(int i) {
        C0391i.m2039d(this.f8041C, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f8041C.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C2756e eVar) {
        EditText editText = this.f8085j;
        if (editText != null) {
            C3379v.m13788a((View) editText, (C3323a) eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f8069U) {
            this.f8069U = typeface;
            this.f8052H0.mo8956b(typeface);
            this.f8089l.mo9345a(typeface);
            TextView textView = this.f8097p;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }
}
