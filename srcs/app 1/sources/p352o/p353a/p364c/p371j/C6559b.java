package p352o.p353a.p364c.p371j;

import java.util.Arrays;
import p308k.p323z.p325d.C5942k;

/* renamed from: o.a.c.j.b */
public final class C6559b {
    /* renamed from: a */
    public static final C6557a m24800a() {
        return new C6557a(new Object[0]);
    }

    /* renamed from: a */
    public static final C6557a m24801a(Object... objArr) {
        C5942k.m22327b(objArr, "parameters");
        if (objArr.length <= 5) {
            return new C6557a(Arrays.copyOf(objArr, objArr.length));
        }
        throw new IllegalStateException("Can't build DefinitionParameters for more than 5 arguments".toString());
    }
}
