package p337m.p338f0.p342f;

import p308k.p323z.p325d.C5942k;

/* renamed from: m.f0.f.f */
public final class C6298f {

    /* renamed from: a */
    public static final C6298f f15571a = new C6298f();

    private C6298f() {
    }

    /* renamed from: d */
    public static final boolean m23678d(String str) {
        C5942k.m22327b(str, "method");
        return !C5942k.m22326a((Object) str, (Object) "GET") && !C5942k.m22326a((Object) str, (Object) "HEAD");
    }

    /* renamed from: e */
    public static final boolean m23679e(String str) {
        C5942k.m22327b(str, "method");
        return C5942k.m22326a((Object) str, (Object) "POST") || C5942k.m22326a((Object) str, (Object) "PUT") || C5942k.m22326a((Object) str, (Object) "PATCH") || C5942k.m22326a((Object) str, (Object) "PROPPATCH") || C5942k.m22326a((Object) str, (Object) "REPORT");
    }

    /* renamed from: a */
    public final boolean mo16248a(String str) {
        C5942k.m22327b(str, "method");
        return C5942k.m22326a((Object) str, (Object) "POST") || C5942k.m22326a((Object) str, (Object) "PATCH") || C5942k.m22326a((Object) str, (Object) "PUT") || C5942k.m22326a((Object) str, (Object) "DELETE") || C5942k.m22326a((Object) str, (Object) "MOVE");
    }

    /* renamed from: b */
    public final boolean mo16249b(String str) {
        C5942k.m22327b(str, "method");
        return !C5942k.m22326a((Object) str, (Object) "PROPFIND");
    }

    /* renamed from: c */
    public final boolean mo16250c(String str) {
        C5942k.m22327b(str, "method");
        return C5942k.m22326a((Object) str, (Object) "PROPFIND");
    }
}
