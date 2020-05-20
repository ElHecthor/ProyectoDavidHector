package p255io.stashteam.stashapp.p281f.p282a.p287i;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0498a0;
import androidx.lifecycle.C0532t;
import androidx.lifecycle.LiveData;
import kotlinx.coroutines.C6089g0;
import kotlinx.coroutines.C6093h0;
import kotlinx.coroutines.C6187r2;
import kotlinx.coroutines.C6188s;
import kotlinx.coroutines.C6199u1;
import kotlinx.coroutines.C6216y0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5859a;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p316w.C5871g.C5876c;
import p308k.p316w.p318j.p319a.C5887b;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p337m.C6236c0;
import p378p.C6620j;
import p378p.C6663t;
import p382q.p383a.C6677a;

/* renamed from: io.stashteam.stashapp.f.a.i.a */
public abstract class C5345a extends C0498a0 {

    /* renamed from: b */
    private final C5871g f14032b = new C5346a(CoroutineExceptionHandler.f14950c, this);

    /* renamed from: c */
    private final C6188s f14033c = C6187r2.m23209a(null, 1, null);

    /* renamed from: d */
    private final C6089g0 f14034d = C6093h0.m22909a(C6216y0.m23287c().plus(this.f14033c).plus(this.f14032b));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C0532t<Boolean> f14035e = new C0532t<>();

    /* renamed from: f */
    private final C5348b<Throwable> f14036f = new C5348b<>();

    /* renamed from: io.stashteam.stashapp.f.a.i.a$a */
    public static final class C5346a extends C5859a implements CoroutineExceptionHandler {

        /* renamed from: f */
        final /* synthetic */ C5345a f14037f;

        public C5346a(C5876c cVar, C5345a aVar) {
            this.f14037f = aVar;
            super(cVar);
        }

        public void handleException(C5871g gVar, Throwable th) {
            C5942k.m22327b(gVar, "context");
            C5942k.m22327b(th, "exception");
            this.f14037f.mo15047a(gVar, th);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.base.viewmodel.BaseViewModel$runCoroutine$1", mo15594f = "BaseViewModel.kt", mo15595l = {40}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.f.a.i.a$b */
    static final class C5347b extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14038j;

        /* renamed from: k */
        Object f14039k;

        /* renamed from: l */
        int f14040l;

        /* renamed from: m */
        final /* synthetic */ C5345a f14041m;

        /* renamed from: n */
        final /* synthetic */ boolean f14042n;

        /* renamed from: o */
        final /* synthetic */ C5922p f14043o;

        C5347b(C5345a aVar, boolean z, C5922p pVar, C5866d dVar) {
            this.f14041m = aVar;
            this.f14042n = z;
            this.f14043o = pVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14040l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14038j;
                if (this.f14042n) {
                    this.f14041m.f14035e.mo2978a(C5887b.m22259a(true));
                }
                C5922p pVar = this.f14043o;
                this.f14039k = g0Var;
                this.f14040l = 1;
                if (pVar.mo4018c(g0Var, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14039k;
                try {
                    C5806n.m22054a(obj);
                } catch (Throwable th) {
                    if (this.f14042n) {
                        this.f14041m.f14035e.mo2978a(C5887b.m22259a(false));
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.f14042n) {
                this.f14041m.f14035e.mo2978a(C5887b.m22259a(false));
            }
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5347b bVar = new C5347b(this.f14041m, this.f14042n, this.f14043o, dVar);
            bVar.f14038j = (C6089g0) obj;
            return bVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5347b) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C6199u1 m20868a(C5345a aVar, C6089g0 g0Var, boolean z, C5922p pVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                g0Var = aVar.f14034d;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo15046a(g0Var, z, pVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runCoroutine");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C6199u1 mo15046a(C6089g0 g0Var, boolean z, C5922p<? super C6089g0, ? super C5866d<? super C5812t>, ? extends Object> pVar) {
        C5942k.m22327b(g0Var, "scope");
        C5942k.m22327b(pVar, "block");
        return C6088g.m22903b(g0Var, null, null, new C5347b(this, z, pVar, null), 3, null);
    }

    @SuppressLint({"TimberExceptionLogging"})
    /* renamed from: a */
    public void mo15047a(C5871g gVar, Throwable th) {
        String str;
        C5942k.m22327b(gVar, "coroutineContext");
        C5942k.m22327b(th, "throwable");
        if (th instanceof C6620j) {
            C6663t a = ((C6620j) th).mo17088a();
            if (a != null) {
                C6236c0 c = a.mo17127c();
                if (c != null) {
                    str = c.mo16064i();
                }
            }
            str = null;
        } else {
            str = th.getMessage();
        }
        C6677a.m25083a(th, str, new Object[0]);
        this.f14036f.mo2981b(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2855b() {
        super.mo2855b();
        C6221z1.m23302b(this.f14034d.mo2973c(), null, 1, null);
    }

    /* renamed from: c */
    public final LiveData<Throwable> mo15048c() {
        return this.f14036f;
    }

    /* renamed from: d */
    public final LiveData<Boolean> mo15049d() {
        return this.f14035e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C6089g0 mo15050e() {
        return this.f14034d;
    }
}
