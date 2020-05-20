package p071f.p097h.p108m;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: f.h.m.b */
public abstract class C3329b {

    /* renamed from: a */
    private C3331b f9514a;

    /* renamed from: f.h.m.b$a */
    public interface C3330a {
    }

    /* renamed from: f.h.m.b$b */
    public interface C3331b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C3329b(Context context) {
    }

    /* renamed from: a */
    public View mo771a(MenuItem menuItem) {
        return mo769c();
    }

    /* renamed from: a */
    public void mo767a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public void mo10722a(C3330a aVar) {
    }

    /* renamed from: a */
    public void mo772a(C3331b bVar) {
        if (!(this.f9514a == null || bVar == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.f9514a = bVar;
    }

    /* renamed from: a */
    public boolean mo768a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo773b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo769c();

    /* renamed from: d */
    public boolean mo770d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo774e() {
        return false;
    }

    /* renamed from: f */
    public void mo10723f() {
        this.f9514a = null;
    }
}
