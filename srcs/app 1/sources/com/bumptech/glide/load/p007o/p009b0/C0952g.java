package com.bumptech.glide.load.p007o.p009b0;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.p007o.C1020v;
import com.bumptech.glide.load.p007o.p009b0.C0953h.C0954a;
import com.bumptech.glide.p029t.C1306g;

/* renamed from: com.bumptech.glide.load.o.b0.g */
public class C0952g extends C1306g<C0869g, C1020v<?>> implements C0953h {

    /* renamed from: d */
    private C0954a f3512d;

    public C0952g(long j) {
        super(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo4753b(C1020v<?> vVar) {
        return vVar == null ? super.mo4753b(null) : vVar.mo4880b();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C1020v mo4748a(C0869g gVar) {
        return (C1020v) super.mo5374c(gVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C1020v mo4749a(C0869g gVar, C1020v vVar) {
        return (C1020v) super.mo5373b(gVar, vVar);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo4750a(int i) {
        if (i >= 40) {
            mo5370a();
        } else if (i >= 20 || i == 15) {
            mo5371a(mo5372b() / 2);
        }
    }

    /* renamed from: a */
    public void mo4751a(C0954a aVar) {
        this.f3512d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4752a(C0869g gVar, C1020v<?> vVar) {
        C0954a aVar = this.f3512d;
        if (aVar != null && vVar != null) {
            aVar.mo4756a(vVar);
        }
    }
}
