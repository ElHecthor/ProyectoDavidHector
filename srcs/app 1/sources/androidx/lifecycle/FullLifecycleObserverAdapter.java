package androidx.lifecycle;

import androidx.lifecycle.C0514h.C0515a;

class FullLifecycleObserverAdapter implements C0521l {

    /* renamed from: f */
    private final C0511e f2170f;

    /* renamed from: g */
    private final C0521l f2171g;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    static /* synthetic */ class C0489a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2172a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.h$a[] r0 = androidx.lifecycle.C0514h.C0515a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2172a = r0
                androidx.lifecycle.h$a r1 = androidx.lifecycle.C0514h.C0515a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2172a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.C0514h.C0515a.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2172a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.C0514h.C0515a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2172a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.C0514h.C0515a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2172a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.C0514h.C0515a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2172a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.C0514h.C0515a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2172a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.C0514h.C0515a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C0489a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(C0511e eVar, C0521l lVar) {
        this.f2170f = eVar;
        this.f2171g = lVar;
    }

    /* renamed from: a */
    public void mo124a(C0523n nVar, C0515a aVar) {
        switch (C0489a.f2172a[aVar.ordinal()]) {
            case 1:
                this.f2170f.mo3031c(nVar);
                break;
            case 2:
                this.f2170f.mo3033e(nVar);
                break;
            case 3:
                this.f2170f.mo3029a(nVar);
                break;
            case 4:
                this.f2170f.mo3032d(nVar);
                break;
            case 5:
                this.f2170f.mo3034f(nVar);
                break;
            case 6:
                this.f2170f.mo3030b(nVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C0521l lVar = this.f2171g;
        if (lVar != null) {
            lVar.mo124a(nVar, aVar);
        }
    }
}
