package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.p052q.C2202a;
import com.google.firebase.iid.C2947g0;
import com.google.firebase.iid.C2950h0;
import java.util.concurrent.ExecutorService;
import p147g.p156d.p157a.p167b.p173d.p179f.C3888a;
import p147g.p156d.p157a.p167b.p173d.p179f.C3893f;
import p147g.p156d.p157a.p167b.p184g.C4343c;
import p147g.p156d.p157a.p167b.p184g.C4350h;
import p147g.p156d.p157a.p167b.p184g.C4351i;
import p147g.p156d.p157a.p167b.p184g.C4354k;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.m */
public abstract class C3065m extends Service {

    /* renamed from: f */
    private final ExecutorService f8719f = C3888a.m15641a().mo12033a(new C2202a("Firebase-Messaging-Intent-Handle"), C3893f.f10793a);

    /* renamed from: g */
    private Binder f8720g;

    /* renamed from: h */
    private final Object f8721h = new Object();

    /* renamed from: i */
    private int f8722i;

    /* renamed from: j */
    private int f8723j = 0;

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final C4350h<Void> mo9841d(Intent intent) {
        if (mo9814b(intent)) {
            return C4354k.m17756a(null);
        }
        C4351i iVar = new C4351i();
        this.f8719f.execute(new C3067o(this, intent, iVar));
        return iVar.mo13025a();
    }

    /* renamed from: f */
    private final void m12459f(Intent intent) {
        if (intent != null) {
            C2950h0.m12154a(intent);
        }
        synchronized (this.f8721h) {
            int i = this.f8723j - 1;
            this.f8723j = i;
            if (i == 0) {
                stopSelfResult(this.f8722i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Intent mo9808a(Intent intent);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9840a(Intent intent, C4350h hVar) {
        m12459f(intent);
    }

    /* renamed from: b */
    public abstract boolean mo9814b(Intent intent);

    /* renamed from: c */
    public abstract void mo9815c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f8720g == null) {
            this.f8720g = new C2947g0(new C3064l(this));
        }
        return this.f8720g;
    }

    public void onDestroy() {
        this.f8719f.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f8721h) {
            this.f8722i = i2;
            this.f8723j++;
        }
        Intent a = mo9808a(intent);
        if (a == null) {
            m12459f(intent);
            return 2;
        }
        C4350h e = mo9841d(a);
        if (e.mo13020d()) {
            m12459f(intent);
            return 2;
        }
        e.mo13007a(C3066n.f8724f, (C4343c<TResult>) new C3069q<TResult>(this, intent));
        return 3;
    }
}
