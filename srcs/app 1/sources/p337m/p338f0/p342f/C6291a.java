package p337m.p338f0.p342f;

import java.util.List;
import p308k.p314u.C5835j;
import p308k.p323z.p325d.C5942k;
import p337m.C6225a0;
import p337m.C6232b0;
import p337m.C6232b0.C6233a;
import p337m.C6236c0;
import p337m.C6425l;
import p337m.C6427m;
import p337m.C6445s.C6446a;
import p337m.C6452u;
import p337m.C6452u.C6453a;
import p337m.C6455v;
import p337m.C6467z;
import p337m.C6467z.C6468a;
import p337m.p338f0.C6250b;
import p350n.C6490l;
import p350n.C6493o;
import p350n.C6506y;

/* renamed from: m.f0.f.a */
public final class C6291a implements C6452u {

    /* renamed from: b */
    private final C6427m f15565b;

    public C6291a(C6427m mVar) {
        C5942k.m22327b(mVar, "cookieJar");
        this.f15565b = mVar;
    }

    /* renamed from: a */
    private final String m23663a(List<C6425l> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C6425l lVar = (C6425l) next;
                if (i > 0) {
                    sb.append("; ");
                }
                sb.append(lVar.mo16548a());
                sb.append('=');
                sb.append(lVar.mo16550b());
                i = i2;
            } else {
                C5835j.m22144b();
                throw null;
            }
        }
        String sb2 = sb.toString();
        C5942k.m22324a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: a */
    public C6232b0 mo14196a(C6453a aVar) {
        C5942k.m22327b(aVar, "chain");
        C6467z g = aVar.mo16259g();
        C6468a g2 = g.mo16755g();
        C6225a0 a = g.mo16749a();
        String str = "Content-Type";
        String str2 = "Content-Length";
        if (a != null) {
            C6455v b = a.mo16009b();
            if (b != null) {
                g2.mo16767b(str, b.toString());
            }
            long a2 = a.mo16007a();
            String str3 = "Transfer-Encoding";
            if (a2 != -1) {
                g2.mo16767b(str2, String.valueOf(a2));
                g2.mo16759a(str3);
            } else {
                g2.mo16767b(str3, "chunked");
                g2.mo16759a(str2);
            }
        }
        String str4 = "Host";
        boolean z = false;
        if (g.mo16748a(str4) == null) {
            g2.mo16767b(str4, C6250b.m23448a(g.mo16756h(), false, 1, (Object) null));
        }
        String str5 = "Connection";
        if (g.mo16748a(str5) == null) {
            g2.mo16767b(str5, "Keep-Alive");
        }
        String str6 = "Accept-Encoding";
        String str7 = "gzip";
        if (g.mo16748a(str6) == null && g.mo16748a("Range") == null) {
            g2.mo16767b(str6, str7);
            z = true;
        }
        List a3 = this.f15565b.mo16557a(g.mo16756h());
        if (!a3.isEmpty()) {
            g2.mo16767b("Cookie", m23663a(a3));
        }
        String str8 = "User-Agent";
        if (g.mo16748a(str8) == null) {
            g2.mo16767b(str8, "okhttp/4.4.1");
        }
        C6232b0 a4 = aVar.mo16251a(g2.mo16765a());
        C6297e.m23676a(this.f15565b, g.mo16756h(), a4.mo16025l());
        C6233a q = a4.mo16029q();
        q.mo16045a(g);
        if (z) {
            String str9 = "Content-Encoding";
            if (C5787p.m21979b(str7, C6232b0.m23339a(a4, str9, null, 2, null), true) && C6297e.m23677a(a4)) {
                C6236c0 a5 = a4.mo16018a();
                if (a5 != null) {
                    C6490l lVar = new C6490l(a5.mo16063h());
                    C6446a c = a4.mo16025l().mo16605c();
                    c.mo16616b(str9);
                    c.mo16616b(str2);
                    q.mo16043a(c.mo16614a());
                    q.mo16041a((C6236c0) new C6300h(C6232b0.m23339a(a4, str, null, 2, null), -1, C6493o.m24623a((C6506y) lVar)));
                }
            }
        }
        return q.mo16046a();
    }
}
