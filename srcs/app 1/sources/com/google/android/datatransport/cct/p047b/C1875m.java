package com.google.android.datatransport.cct.p047b;

/* renamed from: com.google.android.datatransport.cct.b.m */
public abstract class C1875m {

    /* renamed from: com.google.android.datatransport.cct.b.m$a */
    public static abstract class C1876a {
        /* renamed from: a */
        public abstract C1876a mo6345a(C1852a aVar);

        /* renamed from: a */
        public abstract C1876a mo6346a(C1877b bVar);

        /* renamed from: a */
        public abstract C1875m mo6347a();
    }

    /* renamed from: com.google.android.datatransport.cct.b.m$b */
    public enum C1877b {
        UNKNOWN(0),
        ANDROID(4);

        static {
            UNKNOWN = new C1877b("UNKNOWN", 0, 0);
            ANDROID = new C1877b("ANDROID", 1, 4);
        }

        private C1877b(int i) {
        }
    }

    /* renamed from: a */
    public static C1876a m8030a() {
        return new C1862b();
    }
}
