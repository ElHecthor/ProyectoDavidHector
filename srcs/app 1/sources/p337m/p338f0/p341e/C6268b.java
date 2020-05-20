package p337m.p338f0.p341e;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import p308k.p323z.p325d.C5942k;
import p337m.C6422k;

/* renamed from: m.f0.e.b */
public final class C6268b {

    /* renamed from: a */
    private int f15466a;

    /* renamed from: b */
    private boolean f15467b;

    /* renamed from: c */
    private boolean f15468c;

    /* renamed from: d */
    private final List<C6422k> f15469d;

    public C6268b(List<C6422k> list) {
        C5942k.m22327b(list, "connectionSpecs");
        this.f15469d = list;
    }

    /* renamed from: b */
    private final boolean m23535b(SSLSocket sSLSocket) {
        int size = this.f15469d.size();
        for (int i = this.f15466a; i < size; i++) {
            if (((C6422k) this.f15469d.get(i)).mo16535a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C6422k mo16138a(SSLSocket sSLSocket) {
        C6422k kVar;
        C5942k.m22327b(sSLSocket, "sslSocket");
        int i = this.f15466a;
        int size = this.f15469d.size();
        while (true) {
            if (i >= size) {
                kVar = null;
                break;
            }
            kVar = (C6422k) this.f15469d.get(i);
            i++;
            if (kVar.mo16535a(sSLSocket)) {
                this.f15466a = i;
                break;
            }
        }
        if (kVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f15468c);
            sb.append(',');
            sb.append(" modes=");
            sb.append(this.f15469d);
            sb.append(',');
            sb.append(" supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            if (enabledProtocols == null) {
                C5942k.m22323a();
                throw null;
            }
            String arrays = Arrays.toString(enabledProtocols);
            C5942k.m22324a((Object) arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        this.f15467b = m23535b(sSLSocket);
        kVar.mo16534a(sSLSocket, this.f15468c);
        return kVar;
    }

    /* renamed from: a */
    public final boolean mo16139a(IOException iOException) {
        C5942k.m22327b(iOException, "e");
        this.f15468c = true;
        return this.f15467b && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException);
    }
}
