package p337m.p338f0.p347j;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* renamed from: m.f0.j.a */
public final class C6399a extends ProxySelector {

    /* renamed from: a */
    public static final C6399a f15855a = new C6399a();

    private C6399a() {
    }

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return C5836k.m22153a(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
