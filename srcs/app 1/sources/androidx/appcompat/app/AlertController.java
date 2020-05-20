package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0212e0.C0213a;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.C0378b;
import java.lang.ref.WeakReference;
import p071f.p072a.C3093a;
import p071f.p072a.C3098f;
import p071f.p072a.C3102j;
import p071f.p097h.p108m.C3379v;

class AlertController {

    /* renamed from: A */
    NestedScrollView f97A;

    /* renamed from: B */
    private int f98B = 0;

    /* renamed from: C */
    private Drawable f99C;

    /* renamed from: D */
    private ImageView f100D;

    /* renamed from: E */
    private TextView f101E;

    /* renamed from: F */
    private TextView f102F;

    /* renamed from: G */
    private View f103G;

    /* renamed from: H */
    ListAdapter f104H;

    /* renamed from: I */
    int f105I = -1;

    /* renamed from: J */
    private int f106J;

    /* renamed from: K */
    private int f107K;

    /* renamed from: L */
    int f108L;

    /* renamed from: M */
    int f109M;

    /* renamed from: N */
    int f110N;

    /* renamed from: O */
    int f111O;

    /* renamed from: P */
    private boolean f112P;

    /* renamed from: Q */
    private int f113Q = 0;

    /* renamed from: R */
    Handler f114R;

    /* renamed from: S */
    private final OnClickListener f115S = new C0047a();

    /* renamed from: a */
    private final Context f116a;

    /* renamed from: b */
    final C0090g f117b;

    /* renamed from: c */
    private final Window f118c;

    /* renamed from: d */
    private final int f119d;

    /* renamed from: e */
    private CharSequence f120e;

    /* renamed from: f */
    private CharSequence f121f;

    /* renamed from: g */
    ListView f122g;

    /* renamed from: h */
    private View f123h;

    /* renamed from: i */
    private int f124i;

    /* renamed from: j */
    private int f125j;

    /* renamed from: k */
    private int f126k;

    /* renamed from: l */
    private int f127l;

    /* renamed from: m */
    private int f128m;

    /* renamed from: n */
    private boolean f129n = false;

    /* renamed from: o */
    Button f130o;

    /* renamed from: p */
    private CharSequence f131p;

    /* renamed from: q */
    Message f132q;

    /* renamed from: r */
    private Drawable f133r;

    /* renamed from: s */
    Button f134s;

    /* renamed from: t */
    private CharSequence f135t;

    /* renamed from: u */
    Message f136u;

    /* renamed from: v */
    private Drawable f137v;

    /* renamed from: w */
    Button f138w;

    /* renamed from: x */
    private CharSequence f139x;

    /* renamed from: y */
    Message f140y;

    /* renamed from: z */
    private Drawable f141z;

    public static class RecycleListView extends ListView {

        /* renamed from: f */
        private final int f142f;

        /* renamed from: g */
        private final int f143g;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3102j.RecycleListView);
            this.f143g = obtainStyledAttributes.getDimensionPixelOffset(C3102j.RecycleListView_paddingBottomNoButtons, -1);
            this.f142f = obtainStyledAttributes.getDimensionPixelOffset(C3102j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void mo150a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f142f, getPaddingRight(), z2 ? getPaddingBottom() : this.f143g);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0047a implements OnClickListener {
        C0047a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
            if (r0 != null) goto L_0x000a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
            r3 = android.os.Message.obtain(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r0 != null) goto L_0x000a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f130o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.f132q
                if (r0 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002a
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f134s
                if (r3 != r1) goto L_0x001a
                android.os.Message r0 = r0.f136u
                if (r0 == 0) goto L_0x001a
                goto L_0x000a
            L_0x001a:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f138w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f140y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f114R
                r1 = 1
                androidx.appcompat.app.g r3 = r3.f117b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0047a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0048b implements C0378b {

        /* renamed from: a */
        final /* synthetic */ View f145a;

        /* renamed from: b */
        final /* synthetic */ View f146b;

        C0048b(AlertController alertController, View view, View view2) {
            this.f145a = view;
            this.f146b = view2;
        }

        /* renamed from: a */
        public void mo152a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m156a(nestedScrollView, this.f145a, this.f146b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0049c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f147f;

        /* renamed from: g */
        final /* synthetic */ View f148g;

        C0049c(View view, View view2) {
            this.f147f = view;
            this.f148g = view2;
        }

        public void run() {
            AlertController.m156a(AlertController.this.f97A, this.f147f, this.f148g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0050d implements OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f150a;

        /* renamed from: b */
        final /* synthetic */ View f151b;

        C0050d(AlertController alertController, View view, View view2) {
            this.f150a = view;
            this.f151b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m156a(absListView, this.f150a, this.f151b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0051e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f152f;

        /* renamed from: g */
        final /* synthetic */ View f153g;

        C0051e(View view, View view2) {
            this.f152f = view;
            this.f153g = view2;
        }

        public void run() {
            AlertController.m156a(AlertController.this.f122g, this.f152f, this.f153g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0052f {

        /* renamed from: A */
        public int f155A;

        /* renamed from: B */
        public int f156B;

        /* renamed from: C */
        public int f157C;

        /* renamed from: D */
        public int f158D;

        /* renamed from: E */
        public boolean f159E = false;

        /* renamed from: F */
        public boolean[] f160F;

        /* renamed from: G */
        public boolean f161G;

        /* renamed from: H */
        public boolean f162H;

        /* renamed from: I */
        public int f163I = -1;

        /* renamed from: J */
        public OnMultiChoiceClickListener f164J;

        /* renamed from: K */
        public Cursor f165K;

        /* renamed from: L */
        public String f166L;

        /* renamed from: M */
        public String f167M;

        /* renamed from: N */
        public OnItemSelectedListener f168N;

        /* renamed from: O */
        public C0057e f169O;

        /* renamed from: a */
        public final Context f170a;

        /* renamed from: b */
        public final LayoutInflater f171b;

        /* renamed from: c */
        public int f172c = 0;

        /* renamed from: d */
        public Drawable f173d;

        /* renamed from: e */
        public int f174e = 0;

        /* renamed from: f */
        public CharSequence f175f;

        /* renamed from: g */
        public View f176g;

        /* renamed from: h */
        public CharSequence f177h;

        /* renamed from: i */
        public CharSequence f178i;

        /* renamed from: j */
        public Drawable f179j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f180k;

        /* renamed from: l */
        public CharSequence f181l;

        /* renamed from: m */
        public Drawable f182m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f183n;

        /* renamed from: o */
        public CharSequence f184o;

        /* renamed from: p */
        public Drawable f185p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f186q;

        /* renamed from: r */
        public boolean f187r;

        /* renamed from: s */
        public OnCancelListener f188s;

        /* renamed from: t */
        public OnDismissListener f189t;

        /* renamed from: u */
        public OnKeyListener f190u;

        /* renamed from: v */
        public CharSequence[] f191v;

        /* renamed from: w */
        public ListAdapter f192w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f193x;

        /* renamed from: y */
        public int f194y;

        /* renamed from: z */
        public View f195z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class C0053a extends ArrayAdapter<CharSequence> {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f196f;

            C0053a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                this.f196f = recycleListView;
                super(context, i, i2, charSequenceArr);
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0052f.this.f160F;
                if (zArr != null && zArr[i]) {
                    this.f196f.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class C0054b extends CursorAdapter {

            /* renamed from: f */
            private final int f198f;

            /* renamed from: g */
            private final int f199g;

            /* renamed from: h */
            final /* synthetic */ RecycleListView f200h;

            /* renamed from: i */
            final /* synthetic */ AlertController f201i;

            C0054b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                this.f200h = recycleListView;
                this.f201i = alertController;
                super(context, cursor, z);
                Cursor cursor2 = getCursor();
                this.f198f = cursor2.getColumnIndexOrThrow(C0052f.this.f166L);
                this.f199g = cursor2.getColumnIndexOrThrow(C0052f.this.f167M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f198f));
                RecycleListView recycleListView = this.f200h;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f199g) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0052f.this.f171b.inflate(this.f201i.f109M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class C0055c implements OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ AlertController f203f;

            C0055c(AlertController alertController) {
                this.f203f = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0052f.this.f193x.onClick(this.f203f.f117b, i);
                if (!C0052f.this.f162H) {
                    this.f203f.f117b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class C0056d implements OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f205f;

            /* renamed from: g */
            final /* synthetic */ AlertController f206g;

            C0056d(RecycleListView recycleListView, AlertController alertController) {
                this.f205f = recycleListView;
                this.f206g = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0052f.this.f160F;
                if (zArr != null) {
                    zArr[i] = this.f205f.isItemChecked(i);
                }
                C0052f.this.f164J.onClick(this.f206g.f117b, i, this.f205f.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0057e {
            /* renamed from: a */
            void mo163a(ListView listView);
        }

        public C0052f(Context context) {
            this.f170a = context;
            this.f187r = true;
            this.f171b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v1, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v2, types: [androidx.appcompat.app.AlertController$h] */
        /* JADX WARNING: type inference failed for: r2v2, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v22, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: type inference failed for: r9v6 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v25, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [android.widget.ListAdapter]
          assigns: [android.widget.ListAdapter, android.widget.SimpleCursorAdapter, androidx.appcompat.app.AlertController$f$b, androidx.appcompat.app.AlertController$f$a]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.widget.ListAdapter, android.widget.SimpleCursorAdapter, androidx.appcompat.app.AlertController$f$b, androidx.appcompat.app.AlertController$f$a]
          mth insns count: 69
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m183b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f171b
                int r1 = r11.f108L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f161G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f165K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f170a
                int r4 = r11.f109M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f191v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f170a
                android.database.Cursor r4 = r10.f165K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f162H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f110N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f111O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f165K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f170a
                android.database.Cursor r5 = r10.f165K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f166L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f192w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f170a
                java.lang.CharSequence[] r3 = r10.f191v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f169O
                if (r1 == 0) goto L_0x0072
                r1.mo163a(r0)
            L_0x0072:
                r11.f104H = r9
                int r1 = r10.f163I
                r11.f105I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f193x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L_0x0081:
                r0.setOnItemClickListener(r1)
                goto L_0x008f
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f164J
                if (r1 == 0) goto L_0x008f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L_0x0081
            L_0x008f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f168N
                if (r1 == 0) goto L_0x0096
                r0.setOnItemSelectedListener(r1)
            L_0x0096:
                boolean r1 = r10.f162H
                if (r1 == 0) goto L_0x009e
                r0.setChoiceMode(r8)
                goto L_0x00a6
            L_0x009e:
                boolean r1 = r10.f161G
                if (r1 == 0) goto L_0x00a6
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a6:
                r11.f122g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0052f.m183b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo157a(AlertController alertController) {
            View view = this.f176g;
            if (view != null) {
                alertController.mo140a(view);
            } else {
                CharSequence charSequence = this.f175f;
                if (charSequence != null) {
                    alertController.mo147b(charSequence);
                }
                Drawable drawable = this.f173d;
                if (drawable != null) {
                    alertController.mo139a(drawable);
                }
                int i = this.f172c;
                if (i != 0) {
                    alertController.mo145b(i);
                }
                int i2 = this.f174e;
                if (i2 != 0) {
                    alertController.mo145b(alertController.mo136a(i2));
                }
            }
            CharSequence charSequence2 = this.f177h;
            if (charSequence2 != null) {
                alertController.mo142a(charSequence2);
            }
            if (!(this.f178i == null && this.f179j == null)) {
                alertController.mo138a(-1, this.f178i, this.f180k, (Message) null, this.f179j);
            }
            if (!(this.f181l == null && this.f182m == null)) {
                alertController.mo138a(-2, this.f181l, this.f183n, (Message) null, this.f182m);
            }
            if (!(this.f184o == null && this.f185p == null)) {
                alertController.mo138a(-3, this.f184o, this.f186q, (Message) null, this.f185p);
            }
            if (!(this.f191v == null && this.f165K == null && this.f192w == null)) {
                m183b(alertController);
            }
            View view2 = this.f195z;
            if (view2 == null) {
                int i3 = this.f194y;
                if (i3 != 0) {
                    alertController.mo149c(i3);
                }
            } else if (this.f159E) {
                alertController.mo141a(view2, this.f155A, this.f156B, this.f157C, this.f158D);
            } else {
                alertController.mo146b(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class C0058g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f208a;

        public C0058g(DialogInterface dialogInterface) {
            this.f208a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f208a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0059h extends ArrayAdapter<CharSequence> {
        public C0059h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0090g gVar, Window window) {
        this.f116a = context;
        this.f117b = gVar;
        this.f118c = window;
        this.f114R = new C0058g(gVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C3102j.AlertDialog, C3093a.alertDialogStyle, 0);
        this.f106J = obtainStyledAttributes.getResourceId(C3102j.AlertDialog_android_layout, 0);
        this.f107K = obtainStyledAttributes.getResourceId(C3102j.AlertDialog_buttonPanelSideLayout, 0);
        this.f108L = obtainStyledAttributes.getResourceId(C3102j.AlertDialog_listLayout, 0);
        this.f109M = obtainStyledAttributes.getResourceId(C3102j.AlertDialog_multiChoiceItemLayout, 0);
        this.f110N = obtainStyledAttributes.getResourceId(C3102j.AlertDialog_singleChoiceItemLayout, 0);
        this.f111O = obtainStyledAttributes.getResourceId(C3102j.AlertDialog_listItemLayout, 0);
        this.f112P = obtainStyledAttributes.getBoolean(C3102j.AlertDialog_showTitle, true);
        this.f119d = obtainStyledAttributes.getDimensionPixelSize(C3102j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        gVar.mo363a(1);
    }

    /* renamed from: a */
    private ViewGroup m155a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    static void m156a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m157a(ViewGroup viewGroup) {
        boolean z;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f130o = button2;
        button2.setOnClickListener(this.f115S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f131p) || this.f133r != null) {
            this.f130o.setText(this.f131p);
            Drawable drawable = this.f133r;
            if (drawable != null) {
                int i = this.f119d;
                drawable.setBounds(0, 0, i, i);
                this.f130o.setCompoundDrawables(this.f133r, null, null, null);
            }
            this.f130o.setVisibility(0);
            z = true;
        } else {
            this.f130o.setVisibility(8);
            z = false;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f134s = button3;
        button3.setOnClickListener(this.f115S);
        if (!TextUtils.isEmpty(this.f135t) || this.f137v != null) {
            this.f134s.setText(this.f135t);
            Drawable drawable2 = this.f137v;
            if (drawable2 != null) {
                int i2 = this.f119d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f134s.setCompoundDrawables(this.f137v, null, null, null);
            }
            this.f134s.setVisibility(0);
            z |= true;
        } else {
            this.f134s.setVisibility(8);
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f138w = button4;
        button4.setOnClickListener(this.f115S);
        if (!TextUtils.isEmpty(this.f139x) || this.f141z != null) {
            this.f138w.setText(this.f139x);
            Drawable drawable3 = this.f133r;
            if (drawable3 != null) {
                int i3 = this.f119d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f130o.setCompoundDrawables(this.f133r, null, null, null);
            }
            this.f138w.setVisibility(0);
            z |= true;
        } else {
            this.f138w.setVisibility(8);
        }
        if (m160a(this.f116a)) {
            if (z) {
                button = this.f130o;
            } else if (z) {
                button = this.f134s;
            } else if (z) {
                button = this.f138w;
            }
            m159a(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m158a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f118c.findViewById(C3098f.scrollIndicatorUp);
        View findViewById2 = this.f118c.findViewById(C3098f.scrollIndicatorDown);
        if (VERSION.SDK_INT >= 23) {
            C3379v.m13782a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById != null || findViewById2 != null) {
                if (this.f121f != null) {
                    this.f97A.setOnScrollChangeListener(new C0048b(this, findViewById, findViewById2));
                    this.f97A.post(new C0049c(findViewById, findViewById2));
                    return;
                }
                ListView listView = this.f122g;
                if (listView != null) {
                    listView.setOnScrollListener(new C0050d(this, findViewById, findViewById2));
                    this.f122g.post(new C0051e(findViewById, findViewById2));
                    return;
                }
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (findViewById2 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        viewGroup.removeView(findViewById2);
    }

    /* renamed from: a */
    private void m159a(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static boolean m160a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3093a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: b */
    private void m161b(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f118c.findViewById(C3098f.scrollView);
        this.f97A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f97A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f102F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f121f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.f97A.removeView(this.f102F);
                if (this.f122g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f97A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f97A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f122g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: c */
    private int m162c() {
        int i = this.f107K;
        return i == 0 ? this.f106J : this.f113Q == 1 ? i : this.f106J;
    }

    /* renamed from: c */
    private void m163c(ViewGroup viewGroup) {
        View view = this.f123h;
        boolean z = false;
        if (view == null) {
            view = this.f124i != 0 ? LayoutInflater.from(this.f116a).inflate(this.f124i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m164c(view)) {
            this.f118c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f118c.findViewById(C3098f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f129n) {
                frameLayout.setPadding(this.f125j, this.f126k, this.f127l, this.f128m);
            }
            if (this.f122g != null) {
                ((C0213a) viewGroup.getLayoutParams()).f952a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: c */
    static boolean m164c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m164c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m165d() {
        View findViewById = this.f118c.findViewById(C3098f.parentPanel);
        View findViewById2 = findViewById.findViewById(C3098f.topPanel);
        View findViewById3 = findViewById.findViewById(C3098f.contentPanel);
        View findViewById4 = findViewById.findViewById(C3098f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C3098f.customPanel);
        m163c(viewGroup);
        View findViewById5 = viewGroup.findViewById(C3098f.topPanel);
        View findViewById6 = viewGroup.findViewById(C3098f.contentPanel);
        View findViewById7 = viewGroup.findViewById(C3098f.buttonPanel);
        ViewGroup a = m155a(findViewById5, findViewById2);
        ViewGroup a2 = m155a(findViewById6, findViewById3);
        ViewGroup a3 = m155a(findViewById7, findViewById4);
        m161b(a2);
        m157a(a3);
        m166d(a);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!z3 && a2 != null) {
            View findViewById8 = a2.findViewById(C3098f.textSpacerNoButtons);
            if (findViewById8 != null) {
                findViewById8.setVisibility(0);
            }
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f97A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f121f == null && this.f122g == null)) {
                view = a.findViewById(C3098f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (a2 != null) {
            View findViewById9 = a2.findViewById(C3098f.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        ListView listView = this.f122g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo150a(z2, z3);
        }
        if (!z) {
            View view2 = this.f122g;
            if (view2 == null) {
                view2 = this.f97A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m158a(a2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f122g;
        if (listView2 != null) {
            ListAdapter listAdapter = this.f104H;
            if (listAdapter != null) {
                listView2.setAdapter(listAdapter);
                int i = this.f105I;
                if (i > -1) {
                    listView2.setItemChecked(i, true);
                    listView2.setSelection(i);
                }
            }
        }
    }

    /* renamed from: d */
    private void m166d(ViewGroup viewGroup) {
        if (this.f103G != null) {
            viewGroup.addView(this.f103G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f118c.findViewById(C3098f.title_template).setVisibility(8);
            return;
        }
        this.f100D = (ImageView) this.f118c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f120e)) || !this.f112P) {
            this.f118c.findViewById(C3098f.title_template).setVisibility(8);
            this.f100D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f118c.findViewById(C3098f.alertTitle);
        this.f101E = textView;
        textView.setText(this.f120e);
        int i = this.f98B;
        if (i != 0) {
            this.f100D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f99C;
        if (drawable != null) {
            this.f100D.setImageDrawable(drawable);
            return;
        }
        this.f101E.setPadding(this.f100D.getPaddingLeft(), this.f100D.getPaddingTop(), this.f100D.getPaddingRight(), this.f100D.getPaddingBottom());
        this.f100D.setVisibility(8);
    }

    /* renamed from: a */
    public int mo136a(int i) {
        TypedValue typedValue = new TypedValue();
        this.f116a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public ListView mo137a() {
        return this.f122g;
    }

    /* renamed from: a */
    public void mo138a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f114R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f139x = charSequence;
            this.f140y = message;
            this.f141z = drawable;
        } else if (i == -2) {
            this.f135t = charSequence;
            this.f136u = message;
            this.f137v = drawable;
        } else if (i == -1) {
            this.f131p = charSequence;
            this.f132q = message;
            this.f133r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public void mo139a(Drawable drawable) {
        this.f99C = drawable;
        this.f98B = 0;
        ImageView imageView = this.f100D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f100D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo140a(View view) {
        this.f103G = view;
    }

    /* renamed from: a */
    public void mo141a(View view, int i, int i2, int i3, int i4) {
        this.f123h = view;
        this.f124i = 0;
        this.f129n = true;
        this.f125j = i;
        this.f126k = i2;
        this.f127l = i3;
        this.f128m = i4;
    }

    /* renamed from: a */
    public void mo142a(CharSequence charSequence) {
        this.f121f = charSequence;
        TextView textView = this.f102F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public boolean mo143a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f97A;
        return nestedScrollView != null && nestedScrollView.mo2292a(keyEvent);
    }

    /* renamed from: b */
    public void mo144b() {
        this.f117b.setContentView(m162c());
        m165d();
    }

    /* renamed from: b */
    public void mo145b(int i) {
        this.f99C = null;
        this.f98B = i;
        ImageView imageView = this.f100D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f100D.setImageResource(this.f98B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: b */
    public void mo146b(View view) {
        this.f123h = view;
        this.f124i = 0;
        this.f129n = false;
    }

    /* renamed from: b */
    public void mo147b(CharSequence charSequence) {
        this.f120e = charSequence;
        TextView textView = this.f101E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    public boolean mo148b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f97A;
        return nestedScrollView != null && nestedScrollView.mo2292a(keyEvent);
    }

    /* renamed from: c */
    public void mo149c(int i) {
        this.f123h = null;
        this.f124i = i;
        this.f129n = false;
    }
}
