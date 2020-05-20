package p147g.p156d.p212c.p217k.p218b;

/* renamed from: g.d.c.k.b.f */
final class C4663f implements C4664g {
    C4663f() {
    }

    /* renamed from: a */
    private static String m18806a(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c = 0;
            char charAt2 = length >= 2 ? charSequence.charAt(i + 1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(i + 2) : 0;
            if (length >= 4) {
                c = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c;
            char c2 = (char) ((i2 >> 16) & 255);
            char c3 = (char) ((i2 >> 8) & 255);
            char c4 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append(c2);
            if (length >= 2) {
                sb.append(c3);
            }
            if (length >= 3) {
                sb.append(c4);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* renamed from: a */
    private static void m18807a(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            C4667j.m18840a(c);
            throw null;
        } else {
            sb.append((char) (c - '@'));
        }
    }

    /* renamed from: a */
    private static void m18808a(C4665h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z = true;
                if (length == 1) {
                    hVar.mo13636k();
                    int a = hVar.mo13632g().mo13637a() - hVar.mo13619a();
                    int f = hVar.mo13631f();
                    if (f > a) {
                        hVar.mo13628c(hVar.mo13619a() + 1);
                        a = hVar.mo13632g().mo13637a() - hVar.mo13619a();
                    }
                    if (f <= a && a <= 2) {
                        hVar.mo13626b(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String a2 = m18806a(charSequence, 0);
                    if (!(!hVar.mo13633h()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        hVar.mo13628c(hVar.mo13619a() + i);
                        if (hVar.mo13632g().mo13637a() - hVar.mo13619a() >= 3) {
                            hVar.mo13628c(hVar.mo13619a() + a2.length());
                            z = false;
                        }
                    }
                    if (z) {
                        hVar.mo13635j();
                        hVar.f12238f -= i;
                    } else {
                        hVar.mo13624a(a2);
                    }
                    hVar.mo13626b(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            hVar.mo13626b(0);
        }
    }

    /* renamed from: a */
    public int mo13618a() {
        return 4;
    }

    /* renamed from: a */
    public void mo13609a(C4665h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo13633h()) {
                break;
            }
            m18807a(hVar.mo13627c(), sb);
            hVar.f12238f++;
            if (sb.length() >= 4) {
                hVar.mo13624a(m18806a((CharSequence) sb, 0));
                sb.delete(0, 4);
                if (C4667j.m18836a(hVar.mo13629d(), hVar.f12238f, mo13618a()) != mo13618a()) {
                    hVar.mo13626b(0);
                    break;
                }
            }
        }
        sb.append(31);
        m18808a(hVar, (CharSequence) sb);
    }
}
