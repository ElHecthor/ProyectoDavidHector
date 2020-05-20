package p337m.p338f0.p348k;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p308k.p323z.p325d.C5942k;

/* renamed from: m.f0.k.b */
public final class C6402b implements C6406e {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f15857a;

    public C6402b(X509Certificate... x509CertificateArr) {
        C5942k.m22327b(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            C5942k.m22324a((Object) subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f15857a = linkedHashMap;
    }

    /* renamed from: a */
    public X509Certificate mo16453a(X509Certificate x509Certificate) {
        boolean z;
        C5942k.m22327b(x509Certificate, "cert");
        Set set = (Set) this.f15857a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                z = true;
                continue;
            } catch (Exception unused) {
                z = false;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C6402b) && C5942k.m22326a((Object) ((C6402b) obj).f15857a, (Object) this.f15857a));
    }

    public int hashCode() {
        return this.f15857a.hashCode();
    }
}
