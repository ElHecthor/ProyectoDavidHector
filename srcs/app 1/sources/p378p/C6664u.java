package p378p;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p337m.C6225a0;
import p337m.C6236c0;
import p337m.C6244e.C6245a;
import p337m.C6448t;
import p337m.C6462x;
import p378p.C6605e.C6606a;
import p378p.C6614h.C6615a;

/* renamed from: p.u */
public final class C6664u {

    /* renamed from: a */
    private final Map<Method, C6667v<?>> f16399a = new ConcurrentHashMap();

    /* renamed from: b */
    final C6245a f16400b;

    /* renamed from: c */
    final C6448t f16401c;

    /* renamed from: d */
    final List<C6615a> f16402d;

    /* renamed from: e */
    final List<C6606a> f16403e;

    /* renamed from: f */
    final boolean f16404f;

    /* renamed from: p.u$a */
    class C6665a implements InvocationHandler {

        /* renamed from: a */
        private final C6656q f16405a = C6656q.m24995e();

        /* renamed from: b */
        private final Object[] f16406b = new Object[0];

        /* renamed from: c */
        final /* synthetic */ Class f16407c;

        C6665a(Class cls) {
            this.f16407c = cls;
        }

        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f16405a.mo17111a(method)) {
                return this.f16405a.mo17108a(method, this.f16407c, obj, objArr);
            }
            C6667v a = C6664u.this.mo17137a(method);
            if (objArr == null) {
                objArr = this.f16406b;
            }
            return a.mo17090a(objArr);
        }
    }

    /* renamed from: p.u$b */
    public static final class C6666b {

        /* renamed from: a */
        private final C6656q f16409a;
        @Nullable

        /* renamed from: b */
        private C6245a f16410b;
        @Nullable

        /* renamed from: c */
        private C6448t f16411c;

        /* renamed from: d */
        private final List<C6615a> f16412d;

        /* renamed from: e */
        private final List<C6606a> f16413e;
        @Nullable

        /* renamed from: f */
        private Executor f16414f;

        /* renamed from: g */
        private boolean f16415g;

        public C6666b() {
            this(C6656q.m24995e());
        }

        C6666b(C6656q qVar) {
            this.f16412d = new ArrayList();
            this.f16413e = new ArrayList();
            this.f16409a = qVar;
        }

        /* renamed from: a */
        public C6666b mo17141a(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            mo17143a(C6448t.m24276c(str));
            return this;
        }

        /* renamed from: a */
        public C6666b mo17142a(C6245a aVar) {
            this.f16410b = (C6245a) Objects.requireNonNull(aVar, "factory == null");
            return this;
        }

        /* renamed from: a */
        public C6666b mo17143a(C6448t tVar) {
            Objects.requireNonNull(tVar, "baseUrl == null");
            List j = tVar.mo16633j();
            if ("".equals(j.get(j.size() - 1))) {
                this.f16411c = tVar;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("baseUrl must end in /: ");
            sb.append(tVar);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public C6666b mo17144a(C6462x xVar) {
            mo17142a((C6245a) Objects.requireNonNull(xVar, "client == null"));
            return this;
        }

        /* renamed from: a */
        public C6666b mo17145a(C6615a aVar) {
            this.f16412d.add((C6615a) Objects.requireNonNull(aVar, "factory == null"));
            return this;
        }

        /* renamed from: a */
        public C6664u mo17146a() {
            if (this.f16411c != null) {
                C6245a aVar = this.f16410b;
                if (aVar == null) {
                    aVar = new C6462x();
                }
                C6245a aVar2 = aVar;
                Executor executor = this.f16414f;
                if (executor == null) {
                    executor = this.f16409a.mo17110a();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f16413e);
                arrayList.addAll(this.f16409a.mo17109a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f16412d.size() + 1 + this.f16409a.mo17113c());
                arrayList2.add(new C6597c());
                arrayList2.addAll(this.f16412d);
                arrayList2.addAll(this.f16409a.mo17112b());
                C6664u uVar = new C6664u(aVar2, this.f16411c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f16415g);
                return uVar;
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    C6664u(C6245a aVar, C6448t tVar, List<C6615a> list, List<C6606a> list2, @Nullable Executor executor, boolean z) {
        this.f16400b = aVar;
        this.f16401c = tVar;
        this.f16402d = list;
        this.f16403e = list2;
        this.f16404f = z;
    }

    /* renamed from: b */
    private void m25036b(Class<?> cls) {
        Method[] declaredMethods;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f16404f) {
                C6656q e = C6656q.m24995e();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!e.mo17111a(method) && !Modifier.isStatic(method.getModifiers())) {
                        mo17137a(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* renamed from: a */
    public <T> T mo17131a(Class<T> cls) {
        m25036b(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C6665a(cls));
    }

    /* renamed from: a */
    public C6605e<?, ?> mo17132a(Type type, Annotation[] annotationArr) {
        return mo17133a((C6606a) null, type, annotationArr);
    }

    /* renamed from: a */
    public C6605e<?, ?> mo17133a(@Nullable C6606a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f16403e.indexOf(aVar) + 1;
        int size = this.f16403e.size();
        for (int i = indexOf; i < size; i++) {
            C6605e<?, ?> a = ((C6606a) this.f16403e.get(i)).mo17081a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        String str = "\n   * ";
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append(str);
                sb.append(((C6606a) this.f16403e.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f16403e.size();
        while (indexOf < size2) {
            sb.append(str);
            sb.append(((C6606a) this.f16403e.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> C6614h<T, C6225a0> mo17134a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo17136a(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: a */
    public <T> C6614h<C6236c0, T> mo17135a(@Nullable C6615a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f16402d.indexOf(aVar) + 1;
        int size = this.f16402d.size();
        for (int i = indexOf; i < size; i++) {
            C6614h<C6236c0, T> a = ((C6615a) this.f16402d.get(i)).mo17066a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        String str = "\n   * ";
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append(str);
                sb.append(((C6615a) this.f16402d.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f16402d.size();
        while (indexOf < size2) {
            sb.append(str);
            sb.append(((C6615a) this.f16402d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> C6614h<T, C6225a0> mo17136a(@Nullable C6615a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f16402d.indexOf(aVar) + 1;
        int size = this.f16402d.size();
        for (int i = indexOf; i < size; i++) {
            C6614h<T, C6225a0> a = ((C6615a) this.f16402d.get(i)).mo17067a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        String str = "\n   * ";
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append(str);
                sb.append(((C6615a) this.f16402d.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f16402d.size();
        while (indexOf < size2) {
            sb.append(str);
            sb.append(((C6615a) this.f16402d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C6667v<?> mo17137a(Method method) {
        C6667v<?> vVar;
        C6667v<?> vVar2 = (C6667v) this.f16399a.get(method);
        if (vVar2 != null) {
            return vVar2;
        }
        synchronized (this.f16399a) {
            vVar = (C6667v) this.f16399a.get(method);
            if (vVar == null) {
                vVar = C6667v.m25052a(this, method);
                this.f16399a.put(method, vVar);
            }
        }
        return vVar;
    }

    /* renamed from: b */
    public <T> C6614h<C6236c0, T> mo17138b(Type type, Annotation[] annotationArr) {
        return mo17135a((C6615a) null, type, annotationArr);
    }

    /* renamed from: c */
    public <T> C6614h<T, String> mo17139c(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f16402d.size();
        for (int i = 0; i < size; i++) {
            C6614h<T, String> b = ((C6615a) this.f16402d.get(i)).mo17085b(type, annotationArr, this);
            if (b != null) {
                return b;
            }
        }
        return C6601d.f16249a;
    }
}
