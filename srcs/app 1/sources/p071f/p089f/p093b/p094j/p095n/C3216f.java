package p071f.p089f.p093b.p094j.p095n;

import java.util.ArrayList;
import java.util.List;

/* renamed from: f.f.b.j.n.f */
public class C3216f implements C3214d {

    /* renamed from: a */
    public C3214d f9277a = null;

    /* renamed from: b */
    public boolean f9278b = false;

    /* renamed from: c */
    public boolean f9279c = false;

    /* renamed from: d */
    C3226m f9280d;

    /* renamed from: e */
    C3217a f9281e = C3217a.UNKNOWN;

    /* renamed from: f */
    int f9282f;

    /* renamed from: g */
    public int f9283g;

    /* renamed from: h */
    int f9284h = 1;

    /* renamed from: i */
    C3218g f9285i = null;

    /* renamed from: j */
    public boolean f9286j = false;

    /* renamed from: k */
    List<C3214d> f9287k = new ArrayList();

    /* renamed from: l */
    List<C3216f> f9288l = new ArrayList();

    /* renamed from: f.f.b.j.n.f$a */
    enum C3217a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C3216f(C3226m mVar) {
        this.f9280d = mVar;
    }

    /* renamed from: a */
    public void mo10564a() {
        this.f9288l.clear();
        this.f9287k.clear();
        this.f9286j = false;
        this.f9283g = 0;
        this.f9279c = false;
        this.f9278b = false;
    }

    /* renamed from: a */
    public void mo10565a(int i) {
        if (!this.f9286j) {
            this.f9286j = true;
            this.f9283g = i;
            for (C3214d dVar : this.f9287k) {
                dVar.mo10549a(dVar);
            }
        }
    }

    /* renamed from: a */
    public void mo10549a(C3214d dVar) {
        for (C3216f fVar : this.f9288l) {
            if (!fVar.f9286j) {
                return;
            }
        }
        this.f9279c = true;
        C3214d dVar2 = this.f9277a;
        if (dVar2 != null) {
            dVar2.mo10549a(this);
        }
        if (this.f9278b) {
            this.f9280d.mo10549a((C3214d) this);
            return;
        }
        C3216f fVar2 = null;
        int i = 0;
        for (C3216f fVar3 : this.f9288l) {
            if (!(fVar3 instanceof C3218g)) {
                i++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f9286j) {
            C3218g gVar = this.f9285i;
            if (gVar != null) {
                if (gVar.f9286j) {
                    this.f9282f = this.f9284h * gVar.f9283g;
                } else {
                    return;
                }
            }
            mo10565a(fVar2.f9283g + this.f9282f);
        }
        C3214d dVar3 = this.f9277a;
        if (dVar3 != null) {
            dVar3.mo10549a(this);
        }
    }

    /* renamed from: b */
    public void mo10566b(C3214d dVar) {
        this.f9287k.add(dVar);
        if (this.f9286j) {
            dVar.mo10549a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9280d.f9309b.mo10439f());
        sb.append(":");
        sb.append(this.f9281e);
        sb.append("(");
        sb.append(this.f9286j ? Integer.valueOf(this.f9283g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f9288l.size());
        sb.append(":d=");
        sb.append(this.f9287k.size());
        sb.append(">");
        return sb.toString();
    }
}
