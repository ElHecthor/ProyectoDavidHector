package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0579n;

/* renamed from: androidx.recyclerview.widget.i */
public class C0644i extends C0579n {

    /* renamed from: d */
    private static final int[] f2624d = {16843284};

    /* renamed from: a */
    private Drawable f2625a;

    /* renamed from: b */
    private int f2626b;

    /* renamed from: c */
    private final Rect f2627c = new Rect();

    public C0644i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2624d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f2625a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        mo3891a(i);
    }

    /* renamed from: c */
    private void m3642c(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().mo3569b(childAt, this.f2627c);
            int round = this.f2627c.right + Math.round(childAt.getTranslationX());
            this.f2625a.setBounds(round - this.f2625a.getIntrinsicWidth(), i2, round, i);
            this.f2625a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: d */
    private void m3643d(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f2627c);
            int round = this.f2627c.bottom + Math.round(childAt.getTranslationY());
            this.f2625a.setBounds(i2, round - this.f2625a.getIntrinsicHeight(), i, round);
            this.f2625a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: a */
    public void mo3891a(int i) {
        if (i == 0 || i == 1) {
            this.f2626b = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    /* renamed from: a */
    public void mo3526a(Canvas canvas, RecyclerView recyclerView, C0560a0 a0Var) {
        if (recyclerView.getLayoutManager() != null && this.f2625a != null) {
            if (this.f2626b == 1) {
                m3643d(canvas, recyclerView);
            } else {
                m3642c(canvas, recyclerView);
            }
        }
    }

    /* renamed from: a */
    public void mo3528a(Rect rect, View view, RecyclerView recyclerView, C0560a0 a0Var) {
        Drawable drawable = this.f2625a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (this.f2626b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    /* renamed from: a */
    public void mo3892a(Drawable drawable) {
        if (drawable != null) {
            this.f2625a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }
}
