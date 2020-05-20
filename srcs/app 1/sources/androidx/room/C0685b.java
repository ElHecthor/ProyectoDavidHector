package androidx.room;

import java.util.Map;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C6012b0;
import kotlinx.coroutines.C6162m1;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: androidx.room.b */
public final class C0685b {
    /* renamed from: a */
    public static final C6012b0 m3900a(C0711l lVar) {
        C5942k.m22327b(lVar, "$this$queryDispatcher");
        Map f = lVar.mo4072f();
        C5942k.m22324a((Object) f, "backingFieldMap");
        String str = "QueryDispatcher";
        Object obj = f.get(str);
        if (obj == null) {
            Executor j = lVar.mo4076j();
            C5942k.m22324a((Object) j, "queryExecutor");
            obj = C6162m1.m23160a(j);
            f.put(str, obj);
        }
        if (obj != null) {
            return (C6012b0) obj;
        }
        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
    }

    /* renamed from: b */
    public static final C6012b0 m3901b(C0711l lVar) {
        C5942k.m22327b(lVar, "$this$transactionDispatcher");
        Map f = lVar.mo4072f();
        C5942k.m22324a((Object) f, "backingFieldMap");
        String str = "TransactionDispatcher";
        Object obj = f.get(str);
        if (obj == null) {
            Executor l = lVar.mo4078l();
            C5942k.m22324a((Object) l, "transactionExecutor");
            obj = C6162m1.m23160a(l);
            f.put(str, obj);
        }
        if (obj != null) {
            return (C6012b0) obj;
        }
        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
    }
}
