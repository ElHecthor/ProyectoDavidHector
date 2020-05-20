package p071f.p089f.p093b.p094j.p095n;

import java.util.ArrayList;
import p071f.p089f.p093b.p094j.C3199f;

/* renamed from: f.f.b.j.n.k */
class C3223k {

    /* renamed from: d */
    public static int f9301d;

    /* renamed from: a */
    public boolean f9302a;

    /* renamed from: b */
    C3226m f9303b = null;

    /* renamed from: c */
    ArrayList<C3226m> f9304c = new ArrayList<>();

    public C3223k(C3226m mVar, int i) {
        f9301d++;
        this.f9303b = mVar;
    }

    /* renamed from: a */
    private long m13237a(C3216f fVar, long j) {
        C3226m mVar = fVar.f9280d;
        if (mVar instanceof C3220i) {
            return j;
        }
        int size = fVar.f9287k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C3214d dVar = (C3214d) fVar.f9287k.get(i);
            if (dVar instanceof C3216f) {
                C3216f fVar2 = (C3216f) dVar;
                if (fVar2.f9280d != mVar) {
                    j2 = Math.min(j2, m13237a(fVar2, ((long) fVar2.f9282f) + j));
                }
            }
        }
        if (fVar == mVar.f9316i) {
            long d = j - mVar.mo10552d();
            j2 = Math.min(Math.min(j2, m13237a(mVar.f9315h, d)), d - ((long) mVar.f9315h.f9282f));
        }
        return j2;
    }

    /* renamed from: b */
    private long m13238b(C3216f fVar, long j) {
        C3226m mVar = fVar.f9280d;
        if (mVar instanceof C3220i) {
            return j;
        }
        int size = fVar.f9287k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C3214d dVar = (C3214d) fVar.f9287k.get(i);
            if (dVar instanceof C3216f) {
                C3216f fVar2 = (C3216f) dVar;
                if (fVar2.f9280d != mVar) {
                    j2 = Math.max(j2, m13238b(fVar2, ((long) fVar2.f9282f) + j));
                }
            }
        }
        if (fVar == mVar.f9315h) {
            long d = j + mVar.mo10552d();
            j2 = Math.max(Math.max(j2, m13238b(mVar.f9316i, d)), d - ((long) mVar.f9316i.f9282f));
        }
        return j2;
    }

    /* renamed from: a */
    public long mo10570a(C3199f fVar, int i) {
        long j;
        C3226m mVar;
        long j2;
        long j3;
        long j4;
        C3226m mVar2 = this.f9303b;
        long j5 = 0;
        if (mVar2 instanceof C3213c) {
            if (((C3213c) mVar2).f9313f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(mVar2 instanceof C3221j)) {
                return 0;
            }
        } else if (!(mVar2 instanceof C3224l)) {
            return 0;
        }
        C3216f fVar2 = (i == 0 ? fVar.f9152d : fVar.f9153e).f9315h;
        C3216f fVar3 = (i == 0 ? fVar.f9152d : fVar.f9153e).f9316i;
        boolean contains = this.f9303b.f9315h.f9288l.contains(fVar2);
        boolean contains2 = this.f9303b.f9316i.f9288l.contains(fVar3);
        long d = this.f9303b.mo10552d();
        if (!contains || !contains2) {
            if (contains) {
                C3216f fVar4 = this.f9303b.f9315h;
                j4 = m13238b(fVar4, (long) fVar4.f9282f);
                j3 = ((long) this.f9303b.f9315h.f9282f) + d;
            } else if (contains2) {
                C3216f fVar5 = this.f9303b.f9316i;
                j3 = ((long) (-this.f9303b.f9316i.f9282f)) + d;
                j4 = -m13237a(fVar5, (long) fVar5.f9282f);
            } else {
                C3226m mVar3 = this.f9303b;
                j2 = ((long) mVar3.f9315h.f9282f) + mVar3.mo10552d();
                mVar = this.f9303b;
            }
            j = Math.max(j4, j3);
            return j;
        }
        long b = m13238b(this.f9303b.f9315h, 0);
        long a = m13237a(this.f9303b.f9316i, 0);
        long j6 = b - d;
        int i2 = this.f9303b.f9316i.f9282f;
        if (j6 >= ((long) (-i2))) {
            j6 += (long) i2;
        }
        long j7 = (-a) - d;
        int i3 = this.f9303b.f9315h.f9282f;
        long j8 = j7 - ((long) i3);
        if (j8 >= ((long) i3)) {
            j8 -= (long) i3;
        }
        float a2 = this.f9303b.f9309b.mo10401a(i);
        if (a2 > 0.0f) {
            j5 = (long) ((((float) j8) / a2) + (((float) j6) / (1.0f - a2)));
        }
        float f = (float) j5;
        long j9 = ((long) ((f * a2) + 0.5f)) + d + ((long) ((f * (1.0f - a2)) + 0.5f));
        mVar = this.f9303b;
        j2 = ((long) mVar.f9315h.f9282f) + j9;
        j = j2 - ((long) mVar.f9316i.f9282f);
        return j;
    }

    /* renamed from: a */
    public void mo10571a(C3226m mVar) {
        this.f9304c.add(mVar);
    }
}
