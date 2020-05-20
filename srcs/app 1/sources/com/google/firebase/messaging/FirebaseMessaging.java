package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.p052q.C2202a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.C2974r;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.C3004h;
import com.google.firebase.p060g.C2921c;
import com.google.firebase.p066j.C3043h;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p147g.p156d.p157a.p158a.C3744g;
import p147g.p156d.p157a.p167b.p184g.C4347e;
import p147g.p156d.p157a.p167b.p184g.C4350h;

public class FirebaseMessaging {
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: d */
    static C3744g f8664d;

    /* renamed from: a */
    private final Context f8665a;

    /* renamed from: b */
    private final FirebaseInstanceId f8666b;

    /* renamed from: c */
    private final C4350h<C3058f> f8667c;

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, C3043h hVar, C2921c cVar, C3004h hVar2, C3744g gVar) {
        f8664d = gVar;
        this.f8666b = firebaseInstanceId;
        Context a = firebaseApp.mo9508a();
        this.f8665a = a;
        C4350h<C3058f> a2 = C3058f.m12431a(firebaseApp, firebaseInstanceId, new C2974r(a), hVar, cVar, hVar2, this.f8665a, C3068p.m12465a(), new ScheduledThreadPoolExecutor(1, new C2202a("Firebase-Messaging-Topics-Io")));
        this.f8667c = a2;
        a2.mo13009a(C3068p.m12467b(), (C4347e<? super TResult>) new C3070r<Object>(this));
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        Class<FirebaseMessaging> cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp.mo9509a(cls);
        }
        return firebaseMessaging;
    }

    /* renamed from: a */
    public boolean mo9805a() {
        return this.f8666b.mo9624i();
    }
}
