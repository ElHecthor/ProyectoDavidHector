package p242i.p243a.p244a.p245a.p246n.p248b;

/* renamed from: i.a.a.a.n.b.m */
public enum C4821m {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: f */
    private final int f12591f;

    private C4821m(int i) {
        this.f12591f = i;
    }

    /* renamed from: a */
    public static C4821m m19402a(String str) {
        return "io.crash.air".equals(str) ? TEST_DISTRIBUTION : str != null ? APP_STORE : DEVELOPER;
    }

    /* renamed from: f */
    public int mo13880f() {
        return this.f12591f;
    }

    public String toString() {
        return Integer.toString(this.f12591f);
    }
}
