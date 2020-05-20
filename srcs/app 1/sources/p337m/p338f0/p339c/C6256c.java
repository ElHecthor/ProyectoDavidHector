package p337m.p338f0.p339c;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p308k.p323z.p325d.C5942k;
import p337m.C6232b0;
import p337m.C6232b0.C6233a;
import p337m.C6240d;
import p337m.C6445s;
import p337m.C6445s.C6446a;
import p337m.C6467z;
import p337m.C6467z.C6468a;
import p337m.p338f0.C6250b;
import p337m.p338f0.p342f.C6293c;

/* renamed from: m.f0.c.c */
public final class C6256c {

    /* renamed from: c */
    public static final C6257a f15428c = new C6257a(null);

    /* renamed from: a */
    private final C6467z f15429a;

    /* renamed from: b */
    private final C6232b0 f15430b;

    /* renamed from: m.f0.c.c$a */
    public static final class C6257a {
        private C6257a() {
        }

        public /* synthetic */ C6257a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo16104a(C6232b0 b0Var, C6467z zVar) {
            C5942k.m22327b(b0Var, "response");
            C5942k.m22327b(zVar, "request");
            int g = b0Var.mo16022g();
            boolean z = false;
            if (!(g == 200 || g == 410 || g == 414 || g == 501 || g == 203 || g == 204)) {
                if (g != 307) {
                    if (!(g == 308 || g == 404 || g == 405)) {
                        switch (g) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (C6232b0.m23339a(b0Var, "Expires", null, 2, null) == null && b0Var.mo16020d().mo16072c() == -1 && !b0Var.mo16020d().mo16071b() && !b0Var.mo16020d().mo16070a()) {
                    return false;
                }
            }
            if (!b0Var.mo16020d().mo16077h() && !zVar.mo16750b().mo16077h()) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: m.f0.c.c$b */
    public static final class C6258b {

        /* renamed from: a */
        private Date f15431a;

        /* renamed from: b */
        private String f15432b;

        /* renamed from: c */
        private Date f15433c;

        /* renamed from: d */
        private String f15434d;

        /* renamed from: e */
        private Date f15435e;

        /* renamed from: f */
        private long f15436f;

        /* renamed from: g */
        private long f15437g;

        /* renamed from: h */
        private String f15438h;

        /* renamed from: i */
        private int f15439i = -1;

        /* renamed from: j */
        private final long f15440j;

        /* renamed from: k */
        private final C6467z f15441k;

        /* renamed from: l */
        private final C6232b0 f15442l;

        public C6258b(long j, C6467z zVar, C6232b0 b0Var) {
            C5942k.m22327b(zVar, "request");
            this.f15440j = j;
            this.f15441k = zVar;
            this.f15442l = b0Var;
            if (b0Var != null) {
                this.f15436f = b0Var.mo16035w();
                this.f15437g = this.f15442l.mo16033u();
                C6445s l = this.f15442l.mo16025l();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    String c = l.mo16604c(i);
                    String d = l.mo16606d(i);
                    if (C5787p.m21979b(c, "Date", true)) {
                        this.f15431a = C6293c.m23667a(d);
                        this.f15432b = d;
                    } else if (C5787p.m21979b(c, "Expires", true)) {
                        this.f15435e = C6293c.m23667a(d);
                    } else if (C5787p.m21979b(c, "Last-Modified", true)) {
                        this.f15433c = C6293c.m23667a(d);
                        this.f15434d = d;
                    } else if (C5787p.m21979b(c, "ETag", true)) {
                        this.f15438h = d;
                    } else if (C5787p.m21979b(c, "Age", true)) {
                        this.f15439i = C6250b.m23468b(d, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        private final boolean m23487a(C6467z zVar) {
            return (zVar.mo16748a("If-Modified-Since") == null && zVar.mo16748a("If-None-Match") == null) ? false : true;
        }

        /* renamed from: b */
        private final long m23488b() {
            Date date = this.f15431a;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f15437g - date.getTime());
            }
            int i = this.f15439i;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f15437g;
            return j + (j2 - this.f15436f) + (this.f15440j - j2);
        }

        /* renamed from: c */
        private final C6256c m23489c() {
            if (this.f15442l == null) {
                return new C6256c(this.f15441k, null);
            }
            if (this.f15441k.mo16753e() && this.f15442l.mo16024i() == null) {
                return new C6256c(this.f15441k, null);
            }
            if (!C6256c.f15428c.mo16104a(this.f15442l, this.f15441k)) {
                return new C6256c(this.f15441k, null);
            }
            C6240d b = this.f15441k.mo16750b();
            if (b.mo16076g() || m23487a(this.f15441k)) {
                return new C6256c(this.f15441k, null);
            }
            C6240d d = this.f15442l.mo16020d();
            long b2 = m23488b();
            long d2 = m23490d();
            if (b.mo16072c() != -1) {
                d2 = Math.min(d2, TimeUnit.SECONDS.toMillis((long) b.mo16072c()));
            }
            long j = 0;
            long millis = b.mo16074e() != -1 ? TimeUnit.SECONDS.toMillis((long) b.mo16074e()) : 0;
            if (!d.mo16075f() && b.mo16073d() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) b.mo16073d());
            }
            if (!d.mo16076g()) {
                long j2 = millis + b2;
                if (j2 < j + d2) {
                    C6233a q = this.f15442l.mo16029q();
                    String str = "Warning";
                    if (j2 >= d2) {
                        q.mo16039a(str, "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (b2 > 86400000 && m23491e()) {
                        q.mo16039a(str, "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C6256c(null, q.mo16046a());
                }
            }
            String str2 = this.f15438h;
            String str3 = "If-Modified-Since";
            if (str2 != null) {
                str3 = "If-None-Match";
            } else if (this.f15433c != null) {
                str2 = this.f15434d;
            } else if (this.f15431a == null) {
                return new C6256c(this.f15441k, null);
            } else {
                str2 = this.f15432b;
            }
            C6446a c = this.f15441k.mo16752d().mo16605c();
            if (str2 != null) {
                c.mo16617b(str3, str2);
                C6468a g = this.f15441k.mo16755g();
                g.mo16763a(c.mo16614a());
                return new C6256c(g.mo16765a(), this.f15442l);
            }
            C5942k.m22323a();
            throw null;
        }

        /* renamed from: d */
        private final long m23490d() {
            C6232b0 b0Var = this.f15442l;
            if (b0Var != null) {
                C6240d d = b0Var.mo16020d();
                if (d.mo16072c() != -1) {
                    return TimeUnit.SECONDS.toMillis((long) d.mo16072c());
                }
                Date date = this.f15435e;
                long j = 0;
                if (date != null) {
                    Date date2 = this.f15431a;
                    long time = date.getTime() - (date2 != null ? date2.getTime() : this.f15437g);
                    if (time > 0) {
                        j = time;
                    }
                    return j;
                } else if (this.f15433c == null || this.f15442l.mo16034v().mo16756h().mo16635l() != null) {
                    return 0;
                } else {
                    Date date3 = this.f15431a;
                    long time2 = date3 != null ? date3.getTime() : this.f15436f;
                    Date date4 = this.f15433c;
                    if (date4 != null) {
                        long time3 = time2 - date4.getTime();
                        if (time3 > 0) {
                            j = time3 / ((long) 10);
                        }
                        return j;
                    }
                    C5942k.m22323a();
                    throw null;
                }
            } else {
                C5942k.m22323a();
                throw null;
            }
        }

        /* renamed from: e */
        private final boolean m23491e() {
            C6232b0 b0Var = this.f15442l;
            if (b0Var != null) {
                return b0Var.mo16020d().mo16072c() == -1 && this.f15435e == null;
            }
            C5942k.m22323a();
            throw null;
        }

        /* renamed from: a */
        public final C6256c mo16105a() {
            C6256c c = m23489c();
            return (c.mo16103b() == null || !this.f15441k.mo16750b().mo16078i()) ? c : new C6256c(null, null);
        }
    }

    public C6256c(C6467z zVar, C6232b0 b0Var) {
        this.f15429a = zVar;
        this.f15430b = b0Var;
    }

    /* renamed from: a */
    public final C6232b0 mo16102a() {
        return this.f15430b;
    }

    /* renamed from: b */
    public final C6467z mo16103b() {
        return this.f15429a;
    }
}
