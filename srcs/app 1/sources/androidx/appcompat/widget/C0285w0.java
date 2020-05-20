package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.C3388w;

/* renamed from: androidx.appcompat.widget.w0 */
class C0285w0 implements OnLongClickListener, OnHoverListener, OnAttachStateChangeListener {

    /* renamed from: o */
    private static C0285w0 f1248o;

    /* renamed from: p */
    private static C0285w0 f1249p;

    /* renamed from: f */
    private final View f1250f;

    /* renamed from: g */
    private final CharSequence f1251g;

    /* renamed from: h */
    private final int f1252h;

    /* renamed from: i */
    private final Runnable f1253i = new C0286a();

    /* renamed from: j */
    private final Runnable f1254j = new C0287b();

    /* renamed from: k */
    private int f1255k;

    /* renamed from: l */
    private int f1256l;

    /* renamed from: m */
    private C0289x0 f1257m;

    /* renamed from: n */
    private boolean f1258n;

    /* renamed from: androidx.appcompat.widget.w0$a */
    class C0286a implements Runnable {
        C0286a() {
        }

        public void run() {
            C0285w0.this.mo1834a(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.w0$b */
    class C0287b implements Runnable {
        C0287b() {
        }

        public void run() {
            C0285w0.this.mo1833a();
        }
    }

    private C0285w0(View view, CharSequence charSequence) {
        this.f1250f = view;
        this.f1251g = charSequence;
        this.f1252h = C3388w.m13877a(ViewConfiguration.get(view.getContext()));
        m1440c();
        this.f1250f.setOnLongClickListener(this);
        this.f1250f.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m1436a(View view, CharSequence charSequence) {
        C0285w0 w0Var = f1248o;
        if (w0Var != null && w0Var.f1250f == view) {
            m1437a((C0285w0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0285w0 w0Var2 = f1249p;
            if (w0Var2 != null && w0Var2.f1250f == view) {
                w0Var2.mo1833a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C0285w0(view, charSequence);
    }

    /* renamed from: a */
    private static void m1437a(C0285w0 w0Var) {
        C0285w0 w0Var2 = f1248o;
        if (w0Var2 != null) {
            w0Var2.m1439b();
        }
        f1248o = w0Var;
        if (w0Var != null) {
            w0Var.m1441d();
        }
    }

    /* renamed from: a */
    private boolean m1438a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1255k) <= this.f1252h && Math.abs(y - this.f1256l) <= this.f1252h) {
            return false;
        }
        this.f1255k = x;
        this.f1256l = y;
        return true;
    }

    /* renamed from: b */
    private void m1439b() {
        this.f1250f.removeCallbacks(this.f1253i);
    }

    /* renamed from: c */
    private void m1440c() {
        this.f1255k = Integer.MAX_VALUE;
        this.f1256l = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m1441d() {
        this.f1250f.postDelayed(this.f1253i, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1833a() {
        if (f1249p == this) {
            f1249p = null;
            C0289x0 x0Var = this.f1257m;
            if (x0Var != null) {
                x0Var.mo1841a();
                this.f1257m = null;
                m1440c();
                this.f1250f.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1248o == this) {
            m1437a((C0285w0) null);
        }
        this.f1250f.removeCallbacks(this.f1254j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1834a(boolean z) {
        long j;
        if (C3379v.m13767C(this.f1250f)) {
            m1437a((C0285w0) null);
            C0285w0 w0Var = f1249p;
            if (w0Var != null) {
                w0Var.mo1833a();
            }
            f1249p = this;
            this.f1258n = z;
            C0289x0 x0Var = new C0289x0(this.f1250f.getContext());
            this.f1257m = x0Var;
            x0Var.mo1842a(this.f1250f, this.f1255k, this.f1256l, this.f1258n, this.f1251g);
            this.f1250f.addOnAttachStateChangeListener(this);
            if (this.f1258n) {
                j = 2500;
            } else {
                j = ((C3379v.m13836w(this.f1250f) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1250f.removeCallbacks(this.f1254j);
            this.f1250f.postDelayed(this.f1254j, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1257m != null && this.f1258n) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1250f.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1440c();
                mo1833a();
            }
        } else if (this.f1250f.isEnabled() && this.f1257m == null && m1438a(motionEvent)) {
            m1437a(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1255k = view.getWidth() / 2;
        this.f1256l = view.getHeight() / 2;
        mo1834a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo1833a();
    }
}
