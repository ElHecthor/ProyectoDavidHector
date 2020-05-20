package p352o.p353a.p359b.p360a;

import androidx.lifecycle.C0510d0;
import androidx.lifecycle.C0523n;
import p308k.p311c0.C5739b;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: o.a.b.a.a */
public final class C6516a<T> {

    /* renamed from: a */
    private final C5739b<T> f16148a;

    /* renamed from: b */
    private final C0523n f16149b;

    /* renamed from: c */
    private final C6560a f16150c;

    /* renamed from: d */
    private final C5907a<C0510d0> f16151d;

    /* renamed from: e */
    private final C5907a<C6557a> f16152e;

    public C6516a(C5739b<T> bVar, C0523n nVar, C6560a aVar, C5907a<? extends C0510d0> aVar2, C5907a<C6557a> aVar3) {
        C5942k.m22327b(bVar, "clazz");
        C5942k.m22327b(nVar, "owner");
        this.f16148a = bVar;
        this.f16149b = nVar;
        this.f16150c = aVar;
        this.f16151d = aVar2;
        this.f16152e = aVar3;
    }

    public /* synthetic */ C6516a(C5739b bVar, C0523n nVar, C6560a aVar, C5907a aVar2, C5907a aVar3, int i, C5938g gVar) {
        this(bVar, nVar, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? null : aVar2, (i & 16) != 0 ? null : aVar3);
    }

    /* renamed from: a */
    public final C5739b<T> mo16927a() {
        return this.f16148a;
    }

    /* renamed from: b */
    public final C5907a<C0510d0> mo16928b() {
        return this.f16151d;
    }

    /* renamed from: c */
    public final C0523n mo16929c() {
        return this.f16149b;
    }

    /* renamed from: d */
    public final C5907a<C6557a> mo16930d() {
        return this.f16152e;
    }

    /* renamed from: e */
    public final C6560a mo16931e() {
        return this.f16150c;
    }
}
