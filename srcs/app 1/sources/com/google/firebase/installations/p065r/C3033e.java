package com.google.firebase.installations.p065r;

/* renamed from: com.google.firebase.installations.r.e */
public abstract class C3033e {

    /* renamed from: com.google.firebase.installations.r.e$a */
    public static abstract class C3034a {
        /* renamed from: a */
        public abstract C3034a mo9792a(long j);

        /* renamed from: a */
        public abstract C3034a mo9793a(C3035b bVar);

        /* renamed from: a */
        public abstract C3034a mo9794a(String str);

        /* renamed from: a */
        public abstract C3033e mo9795a();
    }

    /* renamed from: com.google.firebase.installations.r.e$b */
    public enum C3035b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: d */
    public static C3034a m12377d() {
        C3028b bVar = new C3028b();
        bVar.mo9792a(0);
        return bVar;
    }

    /* renamed from: a */
    public abstract C3035b mo9786a();

    /* renamed from: b */
    public abstract String mo9787b();

    /* renamed from: c */
    public abstract long mo9788c();
}
