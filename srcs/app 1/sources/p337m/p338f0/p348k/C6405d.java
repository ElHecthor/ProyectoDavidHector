package p337m.p338f0.p348k;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6250b;

/* renamed from: m.f0.k.d */
public final class C6405d implements HostnameVerifier {

    /* renamed from: a */
    public static final C6405d f15859a = new C6405d();

    private C6405d() {
    }

    /* renamed from: a */
    private final List<String> m24134a(X509Certificate x509Certificate, int i) {
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C5837l.m22159a();
            }
            ArrayList arrayList = new ArrayList();
            for (List list : subjectAlternativeNames) {
                if (list != null) {
                    if (list.size() >= 2) {
                        if (!(!C5942k.m22326a(list.get(0), (Object) Integer.valueOf(i)))) {
                            Object obj = list.get(1);
                            if (obj == null) {
                                continue;
                            } else if (obj != null) {
                                arrayList.add((String) obj);
                            } else {
                                throw new C5809q("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C5837l.m22159a();
        }
    }

    /* renamed from: a */
    private final boolean m24135a(String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            String str3 = ".";
            if (!C5787p.m21980b(str, str3, false, 2, null)) {
                String str4 = "..";
                if (!C5787p.m21978a(str, str4, false, 2, null)) {
                    if (!(str2 == null || str2.length() == 0) && !C5787p.m21980b(str2, str3, false, 2, null) && !C5787p.m21978a(str2, str4, false, 2, null)) {
                        if (!C5787p.m21978a(str, str3, false, 2, null)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(str3);
                            str = sb.toString();
                        }
                        String str5 = str;
                        if (!C5787p.m21978a(str2, str3, false, 2, null)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append(str3);
                            str2 = sb2.toString();
                        }
                        Locale locale = Locale.US;
                        C5942k.m22324a((Object) locale, "Locale.US");
                        String str6 = "null cannot be cast to non-null type java.lang.String";
                        if (str2 != null) {
                            String lowerCase = str2.toLowerCase(locale);
                            C5942k.m22324a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            if (!C5788q.m22009a((CharSequence) lowerCase, (CharSequence) "*", false, 2, (Object) null)) {
                                return C5942k.m22326a((Object) str5, (Object) lowerCase);
                            }
                            String str7 = "*.";
                            if (!C5787p.m21980b(lowerCase, str7, false, 2, null) || C5788q.m21984a((CharSequence) lowerCase, '*', 1, false, 4, (Object) null) != -1 || str5.length() < lowerCase.length() || C5942k.m22326a((Object) str7, (Object) lowerCase)) {
                                return false;
                            }
                            if (lowerCase != null) {
                                String substring = lowerCase.substring(1);
                                C5942k.m22324a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                                if (!C5787p.m21978a(str5, substring, false, 2, null)) {
                                    return false;
                                }
                                int length = str5.length() - substring.length();
                                return length <= 0 || C5788q.m22011b((CharSequence) str5, '.', length + -1, false, 4, (Object) null) == -1;
                            }
                            throw new C5809q(str6);
                        }
                        throw new C5809q(str6);
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m24136b(String str, X509Certificate x509Certificate) {
        Locale locale = Locale.US;
        C5942k.m22324a((Object) locale, "Locale.US");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            C5942k.m22324a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List<String> a = m24134a(x509Certificate, 2);
            if ((a instanceof Collection) && a.isEmpty()) {
                return false;
            }
            for (String a2 : a) {
                if (f15859a.m24135a(lowerCase, a2)) {
                    return true;
                }
            }
            return false;
        }
        throw new C5809q("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    private final boolean m24137c(String str, X509Certificate x509Certificate) {
        List<String> a = m24134a(x509Certificate, 7);
        if (!(a instanceof Collection) || !a.isEmpty()) {
            for (String b : a) {
                if (C5787p.m21979b(str, b, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List<String> mo16504a(X509Certificate x509Certificate) {
        C5942k.m22327b(x509Certificate, "certificate");
        return C5845t.m22181b(m24134a(x509Certificate, 7), m24134a(x509Certificate, 2));
    }

    /* renamed from: a */
    public final boolean mo16505a(String str, X509Certificate x509Certificate) {
        C5942k.m22327b(str, "host");
        C5942k.m22327b(x509Certificate, "certificate");
        return C6250b.m23461a(str) ? m24137c(str, x509Certificate) : m24136b(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        C5942k.m22327b(str, "host");
        C5942k.m22327b(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return mo16505a(str, (X509Certificate) certificate);
            }
            throw new C5809q("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
