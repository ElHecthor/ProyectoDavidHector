package p255io.stashteam.stashapp.p269e.p280c;

import io.stashteam.games.tracker.stashapp.R;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.c.a */
public enum C5284a {
    SYSTEM("system", R.string.theme_system, -1);
    

    /* renamed from: k */
    public static final C5285a f13820k = null;

    /* renamed from: f */
    private final String f13821f;

    /* renamed from: g */
    private final int f13822g;

    /* renamed from: h */
    private final int f13823h;

    /* renamed from: io.stashteam.stashapp.e.c.a$a */
    public static final class C5285a {
        private C5285a() {
        }

        public /* synthetic */ C5285a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5284a mo14859a(String str) {
            C5284a aVar;
            C5284a[] values = C5284a.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i];
                if (C5942k.m22326a((Object) aVar.mo14856f(), (Object) str)) {
                    break;
                }
                i++;
            }
            return aVar != null ? aVar : C5284a.SYSTEM;
        }
    }

    static {
        f13820k = new C5285a(null);
    }

    private C5284a(String str, int i, int i2) {
        this.f13821f = str;
        this.f13822g = i;
        this.f13823h = i2;
    }

    /* renamed from: f */
    public final String mo14856f() {
        return this.f13821f;
    }

    /* renamed from: g */
    public final int mo14857g() {
        return this.f13822g;
    }

    /* renamed from: h */
    public final int mo14858h() {
        return this.f13823h;
    }
}
