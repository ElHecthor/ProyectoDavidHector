package p071f.p131r;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import p071f.p080b.p081a.p082a.C3137a;
import p071f.p131r.C3490d.C3492b;
import p071f.p131r.C3503h.C3506c;
import p071f.p131r.C3503h.C3509f;
import p308k.p323z.p325d.C5942k;

/* renamed from: f.r.f */
public final class C3500f {
    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public static final <Key, Value> LiveData<C3503h<Value>> m14317a(C3492b<Key, Value> bVar, C3509f fVar, Key key, C3506c<Value> cVar, Executor executor) {
        C5942k.m22327b(bVar, "$receiver");
        C5942k.m22327b(fVar, "config");
        C5942k.m22327b(executor, "fetchExecutor");
        C3497e eVar = new C3497e(bVar, fVar);
        eVar.mo11141a(key);
        eVar.mo11140a(cVar);
        eVar.mo11142a(executor);
        LiveData<C3503h<Value>> a = eVar.mo11139a();
        C5942k.m22324a((Object) a, "LivePagedListBuilder(thi…tor)\n            .build()");
        return a;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ LiveData m14318a(C3492b bVar, C3509f fVar, Object obj, C3506c cVar, Executor executor, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        if ((i & 4) != 0) {
            cVar = null;
        }
        if ((i & 8) != 0) {
            executor = C3137a.m12722b();
            C5942k.m22324a((Object) executor, "ArchTaskExecutor.getIOThreadExecutor()");
        }
        return m14317a(bVar, fVar, obj, cVar, executor);
    }
}
