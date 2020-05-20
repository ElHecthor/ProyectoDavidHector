package p071f.p072a.p079o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: f.a.o.b */
public abstract class C3124b {

    /* renamed from: f */
    private Object f8834f;

    /* renamed from: g */
    private boolean f8835g;

    /* renamed from: f.a.o.b$a */
    public interface C3125a {
        /* renamed from: a */
        void mo334a(C3124b bVar);

        /* renamed from: a */
        boolean mo335a(C3124b bVar, Menu menu);

        /* renamed from: a */
        boolean mo336a(C3124b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo337b(C3124b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract void mo401a();

    /* renamed from: a */
    public abstract void mo402a(int i);

    /* renamed from: a */
    public abstract void mo403a(View view);

    /* renamed from: a */
    public abstract void mo404a(CharSequence charSequence);

    /* renamed from: a */
    public void mo10046a(Object obj) {
        this.f8834f = obj;
    }

    /* renamed from: a */
    public void mo405a(boolean z) {
        this.f8835g = z;
    }

    /* renamed from: b */
    public abstract View mo406b();

    /* renamed from: b */
    public abstract void mo407b(int i);

    /* renamed from: b */
    public abstract void mo408b(CharSequence charSequence);

    /* renamed from: c */
    public abstract Menu mo409c();

    /* renamed from: d */
    public abstract MenuInflater mo410d();

    /* renamed from: e */
    public abstract CharSequence mo411e();

    /* renamed from: f */
    public Object mo10047f() {
        return this.f8834f;
    }

    /* renamed from: g */
    public abstract CharSequence mo412g();

    /* renamed from: h */
    public boolean mo10048h() {
        return this.f8835g;
    }

    /* renamed from: i */
    public abstract void mo413i();

    /* renamed from: j */
    public abstract boolean mo414j();
}
