package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0126i;
import androidx.appcompat.view.menu.C0139n.C0140a;
import androidx.appcompat.widget.C0212e0.C0213a;
import androidx.appcompat.widget.C0283v0;
import androidx.core.graphics.drawable.C0371a;
import androidx.core.widget.C0391i;
import p071f.p072a.C3093a;
import p071f.p097h.p098e.p099c.C3248f;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4409e;
import p147g.p156d.p157a.p185c.C4410f;
import p147g.p156d.p157a.p185c.C4412h;

public class NavigationMenuItemView extends C2703d implements C0140a {

    /* renamed from: K */
    private static final int[] f7802K = {16842912};

    /* renamed from: A */
    private int f7803A;

    /* renamed from: B */
    private boolean f7804B;

    /* renamed from: C */
    boolean f7805C;

    /* renamed from: D */
    private final CheckedTextView f7806D;

    /* renamed from: E */
    private FrameLayout f7807E;

    /* renamed from: F */
    private C0126i f7808F;

    /* renamed from: G */
    private ColorStateList f7809G;

    /* renamed from: H */
    private boolean f7810H;

    /* renamed from: I */
    private Drawable f7811I;

    /* renamed from: J */
    private final C3323a f7812J;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C2698a extends C3323a {
        C2698a() {
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            super.mo2349a(view, cVar);
            cVar.mo10756b(NavigationMenuItemView.this.f7805C);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7812J = new C2698a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(C4412h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C4408d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C4410f.design_menu_item_text);
        this.f7806D = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C3379v.m13788a((View) this.f7806D, this.f7812J);
    }

    /* renamed from: d */
    private void m11191d() {
        int i;
        C0213a aVar;
        if (m11193f()) {
            this.f7806D.setVisibility(8);
            FrameLayout frameLayout = this.f7807E;
            if (frameLayout != null) {
                aVar = (C0213a) frameLayout.getLayoutParams();
                i = -1;
            } else {
                return;
            }
        } else {
            this.f7806D.setVisibility(0);
            FrameLayout frameLayout2 = this.f7807E;
            if (frameLayout2 != null) {
                aVar = (C0213a) frameLayout2.getLayoutParams();
                i = -2;
            } else {
                return;
            }
        }
        aVar.width = i;
        this.f7807E.setLayoutParams(aVar);
    }

    /* renamed from: e */
    private StateListDrawable m11192e() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C3093a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f7802K, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: f */
    private boolean m11193f() {
        return this.f7808F.getTitle() == null && this.f7808F.getIcon() == null && this.f7808F.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f7807E == null) {
                this.f7807E = (FrameLayout) ((ViewStub) findViewById(C4410f.design_menu_item_action_area_stub)).inflate();
            }
            this.f7807E.removeAllViews();
            this.f7807E.addView(view);
        }
    }

    /* renamed from: a */
    public void mo416a(C0126i iVar, int i) {
        this.f7808F = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C3379v.m13787a((View) this, (Drawable) m11192e());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        C0283v0.m1404a(this, iVar.getTooltipText());
        m11191d();
    }

    /* renamed from: b */
    public boolean mo418b() {
        return false;
    }

    public C0126i getItemData() {
        return this.f7808F;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0126i iVar = this.f7808F;
        if (iVar != null && iVar.isCheckable() && this.f7808F.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f7802K);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f7805C != z) {
            this.f7805C = z;
            this.f7812J.mo3959a((View) this.f7806D, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f7806D.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f7810H) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0371a.m1913i(drawable).mutate();
                C0371a.m1898a(drawable, this.f7809G);
            }
            int i = this.f7803A;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f7804B) {
            if (this.f7811I == null) {
                Drawable a = C3248f.m13322a(getResources(), C4409e.navigation_empty_icon, getContext().getTheme());
                this.f7811I = a;
                if (a != null) {
                    int i2 = this.f7803A;
                    a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f7811I;
        }
        C0391i.m2030a(this.f7806D, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f7806D.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f7803A = i;
    }

    /* access modifiers changed from: 0000 */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f7809G = colorStateList;
        this.f7810H = colorStateList != null;
        C0126i iVar = this.f7808F;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f7806D.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f7804B = z;
    }

    public void setTextAppearance(int i) {
        C0391i.m2039d(this.f7806D, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f7806D.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f7806D.setText(charSequence);
    }
}
