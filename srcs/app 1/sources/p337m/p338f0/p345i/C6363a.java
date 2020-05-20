package p337m.p338f0.p345i;

import android.os.Build.VERSION;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p308k.p323z.p325d.C5942k;
import p337m.C6465y;
import p337m.p338f0.p345i.p346i.C6382a;
import p337m.p338f0.p345i.p346i.C6384b;
import p337m.p338f0.p345i.p346i.C6392f;
import p337m.p338f0.p345i.p346i.C6394g;
import p337m.p338f0.p345i.p346i.C6395h;
import p337m.p338f0.p345i.p346i.C6398j;
import p337m.p338f0.p348k.C6403c;

/* renamed from: m.f0.i.a */
public final class C6363a extends C6380h {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f15798e = (C6365b.f15803h.mo16451b() && VERSION.SDK_INT >= 29);

    /* renamed from: f */
    public static final C6364a f15799f = new C6364a(null);

    /* renamed from: d */
    private final List<C6395h> f15800d;

    /* renamed from: m.f0.i.a$a */
    public static final class C6364a {
        private C6364a() {
        }

        public /* synthetic */ C6364a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6380h mo16444a() {
            if (mo16445b()) {
                return new C6363a();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo16445b() {
            return C6363a.f15798e;
        }
    }

    public C6363a() {
        List c = C5837l.m22164c(C6384b.f15835b.mo16487a(), C6392f.f15850a.mo16495a(), new C6394g("com.google.android.gms.org.conscrypt"));
        ArrayList arrayList = new ArrayList();
        for (Object next : c) {
            if (((C6395h) next).mo16485a()) {
                arrayList.add(next);
            }
        }
        this.f15800d = arrayList;
    }

    /* renamed from: a */
    public C6403c mo16439a(X509TrustManager x509TrustManager) {
        C5942k.m22327b(x509TrustManager, "trustManager");
        C6382a a = C6382a.f15832d.mo16482a(x509TrustManager);
        return a != null ? a : super.mo16439a(x509TrustManager);
    }

    /* renamed from: a */
    public void mo16440a(String str, int i, Throwable th) {
        C5942k.m22327b(str, "message");
        C6398j.m24128a(i, str, th);
    }

    /* renamed from: a */
    public void mo16441a(SSLSocket sSLSocket, String str, List<? extends C6465y> list) {
        Object obj;
        C5942k.m22327b(sSLSocket, "sslSocket");
        C5942k.m22327b(list, "protocols");
        Iterator it = this.f15800d.iterator();
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
        Iterator it = this.f15800d.iterator();
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
    public boolean mo16443b(String str) {
        C5942k.m22327b(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
