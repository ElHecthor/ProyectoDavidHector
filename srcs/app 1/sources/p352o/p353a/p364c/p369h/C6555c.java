package p352o.p353a.p364c.p369h;

import p308k.p323z.p325d.C5942k;

/* renamed from: o.a.c.h.c */
public abstract class C6555c {

    /* renamed from: a */
    private C6554b f16199a;

    public C6555c(C6554b bVar) {
        C5942k.m22327b(bVar, "level");
        this.f16199a = bVar;
    }

    /* renamed from: a */
    public final void mo16984a(String str) {
        C5942k.m22327b(str, "msg");
        mo16983a(C6554b.DEBUG, str);
    }

    /* renamed from: a */
    public abstract void mo16983a(C6554b bVar, String str);

    /* renamed from: a */
    public final boolean mo16985a(C6554b bVar) {
        C5942k.m22327b(bVar, "lvl");
        return this.f16199a.compareTo(bVar) <= 0;
    }

    /* renamed from: b */
    public final void mo16986b(String str) {
        C5942k.m22327b(str, "msg");
        mo16983a(C6554b.ERROR, str);
    }

    /* renamed from: c */
    public final void mo16987c(String str) {
        C5942k.m22327b(str, "msg");
        mo16983a(C6554b.INFO, str);
    }
}
