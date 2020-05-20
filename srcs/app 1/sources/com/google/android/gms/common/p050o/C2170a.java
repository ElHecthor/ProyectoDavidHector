package com.google.android.gms.common.p050o;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.common.o.a */
public class C2170a {

    /* renamed from: a */
    private static C2171a f6132a;

    /* renamed from: com.google.android.gms.common.o.a$a */
    public interface C2171a {
        /* renamed from: a */
        ScheduledExecutorService mo6956a();
    }

    /* renamed from: a */
    public static synchronized C2171a m8926a() {
        C2171a aVar;
        synchronized (C2170a.class) {
            if (f6132a == null) {
                f6132a = new C2172b();
            }
            aVar = f6132a;
        }
        return aVar;
    }
}
