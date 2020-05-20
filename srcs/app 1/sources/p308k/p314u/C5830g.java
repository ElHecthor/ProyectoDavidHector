package p308k.p314u;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.u.g */
class C5830g extends C5828f {
    /* renamed from: a */
    public static <T> List<T> m22102a(T[] tArr) {
        C5942k.m22327b(tArr, "$this$asList");
        List<T> a = C5834i.m22126a(tArr);
        C5942k.m22324a((Object) a, "ArraysUtilJVM.asList(this)");
        return a;
    }

    /* renamed from: a */
    public static <T> void m22103a(T[] tArr, T t, int i, int i2) {
        C5942k.m22327b(tArr, "$this$fill");
        Arrays.fill(tArr, i, i2, t);
    }

    /* renamed from: a */
    public static /* synthetic */ void m22104a(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m22103a(objArr, obj, i, i2);
    }

    /* renamed from: a */
    public static final <T> void m22105a(T[] tArr, Comparator<? super T> comparator) {
        C5942k.m22327b(tArr, "$this$sortWith");
        C5942k.m22327b(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    /* renamed from: a */
    public static byte[] m22106a(byte[] bArr, int i, int i2) {
        C5942k.m22327b(bArr, "$this$copyOfRangeImpl");
        C5826e.m22099a(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C5942k.m22324a((Object) copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: a */
    public static byte[] m22107a(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C5942k.m22327b(bArr, "$this$copyInto");
        C5942k.m22327b(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: a */
    public static /* synthetic */ byte[] m22108a(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        m22107a(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    /* renamed from: a */
    public static <T> T[] m22109a(T[] tArr, T t) {
        C5942k.m22327b(tArr, "$this$plus");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        copyOf[length] = t;
        C5942k.m22324a((Object) copyOf, "result");
        return copyOf;
    }

    /* renamed from: a */
    public static final <T> T[] m22110a(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C5942k.m22327b(tArr, "$this$copyInto");
        C5942k.m22327b(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: a */
    public static /* synthetic */ Object[] m22111a(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        m22110a((T[]) objArr, (T[]) objArr2, i, i2, i3);
        return objArr2;
    }
}
