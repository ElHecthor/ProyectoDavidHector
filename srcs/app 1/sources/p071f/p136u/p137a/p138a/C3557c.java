package p071f.p136u.p137a.p138a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* renamed from: f.u.a.a.c */
public class C3557c {

    /* renamed from: a */
    protected int f10029a;

    /* renamed from: b */
    protected ByteBuffer f10030b;

    /* renamed from: f.u.a.a.c$a */
    static class C3558a extends ThreadLocal<CharsetDecoder> {
        C3558a() {
        }

        /* access modifiers changed from: protected */
        public CharsetDecoder initialValue() {
            return Charset.forName("UTF-8").newDecoder();
        }
    }

    /* renamed from: f.u.a.a.c$b */
    static class C3559b extends ThreadLocal<Charset> {
        C3559b() {
        }

        /* access modifiers changed from: protected */
        public Charset initialValue() {
            return Charset.forName("UTF-8");
        }
    }

    static {
        new C3558a();
        new C3559b();
        new ThreadLocal();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo11267a(int i) {
        return i + this.f10030b.getInt(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo11268b(int i) {
        int i2 = this.f10029a;
        int i3 = i2 - this.f10030b.getInt(i2);
        if (i < this.f10030b.getShort(i3)) {
            return this.f10030b.getShort(i3 + i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo11269c(int i) {
        int i2 = i + this.f10029a;
        return i2 + this.f10030b.getInt(i2) + 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo11270d(int i) {
        int i2 = i + this.f10029a;
        return this.f10030b.getInt(i2 + this.f10030b.getInt(i2));
    }
}
