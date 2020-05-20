package kotlinx.coroutines;

import kotlinx.coroutines.internal.C6120i;
import kotlinx.coroutines.internal.C6122k;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.g2 */
public final class C6091g2 extends C6120i implements C6174p1 {
    /* renamed from: a */
    public final String mo15856a(String str) {
        C5942k.m22327b(str, "state");
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object l = mo15897l();
        if (l != null) {
            boolean z = true;
            for (C6122k kVar = (C6122k) l; !C5942k.m22326a((Object) kVar, (Object) this); kVar = kVar.mo15898m()) {
                if (kVar instanceof C5960a2) {
                    C5960a2 a2Var = (C5960a2) kVar;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(a2Var);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            C5942k.m22324a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: a */
    public boolean mo15640a() {
        return true;
    }

    /* renamed from: i */
    public C6091g2 mo15641i() {
        return this;
    }

    public String toString() {
        return C6157l0.m23151c() ? mo15856a("Active") : super.toString();
    }
}
