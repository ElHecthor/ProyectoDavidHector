package p240h.p241a;

import p306j.p307a.C5718a;

/* renamed from: h.a.a */
public final class C4772a<T> implements C5718a<T> {

    /* renamed from: c */
    private static final Object f12481c = new Object();

    /* renamed from: a */
    private volatile C5718a<T> f12482a;

    /* renamed from: b */
    private volatile Object f12483b = f12481c;

    private C4772a(C5718a<T> aVar) {
        this.f12482a = aVar;
    }

    /* renamed from: a */
    public static <P extends C5718a<T>, T> C5718a<T> m19187a(P p) {
        C4775d.m19190a(p);
        return p instanceof C4772a ? p : new C4772a(p);
    }

    /* renamed from: a */
    public static Object m19188a(Object obj, Object obj2) {
        if (!(obj != f12481c) || obj == obj2) {
            return obj2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Scoped provider was invoked recursively returning different results: ");
        sb.append(obj);
        sb.append(" & ");
        sb.append(obj2);
        sb.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(sb.toString());
    }

    public T get() {
        T t = this.f12483b;
        if (t == f12481c) {
            synchronized (this) {
                t = this.f12483b;
                if (t == f12481c) {
                    t = this.f12482a.get();
                    m19188a(this.f12483b, t);
                    this.f12483b = t;
                    this.f12482a = null;
                }
            }
        }
        return t;
    }
}
