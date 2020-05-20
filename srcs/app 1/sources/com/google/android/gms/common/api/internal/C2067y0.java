package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1995b;
import com.google.android.gms.common.api.C2004g.C2005a;
import com.google.android.gms.common.api.C2071k;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import p147g.p156d.p157a.p167b.p184g.C4351i;

/* renamed from: com.google.android.gms.common.api.internal.y0 */
public final class C2067y0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f5954a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<C4351i<?>, Boolean> f5955b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    private final void m8579a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f5954a) {
            hashMap = new HashMap(this.f5954a);
        }
        synchronized (this.f5955b) {
            hashMap2 = new HashMap(this.f5955b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo6637b(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C4351i) entry2.getKey()).mo13028b((Exception) new C1995b(status));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6756a(BasePendingResult<? extends C2071k> basePendingResult, boolean z) {
        this.f5954a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo6631a((C2005a) new C2050q(this, basePendingResult));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6757a() {
        return !this.f5954a.isEmpty() || !this.f5955b.isEmpty();
    }

    /* renamed from: b */
    public final void mo6758b() {
        m8579a(false, C2025f.f5866n);
    }

    /* renamed from: c */
    public final void mo6759c() {
        m8579a(true, C2043m0.f5925a);
    }
}
