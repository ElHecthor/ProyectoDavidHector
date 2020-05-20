package p337m.p338f0.p344h;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6250b;
import p350n.C6480e;
import p350n.C6483f;
import p350n.C6484g;
import p350n.C6485h;
import p350n.C6493o;
import p350n.C6506y;

/* renamed from: m.f0.h.d */
public final class C6319d {

    /* renamed from: a */
    private static final C6317c[] f15631a;

    /* renamed from: b */
    private static final Map<C6485h, Integer> f15632b;

    /* renamed from: c */
    public static final C6319d f15633c;

    /* renamed from: m.f0.h.d$a */
    public static final class C6320a {

        /* renamed from: a */
        private final List<C6317c> f15634a;

        /* renamed from: b */
        private final C6484g f15635b;

        /* renamed from: c */
        public C6317c[] f15636c;

        /* renamed from: d */
        private int f15637d;

        /* renamed from: e */
        public int f15638e;

        /* renamed from: f */
        public int f15639f;

        /* renamed from: g */
        private final int f15640g;

        /* renamed from: h */
        private int f15641h;

        public C6320a(C6506y yVar, int i, int i2) {
            C5942k.m22327b(yVar, "source");
            this.f15640g = i;
            this.f15641h = i2;
            this.f15634a = new ArrayList();
            this.f15635b = C6493o.m24623a(yVar);
            C6317c[] cVarArr = new C6317c[8];
            this.f15636c = cVarArr;
            this.f15637d = cVarArr.length - 1;
        }

        public /* synthetic */ C6320a(C6506y yVar, int i, int i2, int i3, C5938g gVar) {
            if ((i3 & 4) != 0) {
                i2 = i;
            }
            this(yVar, i, i2);
        }

        /* renamed from: a */
        private final int m23759a(int i) {
            return this.f15637d + 1 + i;
        }

        /* renamed from: a */
        private final void m23760a(int i, C6317c cVar) {
            this.f15634a.add(cVar);
            int i2 = cVar.f15628a;
            if (i != -1) {
                C6317c cVar2 = this.f15636c[m23759a(i)];
                if (cVar2 != null) {
                    i2 -= cVar2.f15628a;
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            }
            int i3 = this.f15641h;
            if (i2 > i3) {
                m23765e();
                return;
            }
            int b = m23761b((this.f15639f + i2) - i3);
            if (i == -1) {
                int i4 = this.f15638e + 1;
                C6317c[] cVarArr = this.f15636c;
                if (i4 > cVarArr.length) {
                    C6317c[] cVarArr2 = new C6317c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f15637d = this.f15636c.length - 1;
                    this.f15636c = cVarArr2;
                }
                int i5 = this.f15637d;
                this.f15637d = i5 - 1;
                this.f15636c[i5] = cVar;
                this.f15638e++;
            } else {
                this.f15636c[i + m23759a(i) + b] = cVar;
            }
            this.f15639f += i2;
        }

        /* renamed from: b */
        private final int m23761b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f15636c.length;
                while (true) {
                    length--;
                    if (length < this.f15637d || i <= 0) {
                        C6317c[] cVarArr = this.f15636c;
                        int i3 = this.f15637d;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i2, this.f15638e);
                        this.f15637d += i2;
                    } else {
                        C6317c cVar = this.f15636c[length];
                        if (cVar != null) {
                            int i4 = cVar.f15628a;
                            i -= i4;
                            this.f15639f -= i4;
                            this.f15638e--;
                            i2++;
                        } else {
                            C5942k.m22323a();
                            throw null;
                        }
                    }
                }
                C6317c[] cVarArr2 = this.f15636c;
                int i32 = this.f15637d;
                System.arraycopy(cVarArr2, i32 + 1, cVarArr2, i32 + 1 + i2, this.f15638e);
                this.f15637d += i2;
            }
            return i2;
        }

        /* renamed from: c */
        private final C6485h m23762c(int i) {
            C6317c cVar;
            if (m23764d(i)) {
                cVar = C6319d.f15633c.mo16282b()[i];
            } else {
                int a = m23759a(i - C6319d.f15633c.mo16282b().length);
                if (a >= 0) {
                    C6317c[] cVarArr = this.f15636c;
                    if (a < cVarArr.length) {
                        cVar = cVarArr[a];
                        if (cVar == null) {
                            C5942k.m22323a();
                            throw null;
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Header index too large ");
                sb.append(i + 1);
                throw new IOException(sb.toString());
            }
            return cVar.f15629b;
        }

        /* renamed from: d */
        private final void m23763d() {
            int i = this.f15641h;
            int i2 = this.f15639f;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m23765e();
            } else {
                m23761b(i2 - i);
            }
        }

        /* renamed from: d */
        private final boolean m23764d(int i) {
            return i >= 0 && i <= C6319d.f15633c.mo16282b().length - 1;
        }

        /* renamed from: e */
        private final void m23765e() {
            C5830g.m22104a(this.f15636c, null, 0, 0, 6, null);
            this.f15637d = this.f15636c.length - 1;
            this.f15638e = 0;
            this.f15639f = 0;
        }

        /* renamed from: e */
        private final void m23766e(int i) {
            if (m23764d(i)) {
                this.f15634a.add(C6319d.f15633c.mo16282b()[i]);
                return;
            }
            int a = m23759a(i - C6319d.f15633c.mo16282b().length);
            if (a >= 0) {
                C6317c[] cVarArr = this.f15636c;
                if (a < cVarArr.length) {
                    List<C6317c> list = this.f15634a;
                    C6317c cVar = cVarArr[a];
                    if (cVar != null) {
                        list.add(cVar);
                        return;
                    } else {
                        C5942k.m22323a();
                        throw null;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* renamed from: f */
        private final int m23767f() {
            return C6250b.m23430a(this.f15635b.readByte(), 255);
        }

        /* renamed from: f */
        private final void m23768f(int i) {
            m23760a(-1, new C6317c(m23762c(i), mo16285b()));
        }

        /* renamed from: g */
        private final void m23769g() {
            C6319d dVar = C6319d.f15633c;
            C6485h b = mo16285b();
            dVar.mo16281a(b);
            m23760a(-1, new C6317c(b, mo16285b()));
        }

        /* renamed from: g */
        private final void m23770g(int i) {
            this.f15634a.add(new C6317c(m23762c(i), mo16285b()));
        }

        /* renamed from: h */
        private final void m23771h() {
            C6319d dVar = C6319d.f15633c;
            C6485h b = mo16285b();
            dVar.mo16281a(b);
            this.f15634a.add(new C6317c(b, mo16285b()));
        }

        /* renamed from: a */
        public final int mo16283a(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int f = m23767f();
                if ((f & 128) == 0) {
                    return i2 + (f << i4);
                }
                i2 += (f & 127) << i4;
                i4 += 7;
            }
        }

        /* renamed from: a */
        public final List<C6317c> mo16284a() {
            List<C6317c> d = C5845t.m22184d((Iterable<? extends T>) this.f15634a);
            this.f15634a.clear();
            return d;
        }

        /* renamed from: b */
        public final C6485h mo16285b() {
            int f = m23767f();
            long a = (long) mo16283a(f, 127);
            if (!((f & 128) == 128)) {
                return this.f15635b.mo16790b(a);
            }
            C6480e eVar = new C6480e();
            C6355k.f15790d.mo16421a(this.f15635b, a, (C6483f) eVar);
            return eVar.mo16821s();
        }

        /* renamed from: c */
        public final void mo16286c() {
            while (!this.f15635b.mo16809j()) {
                int a = C6250b.m23430a(this.f15635b.readByte(), 255);
                if (a == 128) {
                    throw new IOException("index == 0");
                } else if ((a & 128) == 128) {
                    m23766e(mo16283a(a, 127) - 1);
                } else if (a == 64) {
                    m23769g();
                } else if ((a & 64) == 64) {
                    m23768f(mo16283a(a, 63) - 1);
                } else if ((a & 32) == 32) {
                    int a2 = mo16283a(a, 31);
                    this.f15641h = a2;
                    if (a2 < 0 || a2 > this.f15640g) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid dynamic table size update ");
                        sb.append(this.f15641h);
                        throw new IOException(sb.toString());
                    }
                    m23763d();
                } else if (a == 16 || a == 0) {
                    m23771h();
                } else {
                    m23770g(mo16283a(a, 15) - 1);
                }
            }
        }
    }

    /* renamed from: m.f0.h.d$b */
    public static final class C6321b {

        /* renamed from: a */
        private int f15642a;

        /* renamed from: b */
        private boolean f15643b;

        /* renamed from: c */
        public int f15644c;

        /* renamed from: d */
        public C6317c[] f15645d;

        /* renamed from: e */
        private int f15646e;

        /* renamed from: f */
        public int f15647f;

        /* renamed from: g */
        public int f15648g;

        /* renamed from: h */
        public int f15649h;

        /* renamed from: i */
        private final boolean f15650i;

        /* renamed from: j */
        private final C6480e f15651j;

        public C6321b(int i, boolean z, C6480e eVar) {
            C5942k.m22327b(eVar, "out");
            this.f15649h = i;
            this.f15650i = z;
            this.f15651j = eVar;
            this.f15642a = Integer.MAX_VALUE;
            this.f15644c = i;
            C6317c[] cVarArr = new C6317c[8];
            this.f15645d = cVarArr;
            this.f15646e = cVarArr.length - 1;
        }

        public /* synthetic */ C6321b(int i, boolean z, C6480e eVar, int i2, C5938g gVar) {
            if ((i2 & 1) != 0) {
                i = 4096;
            }
            if ((i2 & 2) != 0) {
                z = true;
            }
            this(i, z, eVar);
        }

        /* renamed from: a */
        private final void m23776a() {
            int i = this.f15644c;
            int i2 = this.f15648g;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m23779b();
            } else {
                m23778b(i2 - i);
            }
        }

        /* renamed from: a */
        private final void m23777a(C6317c cVar) {
            int i = cVar.f15628a;
            int i2 = this.f15644c;
            if (i > i2) {
                m23779b();
                return;
            }
            m23778b((this.f15648g + i) - i2);
            int i3 = this.f15647f + 1;
            C6317c[] cVarArr = this.f15645d;
            if (i3 > cVarArr.length) {
                C6317c[] cVarArr2 = new C6317c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f15646e = this.f15645d.length - 1;
                this.f15645d = cVarArr2;
            }
            int i4 = this.f15646e;
            this.f15646e = i4 - 1;
            this.f15645d[i4] = cVar;
            this.f15647f++;
            this.f15648g += i;
        }

        /* renamed from: b */
        private final int m23778b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f15645d.length;
                while (true) {
                    length--;
                    if (length < this.f15646e || i <= 0) {
                        C6317c[] cVarArr = this.f15645d;
                        int i3 = this.f15646e;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i2, this.f15647f);
                        C6317c[] cVarArr2 = this.f15645d;
                        int i4 = this.f15646e;
                        Arrays.fill(cVarArr2, i4 + 1, i4 + 1 + i2, null);
                        this.f15646e += i2;
                    } else {
                        C6317c[] cVarArr3 = this.f15645d;
                        C6317c cVar = cVarArr3[length];
                        if (cVar != null) {
                            i -= cVar.f15628a;
                            int i5 = this.f15648g;
                            C6317c cVar2 = cVarArr3[length];
                            if (cVar2 != null) {
                                this.f15648g = i5 - cVar2.f15628a;
                                this.f15647f--;
                                i2++;
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
                C6317c[] cVarArr4 = this.f15645d;
                int i32 = this.f15646e;
                System.arraycopy(cVarArr4, i32 + 1, cVarArr4, i32 + 1 + i2, this.f15647f);
                C6317c[] cVarArr22 = this.f15645d;
                int i42 = this.f15646e;
                Arrays.fill(cVarArr22, i42 + 1, i42 + 1 + i2, null);
                this.f15646e += i2;
            }
            return i2;
        }

        /* renamed from: b */
        private final void m23779b() {
            C5830g.m22104a(this.f15645d, null, 0, 0, 6, null);
            this.f15646e = this.f15645d.length - 1;
            this.f15647f = 0;
            this.f15648g = 0;
        }

        /* renamed from: a */
        public final void mo16287a(int i) {
            this.f15649h = i;
            int min = Math.min(i, 16384);
            int i2 = this.f15644c;
            if (i2 != min) {
                if (min < i2) {
                    this.f15642a = Math.min(this.f15642a, min);
                }
                this.f15643b = true;
                this.f15644c = min;
                m23776a();
            }
        }

        /* renamed from: a */
        public final void mo16288a(int i, int i2, int i3) {
            int i4;
            C6480e eVar;
            if (i < i2) {
                eVar = this.f15651j;
                i4 = i | i3;
            } else {
                this.f15651j.writeByte(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f15651j.writeByte(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                eVar = this.f15651j;
            }
            eVar.writeByte(i4);
        }

        /* renamed from: a */
        public final void mo16289a(List<C6317c> list) {
            int i;
            int i2;
            C5942k.m22327b(list, "headerBlock");
            if (this.f15643b) {
                int i3 = this.f15642a;
                if (i3 < this.f15644c) {
                    mo16288a(i3, 31, 32);
                }
                this.f15643b = false;
                this.f15642a = Integer.MAX_VALUE;
                mo16288a(this.f15644c, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C6317c cVar = (C6317c) list.get(i4);
                C6485h q = cVar.f15629b.mo16869q();
                C6485h hVar = cVar.f15630c;
                Integer num = (Integer) C6319d.f15633c.mo16280a().get(q);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (2 <= i2 && 7 >= i2) {
                        if (C5942k.m22326a((Object) C6319d.f15633c.mo16282b()[i2 - 1].f15630c, (Object) hVar)) {
                            i = i2;
                        } else if (C5942k.m22326a((Object) C6319d.f15633c.mo16282b()[i2].f15630c, (Object) hVar)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f15646e + 1;
                    int length = this.f15645d.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        C6317c cVar2 = this.f15645d[i5];
                        if (cVar2 != null) {
                            if (C5942k.m22326a((Object) cVar2.f15629b, (Object) q)) {
                                C6317c cVar3 = this.f15645d[i5];
                                if (cVar3 == null) {
                                    C5942k.m22323a();
                                    throw null;
                                } else if (C5942k.m22326a((Object) cVar3.f15630c, (Object) hVar)) {
                                    i2 = C6319d.f15633c.mo16282b().length + (i5 - this.f15646e);
                                    break;
                                } else if (i == -1) {
                                    i = (i5 - this.f15646e) + C6319d.f15633c.mo16282b().length;
                                }
                            }
                            i5++;
                        } else {
                            C5942k.m22323a();
                            throw null;
                        }
                    }
                }
                if (i2 != -1) {
                    mo16288a(i2, 127, 128);
                } else {
                    if (i == -1) {
                        this.f15651j.writeByte(64);
                        mo16290a(q);
                    } else if (!q.mo16854b(C6317c.f15622d) || !(!C5942k.m22326a((Object) C6317c.f15627i, (Object) q))) {
                        mo16288a(i, 63, 64);
                    } else {
                        mo16288a(i, 15, 0);
                        mo16290a(hVar);
                    }
                    mo16290a(hVar);
                    m23777a(cVar);
                }
            }
        }

        /* renamed from: a */
        public final void mo16290a(C6485h hVar) {
            int i;
            int i2;
            C5942k.m22327b(hVar, "data");
            if (!this.f15650i || C6355k.f15790d.mo16420a(hVar) >= hVar.mo16868p()) {
                i2 = hVar.mo16868p();
                i = 0;
            } else {
                C6480e eVar = new C6480e();
                C6355k.f15790d.mo16422a(hVar, eVar);
                hVar = eVar.mo16821s();
                i2 = hVar.mo16868p();
                i = 128;
            }
            mo16288a(i2, 127, i);
            this.f15651j.mo16788a(hVar);
        }
    }

    static {
        C6319d dVar = new C6319d();
        f15633c = dVar;
        String str = "";
        f15631a = new C6317c[]{new C6317c(C6317c.f15627i, str), new C6317c(C6317c.f15624f, "GET"), new C6317c(C6317c.f15624f, "POST"), new C6317c(C6317c.f15625g, "/"), new C6317c(C6317c.f15625g, "/index.html"), new C6317c(C6317c.f15626h, "http"), new C6317c(C6317c.f15626h, "https"), new C6317c(C6317c.f15623e, "200"), new C6317c(C6317c.f15623e, "204"), new C6317c(C6317c.f15623e, "206"), new C6317c(C6317c.f15623e, "304"), new C6317c(C6317c.f15623e, "400"), new C6317c(C6317c.f15623e, "404"), new C6317c(C6317c.f15623e, "500"), new C6317c("accept-charset", str), new C6317c("accept-encoding", "gzip, deflate"), new C6317c("accept-language", str), new C6317c("accept-ranges", str), new C6317c("accept", str), new C6317c("access-control-allow-origin", str), new C6317c("age", str), new C6317c("allow", str), new C6317c("authorization", str), new C6317c("cache-control", str), new C6317c("content-disposition", str), new C6317c("content-encoding", str), new C6317c("content-language", str), new C6317c("content-length", str), new C6317c("content-location", str), new C6317c("content-range", str), new C6317c("content-type", str), new C6317c("cookie", str), new C6317c("date", str), new C6317c("etag", str), new C6317c("expect", str), new C6317c("expires", str), new C6317c("from", str), new C6317c("host", str), new C6317c("if-match", str), new C6317c("if-modified-since", str), new C6317c("if-none-match", str), new C6317c("if-range", str), new C6317c("if-unmodified-since", str), new C6317c("last-modified", str), new C6317c("link", str), new C6317c("location", str), new C6317c("max-forwards", str), new C6317c("proxy-authenticate", str), new C6317c("proxy-authorization", str), new C6317c("range", str), new C6317c("referer", str), new C6317c("refresh", str), new C6317c("retry-after", str), new C6317c("server", str), new C6317c("set-cookie", str), new C6317c("strict-transport-security", str), new C6317c("transfer-encoding", str), new C6317c("user-agent", str), new C6317c("vary", str), new C6317c("via", str), new C6317c("www-authenticate", str)};
        f15632b = dVar.m23755c();
    }

    private C6319d() {
    }

    /* renamed from: c */
    private final Map<C6485h, Integer> m23755c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f15631a.length);
        int length = f15631a.length;
        for (int i = 0; i < length; i++) {
            if (!linkedHashMap.containsKey(f15631a[i].f15629b)) {
                linkedHashMap.put(f15631a[i].f15629b, Integer.valueOf(i));
            }
        }
        Map<C6485h, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C5942k.m22324a((Object) unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    /* renamed from: a */
    public final Map<C6485h, Integer> mo16280a() {
        return f15632b;
    }

    /* renamed from: a */
    public final C6485h mo16281a(C6485h hVar) {
        C5942k.m22327b(hVar, "name");
        int p = hVar.mo16868p();
        for (int i = 0; i < p; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte a = hVar.mo16846a(i);
            if (b <= a && b2 >= a) {
                StringBuilder sb = new StringBuilder();
                sb.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(hVar.mo16870r());
                throw new IOException(sb.toString());
            }
        }
        return hVar;
    }

    /* renamed from: b */
    public final C6317c[] mo16282b() {
        return f15631a;
    }
}
