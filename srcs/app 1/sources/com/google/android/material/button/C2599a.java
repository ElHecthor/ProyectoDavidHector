package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import androidx.core.graphics.drawable.C0371a;
import com.google.android.material.internal.C2715j;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p187b0.C4404n;
import p147g.p156d.p157a.p185c.p195r.C4445a;
import p147g.p156d.p157a.p185c.p202y.C4459c;
import p147g.p156d.p157a.p185c.p203z.C4465a;
import p147g.p156d.p157a.p185c.p203z.C4468b;

/* renamed from: com.google.android.material.button.a */
class C2599a {

    /* renamed from: s */
    private static final boolean f7401s = (VERSION.SDK_INT >= 21);

    /* renamed from: a */
    private final MaterialButton f7402a;

    /* renamed from: b */
    private C4389k f7403b;

    /* renamed from: c */
    private int f7404c;

    /* renamed from: d */
    private int f7405d;

    /* renamed from: e */
    private int f7406e;

    /* renamed from: f */
    private int f7407f;

    /* renamed from: g */
    private int f7408g;

    /* renamed from: h */
    private int f7409h;

    /* renamed from: i */
    private Mode f7410i;

    /* renamed from: j */
    private ColorStateList f7411j;

    /* renamed from: k */
    private ColorStateList f7412k;

    /* renamed from: l */
    private ColorStateList f7413l;

    /* renamed from: m */
    private Drawable f7414m;

    /* renamed from: n */
    private boolean f7415n = false;

    /* renamed from: o */
    private boolean f7416o = false;

    /* renamed from: p */
    private boolean f7417p = false;

    /* renamed from: q */
    private boolean f7418q;

    /* renamed from: r */
    private LayerDrawable f7419r;

    C2599a(MaterialButton materialButton, C4389k kVar) {
        this.f7402a = materialButton;
        this.f7403b = kVar;
    }

    /* renamed from: a */
    private InsetDrawable m10544a(Drawable drawable) {
        InsetDrawable insetDrawable = new InsetDrawable(drawable, this.f7404c, this.f7406e, this.f7405d, this.f7407f);
        return insetDrawable;
    }

    /* renamed from: b */
    private void m10545b(C4389k kVar) {
        if (mo8206c() != null) {
            mo8206c().setShapeAppearanceModel(kVar);
        }
        if (m10548n() != null) {
            m10548n().setShapeAppearanceModel(kVar);
        }
        if (mo8202b() != null) {
            mo8202b().setShapeAppearanceModel(kVar);
        }
    }

    /* renamed from: c */
    private C4382g m10546c(boolean z) {
        LayerDrawable layerDrawable = this.f7419r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C4382g) (f7401s ? (LayerDrawable) ((InsetDrawable) this.f7419r.getDrawable(0)).getDrawable() : this.f7419r).getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: m */
    private Drawable m10547m() {
        C4382g gVar = new C4382g(this.f7403b);
        gVar.mo13058a(this.f7402a.getContext());
        C0371a.m1898a((Drawable) gVar, this.f7411j);
        Mode mode = this.f7410i;
        if (mode != null) {
            C0371a.m1901a((Drawable) gVar, mode);
        }
        gVar.mo13055a((float) this.f7409h, this.f7412k);
        C4382g gVar2 = new C4382g(this.f7403b);
        gVar2.setTint(0);
        gVar2.mo13054a((float) this.f7409h, this.f7415n ? C4445a.m18120a((View) this.f7402a, C4375b.colorSurface) : 0);
        if (f7401s) {
            C4382g gVar3 = new C4382g(this.f7403b);
            this.f7414m = gVar3;
            C0371a.m1906b(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C4468b.m18201b(this.f7413l), m10544a((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f7414m);
            this.f7419r = rippleDrawable;
            return rippleDrawable;
        }
        C4465a aVar = new C4465a(this.f7403b);
        this.f7414m = aVar;
        C0371a.m1898a((Drawable) aVar, C4468b.m18201b(this.f7413l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f7414m});
        this.f7419r = layerDrawable;
        return m10544a((Drawable) layerDrawable);
    }

    /* renamed from: n */
    private C4382g m10548n() {
        return m10546c(true);
    }

    /* renamed from: o */
    private void m10549o() {
        C4382g c = mo8206c();
        C4382g n = m10548n();
        if (c != null) {
            c.mo13055a((float) this.f7409h, this.f7412k);
            if (n != null) {
                n.mo13054a((float) this.f7409h, this.f7415n ? C4445a.m18120a((View) this.f7402a, C4375b.colorSurface) : 0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo8194a() {
        return this.f7408g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8195a(int i) {
        if (mo8206c() != null) {
            mo8206c().setTint(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8196a(int i, int i2) {
        Drawable drawable = this.f7414m;
        if (drawable != null) {
            drawable.setBounds(this.f7404c, this.f7406e, i2 - this.f7405d, i - this.f7407f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8197a(ColorStateList colorStateList) {
        if (this.f7413l != colorStateList) {
            this.f7413l = colorStateList;
            if (f7401s && (this.f7402a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f7402a.getBackground()).setColor(C4468b.m18201b(colorStateList));
            } else if (!f7401s && (this.f7402a.getBackground() instanceof C4465a)) {
                ((C4465a) this.f7402a.getBackground()).setTintList(C4468b.m18201b(colorStateList));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8198a(TypedArray typedArray) {
        this.f7404c = typedArray.getDimensionPixelOffset(C4416l.MaterialButton_android_insetLeft, 0);
        this.f7405d = typedArray.getDimensionPixelOffset(C4416l.MaterialButton_android_insetRight, 0);
        this.f7406e = typedArray.getDimensionPixelOffset(C4416l.MaterialButton_android_insetTop, 0);
        this.f7407f = typedArray.getDimensionPixelOffset(C4416l.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(C4416l.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(C4416l.MaterialButton_cornerRadius, -1);
            this.f7408g = dimensionPixelSize;
            mo8200a(this.f7403b.mo13101a((float) dimensionPixelSize));
            this.f7417p = true;
        }
        this.f7409h = typedArray.getDimensionPixelSize(C4416l.MaterialButton_strokeWidth, 0);
        this.f7410i = C2715j.m11287a(typedArray.getInt(C4416l.MaterialButton_backgroundTintMode, -1), Mode.SRC_IN);
        this.f7411j = C4459c.m18175a(this.f7402a.getContext(), typedArray, C4416l.MaterialButton_backgroundTint);
        this.f7412k = C4459c.m18175a(this.f7402a.getContext(), typedArray, C4416l.MaterialButton_strokeColor);
        this.f7413l = C4459c.m18175a(this.f7402a.getContext(), typedArray, C4416l.MaterialButton_rippleColor);
        this.f7418q = typedArray.getBoolean(C4416l.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(C4416l.MaterialButton_elevation, 0);
        int u = C3379v.m13834u(this.f7402a);
        int paddingTop = this.f7402a.getPaddingTop();
        int t = C3379v.m13833t(this.f7402a);
        int paddingBottom = this.f7402a.getPaddingBottom();
        this.f7402a.setInternalBackground(m10547m());
        C4382g c = mo8206c();
        if (c != null) {
            c.mo13064b((float) dimensionPixelSize2);
        }
        C3379v.m13783a(this.f7402a, u + this.f7404c, paddingTop + this.f7406e, t + this.f7405d, paddingBottom + this.f7407f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8199a(Mode mode) {
        if (this.f7410i != mode) {
            this.f7410i = mode;
            if (mo8206c() != null && this.f7410i != null) {
                C0371a.m1901a((Drawable) mo8206c(), this.f7410i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8200a(C4389k kVar) {
        this.f7403b = kVar;
        m10545b(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8201a(boolean z) {
        this.f7418q = z;
    }

    /* renamed from: b */
    public C4404n mo8202b() {
        LayerDrawable layerDrawable = this.f7419r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (C4404n) (this.f7419r.getNumberOfLayers() > 2 ? this.f7419r.getDrawable(2) : this.f7419r.getDrawable(1));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8203b(int i) {
        if (!this.f7417p || this.f7408g != i) {
            this.f7408g = i;
            this.f7417p = true;
            mo8200a(this.f7403b.mo13101a((float) i));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8204b(ColorStateList colorStateList) {
        if (this.f7412k != colorStateList) {
            this.f7412k = colorStateList;
            m10549o();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8205b(boolean z) {
        this.f7415n = z;
        m10549o();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C4382g mo8206c() {
        return m10546c(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo8207c(int i) {
        if (this.f7409h != i) {
            this.f7409h = i;
            m10549o();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo8208c(ColorStateList colorStateList) {
        if (this.f7411j != colorStateList) {
            this.f7411j = colorStateList;
            if (mo8206c() != null) {
                C0371a.m1898a((Drawable) mo8206c(), this.f7411j);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public ColorStateList mo8209d() {
        return this.f7413l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C4389k mo8210e() {
        return this.f7403b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public ColorStateList mo8211f() {
        return this.f7412k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo8212g() {
        return this.f7409h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public ColorStateList mo8213h() {
        return this.f7411j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Mode mo8214i() {
        return this.f7410i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo8215j() {
        return this.f7416o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo8216k() {
        return this.f7418q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo8217l() {
        this.f7416o = true;
        this.f7402a.setSupportBackgroundTintList(this.f7411j);
        this.f7402a.setSupportBackgroundTintMode(this.f7410i);
    }
}
