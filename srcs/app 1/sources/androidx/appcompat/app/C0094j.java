package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import androidx.appcompat.app.C0061a.C0063b;
import androidx.appcompat.view.menu.C0122g;
import androidx.appcompat.view.menu.C0122g.C0123a;
import androidx.appcompat.view.menu.C0137m.C0138a;
import androidx.appcompat.widget.C0277u0;
import androidx.appcompat.widget.C0292z;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C0183f;
import java.util.ArrayList;
import p071f.p072a.p079o.C3136i;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.appcompat.app.j */
class C0094j extends C0061a {

    /* renamed from: a */
    C0292z f333a;

    /* renamed from: b */
    boolean f334b;

    /* renamed from: c */
    Callback f335c;

    /* renamed from: d */
    private boolean f336d;

    /* renamed from: e */
    private boolean f337e;

    /* renamed from: f */
    private ArrayList<C0063b> f338f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f339g = new C0095a();

    /* renamed from: h */
    private final C0183f f340h = new C0096b();

    /* renamed from: androidx.appcompat.app.j$a */
    class C0095a implements Runnable {
        C0095a() {
        }

        public void run() {
            C0094j.this.mo379m();
        }
    }

    /* renamed from: androidx.appcompat.app.j$b */
    class C0096b implements C0183f {
        C0096b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0094j.this.f335c.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.j$c */
    private final class C0097c implements C0138a {

        /* renamed from: f */
        private boolean f343f;

        C0097c() {
        }

        /* renamed from: a */
        public void mo332a(C0122g gVar, boolean z) {
            if (!this.f343f) {
                this.f343f = true;
                C0094j.this.f333a.mo1780h();
                Callback callback = C0094j.this.f335c;
                if (callback != null) {
                    callback.onPanelClosed(108, gVar);
                }
                this.f343f = false;
            }
        }

        /* renamed from: a */
        public boolean mo333a(C0122g gVar) {
            Callback callback = C0094j.this.f335c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.j$d */
    private final class C0098d implements C0123a {
        C0098d() {
        }

        /* renamed from: a */
        public void mo297a(C0122g gVar) {
            C0094j jVar = C0094j.this;
            if (jVar.f335c == null) {
                return;
            }
            if (jVar.f333a.mo1763a()) {
                C0094j.this.f335c.onPanelClosed(108, gVar);
            } else if (C0094j.this.f335c.onPreparePanel(0, null, gVar)) {
                C0094j.this.f335c.onMenuOpened(108, gVar);
            }
        }

        /* renamed from: a */
        public boolean mo300a(C0122g gVar, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.app.j$e */
    private class C0099e extends C3136i {
        public C0099e(Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            return i == 0 ? new View(C0094j.this.f333a.mo1764b()) : super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0094j jVar = C0094j.this;
                if (!jVar.f334b) {
                    jVar.f333a.mo1769c();
                    C0094j.this.f334b = true;
                }
            }
            return onPreparePanel;
        }
    }

    C0094j(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.f333a = new C0277u0(toolbar, false);
        C0099e eVar = new C0099e(callback);
        this.f335c = eVar;
        this.f333a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(this.f340h);
        this.f333a.setWindowTitle(charSequence);
    }

    /* renamed from: n */
    private Menu m429n() {
        if (!this.f336d) {
            this.f333a.mo1759a((C0138a) new C0097c(), (C0123a) new C0098d());
            this.f336d = true;
        }
        return this.f333a.mo1784l();
    }

    /* renamed from: a */
    public void mo377a(int i, int i2) {
        this.f333a.mo1765b((i & i2) | ((~i2) & this.f333a.mo1783k()));
    }

    /* renamed from: a */
    public void mo185a(Configuration configuration) {
        super.mo185a(configuration);
    }

    /* renamed from: a */
    public void mo186a(Drawable drawable) {
        this.f333a.mo1756a(drawable);
    }

    /* renamed from: a */
    public void mo187a(CharSequence charSequence) {
        this.f333a.setWindowTitle(charSequence);
    }

    /* renamed from: a */
    public boolean mo188a(int i, KeyEvent keyEvent) {
        Menu n = m429n();
        if (n == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        n.setQwertyMode(z);
        return n.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public boolean mo189a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo200k();
        }
        return true;
    }

    /* renamed from: b */
    public void mo190b(boolean z) {
        if (z != this.f337e) {
            this.f337e = z;
            int size = this.f338f.size();
            for (int i = 0; i < size; i++) {
                ((C0063b) this.f338f.get(i)).mo201a(z);
            }
        }
    }

    /* renamed from: c */
    public void mo191c(boolean z) {
    }

    /* renamed from: d */
    public void mo192d(boolean z) {
        mo377a(z ? 4 : 0, 4);
    }

    /* renamed from: e */
    public void mo193e(boolean z) {
    }

    /* renamed from: e */
    public boolean mo194e() {
        return this.f333a.mo1776e();
    }

    /* renamed from: f */
    public boolean mo195f() {
        if (!this.f333a.mo1782j()) {
            return false;
        }
        this.f333a.collapseActionView();
        return true;
    }

    /* renamed from: g */
    public int mo196g() {
        return this.f333a.mo1783k();
    }

    /* renamed from: h */
    public Context mo197h() {
        return this.f333a.mo1764b();
    }

    /* renamed from: i */
    public boolean mo198i() {
        this.f333a.mo1781i().removeCallbacks(this.f339g);
        C3379v.m13794a((View) this.f333a.mo1781i(), this.f339g);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo199j() {
        this.f333a.mo1781i().removeCallbacks(this.f339g);
    }

    /* renamed from: k */
    public boolean mo200k() {
        return this.f333a.mo1777f();
    }

    /* renamed from: l */
    public Callback mo378l() {
        return this.f335c;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo379m() {
        Menu n = m429n();
        C0122g gVar = n instanceof C0122g ? (C0122g) n : null;
        if (gVar != null) {
            gVar.mo644s();
        }
        try {
            n.clear();
            if (!this.f335c.onCreatePanelMenu(0, n) || !this.f335c.onPreparePanel(0, null, n)) {
                n.clear();
            }
            if (gVar != null) {
                gVar.mo641r();
            }
        } catch (Throwable th) {
            if (gVar != null) {
                gVar.mo641r();
            }
            throw th;
        }
    }
}
