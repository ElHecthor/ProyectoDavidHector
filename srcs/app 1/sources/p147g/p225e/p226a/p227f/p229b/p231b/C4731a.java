package p147g.p225e.p226a.p227f.p229b.p231b;

import p308k.p310b0.C5728a;
import p308k.p310b0.C5732d;

/* renamed from: g.e.a.f.b.b.a */
public enum C4731a {
    NOT_DETECTED,
    UP,
    DOWN,
    LEFT,
    RIGHT;
    

    /* renamed from: l */
    public static final C4732a f12383l = null;

    /* renamed from: g.e.a.f.b.b.a$a */
    public static final class C4732a {
        private C4732a() {
        }

        public /* synthetic */ C4732a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C4731a mo13704a(double d) {
            if (!C5736g.m21871a((C5728a) new C5732d(0, 45), d)) {
                if (C5736g.m21871a((C5728a) new C5732d(45, 135), d)) {
                    return C4731a.UP;
                }
                if (C5736g.m21871a((C5728a) new C5732d(135, 225), d)) {
                    return C4731a.LEFT;
                }
                if (C5736g.m21871a((C5728a) new C5732d(225, 315), d)) {
                    return C4731a.DOWN;
                }
                if (!C5736g.m21871a((C5728a) new C5732d(315, 360), d)) {
                    return C4731a.NOT_DETECTED;
                }
            }
            return C4731a.RIGHT;
        }
    }

    static {
        f12383l = new C4732a(null);
    }
}
