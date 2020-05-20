package p255io.stashteam.stashapp.p269e.p280c;

import io.stashteam.games.tracker.stashapp.R;

/* renamed from: io.stashteam.stashapp.e.c.j */
public enum C5303j {
    PLATFORM("platforms", "", R.string.filter_field_platform),
    GENRE("genres", "", R.string.filter_field_genre),
    RELEASE_YEAR("years", "", R.string.filter_field_release_year),
    COMPLETED("completed", "review_completed", R.string.filter_field_completed),
    NOT_COMPLETED("completed", "review_completed", R.string.filter_field_not_completed),
    ONLY_RELEASED("released", "firstReleaseDate", R.string.filter_field_releases);
    

    /* renamed from: p */
    public static final C5304a f13908p = null;

    /* renamed from: f */
    private final String f13909f;

    /* renamed from: g */
    private final String f13910g;

    /* renamed from: h */
    private final int f13911h;

    /* renamed from: io.stashteam.stashapp.e.c.j$a */
    public static final class C5304a {
        private C5304a() {
        }

        public /* synthetic */ C5304a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5303j mo14954a(int i) {
            C5303j[] values;
            for (C5303j jVar : C5303j.values()) {
                if (jVar.mo14953i() == i) {
                    return jVar;
                }
            }
            return null;
        }
    }

    static {
        f13908p = new C5304a(null);
    }

    private C5303j(String str, String str2, int i) {
        this.f13909f = str;
        this.f13910g = str2;
        this.f13911h = i;
    }

    /* renamed from: f */
    public final String mo14950f() {
        return this.f13909f;
    }

    /* renamed from: g */
    public final String mo14951g() {
        return this.f13910g;
    }

    /* renamed from: h */
    public final int mo14952h() {
        return this.f13911h;
    }

    /* renamed from: i */
    public final int mo14953i() {
        return Math.abs(name().hashCode());
    }
}
