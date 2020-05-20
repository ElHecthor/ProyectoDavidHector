package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p071f.p097h.p101g.p102a.C3275c;

/* renamed from: androidx.appcompat.view.menu.s */
class C0147s extends C0141o implements SubMenu {

    /* renamed from: e */
    private final C3275c f629e;

    C0147s(Context context, C3275c cVar) {
        super(context, cVar);
        this.f629e = cVar;
    }

    public void clearHeader() {
        this.f629e.clearHeader();
    }

    public MenuItem getItem() {
        return mo526a(this.f629e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f629e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f629e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f629e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f629e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f629e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f629e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f629e.setIcon(drawable);
        return this;
    }
}
