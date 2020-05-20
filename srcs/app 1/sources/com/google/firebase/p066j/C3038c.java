package com.google.firebase.p066j;

import com.google.firebase.components.C2873d;
import com.google.firebase.components.C2873d.C2875b;
import com.google.firebase.components.C2876e;
import com.google.firebase.components.C2891n;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.firebase.j.c */
public class C3038c implements C3043h {

    /* renamed from: a */
    private final String f8660a;

    /* renamed from: b */
    private final C3039d f8661b;

    C3038c(Set<C3041f> set, C3039d dVar) {
        this.f8660a = m12390a(set);
        this.f8661b = dVar;
    }

    /* renamed from: a */
    static /* synthetic */ C3043h m12389a(C2876e eVar) {
        return new C3038c(eVar.mo9536b(C3041f.class), C3039d.m12393b());
    }

    /* renamed from: a */
    private static String m12390a(Set<C3041f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C3041f fVar = (C3041f) it.next();
            sb.append(fVar.mo9798a());
            sb.append('/');
            sb.append(fVar.mo9799b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static C2873d<C3043h> m12391b() {
        C2875b a = C2873d.m11915a(C3043h.class);
        a.mo9547a(C2891n.m11974c(C3041f.class));
        a.mo9546a(C3037b.m12387a());
        return a.mo9548b();
    }

    /* renamed from: a */
    public String mo9803a() {
        if (this.f8661b.mo9804a().isEmpty()) {
            return this.f8660a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8660a);
        sb.append(' ');
        sb.append(m12390a(this.f8661b.mo9804a()));
        return sb.toString();
    }
}
