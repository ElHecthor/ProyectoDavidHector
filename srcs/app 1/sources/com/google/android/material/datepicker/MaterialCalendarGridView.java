package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import p071f.p097h.p107l.C3317d;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p147g.p156d.p157a.p185c.C4410f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: f */
    private final Calendar f7547f;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C2613a extends C3323a {
        C2613a(MaterialCalendarGridView materialCalendarGridView) {
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            super.mo2349a(view, cVar);
            cVar.mo10747a((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7547f = C2656r.m10961d();
        if (C2638i.m10898g(getContext())) {
            setNextFocusLeftId(C4410f.cancel_button);
            setNextFocusRightId(C4410f.confirm_button);
        }
        C3379v.m13788a((View) this, (C3323a) new C2613a(this));
    }

    /* renamed from: a */
    private static int m10815a(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: a */
    private void m10816a(int i, Rect rect) {
        int a;
        if (i == 33) {
            a = getAdapter().mo8671b();
        } else if (i == 130) {
            a = getAdapter().mo8669a();
        } else {
            super.onFocusChanged(true, i, rect);
            return;
        }
        setSelection(a);
    }

    /* renamed from: a */
    private static boolean m10817a(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    public C2648m getAdapter() {
        return (C2648m) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C2648m adapter = getAdapter();
        C2620d<?> dVar = adapter.f7648g;
        C2619c cVar = adapter.f7649h;
        Long item = adapter.getItem(adapter.mo8669a());
        Long item2 = adapter.getItem(adapter.mo8671b());
        for (C3317d dVar2 : dVar.mo8622l()) {
            F f = dVar2.f9493a;
            if (f != null) {
                if (dVar2.f9494b == null) {
                    continue;
                } else {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) dVar2.f9494b).longValue();
                    if (!m10817a(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        if (longValue < item.longValue()) {
                            i2 = adapter.mo8669a();
                            i = adapter.mo8672b(i2) ? 0 : materialCalendarGridView.getChildAt(i2 - 1).getRight();
                        } else {
                            materialCalendarGridView.f7547f.setTimeInMillis(longValue);
                            i2 = adapter.mo8670a(materialCalendarGridView.f7547f.get(5));
                            i = m10815a(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > item2.longValue()) {
                            i4 = adapter.mo8671b();
                            i3 = adapter.mo8673c(i4) ? getWidth() : materialCalendarGridView.getChildAt(i4).getRight();
                        } else {
                            materialCalendarGridView.f7547f.setTimeInMillis(longValue2);
                            i4 = adapter.mo8670a(materialCalendarGridView.f7547f.get(5));
                            i3 = m10815a(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) adapter.getItemId(i2);
                        int itemId2 = (int) adapter.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i2 ? 0 : i), (float) (childAt.getTop() + cVar.f7566a.mo8617b()), (float) (i4 > numColumns2 ? getWidth() : i3), (float) (childAt.getBottom() - cVar.f7566a.mo8615a()), cVar.f7573h);
                            itemId++;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m10816a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo8669a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo8669a());
        return true;
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C2648m) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C2648m.class.getCanonicalName()}));
        }
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo8669a()) {
            i = getAdapter().mo8669a();
        }
        super.setSelection(i);
    }
}
