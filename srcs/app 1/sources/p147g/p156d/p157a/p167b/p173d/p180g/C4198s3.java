package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.s3 */
final class C4198s3 extends C4247v3 {

    /* renamed from: j */
    private final int f11286j;

    /* renamed from: k */
    private final int f11287k;

    C4198s3(byte[] bArr, int i, int i2) {
        super(bArr);
        C4092l3.m16741b(i, i + i2, bArr.length);
        this.f11286j = i;
        this.f11287k = i2;
    }

    /* renamed from: a */
    public final byte mo12607a(int i) {
        int a = mo12608a();
        if (((a - (i + 1)) | i) >= 0) {
            return this.f11357i[this.f11286j + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(a);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: a */
    public final int mo12608a() {
        return this.f11287k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final byte mo12613b(int i) {
        return this.f11357i[this.f11286j + i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo12777e() {
        return this.f11286j;
    }
}
