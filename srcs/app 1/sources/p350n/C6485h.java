package p350n;

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p350n.p351a0.C6471b;

/* renamed from: n.h */
public class C6485h implements Serializable, Comparable<C6485h> {

    /* renamed from: i */
    public static final C6485h f16097i = new C6485h(new byte[0]);

    /* renamed from: j */
    public static final C6486a f16098j = new C6486a(null);
    private static final long serialVersionUID = 1;

    /* renamed from: f */
    private transient int f16099f;

    /* renamed from: g */
    private transient String f16100g;

    /* renamed from: h */
    private final byte[] f16101h;

    /* renamed from: n.h$a */
    public static final class C6486a {
        private C6486a() {
        }

        public /* synthetic */ C6486a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ C6485h m24590a(C6486a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo16874a(bArr, i, i2);
        }

        /* renamed from: a */
        public final C6485h mo16872a(InputStream inputStream, int i) {
            C5942k.m22327b(inputStream, "$this$readByteString");
            int i2 = 0;
            if (i >= 0) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new C6485h(bArr);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        /* renamed from: a */
        public final C6485h mo16873a(String str) {
            C5942k.m22327b(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((C6471b.m24465b(str.charAt(i2)) << 4) + C6471b.m24465b(str.charAt(i2 + 1)));
                }
                return new C6485h(bArr);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected hex string: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        /* renamed from: a */
        public final C6485h mo16874a(byte[] bArr, int i, int i2) {
            C5942k.m22327b(bArr, "$this$toByteString");
            C6474c.m24474a((long) bArr.length, (long) i, (long) i2);
            return new C6485h(C5830g.m22106a(bArr, i, i2 + i));
        }

        /* renamed from: b */
        public final C6485h mo16875b(String str) {
            C5942k.m22327b(str, "$this$encodeUtf8");
            C6485h hVar = new C6485h(C6473b.m24470a(str));
            hVar.mo16853b(str);
            return hVar;
        }
    }

    public C6485h(byte[] bArr) {
        C5942k.m22327b(bArr, "data");
        this.f16101h = bArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        C6485h a = f16098j.mo16872a(objectInputStream, objectInputStream.readInt());
        Field declaredField = C6485h.class.getDeclaredField("h");
        C5942k.m22324a((Object) declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, a.f16101h);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f16101h.length);
        objectOutputStream.write(this.f16101h);
    }

    /* renamed from: a */
    public final byte mo16846a(int i) {
        return mo16852b(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r0 < r1) goto L_0x0030;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(p350n.C6485h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            p308k.p323z.p325d.C5942k.m22327b(r10, r0)
            int r0 = r9.mo16868p()
            int r1 = r10.mo16868p()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.mo16846a(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.mo16846a(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = -1
            goto L_0x0033
        L_0x0032:
            r3 = 1
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p350n.C6485h.compareTo(n.h):int");
    }

    /* renamed from: a */
    public C6485h mo16848a(String str) {
        C5942k.m22327b(str, "algorithm");
        byte[] digest = MessageDigest.getInstance(str).digest(this.f16101h);
        C5942k.m22324a((Object) digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new C6485h(digest);
    }

    /* renamed from: a */
    public void mo16849a(C6480e eVar, int i, int i2) {
        C5942k.m22327b(eVar, "buffer");
        C6471b.m24463a(this, eVar, i, i2);
    }

    /* renamed from: a */
    public boolean mo16850a(int i, C6485h hVar, int i2, int i3) {
        C5942k.m22327b(hVar, "other");
        return hVar.mo16851a(i2, mo16859g(), i, i3);
    }

    /* renamed from: a */
    public boolean mo16851a(int i, byte[] bArr, int i2, int i3) {
        C5942k.m22327b(bArr, "other");
        return i >= 0 && i <= mo16859g().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C6474c.m24475a(mo16859g(), i, bArr, i2, i3);
    }

    /* renamed from: b */
    public byte mo16852b(int i) {
        return mo16859g()[i];
    }

    /* renamed from: b */
    public final void mo16853b(String str) {
        this.f16100g = str;
    }

    /* renamed from: b */
    public final boolean mo16854b(C6485h hVar) {
        C5942k.m22327b(hVar, "prefix");
        return mo16850a(0, hVar, 0, hVar.mo16868p());
    }

    /* renamed from: c */
    public final void mo16855c(int i) {
        this.f16099f = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6485h) {
            C6485h hVar = (C6485h) obj;
            if (hVar.mo16868p() == mo16859g().length && hVar.mo16851a(0, mo16859g(), 0, mo16859g().length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo16858f() {
        return C6469a.m24456a(mo16859g(), null, 1, null);
    }

    /* renamed from: g */
    public final byte[] mo16859g() {
        return this.f16101h;
    }

    /* renamed from: h */
    public final int mo16860h() {
        return this.f16099f;
    }

    public int hashCode() {
        int h = mo16860h();
        if (h != 0) {
            return h;
        }
        int hashCode = Arrays.hashCode(mo16859g());
        mo16855c(hashCode);
        return hashCode;
    }

    /* renamed from: i */
    public int mo16862i() {
        return mo16859g().length;
    }

    /* renamed from: j */
    public final String mo16863j() {
        return this.f16100g;
    }

    /* renamed from: l */
    public String mo16864l() {
        byte[] g;
        char[] cArr = new char[(mo16859g().length * 2)];
        int i = 0;
        for (byte b : mo16859g()) {
            int i2 = i + 1;
            cArr[i] = C6471b.m24464a()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = C6471b.m24464a()[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: m */
    public byte[] mo16865m() {
        return mo16859g();
    }

    /* renamed from: n */
    public C6485h mo16866n() {
        return mo16848a("SHA-1");
    }

    /* renamed from: o */
    public C6485h mo16867o() {
        return mo16848a("SHA-256");
    }

    /* renamed from: p */
    public final int mo16868p() {
        return mo16862i();
    }

    /* renamed from: q */
    public C6485h mo16869q() {
        for (int i = 0; i < mo16859g().length; i++) {
            byte b = mo16859g()[i];
            byte b2 = (byte) 65;
            if (b >= b2) {
                byte b3 = (byte) 90;
                if (b <= b3) {
                    byte[] g = mo16859g();
                    byte[] copyOf = Arrays.copyOf(g, g.length);
                    C5942k.m22324a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
                    copyOf[i] = (byte) (b + 32);
                    for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                        byte b4 = copyOf[i2];
                        if (b4 >= b2 && b4 <= b3) {
                            copyOf[i2] = (byte) (b4 + 32);
                        }
                    }
                    return new C6485h(copyOf);
                }
            }
        }
        return this;
    }

    /* renamed from: r */
    public String mo16870r() {
        String j = mo16863j();
        if (j != null) {
            return j;
        }
        String a = C6473b.m24469a(mo16865m());
        mo16853b(a);
        return a;
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        boolean z = true;
        if (mo16859g().length == 0) {
            return "[size=0]";
        }
        int a = C6471b.m24466b(mo16859g(), 64);
        String str = "…]";
        String str2 = "[size=";
        if (a != -1) {
            String r = mo16870r();
            if (r != null) {
                String substring = r.substring(0, a);
                C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String a2 = C5787p.m21971a(C5787p.m21971a(C5787p.m21971a(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (a < r.length()) {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(mo16859g().length);
                    sb2.append(" text=");
                    sb2.append(a2);
                    sb2.append(str);
                    return sb2.toString();
                }
                sb = new StringBuilder();
                sb.append("[text=");
                sb.append(a2);
            } else {
                throw new C5809q("null cannot be cast to non-null type java.lang.String");
            }
        } else if (mo16859g().length <= 64) {
            sb = new StringBuilder();
            sb.append("[hex=");
            sb.append(mo16864l());
        } else {
            sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(mo16859g().length);
            sb2.append(" hex=");
            if (64 > mo16859g().length) {
                z = false;
            }
            if (z) {
                sb2.append((64 == mo16859g().length ? this : new C6485h(C5830g.m22106a(mo16859g(), 0, 64))).mo16864l());
                sb2.append(str);
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > length(");
            sb3.append(mo16859g().length);
            sb3.append(')');
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        sb2.append(']');
        return sb2.toString();
    }
}
