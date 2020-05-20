package com.bumptech.glide.p029t.p030l;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p071f.p097h.p107l.C3318e;
import p071f.p097h.p107l.C3320g;

/* renamed from: com.bumptech.glide.t.l.a */
public final class C1312a {

    /* renamed from: a */
    private static final C1319g<Object> f4313a = new C1313a();

    /* renamed from: com.bumptech.glide.t.l.a$a */
    class C1313a implements C1319g<Object> {
        C1313a() {
        }

        /* renamed from: a */
        public void mo5385a(Object obj) {
        }
    }

    /* renamed from: com.bumptech.glide.t.l.a$b */
    class C1314b implements C1316d<List<T>> {
        C1314b() {
        }

        /* renamed from: a */
        public List<T> m6182a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bumptech.glide.t.l.a$c */
    class C1315c implements C1319g<List<T>> {
        C1315c() {
        }

        /* renamed from: a */
        public void mo5385a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: com.bumptech.glide.t.l.a$d */
    public interface C1316d<T> {
        /* renamed from: a */
        T mo4764a();
    }

    /* renamed from: com.bumptech.glide.t.l.a$e */
    private static final class C1317e<T> implements C3318e<T> {

        /* renamed from: a */
        private final C1316d<T> f4314a;

        /* renamed from: b */
        private final C1319g<T> f4315b;

        /* renamed from: c */
        private final C3318e<T> f4316c;

        C1317e(C3318e<T> eVar, C1316d<T> dVar, C1319g<T> gVar) {
            this.f4316c = eVar;
            this.f4314a = dVar;
            this.f4315b = gVar;
        }

        /* renamed from: a */
        public T mo5387a() {
            T a = this.f4316c.mo5387a();
            if (a == null) {
                a = this.f4314a.mo4764a();
                String str = "FactoryPools";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(a.getClass());
                    Log.v(str, sb.toString());
                }
            }
            if (a instanceof C1318f) {
                ((C1318f) a).mo4765g().mo5390a(false);
            }
            return a;
        }

        /* renamed from: a */
        public boolean mo5388a(T t) {
            if (t instanceof C1318f) {
                ((C1318f) t).mo4765g().mo5390a(true);
            }
            this.f4315b.mo5385a(t);
            return this.f4316c.mo5388a(t);
        }
    }

    /* renamed from: com.bumptech.glide.t.l.a$f */
    public interface C1318f {
        /* renamed from: g */
        C1321c mo4765g();
    }

    /* renamed from: com.bumptech.glide.t.l.a$g */
    public interface C1319g<T> {
        /* renamed from: a */
        void mo5385a(T t);
    }

    /* renamed from: a */
    private static <T> C1319g<T> m6174a() {
        return f4313a;
    }

    /* renamed from: a */
    public static <T> C3318e<List<T>> m6175a(int i) {
        return m6178a(new C3320g(i), new C1314b(), new C1315c());
    }

    /* renamed from: a */
    public static <T extends C1318f> C3318e<T> m6176a(int i, C1316d<T> dVar) {
        return m6177a((C3318e<T>) new C3320g<T>(i), dVar);
    }

    /* renamed from: a */
    private static <T extends C1318f> C3318e<T> m6177a(C3318e<T> eVar, C1316d<T> dVar) {
        return m6178a(eVar, dVar, m6174a());
    }

    /* renamed from: a */
    private static <T> C3318e<T> m6178a(C3318e<T> eVar, C1316d<T> dVar, C1319g<T> gVar) {
        return new C1317e(eVar, dVar, gVar);
    }

    /* renamed from: b */
    public static <T> C3318e<List<T>> m6179b() {
        return m6175a(20);
    }
}
