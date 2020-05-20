package androidx.emoji.widget;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.Editable.Factory;

/* renamed from: androidx.emoji.widget.c */
final class C0400c extends Factory {

    /* renamed from: a */
    private static final Object f1835a = new Object();

    /* renamed from: b */
    private static volatile Factory f1836b;

    /* renamed from: c */
    private static Class<?> f1837c;

    @SuppressLint({"PrivateApi"})
    private C0400c() {
        try {
            f1837c = getClass().getClassLoader().loadClass("android.text.DynamicLayout$ChangeWatcher");
        } catch (Throwable unused) {
        }
    }

    public static Factory getInstance() {
        if (f1836b == null) {
            synchronized (f1835a) {
                if (f1836b == null) {
                    f1836b = new C0400c();
                }
            }
        }
        return f1836b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f1837c;
        return cls != null ? C0411j.m2084a(cls, charSequence) : super.newEditable(charSequence);
    }
}
