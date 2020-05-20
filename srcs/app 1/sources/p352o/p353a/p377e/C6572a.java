package p352o.p353a.p377e;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p308k.p311c0.C5739b;
import p308k.p323z.C5905a;
import p308k.p323z.p325d.C5942k;

/* renamed from: o.a.e.a */
public final class C6572a {

    /* renamed from: a */
    private static final Map<C5739b<?>, String> f16227a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final String m24854a(C5739b<?> bVar) {
        C5942k.m22327b(bVar, "$this$getFullName");
        String str = (String) f16227a.get(bVar);
        return str != null ? str : m24855b(bVar);
    }

    /* renamed from: b */
    private static final String m24855b(C5739b<?> bVar) {
        String name = C5905a.m22294a(bVar).getName();
        Map<C5739b<?>, String> map = f16227a;
        C5942k.m22324a((Object) name, "name");
        map.put(bVar, name);
        return name;
    }
}
