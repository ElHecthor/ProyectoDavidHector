package p378p.p380z.p381a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.p211z.C4632a;
import p337m.C6225a0;
import p337m.C6236c0;
import p378p.C6614h;
import p378p.C6614h.C6615a;
import p378p.C6664u;

/* renamed from: p.z.a.a */
public final class C6674a extends C6615a {

    /* renamed from: a */
    private final C4485f f16424a;

    private C6674a(C4485f fVar) {
        this.f16424a = fVar;
    }

    /* renamed from: a */
    public static C6674a m25075a(C4485f fVar) {
        if (fVar != null) {
            return new C6674a(fVar);
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: a */
    public C6614h<C6236c0, ?> mo17066a(Type type, Annotation[] annotationArr, C6664u uVar) {
        return new C6676c(this.f16424a, this.f16424a.mo13336a(C4632a.m18691a(type)));
    }

    /* renamed from: a */
    public C6614h<?, C6225a0> mo17067a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C6664u uVar) {
        return new C6675b(this.f16424a, this.f16424a.mo13336a(C4632a.m18691a(type)));
    }
}
