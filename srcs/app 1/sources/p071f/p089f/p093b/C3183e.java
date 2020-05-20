package p071f.p089f.p093b;

import java.util.Arrays;
import java.util.HashMap;
import p071f.p089f.p093b.C3188i.C3189a;
import p071f.p089f.p093b.p094j.C3193d;
import p071f.p089f.p093b.p094j.C3193d.C3195b;
import p071f.p089f.p093b.p094j.C3196e;

/* renamed from: f.f.b.e */
public class C3183e {

    /* renamed from: q */
    private static int f9019q = 1000;

    /* renamed from: r */
    public static C3185f f9020r;

    /* renamed from: a */
    int f9021a;

    /* renamed from: b */
    private HashMap<String, C3188i> f9022b;

    /* renamed from: c */
    private C3184a f9023c;

    /* renamed from: d */
    private int f9024d;

    /* renamed from: e */
    private int f9025e;

    /* renamed from: f */
    C3180b[] f9026f;

    /* renamed from: g */
    public boolean f9027g;

    /* renamed from: h */
    public boolean f9028h;

    /* renamed from: i */
    private boolean[] f9029i;

    /* renamed from: j */
    int f9030j;

    /* renamed from: k */
    int f9031k;

    /* renamed from: l */
    private int f9032l;

    /* renamed from: m */
    final C3181c f9033m;

    /* renamed from: n */
    private C3188i[] f9034n;

    /* renamed from: o */
    private int f9035o;

    /* renamed from: p */
    private final C3184a f9036p;

    /* renamed from: f.f.b.e$a */
    interface C3184a {
        /* renamed from: a */
        C3188i mo10323a(C3183e eVar, boolean[] zArr);

        /* renamed from: a */
        void mo10325a(C3184a aVar);

        /* renamed from: a */
        void mo10326a(C3188i iVar);

        void clear();

        C3188i getKey();
    }

    public C3183e() {
        this.f9021a = 0;
        this.f9022b = null;
        this.f9024d = 32;
        this.f9025e = 32;
        this.f9026f = null;
        this.f9027g = false;
        this.f9028h = false;
        this.f9029i = new boolean[32];
        this.f9030j = 1;
        this.f9031k = 0;
        this.f9032l = 32;
        this.f9034n = new C3188i[f9019q];
        this.f9035o = 0;
        this.f9026f = new C3180b[32];
        m12913j();
        C3181c cVar = new C3181c();
        this.f9033m = cVar;
        this.f9023c = new C3182d(cVar);
        this.f9036p = new C3180b(this.f9033m);
    }

    /* renamed from: a */
    private final int m12903a(C3184a aVar, boolean z) {
        C3185f fVar = f9020r;
        if (fVar != null) {
            fVar.f9042f++;
        }
        for (int i = 0; i < this.f9030j; i++) {
            this.f9029i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C3185f fVar2 = f9020r;
            if (fVar2 != null) {
                fVar2.f9043g++;
            }
            i2++;
            if (i2 >= this.f9030j * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f9029i[aVar.getKey().f9064b] = true;
            }
            C3188i a = aVar.mo10323a(this, this.f9029i);
            if (a != null) {
                boolean[] zArr = this.f9029i;
                int i3 = a.f9064b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f9031k; i5++) {
                    C3180b bVar = this.f9026f[i5];
                    if (bVar.f9011a.f9069g != C3189a.UNRESTRICTED && !bVar.f9015e && bVar.mo10332b(a)) {
                        float b = bVar.f9014d.mo10312b(a);
                        if (b < 0.0f) {
                            float f2 = (-bVar.f9012b) / b;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C3180b bVar2 = this.f9026f[i4];
                    bVar2.f9011a.f9065c = -1;
                    C3185f fVar3 = f9020r;
                    if (fVar3 != null) {
                        fVar3.f9044h++;
                    }
                    bVar2.mo10338d(a);
                    C3188i iVar = bVar2.f9011a;
                    iVar.f9065c = i4;
                    iVar.mo10370c(bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static C3180b m12904a(C3183e eVar, C3188i iVar, C3188i iVar2, C3188i iVar3, float f, boolean z) {
        C3180b b = eVar.mo10355b();
        if (z) {
            eVar.m12907b(b);
        }
        b.mo10320a(iVar, iVar2, iVar3, f);
        return b;
    }

    /* renamed from: a */
    private C3188i m12905a(C3189a aVar, String str) {
        C3188i iVar = (C3188i) this.f9033m.f9017b.mo10363a();
        if (iVar == null) {
            iVar = new C3188i(aVar, str);
        } else {
            iVar.mo10366a();
        }
        iVar.mo10368a(aVar, str);
        int i = this.f9035o;
        int i2 = f9019q;
        if (i >= i2) {
            int i3 = i2 * 2;
            f9019q = i3;
            this.f9034n = (C3188i[]) Arrays.copyOf(this.f9034n, i3);
        }
        C3188i[] iVarArr = this.f9034n;
        int i4 = this.f9035o;
        this.f9035o = i4 + 1;
        iVarArr[i4] = iVar;
        return iVar;
    }

    /* renamed from: b */
    private int m12906b(C3184a aVar) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f9031k) {
                z = false;
                break;
            }
            C3180b[] bVarArr = this.f9026f;
            if (bVarArr[i].f9011a.f9069g != C3189a.UNRESTRICTED && bVarArr[i].f9012b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C3185f fVar = f9020r;
            if (fVar != null) {
                fVar.f9045i++;
            }
            i2++;
            float f2 = Float.MAX_VALUE;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            while (i3 < this.f9031k) {
                C3180b bVar = this.f9026f[i3];
                if (bVar.f9011a.f9069g != C3189a.UNRESTRICTED && !bVar.f9015e && bVar.f9012b < f) {
                    int i7 = 1;
                    while (i7 < this.f9030j) {
                        C3188i iVar = this.f9033m.f9018c[i7];
                        float b = bVar.f9014d.mo10312b(iVar);
                        if (b > f) {
                            for (int i8 = 0; i8 < 7; i8++) {
                                float f3 = iVar.f9068f[i8] / b;
                                if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                    i5 = i7;
                                    i6 = i8;
                                    f2 = f3;
                                    i4 = i3;
                                }
                            }
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C3180b bVar2 = this.f9026f[i4];
                bVar2.f9011a.f9065c = -1;
                C3185f fVar2 = f9020r;
                if (fVar2 != null) {
                    fVar2.f9044h++;
                }
                bVar2.mo10338d(this.f9033m.f9018c[i5]);
                C3188i iVar2 = bVar2.f9011a;
                iVar2.f9065c = i4;
                iVar2.mo10370c(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f9030j / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: b */
    private void m12907b(C3180b bVar) {
        bVar.mo10316a(this, 0);
    }

    /* renamed from: c */
    private final void m12908c(C3180b bVar) {
        C3180b[] bVarArr = this.f9026f;
        int i = this.f9031k;
        if (bVarArr[i] != null) {
            this.f9033m.f9016a.mo10365a(bVarArr[i]);
        }
        C3180b[] bVarArr2 = this.f9026f;
        int i2 = this.f9031k;
        bVarArr2[i2] = bVar;
        C3188i iVar = bVar.f9011a;
        iVar.f9065c = i2;
        this.f9031k = i2 + 1;
        iVar.mo10370c(bVar);
    }

    /* renamed from: d */
    private final void m12909d(C3180b bVar) {
        if (this.f9031k > 0) {
            bVar.f9014d.mo10307a(bVar, this.f9026f);
            if (bVar.f9014d.f9000a == 0) {
                bVar.f9015e = true;
            }
        }
    }

    /* renamed from: g */
    private void m12910g() {
        for (int i = 0; i < this.f9031k; i++) {
            C3180b bVar = this.f9026f[i];
            bVar.f9011a.f9067e = bVar.f9012b;
        }
    }

    /* renamed from: h */
    public static C3185f m12911h() {
        return f9020r;
    }

    /* renamed from: i */
    private void m12912i() {
        int i = this.f9024d * 2;
        this.f9024d = i;
        this.f9026f = (C3180b[]) Arrays.copyOf(this.f9026f, i);
        C3181c cVar = this.f9033m;
        cVar.f9018c = (C3188i[]) Arrays.copyOf(cVar.f9018c, this.f9024d);
        int i2 = this.f9024d;
        this.f9029i = new boolean[i2];
        this.f9025e = i2;
        this.f9032l = i2;
        C3185f fVar = f9020r;
        if (fVar != null) {
            fVar.f9038b++;
            fVar.f9049m = Math.max(fVar.f9049m, (long) i2);
            C3185f fVar2 = f9020r;
            fVar2.f9058v = fVar2.f9049m;
        }
    }

    /* renamed from: j */
    private void m12913j() {
        int i = 0;
        while (true) {
            C3180b[] bVarArr = this.f9026f;
            if (i < bVarArr.length) {
                C3180b bVar = bVarArr[i];
                if (bVar != null) {
                    this.f9033m.f9016a.mo10365a(bVar);
                }
                this.f9026f[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public C3180b mo10342a(C3188i iVar, C3188i iVar2, int i, int i2) {
        C3180b b = mo10355b();
        b.mo10318a(iVar, iVar2, i);
        if (i2 != 6) {
            b.mo10316a(this, i2);
        }
        mo10346a(b);
        return b;
    }

    /* renamed from: a */
    public C3188i mo10343a() {
        C3185f fVar = f9020r;
        if (fVar != null) {
            fVar.f9048l++;
        }
        if (this.f9030j + 1 >= this.f9025e) {
            m12912i();
        }
        C3188i a = m12905a(C3189a.SLACK, (String) null);
        int i = this.f9021a + 1;
        this.f9021a = i;
        this.f9030j++;
        a.f9064b = i;
        this.f9033m.f9018c[i] = a;
        return a;
    }

    /* renamed from: a */
    public C3188i mo10344a(int i, String str) {
        C3185f fVar = f9020r;
        if (fVar != null) {
            fVar.f9046j++;
        }
        if (this.f9030j + 1 >= this.f9025e) {
            m12912i();
        }
        C3188i a = m12905a(C3189a.ERROR, str);
        int i2 = this.f9021a + 1;
        this.f9021a = i2;
        this.f9030j++;
        a.f9064b = i2;
        a.f9066d = i;
        this.f9033m.f9018c[i2] = a;
        this.f9023c.mo10326a(a);
        return a;
    }

    /* renamed from: a */
    public C3188i mo10345a(Object obj) {
        C3188i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f9030j + 1 >= this.f9025e) {
            m12912i();
        }
        if (obj instanceof C3193d) {
            C3193d dVar = (C3193d) obj;
            iVar = dVar.mo10389d();
            if (iVar == null) {
                dVar.mo10383a(this.f9033m);
                iVar = dVar.mo10389d();
            }
            int i = iVar.f9064b;
            if (i == -1 || i > this.f9021a || this.f9033m.f9018c[i] == null) {
                if (iVar.f9064b != -1) {
                    iVar.mo10366a();
                }
                int i2 = this.f9021a + 1;
                this.f9021a = i2;
                this.f9030j++;
                iVar.f9064b = i2;
                iVar.f9069g = C3189a.UNRESTRICTED;
                this.f9033m.f9018c[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: a */
    public void mo10346a(C3180b bVar) {
        if (bVar != null) {
            C3185f fVar = f9020r;
            if (fVar != null) {
                fVar.f9040d++;
                if (bVar.f9015e) {
                    fVar.f9041e++;
                }
            }
            boolean z = true;
            if (this.f9031k + 1 >= this.f9032l || this.f9030j + 1 >= this.f9025e) {
                m12912i();
            }
            boolean z2 = false;
            if (!bVar.f9015e) {
                m12909d(bVar);
                if (!bVar.mo10335c()) {
                    bVar.mo10324a();
                    if (bVar.mo10327a(this)) {
                        C3188i a = mo10343a();
                        bVar.f9011a = a;
                        m12908c(bVar);
                        this.f9036p.mo10325a((C3184a) bVar);
                        m12903a(this.f9036p, true);
                        if (a.f9065c == -1) {
                            if (bVar.f9011a == a) {
                                C3188i c = bVar.mo10334c(a);
                                if (c != null) {
                                    C3185f fVar2 = f9020r;
                                    if (fVar2 != null) {
                                        fVar2.f9044h++;
                                    }
                                    bVar.mo10338d(c);
                                }
                            }
                            if (!bVar.f9015e) {
                                bVar.f9011a.mo10370c(bVar);
                            }
                            this.f9031k--;
                        }
                    } else {
                        z = false;
                    }
                    if (bVar.mo10331b()) {
                        z2 = z;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z2) {
                m12908c(bVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10347a(C3180b bVar, int i, int i2) {
        bVar.mo10317a(mo10344a(i2, (String) null), i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10348a(C3184a aVar) {
        C3185f fVar = f9020r;
        if (fVar != null) {
            fVar.f9054r++;
            fVar.f9055s = Math.max(fVar.f9055s, (long) this.f9030j);
            C3185f fVar2 = f9020r;
            fVar2.f9056t = Math.max(fVar2.f9056t, (long) this.f9031k);
        }
        m12909d((C3180b) aVar);
        m12906b(aVar);
        m12903a(aVar, false);
        m12910g();
    }

    /* renamed from: a */
    public void mo10349a(C3188i iVar, int i) {
        C3180b bVar;
        int i2 = iVar.f9065c;
        if (i2 != -1) {
            C3180b bVar2 = this.f9026f[i2];
            if (!bVar2.f9015e) {
                if (bVar2.f9014d.f9000a == 0) {
                    bVar2.f9015e = true;
                } else {
                    bVar = mo10355b();
                    bVar.mo10333c(iVar, i);
                }
            }
            bVar2.f9012b = (float) i;
            return;
        }
        bVar = mo10355b();
        bVar.mo10328b(iVar, i);
        mo10346a(bVar);
    }

    /* renamed from: a */
    public void mo10350a(C3188i iVar, C3188i iVar2, int i, float f, C3188i iVar3, C3188i iVar4, int i2, int i3) {
        int i4 = i3;
        C3180b b = mo10355b();
        b.mo10319a(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i4 != 6) {
            b.mo10316a(this, i4);
        }
        mo10346a(b);
    }

    /* renamed from: a */
    public void mo10351a(C3188i iVar, C3188i iVar2, int i, boolean z) {
        C3180b b = mo10355b();
        C3188i c = mo10358c();
        c.f9066d = 5;
        b.mo10321a(iVar, iVar2, c, i);
        if (z) {
            mo10347a(b, (int) (b.f9014d.mo10312b(c) * -1.0f), 5);
        }
        mo10346a(b);
        mo10342a(iVar, iVar2, i, 4);
    }

    /* renamed from: a */
    public void mo10352a(C3188i iVar, C3188i iVar2, C3188i iVar3, C3188i iVar4, float f, int i) {
        C3180b b = mo10355b();
        b.mo10322a(iVar, iVar2, iVar3, iVar4, f);
        if (i != 6) {
            b.mo10316a(this, i);
        }
        mo10346a(b);
    }

    /* renamed from: a */
    public void mo10353a(C3196e eVar, C3196e eVar2, float f, int i) {
        C3196e eVar3 = eVar;
        C3196e eVar4 = eVar2;
        C3188i a = mo10345a((Object) eVar3.mo10402a(C3195b.LEFT));
        C3188i a2 = mo10345a((Object) eVar3.mo10402a(C3195b.TOP));
        C3188i a3 = mo10345a((Object) eVar3.mo10402a(C3195b.RIGHT));
        C3188i a4 = mo10345a((Object) eVar3.mo10402a(C3195b.BOTTOM));
        C3188i a5 = mo10345a((Object) eVar4.mo10402a(C3195b.LEFT));
        C3188i a6 = mo10345a((Object) eVar4.mo10402a(C3195b.TOP));
        C3188i a7 = mo10345a((Object) eVar4.mo10402a(C3195b.RIGHT));
        C3188i a8 = mo10345a((Object) eVar4.mo10402a(C3195b.BOTTOM));
        C3180b b = mo10355b();
        double d = (double) f;
        C3188i iVar = a3;
        double d2 = (double) i;
        C3188i iVar2 = a7;
        b.mo10330b(a2, a4, a6, a8, (float) (Math.sin(d) * d2));
        mo10346a(b);
        C3180b b2 = mo10355b();
        b2.mo10330b(a, iVar, a5, iVar2, (float) (Math.cos(d) * d2));
        mo10346a(b2);
    }

    /* renamed from: b */
    public int mo10354b(Object obj) {
        C3188i d = ((C3193d) obj).mo10389d();
        if (d != null) {
            return (int) (d.f9067e + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    public C3180b mo10355b() {
        C3180b bVar = (C3180b) this.f9033m.f9016a.mo10363a();
        if (bVar == null) {
            bVar = new C3180b(this.f9033m);
        } else {
            bVar.mo10337d();
        }
        C3188i.m12944b();
        return bVar;
    }

    /* renamed from: b */
    public void mo10356b(C3188i iVar, C3188i iVar2, int i, int i2) {
        C3180b b = mo10355b();
        C3188i c = mo10358c();
        c.f9066d = 0;
        b.mo10321a(iVar, iVar2, c, i);
        if (i2 != 6) {
            mo10347a(b, (int) (b.f9014d.mo10312b(c) * -1.0f), i2);
        }
        mo10346a(b);
    }

    /* renamed from: b */
    public void mo10357b(C3188i iVar, C3188i iVar2, int i, boolean z) {
        C3180b b = mo10355b();
        C3188i c = mo10358c();
        c.f9066d = 5;
        b.mo10329b(iVar, iVar2, c, i);
        if (z) {
            mo10347a(b, (int) (b.f9014d.mo10312b(c) * -1.0f), 5);
        }
        mo10346a(b);
        mo10342a(iVar, iVar2, i, 4);
    }

    /* renamed from: c */
    public C3188i mo10358c() {
        C3185f fVar = f9020r;
        if (fVar != null) {
            fVar.f9047k++;
        }
        if (this.f9030j + 1 >= this.f9025e) {
            m12912i();
        }
        C3188i a = m12905a(C3189a.SLACK, (String) null);
        int i = this.f9021a + 1;
        this.f9021a = i;
        this.f9030j++;
        a.f9064b = i;
        this.f9033m.f9018c[i] = a;
        return a;
    }

    /* renamed from: c */
    public void mo10359c(C3188i iVar, C3188i iVar2, int i, int i2) {
        C3180b b = mo10355b();
        C3188i c = mo10358c();
        c.f9066d = 0;
        b.mo10329b(iVar, iVar2, c, i);
        if (i2 != 6) {
            mo10347a(b, (int) (b.f9014d.mo10312b(c) * -1.0f), i2);
        }
        mo10346a(b);
    }

    /* renamed from: d */
    public C3181c mo10360d() {
        return this.f9033m;
    }

    /* renamed from: e */
    public void mo10361e() {
        C3185f fVar = f9020r;
        if (fVar != null) {
            fVar.f9039c++;
        }
        if (this.f9027g || this.f9028h) {
            C3185f fVar2 = f9020r;
            if (fVar2 != null) {
                fVar2.f9051o++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f9031k) {
                    z = true;
                    break;
                } else if (!this.f9026f[i].f9015e) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                C3185f fVar3 = f9020r;
                if (fVar3 != null) {
                    fVar3.f9050n++;
                }
                m12910g();
                return;
            }
        }
        mo10348a(this.f9023c);
    }

    /* renamed from: f */
    public void mo10362f() {
        C3181c cVar;
        int i = 0;
        while (true) {
            cVar = this.f9033m;
            C3188i[] iVarArr = cVar.f9018c;
            if (i >= iVarArr.length) {
                break;
            }
            C3188i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo10366a();
            }
            i++;
        }
        cVar.f9017b.mo10364a(this.f9034n, this.f9035o);
        this.f9035o = 0;
        Arrays.fill(this.f9033m.f9018c, null);
        HashMap<String, C3188i> hashMap = this.f9022b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f9021a = 0;
        this.f9023c.clear();
        this.f9030j = 1;
        for (int i2 = 0; i2 < this.f9031k; i2++) {
            this.f9026f[i2].f9013c = false;
        }
        m12913j();
        this.f9031k = 0;
    }
}
