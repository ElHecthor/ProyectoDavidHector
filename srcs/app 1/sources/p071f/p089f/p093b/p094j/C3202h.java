package p071f.p089f.p093b.p094j;

import p071f.p089f.p093b.C3183e;
import p071f.p089f.p093b.C3188i;
import p071f.p089f.p093b.p094j.C3193d.C3195b;
import p071f.p089f.p093b.p094j.C3196e.C3198b;

/* renamed from: f.f.b.j.h */
public class C3202h extends C3196e {

    /* renamed from: e0 */
    protected float f9235e0 = -1.0f;

    /* renamed from: f0 */
    protected int f9236f0 = -1;

    /* renamed from: g0 */
    protected int f9237g0 = -1;

    /* renamed from: h0 */
    private C3193d f9238h0 = this.f9173y;

    /* renamed from: i0 */
    private int f9239i0;

    /* renamed from: j0 */
    private boolean f9240j0;

    /* renamed from: f.f.b.j.h$a */
    static /* synthetic */ class C3203a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9241a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                f.f.b.j.d$b[] r0 = p071f.p089f.p093b.p094j.C3193d.C3195b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9241a = r0
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9241a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9241a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9241a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9241a     // Catch:{ NoSuchFieldError -> 0x003e }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9241a     // Catch:{ NoSuchFieldError -> 0x0049 }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9241a     // Catch:{ NoSuchFieldError -> 0x0054 }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9241a     // Catch:{ NoSuchFieldError -> 0x0060 }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9241a     // Catch:{ NoSuchFieldError -> 0x006c }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.C3202h.C3203a.<clinit>():void");
        }
    }

    public C3202h() {
        this.f9239i0 = 0;
        this.f9240j0 = false;
        this.f9126G.clear();
        this.f9126G.add(this.f9238h0);
        int length = this.f9125F.length;
        for (int i = 0; i < length; i++) {
            this.f9125F[i] = this.f9238h0;
        }
    }

    /* renamed from: G */
    public int mo10372G() {
        return this.f9239i0;
    }

    /* renamed from: H */
    public int mo10520H() {
        return this.f9236f0;
    }

    /* renamed from: I */
    public int mo10521I() {
        return this.f9237g0;
    }

    /* renamed from: J */
    public float mo10522J() {
        return this.f9235e0;
    }

    /* renamed from: a */
    public C3193d mo10402a(C3195b bVar) {
        switch (C3203a.f9241a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f9239i0 == 1) {
                    return this.f9238h0;
                }
                break;
            case 3:
            case 4:
                if (this.f9239i0 == 0) {
                    return this.f9238h0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }

    /* renamed from: a */
    public void mo10375a(C3183e eVar) {
        C3199f fVar = (C3199f) mo10462r();
        if (fVar != null) {
            C3193d a = fVar.mo10402a(C3195b.LEFT);
            C3193d a2 = fVar.mo10402a(C3195b.RIGHT);
            C3196e eVar2 = this.f9128I;
            boolean z = true;
            boolean z2 = eVar2 != null && eVar2.f9127H[0] == C3198b.WRAP_CONTENT;
            if (this.f9239i0 == 0) {
                a = fVar.mo10402a(C3195b.TOP);
                a2 = fVar.mo10402a(C3195b.BOTTOM);
                C3196e eVar3 = this.f9128I;
                if (eVar3 == null || eVar3.f9127H[1] != C3198b.WRAP_CONTENT) {
                    z = false;
                }
                z2 = z;
            }
            if (this.f9236f0 != -1) {
                C3188i a3 = eVar.mo10345a((Object) this.f9238h0);
                eVar.mo10342a(a3, eVar.mo10345a((Object) a), this.f9236f0, 6);
                if (z2) {
                    eVar.mo10356b(eVar.mo10345a((Object) a2), a3, 0, 5);
                }
            } else if (this.f9237g0 != -1) {
                C3188i a4 = eVar.mo10345a((Object) this.f9238h0);
                C3188i a5 = eVar.mo10345a((Object) a2);
                eVar.mo10342a(a4, a5, -this.f9237g0, 6);
                if (z2) {
                    eVar.mo10356b(a4, eVar.mo10345a((Object) a), 0, 5);
                    eVar.mo10356b(a5, a4, 0, 5);
                }
            } else if (this.f9235e0 != -1.0f) {
                eVar.mo10346a(C3183e.m12904a(eVar, eVar.mo10345a((Object) this.f9238h0), eVar.mo10345a((Object) a), eVar.mo10345a((Object) a2), this.f9235e0, this.f9240j0));
            }
        }
    }

    /* renamed from: b */
    public boolean mo10376b() {
        return true;
    }

    /* renamed from: c */
    public void mo10431c(C3183e eVar) {
        if (mo10462r() != null) {
            int b = eVar.mo10354b((Object) this.f9238h0);
            if (this.f9239i0 == 1) {
                mo10461q(b);
                mo10463r(0);
                mo10443h(mo10462r().mo10444i());
                mo10459p(0);
            } else {
                mo10461q(0);
                mo10463r(b);
                mo10459p(mo10462r().mo10471y());
                mo10443h(0);
            }
        }
    }

    /* renamed from: e */
    public void mo10523e(float f) {
        if (f > -1.0f) {
            this.f9235e0 = f;
            this.f9236f0 = -1;
            this.f9237g0 = -1;
        }
    }

    /* renamed from: s */
    public void mo10378s(int i) {
        if (i > -1) {
            this.f9235e0 = -1.0f;
            this.f9236f0 = i;
            this.f9237g0 = -1;
        }
    }

    /* renamed from: t */
    public void mo10524t(int i) {
        if (i > -1) {
            this.f9235e0 = -1.0f;
            this.f9236f0 = -1;
            this.f9237g0 = i;
        }
    }

    /* renamed from: u */
    public void mo10525u(int i) {
        if (this.f9239i0 != i) {
            this.f9239i0 = i;
            this.f9126G.clear();
            this.f9238h0 = this.f9239i0 == 1 ? this.f9172x : this.f9173y;
            this.f9126G.add(this.f9238h0);
            int length = this.f9125F.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f9125F[i2] = this.f9238h0;
            }
        }
    }
}
