package p308k.p309a0;

import p308k.p320x.C5901b;

/* renamed from: k.a0.c */
public abstract class C5723c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C5723c f14804a = C5901b.f14927a.mo15600a();

    /* renamed from: b */
    public static final C5725b f14805b = new C5725b(null);

    /* renamed from: k.a0.c$a */
    public static final class C5724a extends C5723c {

        /* renamed from: c */
        public static final C5724a f14806c = new C5724a();

        private C5724a() {
        }

        /* renamed from: a */
        public int mo15357a(int i) {
            return C5723c.f14805b.mo15357a(i);
        }
    }

    /* renamed from: k.a0.c$b */
    public static final class C5725b extends C5723c {
        private C5725b() {
        }

        public /* synthetic */ C5725b(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public int mo15356a() {
            return C5723c.f14804a.mo15356a();
        }

        /* renamed from: a */
        public int mo15357a(int i) {
            return C5723c.f14804a.mo15357a(i);
        }

        /* renamed from: a */
        public int mo15361a(int i, int i2) {
            return C5723c.f14804a.mo15361a(i, i2);
        }

        /* renamed from: b */
        public int mo15358b(int i) {
            return C5723c.f14804a.mo15358b(i);
        }
    }

    static {
        C5724a aVar = C5724a.f14806c;
    }

    /* renamed from: a */
    public int mo15356a() {
        return mo15357a(32);
    }

    /* renamed from: a */
    public abstract int mo15357a(int i);

    /* renamed from: a */
    public int mo15361a(int i, int i2) {
        int i3;
        int a;
        int i4;
        C5726d.m21841a(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i3 = mo15357a(C5726d.m21839a(i5));
            } else {
                do {
                    a = mo15356a() >>> 1;
                    i4 = a % i5;
                } while ((a - i4) + (i5 - 1) < 0);
                i3 = i4;
            }
            return i + i3;
        }
        while (true) {
            int a2 = mo15356a();
            if (i <= a2 && i2 > a2) {
                return a2;
            }
        }
    }

    /* renamed from: b */
    public int mo15358b(int i) {
        return mo15361a(0, i);
    }
}
