package p255io.stashteam.stashapp.p269e.p280c;

/* renamed from: io.stashteam.stashapp.e.c.k */
public enum C5305k {
    WANT_LIST("want_games", "want", "WANT", true),
    PLAYING_LIST("playing_games", "playing", "PLAYING", true),
    PLAYED_LIST("played_games", "played", "PLAYED", true),
    GAME_SERIES("game_series", "collection", null, false),
    GAME_ADDONS("game_addons", "addons", null, false),
    LATEST_RELEASES("latest_games", "latest", null, true),
    ANTICIPATED("anticipated_games", "anticipated", null, true),
    UPCOMING("upcoming_games", "coming-soon", null, true),
    TOP_RATED("top_rated_games", "top-rated", null, true),
    GAMES_BY_GENRE("games_by_genre", "", null, false),
    GAMES_BY_DEVELOPER("games_by_developer", "", null, false);
    

    /* renamed from: f */
    private final String f13924f;

    /* renamed from: g */
    private final String f13925g;

    /* renamed from: h */
    private final String f13926h;

    /* renamed from: i */
    private final boolean f13927i;

    private C5305k(String str, String str2, String str3, boolean z) {
        this.f13924f = str;
        this.f13925g = str2;
        this.f13926h = str3;
        this.f13927i = z;
    }

    /* renamed from: f */
    public final String mo14955f() {
        return this.f13924f;
    }

    /* renamed from: g */
    public final String mo14956g() {
        return this.f13926h;
    }

    /* renamed from: h */
    public final boolean mo14957h() {
        return this.f13927i;
    }

    /* renamed from: i */
    public final String mo14958i() {
        return this.f13925g;
    }
}
