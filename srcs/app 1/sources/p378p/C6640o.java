package p378p;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p337m.C6236c0;
import p378p.C6614h.C6615a;

@IgnoreJRERequirement
/* renamed from: p.o */
final class C6640o extends C6615a {

    /* renamed from: a */
    static final C6615a f16302a = new C6640o();

    @IgnoreJRERequirement
    /* renamed from: p.o$a */
    static final class C6641a<T> implements C6614h<C6236c0, Optional<T>> {

        /* renamed from: a */
        final C6614h<C6236c0, T> f16303a;

        C6641a(C6614h<C6236c0, T> hVar) {
            this.f16303a = hVar;
        }

        /* renamed from: a */
        public Optional<T> mo17068a(C6236c0 c0Var) {
            return Optional.ofNullable(this.f16303a.mo17068a(c0Var));
        }
    }

    C6640o() {
    }

    @Nullable
    /* renamed from: a */
    public C6614h<C6236c0, ?> mo17066a(Type type, Annotation[] annotationArr, C6664u uVar) {
        if (C6615a.m24909a(type) != Optional.class) {
            return null;
        }
        return new C6641a(uVar.mo17138b(C6615a.m24910a(0, (ParameterizedType) type), annotationArr));
    }
}
