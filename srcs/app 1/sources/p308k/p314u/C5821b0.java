package p308k.p314u;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import p308k.C5802l;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.u.b0 */
class C5821b0 extends C5815a0 {
    /* renamed from: a */
    public static int m22068a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m22069a(Map<? extends K, ? extends V> map) {
        C5942k.m22327b(map, "$this$toSingletonMap");
        Entry entry = (Entry) map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C5942k.m22324a((Object) singletonMap, "java.util.Collections.singletonMap(key, value)");
        C5942k.m22324a((Object) singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m22070a(C5802l<? extends K, ? extends V> lVar) {
        C5942k.m22327b(lVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(lVar.mo15420c(), lVar.mo15421d());
        C5942k.m22324a((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }
}
