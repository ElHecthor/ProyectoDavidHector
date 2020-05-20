package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.C2714i;
import com.google.android.material.theme.p054a.C2794a;
import p071f.p072a.p073k.p074a.C3103a;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p187b0.C4386h;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p187b0.C4404n;

public class MaterialCardView extends CardView implements Checkable, C4404n {

    /* renamed from: t */
    private static final int[] f7420t = {16842911};

    /* renamed from: u */
    private static final int[] f7421u = {16842912};

    /* renamed from: v */
    private static final int[] f7422v = {C4375b.state_dragged};

    /* renamed from: w */
    private static final int f7423w = C4415k.Widget_MaterialComponents_CardView;

    /* renamed from: o */
    private final C2601a f7424o;

    /* renamed from: p */
    private boolean f7425p;

    /* renamed from: q */
    private boolean f7426q;

    /* renamed from: r */
    private boolean f7427r;

    /* renamed from: s */
    private C2600a f7428s;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface C2600a {
        /* renamed from: a */
        void mo8253a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(C2794a.m11644b(context, attributeSet, i, f7423w), attributeSet, i);
        this.f7426q = false;
        this.f7427r = false;
        this.f7425p = true;
        TypedArray c = C2714i.m11283c(getContext(), attributeSet, C4416l.MaterialCardView, i, f7423w, new int[0]);
        C2601a aVar = new C2601a(this, attributeSet, i, f7423w);
        this.f7424o = aVar;
        aVar.mo8259a(super.getCardBackgroundColor());
        this.f7424o.mo8258a(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        this.f7424o.mo8260a(c);
        c.recycle();
    }

    /* renamed from: e */
    private void m10575e() {
        if (VERSION.SDK_INT > 26) {
            this.f7424o.mo8254a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8218b(int i, int i2, int i3, int i4) {
        super.mo1847a(i, i2, i3, i4);
    }

    /* renamed from: c */
    public boolean mo8219c() {
        C2601a aVar = this.f7424o;
        return aVar != null && aVar.mo8282o();
    }

    /* renamed from: d */
    public boolean mo8220d() {
        return this.f7427r;
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f7424o.mo8268c();
    }

    /* access modifiers changed from: 0000 */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f7424o.mo8270d();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f7424o.mo8272e();
    }

    public int getContentPaddingBottom() {
        return this.f7424o.mo8280m().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f7424o.mo8280m().left;
    }

    public int getContentPaddingRight() {
        return this.f7424o.mo8280m().right;
    }

    public int getContentPaddingTop() {
        return this.f7424o.mo8280m().top;
    }

    public float getProgress() {
        return this.f7424o.mo8274g();
    }

    public float getRadius() {
        return this.f7424o.mo8273f();
    }

    public ColorStateList getRippleColor() {
        return this.f7424o.mo8275h();
    }

    public C4389k getShapeAppearanceModel() {
        return this.f7424o.mo8276i();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f7424o.mo8277j();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f7424o.mo8278k();
    }

    public int getStrokeWidth() {
        return this.f7424o.mo8279l();
    }

    public boolean isChecked() {
        return this.f7426q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4386h.m17877a((View) this, this.f7424o.mo8264b());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo8219c()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f7420t);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f7421u);
        }
        if (mo8220d()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f7422v);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(mo8219c());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f7424o.mo8257a(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f7425p) {
            if (!this.f7424o.mo8281n()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f7424o.mo8263a(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        this.f7424o.mo8259a(ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f7424o.mo8259a(colorStateList);
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f7424o.mo8285r();
    }

    public void setCheckable(boolean z) {
        this.f7424o.mo8267b(z);
    }

    public void setChecked(boolean z) {
        if (this.f7426q != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f7424o.mo8261a(drawable);
    }

    public void setCheckedIconResource(int i) {
        this.f7424o.mo8261a(C3103a.m12557c(getContext(), i));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f7424o.mo8266b(colorStateList);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f7424o.mo8283p();
    }

    public void setDragged(boolean z) {
        if (this.f7427r != z) {
            this.f7427r = z;
            refreshDrawableState();
            m10575e();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f7424o.mo8286s();
    }

    public void setOnCheckedChangeListener(C2600a aVar) {
        this.f7428s = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f7424o.mo8286s();
        this.f7424o.mo8284q();
    }

    public void setProgress(float f) {
        this.f7424o.mo8265b(f);
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f7424o.mo8255a(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f7424o.mo8269c(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f7424o.mo8269c(C3103a.m12556b(getContext(), i));
    }

    public void setShapeAppearanceModel(C4389k kVar) {
        this.f7424o.mo8262a(kVar);
    }

    public void setStrokeColor(int i) {
        this.f7424o.mo8271d(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f7424o.mo8271d(colorStateList);
    }

    public void setStrokeWidth(int i) {
        this.f7424o.mo8256a(i);
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f7424o.mo8286s();
        this.f7424o.mo8284q();
    }

    public void toggle() {
        if (mo8219c() && isEnabled()) {
            this.f7426q = !this.f7426q;
            refreshDrawableState();
            m10575e();
            C2600a aVar = this.f7428s;
            if (aVar != null) {
                aVar.mo8253a(this, this.f7426q);
            }
        }
    }
}
