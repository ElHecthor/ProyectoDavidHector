package com.google.firebase.components;

import com.google.firebase.p059f.C2917c;
import com.google.firebase.p061h.C2924a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.v */
final class C2899v extends C2870a {

    /* renamed from: a */
    private final Set<Class<?>> f8378a;

    /* renamed from: b */
    private final Set<Class<?>> f8379b;

    /* renamed from: c */
    private final Set<Class<?>> f8380c;

    /* renamed from: d */
    private final Set<Class<?>> f8381d;

    /* renamed from: e */
    private final Set<Class<?>> f8382e;

    /* renamed from: f */
    private final C2876e f8383f;

    /* renamed from: com.google.firebase.components.v$a */
    private static class C2900a implements C2917c {
        public C2900a(Set<Class<?>> set, C2917c cVar) {
        }
    }

    C2899v(C2873d<?> dVar, C2876e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (C2891n nVar : dVar.mo9537a()) {
            if (nVar.mo9566b()) {
                boolean d = nVar.mo9568d();
                Class a = nVar.mo9565a();
                if (d) {
                    hashSet3.add(a);
                } else {
                    hashSet.add(a);
                }
            } else {
                boolean d2 = nVar.mo9568d();
                Class a2 = nVar.mo9565a();
                if (d2) {
                    hashSet4.add(a2);
                } else {
                    hashSet2.add(a2);
                }
            }
        }
        if (!dVar.mo9540d().isEmpty()) {
            hashSet.add(C2917c.class);
        }
        this.f8378a = Collections.unmodifiableSet(hashSet);
        this.f8379b = Collections.unmodifiableSet(hashSet2);
        this.f8380c = Collections.unmodifiableSet(hashSet3);
        this.f8381d = Collections.unmodifiableSet(hashSet4);
        this.f8382e = dVar.mo9540d();
        this.f8383f = eVar;
    }

    /* renamed from: a */
    public <T> T mo9535a(Class<T> cls) {
        if (this.f8378a.contains(cls)) {
            T a = this.f8383f.mo9535a(cls);
            return !cls.equals(C2917c.class) ? a : new C2900a(this.f8382e, (C2917c) a);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> Set<T> mo9536b(Class<T> cls) {
        if (this.f8380c.contains(cls)) {
            return this.f8383f.mo9536b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> C2924a<T> mo9550c(Class<T> cls) {
        if (this.f8379b.contains(cls)) {
            return this.f8383f.mo9550c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public <T> C2924a<Set<T>> mo9551d(Class<T> cls) {
        if (this.f8381d.contains(cls)) {
            return this.f8383f.mo9551d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }
}
