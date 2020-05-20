package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0122g;
import androidx.appcompat.view.menu.C0126i;

/* renamed from: com.google.android.material.bottomnavigation.b */
public final class C2574b extends C0122g {
    public C2574b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo577a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            mo644s();
            MenuItem a = super.mo577a(i, i2, i3, charSequence);
            if (a instanceof C0126i) {
                ((C0126i) a).mo663c(true);
            }
            mo641r();
            return a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
