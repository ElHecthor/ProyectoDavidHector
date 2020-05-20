package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.c0 */
final class C3054c0 {

    /* renamed from: d */
    private static WeakReference<C3054c0> f8679d;

    /* renamed from: a */
    private final SharedPreferences f8680a;

    /* renamed from: b */
    private C3052b0 f8681b;

    /* renamed from: c */
    private final Executor f8682c;

    private C3054c0(SharedPreferences sharedPreferences, Executor executor) {
        this.f8682c = executor;
        this.f8680a = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized C3054c0 m12422a(Context context, Executor executor) {
        C3054c0 c0Var;
        synchronized (C3054c0.class) {
            c0Var = null;
            if (f8679d != null) {
                c0Var = (C3054c0) f8679d.get();
            }
            if (c0Var == null) {
                c0Var = new C3054c0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c0Var.m12423b();
                f8679d = new WeakReference<>(c0Var);
            }
        }
        return c0Var;
    }

    /* renamed from: b */
    private final synchronized void m12423b() {
        this.f8681b = C3052b0.m12417a(this.f8680a, "topic_operation_queue", ",", this.f8682c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C3056d0 mo9824a() {
        return C3056d0.m12426a(this.f8681b.mo9821a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized boolean mo9825a(C3056d0 d0Var) {
        return this.f8681b.mo9822a((Object) d0Var.mo9828c());
    }
}
