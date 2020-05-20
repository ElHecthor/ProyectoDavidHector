package p255io.stashteam.stashapp.p281f.p282a.p287i;

import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0532t;
import androidx.lifecycle.C0533u;
import java.util.concurrent.atomic.AtomicBoolean;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.a.i.b */
public final class C5348b<T> extends C0532t<T> {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final AtomicBoolean f14044k = new AtomicBoolean(false);

    /* renamed from: io.stashteam.stashapp.f.a.i.b$a */
    static final class C5349a<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ C5348b f14045a;

        /* renamed from: b */
        final /* synthetic */ C0533u f14046b;

        C5349a(C5348b bVar, C0533u uVar) {
            this.f14045a = bVar;
            this.f14046b = uVar;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            if (this.f14045a.f14044k.compareAndSet(true, false)) {
                this.f14046b.mo3048a(t);
            }
        }
    }

    /* renamed from: a */
    public void mo2976a(C0523n nVar, C0533u<? super T> uVar) {
        C5942k.m22327b(nVar, "owner");
        C5942k.m22327b(uVar, "observer");
        super.mo2976a(nVar, new C5349a(this, uVar));
    }

    /* renamed from: b */
    public void mo2981b(T t) {
        this.f14044k.set(true);
        super.mo2981b(t);
    }
}
