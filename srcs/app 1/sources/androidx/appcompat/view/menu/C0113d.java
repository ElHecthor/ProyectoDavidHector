package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0137m.C0138a;
import androidx.appcompat.widget.C0224g0;
import androidx.appcompat.widget.C0226h0;
import java.util.ArrayList;
import java.util.List;
import p071f.p072a.C3096d;
import p071f.p072a.C3099g;
import p071f.p097h.p108m.C3339d;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.appcompat.view.menu.d */
final class C0113d extends C0134k implements C0137m, OnKeyListener, OnDismissListener {

    /* renamed from: G */
    private static final int f461G = C3099g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private boolean f462A;

    /* renamed from: B */
    private boolean f463B;

    /* renamed from: C */
    private C0138a f464C;

    /* renamed from: D */
    ViewTreeObserver f465D;

    /* renamed from: E */
    private OnDismissListener f466E;

    /* renamed from: F */
    boolean f467F;

    /* renamed from: g */
    private final Context f468g;

    /* renamed from: h */
    private final int f469h;

    /* renamed from: i */
    private final int f470i;

    /* renamed from: j */
    private final int f471j;

    /* renamed from: k */
    private final boolean f472k;

    /* renamed from: l */
    final Handler f473l;

    /* renamed from: m */
    private final List<C0122g> f474m = new ArrayList();

    /* renamed from: n */
    final List<C0118d> f475n = new ArrayList();

    /* renamed from: o */
    final OnGlobalLayoutListener f476o = new C0114a();

    /* renamed from: p */
    private final OnAttachStateChangeListener f477p = new C0115b();

    /* renamed from: q */
    private final C0224g0 f478q = new C0116c();

    /* renamed from: r */
    private int f479r = 0;

    /* renamed from: s */
    private int f480s = 0;

    /* renamed from: t */
    private View f481t;

    /* renamed from: u */
    View f482u;

    /* renamed from: v */
    private int f483v;

    /* renamed from: w */
    private boolean f484w;

    /* renamed from: x */
    private boolean f485x;

    /* renamed from: y */
    private int f486y;

    /* renamed from: z */
    private int f487z;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    class C0114a implements OnGlobalLayoutListener {
        C0114a() {
        }

        public void onGlobalLayout() {
            if (C0113d.this.mo536a() && C0113d.this.f475n.size() > 0 && !((C0118d) C0113d.this.f475n.get(0)).f495a.mo1418p()) {
                View view = C0113d.this.f482u;
                if (view == null || !view.isShown()) {
                    C0113d.this.dismiss();
                    return;
                }
                for (C0118d dVar : C0113d.this.f475n) {
                    dVar.f495a.mo540c();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    class C0115b implements OnAttachStateChangeListener {
        C0115b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0113d.this.f465D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0113d.this.f465D = view.getViewTreeObserver();
                }
                C0113d dVar = C0113d.this;
                dVar.f465D.removeGlobalOnLayoutListener(dVar.f476o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    class C0116c implements C0224g0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        class C0117a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C0118d f491f;

            /* renamed from: g */
            final /* synthetic */ MenuItem f492g;

            /* renamed from: h */
            final /* synthetic */ C0122g f493h;

            C0117a(C0118d dVar, MenuItem menuItem, C0122g gVar) {
                this.f491f = dVar;
                this.f492g = menuItem;
                this.f493h = gVar;
            }

            public void run() {
                C0118d dVar = this.f491f;
                if (dVar != null) {
                    C0113d.this.f467F = true;
                    dVar.f496b.mo589a(false);
                    C0113d.this.f467F = false;
                }
                if (this.f492g.isEnabled() && this.f492g.hasSubMenu()) {
                    this.f493h.mo590a(this.f492g, 4);
                }
            }
        }

        C0116c() {
        }

        /* renamed from: a */
        public void mo552a(C0122g gVar, MenuItem menuItem) {
            C0118d dVar = null;
            C0113d.this.f473l.removeCallbacksAndMessages(null);
            int size = C0113d.this.f475n.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == ((C0118d) C0113d.this.f475n.get(i)).f496b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0113d.this.f475n.size()) {
                    dVar = (C0118d) C0113d.this.f475n.get(i2);
                }
                C0113d.this.f473l.postAtTime(new C0117a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: b */
        public void mo553b(C0122g gVar, MenuItem menuItem) {
            C0113d.this.f473l.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    private static class C0118d {

        /* renamed from: a */
        public final C0226h0 f495a;

        /* renamed from: b */
        public final C0122g f496b;

        /* renamed from: c */
        public final int f497c;

        public C0118d(C0226h0 h0Var, C0122g gVar, int i) {
            this.f495a = h0Var;
            this.f496b = gVar;
            this.f497c = i;
        }

        /* renamed from: a */
        public ListView mo555a() {
            return this.f495a.mo544e();
        }
    }

    public C0113d(Context context, View view, int i, int i2, boolean z) {
        this.f468g = context;
        this.f481t = view;
        this.f470i = i;
        this.f471j = i2;
        this.f472k = z;
        this.f462A = false;
        this.f483v = m567j();
        Resources resources = context.getResources();
        this.f469h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C3096d.abc_config_prefDialogWidth));
        this.f473l = new Handler();
    }

    /* renamed from: a */
    private MenuItem m561a(C0122g gVar, C0122g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m562a(C0118d dVar, C0122g gVar) {
        int i;
        C0121f fVar;
        MenuItem a = m561a(dVar.f496b, gVar);
        if (a == null) {
            return null;
        }
        ListView a2 = dVar.mo555a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0121f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0121f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        int firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    /* renamed from: c */
    private int m563c(C0122g gVar) {
        int size = this.f475n.size();
        for (int i = 0; i < size; i++) {
            if (gVar == ((C0118d) this.f475n.get(i)).f496b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private int m564d(int i) {
        List<C0118d> list = this.f475n;
        ListView a = ((C0118d) list.get(list.size() - 1)).mo555a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f482u.getWindowVisibleDisplayFrame(rect);
        return this.f483v == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: d */
    private void m565d(C0122g gVar) {
        View view;
        C0118d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f468g);
        C0121f fVar = new C0121f(gVar, from, this.f472k, f461G);
        if (!mo536a() && this.f462A) {
            fVar.mo568a(true);
        } else if (mo536a()) {
            fVar.mo568a(C0134k.m715b(gVar));
        }
        int a = C0134k.m713a(fVar, null, this.f468g, this.f469h);
        C0226h0 i4 = m566i();
        i4.mo1395a((ListAdapter) fVar);
        i4.mo1403e(a);
        i4.mo1405f(this.f480s);
        if (this.f475n.size() > 0) {
            List<C0118d> list = this.f475n;
            dVar = (C0118d) list.get(list.size() - 1);
            view = m562a(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            i4.mo1447c(false);
            i4.mo1445a((Object) null);
            int d = m564d(a);
            boolean z = d == 1;
            this.f483v = d;
            if (VERSION.SDK_INT >= 26) {
                i4.mo1393a(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f481t.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f480s & 7) == 5) {
                    iArr[0] = iArr[0] + this.f481t.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f480s & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                i4.mo1400c(i3);
                i4.mo1399b(true);
                i4.mo1390a(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                i4.mo1400c(i3);
                i4.mo1399b(true);
                i4.mo1390a(i2);
            }
            i3 = i + a;
            i4.mo1400c(i3);
            i4.mo1399b(true);
            i4.mo1390a(i2);
        } else {
            if (this.f484w) {
                i4.mo1400c(this.f486y);
            }
            if (this.f485x) {
                i4.mo1390a(this.f487z);
            }
            i4.mo1391a(mo783h());
        }
        this.f475n.add(new C0118d(i4, gVar, this.f483v));
        i4.mo540c();
        ListView e = i4.mo544e();
        e.setOnKeyListener(this);
        if (dVar == null && this.f463B && gVar.mo627h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C3099g.abc_popup_menu_header_item_layout, e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(gVar.mo627h());
            e.addHeaderView(frameLayout, null, false);
            i4.mo540c();
        }
    }

    /* renamed from: i */
    private C0226h0 m566i() {
        C0226h0 h0Var = new C0226h0(this.f468g, null, this.f470i, this.f471j);
        h0Var.mo1444a(this.f478q);
        h0Var.mo1394a((OnItemClickListener) this);
        h0Var.mo1396a((OnDismissListener) this);
        h0Var.mo1393a(this.f481t);
        h0Var.mo1405f(this.f480s);
        h0Var.mo1397a(true);
        h0Var.mo1406g(2);
        return h0Var;
    }

    /* renamed from: j */
    private int m567j() {
        return C3379v.m13829p(this.f481t) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo531a(int i) {
        if (this.f479r != i) {
            this.f479r = i;
            this.f480s = C3339d.m13606a(i, C3379v.m13829p(this.f481t));
        }
    }

    /* renamed from: a */
    public void mo532a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo533a(View view) {
        if (this.f481t != view) {
            this.f481t = view;
            this.f480s = C3339d.m13606a(this.f479r, C3379v.m13829p(view));
        }
    }

    /* renamed from: a */
    public void mo534a(OnDismissListener onDismissListener) {
        this.f466E = onDismissListener;
    }

    /* renamed from: a */
    public void mo535a(C0122g gVar) {
        gVar.mo587a((C0137m) this, this.f468g);
        if (mo536a()) {
            m565d(gVar);
        } else {
            this.f474m.add(gVar);
        }
    }

    /* renamed from: a */
    public void mo515a(C0122g gVar, boolean z) {
        int c = m563c(gVar);
        if (c >= 0) {
            int i = c + 1;
            if (i < this.f475n.size()) {
                ((C0118d) this.f475n.get(i)).f496b.mo589a(false);
            }
            C0118d dVar = (C0118d) this.f475n.remove(c);
            dVar.f496b.mo606b((C0137m) this);
            if (this.f467F) {
                dVar.f495a.mo1446b(null);
                dVar.f495a.mo1402d(0);
            }
            dVar.f495a.dismiss();
            int size = this.f475n.size();
            this.f483v = size > 0 ? ((C0118d) this.f475n.get(size - 1)).f497c : m567j();
            if (size == 0) {
                dismiss();
                C0138a aVar = this.f464C;
                if (aVar != null) {
                    aVar.mo332a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f465D;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f465D.removeGlobalOnLayoutListener(this.f476o);
                    }
                    this.f465D = null;
                }
                this.f482u.removeOnAttachStateChangeListener(this.f477p);
                this.f466E.onDismiss();
            } else if (z) {
                ((C0118d) this.f475n.get(0)).f496b.mo589a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo517a(C0138a aVar) {
        this.f464C = aVar;
    }

    /* renamed from: a */
    public void mo518a(boolean z) {
        for (C0118d a : this.f475n) {
            C0134k.m714a(a.mo555a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo536a() {
        return this.f475n.size() > 0 && ((C0118d) this.f475n.get(0)).f495a.mo536a();
    }

    /* renamed from: a */
    public boolean mo522a(C0146r rVar) {
        for (C0118d dVar : this.f475n) {
            if (rVar == dVar.f496b) {
                dVar.mo555a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        mo535a((C0122g) rVar);
        C0138a aVar = this.f464C;
        if (aVar != null) {
            aVar.mo333a(rVar);
        }
        return true;
    }

    /* renamed from: b */
    public void mo537b(int i) {
        this.f484w = true;
        this.f486y = i;
    }

    /* renamed from: b */
    public void mo538b(boolean z) {
        this.f462A = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo539b() {
        return false;
    }

    /* renamed from: c */
    public void mo540c() {
        if (!mo536a()) {
            for (C0122g d : this.f474m) {
                m565d(d);
            }
            this.f474m.clear();
            View view = this.f481t;
            this.f482u = view;
            if (view != null) {
                boolean z = this.f465D == null;
                ViewTreeObserver viewTreeObserver = this.f482u.getViewTreeObserver();
                this.f465D = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f476o);
                }
                this.f482u.addOnAttachStateChangeListener(this.f477p);
            }
        }
    }

    /* renamed from: c */
    public void mo541c(int i) {
        this.f485x = true;
        this.f487z = i;
    }

    /* renamed from: c */
    public void mo542c(boolean z) {
        this.f463B = z;
    }

    public void dismiss() {
        int size = this.f475n.size();
        if (size > 0) {
            C0118d[] dVarArr = (C0118d[]) this.f475n.toArray(new C0118d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0118d dVar = dVarArr[i];
                if (dVar.f495a.mo536a()) {
                    dVar.f495a.dismiss();
                }
            }
        }
    }

    /* renamed from: e */
    public ListView mo544e() {
        if (this.f475n.isEmpty()) {
            return null;
        }
        List<C0118d> list = this.f475n;
        return ((C0118d) list.get(list.size() - 1)).mo555a();
    }

    /* renamed from: f */
    public boolean mo545f() {
        return false;
    }

    /* renamed from: g */
    public Parcelable mo546g() {
        return null;
    }

    public void onDismiss() {
        C0118d dVar;
        int size = this.f475n.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (C0118d) this.f475n.get(i);
            if (!dVar.f495a.mo536a()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f496b.mo589a(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
