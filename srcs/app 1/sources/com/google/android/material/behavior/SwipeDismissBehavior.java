package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0332c;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c.C3348a;
import p071f.p097h.p108m.p109f0.C3355f;
import p071f.p097h.p108m.p109f0.C3355f.C3356a;
import p071f.p112j.p114b.C3411c;
import p071f.p112j.p114b.C3411c.C3414c;

public class SwipeDismissBehavior<V extends View> extends C0332c<V> {

    /* renamed from: a */
    C3411c f7201a;

    /* renamed from: b */
    C2552c f7202b;

    /* renamed from: c */
    private boolean f7203c;

    /* renamed from: d */
    private float f7204d = 0.0f;

    /* renamed from: e */
    private boolean f7205e;

    /* renamed from: f */
    int f7206f = 2;

    /* renamed from: g */
    float f7207g = 0.5f;

    /* renamed from: h */
    float f7208h = 0.0f;

    /* renamed from: i */
    float f7209i = 0.5f;

    /* renamed from: j */
    private final C3414c f7210j = new C2550a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C2550a extends C3414c {

        /* renamed from: a */
        private int f7211a;

        /* renamed from: b */
        private int f7212b = -1;

        C2550a() {
        }

        /* renamed from: a */
        private boolean m10332a(View view, float f) {
            boolean z = false;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0) {
                boolean z2 = C3379v.m13829p(view) == 1;
                int i2 = SwipeDismissBehavior.this.f7206f;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    return z2 ? z : z;
                    z = true;
                }
                if (i2 == 1) {
                    if (z2) {
                    }
                    z = true;
                }
                return z;
            }
            if (Math.abs(view.getLeft() - this.f7211a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f7207g)) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        public int mo7954a(View view) {
            return view.getWidth();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f7211a;
            r3 = r3.getWidth() + r5;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo7955a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = p071f.p097h.p108m.C3379v.m13829p(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f7206f
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f7211a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f7211a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f7211a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f7211a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f7211a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.m10321a(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C2550a.mo7955a(android.view.View, int, int):int");
        }

        /* renamed from: a */
        public void mo7956a(View view, float f, float f2) {
            boolean z;
            int i;
            this.f7212b = -1;
            int width = view.getWidth();
            if (m10332a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f7211a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f7211a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f7201a.mo10917c(i, view.getTop())) {
                C3379v.m13794a(view, (Runnable) new C2553d(view, z));
            } else if (z) {
                C2552c cVar = SwipeDismissBehavior.this.f7202b;
                if (cVar != null) {
                    cVar.mo7963a(view);
                }
            }
        }

        /* renamed from: a */
        public void mo7957a(View view, int i) {
            this.f7212b = i;
            this.f7211a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: a */
        public void mo7958a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f7211a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f7208h);
            float width2 = ((float) this.f7211a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f7209i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m10320a(0.0f, 1.0f - SwipeDismissBehavior.m10323b(width, width2, f), 1.0f));
            }
        }

        /* renamed from: b */
        public int mo7959b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public boolean mo7960b(View view, int i) {
            int i2 = this.f7212b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo7952a(view);
        }

        /* renamed from: c */
        public void mo7961c(int i) {
            C2552c cVar = SwipeDismissBehavior.this.f7202b;
            if (cVar != null) {
                cVar.mo7962a(i);
            }
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    class C2551b implements C3355f {
        C2551b() {
        }

        /* renamed from: a */
        public boolean mo4398a(View view, C3356a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.mo7952a(view)) {
                return false;
            }
            boolean z2 = C3379v.m13829p(view) == 1;
            if ((SwipeDismissBehavior.this.f7206f == 0 && z2) || (SwipeDismissBehavior.this.f7206f == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            C3379v.m13811d(view, width);
            view.setAlpha(0.0f);
            C2552c cVar = SwipeDismissBehavior.this.f7202b;
            if (cVar != null) {
                cVar.mo7963a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface C2552c {
        /* renamed from: a */
        void mo7962a(int i);

        /* renamed from: a */
        void mo7963a(View view);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    private class C2553d implements Runnable {

        /* renamed from: f */
        private final View f7215f;

        /* renamed from: g */
        private final boolean f7216g;

        C2553d(View view, boolean z) {
            this.f7215f = view;
            this.f7216g = z;
        }

        public void run() {
            C3411c cVar = SwipeDismissBehavior.this.f7201a;
            if (cVar != null && cVar.mo10910a(true)) {
                C3379v.m13794a(this.f7215f, (Runnable) this);
            } else if (this.f7216g) {
                C2552c cVar2 = SwipeDismissBehavior.this.f7202b;
                if (cVar2 != null) {
                    cVar2.mo7963a(this.f7215f);
                }
            }
        }
    }

    /* renamed from: a */
    static float m10320a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m10321a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: a */
    private void m10322a(ViewGroup viewGroup) {
        if (this.f7201a == null) {
            this.f7201a = this.f7205e ? C3411c.m13977a(viewGroup, this.f7204d, this.f7210j) : C3411c.m13978a(viewGroup, this.f7210j);
        }
    }

    /* renamed from: b */
    static float m10323b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: b */
    private void m10324b(View view) {
        C3379v.m13816f(view, 1048576);
        if (mo7952a(view)) {
            C3379v.m13790a(view, C3348a.f9561j, null, new C2551b());
        }
    }

    /* renamed from: a */
    public void mo7950a(float f) {
        this.f7209i = m10320a(0.0f, f, 1.0f);
    }

    /* renamed from: a */
    public void mo7951a(int i) {
        this.f7206f = i;
    }

    /* renamed from: a */
    public boolean mo7952a(View view) {
        return true;
    }

    /* renamed from: a */
    public boolean mo2106a(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean a = super.mo2106a(coordinatorLayout, v, i);
        if (C3379v.m13827n(v) == 0) {
            C3379v.m13820h(v, 1);
            m10324b((View) v);
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo2110a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f7203c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo2052a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f7203c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7203c = false;
        }
        if (!z) {
            return false;
        }
        m10322a((ViewGroup) coordinatorLayout);
        return this.f7201a.mo10914b(motionEvent);
    }

    /* renamed from: b */
    public void mo7953b(float f) {
        this.f7208h = m10320a(0.0f, f, 1.0f);
    }

    /* renamed from: b */
    public boolean mo2115b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C3411c cVar = this.f7201a;
        if (cVar == null) {
            return false;
        }
        cVar.mo10906a(motionEvent);
        return true;
    }
}
