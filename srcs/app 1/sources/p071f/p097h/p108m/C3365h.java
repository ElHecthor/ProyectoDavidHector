package p071f.p097h.p108m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem;
import p071f.p097h.p101g.p102a.C3274b;

/* renamed from: f.h.m.h */
public final class C3365h {
    /* renamed from: a */
    public static MenuItem m13722a(MenuItem menuItem, C3329b bVar) {
        if (menuItem instanceof C3274b) {
            return ((C3274b) menuItem).mo453a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: a */
    public static void m13723a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C3274b) {
            ((C3274b) menuItem).setAlphabeticShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m13724a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C3274b) {
            ((C3274b) menuItem).setIconTintList(colorStateList);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m13725a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof C3274b) {
            ((C3274b) menuItem).setIconTintMode(mode);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m13726a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C3274b) {
            ((C3274b) menuItem).setContentDescription(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public static void m13727b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C3274b) {
            ((C3274b) menuItem).setNumericShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: b */
    public static void m13728b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C3274b) {
            ((C3274b) menuItem).setTooltipText(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
