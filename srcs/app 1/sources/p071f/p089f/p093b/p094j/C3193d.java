package p071f.p089f.p093b.p094j;

import p071f.p089f.p093b.C3181c;
import p071f.p089f.p093b.C3188i;
import p071f.p089f.p093b.C3188i.C3189a;

/* renamed from: f.f.b.j.d */
public class C3193d {

    /* renamed from: a */
    public final C3196e f9102a;

    /* renamed from: b */
    public final C3195b f9103b;

    /* renamed from: c */
    public C3193d f9104c;

    /* renamed from: d */
    public int f9105d = 0;

    /* renamed from: e */
    int f9106e = -1;

    /* renamed from: f */
    C3188i f9107f;

    /* renamed from: f.f.b.j.d$a */
    static /* synthetic */ class C3194a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9108a;

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
                f9108a = r0
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9108a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9108a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9108a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9108a     // Catch:{ NoSuchFieldError -> 0x003e }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9108a     // Catch:{ NoSuchFieldError -> 0x0049 }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9108a     // Catch:{ NoSuchFieldError -> 0x0054 }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9108a     // Catch:{ NoSuchFieldError -> 0x0060 }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9108a     // Catch:{ NoSuchFieldError -> 0x006c }
                f.f.b.j.d$b r1 = p071f.p089f.p093b.p094j.C3193d.C3195b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.C3193d.C3194a.<clinit>():void");
        }
    }

    /* renamed from: f.f.b.j.d$b */
    public enum C3195b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C3193d(C3196e eVar, C3195b bVar) {
        this.f9102a = eVar;
        this.f9103b = bVar;
    }

    /* renamed from: a */
    public int mo10381a() {
        if (this.f9102a.mo10470x() == 8) {
            return 0;
        }
        if (this.f9106e > -1) {
            C3193d dVar = this.f9104c;
            if (dVar != null && dVar.f9102a.mo10470x() == 8) {
                return this.f9106e;
            }
        }
        return this.f9105d;
    }

    /* renamed from: a */
    public void mo10382a(int i) {
        if (mo10392g()) {
            this.f9106e = i;
        }
    }

    /* renamed from: a */
    public void mo10383a(C3181c cVar) {
        C3188i iVar = this.f9107f;
        if (iVar == null) {
            this.f9107f = new C3188i(C3189a.UNRESTRICTED, null);
        } else {
            iVar.mo10366a();
        }
    }

    /* renamed from: a */
    public boolean mo10384a(C3193d dVar) {
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        C3195b f = dVar.mo10391f();
        C3195b bVar = this.f9103b;
        if (f == bVar) {
            return bVar != C3195b.BASELINE || (dVar.mo10388c().mo10396B() && mo10388c().mo10396B());
        }
        switch (C3194a.f9108a[bVar.ordinal()]) {
            case 1:
                if (!(f == C3195b.BASELINE || f == C3195b.CENTER_X || f == C3195b.CENTER_Y)) {
                    z = true;
                }
                return z;
            case 2:
            case 3:
                boolean z2 = f == C3195b.LEFT || f == C3195b.RIGHT;
                if (dVar.mo10388c() instanceof C3202h) {
                    if (z2 || f == C3195b.CENTER_X) {
                        z = true;
                    }
                    z2 = z;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = f == C3195b.TOP || f == C3195b.BOTTOM;
                if (dVar.mo10388c() instanceof C3202h) {
                    if (z3 || f == C3195b.CENTER_Y) {
                        z = true;
                    }
                    z3 = z;
                }
                return z3;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f9103b.name());
        }
    }

    /* renamed from: a */
    public boolean mo10385a(C3193d dVar, int i) {
        return mo10386a(dVar, i, -1, false);
    }

    /* renamed from: a */
    public boolean mo10386a(C3193d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            this.f9104c = null;
            this.f9105d = 0;
            this.f9106e = -1;
            return true;
        } else if (!z && !mo10384a(dVar)) {
            return false;
        } else {
            this.f9104c = dVar;
            if (i > 0) {
                this.f9105d = i;
            } else {
                this.f9105d = 0;
            }
            this.f9106e = i2;
            return true;
        }
    }

    /* renamed from: b */
    public final C3193d mo10387b() {
        switch (C3194a.f9108a[this.f9103b.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f9102a.f9174z;
            case 3:
                return this.f9102a.f9172x;
            case 4:
                return this.f9102a.f9120A;
            case 5:
                return this.f9102a.f9173y;
            default:
                throw new AssertionError(this.f9103b.name());
        }
    }

    /* renamed from: c */
    public C3196e mo10388c() {
        return this.f9102a;
    }

    /* renamed from: d */
    public C3188i mo10389d() {
        return this.f9107f;
    }

    /* renamed from: e */
    public C3193d mo10390e() {
        return this.f9104c;
    }

    /* renamed from: f */
    public C3195b mo10391f() {
        return this.f9103b;
    }

    /* renamed from: g */
    public boolean mo10392g() {
        return this.f9104c != null;
    }

    /* renamed from: h */
    public void mo10393h() {
        this.f9104c = null;
        this.f9105d = 0;
        this.f9106e = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9102a.mo10439f());
        sb.append(":");
        sb.append(this.f9103b.toString());
        return sb.toString();
    }
}
