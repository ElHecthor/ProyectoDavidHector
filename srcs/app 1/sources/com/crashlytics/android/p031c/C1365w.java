package com.crashlytics.android.p031c;

import android.content.Context;
import java.util.UUID;
import p242i.p243a.p244a.p245a.p246n.p248b.C4819k;
import p242i.p243a.p244a.p245a.p246n.p251d.C4874b;
import p242i.p243a.p244a.p245a.p246n.p251d.C4877c;
import p242i.p243a.p244a.p245a.p246n.p254g.C4906b;

/* renamed from: com.crashlytics.android.c.w */
class C1365w extends C4874b<C1328a0> {

    /* renamed from: g */
    private C4906b f4424g;

    C1365w(Context context, C1335c0 c0Var, C4819k kVar, C4877c cVar) {
        super(context, c0Var, kVar, cVar, 100);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5469a(C4906b bVar) {
        this.f4424g = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo5470c() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder();
        sb.append("sa");
        String str = "_";
        sb.append(str);
        sb.append(randomUUID.toString());
        sb.append(str);
        sb.append(this.f12700c.mo13877a());
        sb.append(".tap");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo5471e() {
        C4906b bVar = this.f4424g;
        return bVar == null ? super.mo5471e() : bVar.f12756c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo5472f() {
        C4906b bVar = this.f4424g;
        return bVar == null ? super.mo5472f() : bVar.f12757d;
    }
}
