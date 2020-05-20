package p337m.p338f0.p339c;

import java.io.Closeable;
import java.io.IOException;
import p308k.p323z.p325d.C5942k;
import p337m.C6232b0;
import p337m.C6232b0.C6233a;
import p337m.C6234c;
import p337m.C6236c0;
import p337m.C6445s;
import p337m.C6445s.C6446a;
import p337m.C6452u;
import p337m.C6452u.C6453a;
import p337m.C6465y;
import p337m.C6467z;
import p337m.p338f0.C6250b;
import p337m.p338f0.p339c.C6256c.C6258b;
import p337m.p338f0.p342f.C6297e;
import p337m.p338f0.p342f.C6298f;

/* renamed from: m.f0.c.a */
public final class C6253a implements C6452u {

    /* renamed from: c */
    public static final C6254a f15426c = new C6254a(null);

    /* renamed from: b */
    private final C6234c f15427b;

    /* renamed from: m.f0.c.a$a */
    public static final class C6254a {
        private C6254a() {
        }

        public /* synthetic */ C6254a(C5938g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final C6232b0 m23478a(C6232b0 b0Var) {
            if ((b0Var != null ? b0Var.mo16018a() : null) == null) {
                return b0Var;
            }
            C6233a q = b0Var.mo16029q();
            q.mo16041a((C6236c0) null);
            return q.mo16046a();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final C6445s m23481a(C6445s sVar, C6445s sVar2) {
            C6446a aVar = new C6446a();
            int size = sVar.size();
            for (int i = 0; i < size; i++) {
                String c = sVar.mo16604c(i);
                String d = sVar.mo16606d(i);
                if ((!C5787p.m21979b("Warning", c, true) || !C5787p.m21980b(d, "1", false, 2, null)) && (m23482a(c) || !m23483b(c) || sVar2.mo16602a(c) == null)) {
                    aVar.mo16617b(c, d);
                }
            }
            int size2 = sVar2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String c2 = sVar2.mo16604c(i2);
                if (!m23482a(c2) && m23483b(c2)) {
                    aVar.mo16617b(c2, sVar2.mo16606d(i2));
                }
            }
            return aVar.mo16614a();
        }

        /* renamed from: a */
        private final boolean m23482a(String str) {
            return C5787p.m21979b("Content-Length", str, true) || C5787p.m21979b("Content-Encoding", str, true) || C5787p.m21979b("Content-Type", str, true);
        }

        /* renamed from: b */
        private final boolean m23483b(String str) {
            return !C5787p.m21979b("Connection", str, true) && !C5787p.m21979b("Keep-Alive", str, true) && !C5787p.m21979b("Proxy-Authenticate", str, true) && !C5787p.m21979b("Proxy-Authorization", str, true) && !C5787p.m21979b("TE", str, true) && !C5787p.m21979b("Trailers", str, true) && !C5787p.m21979b("Transfer-Encoding", str, true) && !C5787p.m21979b("Upgrade", str, true);
        }
    }

    public C6253a(C6234c cVar) {
        this.f15427b = cVar;
    }

    /* renamed from: a */
    public C6232b0 mo14196a(C6453a aVar) {
        C5942k.m22327b(aVar, "chain");
        C6234c cVar = this.f15427b;
        if (cVar == null) {
            C6256c a = new C6258b(System.currentTimeMillis(), aVar.mo16259g(), null).mo16105a();
            C6467z b = a.mo16103b();
            C6232b0 a2 = a.mo16102a();
            C6234c cVar2 = this.f15427b;
            if (cVar2 != null) {
                cVar2.mo16056a(a);
                throw null;
            } else if (b == null && a2 == null) {
                C6233a aVar2 = new C6233a();
                aVar2.mo16045a(aVar.mo16259g());
                aVar2.mo16044a(C6465y.HTTP_1_1);
                aVar2.mo16036a(504);
                aVar2.mo16038a("Unsatisfiable Request (only-if-cached)");
                aVar2.mo16041a(C6250b.f15417c);
                aVar2.mo16049b(-1);
                aVar2.mo16037a(System.currentTimeMillis());
                return aVar2.mo16046a();
            } else if (b != null) {
                C6232b0 a3 = aVar.mo16251a(b);
                if (a2 != null) {
                    if (a3 == null || a3.mo16022g() != 304) {
                        C6236c0 a4 = a2.mo16018a();
                        if (a4 != null) {
                            C6250b.m23457a((Closeable) a4);
                        }
                    } else {
                        C6233a q = a2.mo16029q();
                        q.mo16043a(f15426c.m23481a(a2.mo16025l(), a3.mo16025l()));
                        q.mo16049b(a3.mo16035w());
                        q.mo16037a(a3.mo16033u());
                        q.mo16040a(f15426c.m23478a(a2));
                        q.mo16051b(f15426c.m23478a(a3));
                        q.mo16046a();
                        C6236c0 a5 = a3.mo16018a();
                        if (a5 != null) {
                            a5.close();
                            C6234c cVar3 = this.f15427b;
                            if (cVar3 == null) {
                                C5942k.m22323a();
                                throw null;
                            }
                            cVar3.mo16055a();
                            throw null;
                        }
                        C5942k.m22323a();
                        throw null;
                    }
                }
                if (a3 != null) {
                    C6233a q2 = a3.mo16029q();
                    q2.mo16040a(f15426c.m23478a(a2));
                    q2.mo16051b(f15426c.m23478a(a3));
                    C6232b0 a6 = q2.mo16046a();
                    if (this.f15427b != null) {
                        if (C6297e.m23677a(a6) && C6256c.f15428c.mo16104a(a6, b)) {
                            this.f15427b.mo16054a(a6);
                            throw null;
                        } else if (C6298f.f15571a.mo16248a(b.mo16754f())) {
                            try {
                                this.f15427b.mo16057b(b);
                                throw null;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    return a6;
                }
                C5942k.m22323a();
                throw null;
            } else if (a2 != null) {
                C6233a q3 = a2.mo16029q();
                q3.mo16040a(f15426c.m23478a(a2));
                return q3.mo16046a();
            } else {
                C5942k.m22323a();
                throw null;
            }
        } else {
            cVar.mo16053a(aVar.mo16259g());
            throw null;
        }
    }
}
