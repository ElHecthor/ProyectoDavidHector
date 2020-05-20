package kotlinx.coroutines;

import androidx.recyclerview.widget.RecyclerView;
import kotlinx.coroutines.p332e3.C6080c;
import kotlinx.coroutines.p332e3.C6081d;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.q0 */
class C6177q0<T> extends C5957a<T> implements C6173p0<T>, C6080c<T> {

    @C5891f(mo15593c = "kotlinx.coroutines.DeferredCoroutine", mo15594f = "Builders.common.kt", mo15595l = {99}, mo15596m = "await$suspendImpl")
    /* renamed from: kotlinx.coroutines.q0$a */
    static final class C6178a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f15286i;

        /* renamed from: j */
        int f15287j;

        /* renamed from: k */
        final /* synthetic */ C6177q0 f15288k;

        /* renamed from: l */
        Object f15289l;

        C6178a(C6177q0 q0Var, C5866d dVar) {
            this.f15288k = q0Var;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f15286i = obj;
            this.f15287j |= RecyclerView.UNDEFINED_DURATION;
            return C6177q0.m23192a(this.f15288k, (C5866d) this);
        }
    }

    public C6177q0(C5871g gVar, boolean z) {
        C5942k.m22327b(gVar, "parentContext");
        super(gVar, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object m23192a(kotlinx.coroutines.C6177q0 r4, p308k.p316w.C5866d r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.C6177q0.C6178a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.q0$a r0 = (kotlinx.coroutines.C6177q0.C6178a) r0
            int r1 = r0.f15287j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f15287j = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.q0$a r0 = new kotlinx.coroutines.q0$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f15286i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f15287j
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f15289l
            kotlinx.coroutines.q0 r4 = (kotlinx.coroutines.C6177q0) r4
            p308k.C5806n.m22054a(r5)
            goto L_0x0043
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p308k.C5806n.m22054a(r5)
            r0.f15289l = r4
            r0.f15287j = r3
            java.lang.Object r5 = r4.mo15733f(r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6177q0.m23192a(kotlinx.coroutines.q0, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public <R> void mo15669a(C6081d<? super R> dVar, C5922p<? super T, ? super C5866d<? super R>, ? extends Object> pVar) {
        C5942k.m22327b(dVar, "select");
        C5942k.m22327b(pVar, "block");
        mo15727b(dVar, pVar);
    }

    /* renamed from: e */
    public Object mo15956e(C5866d<? super T> dVar) {
        return m23192a(this, (C5866d) dVar);
    }
}
