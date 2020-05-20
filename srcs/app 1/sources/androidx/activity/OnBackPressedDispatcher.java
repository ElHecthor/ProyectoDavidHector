package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0514h;
import androidx.lifecycle.C0514h.C0515a;
import androidx.lifecycle.C0514h.C0516b;
import androidx.lifecycle.C0521l;
import androidx.lifecycle.C0523n;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f87a;

    /* renamed from: b */
    final ArrayDeque<C0045b> f88b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements C0521l, C0044a {

        /* renamed from: f */
        private final C0514h f89f;

        /* renamed from: g */
        private final C0045b f90g;

        /* renamed from: h */
        private C0044a f91h;

        LifecycleOnBackPressedCancellable(C0514h hVar, C0045b bVar) {
            this.f89f = hVar;
            this.f90g = bVar;
            hVar.mo3037a(this);
        }

        /* renamed from: a */
        public void mo124a(C0523n nVar, C0515a aVar) {
            if (aVar == C0515a.ON_START) {
                this.f91h = OnBackPressedDispatcher.this.mo126a(this.f90g);
            } else if (aVar == C0515a.ON_STOP) {
                C0044a aVar2 = this.f91h;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == C0515a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f89f.mo3038b(this);
            this.f90g.mo133b(this);
            C0044a aVar = this.f91h;
            if (aVar != null) {
                aVar.cancel();
                this.f91h = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0043a implements C0044a {

        /* renamed from: f */
        private final C0045b f93f;

        C0043a(C0045b bVar) {
            this.f93f = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f88b.remove(this.f93f);
            this.f93f.mo133b(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f87a = runnable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0044a mo126a(C0045b bVar) {
        this.f88b.add(bVar);
        C0043a aVar = new C0043a(bVar);
        bVar.mo131a((C0044a) aVar);
        return aVar;
    }

    /* renamed from: a */
    public void mo127a() {
        Iterator descendingIterator = this.f88b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0045b bVar = (C0045b) descendingIterator.next();
            if (bVar.mo134b()) {
                bVar.mo130a();
                return;
            }
        }
        Runnable runnable = this.f87a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo128a(C0523n nVar, C0045b bVar) {
        C0514h a = nVar.mo115a();
        if (a.mo3036a() != C0516b.DESTROYED) {
            bVar.mo131a((C0044a) new LifecycleOnBackPressedCancellable(a, bVar));
        }
    }
}
