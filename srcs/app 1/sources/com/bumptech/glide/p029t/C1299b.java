package com.bumptech.glide.p029t;

import p071f.p088e.C3162a;
import p071f.p088e.C3175g;

/* renamed from: com.bumptech.glide.t.b */
public final class C1299b<K, V> extends C3162a<K, V> {

    /* renamed from: n */
    private int f4293n;

    /* renamed from: a */
    public V mo5345a(int i, V v) {
        this.f4293n = 0;
        return super.mo5345a(i, v);
    }

    /* renamed from: a */
    public void mo5346a(C3175g<? extends K, ? extends V> gVar) {
        this.f4293n = 0;
        super.mo5346a(gVar);
    }

    /* renamed from: c */
    public V mo5347c(int i) {
        this.f4293n = 0;
        return super.mo5347c(i);
    }

    public void clear() {
        this.f4293n = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f4293n == 0) {
            this.f4293n = super.hashCode();
        }
        return this.f4293n;
    }

    public V put(K k, V v) {
        this.f4293n = 0;
        return super.put(k, v);
    }
}
