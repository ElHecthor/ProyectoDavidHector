package p147g.p156d.p204b.p207y;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p147g.p156d.p204b.C4493h;
import p147g.p156d.p204b.C4498m;
import p147g.p156d.p204b.p207y.p210o.C4630b;
import p147g.p156d.p204b.p211z.C4632a;

/* renamed from: g.d.b.y.c */
public final class C4522c {

    /* renamed from: a */
    private final Map<Type, C4493h<?>> f11928a;

    /* renamed from: b */
    private final C4630b f11929b = C4630b.m18684a();

    /* renamed from: g.d.b.y.c$a */
    class C4523a implements C4550i<T> {
        C4523a(C4522c cVar) {
        }

        /* renamed from: a */
        public T mo13419a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: g.d.b.y.c$b */
    class C4524b implements C4550i<T> {
        C4524b(C4522c cVar) {
        }

        /* renamed from: a */
        public T mo13419a() {
            return new TreeMap();
        }
    }

    /* renamed from: g.d.b.y.c$c */
    class C4525c implements C4550i<T> {
        C4525c(C4522c cVar) {
        }

        /* renamed from: a */
        public T mo13419a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: g.d.b.y.c$d */
    class C4526d implements C4550i<T> {
        C4526d(C4522c cVar) {
        }

        /* renamed from: a */
        public T mo13419a() {
            return new C4542h();
        }
    }

    /* renamed from: g.d.b.y.c$e */
    class C4527e implements C4550i<T> {

        /* renamed from: a */
        private final C4556m f11930a = C4556m.m18450a();

        /* renamed from: b */
        final /* synthetic */ Class f11931b;

        /* renamed from: c */
        final /* synthetic */ Type f11932c;

        C4527e(C4522c cVar, Class cls, Type type) {
            this.f11931b = cls;
            this.f11932c = type;
        }

        /* renamed from: a */
        public T mo13419a() {
            try {
                return this.f11930a.mo13475a(this.f11931b);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to invoke no-args constructor for ");
                sb.append(this.f11932c);
                sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                throw new RuntimeException(sb.toString(), e);
            }
        }
    }

    /* renamed from: g.d.b.y.c$f */
    class C4528f implements C4550i<T> {

        /* renamed from: a */
        final /* synthetic */ C4493h f11933a;

        /* renamed from: b */
        final /* synthetic */ Type f11934b;

        C4528f(C4522c cVar, C4493h hVar, Type type) {
            this.f11933a = hVar;
            this.f11934b = type;
        }

        /* renamed from: a */
        public T mo13419a() {
            return this.f11933a.mo13357a(this.f11934b);
        }
    }

    /* renamed from: g.d.b.y.c$g */
    class C4529g implements C4550i<T> {

        /* renamed from: a */
        final /* synthetic */ C4493h f11935a;

        /* renamed from: b */
        final /* synthetic */ Type f11936b;

        C4529g(C4522c cVar, C4493h hVar, Type type) {
            this.f11935a = hVar;
            this.f11936b = type;
        }

        /* renamed from: a */
        public T mo13419a() {
            return this.f11935a.mo13357a(this.f11936b);
        }
    }

    /* renamed from: g.d.b.y.c$h */
    class C4530h implements C4550i<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f11937a;

        C4530h(C4522c cVar, Constructor constructor) {
            this.f11937a = constructor;
        }

        /* renamed from: a */
        public T mo13419a() {
            String str = " with no args";
            String str2 = "Failed to invoke ";
            try {
                return this.f11937a.newInstance(null);
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f11937a);
                sb.append(str);
                throw new RuntimeException(sb.toString(), e);
            } catch (InvocationTargetException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.f11937a);
                sb2.append(str);
                throw new RuntimeException(sb2.toString(), e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: g.d.b.y.c$i */
    class C4531i implements C4550i<T> {
        C4531i(C4522c cVar) {
        }

        /* renamed from: a */
        public T mo13419a() {
            return new TreeSet();
        }
    }

    /* renamed from: g.d.b.y.c$j */
    class C4532j implements C4550i<T> {

        /* renamed from: a */
        final /* synthetic */ Type f11938a;

        C4532j(C4522c cVar, Type type) {
            this.f11938a = type;
        }

        /* renamed from: a */
        public T mo13419a() {
            Type type = this.f11938a;
            String str = "Invalid EnumSet type: ";
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f11938a.toString());
                throw new C4498m(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f11938a.toString());
            throw new C4498m(sb2.toString());
        }
    }

    /* renamed from: g.d.b.y.c$k */
    class C4533k implements C4550i<T> {
        C4533k(C4522c cVar) {
        }

        /* renamed from: a */
        public T mo13419a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: g.d.b.y.c$l */
    class C4534l implements C4550i<T> {
        C4534l(C4522c cVar) {
        }

        /* renamed from: a */
        public T mo13419a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: g.d.b.y.c$m */
    class C4535m implements C4550i<T> {
        C4535m(C4522c cVar) {
        }

        /* renamed from: a */
        public T mo13419a() {
            return new ArrayList();
        }
    }

    /* renamed from: g.d.b.y.c$n */
    class C4536n implements C4550i<T> {
        C4536n(C4522c cVar) {
        }

        /* renamed from: a */
        public T mo13419a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C4522c(Map<Type, C4493h<?>> map) {
        this.f11928a = map;
    }

    /* renamed from: a */
    private <T> C4550i<T> m18387a(Class<? super T> cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f11929b.mo13527a(declaredConstructor);
            }
            return new C4530h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> C4550i<T> m18388a(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new C4531i(this) : EnumSet.class.isAssignableFrom(cls) ? new C4532j(this, type) : Set.class.isAssignableFrom(cls) ? new C4533k(this) : Queue.class.isAssignableFrom(cls) ? new C4534l(this) : new C4535m(this);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new C4536n(this) : ConcurrentMap.class.isAssignableFrom(cls) ? new C4523a(this) : SortedMap.class.isAssignableFrom(cls) ? new C4524b(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C4632a.m18691a(((ParameterizedType) type).getActualTypeArguments()[0]).mo13529a())) ? new C4526d(this) : new C4525c(this);
        }
        return null;
    }

    /* renamed from: b */
    private <T> C4550i<T> m18389b(Type type, Class<? super T> cls) {
        return new C4527e(this, cls, type);
    }

    /* renamed from: a */
    public <T> C4550i<T> mo13417a(C4632a<T> aVar) {
        Type b = aVar.mo13530b();
        Class a = aVar.mo13529a();
        C4493h hVar = (C4493h) this.f11928a.get(b);
        if (hVar != null) {
            return new C4528f(this, hVar, b);
        }
        C4493h hVar2 = (C4493h) this.f11928a.get(a);
        if (hVar2 != null) {
            return new C4529g(this, hVar2, b);
        }
        C4550i<T> a2 = m18387a(a);
        if (a2 != null) {
            return a2;
        }
        C4550i<T> a3 = m18388a(b, a);
        return a3 != null ? a3 : m18389b(b, a);
    }

    public String toString() {
        return this.f11928a.toString();
    }
}
