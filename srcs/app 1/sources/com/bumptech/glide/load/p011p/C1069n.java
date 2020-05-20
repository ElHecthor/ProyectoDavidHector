package com.bumptech.glide.load.p011p;

import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p005n.C0881d;
import com.bumptech.glide.p029t.C1309j;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.n */
public interface C1069n<Model, Data> {

    /* renamed from: com.bumptech.glide.load.p.n$a */
    public static class C1070a<Data> {

        /* renamed from: a */
        public final C0869g f3806a;

        /* renamed from: b */
        public final List<C0869g> f3807b;

        /* renamed from: c */
        public final C0881d<Data> f3808c;

        public C1070a(C0869g gVar, C0881d<Data> dVar) {
            this(gVar, Collections.emptyList(), dVar);
        }

        public C1070a(C0869g gVar, List<C0869g> list, C0881d<Data> dVar) {
            C1309j.m6149a(gVar);
            this.f3806a = gVar;
            C1309j.m6149a(list);
            this.f3807b = list;
            C1309j.m6149a(dVar);
            this.f3808c = dVar;
        }
    }

    /* renamed from: a */
    C1070a<Data> mo4571a(Model model, int i, int i2, C0873i iVar);

    /* renamed from: a */
    boolean mo4573a(Model model);
}
