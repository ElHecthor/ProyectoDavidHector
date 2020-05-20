package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.p */
final class C2413p implements Iterator<String> {

    /* renamed from: f */
    private Iterator<String> f6776f = this.f6777g.f6653f.keySet().iterator();

    /* renamed from: g */
    private final /* synthetic */ C2377m f6777g;

    C2413p(C2377m mVar) {
        this.f6777g = mVar;
    }

    public final boolean hasNext() {
        return this.f6776f.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f6776f.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
