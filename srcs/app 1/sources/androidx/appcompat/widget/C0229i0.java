package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.C0371a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p071f.p072a.p075l.p076a.C3105a;
import p071f.p072a.p077m.C3120a;
import p071f.p088e.C3162a;
import p071f.p088e.C3167d;
import p071f.p088e.C3168e;
import p071f.p088e.C3176h;
import p071f.p097h.p098e.C3236a;
import p071f.p140w.p141a.p142a.C3637c;
import p071f.p140w.p141a.p142a.C3647i;

/* renamed from: androidx.appcompat.widget.i0 */
public final class C0229i0 {

    /* renamed from: h */
    private static final Mode f1014h = Mode.SRC_IN;

    /* renamed from: i */
    private static C0229i0 f1015i;

    /* renamed from: j */
    private static final C0232c f1016j = new C0232c(6);

    /* renamed from: a */
    private WeakHashMap<Context, C3176h<ColorStateList>> f1017a;

    /* renamed from: b */
    private C3162a<String, C0233d> f1018b;

    /* renamed from: c */
    private C3176h<String> f1019c;

    /* renamed from: d */
    private final WeakHashMap<Context, C3167d<WeakReference<ConstantState>>> f1020d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1021e;

    /* renamed from: f */
    private boolean f1022f;

    /* renamed from: g */
    private C0234e f1023g;

    /* renamed from: androidx.appcompat.widget.i0$a */
    static class C0230a implements C0233d {
        C0230a() {
        }

        /* renamed from: a */
        public Drawable mo1466a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C3105a.m12561b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$b */
    private static class C0231b implements C0233d {
        C0231b() {
        }

        /* renamed from: a */
        public Drawable mo1466a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C3637c.m14797a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$c */
    private static class C0232c extends C3168e<Integer, PorterDuffColorFilter> {
        public C0232c(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m1156b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo1467a(int i, Mode mode) {
            return (PorterDuffColorFilter) mo10203b(Integer.valueOf(m1156b(i, mode)));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo1468a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo10199a(Integer.valueOf(m1156b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$d */
    private interface C0233d {
        /* renamed from: a */
        Drawable mo1466a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.i0$e */
    interface C0234e {
        /* renamed from: a */
        ColorStateList mo1469a(Context context, int i);

        /* renamed from: a */
        Mode mo1470a(int i);

        /* renamed from: a */
        Drawable mo1471a(C0229i0 i0Var, Context context, int i);

        /* renamed from: a */
        boolean mo1472a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        boolean mo1473b(Context context, int i, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.i0$f */
    private static class C0235f implements C0233d {
        C0235f() {
        }

        /* renamed from: a */
        public Drawable mo1466a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C3647i.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static long m1130a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m1131a(int i, Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0229i0.class) {
            a = f1016j.mo1467a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                f1016j.mo1468a(i, mode, a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m1132a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1131a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private Drawable m1133a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = mo1465b(context, i);
        if (b != null) {
            if (C0189a0.m976a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable i2 = C0371a.m1913i(drawable);
            C0371a.m1898a(i2, b);
            Mode a = mo1458a(i);
            if (a == null) {
                return i2;
            }
            C0371a.m1901a(i2, a);
            return i2;
        }
        C0234e eVar = this.f1023g;
        if ((eVar == null || !eVar.mo1473b(context, i, drawable)) && !mo1464a(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m1134a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, f.e.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1020d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            f.e.d r0 = (p071f.p088e.C3167d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo10190c(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo10188b(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0229i0.m1134a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static synchronized C0229i0 m1135a() {
        C0229i0 i0Var;
        synchronized (C0229i0.class) {
            if (f1015i == null) {
                C0229i0 i0Var2 = new C0229i0();
                f1015i = i0Var2;
                m1138a(i0Var2);
            }
            i0Var = f1015i;
        }
        return i0Var;
    }

    /* renamed from: a */
    private void m1136a(Context context, int i, ColorStateList colorStateList) {
        if (this.f1017a == null) {
            this.f1017a = new WeakHashMap<>();
        }
        C3176h hVar = (C3176h) this.f1017a.get(context);
        if (hVar == null) {
            hVar = new C3176h();
            this.f1017a.put(context, hVar);
        }
        hVar.mo10288a(i, colorStateList);
    }

    /* renamed from: a */
    static void m1137a(Drawable drawable, C0260r0 r0Var, int[] iArr) {
        if (!C0189a0.m976a(drawable) || drawable.mutate() == drawable) {
            if (r0Var.f1154d || r0Var.f1153c) {
                drawable.setColorFilter(m1132a(r0Var.f1154d ? r0Var.f1151a : null, r0Var.f1153c ? r0Var.f1152b : f1014h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static void m1138a(C0229i0 i0Var) {
        if (VERSION.SDK_INT < 24) {
            i0Var.m1139a("vector", (C0233d) new C0235f());
            i0Var.m1139a("animated-vector", (C0233d) new C0231b());
            i0Var.m1139a("animated-selector", (C0233d) new C0230a());
        }
    }

    /* renamed from: a */
    private void m1139a(String str, C0233d dVar) {
        if (this.f1018b == null) {
            this.f1018b = new C3162a<>();
        }
        this.f1018b.put(str, dVar);
    }

    /* renamed from: a */
    private synchronized boolean m1140a(Context context, long j, Drawable drawable) {
        boolean z;
        ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C3167d dVar = (C3167d) this.f1020d.get(context);
            if (dVar == null) {
                dVar = new C3167d();
                this.f1020d.put(context, dVar);
            }
            dVar.mo10191c(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m1141a(Drawable drawable) {
        return (drawable instanceof C3647i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: b */
    private void m1142b(Context context) {
        if (!this.f1022f) {
            this.f1022f = true;
            Drawable a = mo1459a(context, C3120a.abc_vector_test);
            if (a == null || !m1141a(a)) {
                this.f1022f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: c */
    private Drawable m1143c(Context context, int i) {
        if (this.f1021e == null) {
            this.f1021e = new TypedValue();
        }
        TypedValue typedValue = this.f1021e;
        context.getResources().getValue(i, typedValue, true);
        long a = m1130a(typedValue);
        Drawable a2 = m1134a(context, a);
        if (a2 != null) {
            return a2;
        }
        C0234e eVar = this.f1023g;
        Drawable a3 = eVar == null ? null : eVar.mo1471a(this, context, i);
        if (a3 != null) {
            a3.setChangingConfigurations(typedValue.changingConfigurations);
            m1140a(context, a, a3);
        }
        return a3;
    }

    /* renamed from: d */
    private ColorStateList m1144d(Context context, int i) {
        WeakHashMap<Context, C3176h<ColorStateList>> weakHashMap = this.f1017a;
        if (weakHashMap == null) {
            return null;
        }
        C3176h hVar = (C3176h) weakHashMap.get(context);
        if (hVar != null) {
            return (ColorStateList) hVar.mo10287a(i);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1145e(android.content.Context r11, int r12) {
        /*
            r10 = this;
            f.e.a<java.lang.String, androidx.appcompat.widget.i0$d> r0 = r10.f1018b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            f.e.h<java.lang.String> r0 = r10.f1019c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo10287a(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            f.e.a<java.lang.String, androidx.appcompat.widget.i0$d> r3 = r10.f1018b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            f.e.h r0 = new f.e.h
            r0.<init>()
            r10.f1019c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1021e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1021e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1021e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m1130a(r0)
            android.graphics.drawable.Drawable r6 = r10.m1134a(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            f.e.h<java.lang.String> r8 = r10.f1019c     // Catch:{ Exception -> 0x00a2 }
            r8.mo10288a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            f.e.a<java.lang.String, androidx.appcompat.widget.i0$d> r8 = r10.f1018b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.i0$d r3 = (androidx.appcompat.widget.C0229i0.C0233d) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo1466a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m1140a(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            f.e.h<java.lang.String> r11 = r10.f1019c
            r11.mo10288a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0229i0.m1145e(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Mode mo1458a(int i) {
        C0234e eVar = this.f1023g;
        if (eVar == null) {
            return null;
        }
        return eVar.mo1470a(i);
    }

    /* renamed from: a */
    public synchronized Drawable mo1459a(Context context, int i) {
        return mo1460a(context, i, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo1460a(Context context, int i, boolean z) {
        Drawable e;
        m1142b(context);
        e = m1145e(context, i);
        if (e == null) {
            e = m1143c(context, i);
        }
        if (e == null) {
            e = C3236a.m13271c(context, i);
        }
        if (e != null) {
            e = m1133a(context, i, z, e);
        }
        if (e != null) {
            C0189a0.m977b(e);
        }
        return e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo1461a(Context context, C0291y0 y0Var, int i) {
        Drawable e = m1145e(context, i);
        if (e == null) {
            e = y0Var.mo1844a(i);
        }
        if (e == null) {
            return null;
        }
        return m1133a(context, i, false, e);
    }

    /* renamed from: a */
    public synchronized void mo1462a(Context context) {
        C3167d dVar = (C3167d) this.f1020d.get(context);
        if (dVar != null) {
            dVar.mo10186b();
        }
    }

    /* renamed from: a */
    public synchronized void mo1463a(C0234e eVar) {
        this.f1023g = eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1464a(Context context, int i, Drawable drawable) {
        C0234e eVar = this.f1023g;
        return eVar != null && eVar.mo1472a(context, i, drawable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized ColorStateList mo1465b(Context context, int i) {
        ColorStateList d;
        d = m1144d(context, i);
        if (d == null) {
            d = this.f1023g == null ? null : this.f1023g.mo1469a(context, i);
            if (d != null) {
                m1136a(context, i, d);
            }
        }
        return d;
    }
}
