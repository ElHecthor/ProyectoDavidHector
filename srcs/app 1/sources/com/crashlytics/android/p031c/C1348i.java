package com.crashlytics.android.p031c;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

/* renamed from: com.crashlytics.android.c.i */
public class C1348i implements C1355n {

    /* renamed from: a */
    private final Method f4387a;

    /* renamed from: b */
    private final Object f4388b;

    public C1348i(Object obj, Method method) {
        this.f4388b = obj;
        this.f4387a = method;
    }

    /* renamed from: a */
    private static Class m6262a(Context context) {
        try {
            return context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Object m6263a(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{context});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C1355n m6264b(Context context) {
        Class a = m6262a(context);
        if (a == null) {
            return null;
        }
        Object a2 = m6263a(context, a);
        if (a2 == null) {
            return null;
        }
        Method b = m6265b(context, a);
        if (b == null) {
            return null;
        }
        return new C1348i(a2, b);
    }

    /* renamed from: b */
    private static Method m6265b(Context context, Class cls) {
        Class<String> cls2 = String.class;
        try {
            return cls.getDeclaredMethod("logEventInternal", new Class[]{cls2, cls2, Bundle.class});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo5442a(String str, Bundle bundle) {
        mo5443a("fab", str, bundle);
    }

    /* renamed from: a */
    public void mo5443a(String str, String str2, Bundle bundle) {
        try {
            this.f4387a.invoke(this.f4388b, new Object[]{str, str2, bundle});
        } catch (Exception unused) {
        }
    }
}
