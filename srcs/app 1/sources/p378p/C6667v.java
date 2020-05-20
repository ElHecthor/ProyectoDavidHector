package p378p;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: p.v */
abstract class C6667v<T> {
    C6667v() {
    }

    /* renamed from: a */
    static <T> C6667v<T> m25052a(C6664u uVar, Method method) {
        C6661s a = C6661s.m25017a(uVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (C6670y.m25073c(genericReturnType)) {
            throw C6670y.m25058a(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return C6621k.m24929a(uVar, method, a);
        } else {
            throw C6670y.m25058a(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    @Nullable
    /* renamed from: a */
    public abstract T mo17090a(Object[] objArr);
}
