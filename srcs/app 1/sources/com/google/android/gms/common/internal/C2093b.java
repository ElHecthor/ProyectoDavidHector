package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C1995b;
import com.google.android.gms.common.api.C2070j;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b */
public class C2093b {
    /* renamed from: a */
    public static C1995b m8643a(Status status) {
        return status.mo6585g() ? new C2070j(status) : new C1995b(status);
    }
}
