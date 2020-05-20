package p147g.p156d.p157a.p167b.p173d.p180g;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: g.d.a.b.d.g.l3 */
public abstract class C4092l3 implements Serializable, Iterable<Byte> {

    /* renamed from: g */
    public static final C4092l3 f11077g = new C4247v3(C4248v4.f11359b);

    /* renamed from: h */
    private static final C4179r3 f11078h = (C4046i3.m16532a() ? new C4293y3(null) : new C4150p3(null));

    /* renamed from: f */
    private int f11079f = 0;

    static {
        new C4122n3();
    }

    C4092l3() {
    }

    /* renamed from: a */
    public static C4092l3 m16738a(String str) {
        return new C4247v3(str.getBytes(C4248v4.f11358a));
    }

    /* renamed from: a */
    public static C4092l3 m16739a(byte[] bArr, int i, int i2) {
        m16741b(i, i + i2, bArr.length);
        return new C4247v3(f11078h.mo12702a(bArr, i, i2));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m16740b(byte b) {
        return b & 255;
    }

    /* renamed from: b */
    static int m16741b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: e */
    static C4213t3 m16742e(int i) {
        return new C4213t3(i, null);
    }

    /* renamed from: a */
    public abstract byte mo12607a(int i);

    /* renamed from: a */
    public abstract int mo12608a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo12609a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract C4092l3 mo12610a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo12611a(Charset charset);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo12612a(C4108m3 m3Var);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract byte mo12613b(int i);

    /* renamed from: b */
    public final String mo12614b() {
        return mo12608a() == 0 ? "" : mo12611a(C4248v4.f11358a);
    }

    /* renamed from: c */
    public abstract boolean mo12615c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo12616d() {
        return this.f11079f;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f11079f;
        if (i == 0) {
            int a = mo12608a();
            i = mo12609a(a, 0, a);
            if (i == 0) {
                i = 1;
            }
            this.f11079f = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C4136o3(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo12608a());
        objArr[2] = mo12608a() <= 50 ? C4035h7.m16493a(this) : String.valueOf(C4035h7.m16493a(mo12610a(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
