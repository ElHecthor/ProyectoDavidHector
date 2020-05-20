package p350n;

import java.security.MessageDigest;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p350n.p351a0.C6472c;

/* renamed from: n.v */
public final class C6503v extends C6485h {

    /* renamed from: k */
    private final transient byte[][] f16138k;

    /* renamed from: l */
    private final transient int[] f16139l;

    public C6503v(byte[][] bArr, int[] iArr) {
        C5942k.m22327b(bArr, "segments");
        C5942k.m22327b(iArr, "directory");
        super(C6485h.f16097i.mo16859g());
        this.f16138k = bArr;
        this.f16139l = iArr;
    }

    /* renamed from: v */
    private final C6485h m24673v() {
        return new C6485h(mo16924u());
    }

    private final Object writeReplace() {
        C6485h v = m24673v();
        if (v != null) {
            return v;
        }
        throw new C5809q("null cannot be cast to non-null type java.lang.Object");
    }

    /* renamed from: a */
    public C6485h mo16848a(String str) {
        C5942k.m22327b(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = mo16923t().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = mo16922s()[length + i];
            int i4 = mo16922s()[i];
            instance.update(mo16923t()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        C5942k.m22324a((Object) digest, "digest.digest()");
        return new C6485h(digest);
    }

    /* renamed from: a */
    public void mo16849a(C6480e eVar, int i, int i2) {
        C5942k.m22327b(eVar, "buffer");
        int i3 = i2 + i;
        int a = C6472c.m24467a(this, i);
        while (i < i3) {
            int i4 = a == 0 ? 0 : mo16922s()[a - 1];
            int min = Math.min(i3, (mo16922s()[a] - i4) + i4) - i;
            int i5 = mo16922s()[mo16923t().length + a] + (i - i4);
            C6500t tVar = new C6500t(mo16923t()[a], i5, i5 + min, true, false);
            C6500t tVar2 = eVar.f16093f;
            if (tVar2 == null) {
                tVar.f16134g = tVar;
                tVar.f16133f = tVar;
                eVar.f16093f = tVar;
            } else if (tVar2 != null) {
                C6500t tVar3 = tVar2.f16134g;
                if (tVar3 != null) {
                    tVar3.mo16915a(tVar);
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            } else {
                C5942k.m22323a();
                throw null;
            }
            i += min;
            a++;
        }
        eVar.mo16808j(eVar.mo16834x() + ((long) mo16868p()));
    }

    /* renamed from: a */
    public boolean mo16850a(int i, C6485h hVar, int i2, int i3) {
        C5942k.m22327b(hVar, "other");
        if (i < 0 || i > mo16868p() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int a = C6472c.m24467a(this, i);
        while (i < i4) {
            int i5 = a == 0 ? 0 : mo16922s()[a - 1];
            int min = Math.min(i4, (mo16922s()[a] - i5) + i5) - i;
            if (!hVar.mo16851a(i2, mo16923t()[a], mo16922s()[mo16923t().length + a] + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo16851a(int i, byte[] bArr, int i2, int i3) {
        C5942k.m22327b(bArr, "other");
        if (i < 0 || i > mo16868p() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int a = C6472c.m24467a(this, i);
        while (i < i4) {
            int i5 = a == 0 ? 0 : mo16922s()[a - 1];
            int min = Math.min(i4, (mo16922s()[a] - i5) + i5) - i;
            if (!C6474c.m24475a(mo16923t()[a], mo16922s()[mo16923t().length + a] + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    /* renamed from: b */
    public byte mo16852b(int i) {
        C6474c.m24474a((long) mo16922s()[mo16923t().length - 1], (long) i, 1);
        int a = C6472c.m24467a(this, i);
        return mo16923t()[a][(i - (a == 0 ? 0 : mo16922s()[a - 1])) + mo16922s()[mo16923t().length + a]];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6485h) {
            C6485h hVar = (C6485h) obj;
            if (hVar.mo16868p() == mo16868p() && mo16850a(0, hVar, 0, mo16868p())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo16858f() {
        return m24673v().mo16858f();
    }

    public int hashCode() {
        int h = mo16860h();
        if (h != 0) {
            return h;
        }
        int length = mo16923t().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = mo16922s()[length + i];
            int i5 = mo16922s()[i];
            byte[] bArr = mo16923t()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        mo16855c(i2);
        return i2;
    }

    /* renamed from: i */
    public int mo16862i() {
        return mo16922s()[mo16923t().length - 1];
    }

    /* renamed from: l */
    public String mo16864l() {
        return m24673v().mo16864l();
    }

    /* renamed from: m */
    public byte[] mo16865m() {
        return mo16924u();
    }

    /* renamed from: q */
    public C6485h mo16869q() {
        return m24673v().mo16869q();
    }

    /* renamed from: s */
    public final int[] mo16922s() {
        return this.f16139l;
    }

    /* renamed from: t */
    public final byte[][] mo16923t() {
        return this.f16138k;
    }

    public String toString() {
        return m24673v().toString();
    }

    /* renamed from: u */
    public byte[] mo16924u() {
        byte[] bArr = new byte[mo16868p()];
        int length = mo16923t().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = mo16922s()[length + i];
            int i5 = mo16922s()[i];
            int i6 = i5 - i2;
            C5830g.m22107a(mo16923t()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }
}
