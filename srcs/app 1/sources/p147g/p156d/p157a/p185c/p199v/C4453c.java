package p147g.p156d.p157a.p185c.p199v;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: g.d.a.c.v.c */
public final class C4453c {

    /* renamed from: a */
    private final View f11792a;

    /* renamed from: b */
    private boolean f11793b = false;

    /* renamed from: c */
    private int f11794c = 0;

    public C4453c(C4452b bVar) {
        this.f11792a = (View) bVar;
    }

    /* renamed from: d */
    private void m18154d() {
        ViewParent parent = this.f11792a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).mo2047a(this.f11792a);
        }
    }

    /* renamed from: a */
    public int mo13258a() {
        return this.f11794c;
    }

    /* renamed from: a */
    public void mo13259a(int i) {
        this.f11794c = i;
    }

    /* renamed from: a */
    public void mo13260a(Bundle bundle) {
        this.f11793b = bundle.getBoolean("expanded", false);
        this.f11794c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f11793b) {
            m18154d();
        }
    }

    /* renamed from: b */
    public boolean mo13261b() {
        return this.f11793b;
    }

    /* renamed from: c */
    public Bundle mo13262c() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f11793b);
        bundle.putInt("expandedComponentIdHint", this.f11794c);
        return bundle;
    }
}
