package p255io.stashteam.stashapp.p256b.p257a;

import java.util.List;
import java.util.Map;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.b.a.c */
public final class C4938c {

    /* renamed from: a */
    private final List<C4937b> f12842a;

    public C4938c(List<? extends C4937b> list) {
        C5942k.m22327b(list, "analytics");
        this.f12842a = list;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19734a(C4938c cVar, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        cVar.mo14079a(str, map);
    }

    /* renamed from: a */
    public final void mo14079a(String str, Map<String, ? extends Object> map) {
        C5942k.m22327b(str, "event");
        for (C4937b a : this.f12842a) {
            a.mo14077a(str, map);
        }
    }

    /* renamed from: a */
    public final void mo14080a(Map<String, ? extends Object> map) {
        C5942k.m22327b(map, "params");
        for (C4937b a : this.f12842a) {
            a.mo14078a(map);
        }
    }
}
