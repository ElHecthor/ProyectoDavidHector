package p378p;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p337m.C6225a0;
import p337m.C6236c0;

/* renamed from: p.h */
public interface C6614h<F, T> {

    /* renamed from: p.h$a */
    public static abstract class C6615a {
        /* renamed from: a */
        protected static Class<?> m24909a(Type type) {
            return C6670y.m25070b(type);
        }

        /* renamed from: a */
        protected static Type m24910a(int i, ParameterizedType parameterizedType) {
            return C6670y.m25071b(i, parameterizedType);
        }

        @Nullable
        /* renamed from: a */
        public C6614h<C6236c0, ?> mo17066a(Type type, Annotation[] annotationArr, C6664u uVar) {
            return null;
        }

        @Nullable
        /* renamed from: a */
        public C6614h<?, C6225a0> mo17067a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C6664u uVar) {
            return null;
        }

        @Nullable
        /* renamed from: b */
        public C6614h<?, String> mo17085b(Type type, Annotation[] annotationArr, C6664u uVar) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    T mo17068a(F f);
}
