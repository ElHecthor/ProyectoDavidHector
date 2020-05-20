package p071f.p080b.p081a.p083b;

import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: f.b.a.b.a */
public class C3143a<K, V> extends C3144b<K, V> {

    /* renamed from: j */
    private HashMap<K, C3147c<K, V>> f8913j = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3147c<K, V> mo10115a(K k) {
        return (C3147c) this.f8913j.get(k);
    }

    /* renamed from: b */
    public V mo10116b(K k, V v) {
        C3147c a = mo10115a(k);
        if (a != null) {
            return a.f8919g;
        }
        this.f8913j.put(k, mo10120a(k, v));
        return null;
    }

    /* renamed from: b */
    public Entry<K, V> mo10117b(K k) {
        if (contains(k)) {
            return ((C3147c) this.f8913j.get(k)).f8921i;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f8913j.containsKey(k);
    }

    public V remove(K k) {
        V remove = super.remove(k);
        this.f8913j.remove(k);
        return remove;
    }
}
