package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2148s;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
final class C2239a5<V> extends FutureTask<V> implements Comparable<C2239a5<V>> {

    /* renamed from: f */
    private final long f6233f;

    /* renamed from: g */
    final boolean f6234g;

    /* renamed from: h */
    private final String f6235h;

    /* renamed from: i */
    private final /* synthetic */ C2528z4 f6236i;

    C2239a5(C2528z4 z4Var, Runnable runnable, boolean z, String str) {
        this.f6236i = z4Var;
        super(runnable, null);
        C2148s.m8834a(str);
        long andIncrement = C2528z4.f7115l.getAndIncrement();
        this.f6233f = andIncrement;
        this.f6235h = str;
        this.f6234g = false;
        if (andIncrement == Long.MAX_VALUE) {
            z4Var.mo7098j().mo7815t().mo7088a("Tasks index overflow");
        }
    }

    C2239a5(C2528z4 z4Var, Callable<V> callable, boolean z, String str) {
        this.f6236i = z4Var;
        super(callable);
        C2148s.m8834a(str);
        long andIncrement = C2528z4.f7115l.getAndIncrement();
        this.f6233f = andIncrement;
        this.f6235h = str;
        this.f6234g = z;
        if (andIncrement == Long.MAX_VALUE) {
            z4Var.mo7098j().mo7815t().mo7088a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C2239a5 a5Var = (C2239a5) obj;
        boolean z = this.f6234g;
        if (z != a5Var.f6234g) {
            return z ? -1 : 1;
        }
        long j = this.f6233f;
        long j2 = a5Var.f6233f;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f6236i.mo7098j().mo7816u().mo7089a("Two tasks share the same index. index", Long.valueOf(this.f6233f));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f6236i.mo7098j().mo7815t().mo7089a(this.f6235h, th);
        super.setException(th);
    }
}
