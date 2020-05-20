package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.core.graphics.drawable.C0371a;
import p071f.p097h.p098e.C3236a;
import p071f.p097h.p101g.p102a.C3274b;
import p071f.p097h.p108m.C3329b;

/* renamed from: androidx.appcompat.view.menu.a */
public class C0110a implements C3274b {

    /* renamed from: a */
    private final int f430a;

    /* renamed from: b */
    private final int f431b;

    /* renamed from: c */
    private final int f432c;

    /* renamed from: d */
    private CharSequence f433d;

    /* renamed from: e */
    private CharSequence f434e;

    /* renamed from: f */
    private Intent f435f;

    /* renamed from: g */
    private char f436g;

    /* renamed from: h */
    private int f437h = 4096;

    /* renamed from: i */
    private char f438i;

    /* renamed from: j */
    private int f439j = 4096;

    /* renamed from: k */
    private Drawable f440k;

    /* renamed from: l */
    private Context f441l;

    /* renamed from: m */
    private CharSequence f442m;

    /* renamed from: n */
    private CharSequence f443n;

    /* renamed from: o */
    private ColorStateList f444o = null;

    /* renamed from: p */
    private Mode f445p = null;

    /* renamed from: q */
    private boolean f446q = false;

    /* renamed from: r */
    private boolean f447r = false;

    /* renamed from: s */
    private int f448s = 16;

    public C0110a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f441l = context;
        this.f430a = i2;
        this.f431b = i;
        this.f432c = i4;
        this.f433d = charSequence;
    }

    /* renamed from: b */
    private void m536b() {
        if (this.f440k == null) {
            return;
        }
        if (this.f446q || this.f447r) {
            Drawable i = C0371a.m1913i(this.f440k);
            this.f440k = i;
            Drawable mutate = i.mutate();
            this.f440k = mutate;
            if (this.f446q) {
                C0371a.m1898a(mutate, this.f444o);
            }
            if (this.f447r) {
                C0371a.m1901a(this.f440k, this.f445p);
            }
        }
    }

    /* renamed from: a */
    public C3274b mo453a(C3329b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C3329b mo454a() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f439j;
    }

    public char getAlphabeticShortcut() {
        return this.f438i;
    }

    public CharSequence getContentDescription() {
        return this.f442m;
    }

    public int getGroupId() {
        return this.f431b;
    }

    public Drawable getIcon() {
        return this.f440k;
    }

    public ColorStateList getIconTintList() {
        return this.f444o;
    }

    public Mode getIconTintMode() {
        return this.f445p;
    }

    public Intent getIntent() {
        return this.f435f;
    }

    public int getItemId() {
        return this.f430a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f437h;
    }

    public char getNumericShortcut() {
        return this.f436g;
    }

    public int getOrder() {
        return this.f432c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f433d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f434e;
        return charSequence != null ? charSequence : this.f433d;
    }

    public CharSequence getTooltipText() {
        return this.f443n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f448s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f448s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f448s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f448s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public C3274b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public C3274b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f438i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f438i = Character.toLowerCase(c);
        this.f439j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f448s = z | (this.f448s & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f448s = (z ? 2 : 0) | (this.f448s & -3);
        return this;
    }

    public C3274b setContentDescription(CharSequence charSequence) {
        this.f442m = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f448s = (z ? 16 : 0) | (this.f448s & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f440k = C3236a.m13271c(this.f441l, i);
        m536b();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f440k = drawable;
        m536b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f444o = colorStateList;
        this.f446q = true;
        m536b();
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f445p = mode;
        this.f447r = true;
        m536b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f435f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f436g = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f436g = c;
        this.f437h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f436g = c;
        this.f438i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f436g = c;
        this.f437h = KeyEvent.normalizeMetaState(i);
        this.f438i = Character.toLowerCase(c2);
        this.f439j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public C3274b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f433d = this.f441l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f433d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f434e = charSequence;
        return this;
    }

    public C3274b setTooltipText(CharSequence charSequence) {
        this.f443n = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f448s & 8;
        if (z) {
            i = 0;
        }
        this.f448s = i2 | i;
        return this;
    }
}
