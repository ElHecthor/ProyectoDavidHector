package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.ListIterator;

/* renamed from: g.d.a.b.d.g.p7 */
final class C4154p7 implements ListIterator<String> {

    /* renamed from: f */
    private ListIterator<String> f11230f = this.f11232h.f11249f.listIterator(this.f11231g);

    /* renamed from: g */
    private final /* synthetic */ int f11231g;

    /* renamed from: h */
    private final /* synthetic */ C4168q7 f11232h;

    C4154p7(C4168q7 q7Var, int i) {
        this.f11232h = q7Var;
        this.f11231g = i;
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f11230f.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f11230f.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f11230f.next();
    }

    public final int nextIndex() {
        return this.f11230f.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f11230f.previous();
    }

    public final int previousIndex() {
        return this.f11230f.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
