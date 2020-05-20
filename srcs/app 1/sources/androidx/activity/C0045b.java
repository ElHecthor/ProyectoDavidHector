package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
public abstract class C0045b {

    /* renamed from: a */
    private boolean f95a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0044a> f96b = new CopyOnWriteArrayList<>();

    public C0045b(boolean z) {
        this.f95a = z;
    }

    /* renamed from: a */
    public abstract void mo130a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo131a(C0044a aVar) {
        this.f96b.add(aVar);
    }

    /* renamed from: a */
    public final void mo132a(boolean z) {
        this.f95a = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo133b(C0044a aVar) {
        this.f96b.remove(aVar);
    }

    /* renamed from: b */
    public final boolean mo134b() {
        return this.f95a;
    }

    /* renamed from: c */
    public final void mo135c() {
        Iterator it = this.f96b.iterator();
        while (it.hasNext()) {
            ((C0044a) it.next()).cancel();
        }
    }
}
