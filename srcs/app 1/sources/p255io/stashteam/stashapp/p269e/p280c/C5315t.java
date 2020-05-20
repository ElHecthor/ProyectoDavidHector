package p255io.stashteam.stashapp.p269e.p280c;

/* renamed from: io.stashteam.stashapp.e.c.t */
public enum C5315t {
    ;
    

    /* renamed from: i */
    public static final C5316a f13963i = null;

    /* renamed from: f */
    private final int f13964f;

    /* renamed from: g */
    private final String f13965g;

    /* renamed from: io.stashteam.stashapp.e.c.t$a */
    public static final class C5316a {
        private C5316a() {
        }

        public /* synthetic */ C5316a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5315t mo14991a(int i) {
            C5315t[] values;
            for (C5315t tVar : C5315t.values()) {
                if (tVar.mo14990h() == i) {
                    return tVar;
                }
            }
            return null;
        }
    }

    static {
        f13963i = new C5316a(null);
    }

    private C5315t(int i, String str, String str2) {
        this.f13964f = i;
        this.f13965g = str2;
    }

    /* renamed from: f */
    public final String mo14988f() {
        return this.f13965g;
    }

    /* renamed from: g */
    public final int mo14989g() {
        return this.f13964f;
    }

    /* renamed from: h */
    public final int mo14990h() {
        return Math.abs(name().hashCode());
    }
}
