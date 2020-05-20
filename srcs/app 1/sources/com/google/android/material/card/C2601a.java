package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.drawable.C0371a;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4410f;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p187b0.C4379d;
import p147g.p156d.p157a.p185c.p187b0.C4380e;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4388j;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p187b0.C4389k.C4391b;
import p147g.p156d.p157a.p185c.p195r.C4445a;
import p147g.p156d.p157a.p185c.p202y.C4459c;
import p147g.p156d.p157a.p185c.p203z.C4468b;

/* renamed from: com.google.android.material.card.a */
class C2601a {

    /* renamed from: t */
    private static final int[] f7429t = {16842912};

    /* renamed from: u */
    private static final double f7430u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    private final MaterialCardView f7431a;

    /* renamed from: b */
    private final Rect f7432b = new Rect();

    /* renamed from: c */
    private final C4382g f7433c;

    /* renamed from: d */
    private final C4382g f7434d;

    /* renamed from: e */
    private final int f7435e;

    /* renamed from: f */
    private final int f7436f;

    /* renamed from: g */
    private int f7437g;

    /* renamed from: h */
    private Drawable f7438h;

    /* renamed from: i */
    private Drawable f7439i;

    /* renamed from: j */
    private ColorStateList f7440j;

    /* renamed from: k */
    private ColorStateList f7441k;

    /* renamed from: l */
    private C4389k f7442l;

    /* renamed from: m */
    private ColorStateList f7443m;

    /* renamed from: n */
    private Drawable f7444n;

    /* renamed from: o */
    private LayerDrawable f7445o;

    /* renamed from: p */
    private C4382g f7446p;

    /* renamed from: q */
    private C4382g f7447q;

    /* renamed from: r */
    private boolean f7448r = false;

    /* renamed from: s */
    private boolean f7449s;

    /* renamed from: com.google.android.material.card.a$a */
    class C2602a extends InsetDrawable {
        C2602a(C2601a aVar, Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public C2601a(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f7431a = materialCardView;
        C4382g gVar = new C4382g(materialCardView.getContext(), attributeSet, i, i2);
        this.f7433c = gVar;
        gVar.mo13058a(materialCardView.getContext());
        this.f7433c.mo13056a(-12303292);
        C4391b m = this.f7433c.mo13083l().mo13115m();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C4416l.CardView, i, C4415k.CardView);
        if (obtainStyledAttributes.hasValue(C4416l.CardView_cardCornerRadius)) {
            m.mo13116a(obtainStyledAttributes.getDimension(C4416l.CardView_cardCornerRadius, 0.0f));
        }
        this.f7434d = new C4382g();
        mo8262a(m.mo13120a());
        Resources resources = materialCardView.getResources();
        this.f7435e = resources.getDimensionPixelSize(C4408d.mtrl_card_checked_icon_margin);
        this.f7436f = resources.getDimensionPixelSize(C4408d.mtrl_card_checked_icon_size);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A */
    private Drawable m10580A() {
        if (!C4468b.f11823a) {
            return m10595z();
        }
        this.f7447q = m10581B();
        return new RippleDrawable(this.f7440j, null, this.f7447q);
    }

    /* renamed from: B */
    private C4382g m10581B() {
        return new C4382g(this.f7442l);
    }

    /* renamed from: C */
    private Drawable m10582C() {
        if (this.f7444n == null) {
            this.f7444n = m10580A();
        }
        if (this.f7445o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f7444n, this.f7434d, m10594y()});
            this.f7445o = layerDrawable;
            layerDrawable.setId(2, C4410f.mtrl_card_checked_layer_id);
        }
        return this.f7445o;
    }

    /* renamed from: D */
    private float m10583D() {
        if (!this.f7431a.getPreventCornerOverlap() || (VERSION.SDK_INT >= 21 && !this.f7431a.getUseCompatPadding())) {
            return 0.0f;
        }
        return (float) ((1.0d - f7430u) * ((double) this.f7431a.getCardViewRadius()));
    }

    /* renamed from: E */
    private boolean m10584E() {
        return this.f7431a.getPreventCornerOverlap() && !m10593x();
    }

    /* renamed from: F */
    private boolean m10585F() {
        return this.f7431a.getPreventCornerOverlap() && m10593x() && this.f7431a.getUseCompatPadding();
    }

    /* renamed from: G */
    private void m10586G() {
        if (C4468b.f11823a) {
            Drawable drawable = this.f7444n;
            if (drawable != null) {
                ((RippleDrawable) drawable).setColor(this.f7440j);
                return;
            }
        }
        C4382g gVar = this.f7446p;
        if (gVar != null) {
            gVar.mo13059a(this.f7440j);
        }
    }

    /* renamed from: a */
    private float m10587a(C4379d dVar, float f) {
        if (dVar instanceof C4388j) {
            return (float) ((1.0d - f7430u) * ((double) f));
        }
        if (dVar instanceof C4380e) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: b */
    private Drawable m10588b(Drawable drawable) {
        int i;
        int i2;
        if ((VERSION.SDK_INT < 21) || this.f7431a.getUseCompatPadding()) {
            i2 = (int) Math.ceil((double) m10591v());
            i = (int) Math.ceil((double) m10592w());
        } else {
            i2 = 0;
            i = 0;
        }
        C2602a aVar = new C2602a(this, drawable, i2, i, i2, i);
        return aVar;
    }

    /* renamed from: c */
    private void m10589c(Drawable drawable) {
        if (VERSION.SDK_INT < 23 || !(this.f7431a.getForeground() instanceof InsetDrawable)) {
            this.f7431a.setForeground(m10588b(drawable));
        } else {
            ((InsetDrawable) this.f7431a.getForeground()).setDrawable(drawable);
        }
    }

    /* renamed from: u */
    private float m10590u() {
        return Math.max(Math.max(m10587a(this.f7442l.mo13111i(), this.f7433c.mo13086n()), m10587a(this.f7442l.mo13113k(), this.f7433c.mo13087o())), Math.max(m10587a(this.f7442l.mo13106d(), this.f7433c.mo13067c()), m10587a(this.f7442l.mo13104b(), this.f7433c.mo13063b())));
    }

    /* renamed from: v */
    private float m10591v() {
        return this.f7431a.getMaxCardElevation() + (m10585F() ? m10590u() : 0.0f);
    }

    /* renamed from: w */
    private float m10592w() {
        return (this.f7431a.getMaxCardElevation() * 1.5f) + (m10585F() ? m10590u() : 0.0f);
    }

    /* renamed from: x */
    private boolean m10593x() {
        return VERSION.SDK_INT >= 21 && this.f7433c.mo13092s();
    }

    /* renamed from: y */
    private Drawable m10594y() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f7439i;
        if (drawable != null) {
            stateListDrawable.addState(f7429t, drawable);
        }
        return stateListDrawable;
    }

    /* renamed from: z */
    private Drawable m10595z() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C4382g B = m10581B();
        this.f7446p = B;
        B.mo13059a(this.f7440j);
        stateListDrawable.addState(new int[]{16842919}, this.f7446p);
        return stateListDrawable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8254a() {
        Drawable drawable = this.f7444n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f7444n.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f7444n.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8255a(float f) {
        mo8262a(this.f7442l.mo13101a(f));
        this.f7438h.invalidateSelf();
        if (m10585F() || m10584E()) {
            mo8284q();
        }
        if (m10585F()) {
            mo8286s();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8256a(int i) {
        if (i != this.f7437g) {
            this.f7437g = i;
            mo8287t();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8257a(int i, int i2) {
        int i3;
        int i4;
        if (this.f7445o != null) {
            int i5 = this.f7435e;
            int i6 = i - i5;
            int i7 = this.f7436f;
            int i8 = i6 - i7;
            int i9 = (i2 - i5) - i7;
            if (C3379v.m13829p(this.f7431a) == 1) {
                i3 = i8;
                i4 = i5;
            } else {
                i4 = i8;
                i3 = i5;
            }
            this.f7445o.setLayerInset(2, i4, this.f7435e, i3, i9);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8258a(int i, int i2, int i3, int i4) {
        this.f7432b.set(i, i2, i3, i4);
        mo8284q();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8259a(ColorStateList colorStateList) {
        this.f7433c.mo13059a(colorStateList);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8260a(TypedArray typedArray) {
        ColorStateList a = C4459c.m18175a(this.f7431a.getContext(), typedArray, C4416l.MaterialCardView_strokeColor);
        this.f7443m = a;
        if (a == null) {
            this.f7443m = ColorStateList.valueOf(-1);
        }
        this.f7437g = typedArray.getDimensionPixelSize(C4416l.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(C4416l.MaterialCardView_android_checkable, false);
        this.f7449s = z;
        this.f7431a.setLongClickable(z);
        this.f7441k = C4459c.m18175a(this.f7431a.getContext(), typedArray, C4416l.MaterialCardView_checkedIconTint);
        mo8261a(C4459c.m18177b(this.f7431a.getContext(), typedArray, C4416l.MaterialCardView_checkedIcon));
        ColorStateList a2 = C4459c.m18175a(this.f7431a.getContext(), typedArray, C4416l.MaterialCardView_rippleColor);
        this.f7440j = a2;
        if (a2 == null) {
            this.f7440j = ColorStateList.valueOf(C4445a.m18120a((View) this.f7431a, C4375b.colorControlHighlight));
        }
        ColorStateList a3 = C4459c.m18175a(this.f7431a.getContext(), typedArray, C4416l.MaterialCardView_cardForegroundColor);
        C4382g gVar = this.f7434d;
        if (a3 == null) {
            a3 = ColorStateList.valueOf(0);
        }
        gVar.mo13059a(a3);
        m10586G();
        mo8285r();
        mo8287t();
        this.f7431a.setBackgroundInternal(m10588b((Drawable) this.f7433c));
        Drawable C = this.f7431a.isClickable() ? m10582C() : this.f7434d;
        this.f7438h = C;
        this.f7431a.setForeground(m10588b(C));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8261a(Drawable drawable) {
        this.f7439i = drawable;
        if (drawable != null) {
            Drawable i = C0371a.m1913i(drawable.mutate());
            this.f7439i = i;
            C0371a.m1898a(i, this.f7441k);
        }
        if (this.f7445o != null) {
            this.f7445o.setDrawableByLayerId(C4410f.mtrl_card_checked_layer_id, m10594y());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8262a(C4389k kVar) {
        this.f7442l = kVar;
        this.f7433c.setShapeAppearanceModel(kVar);
        C4382g gVar = this.f7433c;
        gVar.mo13062a(!gVar.mo13092s());
        C4382g gVar2 = this.f7434d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        C4382g gVar3 = this.f7447q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        C4382g gVar4 = this.f7446p;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8263a(boolean z) {
        this.f7448r = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C4382g mo8264b() {
        return this.f7433c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8265b(float f) {
        this.f7433c.mo13068c(f);
        C4382g gVar = this.f7434d;
        if (gVar != null) {
            gVar.mo13068c(f);
        }
        C4382g gVar2 = this.f7447q;
        if (gVar2 != null) {
            gVar2.mo13068c(f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8266b(ColorStateList colorStateList) {
        this.f7441k = colorStateList;
        Drawable drawable = this.f7439i;
        if (drawable != null) {
            C0371a.m1898a(drawable, colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8267b(boolean z) {
        this.f7449s = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public ColorStateList mo8268c() {
        return this.f7433c.mo13073f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo8269c(ColorStateList colorStateList) {
        this.f7440j = colorStateList;
        m10586G();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Drawable mo8270d() {
        return this.f7439i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo8271d(ColorStateList colorStateList) {
        if (this.f7443m != colorStateList) {
            this.f7443m = colorStateList;
            mo8287t();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public ColorStateList mo8272e() {
        return this.f7441k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public float mo8273f() {
        return this.f7433c.mo13086n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public float mo8274g() {
        return this.f7433c.mo13074g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public ColorStateList mo8275h() {
        return this.f7440j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C4389k mo8276i() {
        return this.f7442l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo8277j() {
        ColorStateList colorStateList = this.f7443m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public ColorStateList mo8278k() {
        return this.f7443m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public int mo8279l() {
        return this.f7437g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public Rect mo8280m() {
        return this.f7432b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo8281n() {
        return this.f7448r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo8282o() {
        return this.f7449s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo8283p() {
        Drawable drawable = this.f7438h;
        Drawable C = this.f7431a.isClickable() ? m10582C() : this.f7434d;
        this.f7438h = C;
        if (drawable != C) {
            m10589c(C);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo8284q() {
        int u = (int) ((m10584E() || m10585F() ? m10590u() : 0.0f) - m10583D());
        MaterialCardView materialCardView = this.f7431a;
        Rect rect = this.f7432b;
        materialCardView.mo8218b(rect.left + u, rect.top + u, rect.right + u, rect.bottom + u);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo8285r() {
        this.f7433c.mo13064b(this.f7431a.getCardElevation());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo8286s() {
        if (!mo8281n()) {
            this.f7431a.setBackgroundInternal(m10588b((Drawable) this.f7433c));
        }
        this.f7431a.setForeground(m10588b(this.f7438h));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo8287t() {
        this.f7434d.mo13055a((float) this.f7437g, this.f7443m);
    }
}
