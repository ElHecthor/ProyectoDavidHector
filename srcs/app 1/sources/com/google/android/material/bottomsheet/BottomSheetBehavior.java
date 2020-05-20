package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0332c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0335f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p071f.p097h.p103h.C3276a;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c.C3348a;
import p071f.p097h.p108m.p109f0.C3355f;
import p071f.p097h.p108m.p109f0.C3355f.C3356a;
import p071f.p112j.p113a.C3400a;
import p071f.p112j.p114b.C3411c;
import p071f.p112j.p114b.C3411c.C3414c;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4389k;

public class BottomSheetBehavior<V extends View> extends C0332c<V> {

    /* renamed from: L */
    private static final int f7320L = C4415k.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    int f7321A;

    /* renamed from: B */
    int f7322B;

    /* renamed from: C */
    WeakReference<V> f7323C;

    /* renamed from: D */
    WeakReference<View> f7324D;

    /* renamed from: E */
    private final ArrayList<C2585e> f7325E = new ArrayList<>();

    /* renamed from: F */
    private VelocityTracker f7326F;

    /* renamed from: G */
    int f7327G;

    /* renamed from: H */
    private int f7328H;

    /* renamed from: I */
    boolean f7329I;

    /* renamed from: J */
    private Map<View, Integer> f7330J;

    /* renamed from: K */
    private final C3414c f7331K = new C2583c();

    /* renamed from: a */
    private int f7332a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f7333b = true;

    /* renamed from: c */
    private boolean f7334c = false;

    /* renamed from: d */
    private float f7335d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f7336e;

    /* renamed from: f */
    private boolean f7337f;

    /* renamed from: g */
    private int f7338g;

    /* renamed from: h */
    private boolean f7339h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4382g f7340i;

    /* renamed from: j */
    private C4389k f7341j;

    /* renamed from: k */
    private boolean f7342k;

    /* renamed from: l */
    private C2588g f7343l = null;

    /* renamed from: m */
    private ValueAnimator f7344m;

    /* renamed from: n */
    int f7345n;

    /* renamed from: o */
    int f7346o;

    /* renamed from: p */
    int f7347p;

    /* renamed from: q */
    float f7348q = 0.5f;

    /* renamed from: r */
    int f7349r;

    /* renamed from: s */
    float f7350s = -1.0f;

    /* renamed from: t */
    boolean f7351t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f7352u;

    /* renamed from: v */
    int f7353v = 4;

    /* renamed from: w */
    C3411c f7354w;

    /* renamed from: x */
    private boolean f7355x;

    /* renamed from: y */
    private int f7356y;

    /* renamed from: z */
    private boolean f7357z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class C2581a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f7358f;

        /* renamed from: g */
        final /* synthetic */ int f7359g;

        C2581a(View view, int i) {
            this.f7358f = view;
            this.f7359g = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo8110a(this.f7358f, this.f7359g);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C2582b implements AnimatorUpdateListener {
        C2582b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f7340i != null) {
                BottomSheetBehavior.this.f7340i.mo13068c(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C2583c extends C3414c {
        C2583c() {
        }

        /* renamed from: c */
        private boolean m10504c(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f7322B + bottomSheetBehavior.m10468h()) / 2;
        }

        /* renamed from: a */
        public int mo7955a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
            if (java.lang.Math.abs(r7.getTop() - r6.f7362a.f7345n) < java.lang.Math.abs(r7.getTop() - r6.f7362a.f7347p)) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
            if (java.lang.Math.abs(r8 - r6.f7362a.f7347p) < java.lang.Math.abs(r8 - r6.f7362a.f7349r)) goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
            if (java.lang.Math.abs(r8 - r6.f7362a.f7346o) < java.lang.Math.abs(r8 - r6.f7362a.f7349r)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ea, code lost:
            if (r8 < java.lang.Math.abs(r8 - r9.f7349r)) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fc, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f7362a.f7349r)) goto L_0x00b3;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo7956a(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r0 = 0
                r1 = 4
                r2 = 6
                r3 = 3
                int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r4 >= 0) goto L_0x0027
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f7333b
                if (r8 == 0) goto L_0x0017
            L_0x0010:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f7346o
            L_0x0014:
                r1 = 3
                goto L_0x00ff
            L_0x0017:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f7347p
                if (r8 <= r0) goto L_0x0024
                r8 = r0
                goto L_0x00b7
            L_0x0024:
                int r8 = r9.f7345n
                goto L_0x0014
            L_0x0027:
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r4.f7351t
                if (r5 == 0) goto L_0x007c
                boolean r4 = r4.mo8114a(r7, r9)
                if (r4 == 0) goto L_0x007c
                float r8 = java.lang.Math.abs(r8)
                float r0 = java.lang.Math.abs(r9)
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x0045
                r8 = 1140457472(0x43fa0000, float:500.0)
                int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
                if (r8 > 0) goto L_0x004b
            L_0x0045:
                boolean r8 = r6.m10504c(r7)
                if (r8 == 0) goto L_0x0052
            L_0x004b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f7322B
                r1 = 5
                goto L_0x00ff
            L_0x0052:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f7333b
                if (r8 == 0) goto L_0x005b
                goto L_0x0010
            L_0x005b:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f7345n
                int r8 = r8 - r9
                int r8 = java.lang.Math.abs(r8)
                int r9 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f7347p
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r8 >= r9) goto L_0x00b3
            L_0x0077:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f7345n
                goto L_0x0014
            L_0x007c:
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00b9
                float r8 = java.lang.Math.abs(r8)
                float r9 = java.lang.Math.abs(r9)
                int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
                if (r8 <= 0) goto L_0x008d
                goto L_0x00b9
            L_0x008d:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f7333b
                if (r8 == 0) goto L_0x009a
            L_0x0095:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f7349r
                goto L_0x00ff
            L_0x009a:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f7347p
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f7349r
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
            L_0x00b3:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f7347p
            L_0x00b7:
                r1 = 6
                goto L_0x00ff
            L_0x00b9:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f7333b
                if (r9 == 0) goto L_0x00dc
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f7346o
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f7349r
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
                goto L_0x0010
            L_0x00dc:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f7347p
                if (r8 >= r0) goto L_0x00ed
                int r9 = r9.f7349r
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                if (r8 >= r9) goto L_0x00b3
                goto L_0x0077
            L_0x00ed:
                int r9 = r8 - r0
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f7349r
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
                goto L_0x00b3
            L_0x00ff:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r0 = 1
                r9.mo8111a(r7, r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C2583c.mo7956a(android.view.View, float, float):void");
        }

        /* renamed from: a */
        public void mo7958a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo8108a(i2);
        }

        /* renamed from: b */
        public int mo8127b(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f7351t ? bottomSheetBehavior.f7322B : bottomSheetBehavior.f7349r;
        }

        /* renamed from: b */
        public int mo7959b(View view, int i, int i2) {
            int b = BottomSheetBehavior.this.m10468h();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C3276a.m13438a(i, b, bottomSheetBehavior.f7351t ? bottomSheetBehavior.f7322B : bottomSheetBehavior.f7349r);
        }

        /* renamed from: b */
        public boolean mo7960b(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f7353v;
            boolean z = true;
            if (i2 == 1 || bottomSheetBehavior.f7329I) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f7327G == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f7324D;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f7323C;
            if (weakReference2 == null || weakReference2.get() != view) {
                z = false;
            }
            return z;
        }

        /* renamed from: c */
        public void mo7961c(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo8124f(1);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C2584d implements C3355f {

        /* renamed from: a */
        final /* synthetic */ int f7363a;

        C2584d(int i) {
            this.f7363a = i;
        }

        /* renamed from: a */
        public boolean mo4398a(View view, C3356a aVar) {
            BottomSheetBehavior.this.mo8123e(this.f7363a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static abstract class C2585e {
        /* renamed from: a */
        public abstract void mo8128a(View view, float f);

        /* renamed from: a */
        public abstract void mo8129a(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    protected static class C2586f extends C3400a {
        public static final Creator<C2586f> CREATOR = new C2587a();

        /* renamed from: h */
        final int f7365h;

        /* renamed from: i */
        int f7366i;

        /* renamed from: j */
        boolean f7367j;

        /* renamed from: k */
        boolean f7368k;

        /* renamed from: l */
        boolean f7369l;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f$a */
        static class C2587a implements ClassLoaderCreator<C2586f> {
            C2587a() {
            }

            public C2586f createFromParcel(Parcel parcel) {
                return new C2586f(parcel, (ClassLoader) null);
            }

            public C2586f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2586f(parcel, classLoader);
            }

            public C2586f[] newArray(int i) {
                return new C2586f[i];
            }
        }

        public C2586f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7365h = parcel.readInt();
            this.f7366i = parcel.readInt();
            boolean z = false;
            this.f7367j = parcel.readInt() == 1;
            this.f7368k = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f7369l = z;
        }

        public C2586f(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f7365h = bottomSheetBehavior.f7353v;
            this.f7366i = bottomSheetBehavior.f7336e;
            this.f7367j = bottomSheetBehavior.f7333b;
            this.f7368k = bottomSheetBehavior.f7351t;
            this.f7369l = bottomSheetBehavior.f7352u;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7365h);
            parcel.writeInt(this.f7366i);
            parcel.writeInt(this.f7367j ? 1 : 0);
            parcel.writeInt(this.f7368k ? 1 : 0);
            parcel.writeInt(this.f7369l ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    private class C2588g implements Runnable {

        /* renamed from: f */
        private final View f7370f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f7371g;

        /* renamed from: h */
        int f7372h;

        C2588g(View view, int i) {
            this.f7370f = view;
            this.f7372h = i;
        }

        public void run() {
            C3411c cVar = BottomSheetBehavior.this.f7354w;
            if (cVar == null || !cVar.mo10910a(true)) {
                BottomSheetBehavior.this.mo8124f(this.f7372h);
            } else {
                C3379v.m13794a(this.f7370f, (Runnable) this);
            }
            this.f7371g = false;
        }
    }

    public BottomSheetBehavior() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0066, code lost:
        if (r9 == -1) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomSheetBehavior(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            r7.<init>(r8, r9)
            r0 = 0
            r7.f7332a = r0
            r1 = 1
            r7.f7333b = r1
            r7.f7334c = r0
            r2 = 0
            r7.f7343l = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r7.f7348q = r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.f7350s = r3
            r4 = 4
            r7.f7353v = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7.f7325E = r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r4 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
            r4.<init>()
            r7.f7331K = r4
            int[] r4 = p147g.p156d.p157a.p185c.C4416l.BottomSheetBehavior_Layout
            android.content.res.TypedArray r4 = r8.obtainStyledAttributes(r9, r4)
            int r5 = p147g.p156d.p157a.p185c.C4416l.BottomSheetBehavior_Layout_shapeAppearance
            boolean r5 = r4.hasValue(r5)
            r7.f7339h = r5
            int r5 = p147g.p156d.p157a.p185c.C4416l.BottomSheetBehavior_Layout_backgroundTint
            boolean r5 = r4.hasValue(r5)
            if (r5 == 0) goto L_0x0047
            int r6 = p147g.p156d.p157a.p185c.C4416l.BottomSheetBehavior_Layout_backgroundTint
            android.content.res.ColorStateList r6 = p147g.p156d.p157a.p185c.p202y.C4459c.m18175a(r8, r4, r6)
            r7.m10454a(r8, r9, r5, r6)
            goto L_0x004a
        L_0x0047:
            r7.m10453a(r8, r9, r5)
        L_0x004a:
            r7.m10466g()
            int r9 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r9 < r5) goto L_0x005b
            int r9 = p147g.p156d.p157a.p185c.C4416l.BottomSheetBehavior_Layout_android_elevation
            float r9 = r4.getDimension(r9, r3)
            r7.f7350s = r9
        L_0x005b:
            int r9 = p147g.p156d.p157a.p185c.C4416l.BottomSheetBehavior_Layout_behavior_peekHeight
            android.util.TypedValue r9 = r4.peekValue(r9)
            r3 = -1
            if (r9 == 0) goto L_0x0069
            int r9 = r9.data
            if (r9 != r3) goto L_0x0069
            goto L_0x006f
        L_0x0069:
            int r9 = p147g.p156d.p157a.p185c.C4416l.BottomSheetBehavior_Layout_behavior_peekHeight
            int r9 = r4.getDimensionPixelSize(r9, r3)
        L_0x006f:
            r7.mo8119c(r9)
            int r9 = p147g.p156d.p157a.p185c.C4416l.BottomSheetBehavior_Layout_behavior_hideable
            boolean r9 = r4.getBoolean(r9, r0)
            r7.mo8118b(r9)
            int r9 = p147g.p156d.p157a.p185c.C4416l.BottomSheetBehavior_Layout_behavior_fitToContents
            boolean r9 = r4.getBoolean(r9, r1)
            r7.mo8113a(r9)
            int r9 = p147g.p156d.p157a.p185c.C4416l.BottomSheetBehavior_Layout_behavior_skipCollapsed
            boolean r9 = r4.getBoolean(r9, r0)
            r7.mo8120c(r9)
            int r9 = p147g.p156d.p157a.p185c.C4416l.BottomSheetBehavior_Layout_behavior_saveFlags
            int r9 = r4.getInt(r9, r0)
            r7.mo8122d(r9)
            int r9 = p147g.p156d.p157a.p185c.C4416l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio
            float r9 = r4.getFloat(r9, r2)
            r7.mo8107a(r9)
            int r9 = p147g.p156d.p157a.p185c.C4416l.BottomSheetBehavior_Layout_behavior_expandedOffset
            int r9 = r4.getInt(r9, r0)
            r7.mo8116b(r9)
            r4.recycle()
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)
            int r8 = r8.getScaledMaximumFlingVelocity()
            float r8 = (float) r8
            r7.f7335d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    private void m10453a(Context context, AttributeSet attributeSet, boolean z) {
        m10454a(context, attributeSet, z, (ColorStateList) null);
    }

    /* renamed from: a */
    private void m10454a(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f7339h) {
            this.f7341j = C4389k.m17885a(context, attributeSet, C4375b.bottomSheetStyle, f7320L).mo13120a();
            C4382g gVar = new C4382g(this.f7341j);
            this.f7340i = gVar;
            gVar.mo13058a(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f7340i.setTint(typedValue.data);
                return;
            }
            this.f7340i.mo13059a(colorStateList);
        }
    }

    /* renamed from: a */
    private void m10455a(V v, C3348a aVar, int i) {
        C3379v.m13790a(v, aVar, null, new C2584d(i));
    }

    /* renamed from: a */
    private void m10456a(C2586f fVar) {
        int i = this.f7332a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f7336e = fVar.f7366i;
            }
            int i2 = this.f7332a;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f7333b = fVar.f7367j;
            }
            int i3 = this.f7332a;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.f7351t = fVar.f7368k;
            }
            int i4 = this.f7332a;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f7352u = fVar.f7369l;
            }
        }
    }

    /* renamed from: b */
    public static <V extends View> BottomSheetBehavior<V> m10458b(V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C0335f) {
            C0332c d = ((C0335f) layoutParams).mo2138d();
            if (d instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) d;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: d */
    private void m10461d() {
        int f = m10465f();
        if (this.f7333b) {
            this.f7349r = Math.max(this.f7322B - f, this.f7346o);
        } else {
            this.f7349r = this.f7322B - f;
        }
    }

    /* renamed from: d */
    private void m10462d(boolean z) {
        int intValue;
        WeakReference<V> weakReference = this.f7323C;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (VERSION.SDK_INT >= 16 && z) {
                    if (this.f7330J == null) {
                        this.f7330J = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f7323C.get()) {
                        if (z) {
                            if (VERSION.SDK_INT >= 16) {
                                this.f7330J.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            if (this.f7334c) {
                                intValue = 4;
                            }
                        } else if (this.f7334c) {
                            Map<View, Integer> map = this.f7330J;
                            if (map != null && map.containsKey(childAt)) {
                                intValue = ((Integer) this.f7330J.get(childAt)).intValue();
                            }
                        }
                        C3379v.m13820h(childAt, intValue);
                    }
                }
                if (!z) {
                    this.f7330J = null;
                }
            }
        }
    }

    /* renamed from: e */
    private void m10463e() {
        this.f7347p = (int) (((float) this.f7322B) * (1.0f - this.f7348q));
    }

    /* renamed from: f */
    private int m10465f() {
        return this.f7337f ? Math.max(this.f7338g, this.f7322B - ((this.f7321A * 9) / 16)) : this.f7336e;
    }

    /* renamed from: g */
    private void m10466g() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f7344m = ofFloat;
        ofFloat.setDuration(500);
        this.f7344m.addUpdateListener(new C2582b());
    }

    /* renamed from: g */
    private void m10467g(int i) {
        View view = (View) this.f7323C.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C3379v.m13767C(view)) {
                mo8110a(view, i);
            } else {
                view.post(new C2581a(view, i));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public int m10468h() {
        return this.f7333b ? this.f7346o : this.f7345n;
    }

    /* renamed from: h */
    private void m10469h(int i) {
        if (i != 2) {
            boolean z = i == 3;
            if (this.f7342k != z) {
                this.f7342k = z;
                if (this.f7340i != null) {
                    ValueAnimator valueAnimator = this.f7344m;
                    if (valueAnimator != null) {
                        if (valueAnimator.isRunning()) {
                            this.f7344m.reverse();
                        } else {
                            float f = z ? 0.0f : 1.0f;
                            this.f7344m.setFloatValues(new float[]{1.0f - f, f});
                            this.f7344m.start();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private float m10470i() {
        VelocityTracker velocityTracker = this.f7326F;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f7335d);
        return this.f7326F.getYVelocity(this.f7327G);
    }

    /* renamed from: j */
    private void m10471j() {
        this.f7327G = -1;
        VelocityTracker velocityTracker = this.f7326F;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7326F = null;
        }
    }

    /* renamed from: k */
    private void m10472k() {
        C3348a aVar;
        WeakReference<V> weakReference = this.f7323C;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                C3379v.m13816f(view, 524288);
                C3379v.m13816f(view, 262144);
                C3379v.m13816f(view, 1048576);
                if (this.f7351t && this.f7353v != 5) {
                    m10455a((V) view, C3348a.f9561j, 5);
                }
                int i = this.f7353v;
                int i2 = 6;
                if (i == 3) {
                    if (this.f7333b) {
                        i2 = 4;
                    }
                    aVar = C3348a.f9560i;
                } else if (i != 4) {
                    if (i == 6) {
                        m10455a((V) view, C3348a.f9560i, 4);
                        m10455a((V) view, C3348a.f9559h, 3);
                    }
                } else {
                    if (this.f7333b) {
                        i2 = 3;
                    }
                    aVar = C3348a.f9559h;
                }
                m10455a((V) view, aVar, i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo8106a(View view) {
        if (C3379v.m13769E(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = mo8106a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo2094a() {
        super.mo2094a();
        this.f7323C = null;
        this.f7354w = null;
    }

    /* renamed from: a */
    public void mo8107a(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f7348q = f;
        if (this.f7323C != null) {
            m10463e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8108a(int i) {
        float f;
        float f2;
        View view = (View) this.f7323C.get();
        if (view != null && !this.f7325E.isEmpty()) {
            int i2 = this.f7349r;
            if (i > i2 || i2 == m10468h()) {
                int i3 = this.f7349r;
                f = (float) (i3 - i);
                f2 = (float) (this.f7322B - i3);
            } else {
                int i4 = this.f7349r;
                f = (float) (i4 - i);
                f2 = (float) (i4 - m10468h());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f7325E.size(); i5++) {
                ((C2585e) this.f7325E.get(i5)).mo8128a(view, f3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8109a(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f7337f
            if (r4 != 0) goto L_0x0015
            r3.f7337f = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f7337f
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f7336e
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f7337f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f7336e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.f7323C
            if (r4 == 0) goto L_0x0042
            r3.m10461d()
            int r4 = r3.f7353v
            r0 = 4
            if (r4 != r0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.f7323C
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x003f
            int r4 = r3.f7353v
            r3.m10467g(r4)
            goto L_0x0042
        L_0x003f:
            r4.requestLayout()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo8109a(int, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8110a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f7349r;
        } else if (i == 6) {
            int i3 = this.f7347p;
            if (this.f7333b) {
                int i4 = this.f7346o;
                if (i3 <= i4) {
                    i2 = i4;
                    i = 3;
                }
            }
            i2 = i3;
        } else if (i == 3) {
            i2 = m10468h();
        } else if (!this.f7351t || i != 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f7322B;
        }
        mo8111a(view, i, i2, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8111a(View view, int i, int i2, boolean z) {
        if (z ? this.f7354w.mo10917c(view.getLeft(), i2) : this.f7354w.mo10916b(view, view.getLeft(), i2)) {
            mo8124f(2);
            m10469h(i);
            if (this.f7343l == null) {
                this.f7343l = new C2588g<>(view, i);
            }
            if (!this.f7343l.f7371g) {
                C2588g gVar = this.f7343l;
                gVar.f7372h = i;
                C3379v.m13794a(view, (Runnable) gVar);
                this.f7343l.f7371g = true;
                return;
            }
            this.f7343l.f7372h = i;
            return;
        }
        mo8124f(i);
    }

    /* renamed from: a */
    public void mo2095a(C0335f fVar) {
        super.mo2095a(fVar);
        this.f7323C = null;
        this.f7354w = null;
    }

    /* renamed from: a */
    public void mo2096a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C2586f fVar = (C2586f) parcelable;
        super.mo2096a(coordinatorLayout, v, fVar.mo10880a());
        m10456a(fVar);
        int i = fVar.f7365h;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.f7353v = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f7349r)) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (java.lang.Math.abs(r3 - r2.f7347p) < java.lang.Math.abs(r3 - r2.f7349r)) goto L_0x009b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2097a(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m10468h()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.mo8124f(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f7324D
            if (r3 == 0) goto L_0x00a4
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00a4
            boolean r3 = r2.f7357z
            if (r3 != 0) goto L_0x001f
            goto L_0x00a4
        L_0x001f:
            int r3 = r2.f7356y
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L_0x002b
            int r3 = r2.m10468h()
            goto L_0x009e
        L_0x002b:
            boolean r3 = r2.f7351t
            if (r3 == 0) goto L_0x003d
            float r3 = r2.m10470i()
            boolean r3 = r2.mo8114a(r4, r3)
            if (r3 == 0) goto L_0x003d
            int r3 = r2.f7322B
            r0 = 5
            goto L_0x009e
        L_0x003d:
            int r3 = r2.f7356y
            if (r3 != 0) goto L_0x007e
            int r3 = r4.getTop()
            boolean r1 = r2.f7333b
            if (r1 == 0) goto L_0x005d
            int r5 = r2.f7346o
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f7349r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0082
            int r3 = r2.f7346o
            goto L_0x009e
        L_0x005d:
            int r1 = r2.f7347p
            if (r3 >= r1) goto L_0x006e
            int r6 = r2.f7349r
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L_0x009b
            int r3 = r2.f7345n
            goto L_0x009e
        L_0x006e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f7349r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0082
            goto L_0x009b
        L_0x007e:
            boolean r3 = r2.f7333b
            if (r3 == 0) goto L_0x0086
        L_0x0082:
            int r3 = r2.f7349r
            r0 = 4
            goto L_0x009e
        L_0x0086:
            int r3 = r4.getTop()
            int r0 = r2.f7347p
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f7349r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0082
        L_0x009b:
            int r3 = r2.f7347p
            r0 = 6
        L_0x009e:
            r5 = 0
            r2.mo8111a(r4, r0, r3, r5)
            r2.f7357z = r5
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo2097a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: a */
    public void mo2100a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: a */
    public void mo2102a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f7324D;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i5 = top - i2;
                if (i2 <= 0) {
                    if (i2 < 0 && !view.canScrollVertically(-1)) {
                        int i6 = this.f7349r;
                        if (i5 <= i6 || this.f7351t) {
                            iArr[1] = i2;
                            C3379v.m13814e(v, -i2);
                            mo8124f(1);
                        } else {
                            iArr[1] = top - i6;
                            C3379v.m13814e(v, -iArr[1]);
                            i4 = 4;
                        }
                    }
                    mo8108a(v.getTop());
                    this.f7356y = i2;
                    this.f7357z = true;
                } else if (i5 < m10468h()) {
                    iArr[1] = top - m10468h();
                    C3379v.m13814e(v, -iArr[1]);
                    i4 = 3;
                } else {
                    iArr[1] = i2;
                    C3379v.m13814e(v, -i2);
                    mo8124f(1);
                    mo8108a(v.getTop());
                    this.f7356y = i2;
                    this.f7357z = true;
                }
                mo8124f(i4);
                mo8108a(v.getTop());
                this.f7356y = i2;
                this.f7357z = true;
            }
        }
    }

    /* renamed from: a */
    public void mo8112a(C2585e eVar) {
        if (!this.f7325E.contains(eVar)) {
            this.f7325E.add(eVar);
        }
    }

    /* renamed from: a */
    public void mo8113a(boolean z) {
        if (this.f7333b != z) {
            this.f7333b = z;
            if (this.f7323C != null) {
                m10461d();
            }
            mo8124f((!this.f7333b || this.f7353v != 6) ? this.f7353v : 3);
            m10472k();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo8114a(View view, float f) {
        boolean z = true;
        if (this.f7352u) {
            return true;
        }
        if (view.getTop() < this.f7349r) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f7349r)) / ((float) m10465f()) <= 0.5f) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo2106a(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        if (C3379v.m13826m(coordinatorLayout) && !C3379v.m13826m(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f7323C == null) {
            this.f7338g = coordinatorLayout.getResources().getDimensionPixelSize(C4408d.design_bottom_sheet_peek_height_min);
            this.f7323C = new WeakReference<>(v);
            if (this.f7339h) {
                C4382g gVar = this.f7340i;
                if (gVar != null) {
                    C3379v.m13787a((View) v, (Drawable) gVar);
                }
            }
            C4382g gVar2 = this.f7340i;
            if (gVar2 != null) {
                float f = this.f7350s;
                if (f == -1.0f) {
                    f = C3379v.m13825l(v);
                }
                gVar2.mo13064b(f);
                boolean z = this.f7353v == 3;
                this.f7342k = z;
                this.f7340i.mo13068c(z ? 0.0f : 1.0f);
            }
            m10472k();
            if (C3379v.m13827n(v) == 0) {
                C3379v.m13820h(v, 1);
            }
        }
        if (this.f7354w == null) {
            this.f7354w = C3411c.m13978a((ViewGroup) coordinatorLayout, this.f7331K);
        }
        int top = v.getTop();
        coordinatorLayout.mo2059c((View) v, i);
        this.f7321A = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f7322B = height;
        this.f7346o = Math.max(0, height - v.getHeight());
        m10463e();
        m10461d();
        int i3 = this.f7353v;
        if (i3 == 3) {
            i2 = m10468h();
        } else if (i3 == 6) {
            i2 = this.f7347p;
        } else if (!this.f7351t || i3 != 5) {
            int i4 = this.f7353v;
            if (i4 == 4) {
                i2 = this.f7349r;
            } else {
                if (i4 == 1 || i4 == 2) {
                    C3379v.m13814e(v, top - v.getTop());
                }
                this.f7324D = new WeakReference<>(mo8106a((View) v));
                return true;
            }
        } else {
            i2 = this.f7322B;
        }
        C3379v.m13814e(v, i2);
        this.f7324D = new WeakReference<>(mo8106a((View) v));
        return true;
    }

    /* renamed from: a */
    public boolean mo2110a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (!v.isShown()) {
            this.f7355x = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m10471j();
        }
        if (this.f7326F == null) {
            this.f7326F = VelocityTracker.obtain();
        }
        this.f7326F.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f7328H = (int) motionEvent.getY();
            if (this.f7353v != 2) {
                WeakReference<View> weakReference = this.f7324D;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.mo2052a(view2, x, this.f7328H)) {
                    this.f7327G = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f7329I = true;
                }
            }
            this.f7355x = this.f7327G == -1 && !coordinatorLayout.mo2052a((View) v, x, this.f7328H);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7329I = false;
            this.f7327G = -1;
            if (this.f7355x) {
                this.f7355x = false;
                return false;
            }
        }
        if (!this.f7355x) {
            C3411c cVar = this.f7354w;
            if (cVar != null && cVar.mo10914b(motionEvent)) {
                return true;
            }
        }
        WeakReference<View> weakReference2 = this.f7324D;
        if (weakReference2 != null) {
            view = (View) weakReference2.get();
        }
        if (actionMasked == 2 && view != null && !this.f7355x && this.f7353v != 1 && !coordinatorLayout.mo2052a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f7354w != null && Math.abs(((float) this.f7328H) - motionEvent.getY()) > ((float) this.f7354w.mo10911b())) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo2112a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f7324D;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f7353v != 3 || super.mo2112a(coordinatorLayout, v, view, f, f2);
    }

    /* renamed from: b */
    public int mo8115b() {
        return this.f7353v;
    }

    /* renamed from: b */
    public void mo8116b(int i) {
        if (i >= 0) {
            this.f7345n = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: b */
    public void mo8117b(C2585e eVar) {
        this.f7325E.remove(eVar);
    }

    /* renamed from: b */
    public void mo8118b(boolean z) {
        if (this.f7351t != z) {
            this.f7351t = z;
            if (!z && this.f7353v == 5) {
                mo8123e(4);
            }
            m10472k();
        }
    }

    /* renamed from: b */
    public boolean mo2115b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7353v == 1 && actionMasked == 0) {
            return true;
        }
        C3411c cVar = this.f7354w;
        if (cVar != null) {
            cVar.mo10906a(motionEvent);
        }
        if (actionMasked == 0) {
            m10471j();
        }
        if (this.f7326F == null) {
            this.f7326F = VelocityTracker.obtain();
        }
        this.f7326F.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f7355x && Math.abs(((float) this.f7328H) - motionEvent.getY()) > ((float) this.f7354w.mo10911b())) {
            this.f7354w.mo10907a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f7355x;
    }

    /* renamed from: b */
    public boolean mo2118b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f7356y = 0;
        this.f7357z = false;
        return (i & 2) != 0;
    }

    /* renamed from: c */
    public void mo8119c(int i) {
        mo8109a(i, false);
    }

    /* renamed from: c */
    public void mo8120c(boolean z) {
        this.f7352u = z;
    }

    /* renamed from: c */
    public boolean mo8121c() {
        return this.f7351t;
    }

    /* renamed from: d */
    public Parcelable mo2121d(CoordinatorLayout coordinatorLayout, V v) {
        return new C2586f(super.mo2121d(coordinatorLayout, v), this);
    }

    /* renamed from: d */
    public void mo8122d(int i) {
        this.f7332a = i;
    }

    /* renamed from: e */
    public void mo8123e(int i) {
        if (i != this.f7353v) {
            if (this.f7323C == null) {
                if (i == 4 || i == 3 || i == 6 || (this.f7351t && i == 5)) {
                    this.f7353v = i;
                }
                return;
            }
            m10467g(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo8124f(int i) {
        if (this.f7353v != i) {
            this.f7353v = i;
            WeakReference<V> weakReference = this.f7323C;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    if (i == 3) {
                        m10462d(true);
                    } else if (i == 6 || i == 5 || i == 4) {
                        m10462d(false);
                    }
                    m10469h(i);
                    for (int i2 = 0; i2 < this.f7325E.size(); i2++) {
                        ((C2585e) this.f7325E.get(i2)).mo8129a(view, i);
                    }
                    m10472k();
                }
            }
        }
    }
}
