package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import kotlinx.coroutines.C6219z;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p323z.C5905a;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;

/* renamed from: kotlinx.coroutines.internal.g */
public final class C6111g {

    /* renamed from: a */
    private static final int f15205a = m22964b(Throwable.class, -1);

    /* renamed from: b */
    private static final ReentrantReadWriteLock f15206b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, C5918l<Throwable, Throwable>> f15207c = new WeakHashMap<>();

    /* renamed from: kotlinx.coroutines.internal.g$a */
    public static final class C6112a extends C5943l implements C5918l<Throwable, Throwable> {

        /* renamed from: g */
        final /* synthetic */ Constructor f15208g;

        public C6112a(Constructor constructor) {
            this.f15208g = constructor;
            super(1);
        }

        /* renamed from: a */
        public final Throwable mo4090d(Throwable th) {
            Object obj;
            C5942k.m22327b(th, "e");
            try {
                C5804a aVar = C5803m.f14866f;
                Object newInstance = this.f15208g.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    C5803m.m22049a(obj);
                    if (C5803m.m22051c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new C5809q("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C5804a aVar2 = C5803m.f14866f;
                obj = C5806n.m22053a(th2);
                C5803m.m22049a(obj);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$b */
    public static final class C6113b extends C5943l implements C5918l<Throwable, Throwable> {

        /* renamed from: g */
        final /* synthetic */ Constructor f15209g;

        public C6113b(Constructor constructor) {
            this.f15209g = constructor;
            super(1);
        }

        /* renamed from: a */
        public final Throwable mo4090d(Throwable th) {
            Object obj;
            C5942k.m22327b(th, "e");
            try {
                C5804a aVar = C5803m.f14866f;
                Object newInstance = this.f15209g.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    C5803m.m22049a(obj);
                    if (C5803m.m22051c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new C5809q("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C5804a aVar2 = C5803m.f14866f;
                obj = C5806n.m22053a(th2);
                C5803m.m22049a(obj);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$c */
    public static final class C6114c extends C5943l implements C5918l<Throwable, Throwable> {

        /* renamed from: g */
        final /* synthetic */ Constructor f15210g;

        public C6114c(Constructor constructor) {
            this.f15210g = constructor;
            super(1);
        }

        /* renamed from: a */
        public final Throwable mo4090d(Throwable th) {
            Object obj;
            C5942k.m22327b(th, "e");
            try {
                C5804a aVar = C5803m.f14866f;
                Object newInstance = this.f15210g.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    C5803m.m22049a(th2);
                    obj = th2;
                    if (C5803m.m22051c(obj)) {
                        obj = 0;
                    }
                    return (Throwable) obj;
                }
                throw new C5809q("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C5804a aVar2 = C5803m.f14866f;
                Object obj2 = C5806n.m22053a(th3);
                C5803m.m22049a(obj2);
                obj = obj2;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$d */
    public static final class C6115d extends C5943l implements C5918l<Throwable, Throwable> {

        /* renamed from: g */
        final /* synthetic */ Constructor f15211g;

        public C6115d(Constructor constructor) {
            this.f15211g = constructor;
            super(1);
        }

        /* renamed from: a */
        public final Throwable mo4090d(Throwable th) {
            Object obj;
            C5942k.m22327b(th, "e");
            try {
                C5804a aVar = C5803m.f14866f;
                Object newInstance = this.f15211g.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    C5803m.m22049a(th2);
                    obj = th2;
                    if (C5803m.m22051c(obj)) {
                        obj = 0;
                    }
                    return (Throwable) obj;
                }
                throw new C5809q("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C5804a aVar2 = C5803m.f14866f;
                Object obj2 = C5806n.m22053a(th3);
                C5803m.m22049a(obj2);
                obj = obj2;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$e */
    public static final class C6116e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Constructor constructor = (Constructor) t2;
            String str = "it";
            C5942k.m22324a((Object) constructor, str);
            Integer valueOf = Integer.valueOf(constructor.getParameterTypes().length);
            Constructor constructor2 = (Constructor) t;
            C5942k.m22324a((Object) constructor2, str);
            return C5854b.m22211a(valueOf, Integer.valueOf(constructor2.getParameterTypes().length));
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$f */
    static final class C6117f extends C5943l implements C5918l {

        /* renamed from: g */
        public static final C6117f f15212g = new C6117f();

        C6117f() {
            super(1);
        }

        /* renamed from: a */
        public final Void mo4090d(Throwable th) {
            C5942k.m22327b(th, "it");
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$g */
    static final class C6118g extends C5943l implements C5918l {

        /* renamed from: g */
        public static final C6118g f15213g = new C6118g();

        C6118g() {
            super(1);
        }

        /* renamed from: a */
        public final Void mo4090d(Throwable th) {
            C5942k.m22327b(th, "it");
            return null;
        }
    }

    /* renamed from: a */
    private static final int m22960a(Class<?> cls, int i) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            C5942k.m22324a((Object) declaredFields, "declaredFields");
            int i2 = 0;
            for (Field field : declaredFields) {
                C5942k.m22324a((Object) field, "it");
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    /* renamed from: a */
    static /* synthetic */ int m22961a(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m22960a(cls, i);
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m22962a(E e) {
        E e2;
        C5942k.m22327b(e, "exception");
        E e3 = null;
        if (e instanceof C6219z) {
            try {
                C5804a aVar = C5803m.f14866f;
                e2 = ((C6219z) e).mo15972a();
                C5803m.m22049a(e2);
            } catch (Throwable th) {
                C5804a aVar2 = C5803m.f14866f;
                e2 = C5806n.m22053a(th);
                C5803m.m22049a(e2);
            }
            if (!C5803m.m22051c(e2)) {
                e3 = e2;
            }
            return (Throwable) e3;
        }
        ReadLock readLock = f15206b.readLock();
        readLock.lock();
        try {
            C5918l lVar = (C5918l) f15207c.get(e.getClass());
            if (lVar != null) {
                return (Throwable) lVar.mo4090d(e);
            }
            int i = 0;
            if (f15205a != m22964b(e.getClass(), i)) {
                ReentrantReadWriteLock reentrantReadWriteLock = f15206b;
                ReadLock readLock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock2.unlock();
                }
                WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    f15207c.put(e.getClass(), C6117f.f15212g);
                    C5812t tVar = C5812t.f14872a;
                    writeLock.unlock();
                    return null;
                } finally {
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            } else {
                Constructor[] constructors = e.getClass().getConstructors();
                C5942k.m22324a((Object) constructors, "exception.javaClass.constructors");
                C5918l lVar2 = null;
                for (Constructor constructor : C5832h.m22122c((T[]) constructors, (Comparator<? super T>) new C6116e<Object>())) {
                    C5942k.m22324a((Object) constructor, "constructor");
                    lVar2 = m22963a(constructor);
                    if (lVar2 != null) {
                        break;
                    }
                }
                ReentrantReadWriteLock reentrantReadWriteLock2 = f15206b;
                ReadLock readLock3 = reentrantReadWriteLock2.readLock();
                int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount2; i3++) {
                    readLock3.unlock();
                }
                WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                writeLock2.lock();
                try {
                    f15207c.put(e.getClass(), lVar2 != null ? lVar2 : C6118g.f15213g);
                    C5812t tVar2 = C5812t.f14872a;
                    writeLock2.unlock();
                    if (lVar2 != null) {
                        e3 = (Throwable) lVar2.mo4090d(e);
                    }
                    return e3;
                } finally {
                    while (i < readHoldCount2) {
                        readLock3.lock();
                        i++;
                    }
                    writeLock2.unlock();
                }
            }
        } finally {
            readLock.unlock();
        }
    }

    /* renamed from: a */
    private static final C5918l<Throwable, Throwable> m22963a(Constructor<?> constructor) {
        Class<String> cls = String.class;
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C6115d(constructor);
        }
        if (length == 1) {
            Class cls2 = parameterTypes[0];
            if (C5942k.m22326a((Object) cls2, (Object) Throwable.class)) {
                return new C6113b(constructor);
            }
            if (C5942k.m22326a((Object) cls2, (Object) cls)) {
                return new C6114c(constructor);
            }
        } else if (length == 2 && C5942k.m22326a((Object) parameterTypes[0], (Object) cls) && C5942k.m22326a((Object) parameterTypes[1], (Object) Throwable.class)) {
            return new C6112a(constructor);
        }
        return null;
    }

    /* renamed from: b */
    private static final int m22964b(Class<?> cls, int i) {
        Object obj;
        C5905a.m22295a(cls);
        try {
            C5804a aVar = C5803m.f14866f;
            obj = Integer.valueOf(m22961a(cls, 0, 1, null));
            C5803m.m22049a(obj);
        } catch (Throwable th) {
            C5804a aVar2 = C5803m.f14866f;
            obj = C5806n.m22053a(th);
            C5803m.m22049a(obj);
        }
        Integer valueOf = Integer.valueOf(i);
        if (C5803m.m22051c(obj)) {
            obj = valueOf;
        }
        return ((Number) obj).intValue();
    }
}
