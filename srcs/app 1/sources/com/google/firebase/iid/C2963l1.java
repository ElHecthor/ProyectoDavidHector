package com.google.firebase.iid;

import android.content.Intent;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p147g.p156d.p157a.p167b.p184g.C4350h;
import p147g.p156d.p157a.p167b.p184g.C4354k;

/* renamed from: com.google.firebase.iid.l1 */
final class C2963l1 implements C2938d0 {

    /* renamed from: a */
    private final ExecutorService f8516a;

    C2963l1(ExecutorService executorService) {
        this.f8516a = executorService;
    }

    /* renamed from: a */
    public final C4350h<Integer> mo9634a(Intent intent) {
        return C4354k.m17757a((Executor) this.f8516a, (Callable<TResult>) new C2960k1<TResult>(intent));
    }
}
