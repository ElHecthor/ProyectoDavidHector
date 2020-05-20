package p147g.p156d.p212c.p215j.p216d;

/* renamed from: g.d.c.j.d.b */
final class C4655b {

    /* renamed from: a */
    private final C4654a f12225a;

    /* renamed from: b */
    private final int[] f12226b;

    C4655b(C4654a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f12225a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f12226b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f12226b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f12226b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo13598a(int i) {
        int[] iArr = this.f12226b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4655b mo13599a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f12225a.mo13595b();
        } else {
            int length = this.f12226b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f12225a.mo13594b(this.f12226b[i3], i2);
            }
            return new C4655b(this.f12225a, iArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4655b mo13600a(C4655b bVar) {
        if (!this.f12225a.equals(bVar.f12225a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo13605c()) {
            return bVar;
        } else {
            if (bVar.mo13605c()) {
                return this;
            }
            int[] iArr = this.f12226b;
            int[] iArr2 = bVar.f12226b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = C4654a.m18760c(iArr2[i - length], iArr[i]);
            }
            return new C4655b(this.f12225a, iArr4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo13601a() {
        return this.f12226b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo13602b() {
        return this.f12226b.length - 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C4655b[] mo13603b(C4655b bVar) {
        if (!this.f12225a.equals(bVar.f12225a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.mo13605c()) {
            C4655b b = this.f12225a.mo13595b();
            int b2 = this.f12225a.mo13593b(bVar.mo13598a(bVar.mo13602b()));
            C4655b bVar2 = this;
            while (bVar2.mo13602b() >= bVar.mo13602b() && !bVar2.mo13605c()) {
                int b3 = bVar2.mo13602b() - bVar.mo13602b();
                int b4 = this.f12225a.mo13594b(bVar2.mo13598a(bVar2.mo13602b()), b2);
                C4655b a = bVar.mo13599a(b3, b4);
                b = b.mo13600a(this.f12225a.mo13592a(b3, b4));
                bVar2 = bVar2.mo13600a(a);
            }
            return new C4655b[]{b, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C4655b mo13604c(C4655b bVar) {
        if (!this.f12225a.equals(bVar.f12225a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo13605c() || bVar.mo13605c()) {
            return this.f12225a.mo13595b();
        } else {
            int[] iArr = this.f12226b;
            int length = iArr.length;
            int[] iArr2 = bVar.f12226b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C4654a.m18760c(iArr3[i4], this.f12225a.mo13594b(i2, iArr2[i3]));
                }
            }
            return new C4655b(this.f12225a, iArr3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo13605c() {
        return this.f12226b[0] == 0;
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder(mo13602b() * 8);
        for (int b = mo13602b(); b >= 0; b--) {
            int a = mo13598a(b);
            if (a != 0) {
                if (a < 0) {
                    sb.append(" - ");
                    a = -a;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || a != 1) {
                    int c2 = this.f12225a.mo13596c(a);
                    if (c2 == 0) {
                        c = '1';
                    } else if (c2 == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(c2);
                    }
                    sb.append(c);
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
                    }
                }
            }
        }
        return sb.toString();
    }
}
