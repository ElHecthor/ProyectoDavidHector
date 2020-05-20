package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.graphics.drawable.C0371a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p071f.p096g.C3229a;
import p071f.p096g.C3230b;
import p071f.p096g.C3231c;
import p071f.p097h.p098e.C3236a;
import p071f.p097h.p107l.C3316c;
import p071f.p097h.p107l.C3318e;
import p071f.p097h.p107l.C3320g;
import p071f.p097h.p108m.C3339d;
import p071f.p097h.p108m.C3343e0;
import p071f.p097h.p108m.C3371n;
import p071f.p097h.p108m.C3372o;
import p071f.p097h.p108m.C3374q;
import p071f.p097h.p108m.C3375r;
import p071f.p097h.p108m.C3379v;
import p071f.p112j.p113a.C3400a;

public class CoordinatorLayout extends ViewGroup implements C3371n, C3372o {

    /* renamed from: A */
    static final Class<?>[] f1564A = {Context.class, AttributeSet.class};

    /* renamed from: B */
    static final ThreadLocal<Map<String, Constructor<C0332c>>> f1565B = new ThreadLocal<>();

    /* renamed from: C */
    static final Comparator<View> f1566C;

    /* renamed from: D */
    private static final C3318e<Rect> f1567D = new C3320g(12);

    /* renamed from: z */
    static final String f1568z;

    /* renamed from: f */
    private final List<View> f1569f;

    /* renamed from: g */
    private final C0340a<View> f1570g;

    /* renamed from: h */
    private final List<View> f1571h;

    /* renamed from: i */
    private final List<View> f1572i;

    /* renamed from: j */
    private Paint f1573j;

    /* renamed from: k */
    private final int[] f1574k;

    /* renamed from: l */
    private final int[] f1575l;

    /* renamed from: m */
    private boolean f1576m;

    /* renamed from: n */
    private boolean f1577n;

    /* renamed from: o */
    private int[] f1578o;

    /* renamed from: p */
    private View f1579p;

    /* renamed from: q */
    private View f1580q;

    /* renamed from: r */
    private C0336g f1581r;

    /* renamed from: s */
    private boolean f1582s;

    /* renamed from: t */
    private C3343e0 f1583t;

    /* renamed from: u */
    private boolean f1584u;

    /* renamed from: v */
    private Drawable f1585v;

    /* renamed from: w */
    OnHierarchyChangeListener f1586w;

    /* renamed from: x */
    private C3375r f1587x;

    /* renamed from: y */
    private final C3374q f1588y;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0330a implements C3375r {
        C0330a() {
        }

        /* renamed from: a */
        public C3343e0 mo325a(View view, C3343e0 e0Var) {
            CoordinatorLayout.this.mo2044a(e0Var);
            return e0Var;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0331b {
        C0332c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0332c<V extends View> {
        public C0332c() {
        }

        public C0332c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public C3343e0 mo2093a(CoordinatorLayout coordinatorLayout, V v, C3343e0 e0Var) {
            return e0Var;
        }

        /* renamed from: a */
        public void mo2094a() {
        }

        /* renamed from: a */
        public void mo2095a(C0335f fVar) {
        }

        /* renamed from: a */
        public void mo2096a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo2097a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo2122d(coordinatorLayout, v, view);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo2098a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo2099a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo2098a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo2100a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo2099a(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: a */
        public void mo2101a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: a */
        public void mo2102a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo2101a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo2103a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: a */
        public void mo2104a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo2103a(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: a */
        public boolean mo2105a(CoordinatorLayout coordinatorLayout, V v) {
            return mo2119c(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: a */
        public boolean mo2106a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2107a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2108a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2109a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2110a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2111a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2112a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2113a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: b */
        public int mo2114b(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: b */
        public boolean mo2115b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo2116b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        @Deprecated
        /* renamed from: b */
        public boolean mo2117b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo2118b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo2117b(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: c */
        public float mo2119c(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: c */
        public void mo2120c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: d */
        public Parcelable mo2121d(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: d */
        public void mo2122d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0333d {
        Class<? extends C0332c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class C0334e implements OnHierarchyChangeListener {
        C0334e() {
        }

        public void onChildViewAdded(View view, View view2) {
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1586w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo2046a(2);
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1586w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0335f extends MarginLayoutParams {

        /* renamed from: a */
        C0332c f1591a;

        /* renamed from: b */
        boolean f1592b = false;

        /* renamed from: c */
        public int f1593c = 0;

        /* renamed from: d */
        public int f1594d = 0;

        /* renamed from: e */
        public int f1595e = -1;

        /* renamed from: f */
        int f1596f = -1;

        /* renamed from: g */
        public int f1597g = 0;

        /* renamed from: h */
        public int f1598h = 0;

        /* renamed from: i */
        int f1599i;

        /* renamed from: j */
        int f1600j;

        /* renamed from: k */
        View f1601k;

        /* renamed from: l */
        View f1602l;

        /* renamed from: m */
        private boolean f1603m;

        /* renamed from: n */
        private boolean f1604n;

        /* renamed from: o */
        private boolean f1605o;

        /* renamed from: p */
        private boolean f1606p;

        /* renamed from: q */
        final Rect f1607q = new Rect();

        public C0335f(int i, int i2) {
            super(i, i2);
        }

        C0335f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3231c.CoordinatorLayout_Layout);
            this.f1593c = obtainStyledAttributes.getInteger(C3231c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f1596f = obtainStyledAttributes.getResourceId(C3231c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f1594d = obtainStyledAttributes.getInteger(C3231c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f1595e = obtainStyledAttributes.getInteger(C3231c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f1597g = obtainStyledAttributes.getInt(C3231c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f1598h = obtainStyledAttributes.getInt(C3231c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(C3231c.CoordinatorLayout_Layout_layout_behavior);
            this.f1592b = hasValue;
            if (hasValue) {
                this.f1591a = CoordinatorLayout.m1662a(context, attributeSet, obtainStyledAttributes.getString(C3231c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            C0332c cVar = this.f1591a;
            if (cVar != null) {
                cVar.mo2095a(this);
            }
        }

        public C0335f(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0335f(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0335f(C0335f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        private void m1739a(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f1596f);
            this.f1601k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f1602l = findViewById;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find CoordinatorLayout descendant view with id ");
                sb.append(coordinatorLayout.getResources().getResourceName(this.f1596f));
                sb.append(" to anchor view ");
                sb.append(view);
                throw new IllegalStateException(sb.toString());
            }
            this.f1602l = null;
            this.f1601k = null;
        }

        /* renamed from: a */
        private boolean m1740a(View view, int i) {
            int a = C3339d.m13606a(((C0335f) view.getLayoutParams()).f1597g, i);
            return a != 0 && (C3339d.m13606a(this.f1598h, i) & a) == a;
        }

        /* renamed from: b */
        private boolean m1741b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1601k.getId() != this.f1596f) {
                return false;
            }
            View view2 = this.f1601k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1602l = null;
                    this.f1601k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f1602l = view2;
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo2126a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1596f == -1) {
                this.f1602l = null;
                this.f1601k = null;
                return null;
            }
            if (this.f1601k == null || !m1741b(view, coordinatorLayout)) {
                m1739a(view, coordinatorLayout);
            }
            return this.f1601k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2127a(int i, boolean z) {
            if (i == 0) {
                this.f1604n = z;
            } else if (i == 1) {
                this.f1605o = z;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2128a(Rect rect) {
            this.f1607q.set(rect);
        }

        /* renamed from: a */
        public void mo2129a(C0332c cVar) {
            C0332c cVar2 = this.f1591a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo2094a();
                }
                this.f1591a = cVar;
                this.f1592b = true;
                if (cVar != null) {
                    cVar.mo2095a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2130a(boolean z) {
            this.f1606p = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2131a() {
            return this.f1601k == null && this.f1596f != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2132a(int i) {
            if (i == 0) {
                return this.f1604n;
            }
            if (i != 1) {
                return false;
            }
            return this.f1605o;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2133a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 != this.f1602l && !m1740a(view2, C3379v.m13829p(coordinatorLayout))) {
                C0332c cVar = this.f1591a;
                if (cVar == null || !cVar.mo2111a(coordinatorLayout, view, view2)) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2134b(int i) {
            mo2127a(i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo2135b() {
            if (this.f1591a == null) {
                this.f1603m = false;
            }
            return this.f1603m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo2136b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f1603m;
            if (z) {
                return true;
            }
            C0332c cVar = this.f1591a;
            boolean a = (cVar != null ? cVar.mo2105a(coordinatorLayout, view) : false) | z;
            this.f1603m = a;
            return a;
        }

        /* renamed from: c */
        public int mo2137c() {
            return this.f1596f;
        }

        /* renamed from: d */
        public C0332c mo2138d() {
            return this.f1591a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo2139e() {
            return this.f1606p;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public Rect mo2140f() {
            return this.f1607q;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo2141g() {
            this.f1606p = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo2142h() {
            this.f1603m = false;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    class C0336g implements OnPreDrawListener {
        C0336g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo2046a(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    protected static class C0337h extends C3400a {
        public static final Creator<C0337h> CREATOR = new C0338a();

        /* renamed from: h */
        SparseArray<Parcelable> f1609h;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        static class C0338a implements ClassLoaderCreator<C0337h> {
            C0338a() {
            }

            public C0337h createFromParcel(Parcel parcel) {
                return new C0337h(parcel, null);
            }

            public C0337h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0337h(parcel, classLoader);
            }

            public C0337h[] newArray(int i) {
                return new C0337h[i];
            }
        }

        public C0337h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1609h = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1609h.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0337h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f1609h;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f1609h.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f1609h.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    static class C0339i implements Comparator<View> {
        C0339i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float x = C3379v.m13837x(view);
            float x2 = C3379v.m13837x(view2);
            if (x > x2) {
                return -1;
            }
            return x < x2 ? 1 : 0;
        }
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f1568z = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            f1566C = new C0339i();
        } else {
            f1566C = null;
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3229a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1569f = new ArrayList();
        this.f1570g = new C0340a<>();
        this.f1571h = new ArrayList();
        this.f1572i = new ArrayList();
        this.f1574k = new int[2];
        this.f1575l = new int[2];
        this.f1588y = new C3374q(this);
        int[] iArr = C3231c.CoordinatorLayout;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, C3230b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (VERSION.SDK_INT >= 29) {
            int[] iArr2 = C3231c.CoordinatorLayout;
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, C3230b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C3231c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1578o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1578o.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr3 = this.f1578o;
                iArr3[i2] = (int) (((float) iArr3[i2]) * f);
            }
        }
        this.f1585v = obtainStyledAttributes.getDrawable(C3231c.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m1682f();
        super.setOnHierarchyChangeListener(new C0334e());
        if (C3379v.m13827n(this) == 0) {
            C3379v.m13820h(this, 1);
        }
    }

    /* renamed from: a */
    private static int m1661a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    static C0332c m1662a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f1568z)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f1568z);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = (Map) f1565B.get();
            if (map == null) {
                map = new HashMap();
                f1565B.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f1564A);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0332c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not inflate Behavior subclass ");
            sb3.append(str);
            throw new RuntimeException(sb3.toString(), e);
        }
    }

    /* renamed from: a */
    private static void m1663a(Rect rect) {
        rect.setEmpty();
        f1567D.mo5388a(rect);
    }

    /* renamed from: a */
    private void m1664a(View view, int i, Rect rect, Rect rect2, C0335f fVar, int i2, int i3) {
        int a = C3339d.m13606a(m1674c(fVar.f1593c), i);
        int a2 = C3339d.m13606a(m1675d(fVar.f1594d), i);
        int i4 = a & 7;
        int i5 = a & 112;
        int i6 = a2 & 7;
        int i7 = a2 & 112;
        int i8 = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int i9 = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            i8 -= i2 / 2;
        } else if (i4 != 5) {
            i8 -= i2;
        }
        if (i5 == 16) {
            i9 -= i3 / 2;
        } else if (i5 != 80) {
            i9 -= i3;
        }
        rect2.set(i8, i9, i2 + i8, i3 + i9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1665a(android.view.View r9, android.graphics.Rect r10, int r11) {
        /*
            r8 = this;
            boolean r0 = p071f.p097h.p108m.C3379v.m13768D(r9)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r9.getWidth()
            if (r0 <= 0) goto L_0x00fd
            int r0 = r9.getHeight()
            if (r0 > 0) goto L_0x0015
            goto L_0x00fd
        L_0x0015:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0335f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r0.mo2138d()
            android.graphics.Rect r2 = m1676d()
            android.graphics.Rect r3 = m1676d()
            int r4 = r9.getLeft()
            int r5 = r9.getTop()
            int r6 = r9.getRight()
            int r7 = r9.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r1.mo2108a(r8, r9, r2)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r3.contains(r2)
            if (r1 == 0) goto L_0x0049
            goto L_0x0073
        L_0x0049:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Rect should be within the child's bounds. Rect:"
            r10.append(r11)
            java.lang.String r11 = r2.toShortString()
            r10.append(r11)
            java.lang.String r11 = " | Bounds:"
            r10.append(r11)
            java.lang.String r11 = r3.toShortString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0070:
            r2.set(r3)
        L_0x0073:
            m1663a(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0080
            m1663a(r2)
            return
        L_0x0080:
            int r1 = r0.f1598h
            int r11 = p071f.p097h.p108m.C3339d.m13606a(r1, r11)
            r1 = r11 & 48
            r3 = 48
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x00a0
            int r1 = r2.top
            int r3 = r0.topMargin
            int r1 = r1 - r3
            int r3 = r0.f1600j
            int r1 = r1 - r3
            int r3 = r10.top
            if (r1 >= r3) goto L_0x00a0
            int r3 = r3 - r1
            r8.m1683f(r9, r3)
            r1 = 1
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            r3 = r11 & 80
            r6 = 80
            if (r3 != r6) goto L_0x00bd
            int r3 = r8.getHeight()
            int r6 = r2.bottom
            int r3 = r3 - r6
            int r6 = r0.bottomMargin
            int r3 = r3 - r6
            int r6 = r0.f1600j
            int r3 = r3 + r6
            int r6 = r10.bottom
            if (r3 >= r6) goto L_0x00bd
            int r3 = r3 - r6
            r8.m1683f(r9, r3)
            r1 = 1
        L_0x00bd:
            if (r1 != 0) goto L_0x00c2
            r8.m1683f(r9, r5)
        L_0x00c2:
            r1 = r11 & 3
            r3 = 3
            if (r1 != r3) goto L_0x00d9
            int r1 = r2.left
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            int r3 = r0.f1599i
            int r1 = r1 - r3
            int r3 = r10.left
            if (r1 >= r3) goto L_0x00d9
            int r3 = r3 - r1
            r8.m1680e(r9, r3)
            r1 = 1
            goto L_0x00da
        L_0x00d9:
            r1 = 0
        L_0x00da:
            r3 = 5
            r11 = r11 & r3
            if (r11 != r3) goto L_0x00f4
            int r11 = r8.getWidth()
            int r3 = r2.right
            int r11 = r11 - r3
            int r3 = r0.rightMargin
            int r11 = r11 - r3
            int r0 = r0.f1599i
            int r11 = r11 + r0
            int r10 = r10.right
            if (r11 >= r10) goto L_0x00f4
            int r11 = r11 - r10
            r8.m1680e(r9, r11)
            goto L_0x00f5
        L_0x00f4:
            r4 = r1
        L_0x00f5:
            if (r4 != 0) goto L_0x00fa
            r8.m1680e(r9, r5)
        L_0x00fa:
            m1663a(r2)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1665a(android.view.View, android.graphics.Rect, int):void");
    }

    /* renamed from: a */
    private void m1666a(View view, View view2, int i) {
        Rect d = m1676d();
        Rect d2 = m1676d();
        try {
            mo2050a(view2, d);
            mo2049a(view, i, d, d2);
            view.layout(d2.left, d2.top, d2.right, d2.bottom);
        } finally {
            m1663a(d);
            m1663a(d2);
        }
    }

    /* renamed from: a */
    private void m1667a(C0335f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: a */
    private void m1668a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i = childCount - 1;
        while (i >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
            i--;
        }
        Comparator<View> comparator = f1566C;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: a */
    private void m1669a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0332c d = ((C0335f) childAt.getLayoutParams()).mo2138d();
            if (d != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    d.mo2110a(this, childAt, obtain);
                } else {
                    d.mo2115b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0335f) getChildAt(i2).getLayoutParams()).mo2142h();
        }
        this.f1579p = null;
        this.f1576m = false;
    }

    /* renamed from: a */
    private boolean m1670a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1571h;
        m1668a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            C0335f fVar = (C0335f) view.getLayoutParams();
            C0332c d = fVar.mo2138d();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && d != null) {
                    if (i2 == 0) {
                        z = d.mo2110a(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = d.mo2115b(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f1579p = view;
                    }
                }
                boolean b = fVar.mo2135b();
                boolean b2 = fVar.mo2136b(this, view);
                z2 = b2 && !b;
                if (b2 && !z2) {
                    break;
                }
            } else if (d != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    d.mo2110a(this, view, motionEvent3);
                } else if (i2 == 1) {
                    d.mo2115b(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: b */
    private int m1671b(int i) {
        StringBuilder sb;
        int[] iArr = this.f1578o;
        String str = "CoordinatorLayout";
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e(str, sb.toString());
        return 0;
    }

    /* renamed from: b */
    private C3343e0 m1672b(C3343e0 e0Var) {
        if (e0Var.mo10734e()) {
            return e0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C3379v.m13826m(childAt)) {
                C0332c d = ((C0335f) childAt.getLayoutParams()).mo2138d();
                if (d != null) {
                    d.mo2093a(this, childAt, e0Var);
                    if (e0Var.mo10734e()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return e0Var;
    }

    /* renamed from: b */
    private void m1673b(View view, int i, int i2) {
        C0335f fVar = (C0335f) view.getLayoutParams();
        int a = C3339d.m13606a(m1678e(fVar.f1593c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m1671b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: c */
    private static int m1674c(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: d */
    private static int m1675d(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static Rect m1676d() {
        Rect rect = (Rect) f1567D.mo5387a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: d */
    private void m1677d(View view, int i) {
        C0335f fVar = (C0335f) view.getLayoutParams();
        Rect d = m1676d();
        d.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f1583t != null && C3379v.m13826m(this) && !C3379v.m13826m(view)) {
            d.left += this.f1583t.mo10731b();
            d.top += this.f1583t.mo10733d();
            d.right -= this.f1583t.mo10732c();
            d.bottom -= this.f1583t.mo10729a();
        }
        Rect d2 = m1676d();
        C3339d.m13607a(m1675d(fVar.f1593c), view.getMeasuredWidth(), view.getMeasuredHeight(), d, d2, i);
        view.layout(d2.left, d2.top, d2.right, d2.bottom);
        m1663a(d);
        m1663a(d2);
    }

    /* renamed from: e */
    private static int m1678e(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private void m1679e() {
        this.f1569f.clear();
        this.f1570g.mo2149a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0335f d = mo2062d(childAt);
            d.mo2126a(this, childAt);
            this.f1570g.mo2150a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (d.mo2133a(this, childAt, childAt2)) {
                        if (!this.f1570g.mo2153b(childAt2)) {
                            this.f1570g.mo2150a(childAt2);
                        }
                        this.f1570g.mo2151a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1569f.addAll(this.f1570g.mo2152b());
        Collections.reverse(this.f1569f);
    }

    /* renamed from: e */
    private void m1680e(View view, int i) {
        C0335f fVar = (C0335f) view.getLayoutParams();
        int i2 = fVar.f1599i;
        if (i2 != i) {
            C3379v.m13811d(view, i - i2);
            fVar.f1599i = i;
        }
    }

    /* renamed from: e */
    private boolean m1681e(View view) {
        return this.f1570g.mo2156e(view);
    }

    /* renamed from: f */
    private void m1682f() {
        if (VERSION.SDK_INT >= 21) {
            if (C3379v.m13826m(this)) {
                if (this.f1587x == null) {
                    this.f1587x = new C0330a();
                }
                C3379v.m13792a((View) this, this.f1587x);
                setSystemUiVisibility(1280);
            } else {
                C3379v.m13792a((View) this, (C3375r) null);
            }
        }
    }

    /* renamed from: f */
    private void m1683f(View view, int i) {
        C0335f fVar = (C0335f) view.getLayoutParams();
        int i2 = fVar.f1600j;
        if (i2 != i) {
            C3379v.m13814e(view, i - i2);
            fVar.f1600j = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C3343e0 mo2044a(C3343e0 e0Var) {
        if (!C3316c.m13532a(this.f1583t, e0Var)) {
            this.f1583t = e0Var;
            boolean z = true;
            boolean z2 = e0Var != null && e0Var.mo10733d() > 0;
            this.f1584u = z2;
            if (z2 || getBackground() != null) {
                z = false;
            }
            setWillNotDraw(z);
            m1672b(e0Var);
            requestLayout();
        }
        return e0Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2045a() {
        if (this.f1577n) {
            if (this.f1581r == null) {
                this.f1581r = new C0336g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1581r);
        }
        this.f1582s = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2046a(int i) {
        boolean z;
        int i2 = i;
        int p = C3379v.m13829p(this);
        int size = this.f1569f.size();
        Rect d = m1676d();
        Rect d2 = m1676d();
        Rect d3 = m1676d();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.f1569f.get(i3);
            C0335f fVar = (C0335f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.f1602l == ((View) this.f1569f.get(i4))) {
                        mo2055b(view, p);
                    }
                }
                mo2051a(view, true, d2);
                if (fVar.f1597g != 0 && !d2.isEmpty()) {
                    int a = C3339d.m13606a(fVar.f1597g, p);
                    int i5 = a & 112;
                    if (i5 == 48) {
                        d.top = Math.max(d.top, d2.bottom);
                    } else if (i5 == 80) {
                        d.bottom = Math.max(d.bottom, getHeight() - d2.top);
                    }
                    int i6 = a & 7;
                    if (i6 == 3) {
                        d.left = Math.max(d.left, d2.right);
                    } else if (i6 == 5) {
                        d.right = Math.max(d.right, getWidth() - d2.left);
                    }
                }
                if (fVar.f1598h != 0 && view.getVisibility() == 0) {
                    m1665a(view, d, p);
                }
                if (i2 != 2) {
                    mo2056b(view, d3);
                    if (!d3.equals(d2)) {
                        mo2060c(view, d2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = (View) this.f1569f.get(i7);
                    C0335f fVar2 = (C0335f) view2.getLayoutParams();
                    C0332c d4 = fVar2.mo2138d();
                    if (d4 != null && d4.mo2111a(this, view2, view)) {
                        if (i2 != 0 || !fVar2.mo2139e()) {
                            if (i2 != 2) {
                                z = d4.mo2116b(this, view2, view);
                            } else {
                                d4.mo2120c(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar2.mo2130a(z);
                            }
                        } else {
                            fVar2.mo2141g();
                        }
                    }
                }
            }
        }
        m1663a(d);
        m1663a(d2);
        m1663a(d3);
    }

    /* renamed from: a */
    public void mo2047a(View view) {
        List c = this.f1570g.mo2154c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                C0332c d = ((C0335f) view2.getLayoutParams()).mo2138d();
                if (d != null) {
                    d.mo2116b(this, view2, view);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo888a(View view, int i) {
        this.f1588y.mo10833a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0335f fVar = (C0335f) childAt.getLayoutParams();
            if (fVar.mo2132a(i)) {
                C0332c d = fVar.mo2138d();
                if (d != null) {
                    d.mo2097a(this, childAt, view, i);
                }
                fVar.mo2134b(i);
                fVar.mo2141g();
            }
        }
        this.f1580q = null;
    }

    /* renamed from: a */
    public void mo2048a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo889a(View view, int i, int i2, int i3, int i4, int i5) {
        mo890a(view, i, i2, i3, i4, 0, this.f1575l);
    }

    /* renamed from: a */
    public void mo890a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0335f fVar = (C0335f) childAt.getLayoutParams();
                if (fVar.mo2132a(i5)) {
                    C0332c d = fVar.mo2138d();
                    if (d != null) {
                        int[] iArr2 = this.f1574k;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        d.mo2100a(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                        int[] iArr3 = this.f1574k;
                        i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                        i7 = i4 > 0 ? Math.max(i7, this.f1574k[1]) : Math.min(i7, this.f1574k[1]);
                        z = true;
                    }
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            mo2046a(1);
        }
    }

    /* renamed from: a */
    public void mo891a(View view, int i, int i2, int[] iArr, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                C0335f fVar = (C0335f) childAt.getLayoutParams();
                if (fVar.mo2132a(i3)) {
                    C0332c d = fVar.mo2138d();
                    if (d != null) {
                        int[] iArr2 = this.f1574k;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        d.mo2102a(this, childAt, view, i, i2, iArr2, i3);
                        int[] iArr3 = this.f1574k;
                        i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                        int[] iArr4 = this.f1574k;
                        i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                        z = true;
                    }
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo2046a(1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2049a(View view, int i, Rect rect, Rect rect2) {
        C0335f fVar = (C0335f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m1664a(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        m1667a(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2050a(View view, Rect rect) {
        C0341b.m1771a((ViewGroup) this, view, rect);
    }

    /* renamed from: a */
    public void mo892a(View view, View view2, int i, int i2) {
        this.f1588y.mo10835a(view, view2, i, i2);
        this.f1580q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0335f fVar = (C0335f) childAt.getLayoutParams();
            if (fVar.mo2132a(i2)) {
                C0332c d = fVar.mo2138d();
                if (d != null) {
                    d.mo2104a(this, childAt, view, view2, i, i2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2051a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
            return;
        }
        if (z) {
            mo2050a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    public boolean mo2052a(View view, int i, int i2) {
        Rect d = m1676d();
        mo2050a(view, d);
        try {
            return d.contains(i, i2);
        } finally {
            m1663a(d);
        }
    }

    /* renamed from: b */
    public List<View> mo2053b(View view) {
        List d = this.f1570g.mo2155d(view);
        this.f1572i.clear();
        if (d != null) {
            this.f1572i.addAll(d);
        }
        return this.f1572i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2054b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m1681e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f1582s) {
            return;
        }
        if (z) {
            mo2045a();
        } else {
            mo2058c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2055b(View view, int i) {
        View view2 = view;
        C0335f fVar = (C0335f) view.getLayoutParams();
        if (fVar.f1601k != null) {
            Rect d = m1676d();
            Rect d2 = m1676d();
            Rect d3 = m1676d();
            mo2050a(fVar.f1601k, d);
            boolean z = false;
            mo2051a(view2, false, d2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m1664a(view, i, d, d3, fVar, measuredWidth, measuredHeight);
            if (!(d3.left == d2.left && d3.top == d2.top)) {
                z = true;
            }
            m1667a(fVar, d3, measuredWidth, i2);
            int i3 = d3.left - d2.left;
            int i4 = d3.top - d2.top;
            if (i3 != 0) {
                C3379v.m13811d(view2, i3);
            }
            if (i4 != 0) {
                C3379v.m13814e(view2, i4);
            }
            if (z) {
                C0332c d4 = fVar.mo2138d();
                if (d4 != null) {
                    d4.mo2116b(this, view2, fVar.f1601k);
                }
            }
            m1663a(d);
            m1663a(d2);
            m1663a(d3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2056b(View view, Rect rect) {
        rect.set(((C0335f) view.getLayoutParams()).mo2140f());
    }

    /* renamed from: b */
    public boolean mo895b(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z = false;
        while (true) {
            if (i4 >= childCount) {
                return z;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0335f fVar = (C0335f) childAt.getLayoutParams();
                C0332c d = fVar.mo2138d();
                if (d != null) {
                    boolean b = d.mo2118b(this, childAt, view, view2, i, i2);
                    z |= b;
                    fVar.mo2127a(i3, b);
                } else {
                    fVar.mo2127a(i3, false);
                }
            }
            i4++;
        }
    }

    /* renamed from: c */
    public List<View> mo2057c(View view) {
        List c = this.f1570g.mo2154c(view);
        this.f1572i.clear();
        if (c != null) {
            this.f1572i.addAll(c);
        }
        return this.f1572i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2058c() {
        if (this.f1577n && this.f1581r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1581r);
        }
        this.f1582s = false;
    }

    /* renamed from: c */
    public void mo2059c(View view, int i) {
        C0335f fVar = (C0335f) view.getLayoutParams();
        if (!fVar.mo2131a()) {
            View view2 = fVar.f1601k;
            if (view2 != null) {
                m1666a(view, view2, i);
                return;
            }
            int i2 = fVar.f1595e;
            if (i2 >= 0) {
                m1673b(view, i2, i);
            } else {
                m1677d(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2060c(View view, Rect rect) {
        ((C0335f) view.getLayoutParams()).mo2128a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0335f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C0335f mo2062d(View view) {
        C0335f fVar = (C0335f) view.getLayoutParams();
        if (!fVar.f1592b) {
            String str = "CoordinatorLayout";
            if (view instanceof C0331b) {
                C0332c behavior = ((C0331b) view).getBehavior();
                if (behavior == null) {
                    Log.e(str, "Attached behavior class is null");
                }
                fVar.mo2129a(behavior);
            } else {
                C0333d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0333d) cls.getAnnotation(C0333d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.mo2129a((C0332c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(dVar.value().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e(str, sb.toString(), e);
                    }
                }
            }
            fVar.f1592b = true;
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0335f fVar = (C0335f) view.getLayoutParams();
        C0332c cVar = fVar.f1591a;
        if (cVar != null) {
            float c = cVar.mo2119c(this, view);
            if (c > 0.0f) {
                if (this.f1573j == null) {
                    this.f1573j = new Paint();
                }
                this.f1573j.setColor(fVar.f1591a.mo2114b(this, view));
                this.f1573j.setAlpha(m1661a(Math.round(c * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f1573j);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1585v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public C0335f generateDefaultLayoutParams() {
        return new C0335f(-2, -2);
    }

    public C0335f generateLayoutParams(AttributeSet attributeSet) {
        return new C0335f(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0335f generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0335f ? new C0335f((C0335f) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0335f((MarginLayoutParams) layoutParams) : new C0335f(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    public final List<View> getDependencySortedChildren() {
        m1679e();
        return Collections.unmodifiableList(this.f1569f);
    }

    public final C3343e0 getLastWindowInsets() {
        return this.f1583t;
    }

    public int getNestedScrollAxes() {
        return this.f1588y.mo10831a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1585v;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1669a(false);
        if (this.f1582s) {
            if (this.f1581r == null) {
                this.f1581r = new C0336g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1581r);
        }
        if (this.f1583t == null && C3379v.m13826m(this)) {
            C3379v.m13773I(this);
        }
        this.f1577n = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1669a(false);
        if (this.f1582s && this.f1581r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1581r);
        }
        View view = this.f1580q;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1577n = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1584u && this.f1585v != null) {
            C3343e0 e0Var = this.f1583t;
            int d = e0Var != null ? e0Var.mo10733d() : 0;
            if (d > 0) {
                this.f1585v.setBounds(0, 0, getWidth(), d);
                this.f1585v.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1669a(true);
        }
        boolean a = m1670a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1669a(true);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int p = C3379v.m13829p(this);
        int size = this.f1569f.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f1569f.get(i5);
            if (view.getVisibility() != 8) {
                C0332c d = ((C0335f) view.getLayoutParams()).mo2138d();
                if (d == null || !d.mo2106a(this, view, p)) {
                    mo2059c(view, p);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.mo2107a(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m1679e()
            r30.mo2054b()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = p071f.p097h.p108m.C3379v.m13829p(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            f.h.m.e0 r3 = r7.f1583t
            if (r3 == 0) goto L_0x004b
            boolean r3 = p071f.p097h.p108m.C3379v.m13826m(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f1569f
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f1569f
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0335f) r1
            int r0 = r1.f1595e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.m1671b(r0)
            int r11 = r1.f1593c
            int r11 = m1678e(r11)
            int r11 = p071f.p097h.p108m.C3339d.m13606a(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = p071f.p097h.p108m.C3379v.m13826m(r20)
            if (r0 != 0) goto L_0x00f1
            f.h.m.e0 r0 = r7.f1583t
            int r0 = r0.mo10731b()
            f.h.m.e0 r2 = r7.f1583t
            int r2 = r2.mo10732c()
            int r0 = r0 + r2
            f.h.m.e0 r2 = r7.f1583t
            int r2 = r2.mo10733d()
            f.h.m.e0 r11 = r7.f1583t
            int r11 = r11.mo10729a()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.mo2138d()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo2107a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo2048a(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0335f fVar = (C0335f) childAt.getLayoutParams();
                if (fVar.mo2132a(0)) {
                    C0332c d = fVar.mo2138d();
                    if (d != null) {
                        z2 |= d.mo2113a(this, childAt, view, f, f2, z);
                    }
                }
            }
        }
        if (z2) {
            mo2046a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0335f fVar = (C0335f) childAt.getLayoutParams();
                if (fVar.mo2132a(0)) {
                    C0332c d = fVar.mo2138d();
                    if (d != null) {
                        z |= d.mo2112a(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo891a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo889a(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo892a(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0337h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0337h hVar = (C0337h) parcelable;
        super.onRestoreInstanceState(hVar.mo10880a());
        SparseArray<Parcelable> sparseArray = hVar.f1609h;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0332c d = mo2062d(childAt).mo2138d();
            if (!(id == -1 || d == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    d.mo2096a(this, childAt, parcelable2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0337h hVar = new C0337h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0332c d = ((C0335f) childAt.getLayoutParams()).mo2138d();
            if (!(id == -1 || d == null)) {
                Parcelable d2 = d.mo2121d(this, childAt);
                if (d2 != null) {
                    sparseArray.append(id, d2);
                }
            }
        }
        hVar.f1609h = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo895b(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo888a(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1579p
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m1670a(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f1579p
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0335f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.mo2138d()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f1579p
            boolean r6 = r6.mo2115b(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f1579p
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m1669a(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0332c d = ((C0335f) view.getLayoutParams()).mo2138d();
        if (d == null || !d.mo2109a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f1576m) {
            m1669a(false);
            this.f1576m = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1682f();
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1586w = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1585v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1585v = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1585v.setState(getDrawableState());
                }
                C0371a.m1904a(this.f1585v, C3379v.m13829p(this));
                this.f1585v.setVisible(getVisibility() == 0, false);
                this.f1585v.setCallback(this);
            }
            C3379v.m13772H(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C3236a.m13271c(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1585v;
        if (drawable != null && drawable.isVisible() != z) {
            this.f1585v.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1585v;
    }
}
