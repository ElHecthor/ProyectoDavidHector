package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import p071f.p120m.C3449c;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: f */
    private ArrayList<View> f1927f;

    /* renamed from: g */
    private ArrayList<View> f1928g;

    /* renamed from: h */
    private boolean f1929h;

    public FragmentContainerView(Context context) {
        super(context);
        this.f1929h = true;
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1929h = true;
        if (!isInEditMode()) {
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to be instantiated from XML.");
        }
    }

    FragmentContainerView(Context context, AttributeSet attributeSet, C0445l lVar) {
        String str;
        super(context, attributeSet);
        this.f1929h = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3449c.FragmentContainerView);
        if (classAttribute == null) {
            classAttribute = obtainStyledAttributes.getString(C3449c.FragmentContainerView_android_name);
        }
        String string = obtainStyledAttributes.getString(C3449c.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment a = lVar.mo2752a(id);
        if (classAttribute != null && a == null) {
            if (id <= 0) {
                if (string != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" with tag ");
                    sb.append(string);
                    str = sb.toString();
                } else {
                    str = "";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FragmentContainerView must have an android:id to add Fragment ");
                sb2.append(classAttribute);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            Fragment a2 = lVar.mo2812o().mo2728a(context.getClassLoader(), classAttribute);
            a2.mo2498a(context, attributeSet, (Bundle) null);
            C0466s b = lVar.mo2778b();
            b.mo2915a(true);
            b.mo2913a((ViewGroup) this, a2, string);
            b.mo2637d();
        }
    }

    /* renamed from: a */
    private void m2229a(View view) {
        if (view.getAnimation() == null) {
            ArrayList<View> arrayList = this.f1928g;
            if (arrayList == null || !arrayList.contains(view)) {
                return;
            }
        }
        if (this.f1927f == null) {
            this.f1927f = new ArrayList<>();
        }
        this.f1927f.add(view);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (C0445l.m2377a(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i, LayoutParams layoutParams, boolean z) {
        if (C0445l.m2377a(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f1929h && this.f1927f != null) {
            for (int i = 0; i < this.f1927f.size(); i++) {
                super.drawChild(canvas, (View) this.f1927f.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (this.f1929h) {
            ArrayList<View> arrayList = this.f1927f;
            if (arrayList != null && arrayList.size() > 0 && this.f1927f.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f1928g;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f1927f;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1929h = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m2229a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m2229a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        m2229a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        m2229a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        m2229a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m2229a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m2229a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    /* access modifiers changed from: 0000 */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f1929h = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1928g == null) {
                this.f1928g = new ArrayList<>();
            }
            this.f1928g.add(view);
        }
        super.startViewTransition(view);
    }
}
