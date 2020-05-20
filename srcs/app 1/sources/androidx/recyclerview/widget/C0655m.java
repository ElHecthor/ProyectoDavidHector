package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0580o;
import androidx.recyclerview.widget.RecyclerView.C0585p;
import androidx.recyclerview.widget.RecyclerView.C0597z;
import androidx.recyclerview.widget.RecyclerView.C0597z.C0598a;

/* renamed from: androidx.recyclerview.widget.m */
public class C0655m extends C0597z {

    /* renamed from: i */
    protected final LinearInterpolator f2688i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f2689j = new DecelerateInterpolator();

    /* renamed from: k */
    protected PointF f2690k;

    /* renamed from: l */
    private final DisplayMetrics f2691l;

    /* renamed from: m */
    private boolean f2692m = false;

    /* renamed from: n */
    private float f2693n;

    /* renamed from: o */
    protected int f2694o = 0;

    /* renamed from: p */
    protected int f2695p = 0;

    public C0655m(Context context) {
        this.f2691l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: b */
    private int m3692b(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* renamed from: k */
    private float m3693k() {
        if (!this.f2692m) {
            this.f2693n = mo3920a(this.f2691l);
            this.f2692m = true;
        }
        return this.f2693n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo3920a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: a */
    public int mo3921a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: a */
    public int mo3922a(View view, int i) {
        C0580o b = mo3703b();
        if (b == null || !b.mo3162a()) {
            return 0;
        }
        C0585p pVar = (C0585p) view.getLayoutParams();
        return mo3921a(b.mo3591f(view) - pVar.leftMargin, b.mo3602i(view) + pVar.rightMargin, b.mo3613o(), b.mo3617r() - b.mo3615p(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3698a(int i, int i2, C0560a0 a0Var, C0598a aVar) {
        if (mo3694a() == 0) {
            mo3711h();
            return;
        }
        this.f2694o = m3692b(this.f2694o, i);
        int b = m3692b(this.f2695p, i2);
        this.f2695p = b;
        if (this.f2694o == 0 && b == 0) {
            mo3923a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3700a(View view, C0560a0 a0Var, C0598a aVar) {
        int a = mo3922a(view, mo3927i());
        int b = mo3924b(view, mo3928j());
        int d = mo3925d((int) Math.sqrt((double) ((a * a) + (b * b))));
        if (d > 0) {
            aVar.mo3713a(-a, -b, d, this.f2689j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3923a(C0598a aVar) {
        PointF a = mo3696a(mo3705c());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo3712a(mo3705c());
            mo3711h();
            return;
        }
        mo3699a(a);
        this.f2690k = a;
        this.f2694o = (int) (a.x * 10000.0f);
        this.f2695p = (int) (a.y * 10000.0f);
        aVar.mo3713a((int) (((float) this.f2694o) * 1.2f), (int) (((float) this.f2695p) * 1.2f), (int) (((float) mo3926e(10000)) * 1.2f), this.f2688i);
    }

    /* renamed from: b */
    public int mo3924b(View view, int i) {
        C0580o b = mo3703b();
        if (b == null || !b.mo3165b()) {
            return 0;
        }
        C0585p pVar = (C0585p) view.getLayoutParams();
        return mo3921a(b.mo3604j(view) - pVar.topMargin, b.mo3588e(view) + pVar.bottomMargin, b.mo3616q(), b.mo3598h() - b.mo3611n(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo3925d(int i) {
        return (int) Math.ceil(((double) mo3926e(i)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo3926e(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * m3693k()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3709f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo3710g() {
        this.f2695p = 0;
        this.f2694o = 0;
        this.f2690k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo3927i() {
        PointF pointF = this.f2690k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo3928j() {
        PointF pointF = this.f2690k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
