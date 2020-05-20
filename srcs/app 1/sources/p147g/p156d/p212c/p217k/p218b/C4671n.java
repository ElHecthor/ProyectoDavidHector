package p147g.p156d.p212c.p217k.p218b;

/* renamed from: g.d.c.k.b.n */
final class C4671n extends C4660c {
    C4671n() {
    }

    /* renamed from: a */
    public int mo13611a() {
        return 3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo13612a(char c, StringBuilder sb) {
        char c2;
        int i;
        if (c == 13) {
            c2 = 0;
        } else if (c == ' ') {
            c2 = 3;
        } else if (c == '*') {
            sb.append(1);
            return 1;
        } else if (c != '>') {
            if (c >= '0' && c <= '9') {
                i = (c - '0') + 4;
            } else if (c < 'A' || c > 'Z') {
                C4667j.m18840a(c);
                throw null;
            } else {
                i = (c - 'A') + 14;
            }
            c2 = (char) i;
        } else {
            c2 = 2;
        }
        sb.append(c2);
        return 1;
    }

    /* renamed from: a */
    public void mo13609a(C4665h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo13633h()) {
                break;
            }
            char c = hVar.mo13627c();
            hVar.f12238f++;
            mo13612a(c, sb);
            if (sb.length() % 3 == 0) {
                C4660c.m18789b(hVar, sb);
                if (C4667j.m18836a(hVar.mo13629d(), hVar.f12238f, mo13611a()) != mo13611a()) {
                    hVar.mo13626b(0);
                    break;
                }
            }
        }
        mo13613a(hVar, sb);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13613a(C4665h hVar, StringBuilder sb) {
        hVar.mo13636k();
        int a = hVar.mo13632g().mo13637a() - hVar.mo13619a();
        hVar.f12238f -= sb.length();
        if (hVar.mo13631f() > 1 || a > 1 || hVar.mo13631f() != a) {
            hVar.mo13620a(254);
        }
        if (hVar.mo13630e() < 0) {
            hVar.mo13626b(0);
        }
    }
}
