package kotlinx.coroutines.p331d3;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C6140w;

/* renamed from: kotlinx.coroutines.d3.m */
public final class C6063m {

    /* renamed from: a */
    public static final long f15151a = C6142y.m23093a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f15152b = C6142y.m23091a("kotlinx.coroutines.scheduler.offload.threshold", 96, 0, 128, 4, (Object) null);

    /* renamed from: c */
    public static final int f15153c = C6142y.m23091a("kotlinx.coroutines.scheduler.core.pool.size", C5736g.m21866a(C6140w.m23081a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: d */
    public static final int f15154d = C6142y.m23091a("kotlinx.coroutines.scheduler.max.pool.size", C5736g.m21867a(C6140w.m23081a() * 128, f15153c, 2097150), 0, 2097150, 4, (Object) null);

    /* renamed from: e */
    public static final long f15155e = TimeUnit.SECONDS.toNanos(C6142y.m23093a("kotlinx.coroutines.scheduler.keep.alive.sec", 5, 0, 0, 12, (Object) null));

    /* renamed from: f */
    public static C6064n f15156f = C6057g.f15142a;

    /* JADX INFO: used method not loaded: kotlinx.coroutines.internal.y.a(java.lang.String, long, long, long, int, java.lang.Object):null, types can be incorrect */
    /* JADX INFO: used method not loaded: kotlinx.coroutines.internal.y.a(java.lang.String, int, int, int, int, java.lang.Object):null, types can be incorrect */
    static {
        C6142y.m23091a("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
    }
}
