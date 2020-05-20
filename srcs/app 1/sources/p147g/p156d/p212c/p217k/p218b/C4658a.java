package p147g.p156d.p212c.p217k.p218b;

/* renamed from: g.d.c.k.b.a */
final class C4658a implements C4664g {
    C4658a() {
    }

    /* renamed from: a */
    private static char m18781a(char c, char c2) {
        if (C4667j.m18841b(c) && C4667j.m18841b(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        StringBuilder sb = new StringBuilder("not digits: ");
        sb.append(c);
        sb.append(c2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public int mo13608a() {
        return 0;
    }

    /* renamed from: a */
    public void mo13609a(C4665h hVar) {
        if (C4667j.m18835a((CharSequence) hVar.mo13629d(), hVar.f12238f) >= 2) {
            hVar.mo13620a(m18781a(hVar.mo13629d().charAt(hVar.f12238f), hVar.mo13629d().charAt(hVar.f12238f + 1)));
            hVar.f12238f += 2;
            return;
        }
        char c = hVar.mo13627c();
        int a = C4667j.m18836a(hVar.mo13629d(), hVar.f12238f, mo13608a());
        if (a != mo13608a()) {
            if (a == 1) {
                hVar.mo13620a(230);
                hVar.mo13626b(1);
            } else if (a == 2) {
                hVar.mo13620a(239);
                hVar.mo13626b(2);
            } else if (a == 3) {
                hVar.mo13620a(238);
                hVar.mo13626b(3);
            } else if (a == 4) {
                hVar.mo13620a(240);
                hVar.mo13626b(4);
            } else if (a == 5) {
                hVar.mo13620a(231);
                hVar.mo13626b(5);
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(a)));
            }
        } else if (C4667j.m18842c(c)) {
            hVar.mo13620a(235);
            hVar.mo13620a((char) ((c - 128) + 1));
            hVar.f12238f++;
        } else {
            hVar.mo13620a((char) (c + 1));
            hVar.f12238f++;
        }
    }
}
