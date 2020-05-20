package p337m.p338f0.p345i;

import android.os.Build.VERSION;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.C6465y;
import p337m.p338f0.p345i.p346i.C6386c;
import p337m.p338f0.p345i.p346i.C6390e;
import p337m.p338f0.p345i.p346i.C6392f;
import p337m.p338f0.p345i.p346i.C6394g;
import p337m.p338f0.p345i.p346i.C6395h;
import p337m.p338f0.p345i.p346i.C6396i;
import p337m.p338f0.p345i.p346i.C6396i.C6397a;
import p337m.p338f0.p345i.p346i.C6398j;
import p337m.p338f0.p348k.C6403c;
import p337m.p338f0.p348k.C6406e;

/* renamed from: m.f0.i.b */
public final class C6365b extends C6380h {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final boolean f15801f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final boolean f15802g;

    /* renamed from: h */
    public static final C6366a f15803h = new C6366a(null);

    /* renamed from: d */
    private final List<C6395h> f15804d;

    /* renamed from: e */
    private final C6390e f15805e;

    /* renamed from: m.f0.i.b$a */
    public static final class C6366a {
        private C6366a() {
        }

        public /* synthetic */ C6366a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6380h mo16450a() {
            if (mo16452c()) {
                return new C6365b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo16451b() {
            return C6365b.f15801f;
        }

        /* renamed from: c */
        public final boolean mo16452c() {
            return C6365b.f15802g;
        }
    }

    /* renamed from: m.f0.i.b$b */
    public static final class C6367b implements C6406e {

        /* renamed from: a */
        private final X509TrustManager f15806a;

        /* renamed from: b */
        private final Method f15807b;

        public C6367b(X509TrustManager x509TrustManager, Method method) {
            C5942k.m22327b(x509TrustManager, "trustManager");
            C5942k.m22327b(method, "findByIssuerAndSignatureMethod");
            this.f15806a = x509TrustManager;
            this.f15807b = method;
        }

        /* renamed from: a */
        public X509Certificate mo16453a(X509Certificate x509Certificate) {
            C5942k.m22327b(x509Certificate, "cert");
            try {
                Object invoke = this.f15807b.invoke(this.f15806a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new C5809q("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f15807b, (java.lang.Object) r3.f15807b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof p337m.p338f0.p345i.C6365b.C6367b
                if (r0 == 0) goto L_0x001d
                m.f0.i.b$b r3 = (p337m.p338f0.p345i.C6365b.C6367b) r3
                javax.net.ssl.X509TrustManager r0 = r2.f15806a
                javax.net.ssl.X509TrustManager r1 = r3.f15806a
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.lang.reflect.Method r0 = r2.f15807b
                java.lang.reflect.Method r3 = r3.f15807b
                boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p345i.C6365b.C6367b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f15806a;
            int i = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f15807b;
            if (method != null) {
                i = method.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CustomTrustRootIndex(trustManager=");
            sb.append(this.f15806a);
            sb.append(", findByIssuerAndSignatureMethod=");
            sb.append(this.f15807b);
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        try {
            Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            if (VERSION.SDK_INT > 0) {
                z = true;
                f15801f = z;
                if (!z) {
                    z2 = false;
                } else {
                    if (VERSION.SDK_INT >= 21) {
                        z3 = true;
                    }
                    if (!z3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected Android API level 21+ but was ");
                        sb.append(VERSION.SDK_INT);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                f15802g = z2;
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (ClassNotFoundException | UnsatisfiedLinkError unused) {
            z = false;
        }
    }

    public C6365b() {
        List c = C5837l.m22164c(C6397a.m24126a(C6396i.f15854f, null, 1, null), C6392f.f15850a.mo16495a(), new C6394g("com.google.android.gms.org.conscrypt"));
        ArrayList arrayList = new ArrayList();
        for (Object next : c) {
            if (((C6395h) next).mo16485a()) {
                arrayList.add(next);
            }
        }
        this.f15804d = arrayList;
        this.f15805e = C6390e.f15846d.mo16494a();
    }

    /* renamed from: a */
    private final boolean m24019a(String str, Class<?> cls, Object obj) {
        try {
            Object invoke = cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            throw new C5809q("null cannot be cast to non-null type kotlin.Boolean");
        } catch (NoSuchMethodException unused) {
            return super.mo16443b(str);
        }
    }

    /* renamed from: b */
    private final boolean m24020b(String str, Class<?> cls, Object obj) {
        try {
            Object invoke = cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str});
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            throw new C5809q("null cannot be cast to non-null type kotlin.Boolean");
        } catch (NoSuchMethodException unused) {
            return m24019a(str, cls, obj);
        }
    }

    /* renamed from: a */
    public Object mo16446a(String str) {
        C5942k.m22327b(str, "closer");
        return this.f15805e.mo16492a(str);
    }

    /* renamed from: a */
    public C6403c mo16439a(X509TrustManager x509TrustManager) {
        C5942k.m22327b(x509TrustManager, "trustManager");
        C6386c a = C6386c.f15837e.mo16491a(x509TrustManager);
        return a != null ? a : super.mo16439a(x509TrustManager);
    }

    /* renamed from: a */
    public void mo16440a(String str, int i, Throwable th) {
        C5942k.m22327b(str, "message");
        C6398j.m24128a(i, str, th);
    }

    /* renamed from: a */
    public void mo16447a(String str, Object obj) {
        C5942k.m22327b(str, "message");
        if (!this.f15805e.mo16493a(obj)) {
            C6380h.m24071a(this, str, 5, null, 4, null);
        }
    }

    /* renamed from: a */
    public void mo16448a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        C5942k.m22327b(socket, "socket");
        C5942k.m22327b(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public void mo16441a(SSLSocket sSLSocket, String str, List<C6465y> list) {
        Object obj;
        C5942k.m22327b(sSLSocket, "sslSocket");
        C5942k.m22327b(list, "protocols");
        Iterator it = this.f15804d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C6395h) obj).mo16486b(sSLSocket)) {
                break;
            }
        }
        C6395h hVar = (C6395h) obj;
        if (hVar != null) {
            hVar.mo16484a(sSLSocket, str, list);
        }
    }

    /* renamed from: b */
    public String mo16442b(SSLSocket sSLSocket) {
        Object obj;
        C5942k.m22327b(sSLSocket, "sslSocket");
        Iterator it = this.f15804d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C6395h) obj).mo16486b(sSLSocket)) {
                break;
            }
        }
        C6395h hVar = (C6395h) obj;
        if (hVar != null) {
            return hVar.mo16483a(sSLSocket);
        }
        return null;
    }

    /* renamed from: b */
    public C6406e mo16449b(X509TrustManager x509TrustManager) {
        C5942k.m22327b(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            C5942k.m22324a((Object) declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C6367b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo16449b(x509TrustManager);
        }
    }

    /* renamed from: b */
    public boolean mo16443b(String str) {
        String str2 = "unable to determine cleartext support";
        C5942k.m22327b(str, "hostname");
        try {
            Class cls = Class.forName("android.security.NetworkSecurityPolicy");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            C5942k.m22324a((Object) cls, "networkPolicyClass");
            C5942k.m22324a(invoke, "networkSecurityPolicy");
            return m24020b(str, cls, invoke);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo16443b(str);
        } catch (IllegalAccessException e) {
            throw new AssertionError(str2, e);
        } catch (IllegalArgumentException e2) {
            throw new AssertionError(str2, e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError(str2, e3);
        }
    }
}
