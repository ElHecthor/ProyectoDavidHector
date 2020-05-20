package com.facebook;

import android.os.Handler;
import com.facebook.C1797q.C1802e;
import com.facebook.C1797q.C1804g;

/* renamed from: com.facebook.d0 */
class C1520d0 {

    /* renamed from: a */
    private final C1797q f4757a;

    /* renamed from: b */
    private final Handler f4758b;

    /* renamed from: c */
    private final long f4759c = C1787m.m7754o();

    /* renamed from: d */
    private long f4760d;

    /* renamed from: e */
    private long f4761e;

    /* renamed from: f */
    private long f4762f;

    /* renamed from: com.facebook.d0$a */
    class C1521a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1804g f4763f;

        /* renamed from: g */
        final /* synthetic */ long f4764g;

        /* renamed from: h */
        final /* synthetic */ long f4765h;

        C1521a(C1520d0 d0Var, C1804g gVar, long j, long j2) {
            this.f4763f = gVar;
            this.f4764g = j;
            this.f4765h = j2;
        }

        public void run() {
            this.f4763f.mo6191a(this.f4764g, this.f4765h);
        }
    }

    C1520d0(Handler handler, C1797q qVar) {
        this.f4757a = qVar;
        this.f4758b = handler;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5728a() {
        if (this.f4760d > this.f4761e) {
            C1802e d = this.f4757a.mo6177d();
            long j = this.f4762f;
            if (j > 0 && (d instanceof C1804g)) {
                long j2 = this.f4760d;
                C1804g gVar = (C1804g) d;
                Handler handler = this.f4758b;
                if (handler == null) {
                    gVar.mo6191a(j2, j);
                } else {
                    C1521a aVar = new C1521a(this, gVar, j2, j);
                    handler.post(aVar);
                }
                this.f4761e = this.f4760d;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5729a(long j) {
        long j2 = this.f4760d + j;
        this.f4760d = j2;
        if (j2 >= this.f4761e + this.f4759c || j2 >= this.f4762f) {
            mo5728a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5730b(long j) {
        this.f4762f += j;
    }
}
