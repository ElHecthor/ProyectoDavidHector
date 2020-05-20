package p255io.stashteam.stashapp.p256b.p260c;

import java.util.HashMap;
import java.util.Map;
import p255io.stashteam.stashapp.data.network.model.AccessTokenApiModel;
import p255io.stashteam.stashapp.data.network.model.AccountDataApiModel;
import p255io.stashteam.stashapp.data.network.model.CustomListApiModel;
import p255io.stashteam.stashapp.data.network.model.GameStatisticApiModel;
import p255io.stashteam.stashapp.data.network.model.StatisticApiModel;
import p255io.stashteam.stashapp.data.network.model.UserApiModel;
import p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest;
import p255io.stashteam.stashapp.data.network.request.ChangeStatusRequest;
import p255io.stashteam.stashapp.data.network.response.DetailGameResponse;
import p255io.stashteam.stashapp.data.network.response.PagingResponse;
import p255io.stashteam.stashapp.data.network.response.RegisterDeviceResponse;
import p255io.stashteam.stashapp.data.network.response.ReviewResponse;
import p255io.stashteam.stashapp.data.network.response.ShortGameResponse;
import p255io.stashteam.stashapp.data.network.response.SignInResponse;
import p308k.p316w.C5866d;
import p378p.C6663t;
import p378p.p379a0.C6576a;
import p378p.p379a0.C6577b;
import p378p.p379a0.C6580e;
import p378p.p379a0.C6587l;
import p378p.p379a0.C6588m;
import p378p.p379a0.C6591p;
import p378p.p379a0.C6592q;

/* renamed from: io.stashteam.stashapp.b.c.a */
public interface C4942a {

    /* renamed from: io.stashteam.stashapp.b.c.a$a */
    public static final class C4943a {
        /* renamed from: a */
        public static /* synthetic */ Object m19796a(C4942a aVar, long j, int i, int i2, String str, String str2, String str3, C5866d dVar, int i3, Object obj) {
            if (obj == null) {
                return aVar.mo14104a(j, i, i2, str, str2, (i3 & 32) != 0 ? "all" : str3, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadGameAddons");
        }
    }

    @C6580e("account/game-collections")
    /* renamed from: a */
    Object mo14101a(@C6592q("limit") int i, @C6592q("offset") int i2, @C6592q("sort.field") String str, @C6592q("sort.direction") String str2, @C6592q("include") String str3, C5866d<? super PagingResponse<CustomListApiModel>> dVar);

    @C6580e("games/top-rated")
    /* renamed from: a */
    Object mo14102a(@C6592q("limit") int i, @C6592q("offset") int i2, @C6592q("include") String str, C5866d<? super PagingResponse<ShortGameResponse>> dVar);

    @C6580e("users/leader-board")
    /* renamed from: a */
    Object mo14103a(@C6592q("limit") int i, @C6592q("offset") int i2, C5866d<? super PagingResponse<AccountDataApiModel>> dVar);

    @C6580e("games/{id}/addons")
    /* renamed from: a */
    Object mo14104a(@C6591p("id") long j, @C6592q("limit") int i, @C6592q("offset") int i2, @C6592q("sort.field") String str, @C6592q("sort.direction") String str2, @C6592q("filter") String str3, C5866d<? super PagingResponse<ShortGameResponse>> dVar);

    @C6580e("account/game-collections/{listId}/games")
    /* renamed from: a */
    Object mo14105a(@C6591p("listId") long j, @C6592q("limit") int i, @C6592q("offset") int i2, @C6592q("sort.field") String str, @C6592q("sort.direction") String str2, C5866d<? super PagingResponse<ShortGameResponse>> dVar);

    @C6587l("account/game-collections/{listId}/games/{gameId}")
    /* renamed from: a */
    Object mo14106a(@C6591p("listId") long j, @C6591p("gameId") long j2, C5866d<? super CustomListApiModel> dVar);

    @C6587l("games/{id}/status")
    /* renamed from: a */
    Object mo14107a(@C6591p("id") long j, @C6576a ChangeStatusRequest changeStatusRequest, C5866d<? super DetailGameResponse> dVar);

    @C6580e("users/{userId}/games/_search/{listType}")
    /* renamed from: a */
    Object mo14108a(@C6591p("userId") long j, @C6591p("listType") String str, @C6592q("limit") int i, @C6592q("offset") int i2, @C6592q("sort.field") String str2, @C6592q("sort.direction") String str3, @C6592q("include") String str4, C5866d<? super PagingResponse<ShortGameResponse>> dVar);

    @C6577b("games/{id}/status")
    /* renamed from: a */
    Object mo14109a(@C6591p("id") long j, C5866d<? super DetailGameResponse> dVar);

    @C6587l("account/game-collections")
    /* renamed from: a */
    Object mo14110a(@C6576a ChangeCustomListRequest changeCustomListRequest, C5866d<? super CustomListApiModel> dVar);

    @C6580e("games/_search/{listType}")
    /* renamed from: a */
    Object mo14111a(@C6591p("listType") String str, @C6592q("limit") int i, @C6592q("offset") int i2, @C6592q("sort.field") String str2, @C6592q("sort.direction") String str3, @C6592q("include") String str4, C5866d<? super PagingResponse<ShortGameResponse>> dVar);

    @C6580e("games/_search/name")
    /* renamed from: a */
    Object mo14112a(@C6592q("query") String str, @C6592q("limit") int i, @C6592q("offset") int i2, C5866d<? super PagingResponse<ShortGameResponse>> dVar);

    @C6580e("games/{id}/{listType}")
    /* renamed from: a */
    Object mo14113a(@C6591p("listType") String str, @C6591p("id") long j, @C6592q("limit") int i, @C6592q("offset") int i2, @C6592q("sort.field") String str2, @C6592q("sort.direction") String str3, C5866d<? super PagingResponse<ReviewResponse>> dVar);

    @C6587l("account")
    /* renamed from: a */
    Object mo14114a(@C6576a HashMap<String, Object> hashMap, C5866d<? super UserApiModel> dVar);

    @C6587l("token/convert")
    /* renamed from: a */
    Object mo14115a(@C6576a Map<String, String> map, C5866d<? super AccessTokenApiModel> dVar);

    @C6580e("account/statistic")
    /* renamed from: a */
    Object mo14116a(C5866d<? super StatisticApiModel> dVar);

    @C6580e("games/_search")
    /* renamed from: b */
    Object mo14117b(@C6592q("limit") int i, @C6592q("offset") int i2, @C6592q("sort.field") String str, @C6592q("sort.direction") String str2, @C6592q("include") String str3, C5866d<? super PagingResponse<ShortGameResponse>> dVar);

    @C6580e("games/coming-soon")
    /* renamed from: b */
    Object mo14118b(@C6592q("limit") int i, @C6592q("offset") int i2, @C6592q("include") String str, C5866d<? super PagingResponse<ShortGameResponse>> dVar);

    @C6580e("games/popular")
    /* renamed from: b */
    Object mo14119b(@C6592q("limit") int i, @C6592q("offset") int i2, C5866d<? super PagingResponse<ShortGameResponse>> dVar);

    @C6580e("games/{id}/collection")
    /* renamed from: b */
    Object mo14120b(@C6591p("id") long j, @C6592q("limit") int i, @C6592q("offset") int i2, @C6592q("sort.field") String str, @C6592q("sort.direction") String str2, C5866d<? super PagingResponse<ShortGameResponse>> dVar);

    @C6577b("account/game-collections/{listId}/games/{gameId}")
    /* renamed from: b */
    Object mo14121b(@C6591p("listId") long j, @C6591p("gameId") long j2, C5866d<? super CustomListApiModel> dVar);

    @C6580e("users/{id}")
    /* renamed from: b */
    Object mo14122b(@C6591p("id") long j, C5866d<? super UserApiModel> dVar);

    @C6588m("account/game-collections")
    /* renamed from: b */
    Object mo14123b(@C6576a ChangeCustomListRequest changeCustomListRequest, C5866d<? super CustomListApiModel> dVar);

    @C6587l("account/login/facebook")
    /* renamed from: b */
    Object mo14124b(@C6576a Map<String, String> map, C5866d<? super SignInResponse> dVar);

    @C6580e("account")
    /* renamed from: b */
    Object mo14125b(C5866d<? super UserApiModel> dVar);

    @C6580e("games/anticipated")
    /* renamed from: c */
    Object mo14126c(@C6592q("limit") int i, @C6592q("offset") int i2, @C6592q("include") String str, C5866d<? super PagingResponse<ShortGameResponse>> dVar);

    @C6580e("developers/{id}/games")
    /* renamed from: c */
    Object mo14127c(@C6591p("id") long j, @C6592q("limit") int i, @C6592q("offset") int i2, @C6592q("sort.field") String str, @C6592q("sort.direction") String str2, C5866d<? super PagingResponse<ShortGameResponse>> dVar);

    @C6580e("games/{id}")
    /* renamed from: c */
    Object mo14128c(@C6591p("id") long j, C5866d<? super DetailGameResponse> dVar);

    @C6587l("devices/register")
    /* renamed from: c */
    Object mo14129c(@C6576a Map<String, String> map, C5866d<? super RegisterDeviceResponse> dVar);

    @C6580e("games/latest")
    /* renamed from: d */
    Object mo14130d(@C6592q("limit") int i, @C6592q("offset") int i2, @C6592q("include") String str, C5866d<? super PagingResponse<ShortGameResponse>> dVar);

    @C6577b("account/game-collections/{listId}")
    /* renamed from: d */
    Object mo14131d(@C6591p("listId") long j, C5866d<Object> dVar);

    @C6587l("token/refresh")
    /* renamed from: d */
    Object mo14132d(@C6576a Map<String, String> map, C5866d<? super C6663t<AccessTokenApiModel>> dVar);

    @C6580e("users/{id}/games/statuses/statistic")
    /* renamed from: e */
    Object mo14133e(@C6591p("id") long j, C5866d<? super StatisticApiModel> dVar);

    @C6587l("account/login/google")
    /* renamed from: e */
    Object mo14134e(@C6576a Map<String, String> map, C5866d<? super SignInResponse> dVar);

    @C6580e("games/{id}/statuses/statistic")
    /* renamed from: f */
    Object mo14135f(@C6591p("id") long j, C5866d<? super GameStatisticApiModel> dVar);
}
