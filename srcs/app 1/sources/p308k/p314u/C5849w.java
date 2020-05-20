package p308k.p314u;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.u.w */
final class C5849w implements Map, Serializable, C5954a {

    /* renamed from: f */
    public static final C5849w f14886f = new C5849w();
    private static final long serialVersionUID = 8246714829545688274L;

    private C5849w() {
    }

    private final Object readResolve() {
        return f14886f;
    }

    /* renamed from: a */
    public Set<Entry> mo15527a() {
        return C5850x.f14887f;
    }

    /* renamed from: a */
    public boolean mo15528a(Void voidR) {
        C5942k.m22327b(voidR, "value");
        return false;
    }

    /* renamed from: b */
    public Set<Object> mo15529b() {
        return C5850x.f14887f;
    }

    /* renamed from: c */
    public int mo15530c() {
        return 0;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return mo15528a((Void) obj);
        }
        return false;
    }

    /* renamed from: d */
    public Collection mo15534d() {
        return C5848v.f14885f;
    }

    public final /* bridge */ Set<Entry> entrySet() {
        return mo15527a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ Object get(Object obj) {
        return get(obj);
    }

    public Void get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo15529b();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo15530c();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo15534d();
    }
}
