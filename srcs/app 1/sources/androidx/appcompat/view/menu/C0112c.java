package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p071f.p088e.C3162a;
import p071f.p097h.p101g.p102a.C3274b;
import p071f.p097h.p101g.p102a.C3275c;

/* renamed from: androidx.appcompat.view.menu.c */
abstract class C0112c {

    /* renamed from: a */
    final Context f458a;

    /* renamed from: b */
    private Map<C3274b, MenuItem> f459b;

    /* renamed from: c */
    private Map<C3275c, SubMenu> f460c;

    C0112c(Context context) {
        this.f458a = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final MenuItem mo526a(MenuItem menuItem) {
        if (!(menuItem instanceof C3274b)) {
            return menuItem;
        }
        C3274b bVar = (C3274b) menuItem;
        if (this.f459b == null) {
            this.f459b = new C3162a();
        }
        MenuItem menuItem2 = (MenuItem) this.f459b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0128j jVar = new C0128j(this.f458a, bVar);
        this.f459b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SubMenu mo527a(SubMenu subMenu) {
        if (!(subMenu instanceof C3275c)) {
            return subMenu;
        }
        C3275c cVar = (C3275c) subMenu;
        if (this.f460c == null) {
            this.f460c = new C3162a();
        }
        SubMenu subMenu2 = (SubMenu) this.f460c.get(cVar);
        if (subMenu2 == null) {
            subMenu2 = new C0147s(this.f458a, cVar);
            this.f460c.put(cVar, subMenu2);
        }
        return subMenu2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo528a(int i) {
        Map<C3274b, MenuItem> map = this.f459b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo529b() {
        Map<C3274b, MenuItem> map = this.f459b;
        if (map != null) {
            map.clear();
        }
        Map<C3275c, SubMenu> map2 = this.f460c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo530b(int i) {
        Map<C3274b, MenuItem> map = this.f459b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
