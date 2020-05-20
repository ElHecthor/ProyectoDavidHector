package p071f.p097h.p106k;

import java.util.Locale;

/* renamed from: f.h.k.f */
public final class C3306f {

    /* renamed from: a */
    public static final C3305e f9480a = new C3311e(null, false);

    /* renamed from: b */
    public static final C3305e f9481b = new C3311e(null, true);

    /* renamed from: c */
    public static final C3305e f9482c = new C3311e(C3308b.f9486a, false);

    /* renamed from: d */
    public static final C3305e f9483d = new C3311e(C3308b.f9486a, true);

    /* renamed from: f.h.k.f$a */
    private static class C3307a implements C3309c {

        /* renamed from: b */
        static final C3307a f9484b = new C3307a(true);

        /* renamed from: a */
        private final boolean f9485a;

        private C3307a(boolean z) {
            this.f9485a = z;
        }

        /* renamed from: a */
        public int mo10690a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C3306f.m13517a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f9485a) {
                        return 1;
                    }
                } else if (this.f9485a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f9485a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: f.h.k.f$b */
    private static class C3308b implements C3309c {

        /* renamed from: a */
        static final C3308b f9486a = new C3308b();

        private C3308b() {
        }

        /* renamed from: a */
        public int mo10690a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C3306f.m13518b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: f.h.k.f$c */
    private interface C3309c {
        /* renamed from: a */
        int mo10690a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: f.h.k.f$d */
    private static abstract class C3310d implements C3305e {

        /* renamed from: a */
        private final C3309c f9487a;

        C3310d(C3309c cVar) {
            this.f9487a = cVar;
        }

        /* renamed from: b */
        private boolean m13522b(CharSequence charSequence, int i, int i2) {
            int a = this.f9487a.mo10690a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo10691a();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo10691a();

        /* renamed from: a */
        public boolean mo10689a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f9487a == null ? mo10691a() : m13522b(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: f.h.k.f$e */
    private static class C3311e extends C3310d {

        /* renamed from: b */
        private final boolean f9488b;

        C3311e(C3309c cVar, boolean z) {
            super(cVar);
            this.f9488b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo10691a() {
            return this.f9488b;
        }
    }

    /* renamed from: f.h.k.f$f */
    private static class C3312f extends C3310d {

        /* renamed from: b */
        static final C3312f f9489b = new C3312f();

        C3312f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo10691a() {
            return C3313g.m13528b(Locale.getDefault()) == 1;
        }
    }

    static {
        new C3311e(C3307a.f9484b, false);
        C3312f fVar = C3312f.f9489b;
    }

    /* renamed from: a */
    static int m13517a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m13518b(int i) {
        if (i != 0) {
            if (!(i == 1 || i == 2)) {
                switch (i) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        break;
                    default:
                        return 2;
                }
            }
            return 0;
        }
        return 1;
    }
}
