package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.iid.C2945f1;
import com.google.firebase.iid.C2974r;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.firebase.messaging.e */
final /* synthetic */ class C3057e implements Callable {

    /* renamed from: f */
    private final Context f8689f;

    /* renamed from: g */
    private final ScheduledExecutorService f8690g;

    /* renamed from: h */
    private final FirebaseInstanceId f8691h;

    /* renamed from: i */
    private final C2974r f8692i;

    /* renamed from: j */
    private final C2945f1 f8693j;

    C3057e(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, C2974r rVar, C2945f1 f1Var) {
        this.f8689f = context;
        this.f8690g = scheduledExecutorService;
        this.f8691h = firebaseInstanceId;
        this.f8692i = rVar;
        this.f8693j = f1Var;
    }

    public final Object call() {
        return C3058f.m12430a(this.f8689f, this.f8690g, this.f8691h, this.f8692i, this.f8693j);
    }
}
