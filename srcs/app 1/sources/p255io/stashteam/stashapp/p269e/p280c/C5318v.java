package p255io.stashteam.stashapp.p269e.p280c;

/* renamed from: io.stashteam.stashapp.e.c.v */
public enum C5318v {
    NOTHING(0, "✕", null);
    

    /* renamed from: k */
    public static final C5319a f13971k = null;

    /* renamed from: f */
    private final int f13972f;

    /* renamed from: g */
    private final String f13973g;

    /* renamed from: h */
    private final String f13974h;

    /* renamed from: io.stashteam.stashapp.e.c.v$a */
    public static final class C5319a {
        private C5319a() {
        }

        public /* synthetic */ C5319a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5318v mo15001a(int i) {
            C5318v vVar;
            C5318v[] values = C5318v.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    vVar = null;
                    break;
                }
                vVar = values[i2];
                if (vVar.mo14999h() == i) {
                    break;
                }
                i2++;
            }
            return vVar != null ? vVar : C5318v.NOTHING;
        }
    }

    static {
        f13971k = new C5319a(null);
    }

    private C5318v(int i, String str, String str2) {
        this.f13972f = i;
        this.f13973g = str;
        this.f13974h = str2;
    }

    /* renamed from: f */
    public final String mo14997f() {
        return this.f13974h;
    }

    /* renamed from: g */
    public final String mo14998g() {
        return this.f13973g;
    }

    /* renamed from: h */
    public final int mo14999h() {
        return this.f13972f;
    }

    /* renamed from: i */
    public final boolean mo15000i() {
        return this != NOTHING;
    }
}
