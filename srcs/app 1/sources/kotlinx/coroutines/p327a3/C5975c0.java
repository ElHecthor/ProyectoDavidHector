package kotlinx.coroutines.p327a3;

import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a3.c0 */
public final class C5975c0<T> {

    /* renamed from: b */
    public static final C5977b f14982b = new C5977b(null);

    /* renamed from: a */
    private final Object f14983a;

    /* renamed from: kotlinx.coroutines.a3.c0$a */
    public static final class C5976a {

        /* renamed from: a */
        public final Throwable f14984a;

        public C5976a(Throwable th) {
            this.f14984a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C5976a) && C5942k.m22326a((Object) this.f14984a, (Object) ((C5976a) obj).f14984a);
        }

        public int hashCode() {
            Throwable th = this.f14984a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Closed(");
            sb.append(this.f14984a);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.a3.c0$b */
    public static final class C5977b {
        private C5977b() {
        }

        public /* synthetic */ C5977b(C5938g gVar) {
            this();
        }
    }

    private /* synthetic */ C5975c0(Object obj) {
        this.f14983a = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ C5975c0 m22453a(Object obj) {
        return new C5975c0(obj);
    }

    /* renamed from: a */
    public static boolean m22454a(Object obj, Object obj2) {
        return (obj2 instanceof C5975c0) && C5942k.m22326a(obj, ((C5975c0) obj2).mo15690a());
    }

    /* renamed from: b */
    public static Object m22455b(Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static final Throwable m22456c(Object obj) {
        if (obj instanceof C5976a) {
            return ((C5976a) obj).f14984a;
        }
        throw new IllegalStateException("Channel was not closed".toString());
    }

    /* renamed from: d */
    public static final T m22457d(Object obj) {
        if (!(obj instanceof C5976a)) {
            return obj;
        }
        throw new IllegalStateException("Channel was closed".toString());
    }

    /* renamed from: e */
    public static int m22458e(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: f */
    public static final boolean m22459f(Object obj) {
        return obj instanceof C5976a;
    }

    /* renamed from: g */
    public static String m22460g(Object obj) {
        if (obj instanceof C5976a) {
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Value(");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo15690a() {
        return this.f14983a;
    }

    public boolean equals(Object obj) {
        return m22454a(this.f14983a, obj);
    }

    public int hashCode() {
        return m22458e(this.f14983a);
    }

    public String toString() {
        return m22460g(this.f14983a);
    }
}
