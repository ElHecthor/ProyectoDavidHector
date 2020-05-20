package p071f.p097h.p106k;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: f.h.k.a */
public final class C3297a {

    /* renamed from: d */
    static final C3305e f9450d = C3306f.f9482c;

    /* renamed from: e */
    private static final String f9451e = Character.toString(8206);

    /* renamed from: f */
    private static final String f9452f = Character.toString(8207);

    /* renamed from: g */
    static final C3297a f9453g = new C3297a(false, 2, f9450d);

    /* renamed from: h */
    static final C3297a f9454h = new C3297a(true, 2, f9450d);

    /* renamed from: a */
    private final boolean f9455a;

    /* renamed from: b */
    private final int f9456b;

    /* renamed from: c */
    private final C3305e f9457c;

    /* renamed from: f.h.k.a$a */
    public static final class C3298a {

        /* renamed from: a */
        private boolean f9458a;

        /* renamed from: b */
        private int f9459b;

        /* renamed from: c */
        private C3305e f9460c;

        public C3298a() {
            m13490b(C3297a.m13481a(Locale.getDefault()));
        }

        /* renamed from: a */
        private static C3297a m13489a(boolean z) {
            return z ? C3297a.f9454h : C3297a.f9453g;
        }

        /* renamed from: b */
        private void m13490b(boolean z) {
            this.f9458a = z;
            this.f9460c = C3297a.f9450d;
            this.f9459b = 2;
        }

        /* renamed from: a */
        public C3297a mo10659a() {
            return (this.f9459b == 2 && this.f9460c == C3297a.f9450d) ? m13489a(this.f9458a) : new C3297a(this.f9458a, this.f9459b, this.f9460c);
        }
    }

    /* renamed from: f.h.k.a$b */
    private static class C3299b {

        /* renamed from: f */
        private static final byte[] f9461f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f9462a;

        /* renamed from: b */
        private final boolean f9463b;

        /* renamed from: c */
        private final int f9464c;

        /* renamed from: d */
        private int f9465d;

        /* renamed from: e */
        private char f9466e;

        static {
            for (int i = 0; i < 1792; i++) {
                f9461f[i] = Character.getDirectionality(i);
            }
        }

        C3299b(CharSequence charSequence, boolean z) {
            this.f9462a = charSequence;
            this.f9463b = z;
            this.f9464c = charSequence.length();
        }

        /* renamed from: a */
        private static byte m13492a(char c) {
            return c < 1792 ? f9461f[c] : Character.getDirectionality(c);
        }

        /* renamed from: e */
        private byte m13493e() {
            char charAt;
            int i = this.f9465d;
            do {
                int i2 = this.f9465d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f9462a;
                int i3 = i2 - 1;
                this.f9465d = i3;
                charAt = charSequence.charAt(i3);
                this.f9466e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f9465d = i;
            this.f9466e = ';';
            return 13;
        }

        /* renamed from: f */
        private byte m13494f() {
            char charAt;
            do {
                int i = this.f9465d;
                if (i >= this.f9464c) {
                    break;
                }
                CharSequence charSequence = this.f9462a;
                this.f9465d = i + 1;
                charAt = charSequence.charAt(i);
                this.f9466e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: g */
        private byte m13495g() {
            char charAt;
            int i = this.f9465d;
            while (true) {
                int i2 = this.f9465d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f9462a;
                int i3 = i2 - 1;
                this.f9465d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f9466e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    char c = this.f9466e;
                    do {
                        int i4 = this.f9465d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f9462a;
                        int i5 = i4 - 1;
                        this.f9465d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f9466e = charAt;
                    } while (charAt != c);
                }
            }
            this.f9465d = i;
            this.f9466e = '>';
            return 13;
        }

        /* renamed from: h */
        private byte m13496h() {
            char charAt;
            int i = this.f9465d;
            while (true) {
                int i2 = this.f9465d;
                if (i2 < this.f9464c) {
                    CharSequence charSequence = this.f9462a;
                    this.f9465d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f9466e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        char c = this.f9466e;
                        do {
                            int i3 = this.f9465d;
                            if (i3 >= this.f9464c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f9462a;
                            this.f9465d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f9466e = charAt;
                        } while (charAt != c);
                    }
                } else {
                    this.f9465d = i;
                    this.f9466e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public byte mo10660a() {
            char charAt = this.f9462a.charAt(this.f9465d - 1);
            this.f9466e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f9462a, this.f9465d);
                this.f9465d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f9465d--;
            byte a = m13492a(this.f9466e);
            if (this.f9463b) {
                char c = this.f9466e;
                if (c == '>') {
                    a = m13495g();
                } else if (c == ';') {
                    a = m13493e();
                }
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public byte mo10661b() {
            char charAt = this.f9462a.charAt(this.f9465d);
            this.f9466e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f9462a, this.f9465d);
                this.f9465d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f9465d++;
            byte a = m13492a(this.f9466e);
            if (this.f9463b) {
                char c = this.f9466e;
                if (c == '<') {
                    a = m13496h();
                } else if (c == '&') {
                    a = m13494f();
                }
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo10662c() {
            this.f9465d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f9465d < this.f9464c && i == 0) {
                byte b = mo10661b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f9465d > 0) {
                switch (mo10660a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo10663d() {
            /*
                r7 = this;
                int r0 = r7.f9464c
                r7.f9465d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f9465d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.mo10660a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f.p097h.p106k.C3297a.C3299b.mo10663d():int");
        }
    }

    C3297a(boolean z, int i, C3305e eVar) {
        this.f9455a = z;
        this.f9456b = i;
        this.f9457c = eVar;
    }

    /* renamed from: a */
    private String m13480a(CharSequence charSequence, C3305e eVar) {
        boolean a = eVar.mo10689a(charSequence, 0, charSequence.length());
        return (this.f9455a || (!a && m13485c(charSequence) != 1)) ? (!this.f9455a || (a && m13485c(charSequence) != -1)) ? "" : f9452f : f9451e;
    }

    /* renamed from: a */
    static boolean m13481a(Locale locale) {
        return C3313g.m13528b(locale) == 1;
    }

    /* renamed from: b */
    private static int m13482b(CharSequence charSequence) {
        return new C3299b(charSequence, false).mo10662c();
    }

    /* renamed from: b */
    public static C3297a m13483b() {
        return new C3298a().mo10659a();
    }

    /* renamed from: b */
    private String m13484b(CharSequence charSequence, C3305e eVar) {
        boolean a = eVar.mo10689a(charSequence, 0, charSequence.length());
        return (this.f9455a || (!a && m13482b(charSequence) != 1)) ? (!this.f9455a || (a && m13482b(charSequence) != -1)) ? "" : f9452f : f9451e;
    }

    /* renamed from: c */
    private static int m13485c(CharSequence charSequence) {
        return new C3299b(charSequence, false).mo10663d();
    }

    /* renamed from: a */
    public CharSequence mo10656a(CharSequence charSequence) {
        return mo10657a(charSequence, this.f9457c, true);
    }

    /* renamed from: a */
    public CharSequence mo10657a(CharSequence charSequence, C3305e eVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = eVar.mo10689a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo10658a() && z) {
            spannableStringBuilder.append(m13484b(charSequence, a ? C3306f.f9481b : C3306f.f9480a));
        }
        if (a != this.f9455a) {
            spannableStringBuilder.append(a ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m13480a(charSequence, a ? C3306f.f9481b : C3306f.f9480a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public boolean mo10658a() {
        return (this.f9456b & 2) != 0;
    }
}
