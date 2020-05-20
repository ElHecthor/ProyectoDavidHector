package p071f.p112j.p114b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p071f.p088e.C3176h;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.C3393z;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p097h.p108m.p109f0.C3351d;
import p071f.p097h.p108m.p109f0.C3354e;
import p071f.p112j.p114b.C3407b.C3408a;
import p071f.p112j.p114b.C3407b.C3409b;

/* renamed from: f.j.b.a */
public abstract class C3403a extends C3323a {

    /* renamed from: n */
    private static final Rect f9622n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: o */
    private static final C3408a<C3347c> f9623o = new C3404a();

    /* renamed from: p */
    private static final C3409b<C3176h<C3347c>, C3347c> f9624p = new C3405b();

    /* renamed from: d */
    private final Rect f9625d = new Rect();

    /* renamed from: e */
    private final Rect f9626e = new Rect();

    /* renamed from: f */
    private final Rect f9627f = new Rect();

    /* renamed from: g */
    private final int[] f9628g = new int[2];

    /* renamed from: h */
    private final AccessibilityManager f9629h;

    /* renamed from: i */
    private final View f9630i;

    /* renamed from: j */
    private C3406c f9631j;

    /* renamed from: k */
    int f9632k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l */
    int f9633l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m */
    private int f9634m = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: f.j.b.a$a */
    static class C3404a implements C3408a<C3347c> {
        C3404a() {
        }

        /* renamed from: a */
        public void mo10898a(C3347c cVar, Rect rect) {
            cVar.mo10741a(rect);
        }
    }

    /* renamed from: f.j.b.a$b */
    static class C3405b implements C3409b<C3176h<C3347c>, C3347c> {
        C3405b() {
        }

        /* renamed from: a */
        public int mo10900a(C3176h<C3347c> hVar) {
            return hVar.mo10292c();
        }

        /* renamed from: a */
        public C3347c mo10902a(C3176h<C3347c> hVar, int i) {
            return (C3347c) hVar.mo10297e(i);
        }
    }

    /* renamed from: f.j.b.a$c */
    private class C3406c extends C3351d {
        C3406c() {
        }

        /* renamed from: a */
        public C3347c mo10806a(int i) {
            return C3347c.m13630a(C3403a.this.mo10893b(i));
        }

        /* renamed from: a */
        public boolean mo10809a(int i, int i2, Bundle bundle) {
            return C3403a.this.mo10894b(i, i2, bundle);
        }

        /* renamed from: b */
        public C3347c mo10810b(int i) {
            int i2 = i == 2 ? C3403a.this.f9632k : C3403a.this.f9633l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo10806a(i2);
        }
    }

    public C3403a(View view) {
        if (view != null) {
            this.f9630i = view;
            this.f9629h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C3379v.m13827n(view) == 0) {
                C3379v.m13820h(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: a */
    private static Rect m13908a(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: a */
    private void m13909a(int i, Rect rect) {
        mo10893b(i).mo10741a(rect);
    }

    /* renamed from: a */
    private boolean m13910a(int i, Bundle bundle) {
        return C3379v.m13798a(this.f9630i, i, bundle);
    }

    /* renamed from: a */
    private boolean m13911a(Rect rect) {
        boolean z = false;
        if (rect != null && !rect.isEmpty()) {
            if (this.f9630i.getWindowVisibility() != 0) {
                return false;
            }
            View view = this.f9630i;
            do {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    if (view.getAlpha() <= 0.0f) {
                        break;
                    }
                } else if (parent != null) {
                    z = true;
                }
            } while (view.getVisibility() == 0);
            return false;
        }
        return z;
    }

    /* renamed from: b */
    private AccessibilityEvent m13912b(int i, int i2) {
        return i != -1 ? m13914c(i, i2) : m13918e(i2);
    }

    /* renamed from: b */
    private boolean m13913b(int i, Rect rect) {
        Object obj;
        C3176h f = m13920f();
        int i2 = this.f9633l;
        int i3 = RecyclerView.UNDEFINED_DURATION;
        Object obj2 = i2 == Integer.MIN_VALUE ? null : (C3347c) f.mo10287a(i2);
        if (i == 1 || i == 2) {
            obj = C3407b.m13956a(f, f9624p, f9623o, obj2, i, C3379v.m13829p(this.f9630i) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f9633l;
            if (i4 != Integer.MIN_VALUE) {
                m13909a(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m13908a(this.f9630i, i, rect2);
            }
            obj = C3407b.m13957a(f, f9624p, f9623o, obj2, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        C3347c cVar = (C3347c) obj;
        if (cVar != null) {
            i3 = f.mo10293c(f.mo10286a(cVar));
        }
        return mo10896c(i3);
    }

    /* renamed from: c */
    private AccessibilityEvent m13914c(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C3347c b = mo10893b(i);
        obtain.getText().add(b.mo10777h());
        obtain.setContentDescription(b.mo10767e());
        obtain.setScrollable(b.mo10794r());
        obtain.setPassword(b.mo10793q());
        obtain.setEnabled(b.mo10789m());
        obtain.setChecked(b.mo10785k());
        mo10885a(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(b.mo10763d());
            C3354e.m13714a(obtain, this.f9630i, i);
            obtain.setPackageName(this.f9630i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: c */
    private boolean m13915c(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? mo8437a(i, i2, bundle) : m13917d(i) : m13923h(i) : mo10888a(i) : mo10896c(i);
    }

    /* renamed from: d */
    private boolean m13916d() {
        int i = this.f9633l;
        return i != Integer.MIN_VALUE && mo8437a(i, 16, (Bundle) null);
    }

    /* renamed from: d */
    private boolean m13917d(int i) {
        if (this.f9632k != i) {
            return false;
        }
        this.f9632k = RecyclerView.UNDEFINED_DURATION;
        this.f9630i.invalidate();
        mo10889a(i, 65536);
        return true;
    }

    /* renamed from: e */
    private AccessibilityEvent m13918e(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f9630i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: e */
    private C3347c m13919e() {
        C3347c d = C3347c.m13637d(this.f9630i);
        C3379v.m13791a(this.f9630i, d);
        ArrayList arrayList = new ArrayList();
        mo8436a((List<Integer>) arrayList);
        if (d.mo10758c() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d.mo10743a(this.f9630i, ((Integer) arrayList.get(i)).intValue());
            }
            return d;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: f */
    private C3176h<C3347c> m13920f() {
        ArrayList arrayList = new ArrayList();
        mo8436a((List<Integer>) arrayList);
        C3176h<C3347c> hVar = new C3176h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.mo10294c(i, m13921f(i));
        }
        return hVar;
    }

    /* renamed from: f */
    private C3347c m13921f(int i) {
        C3347c y = C3347c.m13643y();
        y.mo10773f(true);
        y.mo10776g(true);
        y.mo10745a((CharSequence) "android.view.View");
        y.mo10759c(f9622n);
        y.mo10764d(f9622n);
        y.mo10742a(this.f9630i);
        mo8433a(i, y);
        if (y.mo10777h() == null && y.mo10767e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        y.mo10741a(this.f9626e);
        if (!this.f9626e.equals(f9622n)) {
            int b = y.mo10750b();
            if ((b & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((b & 128) == 0) {
                y.mo10768e((CharSequence) this.f9630i.getContext().getPackageName());
                y.mo10760c(this.f9630i, i);
                if (this.f9632k == i) {
                    y.mo10748a(true);
                    y.mo10740a(128);
                } else {
                    y.mo10748a(false);
                    y.mo10740a(64);
                }
                boolean z = this.f9633l == i;
                if (z) {
                    y.mo10740a(2);
                } else if (y.mo10790n()) {
                    y.mo10740a(1);
                }
                y.mo10778h(z);
                this.f9630i.getLocationOnScreen(this.f9628g);
                y.mo10752b(this.f9625d);
                if (this.f9625d.equals(f9622n)) {
                    y.mo10741a(this.f9625d);
                    if (y.f9554b != -1) {
                        C3347c y2 = C3347c.m13643y();
                        for (int i2 = y.f9554b; i2 != -1; i2 = y2.f9554b) {
                            y2.mo10753b(this.f9630i, -1);
                            y2.mo10759c(f9622n);
                            mo8433a(i2, y2);
                            y2.mo10741a(this.f9626e);
                            Rect rect = this.f9625d;
                            Rect rect2 = this.f9626e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        y2.mo10798u();
                    }
                    this.f9625d.offset(this.f9628g[0] - this.f9630i.getScrollX(), this.f9628g[1] - this.f9630i.getScrollY());
                }
                if (this.f9630i.getLocalVisibleRect(this.f9627f)) {
                    this.f9627f.offset(this.f9628g[0] - this.f9630i.getScrollX(), this.f9628g[1] - this.f9630i.getScrollY());
                    if (this.f9625d.intersect(this.f9627f)) {
                        y.mo10764d(this.f9625d);
                        if (m13911a(this.f9625d)) {
                            y.mo10788m(true);
                        }
                    }
                }
                return y;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: g */
    private static int m13922g(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: h */
    private boolean m13923h(int i) {
        if (this.f9629h.isEnabled() && this.f9629h.isTouchExplorationEnabled()) {
            int i2 = this.f9632k;
            if (i2 != i) {
                if (i2 != Integer.MIN_VALUE) {
                    m13917d(i2);
                }
                this.f9632k = i;
                this.f9630i.invalidate();
                mo10889a(i, 32768);
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m13924i(int i) {
        int i2 = this.f9634m;
        if (i2 != i) {
            this.f9634m = i;
            mo10889a(i, 128);
            mo10889a(i2, 256);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo8432a(float f, float f2);

    /* renamed from: a */
    public C3351d mo3958a(View view) {
        if (this.f9631j == null) {
            this.f9631j = new C3406c();
        }
        return this.f9631j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10885a(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8433a(int i, C3347c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8434a(int i, boolean z) {
    }

    /* renamed from: a */
    public void mo2349a(View view, C3347c cVar) {
        super.mo2349a(view, cVar);
        mo8435a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10886a(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8435a(C3347c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8436a(List<Integer> list);

    /* renamed from: a */
    public final void mo10887a(boolean z, int i, Rect rect) {
        int i2 = this.f9633l;
        if (i2 != Integer.MIN_VALUE) {
            mo10888a(i2);
        }
        if (z) {
            m13913b(i, rect);
        }
    }

    /* renamed from: a */
    public final boolean mo10888a(int i) {
        if (this.f9633l != i) {
            return false;
        }
        this.f9633l = RecyclerView.UNDEFINED_DURATION;
        mo8434a(i, false);
        mo10889a(i, 8);
        return true;
    }

    /* renamed from: a */
    public final boolean mo10889a(int i, int i2) {
        if (i == Integer.MIN_VALUE || !this.f9629h.isEnabled()) {
            return false;
        }
        ViewParent parent = this.f9630i.getParent();
        if (parent == null) {
            return false;
        }
        return C3393z.m13890a(parent, this.f9630i, m13912b(i, i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo8437a(int i, int i2, Bundle bundle);

    /* renamed from: a */
    public final boolean mo10890a(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int g = m13922g(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m13913b(g, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m13916d();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m13913b(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m13913b(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo10891a(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f9629h.isEnabled() && this.f9629h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int a = mo8432a(motionEvent.getX(), motionEvent.getY());
                m13924i(a);
                if (a != Integer.MIN_VALUE) {
                    z = true;
                }
            } else if (action != 10 || this.f9634m == Integer.MIN_VALUE) {
                return false;
            } else {
                m13924i(RecyclerView.UNDEFINED_DURATION);
                return true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final int mo10892b() {
        return this.f9632k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C3347c mo10893b(int i) {
        return i == -1 ? m13919e() : m13921f(i);
    }

    /* renamed from: b */
    public void mo2351b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2351b(view, accessibilityEvent);
        mo10886a(accessibilityEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo10894b(int i, int i2, Bundle bundle) {
        return i != -1 ? m13915c(i, i2, bundle) : m13910a(i2, bundle);
    }

    /* renamed from: c */
    public final int mo10895c() {
        return this.f9633l;
    }

    /* renamed from: c */
    public final boolean mo10896c(int i) {
        if (!this.f9630i.isFocused() && !this.f9630i.requestFocus()) {
            return false;
        }
        int i2 = this.f9633l;
        if (i2 == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo10888a(i2);
        }
        this.f9633l = i;
        mo8434a(i, true);
        mo10889a(i, 8);
        return true;
    }
}
