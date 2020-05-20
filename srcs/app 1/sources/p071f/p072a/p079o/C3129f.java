package p071f.p072a.p079o;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0128j;
import androidx.appcompat.view.menu.C0141o;
import java.util.ArrayList;
import p071f.p072a.p079o.C3124b.C3125a;
import p071f.p088e.C3175g;
import p071f.p097h.p101g.p102a.C3273a;
import p071f.p097h.p101g.p102a.C3274b;

/* renamed from: f.a.o.f */
public class C3129f extends ActionMode {

    /* renamed from: a */
    final Context f8847a;

    /* renamed from: b */
    final C3124b f8848b;

    /* renamed from: f.a.o.f$a */
    public static class C3130a implements C3125a {

        /* renamed from: a */
        final Callback f8849a;

        /* renamed from: b */
        final Context f8850b;

        /* renamed from: c */
        final ArrayList<C3129f> f8851c = new ArrayList<>();

        /* renamed from: d */
        final C3175g<Menu, Menu> f8852d = new C3175g<>();

        public C3130a(Context context, Callback callback) {
            this.f8850b = context;
            this.f8849a = callback;
        }

        /* renamed from: a */
        private Menu m12692a(Menu menu) {
            Menu menu2 = (Menu) this.f8852d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0141o oVar = new C0141o(this.f8850b, (C3273a) menu);
            this.f8852d.put(menu, oVar);
            return oVar;
        }

        /* renamed from: a */
        public void mo334a(C3124b bVar) {
            this.f8849a.onDestroyActionMode(mo10074b(bVar));
        }

        /* renamed from: a */
        public boolean mo335a(C3124b bVar, Menu menu) {
            return this.f8849a.onPrepareActionMode(mo10074b(bVar), m12692a(menu));
        }

        /* renamed from: a */
        public boolean mo336a(C3124b bVar, MenuItem menuItem) {
            return this.f8849a.onActionItemClicked(mo10074b(bVar), new C0128j(this.f8850b, (C3274b) menuItem));
        }

        /* renamed from: b */
        public ActionMode mo10074b(C3124b bVar) {
            int size = this.f8851c.size();
            for (int i = 0; i < size; i++) {
                C3129f fVar = (C3129f) this.f8851c.get(i);
                if (fVar != null && fVar.f8848b == bVar) {
                    return fVar;
                }
            }
            C3129f fVar2 = new C3129f(this.f8850b, bVar);
            this.f8851c.add(fVar2);
            return fVar2;
        }

        /* renamed from: b */
        public boolean mo337b(C3124b bVar, Menu menu) {
            return this.f8849a.onCreateActionMode(mo10074b(bVar), m12692a(menu));
        }
    }

    public C3129f(Context context, C3124b bVar) {
        this.f8847a = context;
        this.f8848b = bVar;
    }

    public void finish() {
        this.f8848b.mo401a();
    }

    public View getCustomView() {
        return this.f8848b.mo406b();
    }

    public Menu getMenu() {
        return new C0141o(this.f8847a, (C3273a) this.f8848b.mo409c());
    }

    public MenuInflater getMenuInflater() {
        return this.f8848b.mo410d();
    }

    public CharSequence getSubtitle() {
        return this.f8848b.mo411e();
    }

    public Object getTag() {
        return this.f8848b.mo10047f();
    }

    public CharSequence getTitle() {
        return this.f8848b.mo412g();
    }

    public boolean getTitleOptionalHint() {
        return this.f8848b.mo10048h();
    }

    public void invalidate() {
        this.f8848b.mo413i();
    }

    public boolean isTitleOptional() {
        return this.f8848b.mo414j();
    }

    public void setCustomView(View view) {
        this.f8848b.mo403a(view);
    }

    public void setSubtitle(int i) {
        this.f8848b.mo402a(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8848b.mo404a(charSequence);
    }

    public void setTag(Object obj) {
        this.f8848b.mo10046a(obj);
    }

    public void setTitle(int i) {
        this.f8848b.mo407b(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f8848b.mo408b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f8848b.mo405a(z);
    }
}
