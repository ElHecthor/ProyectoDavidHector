package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.NoSuchElementException;

/* renamed from: g.d.a.b.d.g.o3 */
final class C4136o3 extends C4164q3 {

    /* renamed from: f */
    private int f11203f = 0;

    /* renamed from: g */
    private final int f11204g = this.f11205h.mo12608a();

    /* renamed from: h */
    private final /* synthetic */ C4092l3 f11205h;

    C4136o3(C4092l3 l3Var) {
        this.f11205h = l3Var;
    }

    /* renamed from: a */
    public final byte mo12680a() {
        int i = this.f11203f;
        if (i < this.f11204g) {
            this.f11203f = i + 1;
            return this.f11205h.mo12613b(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f11203f < this.f11204g;
    }
}
