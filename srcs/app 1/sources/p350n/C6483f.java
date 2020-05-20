package p350n;

import java.nio.channels.WritableByteChannel;

/* renamed from: n.f */
public interface C6483f extends C6504w, WritableByteChannel {
    /* renamed from: a */
    C6483f mo16783a(long j);

    /* renamed from: a */
    C6483f mo16784a(String str);

    /* renamed from: a */
    C6483f mo16788a(C6485h hVar);

    void flush();

    C6480e getBuffer();

    /* renamed from: i */
    C6483f mo16806i(long j);

    C6483f write(byte[] bArr);

    C6483f write(byte[] bArr, int i, int i2);

    C6483f writeByte(int i);

    C6483f writeInt(int i);

    C6483f writeShort(int i);
}
