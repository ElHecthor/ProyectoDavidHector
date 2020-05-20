package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p071f.p097h.p101g.p102a.C3273a;

/* renamed from: androidx.appcompat.view.menu.o */
public class C0141o extends C0112c implements Menu {

    /* renamed from: d */
    private final C3273a f603d;

    public C0141o(Context context, C3273a aVar) {
        super(context);
        if (aVar != null) {
            this.f603d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i) {
        return mo526a(this.f603d.add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo526a(this.f603d.add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo526a(this.f603d.add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo526a(this.f603d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f603d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo526a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo527a(this.f603d.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo527a(this.f603d.addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo527a(this.f603d.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo527a(this.f603d.addSubMenu(charSequence));
    }

    public void clear() {
        mo529b();
        this.f603d.clear();
    }

    public void close() {
        this.f603d.close();
    }

    public MenuItem findItem(int i) {
        return mo526a(this.f603d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo526a(this.f603d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f603d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f603d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f603d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f603d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo528a(i);
        this.f603d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo530b(i);
        this.f603d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f603d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f603d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f603d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f603d.setQwertyMode(z);
    }

    public int size() {
        return this.f603d.size();
    }
}
