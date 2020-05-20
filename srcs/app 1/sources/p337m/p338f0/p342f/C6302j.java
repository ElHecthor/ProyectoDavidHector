package p337m.p338f0.p342f;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import p308k.p313e0.C5772f;
import p308k.p323z.p325d.C5942k;
import p337m.C6225a0;
import p337m.C6232b0;
import p337m.C6232b0.C6233a;
import p337m.C6236c0;
import p337m.C6243d0;
import p337m.C6448t;
import p337m.C6452u;
import p337m.C6452u.C6453a;
import p337m.C6462x;
import p337m.C6467z;
import p337m.C6467z.C6468a;
import p337m.p338f0.C6250b;
import p337m.p338f0.p341e.C6269c;
import p337m.p338f0.p341e.C6273e;
import p337m.p338f0.p341e.C6277f;
import p337m.p338f0.p341e.C6286j;
import p337m.p338f0.p344h.C6314a;

/* renamed from: m.f0.f.j */
public final class C6302j implements C6452u {

    /* renamed from: b */
    private final C6462x f15585b;

    /* renamed from: m.f0.f.j$a */
    public static final class C6303a {
        private C6303a() {
        }

        public /* synthetic */ C6303a(C5938g gVar) {
            this();
        }
    }

    static {
        new C6303a(null);
    }

    public C6302j(C6462x xVar) {
        C5942k.m22327b(xVar, "client");
        this.f15585b = xVar;
    }

    /* renamed from: a */
    private final int m23701a(C6232b0 b0Var, int i) {
        String a = C6232b0.m23339a(b0Var, "Retry-After", null, 2, null);
        if (a == null) {
            return i;
        }
        if (!new C5772f("\\d+").mo15405a(a)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a);
        C5942k.m22324a((Object) valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    /* renamed from: a */
    private final C6467z m23702a(C6232b0 b0Var, String str) {
        C6225a0 a0Var = null;
        if (!this.f15585b.mo16700r()) {
            return null;
        }
        String a = C6232b0.m23339a(b0Var, "Location", null, 2, null);
        if (a != null) {
            C6448t b = b0Var.mo16034v().mo16756h().mo16623b(a);
            if (b != null) {
                if (!C5942k.m22326a((Object) b.mo16637n(), (Object) b0Var.mo16034v().mo16756h().mo16637n()) && !this.f15585b.mo16701s()) {
                    return null;
                }
                C6468a g = b0Var.mo16034v().mo16755g();
                if (C6298f.m23678d(str)) {
                    boolean c = C6298f.f15571a.mo16250c(str);
                    if (C6298f.f15571a.mo16249b(str)) {
                        str = "GET";
                    } else if (c) {
                        a0Var = b0Var.mo16034v().mo16749a();
                    }
                    g.mo16761a(str, a0Var);
                    if (!c) {
                        g.mo16759a("Transfer-Encoding");
                        g.mo16759a("Content-Length");
                        g.mo16759a("Content-Type");
                    }
                }
                if (!C6250b.m23463a(b0Var.mo16034v().mo16756h(), b)) {
                    g.mo16759a("Authorization");
                }
                g.mo16764a(b);
                return g.mo16765a();
            }
        }
        return null;
    }

    /* renamed from: a */
    private final C6467z m23703a(C6232b0 b0Var, C6269c cVar) {
        C6243d0 d0Var;
        int g;
        String f;
        if (cVar != null) {
            C6277f f2 = cVar.mo16151f();
            if (f2 != null) {
                d0Var = f2.mo16219l();
                g = b0Var.mo16022g();
                f = b0Var.mo16034v().mo16754f();
                if (g != 307 || g == 308) {
                    if ((!C5942k.m22326a((Object) f, (Object) "GET")) || !(!C5942k.m22326a((Object) f, (Object) "HEAD"))) {
                        return m23702a(b0Var, f);
                    }
                    return null;
                } else if (g == 401) {
                    return this.f15585b.mo16688b().mo16016a(d0Var, b0Var);
                } else {
                    if (g == 421) {
                        C6225a0 a = b0Var.mo16034v().mo16749a();
                        if ((a != null && a.mo16011d()) || cVar == null || !cVar.mo16154i()) {
                            return null;
                        }
                        cVar.mo16151f().mo16217j();
                        return b0Var.mo16034v();
                    } else if (g == 503) {
                        C6232b0 s = b0Var.mo16030s();
                        if ((s == null || s.mo16022g() != 503) && m23701a(b0Var, Integer.MAX_VALUE) == 0) {
                            return b0Var.mo16034v();
                        }
                        return null;
                    } else if (g != 407) {
                        if (g != 408) {
                            switch (g) {
                                case 300:
                                case 301:
                                case 302:
                                case 303:
                                    return m23702a(b0Var, f);
                                default:
                                    return null;
                            }
                        } else if (!this.f15585b.mo16684D()) {
                            return null;
                        } else {
                            C6225a0 a2 = b0Var.mo16034v().mo16749a();
                            if (a2 != null && a2.mo16011d()) {
                                return null;
                            }
                            C6232b0 s2 = b0Var.mo16030s();
                            if ((s2 == null || s2.mo16022g() != 408) && m23701a(b0Var, 0) <= 0) {
                                return b0Var.mo16034v();
                            }
                            return null;
                        }
                    } else if (d0Var == null) {
                        C5942k.m22323a();
                        throw null;
                    } else if (d0Var.mo16086b().type() == Type.HTTP) {
                        return this.f15585b.mo16681A().mo16016a(d0Var, b0Var);
                    } else {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                }
            }
        }
        d0Var = null;
        g = b0Var.mo16022g();
        f = b0Var.mo16034v().mo16754f();
        if (g != 307) {
        }
        if (!C5942k.m22326a((Object) f, (Object) "GET")) {
        }
        return m23702a(b0Var, f);
    }

    /* renamed from: a */
    private final boolean m23704a(IOException iOException, C6273e eVar, C6467z zVar, boolean z) {
        if (!this.f15585b.mo16684D()) {
            return false;
        }
        return (!z || !m23705a(iOException, zVar)) && m23706a(iOException, z) && eVar.mo16186o();
    }

    /* renamed from: a */
    private final boolean m23705a(IOException iOException, C6467z zVar) {
        C6225a0 a = zVar.mo16749a();
        return (a != null && a.mo16011d()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: a */
    private final boolean m23706a(IOException iOException, boolean z) {
        boolean z2 = false;
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            return (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
        }
        if ((iOException instanceof SocketTimeoutException) && !z) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: a */
    public C6232b0 mo14196a(C6453a aVar) {
        C5942k.m22327b(aVar, "chain");
        C6299g gVar = (C6299g) aVar;
        C6467z f = gVar.mo16258f();
        C6273e b = gVar.mo16254b();
        C6232b0 b0Var = null;
        boolean z = true;
        int i = 0;
        while (true) {
            b.mo16175a(f, z);
            try {
                if (!b.mo16096i()) {
                    C6232b0 a = gVar.mo16251a(f);
                    if (b0Var != null) {
                        C6233a q = a.mo16029q();
                        C6233a q2 = b0Var.mo16029q();
                        q2.mo16041a((C6236c0) null);
                        q.mo16052c(q2.mo16046a());
                        a = q.mo16046a();
                    }
                    b0Var = a;
                    C6269c e = b.mo16181e();
                    C6467z a2 = m23703a(b0Var, e);
                    if (a2 == null) {
                        if (e != null && e.mo16155j()) {
                            b.mo16187p();
                        }
                        b.mo16176a(false);
                        return b0Var;
                    }
                    C6225a0 a3 = a2.mo16749a();
                    if (a3 == null || !a3.mo16011d()) {
                        C6236c0 a4 = b0Var.mo16018a();
                        if (a4 != null) {
                            C6250b.m23457a((Closeable) a4);
                        }
                        i++;
                        if (i <= 20) {
                            b.mo16176a(true);
                            f = a2;
                            z = true;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Too many follow-up requests: ");
                            sb.append(i);
                            throw new ProtocolException(sb.toString());
                        }
                    } else {
                        b.mo16176a(false);
                        return b0Var;
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } catch (C6286j e2) {
                if (!m23704a(e2.mo16231b(), b, f, false)) {
                    throw e2.mo16229a();
                }
                b.mo16176a(true);
                z = false;
            } catch (IOException e3) {
                if (m23704a(e3, b, f, !(e3 instanceof C6314a))) {
                    b.mo16176a(true);
                    z = false;
                } else {
                    throw e3;
                }
            } catch (Throwable th) {
                b.mo16176a(true);
                throw th;
            }
        }
    }
}
