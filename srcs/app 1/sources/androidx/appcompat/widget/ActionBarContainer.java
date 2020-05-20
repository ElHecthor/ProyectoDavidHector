package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import p071f.p072a.C3098f;
import p071f.p072a.C3102j;
import p071f.p097h.p108m.C3379v;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: f */
    private boolean f630f;

    /* renamed from: g */
    private View f631g;

    /* renamed from: h */
    private View f632h;

    /* renamed from: i */
    private View f633i;

    /* renamed from: j */
    Drawable f634j;

    /* renamed from: k */
    Drawable f635k;

    /* renamed from: l */
    Drawable f636l;

    /* renamed from: m */
    boolean f637m;

    /* renamed from: n */
    boolean f638n;

    /* renamed from: o */
    private int f639o;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3379v.m13787a((View) this, (Drawable) new C0191b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3102j.ActionBar);
        this.f634j = obtainStyledAttributes.getDrawable(C3102j.ActionBar_background);
        this.f635k = obtainStyledAttributes.getDrawable(C3102j.ActionBar_backgroundStacked);
        this.f639o = obtainStyledAttributes.getDimensionPixelSize(C3102j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == C3098f.split_action_bar) {
            this.f637m = true;
            this.f636l = obtainStyledAttributes.getDrawable(C3102j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f637m ? !(this.f634j == null && this.f635k == null) : this.f636l != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m793a(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m794b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f634j;
        if (drawable != null && drawable.isStateful()) {
            this.f634j.setState(getDrawableState());
        }
        Drawable drawable2 = this.f635k;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f635k.setState(getDrawableState());
        }
        Drawable drawable3 = this.f636l;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f636l.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f631g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f634j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f635k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f636l;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f632h = findViewById(C3098f.action_bar);
        this.f633i = findViewById(C3098f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f630f || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f631g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i5 = ((LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f637m) {
            Drawable drawable2 = this.f636l;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f634j != null) {
                if (this.f632h.getVisibility() == 0) {
                    drawable = this.f634j;
                    left = this.f632h.getLeft();
                    top = this.f632h.getTop();
                    right = this.f632h.getRight();
                    view = this.f632h;
                } else {
                    View view3 = this.f633i;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f634j.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable = this.f634j;
                        left = this.f633i.getLeft();
                        top = this.f633i.getTop();
                        right = this.f633i.getRight();
                        view = this.f633i;
                    }
                }
                drawable.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f638n = z4;
            if (z4) {
                Drawable drawable3 = this.f635k;
                if (drawable3 != null) {
                    drawable3.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                }
            }
            z2 = z3;
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f632h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f639o
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f632h
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f631g
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f632h
            boolean r0 = r3.m794b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f632h
        L_0x0042:
            int r0 = r3.m793a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f633i
            boolean r0 = r3.m794b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f633i
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f631g
            int r1 = r3.m793a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f634j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f634j);
        }
        this.f634j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f632h;
            if (view != null) {
                this.f634j.setBounds(view.getLeft(), this.f632h.getTop(), this.f632h.getRight(), this.f632h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f637m ? !(this.f634j == null && this.f635k == null) : this.f636l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2 = this.f636l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f636l);
        }
        this.f636l = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f637m) {
                Drawable drawable3 = this.f636l;
                if (drawable3 != null) {
                    drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                }
            }
        }
        if (!this.f637m ? this.f634j == null && this.f635k == null : this.f636l == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f635k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f635k);
        }
        this.f635k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f638n) {
                Drawable drawable3 = this.f635k;
                if (drawable3 != null) {
                    drawable3.setBounds(this.f631g.getLeft(), this.f631g.getTop(), this.f631g.getRight(), this.f631g.getBottom());
                }
            }
        }
        boolean z = true;
        if (!this.f637m ? !(this.f634j == null && this.f635k == null) : this.f636l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0242l0 l0Var) {
        View view = this.f631g;
        if (view != null) {
            removeView(view);
        }
        this.f631g = l0Var;
        if (l0Var != null) {
            addView(l0Var);
            ViewGroup.LayoutParams layoutParams = l0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            l0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f630f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f634j;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f635k;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f636l;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f634j && !this.f637m) || (drawable == this.f635k && this.f638n) || ((drawable == this.f636l && this.f637m) || super.verifyDrawable(drawable));
    }
}
