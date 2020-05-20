package p352o.p353a.p359b.p360a.p362d.p363a;

import android.content.ComponentCallbacks;
import androidx.lifecycle.C0498a0;
import androidx.lifecycle.C0523n;
import p308k.C5809q;
import p308k.p311c0.C5739b;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p352o.p353a.p354a.p356b.p357a.C6511a;
import p352o.p353a.p359b.p360a.C6516a;
import p352o.p353a.p359b.p360a.C6517b;
import p352o.p353a.p364c.C6522a;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: o.a.b.a.d.a.a */
public final class C6521a {
    /* renamed from: a */
    public static final <T extends C0498a0> T m24722a(C0523n nVar, C5739b<T> bVar, C6560a aVar, C5907a<C6557a> aVar2) {
        C5942k.m22327b(nVar, "$this$getViewModel");
        C5942k.m22327b(bVar, "clazz");
        C6522a a = m24723a(nVar);
        C6516a aVar3 = new C6516a(bVar, nVar, aVar, null, aVar2, 8, null);
        return C6517b.m24717a(a, aVar3);
    }

    /* renamed from: a */
    private static final C6522a m24723a(C0523n nVar) {
        if (nVar != null) {
            return C6511a.m24704a((ComponentCallbacks) nVar);
        }
        throw new C5809q("null cannot be cast to non-null type android.content.ComponentCallbacks");
    }
}
