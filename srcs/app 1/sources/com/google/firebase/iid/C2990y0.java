package com.google.firebase.iid;

import java.util.concurrent.CountDownLatch;
import p147g.p156d.p157a.p167b.p184g.C4343c;
import p147g.p156d.p157a.p167b.p184g.C4350h;

/* renamed from: com.google.firebase.iid.y0 */
final /* synthetic */ class C2990y0 implements C4343c {

    /* renamed from: a */
    private final CountDownLatch f8560a;

    C2990y0(CountDownLatch countDownLatch) {
        this.f8560a = countDownLatch;
    }

    /* renamed from: a */
    public final void mo9640a(C4350h hVar) {
        this.f8560a.countDown();
    }
}
