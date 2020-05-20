package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2.C0798i;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.b */
final class C0811b extends C0798i {

    /* renamed from: a */
    private final List<C0798i> f3130a;

    C0811b(int i) {
        this.f3130a = new ArrayList(i);
    }

    /* renamed from: a */
    private void m4350a(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    /* renamed from: a */
    public void mo4337a(int i) {
        try {
            for (C0798i a : this.f3130a) {
                a.mo4337a(i);
            }
        } catch (ConcurrentModificationException e) {
            m4350a(e);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo4395a(int i, float f, int i2) {
        try {
            for (C0798i a : this.f3130a) {
                a.mo4395a(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m4350a(e);
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4409a(C0798i iVar) {
        this.f3130a.add(iVar);
    }

    /* renamed from: b */
    public void mo4338b(int i) {
        try {
            for (C0798i b : this.f3130a) {
                b.mo4338b(i);
            }
        } catch (ConcurrentModificationException e) {
            m4350a(e);
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4410b(C0798i iVar) {
        this.f3130a.remove(iVar);
    }
}
