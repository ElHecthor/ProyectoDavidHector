package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0580o;
import androidx.recyclerview.widget.RecyclerView.C0597z.C0599b;

/* renamed from: androidx.recyclerview.widget.n */
public class C0656n extends C0671w {

    /* renamed from: d */
    private C0662r f2696d;

    /* renamed from: e */
    private C0662r f2697e;

    /* renamed from: a */
    private float m3707a(C0580o oVar, C0662r rVar) {
        int e = oVar.mo3587e();
        if (e == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        for (int i3 = 0; i3 < e; i3++) {
            View d = oVar.mo3583d(i3);
            int l = oVar.mo3608l(d);
            if (l != -1) {
                if (l < i) {
                    view = d;
                    i = l;
                }
                if (l > i2) {
                    view2 = d;
                    i2 = l;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(rVar.mo3940a(view), rVar.mo3940a(view2)) - Math.min(rVar.mo3947d(view), rVar.mo3947d(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    /* renamed from: a */
    private int m3708a(C0580o oVar, View view, C0662r rVar) {
        return (rVar.mo3947d(view) + (rVar.mo3943b(view) / 2)) - (rVar.mo3950f() + (rVar.mo3952g() / 2));
    }

    /* renamed from: a */
    private int m3709a(C0580o oVar, C0662r rVar, int i, int i2) {
        int[] b = mo3985b(i, i2);
        float a = m3707a(oVar, rVar);
        if (a <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(b[0]) > Math.abs(b[1]) ? b[0] : b[1])) / a);
    }

    /* renamed from: b */
    private View m3710b(C0580o oVar, C0662r rVar) {
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

    /* renamed from: d */
    private C0662r m3711d(C0580o oVar) {
        C0662r rVar = this.f2697e;
        if (rVar == null || rVar.f2702a != oVar) {
            this.f2697e = C0662r.m3734a(oVar);
        }
        return this.f2697e;
    }

    /* renamed from: e */
    private C0662r m3712e(C0580o oVar) {
        C0662r rVar = this.f2696d;
        if (rVar == null || rVar.f2702a != oVar) {
            this.f2696d = C0662r.m3736b(oVar);
        }
        return this.f2696d;
    }

    /* renamed from: a */
    public int mo3929a(C0580o oVar, int i, int i2) {
        int i3;
        int i4;
        if (!(oVar instanceof C0599b)) {
            return -1;
        }
        int j = oVar.mo3603j();
        if (j == 0) {
            return -1;
        }
        View c = mo3931c(oVar);
        if (c == null) {
            return -1;
        }
        int l = oVar.mo3608l(c);
        if (l == -1) {
            return -1;
        }
        int i5 = j - 1;
        PointF a = ((C0599b) oVar).mo3151a(i5);
        if (a == null) {
            return -1;
        }
        int i6 = 0;
        if (oVar.mo3162a()) {
            i3 = m3709a(oVar, m3711d(oVar), i, 0);
            if (a.x < 0.0f) {
                i3 = -i3;
            }
        } else {
            i3 = 0;
        }
        if (oVar.mo3165b()) {
            i4 = m3709a(oVar, m3712e(oVar), 0, i2);
            if (a.y < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.mo3165b()) {
            i3 = i4;
        }
        if (i3 == 0) {
            return -1;
        }
        int i7 = l + i3;
        if (i7 >= 0) {
            i6 = i7;
        }
        if (i6 < j) {
            i5 = i6;
        }
        return i5;
    }

    /* renamed from: a */
    public int[] mo3930a(C0580o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.mo3162a()) {
            iArr[0] = m3708a(oVar, view, m3711d(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo3165b()) {
            iArr[1] = m3708a(oVar, view, m3712e(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: c */
    public View mo3931c(C0580o oVar) {
        C0662r d;
        if (oVar.mo3165b()) {
            d = m3712e(oVar);
        } else if (!oVar.mo3162a()) {
            return null;
        } else {
            d = m3711d(oVar);
        }
        return m3710b(oVar, d);
    }
}
