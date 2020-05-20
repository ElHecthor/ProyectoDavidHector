package p147g.p156d.p157a.p167b.p173d.p180g;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: g.d.a.b.d.g.v4 */
public final class C4248v4 {

    /* renamed from: a */
    static final Charset f11358a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f11359b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f11359b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f11359b;
        C4278x3.m17532a(bArr2, 0, bArr2.length, false);
    }

    /* renamed from: a */
    static int m17301a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: a */
    public static int m17302a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m17303a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static <T> T m17304a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    static Object m17305a(Object obj, Object obj2) {
        return ((C3985e6) obj).mo12435k().mo12343a((C3985e6) obj2).mo12347m();
    }

    /* renamed from: a */
    static <T> T m17306a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static boolean m17307a(C3985e6 e6Var) {
        if (e6Var instanceof C3966d3) {
            C3966d3 d3Var = (C3966d3) e6Var;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m17308a(byte[] bArr) {
        return C4237u7.m17270a(bArr);
    }

    /* renamed from: b */
    public static String m17309b(byte[] bArr) {
        return new String(bArr, f11358a);
    }

    /* renamed from: c */
    public static int m17310c(byte[] bArr) {
        int length = bArr.length;
        int a = m17301a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
