package p350n;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p308k.C5809q;
import p308k.p313e0.C5769d;
import p308k.p323z.p325d.C5942k;
import p350n.p351a0.C6470a;

/* renamed from: n.e */
public final class C6480e implements C6484g, C6483f, Cloneable, ByteChannel {

    /* renamed from: f */
    public C6500t f16093f;

    /* renamed from: g */
    private long f16094g;

    /* renamed from: n.e$a */
    public static final class C6481a extends InputStream {

        /* renamed from: f */
        final /* synthetic */ C6480e f16095f;

        C6481a(C6480e eVar) {
            this.f16095f = eVar;
        }

        public int available() {
            return (int) Math.min(this.f16095f.mo16834x(), (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (this.f16095f.mo16834x() > 0) {
                return this.f16095f.readByte() & 255;
            }
            return -1;
        }

        public int read(byte[] bArr, int i, int i2) {
            C5942k.m22327b(bArr, "sink");
            return this.f16095f.read(bArr, i, i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16095f);
            sb.append(".inputStream()");
            return sb.toString();
        }
    }

    /* renamed from: n.e$b */
    public static final class C6482b extends OutputStream {

        /* renamed from: f */
        final /* synthetic */ C6480e f16096f;

        C6482b(C6480e eVar) {
            this.f16096f = eVar;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16096f);
            sb.append(".outputStream()");
            return sb.toString();
        }

        public void write(int i) {
            this.f16096f.writeByte(i);
        }

        public void write(byte[] bArr, int i, int i2) {
            C5942k.m22327b(bArr, "data");
            this.f16096f.write(bArr, i, i2);
        }
    }

    /* renamed from: a */
    public int mo16777a(C6494p pVar) {
        C5942k.m22327b(pVar, "options");
        int a = C6470a.m24458a(this, pVar, false, 2, null);
        if (a == -1) {
            return -1;
        }
        skip((long) pVar.mo16894d()[a].mo16868p());
        return a;
    }

    /* renamed from: a */
    public long mo16778a(byte b, long j, long j2) {
        long j3;
        int i;
        byte b2 = b;
        long j4 = j;
        long j5 = j2;
        long j6 = 0;
        if (0 <= j4 && j5 >= j4) {
            if (j5 > mo16834x()) {
                j5 = mo16834x();
            }
            if (j4 == j5) {
                return -1;
            }
            C6500t tVar = this.f16093f;
            if (tVar != null) {
                if (mo16834x() - j4 < j4) {
                    j3 = mo16834x();
                    while (j3 > j4) {
                        tVar = tVar.f16134g;
                        if (tVar != null) {
                            j3 -= (long) (tVar.f16130c - tVar.f16129b);
                        } else {
                            C5942k.m22323a();
                            throw null;
                        }
                    }
                    if (tVar != null) {
                        while (j3 < j5) {
                            byte[] bArr = tVar.f16128a;
                            int min = (int) Math.min((long) tVar.f16130c, (((long) tVar.f16129b) + j5) - j3);
                            i = (int) ((((long) tVar.f16129b) + j4) - j3);
                            while (i < min) {
                                if (bArr[i] != b2) {
                                    i++;
                                }
                            }
                            j3 += (long) (tVar.f16130c - tVar.f16129b);
                            tVar = tVar.f16133f;
                            if (tVar != null) {
                                j4 = j3;
                            } else {
                                C5942k.m22323a();
                                throw null;
                            }
                        }
                    }
                } else {
                    while (true) {
                        long j7 = ((long) (tVar.f16130c - tVar.f16129b)) + j6;
                        if (j7 <= j4) {
                            tVar = tVar.f16133f;
                            if (tVar != null) {
                                j6 = j7;
                            } else {
                                C5942k.m22323a();
                                throw null;
                            }
                        } else if (tVar != null) {
                            while (j3 < j5) {
                                byte[] bArr2 = tVar.f16128a;
                                int min2 = (int) Math.min((long) tVar.f16130c, (((long) tVar.f16129b) + j5) - j3);
                                int i2 = (int) ((((long) tVar.f16129b) + j4) - j3);
                                while (i < min2) {
                                    if (bArr2[i] != b2) {
                                        i2 = i + 1;
                                    }
                                }
                                j6 = j3 + ((long) (tVar.f16130c - tVar.f16129b));
                                tVar = tVar.f16133f;
                                if (tVar != null) {
                                    j4 = j6;
                                } else {
                                    C5942k.m22323a();
                                    throw null;
                                }
                            }
                        }
                    }
                }
                return ((long) (i - tVar.f16129b)) + j3;
            }
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size=");
        sb.append(mo16834x());
        sb.append(" fromIndex=");
        sb.append(j4);
        sb.append(" toIndex=");
        sb.append(j5);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public long mo16779a(C6504w wVar) {
        C5942k.m22327b(wVar, "sink");
        long x = mo16834x();
        if (x > 0) {
            wVar.mo16159a(this, x);
        }
        return x;
    }

    /* renamed from: a */
    public long mo16780a(C6506y yVar) {
        C5942k.m22327b(yVar, "source");
        long j = 0;
        while (true) {
            long b = yVar.mo16163b(this, (long) 8192);
            if (b == -1) {
                return j;
            }
            j += b;
        }
    }

    /* renamed from: a */
    public String mo16781a(long j, Charset charset) {
        C5942k.m22327b(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (this.f16094g < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C6500t tVar = this.f16093f;
            if (tVar != null) {
                int i2 = tVar.f16129b;
                if (((long) i2) + j > ((long) tVar.f16130c)) {
                    return new String(mo16799e(j), charset);
                }
                int i3 = (int) j;
                String str = new String(tVar.f16128a, i2, i3, charset);
                int i4 = tVar.f16129b + i3;
                tVar.f16129b = i4;
                this.f16094g -= j;
                if (i4 == tVar.f16130c) {
                    this.f16093f = tVar.mo16918b();
                    C6502u.f16137c.mo16921a(tVar);
                }
                return str;
            }
            C5942k.m22323a();
            throw null;
        }
    }

    /* renamed from: a */
    public String mo16782a(Charset charset) {
        C5942k.m22327b(charset, "charset");
        return mo16781a(this.f16094g, charset);
    }

    /* renamed from: a */
    public C6480e mo16783a(long j) {
        if (j == 0) {
            writeByte(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            C6500t b = mo16791b(i);
            byte[] bArr = b.f16128a;
            int i2 = b.f16130c;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                bArr[i3] = C6470a.m24460a()[(int) (15 & j)];
                j >>>= 4;
            }
            b.f16130c += i;
            mo16808j(mo16834x() + ((long) i));
        }
        return this;
    }

    /* renamed from: a */
    public C6480e mo16784a(String str) {
        C5942k.m22327b(str, "string");
        mo16785a(str, 0, str.length());
        return this;
    }

    /* renamed from: a */
    public C6480e mo16785a(String str, int i, int i2) {
        long x;
        long j;
        C5942k.m22327b(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            C6500t b = mo16791b(1);
                            byte[] bArr = b.f16128a;
                            int i3 = b.f16130c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = str.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                int i5 = i4 + 1;
                                bArr[i4 + i3] = (byte) charAt2;
                                i4 = i5;
                            }
                            int i6 = i3 + i4;
                            int i7 = b.f16130c;
                            int i8 = i6 - i7;
                            b.f16130c = i7 + i8;
                            mo16808j(mo16834x() + ((long) i8));
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                C6500t b2 = mo16791b(2);
                                byte[] bArr2 = b2.f16128a;
                                int i9 = b2.f16130c;
                                bArr2[i9] = (byte) ((charAt >> 6) | 192);
                                bArr2[i9 + 1] = (byte) ((charAt & '?') | 128);
                                b2.f16130c = i9 + 2;
                                x = mo16834x();
                                j = 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                C6500t b3 = mo16791b(3);
                                byte[] bArr3 = b3.f16128a;
                                int i10 = b3.f16130c;
                                bArr3[i10] = (byte) ((charAt >> 12) | 224);
                                bArr3[i10 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i10 + 2] = (byte) ((charAt & '?') | 128);
                                b3.f16130c = i10 + 3;
                                x = mo16834x();
                                j = 3;
                            } else {
                                int i11 = i + 1;
                                char charAt3 = i11 < i2 ? str.charAt(i11) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    writeByte(63);
                                    i = i11;
                                } else {
                                    int i12 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    C6500t b4 = mo16791b(4);
                                    byte[] bArr4 = b4.f16128a;
                                    int i13 = b4.f16130c;
                                    bArr4[i13] = (byte) ((i12 >> 18) | 240);
                                    bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                                    bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                                    bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                                    b4.f16130c = i13 + 4;
                                    mo16808j(mo16834x() + 4);
                                    i += 2;
                                }
                            }
                            mo16808j(x + j);
                            i++;
                        }
                    }
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("endIndex > string.length: ");
                sb.append(i2);
                sb.append(" > ");
                sb.append(str.length());
                throw new IllegalArgumentException(sb.toString().toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("beginIndex < 0: ");
        sb3.append(i);
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    /* renamed from: a */
    public C6480e mo16786a(String str, int i, int i2, Charset charset) {
        C5942k.m22327b(str, "string");
        C5942k.m22327b(charset, "charset");
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("endIndex > string.length: ");
                    sb.append(i2);
                    sb.append(" > ");
                    sb.append(str.length());
                    throw new IllegalArgumentException(sb.toString().toString());
                } else if (C5942k.m22326a((Object) charset, (Object) C5769d.f14834a)) {
                    mo16785a(str, i, i2);
                    return this;
                } else {
                    String substring = str.substring(i, i2);
                    C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        byte[] bytes = substring.getBytes(charset);
                        C5942k.m22324a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                        write(bytes, 0, bytes.length);
                        return this;
                    }
                    throw new C5809q("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("endIndex < beginIndex: ");
                sb2.append(i2);
                sb2.append(" < ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("beginIndex < 0: ");
            sb3.append(i);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
    }

    /* renamed from: a */
    public final C6480e mo16787a(C6480e eVar, long j, long j2) {
        C5942k.m22327b(eVar, "out");
        C6474c.m24474a(mo16834x(), j, j2);
        if (j2 != 0) {
            eVar.mo16808j(eVar.mo16834x() + j2);
            C6500t tVar = this.f16093f;
            while (tVar != null) {
                int i = tVar.f16130c;
                int i2 = tVar.f16129b;
                if (j >= ((long) (i - i2))) {
                    j -= (long) (i - i2);
                    tVar = tVar.f16133f;
                } else {
                    while (j2 > 0) {
                        if (tVar != null) {
                            C6500t c = tVar.mo16919c();
                            int i3 = c.f16129b + ((int) j);
                            c.f16129b = i3;
                            c.f16130c = Math.min(i3 + ((int) j2), c.f16130c);
                            C6500t tVar2 = eVar.f16093f;
                            if (tVar2 == null) {
                                c.f16134g = c;
                                c.f16133f = c;
                                eVar.f16093f = c;
                            } else if (tVar2 != null) {
                                C6500t tVar3 = tVar2.f16134g;
                                if (tVar3 != null) {
                                    tVar3.mo16915a(c);
                                } else {
                                    C5942k.m22323a();
                                    throw null;
                                }
                            } else {
                                C5942k.m22323a();
                                throw null;
                            }
                            j2 -= (long) (c.f16130c - c.f16129b);
                            tVar = tVar.f16133f;
                            j = 0;
                        } else {
                            C5942k.m22323a();
                            throw null;
                        }
                    }
                }
            }
            C5942k.m22323a();
            throw null;
        }
        return this;
    }

    /* renamed from: a */
    public C6480e mo16788a(C6485h hVar) {
        C5942k.m22327b(hVar, "byteString");
        hVar.mo16849a(this, 0, hVar.mo16868p());
        return this;
    }

    /* renamed from: a */
    public final C6485h mo16789a(int i) {
        if (i == 0) {
            return C6485h.f16097i;
        }
        C6474c.m24474a(mo16834x(), 0, (long) i);
        C6500t tVar = this.f16093f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (tVar != null) {
                int i5 = tVar.f16130c;
                int i6 = tVar.f16129b;
                if (i5 != i6) {
                    i3 += i5 - i6;
                    i4++;
                    tVar = tVar.f16133f;
                } else {
                    throw new AssertionError("s.limit == s.pos");
                }
            } else {
                C5942k.m22323a();
                throw null;
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        C6500t tVar2 = this.f16093f;
        int i7 = 0;
        while (i2 < i) {
            if (tVar2 != null) {
                bArr[i7] = tVar2.f16128a;
                i2 += tVar2.f16130c - tVar2.f16129b;
                iArr[i7] = Math.min(i2, i);
                iArr[i7 + i4] = tVar2.f16129b;
                tVar2.f16131d = true;
                i7++;
                tVar2 = tVar2.f16133f;
            } else {
                C5942k.m22323a();
                throw null;
            }
        }
        return new C6503v(bArr, iArr);
    }

    /* renamed from: a */
    public void mo16159a(C6480e eVar, long j) {
        C6500t tVar;
        C5942k.m22327b(eVar, "source");
        if (eVar != this) {
            C6474c.m24474a(eVar.mo16834x(), 0, j);
            while (j > 0) {
                C6500t tVar2 = eVar.f16093f;
                if (tVar2 != null) {
                    int i = tVar2.f16130c;
                    if (tVar2 != null) {
                        if (j < ((long) (i - tVar2.f16129b))) {
                            C6500t tVar3 = this.f16093f;
                            if (tVar3 == null) {
                                tVar = null;
                            } else if (tVar3 != null) {
                                tVar = tVar3.f16134g;
                            } else {
                                C5942k.m22323a();
                                throw null;
                            }
                            if (tVar != null && tVar.f16132e) {
                                if ((((long) tVar.f16130c) + j) - ((long) (tVar.f16131d ? 0 : tVar.f16129b)) <= ((long) 8192)) {
                                    C6500t tVar4 = eVar.f16093f;
                                    if (tVar4 != null) {
                                        tVar4.mo16917a(tVar, (int) j);
                                        eVar.mo16808j(eVar.mo16834x() - j);
                                        mo16808j(mo16834x() + j);
                                        return;
                                    }
                                    C5942k.m22323a();
                                    throw null;
                                }
                            }
                            C6500t tVar5 = eVar.f16093f;
                            if (tVar5 != null) {
                                eVar.f16093f = tVar5.mo16914a((int) j);
                            } else {
                                C5942k.m22323a();
                                throw null;
                            }
                        }
                        C6500t tVar6 = eVar.f16093f;
                        if (tVar6 != null) {
                            long j2 = (long) (tVar6.f16130c - tVar6.f16129b);
                            eVar.f16093f = tVar6.mo16918b();
                            C6500t tVar7 = this.f16093f;
                            if (tVar7 == null) {
                                this.f16093f = tVar6;
                                tVar6.f16134g = tVar6;
                                tVar6.f16133f = tVar6;
                            } else if (tVar7 != null) {
                                C6500t tVar8 = tVar7.f16134g;
                                if (tVar8 != null) {
                                    tVar8.mo16915a(tVar6);
                                    tVar6.mo16916a();
                                } else {
                                    C5942k.m22323a();
                                    throw null;
                                }
                            } else {
                                C5942k.m22323a();
                                throw null;
                            }
                            eVar.mo16808j(eVar.mo16834x() - j2);
                            mo16808j(mo16834x() + j2);
                            j -= j2;
                        } else {
                            C5942k.m22323a();
                            throw null;
                        }
                    } else {
                        C5942k.m22323a();
                        throw null;
                    }
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: b */
    public long mo16163b(C6480e eVar, long j) {
        C5942k.m22327b(eVar, "sink");
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (mo16834x() == 0) {
            return -1;
        } else {
            if (j > mo16834x()) {
                j = mo16834x();
            }
            eVar.mo16159a(this, j);
            return j;
        }
    }

    /* renamed from: b */
    public C6485h mo16790b(long j) {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (mo16834x() < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new C6485h(mo16799e(j));
        } else {
            C6485h a = mo16789a((int) j);
            skip(j);
            return a;
        }
    }

    /* renamed from: b */
    public final C6500t mo16791b(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C6500t tVar = this.f16093f;
            if (tVar == null) {
                C6500t a = C6502u.f16137c.mo16920a();
                this.f16093f = a;
                a.f16134g = a;
                a.f16133f = a;
                return a;
            } else if (tVar != null) {
                C6500t tVar2 = tVar.f16134g;
                if (tVar2 == null) {
                    C5942k.m22323a();
                    throw null;
                } else if (tVar2.f16130c + i <= 8192 && tVar2.f16132e) {
                    return tVar2;
                } else {
                    C6500t a2 = C6502u.f16137c.mo16920a();
                    tVar2.mo16915a(a2);
                    return a2;
                }
            } else {
                C5942k.m22323a();
                throw null;
            }
        } else {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
    }

    /* renamed from: b */
    public C6507z mo16270b() {
        return C6507z.f16142d;
    }

    /* renamed from: b */
    public void mo16792b(byte[] bArr) {
        C5942k.m22327b(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: c */
    public C6480e mo16793c(int i) {
        long x;
        long j;
        if (i < 128) {
            writeByte(i);
        } else {
            if (i < 2048) {
                C6500t b = mo16791b(2);
                byte[] bArr = b.f16128a;
                int i2 = b.f16130c;
                bArr[i2] = (byte) ((i >> 6) | 192);
                bArr[i2 + 1] = (byte) ((i & 63) | 128);
                b.f16130c = i2 + 2;
                x = mo16834x();
                j = 2;
            } else if (55296 <= i && 57343 >= i) {
                writeByte(63);
            } else if (i < 65536) {
                C6500t b2 = mo16791b(3);
                byte[] bArr2 = b2.f16128a;
                int i3 = b2.f16130c;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                b2.f16130c = i3 + 3;
                x = mo16834x();
                j = 3;
            } else if (i <= 1114111) {
                C6500t b3 = mo16791b(4);
                byte[] bArr3 = b3.f16128a;
                int i4 = b3.f16130c;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                b3.f16130c = i4 + 4;
                x = mo16834x();
                j = 4;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected code point: 0x");
                sb.append(C6474c.m24476b(i));
                throw new IllegalArgumentException(sb.toString());
            }
            mo16808j(x + j);
        }
        return this;
    }

    /* renamed from: c */
    public boolean mo16794c(long j) {
        return this.f16094g >= j;
    }

    public C6480e clone() {
        return mo16812o();
    }

    public void close() {
    }

    /* renamed from: d */
    public final byte mo16796d(long j) {
        C6474c.m24474a(mo16834x(), j, 1);
        C6500t tVar = this.f16093f;
        if (tVar == null) {
            C5942k.m22323a();
            throw null;
        } else if (mo16834x() - j < j) {
            long x = mo16834x();
            while (x > j) {
                tVar = tVar.f16134g;
                if (tVar != null) {
                    x -= (long) (tVar.f16130c - tVar.f16129b);
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            }
            if (tVar != null) {
                return tVar.f16128a[(int) ((((long) tVar.f16129b) + j) - x)];
            }
            C5942k.m22323a();
            throw null;
        } else {
            long j2 = 0;
            while (true) {
                int i = tVar.f16130c;
                int i2 = tVar.f16129b;
                long j3 = ((long) (i - i2)) + j2;
                if (j3 <= j) {
                    tVar = tVar.f16133f;
                    if (tVar != null) {
                        j2 = j3;
                    } else {
                        C5942k.m22323a();
                        throw null;
                    }
                } else if (tVar != null) {
                    return tVar.f16128a[(int) ((((long) i2) + j) - j2)];
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo16797d() {
        skip(mo16834x());
    }

    /* renamed from: e */
    public String mo16798e() {
        return mo16801f(Long.MAX_VALUE);
    }

    /* renamed from: e */
    public byte[] mo16799e(long j) {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (mo16834x() >= j) {
            byte[] bArr = new byte[((int) j)];
            mo16792b(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (this != obj2) {
            if (obj2 instanceof C6480e) {
                C6480e eVar = (C6480e) obj2;
                if (mo16834x() == eVar.mo16834x()) {
                    if (mo16834x() != 0) {
                        C6500t tVar = this.f16093f;
                        if (tVar != null) {
                            C6500t tVar2 = eVar.f16093f;
                            if (tVar2 != null) {
                                int i = tVar.f16129b;
                                int i2 = tVar2.f16129b;
                                long j = 0;
                                while (j < mo16834x()) {
                                    long min = (long) Math.min(tVar.f16130c - i, tVar2.f16130c - i2);
                                    long j2 = 0;
                                    while (j2 < min) {
                                        int i3 = i + 1;
                                        int i4 = i2 + 1;
                                        if (tVar.f16128a[i] == tVar2.f16128a[i2]) {
                                            j2++;
                                            i = i3;
                                            i2 = i4;
                                        }
                                    }
                                    if (i == tVar.f16130c) {
                                        C6500t tVar3 = tVar.f16133f;
                                        if (tVar3 != null) {
                                            i = tVar3.f16129b;
                                            tVar = tVar3;
                                        } else {
                                            C5942k.m22323a();
                                            throw null;
                                        }
                                    }
                                    if (i2 == tVar2.f16130c) {
                                        tVar2 = tVar2.f16133f;
                                        if (tVar2 != null) {
                                            i2 = tVar2.f16129b;
                                        } else {
                                            C5942k.m22323a();
                                            throw null;
                                        }
                                    }
                                    j += min;
                                }
                            } else {
                                C5942k.m22323a();
                                throw null;
                            }
                        } else {
                            C5942k.m22323a();
                            throw null;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo16801f(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long a = mo16778a(b, 0, j2);
            if (a != -1) {
                return C6470a.m24459a(this, a);
            }
            if (j2 < mo16834x() && mo16796d(j2 - 1) == ((byte) 13) && mo16796d(j2) == b) {
                return C6470a.m24459a(this, j2);
            }
            C6480e eVar = new C6480e();
            mo16787a(eVar, 0, Math.min((long) 32, mo16834x()));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(mo16834x(), j));
            sb.append(" content=");
            sb.append(eVar.mo16821s().mo16864l());
            sb.append(8230);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public void flush() {
    }

    /* renamed from: g */
    public String mo16802g(long j) {
        return mo16781a(j, C5769d.f14834a);
    }

    public C6480e getBuffer() {
        return this;
    }

    /* renamed from: h */
    public void mo16804h(long j) {
        if (this.f16094g < j) {
            throw new EOFException();
        }
    }

    public int hashCode() {
        C6500t tVar = this.f16093f;
        if (tVar == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = tVar.f16129b; i2 < tVar.f16130c; i2++) {
                i = (i * 31) + tVar.f16128a[i2];
            }
            tVar = tVar.f16133f;
            if (tVar == null) {
                C5942k.m22323a();
                throw null;
            }
        } while (tVar != this.f16093f);
        return i;
    }

    /* renamed from: i */
    public C6480e mo16806i(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            writeByte(48);
        } else {
            boolean z = false;
            int i2 = 1;
            if (i < 0) {
                j = -j;
                if (j < 0) {
                    mo16784a("-9223372036854775808");
                } else {
                    z = true;
                }
            }
            if (j >= 100000000) {
                i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
            } else if (j >= 10000) {
                i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
            } else if (j >= 100) {
                i2 = j < 1000 ? 3 : 4;
            } else if (j >= 10) {
                i2 = 2;
            }
            if (z) {
                i2++;
            }
            C6500t b = mo16791b(i2);
            byte[] bArr = b.f16128a;
            int i3 = b.f16130c + i2;
            while (j != 0) {
                long j2 = (long) 10;
                i3--;
                bArr[i3] = C6470a.m24460a()[(int) (j % j2)];
                j /= j2;
            }
            if (z) {
                bArr[i3 - 1] = (byte) 45;
            }
            b.f16130c += i2;
            mo16808j(mo16834x() + ((long) i2));
        }
        return this;
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final void mo16808j(long j) {
        this.f16094g = j;
    }

    /* renamed from: j */
    public boolean mo16809j() {
        return this.f16094g == 0;
    }

    /* renamed from: l */
    public final long mo16810l() {
        long x = mo16834x();
        if (x == 0) {
            return 0;
        }
        C6500t tVar = this.f16093f;
        if (tVar != null) {
            C6500t tVar2 = tVar.f16134g;
            if (tVar2 != null) {
                int i = tVar2.f16130c;
                if (i < 8192 && tVar2.f16132e) {
                    x -= (long) (i - tVar2.f16129b);
                }
                return x;
            }
            C5942k.m22323a();
            throw null;
        }
        C5942k.m22323a();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r8 != r9) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        r15.f16093f = r6.mo16918b();
        p350n.C6502u.f16137c.mo16921a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        r6.f16129b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        if (r1 != false) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007c A[SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo16811n() {
        /*
            r15 = this;
            long r0 = r15.mo16834x()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00bc
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000d:
            n.t r6 = r15.f16093f
            if (r6 == 0) goto L_0x00b7
            byte[] r7 = r6.f16128a
            int r8 = r6.f16129b
            int r9 = r6.f16130c
        L_0x0017:
            if (r8 >= r9) goto L_0x0097
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0028
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0028
            int r11 = r10 - r11
            goto L_0x0042
        L_0x0028:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0037
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0037
        L_0x0032:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0042
        L_0x0037:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0078
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0078
            goto L_0x0032
        L_0x0042:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0052
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0017
        L_0x0052:
            n.e r0 = new n.e
            r0.<init>()
            r0.mo16783a(r4)
            r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo16826v()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0078:
            if (r0 == 0) goto L_0x007c
            r1 = 1
            goto L_0x0097
        L_0x007c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = p350n.C6474c.m24472a(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0097:
            if (r8 != r9) goto L_0x00a5
            n.t r7 = r6.mo16918b()
            r15.f16093f = r7
            n.u r7 = p350n.C6502u.f16137c
            r7.mo16921a(r6)
            goto L_0x00a7
        L_0x00a5:
            r6.f16129b = r8
        L_0x00a7:
            if (r1 != 0) goto L_0x00ad
            n.t r6 = r15.f16093f
            if (r6 != 0) goto L_0x000d
        L_0x00ad:
            long r1 = r15.mo16834x()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.mo16808j(r1)
            return r4
        L_0x00b7:
            p308k.p323z.p325d.C5942k.m22323a()
            r0 = 0
            throw r0
        L_0x00bc:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p350n.C6480e.mo16811n():long");
    }

    /* renamed from: o */
    public final C6480e mo16812o() {
        C6480e eVar = new C6480e();
        if (mo16834x() != 0) {
            C6500t tVar = this.f16093f;
            if (tVar != null) {
                C6500t c = tVar.mo16919c();
                eVar.f16093f = c;
                c.f16134g = c;
                c.f16133f = c;
                C6500t tVar2 = tVar.f16133f;
                while (tVar2 != tVar) {
                    C6500t tVar3 = c.f16134g;
                    if (tVar3 == null) {
                        C5942k.m22323a();
                        throw null;
                    } else if (tVar2 != null) {
                        tVar3.mo16915a(tVar2.mo16919c());
                        tVar2 = tVar2.f16133f;
                    } else {
                        C5942k.m22323a();
                        throw null;
                    }
                }
                eVar.mo16808j(mo16834x());
            } else {
                C5942k.m22323a();
                throw null;
            }
        }
        return eVar;
    }

    /* renamed from: p */
    public OutputStream mo16813p() {
        return new C6482b(this);
    }

    /* renamed from: q */
    public byte[] mo16814q() {
        return mo16799e(mo16834x());
    }

    /* renamed from: r */
    public InputStream mo16815r() {
        return new C6481a(this);
    }

    public int read(ByteBuffer byteBuffer) {
        C5942k.m22327b(byteBuffer, "sink");
        C6500t tVar = this.f16093f;
        if (tVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), tVar.f16130c - tVar.f16129b);
        byteBuffer.put(tVar.f16128a, tVar.f16129b, min);
        int i = tVar.f16129b + min;
        tVar.f16129b = i;
        this.f16094g -= (long) min;
        if (i == tVar.f16130c) {
            this.f16093f = tVar.mo16918b();
            C6502u.f16137c.mo16921a(tVar);
        }
        return min;
    }

    public int read(byte[] bArr, int i, int i2) {
        C5942k.m22327b(bArr, "sink");
        C6474c.m24474a((long) bArr.length, (long) i, (long) i2);
        C6500t tVar = this.f16093f;
        if (tVar == null) {
            return -1;
        }
        int min = Math.min(i2, tVar.f16130c - tVar.f16129b);
        byte[] bArr2 = tVar.f16128a;
        int i3 = tVar.f16129b;
        C5830g.m22107a(bArr2, bArr, i, i3, i3 + min);
        tVar.f16129b += min;
        mo16808j(mo16834x() - ((long) min));
        if (tVar.f16129b != tVar.f16130c) {
            return min;
        }
        this.f16093f = tVar.mo16918b();
        C6502u.f16137c.mo16921a(tVar);
        return min;
    }

    public byte readByte() {
        if (mo16834x() != 0) {
            C6500t tVar = this.f16093f;
            if (tVar != null) {
                int i = tVar.f16129b;
                int i2 = tVar.f16130c;
                int i3 = i + 1;
                byte b = tVar.f16128a[i];
                mo16808j(mo16834x() - 1);
                if (i3 == i2) {
                    this.f16093f = tVar.mo16918b();
                    C6502u.f16137c.mo16921a(tVar);
                } else {
                    tVar.f16129b = i3;
                }
                return b;
            }
            C5942k.m22323a();
            throw null;
        }
        throw new EOFException();
    }

    public int readInt() {
        if (mo16834x() >= 4) {
            C6500t tVar = this.f16093f;
            if (tVar != null) {
                int i = tVar.f16129b;
                int i2 = tVar.f16130c;
                if (((long) (i2 - i)) < 4) {
                    return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
                }
                byte[] bArr = tVar.f16128a;
                int i3 = i + 1;
                int i4 = i3 + 1;
                byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
                int i5 = i4 + 1;
                byte b2 = b | ((bArr[i4] & 255) << 8);
                int i6 = i5 + 1;
                byte b3 = b2 | (bArr[i5] & 255);
                mo16808j(mo16834x() - 4);
                if (i6 == i2) {
                    this.f16093f = tVar.mo16918b();
                    C6502u.f16137c.mo16921a(tVar);
                } else {
                    tVar.f16129b = i6;
                }
                return b3;
            }
            C5942k.m22323a();
            throw null;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (mo16834x() >= 2) {
            C6500t tVar = this.f16093f;
            if (tVar != null) {
                int i = tVar.f16129b;
                int i2 = tVar.f16130c;
                if (i2 - i < 2) {
                    return (short) (((readByte() & 255) << 8) | (readByte() & 255));
                }
                byte[] bArr = tVar.f16128a;
                int i3 = i + 1;
                int i4 = i3 + 1;
                byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
                mo16808j(mo16834x() - 2);
                if (i4 == i2) {
                    this.f16093f = tVar.mo16918b();
                    C6502u.f16137c.mo16921a(tVar);
                } else {
                    tVar.f16129b = i4;
                }
                return (short) b;
            }
            C5942k.m22323a();
            throw null;
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public C6485h mo16821s() {
        return mo16790b(mo16834x());
    }

    public void skip(long j) {
        while (j > 0) {
            C6500t tVar = this.f16093f;
            if (tVar != null) {
                int min = (int) Math.min(j, (long) (tVar.f16130c - tVar.f16129b));
                long j2 = (long) min;
                mo16808j(mo16834x() - j2);
                j -= j2;
                int i = tVar.f16129b + min;
                tVar.f16129b = i;
                if (i == tVar.f16130c) {
                    this.f16093f = tVar.mo16918b();
                    C6502u.f16137c.mo16921a(tVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t */
    public int mo16823t() {
        return C6474c.m24471a(readInt());
    }

    public String toString() {
        return mo16835y().toString();
    }

    /* renamed from: u */
    public short mo16825u() {
        return C6474c.m24473a(readShort());
    }

    /* renamed from: v */
    public String mo16826v() {
        return mo16781a(this.f16094g, C5769d.f14834a);
    }

    /* renamed from: w */
    public int mo16827w() {
        byte b;
        int i;
        byte b2;
        if (mo16834x() != 0) {
            byte d = mo16796d(0);
            int i2 = 1;
            if ((d & 128) == 0) {
                b2 = d & Byte.MAX_VALUE;
                i = 1;
                b = 0;
            } else if ((d & 224) == 192) {
                b2 = d & 31;
                i = 2;
                b = 128;
            } else if ((d & 240) == 224) {
                b2 = d & 15;
                i = 3;
                b = 2048;
            } else if ((d & 248) == 240) {
                b2 = d & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (mo16834x() >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte d2 = mo16796d(j2);
                    if ((d2 & 192) == 128) {
                        b2 = (b2 << 6) | (d2 & 63);
                        i2++;
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return 65533;
                }
                if ((55296 <= b2 && 57343 >= b2) || b2 < b) {
                    return 65533;
                }
                return b2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("size < ");
            sb.append(i);
            sb.append(": ");
            sb.append(mo16834x());
            sb.append(" (to read code point prefixed 0x");
            sb.append(C6474c.m24472a(d));
            sb.append(')');
            throw new EOFException(sb.toString());
        }
        throw new EOFException();
    }

    public int write(ByteBuffer byteBuffer) {
        C5942k.m22327b(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C6500t b = mo16791b(1);
            int min = Math.min(i, 8192 - b.f16130c);
            byteBuffer.get(b.f16128a, b.f16130c, min);
            i -= min;
            b.f16130c += min;
        }
        this.f16094g += (long) remaining;
        return remaining;
    }

    public C6480e write(byte[] bArr) {
        C5942k.m22327b(bArr, "source");
        write(bArr, 0, bArr.length);
        return this;
    }

    public C6480e write(byte[] bArr, int i, int i2) {
        C5942k.m22327b(bArr, "source");
        long j = (long) i2;
        C6474c.m24474a((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C6500t b = mo16791b(1);
            int min = Math.min(i3 - i, 8192 - b.f16130c);
            int i4 = i + min;
            C5830g.m22107a(bArr, b.f16128a, b.f16130c, i, i4);
            b.f16130c += min;
            i = i4;
        }
        mo16808j(mo16834x() + j);
        return this;
    }

    public C6480e writeByte(int i) {
        C6500t b = mo16791b(1);
        byte[] bArr = b.f16128a;
        int i2 = b.f16130c;
        b.f16130c = i2 + 1;
        bArr[i2] = (byte) i;
        mo16808j(mo16834x() + 1);
        return this;
    }

    public C6480e writeInt(int i) {
        C6500t b = mo16791b(4);
        byte[] bArr = b.f16128a;
        int i2 = b.f16130c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i & 255);
        b.f16130c = i6;
        mo16808j(mo16834x() + 4);
        return this;
    }

    public C6480e writeShort(int i) {
        C6500t b = mo16791b(2);
        byte[] bArr = b.f16128a;
        int i2 = b.f16130c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        b.f16130c = i4;
        mo16808j(mo16834x() + 2);
        return this;
    }

    /* renamed from: x */
    public final long mo16834x() {
        return this.f16094g;
    }

    /* renamed from: y */
    public final C6485h mo16835y() {
        if (mo16834x() <= ((long) Integer.MAX_VALUE)) {
            return mo16789a((int) mo16834x());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size > Int.MAX_VALUE: ");
        sb.append(mo16834x());
        throw new IllegalStateException(sb.toString().toString());
    }
}
