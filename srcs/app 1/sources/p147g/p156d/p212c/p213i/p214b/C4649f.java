package p147g.p156d.p212c.p213i.p214b;

import java.util.LinkedList;
import p147g.p156d.p212c.p215j.C4651a;

/* renamed from: g.d.c.i.b.f */
final class C4649f {

    /* renamed from: e */
    static final C4649f f12168e = new C4649f(C4650g.f12173b, 0, 0, 0);

    /* renamed from: a */
    private final int f12169a;

    /* renamed from: b */
    private final C4650g f12170b;

    /* renamed from: c */
    private final int f12171c;

    /* renamed from: d */
    private final int f12172d;

    private C4649f(C4650g gVar, int i, int i2, int i3) {
        this.f12170b = gVar;
        this.f12169a = i;
        this.f12171c = i2;
        this.f12172d = i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo13553a() {
        return this.f12171c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4649f mo13554a(int i) {
        C4650g gVar = this.f12170b;
        int i2 = this.f12169a;
        int i3 = this.f12172d;
        if (i2 == 4 || i2 == 2) {
            int i4 = C4646d.f12162c[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            gVar = gVar.mo13564a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.f12171c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        C4649f fVar = new C4649f(gVar, i2, this.f12171c + 1, i3 + i8);
        return fVar.f12171c == 2078 ? fVar.mo13559b(i + 1) : fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4649f mo13555a(int i, int i2) {
        int i3 = this.f12172d;
        C4650g gVar = this.f12170b;
        int i4 = this.f12169a;
        if (i != i4) {
            int i5 = C4646d.f12162c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            gVar = gVar.mo13564a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new C4649f(gVar.mo13564a(i2, i8), i, 0, i3 + i8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4651a mo13556a(byte[] bArr) {
        LinkedList<C4650g> linkedList = new LinkedList<>();
        for (C4650g gVar = mo13559b(bArr.length).f12170b; gVar != null; gVar = gVar.mo13563a()) {
            linkedList.addFirst(gVar);
        }
        C4651a aVar = new C4651a();
        for (C4650g a : linkedList) {
            a.mo13547a(aVar, bArr);
        }
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo13557a(C4649f fVar) {
        int i = this.f12172d + (C4646d.f12162c[this.f12169a][fVar.f12169a] >> 16);
        int i2 = fVar.f12171c;
        if (i2 > 0) {
            int i3 = this.f12171c;
            if (i3 == 0 || i3 > i2) {
                i += 10;
            }
        }
        return i <= fVar.f12172d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo13558b() {
        return this.f12172d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C4649f mo13559b(int i) {
        int i2 = this.f12171c;
        return i2 == 0 ? this : new C4649f(this.f12170b.mo13565b(i - i2, i2), this.f12169a, 0, this.f12172d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C4649f mo13560b(int i, int i2) {
        C4650g gVar = this.f12170b;
        int i3 = this.f12169a == 2 ? 4 : 5;
        return new C4649f(gVar.mo13564a(C4646d.f12164e[this.f12169a][i], i3).mo13564a(i2, 5), this.f12169a, 0, this.f12172d + i3 + 5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo13561c() {
        return this.f12169a;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{C4646d.f12161b[this.f12169a], Integer.valueOf(this.f12172d), Integer.valueOf(this.f12171c)});
    }
}
