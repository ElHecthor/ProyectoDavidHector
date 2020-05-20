package p242i.p243a.p244a.p245a.p246n.p252e;

import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: i.a.a.a.n.e.h */
class C4899h implements X509TrustManager {

    /* renamed from: f */
    private static final X509Certificate[] f12742f = new X509Certificate[0];

    /* renamed from: a */
    private final TrustManager[] f12743a;

    /* renamed from: b */
    private final C4900i f12744b;

    /* renamed from: c */
    private final long f12745c;

    /* renamed from: d */
    private final List<byte[]> f12746d = new LinkedList();

    /* renamed from: e */
    private final Set<X509Certificate> f12747e = Collections.synchronizedSet(new HashSet());

    public C4899h(C4900i iVar, C4898g gVar) {
        this.f12743a = m19668a(iVar);
        this.f12744b = iVar;
        this.f12745c = gVar.mo5653d();
        for (String a : gVar.mo5652c()) {
            this.f12746d.add(m19667a(a));
        }
    }

    /* renamed from: a */
    private void m19664a(X509Certificate[] x509CertificateArr) {
        if (this.f12745c == -1 || System.currentTimeMillis() - this.f12745c <= 15552000000L) {
            X509Certificate[] a = C4884a.m19587a(x509CertificateArr, this.f12744b);
            int length = a.length;
            int i = 0;
            while (i < length) {
                if (!m19666a(a[i])) {
                    i++;
                } else {
                    return;
                }
            }
            throw new CertificateException("No valid pins found in chain!");
        }
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pins are stale, (");
        sb.append(System.currentTimeMillis() - this.f12745c);
        sb.append(" millis vs ");
        sb.append(15552000000L);
        sb.append(" millis) falling back to system trust.");
        f.mo13787a("Fabric", sb.toString());
    }

    /* renamed from: a */
    private void m19665a(X509Certificate[] x509CertificateArr, String str) {
        for (TrustManager trustManager : this.f12743a) {
            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: a */
    private boolean m19666a(X509Certificate x509Certificate) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            for (byte[] equals : this.f12746d) {
                if (Arrays.equals(equals, digest)) {
                    return true;
                }
            }
            return false;
        } catch (NoSuchAlgorithmException e) {
            throw new CertificateException(e);
        }
    }

    /* renamed from: a */
    private byte[] m19667a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* renamed from: a */
    private TrustManager[] m19668a(C4900i iVar) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(iVar.f12748a);
            return instance.getTrustManagers();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        }
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (!this.f12747e.contains(x509CertificateArr[0])) {
            m19665a(x509CertificateArr, str);
            m19664a(x509CertificateArr);
            this.f12747e.add(x509CertificateArr[0]);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return f12742f;
    }
}
