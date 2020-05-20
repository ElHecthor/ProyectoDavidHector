package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.C0236j;
import androidx.appcompat.widget.C0247m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0331b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0332c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0335f;
import androidx.core.graphics.drawable.C0371a;
import androidx.core.widget.C0395l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.C2701b;
import com.google.android.material.internal.C2714i;
import com.google.android.material.internal.C2715j;
import com.google.android.material.internal.C2720k;
import com.google.android.material.theme.p054a.C2794a;
import java.util.List;
import p071f.p097h.p107l.C3321h;
import p071f.p097h.p108m.C3378u;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p186a0.C4374b;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p187b0.C4404n;
import p147g.p156d.p157a.p185c.p188c0.C4406a;
import p147g.p156d.p157a.p185c.p189m.C4424h;
import p147g.p156d.p157a.p185c.p189m.C4427k;
import p147g.p156d.p157a.p185c.p199v.C4451a;
import p147g.p156d.p157a.p185c.p199v.C4453c;
import p147g.p156d.p157a.p185c.p202y.C4459c;

public class FloatingActionButton extends C2720k implements C3378u, C0395l, C4451a, C4404n, C0331b {

    /* renamed from: w */
    private static final int f7691w = C4415k.Widget_Design_FloatingActionButton;

    /* renamed from: g */
    private ColorStateList f7692g;

    /* renamed from: h */
    private Mode f7693h;

    /* renamed from: i */
    private ColorStateList f7694i;

    /* renamed from: j */
    private Mode f7695j;

    /* renamed from: k */
    private ColorStateList f7696k;

    /* renamed from: l */
    private int f7697l;

    /* renamed from: m */
    private int f7698m;

    /* renamed from: n */
    private int f7699n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f7700o;

    /* renamed from: p */
    private int f7701p;

    /* renamed from: q */
    boolean f7702q;

    /* renamed from: r */
    final Rect f7703r;

    /* renamed from: s */
    private final Rect f7704s;

    /* renamed from: t */
    private final C0247m f7705t;

    /* renamed from: u */
    private final C4453c f7706u;

    /* renamed from: v */
    private C2679d f7707v;

    protected static class BaseBehavior<T extends FloatingActionButton> extends C0332c<T> {

        /* renamed from: a */
        private Rect f7708a;

        /* renamed from: b */
        private C2671b f7709b;

        /* renamed from: c */
        private boolean f7710c;

        public BaseBehavior() {
            this.f7710c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4416l.FloatingActionButton_Behavior_Layout);
            this.f7710c = obtainStyledAttributes.getBoolean(C4416l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m11054a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f7703r;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0335f fVar = (C0335f) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    C3379v.m13814e(floatingActionButton, i);
                }
                if (i2 != 0) {
                    C3379v.m13811d(floatingActionButton, i2);
                }
            }
        }

        /* renamed from: a */
        private static boolean m11055a(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0335f) {
                return ((C0335f) layoutParams).mo2138d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m11056a(View view, FloatingActionButton floatingActionButton) {
            return this.f7710c && ((C0335f) floatingActionButton.getLayoutParams()).mo2137c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: a */
        private boolean m11057a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m11056a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f7708a == null) {
                this.f7708a = new Rect();
            }
            Rect rect = this.f7708a;
            C2701b.m11248a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo8739a(this.f7709b, false);
            } else {
                floatingActionButton.mo8747b(this.f7709b, false);
            }
            return true;
        }

        /* renamed from: b */
        private boolean m11058b(View view, FloatingActionButton floatingActionButton) {
            if (!m11056a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C0335f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo8739a(this.f7709b, false);
            } else {
                floatingActionButton.mo8747b(this.f7709b, false);
            }
            return true;
        }

        /* renamed from: a */
        public void mo2095a(C0335f fVar) {
            if (fVar.f1598h == 0) {
                fVar.f1598h = 80;
            }
        }

        /* renamed from: a */
        public boolean mo2106a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List b = coordinatorLayout.mo2053b((View) floatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m11055a(view) && m11058b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m11057a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2059c((View) floatingActionButton, i);
            m11054a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo2108a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f7703r;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean mo2116b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m11057a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (m11055a(view)) {
                m11058b(view, floatingActionButton);
            }
            return false;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    class C2670a implements C2689j {

        /* renamed from: a */
        final /* synthetic */ C2671b f7711a;

        C2670a(C2671b bVar) {
            this.f7711a = bVar;
        }

        /* renamed from: a */
        public void mo8810a() {
            this.f7711a.mo7990b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo8811b() {
            this.f7711a.mo7989a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C2671b {
        /* renamed from: a */
        public void mo7989a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo7990b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    private class C2672c implements C4374b {
        C2672c() {
        }

        /* renamed from: a */
        public void mo8812a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f7703r.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f7700o, i2 + FloatingActionButton.this.f7700o, i3 + FloatingActionButton.this.f7700o, i4 + FloatingActionButton.this.f7700o);
        }

        /* renamed from: a */
        public void mo8813a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        /* renamed from: a */
        public boolean mo8814a() {
            return FloatingActionButton.this.f7702q;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    class C2673d<T extends FloatingActionButton> implements C2688i {

        /* renamed from: a */
        private final C4427k<T> f7714a;

        C2673d(C4427k<T> kVar) {
            this.f7714a = kVar;
        }

        /* renamed from: a */
        public void mo8815a() {
            this.f7714a.mo13188a(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo8816b() {
            this.f7714a.mo13189b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2673d) && ((C2673d) obj).f7714a.equals(this.f7714a);
        }

        public int hashCode() {
            return this.f7714a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(C2794a.m11644b(context, attributeSet, i, f7691w), attributeSet, i);
        this.f7703r = new Rect();
        this.f7704s = new Rect();
        Context context2 = getContext();
        TypedArray c = C2714i.m11283c(context2, attributeSet, C4416l.FloatingActionButton, i, f7691w, new int[0]);
        this.f7692g = C4459c.m18175a(context2, c, C4416l.FloatingActionButton_backgroundTint);
        this.f7693h = C2715j.m11287a(c.getInt(C4416l.FloatingActionButton_backgroundTintMode, -1), (Mode) null);
        this.f7696k = C4459c.m18175a(context2, c, C4416l.FloatingActionButton_rippleColor);
        this.f7698m = c.getInt(C4416l.FloatingActionButton_fabSize, -1);
        this.f7699n = c.getDimensionPixelSize(C4416l.FloatingActionButton_fabCustomSize, 0);
        this.f7697l = c.getDimensionPixelSize(C4416l.FloatingActionButton_borderWidth, 0);
        float dimension = c.getDimension(C4416l.FloatingActionButton_elevation, 0.0f);
        float dimension2 = c.getDimension(C4416l.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = c.getDimension(C4416l.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f7702q = c.getBoolean(C4416l.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C4408d.mtrl_fab_min_touch_target);
        this.f7701p = c.getDimensionPixelSize(C4416l.FloatingActionButton_maxImageSize, 0);
        C4424h a = C4424h.m18018a(context2, c, C4416l.FloatingActionButton_showMotionSpec);
        C4424h a2 = C4424h.m18018a(context2, c, C4416l.FloatingActionButton_hideMotionSpec);
        C4389k a3 = C4389k.m17887a(context2, attributeSet, i, f7691w, C4389k.f11627m).mo13120a();
        boolean z = c.getBoolean(C4416l.FloatingActionButton_ensureMinTouchTargetSize, false);
        c.recycle();
        C0247m mVar = new C0247m(this);
        this.f7705t = mVar;
        mVar.mo1566a(attributeSet, i);
        this.f7706u = new C4453c(this);
        getImpl().mo8855a(a3);
        getImpl().mo8850a(this.f7692g, this.f7693h, this.f7696k, this.f7697l);
        getImpl().mo8861b(dimensionPixelSize);
        getImpl().mo8845a(dimension);
        getImpl().mo8860b(dimension2);
        getImpl().mo8870d(dimension3);
        getImpl().mo8847a(this.f7701p);
        getImpl().mo8866b(a);
        getImpl().mo8856a(a2);
        getImpl().mo8857a(z);
        setScaleType(ScaleType.MATRIX);
    }

    /* renamed from: a */
    private int m11032a(int i) {
        int i2 = this.f7699n;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? C4408d.design_fab_size_normal : C4408d.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m11032a(1) : m11032a(0);
    }

    /* renamed from: a */
    private static int m11033a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    private C2689j m11036c(C2671b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C2670a(bVar);
    }

    /* renamed from: c */
    private void m11037c(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f7703r;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: f */
    private C2679d m11038f() {
        return VERSION.SDK_INT >= 21 ? new C2692e(this, new C2672c()) : new C2679d(this, new C2672c());
    }

    /* renamed from: g */
    private void m11039g() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f7694i;
            if (colorStateList == null) {
                C0371a.m1905b(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            Mode mode = this.f7695j;
            if (mode == null) {
                mode = Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0236j.m1167a(colorForState, mode));
        }
    }

    private C2679d getImpl() {
        if (this.f7707v == null) {
            this.f7707v = m11038f();
        }
        return this.f7707v;
    }

    /* renamed from: a */
    public void mo8737a(AnimatorListener animatorListener) {
        getImpl().mo8848a(animatorListener);
    }

    /* renamed from: a */
    public void mo8738a(C2671b bVar) {
        mo8739a(bVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8739a(C2671b bVar, boolean z) {
        getImpl().mo8854a(m11036c(bVar), z);
    }

    /* renamed from: a */
    public void mo8740a(C4427k<? extends FloatingActionButton> kVar) {
        getImpl().mo8853a((C2688i) new C2673d(kVar));
    }

    /* renamed from: a */
    public boolean mo8741a() {
        return this.f7706u.mo13261b();
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo8742a(Rect rect) {
        if (!C3379v.m13768D(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m11037c(rect);
        return true;
    }

    /* renamed from: b */
    public void mo8743b() {
        mo8738a((C2671b) null);
    }

    /* renamed from: b */
    public void mo8744b(AnimatorListener animatorListener) {
        getImpl().mo8862b(animatorListener);
    }

    /* renamed from: b */
    public void mo8745b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m11037c(rect);
    }

    /* renamed from: b */
    public void mo8746b(C2671b bVar) {
        mo8747b(bVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8747b(C2671b bVar, boolean z) {
        getImpl().mo8865b(m11036c(bVar), z);
    }

    /* renamed from: c */
    public boolean mo8748c() {
        return getImpl().mo8878j();
    }

    /* renamed from: d */
    public boolean mo8749d() {
        return getImpl().mo8879k();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo8858a(getDrawableState());
    }

    /* renamed from: e */
    public void mo8751e() {
        mo8746b((C2671b) null);
    }

    public ColorStateList getBackgroundTintList() {
        return this.f7692g;
    }

    public Mode getBackgroundTintMode() {
        return this.f7693h;
    }

    public C0332c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo8868c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo8874f();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo8875g();
    }

    public Drawable getContentBackground() {
        return getImpl().mo8859b();
    }

    public int getCustomSize() {
        return this.f7699n;
    }

    public int getExpandedComponentIdHint() {
        return this.f7706u.mo13258a();
    }

    public C4424h getHideMotionSpec() {
        return getImpl().mo8872e();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f7696k;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f7696k;
    }

    public C4389k getShapeAppearanceModel() {
        C4389k h = getImpl().mo8876h();
        C3321h.m13543a(h);
        return h;
    }

    public C4424h getShowMotionSpec() {
        return getImpl().mo8877i();
    }

    public int getSize() {
        return this.f7698m;
    }

    /* access modifiers changed from: 0000 */
    public int getSizeDimension() {
        return m11032a(this.f7698m);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f7694i;
    }

    public Mode getSupportImageTintMode() {
        return this.f7695j;
    }

    public boolean getUseCompatPadding() {
        return this.f7702q;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo8880l();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo8881m();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo8883o();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f7700o = (sizeDimension - this.f7701p) / 2;
        getImpl().mo8892x();
        int min = Math.min(m11033a(sizeDimension, i), m11033a(sizeDimension, i2));
        Rect rect = this.f7703r;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4406a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4406a aVar = (C4406a) parcelable;
        super.onRestoreInstanceState(aVar.mo10880a());
        C4453c cVar = this.f7706u;
        Object obj = aVar.f11692h.get("expandableWidgetHelper");
        C3321h.m13543a(obj);
        cVar.mo13260a((Bundle) obj);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        C4406a aVar = new C4406a(onSaveInstanceState);
        aVar.f11692h.put("expandableWidgetHelper", this.f7706u.mo13262c());
        return aVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo8742a(this.f7704s) || this.f7704s.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f7692g != colorStateList) {
            this.f7692g = colorStateList;
            getImpl().mo8849a(colorStateList);
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f7693h != mode) {
            this.f7693h = mode;
            getImpl().mo8851a(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo8845a(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo8860b(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo8870d(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f7699n) {
            this.f7699n = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo8873e(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo8871d()) {
            getImpl().mo8857a(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f7706u.mo13259a(i);
    }

    public void setHideMotionSpec(C4424h hVar) {
        getImpl().mo8856a(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C4424h.m18017a(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo8891w();
            if (this.f7694i != null) {
                m11039g();
            }
        }
    }

    public void setImageResource(int i) {
        this.f7705t.mo1563a(i);
        m11039g();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f7696k != colorStateList) {
            this.f7696k = colorStateList;
            getImpl().mo8863b(this.f7696k);
        }
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo8885q();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo8885q();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo8867b(z);
    }

    public void setShapeAppearanceModel(C4389k kVar) {
        getImpl().mo8855a(kVar);
    }

    public void setShowMotionSpec(C4424h hVar) {
        getImpl().mo8866b(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C4424h.m18017a(getContext(), i));
    }

    public void setSize(int i) {
        this.f7699n = 0;
        if (i != this.f7698m) {
            this.f7698m = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f7694i != colorStateList) {
            this.f7694i = colorStateList;
            m11039g();
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f7695j != mode) {
            this.f7695j = mode;
            m11039g();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo8886r();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo8886r();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo8886r();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f7702q != z) {
            this.f7702q = z;
            getImpl().mo8882n();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
