package p147g.p156d.p212c.p220m.p221b;

/* renamed from: g.d.c.m.b.b */
final class C4694b {

    /* renamed from: a */
    private final byte[] f12288a;

    /* renamed from: b */
    private int f12289b = 0;

    C4694b(int i) {
        this.f12288a = new byte[i];
    }

    /* renamed from: a */
    private void m18907a(int i, boolean z) {
        this.f12288a[i] = z ? (byte) 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13650a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f12289b;
            this.f12289b = i3 + 1;
            m18907a(i3, z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte[] mo13651a(int i) {
        int length = this.f12288a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f12288a[i2 / i];
        }
        return bArr;
    }
}
