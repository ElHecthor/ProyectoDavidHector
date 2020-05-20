package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0371a;
import androidx.core.widget.C0388f;
import java.lang.reflect.Field;
import p071f.p072a.C3093a;
import p071f.p072a.p075l.p076a.C3117c;
import p071f.p097h.p108m.C3325a0;

/* renamed from: androidx.appcompat.widget.b0 */
class C0192b0 extends ListView {

    /* renamed from: f */
    private final Rect f872f = new Rect();

    /* renamed from: g */
    private int f873g = 0;

    /* renamed from: h */
    private int f874h = 0;

    /* renamed from: i */
    private int f875i = 0;

    /* renamed from: j */
    private int f876j = 0;

    /* renamed from: k */
    private int f877k;

    /* renamed from: l */
    private Field f878l;

    /* renamed from: m */
    private C0193a f879m;

    /* renamed from: n */
    private boolean f880n;

    /* renamed from: o */
    private boolean f881o;

    /* renamed from: p */
    private boolean f882p;

    /* renamed from: q */
    private C3325a0 f883q;

    /* renamed from: r */
    private C0388f f884r;

    /* renamed from: s */
    C0194b f885s;

    /* renamed from: androidx.appcompat.widget.b0$a */
    private static class C0193a extends C3117c {

        /* renamed from: g */
        private boolean f886g = true;

        C0193a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1280a(boolean z) {
            this.f886g = z;
        }

        public void draw(Canvas canvas) {
            if (this.f886g) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f886g) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f886g) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f886g) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f886g) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$b */
    private class C0194b implements Runnable {
        C0194b() {
        }

        /* renamed from: a */
        public void mo1286a() {
            C0192b0 b0Var = C0192b0.this;
            b0Var.f885s = null;
            b0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo1287b() {
            C0192b0.this.post(this);
        }

        public void run() {
            C0192b0 b0Var = C0192b0.this;
            b0Var.f885s = null;
            b0Var.drawableStateChanged();
        }
    }

    C0192b0(Context context, boolean z) {
        super(context, null, C3093a.dropDownListViewStyle);
        this.f881o = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f878l = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m981a() {
        this.f882p = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f877k - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C3325a0 a0Var = this.f883q;
        if (a0Var != null) {
            a0Var.mo10713a();
            this.f883q = null;
        }
    }

    /* renamed from: a */
    private void m982a(int i, View view) {
        Rect rect = this.f872f;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f873g;
        rect.top -= this.f874h;
        rect.right += this.f875i;
        rect.bottom += this.f876j;
        try {
            boolean z = this.f878l.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f878l.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m983a(int i, View view, float f, float f2) {
        m987b(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0371a.m1896a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m984a(Canvas canvas) {
        if (!this.f872f.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f872f);
                selector.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private void m985a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m986a(View view, int i, float f, float f2) {
        this.f882p = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f877k;
        if (i2 != -1) {
            View childAt = getChildAt(i2 - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f877k = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m983a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: b */
    private void m987b(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m982a(i, view);
        if (z2) {
            Rect rect = this.f872f;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0371a.m1896a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: b */
    private boolean m988b() {
        return this.f882p;
    }

    /* renamed from: c */
    private void m989c() {
        Drawable selector = getSelector();
        if (selector != null && m988b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0193a aVar = this.f879m;
        if (aVar != null) {
            aVar.mo1280a(z);
        }
    }

    /* renamed from: a */
    public int mo1267a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? MeasureSpec.makeMeasureSpec(i10, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i9 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                if (i5 >= 0 && i9 > i5 && i8 > 0 && i6 != i4) {
                    i4 = i8;
                }
                return i4;
            }
            if (i5 >= 0 && i9 >= i5) {
                i8 = i6;
            }
        }
        return i6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1268a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m986a(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m985a(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m981a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.f r9 = r7.f884r
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f884r = r9
        L_0x005a:
            androidx.core.widget.f r9 = r7.f884r
            r9.mo2357a(r2)
            androidx.core.widget.f r9 = r7.f884r
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.f r8 = r7.f884r
            if (r8 == 0) goto L_0x006c
            r8.mo2357a(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0192b0.mo1268a(android.view.MotionEvent, int):boolean");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m984a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f885s == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m989c();
        }
    }

    public boolean hasFocus() {
        return this.f881o || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f881o || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f881o || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f881o && this.f880n) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f885s = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f885s == null) {
            C0194b bVar = new C0194b();
            this.f885s = bVar;
            bVar.mo1287b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m989c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f877k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0194b bVar = this.f885s;
        if (bVar != null) {
            bVar.mo1286a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public void setListSelectionHidden(boolean z) {
        this.f880n = z;
    }

    public void setSelector(Drawable drawable) {
        C0193a aVar = drawable != null ? new C0193a(drawable) : null;
        this.f879m = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f873g = rect.left;
        this.f874h = rect.top;
        this.f875i = rect.right;
        this.f876j = rect.bottom;
    }
}
