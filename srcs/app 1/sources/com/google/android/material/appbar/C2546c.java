package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0332c;

/* renamed from: com.google.android.material.appbar.c */
class C2546c<V extends View> extends C0332c<V> {

    /* renamed from: a */
    private C2547d f7185a;

    /* renamed from: b */
    private int f7186b = 0;

    /* renamed from: c */
    private int f7187c = 0;

    public C2546c() {
    }

    public C2546c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo7939a(int i) {
        C2547d dVar = this.f7185a;
        if (dVar != null) {
            return dVar.mo7944b(i);
        }
        this.f7186b = i;
        return false;
    }

    /* renamed from: a */
    public boolean mo2106a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo7935b(coordinatorLayout, v, i);
        if (this.f7185a == null) {
            this.f7185a = new C2547d(v);
        }
        this.f7185a.mo7945c();
        this.f7185a.mo7941a();
        int i2 = this.f7186b;
        if (i2 != 0) {
            this.f7185a.mo7944b(i2);
            this.f7186b = 0;
        }
        int i3 = this.f7187c;
        if (i3 != 0) {
            this.f7185a.mo7942a(i3);
            this.f7187c = 0;
        }
        return true;
    }

    /* renamed from: b */
    public int mo7940b() {
        C2547d dVar = this.f7185a;
        if (dVar != null) {
            return dVar.mo7943b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7935b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo2059c((View) v, i);
    }
}
