package p255io.stashteam.stashapp.p269e.p280c;

/* renamed from: io.stashteam.stashapp.e.c.c */
public enum C5290c {
    DLC_ADDON(1, "dlc_addon"),
    EXPANSION(2, "expansion");
    

    /* renamed from: j */
    public static final C5291a f13844j = null;

    /* renamed from: f */
    private final int f13845f;

    /* renamed from: io.stashteam.stashapp.e.c.c$a */
    public static final class C5291a {
        private C5291a() {
        }

        public /* synthetic */ C5291a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5290c mo14868a(int i) {
            C5290c cVar;
            C5290c[] values = C5290c.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    cVar = null;
                    break;
                }
                cVar = values[i2];
                if (cVar.mo14867f() == i) {
                    break;
                }
                i2++;
            }
            if (cVar != null) {
                return cVar;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown apiId: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static {
        f13844j = new C5291a(null);
    }

    private C5290c(int i, String str) {
        this.f13845f = i;
    }

    /* renamed from: f */
    public final int mo14867f() {
        return this.f13845f;
    }
}
