package com.google.android.datatransport.cct.p047b;

import android.util.SparseArray;

/* renamed from: com.google.android.datatransport.cct.b.b */
public enum C1854b {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: l */
    private static final SparseArray<C1854b> f5502l = null;

    static {
        DEFAULT = new C1854b("DEFAULT", 0, 0);
        UNMETERED_ONLY = new C1854b("UNMETERED_ONLY", 1, 1);
        UNMETERED_OR_DAILY = new C1854b("UNMETERED_OR_DAILY", 2, 2);
        FAST_IF_RADIO_AWAKE = new C1854b("FAST_IF_RADIO_AWAKE", 3, 3);
        NEVER = new C1854b("NEVER", 4, 4);
        UNRECOGNIZED = new C1854b("UNRECOGNIZED", 5, -1);
        SparseArray<C1854b> sparseArray = new SparseArray<>();
        f5502l = sparseArray;
        sparseArray.put(0, DEFAULT);
        f5502l.put(1, UNMETERED_ONLY);
        f5502l.put(2, UNMETERED_OR_DAILY);
        f5502l.put(3, FAST_IF_RADIO_AWAKE);
        f5502l.put(4, NEVER);
        f5502l.put(-1, UNRECOGNIZED);
    }

    private C1854b(int i) {
    }
}
