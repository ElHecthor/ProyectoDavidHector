package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0214f;
import androidx.core.graphics.drawable.C0371a;
import androidx.core.widget.C0391i;
import com.google.android.material.internal.C2714i;
import com.google.android.material.internal.C2715j;
import com.google.android.material.theme.p054a.C2794a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p187b0.C4386h;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p187b0.C4404n;
import p147g.p156d.p157a.p185c.p202y.C4459c;

public class MaterialButton extends C0214f implements Checkable, C4404n {

    /* renamed from: t */
    private static final int[] f7386t = {16842911};

    /* renamed from: u */
    private static final int[] f7387u = {16842912};

    /* renamed from: v */
    private static final int f7388v = C4415k.Widget_MaterialComponents_Button;

    /* renamed from: h */
    private final C2599a f7389h;

    /* renamed from: i */
    private final LinkedHashSet<C2597a> f7390i;

    /* renamed from: j */
    private C2598b f7391j;

    /* renamed from: k */
    private Mode f7392k;

    /* renamed from: l */
    private ColorStateList f7393l;

    /* renamed from: m */
    private Drawable f7394m;

    /* renamed from: n */
    private int f7395n;

    /* renamed from: o */
    private int f7396o;

    /* renamed from: p */
    private int f7397p;

    /* renamed from: q */
    private boolean f7398q;

    /* renamed from: r */
    private boolean f7399r;

    /* renamed from: s */
    private int f7400s;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C2597a {
        /* renamed from: a */
        void mo8192a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    interface C2598b {
        /* renamed from: a */
        void mo8193a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(C2794a.m11644b(context, attributeSet, i, f7388v), attributeSet, i);
        this.f7390i = new LinkedHashSet<>();
        boolean z = false;
        this.f7398q = false;
        this.f7399r = false;
        Context context2 = getContext();
        TypedArray c = C2714i.m11283c(context2, attributeSet, C4416l.MaterialButton, i, f7388v, new int[0]);
        this.f7397p = c.getDimensionPixelSize(C4416l.MaterialButton_iconPadding, 0);
        this.f7392k = C2715j.m11287a(c.getInt(C4416l.MaterialButton_iconTintMode, -1), Mode.SRC_IN);
        this.f7393l = C4459c.m18175a(getContext(), c, C4416l.MaterialButton_iconTint);
        this.f7394m = C4459c.m18177b(getContext(), c, C4416l.MaterialButton_icon);
        this.f7400s = c.getInteger(C4416l.MaterialButton_iconGravity, 1);
        this.f7395n = c.getDimensionPixelSize(C4416l.MaterialButton_iconSize, 0);
        C2599a aVar = new C2599a(this, C4389k.m17885a(context2, attributeSet, i, f7388v).mo13120a());
        this.f7389h = aVar;
        aVar.mo8198a(c);
        c.recycle();
        setCompoundDrawablePadding(this.f7397p);
        if (this.f7394m != null) {
            z = true;
        }
        m10537b(z);
    }

    /* renamed from: a */
    private void m10536a(boolean z) {
        if (z) {
            C0391i.m2030a(this, this.f7394m, null, null, null);
        } else {
            C0391i.m2030a(this, null, null, this.f7394m, null);
        }
    }

    /* renamed from: b */
    private void m10537b(boolean z) {
        Drawable drawable = this.f7394m;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = C0371a.m1913i(drawable).mutate();
            this.f7394m = mutate;
            C0371a.m1898a(mutate, this.f7393l);
            Mode mode = this.f7392k;
            if (mode != null) {
                C0371a.m1901a(this.f7394m, mode);
            }
            int i = this.f7395n;
            if (i == 0) {
                i = this.f7394m.getIntrinsicWidth();
            }
            int i2 = this.f7395n;
            if (i2 == 0) {
                i2 = this.f7394m.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f7394m;
            int i3 = this.f7396o;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f7400s;
        boolean z3 = i4 == 1 || i4 == 2;
        if (z) {
            m10536a(z3);
            return;
        }
        Drawable[] a = C0391i.m2033a((TextView) this);
        Drawable drawable3 = a[0];
        Drawable drawable4 = a[2];
        if ((z3 && drawable3 != this.f7394m) || (!z3 && drawable4 != this.f7394m)) {
            z2 = true;
        }
        if (z2) {
            m10536a(z3);
        }
    }

    /* renamed from: b */
    private boolean mo8691b() {
        return C3379v.m13829p(this) == 1;
    }

    /* renamed from: c */
    private boolean mo8692c() {
        C2599a aVar = this.f7389h;
        return aVar != null && !aVar.mo8215j();
    }

    /* renamed from: d */
    private void m10540d() {
        if (!(this.f7394m == null || getLayout() == null)) {
            int i = this.f7400s;
            boolean z = true;
            if (i == 1 || i == 3) {
                this.f7396o = 0;
                m10537b(false);
            } else {
                TextPaint paint = getPaint();
                String charSequence = getText().toString();
                if (getTransformationMethod() != null) {
                    charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                }
                int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
                int i2 = this.f7395n;
                if (i2 == 0) {
                    i2 = this.f7394m.getIntrinsicWidth();
                }
                int measuredWidth = (((((getMeasuredWidth() - min) - C3379v.m13833t(this)) - i2) - this.f7397p) - C3379v.m13834u(this)) / 2;
                boolean b = mo8691b();
                if (this.f7400s != 4) {
                    z = false;
                }
                if (b != z) {
                    measuredWidth = -measuredWidth;
                }
                if (this.f7396o != measuredWidth) {
                    this.f7396o = measuredWidth;
                    m10537b(false);
                }
            }
        }
    }

    private String getA11yClassName() {
        return (mo8144a() ? CompoundButton.class : Button.class).getName();
    }

    /* renamed from: a */
    public boolean mo8144a() {
        C2599a aVar = this.f7389h;
        return aVar != null && aVar.mo8216k();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (mo8692c()) {
            return this.f7389h.mo8194a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f7394m;
    }

    public int getIconGravity() {
        return this.f7400s;
    }

    public int getIconPadding() {
        return this.f7397p;
    }

    public int getIconSize() {
        return this.f7395n;
    }

    public ColorStateList getIconTint() {
        return this.f7393l;
    }

    public Mode getIconTintMode() {
        return this.f7392k;
    }

    public ColorStateList getRippleColor() {
        if (mo8692c()) {
            return this.f7389h.mo8209d();
        }
        return null;
    }

    public C4389k getShapeAppearanceModel() {
        if (mo8692c()) {
            return this.f7389h.mo8210e();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (mo8692c()) {
            return this.f7389h.mo8211f();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (mo8692c()) {
            return this.f7389h.mo8212g();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return mo8692c() ? this.f7389h.mo8213h() : super.getSupportBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        return mo8692c() ? this.f7389h.mo8214i() : super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f7398q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4386h.m17877a((View) this, this.f7389h.mo8206c());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo8144a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f7386t);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f7387u);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo8144a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (VERSION.SDK_INT == 21) {
            C2599a aVar = this.f7389h;
            if (aVar != null) {
                aVar.mo8196a(i4 - i2, i3 - i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m10540d();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m10540d();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (mo8692c()) {
            this.f7389h.mo8195a(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (mo8692c()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                this.f7389h.mo8217l();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C3103a.m12557c(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (mo8692c()) {
            this.f7389h.mo8201a(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo8144a() && isEnabled() && this.f7398q != z) {
            this.f7398q = z;
            refreshDrawableState();
            if (!this.f7399r) {
                this.f7399r = true;
                Iterator it = this.f7390i.iterator();
                while (it.hasNext()) {
                    ((C2597a) it.next()).mo8192a(this, this.f7398q);
                }
                this.f7399r = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (mo8692c()) {
            this.f7389h.mo8203b(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (mo8692c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (mo8692c()) {
            this.f7389h.mo8206c().mo13064b(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f7394m != drawable) {
            this.f7394m = drawable;
            m10537b(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f7400s != i) {
            this.f7400s = i;
            m10540d();
        }
    }

    public void setIconPadding(int i) {
        if (this.f7397p != i) {
            this.f7397p = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C3103a.m12557c(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f7395n != i) {
            this.f7395n = i;
            m10537b(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f7393l != colorStateList) {
            this.f7393l = colorStateList;
            m10537b(false);
        }
    }

    public void setIconTintMode(Mode mode) {
        if (this.f7392k != mode) {
            this.f7392k = mode;
            m10537b(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C3103a.m12556b(getContext(), i));
    }

    /* access modifiers changed from: 0000 */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: 0000 */
    public void setOnPressedChangeListenerInternal(C2598b bVar) {
        this.f7391j = bVar;
    }

    public void setPressed(boolean z) {
        C2598b bVar = this.f7391j;
        if (bVar != null) {
            bVar.mo8193a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (mo8692c()) {
            this.f7389h.mo8197a(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (mo8692c()) {
            setRippleColor(C3103a.m12556b(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C4389k kVar) {
        if (mo8692c()) {
            this.f7389h.mo8200a(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: 0000 */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (mo8692c()) {
            this.f7389h.mo8205b(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (mo8692c()) {
            this.f7389h.mo8204b(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (mo8692c()) {
            setStrokeColor(C3103a.m12556b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (mo8692c()) {
            this.f7389h.mo8207c(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (mo8692c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (mo8692c()) {
            this.f7389h.mo8208c(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (mo8692c()) {
            this.f7389h.mo8199a(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f7398q);
    }
}
