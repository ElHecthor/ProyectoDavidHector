package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.C0137m.C0138a;
import p071f.p097h.p108m.C3339d;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.appcompat.view.menu.l */
public class C0135l {

    /* renamed from: a */
    private final Context f590a;

    /* renamed from: b */
    private final C0122g f591b;

    /* renamed from: c */
    private final boolean f592c;

    /* renamed from: d */
    private final int f593d;

    /* renamed from: e */
    private final int f594e;

    /* renamed from: f */
    private View f595f;

    /* renamed from: g */
    private int f596g;

    /* renamed from: h */
    private boolean f597h;

    /* renamed from: i */
    private C0138a f598i;

    /* renamed from: j */
    private C0134k f599j;

    /* renamed from: k */
    private OnDismissListener f600k;

    /* renamed from: l */
    private final OnDismissListener f601l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    class C0136a implements OnDismissListener {
        C0136a() {
        }

        public void onDismiss() {
            C0135l.this.mo794d();
        }
    }

    public C0135l(Context context, C0122g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    public C0135l(Context context, C0122g gVar, View view, boolean z, int i, int i2) {
        this.f596g = 8388611;
        this.f601l = new C0136a();
        this.f590a = context;
        this.f591b = gVar;
        this.f595f = view;
        this.f592c = z;
        this.f593d = i;
        this.f594e = i2;
    }

    /* renamed from: a */
    private void m731a(int i, int i2, boolean z, boolean z2) {
        C0134k b = mo792b();
        b.mo542c(z2);
        if (z) {
            if ((C3339d.m13606a(this.f596g, C3379v.m13829p(this.f595f)) & 7) == 5) {
                i -= this.f595f.getWidth();
            }
            b.mo537b(i);
            b.mo541c(i2);
            int i3 = (int) ((this.f590a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.mo782a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.mo540c();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r7v0, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v12, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [androidx.appcompat.view.menu.q]
      assigns: [androidx.appcompat.view.menu.q, androidx.appcompat.view.menu.d]
      uses: [androidx.appcompat.view.menu.q, androidx.appcompat.view.menu.k, androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.d]
      mth insns count: 49
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0134k m732g() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f590a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f590a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p071f.p072a.C3096d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f590a
            android.view.View r3 = r14.f595f
            int r4 = r14.f593d
            int r5 = r14.f594e
            boolean r6 = r14.f592c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r8 = r14.f590a
            androidx.appcompat.view.menu.g r9 = r14.f591b
            android.view.View r10 = r14.f595f
            int r11 = r14.f593d
            int r12 = r14.f594e
            boolean r13 = r14.f592c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.f591b
            r0.mo535a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f601l
            r0.mo534a(r1)
            android.view.View r1 = r14.f595f
            r0.mo533a(r1)
            androidx.appcompat.view.menu.m$a r1 = r14.f598i
            r0.mo517a(r1)
            boolean r1 = r14.f597h
            r0.mo538b(r1)
            int r1 = r14.f596g
            r0.mo531a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0135l.m732g():androidx.appcompat.view.menu.k");
    }

    /* renamed from: a */
    public void mo785a() {
        if (mo793c()) {
            this.f599j.dismiss();
        }
    }

    /* renamed from: a */
    public void mo786a(int i) {
        this.f596g = i;
    }

    /* renamed from: a */
    public void mo787a(View view) {
        this.f595f = view;
    }

    /* renamed from: a */
    public void mo788a(OnDismissListener onDismissListener) {
        this.f600k = onDismissListener;
    }

    /* renamed from: a */
    public void mo789a(C0138a aVar) {
        this.f598i = aVar;
        C0134k kVar = this.f599j;
        if (kVar != null) {
            kVar.mo517a(aVar);
        }
    }

    /* renamed from: a */
    public void mo790a(boolean z) {
        this.f597h = z;
        C0134k kVar = this.f599j;
        if (kVar != null) {
            kVar.mo538b(z);
        }
    }

    /* renamed from: a */
    public boolean mo791a(int i, int i2) {
        if (mo793c()) {
            return true;
        }
        if (this.f595f == null) {
            return false;
        }
        m731a(i, i2, true, true);
        return true;
    }

    /* renamed from: b */
    public C0134k mo792b() {
        if (this.f599j == null) {
            this.f599j = m732g();
        }
        return this.f599j;
    }

    /* renamed from: c */
    public boolean mo793c() {
        C0134k kVar = this.f599j;
        return kVar != null && kVar.mo536a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo794d() {
        this.f599j = null;
        OnDismissListener onDismissListener = this.f600k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: e */
    public void mo795e() {
        if (!mo796f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: f */
    public boolean mo796f() {
        if (mo793c()) {
            return true;
        }
        if (this.f595f == null) {
            return false;
        }
        m731a(0, 0, false, false);
        return true;
    }
}
