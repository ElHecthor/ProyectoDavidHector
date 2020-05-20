package p147g.p156d.p204b.p207y.p208n;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.C4509v;
import p147g.p156d.p204b.C4511w;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4472b;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p207y.C4518b;
import p147g.p156d.p204b.p211z.C4632a;

/* renamed from: g.d.b.y.n.a */
public final class C4561a<E> extends C4509v<Object> {

    /* renamed from: c */
    public static final C4511w f11986c = new C4562a();

    /* renamed from: a */
    private final Class<E> f11987a;

    /* renamed from: b */
    private final C4509v<E> f11988b;

    /* renamed from: g.d.b.y.n.a$a */
    static class C4562a implements C4511w {
        C4562a() {
        }

        /* renamed from: a */
        public <T> C4509v<T> mo13393a(C4485f fVar, C4632a<T> aVar) {
            Type b = aVar.mo13530b();
            if (!(b instanceof GenericArrayType) && (!(b instanceof Class) || !((Class) b).isArray())) {
                return null;
            }
            Type d = C4518b.m18382d(b);
            return new C4561a(fVar, fVar.mo13336a(C4632a.m18691a(d)), C4518b.m18383e(d));
        }
    }

    public C4561a(C4485f fVar, C4509v<E> vVar, Class<E> cls) {
        this.f11988b = new C4588m(fVar, vVar, cls);
        this.f11987a = cls;
    }

    /* renamed from: a */
    public Object mo13284a(C4470a aVar) {
        if (aVar.mo13307w() == C4472b.NULL) {
            aVar.mo13305u();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo13288a();
        while (aVar.mo13296i()) {
            arrayList.add(this.f11988b.mo13284a(aVar));
        }
        aVar.mo13293g();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f11987a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: a */
    public void mo13285a(C4473c cVar, Object obj) {
        if (obj == null) {
            cVar.mo13329m();
            return;
        }
        cVar.mo13310a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f11988b.mo13285a(cVar, Array.get(obj, i));
        }
        cVar.mo13323f();
    }
}
