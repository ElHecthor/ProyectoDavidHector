package androidx.lifecycle;

import androidx.lifecycle.C0514h.C0515a;
import androidx.lifecycle.C0514h.C0516b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import p071f.p080b.p081a.p083b.C3143a;

/* renamed from: androidx.lifecycle.o */
public class C0524o extends C0514h {

    /* renamed from: a */
    private C3143a<C0522m, C0526b> f2231a = new C3143a<>();

    /* renamed from: b */
    private C0516b f2232b;

    /* renamed from: c */
    private final WeakReference<C0523n> f2233c;

    /* renamed from: d */
    private int f2234d = 0;

    /* renamed from: e */
    private boolean f2235e = false;

    /* renamed from: f */
    private boolean f2236f = false;

    /* renamed from: g */
    private ArrayList<C0516b> f2237g = new ArrayList<>();

    /* renamed from: androidx.lifecycle.o$a */
    static /* synthetic */ class C0525a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2238a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2239b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
                androidx.lifecycle.h$b[] r0 = androidx.lifecycle.C0514h.C0516b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2239b = r0
                r1 = 1
                androidx.lifecycle.h$b r2 = androidx.lifecycle.C0514h.C0516b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2239b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.h$b r3 = androidx.lifecycle.C0514h.C0516b.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2239b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.h$b r4 = androidx.lifecycle.C0514h.C0516b.STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f2239b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.h$b r5 = androidx.lifecycle.C0514h.C0516b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f2239b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.h$b r6 = androidx.lifecycle.C0514h.C0516b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                androidx.lifecycle.h$a[] r5 = androidx.lifecycle.C0514h.C0515a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f2238a = r5
                androidx.lifecycle.h$a r6 = androidx.lifecycle.C0514h.C0515a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f2238a     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.lifecycle.h$a r5 = androidx.lifecycle.C0514h.C0515a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f2238a     // Catch:{ NoSuchFieldError -> 0x0063 }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.C0514h.C0515a.ON_START     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f2238a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.C0514h.C0515a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f2238a     // Catch:{ NoSuchFieldError -> 0x0077 }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.C0514h.C0515a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = f2238a     // Catch:{ NoSuchFieldError -> 0x0082 }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.C0514h.C0515a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = f2238a     // Catch:{ NoSuchFieldError -> 0x008d }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.C0514h.C0515a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0524o.C0525a.<clinit>():void");
        }
    }

    /* renamed from: androidx.lifecycle.o$b */
    static class C0526b {

        /* renamed from: a */
        C0516b f2240a;

        /* renamed from: b */
        C0521l f2241b;

        C0526b(C0522m mVar, C0516b bVar) {
            this.f2241b = C0528q.m2757a((Object) mVar);
            this.f2240a = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3044a(C0523n nVar, C0515a aVar) {
            C0516b b = C0524o.m2738b(aVar);
            this.f2240a = C0524o.m2736a(this.f2240a, b);
            this.f2241b.mo124a(nVar, aVar);
            this.f2240a = b;
        }
    }

    public C0524o(C0523n nVar) {
        this.f2233c = new WeakReference<>(nVar);
        this.f2232b = C0516b.INITIALIZED;
    }

    /* renamed from: a */
    static C0516b m2736a(C0516b bVar, C0516b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: a */
    private void m2737a(C0523n nVar) {
        Iterator c = this.f2231a.mo10121c();
        while (c.hasNext() && !this.f2236f) {
            Entry entry = (Entry) c.next();
            C0526b bVar = (C0526b) entry.getValue();
            while (bVar.f2240a.compareTo(this.f2232b) > 0 && !this.f2236f && this.f2231a.contains(entry.getKey())) {
                C0515a c2 = m2741c(bVar.f2240a);
                m2746e(m2738b(c2));
                bVar.mo3044a(nVar, c2);
                m2743c();
            }
        }
    }

    /* renamed from: b */
    static C0516b m2738b(C0515a aVar) {
        switch (C0525a.f2238a[aVar.ordinal()]) {
            case 1:
            case 2:
                return C0516b.CREATED;
            case 3:
            case 4:
                return C0516b.STARTED;
            case 5:
                return C0516b.RESUMED;
            case 6:
                return C0516b.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected event value ");
                sb.append(aVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private void m2739b(C0523n nVar) {
        C3148d e = this.f2231a.mo10123e();
        while (e.hasNext() && !this.f2236f) {
            Entry entry = (Entry) e.next();
            C0526b bVar = (C0526b) entry.getValue();
            while (bVar.f2240a.compareTo(this.f2232b) < 0 && !this.f2236f && this.f2231a.contains(entry.getKey())) {
                m2746e(bVar.f2240a);
                bVar.mo3044a(nVar, m2747f(bVar.f2240a));
                m2743c();
            }
        }
    }

    /* renamed from: b */
    private boolean m2740b() {
        boolean z = true;
        if (this.f2231a.size() == 0) {
            return true;
        }
        C0516b bVar = ((C0526b) this.f2231a.mo10122d().getValue()).f2240a;
        C0516b bVar2 = ((C0526b) this.f2231a.mo10125f().getValue()).f2240a;
        if (!(bVar == bVar2 && this.f2232b == bVar2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private static C0515a m2741c(C0516b bVar) {
        int i = C0525a.f2239b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return C0515a.ON_DESTROY;
        } else {
            if (i == 3) {
                return C0515a.ON_STOP;
            }
            if (i == 4) {
                return C0515a.ON_PAUSE;
            }
            if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    private C0516b m2742c(C0522m mVar) {
        Entry b = this.f2231a.mo10117b(mVar);
        C0516b bVar = null;
        C0516b bVar2 = b != null ? ((C0526b) b.getValue()).f2240a : null;
        if (!this.f2237g.isEmpty()) {
            ArrayList<C0516b> arrayList = this.f2237g;
            bVar = (C0516b) arrayList.get(arrayList.size() - 1);
        }
        return m2736a(m2736a(this.f2232b, bVar2), bVar);
    }

    /* renamed from: c */
    private void m2743c() {
        ArrayList<C0516b> arrayList = this.f2237g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: d */
    private void m2744d() {
        C0523n nVar = (C0523n) this.f2233c.get();
        if (nVar != null) {
            while (true) {
                boolean b = m2740b();
                this.f2236f = false;
                if (!b) {
                    if (this.f2232b.compareTo(((C0526b) this.f2231a.mo10122d().getValue()).f2240a) < 0) {
                        m2737a(nVar);
                    }
                    Entry f = this.f2231a.mo10125f();
                    if (!this.f2236f && f != null && this.f2232b.compareTo(((C0526b) f.getValue()).f2240a) > 0) {
                        m2739b(nVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    /* renamed from: d */
    private void m2745d(C0516b bVar) {
        if (this.f2232b != bVar) {
            this.f2232b = bVar;
            if (this.f2235e || this.f2234d != 0) {
                this.f2236f = true;
                return;
            }
            this.f2235e = true;
            m2744d();
            this.f2235e = false;
        }
    }

    /* renamed from: e */
    private void m2746e(C0516b bVar) {
        this.f2237g.add(bVar);
    }

    /* renamed from: f */
    private static C0515a m2747f(C0516b bVar) {
        int i = C0525a.f2239b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C0515a.ON_START;
            }
            if (i == 3) {
                return C0515a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return C0515a.ON_CREATE;
    }

    /* renamed from: a */
    public C0516b mo3036a() {
        return this.f2232b;
    }

    /* renamed from: a */
    public void mo3041a(C0515a aVar) {
        m2745d(m2738b(aVar));
    }

    @Deprecated
    /* renamed from: a */
    public void mo3042a(C0516b bVar) {
        mo3043b(bVar);
    }

    /* renamed from: a */
    public void mo3037a(C0522m mVar) {
        C0516b bVar = this.f2232b;
        C0516b bVar2 = C0516b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C0516b.INITIALIZED;
        }
        C0526b bVar3 = new C0526b(mVar, bVar2);
        if (((C0526b) this.f2231a.mo10116b(mVar, bVar3)) == null) {
            C0523n nVar = (C0523n) this.f2233c.get();
            if (nVar != null) {
                boolean z = this.f2234d != 0 || this.f2235e;
                C0516b c = m2742c(mVar);
                this.f2234d++;
                while (bVar3.f2240a.compareTo(c) < 0 && this.f2231a.contains(mVar)) {
                    m2746e(bVar3.f2240a);
                    bVar3.mo3044a(nVar, m2747f(bVar3.f2240a));
                    m2743c();
                    c = m2742c(mVar);
                }
                if (!z) {
                    m2744d();
                }
                this.f2234d--;
            }
        }
    }

    /* renamed from: b */
    public void mo3043b(C0516b bVar) {
        m2745d(bVar);
    }

    /* renamed from: b */
    public void mo3038b(C0522m mVar) {
        this.f2231a.remove(mVar);
    }
}
