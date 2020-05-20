package p337m.p338f0.p344h;

import p308k.p323z.p325d.C5942k;

/* renamed from: m.f0.h.m */
public final class C6360m {

    /* renamed from: a */
    private int f15795a;

    /* renamed from: b */
    private final int[] f15796b = new int[10];

    /* renamed from: m.f0.h.m$a */
    public static final class C6361a {
        private C6361a() {
        }

        public /* synthetic */ C6361a(C5938g gVar) {
            this();
        }
    }

    static {
        new C6361a(null);
    }

    /* renamed from: a */
    public final int mo16430a() {
        if ((this.f15795a & 2) != 0) {
            return this.f15796b[1];
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo16431a(int i) {
        return this.f15796b[i];
    }

    /* renamed from: a */
    public final C6360m mo16432a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f15796b;
            if (i < iArr.length) {
                this.f15795a = (1 << i) | this.f15795a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* renamed from: a */
    public final void mo16433a(C6360m mVar) {
        C5942k.m22327b(mVar, "other");
        for (int i = 0; i < 10; i++) {
            if (mVar.mo16437c(i)) {
                mo16432a(i, mVar.mo16431a(i));
            }
        }
    }

    /* renamed from: b */
    public final int mo16434b() {
        if ((this.f15795a & 128) != 0) {
            return this.f15796b[7];
        }
        return 65535;
    }

    /* renamed from: b */
    public final int mo16435b(int i) {
        return (this.f15795a & 32) != 0 ? this.f15796b[5] : i;
    }

    /* renamed from: c */
    public final int mo16436c() {
        if ((this.f15795a & 16) != 0) {
            return this.f15796b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public final boolean mo16437c(int i) {
        return ((1 << i) & this.f15795a) != 0;
    }

    /* renamed from: d */
    public final int mo16438d() {
        return Integer.bitCount(this.f15795a);
    }
}
