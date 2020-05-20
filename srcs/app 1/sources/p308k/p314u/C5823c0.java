package p308k.p314u;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p308k.C5802l;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.u.c0 */
class C5823c0 extends C5821b0 {
    /* renamed from: a */
    public static <K, V> HashMap<K, V> m22072a(C5802l<? extends K, ? extends V>... lVarArr) {
        C5942k.m22327b(lVarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(C5821b0.m22068a(lVarArr.length));
        m22078a((Map<? super K, ? super V>) hashMap, lVarArr);
        return hashMap;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m22073a() {
        C5849w wVar = C5849w.f14886f;
        if (wVar != null) {
            return wVar;
        }
        throw new C5809q("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m22074a(Iterable<? extends C5802l<? extends K, ? extends V>> iterable) {
        Map<K, V> map;
        C5942k.m22327b(iterable, "$this$toMap");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                map = m22073a();
            } else if (size != 1) {
                map = new LinkedHashMap<>(C5821b0.m22068a(collection.size()));
                m22075a(iterable, (M) map);
            } else {
                map = C5821b0.m22070a((C5802l) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
            }
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m22075a(iterable, (M) linkedHashMap);
        return m22079b((Map<K, ? extends V>) linkedHashMap);
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m22075a(Iterable<? extends C5802l<? extends K, ? extends V>> iterable, M m) {
        C5942k.m22327b(iterable, "$this$toMap");
        C5942k.m22327b(m, "destination");
        m22077a((Map<? super K, ? super V>) m, iterable);
        return m;
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m22076a(C5802l<? extends K, ? extends V>[] lVarArr, M m) {
        C5942k.m22327b(lVarArr, "$this$toMap");
        C5942k.m22327b(m, "destination");
        m22078a((Map<? super K, ? super V>) m, lVarArr);
        return m;
    }

    /* renamed from: a */
    public static final <K, V> void m22077a(Map<? super K, ? super V> map, Iterable<? extends C5802l<? extends K, ? extends V>> iterable) {
        C5942k.m22327b(map, "$this$putAll");
        C5942k.m22327b(iterable, "pairs");
        for (C5802l lVar : iterable) {
            map.put(lVar.mo15418a(), lVar.mo15419b());
        }
    }

    /* renamed from: a */
    public static final <K, V> void m22078a(Map<? super K, ? super V> map, C5802l<? extends K, ? extends V>[] lVarArr) {
        C5942k.m22327b(map, "$this$putAll");
        C5942k.m22327b(lVarArr, "pairs");
        for (C5802l<? extends K, ? extends V> lVar : lVarArr) {
            map.put(lVar.mo15418a(), lVar.mo15419b());
        }
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m22079b(Map<K, ? extends V> map) {
        C5942k.m22327b(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C5821b0.m22069a(map) : m22073a();
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m22080b(C5802l<? extends K, ? extends V>... lVarArr) {
        C5942k.m22327b(lVarArr, "pairs");
        if (lVarArr.length <= 0) {
            return m22073a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5821b0.m22068a(lVarArr.length));
        m22076a(lVarArr, (M) linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m22081c(Map<? extends K, ? extends V> map) {
        C5942k.m22327b(map, "$this$toMutableMap");
        return new LinkedHashMap(map);
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m22082c(C5802l<? extends K, ? extends V>... lVarArr) {
        C5942k.m22327b(lVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5821b0.m22068a(lVarArr.length));
        m22078a((Map<? super K, ? super V>) linkedHashMap, lVarArr);
        return linkedHashMap;
    }
}
