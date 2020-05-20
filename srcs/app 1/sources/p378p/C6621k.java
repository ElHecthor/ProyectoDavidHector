package p378p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p308k.p316w.C5866d;
import p337m.C6232b0;
import p337m.C6236c0;
import p337m.C6244e.C6245a;

/* renamed from: p.k */
abstract class C6621k<ResponseT, ReturnT> extends C6667v<ReturnT> {

    /* renamed from: a */
    private final C6661s f16266a;

    /* renamed from: b */
    private final C6245a f16267b;

    /* renamed from: c */
    private final C6614h<C6236c0, ResponseT> f16268c;

    /* renamed from: p.k$a */
    static final class C6622a<ResponseT, ReturnT> extends C6621k<ResponseT, ReturnT> {

        /* renamed from: d */
        private final C6605e<ResponseT, ReturnT> f16269d;

        C6622a(C6661s sVar, C6245a aVar, C6614h<C6236c0, ResponseT> hVar, C6605e<ResponseT, ReturnT> eVar) {
            super(sVar, aVar, hVar);
            this.f16269d = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ReturnT mo17089a(C6604d<ResponseT> dVar, Object[] objArr) {
            return this.f16269d.mo17079a(dVar);
        }
    }

    /* renamed from: p.k$b */
    static final class C6623b<ResponseT> extends C6621k<ResponseT, Object> {

        /* renamed from: d */
        private final C6605e<ResponseT, C6604d<ResponseT>> f16270d;

        /* renamed from: e */
        private final boolean f16271e;

        C6623b(C6661s sVar, C6245a aVar, C6614h<C6236c0, ResponseT> hVar, C6605e<ResponseT, C6604d<ResponseT>> eVar, boolean z) {
            super(sVar, aVar, hVar);
            this.f16270d = eVar;
            this.f16271e = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo17089a(C6604d<ResponseT> dVar, Object[] objArr) {
            C6604d dVar2 = (C6604d) this.f16270d.mo17079a(dVar);
            C5866d dVar3 = objArr[objArr.length - 1];
            try {
                return this.f16271e ? C6626m.m24938b(dVar2, dVar3) : C6626m.m24937a(dVar2, dVar3);
            } catch (Exception e) {
                return C6626m.m24936a(e, dVar3);
            }
        }
    }

    /* renamed from: p.k$c */
    static final class C6624c<ResponseT> extends C6621k<ResponseT, Object> {

        /* renamed from: d */
        private final C6605e<ResponseT, C6604d<ResponseT>> f16272d;

        C6624c(C6661s sVar, C6245a aVar, C6614h<C6236c0, ResponseT> hVar, C6605e<ResponseT, C6604d<ResponseT>> eVar) {
            super(sVar, aVar, hVar);
            this.f16272d = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo17089a(C6604d<ResponseT> dVar, Object[] objArr) {
            C6604d dVar2 = (C6604d) this.f16272d.mo17079a(dVar);
            C5866d dVar3 = objArr[objArr.length - 1];
            try {
                return C6626m.m24939c(dVar2, dVar3);
            } catch (Exception e) {
                return C6626m.m24936a(e, dVar3);
            }
        }
    }

    C6621k(C6661s sVar, C6245a aVar, C6614h<C6236c0, ResponseT> hVar) {
        this.f16266a = sVar;
        this.f16267b = aVar;
        this.f16268c = hVar;
    }

    /* renamed from: a */
    private static <ResponseT, ReturnT> C6605e<ResponseT, ReturnT> m24927a(C6664u uVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return uVar.mo17132a(type, annotationArr);
        } catch (RuntimeException e) {
            throw C6670y.m25060a(method, (Throwable) e, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: a */
    private static <ResponseT> C6614h<C6236c0, ResponseT> m24928a(C6664u uVar, Method method, Type type) {
        try {
            return uVar.mo17138b(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw C6670y.m25060a(method, (Throwable) e, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: a */
    static <ResponseT, ReturnT> C6621k<ResponseT, ReturnT> m24929a(C6664u uVar, Method method, C6661s sVar) {
        Type type;
        boolean z;
        Class<C6663t> cls = C6663t.class;
        boolean z2 = sVar.f16370k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type a = C6670y.m25061a(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C6670y.m25070b(a) != cls || !(a instanceof ParameterizedType)) {
                z = false;
            } else {
                a = C6670y.m25071b(0, (ParameterizedType) a);
                z = true;
            }
            type = new C6672b(null, C6604d.class, a);
            annotations = C6669x.m25054a(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        C6605e a2 = m24927a(uVar, method, type, annotations);
        Type a3 = a2.mo17080a();
        if (a3 == C6232b0.class) {
            StringBuilder sb = new StringBuilder();
            sb.append("'");
            sb.append(C6670y.m25070b(a3).getName());
            sb.append("' is not a valid response body type. Did you mean ResponseBody?");
            throw C6670y.m25058a(method, sb.toString(), new Object[0]);
        } else if (a3 == cls) {
            throw C6670y.m25058a(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!sVar.f16362c.equals("HEAD") || Void.class.equals(a3)) {
            C6614h a4 = m24928a(uVar, method, a3);
            C6245a aVar = uVar.f16400b;
            if (!z2) {
                return new C6622a(sVar, aVar, a4, a2);
            }
            if (z) {
                return new C6624c(sVar, aVar, a4, a2);
            }
            C6623b bVar = new C6623b(sVar, aVar, a4, a2, false);
            return bVar;
        } else {
            throw C6670y.m25058a(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public abstract ReturnT mo17089a(C6604d<ResponseT> dVar, Object[] objArr);

    /* access modifiers changed from: 0000 */
    @Nullable
    /* renamed from: a */
    public final ReturnT mo17090a(Object[] objArr) {
        return mo17089a(new C6635n(this.f16266a, objArr, this.f16267b, this.f16268c), objArr);
    }
}
