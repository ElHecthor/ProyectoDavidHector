package p337m.p338f0.p344h;

import java.io.IOException;
import p308k.p323z.p325d.C5942k;

/* renamed from: m.f0.h.n */
public final class C6362n extends IOException {

    /* renamed from: f */
    public final C6315b f15797f;

    public C6362n(C6315b bVar) {
        C5942k.m22327b(bVar, "errorCode");
        StringBuilder sb = new StringBuilder();
        sb.append("stream was reset: ");
        sb.append(bVar);
        super(sb.toString());
        this.f15797f = bVar;
    }
}
