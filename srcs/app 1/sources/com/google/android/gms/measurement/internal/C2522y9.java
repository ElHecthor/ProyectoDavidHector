package com.google.android.gms.measurement.internal;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.y9 */
final class C2522y9 extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f7110a;

    C2522y9() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private C2522y9(SSLSocketFactory sSLSocketFactory) {
        this.f7110a = sSLSocketFactory;
    }

    /* renamed from: a */
    private final SSLSocket m10167a(SSLSocket sSLSocket) {
        return new C2511x9(this, sSLSocket);
    }

    public final Socket createSocket() {
        return m10167a((SSLSocket) this.f7110a.createSocket());
    }

    public final Socket createSocket(String str, int i) {
        return m10167a((SSLSocket) this.f7110a.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m10167a((SSLSocket) this.f7110a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m10167a((SSLSocket) this.f7110a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m10167a((SSLSocket) this.f7110a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m10167a((SSLSocket) this.f7110a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f7110a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f7110a.getSupportedCipherSuites();
    }
}
