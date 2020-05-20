package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.C0142p;
import androidx.core.widget.C0390h;
import java.lang.reflect.Method;
import p071f.p072a.C3093a;
import p071f.p072a.C3102j;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.appcompat.widget.f0 */
public class C0215f0 implements C0142p {

    /* renamed from: K */
    private static Method f956K;

    /* renamed from: L */
    private static Method f957L;

    /* renamed from: M */
    private static Method f958M;

    /* renamed from: A */
    private OnItemSelectedListener f959A;

    /* renamed from: B */
    final C0222g f960B;

    /* renamed from: C */
    private final C0221f f961C;

    /* renamed from: D */
    private final C0220e f962D;

    /* renamed from: E */
    private final C0218c f963E;

    /* renamed from: F */
    final Handler f964F;

    /* renamed from: G */
    private final Rect f965G;

    /* renamed from: H */
    private Rect f966H;

    /* renamed from: I */
    private boolean f967I;

    /* renamed from: J */
    PopupWindow f968J;

    /* renamed from: f */
    private Context f969f;

    /* renamed from: g */
    private ListAdapter f970g;

    /* renamed from: h */
    C0192b0 f971h;

    /* renamed from: i */
    private int f972i;

    /* renamed from: j */
    private int f973j;

    /* renamed from: k */
    private int f974k;

    /* renamed from: l */
    private int f975l;

    /* renamed from: m */
    private int f976m;

    /* renamed from: n */
    private boolean f977n;

    /* renamed from: o */
    private boolean f978o;

    /* renamed from: p */
    private boolean f979p;

    /* renamed from: q */
    private int f980q;

    /* renamed from: r */
    private boolean f981r;

    /* renamed from: s */
    private boolean f982s;

    /* renamed from: t */
    int f983t;

    /* renamed from: u */
    private View f984u;

    /* renamed from: v */
    private int f985v;

    /* renamed from: w */
    private DataSetObserver f986w;

    /* renamed from: x */
    private View f987x;

    /* renamed from: y */
    private Drawable f988y;

    /* renamed from: z */
    private OnItemClickListener f989z;

    /* renamed from: androidx.appcompat.widget.f0$a */
    class C0216a implements Runnable {
        C0216a() {
        }

        public void run() {
            View i = C0215f0.this.mo1409i();
            if (i != null && i.getWindowToken() != null) {
                C0215f0.this.mo540c();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$b */
    class C0217b implements OnItemSelectedListener {
        C0217b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != -1) {
                C0192b0 b0Var = C0215f0.this.f971h;
                if (b0Var != null) {
                    b0Var.setListSelectionHidden(false);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$c */
    private class C0218c implements Runnable {
        C0218c() {
        }

        public void run() {
            C0215f0.this.mo1407h();
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$d */
    private class C0219d extends DataSetObserver {
        C0219d() {
        }

        public void onChanged() {
            if (C0215f0.this.mo536a()) {
                C0215f0.this.mo540c();
            }
        }

        public void onInvalidated() {
            C0215f0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$e */
    private class C0220e implements OnScrollListener {
        C0220e() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0215f0.this.mo1417o() && C0215f0.this.f968J.getContentView() != null) {
                C0215f0 f0Var = C0215f0.this;
                f0Var.f964F.removeCallbacks(f0Var.f960B);
                C0215f0.this.f960B.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$f */
    private class C0221f implements OnTouchListener {
        C0221f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                PopupWindow popupWindow = C0215f0.this.f968J;
                if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < C0215f0.this.f968J.getWidth() && y >= 0 && y < C0215f0.this.f968J.getHeight()) {
                    C0215f0 f0Var = C0215f0.this;
                    f0Var.f964F.postDelayed(f0Var.f960B, 250);
                    return false;
                }
            }
            if (action == 1) {
                C0215f0 f0Var2 = C0215f0.this;
                f0Var2.f964F.removeCallbacks(f0Var2.f960B);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$g */
    private class C0222g implements Runnable {
        C0222g() {
        }

        public void run() {
            C0192b0 b0Var = C0215f0.this.f971h;
            if (b0Var != null && C3379v.m13767C(b0Var) && C0215f0.this.f971h.getCount() > C0215f0.this.f971h.getChildCount()) {
                int childCount = C0215f0.this.f971h.getChildCount();
                C0215f0 f0Var = C0215f0.this;
                if (childCount <= f0Var.f983t) {
                    f0Var.f968J.setInputMethodMode(2);
                    C0215f0.this.mo540c();
                }
            }
        }
    }

    static {
        String str = "ListPopupWindow";
        if (VERSION.SDK_INT <= 28) {
            try {
                f956K = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i(str, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f958M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i(str, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (VERSION.SDK_INT <= 23) {
            try {
                f957L = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i(str, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0215f0(Context context) {
        this(context, null, C3093a.listPopupWindowStyle);
    }

    public C0215f0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0215f0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f972i = -2;
        this.f973j = -2;
        this.f976m = 1002;
        this.f980q = 0;
        this.f981r = false;
        this.f982s = false;
        this.f983t = Integer.MAX_VALUE;
        this.f985v = 0;
        this.f960B = new C0222g();
        this.f961C = new C0221f();
        this.f962D = new C0220e();
        this.f963E = new C0218c();
        this.f965G = new Rect();
        this.f969f = context;
        this.f964F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3102j.ListPopupWindow, i, i2);
        this.f974k = obtainStyledAttributes.getDimensionPixelOffset(C3102j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C3102j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f975l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f977n = true;
        }
        obtainStyledAttributes.recycle();
        C0253o oVar = new C0253o(context, attributeSet, i, i2);
        this.f968J = oVar;
        oVar.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m1076a(View view, int i, boolean z) {
        if (VERSION.SDK_INT > 23) {
            return this.f968J.getMaxAvailableHeight(view, i, z);
        }
        Method method = f957L;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f968J, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f968J.getMaxAvailableHeight(view, i);
    }

    /* renamed from: c */
    private void mo1447c(boolean z) {
        if (VERSION.SDK_INT <= 28) {
            Method method = f956K;
            if (method != null) {
                try {
                    method.invoke(this.f968J, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f968J.setIsClippedToScreen(z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x014f  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int mo1725q() {
        /*
            r12 = this;
            androidx.appcompat.widget.b0 r0 = r12.f971h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00bd
            android.content.Context r0 = r12.f969f
            androidx.appcompat.widget.f0$a r5 = new androidx.appcompat.widget.f0$a
            r5.<init>()
            boolean r5 = r12.f967I
            r5 = r5 ^ r3
            androidx.appcompat.widget.b0 r5 = r12.mo1389a(r0, r5)
            r12.f971h = r5
            android.graphics.drawable.Drawable r6 = r12.f988y
            if (r6 == 0) goto L_0x0020
            r5.setSelector(r6)
        L_0x0020:
            androidx.appcompat.widget.b0 r5 = r12.f971h
            android.widget.ListAdapter r6 = r12.f970g
            r5.setAdapter(r6)
            androidx.appcompat.widget.b0 r5 = r12.f971h
            android.widget.AdapterView$OnItemClickListener r6 = r12.f989z
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.b0 r5 = r12.f971h
            r5.setFocusable(r3)
            androidx.appcompat.widget.b0 r5 = r12.f971h
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.b0 r5 = r12.f971h
            androidx.appcompat.widget.f0$b r6 = new androidx.appcompat.widget.f0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.b0 r5 = r12.f971h
            androidx.appcompat.widget.f0$e r6 = r12.f962D
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f959A
            if (r5 == 0) goto L_0x0052
            androidx.appcompat.widget.b0 r6 = r12.f971h
            r6.setOnItemSelectedListener(r5)
        L_0x0052:
            androidx.appcompat.widget.b0 r5 = r12.f971h
            android.view.View r6 = r12.f984u
            if (r6 == 0) goto L_0x00b6
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f985v
            if (r8 == 0) goto L_0x008d
            if (r8 == r3) goto L_0x0086
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f985v
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0093
        L_0x0086:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0093
        L_0x008d:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0093:
            int r0 = r12.f973j
            if (r0 < 0) goto L_0x009a
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009c
        L_0x009a:
            r0 = 0
            r5 = 0
        L_0x009c:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            android.widget.PopupWindow r6 = r12.f968J
            r6.setContentView(r5)
            goto L_0x00db
        L_0x00bd:
            android.widget.PopupWindow r0 = r12.f968J
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f984u
            if (r0 == 0) goto L_0x00da
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00db
        L_0x00da:
            r0 = 0
        L_0x00db:
            android.widget.PopupWindow r5 = r12.f968J
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f7
            android.graphics.Rect r6 = r12.f965G
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f965G
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f977n
            if (r7 != 0) goto L_0x00fd
            int r6 = -r6
            r12.f975l = r6
            goto L_0x00fd
        L_0x00f7:
            android.graphics.Rect r5 = r12.f965G
            r5.setEmpty()
            r5 = 0
        L_0x00fd:
            android.widget.PopupWindow r6 = r12.f968J
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r3 = 0
        L_0x0108:
            android.view.View r4 = r12.mo1409i()
            int r6 = r12.f975l
            int r3 = r12.m1076a(r4, r6, r3)
            boolean r4 = r12.f981r
            if (r4 != 0) goto L_0x0160
            int r4 = r12.f972i
            if (r4 != r2) goto L_0x011b
            goto L_0x0160
        L_0x011b:
            int r4 = r12.f973j
            r6 = -2
            if (r4 == r6) goto L_0x0129
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x0129
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0141
        L_0x0129:
            android.content.Context r2 = r12.f969f
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f965G
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0141:
            r7 = r1
            androidx.appcompat.widget.b0 r6 = r12.f971h
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo1267a(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x015e
            androidx.appcompat.widget.b0 r2 = r12.f971h
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.b0 r3 = r12.f971h
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x015e:
            int r1 = r1 + r0
            return r1
        L_0x0160:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0215f0.mo1725q():int");
    }

    /* renamed from: r */
    private void mo1726r() {
        View view = this.f984u;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f984u);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0192b0 mo1389a(Context context, boolean z) {
        return new C0192b0(context, z);
    }

    /* renamed from: a */
    public void mo1390a(int i) {
        this.f975l = i;
        this.f977n = true;
    }

    /* renamed from: a */
    public void mo1391a(Rect rect) {
        this.f966H = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: a */
    public void mo1392a(Drawable drawable) {
        this.f968J.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo1393a(View view) {
        this.f987x = view;
    }

    /* renamed from: a */
    public void mo1394a(OnItemClickListener onItemClickListener) {
        this.f989z = onItemClickListener;
    }

    /* renamed from: a */
    public void mo1395a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f986w;
        if (dataSetObserver == null) {
            this.f986w = new C0219d();
        } else {
            ListAdapter listAdapter2 = this.f970g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f970g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f986w);
        }
        C0192b0 b0Var = this.f971h;
        if (b0Var != null) {
            b0Var.setAdapter(this.f970g);
        }
    }

    /* renamed from: a */
    public void mo1396a(OnDismissListener onDismissListener) {
        this.f968J.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public void mo1397a(boolean z) {
        this.f967I = z;
        this.f968J.setFocusable(z);
    }

    /* renamed from: a */
    public boolean mo536a() {
        return this.f968J.isShowing();
    }

    /* renamed from: b */
    public int mo1398b() {
        return this.f974k;
    }

    /* renamed from: b */
    public void mo1399b(boolean z) {
        this.f979p = true;
        this.f978o = z;
    }

    /* renamed from: c */
    public void mo540c() {
        int q = mo1725q();
        boolean o = mo1417o();
        C0390h.m2020a(this.f968J, this.f976m);
        boolean z = true;
        if (!this.f968J.isShowing()) {
            int i = this.f973j;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo1409i().getWidth();
            }
            int i2 = this.f972i;
            if (i2 == -1) {
                q = -1;
            } else if (i2 != -2) {
                q = i2;
            }
            this.f968J.setWidth(i);
            this.f968J.setHeight(q);
            mo1447c(true);
            this.f968J.setOutsideTouchable(!this.f982s && !this.f981r);
            this.f968J.setTouchInterceptor(this.f961C);
            if (this.f979p) {
                C0390h.m2022a(this.f968J, this.f978o);
            }
            if (VERSION.SDK_INT <= 28) {
                Method method = f958M;
                if (method != null) {
                    try {
                        method.invoke(this.f968J, new Object[]{this.f966H});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.f968J.setEpicenterBounds(this.f966H);
            }
            C0390h.m2021a(this.f968J, mo1409i(), this.f974k, this.f975l, this.f980q);
            this.f971h.setSelection(-1);
            if (!this.f967I || this.f971h.isInTouchMode()) {
                mo1407h();
            }
            if (!this.f967I) {
                this.f964F.post(this.f963E);
            }
        } else if (C3379v.m13767C(mo1409i())) {
            int i3 = this.f973j;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo1409i().getWidth();
            }
            int i4 = this.f972i;
            if (i4 == -1) {
                if (!o) {
                    q = -1;
                }
                if (o) {
                    this.f968J.setWidth(this.f973j == -1 ? -1 : 0);
                    this.f968J.setHeight(0);
                } else {
                    this.f968J.setWidth(this.f973j == -1 ? -1 : 0);
                    this.f968J.setHeight(-1);
                }
            } else if (i4 != -2) {
                q = i4;
            }
            PopupWindow popupWindow = this.f968J;
            if (this.f982s || this.f981r) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f968J.update(mo1409i(), this.f974k, this.f975l, i3 < 0 ? -1 : i3, q < 0 ? -1 : q);
        }
    }

    /* renamed from: c */
    public void mo1400c(int i) {
        this.f974k = i;
    }

    /* renamed from: d */
    public Drawable mo1401d() {
        return this.f968J.getBackground();
    }

    /* renamed from: d */
    public void mo1402d(int i) {
        this.f968J.setAnimationStyle(i);
    }

    public void dismiss() {
        this.f968J.dismiss();
        mo1726r();
        this.f968J.setContentView(null);
        this.f971h = null;
        this.f964F.removeCallbacks(this.f960B);
    }

    /* renamed from: e */
    public ListView mo544e() {
        return this.f971h;
    }

    /* renamed from: e */
    public void mo1403e(int i) {
        Drawable background = this.f968J.getBackground();
        if (background != null) {
            background.getPadding(this.f965G);
            Rect rect = this.f965G;
            this.f973j = rect.left + rect.right + i;
            return;
        }
        mo1412j(i);
    }

    /* renamed from: f */
    public int mo1404f() {
        if (!this.f977n) {
            return 0;
        }
        return this.f975l;
    }

    /* renamed from: f */
    public void mo1405f(int i) {
        this.f980q = i;
    }

    /* renamed from: g */
    public void mo1406g(int i) {
        this.f968J.setInputMethodMode(i);
    }

    /* renamed from: h */
    public void mo1407h() {
        C0192b0 b0Var = this.f971h;
        if (b0Var != null) {
            b0Var.setListSelectionHidden(true);
            b0Var.requestLayout();
        }
    }

    /* renamed from: h */
    public void mo1408h(int i) {
        this.f985v = i;
    }

    /* renamed from: i */
    public View mo1409i() {
        return this.f987x;
    }

    /* renamed from: i */
    public void mo1410i(int i) {
        C0192b0 b0Var = this.f971h;
        if (mo536a() && b0Var != null) {
            b0Var.setListSelectionHidden(false);
            b0Var.setSelection(i);
            if (b0Var.getChoiceMode() != 0) {
                b0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: j */
    public Object mo1411j() {
        if (!mo536a()) {
            return null;
        }
        return this.f971h.getSelectedItem();
    }

    /* renamed from: j */
    public void mo1412j(int i) {
        this.f973j = i;
    }

    /* renamed from: k */
    public long mo1413k() {
        if (!mo536a()) {
            return Long.MIN_VALUE;
        }
        return this.f971h.getSelectedItemId();
    }

    /* renamed from: l */
    public int mo1414l() {
        if (!mo536a()) {
            return -1;
        }
        return this.f971h.getSelectedItemPosition();
    }

    /* renamed from: m */
    public View mo1415m() {
        if (!mo536a()) {
            return null;
        }
        return this.f971h.getSelectedView();
    }

    /* renamed from: n */
    public int mo1416n() {
        return this.f973j;
    }

    /* renamed from: o */
    public boolean mo1417o() {
        return this.f968J.getInputMethodMode() == 2;
    }

    /* renamed from: p */
    public boolean mo1418p() {
        return this.f967I;
    }
}
