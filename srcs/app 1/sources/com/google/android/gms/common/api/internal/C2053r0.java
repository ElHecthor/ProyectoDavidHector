package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.api.C1996c;
import java.util.Map;
import java.util.Set;
import p071f.p088e.C3162a;
import p147g.p156d.p157a.p167b.p184g.C4351i;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
public final class C2053r0 {

    /* renamed from: a */
    private final C3162a<C2014b<?>, C2078b> f5933a;

    /* renamed from: b */
    private final C3162a<C2014b<?>, String> f5934b;

    /* renamed from: c */
    private final C4351i<Map<C2014b<?>, String>> f5935c;

    /* renamed from: d */
    private int f5936d;

    /* renamed from: e */
    private boolean f5937e;

    /* renamed from: a */
    public final Set<C2014b<?>> mo6742a() {
        return this.f5933a.keySet();
    }

    /* renamed from: a */
    public final void mo6743a(C2014b<?> bVar, C2078b bVar2, String str) {
        this.f5933a.put(bVar, bVar2);
        this.f5934b.put(bVar, str);
        this.f5936d--;
        if (!bVar2.mo6781k()) {
            this.f5937e = true;
        }
        if (this.f5936d == 0) {
            if (this.f5937e) {
                this.f5935c.mo13026a((Exception) new C1996c(this.f5933a));
                return;
            }
            this.f5935c.mo13027a(this.f5934b);
        }
    }
}
