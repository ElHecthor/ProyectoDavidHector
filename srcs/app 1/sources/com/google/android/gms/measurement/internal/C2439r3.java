package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r3 */
public final class C2439r3<V> {

    /* renamed from: h */
    private static final Object f6824h = new Object();

    /* renamed from: a */
    private final String f6825a;

    /* renamed from: b */
    private final C2417p3<V> f6826b;

    /* renamed from: c */
    private final V f6827c;

    /* renamed from: d */
    private final V f6828d;

    /* renamed from: e */
    private final Object f6829e;

    /* renamed from: f */
    private volatile V f6830f;

    /* renamed from: g */
    private volatile V f6831g;

    private C2439r3(String str, V v, V v2, C2417p3<V> p3Var) {
        this.f6829e = new Object();
        this.f6830f = null;
        this.f6831g = null;
        this.f6825a = str;
        this.f6827c = v;
        this.f6828d = v2;
        this.f6826b = p3Var;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 171 */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:28|29|30|(1:32)|33|34|4a|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0021, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r4 = com.google.android.gms.measurement.internal.C2457t.f6906a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0.f6831g = r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0048 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0062 A[SYNTHETIC, Splitter:B:51:0x0062] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo7587a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6829e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.measurement.internal.ja r4 = com.google.android.gms.measurement.internal.C2406o3.f6758a
            if (r4 != 0) goto L_0x000e
            V r4 = r3.f6827c
            return r4
        L_0x000e:
            java.lang.Object r4 = f6824h
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.C2352ja.m9553a()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0022
            V r0 = r3.f6831g     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x001e
            V r0 = r3.f6827c     // Catch:{ all -> 0x006d }
            goto L_0x0020
        L_0x001e:
            V r0 = r3.f6831g     // Catch:{ all -> 0x006d }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            return r0
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            java.util.List r4 = com.google.android.gms.measurement.internal.C2457t.f6906a     // Catch:{ SecurityException -> 0x005a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x005a }
        L_0x002b:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x005a }
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x005a }
            com.google.android.gms.measurement.internal.r3 r0 = (com.google.android.gms.measurement.internal.C2439r3) r0     // Catch:{ SecurityException -> 0x005a }
            boolean r1 = com.google.android.gms.measurement.internal.C2352ja.m9553a()     // Catch:{ SecurityException -> 0x005a }
            if (r1 != 0) goto L_0x0052
            r1 = 0
            com.google.android.gms.measurement.internal.p3<V> r2 = r0.f6826b     // Catch:{ IllegalStateException -> 0x0048 }
            if (r2 == 0) goto L_0x0048
            com.google.android.gms.measurement.internal.p3<V> r2 = r0.f6826b     // Catch:{ IllegalStateException -> 0x0048 }
            java.lang.Object r1 = r2.mo7087a()     // Catch:{ IllegalStateException -> 0x0048 }
        L_0x0048:
            java.lang.Object r2 = f6824h     // Catch:{ SecurityException -> 0x005a }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x005a }
            r0.f6831g = r1     // Catch:{ all -> 0x004f }
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            goto L_0x002b
        L_0x004f:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            throw r4     // Catch:{ SecurityException -> 0x005a }
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x005a }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x005a }
            throw r4     // Catch:{ SecurityException -> 0x005a }
        L_0x005a:
        L_0x005b:
            com.google.android.gms.measurement.internal.p3<V> r4 = r3.f6826b
            if (r4 != 0) goto L_0x0062
            V r4 = r3.f6827c
            return r4
        L_0x0062:
            java.lang.Object r4 = r4.mo7087a()     // Catch:{ SecurityException -> 0x006a, IllegalStateException -> 0x0067 }
            return r4
        L_0x0067:
            V r4 = r3.f6827c
            return r4
        L_0x006a:
            V r4 = r3.f6827c
            return r4
        L_0x006d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            throw r0
        L_0x0070:
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            throw r4
        L_0x0072:
            r4 = move-exception
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2439r3.mo7587a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public final String mo7588a() {
        return this.f6825a;
    }
}
