package p337m.p338f0.p342f;

import java.net.Proxy.Type;
import p308k.p323z.p325d.C5942k;
import p337m.C6448t;
import p337m.C6467z;

/* renamed from: m.f0.f.i */
public final class C6301i {

    /* renamed from: a */
    public static final C6301i f15584a = new C6301i();

    private C6301i() {
    }

    /* renamed from: b */
    private final boolean m23698b(C6467z zVar, Type type) {
        return !zVar.mo16753e() && type == Type.HTTP;
    }

    /* renamed from: a */
    public final String mo16262a(C6448t tVar) {
        C5942k.m22327b(tVar, "url");
        String c = tVar.mo16624c();
        String e = tVar.mo16626e();
        if (e == null) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append('?');
        sb.append(e);
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo16263a(C6467z zVar, Type type) {
        C5942k.m22327b(zVar, "request");
        C5942k.m22327b(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(zVar.mo16754f());
        sb.append(' ');
        if (f15584a.m23698b(zVar, type)) {
            sb.append(zVar.mo16756h());
        } else {
            sb.append(f15584a.mo16262a(zVar.mo16756h()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        C5942k.m22324a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
