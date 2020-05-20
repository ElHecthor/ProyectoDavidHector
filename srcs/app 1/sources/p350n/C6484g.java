package p350n;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: n.g */
public interface C6484g extends C6506y, ReadableByteChannel {
    /* renamed from: a */
    int mo16777a(C6494p pVar);

    /* renamed from: a */
    long mo16779a(C6504w wVar);

    /* renamed from: a */
    String mo16782a(Charset charset);

    /* renamed from: b */
    C6485h mo16790b(long j);

    /* renamed from: c */
    boolean mo16794c(long j);

    /* renamed from: e */
    String mo16798e();

    /* renamed from: e */
    byte[] mo16799e(long j);

    /* renamed from: f */
    String mo16801f(long j);

    C6480e getBuffer();

    /* renamed from: h */
    void mo16804h(long j);

    /* renamed from: j */
    boolean mo16809j();

    /* renamed from: n */
    long mo16811n();

    /* renamed from: r */
    InputStream mo16815r();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);
}
