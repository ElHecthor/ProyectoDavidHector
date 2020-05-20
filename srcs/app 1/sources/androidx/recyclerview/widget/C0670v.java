package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import androidx.recyclerview.widget.RecyclerView.C0574l;
import androidx.recyclerview.widget.RecyclerView.C0574l.C0577c;

/* renamed from: androidx.recyclerview.widget.v */
public abstract class C0670v extends C0574l {

    /* renamed from: g */
    boolean f2712g = true;

    /* renamed from: a */
    public final void mo3966a(C0566d0 d0Var, boolean z) {
        mo3968c(d0Var, z);
        mo3509b(d0Var);
    }

    /* renamed from: a */
    public boolean mo3504a(C0566d0 d0Var) {
        return !this.f2712g || d0Var.mo3429o();
    }

    /* renamed from: a */
    public abstract boolean mo3861a(C0566d0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo3862a(C0566d0 d0Var, C0566d0 d0Var2, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public boolean mo3505a(C0566d0 d0Var, C0566d0 d0Var2, C0577c cVar, C0577c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f2386a;
        int i4 = cVar.f2387b;
        if (d0Var2.mo3440y()) {
            int i5 = cVar.f2386a;
            i = cVar.f2387b;
            i2 = i5;
        } else {
            i2 = cVar2.f2386a;
            i = cVar2.f2387b;
        }
        return mo3862a(d0Var, d0Var2, i3, i4, i2, i);
    }

    /* renamed from: a */
    public boolean mo3506a(C0566d0 d0Var, C0577c cVar, C0577c cVar2) {
        if (cVar == null || (cVar.f2386a == cVar2.f2386a && cVar.f2387b == cVar2.f2387b)) {
            return mo3864f(d0Var);
        }
        return mo3861a(d0Var, cVar.f2386a, cVar.f2387b, cVar2.f2386a, cVar2.f2387b);
    }

    /* renamed from: b */
    public final void mo3967b(C0566d0 d0Var, boolean z) {
        mo3969d(d0Var, z);
    }

    /* renamed from: b */
    public boolean mo3510b(C0566d0 d0Var, C0577c cVar, C0577c cVar2) {
        int i = cVar.f2386a;
        int i2 = cVar.f2387b;
        View view = d0Var.f2358a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2386a;
        int top = cVar2 == null ? view.getTop() : cVar2.f2387b;
        if (d0Var.mo3431q() || (i == left && i2 == top)) {
            return mo3865g(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo3861a(d0Var, i, i2, left, top);
    }

    /* renamed from: c */
    public void mo3968c(C0566d0 d0Var, boolean z) {
    }

    /* renamed from: c */
    public boolean mo3513c(C0566d0 d0Var, C0577c cVar, C0577c cVar2) {
        if (cVar.f2386a == cVar2.f2386a && cVar.f2387b == cVar2.f2387b) {
            mo3972j(d0Var);
            return false;
        }
        return mo3861a(d0Var, cVar.f2386a, cVar.f2387b, cVar2.f2386a, cVar2.f2387b);
    }

    /* renamed from: d */
    public void mo3969d(C0566d0 d0Var, boolean z) {
    }

    /* renamed from: f */
    public abstract boolean mo3864f(C0566d0 d0Var);

    /* renamed from: g */
    public abstract boolean mo3865g(C0566d0 d0Var);

    /* renamed from: h */
    public final void mo3970h(C0566d0 d0Var) {
        mo3976n(d0Var);
        mo3509b(d0Var);
    }

    /* renamed from: i */
    public final void mo3971i(C0566d0 d0Var) {
        mo3977o(d0Var);
    }

    /* renamed from: j */
    public final void mo3972j(C0566d0 d0Var) {
        mo3978p(d0Var);
        mo3509b(d0Var);
    }

    /* renamed from: k */
    public final void mo3973k(C0566d0 d0Var) {
        mo3979q(d0Var);
    }

    /* renamed from: l */
    public final void mo3974l(C0566d0 d0Var) {
        mo3980r(d0Var);
        mo3509b(d0Var);
    }

    /* renamed from: m */
    public final void mo3975m(C0566d0 d0Var) {
        mo3981s(d0Var);
    }

    /* renamed from: n */
    public void mo3976n(C0566d0 d0Var) {
    }

    /* renamed from: o */
    public void mo3977o(C0566d0 d0Var) {
    }

    /* renamed from: p */
    public void mo3978p(C0566d0 d0Var) {
    }

    /* renamed from: q */
    public void mo3979q(C0566d0 d0Var) {
    }

    /* renamed from: r */
    public void mo3980r(C0566d0 d0Var) {
    }

    /* renamed from: s */
    public void mo3981s(C0566d0 d0Var) {
    }
}
