package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.appcompat.view.menu.C0122g;
import androidx.appcompat.view.menu.C0122g.C0123a;
import androidx.appcompat.view.menu.C0137m;
import androidx.appcompat.widget.C0275t0;
import androidx.core.graphics.drawable.C0371a;
import com.google.android.material.internal.C2714i;
import com.google.android.material.internal.C2715j;
import com.google.android.material.internal.C2715j.C2718c;
import com.google.android.material.internal.C2715j.C2719d;
import com.google.android.material.theme.p054a.C2794a;
import p071f.p072a.p079o.C3131g;
import p071f.p097h.p098e.C3236a;
import p071f.p097h.p108m.C3343e0;
import p071f.p097h.p108m.C3379v;
import p071f.p112j.p113a.C3400a;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4405c;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4386h;
import p147g.p156d.p157a.p185c.p202y.C4459c;
import p147g.p156d.p157a.p185c.p203z.C4468b;

public class BottomNavigationView extends FrameLayout {

    /* renamed from: m */
    private static final int f7257m = C4415k.Widget_Design_BottomNavigationView;

    /* renamed from: f */
    private final C0122g f7258f;

    /* renamed from: g */
    final C2575c f7259g;

    /* renamed from: h */
    private final C2578d f7260h;

    /* renamed from: i */
    private ColorStateList f7261i;

    /* renamed from: j */
    private MenuInflater f7262j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C2568d f7263k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2567c f7264l;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    class C2565a implements C0123a {
        C2565a() {
        }

        /* renamed from: a */
        public void mo297a(C0122g gVar) {
        }

        /* renamed from: a */
        public boolean mo300a(C0122g gVar, MenuItem menuItem) {
            boolean z = true;
            if (BottomNavigationView.this.f7264l == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                if (BottomNavigationView.this.f7263k == null || BottomNavigationView.this.f7263k.mo8044a(menuItem)) {
                    z = false;
                }
                return z;
            }
            BottomNavigationView.this.f7264l.mo8043a(menuItem);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    class C2566b implements C2718c {
        C2566b(BottomNavigationView bottomNavigationView) {
        }

        /* renamed from: a */
        public C3343e0 mo8042a(View view, C3343e0 e0Var, C2719d dVar) {
            dVar.f7897d += e0Var.mo10729a();
            dVar.mo9005a(view);
            return e0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    public interface C2567c {
        /* renamed from: a */
        void mo8043a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$d */
    public interface C2568d {
        /* renamed from: a */
        boolean mo8044a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$e */
    static class C2569e extends C3400a {
        public static final Creator<C2569e> CREATOR = new C2570a();

        /* renamed from: h */
        Bundle f7266h;

        /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$e$a */
        static class C2570a implements ClassLoaderCreator<C2569e> {
            C2570a() {
            }

            public C2569e createFromParcel(Parcel parcel) {
                return new C2569e(parcel, null);
            }

            public C2569e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2569e(parcel, classLoader);
            }

            public C2569e[] newArray(int i) {
                return new C2569e[i];
            }
        }

        public C2569e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C2569e.class.getClassLoader();
            }
            m10408a(parcel, classLoader);
        }

        public C2569e(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m10408a(Parcel parcel, ClassLoader classLoader) {
            this.f7266h = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f7266h);
        }
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        C2575c cVar;
        ColorStateList colorStateList;
        super(C2794a.m11644b(context, attributeSet, i, f7257m), attributeSet, i);
        this.f7260h = new C2578d();
        Context context2 = getContext();
        this.f7258f = new C2574b(context2);
        this.f7259g = new C2575c(context2);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f7259g.setLayoutParams(layoutParams);
        this.f7260h.mo8100a(this.f7259g);
        this.f7260h.mo8099a(1);
        this.f7259g.setPresenter(this.f7260h);
        this.f7258f.mo586a((C0137m) this.f7260h);
        this.f7260h.mo513a(getContext(), this.f7258f);
        C0275t0 d = C2714i.m11284d(context2, attributeSet, C4416l.BottomNavigationView, i, C4415k.Widget_Design_BottomNavigationView, C4416l.BottomNavigationView_itemTextAppearanceInactive, C4416l.BottomNavigationView_itemTextAppearanceActive);
        if (d.mo1751g(C4416l.BottomNavigationView_itemIconTint)) {
            cVar = this.f7259g;
            colorStateList = d.mo1735a(C4416l.BottomNavigationView_itemIconTint);
        } else {
            cVar = this.f7259g;
            colorStateList = cVar.mo8069a(16842808);
        }
        cVar.setIconTintList(colorStateList);
        setItemIconSize(d.mo1742c(C4416l.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(C4408d.design_bottom_navigation_icon_size)));
        if (d.mo1751g(C4416l.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(d.mo1750g(C4416l.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (d.mo1751g(C4416l.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(d.mo1750g(C4416l.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (d.mo1751g(C4416l.BottomNavigationView_itemTextColor)) {
            setItemTextColor(d.mo1735a(C4416l.BottomNavigationView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C3379v.m13787a((View) this, (Drawable) m10401b(context2));
        }
        if (d.mo1751g(C4416l.BottomNavigationView_elevation)) {
            C3379v.m13780a((View) this, (float) d.mo1742c(C4416l.BottomNavigationView_elevation, 0));
        }
        C0371a.m1898a(getBackground().mutate(), C4459c.m18176a(context2, d, C4416l.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(d.mo1746e(C4416l.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(d.mo1738a(C4416l.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int g = d.mo1750g(C4416l.BottomNavigationView_itemBackground, 0);
        if (g != 0) {
            this.f7259g.setItemBackgroundRes(g);
        } else {
            setItemRippleColor(C4459c.m18176a(context2, d, C4416l.BottomNavigationView_itemRippleColor));
        }
        if (d.mo1751g(C4416l.BottomNavigationView_menu)) {
            mo8011a(d.mo1750g(C4416l.BottomNavigationView_menu, 0));
        }
        d.mo1737a();
        addView(this.f7259g, layoutParams);
        if (VERSION.SDK_INT < 21) {
            m10399a(context2);
        }
        this.f7258f.mo585a((C0123a) new C2565a());
        m10398a();
    }

    /* renamed from: a */
    private void m10398a() {
        C2715j.m11288a((View) this, (C2718c) new C2566b(this));
    }

    /* renamed from: a */
    private void m10399a(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C3236a.m13263a(context, C4405c.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new LayoutParams(-1, getResources().getDimensionPixelSize(C4408d.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    /* renamed from: b */
    private C4382g m10401b(Context context) {
        C4382g gVar = new C4382g();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            gVar.mo13059a(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        gVar.mo13058a(context);
        return gVar;
    }

    private MenuInflater getMenuInflater() {
        if (this.f7262j == null) {
            this.f7262j = new C3131g(getContext());
        }
        return this.f7262j;
    }

    /* renamed from: a */
    public void mo8011a(int i) {
        this.f7260h.mo8101b(true);
        getMenuInflater().inflate(i, this.f7258f);
        this.f7260h.mo8101b(false);
        this.f7260h.mo518a(true);
    }

    public Drawable getItemBackground() {
        return this.f7259g.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f7259g.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f7259g.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f7259g.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f7261i;
    }

    public int getItemTextAppearanceActive() {
        return this.f7259g.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f7259g.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f7259g.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f7259g.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f7258f;
    }

    public int getSelectedItemId() {
        return this.f7259g.getSelectedItemId();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4386h.m17875a((View) this);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2569e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2569e eVar = (C2569e) parcelable;
        super.onRestoreInstanceState(eVar.mo10880a());
        this.f7258f.mo605b(eVar.f7266h);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C2569e eVar = new C2569e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        eVar.f7266h = bundle;
        this.f7258f.mo619d(bundle);
        return eVar;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C4386h.m17876a((View) this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f7259g.setItemBackground(drawable);
        this.f7261i = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f7259g.setItemBackgroundRes(i);
        this.f7261i = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f7259g.mo8072b() != z) {
            this.f7259g.setItemHorizontalTranslationEnabled(z);
            this.f7260h.mo518a(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f7259g.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f7259g.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f7261i == colorStateList) {
            if (colorStateList == null && this.f7259g.getItemBackground() != null) {
                this.f7259g.setItemBackground(null);
            }
            return;
        }
        this.f7261i = colorStateList;
        if (colorStateList == null) {
            this.f7259g.setItemBackground(null);
        } else {
            ColorStateList a = C4468b.m18199a(colorStateList);
            if (VERSION.SDK_INT >= 21) {
                this.f7259g.setItemBackground(new RippleDrawable(a, null, null));
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(1.0E-5f);
                Drawable i = C0371a.m1913i(gradientDrawable);
                C0371a.m1898a(i, a);
                this.f7259g.setItemBackground(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f7259g.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f7259g.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f7259g.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f7259g.getLabelVisibilityMode() != i) {
            this.f7259g.setLabelVisibilityMode(i);
            this.f7260h.mo518a(false);
        }
    }

    public void setOnNavigationItemReselectedListener(C2567c cVar) {
        this.f7264l = cVar;
    }

    public void setOnNavigationItemSelectedListener(C2568d dVar) {
        this.f7263k = dVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f7258f.findItem(i);
        if (findItem != null && !this.f7258f.mo591a(findItem, (C0137m) this.f7260h, 0)) {
            findItem.setChecked(true);
        }
    }
}
