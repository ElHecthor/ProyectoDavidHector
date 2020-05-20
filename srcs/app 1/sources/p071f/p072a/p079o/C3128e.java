package p071f.p072a.p079o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0122g;
import androidx.appcompat.view.menu.C0122g.C0123a;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p071f.p072a.p079o.C3124b.C3125a;

/* renamed from: f.a.o.e */
public class C3128e extends C3124b implements C0123a {

    /* renamed from: h */
    private Context f8841h;

    /* renamed from: i */
    private ActionBarContextView f8842i;

    /* renamed from: j */
    private C3125a f8843j;

    /* renamed from: k */
    private WeakReference<View> f8844k;

    /* renamed from: l */
    private boolean f8845l;

    /* renamed from: m */
    private C0122g f8846m;

    public C3128e(Context context, ActionBarContextView actionBarContextView, C3125a aVar, boolean z) {
        this.f8841h = context;
        this.f8842i = actionBarContextView;
        this.f8843j = aVar;
        C0122g gVar = new C0122g(actionBarContextView.getContext());
        gVar.mo609c(1);
        this.f8846m = gVar;
        gVar.mo585a((C0123a) this);
    }

    /* renamed from: a */
    public void mo401a() {
        if (!this.f8845l) {
            this.f8845l = true;
            this.f8842i.sendAccessibilityEvent(32);
            this.f8843j.mo334a(this);
        }
    }

    /* renamed from: a */
    public void mo402a(int i) {
        mo404a((CharSequence) this.f8841h.getString(i));
    }

    /* renamed from: a */
    public void mo403a(View view) {
        this.f8842i.setCustomView(view);
        this.f8844k = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public void mo297a(C0122g gVar) {
        mo413i();
        this.f8842i.mo867d();
    }

    /* renamed from: a */
    public void mo404a(CharSequence charSequence) {
        this.f8842i.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo405a(boolean z) {
        super.mo405a(z);
        this.f8842i.setTitleOptional(z);
    }

    /* renamed from: a */
    public boolean mo300a(C0122g gVar, MenuItem menuItem) {
        return this.f8843j.mo336a((C3124b) this, menuItem);
    }

    /* renamed from: b */
    public View mo406b() {
        WeakReference<View> weakReference = this.f8844k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public void mo407b(int i) {
        mo408b((CharSequence) this.f8841h.getString(i));
    }

    /* renamed from: b */
    public void mo408b(CharSequence charSequence) {
        this.f8842i.setTitle(charSequence);
    }

    /* renamed from: c */
    public Menu mo409c() {
        return this.f8846m;
    }

    /* renamed from: d */
    public MenuInflater mo410d() {
        return new C3131g(this.f8842i.getContext());
    }

    /* renamed from: e */
    public CharSequence mo411e() {
        return this.f8842i.getSubtitle();
    }

    /* renamed from: g */
    public CharSequence mo412g() {
        return this.f8842i.getTitle();
    }

    /* renamed from: i */
    public void mo413i() {
        this.f8843j.mo335a((C3124b) this, (Menu) this.f8846m);
    }

    /* renamed from: j */
    public boolean mo414j() {
        return this.f8842i.mo865b();
    }
}
