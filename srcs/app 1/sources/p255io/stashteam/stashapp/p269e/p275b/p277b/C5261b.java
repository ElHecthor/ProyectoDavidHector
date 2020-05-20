package p255io.stashteam.stashapp.p269e.p275b.p277b;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import p255io.stashteam.stashapp.data.network.model.InvolvedCompanyApiModel;
import p255io.stashteam.stashapp.data.network.response.DetailGameResponse;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p255io.stashteam.stashapp.p269e.p280c.C5293d;
import p255io.stashteam.stashapp.p269e.p280c.C5295e;
import p255io.stashteam.stashapp.p269e.p280c.C5298g;
import p255io.stashteam.stashapp.p269e.p280c.C5317u;
import p308k.C5809q;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.b.b.b */
public final class C5261b implements C5257a<DetailGameResponse, C5298g> {

    /* renamed from: a */
    private final C5264c f13767a;

    /* renamed from: b */
    private final C5267f f13768b;

    /* renamed from: c */
    private final C5275l f13769c;

    /* renamed from: d */
    private final C5266e f13770d;

    /* renamed from: e */
    private final C5270h f13771e;

    /* renamed from: io.stashteam.stashapp.e.b.b.b$a */
    public static final class C5262a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String a = ((C5317u) t2).mo14992a();
            Locale locale = Locale.US;
            String str = "Locale.US";
            C5942k.m22324a((Object) locale, str);
            String str2 = "null cannot be cast to non-null type java.lang.String";
            if (a != null) {
                String lowerCase = a.toLowerCase(locale);
                String str3 = "(this as java.lang.String).toLowerCase(locale)";
                C5942k.m22324a((Object) lowerCase, str3);
                String a2 = ((C5317u) t).mo14992a();
                Locale locale2 = Locale.US;
                C5942k.m22324a((Object) locale2, str);
                if (a2 != null) {
                    String lowerCase2 = a2.toLowerCase(locale2);
                    C5942k.m22324a((Object) lowerCase2, str3);
                    return C5854b.m22211a(lowerCase, lowerCase2);
                }
                throw new C5809q(str2);
            }
            throw new C5809q(str2);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.mapper.from_api.DetailGameMapper", mo15594f = "DetailGameMapper.kt", mo15595l = {24, 29, 31, 37, 38, 39}, mo15596m = "map")
    /* renamed from: io.stashteam.stashapp.e.b.b.b$b */
    static final class C5263b extends C5889d {

        /* renamed from: A */
        long f13772A;

        /* renamed from: B */
        double f13773B;

        /* renamed from: i */
        /* synthetic */ Object f13774i;

        /* renamed from: j */
        int f13775j;

        /* renamed from: k */
        final /* synthetic */ C5261b f13776k;

        /* renamed from: l */
        Object f13777l;

        /* renamed from: m */
        Object f13778m;

        /* renamed from: n */
        Object f13779n;

        /* renamed from: o */
        Object f13780o;

        /* renamed from: p */
        Object f13781p;

        /* renamed from: q */
        Object f13782q;

        /* renamed from: r */
        Object f13783r;

        /* renamed from: s */
        Object f13784s;

        /* renamed from: t */
        Object f13785t;

        /* renamed from: u */
        Object f13786u;

        /* renamed from: v */
        Object f13787v;

        /* renamed from: w */
        Object f13788w;

        /* renamed from: x */
        Object f13789x;

        /* renamed from: y */
        Object f13790y;

        /* renamed from: z */
        Object f13791z;

        C5263b(C5261b bVar, C5866d dVar) {
            this.f13776k = bVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13774i = obj;
            this.f13775j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13776k.mo14344a((DetailGameResponse) null, (C5866d<? super C5298g>) this);
        }
    }

    public C5261b(C5264c cVar, C5267f fVar, C5275l lVar, C5266e eVar, C5270h hVar) {
        C5942k.m22327b(cVar, "gameReviewFromApiMapper");
        C5942k.m22327b(fVar, "platformMapper");
        C5942k.m22327b(lVar, "videoMapper");
        C5942k.m22327b(eVar, "imageFromApiMapper");
        C5942k.m22327b(hVar, "seriesMapper");
        this.f13767a = cVar;
        this.f13768b = fVar;
        this.f13769c = lVar;
        this.f13770d = eVar;
        this.f13771e = hVar;
    }

    /* renamed from: a */
    private final List<C5293d> m20637a(List<InvolvedCompanyApiModel> list) {
        ArrayList arrayList = new ArrayList();
        for (InvolvedCompanyApiModel involvedCompanyApiModel : list) {
            if (involvedCompanyApiModel.getDeveloper()) {
                arrayList.add(new C5293d(involvedCompanyApiModel.getCompany().getId(), involvedCompanyApiModel.getCompany().getName(), C5295e.DEVELOPER));
            }
            if (involvedCompanyApiModel.getPublisher()) {
                arrayList.add(new C5293d(involvedCompanyApiModel.getCompany().getId(), involvedCompanyApiModel.getCompany().getName(), C5295e.PUBLISHER));
            }
        }
        return arrayList;
    }

    /* JADX INFO: used method not loaded: io.stashteam.stashapp.e.b.b.c.a(io.stashteam.stashapp.data.network.model.GameReviewApiModel, k.w.d):null, types can be incorrect */
    /* JADX INFO: used method not loaded: io.stashteam.stashapp.e.b.b.f.a(java.util.List, k.w.d):null, types can be incorrect */
    /* JADX INFO: used method not loaded: k.u.t.a(java.lang.Iterable, java.util.Comparator):null, types can be incorrect */
    /* JADX INFO: used method not loaded: io.stashteam.stashapp.e.b.b.l.a(java.util.List, k.w.d):null, types can be incorrect */
    /* JADX INFO: used method not loaded: io.stashteam.stashapp.e.b.b.e.a(java.util.List, k.w.d):null, types can be incorrect */
    /* JADX INFO: used method not loaded: io.stashteam.stashapp.e.b.b.h.a(io.stashteam.stashapp.data.network.model.SeriesApiModel, k.w.d):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01fd, code lost:
        if (r1.getGame().getFirstReleaseDate() != 0) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01ff, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0201, code lost:
        r2 = new java.util.Date(r1.getGame().getFirstReleaseDate() * ((long) 1000));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0213, code lost:
        r5 = p255io.stashteam.stashapp.p269e.p280c.C5290c.f13844j.mo14868a(r1.getGame().getCategory());
        r6 = r1.getGame().getParentId();
        r16 = r4;
        r43 = r5;
        r4 = p255io.stashteam.stashapp.utils.p304f.C5701g.m21795a(r1.getGame().getCriticsRating() / ((double) 10), 1, null, 2, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x024a, code lost:
        if (r1.getGameReview() == null) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x024c, code lost:
        r7 = r15.f13767a;
        r13 = r1.getGameReview();
        r3.f13777l = r15;
        r3.f13778m = r8;
        r3.f13779n = r1;
        r3.f13780o = r12;
        r3.f13772A = r10;
        r3.f13781p = r9;
        r3.f13773B = r4;
        r3.f13782q = r6;
        r14 = r43;
        r3.f13783r = r14;
        r3.f13784s = r2;
        r3.f13775j = 2;
        r0 = r7.mo14832a(r13, (p308k.p316w.C5866d) r3);
        r7 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0271, code lost:
        if (r0 != r7) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0273, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0274, code lost:
        r13 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r9;
        r39 = r14;
        r14 = r8;
        r8 = r4;
        r5 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x027e, code lost:
        r39 = r10;
        r10 = r0;
        r0 = r6;
        r6 = r5;
        r5 = r1;
        r1 = (p255io.stashteam.stashapp.p269e.p280c.C5306l) r2;
        r2 = r14;
        r14 = r13;
        r13 = r12;
        r11 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x028d, code lost:
        r7 = r16;
        r0 = r6;
        r13 = r12;
        r6 = r43;
        r14 = r1;
        r11 = r10;
        r1 = null;
        r10 = r9;
        r5 = r2;
        r2 = r8;
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x029e, code lost:
        r4 = r14.getGame().getPlatforms();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x02a6, code lost:
        if (r4 == null) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x02a8, code lost:
        r16 = r7;
        r7 = r15.f13768b;
        r3.f13777l = r15;
        r3.f13778m = r2;
        r3.f13779n = r14;
        r3.f13780o = r13;
        r3.f13772A = r11;
        r3.f13781p = r4;
        r3.f13782q = r10;
        r3.f13773B = r8;
        r3.f13783r = r0;
        r3.f13784s = r6;
        r3.f13785t = r5;
        r3.f13786u = r1;
        r17 = r0;
        r3.f13775j = 3;
        r0 = r7.mo14837a(r4, (p308k.p316w.C5866d) r3);
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x02cf, code lost:
        if (r0 != r4) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x02d1, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x02d2, code lost:
        r7 = r17;
        r39 = r2;
        r2 = r0;
        r0 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x02d9, code lost:
        r43 = r0;
        r0 = p308k.p314u.C5845t.m22176a((java.lang.Iterable) r2, (java.util.Comparator) new p255io.stashteam.stashapp.p269e.p275b.p277b.C5261b.C5262a());
        r2 = r43;
        r16 = r4;
        r39 = r6;
        r6 = r0;
        r0 = r10;
        r10 = r7;
        r7 = r1;
        r1 = r14;
        r40 = r8;
        r8 = r5;
        r9 = r39;
        r4 = r11;
        r11 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x02fa, code lost:
        r17 = r0;
        r16 = r7;
        r0 = r10;
        r10 = r17;
        r7 = r1;
        r1 = r14;
        r39 = r8;
        r8 = r5;
        r9 = r6;
        r4 = r11;
        r6 = null;
        r11 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x030b, code lost:
        r14 = r1.getGame().getSummary();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x031b, code lost:
        if (r1.getGame().getInvolvedCompanies() == null) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x031d, code lost:
        r43 = r14;
        r14 = r15.m20637a(r1.getGame().getInvolvedCompanies());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x032c, code lost:
        r43 = r14;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x032f, code lost:
        r18 = r14;
        r14 = r1.getGame().getVideos();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0339, code lost:
        if (r14 == null) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x033b, code lost:
        r17 = r6;
        r6 = r15.f13769c;
        r3.f13777l = r15;
        r3.f13778m = r2;
        r3.f13779n = r1;
        r3.f13780o = r13;
        r3.f13772A = r4;
        r3.f13781p = r14;
        r3.f13782q = r0;
        r3.f13773B = r11;
        r3.f13783r = r10;
        r3.f13784s = r9;
        r3.f13785t = r8;
        r3.f13786u = r7;
        r19 = r0;
        r3.f13787v = r17;
        r3.f13788w = r43;
        r3.f13789x = r18;
        r3.f13775j = 4;
        r0 = r6.mo14847a(r14, (p308k.p316w.C5866d) r3);
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x036e, code lost:
        if (r0 != r6) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0370, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0371, code lost:
        r39 = r4;
        r5 = r43;
        r4 = r17;
        r17 = r1;
        r1 = r13;
        r13 = r19;
        r19 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x037e, code lost:
        r16 = r6;
        r14 = r13;
        r43 = r18;
        r13 = r10;
        r10 = r7;
        r39 = r17;
        r17 = (java.util.List) r0;
        r0 = r1;
        r1 = r39;
        r40 = r9;
        r9 = r4;
        r4 = r5;
        r5 = r11;
        r11 = r8;
        r12 = r40;
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0399, code lost:
        r19 = r0;
        r0 = r13;
        r14 = r19;
        r13 = r10;
        r10 = r7;
        r39 = r4;
        r4 = r43;
        r5 = r11;
        r43 = r18;
        r11 = r8;
        r12 = r9;
        r9 = r6;
        r17 = null;
        r7 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x03b1, code lost:
        r19 = r4;
        r4 = r1.getGame().getScreenshots();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x03bb, code lost:
        if (r4 == null) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x03bd, code lost:
        r18 = r9;
        r9 = r15.f13770d;
        r3.f13777l = r15;
        r3.f13778m = r2;
        r3.f13779n = r1;
        r3.f13780o = r0;
        r3.f13772A = r7;
        r3.f13781p = r4;
        r3.f13782q = r14;
        r3.f13773B = r5;
        r3.f13783r = r13;
        r3.f13784s = r12;
        r3.f13785t = r11;
        r3.f13786u = r10;
        r20 = r0;
        r3.f13787v = r18;
        r3.f13788w = r19;
        r0 = r43;
        r3.f13789x = r0;
        r21 = r0;
        r3.f13790y = r17;
        r3.f13775j = 5;
        r0 = r9.mo14835a(r4, (p308k.p316w.C5866d) r3);
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x03f6, code lost:
        if (r0 != r4) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x03f8, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x03f9, code lost:
        r9 = r11;
        r11 = r13;
        r16 = r19;
        r39 = r18;
        r18 = r1;
        r1 = r17;
        r40 = r7;
        r8 = r10;
        r10 = r12;
        r7 = r39;
        r12 = r5;
        r5 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x040c, code lost:
        r17 = r1;
        r1 = r18;
        r19 = r21;
        r18 = (java.util.List) r0;
        r0 = r14;
        r14 = r10;
        r10 = r16;
        r16 = r4;
        r39 = r11;
        r11 = r7;
        r40 = r12;
        r12 = r8;
        r7 = r5;
        r13 = r9;
        r4 = r40;
        r6 = r15;
        r9 = r20;
        r15 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x042c, code lost:
        r20 = r0;
        r18 = r9;
        r4 = r5;
        r0 = r14;
        r6 = r15;
        r9 = r20;
        r14 = r12;
        r15 = r13;
        r12 = r10;
        r13 = r11;
        r11 = r18;
        r10 = r19;
        r19 = r43;
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0443, code lost:
        r21 = r10;
        r10 = r1.getGame().getSeries();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x044d, code lost:
        if (r10 == null) goto L_0x04c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x044f, code lost:
        r20 = r11;
        r11 = r6.f13771e;
        r3.f13777l = r6;
        r3.f13778m = r2;
        r3.f13779n = r1;
        r3.f13780o = r9;
        r3.f13772A = r7;
        r3.f13781p = r10;
        r3.f13782q = r0;
        r3.f13773B = r4;
        r3.f13783r = r15;
        r3.f13784s = r14;
        r3.f13785t = r13;
        r3.f13786u = r12;
        r2 = r20;
        r3.f13787v = r2;
        r6 = r21;
        r3.f13788w = r6;
        r20 = r0;
        r3.f13789x = r19;
        r3.f13790y = r17;
        r3.f13791z = r18;
        r3.f13775j = 6;
        r0 = r11.mo14840a(r10, (p308k.p316w.C5866d) r3);
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x048a, code lost:
        if (r0 != r3) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x048c, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x048d, code lost:
        r10 = r13;
        r11 = r14;
        r16 = r19;
        r13 = r4;
        r4 = r7;
        r8 = r2;
        r7 = r6;
        r6 = r9;
        r9 = r12;
        r12 = r15;
        r15 = r20;
        r2 = r0;
        r39 = r18;
        r18 = r1;
        r1 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x04a1, code lost:
        r34 = r1;
        r35 = (p255io.stashteam.stashapp.p269e.p280c.C5322y) r2;
        r20 = r4;
        r22 = r6;
        r31 = r7;
        r30 = r8;
        r29 = r9;
        r24 = r10;
        r25 = r11;
        r26 = r12;
        r27 = r13;
        r23 = r15;
        r32 = r16;
        r33 = r17;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x04c2, code lost:
        r30 = r11;
        r27 = r4;
        r31 = r21;
        r22 = r9;
        r29 = r12;
        r24 = r13;
        r25 = r14;
        r26 = r15;
        r33 = r17;
        r34 = r18;
        r32 = r19;
        r23 = r0;
        r35 = null;
        r20 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x04e3, code lost:
        r36 = r1.getGame().getExpansions();
        r37 = r1.getGame().getDlcs();
        r0 = r1.getGame().getGenres();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x04fb, code lost:
        if (r0 == null) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x04fd, code lost:
        r6 = new java.util.ArrayList();
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x050a, code lost:
        if (r0.hasNext() == false) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x050c, code lost:
        r1 = p255io.stashteam.stashapp.p269e.p280c.C5309o.f13943k.mo14978a(((java.lang.Number) r0.next()).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x051c, code lost:
        if (r1 == null) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x051e, code lost:
        r6.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0522, code lost:
        r38 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0525, code lost:
        r38 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0527, code lost:
        r19 = new p255io.stashteam.stashapp.p269e.p280c.C5298g(r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x052e, code lost:
        return r19;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14344a(p255io.stashteam.stashapp.data.network.response.DetailGameResponse r43, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.p269e.p280c.C5298g> r44) {
        /*
            r42 = this;
            r0 = r42
            r1 = r43
            r2 = r44
            boolean r3 = r2 instanceof p255io.stashteam.stashapp.p269e.p275b.p277b.C5261b.C5263b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            io.stashteam.stashapp.e.b.b.b$b r3 = (p255io.stashteam.stashapp.p269e.p275b.p277b.C5261b.C5263b) r3
            int r4 = r3.f13775j
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f13775j = r4
            goto L_0x001e
        L_0x0019:
            io.stashteam.stashapp.e.b.b.b$b r3 = new io.stashteam.stashapp.e.b.b.b$b
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f13774i
            java.lang.Object r4 = p308k.p316w.p317i.C5885d.m22250a()
            int r5 = r3.f13775j
            switch(r5) {
                case 0: goto L_0x01ae;
                case 1: goto L_0x018e;
                case 2: goto L_0x0162;
                case 3: goto L_0x012b;
                case 4: goto L_0x00d7;
                case 5: goto L_0x0082;
                case 6: goto L_0x0031;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0031:
            java.lang.Object r1 = r3.f13791z
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r3.f13790y
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r3.f13789x
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r7 = r3.f13788w
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r3.f13787v
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r3.f13786u
            io.stashteam.stashapp.e.c.l r9 = (p255io.stashteam.stashapp.p269e.p280c.C5306l) r9
            java.lang.Object r10 = r3.f13785t
            java.util.Date r10 = (java.util.Date) r10
            java.lang.Object r11 = r3.f13784s
            io.stashteam.stashapp.e.c.c r11 = (p255io.stashteam.stashapp.p269e.p280c.C5290c) r11
            java.lang.Object r12 = r3.f13783r
            java.lang.Long r12 = (java.lang.Long) r12
            double r13 = r3.f13773B
            java.lang.Object r15 = r3.f13782q
            io.stashteam.stashapp.e.c.p r15 = (p255io.stashteam.stashapp.p269e.p280c.C5311p) r15
            java.lang.Object r6 = r3.f13781p
            io.stashteam.stashapp.data.network.model.SeriesApiModel r6 = (p255io.stashteam.stashapp.data.network.model.SeriesApiModel) r6
            r43 = r4
            r16 = r5
            long r4 = r3.f13772A
            java.lang.Object r6 = r3.f13780o
            java.lang.String r6 = (java.lang.String) r6
            r17 = r1
            java.lang.Object r1 = r3.f13779n
            io.stashteam.stashapp.data.network.response.DetailGameResponse r1 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r1
            r18 = r1
            java.lang.Object r1 = r3.f13778m
            io.stashteam.stashapp.data.network.response.DetailGameResponse r1 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r1
            java.lang.Object r1 = r3.f13777l
            io.stashteam.stashapp.e.b.b.b r1 = (p255io.stashteam.stashapp.p269e.p275b.p277b.C5261b) r1
            p308k.C5806n.m22054a(r2)
            r1 = r17
            r17 = r43
            goto L_0x04a1
        L_0x0082:
            java.lang.Object r1 = r3.f13790y
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r3.f13789x
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r3.f13788w
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r3.f13787v
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r3.f13786u
            io.stashteam.stashapp.e.c.l r8 = (p255io.stashteam.stashapp.p269e.p280c.C5306l) r8
            java.lang.Object r9 = r3.f13785t
            java.util.Date r9 = (java.util.Date) r9
            java.lang.Object r10 = r3.f13784s
            io.stashteam.stashapp.e.c.c r10 = (p255io.stashteam.stashapp.p269e.p280c.C5290c) r10
            java.lang.Object r11 = r3.f13783r
            java.lang.Long r11 = (java.lang.Long) r11
            double r12 = r3.f13773B
            java.lang.Object r14 = r3.f13782q
            io.stashteam.stashapp.e.c.p r14 = (p255io.stashteam.stashapp.p269e.p280c.C5311p) r14
            java.lang.Object r15 = r3.f13781p
            java.util.List r15 = (java.util.List) r15
            r43 = r5
            r16 = r6
            long r5 = r3.f13772A
            java.lang.Object r15 = r3.f13780o
            java.lang.String r15 = (java.lang.String) r15
            r17 = r1
            java.lang.Object r1 = r3.f13779n
            io.stashteam.stashapp.data.network.response.DetailGameResponse r1 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r1
            r18 = r1
            java.lang.Object r1 = r3.f13778m
            io.stashteam.stashapp.data.network.response.DetailGameResponse r1 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r1
            r19 = r1
            java.lang.Object r1 = r3.f13777l
            io.stashteam.stashapp.e.b.b.b r1 = (p255io.stashteam.stashapp.p269e.p275b.p277b.C5261b) r1
            p308k.C5806n.m22054a(r2)
            r21 = r43
            r0 = r2
            r20 = r15
            r2 = r19
            r15 = r1
            r1 = r17
            goto L_0x040c
        L_0x00d7:
            java.lang.Object r1 = r3.f13789x
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r3.f13788w
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r3.f13787v
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r3.f13786u
            io.stashteam.stashapp.e.c.l r7 = (p255io.stashteam.stashapp.p269e.p280c.C5306l) r7
            java.lang.Object r8 = r3.f13785t
            java.util.Date r8 = (java.util.Date) r8
            java.lang.Object r9 = r3.f13784s
            io.stashteam.stashapp.e.c.c r9 = (p255io.stashteam.stashapp.p269e.p280c.C5290c) r9
            java.lang.Object r10 = r3.f13783r
            java.lang.Long r10 = (java.lang.Long) r10
            double r11 = r3.f13773B
            java.lang.Object r13 = r3.f13782q
            io.stashteam.stashapp.e.c.p r13 = (p255io.stashteam.stashapp.p269e.p280c.C5311p) r13
            java.lang.Object r14 = r3.f13781p
            java.util.List r14 = (java.util.List) r14
            long r14 = r3.f13772A
            r43 = r1
            java.lang.Object r1 = r3.f13780o
            java.lang.String r1 = (java.lang.String) r1
            r16 = r1
            java.lang.Object r1 = r3.f13779n
            io.stashteam.stashapp.data.network.response.DetailGameResponse r1 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r1
            r17 = r1
            java.lang.Object r1 = r3.f13778m
            io.stashteam.stashapp.data.network.response.DetailGameResponse r1 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r1
            r18 = r1
            java.lang.Object r1 = r3.f13777l
            io.stashteam.stashapp.e.b.b.b r1 = (p255io.stashteam.stashapp.p269e.p275b.p277b.C5261b) r1
            p308k.C5806n.m22054a(r2)
            r0 = r2
            r19 = r14
            r2 = r18
            r18 = r43
            r15 = r1
            r1 = r16
            r39 = r6
            r6 = r4
            r4 = r39
            goto L_0x037e
        L_0x012b:
            java.lang.Object r1 = r3.f13786u
            io.stashteam.stashapp.e.c.l r1 = (p255io.stashteam.stashapp.p269e.p280c.C5306l) r1
            java.lang.Object r5 = r3.f13785t
            java.util.Date r5 = (java.util.Date) r5
            java.lang.Object r6 = r3.f13784s
            io.stashteam.stashapp.e.c.c r6 = (p255io.stashteam.stashapp.p269e.p280c.C5290c) r6
            java.lang.Object r7 = r3.f13783r
            java.lang.Long r7 = (java.lang.Long) r7
            double r8 = r3.f13773B
            java.lang.Object r10 = r3.f13782q
            io.stashteam.stashapp.e.c.p r10 = (p255io.stashteam.stashapp.p269e.p280c.C5311p) r10
            java.lang.Object r11 = r3.f13781p
            java.util.List r11 = (java.util.List) r11
            long r11 = r3.f13772A
            java.lang.Object r13 = r3.f13780o
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r3.f13779n
            io.stashteam.stashapp.data.network.response.DetailGameResponse r14 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r14
            java.lang.Object r15 = r3.f13778m
            io.stashteam.stashapp.data.network.response.DetailGameResponse r15 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r15
            r43 = r1
            java.lang.Object r1 = r3.f13777l
            io.stashteam.stashapp.e.b.b.b r1 = (p255io.stashteam.stashapp.p269e.p275b.p277b.C5261b) r1
            p308k.C5806n.m22054a(r2)
            r0 = r15
            r15 = r1
            r1 = r43
            goto L_0x02d9
        L_0x0162:
            java.lang.Object r1 = r3.f13784s
            java.util.Date r1 = (java.util.Date) r1
            java.lang.Object r5 = r3.f13783r
            io.stashteam.stashapp.e.c.c r5 = (p255io.stashteam.stashapp.p269e.p280c.C5290c) r5
            java.lang.Object r6 = r3.f13782q
            java.lang.Long r6 = (java.lang.Long) r6
            double r7 = r3.f13773B
            java.lang.Object r9 = r3.f13781p
            io.stashteam.stashapp.e.c.p r9 = (p255io.stashteam.stashapp.p269e.p280c.C5311p) r9
            long r10 = r3.f13772A
            java.lang.Object r12 = r3.f13780o
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r3.f13779n
            io.stashteam.stashapp.data.network.response.DetailGameResponse r13 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r13
            java.lang.Object r14 = r3.f13778m
            io.stashteam.stashapp.data.network.response.DetailGameResponse r14 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r14
            java.lang.Object r15 = r3.f13777l
            io.stashteam.stashapp.e.b.b.b r15 = (p255io.stashteam.stashapp.p269e.p275b.p277b.C5261b) r15
            p308k.C5806n.m22054a(r2)
            r0 = r9
            r8 = r7
            r7 = r4
            goto L_0x027e
        L_0x018e:
            java.lang.Object r1 = r3.f13781p
            io.stashteam.stashapp.data.network.model.ImageApiModel r1 = (p255io.stashteam.stashapp.data.network.model.ImageApiModel) r1
            long r5 = r3.f13772A
            java.lang.Object r1 = r3.f13780o
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r7 = r3.f13779n
            io.stashteam.stashapp.data.network.response.DetailGameResponse r7 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r7
            java.lang.Object r8 = r3.f13778m
            io.stashteam.stashapp.data.network.response.DetailGameResponse r8 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r8
            java.lang.Object r9 = r3.f13777l
            io.stashteam.stashapp.e.b.b.b r9 = (p255io.stashteam.stashapp.p269e.p275b.p277b.C5261b) r9
            p308k.C5806n.m22054a(r2)
            r39 = r2
            r2 = r1
            r1 = r7
            r7 = r39
            goto L_0x01e5
        L_0x01ae:
            p308k.C5806n.m22054a(r2)
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r2 = r43.getGame()
            long r5 = r2.getId()
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r2 = r43.getGame()
            java.lang.String r2 = r2.getName()
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r7 = r43.getGame()
            io.stashteam.stashapp.data.network.model.ImageApiModel r7 = r7.getCover()
            if (r7 == 0) goto L_0x01ec
            io.stashteam.stashapp.e.b.b.e r8 = r0.f13770d
            r3.f13777l = r0
            r3.f13778m = r1
            r3.f13779n = r1
            r3.f13780o = r2
            r3.f13772A = r5
            r3.f13781p = r7
            r9 = 1
            r3.f13775j = r9
            java.lang.Object r7 = r8.mo14344a(r7, r3)
            if (r7 != r4) goto L_0x01e3
            return r4
        L_0x01e3:
            r9 = r0
            r8 = r1
        L_0x01e5:
            io.stashteam.stashapp.e.c.p r7 = (p255io.stashteam.stashapp.p269e.p280c.C5311p) r7
            r12 = r2
            r10 = r5
            r15 = r9
            r9 = r7
            goto L_0x01f1
        L_0x01ec:
            r15 = r0
            r8 = r1
            r12 = r2
            r10 = r5
            r9 = 0
        L_0x01f1:
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r2 = r1.getGame()
            long r5 = r2.getFirstReleaseDate()
            r13 = 0
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0201
            r2 = 0
            goto L_0x0213
        L_0x0201:
            java.util.Date r2 = new java.util.Date
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r5 = r1.getGame()
            long r5 = r5.getFirstReleaseDate()
            r7 = 1000(0x3e8, float:1.401E-42)
            long r13 = (long) r7
            long r5 = r5 * r13
            r2.<init>(r5)
        L_0x0213:
            io.stashteam.stashapp.e.c.c$a r5 = p255io.stashteam.stashapp.p269e.p280c.C5290c.f13844j
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r6 = r1.getGame()
            int r6 = r6.getCategory()
            io.stashteam.stashapp.e.c.c r5 = r5.mo14868a(r6)
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r6 = r1.getGame()
            java.lang.Long r6 = r6.getParentId()
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r7 = r1.getGame()
            double r13 = r7.getCriticsRating()
            r7 = 10
            r16 = r4
            r43 = r5
            double r4 = (double) r7
            double r17 = r13 / r4
            r19 = 1
            r20 = 0
            r21 = 2
            r22 = 0
            double r4 = p255io.stashteam.stashapp.utils.p304f.C5701g.m21795a(r17, r19, r20, r21, r22)
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r7 = r1.getGameReview()
            if (r7 == 0) goto L_0x028d
            io.stashteam.stashapp.e.b.b.c r7 = r15.f13767a
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r13 = r1.getGameReview()
            r3.f13777l = r15
            r3.f13778m = r8
            r3.f13779n = r1
            r3.f13780o = r12
            r3.f13772A = r10
            r3.f13781p = r9
            r3.f13773B = r4
            r3.f13782q = r6
            r14 = r43
            r3.f13783r = r14
            r3.f13784s = r2
            r0 = 2
            r3.f13775j = r0
            java.lang.Object r0 = r7.mo14344a(r13, r3)
            r7 = r16
            if (r0 != r7) goto L_0x0274
            return r7
        L_0x0274:
            r13 = r1
            r1 = r2
            r2 = r0
            r0 = r9
            r39 = r14
            r14 = r8
            r8 = r4
            r5 = r39
        L_0x027e:
            io.stashteam.stashapp.e.c.l r2 = (p255io.stashteam.stashapp.p269e.p280c.C5306l) r2
            r39 = r10
            r10 = r0
            r0 = r6
            r6 = r5
            r5 = r1
            r1 = r2
            r2 = r14
            r14 = r13
            r13 = r12
            r11 = r39
            goto L_0x029e
        L_0x028d:
            r14 = r43
            r7 = r16
            r0 = r6
            r13 = r12
            r6 = r14
            r14 = r1
            r11 = r10
            r1 = 0
            r10 = r9
            r39 = r4
            r5 = r2
            r2 = r8
            r8 = r39
        L_0x029e:
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r4 = r14.getGame()
            java.util.List r4 = r4.getPlatforms()
            if (r4 == 0) goto L_0x02fa
            r16 = r7
            io.stashteam.stashapp.e.b.b.f r7 = r15.f13768b
            r3.f13777l = r15
            r3.f13778m = r2
            r3.f13779n = r14
            r3.f13780o = r13
            r3.f13772A = r11
            r3.f13781p = r4
            r3.f13782q = r10
            r3.f13773B = r8
            r3.f13783r = r0
            r3.f13784s = r6
            r3.f13785t = r5
            r3.f13786u = r1
            r17 = r0
            r0 = 3
            r3.f13775j = r0
            java.lang.Object r0 = r7.mo14837a(r4, r3)
            r4 = r16
            if (r0 != r4) goto L_0x02d2
            return r4
        L_0x02d2:
            r7 = r17
            r39 = r2
            r2 = r0
            r0 = r39
        L_0x02d9:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r43 = r0
            io.stashteam.stashapp.e.b.b.b$a r0 = new io.stashteam.stashapp.e.b.b.b$a
            r0.<init>()
            java.util.List r0 = p308k.p314u.C5845t.m22176a(r2, r0)
            r2 = r43
            r16 = r4
            r39 = r6
            r6 = r0
            r0 = r10
            r10 = r7
            r7 = r1
            r1 = r14
            r40 = r8
            r8 = r5
            r9 = r39
            r4 = r11
            r11 = r40
            goto L_0x030b
        L_0x02fa:
            r17 = r0
            r16 = r7
            r0 = r10
            r10 = r17
            r7 = r1
            r1 = r14
            r39 = r8
            r8 = r5
            r9 = r6
            r4 = r11
            r6 = 0
            r11 = r39
        L_0x030b:
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r14 = r1.getGame()
            java.lang.String r14 = r14.getSummary()
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r17 = r1.getGame()
            java.util.List r17 = r17.getInvolvedCompanies()
            if (r17 == 0) goto L_0x032c
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r17 = r1.getGame()
            r43 = r14
            java.util.List r14 = r17.getInvolvedCompanies()
            java.util.List r14 = r15.m20637a(r14)
            goto L_0x032f
        L_0x032c:
            r43 = r14
            r14 = 0
        L_0x032f:
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r17 = r1.getGame()
            r18 = r14
            java.util.List r14 = r17.getVideos()
            if (r14 == 0) goto L_0x0399
            r17 = r6
            io.stashteam.stashapp.e.b.b.l r6 = r15.f13769c
            r3.f13777l = r15
            r3.f13778m = r2
            r3.f13779n = r1
            r3.f13780o = r13
            r3.f13772A = r4
            r3.f13781p = r14
            r3.f13782q = r0
            r3.f13773B = r11
            r3.f13783r = r10
            r3.f13784s = r9
            r3.f13785t = r8
            r3.f13786u = r7
            r19 = r0
            r0 = r17
            r3.f13787v = r0
            r0 = r43
            r3.f13788w = r0
            r0 = r18
            r3.f13789x = r0
            r0 = 4
            r3.f13775j = r0
            java.lang.Object r0 = r6.mo14847a(r14, r3)
            r6 = r16
            if (r0 != r6) goto L_0x0371
            return r6
        L_0x0371:
            r39 = r4
            r5 = r43
            r4 = r17
            r17 = r1
            r1 = r13
            r13 = r19
            r19 = r39
        L_0x037e:
            java.util.List r0 = (java.util.List) r0
            r16 = r6
            r14 = r13
            r43 = r18
            r13 = r10
            r10 = r7
            r39 = r17
            r17 = r0
            r0 = r1
            r1 = r39
            r40 = r9
            r9 = r4
            r4 = r5
            r5 = r11
            r11 = r8
            r12 = r40
            r7 = r19
            goto L_0x03b1
        L_0x0399:
            r19 = r0
            r17 = r6
            r0 = r13
            r14 = r19
            r13 = r10
            r10 = r7
            r39 = r4
            r4 = r43
            r5 = r11
            r43 = r18
            r11 = r8
            r12 = r9
            r9 = r17
            r17 = 0
            r7 = r39
        L_0x03b1:
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r18 = r1.getGame()
            r19 = r4
            java.util.List r4 = r18.getScreenshots()
            if (r4 == 0) goto L_0x042c
            r18 = r9
            io.stashteam.stashapp.e.b.b.e r9 = r15.f13770d
            r3.f13777l = r15
            r3.f13778m = r2
            r3.f13779n = r1
            r3.f13780o = r0
            r3.f13772A = r7
            r3.f13781p = r4
            r3.f13782q = r14
            r3.f13773B = r5
            r3.f13783r = r13
            r3.f13784s = r12
            r3.f13785t = r11
            r3.f13786u = r10
            r20 = r0
            r0 = r18
            r3.f13787v = r0
            r0 = r19
            r3.f13788w = r0
            r0 = r43
            r3.f13789x = r0
            r21 = r0
            r0 = r17
            r3.f13790y = r0
            r0 = 5
            r3.f13775j = r0
            java.lang.Object r0 = r9.mo14835a(r4, r3)
            r4 = r16
            if (r0 != r4) goto L_0x03f9
            return r4
        L_0x03f9:
            r9 = r11
            r11 = r13
            r16 = r19
            r39 = r18
            r18 = r1
            r1 = r17
            r40 = r7
            r8 = r10
            r10 = r12
            r7 = r39
            r12 = r5
            r5 = r40
        L_0x040c:
            java.util.List r0 = (java.util.List) r0
            r17 = r1
            r1 = r18
            r19 = r21
            r18 = r0
            r0 = r14
            r14 = r10
            r10 = r16
            r16 = r4
            r39 = r11
            r11 = r7
            r40 = r12
            r12 = r8
            r7 = r5
            r13 = r9
            r4 = r40
            r6 = r15
            r9 = r20
            r15 = r39
            goto L_0x0443
        L_0x042c:
            r21 = r43
            r20 = r0
            r18 = r9
            r4 = r5
            r0 = r14
            r6 = r15
            r9 = r20
            r14 = r12
            r15 = r13
            r12 = r10
            r13 = r11
            r11 = r18
            r10 = r19
            r19 = r21
            r18 = 0
        L_0x0443:
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r20 = r1.getGame()
            r21 = r10
            io.stashteam.stashapp.data.network.model.SeriesApiModel r10 = r20.getSeries()
            if (r10 == 0) goto L_0x04c2
            r20 = r11
            io.stashteam.stashapp.e.b.b.h r11 = r6.f13771e
            r3.f13777l = r6
            r3.f13778m = r2
            r3.f13779n = r1
            r3.f13780o = r9
            r3.f13772A = r7
            r3.f13781p = r10
            r3.f13782q = r0
            r3.f13773B = r4
            r3.f13783r = r15
            r3.f13784s = r14
            r3.f13785t = r13
            r3.f13786u = r12
            r2 = r20
            r3.f13787v = r2
            r6 = r21
            r3.f13788w = r6
            r20 = r0
            r0 = r19
            r3.f13789x = r0
            r0 = r17
            r3.f13790y = r0
            r0 = r18
            r3.f13791z = r0
            r0 = 6
            r3.f13775j = r0
            java.lang.Object r0 = r11.mo14344a(r10, r3)
            r3 = r16
            if (r0 != r3) goto L_0x048d
            return r3
        L_0x048d:
            r10 = r13
            r11 = r14
            r16 = r19
            r13 = r4
            r4 = r7
            r8 = r2
            r7 = r6
            r6 = r9
            r9 = r12
            r12 = r15
            r15 = r20
            r2 = r0
            r39 = r18
            r18 = r1
            r1 = r39
        L_0x04a1:
            io.stashteam.stashapp.e.c.y r2 = (p255io.stashteam.stashapp.p269e.p280c.C5322y) r2
            r34 = r1
            r35 = r2
            r20 = r4
            r22 = r6
            r31 = r7
            r30 = r8
            r29 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r23 = r15
            r32 = r16
            r33 = r17
            r1 = r18
            goto L_0x04e3
        L_0x04c2:
            r20 = r0
            r2 = r11
            r6 = r21
            r30 = r2
            r27 = r4
            r31 = r6
            r22 = r9
            r29 = r12
            r24 = r13
            r25 = r14
            r26 = r15
            r33 = r17
            r34 = r18
            r32 = r19
            r23 = r20
            r35 = 0
            r20 = r7
        L_0x04e3:
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r0 = r1.getGame()
            java.util.List r36 = r0.getExpansions()
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r0 = r1.getGame()
            java.util.List r37 = r0.getDlcs()
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r0 = r1.getGame()
            java.util.List r0 = r0.getGenres()
            if (r0 == 0) goto L_0x0525
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0506:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0522
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            io.stashteam.stashapp.e.c.o$a r2 = p255io.stashteam.stashapp.p269e.p280c.C5309o.f13943k
            io.stashteam.stashapp.e.c.o r1 = r2.mo14978a(r1)
            if (r1 == 0) goto L_0x0506
            r6.add(r1)
            goto L_0x0506
        L_0x0522:
            r38 = r6
            goto L_0x0527
        L_0x0525:
            r38 = 0
        L_0x0527:
            io.stashteam.stashapp.e.c.g r0 = new io.stashteam.stashapp.e.c.g
            r19 = r0
            r19.<init>(r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p275b.p277b.C5261b.mo14344a(io.stashteam.stashapp.data.network.response.DetailGameResponse, k.w.d):java.lang.Object");
    }
}
