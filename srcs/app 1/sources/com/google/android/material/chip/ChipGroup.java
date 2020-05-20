package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.material.internal.C2702c;
import com.google.android.material.internal.C2714i;
import java.util.ArrayList;
import java.util.List;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;

public class ChipGroup extends C2702c {

    /* renamed from: i */
    private int f7472i;

    /* renamed from: j */
    private int f7473j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f7474k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f7475l;

    /* renamed from: m */
    private C2609d f7476m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C2607b f7477n;

    /* renamed from: o */
    private C2610e f7478o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f7479p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f7480q;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    private class C2607b implements OnCheckedChangeListener {
        private C2607b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f7480q) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.f7475l) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(ChipGroup.this.f7479p == -1 || ChipGroup.this.f7479p == id || !ChipGroup.this.f7474k)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.m10667a(chipGroup.f7479p, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.f7479p == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                    return;
                }
                ChipGroup.this.m10667a(compoundButton.getId(), true);
                ChipGroup.this.setCheckedId(compoundButton.getId());
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C2608c extends MarginLayoutParams {
        public C2608c(int i, int i2) {
            super(i, i2);
        }

        public C2608c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C2608c(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C2609d {
        /* renamed from: a */
        void mo8470a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    private class C2610e implements OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public OnHierarchyChangeListener f7482f;

        private C2610e() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(VERSION.SDK_INT >= 17 ? View.generateViewId() : view2.hashCode());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f7477n);
            }
            OnHierarchyChangeListener onHierarchyChangeListener = this.f7482f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            OnHierarchyChangeListener onHierarchyChangeListener = this.f7482f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7477n = new C2607b();
        this.f7478o = new C2610e();
        this.f7479p = -1;
        this.f7480q = false;
        TypedArray c = C2714i.m11283c(context, attributeSet, C4416l.ChipGroup, i, C4415k.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = c.getDimensionPixelOffset(C4416l.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(c.getDimensionPixelOffset(C4416l.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(c.getDimensionPixelOffset(C4416l.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(c.getBoolean(C4416l.ChipGroup_singleLine, false));
        setSingleSelection(c.getBoolean(C4416l.ChipGroup_singleSelection, false));
        setSelectionRequired(c.getBoolean(C4416l.ChipGroup_selectionRequired, false));
        int resourceId = c.getResourceId(C4416l.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f7479p = resourceId;
        }
        c.recycle();
        super.setOnHierarchyChangeListener(this.f7478o);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10667a(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f7480q = true;
            ((Chip) findViewById).setChecked(z);
            this.f7480q = false;
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f7479p = i;
        C2609d dVar = this.f7476m;
        if (dVar != null && this.f7474k) {
            dVar.mo8470a(this, i);
        }
    }

    /* renamed from: a */
    public void mo8438a(int i) {
        int i2 = this.f7479p;
        if (i != i2) {
            if (i2 != -1 && this.f7474k) {
                m10667a(i2, false);
            }
            if (i != -1) {
                m10667a(i, true);
            }
            setCheckedId(i);
        }
    }

    /* renamed from: a */
    public boolean mo8439a() {
        return super.mo8439a();
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f7479p;
                if (i2 != -1 && this.f7474k) {
                    m10667a(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public void mo8441b() {
        this.f7480q = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f7480q = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2608c);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new C2608c(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2608c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C2608c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f7474k) {
            return this.f7479p;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f7474k) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f7472i;
    }

    public int getChipSpacingVertical() {
        return this.f7473j;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f7479p;
        if (i != -1) {
            m10667a(i, true);
            setCheckedId(this.f7479p);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f7472i != i) {
            this.f7472i = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f7473j != i) {
            this.f7473j = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C2609d dVar) {
        this.f7476m = dVar;
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f7478o.f7482f = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f7475l = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f7474k != z) {
            this.f7474k = z;
            mo8441b();
        }
    }
}
