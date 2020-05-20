package p071f.p089f.p093b.p094j;

import java.util.ArrayList;
import p071f.p089f.p093b.C3181c;

/* renamed from: f.f.b.j.m */
public class C3208m extends C3196e {

    /* renamed from: e0 */
    public ArrayList<C3196e> f9253e0 = new ArrayList<>();

    /* renamed from: E */
    public void mo10399E() {
        this.f9253e0.clear();
        super.mo10399E();
    }

    /* renamed from: G */
    public ArrayList<C3196e> mo10372G() {
        return this.f9253e0;
    }

    /* renamed from: H */
    public void mo10473H() {
        ArrayList<C3196e> arrayList = this.f9253e0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C3196e eVar = (C3196e) this.f9253e0.get(i);
                if (eVar instanceof C3208m) {
                    ((C3208m) eVar).mo10473H();
                }
            }
        }
    }

    /* renamed from: I */
    public void mo10543I() {
        this.f9253e0.clear();
    }

    /* renamed from: a */
    public void mo10407a(C3181c cVar) {
        super.mo10407a(cVar);
        int size = this.f9253e0.size();
        for (int i = 0; i < size; i++) {
            ((C3196e) this.f9253e0.get(i)).mo10407a(cVar);
        }
    }

    /* renamed from: a */
    public void mo10544a(C3196e eVar) {
        this.f9253e0.add(eVar);
        if (eVar.mo10462r() != null) {
            ((C3208m) eVar.mo10462r()).mo10545c(eVar);
        }
        eVar.mo10424b((C3196e) this);
    }

    /* renamed from: c */
    public void mo10545c(C3196e eVar) {
        this.f9253e0.remove(eVar);
        eVar.mo10424b((C3196e) null);
    }
}
