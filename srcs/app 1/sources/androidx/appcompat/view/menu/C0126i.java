package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0139n.C0140a;
import androidx.core.graphics.drawable.C0371a;
import p071f.p072a.C3100h;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p101g.p102a.C3274b;
import p071f.p097h.p108m.C3329b;
import p071f.p097h.p108m.C3329b.C3331b;

/* renamed from: androidx.appcompat.view.menu.i */
public final class C0126i implements C3274b {

    /* renamed from: A */
    private View f547A;

    /* renamed from: B */
    private C3329b f548B;

    /* renamed from: C */
    private OnActionExpandListener f549C;

    /* renamed from: D */
    private boolean f550D = false;

    /* renamed from: E */
    private ContextMenuInfo f551E;

    /* renamed from: a */
    private final int f552a;

    /* renamed from: b */
    private final int f553b;

    /* renamed from: c */
    private final int f554c;

    /* renamed from: d */
    private final int f555d;

    /* renamed from: e */
    private CharSequence f556e;

    /* renamed from: f */
    private CharSequence f557f;

    /* renamed from: g */
    private Intent f558g;

    /* renamed from: h */
    private char f559h;

    /* renamed from: i */
    private int f560i = 4096;

    /* renamed from: j */
    private char f561j;

    /* renamed from: k */
    private int f562k = 4096;

    /* renamed from: l */
    private Drawable f563l;

    /* renamed from: m */
    private int f564m = 0;

    /* renamed from: n */
    C0122g f565n;

    /* renamed from: o */
    private C0146r f566o;

    /* renamed from: p */
    private Runnable f567p;

    /* renamed from: q */
    private OnMenuItemClickListener f568q;

    /* renamed from: r */
    private CharSequence f569r;

    /* renamed from: s */
    private CharSequence f570s;

    /* renamed from: t */
    private ColorStateList f571t = null;

    /* renamed from: u */
    private Mode f572u = null;

    /* renamed from: v */
    private boolean f573v = false;

    /* renamed from: w */
    private boolean f574w = false;

    /* renamed from: x */
    private boolean f575x = false;

    /* renamed from: y */
    private int f576y = 16;

    /* renamed from: z */
    private int f577z = 0;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    class C0127a implements C3331b {
        C0127a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0126i iVar = C0126i.this;
            iVar.f565n.mo620d(iVar);
        }
    }

    C0126i(C0122g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f565n = gVar;
        this.f552a = i2;
        this.f553b = i;
        this.f554c = i3;
        this.f555d = i4;
        this.f556e = charSequence;
        this.f577z = i5;
    }

    /* renamed from: a */
    private Drawable m676a(Drawable drawable) {
        if (drawable != null && this.f575x && (this.f573v || this.f574w)) {
            drawable = C0371a.m1913i(drawable).mutate();
            if (this.f573v) {
                C0371a.m1898a(drawable, this.f571t);
            }
            if (this.f574w) {
                C0371a.m1901a(drawable, this.f572u);
            }
            this.f575x = false;
        }
        return drawable;
    }

    /* renamed from: a */
    private static void m677a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: a */
    public C3274b mo453a(C3329b bVar) {
        C3329b bVar2 = this.f548B;
        if (bVar2 != null) {
            bVar2.mo10723f();
        }
        this.f547A = null;
        this.f548B = bVar;
        this.f565n.mo607b(true);
        C3329b bVar3 = this.f548B;
        if (bVar3 != null) {
            bVar3.mo772a((C3331b) new C0127a());
        }
        return this;
    }

    /* renamed from: a */
    public C3329b mo454a() {
        return this.f548B;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CharSequence mo656a(C0140a aVar) {
        return (aVar == null || !aVar.mo418b()) ? getTitle() : getTitleCondensed();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo657a(ContextMenuInfo contextMenuInfo) {
        this.f551E = contextMenuInfo;
    }

    /* renamed from: a */
    public void mo658a(C0146r rVar) {
        this.f566o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* renamed from: a */
    public void mo659a(boolean z) {
        this.f550D = z;
        this.f565n.mo607b(false);
    }

    /* renamed from: b */
    public void mo660b() {
        this.f565n.mo612c(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo661b(boolean z) {
        int i = this.f576y;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f576y = i2;
        if (i != i2) {
            this.f565n.mo607b(false);
        }
    }

    /* renamed from: c */
    public int mo662c() {
        return this.f555d;
    }

    /* renamed from: c */
    public void mo663c(boolean z) {
        this.f576y = (z ? 4 : 0) | (this.f576y & -5);
    }

    public boolean collapseActionView() {
        if ((this.f577z & 8) == 0) {
            return false;
        }
        if (this.f547A == null) {
            return true;
        }
        OnActionExpandListener onActionExpandListener = this.f549C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f565n.mo593a(this);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public char mo664d() {
        return this.f565n.mo637p() ? this.f561j : this.f559h;
    }

    /* renamed from: d */
    public void mo665d(boolean z) {
        this.f576y = z ? this.f576y | 32 : this.f576y & -33;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public String mo666e() {
        int i;
        char d = mo664d();
        if (d == 0) {
            return "";
        }
        Resources resources = this.f565n.mo621e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f565n.mo621e()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C3100h.abc_prepend_shortcut_label));
        }
        int i2 = this.f565n.mo637p() ? this.f562k : this.f560i;
        m677a(sb, i2, 65536, resources.getString(C3100h.abc_menu_meta_shortcut_label));
        m677a(sb, i2, 4096, resources.getString(C3100h.abc_menu_ctrl_shortcut_label));
        m677a(sb, i2, 2, resources.getString(C3100h.abc_menu_alt_shortcut_label));
        m677a(sb, i2, 1, resources.getString(C3100h.abc_menu_shift_shortcut_label));
        m677a(sb, i2, 4, resources.getString(C3100h.abc_menu_sym_shortcut_label));
        m677a(sb, i2, 8, resources.getString(C3100h.abc_menu_function_shortcut_label));
        if (d == 8) {
            i = C3100h.abc_menu_delete_shortcut_label;
        } else if (d == 10) {
            i = C3100h.abc_menu_enter_shortcut_label;
        } else if (d != ' ') {
            sb.append(d);
            return sb.toString();
        } else {
            i = C3100h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo667e(boolean z) {
        int i = this.f576y;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f576y = i2;
        return i != i2;
    }

    public boolean expandActionView() {
        if (!mo668f()) {
            return false;
        }
        OnActionExpandListener onActionExpandListener = this.f549C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f565n.mo608b(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo668f() {
        if ((this.f577z & 8) == 0) {
            return false;
        }
        if (this.f547A == null) {
            C3329b bVar = this.f548B;
            if (bVar != null) {
                this.f547A = bVar.mo771a((MenuItem) this);
            }
        }
        return this.f547A != null;
    }

    /* renamed from: g */
    public boolean mo669g() {
        OnMenuItemClickListener onMenuItemClickListener = this.f568q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0122g gVar = this.f565n;
        if (gVar.mo592a(gVar, (MenuItem) this)) {
            return true;
        }
        Runnable runnable = this.f567p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f558g != null) {
            try {
                this.f565n.mo621e().startActivity(this.f558g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C3329b bVar = this.f548B;
        return bVar != null && bVar.mo770d();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f547A;
        if (view != null) {
            return view;
        }
        C3329b bVar = this.f548B;
        if (bVar == null) {
            return null;
        }
        View a = bVar.mo771a((MenuItem) this);
        this.f547A = a;
        return a;
    }

    public int getAlphabeticModifiers() {
        return this.f562k;
    }

    public char getAlphabeticShortcut() {
        return this.f561j;
    }

    public CharSequence getContentDescription() {
        return this.f569r;
    }

    public int getGroupId() {
        return this.f553b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f563l;
        if (drawable != null) {
            return m676a(drawable);
        }
        if (this.f564m == 0) {
            return null;
        }
        Drawable c = C3103a.m12557c(this.f565n.mo621e(), this.f564m);
        this.f564m = 0;
        this.f563l = c;
        return m676a(c);
    }

    public ColorStateList getIconTintList() {
        return this.f571t;
    }

    public Mode getIconTintMode() {
        return this.f572u;
    }

    public Intent getIntent() {
        return this.f558g;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f552a;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f551E;
    }

    public int getNumericModifiers() {
        return this.f560i;
    }

    public char getNumericShortcut() {
        return this.f559h;
    }

    public int getOrder() {
        return this.f554c;
    }

    public SubMenu getSubMenu() {
        return this.f566o;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f556e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f557f;
        if (charSequence == null) {
            charSequence = this.f556e;
        }
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f570s;
    }

    /* renamed from: h */
    public boolean mo682h() {
        return (this.f576y & 32) == 32;
    }

    public boolean hasSubMenu() {
        return this.f566o != null;
    }

    /* renamed from: i */
    public boolean mo684i() {
        return (this.f576y & 4) != 0;
    }

    public boolean isActionViewExpanded() {
        return this.f550D;
    }

    public boolean isCheckable() {
        return (this.f576y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f576y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f576y & 16) != 0;
    }

    public boolean isVisible() {
        C3329b bVar = this.f548B;
        boolean z = true;
        if (bVar == null || !bVar.mo774e()) {
            if ((this.f576y & 8) != 0) {
                z = false;
            }
            return z;
        }
        if ((this.f576y & 8) != 0 || !this.f548B.mo773b()) {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo689j() {
        return (this.f577z & 1) == 1;
    }

    /* renamed from: k */
    public boolean mo690k() {
        return (this.f577z & 2) == 2;
    }

    /* renamed from: l */
    public boolean mo691l() {
        return this.f565n.mo632k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo692m() {
        return this.f565n.mo640q() && mo664d() != 0;
    }

    /* renamed from: n */
    public boolean mo693n() {
        return (this.f577z & 4) == 4;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public C3274b setActionView(int i) {
        Context e = this.f565n.mo621e();
        setActionView(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    public C3274b setActionView(View view) {
        this.f547A = view;
        this.f548B = null;
        if (view != null && view.getId() == -1) {
            int i = this.f552a;
            if (i > 0) {
                view.setId(i);
            }
        }
        this.f565n.mo612c(this);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f561j == c) {
            return this;
        }
        this.f561j = Character.toLowerCase(c);
        this.f565n.mo607b(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f561j == c && this.f562k == i) {
            return this;
        }
        this.f561j = Character.toLowerCase(c);
        this.f562k = KeyEvent.normalizeMetaState(i);
        this.f565n.mo607b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f576y;
        boolean z2 = z | (i & true);
        this.f576y = z2 ? 1 : 0;
        if (i != z2) {
            this.f565n.mo607b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f576y & 4) != 0) {
            this.f565n.mo584a((MenuItem) this);
        } else {
            mo661b(z);
        }
        return this;
    }

    public C3274b setContentDescription(CharSequence charSequence) {
        this.f569r = charSequence;
        this.f565n.mo607b(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f576y = z ? this.f576y | 16 : this.f576y & -17;
        this.f565n.mo607b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f563l = null;
        this.f564m = i;
        this.f575x = true;
        this.f565n.mo607b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f564m = 0;
        this.f563l = drawable;
        this.f575x = true;
        this.f565n.mo607b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f571t = colorStateList;
        this.f573v = true;
        this.f575x = true;
        this.f565n.mo607b(false);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f572u = mode;
        this.f574w = true;
        this.f575x = true;
        this.f565n.mo607b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f558g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f559h == c) {
            return this;
        }
        this.f559h = c;
        this.f565n.mo607b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f559h == c && this.f560i == i) {
            return this;
        }
        this.f559h = c;
        this.f560i = KeyEvent.normalizeMetaState(i);
        this.f565n.mo607b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f549C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f568q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f559h = c;
        this.f561j = Character.toLowerCase(c2);
        this.f565n.mo607b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f559h = c;
        this.f560i = KeyEvent.normalizeMetaState(i);
        this.f561j = Character.toLowerCase(c2);
        this.f562k = KeyEvent.normalizeMetaState(i2);
        this.f565n.mo607b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f577z = i;
            this.f565n.mo612c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public C3274b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f565n.mo621e().getString(i));
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f556e = charSequence;
        this.f565n.mo607b(false);
        C0146r rVar = this.f566o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f557f = charSequence;
        this.f565n.mo607b(false);
        return this;
    }

    public C3274b setTooltipText(CharSequence charSequence) {
        this.f570s = charSequence;
        this.f565n.mo607b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo667e(z)) {
            this.f565n.mo620d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f556e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
