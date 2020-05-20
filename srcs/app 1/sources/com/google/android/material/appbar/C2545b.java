package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0335f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p071f.p097h.p103h.C3276a;
import p071f.p097h.p108m.C3339d;
import p071f.p097h.p108m.C3343e0;
import p071f.p097h.p108m.C3379v;

/* renamed from: com.google.android.material.appbar.b */
abstract class C2545b extends C2546c<View> {

    /* renamed from: d */
    final Rect f7181d = new Rect();

    /* renamed from: e */
    final Rect f7182e = new Rect();

    /* renamed from: f */
    private int f7183f = 0;

    /* renamed from: g */
    private int f7184g;

    public C2545b() {
    }

    public C2545b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    private static int m10289c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo7933a(View view) {
        if (this.f7184g == 0) {
            return 0;
        }
        float b = mo7920b(view);
        int i = this.f7184g;
        return C3276a.m13438a((int) (b * ((float) i)), 0, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract View mo7919a(List<View> list);

    /* renamed from: a */
    public boolean mo2107a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View a = mo7919a(coordinatorLayout.mo2053b(view));
            if (a != null) {
                int size = MeasureSpec.getSize(i3);
                if (size <= 0) {
                    size = coordinatorLayout.getHeight();
                } else if (C3379v.m13826m(a)) {
                    C3343e0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
                    if (lastWindowInsets != null) {
                        size += lastWindowInsets.mo10733d() + lastWindowInsets.mo10729a();
                    }
                }
                int c = size + mo7921c(a);
                int measuredHeight = a.getMeasuredHeight();
                if (mo7938e()) {
                    view.setTranslationY((float) (-measuredHeight));
                } else {
                    c -= measuredHeight;
                }
                coordinatorLayout.mo2048a(view, i, i2, MeasureSpec.makeMeasureSpec(c, i5 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i4);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract float mo7920b(View view);

    /* renamed from: b */
    public final void mo7934b(int i) {
        this.f7184g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7935b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View a = mo7919a(coordinatorLayout.mo2053b(view));
        if (a != null) {
            C0335f fVar = (C0335f) view.getLayoutParams();
            Rect rect = this.f7181d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, a.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            C3343e0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C3379v.m13826m(coordinatorLayout) && !C3379v.m13826m(view)) {
                rect.left += lastWindowInsets.mo10731b();
                rect.right -= lastWindowInsets.mo10732c();
            }
            Rect rect2 = this.f7182e;
            C3339d.m13607a(m10289c(fVar.f1593c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int a2 = mo7933a(a);
            view.layout(rect2.left, rect2.top - a2, rect2.right, rect2.bottom - a2);
            i2 = rect2.top - a.getBottom();
        } else {
            super.mo7935b(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f7183f = i2;
    }

    /* renamed from: c */
    public final int mo7936c() {
        return this.f7184g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo7921c(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo7937d() {
        return this.f7183f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo7938e() {
        return false;
    }
}
