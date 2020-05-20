package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0390h;
import p071f.p072a.C3102j;

/* renamed from: androidx.appcompat.widget.o */
class C0253o extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1131b = (VERSION.SDK_INT < 21);

    /* renamed from: a */
    private boolean f1132a;

    public C0253o(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1251a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1251a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0275t0 a = C0275t0.m1311a(context, attributeSet, C3102j.PopupWindow, i, i2);
        if (a.mo1751g(C3102j.PopupWindow_overlapAnchor)) {
            m1252a(a.mo1738a(C3102j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo1741b(C3102j.PopupWindow_android_popupBackground));
        a.mo1737a();
    }

    /* renamed from: a */
    private void m1252a(boolean z) {
        if (f1131b) {
            this.f1132a = z;
        } else {
            C0390h.m2022a((PopupWindow) this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1131b && this.f1132a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1131b && this.f1132a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1131b && this.f1132a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
