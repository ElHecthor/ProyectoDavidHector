package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0580o;

/* renamed from: androidx.recyclerview.widget.u */
class C0669u {
    /* renamed from: a */
    static int m3811a(C0560a0 a0Var, C0662r rVar, View view, View view2, C0580o oVar, boolean z) {
        if (oVar.mo3587e() == 0 || a0Var.mo3384a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.mo3608l(view) - oVar.mo3608l(view2)) + 1;
        }
        return Math.min(rVar.mo3952g(), rVar.mo3940a(view2) - rVar.mo3947d(view));
    }

    /* renamed from: a */
    static int m3812a(C0560a0 a0Var, C0662r rVar, View view, View view2, C0580o oVar, boolean z, boolean z2) {
        if (oVar.mo3587e() == 0 || a0Var.mo3384a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (a0Var.mo3384a() - Math.max(oVar.mo3608l(view), oVar.mo3608l(view2))) - 1) : Math.max(0, Math.min(oVar.mo3608l(view), oVar.mo3608l(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(rVar.mo3940a(view2) - rVar.mo3947d(view))) / ((float) (Math.abs(oVar.mo3608l(view) - oVar.mo3608l(view2)) + 1)))) + ((float) (rVar.mo3950f() - rVar.mo3947d(view))));
    }

    /* renamed from: b */
    static int m3813b(C0560a0 a0Var, C0662r rVar, View view, View view2, C0580o oVar, boolean z) {
        if (oVar.mo3587e() == 0 || a0Var.mo3384a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.mo3384a();
        }
        return (int) ((((float) (rVar.mo3940a(view2) - rVar.mo3947d(view))) / ((float) (Math.abs(oVar.mo3608l(view) - oVar.mo3608l(view2)) + 1))) * ((float) a0Var.mo3384a()));
    }
}
