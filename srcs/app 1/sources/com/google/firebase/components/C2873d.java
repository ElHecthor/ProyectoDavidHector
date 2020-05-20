package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.d */
public final class C2873d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f8338a;

    /* renamed from: b */
    private final Set<C2891n> f8339b;

    /* renamed from: c */
    private final int f8340c;

    /* renamed from: d */
    private final int f8341d;

    /* renamed from: e */
    private final C2881g<T> f8342e;

    /* renamed from: f */
    private final Set<Class<?>> f8343f;

    /* renamed from: com.google.firebase.components.d$b */
    public static class C2875b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f8344a;

        /* renamed from: b */
        private final Set<C2891n> f8345b;

        /* renamed from: c */
        private int f8346c;

        /* renamed from: d */
        private int f8347d;

        /* renamed from: e */
        private C2881g<T> f8348e;

        /* renamed from: f */
        private Set<Class<?>> f8349f;

        @SafeVarargs
        private C2875b(Class<T> cls, Class<? super T>... clsArr) {
            this.f8344a = new HashSet();
            this.f8345b = new HashSet();
            this.f8346c = 0;
            this.f8347d = 0;
            this.f8349f = new HashSet();
            String str = "Null interface";
            C2898u.m11987a(cls, str);
            this.f8344a.add(cls);
            for (Class<? super T> a : clsArr) {
                C2898u.m11987a(a, str);
            }
            Collections.addAll(this.f8344a, clsArr);
        }

        /* renamed from: a */
        private C2875b<T> m11929a(int i) {
            C2898u.m11989b(this.f8346c == 0, "Instantiation type has already been set.");
            this.f8346c = i;
            return this;
        }

        /* renamed from: a */
        private void m11931a(Class<?> cls) {
            C2898u.m11988a(!this.f8344a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public C2875b<T> m11932d() {
            this.f8347d = 1;
            return this;
        }

        /* renamed from: a */
        public C2875b<T> mo9545a() {
            m11929a(1);
            return this;
        }

        /* renamed from: a */
        public C2875b<T> mo9546a(C2881g<T> gVar) {
            C2898u.m11987a(gVar, "Null factory");
            this.f8348e = gVar;
            return this;
        }

        /* renamed from: a */
        public C2875b<T> mo9547a(C2891n nVar) {
            C2898u.m11987a(nVar, "Null dependency");
            m11931a(nVar.mo9565a());
            this.f8345b.add(nVar);
            return this;
        }

        /* renamed from: b */
        public C2873d<T> mo9548b() {
            C2898u.m11989b(this.f8348e != null, "Missing required property: factory.");
            C2873d dVar = new C2873d(new HashSet(this.f8344a), new HashSet(this.f8345b), this.f8346c, this.f8347d, this.f8348e, this.f8349f);
            return dVar;
        }

        /* renamed from: c */
        public C2875b<T> mo9549c() {
            m11929a(2);
            return this;
        }
    }

    private C2873d(Set<Class<? super T>> set, Set<C2891n> set2, int i, int i2, C2881g<T> gVar, Set<Class<?>> set3) {
        this.f8338a = Collections.unmodifiableSet(set);
        this.f8339b = Collections.unmodifiableSet(set2);
        this.f8340c = i;
        this.f8341d = i2;
        this.f8342e = gVar;
        this.f8343f = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static <T> C2875b<T> m11915a(Class<T> cls) {
        return new C2875b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> C2875b<T> m11916a(Class<T> cls, Class<? super T>... clsArr) {
        return new C2875b<>(cls, clsArr);
    }

    /* renamed from: a */
    public static <T> C2873d<T> m11917a(T t, Class<T> cls) {
        C2875b b = m11920b(cls);
        b.mo9546a(C2872c.m11913a((Object) t));
        return b.mo9548b();
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> C2873d<T> m11918a(T t, Class<T> cls, Class<? super T>... clsArr) {
        C2875b a = m11916a(cls, clsArr);
        a.mo9546a(C2871b.m11911a((Object) t));
        return a.mo9548b();
    }

    /* renamed from: a */
    static /* synthetic */ Object m11919a(Object obj, C2876e eVar) {
        return obj;
    }

    /* renamed from: b */
    public static <T> C2875b<T> m11920b(Class<T> cls) {
        C2875b<T> a = m11915a(cls);
        a.m11932d();
        return a;
    }

    /* renamed from: b */
    static /* synthetic */ Object m11921b(Object obj, C2876e eVar) {
        return obj;
    }

    /* renamed from: a */
    public Set<C2891n> mo9537a() {
        return this.f8339b;
    }

    /* renamed from: b */
    public C2881g<T> mo9538b() {
        return this.f8342e;
    }

    /* renamed from: c */
    public Set<Class<? super T>> mo9539c() {
        return this.f8338a;
    }

    /* renamed from: d */
    public Set<Class<?>> mo9540d() {
        return this.f8343f;
    }

    /* renamed from: e */
    public boolean mo9541e() {
        return this.f8340c == 1;
    }

    /* renamed from: f */
    public boolean mo9542f() {
        return this.f8340c == 2;
    }

    /* renamed from: g */
    public boolean mo9543g() {
        return this.f8341d == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.f8338a.toArray()));
        sb.append(">{");
        sb.append(this.f8340c);
        sb.append(", type=");
        sb.append(this.f8341d);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.f8339b.toArray()));
        sb.append("}");
        return sb.toString();
    }
}
