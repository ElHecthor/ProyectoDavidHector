package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.AutoCompleteTextView.OnDismissListener;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout.C2756e;
import com.google.android.material.textfield.TextInputLayout.C2757f;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4409e;
import p147g.p156d.p157a.p185c.C4414j;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p187b0.C4389k.C4391b;
import p147g.p156d.p157a.p185c.p189m.C4417a;
import p147g.p156d.p157a.p185c.p195r.C4445a;

/* renamed from: com.google.android.material.textfield.d */
class C2772d extends C2783e {

    /* renamed from: o */
    private static final boolean f8141o = (VERSION.SDK_INT >= 21);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f8142d = new C2773a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2756e f8143e = new C2775b(this.f8165a);

    /* renamed from: f */
    private final C2757f f8144f = new C2776c();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f8145g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f8146h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f8147i = Long.MAX_VALUE;

    /* renamed from: j */
    private StateListDrawable f8148j;

    /* renamed from: k */
    private C4382g f8149k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public AccessibilityManager f8150l;

    /* renamed from: m */
    private ValueAnimator f8151m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ValueAnimator f8152n;

    /* renamed from: com.google.android.material.textfield.d$a */
    class C2773a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        class C2774a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ AutoCompleteTextView f8154f;

            C2774a(AutoCompleteTextView autoCompleteTextView) {
                this.f8154f = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f8154f.isPopupShowing();
                C2772d.this.m11557b(isPopupShowing);
                C2772d.this.f8145g = isPopupShowing;
            }
        }

        C2773a() {
        }

        public void afterTextChanged(Editable editable) {
            C2772d dVar = C2772d.this;
            AutoCompleteTextView a = dVar.m11546a(dVar.f8165a.getEditText());
            a.post(new C2774a(a));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.d$b */
    class C2775b extends C2756e {
        C2775b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            super.mo2349a(view, cVar);
            cVar.mo10745a((CharSequence) Spinner.class.getName());
            if (cVar.mo10796t()) {
                cVar.mo10765d((CharSequence) null);
            }
        }

        /* renamed from: c */
        public void mo3963c(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3963c(view, accessibilityEvent);
            C2772d dVar = C2772d.this;
            AutoCompleteTextView a = dVar.m11546a(dVar.f8165a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C2772d.this.f8150l.isTouchExplorationEnabled()) {
                C2772d.this.m11565d(a);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    class C2776c implements C2757f {
        C2776c() {
        }

        /* renamed from: a */
        public void mo9312a(TextInputLayout textInputLayout) {
            AutoCompleteTextView a = C2772d.this.m11546a(textInputLayout.getEditText());
            C2772d.this.m11554b(a);
            C2772d.this.m11549a(a);
            C2772d.this.m11562c(a);
            a.setThreshold(0);
            a.removeTextChangedListener(C2772d.this.f8142d);
            a.addTextChangedListener(C2772d.this.f8142d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C2772d.this.f8143e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    class C2777d implements OnClickListener {
        C2777d() {
        }

        public void onClick(View view) {
            C2772d.this.m11565d((AutoCompleteTextView) C2772d.this.f8165a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    class C2778e implements OnTouchListener {

        /* renamed from: f */
        final /* synthetic */ AutoCompleteTextView f8159f;

        C2778e(AutoCompleteTextView autoCompleteTextView) {
            this.f8159f = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C2772d.this.m11567d()) {
                    C2772d.this.f8145g = false;
                }
                C2772d.this.m11565d(this.f8159f);
                view.performClick();
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    class C2779f implements OnFocusChangeListener {
        C2779f() {
        }

        public void onFocusChange(View view, boolean z) {
            C2772d.this.f8165a.setEndIconActivated(z);
            if (!z) {
                C2772d.this.m11557b(false);
                C2772d.this.f8145g = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    class C2780g implements OnDismissListener {
        C2780g() {
        }

        public void onDismiss() {
            C2772d.this.f8145g = true;
            C2772d.this.f8147i = System.currentTimeMillis();
            C2772d.this.m11557b(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$h */
    class C2781h extends AnimatorListenerAdapter {
        C2781h() {
        }

        public void onAnimationEnd(Animator animator) {
            C2772d dVar = C2772d.this;
            dVar.f8167c.setChecked(dVar.f8146h);
            C2772d.this.f8152n.start();
        }
    }

    /* renamed from: com.google.android.material.textfield.d$i */
    class C2782i implements AnimatorUpdateListener {
        C2782i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2772d.this.f8167c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    C2772d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    private ValueAnimator m11545a(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C4417a.f11712a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C2782i());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AutoCompleteTextView m11546a(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: a */
    private C4382g m11548a(float f, float f2, float f3, int i) {
        C4391b n = C4389k.m17888n();
        n.mo13129d(f);
        n.mo13133e(f);
        n.mo13121b(f2);
        n.mo13125c(f2);
        C4389k a = n.mo13120a();
        C4382g a2 = C4382g.m17816a(this.f8166b, f3);
        a2.setShapeAppearanceModel(a);
        a2.mo13057a(0, i, 0, i);
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11549a(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.f8165a.getBoxBackgroundMode();
            C4382g boxBackground = this.f8165a.getBoxBackground();
            int a = C4445a.m18120a((View) autoCompleteTextView, C4375b.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m11555b(autoCompleteTextView, a, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m11550a(autoCompleteTextView, a, iArr, boxBackground);
            }
        }
    }

    /* renamed from: a */
    private void m11550a(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C4382g gVar) {
        int boxBackgroundColor = this.f8165a.getBoxBackgroundColor();
        int[] iArr2 = {C4445a.m18117a(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f8141o) {
            C3379v.m13787a((View) autoCompleteTextView, (Drawable) new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        C4382g gVar2 = new C4382g(gVar.mo13083l());
        gVar2.mo13059a(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int u = C3379v.m13834u(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int t = C3379v.m13833t(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C3379v.m13787a((View) autoCompleteTextView, (Drawable) layerDrawable);
        C3379v.m13783a(autoCompleteTextView, u, paddingTop, t, paddingBottom);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11554b(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f8141o) {
            int boxBackgroundMode = this.f8165a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.f8149k;
            } else if (boxBackgroundMode == 1) {
                drawable = this.f8148j;
            } else {
                return;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    /* renamed from: b */
    private void m11555b(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C4382g gVar) {
        LayerDrawable layerDrawable;
        int a = C4445a.m18120a((View) autoCompleteTextView, C4375b.colorSurface);
        C4382g gVar2 = new C4382g(gVar.mo13083l());
        int a2 = C4445a.m18117a(i, a, 0.1f);
        gVar2.mo13059a(new ColorStateList(iArr, new int[]{a2, 0}));
        if (f8141o) {
            gVar2.setTint(a);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{a2, a});
            C4382g gVar3 = new C4382g(gVar.mo13083l());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        C3379v.m13787a((View) autoCompleteTextView, (Drawable) layerDrawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11557b(boolean z) {
        if (this.f8146h != z) {
            this.f8146h = z;
            this.f8152n.cancel();
            this.f8151m.start();
        }
    }

    /* renamed from: c */
    private void m11561c() {
        this.f8152n = m11545a(67, 0.0f, 1.0f);
        ValueAnimator a = m11545a(50, 1.0f, 0.0f);
        this.f8151m = a;
        a.addListener(new C2781h());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11562c(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new C2778e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new C2779f());
        if (f8141o) {
            autoCompleteTextView.setOnDismissListener(new C2780g());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m11565d(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (m11567d()) {
                this.f8145g = false;
            }
            if (!this.f8145g) {
                if (f8141o) {
                    m11557b(!this.f8146h);
                } else {
                    this.f8146h = !this.f8146h;
                    this.f8167c.toggle();
                }
                if (this.f8146h) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                } else {
                    autoCompleteTextView.dismissDropDown();
                }
            } else {
                this.f8145g = false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m11567d() {
        long currentTimeMillis = System.currentTimeMillis() - this.f8147i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9318a() {
        float dimensionPixelOffset = (float) this.f8166b.getResources().getDimensionPixelOffset(C4408d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f8166b.getResources().getDimensionPixelOffset(C4408d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f8166b.getResources().getDimensionPixelOffset(C4408d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C4382g a = m11548a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C4382g a2 = m11548a(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f8149k = a;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f8148j = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, a);
        this.f8148j.addState(new int[0], a2);
        this.f8165a.setEndIconDrawable(C3103a.m12557c(this.f8166b, f8141o ? C4409e.mtrl_dropdown_arrow : C4409e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f8165a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C4414j.exposed_dropdown_menu_content_description));
        this.f8165a.setEndIconOnClickListener(new C2777d());
        this.f8165a.mo9170a(this.f8144f);
        m11561c();
        C3379v.m13820h(this.f8167c, 2);
        this.f8150l = (AccessibilityManager) this.f8166b.getSystemService("accessibility");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9331a(int i) {
        return i != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo9332b() {
        return true;
    }
}
