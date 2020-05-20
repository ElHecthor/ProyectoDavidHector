package p071f.p072a.p073k.p074a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0229i0;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p071f.p097h.p098e.C3236a;
import p071f.p097h.p098e.p099c.C3238a;

@SuppressLint({"RestrictedAPI"})
/* renamed from: f.a.k.a.a */
public final class C3103a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f8760a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C3104a>> f8761b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f8762c = new Object();

    /* renamed from: f.a.k.a.a$a */
    private static class C3104a {

        /* renamed from: a */
        final ColorStateList f8763a;

        /* renamed from: b */
        final Configuration f8764b;

        C3104a(ColorStateList colorStateList, Configuration configuration) {
            this.f8763a = colorStateList;
            this.f8764b = configuration;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m12553a(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f8762c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<f.a.k.a.a$a>> r1 = f8761b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            f.a.k.a.a$a r2 = (p071f.p072a.p073k.p074a.C3103a.C3104a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f8764b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f8763a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p072a.p073k.p074a.C3103a.m12553a(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    private static TypedValue m12554a() {
        TypedValue typedValue = (TypedValue) f8760a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f8760a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    private static void m12555a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f8762c) {
            SparseArray sparseArray = (SparseArray) f8761b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f8761b.put(context, sparseArray);
            }
            sparseArray.append(i, new C3104a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    public static ColorStateList m12556b(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList a = m12553a(context, i);
        if (a != null) {
            return a;
        }
        ColorStateList d = m12558d(context, i);
        if (d == null) {
            return C3236a.m13269b(context, i);
        }
        m12555a(context, i, d);
        return d;
    }

    /* renamed from: c */
    public static Drawable m12557c(Context context, int i) {
        return C0229i0.m1135a().mo1459a(context, i);
    }

    /* renamed from: d */
    private static ColorStateList m12558d(Context context, int i) {
        if (m12559e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C3238a.m13277a(resources, (XmlPullParser) resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m12559e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m12554a();
        resources.getValue(i, a, true);
        int i2 = a.type;
        return i2 >= 28 && i2 <= 31;
    }
}
