package p255io.stashteam.stashapp.p256b.p261d;

import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p071f.p131r.C3490d.C3492b;
import p255io.stashteam.stashapp.data.local.p264db.InMemoryDatabase;
import p255io.stashteam.stashapp.data.local.p264db.p267c.C5166a;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5175a;
import p255io.stashteam.stashapp.data.network.model.CustomListApiModel;
import p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest;
import p255io.stashteam.stashapp.data.network.response.PagingResponse;
import p255io.stashteam.stashapp.data.network.response.ShortGameResponse;
import p255io.stashteam.stashapp.p256b.p260c.C4942a;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.b.d.b */
public final class C4957b {

    /* renamed from: a */
    private final C4942a f12904a;

    /* renamed from: b */
    private final InMemoryDatabase f12905b;

    /* renamed from: c */
    private final C5166a f12906c;

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.CustomListsRepository", mo15594f = "CustomListsRepository.kt", mo15595l = {63, 64}, mo15596m = "addGameToCustomList")
    /* renamed from: io.stashteam.stashapp.b.d.b$a */
    static final class C4958a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f12907i;

        /* renamed from: j */
        int f12908j;

        /* renamed from: k */
        final /* synthetic */ C4957b f12909k;

        /* renamed from: l */
        Object f12910l;

        /* renamed from: m */
        Object f12911m;

        /* renamed from: n */
        long f12912n;

        /* renamed from: o */
        long f12913o;

        C4958a(C4957b bVar, C5866d dVar) {
            this.f12909k = bVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f12907i = obj;
            this.f12908j |= RecyclerView.UNDEFINED_DURATION;
            return this.f12909k.mo14157a(0, 0, this);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.CustomListsRepository", mo15594f = "CustomListsRepository.kt", mo15595l = {48, 49}, mo15596m = "createCustomList")
    /* renamed from: io.stashteam.stashapp.b.d.b$b */
    static final class C4959b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f12914i;

        /* renamed from: j */
        int f12915j;

        /* renamed from: k */
        final /* synthetic */ C4957b f12916k;

        /* renamed from: l */
        Object f12917l;

        /* renamed from: m */
        Object f12918m;

        /* renamed from: n */
        Object f12919n;

        C4959b(C4957b bVar, C5866d dVar) {
            this.f12916k = bVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f12914i = obj;
            this.f12915j |= RecyclerView.UNDEFINED_DURATION;
            return this.f12916k.mo14160a((ChangeCustomListRequest) null, (C5866d<? super C5812t>) this);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.CustomListsRepository", mo15594f = "CustomListsRepository.kt", mo15595l = {58, 59}, mo15596m = "deleteCustomList")
    /* renamed from: io.stashteam.stashapp.b.d.b$c */
    static final class C4960c extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f12920i;

        /* renamed from: j */
        int f12921j;

        /* renamed from: k */
        final /* synthetic */ C4957b f12922k;

        /* renamed from: l */
        Object f12923l;

        /* renamed from: m */
        long f12924m;

        C4960c(C4957b bVar, C5866d dVar) {
            this.f12922k = bVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f12920i = obj;
            this.f12921j |= RecyclerView.UNDEFINED_DURATION;
            return this.f12922k.mo14158a(0, (C5866d<? super C5812t>) this);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.CustomListsRepository", mo15594f = "CustomListsRepository.kt", mo15595l = {68, 69}, mo15596m = "deleteGameFromCustomList")
    /* renamed from: io.stashteam.stashapp.b.d.b$d */
    static final class C4961d extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f12925i;

        /* renamed from: j */
        int f12926j;

        /* renamed from: k */
        final /* synthetic */ C4957b f12927k;

        /* renamed from: l */
        Object f12928l;

        /* renamed from: m */
        Object f12929m;

        /* renamed from: n */
        long f12930n;

        /* renamed from: o */
        long f12931o;

        C4961d(C4957b bVar, C5866d dVar) {
            this.f12927k = bVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f12925i = obj;
            this.f12926j |= RecyclerView.UNDEFINED_DURATION;
            return this.f12927k.mo14163b(0, 0, this);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.CustomListsRepository", mo15594f = "CustomListsRepository.kt", mo15595l = {73, 74}, mo15596m = "handleCustomListResponse")
    /* renamed from: io.stashteam.stashapp.b.d.b$e */
    static final class C4962e extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f12932i;

        /* renamed from: j */
        int f12933j;

        /* renamed from: k */
        final /* synthetic */ C4957b f12934k;

        /* renamed from: l */
        Object f12935l;

        /* renamed from: m */
        Object f12936m;

        /* renamed from: n */
        Object f12937n;

        C4962e(C4957b bVar, C5866d dVar) {
            this.f12934k = bVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f12932i = obj;
            this.f12933j |= RecyclerView.UNDEFINED_DURATION;
            return this.f12934k.mo14159a((CustomListApiModel) null, (C5866d<? super C5812t>) this);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.CustomListsRepository", mo15594f = "CustomListsRepository.kt", mo15595l = {53, 54}, mo15596m = "updateCustomList")
    /* renamed from: io.stashteam.stashapp.b.d.b$f */
    static final class C4963f extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f12938i;

        /* renamed from: j */
        int f12939j;

        /* renamed from: k */
        final /* synthetic */ C4957b f12940k;

        /* renamed from: l */
        Object f12941l;

        /* renamed from: m */
        Object f12942m;

        /* renamed from: n */
        Object f12943n;

        C4963f(C4957b bVar, C5866d dVar) {
            this.f12940k = bVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f12938i = obj;
            this.f12939j |= RecyclerView.UNDEFINED_DURATION;
            return this.f12940k.mo14164b(null, this);
        }
    }

    public C4957b(C4942a aVar, InMemoryDatabase inMemoryDatabase, C5166a aVar2) {
        C5942k.m22327b(aVar, "apiRestService");
        C5942k.m22327b(inMemoryDatabase, "inMemoryDatabase");
        C5942k.m22327b(aVar2, "customListEntityMapper");
        this.f12904a = aVar;
        this.f12905b = inMemoryDatabase;
        this.f12906c = aVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m19842a(C4957b bVar, int i, int i2, String str, C5866d dVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            str = null;
        }
        return bVar.mo14155a(i, i2, str, dVar);
    }

    /* renamed from: a */
    public final LiveData<C5175a> mo14153a(long j) {
        return this.f12905b.mo14281p().mo14293a(j);
    }

    /* renamed from: a */
    public final C3492b<Integer, C5175a> mo14154a() {
        return this.f12905b.mo14281p().mo14294a();
    }

    /* renamed from: a */
    public final Object mo14155a(int i, int i2, String str, C5866d<? super PagingResponse<CustomListApiModel>> dVar) {
        return this.f12904a.mo14101a(i, i2, "DATE_ADDED", "DESC", str, dVar);
    }

    /* renamed from: a */
    public final Object mo14156a(long j, int i, int i2, C5866d<? super PagingResponse<ShortGameResponse>> dVar) {
        return this.f12904a.mo14105a(j, i, i2, "DATE_ADDED", "DESC", dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14157a(long r10, long r12, p308k.p316w.C5866d<? super p308k.C5812t> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof p255io.stashteam.stashapp.p256b.p261d.C4957b.C4958a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            io.stashteam.stashapp.b.d.b$a r0 = (p255io.stashteam.stashapp.p256b.p261d.C4957b.C4958a) r0
            int r1 = r0.f12908j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12908j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.b.d.b$a r0 = new io.stashteam.stashapp.b.d.b$a
            r0.<init>(r9, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f12907i
            java.lang.Object r7 = p308k.p316w.p317i.C5885d.m22250a()
            int r1 = r0.f12908j
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x004c
            if (r1 == r2) goto L_0x0040
            if (r1 != r8) goto L_0x0038
            java.lang.Object r10 = r0.f12911m
            io.stashteam.stashapp.data.network.model.CustomListApiModel r10 = (p255io.stashteam.stashapp.data.network.model.CustomListApiModel) r10
            long r10 = r0.f12913o
            long r10 = r0.f12912n
            java.lang.Object r10 = r0.f12910l
            io.stashteam.stashapp.b.d.b r10 = (p255io.stashteam.stashapp.p256b.p261d.C4957b) r10
            p308k.C5806n.m22054a(r14)
            goto L_0x0077
        L_0x0038:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0040:
            long r12 = r0.f12913o
            long r10 = r0.f12912n
            java.lang.Object r1 = r0.f12910l
            io.stashteam.stashapp.b.d.b r1 = (p255io.stashteam.stashapp.p256b.p261d.C4957b) r1
            p308k.C5806n.m22054a(r14)
            goto L_0x0064
        L_0x004c:
            p308k.C5806n.m22054a(r14)
            io.stashteam.stashapp.b.c.a r1 = r9.f12904a
            r0.f12910l = r9
            r0.f12912n = r10
            r0.f12913o = r12
            r0.f12908j = r2
            r2 = r10
            r4 = r12
            r6 = r0
            java.lang.Object r14 = r1.mo14106a(r2, r4, r6)
            if (r14 != r7) goto L_0x0063
            return r7
        L_0x0063:
            r1 = r9
        L_0x0064:
            io.stashteam.stashapp.data.network.model.CustomListApiModel r14 = (p255io.stashteam.stashapp.data.network.model.CustomListApiModel) r14
            r0.f12910l = r1
            r0.f12912n = r10
            r0.f12913o = r12
            r0.f12911m = r14
            r0.f12908j = r8
            java.lang.Object r10 = r1.mo14159a(r14, r0)
            if (r10 != r7) goto L_0x0077
            return r7
        L_0x0077:
            k.t r10 = p308k.C5812t.f14872a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p256b.p261d.C4957b.mo14157a(long, long, k.w.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14158a(long r6, p308k.p316w.C5866d<? super p308k.C5812t> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p255io.stashteam.stashapp.p256b.p261d.C4957b.C4960c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            io.stashteam.stashapp.b.d.b$c r0 = (p255io.stashteam.stashapp.p256b.p261d.C4957b.C4960c) r0
            int r1 = r0.f12921j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12921j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.b.d.b$c r0 = new io.stashteam.stashapp.b.d.b$c
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f12920i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f12921j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            long r6 = r0.f12924m
            java.lang.Object r6 = r0.f12923l
            io.stashteam.stashapp.b.d.b r6 = (p255io.stashteam.stashapp.p256b.p261d.C4957b) r6
            p308k.C5806n.m22054a(r8)
            goto L_0x006a
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            long r6 = r0.f12924m
            java.lang.Object r2 = r0.f12923l
            io.stashteam.stashapp.b.d.b r2 = (p255io.stashteam.stashapp.p256b.p261d.C4957b) r2
            p308k.C5806n.m22054a(r8)
            goto L_0x0057
        L_0x0044:
            p308k.C5806n.m22054a(r8)
            io.stashteam.stashapp.b.c.a r8 = r5.f12904a
            r0.f12923l = r5
            r0.f12924m = r6
            r0.f12921j = r4
            java.lang.Object r8 = r8.mo14131d(r6, r0)
            if (r8 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r5
        L_0x0057:
            io.stashteam.stashapp.data.local.db.InMemoryDatabase r8 = r2.f12905b
            io.stashteam.stashapp.data.local.db.b.b r8 = r8.mo14281p()
            r0.f12923l = r2
            r0.f12924m = r6
            r0.f12921j = r3
            java.lang.Object r6 = r8.mo14295a(r6, r0)
            if (r6 != r1) goto L_0x006a
            return r1
        L_0x006a:
            k.t r6 = p308k.C5812t.f14872a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p256b.p261d.C4957b.mo14158a(long, k.w.d):java.lang.Object");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo14159a(p255io.stashteam.stashapp.data.network.model.CustomListApiModel r6, p308k.p316w.C5866d<? super p308k.C5812t> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p255io.stashteam.stashapp.p256b.p261d.C4957b.C4962e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.stashteam.stashapp.b.d.b$e r0 = (p255io.stashteam.stashapp.p256b.p261d.C4957b.C4962e) r0
            int r1 = r0.f12933j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12933j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.b.d.b$e r0 = new io.stashteam.stashapp.b.d.b$e
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f12932i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f12933j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r6 = r0.f12937n
            io.stashteam.stashapp.data.local.db.d.a r6 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5175a) r6
            java.lang.Object r6 = r0.f12936m
            io.stashteam.stashapp.data.network.model.CustomListApiModel r6 = (p255io.stashteam.stashapp.data.network.model.CustomListApiModel) r6
            java.lang.Object r6 = r0.f12935l
            io.stashteam.stashapp.b.d.b r6 = (p255io.stashteam.stashapp.p256b.p261d.C4957b) r6
            p308k.C5806n.m22054a(r7)
            goto L_0x0076
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            java.lang.Object r6 = r0.f12936m
            io.stashteam.stashapp.data.network.model.CustomListApiModel r6 = (p255io.stashteam.stashapp.data.network.model.CustomListApiModel) r6
            java.lang.Object r2 = r0.f12935l
            io.stashteam.stashapp.b.d.b r2 = (p255io.stashteam.stashapp.p256b.p261d.C4957b) r2
            p308k.C5806n.m22054a(r7)
            goto L_0x005f
        L_0x004c:
            p308k.C5806n.m22054a(r7)
            io.stashteam.stashapp.data.local.db.c.a r7 = r5.f12906c
            r0.f12935l = r5
            r0.f12936m = r6
            r0.f12933j = r4
            java.lang.Object r7 = r7.mo14344a(r6, r0)
            if (r7 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r5
        L_0x005f:
            io.stashteam.stashapp.data.local.db.d.a r7 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5175a) r7
            io.stashteam.stashapp.data.local.db.InMemoryDatabase r4 = r2.f12905b
            io.stashteam.stashapp.data.local.db.b.b r4 = r4.mo14281p()
            r0.f12935l = r2
            r0.f12936m = r6
            r0.f12937n = r7
            r0.f12933j = r3
            java.lang.Object r6 = r4.mo14291b(r7, r0)
            if (r6 != r1) goto L_0x0076
            return r1
        L_0x0076:
            k.t r6 = p308k.C5812t.f14872a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p256b.p261d.C4957b.mo14159a(io.stashteam.stashapp.data.network.model.CustomListApiModel, k.w.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14160a(p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest r6, p308k.p316w.C5866d<? super p308k.C5812t> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p255io.stashteam.stashapp.p256b.p261d.C4957b.C4959b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.stashteam.stashapp.b.d.b$b r0 = (p255io.stashteam.stashapp.p256b.p261d.C4957b.C4959b) r0
            int r1 = r0.f12915j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12915j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.b.d.b$b r0 = new io.stashteam.stashapp.b.d.b$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f12914i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f12915j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r6 = r0.f12919n
            io.stashteam.stashapp.data.network.model.CustomListApiModel r6 = (p255io.stashteam.stashapp.data.network.model.CustomListApiModel) r6
            java.lang.Object r6 = r0.f12918m
            io.stashteam.stashapp.data.network.request.ChangeCustomListRequest r6 = (p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest) r6
            java.lang.Object r6 = r0.f12917l
            io.stashteam.stashapp.b.d.b r6 = (p255io.stashteam.stashapp.p256b.p261d.C4957b) r6
            p308k.C5806n.m22054a(r7)
            goto L_0x0070
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            java.lang.Object r6 = r0.f12918m
            io.stashteam.stashapp.data.network.request.ChangeCustomListRequest r6 = (p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest) r6
            java.lang.Object r2 = r0.f12917l
            io.stashteam.stashapp.b.d.b r2 = (p255io.stashteam.stashapp.p256b.p261d.C4957b) r2
            p308k.C5806n.m22054a(r7)
            goto L_0x005f
        L_0x004c:
            p308k.C5806n.m22054a(r7)
            io.stashteam.stashapp.b.c.a r7 = r5.f12904a
            r0.f12917l = r5
            r0.f12918m = r6
            r0.f12915j = r4
            java.lang.Object r7 = r7.mo14110a(r6, r0)
            if (r7 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r5
        L_0x005f:
            io.stashteam.stashapp.data.network.model.CustomListApiModel r7 = (p255io.stashteam.stashapp.data.network.model.CustomListApiModel) r7
            r0.f12917l = r2
            r0.f12918m = r6
            r0.f12919n = r7
            r0.f12915j = r3
            java.lang.Object r6 = r2.mo14159a(r7, r0)
            if (r6 != r1) goto L_0x0070
            return r1
        L_0x0070:
            k.t r6 = p308k.C5812t.f14872a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p256b.p261d.C4957b.mo14160a(io.stashteam.stashapp.data.network.request.ChangeCustomListRequest, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo14161a(List<C5175a> list, C5866d<? super C5812t> dVar) {
        Object a = this.f12905b.mo14281p().mo14290a(list, dVar);
        return a == C5885d.m22250a() ? a : C5812t.f14872a;
    }

    /* renamed from: a */
    public final Object mo14162a(C5866d<? super Integer> dVar) {
        return this.f12905b.mo14281p().mo14296a(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14163b(long r10, long r12, p308k.p316w.C5866d<? super p308k.C5812t> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof p255io.stashteam.stashapp.p256b.p261d.C4957b.C4961d
            if (r0 == 0) goto L_0x0013
            r0 = r14
            io.stashteam.stashapp.b.d.b$d r0 = (p255io.stashteam.stashapp.p256b.p261d.C4957b.C4961d) r0
            int r1 = r0.f12926j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12926j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.b.d.b$d r0 = new io.stashteam.stashapp.b.d.b$d
            r0.<init>(r9, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f12925i
            java.lang.Object r7 = p308k.p316w.p317i.C5885d.m22250a()
            int r1 = r0.f12926j
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x004c
            if (r1 == r2) goto L_0x0040
            if (r1 != r8) goto L_0x0038
            java.lang.Object r10 = r0.f12929m
            io.stashteam.stashapp.data.network.model.CustomListApiModel r10 = (p255io.stashteam.stashapp.data.network.model.CustomListApiModel) r10
            long r10 = r0.f12931o
            long r10 = r0.f12930n
            java.lang.Object r10 = r0.f12928l
            io.stashteam.stashapp.b.d.b r10 = (p255io.stashteam.stashapp.p256b.p261d.C4957b) r10
            p308k.C5806n.m22054a(r14)
            goto L_0x0077
        L_0x0038:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0040:
            long r12 = r0.f12931o
            long r10 = r0.f12930n
            java.lang.Object r1 = r0.f12928l
            io.stashteam.stashapp.b.d.b r1 = (p255io.stashteam.stashapp.p256b.p261d.C4957b) r1
            p308k.C5806n.m22054a(r14)
            goto L_0x0064
        L_0x004c:
            p308k.C5806n.m22054a(r14)
            io.stashteam.stashapp.b.c.a r1 = r9.f12904a
            r0.f12928l = r9
            r0.f12930n = r10
            r0.f12931o = r12
            r0.f12926j = r2
            r2 = r10
            r4 = r12
            r6 = r0
            java.lang.Object r14 = r1.mo14121b(r2, r4, r6)
            if (r14 != r7) goto L_0x0063
            return r7
        L_0x0063:
            r1 = r9
        L_0x0064:
            io.stashteam.stashapp.data.network.model.CustomListApiModel r14 = (p255io.stashteam.stashapp.data.network.model.CustomListApiModel) r14
            r0.f12928l = r1
            r0.f12930n = r10
            r0.f12931o = r12
            r0.f12929m = r14
            r0.f12926j = r8
            java.lang.Object r10 = r1.mo14159a(r14, r0)
            if (r10 != r7) goto L_0x0077
            return r7
        L_0x0077:
            k.t r10 = p308k.C5812t.f14872a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p256b.p261d.C4957b.mo14163b(long, long, k.w.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14164b(p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest r6, p308k.p316w.C5866d<? super p308k.C5812t> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p255io.stashteam.stashapp.p256b.p261d.C4957b.C4963f
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.stashteam.stashapp.b.d.b$f r0 = (p255io.stashteam.stashapp.p256b.p261d.C4957b.C4963f) r0
            int r1 = r0.f12939j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12939j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.b.d.b$f r0 = new io.stashteam.stashapp.b.d.b$f
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f12938i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f12939j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r6 = r0.f12943n
            io.stashteam.stashapp.data.network.model.CustomListApiModel r6 = (p255io.stashteam.stashapp.data.network.model.CustomListApiModel) r6
            java.lang.Object r6 = r0.f12942m
            io.stashteam.stashapp.data.network.request.ChangeCustomListRequest r6 = (p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest) r6
            java.lang.Object r6 = r0.f12941l
            io.stashteam.stashapp.b.d.b r6 = (p255io.stashteam.stashapp.p256b.p261d.C4957b) r6
            p308k.C5806n.m22054a(r7)
            goto L_0x0070
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            java.lang.Object r6 = r0.f12942m
            io.stashteam.stashapp.data.network.request.ChangeCustomListRequest r6 = (p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest) r6
            java.lang.Object r2 = r0.f12941l
            io.stashteam.stashapp.b.d.b r2 = (p255io.stashteam.stashapp.p256b.p261d.C4957b) r2
            p308k.C5806n.m22054a(r7)
            goto L_0x005f
        L_0x004c:
            p308k.C5806n.m22054a(r7)
            io.stashteam.stashapp.b.c.a r7 = r5.f12904a
            r0.f12941l = r5
            r0.f12942m = r6
            r0.f12939j = r4
            java.lang.Object r7 = r7.mo14123b(r6, r0)
            if (r7 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r5
        L_0x005f:
            io.stashteam.stashapp.data.network.model.CustomListApiModel r7 = (p255io.stashteam.stashapp.data.network.model.CustomListApiModel) r7
            r0.f12941l = r2
            r0.f12942m = r6
            r0.f12943n = r7
            r0.f12939j = r3
            java.lang.Object r6 = r2.mo14159a(r7, r0)
            if (r6 != r1) goto L_0x0070
            return r1
        L_0x0070:
            k.t r6 = p308k.C5812t.f14872a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p256b.p261d.C4957b.mo14164b(io.stashteam.stashapp.data.network.request.ChangeCustomListRequest, k.w.d):java.lang.Object");
    }
}
