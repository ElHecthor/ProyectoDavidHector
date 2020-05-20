package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.C6128m.C6129a;
import kotlinx.coroutines.internal.C6128m.C6130b;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.l */
public class C6127l<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15229a = AtomicReferenceFieldUpdater.newUpdater(C6127l.class, Object.class, "_cur$internal");
    public volatile /* synthetic */ Object _cur$internal;

    public C6127l(boolean z) {
        this._cur$internal = new C6128m(8, z);
    }

    /* renamed from: a */
    public final void mo15913a() {
        while (true) {
            C6128m mVar = (C6128m) this._cur$internal;
            if (!mVar.mo15918a()) {
                f15229a.compareAndSet(this, mVar, mVar.mo15921d());
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo15914a(E e) {
        C5942k.m22327b(e, "element");
        while (true) {
            C6128m mVar = (C6128m) this._cur$internal;
            int a = mVar.mo15917a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                f15229a.compareAndSet(this, mVar, mVar.mo15921d());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final int mo15915b() {
        return ((C6128m) this._cur$internal).mo15919b();
    }

    /* renamed from: c */
    public final E mo15916c() {
        E e;
        E e2;
        while (true) {
            C6128m mVar = (C6128m) this._cur$internal;
            while (true) {
                long j = mVar._state$internal;
                e = null;
                if ((1152921504606846976L & j) == 0) {
                    C6129a aVar = C6128m.f15233h;
                    int i = (int) ((1073741823 & j) >> 0);
                    if ((mVar.f15234a & ((int) ((1152921503533105152L & j) >> 30))) != (mVar.f15234a & i)) {
                        e2 = mVar.f15235b.get(mVar.f15234a & i);
                        if (e2 != null) {
                            if (!(e2 instanceof C6130b)) {
                                int i2 = (i + 1) & 1073741823;
                                if (!C6128m.f15231f.compareAndSet(mVar, j, C6128m.f15233h.mo15924a(j, i2))) {
                                    if (mVar.f15237d) {
                                        C6128m mVar2 = mVar;
                                        do {
                                            mVar2 = mVar2.m23036a(i, i2);
                                        } while (mVar2 != null);
                                        break;
                                    }
                                } else {
                                    mVar.f15235b.set(mVar.f15234a & i, null);
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else if (mVar.f15237d) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    e = C6128m.f15232g;
                    break;
                }
            }
            e = e2;
            if (e != C6128m.f15232g) {
                return e;
            }
            f15229a.compareAndSet(this, mVar, mVar.mo15921d());
        }
    }
}
