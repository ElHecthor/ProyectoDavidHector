package p337m.p338f0.p341e;

import java.io.IOException;
import p308k.p323z.p325d.C5942k;

/* renamed from: m.f0.e.j */
public final class C6286j extends RuntimeException {

    /* renamed from: f */
    private IOException f15549f;

    /* renamed from: g */
    private final IOException f15550g;

    public C6286j(IOException iOException) {
        C5942k.m22327b(iOException, "firstConnectException");
        super(iOException);
        this.f15550g = iOException;
        this.f15549f = iOException;
    }

    /* renamed from: a */
    public final IOException mo16229a() {
        return this.f15550g;
    }

    /* renamed from: a */
    public final void mo16230a(IOException iOException) {
        C5942k.m22327b(iOException, "e");
        this.f15550g.addSuppressed(iOException);
        this.f15549f = iOException;
    }

    /* renamed from: b */
    public final IOException mo16231b() {
        return this.f15549f;
    }
}
