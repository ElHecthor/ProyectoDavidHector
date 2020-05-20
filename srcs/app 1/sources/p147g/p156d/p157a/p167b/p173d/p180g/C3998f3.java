package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: g.d.a.b.d.g.f3 */
abstract class C3998f3<E> extends AbstractList<E> implements C3914a5<E> {

    /* renamed from: f */
    private boolean f10929f = true;

    C3998f3() {
    }

    /* renamed from: a */
    public boolean mo12079a() {
        return this.f10929f;
    }

    public boolean add(E e) {
        mo12447c();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo12447c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo12447c();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo12447c() {
        if (!this.f10929f) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo12447c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* renamed from: n */
    public final void mo12080n() {
        this.f10929f = false;
    }

    public boolean remove(Object obj) {
        mo12447c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo12447c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo12447c();
        return super.retainAll(collection);
    }
}
