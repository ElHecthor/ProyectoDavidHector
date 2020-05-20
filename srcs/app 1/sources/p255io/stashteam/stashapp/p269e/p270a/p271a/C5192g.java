package p255io.stashteam.stashapp.p269e.p270a.p271a;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.p256b.p261d.C4944a;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.a.g */
public final class C5192g {

    /* renamed from: a */
    private final C4944a f13534a;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.account.SignOutInteractor", mo15594f = "SignOutInteractor.kt", mo15595l = {11}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.a.g$a */
    static final class C5193a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13535i;

        /* renamed from: j */
        int f13536j;

        /* renamed from: k */
        final /* synthetic */ C5192g f13537k;

        /* renamed from: l */
        Object f13538l;

        C5193a(C5192g gVar, C5866d dVar) {
            this.f13537k = gVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13535i = obj;
            this.f13536j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13537k.mo14727a(this);
        }
    }

    public C5192g(C4944a aVar) {
        C5942k.m22327b(aVar, "accountRepository");
        this.f13534a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14727a(p308k.p316w.C5866d<? super p308k.C5812t> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p255io.stashteam.stashapp.p269e.p270a.p271a.C5192g.C5193a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            io.stashteam.stashapp.e.a.a.g$a r0 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5192g.C5193a) r0
            int r1 = r0.f13536j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13536j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.a.g$a r0 = new io.stashteam.stashapp.e.a.a.g$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f13535i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13536j
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f13538l
            io.stashteam.stashapp.e.a.a.g r0 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5192g) r0
            p308k.C5806n.m22054a(r5)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            p308k.C5806n.m22054a(r5)
            io.stashteam.stashapp.b.d.a r5 = r4.f13534a
            r0.f13538l = r4
            r0.f13536j = r3
            java.lang.Object r5 = r5.mo14148b(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            k.t r5 = p308k.C5812t.f14872a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p271a.C5192g.mo14727a(k.w.d):java.lang.Object");
    }
}
