package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: g.d.a.b.d.g.q7 */
public final class C4168q7 extends AbstractList<String> implements C4094l5, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4094l5 f11249f;

    public C4168q7(C4094l5 l5Var) {
        this.f11249f = l5Var;
    }

    /* renamed from: a */
    public final void mo12621a(C4092l3 l3Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object mo12622b(int i) {
        return this.f11249f.mo12622b(i);
    }

    /* renamed from: b */
    public final List<?> mo12623b() {
        return this.f11249f.mo12623b();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f11249f.get(i);
    }

    public final Iterator<String> iterator() {
        return new C4202s7(this);
    }

    /* renamed from: j */
    public final C4094l5 mo12624j() {
        return this;
    }

    public final ListIterator<String> listIterator(int i) {
        return new C4154p7(this, i);
    }

    public final int size() {
        return this.f11249f.size();
    }
}
