package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p071f.p072a.p079o.C3126c;
import p071f.p097h.p101g.p102a.C3274b;
import p071f.p097h.p108m.C3329b;
import p071f.p097h.p108m.C3329b.C3331b;

/* renamed from: androidx.appcompat.view.menu.j */
public class C0128j extends C0112c implements MenuItem {

    /* renamed from: d */
    private final C3274b f579d;

    /* renamed from: e */
    private Method f580e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    private class C0129a extends C3329b {

        /* renamed from: b */
        final ActionProvider f581b;

        C0129a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f581b = actionProvider;
        }

        /* renamed from: a */
        public void mo767a(SubMenu subMenu) {
            this.f581b.onPrepareSubMenu(C0128j.this.mo527a(subMenu));
        }

        /* renamed from: a */
        public boolean mo768a() {
            return this.f581b.hasSubMenu();
        }

        /* renamed from: c */
        public View mo769c() {
            return this.f581b.onCreateActionView();
        }

        /* renamed from: d */
        public boolean mo770d() {
            return this.f581b.onPerformDefaultAction();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    private class C0130b extends C0129a implements VisibilityListener {

        /* renamed from: d */
        private C3331b f583d;

        C0130b(C0128j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo771a(MenuItem menuItem) {
            return this.f581b.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public void mo772a(C3331b bVar) {
            this.f583d = bVar;
            this.f581b.setVisibilityListener(bVar != null ? this : null);
        }

        /* renamed from: b */
        public boolean mo773b() {
            return this.f581b.isVisible();
        }

        /* renamed from: e */
        public boolean mo774e() {
            return this.f581b.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C3331b bVar = this.f583d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    static class C0131c extends FrameLayout implements C3126c {

        /* renamed from: f */
        final CollapsibleActionView f584f;

        C0131c(View view) {
            super(view.getContext());
            this.f584f = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo776a() {
            this.f584f.onActionViewExpanded();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public View mo777b() {
            return (View) this.f584f;
        }

        /* renamed from: c */
        public void mo778c() {
            this.f584f.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    private class C0132d implements OnActionExpandListener {

        /* renamed from: a */
        private final OnActionExpandListener f585a;

        C0132d(OnActionExpandListener onActionExpandListener) {
            this.f585a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f585a.onMenuItemActionCollapse(C0128j.this.mo526a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f585a.onMenuItemActionExpand(C0128j.this.mo526a(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    private class C0133e implements OnMenuItemClickListener {

        /* renamed from: a */
        private final OnMenuItemClickListener f587a;

        C0133e(OnMenuItemClickListener onMenuItemClickListener) {
            this.f587a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f587a.onMenuItemClick(C0128j.this.mo526a(menuItem));
        }
    }

    public C0128j(Context context, C3274b bVar) {
        super(context);
        if (bVar != null) {
            this.f579d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    /* renamed from: a */
    public void mo712a(boolean z) {
        try {
            if (this.f580e == null) {
                this.f580e = this.f579d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f580e.invoke(this.f579d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return this.f579d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f579d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C3329b a = this.f579d.mo454a();
        if (a instanceof C0129a) {
            return ((C0129a) a).f581b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f579d.getActionView();
        return actionView instanceof C0131c ? ((C0131c) actionView).mo777b() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f579d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f579d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f579d.getContentDescription();
    }

    public int getGroupId() {
        return this.f579d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f579d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f579d.getIconTintList();
    }

    public Mode getIconTintMode() {
        return this.f579d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f579d.getIntent();
    }

    public int getItemId() {
        return this.f579d.getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f579d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f579d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f579d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f579d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo527a(this.f579d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f579d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f579d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f579d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f579d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f579d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f579d.isCheckable();
    }

    public boolean isChecked() {
        return this.f579d.isChecked();
    }

    public boolean isEnabled() {
        return this.f579d.isEnabled();
    }

    public boolean isVisible() {
        return this.f579d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C3329b bVar = VERSION.SDK_INT >= 16 ? new C0130b(this, this.f458a, actionProvider) : new C0129a(this.f458a, actionProvider);
        C3274b bVar2 = this.f579d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo453a(bVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f579d.setActionView(i);
        View actionView = this.f579d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f579d.setActionView((View) new C0131c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0131c(view);
        }
        this.f579d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f579d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f579d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f579d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f579d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f579d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f579d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f579d.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f579d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f579d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f579d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f579d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f579d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f579d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f579d.setOnActionExpandListener(onActionExpandListener != null ? new C0132d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f579d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0133e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f579d.setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f579d.setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f579d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f579d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f579d.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f579d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f579d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f579d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f579d.setVisible(z);
    }
}
