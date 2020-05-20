package p071f.p136u.p137a.p138a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: f.u.a.a.b */
public final class C3556b extends C3557c {
    /* renamed from: a */
    public static C3556b m14522a(ByteBuffer byteBuffer) {
        C3556b bVar = new C3556b();
        m14523a(byteBuffer, bVar);
        return bVar;
    }

    /* renamed from: a */
    public static C3556b m14523a(ByteBuffer byteBuffer, C3556b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        bVar.mo11264a(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return bVar;
    }

    /* renamed from: a */
    public int mo11262a() {
        int b = mo11268b(6);
        if (b != 0) {
            return mo11270d(b);
        }
        return 0;
    }

    /* renamed from: a */
    public C3555a mo11263a(C3555a aVar, int i) {
        int b = mo11268b(6);
        if (b == 0) {
            return null;
        }
        aVar.mo11254a(mo11267a(mo11269c(b) + (i * 4)), this.f10030b);
        return aVar;
    }

    /* renamed from: a */
    public C3556b mo11264a(int i, ByteBuffer byteBuffer) {
        mo11266b(i, byteBuffer);
        return this;
    }

    /* renamed from: b */
    public int mo11265b() {
        int b = mo11268b(4);
        if (b != 0) {
            return this.f10030b.getInt(b + this.f10029a);
        }
        return 0;
    }

    /* renamed from: b */
    public void mo11266b(int i, ByteBuffer byteBuffer) {
        this.f10029a = i;
        this.f10030b = byteBuffer;
    }
}
