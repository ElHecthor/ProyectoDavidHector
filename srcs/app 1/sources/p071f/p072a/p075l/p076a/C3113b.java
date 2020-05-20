package p071f.p072a.p075l.p076a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0371a;

/* renamed from: f.a.l.a.b */
class C3113b extends Drawable implements Callback {

    /* renamed from: f */
    private C3116c f8779f;

    /* renamed from: g */
    private Rect f8780g;

    /* renamed from: h */
    private Drawable f8781h;

    /* renamed from: i */
    private Drawable f8782i;

    /* renamed from: j */
    private int f8783j = 255;

    /* renamed from: k */
    private boolean f8784k;

    /* renamed from: l */
    private int f8785l = -1;

    /* renamed from: m */
    private boolean f8786m;

    /* renamed from: n */
    private Runnable f8787n;

    /* renamed from: o */
    private long f8788o;

    /* renamed from: p */
    private long f8789p;

    /* renamed from: q */
    private C3115b f8790q;

    /* renamed from: f.a.l.a.b$a */
    class C3114a implements Runnable {
        C3114a() {
        }

        public void run() {
            C3113b.this.mo9942a(true);
            C3113b.this.invalidateSelf();
        }
    }

    /* renamed from: f.a.l.a.b$b */
    static class C3115b implements Callback {

        /* renamed from: f */
        private Callback f8792f;

        C3115b() {
        }

        /* renamed from: a */
        public Callback mo9976a() {
            Callback callback = this.f8792f;
            this.f8792f = null;
            return callback;
        }

        /* renamed from: a */
        public C3115b mo9977a(Callback callback) {
            this.f8792f = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Callback callback = this.f8792f;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Callback callback = this.f8792f;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: f.a.l.a.b$c */
    static abstract class C3116c extends ConstantState {

        /* renamed from: A */
        int f8793A;

        /* renamed from: B */
        int f8794B;

        /* renamed from: C */
        boolean f8795C;

        /* renamed from: D */
        ColorFilter f8796D;

        /* renamed from: E */
        boolean f8797E;

        /* renamed from: F */
        ColorStateList f8798F;

        /* renamed from: G */
        Mode f8799G;

        /* renamed from: H */
        boolean f8800H;

        /* renamed from: I */
        boolean f8801I;

        /* renamed from: a */
        final C3113b f8802a;

        /* renamed from: b */
        Resources f8803b;

        /* renamed from: c */
        int f8804c = 160;

        /* renamed from: d */
        int f8805d;

        /* renamed from: e */
        int f8806e;

        /* renamed from: f */
        SparseArray<ConstantState> f8807f;

        /* renamed from: g */
        Drawable[] f8808g;

        /* renamed from: h */
        int f8809h;

        /* renamed from: i */
        boolean f8810i;

        /* renamed from: j */
        boolean f8811j;

        /* renamed from: k */
        Rect f8812k;

        /* renamed from: l */
        boolean f8813l;

        /* renamed from: m */
        boolean f8814m;

        /* renamed from: n */
        int f8815n;

        /* renamed from: o */
        int f8816o;

        /* renamed from: p */
        int f8817p;

        /* renamed from: q */
        int f8818q;

        /* renamed from: r */
        boolean f8819r;

        /* renamed from: s */
        int f8820s;

        /* renamed from: t */
        boolean f8821t;

        /* renamed from: u */
        boolean f8822u;

        /* renamed from: v */
        boolean f8823v;

        /* renamed from: w */
        boolean f8824w;

        /* renamed from: x */
        boolean f8825x;

        /* renamed from: y */
        boolean f8826y;

        /* renamed from: z */
        int f8827z;

        C3116c(C3116c cVar, C3113b bVar, Resources resources) {
            this.f8810i = false;
            this.f8813l = false;
            this.f8825x = true;
            this.f8793A = 0;
            this.f8794B = 0;
            this.f8802a = bVar;
            Resources resources2 = resources != null ? resources : cVar != null ? cVar.f8803b : null;
            this.f8803b = resources2;
            int a = C3113b.m12595a(resources, cVar != null ? cVar.f8804c : 0);
            this.f8804c = a;
            if (cVar != null) {
                this.f8805d = cVar.f8805d;
                this.f8806e = cVar.f8806e;
                this.f8823v = true;
                this.f8824w = true;
                this.f8810i = cVar.f8810i;
                this.f8813l = cVar.f8813l;
                this.f8825x = cVar.f8825x;
                this.f8826y = cVar.f8826y;
                this.f8827z = cVar.f8827z;
                this.f8793A = cVar.f8793A;
                this.f8794B = cVar.f8794B;
                this.f8795C = cVar.f8795C;
                this.f8796D = cVar.f8796D;
                this.f8797E = cVar.f8797E;
                this.f8798F = cVar.f8798F;
                this.f8799G = cVar.f8799G;
                this.f8800H = cVar.f8800H;
                this.f8801I = cVar.f8801I;
                if (cVar.f8804c == a) {
                    if (cVar.f8811j) {
                        this.f8812k = new Rect(cVar.f8812k);
                        this.f8811j = true;
                    }
                    if (cVar.f8814m) {
                        this.f8815n = cVar.f8815n;
                        this.f8816o = cVar.f8816o;
                        this.f8817p = cVar.f8817p;
                        this.f8818q = cVar.f8818q;
                        this.f8814m = true;
                    }
                }
                if (cVar.f8819r) {
                    this.f8820s = cVar.f8820s;
                    this.f8819r = true;
                }
                if (cVar.f8821t) {
                    this.f8822u = cVar.f8822u;
                    this.f8821t = true;
                }
                Drawable[] drawableArr = cVar.f8808g;
                this.f8808g = new Drawable[drawableArr.length];
                this.f8809h = cVar.f8809h;
                SparseArray<ConstantState> sparseArray = cVar.f8807f;
                this.f8807f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f8809h);
                int i = this.f8809h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f8807f.put(i2, constantState);
                        } else {
                            this.f8808g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f8808g = new Drawable[10];
            this.f8809h = 0;
        }

        /* renamed from: b */
        private Drawable m12606b(Drawable drawable) {
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f8827z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f8802a);
            return mutate;
        }

        /* renamed from: n */
        private void m12607n() {
            SparseArray<ConstantState> sparseArray = this.f8807f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f8808g[this.f8807f.keyAt(i)] = m12606b(((ConstantState) this.f8807f.valueAt(i)).newDrawable(this.f8803b));
                }
                this.f8807f = null;
            }
        }

        /* renamed from: a */
        public final int mo9981a(Drawable drawable) {
            int i = this.f8809h;
            if (i >= this.f8808g.length) {
                mo9983a(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f8802a);
            this.f8808g[i] = drawable;
            this.f8809h++;
            this.f8806e = drawable.getChangingConfigurations() | this.f8806e;
            mo10003k();
            this.f8812k = null;
            this.f8811j = false;
            this.f8814m = false;
            this.f8823v = false;
            return i;
        }

        /* renamed from: a */
        public final Drawable mo9982a(int i) {
            Drawable drawable = this.f8808g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<ConstantState> sparseArray = this.f8807f;
            if (sparseArray != null) {
                int indexOfKey = sparseArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    Drawable b = m12606b(((ConstantState) this.f8807f.valueAt(indexOfKey)).newDrawable(this.f8803b));
                    this.f8808g[i] = b;
                    this.f8807f.removeAt(indexOfKey);
                    if (this.f8807f.size() == 0) {
                        this.f8807f = null;
                    }
                    return b;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo9983a(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f8808g, 0, drawableArr, 0, i);
            this.f8808g = drawableArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo9984a(Theme theme) {
            if (theme != null) {
                m12607n();
                int i = this.f8809h;
                Drawable[] drawableArr = this.f8808g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f8806e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo9985a(theme.getResources());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo9985a(Resources resources) {
            if (resources != null) {
                this.f8803b = resources;
                int a = C3113b.m12595a(resources, this.f8804c);
                int i = this.f8804c;
                this.f8804c = a;
                if (i != a) {
                    this.f8814m = false;
                    this.f8811j = false;
                }
            }
        }

        /* renamed from: a */
        public final void mo9986a(boolean z) {
            this.f8813l = z;
        }

        /* renamed from: a */
        public synchronized boolean mo9987a() {
            if (this.f8823v) {
                return this.f8824w;
            }
            m12607n();
            this.f8823v = true;
            int i = this.f8809h;
            Drawable[] drawableArr = this.f8808g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f8824w = false;
                    return false;
                }
            }
            this.f8824w = true;
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo9988b() {
            this.f8814m = true;
            m12607n();
            int i = this.f8809h;
            Drawable[] drawableArr = this.f8808g;
            this.f8816o = -1;
            this.f8815n = -1;
            this.f8818q = 0;
            this.f8817p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f8815n) {
                    this.f8815n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f8816o) {
                    this.f8816o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f8817p) {
                    this.f8817p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f8818q) {
                    this.f8818q = minimumHeight;
                }
            }
        }

        /* renamed from: b */
        public final void mo9989b(int i) {
            this.f8793A = i;
        }

        /* renamed from: b */
        public final void mo9990b(boolean z) {
            this.f8810i = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo9991b(int i, int i2) {
            int i3 = this.f8809h;
            Drawable[] drawableArr = this.f8808g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f8827z = i;
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final int mo9992c() {
            return this.f8808g.length;
        }

        /* renamed from: c */
        public final void mo9993c(int i) {
            this.f8794B = i;
        }

        public boolean canApplyTheme() {
            int i = this.f8809h;
            Drawable[] drawableArr = this.f8808g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    ConstantState constantState = (ConstantState) this.f8807f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final int mo9995d() {
            return this.f8809h;
        }

        /* renamed from: e */
        public final int mo9996e() {
            if (!this.f8814m) {
                mo9988b();
            }
            return this.f8816o;
        }

        /* renamed from: f */
        public final int mo9997f() {
            if (!this.f8814m) {
                mo9988b();
            }
            return this.f8818q;
        }

        /* renamed from: g */
        public final int mo9998g() {
            if (!this.f8814m) {
                mo9988b();
            }
            return this.f8817p;
        }

        public int getChangingConfigurations() {
            return this.f8805d | this.f8806e;
        }

        /* renamed from: h */
        public final Rect mo10000h() {
            Rect rect = null;
            if (this.f8810i) {
                return null;
            }
            if (this.f8812k != null || this.f8811j) {
                return this.f8812k;
            }
            m12607n();
            Rect rect2 = new Rect();
            int i = this.f8809h;
            Drawable[] drawableArr = this.f8808g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect2)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect2.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect2.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect2.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect2.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f8811j = true;
            this.f8812k = rect;
            return rect;
        }

        /* renamed from: i */
        public final int mo10001i() {
            if (!this.f8814m) {
                mo9988b();
            }
            return this.f8815n;
        }

        /* renamed from: j */
        public final int mo10002j() {
            if (this.f8819r) {
                return this.f8820s;
            }
            m12607n();
            int i = this.f8809h;
            Drawable[] drawableArr = this.f8808g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f8820s = opacity;
            this.f8819r = true;
            return opacity;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo10003k() {
            this.f8819r = false;
            this.f8821t = false;
        }

        /* renamed from: l */
        public final boolean mo10004l() {
            return this.f8813l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public abstract void mo9933m();
    }

    C3113b() {
    }

    /* renamed from: a */
    static int m12595a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* renamed from: a */
    private void m12596a(Drawable drawable) {
        if (this.f8790q == null) {
            this.f8790q = new C3115b();
        }
        C3115b bVar = this.f8790q;
        bVar.mo9977a(drawable.getCallback());
        drawable.setCallback(bVar);
        try {
            if (this.f8779f.f8793A <= 0 && this.f8784k) {
                drawable.setAlpha(this.f8783j);
            }
            if (this.f8779f.f8797E) {
                drawable.setColorFilter(this.f8779f.f8796D);
            } else {
                if (this.f8779f.f8800H) {
                    C0371a.m1898a(drawable, this.f8779f.f8798F);
                }
                if (this.f8779f.f8801I) {
                    C0371a.m1901a(drawable, this.f8779f.f8799G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f8779f.f8825x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f8779f.f8795C);
            }
            Rect rect = this.f8780g;
            if (VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f8790q.mo9976a());
        }
    }

    /* renamed from: c */
    private boolean m12597c() {
        return isAutoMirrored() && C0371a.m1909e(this) == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3116c mo9916a() {
        throw null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9941a(Resources resources) {
        this.f8779f.mo9985a(resources);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9918a(C3116c cVar) {
        this.f8779f = cVar;
        int i = this.f8785l;
        if (i >= 0) {
            Drawable a = cVar.mo9982a(i);
            this.f8781h = a;
            if (a != null) {
                m12596a(a);
            }
        }
        this.f8782i = null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9942a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f8784k = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f8781h
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f8788o
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f8783j
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            f.a.l.a.b$c r9 = r13.f8779f
            int r9 = r9.f8793A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f8783j
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f8788o = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f8782i
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f8789p
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f8782i = r0
            goto L_0x0061
        L_0x004e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            f.a.l.a.b$c r4 = r13.f8779f
            int r4 = r4.f8794B
            int r3 = r3 / r4
            int r4 = r13.f8783j
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f8789p = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f8787n
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p072a.p075l.p076a.C3113b.mo9942a(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9943a(int r10) {
        /*
            r9 = this;
            int r0 = r9.f8785l
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            f.a.l.a.b$c r0 = r9.f8779f
            int r0 = r0.f8794B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f8782i
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f8781h
            if (r0 == 0) goto L_0x0029
            r9.f8782i = r0
            f.a.l.a.b$c r0 = r9.f8779f
            int r0 = r0.f8794B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f8789p = r0
            goto L_0x0035
        L_0x0029:
            r9.f8782i = r4
            r9.f8789p = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f8781h
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            f.a.l.a.b$c r0 = r9.f8779f
            int r1 = r0.f8809h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo9982a(r10)
            r9.f8781h = r0
            r9.f8785l = r10
            if (r0 == 0) goto L_0x005a
            f.a.l.a.b$c r10 = r9.f8779f
            int r10 = r10.f8793A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f8788o = r2
        L_0x0051:
            r9.m12596a(r0)
            goto L_0x005a
        L_0x0055:
            r9.f8781h = r4
            r10 = -1
            r9.f8785l = r10
        L_0x005a:
            long r0 = r9.f8788o
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f8789p
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f8787n
            if (r0 != 0) goto L_0x0073
            f.a.l.a.b$a r0 = new f.a.l.a.b$a
            r0.<init>()
            r9.f8787n = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo9942a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p072a.p075l.p076a.C3113b.mo9943a(int):boolean");
    }

    public void applyTheme(Theme theme) {
        this.f8779f.mo9984a(theme);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo9945b() {
        return this.f8785l;
    }

    public boolean canApplyTheme() {
        return this.f8779f.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f8781h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f8782i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f8783j;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f8779f.getChangingConfigurations();
    }

    public final ConstantState getConstantState() {
        if (!this.f8779f.mo9987a()) {
            return null;
        }
        this.f8779f.f8805d = getChangingConfigurations();
        return this.f8779f;
    }

    public Drawable getCurrent() {
        return this.f8781h;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f8780g;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f8779f.mo10004l()) {
            return this.f8779f.mo9996e();
        }
        Drawable drawable = this.f8781h;
        return drawable != null ? drawable.getIntrinsicHeight() : -1;
    }

    public int getIntrinsicWidth() {
        if (this.f8779f.mo10004l()) {
            return this.f8779f.mo10001i();
        }
        Drawable drawable = this.f8781h;
        return drawable != null ? drawable.getIntrinsicWidth() : -1;
    }

    public int getMinimumHeight() {
        if (this.f8779f.mo10004l()) {
            return this.f8779f.mo9997f();
        }
        Drawable drawable = this.f8781h;
        return drawable != null ? drawable.getMinimumHeight() : 0;
    }

    public int getMinimumWidth() {
        if (this.f8779f.mo10004l()) {
            return this.f8779f.mo9998g();
        }
        Drawable drawable = this.f8781h;
        return drawable != null ? drawable.getMinimumWidth() : 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f8781h;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f8779f.mo10002j();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f8781h;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect h = this.f8779f.mo10000h();
        if (h != null) {
            rect.set(h);
            z = (h.right | ((h.left | h.top) | h.bottom)) != 0;
        } else {
            Drawable drawable = this.f8781h;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m12597c()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        C3116c cVar = this.f8779f;
        if (cVar != null) {
            cVar.mo10003k();
        }
        if (drawable == this.f8781h && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f8779f.f8795C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f8782i;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f8782i = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f8781h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f8784k) {
                this.f8781h.setAlpha(this.f8783j);
            }
        }
        if (this.f8789p != 0) {
            this.f8789p = 0;
            z = true;
        }
        if (this.f8788o != 0) {
            this.f8788o = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f8786m && super.mutate() == this) {
            C3116c a = mo9916a();
            a.mo9933m();
            mo9918a(a);
            this.f8786m = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8782i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f8781h;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f8779f.mo9991b(i, mo9945b());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f8782i;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f8781h;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f8782i;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f8781h;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f8781h && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f8784k || this.f8783j != i) {
            this.f8784k = true;
            this.f8783j = i;
            Drawable drawable = this.f8781h;
            if (drawable == null) {
                return;
            }
            if (this.f8788o == 0) {
                drawable.setAlpha(i);
            } else {
                mo9942a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C3116c cVar = this.f8779f;
        if (cVar.f8795C != z) {
            cVar.f8795C = z;
            Drawable drawable = this.f8781h;
            if (drawable != null) {
                C0371a.m1902a(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C3116c cVar = this.f8779f;
        cVar.f8797E = true;
        if (cVar.f8796D != colorFilter) {
            cVar.f8796D = colorFilter;
            Drawable drawable = this.f8781h;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C3116c cVar = this.f8779f;
        if (cVar.f8825x != z) {
            cVar.f8825x = z;
            Drawable drawable = this.f8781h;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f8781h;
        if (drawable != null) {
            C0371a.m1896a(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f8780g;
        if (rect == null) {
            this.f8780g = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f8781h;
        if (drawable != null) {
            C0371a.m1897a(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C3116c cVar = this.f8779f;
        cVar.f8800H = true;
        if (cVar.f8798F != colorStateList) {
            cVar.f8798F = colorStateList;
            C0371a.m1898a(this.f8781h, colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        C3116c cVar = this.f8779f;
        cVar.f8801I = true;
        if (cVar.f8799G != mode) {
            cVar.f8799G = mode;
            C0371a.m1901a(this.f8781h, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f8782i;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f8781h;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f8781h && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
