package p147g.p156d.p212c.p217k.p218b;

/* renamed from: g.d.c.k.b.m */
final class C4670m extends C4660c {
    C4670m() {
    }

    /* renamed from: a */
    public int mo13611a() {
        return 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo13612a(char c, StringBuilder sb) {
        int i;
        int i2;
        char c2;
        if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i2 = (c - '0') + 4;
            } else if (c < 'a' || c > 'z') {
                if (c < ' ') {
                    sb.append(0);
                } else {
                    char c3 = '!';
                    if (c >= '!' && c <= '/') {
                        sb.append(1);
                    } else if (c >= ':' && c <= '@') {
                        sb.append(1);
                        i = (c - ':') + 15;
                        c = (char) i;
                    } else if (c < '[' || c > '_') {
                        c3 = '`';
                        if (c == '`') {
                            sb.append(2);
                        } else if (c >= 'A' && c <= 'Z') {
                            sb.append(2);
                            i = (c - 'A') + 1;
                            c = (char) i;
                        } else if (c < '{' || c > 127) {
                            sb.append("\u0001\u001e");
                            return mo13612a((char) (c - 128), sb) + 2;
                        } else {
                            sb.append(2);
                            i = (c - '{') + 27;
                            c = (char) i;
                        }
                    } else {
                        sb.append(1);
                        i = (c - '[') + 22;
                        c = (char) i;
                    }
                    i = c - c3;
                    c = (char) i;
                }
                sb.append(c);
                return 2;
            } else {
                i2 = (c - 'a') + 14;
            }
            c2 = (char) i2;
        }
        sb.append(c2);
        return 1;
    }
}
