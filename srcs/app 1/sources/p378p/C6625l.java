package p378p;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: p.l */
public final class C6625l {

    /* renamed from: a */
    private final Method f16273a;

    /* renamed from: b */
    private final List<?> f16274b;

    C6625l(Method method, List<?> list) {
        this.f16273a = method;
        this.f16274b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method mo17091a() {
        return this.f16273a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f16273a.getDeclaringClass().getName(), this.f16273a.getName(), this.f16274b});
    }
}
