package p071f.p089f.p093b.p094j;

import java.util.ArrayList;
import p071f.p089f.p093b.p094j.C3196e.C3198b;

/* renamed from: f.f.b.j.c */
public class C3192c {

    /* renamed from: a */
    protected C3196e f9082a;

    /* renamed from: b */
    protected C3196e f9083b;

    /* renamed from: c */
    protected C3196e f9084c;

    /* renamed from: d */
    protected C3196e f9085d;

    /* renamed from: e */
    protected C3196e f9086e;

    /* renamed from: f */
    protected C3196e f9087f;

    /* renamed from: g */
    protected C3196e f9088g;

    /* renamed from: h */
    protected ArrayList<C3196e> f9089h;

    /* renamed from: i */
    protected int f9090i;

    /* renamed from: j */
    protected int f9091j;

    /* renamed from: k */
    protected float f9092k = 0.0f;

    /* renamed from: l */
    int f9093l;

    /* renamed from: m */
    int f9094m;

    /* renamed from: n */
    int f9095n;

    /* renamed from: o */
    private int f9096o;

    /* renamed from: p */
    private boolean f9097p = false;

    /* renamed from: q */
    protected boolean f9098q;

    /* renamed from: r */
    protected boolean f9099r;

    /* renamed from: s */
    protected boolean f9100s;

    /* renamed from: t */
    private boolean f9101t;

    public C3192c(C3196e eVar, int i, boolean z) {
        this.f9082a = eVar;
        this.f9096o = i;
        this.f9097p = z;
    }

    /* renamed from: a */
    private static boolean m12960a(C3196e eVar, int i) {
        if (eVar.mo10470x() != 8 && eVar.f9127H[i] == C3198b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f9160l;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m12961b() {
        int i = this.f9096o * 2;
        C3196e eVar = this.f9082a;
        boolean z = false;
        C3196e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f9090i++;
            C3196e[] eVarArr = eVar.f9151c0;
            int i2 = this.f9096o;
            C3196e eVar3 = null;
            eVarArr[i2] = null;
            eVar.f9149b0[i2] = null;
            if (eVar.mo10470x() != 8) {
                this.f9093l++;
                if (eVar.mo10418b(this.f9096o) != C3198b.MATCH_CONSTRAINT) {
                    this.f9094m += eVar.mo10428c(this.f9096o);
                }
                int a = this.f9094m + eVar.f9125F[i].mo10381a();
                this.f9094m = a;
                int i3 = i + 1;
                this.f9094m = a + eVar.f9125F[i3].mo10381a();
                int a2 = this.f9095n + eVar.f9125F[i].mo10381a();
                this.f9095n = a2;
                this.f9095n = a2 + eVar.f9125F[i3].mo10381a();
                if (this.f9083b == null) {
                    this.f9083b = eVar;
                }
                this.f9085d = eVar;
                C3198b[] bVarArr = eVar.f9127H;
                int i4 = this.f9096o;
                if (bVarArr[i4] == C3198b.MATCH_CONSTRAINT) {
                    int[] iArr = eVar.f9160l;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f9091j++;
                        float[] fArr = eVar.f9147a0;
                        int i5 = this.f9096o;
                        float f = fArr[i5];
                        if (f > 0.0f) {
                            this.f9092k += fArr[i5];
                        }
                        if (m12960a(eVar, this.f9096o)) {
                            if (f < 0.0f) {
                                this.f9098q = true;
                            } else {
                                this.f9099r = true;
                            }
                            if (this.f9089h == null) {
                                this.f9089h = new ArrayList<>();
                            }
                            this.f9089h.add(eVar);
                        }
                        if (this.f9087f == null) {
                            this.f9087f = eVar;
                        }
                        C3196e eVar4 = this.f9088g;
                        if (eVar4 != null) {
                            eVar4.f9149b0[this.f9096o] = eVar;
                        }
                        this.f9088g = eVar;
                    }
                    if (this.f9096o == 0) {
                        if (eVar.f9158j == 0 && eVar.f9161m == 0) {
                            int i6 = eVar.f9162n;
                        }
                    } else if (eVar.f9159k == 0 && eVar.f9164p == 0) {
                        int i7 = eVar.f9165q;
                    }
                    int i8 = (eVar.f9131L > 0.0f ? 1 : (eVar.f9131L == 0.0f ? 0 : -1));
                }
            }
            if (eVar2 != eVar) {
                eVar2.f9151c0[this.f9096o] = eVar;
            }
            C3193d dVar = eVar.f9125F[i + 1].f9104c;
            if (dVar != null) {
                C3196e eVar5 = dVar.f9102a;
                C3193d[] dVarArr = eVar5.f9125F;
                if (dVarArr[i].f9104c != null && dVarArr[i].f9104c.f9102a == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        C3196e eVar6 = this.f9083b;
        if (eVar6 != null) {
            this.f9094m -= eVar6.f9125F[i].mo10381a();
        }
        C3196e eVar7 = this.f9085d;
        if (eVar7 != null) {
            this.f9094m -= eVar7.f9125F[i + 1].mo10381a();
        }
        this.f9084c = eVar;
        if (this.f9096o != 0 || !this.f9097p) {
            this.f9086e = this.f9082a;
        } else {
            this.f9086e = eVar;
        }
        if (this.f9099r && this.f9098q) {
            z = true;
        }
        this.f9100s = z;
    }

    /* renamed from: a */
    public void mo10380a() {
        if (!this.f9101t) {
            m12961b();
        }
        this.f9101t = true;
    }
}
