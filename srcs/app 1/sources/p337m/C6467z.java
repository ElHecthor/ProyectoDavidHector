package p337m;

import java.util.LinkedHashMap;
import java.util.Map;
import p308k.C5802l;
import p308k.p314u.C5835j;
import p308k.p323z.p325d.C5942k;
import p337m.C6445s.C6446a;
import p337m.p338f0.C6250b;
import p337m.p338f0.p342f.C6298f;

/* renamed from: m.z */
public final class C6467z {

    /* renamed from: a */
    private C6240d f16068a;

    /* renamed from: b */
    private final C6448t f16069b;

    /* renamed from: c */
    private final String f16070c;

    /* renamed from: d */
    private final C6445s f16071d;

    /* renamed from: e */
    private final C6225a0 f16072e;

    /* renamed from: f */
    private final Map<Class<?>, Object> f16073f;

    /* renamed from: m.z$a */
    public static class C6468a {

        /* renamed from: a */
        private C6448t f16074a;

        /* renamed from: b */
        private String f16075b;

        /* renamed from: c */
        private C6446a f16076c;

        /* renamed from: d */
        private C6225a0 f16077d;

        /* renamed from: e */
        private Map<Class<?>, Object> f16078e;

        public C6468a() {
            this.f16078e = new LinkedHashMap();
            this.f16075b = "GET";
            this.f16076c = new C6446a();
        }

        public C6468a(C6467z zVar) {
            C5942k.m22327b(zVar, "request");
            this.f16078e = new LinkedHashMap();
            this.f16074a = zVar.mo16756h();
            this.f16075b = zVar.mo16754f();
            this.f16077d = zVar.mo16749a();
            this.f16078e = zVar.mo16751c().isEmpty() ? new LinkedHashMap<>() : C5823c0.m22081c(zVar.mo16751c());
            this.f16076c = zVar.mo16752d().mo16605c();
        }

        /* renamed from: a */
        public <T> C6468a mo16758a(Class<? super T> cls, T t) {
            C5942k.m22327b(cls, "type");
            if (t == null) {
                this.f16078e.remove(cls);
            } else {
                if (this.f16078e.isEmpty()) {
                    this.f16078e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f16078e;
                Object cast = cls.cast(t);
                if (cast != null) {
                    map.put(cls, cast);
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            }
            return this;
        }

        /* renamed from: a */
        public C6468a mo16759a(String str) {
            C5942k.m22327b(str, "name");
            this.f16076c.mo16616b(str);
            return this;
        }

        /* renamed from: a */
        public C6468a mo16760a(String str, String str2) {
            C5942k.m22327b(str, "name");
            C5942k.m22327b(str2, "value");
            this.f16076c.mo16613a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C6468a mo16761a(String str, C6225a0 a0Var) {
            C5942k.m22327b(str, "method");
            if (str.length() > 0) {
                String str2 = "method ";
                if (a0Var == null) {
                    if (!(true ^ C6298f.m23679e(str))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(str);
                        sb.append(" must have a request body.");
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                } else if (!C6298f.m23678d(str)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(str);
                    sb2.append(" must not have a request body.");
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                this.f16075b = str;
                this.f16077d = a0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        /* renamed from: a */
        public C6468a mo16762a(C6225a0 a0Var) {
            C5942k.m22327b(a0Var, "body");
            mo16761a("POST", a0Var);
            return this;
        }

        /* renamed from: a */
        public C6468a mo16763a(C6445s sVar) {
            C5942k.m22327b(sVar, "headers");
            this.f16076c = sVar.mo16605c();
            return this;
        }

        /* renamed from: a */
        public C6468a mo16764a(C6448t tVar) {
            C5942k.m22327b(tVar, "url");
            this.f16074a = tVar;
            return this;
        }

        /* renamed from: a */
        public C6467z mo16765a() {
            C6448t tVar = this.f16074a;
            if (tVar != null) {
                C6467z zVar = new C6467z(tVar, this.f16075b, this.f16076c.mo16614a(), this.f16077d, C6250b.m23452a(this.f16078e));
                return zVar;
            }
            throw new IllegalStateException("url == null".toString());
        }

        /* renamed from: b */
        public C6468a mo16766b(String str) {
            StringBuilder sb;
            int i;
            C5942k.m22327b(str, "url");
            String str2 = "(this as java.lang.String).substring(startIndex)";
            if (C5787p.m21982c(str, "ws:", true)) {
                sb = new StringBuilder();
                sb.append("http:");
                i = 3;
            } else {
                if (C5787p.m21982c(str, "wss:", true)) {
                    sb = new StringBuilder();
                    sb.append("https:");
                    i = 4;
                }
                mo16764a(C6448t.f15954l.mo16663b(str));
                return this;
            }
            String substring = str.substring(i);
            C5942k.m22324a((Object) substring, str2);
            sb.append(substring);
            str = sb.toString();
            mo16764a(C6448t.f15954l.mo16663b(str));
            return this;
        }

        /* renamed from: b */
        public C6468a mo16767b(String str, String str2) {
            C5942k.m22327b(str, "name");
            C5942k.m22327b(str2, "value");
            this.f16076c.mo16618c(str, str2);
            return this;
        }
    }

    public C6467z(C6448t tVar, String str, C6445s sVar, C6225a0 a0Var, Map<Class<?>, ? extends Object> map) {
        C5942k.m22327b(tVar, "url");
        C5942k.m22327b(str, "method");
        C5942k.m22327b(sVar, "headers");
        C5942k.m22327b(map, "tags");
        this.f16069b = tVar;
        this.f16070c = str;
        this.f16071d = sVar;
        this.f16072e = a0Var;
        this.f16073f = map;
    }

    /* renamed from: a */
    public final <T> T mo16747a(Class<? extends T> cls) {
        C5942k.m22327b(cls, "type");
        return cls.cast(this.f16073f.get(cls));
    }

    /* renamed from: a */
    public final String mo16748a(String str) {
        C5942k.m22327b(str, "name");
        return this.f16071d.mo16602a(str);
    }

    /* renamed from: a */
    public final C6225a0 mo16749a() {
        return this.f16072e;
    }

    /* renamed from: b */
    public final C6240d mo16750b() {
        C6240d dVar = this.f16068a;
        if (dVar != null) {
            return dVar;
        }
        C6240d a = C6240d.f15382n.mo16084a(this.f16071d);
        this.f16068a = a;
        return a;
    }

    /* renamed from: c */
    public final Map<Class<?>, Object> mo16751c() {
        return this.f16073f;
    }

    /* renamed from: d */
    public final C6445s mo16752d() {
        return this.f16071d;
    }

    /* renamed from: e */
    public final boolean mo16753e() {
        return this.f16069b.mo16630h();
    }

    /* renamed from: f */
    public final String mo16754f() {
        return this.f16070c;
    }

    /* renamed from: g */
    public final C6468a mo16755g() {
        return new C6468a(this);
    }

    /* renamed from: h */
    public final C6448t mo16756h() {
        return this.f16069b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f16070c);
        sb.append(", url=");
        sb.append(this.f16069b);
        if (this.f16071d.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object next : this.f16071d) {
                int i2 = i + 1;
                if (i >= 0) {
                    C5802l lVar = (C5802l) next;
                    String str = (String) lVar.mo15418a();
                    String str2 = (String) lVar.mo15419b();
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append(':');
                    sb.append(str2);
                    i = i2;
                } else {
                    C5835j.m22144b();
                    throw null;
                }
            }
            sb.append(']');
        }
        if (!this.f16073f.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f16073f);
        }
        sb.append('}');
        String sb2 = sb.toString();
        C5942k.m22324a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
