package p255io.stashteam.stashapp.p269e.p280c;

/* renamed from: io.stashteam.stashapp.e.c.o */
public enum C5309o {
    ;
    

    /* renamed from: k */
    public static final C5310a f13943k = null;

    /* renamed from: f */
    private final int f13944f;

    /* renamed from: g */
    private final String f13945g;

    /* renamed from: h */
    private final int f13946h;

    /* renamed from: i */
    private final String f13947i;

    /* renamed from: io.stashteam.stashapp.e.c.o$a */
    public static final class C5310a {
        private C5310a() {
        }

        public /* synthetic */ C5310a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5309o mo14978a(int i) {
            C5309o[] values;
            for (C5309o oVar : C5309o.values()) {
                if (oVar.mo14974g() == i) {
                    return oVar;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final C5309o mo14979b(int i) {
            C5309o[] values;
            for (C5309o oVar : C5309o.values()) {
                if (oVar.mo14977j() == i) {
                    return oVar;
                }
            }
            return null;
        }
    }

    static {
        f13943k = new C5310a(null);
    }

    private C5309o(int i, String str, int i2, String str2, String str3) {
        this.f13944f = i;
        this.f13945g = str;
        this.f13946h = i2;
        this.f13947i = str2;
    }

    /* renamed from: f */
    public final String mo14973f() {
        return this.f13947i;
    }

    /* renamed from: g */
    public final int mo14974g() {
        return this.f13944f;
    }

    /* renamed from: h */
    public final String mo14975h() {
        return this.f13945g;
    }

    /* renamed from: i */
    public final int mo14976i() {
        return this.f13946h;
    }

    /* renamed from: j */
    public final int mo14977j() {
        return Math.abs(name().hashCode());
    }
}
