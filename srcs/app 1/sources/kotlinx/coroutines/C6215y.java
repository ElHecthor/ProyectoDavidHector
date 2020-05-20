package kotlinx.coroutines;

import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.y */
public final class C6215y extends RuntimeException {
    public C6215y(String str, Throwable th) {
        C5942k.m22327b(str, "message");
        C5942k.m22327b(th, "cause");
        super(str, th);
    }
}
