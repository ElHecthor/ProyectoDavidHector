package p350n;

import p308k.p323z.p325d.C5942k;

/* renamed from: n.a */
public final class C6469a {

    /* renamed from: a */
    private static final byte[] f16079a = C6485h.f16098j.mo16875b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").mo16859g();

    static {
        C6485h.f16098j.mo16875b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").mo16859g();
    }

    /* renamed from: a */
    public static final String m24455a(byte[] bArr, byte[] bArr2) {
        C5942k.m22327b(bArr, "$this$encodeBase64");
        C5942k.m22327b(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(b4 & 3) << 4];
            int i11 = i10 + 1;
            byte b5 = (byte) 61;
            bArr3[i10] = b5;
            bArr3[i11] = b5;
        } else if (length2 == 2) {
            int i12 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i12];
            int i13 = i2 + 1;
            bArr3[i2] = bArr2[(b6 & 255) >> 2];
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            int i15 = i14 + 1;
            bArr3[i14] = bArr2[(b7 & 15) << 2];
            bArr3[i15] = (byte) 61;
        }
        return C6473b.m24469a(bArr3);
    }

    /* renamed from: a */
    public static /* synthetic */ String m24456a(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = f16079a;
        }
        return m24455a(bArr, bArr2);
    }
}
