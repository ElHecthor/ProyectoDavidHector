package p071f.p131r;

import androidx.recyclerview.widget.C0636h.C0640d;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import androidx.recyclerview.widget.RecyclerView.C0569g;
import p071f.p131r.C3480a.C3484c;

/* renamed from: f.r.i */
public abstract class C3511i<T, VH extends C0566d0> extends C0569g<VH> {

    /* renamed from: c */
    final C3480a<T> f9962c;

    /* renamed from: d */
    private final C3484c<T> f9963d = new C3512a();

    /* renamed from: f.r.i$a */
    class C3512a implements C3484c<T> {
        C3512a() {
        }

        /* renamed from: a */
        public void mo11102a(C3503h<T> hVar, C3503h<T> hVar2) {
            C3511i.this.mo11177a(hVar2);
            C3511i.this.mo11178a(hVar, hVar2);
        }
    }

    protected C3511i(C0640d<T> dVar) {
        C3480a<T> aVar = new C3480a<>(this, dVar);
        this.f9962c = aVar;
        aVar.mo11093a(this.f9963d);
    }

    @Deprecated
    /* renamed from: a */
    public void mo11177a(C3503h<T> hVar) {
    }

    /* renamed from: a */
    public void mo11178a(C3503h<T> hVar, C3503h<T> hVar2) {
    }

    /* renamed from: b */
    public int mo3472b() {
        return this.f9962c.mo11091a();
    }

    /* renamed from: b */
    public void mo11179b(C3503h<T> hVar) {
        this.f9962c.mo11094a(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public T mo11180c(int i) {
        return this.f9962c.mo11092a(i);
    }
}
