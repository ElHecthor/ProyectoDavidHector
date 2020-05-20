package p308k.p309a0;

import p308k.p323z.p325d.C5942k;

/* renamed from: k.a0.d */
public final class C5726d {
    /* renamed from: a */
    public static final int m21839a(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: a */
    public static final String m21840a(Object obj, Object obj2) {
        C5942k.m22327b(obj, "from");
        C5942k.m22327b(obj2, "until");
        StringBuilder sb = new StringBuilder();
        sb.append("Random range is empty: [");
        sb.append(obj);
        sb.append(", ");
        sb.append(obj2);
        sb.append(").");
        return sb.toString();
    }

    /* renamed from: a */
    public static final void m21841a(int i, int i2) {
        if (!(i2 > i)) {
            throw new IllegalArgumentException(m21840a((Object) Integer.valueOf(i), (Object) Integer.valueOf(i2)).toString());
        }
    }

    /* renamed from: b */
    public static final int m21842b(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
