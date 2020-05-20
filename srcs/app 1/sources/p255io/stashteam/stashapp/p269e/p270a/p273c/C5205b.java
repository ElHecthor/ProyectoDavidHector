package p255io.stashteam.stashapp.p269e.p270a.p273c;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.p256b.p261d.C4957b;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p275b.p279d.C5282a;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.c.b */
public final class C5205b implements C5201a<C5297f, C5812t> {

    /* renamed from: a */
    private final C4957b f13581a;

    /* renamed from: b */
    private final C5282a f13582b;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.custom_lists.CreateCustomListInteractor", mo15594f = "CreateCustomListInteractor.kt", mo15595l = {14, 15}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.c.b$a */
    static final class C5206a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13583i;

        /* renamed from: j */
        int f13584j;

        /* renamed from: k */
        final /* synthetic */ C5205b f13585k;

        /* renamed from: l */
        Object f13586l;

        /* renamed from: m */
        Object f13587m;

        /* renamed from: n */
        Object f13588n;

        C5206a(C5205b bVar, C5866d dVar) {
            this.f13585k = bVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13583i = obj;
            this.f13584j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13585k.mo14718a((C5297f) null, (C5866d<? super C5812t>) this);
        }
    }

    public C5205b(C4957b bVar, C5282a aVar) {
        C5942k.m22327b(bVar, "customListsRepository");
        C5942k.m22327b(aVar, "changeCustomListRequestMapper");
        this.f13581a = bVar;
        this.f13582b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p280c.C5297f r6, p308k.p316w.C5866d<? super p308k.C5812t> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p255io.stashteam.stashapp.p269e.p270a.p273c.C5205b.C5206a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.stashteam.stashapp.e.a.c.b$a r0 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5205b.C5206a) r0
            int r1 = r0.f13584j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13584j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.c.b$a r0 = new io.stashteam.stashapp.e.a.c.b$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f13583i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13584j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r6 = r0.f13588n
            io.stashteam.stashapp.data.network.request.ChangeCustomListRequest r6 = (p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest) r6
            java.lang.Object r6 = r0.f13587m
            io.stashteam.stashapp.e.c.f r6 = (p255io.stashteam.stashapp.p269e.p280c.C5297f) r6
            java.lang.Object r6 = r0.f13586l
            io.stashteam.stashapp.e.a.c.b r6 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5205b) r6
            p308k.C5806n.m22054a(r7)
            goto L_0x0072
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            java.lang.Object r6 = r0.f13587m
            io.stashteam.stashapp.e.c.f r6 = (p255io.stashteam.stashapp.p269e.p280c.C5297f) r6
            java.lang.Object r2 = r0.f13586l
            io.stashteam.stashapp.e.a.c.b r2 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5205b) r2
            p308k.C5806n.m22054a(r7)
            goto L_0x005f
        L_0x004c:
            p308k.C5806n.m22054a(r7)
            io.stashteam.stashapp.e.b.d.a r7 = r5.f13582b
            r0.f13586l = r5
            r0.f13587m = r6
            r0.f13584j = r4
            java.lang.Object r7 = r7.mo14344a(r6, r0)
            if (r7 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r5
        L_0x005f:
            io.stashteam.stashapp.data.network.request.ChangeCustomListRequest r7 = (p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest) r7
            io.stashteam.stashapp.b.d.b r4 = r2.f13581a
            r0.f13586l = r2
            r0.f13587m = r6
            r0.f13588n = r7
            r0.f13584j = r3
            java.lang.Object r6 = r4.mo14160a(r7, r0)
            if (r6 != r1) goto L_0x0072
            return r1
        L_0x0072:
            k.t r6 = p308k.C5812t.f14872a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p273c.C5205b.mo14718a(io.stashteam.stashapp.e.c.f, k.w.d):java.lang.Object");
    }
}
