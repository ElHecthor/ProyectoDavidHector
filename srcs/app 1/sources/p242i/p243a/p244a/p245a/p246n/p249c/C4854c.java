package p242i.p243a.p244a.p245a.p246n.p249c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p242i.p243a.p244a.p245a.p246n.p249c.C4853b;
import p242i.p243a.p244a.p245a.p246n.p249c.C4862i;
import p242i.p243a.p244a.p245a.p246n.p249c.C4866l;

/* renamed from: i.a.a.a.n.c.c */
public class C4854c<E extends C4853b & C4866l & C4862i> extends PriorityBlockingQueue<E> {

    /* renamed from: f */
    final Queue<E> f12674f = new LinkedList();

    /* renamed from: g */
    private final ReentrantLock f12675g = new ReentrantLock();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public E mo13933a(int i, Long l, TimeUnit timeUnit) {
        E b;
        while (true) {
            b = mo13937b(i, l, timeUnit);
            if (b == null || mo13935a(b)) {
                return b;
            }
            mo13934a(i, b);
        }
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo13934a(int i, E e) {
        try {
            this.f12675g.lock();
            if (i == 1) {
                super.remove(e);
            }
            boolean offer = this.f12674f.offer(e);
            return offer;
        } finally {
            this.f12675g.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo13935a(E e) {
        return e.mo13931g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> T[] mo13936a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public E mo13937b(int i, Long l, TimeUnit timeUnit) {
        E e;
        if (i == 0) {
            e = super.take();
        } else if (i == 1) {
            e = super.peek();
        } else if (i == 2) {
            e = super.poll();
        } else if (i != 3) {
            return null;
        } else {
            e = super.poll(l.longValue(), timeUnit);
        }
        return (C4853b) e;
    }

    /* renamed from: c */
    public void mo13938c() {
        try {
            this.f12675g.lock();
            Iterator it = this.f12674f.iterator();
            while (it.hasNext()) {
                C4853b bVar = (C4853b) it.next();
                if (mo13935a(bVar)) {
                    super.offer(bVar);
                    it.remove();
                }
            }
        } finally {
            this.f12675g.unlock();
        }
    }

    public void clear() {
        try {
            this.f12675g.lock();
            this.f12674f.clear();
            super.clear();
        } finally {
            this.f12675g.unlock();
        }
    }

    public boolean contains(Object obj) {
        try {
            this.f12675g.lock();
            return super.contains(obj) || this.f12674f.contains(obj);
        } finally {
            this.f12675g.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        try {
            this.f12675g.lock();
            int drainTo = super.drainTo(collection) + this.f12674f.size();
            while (!this.f12674f.isEmpty()) {
                collection.add(this.f12674f.poll());
            }
            return drainTo;
        } finally {
            this.f12675g.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection, int i) {
        try {
            this.f12675g.lock();
            int drainTo = super.drainTo(collection, i);
            while (!this.f12674f.isEmpty() && drainTo <= i) {
                collection.add(this.f12674f.poll());
                drainTo++;
            }
            return drainTo;
        } finally {
            this.f12675g.unlock();
        }
    }

    public E peek() {
        try {
            return mo13933a(1, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public E poll() {
        try {
            return mo13933a(2, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public E poll(long j, TimeUnit timeUnit) {
        return mo13933a(3, Long.valueOf(j), timeUnit);
    }

    public boolean remove(Object obj) {
        try {
            this.f12675g.lock();
            return super.remove(obj) || this.f12674f.remove(obj);
        } finally {
            this.f12675g.unlock();
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            this.f12675g.lock();
            return this.f12674f.removeAll(collection) | super.removeAll(collection);
        } finally {
            this.f12675g.unlock();
        }
    }

    public int size() {
        try {
            this.f12675g.lock();
            return this.f12674f.size() + super.size();
        } finally {
            this.f12675g.unlock();
        }
    }

    public E take() {
        return mo13933a(0, null, null);
    }

    public Object[] toArray() {
        try {
            this.f12675g.lock();
            return mo13936a((T[]) super.toArray(), (T[]) this.f12674f.toArray());
        } finally {
            this.f12675g.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        try {
            this.f12675g.lock();
            return mo13936a((T[]) super.toArray(tArr), (T[]) this.f12674f.toArray(tArr));
        } finally {
            this.f12675g.unlock();
        }
    }
}
