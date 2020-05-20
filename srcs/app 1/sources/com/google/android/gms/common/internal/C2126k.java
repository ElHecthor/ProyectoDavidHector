package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C2087f;
import com.google.android.gms.common.api.C1981a.C1992f;

/* renamed from: com.google.android.gms.common.internal.k */
public class C2126k {

    /* renamed from: a */
    private final SparseIntArray f6077a = new SparseIntArray();

    /* renamed from: b */
    private C2087f f6078b;

    public C2126k(C2087f fVar) {
        C2148s.m8834a(fVar);
        this.f6078b = fVar;
    }

    /* renamed from: a */
    public int mo6907a(Context context, C1992f fVar) {
        C2148s.m8834a(context);
        C2148s.m8834a(fVar);
        int i = 0;
        if (!fVar.mo6602d()) {
            return 0;
        }
        int e = fVar.mo6556e();
        int i2 = this.f6077a.get(e, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f6077a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.f6077a.keyAt(i3);
            if (keyAt > e && this.f6077a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.f6078b.mo6797a(context, e);
        }
        this.f6077a.put(e, i);
        return i;
    }

    /* renamed from: a */
    public void mo6908a() {
        this.f6077a.clear();
    }
}
