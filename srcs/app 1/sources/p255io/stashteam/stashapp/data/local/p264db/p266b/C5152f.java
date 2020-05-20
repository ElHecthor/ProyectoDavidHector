package p255io.stashteam.stashapp.data.local.p264db.p266b;

import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;

/* renamed from: io.stashteam.stashapp.data.local.db.b.f */
public abstract class C5152f extends C5118a<C5180f> {

    @C5891f(mo15593c = "io.stashteam.stashapp.data.local.db.dao.UserDao", mo15594f = "UserDao.kt", mo15595l = {23, 24}, mo15596m = "insertWithClear$suspendImpl")
    /* renamed from: io.stashteam.stashapp.data.local.db.b.f$a */
    static final class C5153a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13398i;

        /* renamed from: j */
        int f13399j;

        /* renamed from: k */
        final /* synthetic */ C5152f f13400k;

        /* renamed from: l */
        Object f13401l;

        /* renamed from: m */
        Object f13402m;

        C5153a(C5152f fVar, C5866d dVar) {
            this.f13400k = fVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13398i = obj;
            this.f13399j |= RecyclerView.UNDEFINED_DURATION;
            return C5152f.m20392a(this.f13400k, null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object m20392a(p255io.stashteam.stashapp.data.local.p264db.p266b.C5152f r5, p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f r6, p308k.p316w.C5866d r7) {
        /*
            boolean r0 = r7 instanceof p255io.stashteam.stashapp.data.local.p264db.p266b.C5152f.C5153a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.stashteam.stashapp.data.local.db.b.f$a r0 = (p255io.stashteam.stashapp.data.local.p264db.p266b.C5152f.C5153a) r0
            int r1 = r0.f13399j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13399j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.data.local.db.b.f$a r0 = new io.stashteam.stashapp.data.local.db.b.f$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f13398i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13399j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r5 = r0.f13402m
            io.stashteam.stashapp.data.local.db.d.f r5 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r5
            java.lang.Object r5 = r0.f13401l
            io.stashteam.stashapp.data.local.db.b.f r5 = (p255io.stashteam.stashapp.data.local.p264db.p266b.C5152f) r5
            p308k.C5806n.m22054a(r7)
            goto L_0x0066
        L_0x0034:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003c:
            java.lang.Object r5 = r0.f13402m
            r6 = r5
            io.stashteam.stashapp.data.local.db.d.f r6 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r6
            java.lang.Object r5 = r0.f13401l
            io.stashteam.stashapp.data.local.db.b.f r5 = (p255io.stashteam.stashapp.data.local.p264db.p266b.C5152f) r5
            p308k.C5806n.m22054a(r7)
            goto L_0x0059
        L_0x0049:
            p308k.C5806n.m22054a(r7)
            r0.f13401l = r5
            r0.f13402m = r6
            r0.f13399j = r4
            java.lang.Object r7 = r5.mo14328a(r0)
            if (r7 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0.f13401l = r5
            r0.f13402m = r6
            r0.f13399j = r3
            java.lang.Object r5 = r5.mo14291b(r6, r0)
            if (r5 != r1) goto L_0x0066
            return r1
        L_0x0066:
            k.t r5 = p308k.C5812t.f14872a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.local.p264db.p266b.C5152f.m20392a(io.stashteam.stashapp.data.local.db.b.f, io.stashteam.stashapp.data.local.db.d.f, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public abstract LiveData<C5180f> mo14326a();

    /* renamed from: a */
    public Object mo14327a(C5180f fVar, C5866d<? super C5812t> dVar) {
        return m20392a(this, fVar, dVar);
    }

    /* renamed from: a */
    public abstract Object mo14328a(C5866d<? super C5812t> dVar);

    /* renamed from: b */
    public abstract Object mo14329b(C5866d<? super C5180f> dVar);
}
