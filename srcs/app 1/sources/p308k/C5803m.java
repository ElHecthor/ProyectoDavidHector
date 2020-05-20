package p308k;

import java.io.Serializable;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.m */
public final class C5803m<T> implements Serializable {

    /* renamed from: f */
    public static final C5804a f14866f = new C5804a(null);

    /* renamed from: k.m$a */
    public static final class C5804a {
        private C5804a() {
        }

        public /* synthetic */ C5804a(C5938g gVar) {
            this();
        }
    }

    /* renamed from: k.m$b */
    public static final class C5805b implements Serializable {

        /* renamed from: f */
        public final Throwable f14867f;

        public C5805b(Throwable th) {
            C5942k.m22327b(th, "exception");
            this.f14867f = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C5805b) && C5942k.m22326a((Object) this.f14867f, (Object) ((C5805b) obj).f14867f);
        }

        public int hashCode() {
            return this.f14867f.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure(");
            sb.append(this.f14867f);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static Object m22049a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m22050b(Object obj) {
        if (obj instanceof C5805b) {
            return ((C5805b) obj).f14867f;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m22051c(Object obj) {
        return obj instanceof C5805b;
    }

    /* renamed from: d */
    public static final boolean m22052d(Object obj) {
        return !(obj instanceof C5805b);
    }
}
