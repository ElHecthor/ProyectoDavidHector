package p337m.p338f0.p344h;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.C6232b0;
import p337m.C6232b0.C6233a;
import p337m.C6445s;
import p337m.C6445s.C6446a;
import p337m.C6462x;
import p337m.C6465y;
import p337m.C6467z;
import p337m.p338f0.C6250b;
import p337m.p338f0.p341e.C6277f;
import p337m.p338f0.p342f.C6295d;
import p337m.p338f0.p342f.C6297e;
import p337m.p338f0.p342f.C6299g;
import p337m.p338f0.p342f.C6301i;
import p337m.p338f0.p342f.C6304k;
import p337m.p338f0.p342f.C6304k.C6305a;
import p350n.C6504w;
import p350n.C6506y;

/* renamed from: m.f0.h.g */
public final class C6342g implements C6295d {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final List<String> f15733g = C6250b.m23451a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final List<String> f15734h = C6250b.m23451a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: i */
    public static final C6343a f15735i = new C6343a(null);

    /* renamed from: a */
    private volatile C6348i f15736a;

    /* renamed from: b */
    private final C6465y f15737b;

    /* renamed from: c */
    private volatile boolean f15738c;

    /* renamed from: d */
    private final C6277f f15739d;

    /* renamed from: e */
    private final C6299g f15740e;

    /* renamed from: f */
    private final C6323f f15741f;

    /* renamed from: m.f0.h.g$a */
    public static final class C6343a {
        private C6343a() {
        }

        public /* synthetic */ C6343a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final List<C6317c> mo16353a(C6467z zVar) {
            C5942k.m22327b(zVar, "request");
            C6445s d = zVar.mo16752d();
            ArrayList arrayList = new ArrayList(d.size() + 4);
            arrayList.add(new C6317c(C6317c.f15624f, zVar.mo16754f()));
            arrayList.add(new C6317c(C6317c.f15625g, C6301i.f15584a.mo16262a(zVar.mo16756h())));
            String a = zVar.mo16748a("Host");
            if (a != null) {
                arrayList.add(new C6317c(C6317c.f15627i, a));
            }
            arrayList.add(new C6317c(C6317c.f15626h, zVar.mo16756h().mo16637n()));
            int i = 0;
            int size = d.size();
            while (i < size) {
                String c = d.mo16604c(i);
                Locale locale = Locale.US;
                C5942k.m22324a((Object) locale, "Locale.US");
                if (c != null) {
                    String lowerCase = c.toLowerCase(locale);
                    C5942k.m22324a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (!C6342g.f15733g.contains(lowerCase) || (C5942k.m22326a((Object) lowerCase, (Object) "te") && C5942k.m22326a((Object) d.mo16606d(i), (Object) "trailers"))) {
                        arrayList.add(new C6317c(lowerCase, d.mo16606d(i)));
                    }
                    i++;
                } else {
                    throw new C5809q("null cannot be cast to non-null type java.lang.String");
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public final C6233a mo16354a(C6445s sVar, C6465y yVar) {
            C5942k.m22327b(sVar, "headerBlock");
            C5942k.m22327b(yVar, "protocol");
            C6446a aVar = new C6446a();
            int size = sVar.size();
            C6304k kVar = null;
            for (int i = 0; i < size; i++) {
                String c = sVar.mo16604c(i);
                String d = sVar.mo16606d(i);
                if (C5942k.m22326a((Object) c, (Object) ":status")) {
                    C6305a aVar2 = C6304k.f15586d;
                    StringBuilder sb = new StringBuilder();
                    sb.append("HTTP/1.1 ");
                    sb.append(d);
                    kVar = aVar2.mo16265a(sb.toString());
                } else if (!C6342g.f15734h.contains(c)) {
                    aVar.mo16617b(c, d);
                }
            }
            if (kVar != null) {
                C6233a aVar3 = new C6233a();
                aVar3.mo16044a(yVar);
                aVar3.mo16036a(kVar.f15588b);
                aVar3.mo16038a(kVar.f15589c);
                aVar3.mo16043a(aVar.mo16614a());
                return aVar3;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public C6342g(C6462x xVar, C6277f fVar, C6299g gVar, C6323f fVar2) {
        C5942k.m22327b(xVar, "client");
        C5942k.m22327b(fVar, "connection");
        C5942k.m22327b(gVar, "chain");
        C5942k.m22327b(fVar2, "http2Connection");
        this.f15739d = fVar;
        this.f15740e = gVar;
        this.f15741f = fVar2;
        this.f15737b = xVar.mo16707y().contains(C6465y.H2_PRIOR_KNOWLEDGE) ? C6465y.H2_PRIOR_KNOWLEDGE : C6465y.HTTP_2;
    }

    /* renamed from: a */
    public long mo16239a(C6232b0 b0Var) {
        C5942k.m22327b(b0Var, "response");
        if (!C6297e.m23677a(b0Var)) {
            return 0;
        }
        return C6250b.m23444a(b0Var);
    }

    /* renamed from: a */
    public C6233a mo16240a(boolean z) {
        C6348i iVar = this.f15736a;
        if (iVar != null) {
            C6233a a = f15735i.mo16354a(iVar.mo16393s(), this.f15737b);
            if (!z || a.mo16048b() != 100) {
                return a;
            }
            return null;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: a */
    public C6504w mo16241a(C6467z zVar, long j) {
        C5942k.m22327b(zVar, "request");
        C6348i iVar = this.f15736a;
        if (iVar != null) {
            return iVar.mo16384j();
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: a */
    public void mo16242a() {
        C6348i iVar = this.f15736a;
        if (iVar != null) {
            iVar.mo16384j().close();
        } else {
            C5942k.m22323a();
            throw null;
        }
    }

    /* renamed from: a */
    public void mo16243a(C6467z zVar) {
        C5942k.m22327b(zVar, "request");
        if (this.f15736a == null) {
            this.f15736a = this.f15741f.mo16294a(f15735i.mo16353a(zVar), zVar.mo16749a() != null);
            if (this.f15738c) {
                C6348i iVar = this.f15736a;
                if (iVar == null) {
                    C5942k.m22323a();
                    throw null;
                } else {
                    iVar.mo16368a(C6315b.CANCEL);
                    throw new IOException("Canceled");
                }
            } else {
                C6348i iVar2 = this.f15736a;
                if (iVar2 != null) {
                    iVar2.mo16392r().mo16882a((long) this.f15740e.mo16257e(), TimeUnit.MILLISECONDS);
                    C6348i iVar3 = this.f15736a;
                    if (iVar3 != null) {
                        iVar3.mo16395u().mo16882a((long) this.f15740e.mo16260h(), TimeUnit.MILLISECONDS);
                    } else {
                        C5942k.m22323a();
                        throw null;
                    }
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            }
        }
    }

    /* renamed from: b */
    public C6506y mo16244b(C6232b0 b0Var) {
        C5942k.m22327b(b0Var, "response");
        C6348i iVar = this.f15736a;
        if (iVar != null) {
            return iVar.mo16386l();
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: b */
    public void mo16245b() {
        this.f15741f.flush();
    }

    /* renamed from: c */
    public C6277f mo16246c() {
        return this.f15739d;
    }

    public void cancel() {
        this.f15738c = true;
        C6348i iVar = this.f15736a;
        if (iVar != null) {
            iVar.mo16368a(C6315b.CANCEL);
        }
    }
}
