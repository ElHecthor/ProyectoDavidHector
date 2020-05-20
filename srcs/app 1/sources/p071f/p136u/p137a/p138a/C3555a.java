package p071f.p136u.p137a.p138a;

import java.nio.ByteBuffer;

/* renamed from: f.u.a.a.a */
public final class C3555a extends C3557c {
    /* renamed from: a */
    public int mo11253a() {
        int b = mo11268b(16);
        if (b != 0) {
            return mo11270d(b);
        }
        return 0;
    }

    /* renamed from: a */
    public C3555a mo11254a(int i, ByteBuffer byteBuffer) {
        mo11255b(i, byteBuffer);
        return this;
    }

    /* renamed from: b */
    public void mo11255b(int i, ByteBuffer byteBuffer) {
        this.f10029a = i;
        this.f10030b = byteBuffer;
    }

    /* renamed from: b */
    public boolean mo11256b() {
        int b = mo11268b(6);
        return (b == 0 || this.f10030b.get(b + this.f10029a) == 0) ? false : true;
    }

    /* renamed from: c */
    public short mo11257c() {
        int b = mo11268b(14);
        if (b != 0) {
            return this.f10030b.getShort(b + this.f10029a);
        }
        return 0;
    }

    /* renamed from: d */
    public int mo11258d() {
        int b = mo11268b(4);
        if (b != 0) {
            return this.f10030b.getInt(b + this.f10029a);
        }
        return 0;
    }

    /* renamed from: e */
    public int mo11259e(int i) {
        int b = mo11268b(16);
        if (b != 0) {
            return this.f10030b.getInt(mo11269c(b) + (i * 4));
        }
        return 0;
    }

    /* renamed from: e */
    public short mo11260e() {
        int b = mo11268b(8);
        if (b != 0) {
            return this.f10030b.getShort(b + this.f10029a);
        }
        return 0;
    }

    /* renamed from: f */
    public short mo11261f() {
        int b = mo11268b(12);
        if (b != 0) {
            return this.f10030b.getShort(b + this.f10029a);
        }
        return 0;
    }
}
