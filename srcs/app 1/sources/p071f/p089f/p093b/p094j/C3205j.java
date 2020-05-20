package p071f.p089f.p093b.p094j;

import java.util.Arrays;

/* renamed from: f.f.b.j.j */
public class C3205j extends C3196e implements C3204i {

    /* renamed from: e0 */
    public C3196e[] f9242e0 = new C3196e[4];

    /* renamed from: f0 */
    public int f9243f0 = 0;

    /* renamed from: a */
    public void mo10526a() {
        this.f9243f0 = 0;
        Arrays.fill(this.f9242e0, null);
    }

    /* renamed from: a */
    public void mo10527a(C3196e eVar) {
        int i = this.f9243f0 + 1;
        C3196e[] eVarArr = this.f9242e0;
        if (i > eVarArr.length) {
            this.f9242e0 = (C3196e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        C3196e[] eVarArr2 = this.f9242e0;
        int i2 = this.f9243f0;
        eVarArr2[i2] = eVar;
        this.f9243f0 = i2 + 1;
    }

    /* renamed from: a */
    public void mo10528a(C3199f fVar) {
    }
}
