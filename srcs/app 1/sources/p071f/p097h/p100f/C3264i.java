package p071f.p097h.p100f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p071f.p088e.C3175g;
import p071f.p097h.p098e.p099c.C3240c.C3242b;
import p071f.p097h.p098e.p099c.C3240c.C3243c;
import p071f.p097h.p105j.C3283b.C3289f;

/* renamed from: f.h.f.i */
class C3264i extends C3268m {

    /* renamed from: b */
    private static final Class<?> f9388b;

    /* renamed from: c */
    private static final Constructor<?> f9389c;

    /* renamed from: d */
    private static final Method f9390d;

    /* renamed from: e */
    private static final Method f9391e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f9389c = constructor;
        f9388b = cls;
        f9390d = method;
        f9391e = method2;
    }

    C3264i() {
    }

    /* renamed from: a */
    private static Typeface m13378a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f9388b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f9391e.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m13379a() {
        if (f9390d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f9390d != null;
    }

    /* renamed from: a */
    private static boolean m13380a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f9390d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static Object m13381b() {
        try {
            return f9389c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo10605a(Context context, CancellationSignal cancellationSignal, C3289f[] fVarArr, int i) {
        Object b = m13381b();
        if (b == null) {
            return null;
        }
        C3175g gVar = new C3175g();
        for (C3289f fVar : fVarArr) {
            Uri c = fVar.mo10645c();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(c);
            if (byteBuffer == null) {
                byteBuffer = C3272n.m13430a(context, cancellationSignal, c);
                gVar.put(c, byteBuffer);
            }
            if (byteBuffer == null || !m13380a(b, byteBuffer, fVar.mo10644b(), fVar.mo10646d(), fVar.mo10647e())) {
                return null;
            }
        }
        Typeface a = m13378a(b);
        if (a == null) {
            return null;
        }
        return Typeface.create(a, i);
    }

    /* renamed from: a */
    public Typeface mo10606a(Context context, C3242b bVar, Resources resources, int i) {
        C3243c[] a;
        Object b = m13381b();
        if (b == null) {
            return null;
        }
        for (C3243c cVar : bVar.mo10590a()) {
            ByteBuffer a2 = C3272n.m13429a(context, resources, cVar.mo10592b());
            if (a2 == null || !m13380a(b, a2, cVar.mo10593c(), cVar.mo10595e(), cVar.mo10596f())) {
                return null;
            }
        }
        return m13378a(b);
    }
}
