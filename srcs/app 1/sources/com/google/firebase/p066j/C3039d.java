package com.google.firebase.p066j;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.j.d */
public class C3039d {

    /* renamed from: b */
    private static volatile C3039d f8662b;

    /* renamed from: a */
    private final Set<C3041f> f8663a = new HashSet();

    C3039d() {
    }

    /* renamed from: b */
    public static C3039d m12393b() {
        C3039d dVar = f8662b;
        if (dVar == null) {
            synchronized (C3039d.class) {
                dVar = f8662b;
                if (dVar == null) {
                    dVar = new C3039d();
                    f8662b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Set<C3041f> mo9804a() {
        Set<C3041f> unmodifiableSet;
        synchronized (this.f8663a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f8663a);
        }
        return unmodifiableSet;
    }
}
