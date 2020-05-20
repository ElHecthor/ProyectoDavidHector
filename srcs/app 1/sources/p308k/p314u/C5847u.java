package p308k.p314u;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.u.u */
public final class C5847u implements ListIterator, C5954a {

    /* renamed from: f */
    public static final C5847u f14884f = new C5847u();

    private C5847u() {
    }

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public Void next() {
        throw new NoSuchElementException();
    }

    public int nextIndex() {
        return 0;
    }

    public Void previous() {
        throw new NoSuchElementException();
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
