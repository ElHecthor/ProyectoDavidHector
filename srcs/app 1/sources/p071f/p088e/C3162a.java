package p071f.p088e;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: f.e.a */
public class C3162a<K, V> extends C3175g<K, V> implements Map<K, V> {

    /* renamed from: m */
    C3169f<K, V> f8942m;

    /* renamed from: f.e.a$a */
    class C3163a extends C3169f<K, V> {
        C3163a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo10153a(Object obj) {
            return C3162a.this.mo10267a(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo10154a(int i, int i2) {
            return C3162a.this.f8991g[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public V mo10155a(int i, V v) {
            return C3162a.this.mo5345a(i, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10156a() {
            C3162a.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10157a(int i) {
            C3162a.this.mo5347c(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10158a(K k, V v) {
            C3162a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo10159b(Object obj) {
            return C3162a.this.mo10270b(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<K, V> mo10160b() {
            return C3162a.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo10161c() {
            return C3162a.this.f8992h;
        }
    }

    public C3162a() {
    }

    public C3162a(int i) {
        super(i);
    }

    public C3162a(C3175g gVar) {
        super(gVar);
    }

    /* renamed from: b */
    private C3169f<K, V> m12762b() {
        if (this.f8942m == null) {
            this.f8942m = new C3163a();
        }
        return this.f8942m;
    }

    /* renamed from: a */
    public boolean mo10148a(Collection<?> collection) {
        return C3169f.m12821c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m12762b().mo10207d();
    }

    public Set<K> keySet() {
        return m12762b().mo10208e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo10269a(this.f8992h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return m12762b().mo10209f();
    }
}
