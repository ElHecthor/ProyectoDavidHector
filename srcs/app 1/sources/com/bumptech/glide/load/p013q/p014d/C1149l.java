package com.bumptech.glide.load.p013q.p014d;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import com.bumptech.glide.p029t.C1309j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.load.q.d.l */
public final class C1149l implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f3921a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f3922b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: com.bumptech.glide.load.q.d.l$a */
    private static final class C1150a implements C1152c {

        /* renamed from: a */
        private final ByteBuffer f3923a;

        C1150a(ByteBuffer byteBuffer) {
            this.f3923a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo5033a(byte[] bArr, int i) {
            int min = Math.min(i, this.f3923a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f3923a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: a */
        public short mo5034a() {
            if (this.f3923a.remaining() >= 1) {
                return (short) (this.f3923a.get() & 255);
            }
            throw new C1153a();
        }

        /* renamed from: b */
        public int mo5035b() {
            return (mo5034a() << 8) | mo5034a();
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f3923a.remaining(), j);
            ByteBuffer byteBuffer = this.f3923a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.l$b */
    private static final class C1151b {

        /* renamed from: a */
        private final ByteBuffer f3924a;

        C1151b(byte[] bArr, int i) {
            this.f3924a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        private boolean m5459a(int i, int i2) {
            return this.f3924a.remaining() - i >= i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo5037a() {
            return this.f3924a.remaining();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public short mo5038a(int i) {
            if (m5459a(i, 2)) {
                return this.f3924a.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5039a(ByteOrder byteOrder) {
            this.f3924a.order(byteOrder);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo5040b(int i) {
            if (m5459a(i, 4)) {
                return this.f3924a.getInt(i);
            }
            return -1;
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.l$c */
    private interface C1152c {

        /* renamed from: com.bumptech.glide.load.q.d.l$c$a */
        public static final class C1153a extends IOException {
            private static final long serialVersionUID = 1;

            C1153a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo5033a(byte[] bArr, int i);

        /* renamed from: a */
        short mo5034a();

        /* renamed from: b */
        int mo5035b();

        long skip(long j);
    }

    /* renamed from: com.bumptech.glide.load.q.d.l$d */
    private static final class C1154d implements C1152c {

        /* renamed from: a */
        private final InputStream f3925a;

        C1154d(InputStream inputStream) {
            this.f3925a = inputStream;
        }

        /* renamed from: a */
        public int mo5033a(byte[] bArr, int i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                i3 = this.f3925a.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new C1153a();
        }

        /* renamed from: a */
        public short mo5034a() {
            int read = this.f3925a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new C1153a();
        }

        /* renamed from: b */
        public int mo5035b() {
            return (mo5034a() << 8) | mo5034a();
        }

        public long skip(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f3925a.skip(j2);
                if (skip <= 0) {
                    if (this.f3925a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: a */
    private static int m5445a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: a */
    private static int m5446a(C1151b bVar) {
        ByteOrder byteOrder;
        String str;
        StringBuilder sb;
        String str2;
        short a = bVar.mo5038a(6);
        String str3 = "DfltImageHeaderParser";
        if (a != 18761) {
            if (a != 19789 && Log.isLoggable(str3, 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown endianness = ");
                sb2.append(a);
                Log.d(str3, sb2.toString());
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.mo5039a(byteOrder);
        int b = bVar.mo5040b(10) + 6;
        short a2 = bVar.mo5038a(b);
        for (int i = 0; i < a2; i++) {
            int a3 = m5445a(b, i);
            short a4 = bVar.mo5038a(a3);
            if (a4 == 274) {
                short a5 = bVar.mo5038a(a3 + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b2 = bVar.mo5040b(a3 + 4);
                    if (b2 >= 0) {
                        String str4 = " tagType=";
                        if (Log.isLoggable(str3, 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Got tagIndex=");
                            sb3.append(i);
                            sb3.append(str4);
                            sb3.append(a4);
                            sb3.append(" formatCode=");
                            sb3.append(a5);
                            sb3.append(" componentCount=");
                            sb3.append(b2);
                            Log.d(str3, sb3.toString());
                        }
                        int i2 = b2 + f3922b[a5];
                        if (i2 <= 4) {
                            int i3 = a3 + 8;
                            if (i3 < 0 || i3 > bVar.mo5037a()) {
                                if (Log.isLoggable(str3, 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal tagValueOffset=");
                                    sb4.append(i3);
                                    sb4.append(str4);
                                    sb4.append(a4);
                                    str = sb4.toString();
                                    Log.d(str3, str);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo5037a()) {
                                return bVar.mo5038a(i3);
                            } else {
                                if (Log.isLoggable(str3, 3)) {
                                    sb = new StringBuilder();
                                    sb.append("Illegal number of bytes for TI tag data tagType=");
                                    sb.append(a4);
                                    str = sb.toString();
                                    Log.d(str3, str);
                                }
                            }
                        } else if (Log.isLoggable(str3, 3)) {
                            sb = new StringBuilder();
                            str2 = "Got byte count > 4, not orientation, continuing, formatCode=";
                        }
                    } else if (Log.isLoggable(str3, 3)) {
                        str = "Negative tiff component count";
                        Log.d(str3, str);
                    }
                } else if (Log.isLoggable(str3, 3)) {
                    sb = new StringBuilder();
                    str2 = "Got invalid format code = ";
                }
                sb.append(str2);
                sb.append(a5);
                str = sb.toString();
                Log.d(str3, str);
            }
        }
        return -1;
    }

    /* renamed from: a */
    private int m5447a(C1152c cVar, C0916b bVar) {
        byte[] bArr;
        try {
            int b = cVar.mo5035b();
            String str = "DfltImageHeaderParser";
            if (!m5450a(b)) {
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parser doesn't handle magic number: ");
                    sb.append(b);
                    Log.d(str, sb.toString());
                }
                return -1;
            }
            int b2 = m5452b(cVar);
            if (b2 == -1) {
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) bVar.mo4692b(b2, byte[].class);
            int a = m5448a(cVar, bArr, b2);
            bVar.put(bArr);
            return a;
        } catch (C1153a unused) {
            return -1;
        } catch (Throwable th) {
            bVar.put(bArr);
            throw th;
        }
    }

    /* renamed from: a */
    private int m5448a(C1152c cVar, byte[] bArr, int i) {
        int a = cVar.mo5033a(bArr, i);
        String str = "DfltImageHeaderParser";
        if (a != i) {
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to read exif segment data, length: ");
                sb.append(i);
                sb.append(", actually read: ");
                sb.append(a);
                Log.d(str, sb.toString());
            }
            return -1;
        } else if (m5451a(bArr, i)) {
            return m5446a(new C1151b(bArr, i));
        } else {
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0039 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.load.ImageHeaderParser.ImageType m5449a(com.bumptech.glide.load.p013q.p014d.C1149l.C1152c r6) {
        /*
            r5 = this;
            int r0 = r6.mo5035b()     // Catch:{ a -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.mo5034a()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.mo5034a()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo5034a()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0044:
            r0 = 4
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            int r2 = r6.mo5035b()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo5035b()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x005c:
            int r2 = r6.mo5035b()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo5035b()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo5034a()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x0087:
            return r6
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo5034a()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x009c:
            return r6
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p013q.p014d.C1149l.m5449a(com.bumptech.glide.load.q.d.l$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* renamed from: a */
    private static boolean m5450a(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: a */
    private boolean m5451a(byte[] bArr, int i) {
        boolean z = bArr != null && i > f3921a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f3921a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private int m5452b(C1152c cVar) {
        String str;
        short a;
        int b;
        long j;
        long skip;
        do {
            short a2 = cVar.mo5034a();
            str = "DfltImageHeaderParser";
            if (a2 != 255) {
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append(a2);
                    Log.d(str, sb.toString());
                }
                return -1;
            }
            a = cVar.mo5034a();
            if (a == 218) {
                return -1;
            }
            if (a == 217) {
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            b = cVar.mo5035b() - 2;
            if (a == 225) {
                return b;
            }
            j = (long) b;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append(a);
            sb2.append(", wanted to skip: ");
            sb2.append(b);
            sb2.append(", but actually skipped: ");
            sb2.append(skip);
            Log.d(str, sb2.toString());
        }
        return -1;
    }

    /* renamed from: a */
    public int mo4611a(InputStream inputStream, C0916b bVar) {
        C1309j.m6149a(inputStream);
        C1154d dVar = new C1154d(inputStream);
        C1309j.m6149a(bVar);
        return m5447a((C1152c) dVar, bVar);
    }

    /* renamed from: a */
    public ImageType mo4612a(InputStream inputStream) {
        C1309j.m6149a(inputStream);
        return m5449a((C1152c) new C1154d(inputStream));
    }

    /* renamed from: a */
    public ImageType mo4613a(ByteBuffer byteBuffer) {
        C1309j.m6149a(byteBuffer);
        return m5449a((C1152c) new C1150a(byteBuffer));
    }
}
