package p147g.p156d.p212c.p222n.p223b;

/* renamed from: g.d.c.n.b.b */
public enum C4703b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: f */
    private final int[] f12332f;

    /* renamed from: g */
    private final int f12333g;

    private C4703b(int[] iArr, int i) {
        this.f12332f = iArr;
        this.f12333g = i;
    }

    /* renamed from: a */
    public int mo13663a(C4704c cVar) {
        int c = cVar.mo13668c();
        char c2 = c <= 9 ? 0 : c <= 26 ? (char) 1 : 2;
        return this.f12332f[c2];
    }

    /* renamed from: f */
    public int mo13664f() {
        return this.f12333g;
    }
}
