package com.google.android.material.bottomnavigation;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0122g;
import androidx.appcompat.view.menu.C0126i;
import androidx.appcompat.view.menu.C0137m;
import androidx.appcompat.view.menu.C0139n;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.C2712h;
import java.util.HashSet;
import p071f.p072a.C3093a;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p107l.C3318e;
import p071f.p097h.p107l.C3320g;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p097h.p108m.p109f0.C3347c.C3349b;
import p071f.p121n.p122a.p123a.C3451b;
import p071f.p139v.C3563b;
import p071f.p139v.C3607m;
import p071f.p139v.C3616o;
import p071f.p139v.C3620q;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.p190n.C4428a;

/* renamed from: com.google.android.material.bottomnavigation.c */
public class C2575c extends ViewGroup implements C0139n {

    /* renamed from: E */
    private static final int[] f7285E = {16842912};

    /* renamed from: F */
    private static final int[] f7286F = {-16842910};

    /* renamed from: A */
    private int[] f7287A;

    /* renamed from: B */
    private SparseArray<C4428a> f7288B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C2578d f7289C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C0122g f7290D;

    /* renamed from: f */
    private final C3620q f7291f;

    /* renamed from: g */
    private final int f7292g;

    /* renamed from: h */
    private final int f7293h;

    /* renamed from: i */
    private final int f7294i;

    /* renamed from: j */
    private final int f7295j;

    /* renamed from: k */
    private final int f7296k;

    /* renamed from: l */
    private final OnClickListener f7297l;

    /* renamed from: m */
    private final C3318e<C2571a> f7298m;

    /* renamed from: n */
    private boolean f7299n;

    /* renamed from: o */
    private int f7300o;

    /* renamed from: p */
    private C2571a[] f7301p;

    /* renamed from: q */
    private int f7302q;

    /* renamed from: r */
    private int f7303r;

    /* renamed from: s */
    private ColorStateList f7304s;

    /* renamed from: t */
    private int f7305t;

    /* renamed from: u */
    private ColorStateList f7306u;

    /* renamed from: v */
    private final ColorStateList f7307v;

    /* renamed from: w */
    private int f7308w;

    /* renamed from: x */
    private int f7309x;

    /* renamed from: y */
    private Drawable f7310y;

    /* renamed from: z */
    private int f7311z;

    /* renamed from: com.google.android.material.bottomnavigation.c$a */
    class C2576a implements OnClickListener {
        C2576a() {
        }

        public void onClick(View view) {
            C0126i itemData = ((C2571a) view).getItemData();
            if (!C2575c.this.f7290D.mo591a((MenuItem) itemData, (C0137m) C2575c.this.f7289C, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.c$b */
    class C2577b extends C3323a {
        C2577b() {
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            super.mo2349a(view, cVar);
            cVar.mo10747a((Object) C3349b.m13706a(1, C2575c.this.f7290D.mo635n().size(), false, 1));
        }
    }

    public C2575c(Context context) {
        this(context, null);
    }

    public C2575c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7298m = new C3320g(5);
        this.f7302q = 0;
        this.f7303r = 0;
        this.f7288B = new SparseArray<>(5);
        Resources resources = getResources();
        this.f7292g = resources.getDimensionPixelSize(C4408d.design_bottom_navigation_item_max_width);
        this.f7293h = resources.getDimensionPixelSize(C4408d.design_bottom_navigation_item_min_width);
        this.f7294i = resources.getDimensionPixelSize(C4408d.design_bottom_navigation_active_item_max_width);
        this.f7295j = resources.getDimensionPixelSize(C4408d.design_bottom_navigation_active_item_min_width);
        this.f7296k = resources.getDimensionPixelSize(C4408d.design_bottom_navigation_height);
        this.f7307v = mo8069a(16842808);
        C3563b bVar = new C3563b();
        this.f7291f = bVar;
        bVar.mo11401b(0);
        this.f7291f.mo11351a(115);
        this.f7291f.mo11352a((TimeInterpolator) new C3451b());
        this.f7291f.mo11400a((C3607m) new C2712h());
        this.f7297l = new C2576a();
        this.f7287A = new int[5];
        C3379v.m13788a((View) this, (C3323a) new C2577b());
        C3379v.m13820h(this, 1);
    }

    /* renamed from: a */
    private boolean m10427a(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m10429c(int i) {
        return i != -1;
    }

    /* renamed from: d */
    private void m10430d() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f7290D.size(); i++) {
            hashSet.add(Integer.valueOf(this.f7290D.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f7288B.size(); i2++) {
            int keyAt = this.f7288B.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f7288B.delete(keyAt);
            }
        }
    }

    private C2571a getNewItem() {
        C2571a aVar = (C2571a) this.f7298m.mo5387a();
        return aVar == null ? new C2571a(getContext()) : aVar;
    }

    private void setBadgeIfNeeded(C2571a aVar) {
        int id = aVar.getId();
        if (m10429c(id)) {
            C4428a aVar2 = (C4428a) this.f7288B.get(id);
            if (aVar2 != null) {
                aVar.setBadge(aVar2);
            }
        }
    }

    /* renamed from: a */
    public ColorStateList mo8069a(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList b = C3103a.m12556b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C3093a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = b.getDefaultColor();
        return new ColorStateList(new int[][]{f7286F, f7285E, ViewGroup.EMPTY_STATE_SET}, new int[]{b.getColorForState(f7286F, defaultColor), i2, defaultColor});
    }

    /* renamed from: a */
    public void mo8070a() {
        removeAllViews();
        C2571a[] aVarArr = this.f7301p;
        if (aVarArr != null) {
            for (C2571a aVar : aVarArr) {
                if (aVar != null) {
                    this.f7298m.mo5388a(aVar);
                    aVar.mo8048a();
                }
            }
        }
        if (this.f7290D.size() == 0) {
            this.f7302q = 0;
            this.f7303r = 0;
            this.f7301p = null;
            return;
        }
        m10430d();
        this.f7301p = new C2571a[this.f7290D.size()];
        boolean a = m10427a(this.f7300o, this.f7290D.mo635n().size());
        for (int i = 0; i < this.f7290D.size(); i++) {
            this.f7289C.mo8101b(true);
            this.f7290D.getItem(i).setCheckable(true);
            this.f7289C.mo8101b(false);
            C2571a newItem = getNewItem();
            this.f7301p[i] = newItem;
            newItem.setIconTintList(this.f7304s);
            newItem.setIconSize(this.f7305t);
            newItem.setTextColor(this.f7307v);
            newItem.setTextAppearanceInactive(this.f7308w);
            newItem.setTextAppearanceActive(this.f7309x);
            newItem.setTextColor(this.f7306u);
            Drawable drawable = this.f7310y;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f7311z);
            }
            newItem.setShifting(a);
            newItem.setLabelVisibilityMode(this.f7300o);
            newItem.mo416a((C0126i) this.f7290D.getItem(i), 0);
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.f7297l);
            if (this.f7302q != 0 && this.f7290D.getItem(i).getItemId() == this.f7302q) {
                this.f7303r = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f7290D.size() - 1, this.f7303r);
        this.f7303r = min;
        this.f7290D.getItem(min).setChecked(true);
    }

    /* renamed from: a */
    public void mo438a(C0122g gVar) {
        this.f7290D = gVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8071b(int i) {
        int size = this.f7290D.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f7290D.getItem(i2);
            if (i == item.getItemId()) {
                this.f7302q = i;
                this.f7303r = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: b */
    public boolean mo8072b() {
        return this.f7299n;
    }

    /* renamed from: c */
    public void mo8073c() {
        C0122g gVar = this.f7290D;
        if (!(gVar == null || this.f7301p == null)) {
            int size = gVar.size();
            if (size != this.f7301p.length) {
                mo8070a();
                return;
            }
            int i = this.f7302q;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f7290D.getItem(i2);
                if (item.isChecked()) {
                    this.f7302q = item.getItemId();
                    this.f7303r = i2;
                }
            }
            if (i != this.f7302q) {
                C3616o.m14726a(this, this.f7291f);
            }
            boolean a = m10427a(this.f7300o, this.f7290D.mo635n().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f7289C.mo8101b(true);
                this.f7301p[i3].setLabelVisibilityMode(this.f7300o);
                this.f7301p[i3].setShifting(a);
                this.f7301p[i3].mo416a((C0126i) this.f7290D.getItem(i3), 0);
                this.f7289C.mo8101b(false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public SparseArray<C4428a> getBadgeDrawables() {
        return this.f7288B;
    }

    public ColorStateList getIconTintList() {
        return this.f7304s;
    }

    public Drawable getItemBackground() {
        C2571a[] aVarArr = this.f7301p;
        return (aVarArr == null || aVarArr.length <= 0) ? this.f7310y : aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f7311z;
    }

    public int getItemIconSize() {
        return this.f7305t;
    }

    public int getItemTextAppearanceActive() {
        return this.f7309x;
    }

    public int getItemTextAppearanceInactive() {
        return this.f7308w;
    }

    public ColorStateList getItemTextColor() {
        return this.f7306u;
    }

    public int getLabelVisibilityMode() {
        return this.f7300o;
    }

    public int getSelectedItemId() {
        return this.f7302q;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C3379v.m13829p(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = this.f7290D.mo635n().size();
        int childCount = getChildCount();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f7296k, 1073741824);
        if (!m10427a(this.f7300o, size2) || !this.f7299n) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.f7294i);
            int i3 = size - (size2 * min);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getVisibility() != 8) {
                    int[] iArr = this.f7287A;
                    iArr[i4] = min;
                    if (i3 > 0) {
                        iArr[i4] = iArr[i4] + 1;
                        i3--;
                    }
                } else {
                    this.f7287A[i4] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f7303r);
            int i5 = this.f7295j;
            if (childAt.getVisibility() != 8) {
                childAt.measure(MeasureSpec.makeMeasureSpec(this.f7294i, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
                i5 = Math.max(i5, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f7293h * i6), Math.min(i5, this.f7294i));
            int i7 = size - min2;
            int min3 = Math.min(i7 / (i6 == 0 ? 1 : i6), this.f7292g);
            int i8 = i7 - (i6 * min3);
            int i9 = 0;
            while (i9 < childCount) {
                if (getChildAt(i9).getVisibility() != 8) {
                    this.f7287A[i9] = i9 == this.f7303r ? min2 : min3;
                    if (i8 > 0) {
                        int[] iArr2 = this.f7287A;
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.f7287A[i9] = 0;
                }
                i9++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(MeasureSpec.makeMeasureSpec(this.f7287A[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(this.f7296k, makeMeasureSpec, 0));
    }

    /* access modifiers changed from: 0000 */
    public void setBadgeDrawables(SparseArray<C4428a> sparseArray) {
        this.f7288B = sparseArray;
        C2571a[] aVarArr = this.f7301p;
        if (aVarArr != null) {
            for (C2571a aVar : aVarArr) {
                aVar.setBadge((C4428a) sparseArray.get(aVar.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f7304s = colorStateList;
        C2571a[] aVarArr = this.f7301p;
        if (aVarArr != null) {
            for (C2571a iconTintList : aVarArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f7310y = drawable;
        C2571a[] aVarArr = this.f7301p;
        if (aVarArr != null) {
            for (C2571a itemBackground : aVarArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f7311z = i;
        C2571a[] aVarArr = this.f7301p;
        if (aVarArr != null) {
            for (C2571a itemBackground : aVarArr) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f7299n = z;
    }

    public void setItemIconSize(int i) {
        this.f7305t = i;
        C2571a[] aVarArr = this.f7301p;
        if (aVarArr != null) {
            for (C2571a iconSize : aVarArr) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f7309x = i;
        C2571a[] aVarArr = this.f7301p;
        if (aVarArr != null) {
            for (C2571a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f7306u;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f7308w = i;
        C2571a[] aVarArr = this.f7301p;
        if (aVarArr != null) {
            for (C2571a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f7306u;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f7306u = colorStateList;
        C2571a[] aVarArr = this.f7301p;
        if (aVarArr != null) {
            for (C2571a textColor : aVarArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f7300o = i;
    }

    public void setPresenter(C2578d dVar) {
        this.f7289C = dVar;
    }
}
