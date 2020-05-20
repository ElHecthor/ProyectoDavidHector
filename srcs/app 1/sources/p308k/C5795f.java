package p308k;

import p308k.p323z.p325d.C5942k;

/* renamed from: k.f */
public final class C5795f implements Comparable<C5795f> {

    /* renamed from: j */
    public static final C5795f f14859j = new C5795f(1, 3, 72);

    /* renamed from: f */
    private final int f14860f;

    /* renamed from: g */
    private final int f14861g;

    /* renamed from: h */
    private final int f14862h;

    /* renamed from: i */
    private final int f14863i;

    /* renamed from: k.f$a */
    public static final class C5796a {
        private C5796a() {
        }

        public /* synthetic */ C5796a(C5938g gVar) {
            this();
        }
    }

    static {
        new C5796a(null);
    }

    public C5795f(int i, int i2, int i3) {
        this.f14861g = i;
        this.f14862h = i2;
        this.f14863i = i3;
        this.f14860f = m22041a(i, i2, i3);
    }

    /* renamed from: a */
    private final int m22041a(int i, int i2, int i3) {
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            return (i << 16) + (i2 << 8) + i3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Version components are out of range: ");
        sb.append(i);
        sb.append('.');
        sb.append(i2);
        sb.append('.');
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public int compareTo(C5795f fVar) {
        C5942k.m22327b(fVar, "other");
        return this.f14860f - fVar.f14860f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5795f)) {
            obj = null;
        }
        C5795f fVar = (C5795f) obj;
        if (fVar == null) {
            return false;
        }
        if (this.f14860f != fVar.f14860f) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f14860f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14861g);
        sb.append('.');
        sb.append(this.f14862h);
        sb.append('.');
        sb.append(this.f14863i);
        return sb.toString();
    }
}
