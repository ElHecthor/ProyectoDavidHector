package p071f.p089f.p093b;

import p071f.p089f.p093b.C3188i.C3189a;

/* renamed from: f.f.b.b */
public class C3180b implements C3184a {

    /* renamed from: a */
    C3188i f9011a = null;

    /* renamed from: b */
    float f9012b = 0.0f;

    /* renamed from: c */
    boolean f9013c;

    /* renamed from: d */
    public final C3179a f9014d;

    /* renamed from: e */
    boolean f9015e = false;

    public C3180b(C3181c cVar) {
        this.f9014d = new C3179a(this, cVar);
    }

    /* renamed from: a */
    public C3180b mo10315a(float f, float f2, float f3, C3188i iVar, C3188i iVar2, C3188i iVar3, C3188i iVar4) {
        this.f9012b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f9014d.mo10308a(iVar, 1.0f);
            this.f9014d.mo10308a(iVar2, -1.0f);
            this.f9014d.mo10308a(iVar4, 1.0f);
            this.f9014d.mo10308a(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f9014d.mo10308a(iVar, 1.0f);
            this.f9014d.mo10308a(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f9014d.mo10308a(iVar3, 1.0f);
            this.f9014d.mo10308a(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f9014d.mo10308a(iVar, 1.0f);
            this.f9014d.mo10308a(iVar2, -1.0f);
            this.f9014d.mo10308a(iVar4, f4);
            this.f9014d.mo10308a(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: a */
    public C3180b mo10316a(C3183e eVar, int i) {
        this.f9014d.mo10308a(eVar.mo10344a(i, "ep"), 1.0f);
        this.f9014d.mo10308a(eVar.mo10344a(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3180b mo10317a(C3188i iVar, int i) {
        this.f9014d.mo10308a(iVar, (float) i);
        return this;
    }

    /* renamed from: a */
    public C3180b mo10318a(C3188i iVar, C3188i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f9012b = (float) i;
        }
        if (!z) {
            this.f9014d.mo10308a(iVar, -1.0f);
            this.f9014d.mo10308a(iVar2, 1.0f);
        } else {
            this.f9014d.mo10308a(iVar, 1.0f);
            this.f9014d.mo10308a(iVar2, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3180b mo10319a(C3188i iVar, C3188i iVar2, int i, float f, C3188i iVar3, C3188i iVar4, int i2) {
        float f2;
        if (iVar2 == iVar3) {
            this.f9014d.mo10308a(iVar, 1.0f);
            this.f9014d.mo10308a(iVar4, 1.0f);
            this.f9014d.mo10308a(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f9014d.mo10308a(iVar, 1.0f);
            this.f9014d.mo10308a(iVar2, -1.0f);
            this.f9014d.mo10308a(iVar3, -1.0f);
            this.f9014d.mo10308a(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                f2 = (float) ((-i) + i2);
            }
            return this;
        } else if (f <= 0.0f) {
            this.f9014d.mo10308a(iVar, -1.0f);
            this.f9014d.mo10308a(iVar2, 1.0f);
            f2 = (float) i;
        } else if (f >= 1.0f) {
            this.f9014d.mo10308a(iVar3, -1.0f);
            this.f9014d.mo10308a(iVar4, 1.0f);
            f2 = (float) i2;
        } else {
            float f3 = 1.0f - f;
            this.f9014d.mo10308a(iVar, f3 * 1.0f);
            this.f9014d.mo10308a(iVar2, f3 * -1.0f);
            this.f9014d.mo10308a(iVar3, -1.0f * f);
            this.f9014d.mo10308a(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = (((float) (-i)) * f3) + (((float) i2) * f);
            }
            return this;
        }
        this.f9012b = f2;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3180b mo10320a(C3188i iVar, C3188i iVar2, C3188i iVar3, float f) {
        this.f9014d.mo10308a(iVar, -1.0f);
        this.f9014d.mo10308a(iVar2, 1.0f - f);
        this.f9014d.mo10308a(iVar3, f);
        return this;
    }

    /* renamed from: a */
    public C3180b mo10321a(C3188i iVar, C3188i iVar2, C3188i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f9012b = (float) i;
        }
        if (!z) {
            this.f9014d.mo10308a(iVar, -1.0f);
            this.f9014d.mo10308a(iVar2, 1.0f);
            this.f9014d.mo10308a(iVar3, 1.0f);
        } else {
            this.f9014d.mo10308a(iVar, 1.0f);
            this.f9014d.mo10308a(iVar2, -1.0f);
            this.f9014d.mo10308a(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C3180b mo10322a(C3188i iVar, C3188i iVar2, C3188i iVar3, C3188i iVar4, float f) {
        this.f9014d.mo10308a(iVar, -1.0f);
        this.f9014d.mo10308a(iVar2, 1.0f);
        this.f9014d.mo10308a(iVar3, f);
        this.f9014d.mo10308a(iVar4, -f);
        return this;
    }

    /* renamed from: a */
    public C3188i mo10323a(C3183e eVar, boolean[] zArr) {
        return this.f9014d.mo10303a(zArr, (C3188i) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10324a() {
        float f = this.f9012b;
        if (f < 0.0f) {
            this.f9012b = f * -1.0f;
            this.f9014d.mo10313b();
        }
    }

    /* renamed from: a */
    public void mo10325a(C3184a aVar) {
        if (aVar instanceof C3180b) {
            C3180b bVar = (C3180b) aVar;
            this.f9011a = null;
            this.f9014d.mo10304a();
            int i = 0;
            while (true) {
                C3179a aVar2 = bVar.f9014d;
                if (i < aVar2.f9000a) {
                    this.f9014d.mo10309a(aVar2.mo10301a(i), bVar.f9014d.mo10311b(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo10326a(C3188i iVar) {
        int i = iVar.f9066d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f9014d.mo10308a(iVar, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo10327a(C3183e eVar) {
        boolean z;
        C3188i a = this.f9014d.mo10302a(eVar);
        if (a == null) {
            z = true;
        } else {
            mo10338d(a);
            z = false;
        }
        if (this.f9014d.f9000a == 0) {
            this.f9015e = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C3180b mo10328b(C3188i iVar, int i) {
        this.f9011a = iVar;
        float f = (float) i;
        iVar.f9067e = f;
        this.f9012b = f;
        this.f9015e = true;
        return this;
    }

    /* renamed from: b */
    public C3180b mo10329b(C3188i iVar, C3188i iVar2, C3188i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f9012b = (float) i;
        }
        if (!z) {
            this.f9014d.mo10308a(iVar, -1.0f);
            this.f9014d.mo10308a(iVar2, 1.0f);
            this.f9014d.mo10308a(iVar3, -1.0f);
        } else {
            this.f9014d.mo10308a(iVar, 1.0f);
            this.f9014d.mo10308a(iVar2, -1.0f);
            this.f9014d.mo10308a(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C3180b mo10330b(C3188i iVar, C3188i iVar2, C3188i iVar3, C3188i iVar4, float f) {
        this.f9014d.mo10308a(iVar3, 0.5f);
        this.f9014d.mo10308a(iVar4, 0.5f);
        this.f9014d.mo10308a(iVar, -0.5f);
        this.f9014d.mo10308a(iVar2, -0.5f);
        this.f9012b = -f;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo10331b() {
        C3188i iVar = this.f9011a;
        return iVar != null && (iVar.f9069g == C3189a.UNRESTRICTED || this.f9012b >= 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo10332b(C3188i iVar) {
        return this.f9014d.mo10310a(iVar);
    }

    /* renamed from: c */
    public C3180b mo10333c(C3188i iVar, int i) {
        C3179a aVar;
        float f;
        if (i < 0) {
            this.f9012b = (float) (i * -1);
            aVar = this.f9014d;
            f = 1.0f;
        } else {
            this.f9012b = (float) i;
            aVar = this.f9014d;
            f = -1.0f;
        }
        aVar.mo10308a(iVar, f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C3188i mo10334c(C3188i iVar) {
        return this.f9014d.mo10303a((boolean[]) null, iVar);
    }

    /* renamed from: c */
    public boolean mo10335c() {
        return this.f9011a == null && this.f9012b == 0.0f && this.f9014d.f9000a == 0;
    }

    public void clear() {
        this.f9014d.mo10304a();
        this.f9011a = null;
        this.f9012b = 0.0f;
    }

    /* renamed from: d */
    public void mo10337d() {
        this.f9011a = null;
        this.f9014d.mo10304a();
        this.f9012b = 0.0f;
        this.f9015e = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo10338d(C3188i iVar) {
        C3188i iVar2 = this.f9011a;
        if (iVar2 != null) {
            this.f9014d.mo10308a(iVar2, -1.0f);
            this.f9011a = null;
        }
        float a = this.f9014d.mo10300a(iVar, true) * -1.0f;
        this.f9011a = iVar;
        if (a != 1.0f) {
            this.f9012b /= a;
            this.f9014d.mo10305a(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo10339e() {
        /*
            r10 = this;
            f.f.b.i r0 = r10.f9011a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L_0x0021
        L_0x0014:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            f.f.b.i r1 = r10.f9011a
            r0.append(r1)
        L_0x0021:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f9012b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f9012b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            f.f.b.a r5 = r10.f9014d
            int r5 = r5.f9000a
        L_0x0057:
            if (r2 >= r5) goto L_0x00d0
            f.f.b.a r6 = r10.f9014d
            f.f.b.i r6 = r6.mo10301a(r2)
            if (r6 != 0) goto L_0x0062
            goto L_0x00cd
        L_0x0062:
            f.f.b.a r7 = r10.f9014d
            float r7 = r7.mo10311b(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x006d
            goto L_0x00cd
        L_0x006d:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0084
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x00a0
        L_0x0084:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L_0x0098
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00a9
        L_0x0098:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        L_0x00a0:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        L_0x00a9:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00b5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00c2
        L_0x00b5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00c2:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        L_0x00cd:
            int r2 = r2 + 1
            goto L_0x0057
        L_0x00d0:
            if (r1 != 0) goto L_0x00e3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.C3180b.mo10339e():java.lang.String");
    }

    public C3188i getKey() {
        return this.f9011a;
    }

    public String toString() {
        return mo10339e();
    }
}
