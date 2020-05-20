package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0137m.C0138a;
import androidx.appcompat.widget.C0226h0;
import p071f.p072a.C3096d;
import p071f.p072a.C3099g;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.appcompat.view.menu.q */
final class C0143q extends C0134k implements OnDismissListener, OnItemClickListener, C0137m, OnKeyListener {

    /* renamed from: A */
    private static final int f604A = C3099g.abc_popup_menu_item_layout;

    /* renamed from: g */
    private final Context f605g;

    /* renamed from: h */
    private final C0122g f606h;

    /* renamed from: i */
    private final C0121f f607i;

    /* renamed from: j */
    private final boolean f608j;

    /* renamed from: k */
    private final int f609k;

    /* renamed from: l */
    private final int f610l;

    /* renamed from: m */
    private final int f611m;

    /* renamed from: n */
    final C0226h0 f612n;

    /* renamed from: o */
    final OnGlobalLayoutListener f613o = new C0144a();

    /* renamed from: p */
    private final OnAttachStateChangeListener f614p = new C0145b();

    /* renamed from: q */
    private OnDismissListener f615q;

    /* renamed from: r */
    private View f616r;

    /* renamed from: s */
    View f617s;

    /* renamed from: t */
    private C0138a f618t;

    /* renamed from: u */
    ViewTreeObserver f619u;

    /* renamed from: v */
    private boolean f620v;

    /* renamed from: w */
    private boolean f621w;

    /* renamed from: x */
    private int f622x;

    /* renamed from: y */
    private int f623y = 0;

    /* renamed from: z */
    private boolean f624z;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    class C0144a implements OnGlobalLayoutListener {
        C0144a() {
        }

        public void onGlobalLayout() {
            if (C0143q.this.mo536a() && !C0143q.this.f612n.mo1418p()) {
                View view = C0143q.this.f617s;
                if (view == null || !view.isShown()) {
                    C0143q.this.dismiss();
                } else {
                    C0143q.this.f612n.mo540c();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    class C0145b implements OnAttachStateChangeListener {
        C0145b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0143q.this.f619u;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0143q.this.f619u = view.getViewTreeObserver();
                }
                C0143q qVar = C0143q.this;
                qVar.f619u.removeGlobalOnLayoutListener(qVar.f613o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0143q(Context context, C0122g gVar, View view, int i, int i2, boolean z) {
        this.f605g = context;
        this.f606h = gVar;
        this.f608j = z;
        this.f607i = new C0121f(gVar, LayoutInflater.from(context), this.f608j, f604A);
        this.f610l = i;
        this.f611m = i2;
        Resources resources = context.getResources();
        this.f609k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C3096d.abc_config_prefDialogWidth));
        this.f616r = view;
        this.f612n = new C0226h0(this.f605g, null, this.f610l, this.f611m);
        gVar.mo587a((C0137m) this, context);
    }

    /* renamed from: i */
    private boolean m764i() {
        if (mo536a()) {
            return true;
        }
        if (!this.f620v) {
            View view = this.f616r;
            if (view != null) {
                this.f617s = view;
                this.f612n.mo1396a((OnDismissListener) this);
                this.f612n.mo1394a((OnItemClickListener) this);
                this.f612n.mo1397a(true);
                View view2 = this.f617s;
                boolean z = this.f619u == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f619u = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f613o);
                }
                view2.addOnAttachStateChangeListener(this.f614p);
                this.f612n.mo1393a(view2);
                this.f612n.mo1405f(this.f623y);
                if (!this.f621w) {
                    this.f622x = C0134k.m713a(this.f607i, null, this.f605g, this.f609k);
                    this.f621w = true;
                }
                this.f612n.mo1403e(this.f622x);
                this.f612n.mo1406g(2);
                this.f612n.mo1391a(mo783h());
                this.f612n.mo540c();
                ListView e = this.f612n.mo544e();
                e.setOnKeyListener(this);
                if (this.f624z && this.f606h.mo627h() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f605g).inflate(C3099g.abc_popup_menu_header_item_layout, e, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f606h.mo627h());
                    }
                    frameLayout.setEnabled(false);
                    e.addHeaderView(frameLayout, null, false);
                }
                this.f612n.mo1395a((ListAdapter) this.f607i);
                this.f612n.mo540c();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo531a(int i) {
        this.f623y = i;
    }

    /* renamed from: a */
    public void mo532a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo533a(View view) {
        this.f616r = view;
    }

    /* renamed from: a */
    public void mo534a(OnDismissListener onDismissListener) {
        this.f615q = onDismissListener;
    }

    /* renamed from: a */
    public void mo535a(C0122g gVar) {
    }

    /* renamed from: a */
    public void mo515a(C0122g gVar, boolean z) {
        if (gVar == this.f606h) {
            dismiss();
            C0138a aVar = this.f618t;
            if (aVar != null) {
                aVar.mo332a(gVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo517a(C0138a aVar) {
        this.f618t = aVar;
    }

    /* renamed from: a */
    public void mo518a(boolean z) {
        this.f621w = false;
        C0121f fVar = this.f607i;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo536a() {
        return !this.f620v && this.f612n.mo536a();
    }

    /* renamed from: a */
    public boolean mo522a(C0146r rVar) {
        if (rVar.hasVisibleItems()) {
            C0135l lVar = new C0135l(this.f605g, rVar, this.f617s, this.f608j, this.f610l, this.f611m);
            lVar.mo789a(this.f618t);
            lVar.mo790a(C0134k.m715b((C0122g) rVar));
            lVar.mo788a(this.f615q);
            this.f615q = null;
            this.f606h.mo589a(false);
            int b = this.f612n.mo1398b();
            int f = this.f612n.mo1404f();
            if ((Gravity.getAbsoluteGravity(this.f623y, C3379v.m13829p(this.f616r)) & 7) == 5) {
                b += this.f616r.getWidth();
            }
            if (lVar.mo791a(b, f)) {
                C0138a aVar = this.f618t;
                if (aVar != null) {
                    aVar.mo333a(rVar);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo537b(int i) {
        this.f612n.mo1400c(i);
    }

    /* renamed from: b */
    public void mo538b(boolean z) {
        this.f607i.mo568a(z);
    }

    /* renamed from: c */
    public void mo540c() {
        if (!m764i()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: c */
    public void mo541c(int i) {
        this.f612n.mo1390a(i);
    }

    /* renamed from: c */
    public void mo542c(boolean z) {
        this.f624z = z;
    }

    public void dismiss() {
        if (mo536a()) {
            this.f612n.dismiss();
        }
    }

    /* renamed from: e */
    public ListView mo544e() {
        return this.f612n.mo544e();
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
        this.f620v = true;
        this.f606h.close();
        ViewTreeObserver viewTreeObserver = this.f619u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f619u = this.f617s.getViewTreeObserver();
            }
            this.f619u.removeGlobalOnLayoutListener(this.f613o);
            this.f619u = null;
        }
        this.f617s.removeOnAttachStateChangeListener(this.f614p);
        OnDismissListener onDismissListener = this.f615q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
