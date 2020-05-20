package p378p;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: p.e */
public interface C6605e<R, T> {

    /* renamed from: p.e$a */
    public static abstract class C6606a {
        /* renamed from: a */
        protected static Class<?> m24892a(Type type) {
            return C6670y.m25070b(type);
        }

        /* renamed from: a */
        protected static Type m24893a(int i, ParameterizedType parameterizedType) {
            return C6670y.m25071b(i, parameterizedType);
        }

        @Nullable
        /* renamed from: a */
        public abstract C6605e<?, ?> mo17081a(Type type, Annotation[] annotationArr, C6664u uVar);
    }

    /* renamed from: a */
    T mo17079a(C6604d<R> dVar);

    /* renamed from: a */
    Type mo17080a();
}
