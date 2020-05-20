package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.appcompat.widget.C0291y0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0343a;
import androidx.core.app.C0356g;
import androidx.core.app.C0369n;
import androidx.core.app.C0369n.C0370a;
import androidx.fragment.app.C0429d;
import p071f.p072a.p079o.C3124b;
import p071f.p072a.p079o.C3124b.C3125a;

/* renamed from: androidx.appcompat.app.c */
public class C0067c extends C0429d implements C0068d, C0370a {

    /* renamed from: u */
    private C0069e f222u;

    /* renamed from: v */
    private Resources f223v;

    /* renamed from: a */
    private boolean m247a(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C3124b mo226a(C3125a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo227a(Intent intent) {
        C0356g.m1803a((Activity) this, intent);
    }

    /* renamed from: a */
    public void mo228a(Toolbar toolbar) {
        mo258q().mo272a(toolbar);
    }

    /* renamed from: a */
    public void mo229a(C0369n nVar) {
        nVar.mo2228a((Activity) this);
    }

    /* renamed from: a */
    public void mo230a(C3124b bVar) {
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo258q().mo271a(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        mo258q().mo267a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo233b(int i) {
    }

    /* renamed from: b */
    public void mo234b(C0369n nVar) {
    }

    /* renamed from: b */
    public void mo235b(C3124b bVar) {
    }

    /* renamed from: b */
    public boolean mo236b(Intent intent) {
        return C0356g.m1806b((Activity) this, intent);
    }

    public void closeOptionsMenu() {
        C0061a r = mo259r();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (r == null || !r.mo194e()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0061a r = mo259r();
        if (keyCode != 82 || r == null || !r.mo189a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: f */
    public Intent mo239f() {
        return C0356g.m1801a(this);
    }

    public <T extends View> T findViewById(int i) {
        return mo258q().mo266a(i);
    }

    public MenuInflater getMenuInflater() {
        return mo258q().mo279c();
    }

    public Resources getResources() {
        if (this.f223v == null && C0291y0.m1459b()) {
            this.f223v = new C0291y0(this, super.getResources());
        }
        Resources resources = this.f223v;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        mo258q().mo285f();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f223v != null) {
            this.f223v.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        mo258q().mo268a(configuration);
    }

    public void onContentChanged() {
        mo260s();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0069e q = mo258q();
        q.mo284e();
        q.mo269a(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo258q().mo286g();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m247a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0061a r = mo259r();
        if (menuItem.getItemId() != 16908332 || r == null || (r.mo196g() & 4) == 0) {
            return false;
        }
        return mo265t();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo258q().mo276b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo258q().mo287h();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo258q().mo281c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo258q().mo288i();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo258q().mo289j();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo258q().mo273a(charSequence);
    }

    public void openOptionsMenu() {
        C0061a r = mo259r();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (r == null || !r.mo200k()) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: p */
    public void mo257p() {
        mo258q().mo285f();
    }

    /* renamed from: q */
    public C0069e mo258q() {
        if (this.f222u == null) {
            this.f222u = C0069e.m266a((Activity) this, (C0068d) this);
        }
        return this.f222u;
    }

    /* renamed from: r */
    public C0061a mo259r() {
        return mo258q().mo282d();
    }

    @Deprecated
    /* renamed from: s */
    public void mo260s() {
    }

    public void setContentView(int i) {
        mo258q().mo280c(i);
    }

    public void setContentView(View view) {
        mo258q().mo270a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo258q().mo277b(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        mo258q().mo283d(i);
    }

    /* renamed from: t */
    public boolean mo265t() {
        Intent f = mo239f();
        if (f == null) {
            return false;
        }
        if (mo236b(f)) {
            C0369n a = C0369n.m1877a((Context) this);
            mo229a(a);
            mo234b(a);
            a.mo2232c();
            try {
                C0343a.m1777a(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            mo227a(f);
        }
        return true;
    }
}
