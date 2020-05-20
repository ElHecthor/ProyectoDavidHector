package p255io.stashteam.stashapp.p269e.p280c;

import io.stashteam.games.tracker.stashapp.R;

/* renamed from: io.stashteam.stashapp.e.c.b0 */
public enum C5288b0 {
    ADDED_DATE("DATE_ADDED", "review_modify_date", C5286a0.f13825h, R.string.sort_field_added_date),
    RELEASE_DATE("RELEASE_DATE", "firstReleaseDate", C5286a0.f13825h, R.string.sort_field_release_date),
    USER_SCORE("USER_SCORE", "review_rating", C5286a0.f13825h, R.string.sort_field_user_score),
    GAME_NAME("GAME_NAME", "name", C5286a0.f13824g, R.string.sort_field_game_name);
    

    /* renamed from: o */
    public static final C5289a f13836o = null;

    /* renamed from: f */
    private final String f13837f;

    /* renamed from: g */
    private final String f13838g;

    /* renamed from: h */
    private final C5286a0 f13839h;

    /* renamed from: i */
    private final int f13840i;

    /* renamed from: io.stashteam.stashapp.e.c.b0$a */
    public static final class C5289a {
        private C5289a() {
        }

        public /* synthetic */ C5289a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5288b0 mo14866a(int i) {
            C5288b0[] values;
            for (C5288b0 b0Var : C5288b0.values()) {
                if (b0Var.mo14865j() == i) {
                    return b0Var;
                }
            }
            return null;
        }
    }

    static {
        f13836o = new C5289a(null);
    }

    private C5288b0(String str, String str2, C5286a0 a0Var, int i) {
        this.f13837f = str;
        this.f13838g = str2;
        this.f13839h = a0Var;
        this.f13840i = i;
    }

    /* renamed from: f */
    public final String mo14861f() {
        return this.f13837f;
    }

    /* renamed from: g */
    public final String mo14862g() {
        return this.f13838g;
    }

    /* renamed from: h */
    public final C5286a0 mo14863h() {
        return this.f13839h;
    }

    /* renamed from: i */
    public final int mo14864i() {
        return this.f13840i;
    }

    /* renamed from: j */
    public final int mo14865j() {
        return Math.abs(name().hashCode());
    }
}
