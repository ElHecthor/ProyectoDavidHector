package p337m.p338f0.p348k;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: m.f0.k.a */
public final class C6400a extends C6403c {

    /* renamed from: b */
    private final C6406e f15856b;

    /* renamed from: m.f0.k.a$a */
    public static final class C6401a {
        private C6401a() {
        }

        public /* synthetic */ C6401a(C5938g gVar) {
            this();
        }
    }

    static {
        new C6401a(null);
    }

    public C6400a(C6406e eVar) {
        C5942k.m22327b(eVar, "trustRootIndex");
        this.f15856b = eVar;
    }

    /* renamed from: a */
    private final boolean m24129a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        boolean z = true;
        if (!C5942k.m22326a((Object) x509Certificate.getIssuerDN(), (Object) x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
        } catch (GeneralSecurityException unused) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public List<Certificate> mo16479a(List<? extends Certificate> list, String str) {
        C5942k.m22327b(list, "chain");
        C5942k.m22327b(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        C5942k.m22324a(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            Object obj = arrayList.get(arrayList.size() - 1);
            String str2 = "null cannot be cast to non-null type java.security.cert.X509Certificate";
            if (obj != null) {
                X509Certificate x509Certificate = (X509Certificate) obj;
                X509Certificate a = this.f15856b.mo16453a(x509Certificate);
                if (a != null) {
                    if (arrayList.size() > 1 || (!C5942k.m22326a((Object) x509Certificate, (Object) a))) {
                        arrayList.add(a);
                    }
                    if (m24129a(a, a)) {
                        return arrayList;
                    }
                    z = true;
                } else {
                    Iterator it = arrayDeque.iterator();
                    C5942k.m22324a((Object) it, "queue.iterator()");
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            X509Certificate x509Certificate2 = (X509Certificate) next;
                            if (m24129a(x509Certificate, x509Certificate2)) {
                                it.remove();
                                arrayList.add(x509Certificate2);
                            }
                        } else {
                            throw new C5809q(str2);
                        }
                    }
                    if (z) {
                        return arrayList;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to find a trusted cert that signed ");
                    sb.append(x509Certificate);
                    throw new SSLPeerUnverifiedException(sb.toString());
                }
                i++;
            } else {
                throw new C5809q(str2);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate chain too long: ");
        sb2.append(arrayList);
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C6400a) && C5942k.m22326a((Object) ((C6400a) obj).f15856b, (Object) this.f15856b);
    }

    public int hashCode() {
        return this.f15856b.hashCode();
    }
}
