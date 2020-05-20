package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p071f.p072a.C3093a;
import p071f.p072a.C3096d;
import p071f.p072a.C3098f;
import p071f.p072a.C3099g;
import p071f.p072a.C3100h;
import p071f.p072a.C3102j;
import p071f.p072a.p079o.C3126c;
import p071f.p097h.p108m.C3379v;
import p071f.p110i.p111a.C3394a;
import p071f.p112j.p113a.C3400a;

public class SearchView extends C0212e0 implements C3126c {

    /* renamed from: v0 */
    static final C0171k f725v0 = new C0171k();

    /* renamed from: A */
    final ImageView f726A;

    /* renamed from: B */
    final ImageView f727B;

    /* renamed from: C */
    private final View f728C;

    /* renamed from: D */
    private C0177p f729D;

    /* renamed from: E */
    private Rect f730E;

    /* renamed from: F */
    private Rect f731F;

    /* renamed from: G */
    private int[] f732G;

    /* renamed from: H */
    private int[] f733H;

    /* renamed from: I */
    private final ImageView f734I;

    /* renamed from: J */
    private final Drawable f735J;

    /* renamed from: K */
    private final int f736K;

    /* renamed from: L */
    private final int f737L;

    /* renamed from: M */
    private final Intent f738M;

    /* renamed from: N */
    private final Intent f739N;

    /* renamed from: O */
    private final CharSequence f740O;

    /* renamed from: P */
    private C0173m f741P;

    /* renamed from: Q */
    private C0172l f742Q;

    /* renamed from: R */
    OnFocusChangeListener f743R;

    /* renamed from: S */
    private C0174n f744S;

    /* renamed from: T */
    private OnClickListener f745T;

    /* renamed from: U */
    private boolean f746U;

    /* renamed from: V */
    private boolean f747V;

    /* renamed from: W */
    C3394a f748W;

    /* renamed from: a0 */
    private boolean f749a0;

    /* renamed from: b0 */
    private CharSequence f750b0;

    /* renamed from: c0 */
    private boolean f751c0;

    /* renamed from: d0 */
    private boolean f752d0;

    /* renamed from: e0 */
    private int f753e0;

    /* renamed from: f0 */
    private boolean f754f0;

    /* renamed from: g0 */
    private CharSequence f755g0;

    /* renamed from: h0 */
    private CharSequence f756h0;

    /* renamed from: i0 */
    private boolean f757i0;

    /* renamed from: j0 */
    private int f758j0;

    /* renamed from: k0 */
    SearchableInfo f759k0;

    /* renamed from: l0 */
    private Bundle f760l0;

    /* renamed from: m0 */
    private final Runnable f761m0;

    /* renamed from: n0 */
    private Runnable f762n0;

    /* renamed from: o0 */
    private final WeakHashMap<String, ConstantState> f763o0;

    /* renamed from: p0 */
    private final OnClickListener f764p0;

    /* renamed from: q0 */
    OnKeyListener f765q0;

    /* renamed from: r0 */
    private final OnEditorActionListener f766r0;

    /* renamed from: s0 */
    private final OnItemClickListener f767s0;

    /* renamed from: t0 */
    private final OnItemSelectedListener f768t0;

    /* renamed from: u */
    final SearchAutoComplete f769u;

    /* renamed from: u0 */
    private TextWatcher f770u0;

    /* renamed from: v */
    private final View f771v;

    /* renamed from: w */
    private final View f772w;

    /* renamed from: x */
    private final View f773x;

    /* renamed from: y */
    final ImageView f774y;

    /* renamed from: z */
    final ImageView f775z;

    public static class SearchAutoComplete extends C0207d {

        /* renamed from: i */
        private int f776i;

        /* renamed from: j */
        private SearchView f777j;

        /* renamed from: k */
        private boolean f778k;

        /* renamed from: l */
        final Runnable f779l;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0160a implements Runnable {
            C0160a() {
            }

            public void run() {
                SearchAutoComplete.this.mo1103b();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C3093a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f779l = new C0160a();
            this.f776i = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                return (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160;
            }
            return 256;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo1102a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1103b() {
            if (this.f778k) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f778k = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f776i <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f778k) {
                removeCallbacks(this.f779l);
                post(this.f779l);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f777j.mo1078j();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f777j.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f777j.hasFocus() && getVisibility() == 0) {
                this.f778k = true;
                if (SearchView.m869a(getContext())) {
                    SearchView.f725v0.mo1130a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: 0000 */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f778k = false;
                removeCallbacks(this.f779l);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f778k = false;
                removeCallbacks(this.f779l);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f778k = true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setSearchView(SearchView searchView) {
            this.f777j = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f776i = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0161a implements TextWatcher {
        C0161a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo1061b(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0162b implements Runnable {
        C0162b() {
        }

        public void run() {
            SearchView.this.mo1080l();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0163c implements Runnable {
        C0163c() {
        }

        public void run() {
            C3394a aVar = SearchView.this.f748W;
            if (aVar instanceof C0248m0) {
                aVar.mo1574a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0164d implements OnFocusChangeListener {
        C0164d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            OnFocusChangeListener onFocusChangeListener = searchView.f743R;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0165e implements OnLayoutChangeListener {
        C0165e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo1063d();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0166f implements OnClickListener {
        C0166f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f774y) {
                searchView.mo1076h();
            } else if (view == searchView.f726A) {
                searchView.mo1067g();
            } else if (view == searchView.f775z) {
                searchView.mo1077i();
            } else if (view == searchView.f727B) {
                searchView.mo1079k();
            } else if (view == searchView.f769u) {
                searchView.mo1065e();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0167g implements OnKeyListener {
        C0167g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f759k0 == null) {
                return false;
            }
            if (searchView.f769u.isPopupShowing() && SearchView.this.f769u.getListSelection() != -1) {
                return SearchView.this.mo1060a(view, i, keyEvent);
            }
            if (SearchView.this.f769u.mo1102a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo1056a(0, (String) null, searchView2.f769u.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0168h implements OnEditorActionListener {
        C0168h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1077i();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0169i implements OnItemClickListener {
        C0169i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1059a(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0170j implements OnItemSelectedListener {
        C0170j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1064d(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    private static class C0171k {

        /* renamed from: a */
        private Method f791a;

        /* renamed from: b */
        private Method f792b;

        /* renamed from: c */
        private Method f793c;

        C0171k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f791a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f792b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f793c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1129a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f792b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1130a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f793c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1131b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f791a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0172l {
        /* renamed from: a */
        boolean mo1132a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0173m {
        /* renamed from: a */
        boolean mo1133a(String str);

        /* renamed from: b */
        boolean mo1134b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C0174n {
        /* renamed from: a */
        boolean mo1135a(int i);

        /* renamed from: b */
        boolean mo1136b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    static class C0175o extends C3400a {
        public static final Creator<C0175o> CREATOR = new C0176a();

        /* renamed from: h */
        boolean f794h;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        static class C0176a implements ClassLoaderCreator<C0175o> {
            C0176a() {
            }

            public C0175o createFromParcel(Parcel parcel) {
                return new C0175o(parcel, null);
            }

            public C0175o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0175o(parcel, classLoader);
            }

            public C0175o[] newArray(int i) {
                return new C0175o[i];
            }
        }

        public C0175o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f794h = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        C0175o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.f794h);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f794h));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    private static class C0177p extends TouchDelegate {

        /* renamed from: a */
        private final View f795a;

        /* renamed from: b */
        private final Rect f796b = new Rect();

        /* renamed from: c */
        private final Rect f797c = new Rect();

        /* renamed from: d */
        private final Rect f798d = new Rect();

        /* renamed from: e */
        private final int f799e;

        /* renamed from: f */
        private boolean f800f;

        public C0177p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f799e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1142a(rect, rect2);
            this.f795a = view;
        }

        /* renamed from: a */
        public void mo1142a(Rect rect, Rect rect2) {
            this.f796b.set(rect);
            this.f798d.set(rect);
            Rect rect3 = this.f798d;
            int i = this.f799e;
            rect3.inset(-i, -i);
            this.f797c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f800f
                r7.f800f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f800f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f798d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f796b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f800f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x006e
                if (r2 == 0) goto L_0x005b
                android.graphics.Rect r2 = r7.f797c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                android.view.View r0 = r7.f795a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f795a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0064
            L_0x005b:
                android.graphics.Rect r2 = r7.f797c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0064:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.f795a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0177p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3093a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f730E = new Rect();
        this.f731F = new Rect();
        this.f732G = new int[2];
        this.f733H = new int[2];
        this.f761m0 = new C0162b();
        this.f762n0 = new C0163c();
        this.f763o0 = new WeakHashMap<>();
        this.f764p0 = new C0166f();
        this.f765q0 = new C0167g();
        this.f766r0 = new C0168h();
        this.f767s0 = new C0169i();
        this.f768t0 = new C0170j();
        this.f770u0 = new C0161a();
        C0275t0 a = C0275t0.m1311a(context, attributeSet, C3102j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.mo1750g(C3102j.SearchView_layout, C3099g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C3098f.search_src_text);
        this.f769u = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f771v = findViewById(C3098f.search_edit_frame);
        this.f772w = findViewById(C3098f.search_plate);
        this.f773x = findViewById(C3098f.submit_area);
        this.f774y = (ImageView) findViewById(C3098f.search_button);
        this.f775z = (ImageView) findViewById(C3098f.search_go_btn);
        this.f726A = (ImageView) findViewById(C3098f.search_close_btn);
        this.f727B = (ImageView) findViewById(C3098f.search_voice_btn);
        this.f734I = (ImageView) findViewById(C3098f.search_mag_icon);
        C3379v.m13787a(this.f772w, a.mo1741b(C3102j.SearchView_queryBackground));
        C3379v.m13787a(this.f773x, a.mo1741b(C3102j.SearchView_submitBackground));
        this.f774y.setImageDrawable(a.mo1741b(C3102j.SearchView_searchIcon));
        this.f775z.setImageDrawable(a.mo1741b(C3102j.SearchView_goIcon));
        this.f726A.setImageDrawable(a.mo1741b(C3102j.SearchView_closeIcon));
        this.f727B.setImageDrawable(a.mo1741b(C3102j.SearchView_voiceIcon));
        this.f734I.setImageDrawable(a.mo1741b(C3102j.SearchView_searchIcon));
        this.f735J = a.mo1741b(C3102j.SearchView_searchHintIcon);
        C0283v0.m1404a(this.f774y, getResources().getString(C3100h.abc_searchview_description_search));
        this.f736K = a.mo1750g(C3102j.SearchView_suggestionRowLayout, C3099g.abc_search_dropdown_item_icons_2line);
        this.f737L = a.mo1750g(C3102j.SearchView_commitIcon, 0);
        this.f774y.setOnClickListener(this.f764p0);
        this.f726A.setOnClickListener(this.f764p0);
        this.f775z.setOnClickListener(this.f764p0);
        this.f727B.setOnClickListener(this.f764p0);
        this.f769u.setOnClickListener(this.f764p0);
        this.f769u.addTextChangedListener(this.f770u0);
        this.f769u.setOnEditorActionListener(this.f766r0);
        this.f769u.setOnItemClickListener(this.f767s0);
        this.f769u.setOnItemSelectedListener(this.f768t0);
        this.f769u.setOnKeyListener(this.f765q0);
        this.f769u.setOnFocusChangeListener(new C0164d());
        setIconifiedByDefault(a.mo1738a(C3102j.SearchView_iconifiedByDefault, true));
        int c = a.mo1742c(C3102j.SearchView_android_maxWidth, -1);
        if (c != -1) {
            setMaxWidth(c);
        }
        this.f740O = a.mo1747e(C3102j.SearchView_defaultQueryHint);
        this.f750b0 = a.mo1747e(C3102j.SearchView_queryHint);
        int d = a.mo1744d(C3102j.SearchView_android_imeOptions, -1);
        if (d != -1) {
            setImeOptions(d);
        }
        int d2 = a.mo1744d(C3102j.SearchView_android_inputType, -1);
        if (d2 != -1) {
            setInputType(d2);
        }
        setFocusable(a.mo1738a(C3102j.SearchView_android_focusable, true));
        a.mo1737a();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f738M = intent;
        intent.addFlags(268435456);
        this.f738M.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f739N = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.f769u.getDropDownAnchor());
        this.f728C = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new C0165e());
        }
        m871b(this.f746U);
        m881r();
    }

    /* renamed from: a */
    private Intent m863a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f760l0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    private Intent m864a(Cursor cursor, int i, String str) {
        int i2;
        try {
            String a = C0248m0.m1217a(cursor, "suggest_intent_action");
            if (a == null) {
                a = this.f759k0.getSuggestIntentAction();
            }
            if (a == null) {
                a = "android.intent.action.SEARCH";
            }
            String str2 = a;
            String a2 = C0248m0.m1217a(cursor, "suggest_intent_data");
            if (a2 == null) {
                a2 = this.f759k0.getSuggestIntentData();
            }
            if (a2 != null) {
                String a3 = C0248m0.m1217a(cursor, "suggest_intent_data_id");
                if (a3 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(a2);
                    sb.append("/");
                    sb.append(Uri.encode(a3));
                    a2 = sb.toString();
                }
            }
            return m865a(str2, a2 == null ? null : Uri.parse(a2), C0248m0.m1217a(cursor, "suggest_intent_extra_data"), C0248m0.m1217a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Search suggestions cursor at row ");
            sb2.append(i2);
            sb2.append(" returned exception.");
            Log.w("SearchView", sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    private Intent m865a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f756h0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f760l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f759k0.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m866a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed launch activity: ");
                sb.append(intent);
                Log.e("SearchView", sb.toString(), e);
            }
        }
    }

    /* renamed from: a */
    private void m867a(View view, Rect rect) {
        view.getLocationInWindow(this.f732G);
        getLocationInWindow(this.f733H);
        int[] iArr = this.f732G;
        int i = iArr[1];
        int[] iArr2 = this.f733H;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: a */
    private void m868a(boolean z) {
        this.f775z.setVisibility((!this.f749a0 || !m878o() || !hasFocus() || (!z && this.f754f0)) ? 8 : 0);
    }

    /* renamed from: a */
    static boolean m869a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private Intent m870b(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: b */
    private void m871b(boolean z) {
        this.f747V = z;
        int i = 0;
        boolean z2 = !TextUtils.isEmpty(this.f769u.getText());
        this.f774y.setVisibility(z ? 0 : 8);
        m868a(z2);
        this.f771v.setVisibility(z ? 8 : 0);
        if (this.f734I.getDrawable() == null || this.f746U) {
            i = 8;
        }
        this.f734I.setVisibility(i);
        m880q();
        m874c(!z2);
        m883t();
    }

    /* renamed from: b */
    private boolean m872b(int i, int i2, String str) {
        Cursor a = this.f748W.mo10864a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m866a(m864a(a, i2, str));
        return true;
    }

    /* renamed from: c */
    private CharSequence m873c(CharSequence charSequence) {
        if (!this.f746U || this.f735J == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f769u.getTextSize()) * 1.25d);
        this.f735J.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f735J), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private void m874c(boolean z) {
        int i = 8;
        if (this.f754f0 && !mo1066f() && z) {
            this.f775z.setVisibility(8);
            i = 0;
        }
        this.f727B.setVisibility(i);
    }

    /* renamed from: e */
    private void m875e(int i) {
        Editable text = this.f769u.getText();
        Cursor a = this.f748W.mo10864a();
        if (a != null) {
            if (a.moveToPosition(i)) {
                CharSequence b = this.f748W.mo1577b(a);
                if (b != null) {
                    setQuery(b);
                }
            }
            setQuery(text);
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C3096d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C3096d.abc_search_view_preferred_width);
    }

    /* renamed from: m */
    private void m876m() {
        this.f769u.dismissDropDown();
    }

    /* renamed from: n */
    private boolean m877n() {
        SearchableInfo searchableInfo = this.f759k0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f759k0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f738M;
        } else if (this.f759k0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f739N;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: o */
    private boolean m878o() {
        return (this.f749a0 || this.f754f0) && !mo1066f();
    }

    /* renamed from: p */
    private void m879p() {
        post(this.f761m0);
    }

    /* renamed from: q */
    private void m880q() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f769u.getText());
        int i = 0;
        if (!z2 && (!this.f746U || this.f757i0)) {
            z = false;
        }
        ImageView imageView = this.f726A;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f726A.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: r */
    private void m881r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f769u;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m873c(queryHint));
    }

    /* renamed from: s */
    private void m882s() {
        this.f769u.setThreshold(this.f759k0.getSuggestThreshold());
        this.f769u.setImeOptions(this.f759k0.getImeOptions());
        int inputType = this.f759k0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f759k0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f769u.setInputType(inputType);
        C3394a aVar = this.f748W;
        if (aVar != null) {
            aVar.mo1574a(null);
        }
        if (this.f759k0.getSuggestAuthority() != null) {
            C0248m0 m0Var = new C0248m0(getContext(), this, this.f759k0, this.f763o0);
            this.f748W = m0Var;
            this.f769u.setAdapter(m0Var);
            C0248m0 m0Var2 = (C0248m0) this.f748W;
            if (this.f751c0) {
                i = 2;
            }
            m0Var2.mo1573a(i);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f769u.setText(charSequence);
        this.f769u.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: t */
    private void m883t() {
        this.f773x.setVisibility((!m878o() || !(this.f775z.getVisibility() == 0 || this.f727B.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: a */
    public void mo776a() {
        if (!this.f757i0) {
            this.f757i0 = true;
            int imeOptions = this.f769u.getImeOptions();
            this.f758j0 = imeOptions;
            this.f769u.setImeOptions(imeOptions | 33554432);
            this.f769u.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1056a(int i, String str, String str2) {
        getContext().startActivity(m865a("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1057a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    public void mo1058a(CharSequence charSequence, boolean z) {
        this.f769u.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f769u;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f756h0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1077i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1059a(int i, int i2, String str) {
        C0174n nVar = this.f744S;
        if (nVar != null && nVar.mo1136b(i)) {
            return false;
        }
        m872b(i, 0, null);
        this.f769u.setImeVisibility(false);
        m876m();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1060a(View view, int i, KeyEvent keyEvent) {
        if (this.f759k0 != null && this.f748W != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1059a(this.f769u.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.f769u.setSelection(i == 21 ? 0 : this.f769u.length());
                this.f769u.setListSelection(0);
                this.f769u.clearListSelection();
                f725v0.mo1130a(this.f769u, true);
                return true;
            } else if (i != 19 || this.f769u.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1061b(CharSequence charSequence) {
        Editable text = this.f769u.getText();
        this.f756h0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m868a(z);
        m874c(!z);
        m880q();
        m883t();
        if (this.f741P != null && !TextUtils.equals(charSequence, this.f755g0)) {
            this.f741P.mo1133a(charSequence.toString());
        }
        this.f755g0 = charSequence.toString();
    }

    /* renamed from: c */
    public void mo778c() {
        mo1058a((CharSequence) "", false);
        clearFocus();
        m871b(true);
        this.f769u.setImeOptions(this.f758j0);
        this.f757i0 = false;
    }

    public void clearFocus() {
        this.f752d0 = true;
        super.clearFocus();
        this.f769u.clearFocus();
        this.f769u.setImeVisibility(false);
        this.f752d0 = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1063d() {
        if (this.f728C.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f772w.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C0293z0.m1487a(this);
            int dimensionPixelSize = this.f746U ? resources.getDimensionPixelSize(C3096d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C3096d.abc_dropdownitem_text_padding_left) : 0;
            this.f769u.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            this.f769u.setDropDownHorizontalOffset(a ? -i : paddingLeft - (i + dimensionPixelSize));
            this.f769u.setDropDownWidth((((this.f728C.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo1064d(int i) {
        C0174n nVar = this.f744S;
        if (nVar != null && nVar.mo1135a(i)) {
            return false;
        }
        m875e(i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1065e() {
        if (VERSION.SDK_INT >= 29) {
            this.f769u.refreshAutoCompleteResults();
            return;
        }
        f725v0.mo1131b(this.f769u);
        f725v0.mo1129a(this.f769u);
    }

    /* renamed from: f */
    public boolean mo1066f() {
        return this.f747V;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1067g() {
        if (!TextUtils.isEmpty(this.f769u.getText())) {
            this.f769u.setText("");
            this.f769u.requestFocus();
            this.f769u.setImeVisibility(true);
        } else if (this.f746U) {
            C0172l lVar = this.f742Q;
            if (lVar == null || !lVar.mo1132a()) {
                clearFocus();
                m871b(true);
            }
        }
    }

    public int getImeOptions() {
        return this.f769u.getImeOptions();
    }

    public int getInputType() {
        return this.f769u.getInputType();
    }

    public int getMaxWidth() {
        return this.f753e0;
    }

    public CharSequence getQuery() {
        return this.f769u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f750b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f759k0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f740O : getContext().getText(this.f759k0.getHintId());
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionCommitIconResId() {
        return this.f737L;
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionRowLayout() {
        return this.f736K;
    }

    public C3394a getSuggestionsAdapter() {
        return this.f748W;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo1076h() {
        m871b(false);
        this.f769u.requestFocus();
        this.f769u.setImeVisibility(true);
        OnClickListener onClickListener = this.f745T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo1077i() {
        Editable text = this.f769u.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0173m mVar = this.f741P;
            if (mVar == null || !mVar.mo1134b(text.toString())) {
                if (this.f759k0 != null) {
                    mo1056a(0, (String) null, text.toString());
                }
                this.f769u.setImeVisibility(false);
                m876m();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1078j() {
        m871b(mo1066f());
        m879p();
        if (this.f769u.hasFocus()) {
            mo1065e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo1079k() {
        Intent a;
        SearchableInfo searchableInfo = this.f759k0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    a = m870b(this.f738M, searchableInfo);
                } else {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        a = m863a(this.f739N, searchableInfo);
                    }
                }
                getContext().startActivity(a);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo1080l() {
        int[] iArr = this.f769u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f772w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f773x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f761m0);
        post(this.f762n0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m867a((View) this.f769u, this.f730E);
            Rect rect = this.f731F;
            Rect rect2 = this.f730E;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0177p pVar = this.f729D;
            if (pVar == null) {
                C0177p pVar2 = new C0177p(this.f731F, this.f730E, this.f769u);
                this.f729D = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.mo1142a(this.f731F, this.f730E);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 > 0) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo1066f()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f753e0
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f753e0
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f753e0
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0175o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0175o oVar = (C0175o) parcelable;
        super.onRestoreInstanceState(oVar.mo10880a());
        m871b(oVar.f794h);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0175o oVar = new C0175o(super.onSaveInstanceState());
        oVar.f794h = mo1066f();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m879p();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f752d0 || !isFocusable()) {
            return false;
        }
        if (mo1066f()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f769u.requestFocus(i, rect);
        if (requestFocus) {
            m871b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f760l0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1067g();
        } else {
            mo1076h();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f746U != z) {
            this.f746U = z;
            m871b(z);
            m881r();
        }
    }

    public void setImeOptions(int i) {
        this.f769u.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f769u.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f753e0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0172l lVar) {
        this.f742Q = lVar;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f743R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0173m mVar) {
        this.f741P = mVar;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f745T = onClickListener;
    }

    public void setOnSuggestionListener(C0174n nVar) {
        this.f744S = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f750b0 = charSequence;
        m881r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f751c0 = z;
        C3394a aVar = this.f748W;
        if (aVar instanceof C0248m0) {
            ((C0248m0) aVar).mo1573a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f759k0 = searchableInfo;
        if (searchableInfo != null) {
            m882s();
            m881r();
        }
        boolean n = m877n();
        this.f754f0 = n;
        if (n) {
            this.f769u.setPrivateImeOptions("nm");
        }
        m871b(mo1066f());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f749a0 = z;
        m871b(mo1066f());
    }

    public void setSuggestionsAdapter(C3394a aVar) {
        this.f748W = aVar;
        this.f769u.setAdapter(aVar);
    }
}
