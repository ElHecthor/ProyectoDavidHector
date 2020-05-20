package p147g.p156d.p157a.p167b.p173d.p179f;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: g.d.a.b.d.f.i */
public final class C3896i {
    static {
        new C3895h();
    }

    /* renamed from: a */
    public static InputStream m15647a(InputStream inputStream, long j) {
        return new C3898k(inputStream, 1048577);
    }

    /* renamed from: a */
    public static byte[] m15648a(InputStream inputStream) {
        C3894g.m15646a(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 8192;
        int i2 = 0;
        while (i2 < 2147483639) {
            int min = Math.min(i, 2147483639 - i2);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return m15649a((Deque<byte[]>) arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            i = C3901m.m15654a(i, 2);
        }
        if (inputStream.read() == -1) {
            return m15649a((Deque<byte[]>) arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: a */
    private static byte[] m15649a(Deque<byte[]> deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) deque.removeFirst();
            int min = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
