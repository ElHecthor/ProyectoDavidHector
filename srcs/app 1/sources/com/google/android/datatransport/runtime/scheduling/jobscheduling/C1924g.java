package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo.Builder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p147g.p156d.p157a.p158a.C3741d;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g */
public abstract class C1924g {

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$a */
    public static class C1925a {

        /* renamed from: a */
        private C3833a f5663a;

        /* renamed from: b */
        private Map<C3741d, C1926b> f5664b = new HashMap();

        /* renamed from: a */
        public C1925a mo6454a(C3741d dVar, C1926b bVar) {
            this.f5664b.put(dVar, bVar);
            return this;
        }

        /* renamed from: a */
        public C1925a mo6455a(C3833a aVar) {
            this.f5663a = aVar;
            return this;
        }

        /* renamed from: a */
        public C1924g mo6456a() {
            if (this.f5663a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f5664b.keySet().size() >= C3741d.values().length) {
                Map<C3741d, C1926b> map = this.f5664b;
                this.f5664b = new HashMap();
                return C1924g.m8142a(this.f5663a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b */
    public static abstract class C1926b {

        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b$a */
        public static abstract class C1927a {
            /* renamed from: a */
            public abstract C1927a mo6446a(long j);

            /* renamed from: a */
            public abstract C1927a mo6447a(Set<C1928c> set);

            /* renamed from: a */
            public abstract C1926b mo6448a();

            /* renamed from: b */
            public abstract C1927a mo6449b(long j);
        }

        /* renamed from: d */
        public static C1927a m8153d() {
            C1921b bVar = new C1921b();
            bVar.mo6447a(Collections.emptySet());
            return bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract long mo6440a();

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract Set<C1928c> mo6441b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract long mo6442c();
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$c */
    public enum C1928c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    public static C1924g m8141a(C3833a aVar) {
        C1925a c = m8145c();
        C3741d dVar = C3741d.DEFAULT;
        C1927a d = C1926b.m8153d();
        d.mo6446a(30000);
        d.mo6449b(86400000);
        c.mo6454a(dVar, d.mo6448a());
        C3741d dVar2 = C3741d.HIGHEST;
        C1927a d2 = C1926b.m8153d();
        d2.mo6446a(1000);
        d2.mo6449b(86400000);
        c.mo6454a(dVar2, d2.mo6448a());
        C3741d dVar3 = C3741d.VERY_LOW;
        C1927a d3 = C1926b.m8153d();
        d3.mo6446a(86400000);
        d3.mo6449b(86400000);
        d3.mo6447a(m8143a((T[]) new C1928c[]{C1928c.NETWORK_UNMETERED, C1928c.DEVICE_IDLE}));
        c.mo6454a(dVar3, d3.mo6448a());
        c.mo6455a(aVar);
        return c.mo6456a();
    }

    /* renamed from: a */
    static C1924g m8142a(C3833a aVar, Map<C3741d, C1926b> map) {
        return new C1918c(aVar, map);
    }

    /* renamed from: a */
    private static <T> Set<T> m8143a(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: a */
    private void m8144a(Builder builder, Set<C1928c> set) {
        if (set.contains(C1928c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(C1928c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(C1928c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public static C1925a m8145c() {
        return new C1925a();
    }

    /* renamed from: a */
    public long mo6452a(C3741d dVar, long j, int i) {
        C1926b bVar = (C1926b) mo6436b().get(dVar);
        return Math.min(Math.max(((long) Math.pow(2.0d, (double) (i - 1))) * bVar.mo6440a(), j - mo6435a().mo12001a()), bVar.mo6442c());
    }

    /* renamed from: a */
    public Builder mo6453a(Builder builder, C3741d dVar, long j, int i) {
        builder.setMinimumLatency(mo6452a(dVar, j, i));
        m8144a(builder, ((C1926b) mo6436b().get(dVar)).mo6441b());
        return builder;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C3833a mo6435a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract Map<C3741d, C1926b> mo6436b();
}
