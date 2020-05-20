package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0580o;
import androidx.recyclerview.widget.RecyclerView.C0580o.C0583c;
import androidx.recyclerview.widget.RecyclerView.C0585p;
import androidx.recyclerview.widget.RecyclerView.C0592v;
import java.util.Arrays;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p097h.p108m.p109f0.C3347c.C3350c;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f2274I = false;

    /* renamed from: J */
    int f2275J = -1;

    /* renamed from: K */
    int[] f2276K;

    /* renamed from: L */
    View[] f2277L;

    /* renamed from: M */
    final SparseIntArray f2278M = new SparseIntArray();

    /* renamed from: N */
    final SparseIntArray f2279N = new SparseIntArray();

    /* renamed from: O */
    C0553c f2280O = new C0551a();

    /* renamed from: P */
    final Rect f2281P = new Rect();

    /* renamed from: Q */
    private boolean f2282Q;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0551a extends C0553c {
        /* renamed from: a */
        public int mo3130a(int i) {
            return 1;
        }

        /* renamed from: d */
        public int mo3131d(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0552b extends C0585p {

        /* renamed from: e */
        int f2283e = -1;

        /* renamed from: f */
        int f2284f = 0;

        public C0552b(int i, int i2) {
            super(i, i2);
        }

        public C0552b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0552b(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0552b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public int mo3132e() {
            return this.f2283e;
        }

        /* renamed from: f */
        public int mo3133f() {
            return this.f2284f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C0553c {

        /* renamed from: a */
        final SparseIntArray f2285a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f2286b = new SparseIntArray();

        /* renamed from: c */
        private boolean f2287c = false;

        /* renamed from: d */
        private boolean f2288d = false;

        /* renamed from: a */
        static int m2859a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* renamed from: a */
        public abstract int mo3130a(int i);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo3134a(int i, int i2) {
            if (!this.f2288d) {
                return mo3138c(i, i2);
            }
            int i3 = this.f2286b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int c = mo3138c(i, i2);
            this.f2286b.put(i, c);
            return c;
        }

        /* renamed from: a */
        public void mo3135a() {
            this.f2286b.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo3136b(int i, int i2) {
            if (!this.f2287c) {
                return mo3131d(i, i2);
            }
            int i3 = this.f2285a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo3131d(i, i2);
            this.f2285a.put(i, d);
            return d;
        }

        /* renamed from: b */
        public void mo3137b() {
            this.f2285a.clear();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3138c(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f2288d
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.f2286b
                int r0 = m2859a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.f2286b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.mo3136b(r0, r8)
                int r0 = r6.mo3130a(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.mo3130a(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.mo3130a(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C0553c.mo3138c(int, int):int");
        }

        /* renamed from: d */
        public abstract int mo3131d(int i, int i2);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo3129l(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo3129l(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo3129l(C0580o.m3113a(context, attributeSet, i, i2).f2410b);
    }

    /* renamed from: O */
    private void m2808O() {
        int e = mo3587e();
        for (int i = 0; i < e; i++) {
            C0552b bVar = (C0552b) mo3583d(i).getLayoutParams();
            int a = bVar.mo3630a();
            this.f2278M.put(a, bVar.mo3133f());
            this.f2279N.put(a, bVar.mo3132e());
        }
    }

    /* renamed from: P */
    private void m2809P() {
        this.f2278M.clear();
        this.f2279N.clear();
    }

    /* renamed from: Q */
    private void m2810Q() {
        View[] viewArr = this.f2277L;
        if (viewArr == null || viewArr.length != this.f2275J) {
            this.f2277L = new View[this.f2275J];
        }
    }

    /* renamed from: R */
    private void m2811R() {
        int i;
        int i2;
        if (mo3145J() == 1) {
            i2 = mo3617r() - mo3615p();
            i = mo3613o();
        } else {
            i2 = mo3598h() - mo3611n();
            i = mo3616q();
        }
        m2823m(i2 - i);
    }

    /* renamed from: a */
    private int m2812a(C0592v vVar, C0560a0 a0Var, int i) {
        if (!a0Var.mo3389d()) {
            return this.f2280O.mo3134a(i, this.f2275J);
        }
        int a = vVar.mo3653a(i);
        if (a != -1) {
            return this.f2280O.mo3134a(a, this.f2275J);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* renamed from: a */
    private void m2813a(float f, int i) {
        m2823m(Math.max(Math.round(f * ((float) this.f2275J)), i));
    }

    /* renamed from: a */
    private void m2814a(View view, int i, int i2, boolean z) {
        C0585p pVar = (C0585p) view.getLayoutParams();
        if (z ? mo3573b(view, i, i2, pVar) : mo3554a(view, i, i2, pVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m2815a(View view, int i, boolean z) {
        int i2;
        int i3;
        C0552b bVar = (C0552b) view.getLayoutParams();
        Rect rect = bVar.f2414b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int f = mo3126f(bVar.f2283e, bVar.f2284f);
        if (this.f2297s == 1) {
            i2 = C0580o.m3112a(f, i, i5, bVar.width, false);
            i3 = C0580o.m3112a(this.f2299u.mo3952g(), mo3601i(), i4, bVar.height, true);
        } else {
            int a = C0580o.m3112a(f, i, i4, bVar.height, false);
            int a2 = C0580o.m3112a(this.f2299u.mo3952g(), mo3618s(), i5, bVar.width, true);
            i3 = a;
            i2 = a2;
        }
        m2814a(view, i2, i3, z);
    }

    /* renamed from: a */
    private void m2816a(C0592v vVar, C0560a0 a0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f2277L[i3];
            C0552b bVar = (C0552b) view.getLayoutParams();
            int c = m2820c(vVar, a0Var, mo3608l(view));
            bVar.f2284f = c;
            bVar.f2283e = i4;
            i4 += c;
            i3 += i2;
        }
    }

    /* renamed from: a */
    static int[] m2817a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: b */
    private int m2818b(C0592v vVar, C0560a0 a0Var, int i) {
        if (!a0Var.mo3389d()) {
            return this.f2280O.mo3136b(i, this.f2275J);
        }
        int i2 = this.f2279N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = vVar.mo3653a(i);
        if (a != -1) {
            return this.f2280O.mo3136b(a, this.f2275J);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* renamed from: b */
    private void m2819b(C0592v vVar, C0560a0 a0Var, C0554a aVar, int i) {
        boolean z = i == 1;
        int b = m2818b(vVar, a0Var, aVar.f2306b);
        if (z) {
            while (b > 0) {
                int i2 = aVar.f2306b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f2306b = i3;
                    b = m2818b(vVar, a0Var, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int a = a0Var.mo3384a() - 1;
        int i4 = aVar.f2306b;
        while (i4 < a) {
            int i5 = i4 + 1;
            int b2 = m2818b(vVar, a0Var, i5);
            if (b2 <= b) {
                break;
            }
            i4 = i5;
            b = b2;
        }
        aVar.f2306b = i4;
    }

    /* renamed from: c */
    private int m2820c(C0592v vVar, C0560a0 a0Var, int i) {
        if (!a0Var.mo3389d()) {
            return this.f2280O.mo3130a(i);
        }
        int i2 = this.f2278M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = vVar.mo3653a(i);
        if (a != -1) {
            return this.f2280O.mo3130a(a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 1;
    }

    /* renamed from: i */
    private int m2821i(C0560a0 a0Var) {
        if (!(mo3587e() == 0 || a0Var.mo3384a() == 0)) {
            mo3141F();
            boolean L = mo3147L();
            View b = mo3163b(!L, true);
            View a = mo3153a(!L, true);
            if (!(b == null || a == null)) {
                int a2 = this.f2280O.mo3134a(mo3608l(b), this.f2275J);
                int a3 = this.f2280O.mo3134a(mo3608l(a), this.f2275J);
                int max = this.f2302x ? Math.max(0, ((this.f2280O.mo3134a(a0Var.mo3384a() - 1, this.f2275J) + 1) - Math.max(a2, a3)) - 1) : Math.max(0, Math.min(a2, a3));
                if (!L) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.f2299u.mo3940a(a) - this.f2299u.mo3947d(b))) / ((float) ((this.f2280O.mo3134a(mo3608l(a), this.f2275J) - this.f2280O.mo3134a(mo3608l(b), this.f2275J)) + 1)))) + ((float) (this.f2299u.mo3950f() - this.f2299u.mo3947d(b))));
            }
        }
        return 0;
    }

    /* renamed from: j */
    private int m2822j(C0560a0 a0Var) {
        if (!(mo3587e() == 0 || a0Var.mo3384a() == 0)) {
            mo3141F();
            View b = mo3163b(!mo3147L(), true);
            View a = mo3153a(!mo3147L(), true);
            if (!(b == null || a == null)) {
                if (!mo3147L()) {
                    return this.f2280O.mo3134a(a0Var.mo3384a() - 1, this.f2275J) + 1;
                }
                int a2 = this.f2299u.mo3940a(a) - this.f2299u.mo3947d(b);
                int a3 = this.f2280O.mo3134a(mo3608l(b), this.f2275J);
                return (int) ((((float) a2) / ((float) ((this.f2280O.mo3134a(mo3608l(a), this.f2275J) - a3) + 1))) * ((float) (this.f2280O.mo3134a(a0Var.mo3384a() - 1, this.f2275J) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: m */
    private void m2823m(int i) {
        this.f2276K = m2817a(this.f2276K, this.f2275J, i);
    }

    /* renamed from: D */
    public boolean mo3099D() {
        return this.f2292D == null && !this.f2274I;
    }

    /* renamed from: N */
    public int mo3100N() {
        return this.f2275J;
    }

    /* renamed from: a */
    public int mo3101a(int i, C0592v vVar, C0560a0 a0Var) {
        m2811R();
        m2810Q();
        return super.mo3101a(i, vVar, a0Var);
    }

    /* renamed from: a */
    public int mo3102a(C0592v vVar, C0560a0 a0Var) {
        if (this.f2297s == 1) {
            return this.f2275J;
        }
        if (a0Var.mo3384a() < 1) {
            return 0;
        }
        return m2812a(vVar, a0Var, a0Var.mo3384a() - 1) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3103a(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C0592v r26, androidx.recyclerview.widget.RecyclerView.C0560a0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo3575c(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C0552b) r5
            int r6 = r5.f2283e
            int r5 = r5.f2284f
            int r5 = r5 + r6
            android.view.View r7 = super.mo3103a(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo3172j(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f2302x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo3587e()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo3587e()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f2297s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo3146K()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m2812a(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.m2812a(r1, r2, r10)
            android.view.View r1 = r0.mo3583d(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.C0552b) r9
            int r2 = r9.f2283e
            r18 = r3
            int r3 = r9.f2284f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo3556a(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f2283e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f2283e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo3103a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo3104a(C0592v vVar, C0560a0 a0Var, int i, int i2, int i3) {
        mo3141F();
        int f = this.f2299u.mo3950f();
        int b = this.f2299u.mo3942b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View d = mo3583d(i);
            int l = mo3608l(d);
            if (l >= 0 && l < i3 && m2818b(vVar, a0Var, l) == 0) {
                if (((C0585p) d.getLayoutParams()).mo3632c()) {
                    if (view2 == null) {
                        view2 = d;
                    }
                } else if (this.f2299u.mo3947d(d) < b && this.f2299u.mo3940a(d) >= f) {
                    return d;
                } else {
                    if (view == null) {
                        view = d;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* renamed from: a */
    public C0585p mo3105a(Context context, AttributeSet attributeSet) {
        return new C0552b(context, attributeSet);
    }

    /* renamed from: a */
    public C0585p mo3106a(LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new C0552b((MarginLayoutParams) layoutParams) : new C0552b(layoutParams);
    }

    /* renamed from: a */
    public void mo3107a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f2276K == null) {
            super.mo3107a(rect, i, i2);
        }
        int o = mo3613o() + mo3615p();
        int q = mo3616q() + mo3611n();
        if (this.f2297s == 1) {
            i4 = C0580o.m3111a(i2, rect.height() + q, mo3607l());
            int[] iArr = this.f2276K;
            i3 = C0580o.m3111a(i, iArr[iArr.length - 1] + o, mo3609m());
        } else {
            i3 = C0580o.m3111a(i, rect.width() + o, mo3609m());
            int[] iArr2 = this.f2276K;
            i4 = C0580o.m3111a(i2, iArr2[iArr2.length - 1] + q, mo3607l());
        }
        mo3576c(i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3108a(C0560a0 a0Var, C0556c cVar, C0583c cVar2) {
        int i = this.f2275J;
        for (int i2 = 0; i2 < this.f2275J && cVar.mo3186a(a0Var) && i > 0; i2++) {
            int i3 = cVar.f2317d;
            cVar2.mo3629a(i3, Math.max(0, cVar.f2320g));
            i -= this.f2280O.mo3130a(i3);
            cVar.f2317d += cVar.f2318e;
        }
    }

    /* renamed from: a */
    public void mo3109a(C0592v vVar, C0560a0 a0Var, View view, C3347c cVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0552b)) {
            super.mo3542a(view, cVar);
            return;
        }
        C0552b bVar = (C0552b) layoutParams;
        int a = m2812a(vVar, a0Var, bVar.mo3630a());
        if (this.f2297s == 0) {
            i4 = bVar.mo3132e();
            i3 = bVar.mo3133f();
            i = 1;
            z2 = false;
            z = false;
            i2 = a;
        } else {
            i3 = 1;
            i2 = bVar.mo3132e();
            i = bVar.mo3133f();
            z2 = false;
            z = false;
            i4 = a;
        }
        cVar.mo10755b((Object) C3350c.m13707a(i4, i3, i2, i, z2, z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3110a(C0592v vVar, C0560a0 a0Var, C0554a aVar, int i) {
        super.mo3110a(vVar, a0Var, aVar, i);
        m2811R();
        if (a0Var.mo3384a() > 0 && !a0Var.mo3389d()) {
            m2819b(vVar, a0Var, aVar, i);
        }
        m2810Q();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3111a(C0592v vVar, C0560a0 a0Var, C0556c cVar, C0555b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C0592v vVar2 = vVar;
        C0560a0 a0Var2 = a0Var;
        C0556c cVar2 = cVar;
        C0555b bVar2 = bVar;
        int e = this.f2299u.mo3948e();
        boolean z = false;
        boolean z2 = e != 1073741824;
        int i11 = mo3587e() > 0 ? this.f2276K[this.f2275J] : 0;
        if (z2) {
            m2811R();
        }
        boolean z3 = cVar2.f2318e == 1;
        int i12 = this.f2275J;
        if (!z3) {
            i12 = m2818b(vVar2, a0Var2, cVar2.f2317d) + m2820c(vVar2, a0Var2, cVar2.f2317d);
        }
        int i13 = 0;
        while (i13 < this.f2275J && cVar2.mo3186a(a0Var2) && i12 > 0) {
            int i14 = cVar2.f2317d;
            int c = m2820c(vVar2, a0Var2, i14);
            if (c <= this.f2275J) {
                i12 -= c;
                if (i12 < 0) {
                    break;
                }
                View a = cVar2.mo3183a(vVar2);
                if (a == null) {
                    break;
                }
                this.f2277L[i13] = a;
                i13++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Item at position ");
                sb.append(i14);
                sb.append(" requires ");
                sb.append(c);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.f2275J);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i13 == 0) {
            bVar2.f2311b = true;
            return;
        }
        float f = 0.0f;
        m2816a(vVar2, a0Var2, i13, z3);
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            View view = this.f2277L[i15];
            if (cVar2.f2325l == null) {
                if (z3) {
                    mo3567b(view);
                } else {
                    mo3568b(view, (int) z);
                }
            } else if (z3) {
                mo3535a(view);
            } else {
                mo3536a(view, z ? 1 : 0);
            }
            mo3540a(view, this.f2281P);
            m2815a(view, e, z);
            int b = this.f2299u.mo3943b(view);
            if (b > i16) {
                i16 = b;
            }
            float c2 = (((float) this.f2299u.mo3945c(view)) * 1.0f) / ((float) ((C0552b) view.getLayoutParams()).f2284f);
            if (c2 > f) {
                f = c2;
            }
            i15++;
            z = false;
        }
        if (z2) {
            m2813a(f, i11);
            i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                View view2 = this.f2277L[i17];
                m2815a(view2, 1073741824, true);
                int b2 = this.f2299u.mo3943b(view2);
                if (b2 > i16) {
                    i16 = b2;
                }
            }
        }
        for (int i18 = 0; i18 < i13; i18++) {
            View view3 = this.f2277L[i18];
            if (this.f2299u.mo3943b(view3) != i16) {
                C0552b bVar3 = (C0552b) view3.getLayoutParams();
                Rect rect = bVar3.f2414b;
                int i19 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i20 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int f2 = mo3126f(bVar3.f2283e, bVar3.f2284f);
                if (this.f2297s == 1) {
                    i10 = C0580o.m3112a(f2, 1073741824, i20, bVar3.width, false);
                    i9 = MeasureSpec.makeMeasureSpec(i16 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                    i9 = C0580o.m3112a(f2, 1073741824, i19, bVar3.height, false);
                    i10 = makeMeasureSpec;
                }
                m2814a(view3, i10, i9, true);
            }
        }
        int i21 = 0;
        bVar2.f2310a = i16;
        if (this.f2297s == 1) {
            if (cVar2.f2319f == -1) {
                i4 = cVar2.f2315b;
                i2 = i4 - i16;
            } else {
                int i22 = cVar2.f2315b;
                i2 = i22;
                i4 = i16 + i22;
            }
            i3 = 0;
            i = 0;
        } else if (cVar2.f2319f == -1) {
            int i23 = cVar2.f2315b;
            i = i23 - i16;
            i2 = 0;
            i3 = i23;
            i4 = 0;
        } else {
            int i24 = cVar2.f2315b;
            i3 = i16 + i24;
            i = i24;
            i4 = 0;
            i2 = 0;
        }
        while (i21 < i13) {
            View view4 = this.f2277L[i21];
            C0552b bVar4 = (C0552b) view4.getLayoutParams();
            if (this.f2297s != 1) {
                int q = mo3616q() + this.f2276K[bVar4.f2283e];
                i6 = q;
                i7 = i3;
                i8 = this.f2299u.mo3945c(view4) + q;
            } else if (mo3146K()) {
                int o = mo3613o() + this.f2276K[this.f2275J - bVar4.f2283e];
                i = o - this.f2299u.mo3945c(view4);
                i8 = i4;
                i7 = o;
                i6 = i2;
            } else {
                int o2 = mo3613o() + this.f2276K[bVar4.f2283e];
                i8 = i4;
                i5 = o2;
                i6 = i2;
                i7 = this.f2299u.mo3945c(view4) + o2;
                mo3538a(view4, i5, i6, i7, i8);
                if (!bVar4.mo3632c() || bVar4.mo3631b()) {
                    bVar2.f2312c = true;
                }
                bVar2.f2313d |= view4.hasFocusable();
                i21++;
                i4 = i8;
                i3 = i7;
                i2 = i6;
                i = i5;
            }
            i5 = i;
            mo3538a(view4, i5, i6, i7, i8);
            if (!bVar4.mo3632c()) {
            }
            bVar2.f2312c = true;
            bVar2.f2313d |= view4.hasFocusable();
            i21++;
            i4 = i8;
            i3 = i7;
            i2 = i6;
            i = i5;
        }
        Arrays.fill(this.f2277L, null);
    }

    /* renamed from: a */
    public void mo3112a(RecyclerView recyclerView, int i, int i2) {
        this.f2280O.mo3137b();
        this.f2280O.mo3135a();
    }

    /* renamed from: a */
    public void mo3113a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f2280O.mo3137b();
        this.f2280O.mo3135a();
    }

    /* renamed from: a */
    public void mo3114a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f2280O.mo3137b();
        this.f2280O.mo3135a();
    }

    /* renamed from: a */
    public boolean mo3115a(C0585p pVar) {
        return pVar instanceof C0552b;
    }

    /* renamed from: b */
    public int mo3116b(int i, C0592v vVar, C0560a0 a0Var) {
        m2811R();
        m2810Q();
        return super.mo3116b(i, vVar, a0Var);
    }

    /* renamed from: b */
    public int mo3117b(C0560a0 a0Var) {
        return this.f2282Q ? m2821i(a0Var) : super.mo3117b(a0Var);
    }

    /* renamed from: b */
    public int mo3118b(C0592v vVar, C0560a0 a0Var) {
        if (this.f2297s == 0) {
            return this.f2275J;
        }
        if (a0Var.mo3384a() < 1) {
            return 0;
        }
        return m2812a(vVar, a0Var, a0Var.mo3384a() - 1) + 1;
    }

    /* renamed from: b */
    public void mo3119b(RecyclerView recyclerView, int i, int i2) {
        this.f2280O.mo3137b();
        this.f2280O.mo3135a();
    }

    /* renamed from: b */
    public void mo3120b(boolean z) {
        if (!z) {
            super.mo3120b(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: c */
    public int mo3121c(C0560a0 a0Var) {
        return this.f2282Q ? m2822j(a0Var) : super.mo3121c(a0Var);
    }

    /* renamed from: c */
    public C0585p mo3122c() {
        return this.f2297s == 0 ? new C0552b(-2, -1) : new C0552b(-1, -2);
    }

    /* renamed from: d */
    public void mo3123d(RecyclerView recyclerView) {
        this.f2280O.mo3137b();
        this.f2280O.mo3135a();
    }

    /* renamed from: e */
    public int mo3124e(C0560a0 a0Var) {
        return this.f2282Q ? m2821i(a0Var) : super.mo3124e(a0Var);
    }

    /* renamed from: e */
    public void mo3125e(C0592v vVar, C0560a0 a0Var) {
        if (a0Var.mo3389d()) {
            m2808O();
        }
        super.mo3125e(vVar, a0Var);
        m2809P();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo3126f(int i, int i2) {
        if (this.f2297s != 1 || !mo3146K()) {
            int[] iArr = this.f2276K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f2276K;
        int i3 = this.f2275J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: f */
    public int mo3127f(C0560a0 a0Var) {
        return this.f2282Q ? m2822j(a0Var) : super.mo3127f(a0Var);
    }

    /* renamed from: g */
    public void mo3128g(C0560a0 a0Var) {
        super.mo3128g(a0Var);
        this.f2274I = false;
    }

    /* renamed from: l */
    public void mo3129l(int i) {
        if (i != this.f2275J) {
            this.f2274I = true;
            if (i >= 1) {
                this.f2275J = i;
                this.f2280O.mo3137b();
                mo3623z();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Span count should be at least 1. Provided ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
