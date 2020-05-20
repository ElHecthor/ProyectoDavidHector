package p071f.p097h.p100f;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import p071f.p097h.p098e.p099c.C3240c.C3242b;
import p071f.p097h.p098e.p099c.C3240c.C3243c;

/* renamed from: f.h.f.j */
public class C3265j extends C3263h {

    /* renamed from: g */
    protected final Class<?> f9392g;

    /* renamed from: h */
    protected final Constructor<?> f9393h;

    /* renamed from: i */
    protected final Method f9394i;

    /* renamed from: j */
    protected final Method f9395j;

    /* renamed from: k */
    protected final Method f9396k;

    /* renamed from: l */
    protected final Method f9397l;

    /* renamed from: m */
    protected final Method f9398m;

    public C3265j() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> a = mo10609a();
            constructor = mo10614e(a);
            method4 = mo10611b(a);
            method3 = mo10612c(a);
            method2 = mo10615f(a);
            method = mo10610a(a);
            Class<?> cls2 = a;
            method5 = mo10613d(a);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sb.toString(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f9392g = cls;
        this.f9393h = constructor;
        this.f9394i = method4;
        this.f9395j = method3;
        this.f9396k = method2;
        this.f9397l = method;
        this.f9398m = method5;
    }

    /* renamed from: a */
    private boolean m13384a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f9394i.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m13385a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f9395j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private void m13386b(Object obj) {
        try {
            this.f9397l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: b */
    private boolean m13387b() {
        if (this.f9394i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f9394i != null;
    }

    /* renamed from: c */
    private Object m13388c() {
        try {
            return this.f9393h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private boolean m13389c(Object obj) {
        try {
            return ((Boolean) this.f9396k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public Typeface mo10607a(Context context, Resources resources, int i, String str, int i2) {
        if (!m13387b()) {
            return super.mo10607a(context, resources, i, str, i2);
        }
        Object c = m13388c();
        if (c == null) {
            return null;
        }
        if (!m13384a(context, c, str, 0, -1, -1, null)) {
            m13386b(c);
            return null;
        } else if (!m13389c(c)) {
            return null;
        } else {
            return mo10608a(c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r11 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        throw r13;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo10605a(android.content.Context r11, android.os.CancellationSignal r12, p071f.p097h.p105j.C3283b.C3289f[] r13, int r14) {
        /*
            r10 = this;
            int r0 = r13.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = r10.m13387b()
            if (r0 != 0) goto L_0x0058
            f.h.j.b$f r13 = r10.mo10617a(r13, r14)
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r14 = r13.mo10645c()     // Catch:{ IOException -> 0x0057 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r14, r0, r12)     // Catch:{ IOException -> 0x0057 }
            if (r11 != 0) goto L_0x0026
            if (r11 == 0) goto L_0x0025
            r11.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0025:
            return r2
        L_0x0026:
            android.graphics.Typeface$Builder r12 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0049 }
            java.io.FileDescriptor r14 = r11.getFileDescriptor()     // Catch:{ all -> 0x0049 }
            r12.<init>(r14)     // Catch:{ all -> 0x0049 }
            int r14 = r13.mo10646d()     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface$Builder r12 = r12.setWeight(r14)     // Catch:{ all -> 0x0049 }
            boolean r13 = r13.mo10647e()     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface$Builder r12 = r12.setItalic(r13)     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface r12 = r12.build()     // Catch:{ all -> 0x0049 }
            if (r11 == 0) goto L_0x0048
            r11.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0048:
            return r12
        L_0x0049:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x004b }
        L_0x004b:
            r13 = move-exception
            if (r11 == 0) goto L_0x0056
            r11.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r11 = move-exception
            r12.addSuppressed(r11)     // Catch:{ IOException -> 0x0057 }
        L_0x0056:
            throw r13     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            return r2
        L_0x0058:
            java.util.Map r11 = p071f.p097h.p105j.C3283b.m13459a(r11, r13, r12)
            java.lang.Object r12 = r10.m13388c()
            if (r12 != 0) goto L_0x0063
            return r2
        L_0x0063:
            int r0 = r13.length
            r3 = 0
            r9 = 0
        L_0x0066:
            if (r9 >= r0) goto L_0x0093
            r4 = r13[r9]
            android.net.Uri r5 = r4.mo10645c()
            java.lang.Object r5 = r11.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L_0x0077
            goto L_0x0090
        L_0x0077:
            int r6 = r4.mo10644b()
            int r7 = r4.mo10646d()
            boolean r8 = r4.mo10647e()
            r3 = r10
            r4 = r12
            boolean r3 = r3.m13385a(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L_0x008f
            r10.m13386b(r12)
            return r2
        L_0x008f:
            r3 = 1
        L_0x0090:
            int r9 = r9 + 1
            goto L_0x0066
        L_0x0093:
            if (r3 != 0) goto L_0x0099
            r10.m13386b(r12)
            return r2
        L_0x0099:
            boolean r11 = r10.m13389c(r12)
            if (r11 != 0) goto L_0x00a0
            return r2
        L_0x00a0:
            android.graphics.Typeface r11 = r10.mo10608a(r12)
            if (r11 != 0) goto L_0x00a7
            return r2
        L_0x00a7:
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p097h.p100f.C3265j.mo10605a(android.content.Context, android.os.CancellationSignal, f.h.j.b$f[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo10606a(Context context, C3242b bVar, Resources resources, int i) {
        C3243c[] a;
        if (!m13387b()) {
            return super.mo10606a(context, bVar, resources, i);
        }
        Object c = m13388c();
        if (c == null) {
            return null;
        }
        for (C3243c cVar : bVar.mo10590a()) {
            if (!m13384a(context, c, cVar.mo10591a(), cVar.mo10593c(), cVar.mo10595e(), cVar.mo10596f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo10594d()))) {
                m13386b(c);
                return null;
            }
        }
        if (!m13389c(c)) {
            return null;
        }
        return mo10608a(c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo10608a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f9392g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f9398m.invoke(null, new Object[]{newInstance, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Class<?> mo10609a() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Method mo10610a(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Method mo10611b(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Method mo10612c(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo10613d(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Constructor<?> mo10614e(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Method mo10615f(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
