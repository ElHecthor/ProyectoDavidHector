package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.facebook.internal.u */
public enum C1697u {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    

    /* renamed from: j */
    public static final EnumSet<C1697u> f5157j = null;

    /* renamed from: f */
    private final long f5159f;

    static {
        f5157j = EnumSet.allOf(C1697u.class);
    }

    private C1697u(long j) {
        this.f5159f = j;
    }

    /* renamed from: a */
    public static EnumSet<C1697u> m7351a(long j) {
        EnumSet<C1697u> noneOf = EnumSet.noneOf(C1697u.class);
        Iterator it = f5157j.iterator();
        while (it.hasNext()) {
            C1697u uVar = (C1697u) it.next();
            if ((uVar.mo5943f() & j) != 0) {
                noneOf.add(uVar);
            }
        }
        return noneOf;
    }

    /* renamed from: f */
    public long mo5943f() {
        return this.f5159f;
    }
}
