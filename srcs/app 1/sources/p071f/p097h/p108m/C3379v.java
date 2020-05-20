package p071f.p097h.p108m;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p071f.p097h.C3234c;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p097h.p108m.p109f0.C3347c.C3348a;
import p071f.p097h.p108m.p109f0.C3355f;

/* renamed from: f.h.m.v */
public class C3379v {

    /* renamed from: a */
    private static final AtomicInteger f9583a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f9584b;

    /* renamed from: c */
    private static boolean f9585c;

    /* renamed from: d */
    private static Field f9586d;

    /* renamed from: e */
    private static boolean f9587e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f9588f;

    /* renamed from: g */
    private static WeakHashMap<View, C3325a0> f9589g = null;

    /* renamed from: h */
    private static Field f9590h;

    /* renamed from: i */
    private static boolean f9591i = false;

    /* renamed from: j */
    private static ThreadLocal<Rect> f9592j;

    /* renamed from: f.h.m.v$a */
    static class C3380a implements OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ C3375r f9593a;

        C3380a(C3375r rVar) {
            this.f9593a = rVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return this.f9593a.mo325a(view, C3343e0.m13616a(windowInsets)).mo10736f();
        }
    }

    /* renamed from: f.h.m.v$b */
    static class C3381b extends C3385f<Boolean> {
        C3381b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Boolean m13841a(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo10844a(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo10845a(Boolean bool, Boolean bool2) {
            return !mo10854a(bool, bool2);
        }
    }

    /* renamed from: f.h.m.v$c */
    static class C3382c extends C3385f<CharSequence> {
        C3382c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public CharSequence m13847a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo10844a(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo10845a(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: f.h.m.v$d */
    static class C3383d extends C3385f<Boolean> {
        C3383d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Boolean m13853a(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo10844a(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo10845a(Boolean bool, Boolean bool2) {
            return !mo10854a(bool, bool2);
        }
    }

    /* renamed from: f.h.m.v$e */
    static class C3384e implements OnGlobalLayoutListener, OnAttachStateChangeListener {

        /* renamed from: f */
        private WeakHashMap<View, Boolean> f9594f = new WeakHashMap<>();

        C3384e() {
        }

        /* renamed from: a */
        private void m13858a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: a */
        private void m13859a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    C3379v.m13808c(view, 16);
                }
                this.f9594f.put(view, Boolean.valueOf(z2));
            }
        }

        public void onGlobalLayout() {
            for (Entry entry : this.f9594f.entrySet()) {
                m13859a((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            m13858a(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: f.h.m.v$f */
    static abstract class C3385f<T> {

        /* renamed from: a */
        private final int f9595a;

        /* renamed from: b */
        private final Class<T> f9596b;

        /* renamed from: c */
        private final int f9597c;

        C3385f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        C3385f(int i, Class<T> cls, int i2, int i3) {
            this.f9595a = i;
            this.f9596b = cls;
            this.f9597c = i3;
        }

        /* renamed from: a */
        private boolean m13860a() {
            return VERSION.SDK_INT >= 19;
        }

        /* renamed from: b */
        private boolean m13861b() {
            return VERSION.SDK_INT >= this.f9597c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo10842a(View view);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo10844a(View view, T t);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo10854a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo10845a(T t, T t2);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public T mo10855b(View view) {
            if (m13861b()) {
                return mo10842a(view);
            }
            if (m13860a()) {
                T tag = view.getTag(this.f9595a);
                if (this.f9596b.isInstance(tag)) {
                    return tag;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo10856b(View view, T t) {
            if (m13861b()) {
                mo10844a(view, t);
            } else if (m13860a() && mo10845a((T) mo10855b(view), t)) {
                C3379v.m13832s(view);
                view.setTag(this.f9595a, t);
                C3379v.m13808c(view, 0);
            }
        }
    }

    /* renamed from: f.h.m.v$g */
    public interface C3386g {
        /* renamed from: a */
        boolean mo10857a(View view, KeyEvent keyEvent);
    }

    /* renamed from: f.h.m.v$h */
    static class C3387h {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f9598d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f9599a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f9600b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f9601c = null;

        C3387h() {
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m13869a() {
            if (this.f9600b == null) {
                this.f9600b = new SparseArray<>();
            }
            return this.f9600b;
        }

        /* renamed from: a */
        static C3387h m13870a(View view) {
            C3387h hVar = (C3387h) view.getTag(C3234c.tag_unhandled_key_event_manager);
            if (hVar != null) {
                return hVar;
            }
            C3387h hVar2 = new C3387h();
            view.setTag(C3234c.tag_unhandled_key_event_manager, hVar2);
            return hVar2;
        }

        /* renamed from: b */
        private View m13871b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f9599a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b = m13871b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b != null) {
                            return b;
                        }
                    }
                }
                if (m13873c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: b */
        private void m13872b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f9599a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f9598d.isEmpty()) {
                synchronized (f9598d) {
                    if (this.f9599a == null) {
                        this.f9599a = new WeakHashMap<>();
                    }
                    for (int size = f9598d.size() - 1; size >= 0; size--) {
                        View view = (View) ((WeakReference) f9598d.get(size)).get();
                        if (view == null) {
                            f9598d.remove(size);
                        } else {
                            this.f9599a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f9599a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        private boolean m13873c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C3234c.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((C3386g) arrayList.get(size)).mo10857a(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo10858a(KeyEvent keyEvent) {
            WeakReference<KeyEvent> weakReference = this.f9601c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f9601c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray a = m13869a();
            if (keyEvent.getAction() == 1) {
                int indexOfKey = a.indexOfKey(keyEvent.getKeyCode());
                if (indexOfKey >= 0) {
                    weakReference2 = (WeakReference) a.valueAt(indexOfKey);
                    a.removeAt(indexOfKey);
                }
            }
            if (weakReference2 == null) {
                weakReference2 = (WeakReference) a.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C3379v.m13767C(view)) {
                m13873c(view, keyEvent);
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo10859a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m13872b();
            }
            View b = m13871b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m13869a().put(keyCode, new WeakReference(b));
                }
            }
            return b != null;
        }
    }

    static {
        new C3384e();
    }

    /* renamed from: A */
    public static boolean m13765A(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: B */
    public static boolean m13766B(View view) {
        Boolean bool = (Boolean) m13778a().mo10855b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: C */
    public static boolean m13767C(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: D */
    public static boolean m13768D(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: E */
    public static boolean m13769E(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C3369l) {
            return ((C3369l) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m13770F(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m13771G(View view) {
        Boolean bool = (Boolean) m13813e().mo10855b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: H */
    public static void m13772H(View view) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: I */
    public static void m13773I(View view) {
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: J */
    public static void m13774J(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C3369l) {
            ((C3369l) view).stopNestedScroll();
        }
    }

    /* renamed from: K */
    private static void m13775K(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: a */
    public static C3325a0 m13776a(View view) {
        if (f9589g == null) {
            f9589g = new WeakHashMap<>();
        }
        C3325a0 a0Var = (C3325a0) f9589g.get(view);
        if (a0Var != null) {
            return a0Var;
        }
        C3325a0 a0Var2 = new C3325a0(view);
        f9589g.put(view, a0Var2);
        return a0Var2;
    }

    /* renamed from: a */
    public static C3343e0 m13777a(View view, C3343e0 e0Var) {
        if (VERSION.SDK_INT < 21) {
            return e0Var;
        }
        WindowInsets f = e0Var.mo10736f();
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(f);
        if (!dispatchApplyWindowInsets.equals(f)) {
            f = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C3343e0.m13616a(f);
    }

    /* renamed from: a */
    private static C3385f<Boolean> m13778a() {
        return new C3383d(C3234c.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: a */
    private static void m13779a(int i, View view) {
        List g = m13817g(view);
        for (int i2 = 0; i2 < g.size(); i2++) {
            if (((C3348a) g.get(i2)).mo10800a() == i) {
                g.remove(i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m13780a(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: a */
    private static void m13781a(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m13775K(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m13775K((View) parent);
            }
        }
    }

    /* renamed from: a */
    public static void m13782a(View view, int i, int i2) {
        if (VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: a */
    public static void m13783a(View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m13784a(View view, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C3378u) {
            ((C3378u) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m13785a(View view, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C3378u) {
            ((C3378u) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m13786a(View view, Rect rect) {
        if (VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: a */
    public static void m13787a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m13788a(View view, C3323a aVar) {
        if (aVar == null && (m13807c(view) instanceof C3324a)) {
            aVar = new C3323a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.mo10698a());
    }

    /* renamed from: a */
    private static void m13789a(View view, C3348a aVar) {
        if (VERSION.SDK_INT >= 21) {
            m13832s(view);
            m13779a(aVar.mo10800a(), view);
            m13817g(view).add(aVar);
            m13808c(view, 0);
        }
    }

    /* renamed from: a */
    public static void m13790a(View view, C3348a aVar, CharSequence charSequence, C3355f fVar) {
        if (fVar == null && charSequence == null) {
            m13816f(view, aVar.mo10800a());
        } else {
            m13789a(view, aVar.mo10801a(charSequence, fVar));
        }
    }

    /* renamed from: a */
    public static void m13791a(View view, C3347c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.mo10799v());
    }

    /* renamed from: a */
    public static void m13792a(View view, C3375r rVar) {
        if (VERSION.SDK_INT >= 21) {
            if (rVar == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            view.setOnApplyWindowInsetsListener(new C3380a(rVar));
        }
    }

    /* renamed from: a */
    public static void m13793a(View view, C3377t tVar) {
        if (VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (tVar != null ? tVar.mo10840a() : null));
        }
    }

    /* renamed from: a */
    public static void m13794a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m13795a(View view, Runnable runnable, long j) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    public static void m13796a(View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f9588f == null) {
            f9588f = new WeakHashMap<>();
        }
        f9588f.put(view, str);
    }

    /* renamed from: a */
    public static void m13797a(View view, boolean z) {
        m13778a().mo10856b(view, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static boolean m13798a(View view, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    static boolean m13799a(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C3387h.m13870a(view).mo10859a(view, keyEvent);
    }

    /* renamed from: b */
    public static int m13800b() {
        int i;
        int i2;
        if (VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i = f9583a.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f9583a.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: b */
    public static C3323a m13801b(View view) {
        AccessibilityDelegate c = m13807c(view);
        if (c == null) {
            return null;
        }
        return c instanceof C3324a ? ((C3324a) c).f9503a : new C3323a(c);
    }

    /* renamed from: b */
    public static C3343e0 m13802b(View view, C3343e0 e0Var) {
        if (VERSION.SDK_INT < 21) {
            return e0Var;
        }
        WindowInsets f = e0Var.mo10736f();
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(f);
        if (!onApplyWindowInsets.equals(f)) {
            f = new WindowInsets(onApplyWindowInsets);
        }
        return C3343e0.m13616a(f);
    }

    /* renamed from: b */
    private static void m13803b(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m13775K(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m13775K((View) parent);
            }
        }
    }

    /* renamed from: b */
    public static void m13804b(View view, boolean z) {
        if (VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: b */
    static boolean m13805b(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C3387h.m13870a(view).mo10858a(keyEvent);
    }

    /* renamed from: c */
    private static Rect m13806c() {
        if (f9592j == null) {
            f9592j = new ThreadLocal<>();
        }
        Rect rect = (Rect) f9592j.get();
        if (rect == null) {
            rect = new Rect();
            f9592j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: c */
    private static AccessibilityDelegate m13807c(View view) {
        return VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : m13809d(view);
    }

    /* renamed from: c */
    static void m13808c(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = m13815f(view) != null;
            if (m13812e(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: d */
    private static AccessibilityDelegate m13809d(View view) {
        if (f9591i) {
            return null;
        }
        if (f9590h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f9590h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f9591i = true;
                return null;
            }
        }
        try {
            Object obj = f9590h.get(view);
            if (obj instanceof AccessibilityDelegate) {
                return (AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f9591i = true;
            return null;
        }
    }

    /* renamed from: d */
    private static C3385f<CharSequence> m13810d() {
        return new C3382c(C3234c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: d */
    public static void m13811d(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect c = m13806c();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                c.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !c.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m13781a(view, i);
            if (z && c.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(c);
            }
        } else {
            m13781a(view, i);
        }
    }

    /* renamed from: e */
    public static int m13812e(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: e */
    private static C3385f<Boolean> m13813e() {
        return new C3381b(C3234c.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: e */
    public static void m13814e(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect c = m13806c();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                c.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !c.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m13803b(view, i);
            if (z && c.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(c);
            }
        } else {
            m13803b(view, i);
        }
    }

    /* renamed from: f */
    public static CharSequence m13815f(View view) {
        return (CharSequence) m13810d().mo10855b(view);
    }

    /* renamed from: f */
    public static void m13816f(View view, int i) {
        if (VERSION.SDK_INT >= 21) {
            m13779a(i, view);
            m13808c(view, 0);
        }
    }

    /* renamed from: g */
    private static List<C3348a> m13817g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C3234c.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C3234c.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: g */
    public static void m13818g(View view, int i) {
        if (VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: h */
    public static ColorStateList m13819h(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        return view instanceof C3378u ? ((C3378u) view).getSupportBackgroundTintList() : null;
    }

    /* renamed from: h */
    public static void m13820h(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: i */
    public static Mode m13821i(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        return view instanceof C3378u ? ((C3378u) view).getSupportBackgroundTintMode() : null;
    }

    /* renamed from: i */
    public static void m13822i(View view, int i) {
        if (VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: j */
    public static Rect m13823j(View view) {
        if (VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: k */
    public static Display m13824k(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m13767C(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: l */
    public static float m13825l(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: m */
    public static boolean m13826m(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: n */
    public static int m13827n(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: o */
    public static int m13828o(View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: p */
    public static int m13829p(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: q */
    public static int m13830q(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f9587e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f9586d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f9587e = true;
        }
        Field field = f9586d;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: r */
    public static int m13831r(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f9585c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f9584b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f9585c = true;
        }
        Field field = f9584b;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: s */
    static C3323a m13832s(View view) {
        C3323a b = m13801b(view);
        if (b == null) {
            b = new C3323a();
        }
        m13788a(view, b);
        return b;
    }

    /* renamed from: t */
    public static int m13833t(View view) {
        return VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* renamed from: u */
    public static int m13834u(View view) {
        return VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: v */
    public static String m13835v(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f9588f;
        if (weakHashMap == null) {
            return null;
        }
        return (String) weakHashMap.get(view);
    }

    /* renamed from: w */
    public static int m13836w(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: x */
    public static float m13837x(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: y */
    public static boolean m13838y(View view) {
        if (VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: z */
    public static boolean m13839z(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }
}
