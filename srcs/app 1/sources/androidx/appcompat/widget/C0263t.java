package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0065b;
import androidx.appcompat.app.C0065b.C0066a;
import androidx.appcompat.view.menu.C0142p;
import p071f.p072a.C3093a;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p108m.C3378u;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.appcompat.widget.t */
public class C0263t extends Spinner implements C3378u {

    /* renamed from: n */
    private static final int[] f1162n = {16843505};

    /* renamed from: f */
    private final C0211e f1163f;

    /* renamed from: g */
    private final Context f1164g;

    /* renamed from: h */
    private C0208d0 f1165h;

    /* renamed from: i */
    private SpinnerAdapter f1166i;

    /* renamed from: j */
    private final boolean f1167j;

    /* renamed from: k */
    private C0274g f1168k;

    /* renamed from: l */
    int f1169l;

    /* renamed from: m */
    final Rect f1170m;

    /* renamed from: androidx.appcompat.widget.t$a */
    class C0264a extends C0208d0 {

        /* renamed from: o */
        final /* synthetic */ C0268e f1171o;

        C0264a(View view, C0268e eVar) {
            this.f1171o = eVar;
            super(view);
        }

        /* renamed from: a */
        public C0142p mo435a() {
            return this.f1171o;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public boolean mo436b() {
            if (!C0263t.this.getInternalPopup().mo1702a()) {
                C0263t.this.mo1671a();
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.t$b */
    class C0265b implements OnGlobalLayoutListener {
        C0265b() {
        }

        public void onGlobalLayout() {
            if (!C0263t.this.getInternalPopup().mo1702a()) {
                C0263t.this.mo1671a();
            }
            ViewTreeObserver viewTreeObserver = C0263t.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.t$c */
    class C0266c implements C0274g, OnClickListener {

        /* renamed from: f */
        C0065b f1174f;

        /* renamed from: g */
        private ListAdapter f1175g;

        /* renamed from: h */
        private CharSequence f1176h;

        C0266c() {
        }

        /* renamed from: a */
        public void mo1697a(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: a */
        public void mo1698a(int i, int i2) {
            if (this.f1175g != null) {
                C0066a aVar = new C0066a(C0263t.this.getPopupContext());
                CharSequence charSequence = this.f1176h;
                if (charSequence != null) {
                    aVar.mo219a(charSequence);
                }
                aVar.mo217a(this.f1175g, C0263t.this.getSelectedItemPosition(), this);
                C0065b a = aVar.mo220a();
                this.f1174f = a;
                ListView b = a.mo207b();
                if (VERSION.SDK_INT >= 17) {
                    b.setTextDirection(i);
                    b.setTextAlignment(i2);
                }
                this.f1174f.show();
            }
        }

        /* renamed from: a */
        public void mo1699a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: a */
        public void mo1700a(ListAdapter listAdapter) {
            this.f1175g = listAdapter;
        }

        /* renamed from: a */
        public void mo1701a(CharSequence charSequence) {
            this.f1176h = charSequence;
        }

        /* renamed from: a */
        public boolean mo1702a() {
            C0065b bVar = this.f1174f;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        /* renamed from: b */
        public int mo1703b() {
            return 0;
        }

        /* renamed from: b */
        public void mo1704b(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: c */
        public void mo1705c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: d */
        public Drawable mo1706d() {
            return null;
        }

        public void dismiss() {
            C0065b bVar = this.f1174f;
            if (bVar != null) {
                bVar.dismiss();
                this.f1174f = null;
            }
        }

        /* renamed from: f */
        public int mo1708f() {
            return 0;
        }

        /* renamed from: g */
        public CharSequence mo1709g() {
            return this.f1176h;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0263t.this.setSelection(i);
            if (C0263t.this.getOnItemClickListener() != null) {
                C0263t.this.performItemClick(null, i, this.f1175g.getItemId(i));
            }
            dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.t$d */
    private static class C0267d implements ListAdapter, SpinnerAdapter {

        /* renamed from: f */
        private SpinnerAdapter f1178f;

        /* renamed from: g */
        private ListAdapter f1179g;

        public C0267d(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f1178f = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1179g = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0256p0) {
                C0256p0 p0Var = (C0256p0) spinnerAdapter;
                if (p0Var.getDropDownViewTheme() == null) {
                    p0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1179g;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1178f;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1178f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1178f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1178f;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1178f;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1179g;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1178f;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1178f;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.t$e */
    class C0268e extends C0215f0 implements C0274g {

        /* renamed from: N */
        private CharSequence f1180N;

        /* renamed from: O */
        ListAdapter f1181O;

        /* renamed from: P */
        private final Rect f1182P = new Rect();

        /* renamed from: Q */
        private int f1183Q;

        /* renamed from: androidx.appcompat.widget.t$e$a */
        class C0269a implements OnItemClickListener {
            C0269a(C0263t tVar) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0263t.this.setSelection(i);
                if (C0263t.this.getOnItemClickListener() != null) {
                    C0268e eVar = C0268e.this;
                    C0263t.this.performItemClick(view, i, eVar.f1181O.getItemId(i));
                }
                C0268e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.t$e$b */
        class C0270b implements OnGlobalLayoutListener {
            C0270b() {
            }

            public void onGlobalLayout() {
                C0268e eVar = C0268e.this;
                if (!eVar.mo1724b((View) C0263t.this)) {
                    C0268e.this.dismiss();
                    return;
                }
                C0268e.this.mo1725q();
                C0268e.super.mo540c();
            }
        }

        /* renamed from: androidx.appcompat.widget.t$e$c */
        class C0271c implements OnDismissListener {

            /* renamed from: f */
            final /* synthetic */ OnGlobalLayoutListener f1187f;

            C0271c(OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1187f = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0263t.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1187f);
                }
            }
        }

        public C0268e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo1393a((View) C0263t.this);
            mo1397a(true);
            mo1408h(0);
            mo1394a((OnItemClickListener) new C0269a(C0263t.this));
        }

        /* renamed from: a */
        public void mo1698a(int i, int i2) {
            boolean a = mo536a();
            mo1725q();
            mo1406g(2);
            super.mo540c();
            ListView e = mo544e();
            e.setChoiceMode(1);
            if (VERSION.SDK_INT >= 17) {
                e.setTextDirection(i);
                e.setTextAlignment(i2);
            }
            mo1410i(C0263t.this.getSelectedItemPosition());
            if (!a) {
                ViewTreeObserver viewTreeObserver = C0263t.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    C0270b bVar = new C0270b();
                    viewTreeObserver.addOnGlobalLayoutListener(bVar);
                    mo1396a((OnDismissListener) new C0271c(bVar));
                }
            }
        }

        /* renamed from: a */
        public void mo1395a(ListAdapter listAdapter) {
            super.mo1395a(listAdapter);
            this.f1181O = listAdapter;
        }

        /* renamed from: a */
        public void mo1701a(CharSequence charSequence) {
            this.f1180N = charSequence;
        }

        /* renamed from: b */
        public void mo1704b(int i) {
            this.f1183Q = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo1724b(View view) {
            return C3379v.m13767C(view) && view.getGlobalVisibleRect(this.f1182P);
        }

        /* renamed from: g */
        public CharSequence mo1709g() {
            return this.f1180N;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1725q() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.mo1401d()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.t r1 = androidx.appcompat.widget.C0263t.this
                android.graphics.Rect r1 = r1.f1170m
                r0.getPadding(r1)
                androidx.appcompat.widget.t r0 = androidx.appcompat.widget.C0263t.this
                boolean r0 = androidx.appcompat.widget.C0293z0.m1487a(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.t r0 = androidx.appcompat.widget.C0263t.this
                android.graphics.Rect r0 = r0.f1170m
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.t r0 = androidx.appcompat.widget.C0263t.this
                android.graphics.Rect r0 = r0.f1170m
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.t r0 = androidx.appcompat.widget.C0263t.this
                android.graphics.Rect r0 = r0.f1170m
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.t r0 = androidx.appcompat.widget.C0263t.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.t r2 = androidx.appcompat.widget.C0263t.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.t r3 = androidx.appcompat.widget.C0263t.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.t r4 = androidx.appcompat.widget.C0263t.this
                int r5 = r4.f1169l
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.f1181O
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.mo1401d()
                int r4 = r4.mo1670a(r5, r6)
                androidx.appcompat.widget.t r5 = androidx.appcompat.widget.C0263t.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.t r6 = androidx.appcompat.widget.C0263t.this
                android.graphics.Rect r6 = r6.f1170m
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.mo1403e(r4)
                goto L_0x0085
            L_0x0082:
                r8.mo1403e(r5)
            L_0x0085:
                androidx.appcompat.widget.t r4 = androidx.appcompat.widget.C0263t.this
                boolean r4 = androidx.appcompat.widget.C0293z0.m1487a(r4)
                if (r4 == 0) goto L_0x009a
                int r3 = r3 - r2
                int r0 = r8.mo1416n()
                int r3 = r3 - r0
                int r0 = r8.mo1726r()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x00a0
            L_0x009a:
                int r2 = r8.mo1726r()
                int r0 = r0 + r2
                int r1 = r1 + r0
            L_0x00a0:
                r8.mo1400c(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0263t.C0268e.mo1725q():void");
        }

        /* renamed from: r */
        public int mo1726r() {
            return this.f1183Q;
        }
    }

    /* renamed from: androidx.appcompat.widget.t$f */
    static class C0272f extends BaseSavedState {
        public static final Creator<C0272f> CREATOR = new C0273a();

        /* renamed from: f */
        boolean f1189f;

        /* renamed from: androidx.appcompat.widget.t$f$a */
        static class C0273a implements Creator<C0272f> {
            C0273a() {
            }

            public C0272f createFromParcel(Parcel parcel) {
                return new C0272f(parcel);
            }

            public C0272f[] newArray(int i) {
                return new C0272f[i];
            }
        }

        C0272f(Parcel parcel) {
            super(parcel);
            this.f1189f = parcel.readByte() != 0;
        }

        C0272f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1189f ? (byte) 1 : 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.t$g */
    interface C0274g {
        /* renamed from: a */
        void mo1697a(int i);

        /* renamed from: a */
        void mo1698a(int i, int i2);

        /* renamed from: a */
        void mo1699a(Drawable drawable);

        /* renamed from: a */
        void mo1700a(ListAdapter listAdapter);

        /* renamed from: a */
        void mo1701a(CharSequence charSequence);

        /* renamed from: a */
        boolean mo1702a();

        /* renamed from: b */
        int mo1703b();

        /* renamed from: b */
        void mo1704b(int i);

        /* renamed from: c */
        void mo1705c(int i);

        /* renamed from: d */
        Drawable mo1706d();

        void dismiss();

        /* renamed from: f */
        int mo1708f();

        /* renamed from: g */
        CharSequence mo1709g();
    }

    public C0263t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3093a.spinnerStyle);
    }

    public C0263t(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0263t(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r11 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r11 != null) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036 A[SYNTHETIC, Splitter:B:10:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0263t(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1170m = r0
            int[] r0 = p071f.p072a.C3102j.Spinner
            r1 = 0
            androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.C0275t0.m1311a(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1163f = r2
            if (r11 == 0) goto L_0x0022
            f.a.o.d r2 = new f.a.o.d
            r2.<init>(r7, r11)
        L_0x001f:
            r6.f1164g = r2
            goto L_0x0032
        L_0x0022:
            int r11 = p071f.p072a.C3102j.Spinner_popupTheme
            int r11 = r0.mo1750g(r11, r1)
            if (r11 == 0) goto L_0x0030
            f.a.o.d r2 = new f.a.o.d
            r2.<init>(r7, r11)
            goto L_0x001f
        L_0x0030:
            r6.f1164g = r7
        L_0x0032:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x0064
            int[] r11 = f1162n     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x004c }
            if (r3 == 0) goto L_0x0046
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x004c }
        L_0x0046:
            if (r11 == 0) goto L_0x0064
        L_0x0048:
            r11.recycle()
            goto L_0x0064
        L_0x004c:
            r3 = move-exception
            goto L_0x0052
        L_0x004e:
            r7 = move-exception
            goto L_0x005e
        L_0x0050:
            r3 = move-exception
            r11 = r2
        L_0x0052:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x005c }
            if (r11 == 0) goto L_0x0064
            goto L_0x0048
        L_0x005c:
            r7 = move-exception
            r2 = r11
        L_0x005e:
            if (r2 == 0) goto L_0x0063
            r2.recycle()
        L_0x0063:
            throw r7
        L_0x0064:
            r11 = 1
            if (r10 == 0) goto L_0x00a1
            if (r10 == r11) goto L_0x006a
            goto L_0x00b1
        L_0x006a:
            androidx.appcompat.widget.t$e r10 = new androidx.appcompat.widget.t$e
            android.content.Context r3 = r6.f1164g
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1164g
            int[] r4 = p071f.p072a.C3102j.Spinner
            androidx.appcompat.widget.t0 r1 = androidx.appcompat.widget.C0275t0.m1311a(r3, r8, r4, r9, r1)
            int r3 = p071f.p072a.C3102j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.mo1748f(r3, r4)
            r6.f1169l = r3
            int r3 = p071f.p072a.C3102j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.mo1741b(r3)
            r10.mo1392a(r3)
            int r3 = p071f.p072a.C3102j.Spinner_android_prompt
            java.lang.String r3 = r0.mo1745d(r3)
            r10.mo1701a(r3)
            r1.mo1737a()
            r6.f1168k = r10
            androidx.appcompat.widget.t$a r1 = new androidx.appcompat.widget.t$a
            r1.<init>(r6, r10)
            r6.f1165h = r1
            goto L_0x00b1
        L_0x00a1:
            androidx.appcompat.widget.t$c r10 = new androidx.appcompat.widget.t$c
            r10.<init>()
            r6.f1168k = r10
            int r1 = p071f.p072a.C3102j.Spinner_android_prompt
            java.lang.String r1 = r0.mo1745d(r1)
            r10.mo1701a(r1)
        L_0x00b1:
            int r10 = p071f.p072a.C3102j.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.mo1749f(r10)
            if (r10 == 0) goto L_0x00c9
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p071f.p072a.C3099g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        L_0x00c9:
            r0.mo1737a()
            r6.f1167j = r11
            android.widget.SpinnerAdapter r7 = r6.f1166i
            if (r7 == 0) goto L_0x00d7
            r6.setAdapter(r7)
            r6.f1166i = r2
        L_0x00d7:
            androidx.appcompat.widget.e r7 = r6.f1163f
            r7.mo1326a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0263t.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1670a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1170m);
            Rect rect = this.f1170m;
            i2 += rect.left + rect.right;
        }
        return i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1671a() {
        if (VERSION.SDK_INT >= 17) {
            this.f1168k.mo1698a(getTextDirection(), getTextAlignment());
        } else {
            this.f1168k.mo1698a(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0211e eVar = this.f1163f;
        if (eVar != null) {
            eVar.mo1321a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0274g gVar = this.f1168k;
        if (gVar != null) {
            return gVar.mo1703b();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0274g gVar = this.f1168k;
        if (gVar != null) {
            return gVar.mo1708f();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1168k != null) {
            return this.f1169l;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final C0274g getInternalPopup() {
        return this.f1168k;
    }

    public Drawable getPopupBackground() {
        C0274g gVar = this.f1168k;
        if (gVar != null) {
            return gVar.mo1706d();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f1164g;
    }

    public CharSequence getPrompt() {
        C0274g gVar = this.f1168k;
        return gVar != null ? gVar.mo1709g() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0211e eVar = this.f1163f;
        if (eVar != null) {
            return eVar.mo1327b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0211e eVar = this.f1163f;
        if (eVar != null) {
            return eVar.mo1329c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0274g gVar = this.f1168k;
        if (gVar != null && gVar.mo1702a()) {
            this.f1168k.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1168k != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1670a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C0272f fVar = (C0272f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f1189f) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new C0265b());
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        C0272f fVar = new C0272f(super.onSaveInstanceState());
        C0274g gVar = this.f1168k;
        fVar.f1189f = gVar != null && gVar.mo1702a();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0208d0 d0Var = this.f1165h;
        if (d0Var == null || !d0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0274g gVar = this.f1168k;
        if (gVar == null) {
            return super.performClick();
        }
        if (!gVar.mo1702a()) {
            mo1671a();
        }
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1167j) {
            this.f1166i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1168k != null) {
            Context context = this.f1164g;
            if (context == null) {
                context = getContext();
            }
            this.f1168k.mo1700a((ListAdapter) new C0267d(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0211e eVar = this.f1163f;
        if (eVar != null) {
            eVar.mo1325a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0211e eVar = this.f1163f;
        if (eVar != null) {
            eVar.mo1322a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0274g gVar = this.f1168k;
        if (gVar != null) {
            gVar.mo1704b(i);
            this.f1168k.mo1705c(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0274g gVar = this.f1168k;
        if (gVar != null) {
            gVar.mo1697a(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1168k != null) {
            this.f1169l = i;
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0274g gVar = this.f1168k;
        if (gVar != null) {
            gVar.mo1699a(drawable);
        } else if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C3103a.m12557c(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0274g gVar = this.f1168k;
        if (gVar != null) {
            gVar.mo1701a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0211e eVar = this.f1163f;
        if (eVar != null) {
            eVar.mo1328b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0211e eVar = this.f1163f;
        if (eVar != null) {
            eVar.mo1324a(mode);
        }
    }
}
