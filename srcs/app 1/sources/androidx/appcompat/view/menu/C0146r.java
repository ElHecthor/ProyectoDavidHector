package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0122g.C0123a;

/* renamed from: androidx.appcompat.view.menu.r */
public class C0146r extends C0122g implements SubMenu {

    /* renamed from: B */
    private C0122g f627B;

    /* renamed from: C */
    private C0126i f628C;

    public C0146r(Context context, C0122g gVar, C0126i iVar) {
        super(context);
        this.f627B = gVar;
        this.f628C = iVar;
    }

    /* renamed from: a */
    public void mo585a(C0123a aVar) {
        this.f627B.mo585a(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo592a(C0122g gVar, MenuItem menuItem) {
        return super.mo592a(gVar, menuItem) || this.f627B.mo592a(gVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo593a(C0126i iVar) {
        return this.f627B.mo593a(iVar);
    }

    /* renamed from: b */
    public boolean mo608b(C0126i iVar) {
        return this.f627B.mo608b(iVar);
    }

    /* renamed from: d */
    public String mo618d() {
        C0126i iVar = this.f628C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo618d());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    public MenuItem getItem() {
        return this.f628C;
    }

    /* renamed from: m */
    public C0122g mo634m() {
        return this.f627B.mo634m();
    }

    /* renamed from: o */
    public boolean mo636o() {
        return this.f627B.mo636o();
    }

    /* renamed from: p */
    public boolean mo637p() {
        return this.f627B.mo637p();
    }

    /* renamed from: q */
    public boolean mo640q() {
        return this.f627B.mo640q();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f627B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        super.mo617d(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.mo578a(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.mo622e(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo580a(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.mo579a(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f628C.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f628C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f627B.setQwertyMode(z);
    }

    /* renamed from: t */
    public Menu mo835t() {
        return this.f627B;
    }
}
