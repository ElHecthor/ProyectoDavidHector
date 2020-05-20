package com.bumptech.glide.load.p007o;

import com.bumptech.glide.load.C0869g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.o.s */
final class C1016s {

    /* renamed from: a */
    private final Map<C0869g, C1002l<?>> f3723a = new HashMap();

    /* renamed from: b */
    private final Map<C0869g, C1002l<?>> f3724b = new HashMap();

    C1016s() {
    }

    /* renamed from: a */
    private Map<C0869g, C1002l<?>> m5056a(boolean z) {
        return z ? this.f3724b : this.f3723a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1002l<?> mo4903a(C0869g gVar, boolean z) {
        return (C1002l) m5056a(z).get(gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4904a(C0869g gVar, C1002l<?> lVar) {
        m5056a(lVar.mo4863e()).put(gVar, lVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4905b(C0869g gVar, C1002l<?> lVar) {
        Map a = m5056a(lVar.mo4863e());
        if (lVar.equals(a.get(gVar))) {
            a.remove(gVar);
        }
    }
}
