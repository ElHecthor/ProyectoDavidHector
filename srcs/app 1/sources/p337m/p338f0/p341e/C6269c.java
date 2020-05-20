package p337m.p338f0.p341e;

import java.io.IOException;
import java.net.ProtocolException;
import p308k.p323z.p325d.C5942k;
import p337m.C6225a0;
import p337m.C6232b0;
import p337m.C6232b0.C6233a;
import p337m.C6236c0;
import p337m.C6244e;
import p337m.C6434p;
import p337m.C6467z;
import p337m.p338f0.p342f.C6295d;
import p337m.p338f0.p342f.C6300h;
import p350n.C6480e;
import p350n.C6487i;
import p350n.C6488j;
import p350n.C6493o;
import p350n.C6504w;
import p350n.C6506y;

/* renamed from: m.f0.e.c */
public final class C6269c {

    /* renamed from: a */
    private boolean f15470a;

    /* renamed from: b */
    private final C6277f f15471b;

    /* renamed from: c */
    private final C6273e f15472c;

    /* renamed from: d */
    private final C6434p f15473d;

    /* renamed from: e */
    private final C6272d f15474e;

    /* renamed from: f */
    private final C6295d f15475f;

    /* renamed from: m.f0.e.c$a */
    private final class C6270a extends C6487i {

        /* renamed from: g */
        private boolean f15476g;

        /* renamed from: h */
        private long f15477h;

        /* renamed from: i */
        private boolean f15478i;

        /* renamed from: j */
        private final long f15479j;

        /* renamed from: k */
        final /* synthetic */ C6269c f15480k;

        public C6270a(C6269c cVar, C6504w wVar, long j) {
            C5942k.m22327b(wVar, "delegate");
            this.f15480k = cVar;
            super(wVar);
            this.f15479j = j;
        }

        /* renamed from: a */
        private final <E extends IOException> E m23558a(E e) {
            if (this.f15476g) {
                return e;
            }
            this.f15476g = true;
            return this.f15480k.mo16140a(this.f15477h, false, true, e);
        }

        /* renamed from: a */
        public void mo16159a(C6480e eVar, long j) {
            C5942k.m22327b(eVar, "source");
            if (!this.f15478i) {
                long j2 = this.f15479j;
                if (j2 == -1 || this.f15477h + j <= j2) {
                    try {
                        super.mo16159a(eVar, j);
                        this.f15477h += j;
                    } catch (IOException e) {
                        throw m23558a(e);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected ");
                    sb.append(this.f15479j);
                    sb.append(" bytes but received ");
                    sb.append(this.f15477h + j);
                    throw new ProtocolException(sb.toString());
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public void close() {
            if (!this.f15478i) {
                this.f15478i = true;
                long j = this.f15479j;
                if (j == -1 || this.f15477h == j) {
                    try {
                        super.close();
                        m23558a(null);
                    } catch (IOException e) {
                        throw m23558a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                throw m23558a(e);
            }
        }
    }

    /* renamed from: m.f0.e.c$b */
    public final class C6271b extends C6488j {

        /* renamed from: g */
        private long f15481g;

        /* renamed from: h */
        private boolean f15482h = true;

        /* renamed from: i */
        private boolean f15483i;

        /* renamed from: j */
        private boolean f15484j;

        /* renamed from: k */
        private final long f15485k;

        /* renamed from: l */
        final /* synthetic */ C6269c f15486l;

        public C6271b(C6269c cVar, C6506y yVar, long j) {
            C5942k.m22327b(yVar, "delegate");
            this.f15486l = cVar;
            super(yVar);
            this.f15485k = j;
            if (j == 0) {
                mo16162a(null);
            }
        }

        /* renamed from: a */
        public final <E extends IOException> E mo16162a(E e) {
            if (this.f15483i) {
                return e;
            }
            this.f15483i = true;
            if (e == null && this.f15482h) {
                this.f15482h = false;
                this.f15486l.mo16152g().mo16588f(this.f15486l.mo16150e());
            }
            return this.f15486l.mo16140a(this.f15481g, true, false, e);
        }

        /* renamed from: b */
        public long mo16163b(C6480e eVar, long j) {
            C5942k.m22327b(eVar, "sink");
            if (!this.f15484j) {
                try {
                    long b = mo16877a().mo16163b(eVar, j);
                    if (this.f15482h) {
                        this.f15482h = false;
                        this.f15486l.mo16152g().mo16588f(this.f15486l.mo16150e());
                    }
                    if (b == -1) {
                        mo16162a(null);
                        return -1;
                    }
                    long j2 = this.f15481g + b;
                    if (this.f15485k != -1) {
                        if (j2 > this.f15485k) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected ");
                            sb.append(this.f15485k);
                            sb.append(" bytes but received ");
                            sb.append(j2);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    this.f15481g = j2;
                    if (j2 == this.f15485k) {
                        mo16162a(null);
                    }
                    return b;
                } catch (IOException e) {
                    throw mo16162a(e);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public void close() {
            if (!this.f15484j) {
                this.f15484j = true;
                try {
                    super.close();
                    mo16162a(null);
                } catch (IOException e) {
                    throw mo16162a(e);
                }
            }
        }
    }

    public C6269c(C6273e eVar, C6434p pVar, C6272d dVar, C6295d dVar2) {
        C5942k.m22327b(eVar, "call");
        C5942k.m22327b(pVar, "eventListener");
        C5942k.m22327b(dVar, "finder");
        C5942k.m22327b(dVar2, "codec");
        this.f15472c = eVar;
        this.f15473d = pVar;
        this.f15474e = dVar;
        this.f15475f = dVar2;
        this.f15471b = dVar2.mo16246c();
    }

    /* renamed from: a */
    private final void m23538a(IOException iOException) {
        this.f15474e.mo16167a(iOException);
        this.f15475f.mo16246c().mo16201a(this.f15472c, iOException);
    }

    /* renamed from: a */
    public final <E extends IOException> E mo16140a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            m23538a((IOException) e);
        }
        if (z2) {
            C6434p pVar = this.f15473d;
            C6273e eVar = this.f15472c;
            if (e != null) {
                pVar.mo16582b((C6244e) eVar, (IOException) e);
            } else {
                pVar.mo16567a((C6244e) eVar, j);
            }
        }
        if (z) {
            if (e != null) {
                this.f15473d.mo16585c(this.f15472c, e);
            } else {
                this.f15473d.mo16581b((C6244e) this.f15472c, j);
            }
        }
        return this.f15472c.mo16172a(this, z2, z, e);
    }

    /* renamed from: a */
    public final C6233a mo16141a(boolean z) {
        try {
            C6233a a = this.f15475f.mo16240a(z);
            if (a != null) {
                a.mo16047a(this);
            }
            return a;
        } catch (IOException e) {
            this.f15473d.mo16585c(this.f15472c, e);
            m23538a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public final C6236c0 mo16142a(C6232b0 b0Var) {
        C5942k.m22327b(b0Var, "response");
        try {
            String a = C6232b0.m23339a(b0Var, "Content-Type", null, 2, null);
            long a2 = this.f15475f.mo16239a(b0Var);
            return new C6300h(a, a2, C6493o.m24623a((C6506y) new C6271b(this, this.f15475f.mo16244b(b0Var), a2)));
        } catch (IOException e) {
            this.f15473d.mo16585c(this.f15472c, e);
            m23538a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public final C6504w mo16143a(C6467z zVar, boolean z) {
        C5942k.m22327b(zVar, "request");
        this.f15470a = z;
        C6225a0 a = zVar.mo16749a();
        if (a != null) {
            long a2 = a.mo16007a();
            this.f15473d.mo16586d(this.f15472c);
            return new C6270a(this, this.f15475f.mo16241a(zVar, a2), a2);
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: a */
    public final void mo16144a() {
        this.f15475f.cancel();
    }

    /* renamed from: a */
    public final void mo16145a(C6467z zVar) {
        C5942k.m22327b(zVar, "request");
        try {
            this.f15473d.mo16587e(this.f15472c);
            this.f15475f.mo16243a(zVar);
            this.f15473d.mo16579a((C6244e) this.f15472c, zVar);
        } catch (IOException e) {
            this.f15473d.mo16582b((C6244e) this.f15472c, e);
            m23538a(e);
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo16146b() {
        this.f15475f.cancel();
        this.f15472c.mo16172a(this, true, true, null);
    }

    /* renamed from: b */
    public final void mo16147b(C6232b0 b0Var) {
        C5942k.m22327b(b0Var, "response");
        this.f15473d.mo16574a((C6244e) this.f15472c, b0Var);
    }

    /* renamed from: c */
    public final void mo16148c() {
        try {
            this.f15475f.mo16242a();
        } catch (IOException e) {
            this.f15473d.mo16582b((C6244e) this.f15472c, e);
            m23538a(e);
            throw e;
        }
    }

    /* renamed from: d */
    public final void mo16149d() {
        try {
            this.f15475f.mo16245b();
        } catch (IOException e) {
            this.f15473d.mo16582b((C6244e) this.f15472c, e);
            m23538a(e);
            throw e;
        }
    }

    /* renamed from: e */
    public final C6273e mo16150e() {
        return this.f15472c;
    }

    /* renamed from: f */
    public final C6277f mo16151f() {
        return this.f15471b;
    }

    /* renamed from: g */
    public final C6434p mo16152g() {
        return this.f15473d;
    }

    /* renamed from: h */
    public final C6272d mo16153h() {
        return this.f15474e;
    }

    /* renamed from: i */
    public final boolean mo16154i() {
        return !C5942k.m22326a((Object) this.f15474e.mo16169b().mo16005k().mo16629g(), (Object) this.f15471b.mo16219l().mo16085a().mo16005k().mo16629g());
    }

    /* renamed from: j */
    public final boolean mo16155j() {
        return this.f15470a;
    }

    /* renamed from: k */
    public final void mo16156k() {
        this.f15475f.mo16246c().mo16218k();
    }

    /* renamed from: l */
    public final void mo16157l() {
        this.f15472c.mo16172a(this, true, false, null);
    }

    /* renamed from: m */
    public final void mo16158m() {
        this.f15473d.mo16589g(this.f15472c);
    }
}
