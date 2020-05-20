package p147g.p156d.p212c.p217k.p218b;

/* renamed from: g.d.c.k.b.b */
final class C4659b implements C4664g {
    C4659b() {
    }

    /* renamed from: a */
    private static char m18784a(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    /* renamed from: a */
    public int mo13610a() {
        return 5;
    }

    /* renamed from: a */
    public void mo13609a(C4665h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!hVar.mo13633h()) {
                break;
            }
            sb.append(hVar.mo13627c());
            hVar.f12238f++;
            if (C4667j.m18836a(hVar.mo13629d(), hVar.f12238f, mo13610a()) != mo13610a()) {
                hVar.mo13626b(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a = hVar.mo13619a() + length + 1;
        hVar.mo13628c(a);
        boolean z = hVar.mo13632g().mo13637a() - a > 0;
        if (hVar.mo13633h() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            hVar.mo13620a(m18784a(sb.charAt(i), hVar.mo13619a() + 1));
        }
    }
}
