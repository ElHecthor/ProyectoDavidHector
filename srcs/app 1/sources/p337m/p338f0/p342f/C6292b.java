package p337m.p338f0.p342f;

import java.net.ProtocolException;
import p308k.p323z.p325d.C5942k;
import p337m.C6225a0;
import p337m.C6232b0;
import p337m.C6232b0.C6233a;
import p337m.C6236c0;
import p337m.C6452u;
import p337m.C6452u.C6453a;
import p337m.C6467z;
import p337m.p338f0.C6250b;
import p337m.p338f0.p341e.C6269c;
import p350n.C6483f;
import p350n.C6493o;

/* renamed from: m.f0.f.b */
public final class C6292b implements C6452u {

    /* renamed from: b */
    private final boolean f15566b;

    public C6292b(boolean z) {
        this.f15566b = z;
    }

    /* renamed from: a */
    public C6232b0 mo14196a(C6453a aVar) {
        boolean z;
        C6233a aVar2;
        C6233a aVar3;
        C6236c0 c0Var;
        C5942k.m22327b(aVar, "chain");
        C6299g gVar = (C6299g) aVar;
        C6269c d = gVar.mo16256d();
        Long l = null;
        if (d != null) {
            C6467z f = gVar.mo16258f();
            C6225a0 a = f.mo16749a();
            long currentTimeMillis = System.currentTimeMillis();
            d.mo16145a(f);
            if (!C6298f.m23678d(f.mo16754f()) || a == null) {
                d.mo16157l();
                aVar2 = null;
                z = true;
            } else {
                if (C5787p.m21979b("100-continue", f.mo16748a("Expect"), true)) {
                    d.mo16149d();
                    aVar2 = d.mo16141a(true);
                    d.mo16158m();
                    z = false;
                } else {
                    aVar2 = null;
                    z = true;
                }
                if (aVar2 != null) {
                    d.mo16157l();
                    if (!d.mo16151f().mo16216i()) {
                        d.mo16156k();
                    }
                } else if (a.mo16010c()) {
                    d.mo16149d();
                    a.mo16008a(C6493o.m24622a(d.mo16143a(f, true)));
                } else {
                    C6483f a2 = C6493o.m24622a(d.mo16143a(f, false));
                    a.mo16008a(a2);
                    a2.close();
                }
            }
            if (a == null || !a.mo16010c()) {
                d.mo16148c();
            }
            if (aVar2 == null) {
                aVar2 = d.mo16141a(false);
                if (aVar2 == null) {
                    C5942k.m22323a();
                    throw null;
                } else if (z) {
                    d.mo16158m();
                    z = false;
                }
            }
            aVar2.mo16045a(f);
            aVar2.mo16042a(d.mo16151f().mo16215h());
            aVar2.mo16049b(currentTimeMillis);
            aVar2.mo16037a(System.currentTimeMillis());
            C6232b0 a3 = aVar2.mo16046a();
            int g = a3.mo16022g();
            if (g == 100) {
                C6233a a4 = d.mo16141a(false);
                if (a4 != null) {
                    if (z) {
                        d.mo16158m();
                    }
                    a4.mo16045a(f);
                    a4.mo16042a(d.mo16151f().mo16215h());
                    a4.mo16049b(currentTimeMillis);
                    a4.mo16037a(System.currentTimeMillis());
                    a3 = a4.mo16046a();
                    g = a3.mo16022g();
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            }
            d.mo16147b(a3);
            if (!this.f15566b || g != 101) {
                aVar3 = a3.mo16029q();
                c0Var = d.mo16142a(a3);
            } else {
                aVar3 = a3.mo16029q();
                c0Var = C6250b.f15417c;
            }
            aVar3.mo16041a(c0Var);
            C6232b0 a5 = aVar3.mo16046a();
            String str = "Connection";
            String str2 = "close";
            if (C5787p.m21979b(str2, a5.mo16034v().mo16748a(str), true) || C5787p.m21979b(str2, C6232b0.m23339a(a5, str, null, 2, null), true)) {
                d.mo16156k();
            }
            if (g == 204 || g == 205) {
                C6236c0 a6 = a5.mo16018a();
                if ((a6 != null ? a6.mo16061f() : -1) > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("HTTP ");
                    sb.append(g);
                    sb.append(" had non-zero Content-Length: ");
                    C6236c0 a7 = a5.mo16018a();
                    if (a7 != null) {
                        l = Long.valueOf(a7.mo16061f());
                    }
                    sb.append(l);
                    throw new ProtocolException(sb.toString());
                }
            }
            return a5;
        }
        C5942k.m22323a();
        throw null;
    }
}
