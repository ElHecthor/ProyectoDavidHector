package kotlinx.coroutines.p331d3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.d3.o */
public final class C6065o {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f15157b;

    /* renamed from: c */
    static final AtomicIntegerFieldUpdater f15158c;

    /* renamed from: d */
    static final AtomicIntegerFieldUpdater f15159d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final AtomicReferenceArray<C6059i> f15160a = new AtomicReferenceArray<>(128);
    volatile int consumerIndex = 0;
    private volatile Object lastScheduledTask = null;
    volatile int producerIndex = 0;

    static {
        Class<C6065o> cls = C6065o.class;
        f15157b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f15158c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f15159d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
    }

    /* renamed from: a */
    private final void m22809a(C6055e eVar, C6059i iVar) {
        if (!eVar.mo15914a(iVar)) {
            throw new IllegalStateException("GlobalQueue could not be closed yet".toString());
        }
    }

    /* renamed from: a */
    private final boolean m22810a(long j, C6065o oVar, C6055e eVar) {
        C6059i iVar = (C6059i) oVar.lastScheduledTask;
        if (iVar == null || j - iVar.f15145f < C6063m.f15151a || !f15157b.compareAndSet(oVar, iVar, null)) {
            return false;
        }
        mo15811a(iVar, eVar);
        return true;
    }

    /* renamed from: a */
    private final boolean m22811a(C6059i iVar) {
        if (mo15809a() == 127) {
            return false;
        }
        int i = this.producerIndex & 127;
        if (this.f15160a.get(i) != null) {
            return false;
        }
        this.f15160a.lazySet(i, iVar);
        f15158c.incrementAndGet(this);
        return true;
    }

    /* renamed from: b */
    private final void m22812b(C6055e eVar) {
        C6059i iVar;
        int a = C5736g.m21866a(mo15809a() / 2, 1);
        int i = 0;
        while (i < a) {
            while (true) {
                int i2 = this.consumerIndex;
                iVar = null;
                if (i2 - this.producerIndex != 0) {
                    int i3 = i2 & 127;
                    if (((C6059i) this.f15160a.get(i3)) != null && f15159d.compareAndSet(this, i2, i2 + 1)) {
                        iVar = (C6059i) this.f15160a.getAndSet(i3, null);
                        break;
                    }
                } else {
                    break;
                }
            }
            if (iVar != null) {
                m22809a(eVar, iVar);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo15809a() {
        return this.producerIndex - this.consumerIndex;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r0 = (kotlinx.coroutines.p331d3.C6059i) m22808a(r5).getAndSet(r2, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r0 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x000e, code lost:
        if (r0 != null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        m22809a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r0 = r5.consumerIndex;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if ((r0 - r5.producerIndex) != 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r2 = r0 & 127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (((kotlinx.coroutines.p331d3.C6059i) m22808a(r5).get(r2)) == null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (f15159d.compareAndSet(r5, r0, r0 + 1) == false) goto L_0x0013;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15810a(kotlinx.coroutines.p331d3.C6055e r6) {
        /*
            r5 = this;
            java.lang.String r0 = "globalQueue"
            p308k.p323z.p325d.C5942k.m22327b(r6, r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f15157b
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r5, r1)
            kotlinx.coroutines.d3.i r0 = (kotlinx.coroutines.p331d3.C6059i) r0
            if (r0 == 0) goto L_0x0013
        L_0x0010:
            r5.m22809a(r6, r0)
        L_0x0013:
            int r0 = r5.consumerIndex
            int r2 = r5.producerIndex
            int r2 = r0 - r2
            if (r2 != 0) goto L_0x001d
            r0 = r1
            goto L_0x003f
        L_0x001d:
            r2 = r0 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f15160a
            java.lang.Object r3 = r3.get(r2)
            kotlinx.coroutines.d3.i r3 = (kotlinx.coroutines.p331d3.C6059i) r3
            if (r3 == 0) goto L_0x0013
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = f15159d
            int r4 = r0 + 1
            boolean r0 = r3.compareAndSet(r5, r0, r4)
            if (r0 == 0) goto L_0x0013
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.f15160a
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlinx.coroutines.d3.i r0 = (kotlinx.coroutines.p331d3.C6059i) r0
        L_0x003f:
            if (r0 == 0) goto L_0x0042
            goto L_0x0010
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p331d3.C6065o.mo15810a(kotlinx.coroutines.d3.e):void");
    }

    /* renamed from: a */
    public final boolean mo15811a(C6059i iVar, C6055e eVar) {
        C5942k.m22327b(iVar, "task");
        C5942k.m22327b(eVar, "globalQueue");
        C6059i iVar2 = (C6059i) f15157b.getAndSet(this, iVar);
        if (iVar2 != null) {
            return mo15814b(iVar2, eVar);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo15812a(C6065o oVar, C6055e eVar) {
        C6059i iVar;
        C6065o oVar2 = oVar;
        C6055e eVar2 = eVar;
        C5942k.m22327b(oVar2, "victim");
        C5942k.m22327b(eVar2, "globalQueue");
        long a = C6063m.f15156f.mo15805a();
        int a2 = oVar.mo15809a();
        if (a2 == 0) {
            return m22810a(a, oVar2, eVar2);
        }
        int a3 = C5736g.m21866a(a2 / 2, 1);
        int i = 0;
        boolean z = false;
        while (i < a3) {
            while (true) {
                int i2 = oVar2.consumerIndex;
                iVar = null;
                if (i2 - oVar2.producerIndex != 0) {
                    int i3 = i2 & 127;
                    C6059i iVar2 = (C6059i) oVar.f15160a.get(i3);
                    if (iVar2 != null) {
                        if (!(a - iVar2.f15145f >= C6063m.f15151a || oVar.mo15809a() > C6063m.f15152b)) {
                            break;
                        } else if (f15159d.compareAndSet(oVar2, i2, i2 + 1)) {
                            iVar = (C6059i) oVar.f15160a.getAndSet(i3, null);
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            if (iVar == null) {
                break;
            }
            mo15811a(iVar, eVar2);
            i++;
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public final C6059i mo15813b() {
        C6059i iVar = (C6059i) f15157b.getAndSet(this, null);
        if (iVar != null) {
            return iVar;
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (((C6059i) this.f15160a.get(i2)) != null && f15159d.compareAndSet(this, i, i + 1)) {
                return (C6059i) this.f15160a.getAndSet(i2, null);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo15814b(C6059i iVar, C6055e eVar) {
        C5942k.m22327b(iVar, "task");
        C5942k.m22327b(eVar, "globalQueue");
        boolean z = true;
        while (!m22811a(iVar)) {
            m22812b(eVar);
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public final int mo15815c() {
        return this.lastScheduledTask != null ? mo15809a() + 1 : mo15809a();
    }
}
