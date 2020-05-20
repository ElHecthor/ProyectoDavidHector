package p308k.p322y;

import java.io.Closeable;

/* renamed from: k.y.a */
public final class C5904a {
    /* renamed from: a */
    public static final void m22293a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C5727b.m21843a(th, th2);
            }
        }
    }
}
