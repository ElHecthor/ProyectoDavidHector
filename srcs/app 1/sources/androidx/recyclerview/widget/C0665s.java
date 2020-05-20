package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0580o;
import androidx.recyclerview.widget.RecyclerView.C0597z.C0598a;
import androidx.recyclerview.widget.RecyclerView.C0597z.C0599b;

/* renamed from: androidx.recyclerview.widget.s */
public class C0665s extends C0671w {

    /* renamed from: d */
    private C0662r f2705d;

    /* renamed from: e */
    private C0662r f2706e;

    /* renamed from: androidx.recyclerview.widget.s$a */
    class C0666a extends C0655m {
        C0666a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo3920a(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3700a(View view, C0560a0 a0Var, C0598a aVar) {
            C0665s sVar = C0665s.this;
            int[] a = sVar.mo3930a(sVar.f2713a.getLayoutManager(), view);
            int i = a[0];
            int i2 = a[1];
            int d = mo3925d(Math.max(Math.abs(i), Math.abs(i2)));
            if (d > 0) {
                aVar.mo3713a(i, i2, d, this.f2689j);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo3926e(int i) {
            return Math.min(100, super.mo3926e(i));
        }
    }

    /* renamed from: a */
    private int m3781a(C0580o oVar, View view, C0662r rVar) {
        return (rVar.mo3947d(view) + (rVar.mo3943b(view) / 2)) - (rVar.mo3950f() + (rVar.mo3952g() / 2));
    }

    /* renamed from: a */
    private View m3782a(C0580o oVar, C0662r rVar) {
        int e = oVar.mo3587e();
        View view = null;
        if (e == 0) {
            return null;
        }
        int f = rVar.mo3950f() + (rVar.mo3952g() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < e; i2++) {
            View d = oVar.mo3583d(i2);
            int abs = Math.abs((rVar.mo3947d(d) + (rVar.mo3943b(d) / 2)) - f);
            if (abs < i) {
                view = d;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: b */
    private boolean m3783b(C0580o oVar, int i, int i2) {
        boolean z = true;
        if (oVar.mo3162a()) {
            if (i <= 0) {
                z = false;
            }
            return z;
        }
        if (i2 <= 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: d */
    private C0662r m3784d(C0580o oVar) {
        C0662r rVar = this.f2706e;
        if (rVar == null || rVar.f2702a != oVar) {
            this.f2706e = C0662r.m3734a(oVar);
        }
        return this.f2706e;
    }

    /* renamed from: e */
    private C0662r m3785e(C0580o oVar) {
        if (oVar.mo3165b()) {
            return m3786f(oVar);
        }
        if (oVar.mo3162a()) {
            return m3784d(oVar);
        }
        return null;
    }

    /* renamed from: f */
    private C0662r m3786f(C0580o oVar) {
        C0662r rVar = this.f2705d;
        if (rVar == null || rVar.f2702a != oVar) {
            this.f2705d = C0662r.m3736b(oVar);
        }
        return this.f2705d;
    }

    /* renamed from: g */
    private boolean m3787g(C0580o oVar) {
        int j = oVar.mo3603j();
        if (!(oVar instanceof C0599b)) {
            return false;
        }
        PointF a = ((C0599b) oVar).mo3151a(j - 1);
        if (a != null) {
            return a.x < 0.0f || a.y < 0.0f;
        }
        return false;
    }

    /* renamed from: a */
    public int mo3929a(C0580o oVar, int i, int i2) {
        int j = oVar.mo3603j();
        if (j == 0) {
            return -1;
        }
        C0662r e = m3785e(oVar);
        if (e == null) {
            return -1;
        }
        int i3 = RecyclerView.UNDEFINED_DURATION;
        int i4 = Integer.MAX_VALUE;
        int e2 = oVar.mo3587e();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < e2; i5++) {
            View d = oVar.mo3583d(i5);
            if (d != null) {
                int a = m3781a(oVar, d, e);
                if (a <= 0 && a > i3) {
                    view2 = d;
                    i3 = a;
                }
                if (a >= 0 && a < i4) {
                    view = d;
                    i4 = a;
                }
            }
        }
        boolean b = m3783b(oVar, i, i2);
        if (b && view != null) {
            return oVar.mo3608l(view);
        }
        if (!b && view2 != null) {
            return oVar.mo3608l(view2);
        }
        if (b) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int l = oVar.mo3608l(view) + (m3787g(oVar) == b ? -1 : 1);
        if (l < 0 || l >= j) {
            return -1;
        }
        return l;
    }

    /* renamed from: a */
    public int[] mo3930a(C0580o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.mo3162a()) {
            iArr[0] = m3781a(oVar, view, m3784d(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo3165b()) {
            iArr[1] = m3781a(oVar, view, m3786f(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0655m mo3955b(C0580o oVar) {
        if (!(oVar instanceof C0599b)) {
            return null;
        }
        return new C0666a(this.f2713a.getContext());
    }

    /* renamed from: c */
    public View mo3931c(C0580o oVar) {
        C0662r d;
        if (oVar.mo3165b()) {
            d = m3786f(oVar);
        } else if (!oVar.mo3162a()) {
            return null;
        } else {
            d = m3784d(oVar);
        }
        return m3782a(oVar, d);
    }
}
