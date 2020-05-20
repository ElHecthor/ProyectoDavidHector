package p242i.p243a.p244a.p245a.p246n.p252e;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;

/* renamed from: i.a.a.a.n.e.a */
final class C4884a {
    /* renamed from: a */
    private static boolean m19586a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getIssuerX500Principal())) {
            return false;
        }
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static X509Certificate[] m19587a(X509Certificate[] x509CertificateArr, C4900i iVar) {
        LinkedList linkedList = new LinkedList();
        boolean b = iVar.mo14049b(x509CertificateArr[0]);
        linkedList.add(x509CertificateArr[0]);
        boolean z = true;
        int i = 1;
        while (i < x509CertificateArr.length) {
            if (iVar.mo14049b(x509CertificateArr[i])) {
                b = true;
            }
            if (!m19586a(x509CertificateArr[i], x509CertificateArr[i - 1])) {
                break;
            }
            linkedList.add(x509CertificateArr[i]);
            i++;
        }
        X509Certificate a = iVar.mo14048a(x509CertificateArr[i - 1]);
        if (a != null) {
            linkedList.add(a);
        } else {
            z = b;
        }
        if (z) {
            return (X509Certificate[]) linkedList.toArray(new X509Certificate[linkedList.size()]);
        }
        throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
    }
}
