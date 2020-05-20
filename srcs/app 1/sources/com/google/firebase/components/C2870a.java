package com.google.firebase.components;

import com.google.firebase.p061h.C2924a;
import java.util.Set;

/* renamed from: com.google.firebase.components.a */
abstract class C2870a implements C2876e {
    C2870a() {
    }

    /* renamed from: a */
    public <T> T mo9535a(Class<T> cls) {
        C2924a c = mo9550c(cls);
        if (c == null) {
            return null;
        }
        return c.get();
    }

    /* renamed from: b */
    public <T> Set<T> mo9536b(Class<T> cls) {
        return (Set) mo9551d(cls).get();
    }
}
