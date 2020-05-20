package com.bumptech.glide.p029t;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.t.g */
public class C1306g<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f4303a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private long f4304b;

    /* renamed from: c */
    private long f4305c;

    public C1306g(long j) {
        this.f4304b = j;
    }

    /* renamed from: c */
    private void m6137c() {
        mo5371a(this.f4304b);
    }

    /* renamed from: a */
    public synchronized Y mo5369a(T t) {
        return this.f4303a.get(t);
    }

    /* renamed from: a */
    public void mo5370a() {
        mo5371a(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo5371a(long j) {
        while (this.f4305c > j) {
            Iterator it = this.f4303a.entrySet().iterator();
            Entry entry = (Entry) it.next();
            Object value = entry.getValue();
            this.f4305c -= (long) mo4753b(value);
            Object key = entry.getKey();
            it.remove();
            mo4752a(key, value);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4752a(T t, Y y) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo4753b(Y y) {
        return 1;
    }

    /* renamed from: b */
    public synchronized long mo5372b() {
        return this.f4304b;
    }

    /* renamed from: b */
    public synchronized Y mo5373b(T t, Y y) {
        long b = (long) mo4753b(y);
        if (b >= this.f4304b) {
            mo4752a(t, y);
            return null;
        }
        if (y != null) {
            this.f4305c += b;
        }
        Y put = this.f4303a.put(t, y);
        if (put != null) {
            this.f4305c -= (long) mo4753b(put);
            if (!put.equals(y)) {
                mo4752a(t, put);
            }
        }
        m6137c();
        return put;
    }

    /* renamed from: c */
    public synchronized Y mo5374c(T t) {
        Y remove;
        remove = this.f4303a.remove(t);
        if (remove != null) {
            this.f4305c -= (long) mo4753b(remove);
        }
        return remove;
    }
}
