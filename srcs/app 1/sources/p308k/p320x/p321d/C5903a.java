package p308k.p320x.p321d;

import p308k.p320x.C5899a;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.x.d.a */
public class C5903a extends C5899a {
    /* renamed from: a */
    public void mo15601a(Throwable th, Throwable th2) {
        C5942k.m22327b(th, "cause");
        C5942k.m22327b(th2, "exception");
        th.addSuppressed(th2);
    }
}
