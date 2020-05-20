package p242i.p243a.p244a.p245a.p246n.p249c.p250n;

/* renamed from: i.a.a.a.n.c.n.e */
public class C4872e {

    /* renamed from: a */
    private final int f12695a;

    /* renamed from: b */
    private final C4868a f12696b;

    /* renamed from: c */
    private final C4871d f12697c;

    public C4872e(int i, C4868a aVar, C4871d dVar) {
        this.f12695a = i;
        this.f12696b = aVar;
        this.f12697c = dVar;
    }

    public C4872e(C4868a aVar, C4871d dVar) {
        this(0, aVar, dVar);
    }

    /* renamed from: a */
    public long mo13973a() {
        return this.f12696b.mo5465a(this.f12695a);
    }

    /* renamed from: b */
    public C4872e mo13974b() {
        return new C4872e(this.f12696b, this.f12697c);
    }

    /* renamed from: c */
    public C4872e mo13975c() {
        return new C4872e(this.f12695a + 1, this.f12696b, this.f12697c);
    }
}
