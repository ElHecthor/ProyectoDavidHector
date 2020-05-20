package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0122g;
import androidx.appcompat.view.menu.C0122g.C0123a;
import androidx.appcompat.view.menu.C0122g.C0124b;
import androidx.appcompat.view.menu.C0126i;
import androidx.appcompat.view.menu.C0137m;
import androidx.appcompat.view.menu.C0137m.C0138a;
import androidx.appcompat.view.menu.C0139n;
import androidx.appcompat.widget.C0212e0.C0213a;
import androidx.recyclerview.widget.RecyclerView;

public class ActionMenuView extends C0212e0 implements C0124b, C0139n {

    /* renamed from: A */
    C0123a f683A;

    /* renamed from: B */
    private boolean f684B;

    /* renamed from: C */
    private int f685C;

    /* renamed from: D */
    private int f686D;

    /* renamed from: E */
    private int f687E;

    /* renamed from: F */
    C0158e f688F;

    /* renamed from: u */
    private C0122g f689u;

    /* renamed from: v */
    private Context f690v;

    /* renamed from: w */
    private int f691w;

    /* renamed from: x */
    private boolean f692x;

    /* renamed from: y */
    private C0195c f693y;

    /* renamed from: z */
    private C0138a f694z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0154a {
        /* renamed from: a */
        boolean mo417a();

        /* renamed from: c */
        boolean mo419c();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0155b implements C0138a {
        C0155b() {
        }

        /* renamed from: a */
        public void mo332a(C0122g gVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo333a(C0122g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0156c extends C0213a {
        @ExportedProperty

        /* renamed from: c */
        public boolean f695c;
        @ExportedProperty

        /* renamed from: d */
        public int f696d;
        @ExportedProperty

        /* renamed from: e */
        public int f697e;
        @ExportedProperty

        /* renamed from: f */
        public boolean f698f;
        @ExportedProperty

        /* renamed from: g */
        public boolean f699g;

        /* renamed from: h */
        boolean f700h;

        public C0156c(int i, int i2) {
            super(i, i2);
            this.f695c = false;
        }

        public C0156c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0156c(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0156c(C0156c cVar) {
            super(cVar);
            this.f695c = cVar.f695c;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0157d implements C0123a {
        C0157d() {
        }

        /* renamed from: a */
        public void mo297a(C0122g gVar) {
            C0123a aVar = ActionMenuView.this.f683A;
            if (aVar != null) {
                aVar.mo297a(gVar);
            }
        }

        /* renamed from: a */
        public boolean mo300a(C0122g gVar, MenuItem menuItem) {
            C0158e eVar = ActionMenuView.this.f688F;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0158e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f686D = (int) (56.0f * f);
        this.f687E = (int) (f * 4.0f);
        this.f690v = context;
        this.f691w = 0;
    }

    /* renamed from: a */
    static int m833a(View view, int i, int i2, int i3, int i4) {
        C0156c cVar = (C0156c) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo420d();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f695c || !z2) {
            z = false;
        }
        cVar.f698f = z;
        cVar.f696d = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: c */
    private void m834c(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f686D;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z5 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z6) {
                    int i19 = this.f687E;
                    i6 = i18;
                    z4 = false;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    z4 = false;
                }
                C0156c cVar = (C0156c) childAt.getLayoutParams();
                cVar.f700h = z4;
                cVar.f697e = z4 ? 1 : 0;
                cVar.f696d = z4;
                cVar.f698f = z4;
                cVar.leftMargin = z4;
                cVar.rightMargin = z4;
                cVar.f699g = z6 && ((ActionMenuItemView) childAt).mo420d();
                int a = m833a(childAt, i11, cVar.f695c ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, a);
                if (cVar.f698f) {
                    i16++;
                }
                if (cVar.f695c) {
                    z5 = true;
                }
                i9 -= a;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (a == 1) {
                    j |= (long) (1 << i13);
                    i12 = i12;
                } else {
                    int i20 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i21 = size2;
        boolean z7 = z5 && i14 == 2;
        boolean z8 = false;
        while (true) {
            if (i16 <= 0 || i9 <= 0) {
                i5 = mode;
                i3 = i7;
                z = z8;
                i4 = i12;
            } else {
                int i22 = 0;
                int i23 = 0;
                int i24 = Integer.MAX_VALUE;
                long j2 = 0;
                while (i23 < childCount) {
                    boolean z9 = z8;
                    C0156c cVar2 = (C0156c) getChildAt(i23).getLayoutParams();
                    int i25 = i12;
                    if (cVar2.f698f) {
                        int i26 = cVar2.f696d;
                        if (i26 < i24) {
                            j2 = 1 << i23;
                            i24 = i26;
                            i22 = 1;
                        } else if (i26 == i24) {
                            i22++;
                            j2 |= 1 << i23;
                        }
                    }
                    i23++;
                    i12 = i25;
                    z8 = z9;
                }
                z = z8;
                i4 = i12;
                j |= j2;
                if (i22 > i9) {
                    i5 = mode;
                    i3 = i7;
                    break;
                }
                int i27 = i24 + 1;
                int i28 = 0;
                while (i28 < childCount) {
                    View childAt2 = getChildAt(i28);
                    C0156c cVar3 = (C0156c) childAt2.getLayoutParams();
                    int i29 = i7;
                    int i30 = mode;
                    long j3 = (long) (1 << i28);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f696d == i27) {
                            j |= j3;
                        }
                        z3 = z7;
                    } else {
                        if (!z7 || !cVar3.f699g || i9 != 1) {
                            z3 = z7;
                        } else {
                            int i31 = this.f687E;
                            z3 = z7;
                            childAt2.setPadding(i31 + i11, 0, i31, 0);
                        }
                        cVar3.f696d++;
                        cVar3.f700h = true;
                        i9--;
                    }
                    i28++;
                    mode = i30;
                    i7 = i29;
                    z7 = z3;
                }
                i12 = i4;
                z8 = true;
            }
        }
        boolean z10 = !z5 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z10 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C0156c) getChildAt(0).getLayoutParams()).f699g) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & ((long) (1 << i32))) != 0 && !((C0156c) getChildAt(i32).getLayoutParams()).f699g) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) (((float) (i9 * i11)) / bitCount) : 0;
            z2 = z;
            for (int i34 = 0; i34 < childCount; i34++) {
                if ((j & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    C0156c cVar4 = (C0156c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f697e = i33;
                        cVar4.f700h = true;
                        if (i34 == 0 && !cVar4.f699g) {
                            cVar4.leftMargin = (-i33) / 2;
                        }
                    } else if (cVar4.f695c) {
                        cVar4.f697e = i33;
                        cVar4.f700h = true;
                        cVar4.rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            cVar4.leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            cVar4.rightMargin = i33 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                C0156c cVar5 = (C0156c) childAt4.getLayoutParams();
                if (cVar5.f700h) {
                    childAt4.measure(MeasureSpec.makeMeasureSpec((cVar5.f696d * i11) + cVar5.f697e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i21);
    }

    /* renamed from: a */
    public void mo438a(C0122g gVar) {
        this.f689u = gVar;
    }

    /* renamed from: a */
    public void mo943a(C0138a aVar, C0123a aVar2) {
        this.f694z = aVar;
        this.f683A = aVar2;
    }

    /* renamed from: a */
    public boolean mo439a(C0126i iVar) {
        return this.f689u.mo590a((MenuItem) iVar, 0);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0156c;
    }

    /* renamed from: d */
    public void mo945d() {
        C0195c cVar = this.f693y;
        if (cVar != null) {
            cVar.mo1293b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo946d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0154a)) {
            z = false | ((C0154a) childAt).mo417a();
        }
        if (i > 0 && (childAt2 instanceof C0154a)) {
            z |= ((C0154a) childAt2).mo419c();
        }
        return z;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public C0156c mo948e() {
        C0156c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f695c = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: f */
    public boolean mo949f() {
        C0195c cVar = this.f693y;
        return cVar != null && cVar.mo1296e();
    }

    /* renamed from: g */
    public boolean mo950g() {
        C0195c cVar = this.f693y;
        return cVar != null && cVar.mo1298i();
    }

    /* access modifiers changed from: protected */
    public C0156c generateDefaultLayoutParams() {
        C0156c cVar = new C0156c(-2, -2);
        cVar.f953b = 16;
        return cVar;
    }

    public C0156c generateLayoutParams(AttributeSet attributeSet) {
        return new C0156c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0156c generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0156c cVar = layoutParams instanceof C0156c ? new C0156c((C0156c) layoutParams) : new C0156c(layoutParams);
        if (cVar.f953b <= 0) {
            cVar.f953b = 16;
        }
        return cVar;
    }

    public Menu getMenu() {
        if (this.f689u == null) {
            Context context = getContext();
            C0122g gVar = new C0122g(context);
            this.f689u = gVar;
            gVar.mo585a((C0123a) new C0157d());
            C0195c cVar = new C0195c(context);
            this.f693y = cVar;
            cVar.mo1295c(true);
            C0195c cVar2 = this.f693y;
            C0138a aVar = this.f694z;
            if (aVar == null) {
                aVar = new C0155b();
            }
            cVar2.mo517a(aVar);
            this.f689u.mo587a((C0137m) this.f693y, this.f690v);
            this.f693y.mo1291a(this);
        }
        return this.f689u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f693y.mo1294c();
    }

    public int getPopupTheme() {
        return this.f691w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public boolean mo958h() {
        C0195c cVar = this.f693y;
        return cVar != null && cVar.mo1299j();
    }

    /* renamed from: i */
    public boolean mo959i() {
        return this.f692x;
    }

    /* renamed from: j */
    public C0122g mo960j() {
        return this.f689u;
    }

    /* renamed from: k */
    public boolean mo961k() {
        C0195c cVar = this.f693y;
        return cVar != null && cVar.mo1300k();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0195c cVar = this.f693y;
        if (cVar != null) {
            cVar.mo518a(false);
            if (this.f693y.mo1299j()) {
                this.f693y.mo1296e();
                this.f693y.mo1300k();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo945d();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f684B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0293z0.m1487a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0156c cVar = (C0156c) childAt.getLayoutParams();
                if (cVar.f695c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo946d(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    boolean d = mo946d(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0156c cVar2 = (C0156c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f695c) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
        } else {
            int paddingLeft = getPaddingLeft();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt4 = getChildAt(i19);
                C0156c cVar3 = (C0156c) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !cVar3.f695c) {
                    int i20 = paddingLeft + cVar3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i21 = i7 - (measuredHeight4 / 2);
                    childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                    paddingLeft = i20 + measuredWidth4 + cVar3.rightMargin + max;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z = this.f684B;
        boolean z2 = MeasureSpec.getMode(i) == 1073741824;
        this.f684B = z2;
        if (z != z2) {
            this.f685C = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (this.f684B) {
            C0122g gVar = this.f689u;
            if (!(gVar == null || size == this.f685C)) {
                this.f685C = size;
                gVar.mo607b(true);
            }
        }
        int childCount = getChildCount();
        if (!this.f684B || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0156c cVar = (C0156c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m834c(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f693y.mo1292b(z);
    }

    public void setOnMenuItemClickListener(C0158e eVar) {
        this.f688F = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f693y.mo1290a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f692x = z;
    }

    public void setPopupTheme(int i) {
        if (this.f691w != i) {
            this.f691w = i;
            if (i == 0) {
                this.f690v = getContext();
            } else {
                this.f690v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0195c cVar) {
        this.f693y = cVar;
        cVar.mo1291a(this);
    }
}
