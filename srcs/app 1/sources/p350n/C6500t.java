package p350n;

import p308k.p323z.p325d.C5942k;

/* renamed from: n.t */
public final class C6500t {

    /* renamed from: a */
    public final byte[] f16128a;

    /* renamed from: b */
    public int f16129b;

    /* renamed from: c */
    public int f16130c;

    /* renamed from: d */
    public boolean f16131d;

    /* renamed from: e */
    public boolean f16132e;

    /* renamed from: f */
    public C6500t f16133f;

    /* renamed from: g */
    public C6500t f16134g;

    /* renamed from: n.t$a */
    public static final class C6501a {
        private C6501a() {
        }

        public /* synthetic */ C6501a(C5938g gVar) {
            this();
        }
    }

    static {
        new C6501a(null);
    }

    public C6500t() {
        this.f16128a = new byte[8192];
        this.f16132e = true;
        this.f16131d = false;
    }

    public C6500t(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C5942k.m22327b(bArr, "data");
        this.f16128a = bArr;
        this.f16129b = i;
        this.f16130c = i2;
        this.f16131d = z;
        this.f16132e = z2;
    }

    /* renamed from: a */
    public final C6500t mo16914a(int i) {
        C6500t tVar;
        if (i > 0 && i <= this.f16130c - this.f16129b) {
            if (i >= 1024) {
                tVar = mo16919c();
            } else {
                tVar = C6502u.f16137c.mo16920a();
                byte[] bArr = this.f16128a;
                byte[] bArr2 = tVar.f16128a;
                int i2 = this.f16129b;
                C5830g.m22108a(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
            }
            tVar.f16130c = tVar.f16129b + i;
            this.f16129b += i;
            C6500t tVar2 = this.f16134g;
            if (tVar2 != null) {
                tVar2.mo16915a(tVar);
                return tVar;
            }
            C5942k.m22323a();
            throw null;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: a */
    public final C6500t mo16915a(C6500t tVar) {
        C5942k.m22327b(tVar, "segment");
        tVar.f16134g = this;
        tVar.f16133f = this.f16133f;
        C6500t tVar2 = this.f16133f;
        if (tVar2 != null) {
            tVar2.f16134g = tVar;
            this.f16133f = tVar;
            return tVar;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: a */
    public final void mo16916a() {
        int i = 0;
        if (this.f16134g != this) {
            C6500t tVar = this.f16134g;
            if (tVar == null) {
                C5942k.m22323a();
                throw null;
            } else if (tVar.f16132e) {
                int i2 = this.f16130c - this.f16129b;
                if (tVar != null) {
                    int i3 = 8192 - tVar.f16130c;
                    if (tVar != null) {
                        if (!tVar.f16131d) {
                            if (tVar != null) {
                                i = tVar.f16129b;
                            } else {
                                C5942k.m22323a();
                                throw null;
                            }
                        }
                        if (i2 <= i3 + i) {
                            C6500t tVar2 = this.f16134g;
                            if (tVar2 != null) {
                                mo16917a(tVar2, i2);
                                mo16918b();
                                C6502u.f16137c.mo16921a(this);
                                return;
                            }
                            C5942k.m22323a();
                            throw null;
                        }
                        return;
                    }
                    C5942k.m22323a();
                    throw null;
                }
                C5942k.m22323a();
                throw null;
            }
        } else {
            throw new IllegalStateException("cannot compact".toString());
        }
    }

    /* renamed from: a */
    public final void mo16917a(C6500t tVar, int i) {
        C5942k.m22327b(tVar, "sink");
        if (tVar.f16132e) {
            int i2 = tVar.f16130c;
            if (i2 + i > 8192) {
                if (!tVar.f16131d) {
                    int i3 = i2 + i;
                    int i4 = tVar.f16129b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = tVar.f16128a;
                        C5830g.m22108a(bArr, bArr, 0, i4, i2, 2, (Object) null);
                        tVar.f16130c -= tVar.f16129b;
                        tVar.f16129b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f16128a;
            byte[] bArr3 = tVar.f16128a;
            int i5 = tVar.f16130c;
            int i6 = this.f16129b;
            C5830g.m22107a(bArr2, bArr3, i5, i6, i6 + i);
            tVar.f16130c += i;
            this.f16129b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    /* renamed from: b */
    public final C6500t mo16918b() {
        C6500t tVar = this.f16133f;
        if (tVar == this) {
            tVar = null;
        }
        C6500t tVar2 = this.f16134g;
        if (tVar2 != null) {
            tVar2.f16133f = this.f16133f;
            C6500t tVar3 = this.f16133f;
            if (tVar3 != null) {
                tVar3.f16134g = tVar2;
                this.f16133f = null;
                this.f16134g = null;
                return tVar;
            }
            C5942k.m22323a();
            throw null;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: c */
    public final C6500t mo16919c() {
        this.f16131d = true;
        C6500t tVar = new C6500t(this.f16128a, this.f16129b, this.f16130c, true, false);
        return tVar;
    }
}
