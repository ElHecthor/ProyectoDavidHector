package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0332c;
import java.util.List;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.p199v.C4452b;

public abstract class ExpandableBehavior extends C0332c<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f8207a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class C2795a implements OnPreDrawListener {

        /* renamed from: f */
        final /* synthetic */ View f8208f;

        /* renamed from: g */
        final /* synthetic */ int f8209g;

        /* renamed from: h */
        final /* synthetic */ C4452b f8210h;

        C2795a(View view, int i, C4452b bVar) {
            this.f8208f = view;
            this.f8209g = i;
            this.f8210h = bVar;
        }

        public boolean onPreDraw() {
            this.f8208f.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f8207a == this.f8209g) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                C4452b bVar = this.f8210h;
                expandableBehavior.mo9380a((View) bVar, this.f8208f, bVar.mo8741a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private boolean m11646a(boolean z) {
        boolean z2 = false;
        if (z) {
            int i = this.f8207a;
            if (i == 0 || i == 2) {
                z2 = true;
            }
            return z2;
        }
        if (this.f8207a == 1) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo9380a(View view, View view2, boolean z, boolean z2);

    /* renamed from: a */
    public boolean mo2106a(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!C3379v.m13768D(view)) {
            C4452b e = mo9381e(coordinatorLayout, view);
            if (e != null && m11646a(e.mo8741a())) {
                int i2 = e.mo8741a() ? 1 : 2;
                this.f8207a = i2;
                view.getViewTreeObserver().addOnPreDrawListener(new C2795a(view, i2, e));
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo2116b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C4452b bVar = (C4452b) view2;
        if (!m11646a(bVar.mo8741a())) {
            return false;
        }
        this.f8207a = bVar.mo8741a() ? 1 : 2;
        return mo9380a((View) bVar, view, bVar.mo8741a(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C4452b mo9381e(CoordinatorLayout coordinatorLayout, View view) {
        List b = coordinatorLayout.mo2053b(view);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) b.get(i);
            if (mo2111a(coordinatorLayout, view, view2)) {
                return (C4452b) view2;
            }
        }
        return null;
    }
}
