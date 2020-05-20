package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C6157l0;

/* renamed from: kotlinx.coroutines.internal.d */
public abstract class C6106d<T> extends C6134q {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f15199a = AtomicReferenceFieldUpdater.newUpdater(C6106d.class, Object.class, "_consensus");
    private volatile Object _consensus = C6104c.f15197a;

    /* renamed from: d */
    private final Object m22942d(Object obj) {
        return mo15878c(obj) ? obj : this._consensus;
    }

    /* renamed from: a */
    public final Object mo15876a(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C6104c.f15197a) {
            obj2 = m22942d(mo15668b(obj));
        }
        mo15847a(obj, obj2);
        return obj2;
    }

    /* renamed from: a */
    public abstract void mo15847a(T t, Object obj);

    /* renamed from: a */
    public final boolean mo15877a() {
        return this._consensus != C6104c.f15197a;
    }

    /* renamed from: b */
    public abstract Object mo15668b(T t);

    /* renamed from: c */
    public final boolean mo15878c(Object obj) {
        if (C6157l0.m23149a()) {
            if (!(obj != C6104c.f15197a)) {
                throw new AssertionError();
            }
        }
        return f15199a.compareAndSet(this, C6104c.f15197a, obj);
    }
}
