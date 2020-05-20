package p337m.p338f0.p342f;

import java.util.List;
import p308k.p323z.p325d.C5942k;
import p337m.C6232b0;
import p337m.C6420i;
import p337m.C6452u;
import p337m.C6452u.C6453a;
import p337m.C6467z;
import p337m.p338f0.p341e.C6269c;
import p337m.p338f0.p341e.C6273e;

/* renamed from: m.f0.f.g */
public final class C6299g implements C6453a {

    /* renamed from: a */
    private int f15572a;

    /* renamed from: b */
    private final C6273e f15573b;

    /* renamed from: c */
    private final List<C6452u> f15574c;

    /* renamed from: d */
    private final int f15575d;

    /* renamed from: e */
    private final C6269c f15576e;

    /* renamed from: f */
    private final C6467z f15577f;

    /* renamed from: g */
    private final int f15578g;

    /* renamed from: h */
    private final int f15579h;

    /* renamed from: i */
    private final int f15580i;

    public C6299g(C6273e eVar, List<? extends C6452u> list, int i, C6269c cVar, C6467z zVar, int i2, int i3, int i4) {
        C5942k.m22327b(eVar, "call");
        C5942k.m22327b(list, "interceptors");
        C5942k.m22327b(zVar, "request");
        this.f15573b = eVar;
        this.f15574c = list;
        this.f15575d = i;
        this.f15576e = cVar;
        this.f15577f = zVar;
        this.f15578g = i2;
        this.f15579h = i3;
        this.f15580i = i4;
    }

    /* renamed from: a */
    public static /* synthetic */ C6299g m23683a(C6299g gVar, int i, C6269c cVar, C6467z zVar, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = gVar.f15575d;
        }
        if ((i5 & 2) != 0) {
            cVar = gVar.f15576e;
        }
        C6269c cVar2 = cVar;
        if ((i5 & 4) != 0) {
            zVar = gVar.f15577f;
        }
        C6467z zVar2 = zVar;
        if ((i5 & 8) != 0) {
            i2 = gVar.f15578g;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = gVar.f15579h;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = gVar.f15580i;
        }
        return gVar.mo16252a(i, cVar2, zVar2, i6, i7, i4);
    }

    /* renamed from: a */
    public C6232b0 mo16251a(C6467z zVar) {
        C5942k.m22327b(zVar, "request");
        boolean z = false;
        if (this.f15575d < this.f15574c.size()) {
            this.f15572a++;
            C6269c cVar = this.f15576e;
            String str = " must call proceed() exactly once";
            String str2 = "network interceptor ";
            if (cVar != null) {
                if (cVar.mo16153h().mo16168a(zVar.mo16756h())) {
                    if (!(this.f15572a == 1)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append((C6452u) this.f15574c.get(this.f15575d - 1));
                        sb.append(str);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append((C6452u) this.f15574c.get(this.f15575d - 1));
                    sb2.append(" must retain the same host and port");
                    throw new IllegalStateException(sb2.toString().toString());
                }
            }
            C6299g a = m23683a(this, this.f15575d + 1, null, zVar, 0, 0, 0, 58, null);
            C6452u uVar = (C6452u) this.f15574c.get(this.f15575d);
            C6232b0 a2 = uVar.mo14196a(a);
            String str3 = "interceptor ";
            if (a2 != null) {
                if (this.f15576e != null) {
                    if (!(this.f15575d + 1 >= this.f15574c.size() || a.f15572a == 1)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        sb3.append(uVar);
                        sb3.append(str);
                        throw new IllegalStateException(sb3.toString().toString());
                    }
                }
                if (a2.mo16018a() != null) {
                    z = true;
                }
                if (z) {
                    return a2;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str3);
                sb4.append(uVar);
                sb4.append(" returned a response with no body");
                throw new IllegalStateException(sb4.toString().toString());
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str3);
            sb5.append(uVar);
            sb5.append(" returned null");
            throw new NullPointerException(sb5.toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public final C6299g mo16252a(int i, C6269c cVar, C6467z zVar, int i2, int i3, int i4) {
        C6467z zVar2 = zVar;
        C5942k.m22327b(zVar, "request");
        C6299g gVar = new C6299g(this.f15573b, this.f15574c, i, cVar, zVar2, i2, i3, i4);
        return gVar;
    }

    /* renamed from: a */
    public C6420i mo16253a() {
        C6269c cVar = this.f15576e;
        if (cVar != null) {
            return cVar.mo16151f();
        }
        return null;
    }

    /* renamed from: b */
    public final C6273e mo16254b() {
        return this.f15573b;
    }

    /* renamed from: c */
    public final int mo16255c() {
        return this.f15578g;
    }

    /* renamed from: d */
    public final C6269c mo16256d() {
        return this.f15576e;
    }

    /* renamed from: e */
    public final int mo16257e() {
        return this.f15579h;
    }

    /* renamed from: f */
    public final C6467z mo16258f() {
        return this.f15577f;
    }

    /* renamed from: g */
    public C6467z mo16259g() {
        return this.f15577f;
    }

    /* renamed from: h */
    public final int mo16260h() {
        return this.f15580i;
    }

    /* renamed from: i */
    public int mo16261i() {
        return this.f15579h;
    }
}
