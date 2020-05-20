package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0061a.C0062a;
import androidx.appcompat.view.menu.C0122g;
import androidx.appcompat.view.menu.C0122g.C0123a;
import androidx.appcompat.view.menu.C0126i;
import androidx.appcompat.view.menu.C0137m;
import androidx.appcompat.view.menu.C0137m.C0138a;
import androidx.appcompat.view.menu.C0146r;
import androidx.appcompat.widget.ActionMenuView.C0158e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p071f.p072a.C3093a;
import p071f.p072a.C3102j;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p072a.p079o.C3126c;
import p071f.p072a.p079o.C3131g;
import p071f.p097h.p108m.C3339d;
import p071f.p097h.p108m.C3364g;
import p071f.p097h.p108m.C3379v;
import p071f.p112j.p113a.C3400a;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f801A;

    /* renamed from: B */
    private int f802B;

    /* renamed from: C */
    private CharSequence f803C;

    /* renamed from: D */
    private CharSequence f804D;

    /* renamed from: E */
    private ColorStateList f805E;

    /* renamed from: F */
    private ColorStateList f806F;

    /* renamed from: G */
    private boolean f807G;

    /* renamed from: H */
    private boolean f808H;

    /* renamed from: I */
    private final ArrayList<View> f809I;

    /* renamed from: J */
    private final ArrayList<View> f810J;

    /* renamed from: K */
    private final int[] f811K;

    /* renamed from: L */
    C0183f f812L;

    /* renamed from: M */
    private final C0158e f813M;

    /* renamed from: N */
    private C0277u0 f814N;

    /* renamed from: O */
    private C0195c f815O;

    /* renamed from: P */
    private C0181d f816P;

    /* renamed from: Q */
    private C0138a f817Q;

    /* renamed from: R */
    private C0123a f818R;

    /* renamed from: S */
    private boolean f819S;

    /* renamed from: T */
    private final Runnable f820T;

    /* renamed from: f */
    private ActionMenuView f821f;

    /* renamed from: g */
    private TextView f822g;

    /* renamed from: h */
    private TextView f823h;

    /* renamed from: i */
    private ImageButton f824i;

    /* renamed from: j */
    private ImageView f825j;

    /* renamed from: k */
    private Drawable f826k;

    /* renamed from: l */
    private CharSequence f827l;

    /* renamed from: m */
    ImageButton f828m;

    /* renamed from: n */
    View f829n;

    /* renamed from: o */
    private Context f830o;

    /* renamed from: p */
    private int f831p;

    /* renamed from: q */
    private int f832q;

    /* renamed from: r */
    private int f833r;

    /* renamed from: s */
    int f834s;

    /* renamed from: t */
    private int f835t;

    /* renamed from: u */
    private int f836u;

    /* renamed from: v */
    private int f837v;

    /* renamed from: w */
    private int f838w;

    /* renamed from: x */
    private int f839x;

    /* renamed from: y */
    private C0240k0 f840y;

    /* renamed from: z */
    private int f841z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0178a implements C0158e {
        C0178a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C0183f fVar = Toolbar.this.f812L;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0179b implements Runnable {
        C0179b() {
        }

        public void run() {
            Toolbar.this.mo1194k();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0180c implements OnClickListener {
        C0180c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1152c();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0181d implements C0137m {

        /* renamed from: f */
        C0122g f845f;

        /* renamed from: g */
        C0126i f846g;

        C0181d() {
        }

        /* renamed from: a */
        public void mo513a(Context context, C0122g gVar) {
            C0122g gVar2 = this.f845f;
            if (gVar2 != null) {
                C0126i iVar = this.f846g;
                if (iVar != null) {
                    gVar2.mo593a(iVar);
                }
            }
            this.f845f = gVar;
        }

        /* renamed from: a */
        public void mo532a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo515a(C0122g gVar, boolean z) {
        }

        /* renamed from: a */
        public void mo517a(C0138a aVar) {
        }

        /* renamed from: a */
        public void mo518a(boolean z) {
            if (this.f846g != null) {
                C0122g gVar = this.f845f;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f845f.getItem(i) == this.f846g) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo521a(this.f845f, this.f846g);
                }
            }
        }

        /* renamed from: a */
        public boolean mo521a(C0122g gVar, C0126i iVar) {
            View view = Toolbar.this.f829n;
            if (view instanceof C3126c) {
                ((C3126c) view).mo778c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f829n);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f828m);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f829n = null;
            toolbar3.mo1144a();
            this.f846g = null;
            Toolbar.this.requestLayout();
            iVar.mo659a(false);
            return true;
        }

        /* renamed from: a */
        public boolean mo522a(C0146r rVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo524b(C0122g gVar, C0126i iVar) {
            Toolbar.this.mo1155e();
            ViewParent parent = Toolbar.this.f828m.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f828m);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f828m);
            }
            Toolbar.this.f829n = iVar.getActionView();
            this.f846g = iVar;
            ViewParent parent2 = Toolbar.this.f829n.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f829n);
                }
                C0182e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f218a = 8388611 | (toolbar4.f834s & 112);
                generateDefaultLayoutParams.f848b = 2;
                toolbar4.f829n.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f829n);
            }
            Toolbar.this.mo1193j();
            Toolbar.this.requestLayout();
            iVar.mo659a(true);
            View view = Toolbar.this.f829n;
            if (view instanceof C3126c) {
                ((C3126c) view).mo776a();
            }
            return true;
        }

        /* renamed from: d */
        public int mo525d() {
            return 0;
        }

        /* renamed from: f */
        public boolean mo545f() {
            return false;
        }

        /* renamed from: g */
        public Parcelable mo546g() {
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0182e extends C0062a {

        /* renamed from: b */
        int f848b;

        public C0182e(int i, int i2) {
            super(i, i2);
            this.f848b = 0;
            this.f218a = 8388627;
        }

        public C0182e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f848b = 0;
        }

        public C0182e(LayoutParams layoutParams) {
            super(layoutParams);
            this.f848b = 0;
        }

        public C0182e(MarginLayoutParams marginLayoutParams) {
            super((LayoutParams) marginLayoutParams);
            this.f848b = 0;
            mo1236a(marginLayoutParams);
        }

        public C0182e(C0062a aVar) {
            super(aVar);
            this.f848b = 0;
        }

        public C0182e(C0182e eVar) {
            super((C0062a) eVar);
            this.f848b = 0;
            this.f848b = eVar.f848b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1236a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0183f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0184g extends C3400a {
        public static final Creator<C0184g> CREATOR = new C0185a();

        /* renamed from: h */
        int f849h;

        /* renamed from: i */
        boolean f850i;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        static class C0185a implements ClassLoaderCreator<C0184g> {
            C0185a() {
            }

            public C0184g createFromParcel(Parcel parcel) {
                return new C0184g(parcel, null);
            }

            public C0184g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0184g(parcel, classLoader);
            }

            public C0184g[] newArray(int i) {
                return new C0184g[i];
            }
        }

        public C0184g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f849h = parcel.readInt();
            this.f850i = parcel.readInt() != 0;
        }

        public C0184g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f849h);
            parcel.writeInt(this.f850i ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3093a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f802B = 8388627;
        this.f809I = new ArrayList<>();
        this.f810J = new ArrayList<>();
        this.f811K = new int[2];
        this.f813M = new C0178a();
        this.f820T = new C0179b();
        C0275t0 a = C0275t0.m1311a(getContext(), attributeSet, C3102j.Toolbar, i, 0);
        this.f832q = a.mo1750g(C3102j.Toolbar_titleTextAppearance, 0);
        this.f833r = a.mo1750g(C3102j.Toolbar_subtitleTextAppearance, 0);
        this.f802B = a.mo1746e(C3102j.Toolbar_android_gravity, this.f802B);
        this.f834s = a.mo1746e(C3102j.Toolbar_buttonGravity, 48);
        int b = a.mo1740b(C3102j.Toolbar_titleMargin, 0);
        if (a.mo1751g(C3102j.Toolbar_titleMargins)) {
            b = a.mo1740b(C3102j.Toolbar_titleMargins, b);
        }
        this.f839x = b;
        this.f838w = b;
        this.f837v = b;
        this.f836u = b;
        int b2 = a.mo1740b(C3102j.Toolbar_titleMarginStart, -1);
        if (b2 >= 0) {
            this.f836u = b2;
        }
        int b3 = a.mo1740b(C3102j.Toolbar_titleMarginEnd, -1);
        if (b3 >= 0) {
            this.f837v = b3;
        }
        int b4 = a.mo1740b(C3102j.Toolbar_titleMarginTop, -1);
        if (b4 >= 0) {
            this.f838w = b4;
        }
        int b5 = a.mo1740b(C3102j.Toolbar_titleMarginBottom, -1);
        if (b5 >= 0) {
            this.f839x = b5;
        }
        this.f835t = a.mo1742c(C3102j.Toolbar_maxButtonHeight, -1);
        int b6 = a.mo1740b(C3102j.Toolbar_contentInsetStart, (int) RecyclerView.UNDEFINED_DURATION);
        int b7 = a.mo1740b(C3102j.Toolbar_contentInsetEnd, (int) RecyclerView.UNDEFINED_DURATION);
        int c = a.mo1742c(C3102j.Toolbar_contentInsetLeft, 0);
        int c2 = a.mo1742c(C3102j.Toolbar_contentInsetRight, 0);
        m927l();
        this.f840y.mo1532a(c, c2);
        if (!(b6 == Integer.MIN_VALUE && b7 == Integer.MIN_VALUE)) {
            this.f840y.mo1535b(b6, b7);
        }
        this.f841z = a.mo1740b(C3102j.Toolbar_contentInsetStartWithNavigation, (int) RecyclerView.UNDEFINED_DURATION);
        this.f801A = a.mo1740b(C3102j.Toolbar_contentInsetEndWithActions, (int) RecyclerView.UNDEFINED_DURATION);
        this.f826k = a.mo1741b(C3102j.Toolbar_collapseIcon);
        this.f827l = a.mo1747e(C3102j.Toolbar_collapseContentDescription);
        CharSequence e = a.mo1747e(C3102j.Toolbar_title);
        if (!TextUtils.isEmpty(e)) {
            setTitle(e);
        }
        CharSequence e2 = a.mo1747e(C3102j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e2)) {
            setSubtitle(e2);
        }
        this.f830o = getContext();
        setPopupTheme(a.mo1750g(C3102j.Toolbar_popupTheme, 0));
        Drawable b8 = a.mo1741b(C3102j.Toolbar_navigationIcon);
        if (b8 != null) {
            setNavigationIcon(b8);
        }
        CharSequence e3 = a.mo1747e(C3102j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e3)) {
            setNavigationContentDescription(e3);
        }
        Drawable b9 = a.mo1741b(C3102j.Toolbar_logo);
        if (b9 != null) {
            setLogo(b9);
        }
        CharSequence e4 = a.mo1747e(C3102j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e4)) {
            setLogoDescription(e4);
        }
        if (a.mo1751g(C3102j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo1735a(C3102j.Toolbar_titleTextColor));
        }
        if (a.mo1751g(C3102j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo1735a(C3102j.Toolbar_subtitleTextColor));
        }
        if (a.mo1751g(C3102j.Toolbar_menu)) {
            mo1145a(a.mo1750g(C3102j.Toolbar_menu, 0));
        }
        a.mo1737a();
    }

    /* renamed from: a */
    private int m913a(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return C3364g.m13720b(marginLayoutParams) + C3364g.m13718a(marginLayoutParams);
    }

    /* renamed from: a */
    private int m914a(View view, int i) {
        C0182e eVar = (C0182e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int c = m924c(eVar.f218a);
        if (c == 48) {
            return getPaddingTop() - i2;
        }
        if (c == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = eVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = eVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m915a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m916a(View view, int i, int[] iArr, int i2) {
        C0182e eVar = (C0182e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m914a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + eVar.rightMargin;
    }

    /* renamed from: a */
    private int m917a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = (View) list.get(i3);
            C0182e eVar = (C0182e) view.getLayoutParams();
            int i5 = eVar.leftMargin - i;
            int i6 = eVar.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = Math.max(0, -i6);
            i = max3;
        }
        return i4;
    }

    /* renamed from: a */
    private void m918a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private void m919a(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        C0182e eVar = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0182e) layoutParams;
        eVar.f848b = 1;
        if (!z || this.f829n == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.f810J.add(view);
    }

    /* renamed from: a */
    private void m920a(List<View> list, int i) {
        boolean z = C3379v.m13829p(this) == 1;
        int childCount = getChildCount();
        int a = C3339d.m13606a(i, C3379v.m13829p(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0182e eVar = (C0182e) childAt.getLayoutParams();
                if (eVar.f848b == 0 && m926d(childAt) && mo7967b(eVar.f218a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0182e eVar2 = (C0182e) childAt2.getLayoutParams();
            if (eVar2.f848b == 0 && m926d(childAt2) && mo7967b(eVar2.f218a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    private int mo7967b(int i) {
        int p = C3379v.m13829p(this);
        int a = C3339d.m13606a(i, p) & 7;
        if (a != 1) {
            int i2 = 3;
            if (!(a == 3 || a == 5)) {
                if (p == 1) {
                    i2 = 5;
                }
                return i2;
            }
        }
        return a;
    }

    /* renamed from: b */
    private int m922b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: b */
    private int m923b(View view, int i, int[] iArr, int i2) {
        C0182e eVar = (C0182e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m914a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: c */
    private int m924c(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f802B & 112;
    }

    /* renamed from: c */
    private boolean m925c(View view) {
        return view.getParent() == this || this.f810J.contains(view);
    }

    /* renamed from: d */
    private boolean m926d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private MenuInflater getMenuInflater() {
        return new C3131g(getContext());
    }

    /* renamed from: l */
    private void m927l() {
        if (this.f840y == null) {
            this.f840y = new C0240k0();
        }
    }

    /* renamed from: m */
    private void m928m() {
        if (this.f825j == null) {
            this.f825j = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: n */
    private void m929n() {
        m930o();
        if (this.f821f.mo960j() == null) {
            C0122g gVar = (C0122g) this.f821f.getMenu();
            if (this.f816P == null) {
                this.f816P = new C0181d();
            }
            this.f821f.setExpandedActionViewsExclusive(true);
            gVar.mo587a((C0137m) this.f816P, this.f830o);
        }
    }

    /* renamed from: o */
    private void m930o() {
        if (this.f821f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f821f = actionMenuView;
            actionMenuView.setPopupTheme(this.f831p);
            this.f821f.setOnMenuItemClickListener(this.f813M);
            this.f821f.mo943a(this.f817Q, this.f818R);
            C0182e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f218a = 8388613 | (this.f834s & 112);
            this.f821f.setLayoutParams(generateDefaultLayoutParams);
            m919a((View) this.f821f, false);
        }
    }

    /* renamed from: p */
    private void m931p() {
        if (this.f824i == null) {
            this.f824i = new AppCompatImageButton(getContext(), null, C3093a.toolbarNavigationButtonStyle);
            C0182e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f218a = 8388611 | (this.f834s & 112);
            this.f824i.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: q */
    private void m932q() {
        removeCallbacks(this.f820T);
        post(this.f820T);
    }

    /* renamed from: r */
    private boolean m933r() {
        if (!this.f819S) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m926d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1144a() {
        for (int size = this.f810J.size() - 1; size >= 0; size--) {
            addView((View) this.f810J.get(size));
        }
        this.f810J.clear();
    }

    /* renamed from: a */
    public void mo1145a(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: a */
    public void mo1146a(int i, int i2) {
        m927l();
        this.f840y.mo1535b(i, i2);
    }

    /* renamed from: a */
    public void mo1147a(Context context, int i) {
        this.f833r = i;
        TextView textView = this.f823h;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void mo1148a(C0122g gVar, C0195c cVar) {
        if (gVar != null || this.f821f != null) {
            m930o();
            C0122g j = this.f821f.mo960j();
            if (j != gVar) {
                if (j != null) {
                    j.mo606b((C0137m) this.f815O);
                    j.mo606b((C0137m) this.f816P);
                }
                if (this.f816P == null) {
                    this.f816P = new C0181d();
                }
                cVar.mo1292b(true);
                if (gVar != null) {
                    gVar.mo587a((C0137m) cVar, this.f830o);
                    gVar.mo587a((C0137m) this.f816P, this.f830o);
                } else {
                    cVar.mo513a(this.f830o, (C0122g) null);
                    this.f816P.mo513a(this.f830o, (C0122g) null);
                    cVar.mo518a(true);
                    this.f816P.mo518a(true);
                }
                this.f821f.setPopupTheme(this.f831p);
                this.f821f.setPresenter(cVar);
                this.f815O = cVar;
            }
        }
    }

    /* renamed from: a */
    public void mo1149a(C0138a aVar, C0123a aVar2) {
        this.f817Q = aVar;
        this.f818R = aVar2;
        ActionMenuView actionMenuView = this.f821f;
        if (actionMenuView != null) {
            actionMenuView.mo943a(aVar, aVar2);
        }
    }

    /* renamed from: b */
    public void mo1150b(Context context, int i) {
        this.f832q = i;
        TextView textView = this.f822g;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public boolean mo1151b() {
        if (getVisibility() == 0) {
            ActionMenuView actionMenuView = this.f821f;
            if (actionMenuView != null && actionMenuView.mo959i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo1152c() {
        C0181d dVar = this.f816P;
        C0126i iVar = dVar == null ? null : dVar.f846g;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0182e);
    }

    /* renamed from: d */
    public void mo1154d() {
        ActionMenuView actionMenuView = this.f821f;
        if (actionMenuView != null) {
            actionMenuView.mo945d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1155e() {
        if (this.f828m == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, C3093a.toolbarNavigationButtonStyle);
            this.f828m = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f826k);
            this.f828m.setContentDescription(this.f827l);
            C0182e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f218a = 8388611 | (this.f834s & 112);
            generateDefaultLayoutParams.f848b = 2;
            this.f828m.setLayoutParams(generateDefaultLayoutParams);
            this.f828m.setOnClickListener(new C0180c());
        }
    }

    /* renamed from: f */
    public boolean mo1156f() {
        C0181d dVar = this.f816P;
        return (dVar == null || dVar.f846g == null) ? false : true;
    }

    /* renamed from: g */
    public boolean mo1157g() {
        ActionMenuView actionMenuView = this.f821f;
        return actionMenuView != null && actionMenuView.mo949f();
    }

    /* access modifiers changed from: protected */
    public C0182e generateDefaultLayoutParams() {
        return new C0182e(-2, -2);
    }

    public C0182e generateLayoutParams(AttributeSet attributeSet) {
        return new C0182e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0182e generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0182e ? new C0182e((C0182e) layoutParams) : layoutParams instanceof C0062a ? new C0182e((C0062a) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0182e((MarginLayoutParams) layoutParams) : new C0182e(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f828m;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f828m;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0240k0 k0Var = this.f840y;
        if (k0Var != null) {
            return k0Var.mo1531a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f801A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0240k0 k0Var = this.f840y;
        if (k0Var != null) {
            return k0Var.mo1534b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0240k0 k0Var = this.f840y;
        if (k0Var != null) {
            return k0Var.mo1536c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0240k0 k0Var = this.f840y;
        if (k0Var != null) {
            return k0Var.mo1537d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f841z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f821f
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.mo960j()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f801A
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C3379v.m13829p(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C3379v.m13829p(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f841z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f825j;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f825j;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m929n();
        return this.f821f.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f824i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f824i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public C0195c getOuterActionMenuPresenter() {
        return this.f815O;
    }

    public Drawable getOverflowIcon() {
        m929n();
        return this.f821f.getOverflowIcon();
    }

    /* access modifiers changed from: 0000 */
    public Context getPopupContext() {
        return this.f830o;
    }

    public int getPopupTheme() {
        return this.f831p;
    }

    public CharSequence getSubtitle() {
        return this.f804D;
    }

    /* access modifiers changed from: 0000 */
    public final TextView getSubtitleTextView() {
        return this.f823h;
    }

    public CharSequence getTitle() {
        return this.f803C;
    }

    public int getTitleMarginBottom() {
        return this.f839x;
    }

    public int getTitleMarginEnd() {
        return this.f837v;
    }

    public int getTitleMarginStart() {
        return this.f836u;
    }

    public int getTitleMarginTop() {
        return this.f838w;
    }

    /* access modifiers changed from: 0000 */
    public final TextView getTitleTextView() {
        return this.f822g;
    }

    public C0292z getWrapper() {
        if (this.f814N == null) {
            this.f814N = new C0277u0(this, true);
        }
        return this.f814N;
    }

    /* renamed from: h */
    public boolean mo1191h() {
        ActionMenuView actionMenuView = this.f821f;
        return actionMenuView != null && actionMenuView.mo950g();
    }

    /* renamed from: i */
    public boolean mo1192i() {
        ActionMenuView actionMenuView = this.f821f;
        return actionMenuView != null && actionMenuView.mo958h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1193j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0182e) childAt.getLayoutParams()).f848b == 2 || childAt == this.f821f)) {
                removeViewAt(childCount);
                this.f810J.add(childAt);
            }
        }
    }

    /* renamed from: k */
    public boolean mo1194k() {
        ActionMenuView actionMenuView = this.f821f;
        return actionMenuView != null && actionMenuView.mo961k();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f820T);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f808H = false;
        }
        if (!this.f808H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f808H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f808H = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0299 A[LOOP:0: B:106:0x0297->B:107:0x0299, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02bb A[LOOP:1: B:109:0x02b9->B:110:0x02bb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f4 A[LOOP:2: B:117:0x02f2->B:118:0x02f4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = p071f.p097h.p108m.C3379v.m13829p(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f811K
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p071f.p097h.p108m.C3379v.m13830q(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f824i
            boolean r13 = r0.m926d(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.f824i
            if (r1 == 0) goto L_0x004e
            int r13 = r0.m923b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.m916a(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.f828m
            boolean r15 = r0.m926d(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f828m
            if (r1 == 0) goto L_0x0066
            int r14 = r0.m923b(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.m916a(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f821f
            boolean r15 = r0.m926d(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f821f
            if (r1 == 0) goto L_0x007b
            int r13 = r0.m916a(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.m923b(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f829n
            boolean r13 = r0.m926d(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.f829n
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.m923b(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.m916a(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.f825j
            boolean r13 = r0.m926d(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.f825j
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.m923b(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.m916a(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.f822g
            boolean r13 = r0.m926d(r13)
            android.widget.TextView r14 = r0.f823h
            boolean r14 = r0.m926d(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.f822g
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0182e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f822g
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x00f9
        L_0x00f6:
            r23 = r7
            r3 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r7 = r0.f823h
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0182e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f823h
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0121
            if (r14 == 0) goto L_0x011a
            goto L_0x0121
        L_0x011a:
            r18 = r6
            r22 = r12
        L_0x011e:
            r1 = 0
            goto L_0x028a
        L_0x0121:
            if (r13 == 0) goto L_0x0126
            android.widget.TextView r4 = r0.f822g
            goto L_0x0128
        L_0x0126:
            android.widget.TextView r4 = r0.f823h
        L_0x0128:
            if (r14 == 0) goto L_0x012d
            android.widget.TextView r7 = r0.f823h
            goto L_0x012f
        L_0x012d:
            android.widget.TextView r7 = r0.f822g
        L_0x012f:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0182e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0182e) r7
            if (r13 == 0) goto L_0x0145
            android.widget.TextView r15 = r0.f822g
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014f
        L_0x0145:
            if (r14 == 0) goto L_0x0152
            android.widget.TextView r15 = r0.f823h
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0152
        L_0x014f:
            r17 = 1
            goto L_0x0154
        L_0x0152:
            r17 = 0
        L_0x0154:
            int r15 = r0.f802B
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019c
            r6 = 80
            if (r15 == r6) goto L_0x018e
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f838w
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0177
            int r6 = r15 + r12
            goto L_0x018c
        L_0x0177:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f839x
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018c
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018c:
            int r8 = r8 + r6
            goto L_0x01ab
        L_0x018e:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f839x
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01ab
        L_0x019c:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f838w
            int r8 = r2 + r3
        L_0x01ab:
            if (r1 == 0) goto L_0x021f
            if (r17 == 0) goto L_0x01b2
            int r1 = r0.f836u
            goto L_0x01b3
        L_0x01b2:
            r1 = 0
        L_0x01b3:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ea
            android.widget.TextView r1 = r0.f822g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0182e) r1
            android.widget.TextView r2 = r0.f822g
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f822g
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f822g
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f837v
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01eb
        L_0x01ea:
            r2 = r10
        L_0x01eb:
            if (r14 == 0) goto L_0x0213
            android.widget.TextView r1 = r0.f823h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0182e) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f823h
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f823h
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f823h
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f837v
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0214
        L_0x0213:
            r3 = r10
        L_0x0214:
            if (r17 == 0) goto L_0x021b
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x021b:
            r2 = r24
            goto L_0x011e
        L_0x021f:
            if (r17 == 0) goto L_0x0225
            int r7 = r0.f836u
            r1 = 0
            goto L_0x0227
        L_0x0225:
            r1 = 0
            r7 = 0
        L_0x0227:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x025c
            android.widget.TextView r3 = r0.f822g
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0182e) r3
            android.widget.TextView r4 = r0.f822g
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f822g
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f822g
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f837v
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x025d
        L_0x025c:
            r4 = r2
        L_0x025d:
            if (r14 == 0) goto L_0x0283
            android.widget.TextView r3 = r0.f823h
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0182e) r3
            int r5 = r3.topMargin
            int r8 = r8 + r5
            android.widget.TextView r5 = r0.f823h
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r2
            android.widget.TextView r6 = r0.f823h
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r8
            android.widget.TextView r7 = r0.f823h
            r7.layout(r2, r8, r5, r6)
            int r6 = r0.f837v
            int r5 = r5 + r6
            int r3 = r3.bottomMargin
            goto L_0x0284
        L_0x0283:
            r5 = r2
        L_0x0284:
            if (r17 == 0) goto L_0x028a
            int r2 = java.lang.Math.max(r4, r5)
        L_0x028a:
            java.util.ArrayList<android.view.View> r3 = r0.f809I
            r4 = 3
            r0.m920a(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f809I
            int r3 = r3.size()
            r7 = 0
        L_0x0297:
            if (r7 >= r3) goto L_0x02aa
            java.util.ArrayList<android.view.View> r4 = r0.f809I
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.m916a(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x0297
        L_0x02aa:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.f809I
            r4 = 5
            r0.m920a(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f809I
            int r3 = r3.size()
            r7 = 0
        L_0x02b9:
            if (r7 >= r3) goto L_0x02ca
            java.util.ArrayList<android.view.View> r4 = r0.f809I
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m923b(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02b9
        L_0x02ca:
            java.util.ArrayList<android.view.View> r3 = r0.f809I
            r4 = 1
            r0.m920a(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f809I
            int r3 = r0.m917a(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02e5
            goto L_0x02ec
        L_0x02e5:
            if (r3 <= r10) goto L_0x02eb
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02ec
        L_0x02eb:
            r2 = r6
        L_0x02ec:
            java.util.ArrayList<android.view.View> r3 = r0.f809I
            int r3 = r3.size()
        L_0x02f2:
            if (r1 >= r3) goto L_0x0303
            java.util.ArrayList<android.view.View> r4 = r0.f809I
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.m916a(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02f2
        L_0x0303:
            java.util.ArrayList<android.view.View> r1 = r0.f809I
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f811K;
        int i10 = 0;
        if (C0293z0.m1487a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m926d(this.f824i)) {
            m918a((View) this.f824i, i, 0, i2, 0, this.f835t);
            i5 = this.f824i.getMeasuredWidth() + m913a((View) this.f824i);
            i4 = Math.max(0, this.f824i.getMeasuredHeight() + m922b((View) this.f824i));
            i3 = View.combineMeasuredStates(0, this.f824i.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m926d(this.f828m)) {
            m918a((View) this.f828m, i, 0, i2, 0, this.f835t);
            i5 = this.f828m.getMeasuredWidth() + m913a((View) this.f828m);
            i4 = Math.max(i4, this.f828m.getMeasuredHeight() + m922b((View) this.f828m));
            i3 = View.combineMeasuredStates(i3, this.f828m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m926d(this.f821f)) {
            m918a((View) this.f821f, i, max, i2, 0, this.f835t);
            i6 = this.f821f.getMeasuredWidth() + m913a((View) this.f821f);
            i4 = Math.max(i4, this.f821f.getMeasuredHeight() + m922b((View) this.f821f));
            i3 = View.combineMeasuredStates(i3, this.f821f.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m926d(this.f829n)) {
            max2 += m915a(this.f829n, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f829n.getMeasuredHeight() + m922b(this.f829n));
            i3 = View.combineMeasuredStates(i3, this.f829n.getMeasuredState());
        }
        if (m926d(this.f825j)) {
            max2 += m915a((View) this.f825j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f825j.getMeasuredHeight() + m922b((View) this.f825j));
            i3 = View.combineMeasuredStates(i3, this.f825j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0182e) childAt.getLayoutParams()).f848b == 0 && m926d(childAt)) {
                max2 += m915a(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m922b(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f838w + this.f839x;
        int i13 = this.f836u + this.f837v;
        if (m926d(this.f822g)) {
            m915a((View) this.f822g, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f822g.getMeasuredWidth() + m913a((View) this.f822g);
            i7 = this.f822g.getMeasuredHeight() + m922b((View) this.f822g);
            i9 = View.combineMeasuredStates(i3, this.f822g.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m926d(this.f823h)) {
            int i14 = i7 + i12;
            int i15 = i9;
            i8 = Math.max(i8, m915a((View) this.f823h, i, max2 + i13, i2, i14, iArr));
            i7 += this.f823h.getMeasuredHeight() + m922b((View) this.f823h);
            i9 = View.combineMeasuredStates(i15, this.f823h.getMeasuredState());
        } else {
            int i16 = i9;
        }
        int i17 = max2 + i8;
        int max3 = Math.max(i4, i7) + getPaddingTop() + getPaddingBottom();
        int i18 = i;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(i17 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i18, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!m933r()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0184g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0184g gVar = (C0184g) parcelable;
        super.onRestoreInstanceState(gVar.mo10880a());
        ActionMenuView actionMenuView = this.f821f;
        C0122g j = actionMenuView != null ? actionMenuView.mo960j() : null;
        int i = gVar.f849h;
        if (!(i == 0 || this.f816P == null || j == null)) {
            MenuItem findItem = j.findItem(i);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (gVar.f850i) {
            m932q();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m927l();
        C0240k0 k0Var = this.f840y;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        k0Var.mo1533a(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0184g gVar = new C0184g(super.onSaveInstanceState());
        C0181d dVar = this.f816P;
        if (dVar != null) {
            C0126i iVar = dVar.f846g;
            if (iVar != null) {
                gVar.f849h = iVar.getItemId();
            }
        }
        gVar.f850i = mo1192i();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f807G = false;
        }
        if (!this.f807G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f807G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f807G = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1155e();
        }
        ImageButton imageButton = this.f828m;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C3103a.m12557c(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1155e();
            this.f828m.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f828m;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f826k);
        }
    }

    public void setCollapsible(boolean z) {
        this.f819S = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f801A) {
            this.f801A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f841z) {
            this.f841z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C3103a.m12557c(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m928m();
            if (!m925c((View) this.f825j)) {
                m919a((View) this.f825j, true);
            }
        } else {
            ImageView imageView = this.f825j;
            if (imageView != null && m925c((View) imageView)) {
                removeView(this.f825j);
                this.f810J.remove(this.f825j);
            }
        }
        ImageView imageView2 = this.f825j;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m928m();
        }
        ImageView imageView = this.f825j;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m931p();
        }
        ImageButton imageButton = this.f824i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C3103a.m12557c(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m931p();
            if (!m925c((View) this.f824i)) {
                m919a((View) this.f824i, true);
            }
        } else {
            ImageButton imageButton = this.f824i;
            if (imageButton != null && m925c((View) imageButton)) {
                removeView(this.f824i);
                this.f810J.remove(this.f824i);
            }
        }
        ImageButton imageButton2 = this.f824i;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        m931p();
        this.f824i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0183f fVar) {
        this.f812L = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m929n();
        this.f821f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f831p != i) {
            this.f831p = i;
            if (i == 0) {
                this.f830o = getContext();
            } else {
                this.f830o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f823h == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f823h = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f823h.setEllipsize(TruncateAt.END);
                int i = this.f833r;
                if (i != 0) {
                    this.f823h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f806F;
                if (colorStateList != null) {
                    this.f823h.setTextColor(colorStateList);
                }
            }
            if (!m925c((View) this.f823h)) {
                m919a((View) this.f823h, true);
            }
        } else {
            TextView textView = this.f823h;
            if (textView != null && m925c((View) textView)) {
                removeView(this.f823h);
                this.f810J.remove(this.f823h);
            }
        }
        TextView textView2 = this.f823h;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f804D = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f806F = colorStateList;
        TextView textView = this.f823h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f822g == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f822g = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f822g.setEllipsize(TruncateAt.END);
                int i = this.f832q;
                if (i != 0) {
                    this.f822g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f805E;
                if (colorStateList != null) {
                    this.f822g.setTextColor(colorStateList);
                }
            }
            if (!m925c((View) this.f822g)) {
                m919a((View) this.f822g, true);
            }
        } else {
            TextView textView = this.f822g;
            if (textView != null && m925c((View) textView)) {
                removeView(this.f822g);
                this.f810J.remove(this.f822g);
            }
        }
        TextView textView2 = this.f822g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f803C = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f839x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f837v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f836u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f838w = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f805E = colorStateList;
        TextView textView = this.f822g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
