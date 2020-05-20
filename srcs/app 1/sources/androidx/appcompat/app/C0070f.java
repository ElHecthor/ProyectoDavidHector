package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0119e;
import androidx.appcompat.view.menu.C0122g;
import androidx.appcompat.view.menu.C0122g.C0123a;
import androidx.appcompat.view.menu.C0137m;
import androidx.appcompat.view.menu.C0137m.C0138a;
import androidx.appcompat.view.menu.C0139n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0205c0;
import androidx.appcompat.widget.C0205c0.C0206a;
import androidx.appcompat.widget.C0236j;
import androidx.appcompat.widget.C0275t0;
import androidx.appcompat.widget.C0290y;
import androidx.appcompat.widget.C0291y0;
import androidx.appcompat.widget.C0293z0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ContentFrameLayout.C0159a;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0343a;
import androidx.core.app.C0356g;
import androidx.lifecycle.C0514h.C0516b;
import androidx.lifecycle.C0523n;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import p071f.p072a.C3093a;
import p071f.p072a.C3095c;
import p071f.p072a.C3098f;
import p071f.p072a.C3099g;
import p071f.p072a.C3101i;
import p071f.p072a.C3102j;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p072a.p079o.C3124b;
import p071f.p072a.p079o.C3124b.C3125a;
import p071f.p072a.p079o.C3127d;
import p071f.p072a.p079o.C3129f.C3130a;
import p071f.p072a.p079o.C3131g;
import p071f.p072a.p079o.C3136i;
import p071f.p088e.C3162a;
import p071f.p097h.p108m.C3325a0;
import p071f.p097h.p108m.C3332b0;
import p071f.p097h.p108m.C3338c0;
import p071f.p097h.p108m.C3341e;
import p071f.p097h.p108m.C3341e.C3342a;
import p071f.p097h.p108m.C3343e0;
import p071f.p097h.p108m.C3344f;
import p071f.p097h.p108m.C3375r;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.appcompat.app.f */
class C0070f extends C0069e implements C0123a, Factory2 {

    /* renamed from: f0 */
    private static final Map<Class<?>, Integer> f227f0 = new C3162a();

    /* renamed from: g0 */
    private static final boolean f228g0 = (VERSION.SDK_INT < 21);

    /* renamed from: h0 */
    private static final int[] f229h0 = {16842836};

    /* renamed from: i0 */
    private static boolean f230i0 = true;

    /* renamed from: j0 */
    private static final boolean f231j0;

    /* renamed from: A */
    private ViewGroup f232A;

    /* renamed from: B */
    private TextView f233B;

    /* renamed from: C */
    private View f234C;

    /* renamed from: D */
    private boolean f235D;

    /* renamed from: E */
    private boolean f236E;

    /* renamed from: F */
    boolean f237F;

    /* renamed from: G */
    boolean f238G;

    /* renamed from: H */
    boolean f239H;

    /* renamed from: I */
    boolean f240I;

    /* renamed from: J */
    boolean f241J;

    /* renamed from: K */
    private boolean f242K;

    /* renamed from: L */
    private C0088o[] f243L;

    /* renamed from: M */
    private C0088o f244M;

    /* renamed from: N */
    private boolean f245N;

    /* renamed from: O */
    private boolean f246O;

    /* renamed from: P */
    private boolean f247P;

    /* renamed from: Q */
    private boolean f248Q;

    /* renamed from: R */
    boolean f249R;

    /* renamed from: S */
    private int f250S;

    /* renamed from: T */
    private int f251T;

    /* renamed from: U */
    private boolean f252U;

    /* renamed from: V */
    private boolean f253V;

    /* renamed from: W */
    private C0084l f254W;

    /* renamed from: X */
    private C0084l f255X;

    /* renamed from: Y */
    boolean f256Y;

    /* renamed from: Z */
    int f257Z;

    /* renamed from: a0 */
    private final Runnable f258a0;

    /* renamed from: b0 */
    private boolean f259b0;

    /* renamed from: c0 */
    private Rect f260c0;

    /* renamed from: d0 */
    private Rect f261d0;

    /* renamed from: e0 */
    private AppCompatViewInflater f262e0;

    /* renamed from: i */
    final Object f263i;

    /* renamed from: j */
    final Context f264j;

    /* renamed from: k */
    Window f265k;

    /* renamed from: l */
    private C0082j f266l;

    /* renamed from: m */
    final C0068d f267m;

    /* renamed from: n */
    C0061a f268n;

    /* renamed from: o */
    MenuInflater f269o;

    /* renamed from: p */
    private CharSequence f270p;

    /* renamed from: q */
    private C0290y f271q;

    /* renamed from: r */
    private C0079h f272r;

    /* renamed from: s */
    private C0089p f273s;

    /* renamed from: t */
    C3124b f274t;

    /* renamed from: u */
    ActionBarContextView f275u;

    /* renamed from: v */
    PopupWindow f276v;

    /* renamed from: w */
    Runnable f277w;

    /* renamed from: x */
    C3325a0 f278x;

    /* renamed from: y */
    private boolean f279y;

    /* renamed from: z */
    private boolean f280z;

    /* renamed from: androidx.appcompat.app.f$a */
    static class C0071a implements UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ UncaughtExceptionHandler f281a;

        C0071a(UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f281a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m380a(Throwable th) {
            if (!(th instanceof NotFoundException)) {
                return false;
            }
            String message = th.getMessage();
            if (message != null) {
                return message.contains("drawable") || message.contains("Drawable");
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m380a(th)) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getMessage());
                sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                NotFoundException notFoundException = new NotFoundException(sb.toString());
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f281a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f281a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.f$b */
    class C0072b implements Runnable {
        C0072b() {
        }

        public void run() {
            C0070f fVar = C0070f.this;
            if ((fVar.f257Z & 1) != 0) {
                fVar.mo306g(0);
            }
            C0070f fVar2 = C0070f.this;
            if ((fVar2.f257Z & 4096) != 0) {
                fVar2.mo306g(108);
            }
            C0070f fVar3 = C0070f.this;
            fVar3.f256Y = false;
            fVar3.f257Z = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.f$c */
    class C0073c implements C3375r {
        C0073c() {
        }

        /* renamed from: a */
        public C3343e0 mo325a(View view, C3343e0 e0Var) {
            int d = e0Var.mo10733d();
            int k = C0070f.this.mo310k(d);
            if (d != k) {
                e0Var = e0Var.mo10730a(e0Var.mo10731b(), k, e0Var.mo10732c(), e0Var.mo10729a());
            }
            return C3379v.m13802b(view, e0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.f$d */
    class C0074d implements C0206a {
        C0074d() {
        }

        /* renamed from: a */
        public void mo326a(Rect rect) {
            rect.top = C0070f.this.mo310k(rect.top);
        }
    }

    /* renamed from: androidx.appcompat.app.f$e */
    class C0075e implements C0159a {
        C0075e() {
        }

        /* renamed from: a */
        public void mo327a() {
        }

        public void onDetachedFromWindow() {
            C0070f.this.mo311k();
        }
    }

    /* renamed from: androidx.appcompat.app.f$f */
    class C0076f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        class C0077a extends C3338c0 {
            C0077a() {
            }

            /* renamed from: b */
            public void mo330b(View view) {
                C0070f.this.f275u.setAlpha(1.0f);
                C0070f.this.f278x.mo10711a((C3332b0) null);
                C0070f.this.f278x = null;
            }

            /* renamed from: c */
            public void mo331c(View view) {
                C0070f.this.f275u.setVisibility(0);
            }
        }

        C0076f() {
        }

        public void run() {
            C0070f fVar = C0070f.this;
            fVar.f276v.showAtLocation(fVar.f275u, 55, 0, 0);
            C0070f.this.mo312m();
            if (C0070f.this.mo322u()) {
                C0070f.this.f275u.setAlpha(0.0f);
                C0070f fVar2 = C0070f.this;
                C3325a0 a = C3379v.m13776a(fVar2.f275u);
                a.mo10708a(1.0f);
                fVar2.f278x = a;
                C0070f.this.f278x.mo10711a((C3332b0) new C0077a());
                return;
            }
            C0070f.this.f275u.setAlpha(1.0f);
            C0070f.this.f275u.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.f$g */
    class C0078g extends C3338c0 {
        C0078g() {
        }

        /* renamed from: b */
        public void mo330b(View view) {
            C0070f.this.f275u.setAlpha(1.0f);
            C0070f.this.f278x.mo10711a((C3332b0) null);
            C0070f.this.f278x = null;
        }

        /* renamed from: c */
        public void mo331c(View view) {
            C0070f.this.f275u.setVisibility(0);
            C0070f.this.f275u.sendAccessibilityEvent(32);
            if (C0070f.this.f275u.getParent() instanceof View) {
                C3379v.m13773I((View) C0070f.this.f275u.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$h */
    private final class C0079h implements C0138a {
        C0079h() {
        }

        /* renamed from: a */
        public void mo332a(C0122g gVar, boolean z) {
            C0070f.this.mo302b(gVar);
        }

        /* renamed from: a */
        public boolean mo333a(C0122g gVar) {
            Callback q = C0070f.this.mo318q();
            if (q != null) {
                q.onMenuOpened(108, gVar);
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.f$i */
    class C0080i implements C3125a {

        /* renamed from: a */
        private C3125a f290a;

        /* renamed from: androidx.appcompat.app.f$i$a */
        class C0081a extends C3338c0 {
            C0081a() {
            }

            /* renamed from: b */
            public void mo330b(View view) {
                C0070f.this.f275u.setVisibility(8);
                C0070f fVar = C0070f.this;
                PopupWindow popupWindow = fVar.f276v;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f275u.getParent() instanceof View) {
                    C3379v.m13773I((View) C0070f.this.f275u.getParent());
                }
                C0070f.this.f275u.removeAllViews();
                C0070f.this.f278x.mo10711a((C3332b0) null);
                C0070f.this.f278x = null;
            }
        }

        public C0080i(C3125a aVar) {
            this.f290a = aVar;
        }

        /* renamed from: a */
        public void mo334a(C3124b bVar) {
            this.f290a.mo334a(bVar);
            C0070f fVar = C0070f.this;
            if (fVar.f276v != null) {
                fVar.f265k.getDecorView().removeCallbacks(C0070f.this.f277w);
            }
            C0070f fVar2 = C0070f.this;
            if (fVar2.f275u != null) {
                fVar2.mo312m();
                C0070f fVar3 = C0070f.this;
                C3325a0 a = C3379v.m13776a(fVar3.f275u);
                a.mo10708a(0.0f);
                fVar3.f278x = a;
                C0070f.this.f278x.mo10711a((C3332b0) new C0081a());
            }
            C0070f fVar4 = C0070f.this;
            C0068d dVar = fVar4.f267m;
            if (dVar != null) {
                dVar.mo235b(fVar4.f274t);
            }
            C0070f.this.f274t = null;
        }

        /* renamed from: a */
        public boolean mo335a(C3124b bVar, Menu menu) {
            return this.f290a.mo335a(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo336a(C3124b bVar, MenuItem menuItem) {
            return this.f290a.mo336a(bVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo337b(C3124b bVar, Menu menu) {
            return this.f290a.mo337b(bVar, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.f$j */
    class C0082j extends C3136i {
        C0082j(Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ActionMode mo338a(ActionMode.Callback callback) {
            C3130a aVar = new C3130a(C0070f.this.f264j, callback);
            C3124b a = C0070f.this.mo293a((C3125a) aVar);
            if (a != null) {
                return aVar.mo10074b(a);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0070f.this.mo299a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0070f.this.mo303b(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0122g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0070f.this.mo308i(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0070f.this.mo309j(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0122g gVar = menu instanceof C0122g ? (C0122g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.mo613c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.mo613c(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0088o a = C0070f.this.mo291a(0, true);
            if (a != null) {
                C0122g gVar = a.f311j;
                if (gVar != null) {
                    super.onProvideKeyboardShortcuts(list, gVar, i);
                    return;
                }
            }
            super.onProvideKeyboardShortcuts(list, menu, i);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (VERSION.SDK_INT >= 23) {
                return null;
            }
            return C0070f.this.mo319r() ? mo338a(callback) : super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!C0070f.this.mo319r() || i != 0) ? super.onWindowStartingActionMode(callback, i) : mo338a(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.f$k */
    private class C0083k extends C0084l {

        /* renamed from: c */
        private final PowerManager f294c;

        C0083k(Context context) {
            super();
            this.f294c = (PowerManager) context.getSystemService("power");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public IntentFilter mo349b() {
            if (VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo350c() {
            return (VERSION.SDK_INT < 21 || !this.f294c.isPowerSaveMode()) ? 1 : 2;
        }

        /* renamed from: d */
        public void mo351d() {
            C0070f.this.mo274a();
        }
    }

    /* renamed from: androidx.appcompat.app.f$l */
    abstract class C0084l {

        /* renamed from: a */
        private BroadcastReceiver f296a;

        /* renamed from: androidx.appcompat.app.f$l$a */
        class C0085a extends BroadcastReceiver {
            C0085a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0084l.this.mo351d();
            }
        }

        C0084l() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo352a() {
            BroadcastReceiver broadcastReceiver = this.f296a;
            if (broadcastReceiver != null) {
                try {
                    C0070f.this.f264j.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f296a = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract IntentFilter mo349b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract int mo350c();

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract void mo351d();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo353e() {
            mo352a();
            IntentFilter b = mo349b();
            if (b != null && b.countActions() != 0) {
                if (this.f296a == null) {
                    this.f296a = new C0085a();
                }
                C0070f.this.f264j.registerReceiver(this.f296a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$m */
    private class C0086m extends C0084l {

        /* renamed from: c */
        private final C0101l f299c;

        C0086m(C0101l lVar) {
            super();
            this.f299c = lVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public IntentFilter mo349b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo350c() {
            return this.f299c.mo384a() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo351d() {
            C0070f.this.mo274a();
        }
    }

    /* renamed from: androidx.appcompat.app.f$n */
    private class C0087n extends ContentFrameLayout {
        public C0087n(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m407a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0070f.this.mo299a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m407a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0070f.this.mo305f(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C3103a.m12557c(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.f$o */
    protected static final class C0088o {

        /* renamed from: a */
        int f302a;

        /* renamed from: b */
        int f303b;

        /* renamed from: c */
        int f304c;

        /* renamed from: d */
        int f305d;

        /* renamed from: e */
        int f306e;

        /* renamed from: f */
        int f307f;

        /* renamed from: g */
        ViewGroup f308g;

        /* renamed from: h */
        View f309h;

        /* renamed from: i */
        View f310i;

        /* renamed from: j */
        C0122g f311j;

        /* renamed from: k */
        C0119e f312k;

        /* renamed from: l */
        Context f313l;

        /* renamed from: m */
        boolean f314m;

        /* renamed from: n */
        boolean f315n;

        /* renamed from: o */
        boolean f316o;

        /* renamed from: p */
        public boolean f317p;

        /* renamed from: q */
        boolean f318q = false;

        /* renamed from: r */
        boolean f319r;

        /* renamed from: s */
        Bundle f320s;

        C0088o(int i) {
            this.f302a = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0139n mo358a(C0138a aVar) {
            if (this.f311j == null) {
                return null;
            }
            if (this.f312k == null) {
                C0119e eVar = new C0119e(this.f313l, C3099g.abc_list_menu_item_layout);
                this.f312k = eVar;
                eVar.mo517a(aVar);
                this.f311j.mo586a((C0137m) this.f312k);
            }
            return this.f312k.mo557a(this.f308g);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo359a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C3093a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C3093a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C3101i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C3127d dVar = new C3127d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f313l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C3102j.AppCompatTheme);
            this.f303b = obtainStyledAttributes.getResourceId(C3102j.AppCompatTheme_panelBackground, 0);
            this.f307f = obtainStyledAttributes.getResourceId(C3102j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo360a(C0122g gVar) {
            C0122g gVar2 = this.f311j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo606b((C0137m) this.f312k);
                }
                this.f311j = gVar;
                if (gVar != null) {
                    C0119e eVar = this.f312k;
                    if (eVar != null) {
                        gVar.mo586a((C0137m) eVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo361a() {
            boolean z = false;
            if (this.f309h == null) {
                return false;
            }
            if (this.f310i != null) {
                return true;
            }
            if (this.f312k.mo556a().getCount() > 0) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: androidx.appcompat.app.f$p */
    private final class C0089p implements C0138a {
        C0089p() {
        }

        /* renamed from: a */
        public void mo332a(C0122g gVar, boolean z) {
            C0122g m = gVar.mo634m();
            boolean z2 = m != gVar;
            C0070f fVar = C0070f.this;
            if (z2) {
                gVar = m;
            }
            C0088o a = fVar.mo292a((Menu) gVar);
            if (a == null) {
                return;
            }
            if (z2) {
                C0070f.this.mo294a(a.f302a, a, m);
                C0070f.this.mo296a(a, true);
                return;
            }
            C0070f.this.mo296a(a, z);
        }

        /* renamed from: a */
        public boolean mo333a(C0122g gVar) {
            if (gVar == null) {
                C0070f fVar = C0070f.this;
                if (fVar.f237F) {
                    Callback q = fVar.mo318q();
                    if (q != null && !C0070f.this.f249R) {
                        q.onMenuOpened(108, gVar);
                    }
                }
            }
            return true;
        }
    }

    static {
        boolean z = false;
        int i = VERSION.SDK_INT;
        if (i >= 21 && i <= 25) {
            z = true;
        }
        f231j0 = z;
        if (f228g0 && !f230i0) {
            Thread.setDefaultUncaughtExceptionHandler(new C0071a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    C0070f(Activity activity, C0068d dVar) {
        this(activity, null, dVar, activity);
    }

    C0070f(Dialog dialog, C0068d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    private C0070f(Context context, Window window, C0068d dVar, Object obj) {
        this.f278x = null;
        this.f279y = true;
        this.f250S = -100;
        this.f258a0 = new C0072b();
        this.f264j = context;
        this.f267m = dVar;
        this.f263i = obj;
        if (this.f250S == -100 && (obj instanceof Dialog)) {
            C0067c F = m303F();
            if (F != null) {
                this.f250S = F.mo258q().mo275b();
            }
        }
        if (this.f250S == -100) {
            Integer num = (Integer) f227f0.get(this.f263i.getClass());
            if (num != null) {
                this.f250S = num.intValue();
                f227f0.remove(this.f263i.getClass());
            }
        }
        if (window != null) {
            m304a(window);
        }
        C0236j.m1170c();
    }

    /* renamed from: A */
    private void m298A() {
        if (this.f265k == null) {
            Object obj = this.f263i;
            if (obj instanceof Activity) {
                m304a(((Activity) obj).getWindow());
            }
        }
        if (this.f265k == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: B */
    private C0084l m299B() {
        if (this.f255X == null) {
            this.f255X = new C0083k(this.f264j);
        }
        return this.f255X;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m300C() {
        /*
            r3 = this;
            r3.m324z()
            boolean r0 = r3.f237F
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.a r0 = r3.f268n
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f263i
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.m r0 = new androidx.appcompat.app.m
            java.lang.Object r1 = r3.f263i
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f238G
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f268n = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            androidx.appcompat.app.m r0 = new androidx.appcompat.app.m
            java.lang.Object r1 = r3.f263i
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            androidx.appcompat.app.a r0 = r3.f268n
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.f259b0
            r0.mo191c(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0070f.m300C():void");
    }

    /* renamed from: D */
    private boolean m301D() {
        if (!this.f253V && (this.f263i instanceof Activity)) {
            PackageManager packageManager = this.f264j.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f264j, this.f263i.getClass()), 0);
                this.f252U = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f252U = false;
            }
        }
        this.f253V = true;
        return this.f252U;
    }

    /* renamed from: E */
    private void m302E() {
        if (this.f280z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: F */
    private C0067c m303F() {
        Context context = this.f264j;
        while (context != null) {
            if (!(context instanceof C0067c)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0067c) context;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m304a(Window window) {
        String str = "AppCompat has already installed itself into the Window";
        if (this.f265k == null) {
            Callback callback = window.getCallback();
            if (!(callback instanceof C0082j)) {
                C0082j jVar = new C0082j(callback);
                this.f266l = jVar;
                window.setCallback(jVar);
                C0275t0 a = C0275t0.m1310a(this.f264j, (AttributeSet) null, f229h0);
                Drawable c = a.mo1743c(0);
                if (c != null) {
                    window.setBackgroundDrawable(c);
                }
                a.mo1737a();
                this.f265k = window;
                return;
            }
            throw new IllegalStateException(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: a */
    private void m305a(C0088o oVar, KeyEvent keyEvent) {
        int i;
        if (!oVar.f316o && !this.f249R) {
            if (oVar.f302a == 0) {
                if ((this.f264j.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Callback q = mo318q();
            if (q == null || q.onMenuOpened(oVar.f302a, oVar.f311j)) {
                WindowManager windowManager = (WindowManager) this.f264j.getSystemService("window");
                if (windowManager != null && m313b(oVar, keyEvent)) {
                    if (oVar.f308g == null || oVar.f318q) {
                        ViewGroup viewGroup = oVar.f308g;
                        if (viewGroup == null) {
                            if (!m312b(oVar) || oVar.f308g == null) {
                                return;
                            }
                        } else if (oVar.f318q && viewGroup.getChildCount() > 0) {
                            oVar.f308g.removeAllViews();
                        }
                        if (m308a(oVar) && oVar.mo361a()) {
                            LayoutParams layoutParams = oVar.f309h.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(-2, -2);
                            }
                            oVar.f308g.setBackgroundResource(oVar.f303b);
                            ViewParent parent = oVar.f309h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(oVar.f309h);
                            }
                            oVar.f308g.addView(oVar.f309h, layoutParams);
                            if (!oVar.f309h.hasFocus()) {
                                oVar.f309h.requestFocus();
                            }
                        }
                    } else {
                        View view = oVar.f310i;
                        if (view != null) {
                            LayoutParams layoutParams2 = view.getLayoutParams();
                            if (layoutParams2 != null && layoutParams2.width == -1) {
                                i = -1;
                                oVar.f315n = false;
                                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, oVar.f305d, oVar.f306e, 1002, 8519680, -3);
                                layoutParams3.gravity = oVar.f304c;
                                layoutParams3.windowAnimations = oVar.f307f;
                                windowManager.addView(oVar.f308g, layoutParams3);
                                oVar.f316o = true;
                            }
                        }
                    }
                    i = -2;
                    oVar.f315n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, oVar.f305d, oVar.f306e, 1002, 8519680, -3);
                    layoutParams32.gravity = oVar.f304c;
                    layoutParams32.windowAnimations = oVar.f307f;
                    windowManager.addView(oVar.f308g, layoutParams32);
                    oVar.f316o = true;
                }
            } else {
                mo296a(oVar, true);
            }
        }
    }

    /* renamed from: a */
    private void m306a(C0122g gVar, boolean z) {
        C0290y yVar = this.f271q;
        if (yVar == null || !yVar.mo903g() || (ViewConfiguration.get(this.f264j).hasPermanentMenuKey() && !this.f271q.mo898d())) {
            C0088o a = mo291a(0, true);
            a.f318q = true;
            mo296a(a, false);
            m305a(a, (KeyEvent) null);
            return;
        }
        Callback q = mo318q();
        if (this.f271q.mo893a() && z) {
            this.f271q.mo900e();
            if (!this.f249R) {
                q.onPanelClosed(108, mo291a(0, true).f311j);
            }
        } else if (q != null && !this.f249R) {
            if (this.f256Y && (this.f257Z & 1) != 0) {
                this.f265k.getDecorView().removeCallbacks(this.f258a0);
                this.f258a0.run();
            }
            C0088o a2 = mo291a(0, true);
            C0122g gVar2 = a2.f311j;
            if (gVar2 != null && !a2.f319r && q.onPreparePanel(0, a2.f310i, gVar2)) {
                q.onMenuOpened(108, a2.f311j);
                this.f271q.mo901f();
            }
        }
    }

    /* renamed from: a */
    private boolean m307a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f265k.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C3379v.m13767C((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: a */
    private boolean m308a(C0088o oVar) {
        View view = oVar.f310i;
        boolean z = true;
        if (view != null) {
            oVar.f309h = view;
            return true;
        } else if (oVar.f311j == null) {
            return false;
        } else {
            if (this.f273s == null) {
                this.f273s = new C0089p();
            }
            View view2 = (View) oVar.mo358a((C0138a) this.f273s);
            oVar.f309h = view2;
            if (view2 == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: a */
    private boolean m309a(C0088o oVar, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if (oVar.f314m || m313b(oVar, keyEvent)) {
            C0122g gVar = oVar.f311j;
            if (gVar != null) {
                z = gVar.performShortcut(i, keyEvent, i2);
            }
        }
        if (z && (i2 & 1) == 0 && this.f271q == null) {
            mo296a(oVar, true);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m310a(boolean z) {
        if (this.f249R) {
            return false;
        }
        int w = m321w();
        boolean b = m311b(mo307h(w), z);
        if (w == 0) {
            mo314o().mo353e();
        } else {
            C0084l lVar = this.f254W;
            if (lVar != null) {
                lVar.mo352a();
            }
        }
        if (w == 3) {
            m299B().mo353e();
        } else {
            C0084l lVar2 = this.f255X;
            if (lVar2 != null) {
                lVar2.mo352a();
            }
        }
        return b;
    }

    /* renamed from: b */
    private boolean m311b(int i, boolean z) {
        int i2 = this.f264j.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z2 = true;
        int i3 = i != 1 ? i != 2 ? i2 : 32 : 16;
        boolean D = m301D();
        boolean z3 = false;
        if ((f231j0 || i3 != i2) && !D && VERSION.SDK_INT >= 17 && !this.f246O && (this.f263i instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & -49) | i3;
            try {
                ((ContextThemeWrapper) this.f263i).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException e) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e);
            }
        }
        int i4 = this.f264j.getResources().getConfiguration().uiMode & 48;
        if (!z3 && i4 != i3 && z && !D && this.f246O && (VERSION.SDK_INT >= 17 || this.f247P)) {
            Object obj = this.f263i;
            if (obj instanceof Activity) {
                C0343a.m1780c((Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i4 == i3) {
            z2 = z3;
        } else {
            m314c(i3, D);
        }
        if (z2) {
            Object obj2 = this.f263i;
            if (obj2 instanceof C0067c) {
                ((C0067c) obj2).mo233b(i);
            }
        }
        return z2;
    }

    /* renamed from: b */
    private boolean m312b(C0088o oVar) {
        oVar.mo359a(mo313n());
        oVar.f308g = new C0087n(oVar.f313l);
        oVar.f304c = 81;
        return true;
    }

    /* renamed from: b */
    private boolean m313b(C0088o oVar, KeyEvent keyEvent) {
        if (this.f249R) {
            return false;
        }
        if (oVar.f314m) {
            return true;
        }
        C0088o oVar2 = this.f244M;
        if (!(oVar2 == null || oVar2 == oVar)) {
            mo296a(oVar2, false);
        }
        Callback q = mo318q();
        if (q != null) {
            oVar.f310i = q.onCreatePanelView(oVar.f302a);
        }
        int i = oVar.f302a;
        boolean z = i == 0 || i == 108;
        if (z) {
            C0290y yVar = this.f271q;
            if (yVar != null) {
                yVar.mo896c();
            }
        }
        if (oVar.f310i == null && (!z || !(mo321t() instanceof C0094j))) {
            if (oVar.f311j == null || oVar.f319r) {
                if (oVar.f311j == null && (!m315c(oVar) || oVar.f311j == null)) {
                    return false;
                }
                if (z && this.f271q != null) {
                    if (this.f272r == null) {
                        this.f272r = new C0079h();
                    }
                    this.f271q.mo887a(oVar.f311j, this.f272r);
                }
                oVar.f311j.mo644s();
                if (!q.onCreatePanelMenu(oVar.f302a, oVar.f311j)) {
                    oVar.mo360a((C0122g) null);
                    if (z) {
                        C0290y yVar2 = this.f271q;
                        if (yVar2 != null) {
                            yVar2.mo887a(null, this.f272r);
                        }
                    }
                    return false;
                }
                oVar.f319r = false;
            }
            oVar.f311j.mo644s();
            Bundle bundle = oVar.f320s;
            if (bundle != null) {
                oVar.f311j.mo583a(bundle);
                oVar.f320s = null;
            }
            if (!q.onPreparePanel(0, oVar.f310i, oVar.f311j)) {
                if (z) {
                    C0290y yVar3 = this.f271q;
                    if (yVar3 != null) {
                        yVar3.mo887a(null, this.f272r);
                    }
                }
                oVar.f311j.mo641r();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            oVar.f317p = z2;
            oVar.f311j.setQwertyMode(z2);
            oVar.f311j.mo641r();
        }
        oVar.f314m = true;
        oVar.f315n = false;
        this.f244M = oVar;
        return true;
    }

    /* renamed from: c */
    private void m314c(int i, boolean z) {
        Resources resources = this.f264j.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration, null);
        if (VERSION.SDK_INT < 26) {
            C0093i.m424a(resources);
        }
        int i2 = this.f251T;
        if (i2 != 0) {
            this.f264j.setTheme(i2);
            if (VERSION.SDK_INT >= 23) {
                this.f264j.getTheme().applyStyle(this.f251T, true);
            }
        }
        if (z) {
            Object obj = this.f263i;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C0523n) {
                    if (!((C0523n) activity).mo115a().mo3036a().mo3039a(C0516b.STARTED)) {
                        return;
                    }
                } else if (!this.f248Q) {
                    return;
                }
                activity.onConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: c */
    private boolean m315c(C0088o oVar) {
        Context context = this.f264j;
        int i = oVar.f302a;
        if ((i == 0 || i == 108) && this.f271q != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C3093a.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C3093a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C3093a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C3127d dVar = new C3127d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0122g gVar = new C0122g(context);
        gVar.mo585a((C0123a) this);
        oVar.mo360a(gVar);
        return true;
    }

    /* renamed from: d */
    private boolean m316d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0088o a = mo291a(i, true);
            if (!a.f316o) {
                return m313b(a, keyEvent);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m317e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            f.a.o.b r0 = r3.f274t
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.f$o r2 = r3.mo291a(r4, r0)
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.y r4 = r3.f271q
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.mo903g()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f264j
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.y r4 = r3.f271q
            boolean r4 = r4.mo893a()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f249R
            if (r4 != 0) goto L_0x0062
            boolean r4 = r3.m313b(r2, r5)
            if (r4 == 0) goto L_0x0062
            androidx.appcompat.widget.y r4 = r3.f271q
            boolean r0 = r4.mo901f()
            goto L_0x006a
        L_0x003c:
            androidx.appcompat.widget.y r4 = r3.f271q
            boolean r0 = r4.mo900e()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.f316o
            if (r4 != 0) goto L_0x0064
            boolean r4 = r2.f315n
            if (r4 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r4 = r2.f314m
            if (r4 == 0) goto L_0x0062
            boolean r4 = r2.f319r
            if (r4 == 0) goto L_0x005b
            r2.f314m = r1
            boolean r4 = r3.m313b(r2, r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0062
            r3.m305a(r2, r5)
            goto L_0x006a
        L_0x0062:
            r0 = 0
            goto L_0x006a
        L_0x0064:
            boolean r4 = r2.f316o
            r3.mo296a(r2, r0)
            r0 = r4
        L_0x006a:
            if (r0 == 0) goto L_0x0083
            android.content.Context r4 = r3.f264j
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            if (r4 == 0) goto L_0x007c
            r4.playSoundEffect(r1)
            goto L_0x0083
        L_0x007c:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r5 = "Couldn't get audio manager"
            android.util.Log.w(r4, r5)
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0070f.m317e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: l */
    private void m318l(int i) {
        this.f257Z = (1 << i) | this.f257Z;
        if (!this.f256Y) {
            C3379v.m13794a(this.f265k.getDecorView(), this.f258a0);
            this.f256Y = true;
        }
    }

    /* renamed from: m */
    private int m319m(int i) {
        String str = "AppCompatDelegate";
        if (i == 8) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i == 9) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        return i;
    }

    /* renamed from: v */
    private void m320v() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f232A.findViewById(16908290);
        View decorView = this.f265k.getDecorView();
        contentFrameLayout.mo1041a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f264j.obtainStyledAttributes(C3102j.AppCompatTheme);
        obtainStyledAttributes.getValue(C3102j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C3102j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C3102j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C3102j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C3102j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C3102j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C3102j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C3102j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C3102j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C3102j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: w */
    private int m321w() {
        int i = this.f250S;
        return i != -100 ? i : C0069e.m273l();
    }

    /* renamed from: x */
    private void m322x() {
        C0084l lVar = this.f254W;
        if (lVar != null) {
            lVar.mo352a();
        }
        C0084l lVar2 = this.f255X;
        if (lVar2 != null) {
            lVar2.mo352a();
        }
    }

    /* renamed from: y */
    private ViewGroup m323y() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f264j.obtainStyledAttributes(C3102j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C3102j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C3102j.AppCompatTheme_windowNoTitle, false)) {
                mo278b(1);
            } else if (obtainStyledAttributes.getBoolean(C3102j.AppCompatTheme_windowActionBar, false)) {
                mo278b(108);
            }
            if (obtainStyledAttributes.getBoolean(C3102j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo278b(109);
            }
            if (obtainStyledAttributes.getBoolean(C3102j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo278b(10);
            }
            this.f240I = obtainStyledAttributes.getBoolean(C3102j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m298A();
            this.f265k.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f264j);
            if (this.f241J) {
                viewGroup = (ViewGroup) from.inflate(this.f239H ? C3099g.abc_screen_simple_overlay_action_mode : C3099g.abc_screen_simple, null);
                if (VERSION.SDK_INT >= 21) {
                    C3379v.m13792a((View) viewGroup, (C3375r) new C0073c());
                } else {
                    ((C0205c0) viewGroup).setOnFitSystemWindowsListener(new C0074d());
                }
            } else if (this.f240I) {
                viewGroup = (ViewGroup) from.inflate(C3099g.abc_dialog_title_material, null);
                this.f238G = false;
                this.f237F = false;
            } else if (this.f237F) {
                TypedValue typedValue = new TypedValue();
                this.f264j.getTheme().resolveAttribute(C3093a.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C3127d(this.f264j, typedValue.resourceId) : this.f264j).inflate(C3099g.abc_screen_toolbar, null);
                C0290y yVar = (C0290y) viewGroup.findViewById(C3098f.decor_content_parent);
                this.f271q = yVar;
                yVar.setWindowCallback(mo318q());
                if (this.f238G) {
                    this.f271q.mo886a(109);
                }
                if (this.f235D) {
                    this.f271q.mo886a(2);
                }
                if (this.f236E) {
                    this.f271q.mo886a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f271q == null) {
                    this.f233B = (TextView) viewGroup.findViewById(C3098f.title);
                }
                C0293z0.m1488b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C3098f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f265k.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f265k.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0075e());
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f237F);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f238G);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f240I);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f239H);
            sb.append(", windowNoTitle: ");
            sb.append(this.f241J);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: z */
    private void m324z() {
        if (!this.f280z) {
            this.f232A = m323y();
            CharSequence p = mo317p();
            if (!TextUtils.isEmpty(p)) {
                C0290y yVar = this.f271q;
                if (yVar != null) {
                    yVar.setWindowTitle(p);
                } else if (mo321t() != null) {
                    mo321t().mo187a(p);
                } else {
                    TextView textView = this.f233B;
                    if (textView != null) {
                        textView.setText(p);
                    }
                }
            }
            m320v();
            mo295a(this.f232A);
            this.f280z = true;
            C0088o a = mo291a(0, false);
            if (this.f249R) {
                return;
            }
            if (a == null || a.f311j == null) {
                m318l(108);
            }
        }
    }

    /* renamed from: a */
    public <T extends View> T mo266a(int i) {
        m324z();
        return this.f265k.findViewById(i);
    }

    /* renamed from: a */
    public View mo290a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean z2 = false;
        if (this.f262e0 == null) {
            String string = this.f264j.obtainStyledAttributes(C3102j.AppCompatTheme).getString(C3102j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f262e0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    Log.i("AppCompatDelegate", sb.toString(), th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.f262e0 = appCompatViewInflater;
        }
        if (f228g0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m307a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f262e0.mo168a(view, str, context, attributeSet, z, f228g0, true, C0291y0.m1459b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0088o mo291a(int i, boolean z) {
        C0088o[] oVarArr = this.f243L;
        if (oVarArr == null || oVarArr.length <= i) {
            C0088o[] oVarArr2 = new C0088o[(i + 1)];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.f243L = oVarArr2;
            oVarArr = oVarArr2;
        }
        C0088o oVar = oVarArr[i];
        if (oVar != null) {
            return oVar;
        }
        C0088o oVar2 = new C0088o(i);
        oVarArr[i] = oVar2;
        return oVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0088o mo292a(Menu menu) {
        C0088o[] oVarArr = this.f243L;
        int length = oVarArr != null ? oVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0088o oVar = oVarArr[i];
            if (oVar != null && oVar.f311j == menu) {
                return oVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C3124b mo293a(C3125a aVar) {
        if (aVar != null) {
            C3124b bVar = this.f274t;
            if (bVar != null) {
                bVar.mo401a();
            }
            C0080i iVar = new C0080i(aVar);
            C0061a d = mo282d();
            if (d != null) {
                C3124b a = d.mo184a((C3125a) iVar);
                this.f274t = a;
                if (a != null) {
                    C0068d dVar = this.f267m;
                    if (dVar != null) {
                        dVar.mo230a(a);
                    }
                }
            }
            if (this.f274t == null) {
                this.f274t = mo301b((C3125a) iVar);
            }
            return this.f274t;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo294a(int i, C0088o oVar, Menu menu) {
        if (menu == null) {
            if (oVar == null && i >= 0) {
                C0088o[] oVarArr = this.f243L;
                if (i < oVarArr.length) {
                    oVar = oVarArr[i];
                }
            }
            if (oVar != null) {
                menu = oVar.f311j;
            }
        }
        if ((oVar == null || oVar.f316o) && !this.f249R) {
            this.f266l.mo10093a().onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    public void mo267a(Context context) {
        m310a(false);
        this.f246O = true;
    }

    /* renamed from: a */
    public void mo268a(Configuration configuration) {
        if (this.f237F && this.f280z) {
            C0061a d = mo282d();
            if (d != null) {
                d.mo185a(configuration);
            }
        }
        C0236j.m1169b().mo1476a(this.f264j);
        m310a(false);
    }

    /* renamed from: a */
    public void mo269a(Bundle bundle) {
        this.f246O = true;
        m310a(false);
        m298A();
        Object obj = this.f263i;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0356g.m1804b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0061a t = mo321t();
                if (t == null) {
                    this.f259b0 = true;
                } else {
                    t.mo191c(true);
                }
            }
        }
        this.f247P = true;
    }

    /* renamed from: a */
    public void mo270a(View view) {
        m324z();
        ViewGroup viewGroup = (ViewGroup) this.f232A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f266l.mo10093a().onContentChanged();
    }

    /* renamed from: a */
    public void mo271a(View view, LayoutParams layoutParams) {
        m324z();
        ((ViewGroup) this.f232A.findViewById(16908290)).addView(view, layoutParams);
        this.f266l.mo10093a().onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo295a(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo296a(C0088o oVar, boolean z) {
        if (z && oVar.f302a == 0) {
            C0290y yVar = this.f271q;
            if (yVar != null && yVar.mo893a()) {
                mo302b(oVar.f311j);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f264j.getSystemService("window");
        if (windowManager != null && oVar.f316o) {
            ViewGroup viewGroup = oVar.f308g;
            if (viewGroup != null) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo294a(oVar.f302a, oVar, null);
                }
            }
        }
        oVar.f314m = false;
        oVar.f315n = false;
        oVar.f316o = false;
        oVar.f309h = null;
        oVar.f318q = true;
        if (this.f244M == oVar) {
            this.f244M = null;
        }
    }

    /* renamed from: a */
    public void mo297a(C0122g gVar) {
        m306a(gVar, true);
    }

    /* renamed from: a */
    public void mo272a(Toolbar toolbar) {
        Window window;
        Callback callback;
        if (this.f263i instanceof Activity) {
            C0061a d = mo282d();
            if (!(d instanceof C0103m)) {
                this.f269o = null;
                if (d != null) {
                    d.mo199j();
                }
                if (toolbar != null) {
                    C0094j jVar = new C0094j(toolbar, mo317p(), this.f266l);
                    this.f268n = jVar;
                    window = this.f265k;
                    callback = jVar.mo378l();
                } else {
                    this.f268n = null;
                    window = this.f265k;
                    callback = this.f266l;
                }
                window.setCallback(callback);
                mo285f();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: a */
    public final void mo273a(CharSequence charSequence) {
        this.f270p = charSequence;
        C0290y yVar = this.f271q;
        if (yVar != null) {
            yVar.setWindowTitle(charSequence);
        } else if (mo321t() != null) {
            mo321t().mo187a(charSequence);
        } else {
            TextView textView = this.f233B;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: a */
    public boolean mo274a() {
        return m310a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo298a(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f245N = z;
        } else if (i == 82) {
            m316d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo299a(KeyEvent keyEvent) {
        Object obj = this.f263i;
        boolean z = true;
        if ((obj instanceof C3342a) || (obj instanceof C0090g)) {
            View decorView = this.f265k.getDecorView();
            if (decorView != null && C3341e.m13613a(decorView, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getKeyCode() == 82 && this.f266l.mo10093a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo298a(keyCode, keyEvent) : mo304c(keyCode, keyEvent);
    }

    /* renamed from: a */
    public boolean mo300a(C0122g gVar, MenuItem menuItem) {
        Callback q = mo318q();
        if (q != null && !this.f249R) {
            C0088o a = mo292a((Menu) gVar.mo634m());
            if (a != null) {
                return q.onMenuItemSelected(a.f302a, menuItem);
            }
        }
        return false;
    }

    /* renamed from: b */
    public int mo275b() {
        return this.f250S;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0165  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p071f.p072a.p079o.C3124b mo301b(p071f.p072a.p079o.C3124b.C3125a r8) {
        /*
            r7 = this;
            r7.mo312m()
            f.a.o.b r0 = r7.f274t
            if (r0 == 0) goto L_0x000a
            r0.mo401a()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.C0070f.C0080i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.f$i r0 = new androidx.appcompat.app.f$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.d r0 = r7.f267m
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f249R
            if (r2 != 0) goto L_0x0022
            f.a.o.b r0 = r0.mo226a(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f274t = r0
            goto L_0x0161
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f275u
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f240I
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f264j
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p071f.p072a.C3093a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f264j
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            f.a.o.d r4 = new f.a.o.d
            android.content.Context r6 = r7.f264j
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f264j
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f275u = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p071f.p072a.C3093a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f276v = r5
            r6 = 2
            androidx.core.widget.C0390h.m2020a(r5, r6)
            android.widget.PopupWindow r5 = r7.f276v
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f275u
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f276v
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p071f.p072a.C3093a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f275u
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f276v
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.f$f r0 = new androidx.appcompat.app.f$f
            r0.<init>()
            r7.f277w = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f232A
            int r4 = p071f.p072a.C3098f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo313n()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo1240a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f275u = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f275u
            if (r0 == 0) goto L_0x0161
            r7.mo312m()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f275u
            r0.mo866c()
            f.a.o.e r0 = new f.a.o.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f275u
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f275u
            android.widget.PopupWindow r6 = r7.f276v
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo409c()
            boolean r8 = r8.mo337b(r0, r3)
            if (r8 == 0) goto L_0x015f
            r0.mo413i()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f275u
            r8.mo864a(r0)
            r7.f274t = r0
            boolean r8 = r7.mo322u()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0129
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f275u
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f275u
            f.h.m.a0 r8 = p071f.p097h.p108m.C3379v.m13776a(r8)
            r8.mo10708a(r0)
            r7.f278x = r8
            androidx.appcompat.app.f$g r0 = new androidx.appcompat.app.f$g
            r0.<init>()
            r8.mo10711a(r0)
            goto L_0x014f
        L_0x0129:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f275u
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f275u
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f275u
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f275u
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x014f
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f275u
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p071f.p097h.p108m.C3379v.m13773I(r8)
        L_0x014f:
            android.widget.PopupWindow r8 = r7.f276v
            if (r8 == 0) goto L_0x0161
            android.view.Window r8 = r7.f265k
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f277w
            r8.post(r0)
            goto L_0x0161
        L_0x015f:
            r7.f274t = r1
        L_0x0161:
            f.a.o.b r8 = r7.f274t
            if (r8 == 0) goto L_0x016c
            androidx.appcompat.app.d r0 = r7.f267m
            if (r0 == 0) goto L_0x016c
            r0.mo230a(r8)
        L_0x016c:
            f.a.o.b r8 = r7.f274t
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0070f.mo301b(f.a.o.b$a):f.a.o.b");
    }

    /* renamed from: b */
    public void mo276b(Bundle bundle) {
        m324z();
    }

    /* renamed from: b */
    public void mo277b(View view, LayoutParams layoutParams) {
        m324z();
        ViewGroup viewGroup = (ViewGroup) this.f232A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f266l.mo10093a().onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo302b(C0122g gVar) {
        if (!this.f242K) {
            this.f242K = true;
            this.f271q.mo910h();
            Callback q = mo318q();
            if (q != null && !this.f249R) {
                q.onPanelClosed(108, gVar);
            }
            this.f242K = false;
        }
    }

    /* renamed from: b */
    public boolean mo278b(int i) {
        int m = m319m(i);
        if (this.f241J && m == 108) {
            return false;
        }
        if (this.f237F && m == 1) {
            this.f237F = false;
        }
        if (m == 1) {
            m302E();
            this.f241J = true;
            return true;
        } else if (m == 2) {
            m302E();
            this.f235D = true;
            return true;
        } else if (m == 5) {
            m302E();
            this.f236E = true;
            return true;
        } else if (m == 10) {
            m302E();
            this.f239H = true;
            return true;
        } else if (m == 108) {
            m302E();
            this.f237F = true;
            return true;
        } else if (m != 109) {
            return this.f265k.requestFeature(m);
        } else {
            m302E();
            this.f238G = true;
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo303b(int i, KeyEvent keyEvent) {
        C0061a d = mo282d();
        if (d != null && d.mo188a(i, keyEvent)) {
            return true;
        }
        C0088o oVar = this.f244M;
        if (oVar == null || !m309a(oVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f244M == null) {
                C0088o a = mo291a(0, true);
                m313b(a, keyEvent);
                boolean a2 = m309a(a, keyEvent.getKeyCode(), keyEvent, 1);
                a.f314m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        C0088o oVar2 = this.f244M;
        if (oVar2 != null) {
            oVar2.f315n = true;
        }
        return true;
    }

    /* renamed from: c */
    public MenuInflater mo279c() {
        if (this.f269o == null) {
            m300C();
            C0061a aVar = this.f268n;
            this.f269o = new C3131g(aVar != null ? aVar.mo197h() : this.f264j);
        }
        return this.f269o;
    }

    /* renamed from: c */
    public void mo280c(int i) {
        m324z();
        ViewGroup viewGroup = (ViewGroup) this.f232A.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f264j).inflate(i, viewGroup);
        this.f266l.mo10093a().onContentChanged();
    }

    /* renamed from: c */
    public void mo281c(Bundle bundle) {
        if (this.f250S != -100) {
            f227f0.put(this.f263i.getClass(), Integer.valueOf(this.f250S));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo304c(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f245N;
            this.f245N = false;
            C0088o a = mo291a(0, false);
            if (a != null && a.f316o) {
                if (!z) {
                    mo296a(a, true);
                }
                return true;
            } else if (mo320s()) {
                return true;
            }
        } else if (i == 82) {
            m317e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public C0061a mo282d() {
        m300C();
        return this.f268n;
    }

    /* renamed from: d */
    public void mo283d(int i) {
        this.f251T = i;
    }

    /* renamed from: e */
    public void mo284e() {
        LayoutInflater from = LayoutInflater.from(this.f264j);
        if (from.getFactory() == null) {
            C3344f.m13625b(from, this);
        } else if (!(from.getFactory2() instanceof C0070f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: f */
    public void mo285f() {
        C0061a d = mo282d();
        if (d == null || !d.mo198i()) {
            m318l(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo305f(int i) {
        mo296a(mo291a(i, true), true);
    }

    /* renamed from: g */
    public void mo286g() {
        C0069e.m269b((C0069e) this);
        if (this.f256Y) {
            this.f265k.getDecorView().removeCallbacks(this.f258a0);
        }
        this.f248Q = false;
        this.f249R = true;
        C0061a aVar = this.f268n;
        if (aVar != null) {
            aVar.mo199j();
        }
        m322x();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo306g(int i) {
        C0088o a = mo291a(i, true);
        if (a.f311j != null) {
            Bundle bundle = new Bundle();
            a.f311j.mo611c(bundle);
            if (bundle.size() > 0) {
                a.f320s = bundle;
            }
            a.f311j.mo644s();
            a.f311j.clear();
        }
        a.f319r = true;
        a.f318q = true;
        if ((i == 108 || i == 0) && this.f271q != null) {
            C0088o a2 = mo291a(0, false);
            if (a2 != null) {
                a2.f314m = false;
                m313b(a2, (KeyEvent) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo307h(int i) {
        C0084l o;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        o = m299B();
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (VERSION.SDK_INT >= 23 && ((UiModeManager) this.f264j.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                o = mo314o();
            }
            return o.mo350c();
        }
        return i;
    }

    /* renamed from: h */
    public void mo287h() {
        C0061a d = mo282d();
        if (d != null) {
            d.mo193e(true);
        }
    }

    /* renamed from: i */
    public void mo288i() {
        this.f248Q = true;
        mo274a();
        C0069e.m268a((C0069e) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo308i(int i) {
        if (i == 108) {
            C0061a d = mo282d();
            if (d != null) {
                d.mo190b(true);
            }
        }
    }

    /* renamed from: j */
    public void mo289j() {
        this.f248Q = false;
        C0069e.m269b((C0069e) this);
        C0061a d = mo282d();
        if (d != null) {
            d.mo193e(false);
        }
        if (this.f263i instanceof Dialog) {
            m322x();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo309j(int i) {
        if (i == 108) {
            C0061a d = mo282d();
            if (d != null) {
                d.mo190b(false);
            }
        } else if (i == 0) {
            C0088o a = mo291a(i, true);
            if (a.f316o) {
                mo296a(a, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public int mo310k(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f275u;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof MarginLayoutParams)) {
            z = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f275u.getLayoutParams();
            boolean z3 = true;
            if (this.f275u.isShown()) {
                if (this.f260c0 == null) {
                    this.f260c0 = new Rect();
                    this.f261d0 = new Rect();
                }
                Rect rect = this.f260c0;
                Rect rect2 = this.f261d0;
                rect.set(0, i, 0, 0);
                C0293z0.m1486a(this.f232A, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f234C;
                    if (view == null) {
                        View view2 = new View(this.f264j);
                        this.f234C = view2;
                        view2.setBackgroundColor(this.f264j.getResources().getColor(C3095c.abc_input_method_navigation_guard));
                        this.f232A.addView(this.f234C, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f234C.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f234C == null) {
                    z3 = false;
                }
                if (!this.f239H && z3) {
                    i = 0;
                }
                boolean z4 = z3;
                z3 = z2;
                z = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f275u.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f234C;
        if (view3 != null) {
            if (!z) {
                i2 = 8;
            }
            view3.setVisibility(i2);
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo311k() {
        C0290y yVar = this.f271q;
        if (yVar != null) {
            yVar.mo910h();
        }
        if (this.f276v != null) {
            this.f265k.getDecorView().removeCallbacks(this.f277w);
            if (this.f276v.isShowing()) {
                try {
                    this.f276v.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f276v = null;
        }
        mo312m();
        C0088o a = mo291a(0, false);
        if (a != null) {
            C0122g gVar = a.f311j;
            if (gVar != null) {
                gVar.close();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo312m() {
        C3325a0 a0Var = this.f278x;
        if (a0Var != null) {
            a0Var.mo10713a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final Context mo313n() {
        C0061a d = mo282d();
        Context h = d != null ? d.mo197h() : null;
        return h == null ? this.f264j : h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final C0084l mo314o() {
        if (this.f254W == null) {
            this.f254W = new C0086m(C0101l.m456a(this.f264j));
        }
        return this.f254W;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo290a(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final CharSequence mo317p() {
        Object obj = this.f263i;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f270p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final Callback mo318q() {
        return this.f265k.getCallback();
    }

    /* renamed from: r */
    public boolean mo319r() {
        return this.f279y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo320s() {
        C3124b bVar = this.f274t;
        if (bVar != null) {
            bVar.mo401a();
            return true;
        }
        C0061a d = mo282d();
        return d != null && d.mo195f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final C0061a mo321t() {
        return this.f268n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final boolean mo322u() {
        if (this.f280z) {
            ViewGroup viewGroup = this.f232A;
            if (viewGroup != null && C3379v.m13768D(viewGroup)) {
                return true;
            }
        }
        return false;
    }
}
