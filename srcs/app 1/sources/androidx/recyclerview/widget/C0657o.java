package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0613c.C0614a;
import androidx.recyclerview.widget.C0615d.C0619b;
import androidx.recyclerview.widget.C0636h.C0640d;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import androidx.recyclerview.widget.RecyclerView.C0569g;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.o */
public abstract class C0657o<T, VH extends C0566d0> extends C0569g<VH> {

    /* renamed from: c */
    final C0615d<T> f2698c;

    /* renamed from: d */
    private final C0619b<T> f2699d = new C0658a();

    /* renamed from: androidx.recyclerview.widget.o$a */
    class C0658a implements C0619b<T> {
        C0658a() {
        }

        /* renamed from: a */
        public void mo3830a(List<T> list, List<T> list2) {
            C0657o.this.mo3933a(list, list2);
        }
    }

    protected C0657o(C0640d<T> dVar) {
        C0615d<T> dVar2 = new C0615d<>(new C0612b(this), new C0614a(dVar).mo3817a());
        this.f2698c = dVar2;
        dVar2.mo3819a(this.f2699d);
    }

    /* renamed from: a */
    public void mo3932a(List<T> list) {
        this.f2698c.mo3820a(list);
    }

    /* renamed from: a */
    public void mo3933a(List<T> list, List<T> list2) {
    }

    /* renamed from: b */
    public int mo3472b() {
        return this.f2698c.mo3818a().size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public T mo3934c(int i) {
        return this.f2698c.mo3818a().get(i);
    }

    /* renamed from: f */
    public List<T> mo3935f() {
        return this.f2698c.mo3818a();
    }
}
