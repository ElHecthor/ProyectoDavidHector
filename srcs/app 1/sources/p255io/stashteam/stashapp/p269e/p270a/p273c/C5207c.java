package p255io.stashteam.stashapp.p269e.p270a.p273c;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.p256b.p261d.C4957b;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.c.c */
public final class C5207c implements C5201a<Long, C5812t> {

    /* renamed from: a */
    private final C4957b f13589a;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.custom_lists.DeleteCustomListInteractor", mo15594f = "DeleteCustomListInteractor.kt", mo15595l = {11}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.c.c$a */
    static final class C5208a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13590i;

        /* renamed from: j */
        int f13591j;

        /* renamed from: k */
        final /* synthetic */ C5207c f13592k;

        /* renamed from: l */
        Object f13593l;

        /* renamed from: m */
        long f13594m;

        C5208a(C5207c cVar, C5866d dVar) {
            this.f13592k = cVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13590i = obj;
            this.f13591j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13592k.mo14744a(0, (C5866d<? super C5812t>) this);
        }
    }

    public C5207c(C4957b bVar) {
        C5942k.m22327b(bVar, "customListsRepository");
        this.f13589a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14744a(long r5, p308k.p316w.C5866d<? super p308k.C5812t> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p255io.stashteam.stashapp.p269e.p270a.p273c.C5207c.C5208a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.stashteam.stashapp.e.a.c.c$a r0 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5207c.C5208a) r0
            int r1 = r0.f13591j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13591j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.c.c$a r0 = new io.stashteam.stashapp.e.a.c.c$a
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f13590i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13591j
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            long r5 = r0.f13594m
            java.lang.Object r5 = r0.f13593l
            io.stashteam.stashapp.e.a.c.c r5 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5207c) r5
            p308k.C5806n.m22054a(r7)
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            p308k.C5806n.m22054a(r7)
            io.stashteam.stashapp.b.d.b r7 = r4.f13589a
            r0.f13593l = r4
            r0.f13594m = r5
            r0.f13591j = r3
            java.lang.Object r5 = r7.mo14158a(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            k.t r5 = p308k.C5812t.f14872a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p273c.C5207c.mo14744a(long, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo14718a(Object obj, C5866d dVar) {
        return mo14744a(((Number) obj).longValue(), dVar);
    }
}
