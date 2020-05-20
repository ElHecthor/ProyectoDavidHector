package com.crashlytics.android.p033e;

/* renamed from: com.crashlytics.android.e.h */
class C1390h implements C1479t {

    /* renamed from: a */
    private final C1484v f4463a;

    /* renamed from: b */
    private final C1386f0 f4464b;

    /* renamed from: com.crashlytics.android.e.h$a */
    static /* synthetic */ class C1391a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4465a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.crashlytics.android.e.o0$a[] r0 = com.crashlytics.android.p033e.C1462o0.C1463a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4465a = r0
                com.crashlytics.android.e.o0$a r1 = com.crashlytics.android.p033e.C1462o0.C1463a.JAVA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4465a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.crashlytics.android.e.o0$a r1 = com.crashlytics.android.p033e.C1462o0.C1463a.NATIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.p033e.C1390h.C1391a.<clinit>():void");
        }
    }

    public C1390h(C1484v vVar, C1386f0 f0Var) {
        this.f4463a = vVar;
        this.f4464b = f0Var;
    }

    /* renamed from: a */
    public boolean mo5514a(C1477s sVar) {
        int i = C1391a.f4465a[sVar.f4643b.mo5545e().ordinal()];
        if (i == 1) {
            this.f4463a.mo5514a(sVar);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f4464b.mo5514a(sVar);
            return true;
        }
    }
}
