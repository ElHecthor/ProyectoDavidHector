package kotlinx.coroutines.internal;

import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.y */
final /* synthetic */ class C6142y {
    /* renamed from: a */
    public static final int m23090a(String str, int i, int i2, int i3) {
        C5942k.m22327b(str, "propertyName");
        return (int) C6140w.m23084a(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: a */
    public static /* synthetic */ int m23091a(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C6140w.m23082a(str, i, i2, i3);
    }

    /* renamed from: a */
    public static final long m23092a(String str, long j, long j2, long j3) {
        C5942k.m22327b(str, "propertyName");
        String a = C6140w.m23086a(str);
        if (a == null) {
            return j;
        }
        Long b = C5786o.m21966b(a);
        String str2 = "System property '";
        if (b != null) {
            long longValue = b.longValue();
            if (j2 <= longValue && j3 >= longValue) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j2);
            sb.append("..");
            sb.append(j3);
            sb.append(", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        sb2.append("' has unrecognized value '");
        sb2.append(a);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    /* renamed from: a */
    public static /* synthetic */ long m23093a(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C6140w.m23084a(str, j, j4, j3);
    }

    /* renamed from: a */
    public static final boolean m23094a(String str, boolean z) {
        C5942k.m22327b(str, "propertyName");
        String a = C6140w.m23086a(str);
        return a != null ? Boolean.parseBoolean(a) : z;
    }
}
