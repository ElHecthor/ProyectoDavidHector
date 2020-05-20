package p071f.p089f.p093b.p094j.p095n;

import p071f.p089f.p093b.p094j.C3193d;
import p071f.p089f.p093b.p094j.C3196e;
import p071f.p089f.p093b.p094j.C3196e.C3198b;

/* renamed from: f.f.b.j.n.m */
public abstract class C3226m implements C3214d {

    /* renamed from: a */
    public int f9308a;

    /* renamed from: b */
    C3196e f9309b;

    /* renamed from: c */
    C3223k f9310c;

    /* renamed from: d */
    protected C3198b f9311d;

    /* renamed from: e */
    C3218g f9312e = new C3218g(this);

    /* renamed from: f */
    public int f9313f = 0;

    /* renamed from: g */
    boolean f9314g = false;

    /* renamed from: h */
    public C3216f f9315h = new C3216f(this);

    /* renamed from: i */
    public C3216f f9316i = new C3216f(this);

    /* renamed from: j */
    protected C3228b f9317j = C3228b.NONE;

    /* renamed from: f.f.b.j.n.m$a */
    static /* synthetic */ class C3227a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9318a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                f.f.b.j.d$b[] r0 = p071f.p089f.p093b.p094j.C3193d.C3195b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9318a = r0
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9318a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9318a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9318a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9318a     // Catch:{ NoSuchFieldError -> 0x003e }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.p095n.C3226m.C3227a.<clinit>():void");
        }
    }

    /* renamed from: f.f.b.j.n.m$b */
    enum C3228b {
        NONE,
        START,
        END,
        CENTER
    }

    public C3226m(C3196e eVar) {
        this.f9309b = eVar;
    }

    /* renamed from: b */
    private void m13247b(int i, int i2) {
        int i3;
        C3218g gVar;
        int i4 = this.f9308a;
        if (i4 != 0) {
            if (i4 == 1) {
                int a = mo10574a(this.f9312e.f9298m, i);
                gVar = this.f9312e;
                i3 = Math.min(a, i2);
                gVar.mo10565a(i3);
            } else if (i4 == 2) {
                C3196e r = this.f9309b.mo10462r();
                if (r != null) {
                    C3226m mVar = i == 0 ? r.f9152d : r.f9153e;
                    if (mVar.f9312e.f9286j) {
                        C3196e eVar = this.f9309b;
                        i2 = (int) ((((float) mVar.f9312e.f9283g) * (i == 0 ? eVar.f9163o : eVar.f9166r)) + 0.5f);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i4 == 3) {
                C3196e eVar2 = this.f9309b;
                C3221j jVar = eVar2.f9152d;
                C3198b bVar = jVar.f9311d;
                C3198b bVar2 = C3198b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && jVar.f9308a == 3) {
                    C3224l lVar = eVar2.f9153e;
                    if (lVar.f9311d == bVar2 && lVar.f9308a == 3) {
                        return;
                    }
                }
                C3196e eVar3 = this.f9309b;
                C3226m mVar2 = i == 0 ? eVar3.f9153e : eVar3.f9152d;
                if (mVar2.f9312e.f9286j) {
                    float g = this.f9309b.mo10440g();
                    this.f9312e.mo10565a(i == 1 ? (int) ((((float) mVar2.f9312e.f9283g) / g) + 0.5f) : (int) ((g * ((float) mVar2.f9312e.f9283g)) + 0.5f));
                    return;
                }
                return;
            } else {
                return;
            }
        }
        gVar = this.f9312e;
        i3 = mo10574a(i2, i);
        gVar.mo10565a(i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10574a(int i, int i2) {
        int i3;
        if (i2 == 0) {
            C3196e eVar = this.f9309b;
            int i4 = eVar.f9162n;
            i3 = Math.max(eVar.f9161m, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            C3196e eVar2 = this.f9309b;
            int i5 = eVar2.f9165q;
            int max = Math.max(eVar2.f9164p, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3216f mo10575a(C3193d dVar) {
        C3226m mVar;
        C3226m mVar2;
        C3193d dVar2 = dVar.f9104c;
        C3216f fVar = null;
        if (dVar2 == null) {
            return null;
        }
        C3196e eVar = dVar2.f9102a;
        int i = C3227a.f9318a[dVar2.f9103b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                mVar2 = eVar.f9152d;
            } else if (i != 3) {
                if (i == 4) {
                    fVar = eVar.f9153e.f9305k;
                } else if (i == 5) {
                    mVar2 = eVar.f9153e;
                }
                return fVar;
            } else {
                mVar = eVar.f9153e;
            }
            fVar = mVar2.f9316i;
            return fVar;
        }
        mVar = eVar.f9152d;
        fVar = mVar.f9315h;
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r3 != 5) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p071f.p089f.p093b.p094j.p095n.C3216f mo10576a(p071f.p089f.p093b.p094j.C3193d r3, int r4) {
        /*
            r2 = this;
            f.f.b.j.d r0 = r3.f9104c
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            f.f.b.j.e r0 = r0.f9102a
            if (r4 != 0) goto L_0x000d
            f.f.b.j.n.j r4 = r0.f9152d
            goto L_0x000f
        L_0x000d:
            f.f.b.j.n.l r4 = r0.f9153e
        L_0x000f:
            f.f.b.j.d r3 = r3.f9104c
            f.f.b.j.d$b r3 = r3.f9103b
            int[] r0 = p071f.p089f.p093b.p094j.p095n.C3226m.C3227a.f9318a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L_0x002b
            r0 = 2
            if (r3 == r0) goto L_0x0028
            r0 = 3
            if (r3 == r0) goto L_0x002b
            r0 = 5
            if (r3 == r0) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            f.f.b.j.n.f r1 = r4.f9316i
            goto L_0x002d
        L_0x002b:
            f.f.b.j.n.f r1 = r4.f9315h
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.p095n.C3226m.mo10576a(f.f.b.j.d, int):f.f.b.j.n.f");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo10548a();

    /* renamed from: a */
    public void mo10549a(C3214d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10577a(C3214d dVar, C3193d dVar2, C3193d dVar3, int i) {
        C3216f fVar;
        C3216f a = mo10575a(dVar2);
        C3216f a2 = mo10575a(dVar3);
        if (a.f9286j && a2.f9286j) {
            int a3 = a.f9283g + dVar2.mo10381a();
            int a4 = a2.f9283g - dVar3.mo10381a();
            int i2 = a4 - a3;
            if (!this.f9312e.f9286j && this.f9311d == C3198b.MATCH_CONSTRAINT) {
                m13247b(i, i2);
            }
            C3218g gVar = this.f9312e;
            if (gVar.f9286j) {
                if (gVar.f9283g == i2) {
                    this.f9315h.mo10565a(a3);
                    fVar = this.f9316i;
                } else {
                    C3196e eVar = this.f9309b;
                    float j = i == 0 ? eVar.mo10446j() : eVar.mo10465t();
                    if (a == a2) {
                        a3 = a.f9283g;
                        a4 = a2.f9283g;
                        j = 0.5f;
                    }
                    this.f9315h.mo10565a((int) (((float) a3) + 0.5f + (((float) ((a4 - a3) - this.f9312e.f9283g)) * j)));
                    fVar = this.f9316i;
                    a4 = this.f9315h.f9283g + this.f9312e.f9283g;
                }
                fVar.mo10565a(a4);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10578a(C3216f fVar, C3216f fVar2, int i) {
        fVar.f9288l.add(fVar2);
        fVar.f9282f = i;
        fVar2.f9287k.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10579a(C3216f fVar, C3216f fVar2, int i, C3218g gVar) {
        fVar.f9288l.add(fVar2);
        fVar.f9288l.add(this.f9312e);
        fVar.f9284h = i;
        fVar.f9285i = gVar;
        fVar2.f9287k.add(fVar);
        gVar.f9287k.add(fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo10550b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10580b(C3214d dVar) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo10551c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10581c(C3214d dVar) {
    }

    /* renamed from: d */
    public long mo10552d() {
        C3218g gVar = this.f9312e;
        if (gVar.f9286j) {
            return (long) gVar.f9283g;
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo10582e() {
        return this.f9314g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract boolean mo10553f();
}
