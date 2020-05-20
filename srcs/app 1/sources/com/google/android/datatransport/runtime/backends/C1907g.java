package com.google.android.datatransport.runtime.backends;

/* renamed from: com.google.android.datatransport.runtime.backends.g */
public abstract class C1907g {

    /* renamed from: com.google.android.datatransport.runtime.backends.g$a */
    public enum C1908a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    /* renamed from: a */
    public static C1907g m8103a(long j) {
        return new C1901b(C1908a.OK, j);
    }

    /* renamed from: c */
    public static C1907g m8104c() {
        return new C1901b(C1908a.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static C1907g m8105d() {
        return new C1901b(C1908a.TRANSIENT_ERROR, -1);
    }

    /* renamed from: a */
    public abstract long mo6413a();

    /* renamed from: b */
    public abstract C1908a mo6414b();
}
