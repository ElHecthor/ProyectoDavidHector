package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.C0061a.C0063b;
import androidx.appcompat.view.menu.C0122g;
import androidx.appcompat.view.menu.C0122g.C0123a;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout.C0152d;
import androidx.appcompat.widget.C0242l0;
import androidx.appcompat.widget.C0292z;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p071f.p072a.C3093a;
import p071f.p072a.C3098f;
import p071f.p072a.C3102j;
import p071f.p072a.p079o.C3123a;
import p071f.p072a.p079o.C3124b;
import p071f.p072a.p079o.C3124b.C3125a;
import p071f.p072a.p079o.C3131g;
import p071f.p072a.p079o.C3134h;
import p071f.p097h.p108m.C3325a0;
import p071f.p097h.p108m.C3332b0;
import p071f.p097h.p108m.C3338c0;
import p071f.p097h.p108m.C3340d0;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.appcompat.app.m */
public class C0103m extends C0061a implements C0152d {

    /* renamed from: B */
    private static final Interpolator f361B = new AccelerateInterpolator();

    /* renamed from: C */
    private static final Interpolator f362C = new DecelerateInterpolator();

    /* renamed from: A */
    final C3340d0 f363A = new C0106c();

    /* renamed from: a */
    Context f364a;

    /* renamed from: b */
    private Context f365b;

    /* renamed from: c */
    ActionBarOverlayLayout f366c;

    /* renamed from: d */
    ActionBarContainer f367d;

    /* renamed from: e */
    C0292z f368e;

    /* renamed from: f */
    ActionBarContextView f369f;

    /* renamed from: g */
    View f370g;

    /* renamed from: h */
    C0242l0 f371h;

    /* renamed from: i */
    private boolean f372i;

    /* renamed from: j */
    C0107d f373j;

    /* renamed from: k */
    C3124b f374k;

    /* renamed from: l */
    C3125a f375l;

    /* renamed from: m */
    private boolean f376m;

    /* renamed from: n */
    private ArrayList<C0063b> f377n = new ArrayList<>();

    /* renamed from: o */
    private boolean f378o;

    /* renamed from: p */
    private int f379p = 0;

    /* renamed from: q */
    boolean f380q = true;

    /* renamed from: r */
    boolean f381r;

    /* renamed from: s */
    boolean f382s;

    /* renamed from: t */
    private boolean f383t;

    /* renamed from: u */
    private boolean f384u = true;

    /* renamed from: v */
    C3134h f385v;

    /* renamed from: w */
    private boolean f386w;

    /* renamed from: x */
    boolean f387x;

    /* renamed from: y */
    final C3332b0 f388y = new C0104a();

    /* renamed from: z */
    final C3332b0 f389z = new C0105b();

    /* renamed from: androidx.appcompat.app.m$a */
    class C0104a extends C3338c0 {
        C0104a() {
        }

        /* renamed from: b */
        public void mo330b(View view) {
            C0103m mVar = C0103m.this;
            if (mVar.f380q) {
                View view2 = mVar.f370g;
                if (view2 != null) {
                    view2.setTranslationY(0.0f);
                    C0103m.this.f367d.setTranslationY(0.0f);
                }
            }
            C0103m.this.f367d.setVisibility(8);
            C0103m.this.f367d.setTransitioning(false);
            C0103m mVar2 = C0103m.this;
            mVar2.f385v = null;
            mVar2.mo398l();
            ActionBarOverlayLayout actionBarOverlayLayout = C0103m.this.f366c;
            if (actionBarOverlayLayout != null) {
                C3379v.m13773I(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.m$b */
    class C0105b extends C3338c0 {
        C0105b() {
        }

        /* renamed from: b */
        public void mo330b(View view) {
            C0103m mVar = C0103m.this;
            mVar.f385v = null;
            mVar.f367d.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.m$c */
    class C0106c implements C3340d0 {
        C0106c() {
        }

        /* renamed from: a */
        public void mo400a(View view) {
            ((View) C0103m.this.f367d.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.m$d */
    public class C0107d extends C3124b implements C0123a {

        /* renamed from: h */
        private final Context f393h;

        /* renamed from: i */
        private final C0122g f394i;

        /* renamed from: j */
        private C3125a f395j;

        /* renamed from: k */
        private WeakReference<View> f396k;

        public C0107d(Context context, C3125a aVar) {
            this.f393h = context;
            this.f395j = aVar;
            C0122g gVar = new C0122g(context);
            gVar.mo609c(1);
            this.f394i = gVar;
            gVar.mo585a((C0123a) this);
        }

        /* renamed from: a */
        public void mo401a() {
            C0103m mVar = C0103m.this;
            if (mVar.f373j == this) {
                if (!C0103m.m462a(mVar.f381r, mVar.f382s, false)) {
                    C0103m mVar2 = C0103m.this;
                    mVar2.f374k = this;
                    mVar2.f375l = this.f395j;
                } else {
                    this.f395j.mo334a(this);
                }
                this.f395j = null;
                C0103m.this.mo393f(false);
                C0103m.this.f369f.mo863a();
                C0103m.this.f368e.mo1781i().sendAccessibilityEvent(32);
                C0103m mVar3 = C0103m.this;
                mVar3.f366c.setHideOnContentScrollEnabled(mVar3.f387x);
                C0103m.this.f373j = null;
            }
        }

        /* renamed from: a */
        public void mo402a(int i) {
            mo404a((CharSequence) C0103m.this.f364a.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo403a(View view) {
            C0103m.this.f369f.setCustomView(view);
            this.f396k = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo297a(C0122g gVar) {
            if (this.f395j != null) {
                mo413i();
                C0103m.this.f369f.mo867d();
            }
        }

        /* renamed from: a */
        public void mo404a(CharSequence charSequence) {
            C0103m.this.f369f.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo405a(boolean z) {
            super.mo405a(z);
            C0103m.this.f369f.setTitleOptional(z);
        }

        /* renamed from: a */
        public boolean mo300a(C0122g gVar, MenuItem menuItem) {
            C3125a aVar = this.f395j;
            if (aVar != null) {
                return aVar.mo336a((C3124b) this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public View mo406b() {
            WeakReference<View> weakReference = this.f396k;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: b */
        public void mo407b(int i) {
            mo408b((CharSequence) C0103m.this.f364a.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo408b(CharSequence charSequence) {
            C0103m.this.f369f.setTitle(charSequence);
        }

        /* renamed from: c */
        public Menu mo409c() {
            return this.f394i;
        }

        /* renamed from: d */
        public MenuInflater mo410d() {
            return new C3131g(this.f393h);
        }

        /* renamed from: e */
        public CharSequence mo411e() {
            return C0103m.this.f369f.getSubtitle();
        }

        /* renamed from: g */
        public CharSequence mo412g() {
            return C0103m.this.f369f.getTitle();
        }

        /* renamed from: i */
        public void mo413i() {
            if (C0103m.this.f373j == this) {
                this.f394i.mo644s();
                try {
                    this.f395j.mo335a((C3124b) this, (Menu) this.f394i);
                } finally {
                    this.f394i.mo641r();
                }
            }
        }

        /* renamed from: j */
        public boolean mo414j() {
            return C0103m.this.f369f.mo865b();
        }

        /* renamed from: k */
        public boolean mo415k() {
            this.f394i.mo644s();
            try {
                return this.f395j.mo337b(this, this.f394i);
            } finally {
                this.f394i.mo641r();
            }
        }
    }

    public C0103m(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        m463b(decorView);
        if (!z) {
            this.f370g = decorView.findViewById(16908290);
        }
    }

    public C0103m(Dialog dialog) {
        new ArrayList();
        m463b(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private C0292z m461a(View view) {
        if (view instanceof C0292z) {
            return (C0292z) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    static boolean m462a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private void m463b(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C3098f.decor_content_parent);
        this.f366c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f368e = m461a(view.findViewById(C3098f.action_bar));
        this.f369f = (ActionBarContextView) view.findViewById(C3098f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C3098f.action_bar_container);
        this.f367d = actionBarContainer;
        C0292z zVar = this.f368e;
        if (zVar == null || this.f369f == null || actionBarContainer == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0103m.class.getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.f364a = zVar.mo1764b();
        boolean z = (this.f368e.mo1783k() & 4) != 0;
        if (z) {
            this.f372i = true;
        }
        C3123a a = C3123a.m12641a(this.f364a);
        mo397j(a.mo10039a() || z);
        m464k(a.mo10044f());
        TypedArray obtainStyledAttributes = this.f364a.obtainStyledAttributes(null, C3102j.ActionBar, C3093a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C3102j.ActionBar_hideOnContentScroll, false)) {
            mo396i(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C3102j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo386a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    private void m464k(boolean z) {
        this.f378o = z;
        if (!z) {
            this.f368e.mo1760a((C0242l0) null);
            this.f367d.setTabContainer(this.f371h);
        } else {
            this.f367d.setTabContainer(null);
            this.f368e.mo1760a(this.f371h);
        }
        boolean z2 = true;
        boolean z3 = mo399m() == 2;
        C0242l0 l0Var = this.f371h;
        if (l0Var != null) {
            if (z3) {
                l0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f366c;
                if (actionBarOverlayLayout != null) {
                    C3379v.m13773I(actionBarOverlayLayout);
                }
            } else {
                l0Var.setVisibility(8);
            }
        }
        this.f368e.mo1768b(!this.f378o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f366c;
        if (this.f378o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: l */
    private void m465l(boolean z) {
        if (m462a(this.f381r, this.f382s, this.f383t)) {
            if (!this.f384u) {
                this.f384u = true;
                mo395h(z);
            }
        } else if (this.f384u) {
            this.f384u = false;
            mo394g(z);
        }
    }

    /* renamed from: n */
    private void m466n() {
        if (this.f383t) {
            this.f383t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f366c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m465l(false);
        }
    }

    /* renamed from: o */
    private boolean m467o() {
        return C3379v.m13768D(this.f367d);
    }

    /* renamed from: p */
    private void m468p() {
        if (!this.f383t) {
            this.f383t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f366c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m465l(false);
        }
    }

    /* renamed from: a */
    public C3124b mo184a(C3125a aVar) {
        C0107d dVar = this.f373j;
        if (dVar != null) {
            dVar.mo401a();
        }
        this.f366c.setHideOnContentScrollEnabled(false);
        this.f369f.mo866c();
        C0107d dVar2 = new C0107d(this.f369f.getContext(), aVar);
        if (!dVar2.mo415k()) {
            return null;
        }
        this.f373j = dVar2;
        dVar2.mo413i();
        this.f369f.mo864a(dVar2);
        mo393f(true);
        this.f369f.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: a */
    public void mo385a() {
        if (this.f382s) {
            this.f382s = false;
            m465l(true);
        }
    }

    /* renamed from: a */
    public void mo386a(float f) {
        C3379v.m13780a((View) this.f367d, f);
    }

    /* renamed from: a */
    public void mo387a(int i) {
        this.f379p = i;
    }

    /* renamed from: a */
    public void mo388a(int i, int i2) {
        int k = this.f368e.mo1783k();
        if ((i2 & 4) != 0) {
            this.f372i = true;
        }
        this.f368e.mo1765b((i & i2) | ((~i2) & k));
    }

    /* renamed from: a */
    public void mo185a(Configuration configuration) {
        m464k(C3123a.m12641a(this.f364a).mo10044f());
    }

    /* renamed from: a */
    public void mo186a(Drawable drawable) {
        this.f368e.mo1756a(drawable);
    }

    /* renamed from: a */
    public void mo187a(CharSequence charSequence) {
        this.f368e.setWindowTitle(charSequence);
    }

    /* renamed from: a */
    public void mo389a(boolean z) {
        this.f380q = z;
    }

    /* renamed from: a */
    public boolean mo188a(int i, KeyEvent keyEvent) {
        C0107d dVar = this.f373j;
        if (dVar == null) {
            return false;
        }
        Menu c = dVar.mo409c();
        if (c == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        c.setQwertyMode(z);
        return c.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: b */
    public void mo390b() {
        C3134h hVar = this.f385v;
        if (hVar != null) {
            hVar.mo10089a();
            this.f385v = null;
        }
    }

    /* renamed from: b */
    public void mo190b(boolean z) {
        if (z != this.f376m) {
            this.f376m = z;
            int size = this.f377n.size();
            for (int i = 0; i < size; i++) {
                ((C0063b) this.f377n.get(i)).mo201a(z);
            }
        }
    }

    /* renamed from: c */
    public void mo391c() {
    }

    /* renamed from: c */
    public void mo191c(boolean z) {
        if (!this.f372i) {
            mo192d(z);
        }
    }

    /* renamed from: d */
    public void mo392d() {
        if (!this.f382s) {
            this.f382s = true;
            m465l(true);
        }
    }

    /* renamed from: d */
    public void mo192d(boolean z) {
        mo388a(z ? 4 : 0, 4);
    }

    /* renamed from: e */
    public void mo193e(boolean z) {
        this.f386w = z;
        if (!z) {
            C3134h hVar = this.f385v;
            if (hVar != null) {
                hVar.mo10089a();
            }
        }
    }

    /* renamed from: f */
    public void mo393f(boolean z) {
        C3325a0 a0Var;
        C3325a0 a0Var2;
        if (z) {
            m468p();
        } else {
            m466n();
        }
        if (m467o()) {
            if (z) {
                a0Var = this.f368e.mo1754a(4, 100);
                a0Var2 = this.f369f.mo1255a(0, 200);
            } else {
                a0Var2 = this.f368e.mo1754a(0, 200);
                a0Var = this.f369f.mo1255a(8, 100);
            }
            C3134h hVar = new C3134h();
            hVar.mo10087a(a0Var, a0Var2);
            hVar.mo10091c();
        } else if (z) {
            this.f368e.mo1755a(4);
            this.f369f.setVisibility(0);
        } else {
            this.f368e.mo1755a(0);
            this.f369f.setVisibility(8);
        }
    }

    /* renamed from: f */
    public boolean mo195f() {
        C0292z zVar = this.f368e;
        if (zVar == null || !zVar.mo1782j()) {
            return false;
        }
        this.f368e.collapseActionView();
        return true;
    }

    /* renamed from: g */
    public int mo196g() {
        return this.f368e.mo1783k();
    }

    /* renamed from: g */
    public void mo394g(boolean z) {
        C3134h hVar = this.f385v;
        if (hVar != null) {
            hVar.mo10089a();
        }
        if (this.f379p != 0 || (!this.f386w && !z)) {
            this.f388y.mo330b(null);
            return;
        }
        this.f367d.setAlpha(1.0f);
        this.f367d.setTransitioning(true);
        C3134h hVar2 = new C3134h();
        float f = (float) (-this.f367d.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f367d.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C3325a0 a = C3379v.m13776a(this.f367d);
        a.mo10715b(f);
        a.mo10712a(this.f363A);
        hVar2.mo10086a(a);
        if (this.f380q) {
            View view = this.f370g;
            if (view != null) {
                C3325a0 a2 = C3379v.m13776a(view);
                a2.mo10715b(f);
                hVar2.mo10086a(a2);
            }
        }
        hVar2.mo10085a(f361B);
        hVar2.mo10084a(250);
        hVar2.mo10088a(this.f388y);
        this.f385v = hVar2;
        hVar2.mo10091c();
    }

    /* renamed from: h */
    public Context mo197h() {
        if (this.f365b == null) {
            TypedValue typedValue = new TypedValue();
            this.f364a.getTheme().resolveAttribute(C3093a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f365b = new ContextThemeWrapper(this.f364a, i);
            } else {
                this.f365b = this.f364a;
            }
        }
        return this.f365b;
    }

    /* renamed from: h */
    public void mo395h(boolean z) {
        C3134h hVar = this.f385v;
        if (hVar != null) {
            hVar.mo10089a();
        }
        this.f367d.setVisibility(0);
        if (this.f379p != 0 || (!this.f386w && !z)) {
            this.f367d.setAlpha(1.0f);
            this.f367d.setTranslationY(0.0f);
            if (this.f380q) {
                View view = this.f370g;
                if (view != null) {
                    view.setTranslationY(0.0f);
                }
            }
            this.f389z.mo330b(null);
        } else {
            this.f367d.setTranslationY(0.0f);
            float f = (float) (-this.f367d.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f367d.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f367d.setTranslationY(f);
            C3134h hVar2 = new C3134h();
            C3325a0 a = C3379v.m13776a(this.f367d);
            a.mo10715b(0.0f);
            a.mo10712a(this.f363A);
            hVar2.mo10086a(a);
            if (this.f380q) {
                View view2 = this.f370g;
                if (view2 != null) {
                    view2.setTranslationY(f);
                    C3325a0 a2 = C3379v.m13776a(this.f370g);
                    a2.mo10715b(0.0f);
                    hVar2.mo10086a(a2);
                }
            }
            hVar2.mo10085a(f362C);
            hVar2.mo10084a(250);
            hVar2.mo10088a(this.f389z);
            this.f385v = hVar2;
            hVar2.mo10091c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f366c;
        if (actionBarOverlayLayout != null) {
            C3379v.m13773I(actionBarOverlayLayout);
        }
    }

    /* renamed from: i */
    public void mo396i(boolean z) {
        if (!z || this.f366c.mo911i()) {
            this.f387x = z;
            this.f366c.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: j */
    public void mo397j(boolean z) {
        this.f368e.mo1762a(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo398l() {
        C3125a aVar = this.f375l;
        if (aVar != null) {
            aVar.mo334a(this.f374k);
            this.f374k = null;
            this.f375l = null;
        }
    }

    /* renamed from: m */
    public int mo399m() {
        return this.f368e.mo1785m();
    }
}
