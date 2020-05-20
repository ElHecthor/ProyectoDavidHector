package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.C0110a;
import androidx.appcompat.view.menu.C0122g;
import androidx.appcompat.view.menu.C0122g.C0123a;
import androidx.appcompat.view.menu.C0137m.C0138a;
import androidx.appcompat.widget.Toolbar.C0182e;
import p071f.p072a.C3093a;
import p071f.p072a.C3097e;
import p071f.p072a.C3098f;
import p071f.p072a.C3100h;
import p071f.p072a.C3102j;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p108m.C3325a0;
import p071f.p097h.p108m.C3332b0;
import p071f.p097h.p108m.C3338c0;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.appcompat.widget.u0 */
public class C0277u0 implements C0292z {

    /* renamed from: a */
    Toolbar f1195a;

    /* renamed from: b */
    private int f1196b;

    /* renamed from: c */
    private View f1197c;

    /* renamed from: d */
    private View f1198d;

    /* renamed from: e */
    private Drawable f1199e;

    /* renamed from: f */
    private Drawable f1200f;

    /* renamed from: g */
    private Drawable f1201g;

    /* renamed from: h */
    private boolean f1202h;

    /* renamed from: i */
    CharSequence f1203i;

    /* renamed from: j */
    private CharSequence f1204j;

    /* renamed from: k */
    private CharSequence f1205k;

    /* renamed from: l */
    Callback f1206l;

    /* renamed from: m */
    boolean f1207m;

    /* renamed from: n */
    private C0195c f1208n;

    /* renamed from: o */
    private int f1209o;

    /* renamed from: p */
    private int f1210p;

    /* renamed from: q */
    private Drawable f1211q;

    /* renamed from: androidx.appcompat.widget.u0$a */
    class C0278a implements OnClickListener {

        /* renamed from: f */
        final C0110a f1212f;

        C0278a() {
            C0110a aVar = new C0110a(C0277u0.this.f1195a.getContext(), 0, 16908332, 0, 0, C0277u0.this.f1203i);
            this.f1212f = aVar;
        }

        public void onClick(View view) {
            C0277u0 u0Var = C0277u0.this;
            Callback callback = u0Var.f1206l;
            if (callback != null && u0Var.f1207m) {
                callback.onMenuItemSelected(0, this.f1212f);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.u0$b */
    class C0279b extends C3338c0 {

        /* renamed from: a */
        private boolean f1214a = false;

        /* renamed from: b */
        final /* synthetic */ int f1215b;

        C0279b(int i) {
            this.f1215b = i;
        }

        /* renamed from: a */
        public void mo1260a(View view) {
            this.f1214a = true;
        }

        /* renamed from: b */
        public void mo330b(View view) {
            if (!this.f1214a) {
                C0277u0.this.f1195a.setVisibility(this.f1215b);
            }
        }

        /* renamed from: c */
        public void mo331c(View view) {
            C0277u0.this.f1195a.setVisibility(0);
        }
    }

    public C0277u0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C3100h.abc_action_bar_up_description, C3097e.abc_ic_ab_back_material);
    }

    public C0277u0(Toolbar toolbar, boolean z, int i, int i2) {
        this.f1209o = 0;
        this.f1210p = 0;
        this.f1195a = toolbar;
        this.f1203i = toolbar.getTitle();
        this.f1204j = toolbar.getSubtitle();
        this.f1202h = this.f1203i != null;
        this.f1201g = toolbar.getNavigationIcon();
        C0275t0 a = C0275t0.m1311a(toolbar.getContext(), null, C3102j.ActionBar, C3093a.actionBarStyle, 0);
        this.f1211q = a.mo1741b(C3102j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e = a.mo1747e(C3102j.ActionBar_title);
            if (!TextUtils.isEmpty(e)) {
                mo1771c(e);
            }
            CharSequence e2 = a.mo1747e(C3102j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e2)) {
                mo1767b(e2);
            }
            Drawable b = a.mo1741b(C3102j.ActionBar_logo);
            if (b != null) {
                mo1766b(b);
            }
            Drawable b2 = a.mo1741b(C3102j.ActionBar_icon);
            if (b2 != null) {
                setIcon(b2);
            }
            if (this.f1201g == null) {
                Drawable drawable = this.f1211q;
                if (drawable != null) {
                    mo1756a(drawable);
                }
            }
            mo1765b(a.mo1744d(C3102j.ActionBar_displayOptions, 0));
            int g = a.mo1750g(C3102j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                mo1758a(LayoutInflater.from(this.f1195a.getContext()).inflate(g, this.f1195a, false));
                mo1765b(this.f1196b | 16);
            }
            int f = a.mo1748f(C3102j.ActionBar_height, 0);
            if (f > 0) {
                LayoutParams layoutParams = this.f1195a.getLayoutParams();
                layoutParams.height = f;
                this.f1195a.setLayoutParams(layoutParams);
            }
            int b3 = a.mo1740b(C3102j.ActionBar_contentInsetStart, -1);
            int b4 = a.mo1740b(C3102j.ActionBar_contentInsetEnd, -1);
            if (b3 >= 0 || b4 >= 0) {
                this.f1195a.mo1146a(Math.max(b3, 0), Math.max(b4, 0));
            }
            int g2 = a.mo1750g(C3102j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.f1195a;
                toolbar2.mo1150b(toolbar2.getContext(), g2);
            }
            int g3 = a.mo1750g(C3102j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.f1195a;
                toolbar3.mo1147a(toolbar3.getContext(), g3);
            }
            int g4 = a.mo1750g(C3102j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f1195a.setPopupTheme(g4);
            }
        } else {
            this.f1196b = m1334p();
        }
        a.mo1737a();
        mo1773d(i);
        this.f1205k = this.f1195a.getNavigationContentDescription();
        this.f1195a.setNavigationOnClickListener(new C0278a());
    }

    /* renamed from: d */
    private void m1333d(CharSequence charSequence) {
        this.f1203i = charSequence;
        if ((this.f1196b & 8) != 0) {
            this.f1195a.setTitle(charSequence);
        }
    }

    /* renamed from: p */
    private int m1334p() {
        if (this.f1195a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1211q = this.f1195a.getNavigationIcon();
        return 15;
    }

    /* renamed from: q */
    private void m1335q() {
        if ((this.f1196b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1205k)) {
            this.f1195a.setNavigationContentDescription(this.f1210p);
        } else {
            this.f1195a.setNavigationContentDescription(this.f1205k);
        }
    }

    /* renamed from: r */
    private void m1336r() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f1196b & 4) != 0) {
            toolbar = this.f1195a;
            drawable = this.f1201g;
            if (drawable == null) {
                drawable = this.f1211q;
            }
        } else {
            toolbar = this.f1195a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != null) goto L_0x0013;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1337s() {
        /*
            r2 = this;
            int r0 = r2.f1196b
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r0 = r0 & 1
            if (r0 == 0) goto L_0x000f
            android.graphics.drawable.Drawable r0 = r2.f1200f
            if (r0 == 0) goto L_0x000f
            goto L_0x0013
        L_0x000f:
            android.graphics.drawable.Drawable r0 = r2.f1199e
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            androidx.appcompat.widget.Toolbar r1 = r2.f1195a
            r1.setLogo(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0277u0.m1337s():void");
    }

    /* renamed from: a */
    public C3325a0 mo1754a(int i, long j) {
        C3325a0 a = C3379v.m13776a(this.f1195a);
        a.mo10708a(i == 0 ? 1.0f : 0.0f);
        a.mo10709a(j);
        a.mo10711a((C3332b0) new C0279b(i));
        return a;
    }

    /* renamed from: a */
    public void mo1755a(int i) {
        this.f1195a.setVisibility(i);
    }

    /* renamed from: a */
    public void mo1756a(Drawable drawable) {
        this.f1201g = drawable;
        m1336r();
    }

    /* renamed from: a */
    public void mo1757a(Menu menu, C0138a aVar) {
        if (this.f1208n == null) {
            C0195c cVar = new C0195c(this.f1195a.getContext());
            this.f1208n = cVar;
            cVar.mo512a(C3098f.action_menu_presenter);
        }
        this.f1208n.mo517a(aVar);
        this.f1195a.mo1148a((C0122g) menu, this.f1208n);
    }

    /* renamed from: a */
    public void mo1758a(View view) {
        View view2 = this.f1198d;
        if (!(view2 == null || (this.f1196b & 16) == 0)) {
            this.f1195a.removeView(view2);
        }
        this.f1198d = view;
        if (view != null && (this.f1196b & 16) != 0) {
            this.f1195a.addView(view);
        }
    }

    /* renamed from: a */
    public void mo1759a(C0138a aVar, C0123a aVar2) {
        this.f1195a.mo1149a(aVar, aVar2);
    }

    /* renamed from: a */
    public void mo1760a(C0242l0 l0Var) {
        View view = this.f1197c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1195a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1197c);
            }
        }
        this.f1197c = l0Var;
        if (l0Var != null && this.f1209o == 2) {
            this.f1195a.addView(l0Var, 0);
            C0182e eVar = (C0182e) this.f1197c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f218a = 8388691;
            l0Var.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo1761a(CharSequence charSequence) {
        this.f1205k = charSequence;
        m1335q();
    }

    /* renamed from: a */
    public void mo1762a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo1763a() {
        return this.f1195a.mo1192i();
    }

    /* renamed from: b */
    public Context mo1764b() {
        return this.f1195a.getContext();
    }

    /* renamed from: b */
    public void mo1765b(int i) {
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1196b ^ i;
        this.f1196b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1335q();
                }
                m1336r();
            }
            if ((i2 & 3) != 0) {
                m1337s();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1195a.setTitle(this.f1203i);
                    toolbar = this.f1195a;
                    charSequence = this.f1204j;
                } else {
                    charSequence = null;
                    this.f1195a.setTitle((CharSequence) null);
                    toolbar = this.f1195a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0) {
                View view = this.f1198d;
                if (view == null) {
                    return;
                }
                if ((i & 16) != 0) {
                    this.f1195a.addView(view);
                } else {
                    this.f1195a.removeView(view);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo1766b(Drawable drawable) {
        this.f1200f = drawable;
        m1337s();
    }

    /* renamed from: b */
    public void mo1767b(CharSequence charSequence) {
        this.f1204j = charSequence;
        if ((this.f1196b & 8) != 0) {
            this.f1195a.setSubtitle(charSequence);
        }
    }

    /* renamed from: b */
    public void mo1768b(boolean z) {
        this.f1195a.setCollapsible(z);
    }

    /* renamed from: c */
    public void mo1769c() {
        this.f1207m = true;
    }

    /* renamed from: c */
    public void mo1770c(int i) {
        mo1766b(i != 0 ? C3103a.m12557c(mo1764b(), i) : null);
    }

    /* renamed from: c */
    public void mo1771c(CharSequence charSequence) {
        this.f1202h = true;
        m1333d(charSequence);
    }

    public void collapseActionView() {
        this.f1195a.mo1152c();
    }

    /* renamed from: d */
    public void mo1773d(int i) {
        if (i != this.f1210p) {
            this.f1210p = i;
            if (TextUtils.isEmpty(this.f1195a.getNavigationContentDescription())) {
                mo1775e(this.f1210p);
            }
        }
    }

    /* renamed from: d */
    public boolean mo1774d() {
        return this.f1195a.mo1191h();
    }

    /* renamed from: e */
    public void mo1775e(int i) {
        mo1761a((CharSequence) i == 0 ? null : mo1764b().getString(i));
    }

    /* renamed from: e */
    public boolean mo1776e() {
        return this.f1195a.mo1157g();
    }

    /* renamed from: f */
    public boolean mo1777f() {
        return this.f1195a.mo1194k();
    }

    /* renamed from: g */
    public boolean mo1778g() {
        return this.f1195a.mo1151b();
    }

    public CharSequence getTitle() {
        return this.f1195a.getTitle();
    }

    /* renamed from: h */
    public void mo1780h() {
        this.f1195a.mo1154d();
    }

    /* renamed from: i */
    public ViewGroup mo1781i() {
        return this.f1195a;
    }

    /* renamed from: j */
    public boolean mo1782j() {
        return this.f1195a.mo1156f();
    }

    /* renamed from: k */
    public int mo1783k() {
        return this.f1196b;
    }

    /* renamed from: l */
    public Menu mo1784l() {
        return this.f1195a.getMenu();
    }

    /* renamed from: m */
    public int mo1785m() {
        return this.f1209o;
    }

    /* renamed from: n */
    public void mo1786n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: o */
    public void mo1787o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C3103a.m12557c(mo1764b(), i) : null);
    }

    public void setIcon(Drawable drawable) {
        this.f1199e = drawable;
        m1337s();
    }

    public void setWindowCallback(Callback callback) {
        this.f1206l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1202h) {
            m1333d(charSequence);
        }
    }
}
