package kotlinx.coroutines.internal;

import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.x */
final /* synthetic */ class C6141x {

    /* renamed from: a */
    private static final int f15248a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m23088a() {
        return f15248a;
    }

    /* renamed from: a */
    public static final String m23089a(String str) {
        C5942k.m22327b(str, "propertyName");
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
