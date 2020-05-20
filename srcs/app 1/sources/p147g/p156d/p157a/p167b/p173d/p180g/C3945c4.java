package p147g.p156d.p157a.p167b.p173d.p180g;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: g.d.a.b.d.g.c4 */
public abstract class C3945c4 extends C4108m3 {

    /* renamed from: b */
    private static final Logger f10843b = Logger.getLogger(C3945c4.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f10844c = C4183r7.m17000a();

    /* renamed from: a */
    C3983e4 f10845a = this;

    /* renamed from: g.d.a.b.d.g.c4$a */
    public static class C3946a extends IOException {
        C3946a(String str, Throwable th) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }

        C3946a(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: g.d.a.b.d.g.c4$b */
    static class C3947b extends C3945c4 {

        /* renamed from: d */
        private final byte[] f10846d;

        /* renamed from: e */
        private final int f10847e;

        /* renamed from: f */
        private int f10848f;

        C3947b(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.f10846d = bArr;
                    this.f10848f = 0;
                    this.f10847e = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(0), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: c */
        private final void m16096c(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f10846d, this.f10848f, i2);
                this.f10848f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C3946a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10848f), Integer.valueOf(this.f10847e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final int mo12247a() {
            return this.f10847e - this.f10848f;
        }

        /* renamed from: a */
        public final void mo12248a(byte b) {
            try {
                byte[] bArr = this.f10846d;
                int i = this.f10848f;
                this.f10848f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C3946a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10848f), Integer.valueOf(this.f10847e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo12251a(int i) {
            if (i >= 0) {
                mo12268b(i);
            } else {
                mo12261a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo12254a(int i, int i2) {
            mo12268b((i << 3) | i2);
        }

        /* renamed from: a */
        public final void mo12255a(int i, long j) {
            mo12254a(i, 0);
            mo12261a(j);
        }

        /* renamed from: a */
        public final void mo12256a(int i, C3985e6 e6Var) {
            mo12254a(1, 3);
            mo12275c(2, i);
            mo12254a(3, 2);
            mo12262a(e6Var);
            mo12254a(1, 4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo12257a(int i, C3985e6 e6Var, C4236u6 u6Var) {
            mo12254a(i, 2);
            C3944c3 c3Var = (C3944c3) e6Var;
            int h = c3Var.mo12246h();
            if (h == -1) {
                h = u6Var.mo12550d(c3Var);
                c3Var.mo12243a(h);
            }
            mo12268b(h);
            u6Var.mo12544a(e6Var, (C4051i8) this.f10845a);
        }

        /* renamed from: a */
        public final void mo12258a(int i, C4092l3 l3Var) {
            mo12254a(i, 2);
            mo12263a(l3Var);
        }

        /* renamed from: a */
        public final void mo12259a(int i, String str) {
            mo12254a(i, 2);
            mo12264a(str);
        }

        /* renamed from: a */
        public final void mo12260a(int i, boolean z) {
            mo12254a(i, 0);
            mo12248a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo12261a(long j) {
            if (!C3945c4.f10844c || mo12247a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f10846d;
                    int i = this.f10848f;
                    this.f10848f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f10846d;
                    int i2 = this.f10848f;
                    this.f10848f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C3946a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10848f), Integer.valueOf(this.f10847e), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f10846d;
                    int i3 = this.f10848f;
                    this.f10848f = i3 + 1;
                    C4183r7.m16999a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f10846d;
                int i4 = this.f10848f;
                this.f10848f = i4 + 1;
                C4183r7.m16999a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: a */
        public final void mo12262a(C3985e6 e6Var) {
            mo12268b(e6Var.mo12434j());
            e6Var.mo12432a(this);
        }

        /* renamed from: a */
        public final void mo12263a(C4092l3 l3Var) {
            mo12268b(l3Var.mo12608a());
            l3Var.mo12612a((C4108m3) this);
        }

        /* renamed from: a */
        public final void mo12264a(String str) {
            int i = this.f10848f;
            try {
                int g = C3945c4.m16045g(str.length() * 3);
                int g2 = C3945c4.m16045g(str.length());
                if (g2 == g) {
                    int i2 = i + g2;
                    this.f10848f = i2;
                    int a = C4237u7.m17269a(str, this.f10846d, i2, mo12247a());
                    this.f10848f = i;
                    mo12268b((a - i) - g2);
                    this.f10848f = a;
                    return;
                }
                mo12268b(C4237u7.m17268a((CharSequence) str));
                this.f10848f = C4237u7.m17269a(str, this.f10846d, this.f10848f, mo12247a());
            } catch (C4282x7 e) {
                this.f10848f = i;
                mo12265a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C3946a(e2);
            }
        }

        /* renamed from: a */
        public final void mo12281a(byte[] bArr, int i, int i2) {
            m16096c(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo12268b(int i) {
            if (!C3945c4.f10844c || C4046i3.m16532a() || mo12247a() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f10846d;
                    int i2 = this.f10848f;
                    this.f10848f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f10846d;
                    int i3 = this.f10848f;
                    this.f10848f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C3946a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10848f), Integer.valueOf(this.f10847e), Integer.valueOf(1)}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f10846d;
                int i4 = this.f10848f;
                this.f10848f = i4 + 1;
                C4183r7.m16999a(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f10846d;
                int i5 = this.f10848f;
                this.f10848f = i5 + 1;
                C4183r7.m16999a(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f10846d;
                    int i7 = this.f10848f;
                    this.f10848f = i7 + 1;
                    C4183r7.m16999a(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f10846d;
                int i8 = this.f10848f;
                this.f10848f = i8 + 1;
                C4183r7.m16999a(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f10846d;
                    int i10 = this.f10848f;
                    this.f10848f = i10 + 1;
                    C4183r7.m16999a(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f10846d;
                int i11 = this.f10848f;
                this.f10848f = i11 + 1;
                C4183r7.m16999a(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f10846d;
                    int i13 = this.f10848f;
                    this.f10848f = i13 + 1;
                    C4183r7.m16999a(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f10846d;
                int i14 = this.f10848f;
                this.f10848f = i14 + 1;
                C4183r7.m16999a(bArr10, (long) i14, (byte) (i12 | 128));
                int i15 = i12 >>> 7;
                byte[] bArr11 = this.f10846d;
                int i16 = this.f10848f;
                this.f10848f = i16 + 1;
                C4183r7.m16999a(bArr11, (long) i16, (byte) i15);
            }
        }

        /* renamed from: b */
        public final void mo12269b(int i, int i2) {
            mo12254a(i, 0);
            mo12251a(i2);
        }

        /* renamed from: b */
        public final void mo12271b(int i, C4092l3 l3Var) {
            mo12254a(1, 3);
            mo12275c(2, i);
            mo12258a(3, l3Var);
            mo12254a(1, 4);
        }

        /* renamed from: b */
        public final void mo12273b(byte[] bArr, int i, int i2) {
            mo12268b(i2);
            m16096c(bArr, 0, i2);
        }

        /* renamed from: c */
        public final void mo12275c(int i, int i2) {
            mo12254a(i, 0);
            mo12268b(i2);
        }

        /* renamed from: c */
        public final void mo12276c(int i, long j) {
            mo12254a(i, 1);
            mo12277c(j);
        }

        /* renamed from: c */
        public final void mo12277c(long j) {
            try {
                byte[] bArr = this.f10846d;
                int i = this.f10848f;
                int i2 = i + 1;
                this.f10848f = i2;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f10846d;
                int i3 = i2 + 1;
                this.f10848f = i3;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f10846d;
                int i4 = i3 + 1;
                this.f10848f = i4;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f10846d;
                int i5 = i4 + 1;
                this.f10848f = i5;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f10846d;
                int i6 = i5 + 1;
                this.f10848f = i6;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f10846d;
                int i7 = i6 + 1;
                this.f10848f = i7;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f10846d;
                int i8 = i7 + 1;
                this.f10848f = i8;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f10846d;
                this.f10848f = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C3946a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10848f), Integer.valueOf(this.f10847e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: d */
        public final void mo12278d(int i) {
            try {
                byte[] bArr = this.f10846d;
                int i2 = this.f10848f;
                int i3 = i2 + 1;
                this.f10848f = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f10846d;
                int i4 = i3 + 1;
                this.f10848f = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f10846d;
                int i5 = i4 + 1;
                this.f10848f = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f10846d;
                this.f10848f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new C3946a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10848f), Integer.valueOf(this.f10847e), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: e */
        public final void mo12280e(int i, int i2) {
            mo12254a(i, 5);
            mo12278d(i2);
        }
    }

    private C3945c4() {
    }

    /* renamed from: a */
    public static int m16013a(int i, C4048i5 i5Var) {
        int e = m16038e(i);
        int a = i5Var.mo12538a();
        return e + m16045g(a) + a;
    }

    /* renamed from: a */
    static int m16014a(C3985e6 e6Var, C4236u6 u6Var) {
        C3944c3 c3Var = (C3944c3) e6Var;
        int h = c3Var.mo12246h();
        if (h == -1) {
            h = u6Var.mo12550d(c3Var);
            c3Var.mo12243a(h);
        }
        return m16045g(h) + h;
    }

    /* renamed from: a */
    public static int m16015a(C4048i5 i5Var) {
        int a = i5Var.mo12538a();
        return m16045g(a) + a;
    }

    /* renamed from: a */
    public static C3945c4 m16016a(byte[] bArr) {
        return new C3947b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m16017b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m16018b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m16019b(int i, double d) {
        return m16038e(i) + 8;
    }

    /* renamed from: b */
    public static int m16020b(int i, float f) {
        return m16038e(i) + 4;
    }

    /* renamed from: b */
    public static int m16021b(int i, C3985e6 e6Var) {
        return (m16038e(1) << 1) + m16046g(2, i) + m16038e(3) + m16026b(e6Var);
    }

    /* renamed from: b */
    static int m16022b(int i, C3985e6 e6Var, C4236u6 u6Var) {
        return m16038e(i) + m16014a(e6Var, u6Var);
    }

    /* renamed from: b */
    public static int m16023b(int i, C4048i5 i5Var) {
        return (m16038e(1) << 1) + m16046g(2, i) + m16013a(3, i5Var);
    }

    /* renamed from: b */
    public static int m16024b(int i, String str) {
        return m16038e(i) + m16028b(str);
    }

    /* renamed from: b */
    public static int m16025b(int i, boolean z) {
        return m16038e(i) + 1;
    }

    /* renamed from: b */
    public static int m16026b(C3985e6 e6Var) {
        int j = e6Var.mo12434j();
        return m16045g(j) + j;
    }

    /* renamed from: b */
    public static int m16027b(C4092l3 l3Var) {
        int a = l3Var.mo12608a();
        return m16045g(a) + a;
    }

    /* renamed from: b */
    public static int m16028b(String str) {
        int i;
        try {
            i = C4237u7.m17268a((CharSequence) str);
        } catch (C4282x7 unused) {
            i = str.getBytes(C4248v4.f11358a).length;
        }
        return m16045g(i) + i;
    }

    /* renamed from: b */
    public static int m16029b(boolean z) {
        return 1;
    }

    /* renamed from: b */
    public static int m16030b(byte[] bArr) {
        int length = bArr.length;
        return m16045g(length) + length;
    }

    @Deprecated
    /* renamed from: c */
    static int m16031c(int i, C3985e6 e6Var, C4236u6 u6Var) {
        int e = m16038e(i) << 1;
        C3944c3 c3Var = (C3944c3) e6Var;
        int h = c3Var.mo12246h();
        if (h == -1) {
            h = u6Var.mo12550d(c3Var);
            c3Var.mo12243a(h);
        }
        return e + h;
    }

    /* renamed from: c */
    public static int m16032c(int i, C4092l3 l3Var) {
        int e = m16038e(i);
        int a = l3Var.mo12608a();
        return e + m16045g(a) + a;
    }

    @Deprecated
    /* renamed from: c */
    public static int m16033c(C3985e6 e6Var) {
        return e6Var.mo12434j();
    }

    /* renamed from: d */
    public static int m16035d(int i, long j) {
        return m16038e(i) + m16040e(j);
    }

    /* renamed from: d */
    public static int m16036d(int i, C4092l3 l3Var) {
        return (m16038e(1) << 1) + m16046g(2, i) + m16032c(3, l3Var);
    }

    /* renamed from: d */
    public static int m16037d(long j) {
        return m16040e(j);
    }

    /* renamed from: e */
    public static int m16038e(int i) {
        return m16045g(i << 3);
    }

    /* renamed from: e */
    public static int m16039e(int i, long j) {
        return m16038e(i) + m16040e(j);
    }

    /* renamed from: e */
    public static int m16040e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    /* renamed from: f */
    public static int m16041f(int i) {
        if (i >= 0) {
            return m16045g(i);
        }
        return 10;
    }

    /* renamed from: f */
    public static int m16042f(int i, int i2) {
        return m16038e(i) + m16041f(i2);
    }

    /* renamed from: f */
    public static int m16043f(int i, long j) {
        return m16038e(i) + m16040e(m16055i(j));
    }

    /* renamed from: f */
    public static int m16044f(long j) {
        return m16040e(m16055i(j));
    }

    /* renamed from: g */
    public static int m16045g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m16046g(int i, int i2) {
        return m16038e(i) + m16045g(i2);
    }

    /* renamed from: g */
    public static int m16047g(int i, long j) {
        return m16038e(i) + 8;
    }

    /* renamed from: g */
    public static int m16048g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m16049h(int i) {
        return m16045g(m16061m(i));
    }

    /* renamed from: h */
    public static int m16050h(int i, int i2) {
        return m16038e(i) + m16045g(m16061m(i2));
    }

    /* renamed from: h */
    public static int m16051h(int i, long j) {
        return m16038e(i) + 8;
    }

    /* renamed from: h */
    public static int m16052h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m16053i(int i) {
        return 4;
    }

    /* renamed from: i */
    public static int m16054i(int i, int i2) {
        return m16038e(i) + 4;
    }

    /* renamed from: i */
    private static long m16055i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m16056j(int i) {
        return 4;
    }

    /* renamed from: j */
    public static int m16057j(int i, int i2) {
        return m16038e(i) + 4;
    }

    /* renamed from: k */
    public static int m16058k(int i) {
        return m16041f(i);
    }

    /* renamed from: k */
    public static int m16059k(int i, int i2) {
        return m16038e(i) + m16041f(i2);
    }

    @Deprecated
    /* renamed from: l */
    public static int m16060l(int i) {
        return m16045g(i);
    }

    /* renamed from: m */
    private static int m16061m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract int mo12247a();

    /* renamed from: a */
    public abstract void mo12248a(byte b);

    /* renamed from: a */
    public final void mo12249a(double d) {
        mo12277c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo12250a(float f) {
        mo12278d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo12251a(int i);

    /* renamed from: a */
    public final void mo12252a(int i, double d) {
        mo12276c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo12253a(int i, float f) {
        mo12280e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo12254a(int i, int i2);

    /* renamed from: a */
    public abstract void mo12255a(int i, long j);

    /* renamed from: a */
    public abstract void mo12256a(int i, C3985e6 e6Var);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo12257a(int i, C3985e6 e6Var, C4236u6 u6Var);

    /* renamed from: a */
    public abstract void mo12258a(int i, C4092l3 l3Var);

    /* renamed from: a */
    public abstract void mo12259a(int i, String str);

    /* renamed from: a */
    public abstract void mo12260a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo12261a(long j);

    /* renamed from: a */
    public abstract void mo12262a(C3985e6 e6Var);

    /* renamed from: a */
    public abstract void mo12263a(C4092l3 l3Var);

    /* renamed from: a */
    public abstract void mo12264a(String str);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12265a(String str, C4282x7 x7Var) {
        f10843b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", x7Var);
        byte[] bytes = str.getBytes(C4248v4.f11358a);
        try {
            mo12268b(bytes.length);
            mo12281a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C3946a(e);
        } catch (C3946a e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public final void mo12266a(boolean z) {
        mo12248a(z ? (byte) 1 : 0);
    }

    /* renamed from: b */
    public final void mo12267b() {
        if (mo12247a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public abstract void mo12268b(int i);

    /* renamed from: b */
    public abstract void mo12269b(int i, int i2);

    /* renamed from: b */
    public final void mo12270b(int i, long j) {
        mo12255a(i, m16055i(j));
    }

    /* renamed from: b */
    public abstract void mo12271b(int i, C4092l3 l3Var);

    /* renamed from: b */
    public final void mo12272b(long j) {
        mo12261a(m16055i(j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo12273b(byte[] bArr, int i, int i2);

    /* renamed from: c */
    public final void mo12274c(int i) {
        mo12268b(m16061m(i));
    }

    /* renamed from: c */
    public abstract void mo12275c(int i, int i2);

    /* renamed from: c */
    public abstract void mo12276c(int i, long j);

    /* renamed from: c */
    public abstract void mo12277c(long j);

    /* renamed from: d */
    public abstract void mo12278d(int i);

    /* renamed from: d */
    public final void mo12279d(int i, int i2) {
        mo12275c(i, m16061m(i2));
    }

    /* renamed from: e */
    public abstract void mo12280e(int i, int i2);
}
